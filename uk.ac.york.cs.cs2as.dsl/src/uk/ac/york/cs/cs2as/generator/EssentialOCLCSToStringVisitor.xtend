package uk.ac.york.cs.cs2as.generator

import org.eclipse.ocl.xtext.essentialoclcs.util.EssentialOCLCSSwitch
import org.eclipse.emf.ecore.EObject
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS
import org.eclipse.ocl.xtext.essentialoclcs.CurlyBracketedClauseCS
import org.eclipse.ocl.xtext.essentialoclcs.IfExpCS
import org.eclipse.ocl.xtext.essentialoclcs.NullLiteralExpCS
import uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS
import org.eclipse.ocl.xtext.essentialoclcs.PrefixExpCS
import org.eclipse.ocl.xtext.essentialoclcs.RoundBracketedClauseCS
import org.eclipse.ocl.xtext.essentialoclcs.NavigatingArgCS
import org.eclipse.ocl.xtext.essentialoclcs.NestedExpCS
import org.eclipse.ocl.xtext.essentialoclcs.TypeNameExpCS
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS
import org.eclipse.ocl.xtext.essentialoclcs.InvalidLiteralExpCS
import org.eclipse.ocl.xtext.essentialoclcs.CollectionTypeCS
import org.eclipse.ocl.xtext.basecs.ParameterCS
import org.eclipse.ocl.xtext.essentialoclcs.SelfExpCS
import org.eclipse.ocl.xtext.essentialoclcs.LetExpCS
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS
import uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS
import org.eclipse.ocl.xtext.essentialoclcs.ShadowPartCS
import org.eclipse.ocl.xtext.essentialoclcs.NumberLiteralExpCS
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralExpCS
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralPartCS
import org.eclipse.ocl.xtext.essentialoclcs.BooleanLiteralExpCS
import static extension  uk.ac.york.cs.cs2as.generator.Helper.*

class EssentialOCLCSToStringVisitor extends EssentialOCLCSSwitch<String>{

	BaseCSToStringVisitor baseVisitor = new BaseCSToStringVisitor();
	
	override String defaultCase(EObject object) {
		if (object instanceof TraceExpCS) {
			caseTraceExp(object)
		} else if (object instanceof LookupExpCS) {
			caseLookupExp(object)
		} else if (object instanceof ParameterCS) { 
			caseParameterCS(object);
		} else {
			baseVisitor.doSwitch(object);	
		}
	}	
	
	override caseCollectionLiteralExpCS(CollectionLiteralExpCS object) {
		val parts =  object.ownedParts;
		'''«object.ownedType» { «FOR part : parts»«IF parts.indexOf(part)>0», «ENDIF»«part.doSwitch»«ENDFOR»}''' 
	}
	
	override caseCollectionLiteralPartCS(CollectionLiteralPartCS object) {
		val last = object.ownedLastExpression
		'''«object.ownedExpression.doSwitch»«IF last!= null »..«last.doSwitch»«ENDIF»'''
	}
		
	override caseInfixExpCS(InfixExpCS object) {
		val opName = object.name
		val op = if (".".equals(opName) || "->".equals(opName) ) opName else ''' «object.name» '''
		'''«object.ownedLeft.doSwitch»«op»«object.ownedRight.doSwitch»'''
	}
	
	override casePrefixExpCS(PrefixExpCS object) {
		'''«object.name» «object.ownedRight.doSwitch»'''
	}
	
	override caseNameExpCS(NameExpCS object) {
		val rBracket = object.ownedRoundBracketedClause;
		val hasRBracket = rBracket!=null;
		val cBracket = object.ownedCurlyBracketedClause;
		val hasCBracket = cBracket!=null;
		val sBrackets = object.ownedSquareBracketedClauses;
		val hasSBrackets = sBrackets!=null;
				
		'''«object.ownedPathName.doSwitch»«IF hasRBracket»«rBracket.doSwitch»«ELSE»«IF hasCBracket»«cBracket.doSwitch»«ELSE»«IF hasSBrackets»«FOR s : sBrackets»«s.doSwitch»«ENDFOR»«ENDIF»«ENDIF»«ENDIF»''';
		
	}
	
	override caseNestedExpCS(NestedExpCS object) {
		'''(«object.ownedExpression.doSwitch»)'''
	}
	
