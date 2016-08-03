/*
 * generated by Xtext
 */
package uk.ac.york.cs.cs2as.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.MultiplicityBoundsCS;
import org.eclipse.ocl.xtext.basecs.MultiplicityStringCS;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathElementCS;
import org.eclipse.ocl.xtext.basecs.PathElementWithURICS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.PrimitiveTypeRefCS;
import org.eclipse.ocl.xtext.basecs.TemplateBindingCS;
import org.eclipse.ocl.xtext.basecs.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.xtext.basecs.TemplateSignatureCS;
import org.eclipse.ocl.xtext.basecs.TuplePartCS;
import org.eclipse.ocl.xtext.basecs.TupleTypeCS;
import org.eclipse.ocl.xtext.basecs.TypeParameterCS;
import org.eclipse.ocl.xtext.basecs.TypedTypeRefCS;
import org.eclipse.ocl.xtext.basecs.WildcardTypeRefCS;
import org.eclipse.ocl.xtext.essentialocl.serializer.EssentialOCLSemanticSequencer;
import org.eclipse.ocl.xtext.essentialoclcs.BooleanLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionPatternCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionTypeCS;
import org.eclipse.ocl.xtext.essentialoclcs.CurlyBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.IfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.IfThenExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InvalidLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LambdaLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapTypeCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NavigatingArgCS;
import org.eclipse.ocl.xtext.essentialoclcs.NestedExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NullLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NumberLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PatternExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PrefixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.RoundBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.SelfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ShadowPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.SquareBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TupleLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TupleLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.TypeLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TypeNameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.UnlimitedNaturalLiteralExpCS;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Input;
import uk.ac.york.cs.cs2as.cs2as_dsl.Inputs;
import uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.cs2as_dsl.MultipleClassRef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap;
import uk.ac.york.cs.cs2as.cs2as_dsl.Provider;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProviderVars;
import uk.ac.york.cs.cs2as.cs2as_dsl.Providers;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific;
import uk.ac.york.cs.cs2as.cs2as_dsl.Target;
import uk.ac.york.cs.cs2as.cs2as_dsl.Targets;
import uk.ac.york.cs.cs2as.cs2as_dsl.TraceExpCS;
import uk.ac.york.cs.cs2as.services.CS2ASDSLGrammarAccess;

@SuppressWarnings("all")
public class CS2ASDSLSemanticSequencer extends EssentialOCLSemanticSequencer {

