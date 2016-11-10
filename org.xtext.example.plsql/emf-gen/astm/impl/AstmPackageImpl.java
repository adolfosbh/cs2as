/**
 */
package astm.impl;

import astm.AstmFactory;
import astm.AstmPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstmPackageImpl extends EPackageImpl implements AstmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "astm.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmSourceObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmSemanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherSyntaxObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmSyntaxObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationOrDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMemberAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSpaceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unnamedTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationOrDefinitionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesCatchBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableCatchBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedIdentifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeQualifiedIdentifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMemberAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPersistentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileLocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perClassMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pureVirtualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonVirtualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wideCharacterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byValueFormalParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byReferenceFormalParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doWhileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forCheckBeforeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forCheckAfterStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedOverPointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedOverDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerlLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postIncrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postDecrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notGreaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notLessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitXorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitLeftShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitRightShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missingActualParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byValueActualParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byReferenceActualParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTriggerDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificLessEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificGreaterEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificLikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificConcatStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificSelectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbDatabaseDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTableSpaceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbUserDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTableSpaceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTableDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbColumnDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbViewDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbCursorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbIndexColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbCheckConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbRefIntegrityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbUniqueKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbConnectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbSelectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbInsertStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbModifyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbUpdateStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbCursorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbOpenCursorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbFetchCursorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbHostVariableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbSelectExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTableAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbColumnReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbDataBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbUserTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTableSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbCursorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbColumnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbDecimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbVarcharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTimestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbRowidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbBlobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbClobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbnClobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbbFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbDeleteStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbCloseCursorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbHostVariableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see astm.AstmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AstmPackageImpl() {
		super(eNS_URI, AstmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AstmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static AstmPackage init() {
		if (isInited) return (AstmPackage)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI);

		// Obtain or create and register package
		Object ePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AstmPackageImpl theAstmPackage = (AstmPackageImpl)(ePackage instanceof AstmPackageImpl ? ePackage : new AstmPackageImpl());

		isInited = true;

		// Load packages
		theAstmPackage.loadPackage();

		// Fix loaded packages
		theAstmPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theAstmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AstmPackage.eNS_URI, theAstmPackage);
		return theAstmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMObject() {
		if (gastmObjectEClass == null) {
			gastmObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(0);
		}
		return gastmObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMSourceObject() {
		if (gastmSourceObjectEClass == null) {
			gastmSourceObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(1);
		}
		return gastmSourceObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMSemanticObject() {
		if (gastmSemanticObjectEClass == null) {
			gastmSemanticObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(2);
		}
		return gastmSemanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherSyntaxObject() {
		if (otherSyntaxObjectEClass == null) {
			otherSyntaxObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(3);
		}
		return otherSyntaxObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageSpecification() {
		if (storageSpecificationEClass == null) {
			storageSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(4);
		}
		return storageSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(5);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessKind() {
		if (accessKindEClass == null) {
			accessKindEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(6);
		}
		return accessKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		if (unaryOperatorEClass == null) {
			unaryOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(7);
		}
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperator() {
		if (binaryOperatorEClass == null) {
			binaryOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(8);
		}
		return binaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualParameter() {
		if (actualParameterEClass == null) {
			actualParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(9);
		}
		return actualParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFile() {
		if (sourceFileEClass == null) {
			sourceFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(10);
		}
		return sourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFile_PathName() {
        return (EAttribute)getSourceFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceLocation() {
		if (sourceLocationEClass == null) {
			sourceLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(11);
		}
		return sourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_StartLine() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_StartColumn() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_EndLine() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_EndColumn() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceLocation_InSourceFile() {
        return (EReference)getSourceLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		if (projectEClass == null) {
			projectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(12);
		}
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Files() {
        return (EReference)getProject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_OuterScope() {
        return (EReference)getProject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		if (scopeEClass == null) {
			scopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(13);
		}
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_DefinitionObject() {
        return (EReference)getScope().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_ChildScope() {
        return (EReference)getScope().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMSyntaxObject() {
		if (gastmSyntaxObjectEClass == null) {
			gastmSyntaxObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(14);
		}
		return gastmSyntaxObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGASTMSyntaxObject_LocationInfo() {
        return (EReference)getGASTMSyntaxObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGASTMSyntaxObject_PreProcessorElements() {
        return (EReference)getGASTMSyntaxObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGASTMSyntaxObject_Annotations() {
        return (EReference)getGASTMSyntaxObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		if (compilationUnitEClass == null) {
			compilationUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(15);
		}
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationUnit_Language() {
        return (EAttribute)getCompilationUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Fragments() {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_OpensScope() {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		if (nameEClass == null) {
			nameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(16);
		}
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_NameString() {
        return (EAttribute)getName_().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarationOrDefinition() {
		if (declarationOrDefinitionEClass == null) {
			declarationOrDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(17);
		}
		return declarationOrDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclarationOrDefinition_IsRegister() {
        return (EAttribute)getDeclarationOrDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclarationOrDefinition_LinkageSpecifier() {
        return (EAttribute)getDeclarationOrDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarationOrDefinition_StorageSpecifiers() {
        return (EReference)getDeclarationOrDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarationOrDefinition_AccessKind() {
        return (EReference)getDeclarationOrDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		if (definitionEClass == null) {
			definitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(18);
		}
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_IdentifierName() {
        return (EReference)getDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_DefinitionType() {
        return (EReference)getDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		if (declarationEClass == null) {
			declarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(19);
		}
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_DefRef() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_IdentifierName() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_DeclarationType() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDeclaration() {
		if (functionDeclarationEClass == null) {
			functionDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(20);
		}
		return functionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDeclaration_FormalParameters() {
        return (EReference)getFunctionDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDeclaration_FunctionMemberAttributes() {
        return (EReference)getFunctionDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		if (variableDeclarationEClass == null) {
			variableDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(21);
		}
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_IsMutable() {
        return (EAttribute)getVariableDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDefinition() {
		if (functionDefinitionEClass == null) {
			functionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(22);
		}
		return functionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_ReturnType() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_FormalParameters() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Body() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_FunctionMemberAttributes() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_OpensScope() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMemberAttributes() {
		if (functionMemberAttributesEClass == null) {
			functionMemberAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(23);
		}
		return functionMemberAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMemberAttributes_IsFriend() {
        return (EAttribute)getFunctionMemberAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMemberAttributes_IsInline() {
        return (EAttribute)getFunctionMemberAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMemberAttributes_IsThisConst() {
        return (EAttribute)getFunctionMemberAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionMemberAttributes_VirtualSpecifier() {
        return (EReference)getFunctionMemberAttributes().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryDefinition() {
		if (entryDefinitionEClass == null) {
			entryDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(24);
		}
		return entryDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryDefinition_FormalParameters() {
        return (EReference)getEntryDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryDefinition_Body() {
        return (EReference)getEntryDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDefinition() {
		if (dataDefinitionEClass == null) {
			dataDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(25);
		}
		return dataDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDefinition_IsMutable() {
        return (EAttribute)getDataDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDefinition_InitialValue() {
        return (EReference)getDataDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitFieldDefinition() {
		if (bitFieldDefinitionEClass == null) {
			bitFieldDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(26);
		}
		return bitFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitFieldDefinition_BitFieldSize() {
        return (EReference)getBitFieldDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteralDefinition() {
		if (enumLiteralDefinitionEClass == null) {
			enumLiteralDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(27);
		}
		return enumLiteralDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteralDefinition_Value() {
        return (EReference)getEnumLiteralDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		if (typeDefinitionEClass == null) {
			typeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(28);
		}
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Name() {
        return (EReference)getTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTypeDefinition() {
		if (namedTypeDefinitionEClass == null) {
			namedTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(29);
		}
		return namedTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeDefinition_DefinitionType() {
        return (EReference)getNamedTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateTypeDefinition() {
		if (aggregateTypeDefinitionEClass == null) {
			aggregateTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(30);
		}
		return aggregateTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateTypeDefinition_AggregateType() {
        return (EReference)getAggregateTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameSpaceDefinition() {
		if (nameSpaceDefinitionEClass == null) {
			nameSpaceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(31);
		}
		return nameSpaceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameSpaceDefinition_NameSpace() {
        return (EReference)getNameSpaceDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameSpaceDefinition_Body() {
        return (EReference)getNameSpaceDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameSpaceDefinition_NameSpaceType() {
        return (EReference)getNameSpaceDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelDefinition() {
		if (labelDefinitionEClass == null) {
			labelDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(32);
		}
		return labelDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelDefinition_LabelName() {
        return (EReference)getLabelDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelDefinition_LabelType() {
        return (EReference)getLabelDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeUnit() {
		if (includeUnitEClass == null) {
			includeUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(33);
		}
		return includeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludeUnit_File() {
        return (EReference)getIncludeUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroCall() {
		if (macroCallEClass == null) {
			macroCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(34);
		}
		return macroCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroCall_RefersTo() {
        return (EReference)getMacroCall().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroDefinition() {
		if (macroDefinitionEClass == null) {
			macroDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(35);
		}
		return macroDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroDefinition_MacroName() {
        return (EAttribute)getMacroDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroDefinition_Body() {
        return (EAttribute)getMacroDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(36);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Text() {
        return (EAttribute)getComment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(37);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_IsConst() {
        return (EAttribute)getType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_IsVolatile() {
        return (EAttribute)getType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		if (primitiveTypeEClass == null) {
			primitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(38);
		}
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_IsSigned() {
        return (EAttribute)getPrimitiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumType() {
		if (enumTypeEClass == null) {
			enumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(39);
		}
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumType_EnumLiterals() {
        return (EReference)getEnumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructedType() {
		if (constructedTypeEClass == null) {
			constructedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(40);
		}
		return constructedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructedType_BaseType() {
        return (EReference)getConstructedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateType() {
		if (aggregateTypeEClass == null) {
			aggregateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(41);
		}
		return aggregateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateType_Members() {
        return (EReference)getAggregateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateType_OpensScope() {
        return (EReference)getAggregateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		if (arrayTypeEClass == null) {
			arrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(42);
		}
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_Ranks() {
        return (EReference)getArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		if (dimensionEClass == null) {
			dimensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(43);
		}
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_LowBound() {
        return (EReference)getDimension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_HighBound() {
        return (EReference)getDimension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		if (functionTypeEClass == null) {
			functionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(44);
		}
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_ReturnType() {
        return (EReference)getFunctionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_ParameterTypes() {
        return (EReference)getFunctionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameterType() {
		if (formalParameterTypeEClass == null) {
			formalParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(45);
		}
		return formalParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalParameterType_Type() {
        return (EReference)getFormalParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedType() {
		if (namedTypeEClass == null) {
			namedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(46);
		}
		return namedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedType_Body() {
        return (EReference)getNamedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassType() {
		if (classTypeEClass == null) {
			classTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(47);
		}
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassType_DerivesFrom() {
        return (EReference)getClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivesFrom() {
		if (derivesFromEClass == null) {
			derivesFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(48);
		}
		return derivesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivesFrom_IsVirtual() {
        return (EAttribute)getDerivesFrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivesFrom_AccessKind() {
        return (EReference)getDerivesFrom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivesFrom_ClassName() {
        return (EReference)getDerivesFrom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnnamedTypeReference() {
		if (unnamedTypeReferenceEClass == null) {
			unnamedTypeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(49);
		}
		return unnamedTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnnamedTypeReference_Type() {
        return (EReference)getUnnamedTypeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTypeReference() {
		if (namedTypeReferenceEClass == null) {
			namedTypeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(50);
		}
		return namedTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeReference_Name() {
        return (EReference)getNamedTypeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeReference_Type() {
        return (EReference)getNamedTypeReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteStatement() {
		if (deleteStatementEClass == null) {
			deleteStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(51);
		}
		return deleteStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteStatement_Operand() {
        return (EReference)getDeleteStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarationOrDefinitionStatement() {
		if (declarationOrDefinitionStatementEClass == null) {
			declarationOrDefinitionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(52);
		}
		return declarationOrDefinitionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarationOrDefinitionStatement_DeclOrDefn() {
        return (EReference)getDeclarationOrDefinitionStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStatement() {
		if (expressionStatementEClass == null) {
			expressionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(53);
		}
		return expressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStatement_Expression() {
        return (EReference)getExpressionStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpStatement() {
		if (jumpStatementEClass == null) {
			jumpStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(54);
		}
		return jumpStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJumpStatement_Target() {
        return (EReference)getJumpStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakStatement() {
		if (breakStatementEClass == null) {
			breakStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(55);
		}
		return breakStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatement_Target() {
        return (EReference)getBreakStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinueStatement() {
		if (continueStatementEClass == null) {
			continueStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(56);
		}
		return continueStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinueStatement_Target() {
        return (EReference)getContinueStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledStatement() {
		if (labeledStatementEClass == null) {
			labeledStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(57);
		}
		return labeledStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabeledStatement_Label() {
        return (EReference)getLabeledStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabeledStatement_Statement() {
        return (EReference)getLabeledStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockStatement() {
		if (blockStatementEClass == null) {
			blockStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(58);
		}
		return blockStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_SubStatements() {
        return (EReference)getBlockStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_OpensScope() {
        return (EReference)getBlockStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyStatement() {
		if (emptyStatementEClass == null) {
			emptyStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(59);
		}
		return emptyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		if (ifStatementEClass == null) {
			ifStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(60);
		}
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Condition() {
        return (EReference)getIfStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ThenBody() {
        return (EReference)getIfStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseBody() {
        return (EReference)getIfStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchStatement() {
		if (switchStatementEClass == null) {
			switchStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(61);
		}
		return switchStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_SwitchExpression() {
        return (EReference)getSwitchStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_Cases() {
        return (EReference)getSwitchStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchCase() {
		if (switchCaseEClass == null) {
			switchCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(62);
		}
		return switchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCase_Body() {
        return (EReference)getSwitchCase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseBlock() {
		if (caseBlockEClass == null) {
			caseBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(63);
		}
		return caseBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseBlock_CaseExpressions() {
        return (EReference)getCaseBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnStatement() {
		if (returnStatementEClass == null) {
			returnStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(64);
		}
		return returnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnStatement_ReturnValue() {
        return (EReference)getReturnStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopStatement() {
		if (loopStatementEClass == null) {
			loopStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(65);
		}
		return loopStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Condition() {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Body() {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForStatement() {
		if (forStatementEClass == null) {
			forStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(66);
		}
		return forStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_InitBody() {
        return (EReference)getForStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_IterationBody() {
        return (EReference)getForStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTryStatement() {
		if (tryStatementEClass == null) {
			tryStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(67);
		}
		return tryStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_GuardedStatement() {
        return (EReference)getTryStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_CatchBlocks() {
        return (EReference)getTryStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_FinalStatement() {
        return (EReference)getTryStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchBlock() {
		if (catchBlockEClass == null) {
			catchBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(68);
		}
		return catchBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchBlock_Body() {
        return (EReference)getCatchBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypesCatchBlock() {
		if (typesCatchBlockEClass == null) {
			typesCatchBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(69);
		}
		return typesCatchBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesCatchBlock_Exceptions() {
        return (EReference)getTypesCatchBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableCatchBlock() {
		if (variableCatchBlockEClass == null) {
			variableCatchBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(70);
		}
		return variableCatchBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableCatchBlock_ExceptionVariable() {
        return (EReference)getVariableCatchBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowStatement() {
		if (throwStatementEClass == null) {
			throwStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(71);
		}
		return throwStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowStatement_Exception() {
        return (EReference)getThrowStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		if (expressionEClass == null) {
			expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(72);
		}
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_ExpressionType() {
        return (EReference)getExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameReference() {
		if (nameReferenceEClass == null) {
			nameReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(73);
		}
		return nameReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameReference_Name() {
        return (EReference)getNameReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameReference_RefersTo() {
        return (EReference)getNameReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayAccess() {
		if (arrayAccessEClass == null) {
			arrayAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(74);
		}
		return arrayAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_ArrayName() {
        return (EReference)getArrayAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_Subscripts() {
        return (EReference)getArrayAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedIdentifierReference() {
		if (qualifiedIdentifierReferenceEClass == null) {
			qualifiedIdentifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(75);
		}
		return qualifiedIdentifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedIdentifierReference_Qualifiers() {
        return (EReference)getQualifiedIdentifierReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedIdentifierReference_Member() {
        return (EReference)getQualifiedIdentifierReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeQualifiedIdentifierReference() {
		if (typeQualifiedIdentifierReferenceEClass == null) {
			typeQualifiedIdentifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(76);
		}
		return typeQualifiedIdentifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeQualifiedIdentifierReference_AggregateType() {
        return (EReference)getTypeQualifiedIdentifierReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeQualifiedIdentifierReference_Member() {
        return (EReference)getTypeQualifiedIdentifierReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		if (literalEClass == null) {
			literalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(77);
		}
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastExpression() {
		if (castExpressionEClass == null) {
			castExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(78);
		}
		return castExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_CastType() {
        return (EReference)getCastExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_Expression() {
        return (EReference)getCastExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		if (unaryExpressionEClass == null) {
			unaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(79);
		}
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operator() {
        return (EReference)getUnaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operand() {
        return (EReference)getUnaryExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		if (binaryExpressionEClass == null) {
			binaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(80);
		}
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Operator() {
        return (EReference)getBinaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftOperand() {
        return (EReference)getBinaryExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightOperand() {
        return (EReference)getBinaryExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorAssign() {
		if (operatorAssignEClass == null) {
			operatorAssignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(81);
		}
		return operatorAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorAssign_Operator() {
        return (EReference)getOperatorAssign().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		if (conditionalExpressionEClass == null) {
			conditionalExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(82);
		}
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Condition() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_OnTrueOperand() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_OnFalseOperand() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeExpression() {
		if (rangeExpressionEClass == null) {
			rangeExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(83);
		}
		return rangeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeExpression_FromExpression() {
        return (EReference)getRangeExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeExpression_ToExpression() {
        return (EReference)getRangeExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCallExpression() {
		if (functionCallExpressionEClass == null) {
			functionCallExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(84);
		}
		return functionCallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCallExpression_CalledFunction() {
        return (EReference)getFunctionCallExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCallExpression_ActualParams() {
        return (EReference)getFunctionCallExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualParameterExpression() {
		if (actualParameterExpressionEClass == null) {
			actualParameterExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(85);
		}
		return actualParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualParameterExpression_Value() {
        return (EReference)getActualParameterExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewExpression() {
		if (newExpressionEClass == null) {
			newExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(86);
		}
		return newExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewExpression_NewType() {
        return (EReference)getNewExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewExpression_ActualParams() {
        return (EReference)getNewExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAccess() {
		if (labelAccessEClass == null) {
			labelAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(87);
		}
		return labelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_Name() {
        return (EReference)getLabelAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_Definition() {
        return (EReference)getLabelAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationExpression() {
		if (annotationExpressionEClass == null) {
			annotationExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(88);
		}
		return annotationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationExpression_AnnotationType() {
        return (EReference)getAnnotationExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationExpression_MemberValues() {
        return (EReference)getAnnotationExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalScope() {
		if (globalScopeEClass == null) {
			globalScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(89);
		}
		return globalScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessorElement() {
		if (preprocessorElementEClass == null) {
			preprocessorElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(90);
		}
		return preprocessorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionObject() {
		if (definitionObjectEClass == null) {
			definitionObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(91);
		}
		return definitionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramScope() {
		if (programScopeEClass == null) {
			programScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(92);
		}
		return programScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		if (typeReferenceEClass == null) {
			typeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(93);
		}
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		if (statementEClass == null) {
			statementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(94);
		}
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionScope() {
		if (functionScopeEClass == null) {
			functionScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(95);
		}
		return functionScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameSpaceType() {
		if (nameSpaceTypeEClass == null) {
			nameSpaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(96);
		}
		return nameSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelType() {
		if (labelTypeEClass == null) {
			labelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(97);
		}
		return labelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateScope() {
		if (aggregateScopeEClass == null) {
			aggregateScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(98);
		}
		return aggregateScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockScope() {
		if (blockScopeEClass == null) {
			blockScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(99);
		}
		return blockScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierReference() {
		if (identifierReferenceEClass == null) {
			identifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(100);
		}
		return identifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameterDefinition() {
		if (formalParameterDefinitionEClass == null) {
			formalParameterDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(101);
		}
		return formalParameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualSpecification() {
		if (virtualSpecificationEClass == null) {
			virtualSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(102);
		}
		return virtualSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameterDeclaration() {
		if (formalParameterDeclarationEClass == null) {
			formalParameterDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(103);
		}
		return formalParameterDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDefinition() {
		if (variableDefinitionEClass == null) {
			variableDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(104);
		}
		return variableDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMemberAttribute() {
		if (functionMemberAttributeEClass == null) {
			functionMemberAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(105);
		}
		return functionMemberAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternal() {
		if (externalEClass == null) {
			externalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(106);
		}
		return externalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPersistent() {
		if (functionPersistentEClass == null) {
			functionPersistentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(107);
		}
		return functionPersistentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileLocal() {
		if (fileLocalEClass == null) {
			fileLocalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(108);
		}
		return fileLocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerClassMember() {
		if (perClassMemberEClass == null) {
			perClassMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(109);
		}
		return perClassMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoDef() {
		if (noDefEClass == null) {
			noDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(110);
		}
		return noDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtual() {
		if (virtualEClass == null) {
			virtualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(111);
		}
		return virtualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPureVirtual() {
		if (pureVirtualEClass == null) {
			pureVirtualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(112);
		}
		return pureVirtualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonVirtual() {
		if (nonVirtualEClass == null) {
			nonVirtualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(113);
		}
		return nonVirtualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionType() {
		if (exceptionTypeEClass == null) {
			exceptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(114);
		}
		return exceptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoid() {
		if (voidEClass == null) {
			voidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(115);
		}
		return voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByte() {
		if (byteEClass == null) {
			byteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(116);
		}
		return byteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortInteger() {
		if (shortIntegerEClass == null) {
			shortIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(117);
		}
		return shortIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		if (integerEClass == null) {
			integerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(118);
		}
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongInteger() {
		if (longIntegerEClass == null) {
			longIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(119);
		}
		return longIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		if (floatEClass == null) {
			floatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(120);
		}
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble() {
		if (doubleEClass == null) {
			doubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(121);
		}
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongDouble() {
		if (longDoubleEClass == null) {
			longDoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(122);
		}
		return longDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		if (characterEClass == null) {
			characterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(123);
		}
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		if (stringEClass == null) {
			stringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(124);
		}
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		if (booleanEClass == null) {
			booleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(125);
		}
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWideCharacter() {
		if (wideCharacterEClass == null) {
			wideCharacterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(126);
		}
		return wideCharacterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		if (collectionTypeEClass == null) {
			collectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(127);
		}
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerType() {
		if (pointerTypeEClass == null) {
			pointerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(128);
		}
		return pointerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		if (referenceTypeEClass == null) {
			referenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(129);
		}
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeType() {
		if (rangeTypeEClass == null) {
			rangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(130);
		}
		return rangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureType() {
		if (structureTypeEClass == null) {
			structureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(131);
		}
		return structureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionType() {
		if (unionTypeEClass == null) {
			unionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(132);
		}
		return unionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationType() {
		if (annotationTypeEClass == null) {
			annotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(133);
		}
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByValueFormalParameterType() {
		if (byValueFormalParameterTypeEClass == null) {
			byValueFormalParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(134);
		}
		return byValueFormalParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByReferenceFormalParameterType() {
		if (byReferenceFormalParameterTypeEClass == null) {
			byReferenceFormalParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(135);
		}
		return byReferenceFormalParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublic() {
		if (publicEClass == null) {
			publicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(136);
		}
		return publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtected() {
		if (protectedEClass == null) {
			protectedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(137);
		}
		return protectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivate() {
		if (privateEClass == null) {
			privateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(138);
		}
		return privateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminateStatement() {
		if (terminateStatementEClass == null) {
			terminateStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(139);
		}
		return terminateStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultBlock() {
		if (defaultBlockEClass == null) {
			defaultBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(140);
		}
		return defaultBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		if (whileStatementEClass == null) {
			whileStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(141);
		}
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoWhileStatement() {
		if (doWhileStatementEClass == null) {
			doWhileStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(142);
		}
		return doWhileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForCheckBeforeStatement() {
		if (forCheckBeforeStatementEClass == null) {
			forCheckBeforeStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(143);
		}
		return forCheckBeforeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForCheckAfterStatement() {
		if (forCheckAfterStatementEClass == null) {
			forCheckAfterStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(144);
		}
		return forCheckAfterStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExpression() {
		if (aggregateExpressionEClass == null) {
			aggregateExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(145);
		}
		return aggregateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedOverPointer() {
		if (qualifiedOverPointerEClass == null) {
			qualifiedOverPointerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(146);
		}
		return qualifiedOverPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedOverData() {
		if (qualifiedOverDataEClass == null) {
			qualifiedOverDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(147);
		}
		return qualifiedOverDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerlLiteral() {
		if (integerlLiteralEClass == null) {
			integerlLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(148);
		}
		return integerlLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		if (stringLiteralEClass == null) {
			stringLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(149);
		}
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharLiteral() {
		if (charLiteralEClass == null) {
			charLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(150);
		}
		return charLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealLiteral() {
		if (realLiteralEClass == null) {
			realLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(151);
		}
		return realLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		if (booleanLiteralEClass == null) {
			booleanLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(152);
		}
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitLiteral() {
		if (bitLiteralEClass == null) {
			bitLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(153);
		}
		return bitLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryPlus() {
		if (unaryPlusEClass == null) {
			unaryPlusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(154);
		}
		return unaryPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegate() {
		if (negateEClass == null) {
			negateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(155);
		}
		return negateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		if (notEClass == null) {
			notEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(156);
		}
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitNot() {
		if (bitNotEClass == null) {
			bitNotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(157);
		}
		return bitNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressOf() {
		if (addressOfEClass == null) {
			addressOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(158);
		}
		return addressOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeref() {
		if (derefEClass == null) {
			derefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(159);
		}
		return derefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrement() {
		if (incrementEClass == null) {
			incrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(160);
		}
		return incrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecrement() {
		if (decrementEClass == null) {
			decrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(161);
		}
		return decrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostIncrement() {
		if (postIncrementEClass == null) {
			postIncrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(162);
		}
		return postIncrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostDecrement() {
		if (postDecrementEClass == null) {
			postDecrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(163);
		}
		return postDecrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		if (addEClass == null) {
			addEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(164);
		}
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtract() {
		if (subtractEClass == null) {
			subtractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(165);
		}
		return subtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		if (multiplyEClass == null) {
			multiplyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(166);
		}
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivide() {
		if (divideEClass == null) {
			divideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(167);
		}
		return divideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulus() {
		if (modulusEClass == null) {
			modulusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(168);
		}
		return modulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponent() {
		if (exponentEClass == null) {
			exponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(169);
		}
		return exponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		if (andEClass == null) {
			andEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(170);
		}
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		if (orEClass == null) {
			orEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(171);
		}
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		if (equalEClass == null) {
			equalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(172);
		}
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEqual() {
		if (notEqualEClass == null) {
			notEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(173);
		}
		return notEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreater() {
		if (greaterEClass == null) {
			greaterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(174);
		}
		return greaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotGreater() {
		if (notGreaterEClass == null) {
			notGreaterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(175);
		}
		return notGreaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLess() {
		if (lessEClass == null) {
			lessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(176);
		}
		return lessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotLess() {
		if (notLessEClass == null) {
			notLessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(177);
		}
		return notLessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitAnd() {
		if (bitAndEClass == null) {
			bitAndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(178);
		}
		return bitAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitOr() {
		if (bitOrEClass == null) {
			bitOrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(179);
		}
		return bitOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitXor() {
		if (bitXorEClass == null) {
			bitXorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(180);
		}
		return bitXorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitLeftShift() {
		if (bitLeftShiftEClass == null) {
			bitLeftShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(181);
		}
		return bitLeftShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitRightShift() {
		if (bitRightShiftEClass == null) {
			bitRightShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(182);
		}
		return bitRightShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssign() {
		if (assignEClass == null) {
			assignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(183);
		}
		return assignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissingActualParameter() {
		if (missingActualParameterEClass == null) {
			missingActualParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(184);
		}
		return missingActualParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByValueActualParameterExpression() {
		if (byValueActualParameterExpressionEClass == null) {
			byValueActualParameterExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(185);
		}
		return byValueActualParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByReferenceActualParameterExpression() {
		if (byReferenceActualParameterExpressionEClass == null) {
			byReferenceActualParameterExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(186);
		}
		return byReferenceActualParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTriggerDefinition() {
		if (specificTriggerDefinitionEClass == null) {
			specificTriggerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(187);
		}
		return specificTriggerDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTriggerDefinition_Body() {
        return (EReference)getSpecificTriggerDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificLessEqual() {
		if (specificLessEqualEClass == null) {
			specificLessEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(188);
		}
		return specificLessEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificGreaterEqual() {
		if (specificGreaterEqualEClass == null) {
			specificGreaterEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(189);
		}
		return specificGreaterEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificIn() {
		if (specificInEClass == null) {
			specificInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(190);
		}
		return specificInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificLike() {
		if (specificLikeEClass == null) {
			specificLikeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(191);
		}
		return specificLikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificConcatString() {
		if (specificConcatStringEClass == null) {
			specificConcatStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(192);
		}
		return specificConcatStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificSelectStatement() {
		if (specificSelectStatementEClass == null) {
			specificSelectStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(193);
		}
		return specificSelectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBDatabaseDefinition() {
		if (rdbDatabaseDefinitionEClass == null) {
			rdbDatabaseDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(194);
		}
		return rdbDatabaseDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBDatabaseDefinition_TableSpace() {
        return (EReference)getRDBDatabaseDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTableSpaceReference() {
		if (rdbTableSpaceReferenceEClass == null) {
			rdbTableSpaceReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(195);
		}
		return rdbTableSpaceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBUserDefinition() {
		if (rdbUserDefinitionEClass == null) {
			rdbUserDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(196);
		}
		return rdbUserDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBUserDefinition_Owns() {
        return (EReference)getRDBUserDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTableSpaceDefinition() {
		if (rdbTableSpaceDefinitionEClass == null) {
			rdbTableSpaceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(197);
		}
		return rdbTableSpaceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTableSpaceDefinition_Table() {
        return (EReference)getRDBTableSpaceDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTableDefinition() {
		if (rdbTableDefinitionEClass == null) {
			rdbTableDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(198);
		}
		return rdbTableDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTableDefinition_PrimKey() {
        return (EReference)getRDBTableDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTableDefinition_Column() {
        return (EReference)getRDBTableDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTableDefinition_Constraint() {
        return (EReference)getRDBTableDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTableDefinition_Index() {
        return (EReference)getRDBTableDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTableDefinition_Trigger() {
        return (EReference)getRDBTableDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBColumnDefinition() {
		if (rdbColumnDefinitionEClass == null) {
			rdbColumnDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(199);
		}
		return rdbColumnDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBColumnDefinition_NotNull() {
        return (EAttribute)getRDBColumnDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBColumnDefinition_Name() {
        return (EReference)getRDBColumnDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBColumnDefinition_Type() {
        return (EReference)getRDBColumnDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBViewDefinition() {
		if (rdbViewDefinitionEClass == null) {
			rdbViewDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(200);
		}
		return rdbViewDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBViewDefinition_DefinedBy() {
        return (EReference)getRDBViewDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBCursorDefinition() {
		if (rdbCursorDefinitionEClass == null) {
			rdbCursorDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(201);
		}
		return rdbCursorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBCursorDefinition_SelectExpression() {
        return (EReference)getRDBCursorDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBIndex() {
		if (rdbIndexEClass == null) {
			rdbIndexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(202);
		}
		return rdbIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBIndex_NotNull() {
        return (EAttribute)getRDBIndex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBIndex_IsUnique() {
        return (EAttribute)getRDBIndex().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBIndex_IndexColumn() {
        return (EReference)getRDBIndex().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBIndexColumn() {
		if (rdbIndexColumnEClass == null) {
			rdbIndexColumnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(203);
		}
		return rdbIndexColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBIndexColumn_Column() {
        return (EReference)getRDBIndexColumn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBIndexColumn_AscendingOrDescending() {
        return (EAttribute)getRDBIndexColumn().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTrigger() {
		if (rdbTriggerEClass == null) {
			rdbTriggerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(204);
		}
		return rdbTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTrigger_Body() {
        return (EReference)getRDBTrigger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBConstraint() {
		if (rdbConstraintEClass == null) {
			rdbConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(205);
		}
		return rdbConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBCheckConstraint() {
		if (rdbCheckConstraintEClass == null) {
			rdbCheckConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(206);
		}
		return rdbCheckConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBCheckConstraint_RDBConstraintText() {
        return (EAttribute)getRDBCheckConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBCheckConstraint_RDBConstraintType() {
        return (EAttribute)getRDBCheckConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBRefIntegrity() {
		if (rdbRefIntegrityEClass == null) {
			rdbRefIntegrityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(207);
		}
		return rdbRefIntegrityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBRefIntegrity_ForeignKey() {
        return (EReference)getRDBRefIntegrity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBRefIntegrity_ParentKey() {
        return (EReference)getRDBRefIntegrity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBRefIntegrity_ParentTable() {
        return (EReference)getRDBRefIntegrity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBUniqueKey() {
		if (rdbUniqueKeyEClass == null) {
			rdbUniqueKeyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(208);
		}
		return rdbUniqueKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBUniqueKey_Column() {
        return (EReference)getRDBUniqueKey().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBConnectStatement() {
		if (rdbConnectStatementEClass == null) {
			rdbConnectStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(209);
		}
		return rdbConnectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBConnectStatement_ConnectString() {
        return (EReference)getRDBConnectStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBSelectStatement() {
		if (rdbSelectStatementEClass == null) {
			rdbSelectStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(210);
		}
		return rdbSelectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBSelectStatement_SelectExpression() {
        return (EReference)getRDBSelectStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBSelectStatement_IntoVariable() {
        return (EReference)getRDBSelectStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBInsertStatement() {
		if (rdbInsertStatementEClass == null) {
			rdbInsertStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(211);
		}
		return rdbInsertStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBInsertStatement_IntoTable() {
        return (EReference)getRDBInsertStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBInsertStatement_Columns() {
        return (EReference)getRDBInsertStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBInsertStatement_Values() {
        return (EReference)getRDBInsertStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBModifyStatement() {
		if (rdbModifyStatementEClass == null) {
			rdbModifyStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(212);
		}
		return rdbModifyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBModifyStatement_Table() {
        return (EReference)getRDBModifyStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBModifyStatement_Where() {
        return (EReference)getRDBModifyStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBUpdateStatement() {
		if (rdbUpdateStatementEClass == null) {
			rdbUpdateStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(213);
		}
		return rdbUpdateStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBUpdateStatement_Values() {
        return (EReference)getRDBUpdateStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBCursorStatement() {
		if (rdbCursorStatementEClass == null) {
			rdbCursorStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(214);
		}
		return rdbCursorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBCursorStatement_Cursor() {
        return (EReference)getRDBCursorStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBOpenCursorStatement() {
		if (rdbOpenCursorStatementEClass == null) {
			rdbOpenCursorStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(215);
		}
		return rdbOpenCursorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBOpenCursorStatement_Values() {
        return (EReference)getRDBOpenCursorStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBFetchCursorStatement() {
		if (rdbFetchCursorStatementEClass == null) {
			rdbFetchCursorStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(216);
		}
		return rdbFetchCursorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBFetchCursorStatement_Into() {
        return (EReference)getRDBFetchCursorStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBHostVariableReference() {
		if (rdbHostVariableReferenceEClass == null) {
			rdbHostVariableReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(217);
		}
		return rdbHostVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBHostVariableReference_BaseVariable() {
        return (EReference)getRDBHostVariableReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBHostVariableReference_Indicator() {
        return (EReference)getRDBHostVariableReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBSelectExpression() {
		if (rdbSelectExpressionEClass == null) {
			rdbSelectExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(218);
		}
		return rdbSelectExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBSelectExpression_Table() {
        return (EReference)getRDBSelectExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBSelectExpression_Column() {
        return (EReference)getRDBSelectExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBSelectExpression_Where() {
        return (EReference)getRDBSelectExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTableReference() {
		if (rdbTableReferenceEClass == null) {
			rdbTableReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(219);
		}
		return rdbTableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBTableReference_Alias() {
        return (EReference)getRDBTableReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTableAlias() {
		if (rdbTableAliasEClass == null) {
			rdbTableAliasEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(220);
		}
		return rdbTableAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBColumnReference() {
		if (rdbColumnReferenceEClass == null) {
			rdbColumnReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(221);
		}
		return rdbColumnReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBColumnReference_Table() {
        return (EReference)getRDBColumnReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBDataBaseType() {
		if (rdbDataBaseTypeEClass == null) {
			rdbDataBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(222);
		}
		return rdbDataBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBUserType() {
		if (rdbUserTypeEClass == null) {
			rdbUserTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(223);
		}
		return rdbUserTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTableSpaceType() {
		if (rdbTableSpaceTypeEClass == null) {
			rdbTableSpaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(224);
		}
		return rdbTableSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTableType() {
		if (rdbTableTypeEClass == null) {
			rdbTableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(225);
		}
		return rdbTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBViewType() {
		if (rdbViewTypeEClass == null) {
			rdbViewTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(226);
		}
		return rdbViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBCursorType() {
		if (rdbCursorTypeEClass == null) {
			rdbCursorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(227);
		}
		return rdbCursorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBColumnType() {
		if (rdbColumnTypeEClass == null) {
			rdbColumnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(228);
		}
		return rdbColumnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBInteger() {
		if (rdbIntegerEClass == null) {
			rdbIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(229);
		}
		return rdbIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBInt() {
		if (rdbIntEClass == null) {
			rdbIntEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(230);
		}
		return rdbIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBReal() {
		if (rdbRealEClass == null) {
			rdbRealEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(231);
		}
		return rdbRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBFloat() {
		if (rdbFloatEClass == null) {
			rdbFloatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(232);
		}
		return rdbFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBDecimal() {
		if (rdbDecimalEClass == null) {
			rdbDecimalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(233);
		}
		return rdbDecimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBNumber() {
		if (rdbNumberEClass == null) {
			rdbNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(234);
		}
		return rdbNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBLong() {
		if (rdbLongEClass == null) {
			rdbLongEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(235);
		}
		return rdbLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBChar() {
		if (rdbCharEClass == null) {
			rdbCharEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(236);
		}
		return rdbCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBVarchar() {
		if (rdbVarcharEClass == null) {
			rdbVarcharEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(237);
		}
		return rdbVarcharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBString() {
		if (rdbStringEClass == null) {
			rdbStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(238);
		}
		return rdbStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBRaw() {
		if (rdbRawEClass == null) {
			rdbRawEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(239);
		}
		return rdbRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBDate() {
		if (rdbDateEClass == null) {
			rdbDateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(240);
		}
		return rdbDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBTimestamp() {
		if (rdbTimestampEClass == null) {
			rdbTimestampEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(241);
		}
		return rdbTimestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBRowid() {
		if (rdbRowidEClass == null) {
			rdbRowidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(242);
		}
		return rdbRowidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBBoolean() {
		if (rdbBooleanEClass == null) {
			rdbBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(243);
		}
		return rdbBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBBlob() {
		if (rdbBlobEClass == null) {
			rdbBlobEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(244);
		}
		return rdbBlobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBClob() {
		if (rdbClobEClass == null) {
			rdbClobEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(245);
		}
		return rdbClobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBNClob() {
		if (rdbnClobEClass == null) {
			rdbnClobEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(246);
		}
		return rdbnClobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBBFile() {
		if (rdbbFileEClass == null) {
			rdbbFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(247);
		}
		return rdbbFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBDeleteStatement() {
		if (rdbDeleteStatementEClass == null) {
			rdbDeleteStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(248);
		}
		return rdbDeleteStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBCloseCursorStatement() {
		if (rdbCloseCursorStatementEClass == null) {
			rdbCloseCursorStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(249);
		}
		return rdbCloseCursorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBHostVariableExpression() {
		if (rdbHostVariableExpressionEClass == null) {
			rdbHostVariableExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(250);
		}
		return rdbHostVariableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitable() {
		if (visitableEClass == null) {
			visitableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AstmPackage.eNS_URI).getEClassifiers().get(251);
		}
		return visitableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstmFactory getAstmFactory() {
		return (AstmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("astm." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //AstmPackageImpl