	override caseIfExpCS(IfExpCS object) {
		'''if «object.ownedCondition.doSwitch» then «object.ownedThenExpression.doSwitch» else «object.ownedElseExpression.doSwitch» endif'''
	}
	
	override caseCurlyBracketedClauseCS(CurlyBracketedClauseCS object) {
		val parts =object.ownedParts;
		''' {
			«FOR part : parts»
			«part.doSwitch»«IF parts.indexOf(part)<parts.length-1»,«ENDIF»
			«ENDFOR»
		}''';
	}
	
	override caseRoundBracketedClauseCS(RoundBracketedClauseCS object) {
		val nameExp =  object.owningNameExp as NameExpCS;
		switch nameExp.ownedPathName.toString {
			case 'exists',
			case 'forAll',
			case 'collect': object.trivialArgs(' | ')
			case 'iterate': {
				val args = object.ownedArguments; 
				'''(«args.get(0).doSwitch» ; «args.get(1).doSwitch» |
				«args.get(2).doSwitch»)'''
			}
			
			default: object.trivialArgs(', ')
		} 
	}
	
	def private String trivialArgs(RoundBracketedClauseCS object, String sep) {
		var args = object.ownedArguments;
		'''(«FOR arg : args»«IF args.indexOf(arg) !=0»«sep»«ENDIF»«arg.doSwitch»«ENDFOR»)'''
	}
	
	override caseNavigatingArgCS(NavigatingArgCS object) {
		val name = object.ownedNameExpression?.doSwitch;
		val optType = object.ownedType?.doSwitch;
		val optInitExp = object.ownedInitExpression?.doSwitch;
		'''«name»«IF optType!=null» : «optType»«ENDIF»«IF optInitExp!=null» = «optInitExp»«ENDIF»'''
	}
	
	override caseNullLiteralExpCS(NullLiteralExpCS object) {
		'null';
	}
	
	override caseInvalidLiteralExpCS(InvalidLiteralExpCS object) {
		'invalid';
	}
	
	override caseStringLiteralExpCS(StringLiteralExpCS object) {
		val allSegments = '''«FOR segment : object.segments»«segment»«ENDFOR»'''.toString;
		if (allSegments.trim.startsWith("'")) allSegments else ''''«allSegments»' '''
	}
	
	override caseNumberLiteralExpCS(NumberLiteralExpCS object) {
		object.symbol.toString
	}
	
	override caseBooleanLiteralExpCS(BooleanLiteralExpCS object) {
		object.symbol.toString
	}
	
	override caseTypeNameExpCS(TypeNameExpCS object) {
		object.ownedPathName.doSwitch; // FIXME
	}
	
	override caseCollectionTypeCS(CollectionTypeCS object) {
		'''«object.name»(«object.ownedType.doSwitch»)'''
	}
	
	override caseSelfExpCS(SelfExpCS object) {
		'self'
	}
	
	override caseShadowPartCS(ShadowPartCS object) {
		'''«object.propName.scapeKeywords» = «object.ownedInitExpression.doSwitch»'''
	}
	
	def String caseParameterCS(ParameterCS object) {
		'''«object.name.scapeKeywords» : «object.ownedType.doSwitch»'''
	}
	
	override caseLetExpCS(LetExpCS object) {
		val letVars = object.ownedVariables;
		'''
		let «FOR letVar : letVars»«IF letVars.indexOf(letVar)>0», «ENDIF»«letVar.doSwitch»
			«ENDFOR»
		in «object.ownedInExpression.doSwitch»
		'''
	}
	
	override caseVariableCS(VariableCS object) {
		val type = object.ownedType;
		val init = object.ownedInitExpression;
		'''«object.name.scapeKeywords» «IF type != null» : «type.doSwitch»«ENDIF»«IF init != null» = «init.doSwitch»«ENDIF»'''
	}
	
	def String caseTraceExp(TraceExpCS object) {
		'''ast()''';
	}
	
	def String caseLookupExp(LookupExpCS object) {
		val lookupOpSuffix = if (object.isIsExported) 'From' else '' 
		val args = object.args;
		val firstArg = args.get(0);
		val remainingArgs = newArrayList();
		for (var i=1;i < args.size; i++) {
			remainingArgs.add(args.get(i));
		}	
		'''ast().lookup«firstArg.doSwitch»«lookupOpSuffix»(«FOR arg : remainingArgs»«IF args.indexOf(arg)>1», «ENDIF»«arg.doSwitch»«ENDFOR»)''';
	}
}