	@Inject
	private CS2ASDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BaseCSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BaseCSPackage.IMPORT_CS:
				sequence_ImportCS(context, (ImportCS) semanticObject); 
				return; 
			case BaseCSPackage.MULTIPLICITY_BOUNDS_CS:
				if (rule == grammarAccess.getMultiplicityBoundsCSRule()) {
					sequence_MultiplicityBoundsCS(context, (MultiplicityBoundsCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMultiplicityCSRule()) {
					sequence_MultiplicityBoundsCS_MultiplicityCS(context, (MultiplicityBoundsCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.MULTIPLICITY_STRING_CS:
				if (rule == grammarAccess.getMultiplicityCSRule()) {
					sequence_MultiplicityCS_MultiplicityStringCS(context, (MultiplicityStringCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMultiplicityStringCSRule()) {
					sequence_MultiplicityStringCS(context, (MultiplicityStringCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PARAMETER_CS:
				sequence_ParameterDef(context, (ParameterCS) semanticObject); 
				return; 
			case BaseCSPackage.PATH_ELEMENT_CS:
				if (rule == grammarAccess.getFirstPathElementCSRule()) {
					sequence_FirstPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNextPathElementCSRule()) {
					sequence_NextPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getURIFirstPathElementCSRule()) {
					sequence_URIFirstPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PATH_ELEMENT_WITH_URICS:
				sequence_URIFirstPathElementCS(context, (PathElementWithURICS) semanticObject); 
				return; 
			case BaseCSPackage.PATH_NAME_CS:
				if (rule == grammarAccess.getPathNameCSRule()) {
					sequence_PathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getURIPathNameCSRule()) {
					sequence_URIPathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PRIMITIVE_TYPE_REF_CS:
				if (rule == grammarAccess.getPrimitiveTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()) {
					sequence_PrimitiveTypeCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_PrimitiveTypeCS_TypeExpCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_PrimitiveTypeCS_TypeLiteralWithMultiplicityCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.TEMPLATE_BINDING_CS:
				sequence_TemplateBindingCS(context, (TemplateBindingCS) semanticObject); 
				return; 
			case BaseCSPackage.TEMPLATE_PARAMETER_SUBSTITUTION_CS:
				sequence_TemplateParameterSubstitutionCS(context, (TemplateParameterSubstitutionCS) semanticObject); 
				return; 
			case BaseCSPackage.TEMPLATE_SIGNATURE_CS:
				sequence_TemplateSignatureCS(context, (TemplateSignatureCS) semanticObject); 
				return; 
			case BaseCSPackage.TUPLE_PART_CS:
				sequence_TuplePartCS(context, (TuplePartCS) semanticObject); 
				return; 
			case BaseCSPackage.TUPLE_TYPE_CS:
				if (rule == grammarAccess.getTupleTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()) {
					sequence_TupleTypeCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_TupleTypeCS_TypeExpCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_TupleTypeCS_TypeLiteralWithMultiplicityCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.TYPE_PARAMETER_CS:
				sequence_TypeParameterCS(context, (TypeParameterCS) semanticObject); 
				return; 
			case BaseCSPackage.TYPED_TYPE_REF_CS:
				sequence_TypedTypeRefCS(context, (TypedTypeRefCS) semanticObject); 
				return; 
			case BaseCSPackage.WILDCARD_TYPE_REF_CS:
				sequence_WildcardTypeRefCS(context, (WildcardTypeRefCS) semanticObject); 
				return; 
			}
		else if (epackage == Cs2as_dslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Cs2as_dslPackage.AS_DECL:
				sequence_ASDecl(context, (ASDecl) semanticObject); 
				return; 
			case Cs2as_dslPackage.CS_DECL:
				sequence_CSDecl(context, (CSDecl) semanticObject); 
				return; 
			case Cs2as_dslPackage.CLASS_DISAMBIGUATION:
				sequence_ClassDisambiguation(context, (ClassDisambiguation) semanticObject); 
				return; 
			case Cs2as_dslPackage.CLASS_HELPER:
				sequence_ClassHelper(context, (ClassHelper) semanticObject); 
				return; 
			case Cs2as_dslPackage.CLASS_MAP:
				sequence_ClassMap(context, (ClassMap) semanticObject); 
				return; 
			case Cs2as_dslPackage.CLASS_REF:
				sequence_ClassRef(context, (ClassRef) semanticObject); 
				return; 
			case Cs2as_dslPackage.CONTRIBUTION_DEF:
				sequence_ContributionDef(context, (ContributionDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.DISAMBIGUATION_DEF:
				sequence_DisambiguationDef(context, (DisambiguationDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.DISAMBIGUATION_SECT:
				sequence_DisambiguationSect(context, (DisambiguationSect) semanticObject); 
				return; 
			case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP:
				sequence_ElementsContribExp(context, (ElementsContribExp) semanticObject); 
				return; 
			case Cs2as_dslPackage.EXPORT_DEF:
				sequence_ExportDef(context, (ExportDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.FILTER_DEF:
				sequence_FilterDef(context, (FilterDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.HELPER_DEF:
				sequence_HelperDef(context, (HelperDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.HELPERS_SECT:
				sequence_HelpersSect(context, (HelpersSect) semanticObject); 
				return; 
			case Cs2as_dslPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case Cs2as_dslPackage.INPUTS:
				sequence_Inputs(context, (Inputs) semanticObject); 
				return; 
			case Cs2as_dslPackage.LOOKUP_EXP_CS:
				sequence_LookupExpCS(context, (LookupExpCS) semanticObject); 
				return; 
			case Cs2as_dslPackage.MAPPING_SECT:
				sequence_MappingSect(context, (MappingSect) semanticObject); 
				return; 
			case Cs2as_dslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Cs2as_dslPackage.MULTIPLE_CLASS_REF:
				sequence_MultipleClassRef(context, (MultipleClassRef) semanticObject); 
				return; 
			case Cs2as_dslPackage.NAME_RESOLUTION_SECT:
				sequence_NameResolutionSect(context, (NameResolutionSect) semanticObject); 
				return; 
			case Cs2as_dslPackage.OCCLUDING_DEF:
				sequence_OccludingDef(context, (OccludingDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.PROPERTY_MAP:
				sequence_PropertyMap(context, (PropertyMap) semanticObject); 
				return; 
			case Cs2as_dslPackage.PROVIDER:
				sequence_Provider(context, (Provider) semanticObject); 
				return; 
			case Cs2as_dslPackage.PROVIDER_VARS:
				sequence_ProviderVars(context, (ProviderVars) semanticObject); 
				return; 
			case Cs2as_dslPackage.PROVIDERS:
				sequence_Providers(context, (Providers) semanticObject); 
				return; 
			case Cs2as_dslPackage.PROVISION_DEF:
				sequence_ProvisionDef(context, (ProvisionDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.QUALIFICATION_DEF:
				sequence_QualificationDef(context, (QualificationDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.SCOPE_DEF:
				sequence_ScopeDef(context, (ScopeDef) semanticObject); 
				return; 
			case Cs2as_dslPackage.SELECTION_ALL:
				sequence_SelectionDef(context, (SelectionAll) semanticObject); 
				return; 
			case Cs2as_dslPackage.SELECTION_SPECIFIC:
				sequence_SelectionDef(context, (SelectionSpecific) semanticObject); 
				return; 
			case Cs2as_dslPackage.TARGET:
				sequence_Target(context, (Target) semanticObject); 
				return; 
			case Cs2as_dslPackage.TARGETS:
				sequence_Targets(context, (Targets) semanticObject); 
				return; 
			case Cs2as_dslPackage.TRACE_EXP_CS:
				sequence_TraceExpCS(context, (TraceExpCS) semanticObject); 
				return; 
			}
		else if (epackage == EssentialOCLCSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EssentialOCLCSPackage.BOOLEAN_LITERAL_EXP_CS:
				sequence_BooleanLiteralExpCS(context, (BooleanLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_LITERAL_EXP_CS:
				sequence_CollectionLiteralExpCS(context, (CollectionLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_LITERAL_PART_CS:
				sequence_CollectionLiteralPartCS(context, (CollectionLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_PATTERN_CS:
				if (rule == grammarAccess.getCollectionPatternCSRule()) {
					sequence_CollectionPatternCS(context, (CollectionPatternCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_CollectionPatternCS_TypeExpCS(context, (CollectionPatternCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.COLLECTION_TYPE_CS:
				if (rule == grammarAccess.getCollectionTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()) {
					sequence_CollectionTypeCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_CollectionTypeCS_TypeExpCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_CollectionTypeCS_TypeLiteralWithMultiplicityCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.CURLY_BRACKETED_CLAUSE_CS:
				sequence_CurlyBracketedClauseCS(context, (CurlyBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.IF_EXP_CS:
				sequence_IfExpCS(context, (IfExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.IF_THEN_EXP_CS:
				sequence_ElseIfThenExpCS(context, (IfThenExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.INFIX_EXP_CS:
				sequence_ExpCS(context, (InfixExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.INVALID_LITERAL_EXP_CS:
				sequence_InvalidLiteralExpCS(context, (InvalidLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LAMBDA_LITERAL_EXP_CS:
				sequence_LambdaLiteralExpCS(context, (LambdaLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LET_EXP_CS:
				sequence_LetExpCS(context, (LetExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LET_VARIABLE_CS:
				sequence_LetVariableCS(context, (LetVariableCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_LITERAL_EXP_CS:
				sequence_MapLiteralExpCS(context, (MapLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_LITERAL_PART_CS:
				sequence_MapLiteralPartCS(context, (MapLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_TYPE_CS:
				if (rule == grammarAccess.getMapTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()) {
					sequence_MapTypeCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_MapTypeCS_TypeExpCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_MapTypeCS_TypeLiteralWithMultiplicityCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.NAME_EXP_CS:
				sequence_NameExpCS(context, (NameExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NAVIGATING_ARG_CS:
				if (rule == grammarAccess.getNavigatingArgCSRule()) {
					sequence_NavigatingArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNavigatingBarArgCSRule()) {
					sequence_NavigatingBarArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNavigatingCommaArgCSRule()) {
					sequence_NavigatingCommaArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNavigatingSemiArgCSRule()) {
					sequence_NavigatingSemiArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.NESTED_EXP_CS:
				sequence_NestedExpCS(context, (NestedExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NULL_LITERAL_EXP_CS:
				sequence_NullLiteralExpCS(context, (NullLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NUMBER_LITERAL_EXP_CS:
				sequence_NumberLiteralExpCS(context, (NumberLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.PATTERN_EXP_CS:
				sequence_PatternExpCS(context, (PatternExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.PREFIX_EXP_CS:
				if (rule == grammarAccess.getPrefixedLetExpCSRule()) {
					sequence_PrefixedLetExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpCSRule()
						|| rule == grammarAccess.getNavigatingArgExpCSRule()) {
					sequence_PrefixedLetExpCS_PrefixedPrimaryExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0()
						|| rule == grammarAccess.getPrefixedPrimaryExpCSRule()) {
					sequence_PrefixedPrimaryExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.ROUND_BRACKETED_CLAUSE_CS:
				sequence_RoundBracketedClauseCS(context, (RoundBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SELF_EXP_CS:
				sequence_SelfExpCS(context, (SelfExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SHADOW_PART_CS:
				sequence_ShadowPartCS(context, (ShadowPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SQUARE_BRACKETED_CLAUSE_CS:
				sequence_SquareBracketedClauseCS(context, (SquareBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.STRING_LITERAL_EXP_CS:
				sequence_StringLiteralExpCS(context, (StringLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TUPLE_LITERAL_EXP_CS:
				sequence_TupleLiteralExpCS(context, (TupleLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TUPLE_LITERAL_PART_CS:
				sequence_TupleLiteralPartCS(context, (TupleLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TYPE_LITERAL_EXP_CS:
				sequence_TypeLiteralExpCS(context, (TypeLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TYPE_NAME_EXP_CS:
				if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_TypeExpCS_TypeNameExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeNameExpCSRule()) {
					sequence_TypeNameExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.UNLIMITED_NATURAL_LITERAL_EXP_CS:
				sequence_UnlimitedNaturalLiteralExpCS(context, (UnlimitedNaturalLiteralExpCS) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ASDecl returns ASDecl
	 *
	 * Constraint:
	 *     (metamodels+=ImportCS metamodels+=ImportCS*)
	 */
	protected void sequence_ASDecl(ISerializationContext context, ASDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CSDecl returns CSDecl
	 *
	 * Constraint:
	 *     (metamodels+=ImportCS metamodels+=ImportCS*)
	 */
	protected void sequence_CSDecl(ISerializationContext context, CSDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDisambiguation returns ClassDisambiguation
	 *
	 * Constraint:
	 *     (class=PathNameCS statements+=ClassDisambiguationStmnt*)
	 */
	protected void sequence_ClassDisambiguation(ISerializationContext context, ClassDisambiguation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassHelper returns ClassHelper
	 *
	 * Constraint:
	 *     (context=PathNameCS helpers+=HelperDef*)
	 */
	protected void sequence_ClassHelper(ISerializationContext context, ClassHelper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassMap returns ClassMap
	 *
	 * Constraint:
	 *     (to=PathNameCS from=PathNameCS rule=SIMPLE_ID? statements+=ClassMapStmnt*)
	 */
	protected void sequence_ClassMap(ISerializationContext context, ClassMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassRef returns ClassRef
	 *
	 * Constraint:
	 *     className=PathNameCS
	 */
	protected void sequence_ClassRef(ISerializationContext context, ClassRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Cs2as_dslPackage.Literals.CLASS_REF__CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Cs2as_dslPackage.Literals.CLASS_REF__CLASS_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassRefAccess().getClassNamePathNameCSParserRuleCall_0(), semanticObject.getClassName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ContributionDef returns ContributionDef
	 *
	 * Constraint:
	 *     (contributions+=ElementsContribExp contributions+=ElementsContribExp*)
	 */
	protected void sequence_ContributionDef(ISerializationContext context, ContributionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDisambiguationStmnt returns DisambiguationDef
	 *     DisambiguationDef returns DisambiguationDef
	 *
	 * Constraint:
	 *     (name=SIMPLE_ID exp=ExpCS)
	 */
	protected void sequence_DisambiguationDef(ISerializationContext context, DisambiguationDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Cs2as_dslPackage.Literals.DISAMBIGUATION_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Cs2as_dslPackage.Literals.DISAMBIGUATION_DEF__NAME));
			if (transientValues.isValueTransient(semanticObject, Cs2as_dslPackage.Literals.DISAMBIGUATION_DEF__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Cs2as_dslPackage.Literals.DISAMBIGUATION_DEF__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDisambiguationDefAccess().getNameSIMPLE_IDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDisambiguationDefAccess().getExpExpCSParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DisambiguationSect returns DisambiguationSect
	 *
	 * Constraint:
	 *     disambiguations+=ClassDisambiguation*
	 */
	protected void sequence_DisambiguationSect(ISerializationContext context, DisambiguationSect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementsContribExp returns ElementsContribExp
	 *
	 * Constraint:
	 *     ((isPreceding?='preceding' | isImported?='imported')? expression=ExpCS)
	 */
	protected void sequence_ElementsContribExp(ISerializationContext context, ElementsContribExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProviderStmnt returns ExportDef
	 *     ExportDef returns ExportDef
	 *
	 * Constraint:
	 *     (selectionDef=SelectionDef? provisionDefs+=ProvisionDef+)
	 */
	protected void sequence_ExportDef(ISerializationContext context, ExportDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterDef returns FilterDef
	 *
	 * Constraint:
	 *     ((params+=ParameterDef params+=ParameterDef*)? expression=ExpCS)
	 */
	protected void sequence_FilterDef(ISerializationContext context, FilterDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HelperDef returns HelperDef
	 *
	 * Constraint:
	 *     (ownedSignature=TemplateSignatureCS? name=UnrestrictedName (params+=ParameterDef params+=ParameterDef*)? ownedType=TypeExpCS? helperBody=ExpCS)
	 */
	protected void sequence_HelperDef(ISerializationContext context, HelperDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HelpersSect returns HelpersSect
	 *
	 * Constraint:
	 *     classHelpers+=ClassHelper*
	 */
	protected void sequence_HelpersSect(ISerializationContext context, HelpersSect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportCS returns ImportCS
	 *
	 * Constraint:
	 *     (name=Identifier? ownedPathName=URIPathNameCS isAll?='::*'?)
	 */
	protected void sequence_ImportCS(ISerializationContext context, ImportCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (qualifier?='qualifier'? classRef=ClassRef propRef=PathNameCS?)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inputs returns Inputs
	 *
	 * Constraint:
	 *     inputs+=Input*
	 */
	protected void sequence_Inputs(ISerializationContext context, Inputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpCS returns LookupExpCS
	 *     LookupExpCS returns LookupExpCS
	 *     ExpCS returns LookupExpCS
	 *     ExpCS.InfixExpCS_0_1_0 returns LookupExpCS
	 *     PrefixedPrimaryExpCS returns LookupExpCS
	 *     NavigatingArgExpCS returns LookupExpCS
	 *
	 * Constraint:
	 *     (fromExp?='lookupFrom'? args+=NavigatingArgExpCS args+=NavigatingArgExpCS*)
	 */
	protected void sequence_LookupExpCS(ISerializationContext context, LookupExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappingSect returns MappingSect
	 *
	 * Constraint:
	 *     mappings+=ClassMap*
	 */
	protected void sequence_MappingSect(ISerializationContext context, MappingSect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         csDecl=CSDecl 
	 *         asDecl=ASDecl 
	 *         (mappingSect=MappingSect | disambiguationSect=DisambiguationSect | nameresoSect=NameResolutionSect | helpersSect=HelpersSect)*
	 *     )
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultipleClassRef returns MultipleClassRef
	 *
	 * Constraint:
	 *     (classNames+=PathNameCS classNames+=PathNameCS*)
	 */
	protected void sequence_MultipleClassRef(ISerializationContext context, MultipleClassRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NameResolutionSect returns NameResolutionSect
	 *
	 * Constraint:
	 *     (targetsDef=Targets inputsDef=Inputs providersDef=Providers)
	 */
	protected void sequence_NameResolutionSect(ISerializationContext context, NameResolutionSect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT__TARGETS_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT__TARGETS_DEF));
			if (transientValues.isValueTransient(semanticObject, Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT__INPUTS_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT__INPUTS_DEF));
			if (transientValues.isValueTransient(semanticObject, Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT__PROVIDERS_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT__PROVIDERS_DEF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameResolutionSectAccess().getTargetsDefTargetsParserRuleCall_3_0(), semanticObject.getTargetsDef());
		feeder.accept(grammarAccess.getNameResolutionSectAccess().getInputsDefInputsParserRuleCall_4_0(), semanticObject.getInputsDef());
		feeder.accept(grammarAccess.getNameResolutionSectAccess().getProvidersDefProvidersParserRuleCall_5_0(), semanticObject.getProvidersDef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OccludingDef returns OccludingDef
	 *
	 * Constraint:
	 *     contribution=ContributionDef
	 */
	protected void sequence_OccludingDef(ISerializationContext context, OccludingDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Cs2as_dslPackage.Literals.OCCLUDING_DEF__CONTRIBUTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Cs2as_dslPackage.Literals.OCCLUDING_DEF__CONTRIBUTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOccludingDefAccess().getContributionContributionDefParserRuleCall_1_0(), semanticObject.getContribution());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterDef returns ParameterCS
	 *
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypeExpCS)
	 */
	protected void sequence_ParameterDef(ISerializationContext context, ParameterCS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BaseCSPackage.Literals.NAMED_ELEMENT_CS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BaseCSPackage.Literals.NAMED_ELEMENT_CS__NAME));
			if (transientValues.isValueTransient(semanticObject, BaseCSPackage.Literals.TYPED_ELEMENT_CS__OWNED_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BaseCSPackage.Literals.TYPED_ELEMENT_CS__OWNED_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterDefAccess().getNameUnrestrictedNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterDefAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0(), semanticObject.getOwnedType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClassMapStmnt returns PropertyMap
	 *     PropertyMap returns PropertyMap
	 *
	 * Constraint:
	 *     (redefine?='redefine'? propName=SIMPLE_ID propInit=ExpCS)
	 */
	protected void sequence_PropertyMap(ISerializationContext context, PropertyMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProviderVars returns ProviderVars
	 *
	 * Constraint:
	 *     (varDecl+=LetVariableCS varDecl+=LetVariableCS*)
	 */
	protected void sequence_ProviderVars(ISerializationContext context, ProviderVars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Provider returns Provider
	 *
	 * Constraint:
	 *     (classRef=PathNameCS varsDecl=ProviderVars? statements+=ProviderStmnt*)
	 */
	protected void sequence_Provider(ISerializationContext context, Provider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Providers returns Providers
	 *
	 * Constraint:
	 *     providers+=Provider*
	 */
	protected void sequence_Providers(ISerializationContext context, Providers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProvisionDef returns ProvisionDef
	 *
	 * Constraint:
	 *     (targetsDef=MultipleClassRef contribution=ContributionDef occludingDefs+=OccludingDef*)
	 */
	protected void sequence_ProvisionDef(ISerializationContext context, ProvisionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QualificationDef returns QualificationDef
	 *
	 * Constraint:
	 *     (targetsDef=MultipleClassRef contribution+=ElementsContribExp)
	 */
	protected void sequence_QualificationDef(ISerializationContext context, QualificationDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProviderStmnt returns ScopeDef
	 *     ScopeDef returns ScopeDef
	 *
	 * Constraint:
	 *     (selectionDef=SelectionDef? alsoExports?='exported-scope'? (sameScope?='adding' | emptyScope?='resetting')? provisionDefs+=ProvisionDef+)
	 */
	protected void sequence_ScopeDef(ISerializationContext context, ScopeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SelectionDef returns SelectionAll
	 *
	 * Constraint:
	 *     (exceptionProperties+=ExpCS exceptionProperties+=ExpCS*)?
	 */
	protected void sequence_SelectionDef(ISerializationContext context, SelectionAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SelectionDef returns SelectionSpecific
	 *
	 * Constraint:
	 *     (selectedProperties+=ExpCS selectedProperties+=ExpCS*)
	 */
	protected void sequence_SelectionDef(ISerializationContext context, SelectionSpecific semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Target returns Target
	 *
	 * Constraint:
	 *     (classRef=ClassRef propRef=PathNameCS? filter=FilterDef? (qualifications+=QualificationDef qualifications+=QualificationDef*)?)
	 */
	protected void sequence_Target(ISerializationContext context, Target semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Targets returns Targets
	 *
	 * Constraint:
	 *     targets+=Target*
	 */
	protected void sequence_Targets(ISerializationContext context, Targets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpCS returns TraceExpCS
	 *     TraceExpCS returns TraceExpCS
	 *     ExpCS returns TraceExpCS
	 *     ExpCS.InfixExpCS_0_1_0 returns TraceExpCS
	 *     PrefixedPrimaryExpCS returns TraceExpCS
	 *     NavigatingArgExpCS returns TraceExpCS
	 *
	 * Constraint:
	 *     {TraceExpCS}
	 */
	protected void sequence_TraceExpCS(ISerializationContext context, TraceExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
