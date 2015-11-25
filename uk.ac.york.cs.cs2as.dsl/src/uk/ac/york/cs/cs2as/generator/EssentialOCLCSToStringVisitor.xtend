package uk.ac.york.cs.cs2as.generator

import org.eclipse.ocl.xtext.essentialoclcs.util.EssentialOCLCSSwitch
import org.eclipse.emf.ecore.EObject
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS
import org.eclipse.ocl.xtext.essentialoclcs.CurlyBracketedClauseCS
import org.eclipse.ocl.xtext.essentialoclcs.IfExpCS
import org.eclipse.ocl.xtext.essentialoclcs.NullLiteralExpCS
import uk.ac.york.cs.cs2as.cs2as_dsl.ResolveExpCS
import uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS
import org.eclipse.ocl.xtext.essentialoclcs.PrefixExpCS
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS
import org.eclipse.ocl.xtext.essentialoclcs.RoundBracketedClauseCS
import org.eclipse.ocl.xtext.essentialoclcs.NavigatingArgCS
import org.eclipse.ocl.xtext.essentialoclcs.NestedExpCS
import org.eclipse.ocl.xtext.essentialoclcs.TypeNameExpCS
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS

class EssentialOCLCSToStringVisitor extends EssentialOCLCSSwitch<String>{

	BaseCSToStringVisitor baseVisitor = new BaseCSToStringVisitor();
	
	override String defaultCase(EObject object) {
		if (object instanceof ResolveExpCS) {
			caseResolveExp(object)
		} else if (object instanceof LookupExpCS) {
			caseLookupExp(object)
		} else {
			baseVisitor.doSwitch(object);	
		}
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
				
		'''«object.ownedPathName»«IF hasRBracket»«rBracket.doSwitch»«ELSE»«IF hasCBracket»«cBracket.doSwitch»«ELSE»«IF hasSBrackets»«FOR s : sBrackets»«s.doSwitch»«ENDFOR»«ENDIF»«ENDIF»«ENDIF»''';
		
	}
	
	override caseNestedExpCS(NestedExpCS object) {
		'''(«object.ownedExpression.doSwitch»)'''
	}
	
	override caseIfExpCS(IfExpCS object) {
		'''if «object.ownedCondition.doSwitch» then «object.ownedThenExpression.doSwitch» else «object.ownedElseExpression.doSwitch» endif'''
	}
	
	override caseCurlyBracketedClauseCS(CurlyBracketedClauseCS object) {
		// TODO
		'''{
			
		}''';
	}
	
	override caseRoundBracketedClauseCS(RoundBracketedClauseCS object) {
		var args = object.ownedArguments;
		'''(«FOR arg : args»«IF args.indexOf(arg) !=0»,«ENDIF»«arg.doSwitch»«ENDFOR»)'''
	}
	
	override caseNavigatingArgCS(NavigatingArgCS object) {
		val name = object.ownedNameExpression?.doSwitch;
		val optType = object.ownedType?.doSwitch;
		val optInitExp = object.ownedInitExpression?.doSwitch;
		'''«name»«IF optType!=null» «optType»«ENDIF»«IF optInitExp!=null» = «optInitExp»«ENDIF»'''
	}
	
	override caseNullLiteralExpCS(NullLiteralExpCS object) {
		'null';
	}
	
	override caseStringLiteralExpCS(StringLiteralExpCS object) {
		''' '«FOR segment : object.segments» «segment»«ENDFOR»' '''
	}
	
	override caseTypeNameExpCS(TypeNameExpCS object) {
		object.ownedPathName.doSwitch; // FIXME
	}
	
	def String caseResolveExp(ResolveExpCS object) {
		'''ast()''';
	}
	
	def String caseLookupExp(LookupExpCS object) {
		val args = object.args;
		val firstArg = args.get(0);
		val remainingArgs = newArrayList();
		for (var i=1;i < args.size; i++) {
			remainingArgs.add(args.get(i));
		}	
		'''lookup«firstArg.doSwitch»(«FOR arg : remainingArgs»«IF args.indexOf(arg)>1», «ENDIF»«arg.doSwitch»«ENDFOR»)''';
	}
}