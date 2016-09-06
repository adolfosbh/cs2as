/**
 */
package org.xtext.example.delphi.astm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.jdt.annotation.Nullable;

import org.xtext.example.delphi.astm.AccessKind;
import org.xtext.example.delphi.astm.ActualParameter;
import org.xtext.example.delphi.astm.ActualParameterExpression;
import org.xtext.example.delphi.astm.Add;
import org.xtext.example.delphi.astm.AddressOf;
import org.xtext.example.delphi.astm.AggregateExpression;
import org.xtext.example.delphi.astm.AggregateScope;
import org.xtext.example.delphi.astm.AggregateType;
import org.xtext.example.delphi.astm.AggregateTypeDefinition;
import org.xtext.example.delphi.astm.And;
import org.xtext.example.delphi.astm.AnnotationExpression;
import org.xtext.example.delphi.astm.AnnotationType;
import org.xtext.example.delphi.astm.ArrayAccess;
import org.xtext.example.delphi.astm.ArrayType;
import org.xtext.example.delphi.astm.Assign;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.BinaryExpression;
import org.xtext.example.delphi.astm.BinaryOperator;
import org.xtext.example.delphi.astm.BitAnd;
import org.xtext.example.delphi.astm.BitFieldDefinition;
import org.xtext.example.delphi.astm.BitLeftShift;
import org.xtext.example.delphi.astm.BitLiteral;
import org.xtext.example.delphi.astm.BitNot;
import org.xtext.example.delphi.astm.BitOr;
import org.xtext.example.delphi.astm.BitRightShift;
import org.xtext.example.delphi.astm.BitXor;
import org.xtext.example.delphi.astm.BlockScope;
import org.xtext.example.delphi.astm.BlockStatement;
import org.xtext.example.delphi.astm.BooleanLiteral;
import org.xtext.example.delphi.astm.BreakStatement;
import org.xtext.example.delphi.astm.ByReferenceActualParameterExpression;
import org.xtext.example.delphi.astm.ByReferenceFormalParameterType;
import org.xtext.example.delphi.astm.ByValueActualParameterExpression;
import org.xtext.example.delphi.astm.ByValueFormalParameterType;
import org.xtext.example.delphi.astm.CaseBlock;
import org.xtext.example.delphi.astm.CastExpression;
import org.xtext.example.delphi.astm.CatchBlock;
import org.xtext.example.delphi.astm.CharLiteral;
import org.xtext.example.delphi.astm.ClassType;
import org.xtext.example.delphi.astm.CollectionType;
import org.xtext.example.delphi.astm.Comment;
import org.xtext.example.delphi.astm.CompilationUnit;
import org.xtext.example.delphi.astm.ConditionalExpression;
import org.xtext.example.delphi.astm.ConstructedType;
import org.xtext.example.delphi.astm.ContinueStatement;
import org.xtext.example.delphi.astm.DataDefinition;
import org.xtext.example.delphi.astm.DataType;
import org.xtext.example.delphi.astm.Declaration;
import org.xtext.example.delphi.astm.DeclarationOrDefinition;
import org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement;
import org.xtext.example.delphi.astm.Decrement;
import org.xtext.example.delphi.astm.DefaultBlock;
import org.xtext.example.delphi.astm.Definition;
import org.xtext.example.delphi.astm.DefinitionObject;
import org.xtext.example.delphi.astm.DeleteStatement;
import org.xtext.example.delphi.astm.DelphiBlockStatement;
import org.xtext.example.delphi.astm.DelphiFunctionCallExpression;
import org.xtext.example.delphi.astm.DelphiImplementationSection;
import org.xtext.example.delphi.astm.DelphiInterfaceSection;
import org.xtext.example.delphi.astm.DelphiUnit;
import org.xtext.example.delphi.astm.DelphiWithStatement;
import org.xtext.example.delphi.astm.Deref;
import org.xtext.example.delphi.astm.DerivesFrom;
import org.xtext.example.delphi.astm.Dimension;
import org.xtext.example.delphi.astm.Divide;
import org.xtext.example.delphi.astm.DoWhileStatement;
import org.xtext.example.delphi.astm.EmptyStatement;
import org.xtext.example.delphi.astm.EntryDefinition;
import org.xtext.example.delphi.astm.EnumLiteralDefinition;
import org.xtext.example.delphi.astm.EnumType;
import org.xtext.example.delphi.astm.Equal;
import org.xtext.example.delphi.astm.ExceptionType;
import org.xtext.example.delphi.astm.Exponent;
import org.xtext.example.delphi.astm.Expression;
import org.xtext.example.delphi.astm.ExpressionStatement;
import org.xtext.example.delphi.astm.External;
import org.xtext.example.delphi.astm.FileLocal;
import org.xtext.example.delphi.astm.ForCheckAfterStatement;
import org.xtext.example.delphi.astm.ForCheckBeforeStatement;
import org.xtext.example.delphi.astm.ForStatement;
import org.xtext.example.delphi.astm.FormalParameterDeclaration;
import org.xtext.example.delphi.astm.FormalParameterDefinition;
import org.xtext.example.delphi.astm.FormalParameterType;
import org.xtext.example.delphi.astm.FunctionCallExpression;
import org.xtext.example.delphi.astm.FunctionDeclaration;
import org.xtext.example.delphi.astm.FunctionDefinition;
import org.xtext.example.delphi.astm.FunctionMemberAttribute;
import org.xtext.example.delphi.astm.FunctionMemberAttributes;
import org.xtext.example.delphi.astm.FunctionPersistent;
import org.xtext.example.delphi.astm.FunctionScope;
import org.xtext.example.delphi.astm.FunctionType;
import org.xtext.example.delphi.astm.GASTMObject;
import org.xtext.example.delphi.astm.GASTMSemanticObject;
import org.xtext.example.delphi.astm.GASTMSourceObject;
import org.xtext.example.delphi.astm.GASTMSyntaxObject;
import org.xtext.example.delphi.astm.GlobalScope;
import org.xtext.example.delphi.astm.Greater;
import org.xtext.example.delphi.astm.IdentifierReference;
import org.xtext.example.delphi.astm.IfStatement;
import org.xtext.example.delphi.astm.IncludeUnit;
import org.xtext.example.delphi.astm.Increment;
import org.xtext.example.delphi.astm.IntegerLiteral;
import org.xtext.example.delphi.astm.JumpStatement;
import org.xtext.example.delphi.astm.LabelAccess;
import org.xtext.example.delphi.astm.LabelDefinition;
import org.xtext.example.delphi.astm.LabelType;
import org.xtext.example.delphi.astm.LabeledStatement;
import org.xtext.example.delphi.astm.Less;
import org.xtext.example.delphi.astm.Literal;
import org.xtext.example.delphi.astm.LongDouble;
import org.xtext.example.delphi.astm.LongInteger;
import org.xtext.example.delphi.astm.LoopStatement;
import org.xtext.example.delphi.astm.MacroCall;
import org.xtext.example.delphi.astm.MacroDefinition;
import org.xtext.example.delphi.astm.MissingActualParameter;
import org.xtext.example.delphi.astm.Modulus;
import org.xtext.example.delphi.astm.Multiply;
import org.xtext.example.delphi.astm.Name;
import org.xtext.example.delphi.astm.NameReference;
import org.xtext.example.delphi.astm.NameSpaceDefinition;
import org.xtext.example.delphi.astm.NameSpaceType;
import org.xtext.example.delphi.astm.NamedType;
import org.xtext.example.delphi.astm.NamedTypeDefinition;
import org.xtext.example.delphi.astm.NamedTypeReference;
import org.xtext.example.delphi.astm.Negate;
import org.xtext.example.delphi.astm.NewExpression;
import org.xtext.example.delphi.astm.NoDef;
import org.xtext.example.delphi.astm.NonVirtual;
import org.xtext.example.delphi.astm.Not;
import org.xtext.example.delphi.astm.NotEqual;
import org.xtext.example.delphi.astm.NotGreater;
import org.xtext.example.delphi.astm.NotLess;
import org.xtext.example.delphi.astm.OperatorAssign;
import org.xtext.example.delphi.astm.Or;
import org.xtext.example.delphi.astm.OtherSyntaxObject;
import org.xtext.example.delphi.astm.PerClassMember;
import org.xtext.example.delphi.astm.PointerType;
import org.xtext.example.delphi.astm.PostDecrement;
import org.xtext.example.delphi.astm.PostIncrement;
import org.xtext.example.delphi.astm.PreprocessorElement;
import org.xtext.example.delphi.astm.PrimitiveType;
import org.xtext.example.delphi.astm.Private;
import org.xtext.example.delphi.astm.ProgramScope;
import org.xtext.example.delphi.astm.Project;
import org.xtext.example.delphi.astm.Protected;
import org.xtext.example.delphi.astm.Public;
import org.xtext.example.delphi.astm.PureVirtual;
import org.xtext.example.delphi.astm.QualifiedIdentifierReference;
import org.xtext.example.delphi.astm.QualifiedOverData;
import org.xtext.example.delphi.astm.QualifiedOverPointer;
import org.xtext.example.delphi.astm.RangeExpression;
import org.xtext.example.delphi.astm.RangeType;
import org.xtext.example.delphi.astm.RealLiteral;
import org.xtext.example.delphi.astm.ReferenceType;
import org.xtext.example.delphi.astm.ReturnStatement;
import org.xtext.example.delphi.astm.Scope;
import org.xtext.example.delphi.astm.ShortInteger;
import org.xtext.example.delphi.astm.SourceFile;
import org.xtext.example.delphi.astm.SourceLocation;
import org.xtext.example.delphi.astm.SpecificConcatString;
import org.xtext.example.delphi.astm.SpecificGreaterEqual;
import org.xtext.example.delphi.astm.SpecificIn;
import org.xtext.example.delphi.astm.SpecificLessEqual;
import org.xtext.example.delphi.astm.SpecificLike;
import org.xtext.example.delphi.astm.SpecificSelectStatement;
import org.xtext.example.delphi.astm.SpecificTriggerDefinition;
import org.xtext.example.delphi.astm.Statement;
import org.xtext.example.delphi.astm.StorageSpecification;
import org.xtext.example.delphi.astm.StringLiteral;
import org.xtext.example.delphi.astm.StructureType;
import org.xtext.example.delphi.astm.Subtract;
import org.xtext.example.delphi.astm.SwitchCase;
import org.xtext.example.delphi.astm.SwitchStatement;
import org.xtext.example.delphi.astm.TerminateStatement;
import org.xtext.example.delphi.astm.ThrowStatement;
import org.xtext.example.delphi.astm.TryStatement;
import org.xtext.example.delphi.astm.Type;
import org.xtext.example.delphi.astm.TypeDefinition;
import org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference;
import org.xtext.example.delphi.astm.TypeReference;
import org.xtext.example.delphi.astm.TypesCatchBlock;
import org.xtext.example.delphi.astm.UnaryExpression;
import org.xtext.example.delphi.astm.UnaryOperator;
import org.xtext.example.delphi.astm.UnaryPlus;
import org.xtext.example.delphi.astm.UnionType;
import org.xtext.example.delphi.astm.UnnamedTypeReference;
import org.xtext.example.delphi.astm.VariableCatchBlock;
import org.xtext.example.delphi.astm.VariableDeclaration;
import org.xtext.example.delphi.astm.VariableDefinition;
import org.xtext.example.delphi.astm.Virtual;
import org.xtext.example.delphi.astm.VirtualSpecification;
import org.xtext.example.delphi.astm.WhileStatement;
import org.xtext.example.delphi.astm.WideCharacter;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.delphi.astm.AstmPackage
 * @generated
 */
public class AstmSwitch<@Nullable T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstmSwitch() {
		if (modelPackage == null) {
			modelPackage = AstmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AstmPackage.DELPHI_UNIT: {
				DelphiUnit delphiUnit = (DelphiUnit)theEObject;
				T result = caseDelphiUnit(delphiUnit);
				if (result == null) result = caseCompilationUnit(delphiUnit);
				if (result == null) result = caseOtherSyntaxObject(delphiUnit);
				if (result == null) result = caseGASTMSyntaxObject(delphiUnit);
				if (result == null) result = caseGASTMObject(delphiUnit);
				if (result == null) result = caseVisitable(delphiUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DELPHI_INTERFACE_SECTION: {
				DelphiInterfaceSection delphiInterfaceSection = (DelphiInterfaceSection)theEObject;
				T result = caseDelphiInterfaceSection(delphiInterfaceSection);
				if (result == null) result = caseCompilationUnit(delphiInterfaceSection);
				if (result == null) result = caseOtherSyntaxObject(delphiInterfaceSection);
				if (result == null) result = caseGASTMSyntaxObject(delphiInterfaceSection);
				if (result == null) result = caseGASTMObject(delphiInterfaceSection);
				if (result == null) result = caseVisitable(delphiInterfaceSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DELPHI_IMPLEMENTATION_SECTION: {
				DelphiImplementationSection delphiImplementationSection = (DelphiImplementationSection)theEObject;
				T result = caseDelphiImplementationSection(delphiImplementationSection);
				if (result == null) result = caseCompilationUnit(delphiImplementationSection);
				if (result == null) result = caseOtherSyntaxObject(delphiImplementationSection);
				if (result == null) result = caseGASTMSyntaxObject(delphiImplementationSection);
				if (result == null) result = caseGASTMObject(delphiImplementationSection);
				if (result == null) result = caseVisitable(delphiImplementationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DELPHI_BLOCK_STATEMENT: {
				DelphiBlockStatement delphiBlockStatement = (DelphiBlockStatement)theEObject;
				T result = caseDelphiBlockStatement(delphiBlockStatement);
				if (result == null) result = caseBlockStatement(delphiBlockStatement);
				if (result == null) result = caseStatement(delphiBlockStatement);
				if (result == null) result = caseGASTMSyntaxObject(delphiBlockStatement);
				if (result == null) result = caseGASTMObject(delphiBlockStatement);
				if (result == null) result = caseVisitable(delphiBlockStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DELPHI_FUNCTION_CALL_EXPRESSION: {
				DelphiFunctionCallExpression delphiFunctionCallExpression = (DelphiFunctionCallExpression)theEObject;
				T result = caseDelphiFunctionCallExpression(delphiFunctionCallExpression);
				if (result == null) result = caseFunctionCallExpression(delphiFunctionCallExpression);
				if (result == null) result = caseExpression(delphiFunctionCallExpression);
				if (result == null) result = caseGASTMSyntaxObject(delphiFunctionCallExpression);
				if (result == null) result = caseGASTMObject(delphiFunctionCallExpression);
				if (result == null) result = caseVisitable(delphiFunctionCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DELPHI_WITH_STATEMENT: {
				DelphiWithStatement delphiWithStatement = (DelphiWithStatement)theEObject;
				T result = caseDelphiWithStatement(delphiWithStatement);
				if (result == null) result = caseBlockStatement(delphiWithStatement);
				if (result == null) result = caseStatement(delphiWithStatement);
				if (result == null) result = caseGASTMSyntaxObject(delphiWithStatement);
				if (result == null) result = caseGASTMObject(delphiWithStatement);
				if (result == null) result = caseVisitable(delphiWithStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.GASTM_OBJECT: {
				GASTMObject gastmObject = (GASTMObject)theEObject;
				T result = caseGASTMObject(gastmObject);
				if (result == null) result = caseVisitable(gastmObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.GASTM_SOURCE_OBJECT: {
				GASTMSourceObject gastmSourceObject = (GASTMSourceObject)theEObject;
				T result = caseGASTMSourceObject(gastmSourceObject);
				if (result == null) result = caseVisitable(gastmSourceObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.GASTM_SEMANTIC_OBJECT: {
				GASTMSemanticObject gastmSemanticObject = (GASTMSemanticObject)theEObject;
				T result = caseGASTMSemanticObject(gastmSemanticObject);
				if (result == null) result = caseVisitable(gastmSemanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.OTHER_SYNTAX_OBJECT: {
				OtherSyntaxObject otherSyntaxObject = (OtherSyntaxObject)theEObject;
				T result = caseOtherSyntaxObject(otherSyntaxObject);
				if (result == null) result = caseGASTMSyntaxObject(otherSyntaxObject);
				if (result == null) result = caseGASTMObject(otherSyntaxObject);
				if (result == null) result = caseVisitable(otherSyntaxObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.STORAGE_SPECIFICATION: {
				StorageSpecification storageSpecification = (StorageSpecification)theEObject;
				T result = caseStorageSpecification(storageSpecification);
				if (result == null) result = caseVisitable(storageSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseGASTMSyntaxObject(dataType);
				if (result == null) result = caseGASTMObject(dataType);
				if (result == null) result = caseVisitable(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ACCESS_KIND: {
				AccessKind accessKind = (AccessKind)theEObject;
				T result = caseAccessKind(accessKind);
				if (result == null) result = caseVisitable(accessKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseVisitable(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseVisitable(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ACTUAL_PARAMETER: {
				ActualParameter actualParameter = (ActualParameter)theEObject;
				T result = caseActualParameter(actualParameter);
				if (result == null) result = caseVisitable(actualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SOURCE_FILE: {
				SourceFile sourceFile = (SourceFile)theEObject;
				T result = caseSourceFile(sourceFile);
				if (result == null) result = caseGASTMSourceObject(sourceFile);
				if (result == null) result = caseVisitable(sourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SOURCE_LOCATION: {
				SourceLocation sourceLocation = (SourceLocation)theEObject;
				T result = caseSourceLocation(sourceLocation);
				if (result == null) result = caseGASTMSourceObject(sourceLocation);
				if (result == null) result = caseVisitable(sourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseGASTMSemanticObject(project);
				if (result == null) result = caseVisitable(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = caseGASTMSemanticObject(scope);
				if (result == null) result = caseVisitable(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.GASTM_SYNTAX_OBJECT: {
				GASTMSyntaxObject gastmSyntaxObject = (GASTMSyntaxObject)theEObject;
				T result = caseGASTMSyntaxObject(gastmSyntaxObject);
				if (result == null) result = caseGASTMObject(gastmSyntaxObject);
				if (result == null) result = caseVisitable(gastmSyntaxObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseOtherSyntaxObject(compilationUnit);
				if (result == null) result = caseGASTMSyntaxObject(compilationUnit);
				if (result == null) result = caseGASTMObject(compilationUnit);
				if (result == null) result = caseVisitable(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NAME: {
				Name name = (Name)theEObject;
				T result = caseName(name);
				if (result == null) result = caseOtherSyntaxObject(name);
				if (result == null) result = caseGASTMSyntaxObject(name);
				if (result == null) result = caseGASTMObject(name);
				if (result == null) result = caseVisitable(name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DECLARATION_OR_DEFINITION: {
				DeclarationOrDefinition declarationOrDefinition = (DeclarationOrDefinition)theEObject;
				T result = caseDeclarationOrDefinition(declarationOrDefinition);
				if (result == null) result = caseDefinitionObject(declarationOrDefinition);
				if (result == null) result = caseGASTMSyntaxObject(declarationOrDefinition);
				if (result == null) result = caseGASTMObject(declarationOrDefinition);
				if (result == null) result = caseVisitable(declarationOrDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseDeclarationOrDefinition(definition);
				if (result == null) result = caseDefinitionObject(definition);
				if (result == null) result = caseGASTMSyntaxObject(definition);
				if (result == null) result = caseGASTMObject(definition);
				if (result == null) result = caseVisitable(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseDeclarationOrDefinition(declaration);
				if (result == null) result = caseDefinitionObject(declaration);
				if (result == null) result = caseGASTMSyntaxObject(declaration);
				if (result == null) result = caseGASTMObject(declaration);
				if (result == null) result = caseVisitable(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseDeclaration(functionDeclaration);
				if (result == null) result = caseDeclarationOrDefinition(functionDeclaration);
				if (result == null) result = caseDefinitionObject(functionDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(functionDeclaration);
				if (result == null) result = caseGASTMObject(functionDeclaration);
				if (result == null) result = caseVisitable(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseDeclaration(variableDeclaration);
				if (result == null) result = caseDeclarationOrDefinition(variableDeclaration);
				if (result == null) result = caseDefinitionObject(variableDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(variableDeclaration);
				if (result == null) result = caseGASTMObject(variableDeclaration);
				if (result == null) result = caseVisitable(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_DEFINITION: {
				FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
				T result = caseFunctionDefinition(functionDefinition);
				if (result == null) result = caseDefinition(functionDefinition);
				if (result == null) result = caseDeclarationOrDefinition(functionDefinition);
				if (result == null) result = caseDefinitionObject(functionDefinition);
				if (result == null) result = caseGASTMSyntaxObject(functionDefinition);
				if (result == null) result = caseGASTMObject(functionDefinition);
				if (result == null) result = caseVisitable(functionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_MEMBER_ATTRIBUTES: {
				FunctionMemberAttributes functionMemberAttributes = (FunctionMemberAttributes)theEObject;
				T result = caseFunctionMemberAttributes(functionMemberAttributes);
				if (result == null) result = caseVisitable(functionMemberAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ENTRY_DEFINITION: {
				EntryDefinition entryDefinition = (EntryDefinition)theEObject;
				T result = caseEntryDefinition(entryDefinition);
				if (result == null) result = caseDefinition(entryDefinition);
				if (result == null) result = caseDeclarationOrDefinition(entryDefinition);
				if (result == null) result = caseDefinitionObject(entryDefinition);
				if (result == null) result = caseGASTMSyntaxObject(entryDefinition);
				if (result == null) result = caseGASTMObject(entryDefinition);
				if (result == null) result = caseVisitable(entryDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DATA_DEFINITION: {
				DataDefinition dataDefinition = (DataDefinition)theEObject;
				T result = caseDataDefinition(dataDefinition);
				if (result == null) result = caseDefinition(dataDefinition);
				if (result == null) result = caseDeclarationOrDefinition(dataDefinition);
				if (result == null) result = caseDefinitionObject(dataDefinition);
				if (result == null) result = caseGASTMSyntaxObject(dataDefinition);
				if (result == null) result = caseGASTMObject(dataDefinition);
				if (result == null) result = caseVisitable(dataDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_FIELD_DEFINITION: {
				BitFieldDefinition bitFieldDefinition = (BitFieldDefinition)theEObject;
				T result = caseBitFieldDefinition(bitFieldDefinition);
				if (result == null) result = caseDataDefinition(bitFieldDefinition);
				if (result == null) result = caseDefinition(bitFieldDefinition);
				if (result == null) result = caseDeclarationOrDefinition(bitFieldDefinition);
				if (result == null) result = caseDefinitionObject(bitFieldDefinition);
				if (result == null) result = caseGASTMSyntaxObject(bitFieldDefinition);
				if (result == null) result = caseGASTMObject(bitFieldDefinition);
				if (result == null) result = caseVisitable(bitFieldDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ENUM_LITERAL_DEFINITION: {
				EnumLiteralDefinition enumLiteralDefinition = (EnumLiteralDefinition)theEObject;
				T result = caseEnumLiteralDefinition(enumLiteralDefinition);
				if (result == null) result = caseDefinition(enumLiteralDefinition);
				if (result == null) result = caseDeclarationOrDefinition(enumLiteralDefinition);
				if (result == null) result = caseDefinitionObject(enumLiteralDefinition);
				if (result == null) result = caseGASTMSyntaxObject(enumLiteralDefinition);
				if (result == null) result = caseGASTMObject(enumLiteralDefinition);
				if (result == null) result = caseVisitable(enumLiteralDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseDefinitionObject(typeDefinition);
				if (result == null) result = caseGASTMSyntaxObject(typeDefinition);
				if (result == null) result = caseGASTMObject(typeDefinition);
				if (result == null) result = caseVisitable(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NAMED_TYPE_DEFINITION: {
				NamedTypeDefinition namedTypeDefinition = (NamedTypeDefinition)theEObject;
				T result = caseNamedTypeDefinition(namedTypeDefinition);
				if (result == null) result = caseTypeDefinition(namedTypeDefinition);
				if (result == null) result = caseDefinitionObject(namedTypeDefinition);
				if (result == null) result = caseGASTMSyntaxObject(namedTypeDefinition);
				if (result == null) result = caseGASTMObject(namedTypeDefinition);
				if (result == null) result = caseVisitable(namedTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.AGGREGATE_TYPE_DEFINITION: {
				AggregateTypeDefinition aggregateTypeDefinition = (AggregateTypeDefinition)theEObject;
				T result = caseAggregateTypeDefinition(aggregateTypeDefinition);
				if (result == null) result = caseTypeDefinition(aggregateTypeDefinition);
				if (result == null) result = caseDefinitionObject(aggregateTypeDefinition);
				if (result == null) result = caseGASTMSyntaxObject(aggregateTypeDefinition);
				if (result == null) result = caseGASTMObject(aggregateTypeDefinition);
				if (result == null) result = caseVisitable(aggregateTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NAME_SPACE_DEFINITION: {
				NameSpaceDefinition nameSpaceDefinition = (NameSpaceDefinition)theEObject;
				T result = caseNameSpaceDefinition(nameSpaceDefinition);
				if (result == null) result = caseDefinitionObject(nameSpaceDefinition);
				if (result == null) result = caseGASTMSyntaxObject(nameSpaceDefinition);
				if (result == null) result = caseGASTMObject(nameSpaceDefinition);
				if (result == null) result = caseVisitable(nameSpaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LABEL_DEFINITION: {
				LabelDefinition labelDefinition = (LabelDefinition)theEObject;
				T result = caseLabelDefinition(labelDefinition);
				if (result == null) result = caseDefinitionObject(labelDefinition);
				if (result == null) result = caseGASTMSyntaxObject(labelDefinition);
				if (result == null) result = caseGASTMObject(labelDefinition);
				if (result == null) result = caseVisitable(labelDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.INCLUDE_UNIT: {
				IncludeUnit includeUnit = (IncludeUnit)theEObject;
				T result = caseIncludeUnit(includeUnit);
				if (result == null) result = casePreprocessorElement(includeUnit);
				if (result == null) result = caseGASTMSyntaxObject(includeUnit);
				if (result == null) result = caseGASTMObject(includeUnit);
				if (result == null) result = caseVisitable(includeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.MACRO_CALL: {
				MacroCall macroCall = (MacroCall)theEObject;
				T result = caseMacroCall(macroCall);
				if (result == null) result = casePreprocessorElement(macroCall);
				if (result == null) result = caseGASTMSyntaxObject(macroCall);
				if (result == null) result = caseGASTMObject(macroCall);
				if (result == null) result = caseVisitable(macroCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.MACRO_DEFINITION: {
				MacroDefinition macroDefinition = (MacroDefinition)theEObject;
				T result = caseMacroDefinition(macroDefinition);
				if (result == null) result = casePreprocessorElement(macroDefinition);
				if (result == null) result = caseGASTMSyntaxObject(macroDefinition);
				if (result == null) result = caseGASTMObject(macroDefinition);
				if (result == null) result = caseVisitable(macroDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = casePreprocessorElement(comment);
				if (result == null) result = caseGASTMSyntaxObject(comment);
				if (result == null) result = caseGASTMObject(comment);
				if (result == null) result = caseVisitable(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseGASTMSyntaxObject(type);
				if (result == null) result = caseGASTMObject(type);
				if (result == null) result = caseVisitable(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDataType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseGASTMSyntaxObject(primitiveType);
				if (result == null) result = caseGASTMObject(primitiveType);
				if (result == null) result = caseVisitable(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				T result = caseEnumType(enumType);
				if (result == null) result = caseDataType(enumType);
				if (result == null) result = caseType(enumType);
				if (result == null) result = caseGASTMSyntaxObject(enumType);
				if (result == null) result = caseGASTMObject(enumType);
				if (result == null) result = caseVisitable(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CONSTRUCTED_TYPE: {
				ConstructedType constructedType = (ConstructedType)theEObject;
				T result = caseConstructedType(constructedType);
				if (result == null) result = caseDataType(constructedType);
				if (result == null) result = caseType(constructedType);
				if (result == null) result = caseGASTMSyntaxObject(constructedType);
				if (result == null) result = caseGASTMObject(constructedType);
				if (result == null) result = caseVisitable(constructedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.AGGREGATE_TYPE: {
				AggregateType aggregateType = (AggregateType)theEObject;
				T result = caseAggregateType(aggregateType);
				if (result == null) result = caseDataType(aggregateType);
				if (result == null) result = caseType(aggregateType);
				if (result == null) result = caseGASTMSyntaxObject(aggregateType);
				if (result == null) result = caseGASTMObject(aggregateType);
				if (result == null) result = caseVisitable(aggregateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseConstructedType(arrayType);
				if (result == null) result = caseDataType(arrayType);
				if (result == null) result = caseType(arrayType);
				if (result == null) result = caseGASTMSyntaxObject(arrayType);
				if (result == null) result = caseGASTMObject(arrayType);
				if (result == null) result = caseVisitable(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = caseOtherSyntaxObject(dimension);
				if (result == null) result = caseGASTMSyntaxObject(dimension);
				if (result == null) result = caseGASTMObject(dimension);
				if (result == null) result = caseVisitable(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseType(functionType);
				if (result == null) result = caseGASTMSyntaxObject(functionType);
				if (result == null) result = caseGASTMObject(functionType);
				if (result == null) result = caseVisitable(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FORMAL_PARAMETER_TYPE: {
				FormalParameterType formalParameterType = (FormalParameterType)theEObject;
				T result = caseFormalParameterType(formalParameterType);
				if (result == null) result = caseDataType(formalParameterType);
				if (result == null) result = caseType(formalParameterType);
				if (result == null) result = caseGASTMSyntaxObject(formalParameterType);
				if (result == null) result = caseGASTMObject(formalParameterType);
				if (result == null) result = caseVisitable(formalParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NAMED_TYPE: {
				NamedType namedType = (NamedType)theEObject;
				T result = caseNamedType(namedType);
				if (result == null) result = caseDataType(namedType);
				if (result == null) result = caseType(namedType);
				if (result == null) result = caseGASTMSyntaxObject(namedType);
				if (result == null) result = caseGASTMObject(namedType);
				if (result == null) result = caseVisitable(namedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CLASS_TYPE: {
				ClassType classType = (ClassType)theEObject;
				T result = caseClassType(classType);
				if (result == null) result = caseAggregateType(classType);
				if (result == null) result = caseDataType(classType);
				if (result == null) result = caseType(classType);
				if (result == null) result = caseGASTMSyntaxObject(classType);
				if (result == null) result = caseGASTMObject(classType);
				if (result == null) result = caseVisitable(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DERIVES_FROM: {
				DerivesFrom derivesFrom = (DerivesFrom)theEObject;
				T result = caseDerivesFrom(derivesFrom);
				if (result == null) result = caseOtherSyntaxObject(derivesFrom);
				if (result == null) result = caseGASTMSyntaxObject(derivesFrom);
				if (result == null) result = caseGASTMObject(derivesFrom);
				if (result == null) result = caseVisitable(derivesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.UNNAMED_TYPE_REFERENCE: {
				UnnamedTypeReference unnamedTypeReference = (UnnamedTypeReference)theEObject;
				T result = caseUnnamedTypeReference(unnamedTypeReference);
				if (result == null) result = caseTypeReference(unnamedTypeReference);
				if (result == null) result = caseType(unnamedTypeReference);
				if (result == null) result = caseGASTMSyntaxObject(unnamedTypeReference);
				if (result == null) result = caseGASTMObject(unnamedTypeReference);
				if (result == null) result = caseVisitable(unnamedTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NAMED_TYPE_REFERENCE: {
				NamedTypeReference namedTypeReference = (NamedTypeReference)theEObject;
				T result = caseNamedTypeReference(namedTypeReference);
				if (result == null) result = caseTypeReference(namedTypeReference);
				if (result == null) result = caseType(namedTypeReference);
				if (result == null) result = caseGASTMSyntaxObject(namedTypeReference);
				if (result == null) result = caseGASTMObject(namedTypeReference);
				if (result == null) result = caseVisitable(namedTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DELETE_STATEMENT: {
				DeleteStatement deleteStatement = (DeleteStatement)theEObject;
				T result = caseDeleteStatement(deleteStatement);
				if (result == null) result = caseStatement(deleteStatement);
				if (result == null) result = caseGASTMSyntaxObject(deleteStatement);
				if (result == null) result = caseGASTMObject(deleteStatement);
				if (result == null) result = caseVisitable(deleteStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DECLARATION_OR_DEFINITION_STATEMENT: {
				DeclarationOrDefinitionStatement declarationOrDefinitionStatement = (DeclarationOrDefinitionStatement)theEObject;
				T result = caseDeclarationOrDefinitionStatement(declarationOrDefinitionStatement);
				if (result == null) result = caseStatement(declarationOrDefinitionStatement);
				if (result == null) result = caseGASTMSyntaxObject(declarationOrDefinitionStatement);
				if (result == null) result = caseGASTMObject(declarationOrDefinitionStatement);
				if (result == null) result = caseVisitable(declarationOrDefinitionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseGASTMSyntaxObject(expressionStatement);
				if (result == null) result = caseGASTMObject(expressionStatement);
				if (result == null) result = caseVisitable(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.JUMP_STATEMENT: {
				JumpStatement jumpStatement = (JumpStatement)theEObject;
				T result = caseJumpStatement(jumpStatement);
				if (result == null) result = caseStatement(jumpStatement);
				if (result == null) result = caseGASTMSyntaxObject(jumpStatement);
				if (result == null) result = caseGASTMObject(jumpStatement);
				if (result == null) result = caseVisitable(jumpStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BREAK_STATEMENT: {
				BreakStatement breakStatement = (BreakStatement)theEObject;
				T result = caseBreakStatement(breakStatement);
				if (result == null) result = caseStatement(breakStatement);
				if (result == null) result = caseGASTMSyntaxObject(breakStatement);
				if (result == null) result = caseGASTMObject(breakStatement);
				if (result == null) result = caseVisitable(breakStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CONTINUE_STATEMENT: {
				ContinueStatement continueStatement = (ContinueStatement)theEObject;
				T result = caseContinueStatement(continueStatement);
				if (result == null) result = caseStatement(continueStatement);
				if (result == null) result = caseGASTMSyntaxObject(continueStatement);
				if (result == null) result = caseGASTMObject(continueStatement);
				if (result == null) result = caseVisitable(continueStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LABELED_STATEMENT: {
				LabeledStatement labeledStatement = (LabeledStatement)theEObject;
				T result = caseLabeledStatement(labeledStatement);
				if (result == null) result = caseStatement(labeledStatement);
				if (result == null) result = caseGASTMSyntaxObject(labeledStatement);
				if (result == null) result = caseGASTMObject(labeledStatement);
				if (result == null) result = caseVisitable(labeledStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BLOCK_STATEMENT: {
				BlockStatement blockStatement = (BlockStatement)theEObject;
				T result = caseBlockStatement(blockStatement);
				if (result == null) result = caseStatement(blockStatement);
				if (result == null) result = caseGASTMSyntaxObject(blockStatement);
				if (result == null) result = caseGASTMObject(blockStatement);
				if (result == null) result = caseVisitable(blockStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.EMPTY_STATEMENT: {
				EmptyStatement emptyStatement = (EmptyStatement)theEObject;
				T result = caseEmptyStatement(emptyStatement);
				if (result == null) result = caseStatement(emptyStatement);
				if (result == null) result = caseGASTMSyntaxObject(emptyStatement);
				if (result == null) result = caseGASTMObject(emptyStatement);
				if (result == null) result = caseVisitable(emptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = caseGASTMSyntaxObject(ifStatement);
				if (result == null) result = caseGASTMObject(ifStatement);
				if (result == null) result = caseVisitable(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SWITCH_STATEMENT: {
				SwitchStatement switchStatement = (SwitchStatement)theEObject;
				T result = caseSwitchStatement(switchStatement);
				if (result == null) result = caseStatement(switchStatement);
				if (result == null) result = caseGASTMSyntaxObject(switchStatement);
				if (result == null) result = caseGASTMObject(switchStatement);
				if (result == null) result = caseVisitable(switchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SWITCH_CASE: {
				SwitchCase switchCase = (SwitchCase)theEObject;
				T result = caseSwitchCase(switchCase);
				if (result == null) result = caseOtherSyntaxObject(switchCase);
				if (result == null) result = caseGASTMSyntaxObject(switchCase);
				if (result == null) result = caseGASTMObject(switchCase);
				if (result == null) result = caseVisitable(switchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CASE_BLOCK: {
				CaseBlock caseBlock = (CaseBlock)theEObject;
				T result = caseCaseBlock(caseBlock);
				if (result == null) result = caseSwitchCase(caseBlock);
				if (result == null) result = caseOtherSyntaxObject(caseBlock);
				if (result == null) result = caseGASTMSyntaxObject(caseBlock);
				if (result == null) result = caseGASTMObject(caseBlock);
				if (result == null) result = caseVisitable(caseBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T result = caseReturnStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = caseGASTMSyntaxObject(returnStatement);
				if (result == null) result = caseGASTMObject(returnStatement);
				if (result == null) result = caseVisitable(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LOOP_STATEMENT: {
				LoopStatement loopStatement = (LoopStatement)theEObject;
				T result = caseLoopStatement(loopStatement);
				if (result == null) result = caseStatement(loopStatement);
				if (result == null) result = caseGASTMSyntaxObject(loopStatement);
				if (result == null) result = caseGASTMObject(loopStatement);
				if (result == null) result = caseVisitable(loopStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FOR_STATEMENT: {
				ForStatement forStatement = (ForStatement)theEObject;
				T result = caseForStatement(forStatement);
				if (result == null) result = caseLoopStatement(forStatement);
				if (result == null) result = caseStatement(forStatement);
				if (result == null) result = caseGASTMSyntaxObject(forStatement);
				if (result == null) result = caseGASTMObject(forStatement);
				if (result == null) result = caseVisitable(forStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.TRY_STATEMENT: {
				TryStatement tryStatement = (TryStatement)theEObject;
				T result = caseTryStatement(tryStatement);
				if (result == null) result = caseStatement(tryStatement);
				if (result == null) result = caseGASTMSyntaxObject(tryStatement);
				if (result == null) result = caseGASTMObject(tryStatement);
				if (result == null) result = caseVisitable(tryStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CATCH_BLOCK: {
				CatchBlock catchBlock = (CatchBlock)theEObject;
				T result = caseCatchBlock(catchBlock);
				if (result == null) result = caseOtherSyntaxObject(catchBlock);
				if (result == null) result = caseGASTMSyntaxObject(catchBlock);
				if (result == null) result = caseGASTMObject(catchBlock);
				if (result == null) result = caseVisitable(catchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.TYPES_CATCH_BLOCK: {
				TypesCatchBlock typesCatchBlock = (TypesCatchBlock)theEObject;
				T result = caseTypesCatchBlock(typesCatchBlock);
				if (result == null) result = caseCatchBlock(typesCatchBlock);
				if (result == null) result = caseOtherSyntaxObject(typesCatchBlock);
				if (result == null) result = caseGASTMSyntaxObject(typesCatchBlock);
				if (result == null) result = caseGASTMObject(typesCatchBlock);
				if (result == null) result = caseVisitable(typesCatchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.VARIABLE_CATCH_BLOCK: {
				VariableCatchBlock variableCatchBlock = (VariableCatchBlock)theEObject;
				T result = caseVariableCatchBlock(variableCatchBlock);
				if (result == null) result = caseCatchBlock(variableCatchBlock);
				if (result == null) result = caseOtherSyntaxObject(variableCatchBlock);
				if (result == null) result = caseGASTMSyntaxObject(variableCatchBlock);
				if (result == null) result = caseGASTMObject(variableCatchBlock);
				if (result == null) result = caseVisitable(variableCatchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.THROW_STATEMENT: {
				ThrowStatement throwStatement = (ThrowStatement)theEObject;
				T result = caseThrowStatement(throwStatement);
				if (result == null) result = caseStatement(throwStatement);
				if (result == null) result = caseGASTMSyntaxObject(throwStatement);
				if (result == null) result = caseGASTMObject(throwStatement);
				if (result == null) result = caseVisitable(throwStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseGASTMSyntaxObject(expression);
				if (result == null) result = caseGASTMObject(expression);
				if (result == null) result = caseVisitable(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NAME_REFERENCE: {
				NameReference nameReference = (NameReference)theEObject;
				T result = caseNameReference(nameReference);
				if (result == null) result = caseExpression(nameReference);
				if (result == null) result = caseGASTMSyntaxObject(nameReference);
				if (result == null) result = caseGASTMObject(nameReference);
				if (result == null) result = caseVisitable(nameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ARRAY_ACCESS: {
				ArrayAccess arrayAccess = (ArrayAccess)theEObject;
				T result = caseArrayAccess(arrayAccess);
				if (result == null) result = caseExpression(arrayAccess);
				if (result == null) result = caseGASTMSyntaxObject(arrayAccess);
				if (result == null) result = caseGASTMObject(arrayAccess);
				if (result == null) result = caseVisitable(arrayAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.QUALIFIED_IDENTIFIER_REFERENCE: {
				QualifiedIdentifierReference qualifiedIdentifierReference = (QualifiedIdentifierReference)theEObject;
				T result = caseQualifiedIdentifierReference(qualifiedIdentifierReference);
				if (result == null) result = caseNameReference(qualifiedIdentifierReference);
				if (result == null) result = caseExpression(qualifiedIdentifierReference);
				if (result == null) result = caseGASTMSyntaxObject(qualifiedIdentifierReference);
				if (result == null) result = caseGASTMObject(qualifiedIdentifierReference);
				if (result == null) result = caseVisitable(qualifiedIdentifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.TYPE_QUALIFIED_IDENTIFIER_REFERENCE: {
				TypeQualifiedIdentifierReference typeQualifiedIdentifierReference = (TypeQualifiedIdentifierReference)theEObject;
				T result = caseTypeQualifiedIdentifierReference(typeQualifiedIdentifierReference);
				if (result == null) result = caseNameReference(typeQualifiedIdentifierReference);
				if (result == null) result = caseExpression(typeQualifiedIdentifierReference);
				if (result == null) result = caseGASTMSyntaxObject(typeQualifiedIdentifierReference);
				if (result == null) result = caseGASTMObject(typeQualifiedIdentifierReference);
				if (result == null) result = caseVisitable(typeQualifiedIdentifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseGASTMSyntaxObject(literal);
				if (result == null) result = caseGASTMObject(literal);
				if (result == null) result = caseVisitable(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CAST_EXPRESSION: {
				CastExpression castExpression = (CastExpression)theEObject;
				T result = caseCastExpression(castExpression);
				if (result == null) result = caseExpression(castExpression);
				if (result == null) result = caseGASTMSyntaxObject(castExpression);
				if (result == null) result = caseGASTMObject(castExpression);
				if (result == null) result = caseVisitable(castExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseGASTMSyntaxObject(unaryExpression);
				if (result == null) result = caseGASTMObject(unaryExpression);
				if (result == null) result = caseVisitable(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseGASTMSyntaxObject(binaryExpression);
				if (result == null) result = caseGASTMObject(binaryExpression);
				if (result == null) result = caseVisitable(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.OPERATOR_ASSIGN: {
				OperatorAssign operatorAssign = (OperatorAssign)theEObject;
				T result = caseOperatorAssign(operatorAssign);
				if (result == null) result = caseBinaryOperator(operatorAssign);
				if (result == null) result = caseVisitable(operatorAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseExpression(conditionalExpression);
				if (result == null) result = caseGASTMSyntaxObject(conditionalExpression);
				if (result == null) result = caseGASTMObject(conditionalExpression);
				if (result == null) result = caseVisitable(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.RANGE_EXPRESSION: {
				RangeExpression rangeExpression = (RangeExpression)theEObject;
				T result = caseRangeExpression(rangeExpression);
				if (result == null) result = caseExpression(rangeExpression);
				if (result == null) result = caseGASTMSyntaxObject(rangeExpression);
				if (result == null) result = caseGASTMObject(rangeExpression);
				if (result == null) result = caseVisitable(rangeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_CALL_EXPRESSION: {
				FunctionCallExpression functionCallExpression = (FunctionCallExpression)theEObject;
				T result = caseFunctionCallExpression(functionCallExpression);
				if (result == null) result = caseExpression(functionCallExpression);
				if (result == null) result = caseGASTMSyntaxObject(functionCallExpression);
				if (result == null) result = caseGASTMObject(functionCallExpression);
				if (result == null) result = caseVisitable(functionCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ACTUAL_PARAMETER_EXPRESSION: {
				ActualParameterExpression actualParameterExpression = (ActualParameterExpression)theEObject;
				T result = caseActualParameterExpression(actualParameterExpression);
				if (result == null) result = caseActualParameter(actualParameterExpression);
				if (result == null) result = caseVisitable(actualParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NEW_EXPRESSION: {
				NewExpression newExpression = (NewExpression)theEObject;
				T result = caseNewExpression(newExpression);
				if (result == null) result = caseExpression(newExpression);
				if (result == null) result = caseGASTMSyntaxObject(newExpression);
				if (result == null) result = caseGASTMObject(newExpression);
				if (result == null) result = caseVisitable(newExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LABEL_ACCESS: {
				LabelAccess labelAccess = (LabelAccess)theEObject;
				T result = caseLabelAccess(labelAccess);
				if (result == null) result = caseExpression(labelAccess);
				if (result == null) result = caseGASTMSyntaxObject(labelAccess);
				if (result == null) result = caseGASTMObject(labelAccess);
				if (result == null) result = caseVisitable(labelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ANNOTATION_EXPRESSION: {
				AnnotationExpression annotationExpression = (AnnotationExpression)theEObject;
				T result = caseAnnotationExpression(annotationExpression);
				if (result == null) result = caseExpression(annotationExpression);
				if (result == null) result = caseGASTMSyntaxObject(annotationExpression);
				if (result == null) result = caseGASTMObject(annotationExpression);
				if (result == null) result = caseVisitable(annotationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.GLOBAL_SCOPE: {
				GlobalScope globalScope = (GlobalScope)theEObject;
				T result = caseGlobalScope(globalScope);
				if (result == null) result = caseScope(globalScope);
				if (result == null) result = caseGASTMSemanticObject(globalScope);
				if (result == null) result = caseVisitable(globalScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PREPROCESSOR_ELEMENT: {
				PreprocessorElement preprocessorElement = (PreprocessorElement)theEObject;
				T result = casePreprocessorElement(preprocessorElement);
				if (result == null) result = caseGASTMSyntaxObject(preprocessorElement);
				if (result == null) result = caseGASTMObject(preprocessorElement);
				if (result == null) result = caseVisitable(preprocessorElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DEFINITION_OBJECT: {
				DefinitionObject definitionObject = (DefinitionObject)theEObject;
				T result = caseDefinitionObject(definitionObject);
				if (result == null) result = caseGASTMSyntaxObject(definitionObject);
				if (result == null) result = caseGASTMObject(definitionObject);
				if (result == null) result = caseVisitable(definitionObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PROGRAM_SCOPE: {
				ProgramScope programScope = (ProgramScope)theEObject;
				T result = caseProgramScope(programScope);
				if (result == null) result = caseScope(programScope);
				if (result == null) result = caseGASTMSemanticObject(programScope);
				if (result == null) result = caseVisitable(programScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseType(typeReference);
				if (result == null) result = caseGASTMSyntaxObject(typeReference);
				if (result == null) result = caseGASTMObject(typeReference);
				if (result == null) result = caseVisitable(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseGASTMSyntaxObject(statement);
				if (result == null) result = caseGASTMObject(statement);
				if (result == null) result = caseVisitable(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_SCOPE: {
				FunctionScope functionScope = (FunctionScope)theEObject;
				T result = caseFunctionScope(functionScope);
				if (result == null) result = caseScope(functionScope);
				if (result == null) result = caseGASTMSemanticObject(functionScope);
				if (result == null) result = caseVisitable(functionScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NAME_SPACE_TYPE: {
				NameSpaceType nameSpaceType = (NameSpaceType)theEObject;
				T result = caseNameSpaceType(nameSpaceType);
				if (result == null) result = caseType(nameSpaceType);
				if (result == null) result = caseGASTMSyntaxObject(nameSpaceType);
				if (result == null) result = caseGASTMObject(nameSpaceType);
				if (result == null) result = caseVisitable(nameSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = caseType(labelType);
				if (result == null) result = caseGASTMSyntaxObject(labelType);
				if (result == null) result = caseGASTMObject(labelType);
				if (result == null) result = caseVisitable(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.AGGREGATE_SCOPE: {
				AggregateScope aggregateScope = (AggregateScope)theEObject;
				T result = caseAggregateScope(aggregateScope);
				if (result == null) result = caseScope(aggregateScope);
				if (result == null) result = caseGASTMSemanticObject(aggregateScope);
				if (result == null) result = caseVisitable(aggregateScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BLOCK_SCOPE: {
				BlockScope blockScope = (BlockScope)theEObject;
				T result = caseBlockScope(blockScope);
				if (result == null) result = caseScope(blockScope);
				if (result == null) result = caseGASTMSemanticObject(blockScope);
				if (result == null) result = caseVisitable(blockScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.IDENTIFIER_REFERENCE: {
				IdentifierReference identifierReference = (IdentifierReference)theEObject;
				T result = caseIdentifierReference(identifierReference);
				if (result == null) result = caseNameReference(identifierReference);
				if (result == null) result = caseExpression(identifierReference);
				if (result == null) result = caseGASTMSyntaxObject(identifierReference);
				if (result == null) result = caseGASTMObject(identifierReference);
				if (result == null) result = caseVisitable(identifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FORMAL_PARAMETER_DEFINITION: {
				FormalParameterDefinition formalParameterDefinition = (FormalParameterDefinition)theEObject;
				T result = caseFormalParameterDefinition(formalParameterDefinition);
				if (result == null) result = caseDataDefinition(formalParameterDefinition);
				if (result == null) result = caseDefinition(formalParameterDefinition);
				if (result == null) result = caseDeclarationOrDefinition(formalParameterDefinition);
				if (result == null) result = caseDefinitionObject(formalParameterDefinition);
				if (result == null) result = caseGASTMSyntaxObject(formalParameterDefinition);
				if (result == null) result = caseGASTMObject(formalParameterDefinition);
				if (result == null) result = caseVisitable(formalParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.VIRTUAL_SPECIFICATION: {
				VirtualSpecification virtualSpecification = (VirtualSpecification)theEObject;
				T result = caseVirtualSpecification(virtualSpecification);
				if (result == null) result = caseOtherSyntaxObject(virtualSpecification);
				if (result == null) result = caseGASTMSyntaxObject(virtualSpecification);
				if (result == null) result = caseGASTMObject(virtualSpecification);
				if (result == null) result = caseVisitable(virtualSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FORMAL_PARAMETER_DECLARATION: {
				FormalParameterDeclaration formalParameterDeclaration = (FormalParameterDeclaration)theEObject;
				T result = caseFormalParameterDeclaration(formalParameterDeclaration);
				if (result == null) result = caseDeclaration(formalParameterDeclaration);
				if (result == null) result = caseDeclarationOrDefinition(formalParameterDeclaration);
				if (result == null) result = caseDefinitionObject(formalParameterDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(formalParameterDeclaration);
				if (result == null) result = caseGASTMObject(formalParameterDeclaration);
				if (result == null) result = caseVisitable(formalParameterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.VARIABLE_DEFINITION: {
				VariableDefinition variableDefinition = (VariableDefinition)theEObject;
				T result = caseVariableDefinition(variableDefinition);
				if (result == null) result = caseDataDefinition(variableDefinition);
				if (result == null) result = caseDefinition(variableDefinition);
				if (result == null) result = caseDeclarationOrDefinition(variableDefinition);
				if (result == null) result = caseDefinitionObject(variableDefinition);
				if (result == null) result = caseGASTMSyntaxObject(variableDefinition);
				if (result == null) result = caseGASTMObject(variableDefinition);
				if (result == null) result = caseVisitable(variableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_MEMBER_ATTRIBUTE: {
				FunctionMemberAttribute functionMemberAttribute = (FunctionMemberAttribute)theEObject;
				T result = caseFunctionMemberAttribute(functionMemberAttribute);
				if (result == null) result = caseOtherSyntaxObject(functionMemberAttribute);
				if (result == null) result = caseGASTMSyntaxObject(functionMemberAttribute);
				if (result == null) result = caseGASTMObject(functionMemberAttribute);
				if (result == null) result = caseVisitable(functionMemberAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.EXTERNAL: {
				External external = (External)theEObject;
				T result = caseExternal(external);
				if (result == null) result = caseStorageSpecification(external);
				if (result == null) result = caseVisitable(external);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FUNCTION_PERSISTENT: {
				FunctionPersistent functionPersistent = (FunctionPersistent)theEObject;
				T result = caseFunctionPersistent(functionPersistent);
				if (result == null) result = caseStorageSpecification(functionPersistent);
				if (result == null) result = caseVisitable(functionPersistent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FILE_LOCAL: {
				FileLocal fileLocal = (FileLocal)theEObject;
				T result = caseFileLocal(fileLocal);
				if (result == null) result = caseStorageSpecification(fileLocal);
				if (result == null) result = caseVisitable(fileLocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PER_CLASS_MEMBER: {
				PerClassMember perClassMember = (PerClassMember)theEObject;
				T result = casePerClassMember(perClassMember);
				if (result == null) result = caseStorageSpecification(perClassMember);
				if (result == null) result = caseVisitable(perClassMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NO_DEF: {
				NoDef noDef = (NoDef)theEObject;
				T result = caseNoDef(noDef);
				if (result == null) result = caseStorageSpecification(noDef);
				if (result == null) result = caseVisitable(noDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.VIRTUAL: {
				Virtual virtual = (Virtual)theEObject;
				T result = caseVirtual(virtual);
				if (result == null) result = caseVirtualSpecification(virtual);
				if (result == null) result = caseOtherSyntaxObject(virtual);
				if (result == null) result = caseGASTMSyntaxObject(virtual);
				if (result == null) result = caseGASTMObject(virtual);
				if (result == null) result = caseVisitable(virtual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PURE_VIRTUAL: {
				PureVirtual pureVirtual = (PureVirtual)theEObject;
				T result = casePureVirtual(pureVirtual);
				if (result == null) result = caseVirtualSpecification(pureVirtual);
				if (result == null) result = caseOtherSyntaxObject(pureVirtual);
				if (result == null) result = caseGASTMSyntaxObject(pureVirtual);
				if (result == null) result = caseGASTMObject(pureVirtual);
				if (result == null) result = caseVisitable(pureVirtual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NON_VIRTUAL: {
				NonVirtual nonVirtual = (NonVirtual)theEObject;
				T result = caseNonVirtual(nonVirtual);
				if (result == null) result = caseVirtualSpecification(nonVirtual);
				if (result == null) result = caseOtherSyntaxObject(nonVirtual);
				if (result == null) result = caseGASTMSyntaxObject(nonVirtual);
				if (result == null) result = caseGASTMObject(nonVirtual);
				if (result == null) result = caseVisitable(nonVirtual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = caseDataType(exceptionType);
				if (result == null) result = caseType(exceptionType);
				if (result == null) result = caseGASTMSyntaxObject(exceptionType);
				if (result == null) result = caseGASTMObject(exceptionType);
				if (result == null) result = caseVisitable(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.VOID: {
				org.xtext.example.delphi.astm.Void void_ = (org.xtext.example.delphi.astm.Void)theEObject;
				T result = caseVoid(void_);
				if (result == null) result = casePrimitiveType(void_);
				if (result == null) result = caseDataType(void_);
				if (result == null) result = caseType(void_);
				if (result == null) result = caseGASTMSyntaxObject(void_);
				if (result == null) result = caseGASTMObject(void_);
				if (result == null) result = caseVisitable(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BYTE: {
				org.xtext.example.delphi.astm.Byte byte_ = (org.xtext.example.delphi.astm.Byte)theEObject;
				T result = caseByte(byte_);
				if (result == null) result = casePrimitiveType(byte_);
				if (result == null) result = caseDataType(byte_);
				if (result == null) result = caseType(byte_);
				if (result == null) result = caseGASTMSyntaxObject(byte_);
				if (result == null) result = caseGASTMObject(byte_);
				if (result == null) result = caseVisitable(byte_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SHORT_INTEGER: {
				ShortInteger shortInteger = (ShortInteger)theEObject;
				T result = caseShortInteger(shortInteger);
				if (result == null) result = casePrimitiveType(shortInteger);
				if (result == null) result = caseDataType(shortInteger);
				if (result == null) result = caseType(shortInteger);
				if (result == null) result = caseGASTMSyntaxObject(shortInteger);
				if (result == null) result = caseGASTMObject(shortInteger);
				if (result == null) result = caseVisitable(shortInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.INTEGER: {
				org.xtext.example.delphi.astm.Integer integer = (org.xtext.example.delphi.astm.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = casePrimitiveType(integer);
				if (result == null) result = caseDataType(integer);
				if (result == null) result = caseType(integer);
				if (result == null) result = caseGASTMSyntaxObject(integer);
				if (result == null) result = caseGASTMObject(integer);
				if (result == null) result = caseVisitable(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LONG_INTEGER: {
				LongInteger longInteger = (LongInteger)theEObject;
				T result = caseLongInteger(longInteger);
				if (result == null) result = casePrimitiveType(longInteger);
				if (result == null) result = caseDataType(longInteger);
				if (result == null) result = caseType(longInteger);
				if (result == null) result = caseGASTMSyntaxObject(longInteger);
				if (result == null) result = caseGASTMObject(longInteger);
				if (result == null) result = caseVisitable(longInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FLOAT: {
				org.xtext.example.delphi.astm.Float float_ = (org.xtext.example.delphi.astm.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = casePrimitiveType(float_);
				if (result == null) result = caseDataType(float_);
				if (result == null) result = caseType(float_);
				if (result == null) result = caseGASTMSyntaxObject(float_);
				if (result == null) result = caseGASTMObject(float_);
				if (result == null) result = caseVisitable(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DOUBLE: {
				org.xtext.example.delphi.astm.Double double_ = (org.xtext.example.delphi.astm.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = casePrimitiveType(double_);
				if (result == null) result = caseDataType(double_);
				if (result == null) result = caseType(double_);
				if (result == null) result = caseGASTMSyntaxObject(double_);
				if (result == null) result = caseGASTMObject(double_);
				if (result == null) result = caseVisitable(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LONG_DOUBLE: {
				LongDouble longDouble = (LongDouble)theEObject;
				T result = caseLongDouble(longDouble);
				if (result == null) result = casePrimitiveType(longDouble);
				if (result == null) result = caseDataType(longDouble);
				if (result == null) result = caseType(longDouble);
				if (result == null) result = caseGASTMSyntaxObject(longDouble);
				if (result == null) result = caseGASTMObject(longDouble);
				if (result == null) result = caseVisitable(longDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CHARACTER: {
				org.xtext.example.delphi.astm.Character character = (org.xtext.example.delphi.astm.Character)theEObject;
				T result = caseCharacter(character);
				if (result == null) result = casePrimitiveType(character);
				if (result == null) result = caseDataType(character);
				if (result == null) result = caseType(character);
				if (result == null) result = caseGASTMSyntaxObject(character);
				if (result == null) result = caseGASTMObject(character);
				if (result == null) result = caseVisitable(character);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.STRING: {
				org.xtext.example.delphi.astm.String string = (org.xtext.example.delphi.astm.String)theEObject;
				T result = caseString(string);
				if (result == null) result = casePrimitiveType(string);
				if (result == null) result = caseDataType(string);
				if (result == null) result = caseType(string);
				if (result == null) result = caseGASTMSyntaxObject(string);
				if (result == null) result = caseGASTMObject(string);
				if (result == null) result = caseVisitable(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BOOLEAN: {
				org.xtext.example.delphi.astm.Boolean boolean_ = (org.xtext.example.delphi.astm.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = casePrimitiveType(boolean_);
				if (result == null) result = caseDataType(boolean_);
				if (result == null) result = caseType(boolean_);
				if (result == null) result = caseGASTMSyntaxObject(boolean_);
				if (result == null) result = caseGASTMObject(boolean_);
				if (result == null) result = caseVisitable(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.WIDE_CHARACTER: {
				WideCharacter wideCharacter = (WideCharacter)theEObject;
				T result = caseWideCharacter(wideCharacter);
				if (result == null) result = casePrimitiveType(wideCharacter);
				if (result == null) result = caseDataType(wideCharacter);
				if (result == null) result = caseType(wideCharacter);
				if (result == null) result = caseGASTMSyntaxObject(wideCharacter);
				if (result == null) result = caseGASTMObject(wideCharacter);
				if (result == null) result = caseVisitable(wideCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = caseConstructedType(collectionType);
				if (result == null) result = caseDataType(collectionType);
				if (result == null) result = caseType(collectionType);
				if (result == null) result = caseGASTMSyntaxObject(collectionType);
				if (result == null) result = caseGASTMObject(collectionType);
				if (result == null) result = caseVisitable(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.POINTER_TYPE: {
				PointerType pointerType = (PointerType)theEObject;
				T result = casePointerType(pointerType);
				if (result == null) result = caseConstructedType(pointerType);
				if (result == null) result = caseDataType(pointerType);
				if (result == null) result = caseType(pointerType);
				if (result == null) result = caseGASTMSyntaxObject(pointerType);
				if (result == null) result = caseGASTMObject(pointerType);
				if (result == null) result = caseVisitable(pointerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = caseConstructedType(referenceType);
				if (result == null) result = caseDataType(referenceType);
				if (result == null) result = caseType(referenceType);
				if (result == null) result = caseGASTMSyntaxObject(referenceType);
				if (result == null) result = caseGASTMObject(referenceType);
				if (result == null) result = caseVisitable(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = caseConstructedType(rangeType);
				if (result == null) result = caseDataType(rangeType);
				if (result == null) result = caseType(rangeType);
				if (result == null) result = caseGASTMSyntaxObject(rangeType);
				if (result == null) result = caseGASTMObject(rangeType);
				if (result == null) result = caseVisitable(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.STRUCTURE_TYPE: {
				StructureType structureType = (StructureType)theEObject;
				T result = caseStructureType(structureType);
				if (result == null) result = caseAggregateType(structureType);
				if (result == null) result = caseDataType(structureType);
				if (result == null) result = caseType(structureType);
				if (result == null) result = caseGASTMSyntaxObject(structureType);
				if (result == null) result = caseGASTMObject(structureType);
				if (result == null) result = caseVisitable(structureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.UNION_TYPE: {
				UnionType unionType = (UnionType)theEObject;
				T result = caseUnionType(unionType);
				if (result == null) result = caseAggregateType(unionType);
				if (result == null) result = caseDataType(unionType);
				if (result == null) result = caseType(unionType);
				if (result == null) result = caseGASTMSyntaxObject(unionType);
				if (result == null) result = caseGASTMObject(unionType);
				if (result == null) result = caseVisitable(unionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = caseAggregateType(annotationType);
				if (result == null) result = caseDataType(annotationType);
				if (result == null) result = caseType(annotationType);
				if (result == null) result = caseGASTMSyntaxObject(annotationType);
				if (result == null) result = caseGASTMObject(annotationType);
				if (result == null) result = caseVisitable(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BY_VALUE_FORMAL_PARAMETER_TYPE: {
				ByValueFormalParameterType byValueFormalParameterType = (ByValueFormalParameterType)theEObject;
				T result = caseByValueFormalParameterType(byValueFormalParameterType);
				if (result == null) result = caseFormalParameterType(byValueFormalParameterType);
				if (result == null) result = caseDataType(byValueFormalParameterType);
				if (result == null) result = caseType(byValueFormalParameterType);
				if (result == null) result = caseGASTMSyntaxObject(byValueFormalParameterType);
				if (result == null) result = caseGASTMObject(byValueFormalParameterType);
				if (result == null) result = caseVisitable(byValueFormalParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BY_REFERENCE_FORMAL_PARAMETER_TYPE: {
				ByReferenceFormalParameterType byReferenceFormalParameterType = (ByReferenceFormalParameterType)theEObject;
				T result = caseByReferenceFormalParameterType(byReferenceFormalParameterType);
				if (result == null) result = caseFormalParameterType(byReferenceFormalParameterType);
				if (result == null) result = caseDataType(byReferenceFormalParameterType);
				if (result == null) result = caseType(byReferenceFormalParameterType);
				if (result == null) result = caseGASTMSyntaxObject(byReferenceFormalParameterType);
				if (result == null) result = caseGASTMObject(byReferenceFormalParameterType);
				if (result == null) result = caseVisitable(byReferenceFormalParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PUBLIC: {
				Public public_ = (Public)theEObject;
				T result = casePublic(public_);
				if (result == null) result = caseAccessKind(public_);
				if (result == null) result = caseVisitable(public_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PROTECTED: {
				Protected protected_ = (Protected)theEObject;
				T result = caseProtected(protected_);
				if (result == null) result = caseAccessKind(protected_);
				if (result == null) result = caseVisitable(protected_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.PRIVATE: {
				Private private_ = (Private)theEObject;
				T result = casePrivate(private_);
				if (result == null) result = caseAccessKind(private_);
				if (result == null) result = caseVisitable(private_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.TERMINATE_STATEMENT: {
				TerminateStatement terminateStatement = (TerminateStatement)theEObject;
				T result = caseTerminateStatement(terminateStatement);
				if (result == null) result = caseStatement(terminateStatement);
				if (result == null) result = caseGASTMSyntaxObject(terminateStatement);
				if (result == null) result = caseGASTMObject(terminateStatement);
				if (result == null) result = caseVisitable(terminateStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DEFAULT_BLOCK: {
				DefaultBlock defaultBlock = (DefaultBlock)theEObject;
				T result = caseDefaultBlock(defaultBlock);
				if (result == null) result = caseSwitchCase(defaultBlock);
				if (result == null) result = caseOtherSyntaxObject(defaultBlock);
				if (result == null) result = caseGASTMSyntaxObject(defaultBlock);
				if (result == null) result = caseGASTMObject(defaultBlock);
				if (result == null) result = caseVisitable(defaultBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T result = caseWhileStatement(whileStatement);
				if (result == null) result = caseLoopStatement(whileStatement);
				if (result == null) result = caseStatement(whileStatement);
				if (result == null) result = caseGASTMSyntaxObject(whileStatement);
				if (result == null) result = caseGASTMObject(whileStatement);
				if (result == null) result = caseVisitable(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DO_WHILE_STATEMENT: {
				DoWhileStatement doWhileStatement = (DoWhileStatement)theEObject;
				T result = caseDoWhileStatement(doWhileStatement);
				if (result == null) result = caseLoopStatement(doWhileStatement);
				if (result == null) result = caseStatement(doWhileStatement);
				if (result == null) result = caseGASTMSyntaxObject(doWhileStatement);
				if (result == null) result = caseGASTMObject(doWhileStatement);
				if (result == null) result = caseVisitable(doWhileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FOR_CHECK_BEFORE_STATEMENT: {
				ForCheckBeforeStatement forCheckBeforeStatement = (ForCheckBeforeStatement)theEObject;
				T result = caseForCheckBeforeStatement(forCheckBeforeStatement);
				if (result == null) result = caseForStatement(forCheckBeforeStatement);
				if (result == null) result = caseLoopStatement(forCheckBeforeStatement);
				if (result == null) result = caseStatement(forCheckBeforeStatement);
				if (result == null) result = caseGASTMSyntaxObject(forCheckBeforeStatement);
				if (result == null) result = caseGASTMObject(forCheckBeforeStatement);
				if (result == null) result = caseVisitable(forCheckBeforeStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.FOR_CHECK_AFTER_STATEMENT: {
				ForCheckAfterStatement forCheckAfterStatement = (ForCheckAfterStatement)theEObject;
				T result = caseForCheckAfterStatement(forCheckAfterStatement);
				if (result == null) result = caseForStatement(forCheckAfterStatement);
				if (result == null) result = caseLoopStatement(forCheckAfterStatement);
				if (result == null) result = caseStatement(forCheckAfterStatement);
				if (result == null) result = caseGASTMSyntaxObject(forCheckAfterStatement);
				if (result == null) result = caseGASTMObject(forCheckAfterStatement);
				if (result == null) result = caseVisitable(forCheckAfterStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.AGGREGATE_EXPRESSION: {
				AggregateExpression aggregateExpression = (AggregateExpression)theEObject;
				T result = caseAggregateExpression(aggregateExpression);
				if (result == null) result = caseExpression(aggregateExpression);
				if (result == null) result = caseGASTMSyntaxObject(aggregateExpression);
				if (result == null) result = caseGASTMObject(aggregateExpression);
				if (result == null) result = caseVisitable(aggregateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.QUALIFIED_OVER_POINTER: {
				QualifiedOverPointer qualifiedOverPointer = (QualifiedOverPointer)theEObject;
				T result = caseQualifiedOverPointer(qualifiedOverPointer);
				if (result == null) result = caseQualifiedIdentifierReference(qualifiedOverPointer);
				if (result == null) result = caseNameReference(qualifiedOverPointer);
				if (result == null) result = caseExpression(qualifiedOverPointer);
				if (result == null) result = caseGASTMSyntaxObject(qualifiedOverPointer);
				if (result == null) result = caseGASTMObject(qualifiedOverPointer);
				if (result == null) result = caseVisitable(qualifiedOverPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.QUALIFIED_OVER_DATA: {
				QualifiedOverData qualifiedOverData = (QualifiedOverData)theEObject;
				T result = caseQualifiedOverData(qualifiedOverData);
				if (result == null) result = caseQualifiedIdentifierReference(qualifiedOverData);
				if (result == null) result = caseNameReference(qualifiedOverData);
				if (result == null) result = caseExpression(qualifiedOverData);
				if (result == null) result = caseGASTMSyntaxObject(qualifiedOverData);
				if (result == null) result = caseGASTMObject(qualifiedOverData);
				if (result == null) result = caseVisitable(qualifiedOverData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseExpression(integerLiteral);
				if (result == null) result = caseGASTMSyntaxObject(integerLiteral);
				if (result == null) result = caseGASTMObject(integerLiteral);
				if (result == null) result = caseVisitable(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseGASTMSyntaxObject(stringLiteral);
				if (result == null) result = caseGASTMObject(stringLiteral);
				if (result == null) result = caseVisitable(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.CHAR_LITERAL: {
				CharLiteral charLiteral = (CharLiteral)theEObject;
				T result = caseCharLiteral(charLiteral);
				if (result == null) result = caseLiteral(charLiteral);
				if (result == null) result = caseExpression(charLiteral);
				if (result == null) result = caseGASTMSyntaxObject(charLiteral);
				if (result == null) result = caseGASTMObject(charLiteral);
				if (result == null) result = caseVisitable(charLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.REAL_LITERAL: {
				RealLiteral realLiteral = (RealLiteral)theEObject;
				T result = caseRealLiteral(realLiteral);
				if (result == null) result = caseLiteral(realLiteral);
				if (result == null) result = caseExpression(realLiteral);
				if (result == null) result = caseGASTMSyntaxObject(realLiteral);
				if (result == null) result = caseGASTMObject(realLiteral);
				if (result == null) result = caseVisitable(realLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseGASTMSyntaxObject(booleanLiteral);
				if (result == null) result = caseGASTMObject(booleanLiteral);
				if (result == null) result = caseVisitable(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_LITERAL: {
				BitLiteral bitLiteral = (BitLiteral)theEObject;
				T result = caseBitLiteral(bitLiteral);
				if (result == null) result = caseLiteral(bitLiteral);
				if (result == null) result = caseExpression(bitLiteral);
				if (result == null) result = caseGASTMSyntaxObject(bitLiteral);
				if (result == null) result = caseGASTMObject(bitLiteral);
				if (result == null) result = caseVisitable(bitLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.UNARY_PLUS: {
				UnaryPlus unaryPlus = (UnaryPlus)theEObject;
				T result = caseUnaryPlus(unaryPlus);
				if (result == null) result = caseUnaryOperator(unaryPlus);
				if (result == null) result = caseVisitable(unaryPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NEGATE: {
				Negate negate = (Negate)theEObject;
				T result = caseNegate(negate);
				if (result == null) result = caseUnaryOperator(negate);
				if (result == null) result = caseVisitable(negate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseUnaryOperator(not);
				if (result == null) result = caseVisitable(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_NOT: {
				BitNot bitNot = (BitNot)theEObject;
				T result = caseBitNot(bitNot);
				if (result == null) result = caseUnaryOperator(bitNot);
				if (result == null) result = caseVisitable(bitNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ADDRESS_OF: {
				AddressOf addressOf = (AddressOf)theEObject;
				T result = caseAddressOf(addressOf);
				if (result == null) result = caseUnaryOperator(addressOf);
				if (result == null) result = caseVisitable(addressOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DEREF: {
				Deref deref = (Deref)theEObject;
				T result = caseDeref(deref);
				if (result == null) result = caseUnaryOperator(deref);
				if (result == null) result = caseVisitable(deref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.INCREMENT: {
				Increment increment = (Increment)theEObject;
				T result = caseIncrement(increment);
				if (result == null) result = caseUnaryOperator(increment);
				if (result == null) result = caseVisitable(increment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DECREMENT: {
				Decrement decrement = (Decrement)theEObject;
				T result = caseDecrement(decrement);
				if (result == null) result = caseUnaryOperator(decrement);
				if (result == null) result = caseVisitable(decrement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.POST_INCREMENT: {
				PostIncrement postIncrement = (PostIncrement)theEObject;
				T result = casePostIncrement(postIncrement);
				if (result == null) result = caseUnaryOperator(postIncrement);
				if (result == null) result = caseVisitable(postIncrement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.POST_DECREMENT: {
				PostDecrement postDecrement = (PostDecrement)theEObject;
				T result = casePostDecrement(postDecrement);
				if (result == null) result = caseUnaryOperator(postDecrement);
				if (result == null) result = caseVisitable(postDecrement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseBinaryOperator(add);
				if (result == null) result = caseVisitable(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SUBTRACT: {
				Subtract subtract = (Subtract)theEObject;
				T result = caseSubtract(subtract);
				if (result == null) result = caseBinaryOperator(subtract);
				if (result == null) result = caseVisitable(subtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T result = caseMultiply(multiply);
				if (result == null) result = caseBinaryOperator(multiply);
				if (result == null) result = caseVisitable(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T result = caseDivide(divide);
				if (result == null) result = caseBinaryOperator(divide);
				if (result == null) result = caseVisitable(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.MODULUS: {
				Modulus modulus = (Modulus)theEObject;
				T result = caseModulus(modulus);
				if (result == null) result = caseBinaryOperator(modulus);
				if (result == null) result = caseVisitable(modulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.EXPONENT: {
				Exponent exponent = (Exponent)theEObject;
				T result = caseExponent(exponent);
				if (result == null) result = caseBinaryOperator(exponent);
				if (result == null) result = caseVisitable(exponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaryOperator(and);
				if (result == null) result = caseVisitable(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaryOperator(or);
				if (result == null) result = caseVisitable(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseBinaryOperator(equal);
				if (result == null) result = caseVisitable(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NOT_EQUAL: {
				NotEqual notEqual = (NotEqual)theEObject;
				T result = caseNotEqual(notEqual);
				if (result == null) result = caseBinaryOperator(notEqual);
				if (result == null) result = caseVisitable(notEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.GREATER: {
				Greater greater = (Greater)theEObject;
				T result = caseGreater(greater);
				if (result == null) result = caseBinaryOperator(greater);
				if (result == null) result = caseVisitable(greater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NOT_GREATER: {
				NotGreater notGreater = (NotGreater)theEObject;
				T result = caseNotGreater(notGreater);
				if (result == null) result = caseBinaryOperator(notGreater);
				if (result == null) result = caseVisitable(notGreater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.LESS: {
				Less less = (Less)theEObject;
				T result = caseLess(less);
				if (result == null) result = caseBinaryOperator(less);
				if (result == null) result = caseVisitable(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.NOT_LESS: {
				NotLess notLess = (NotLess)theEObject;
				T result = caseNotLess(notLess);
				if (result == null) result = caseBinaryOperator(notLess);
				if (result == null) result = caseVisitable(notLess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_AND: {
				BitAnd bitAnd = (BitAnd)theEObject;
				T result = caseBitAnd(bitAnd);
				if (result == null) result = caseBinaryOperator(bitAnd);
				if (result == null) result = caseVisitable(bitAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_OR: {
				BitOr bitOr = (BitOr)theEObject;
				T result = caseBitOr(bitOr);
				if (result == null) result = caseBinaryOperator(bitOr);
				if (result == null) result = caseVisitable(bitOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_XOR: {
				BitXor bitXor = (BitXor)theEObject;
				T result = caseBitXor(bitXor);
				if (result == null) result = caseBinaryOperator(bitXor);
				if (result == null) result = caseVisitable(bitXor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_LEFT_SHIFT: {
				BitLeftShift bitLeftShift = (BitLeftShift)theEObject;
				T result = caseBitLeftShift(bitLeftShift);
				if (result == null) result = caseBinaryOperator(bitLeftShift);
				if (result == null) result = caseVisitable(bitLeftShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BIT_RIGHT_SHIFT: {
				BitRightShift bitRightShift = (BitRightShift)theEObject;
				T result = caseBitRightShift(bitRightShift);
				if (result == null) result = caseBinaryOperator(bitRightShift);
				if (result == null) result = caseVisitable(bitRightShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseBinaryOperator(assign);
				if (result == null) result = caseVisitable(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.MISSING_ACTUAL_PARAMETER: {
				MissingActualParameter missingActualParameter = (MissingActualParameter)theEObject;
				T result = caseMissingActualParameter(missingActualParameter);
				if (result == null) result = caseActualParameter(missingActualParameter);
				if (result == null) result = caseVisitable(missingActualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BY_VALUE_ACTUAL_PARAMETER_EXPRESSION: {
				ByValueActualParameterExpression byValueActualParameterExpression = (ByValueActualParameterExpression)theEObject;
				T result = caseByValueActualParameterExpression(byValueActualParameterExpression);
				if (result == null) result = caseActualParameterExpression(byValueActualParameterExpression);
				if (result == null) result = caseActualParameter(byValueActualParameterExpression);
				if (result == null) result = caseVisitable(byValueActualParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION: {
				ByReferenceActualParameterExpression byReferenceActualParameterExpression = (ByReferenceActualParameterExpression)theEObject;
				T result = caseByReferenceActualParameterExpression(byReferenceActualParameterExpression);
				if (result == null) result = caseActualParameterExpression(byReferenceActualParameterExpression);
				if (result == null) result = caseActualParameter(byReferenceActualParameterExpression);
				if (result == null) result = caseVisitable(byReferenceActualParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SPECIFIC_TRIGGER_DEFINITION: {
				SpecificTriggerDefinition specificTriggerDefinition = (SpecificTriggerDefinition)theEObject;
				T result = caseSpecificTriggerDefinition(specificTriggerDefinition);
				if (result == null) result = caseDefinition(specificTriggerDefinition);
				if (result == null) result = caseDeclarationOrDefinition(specificTriggerDefinition);
				if (result == null) result = caseDefinitionObject(specificTriggerDefinition);
				if (result == null) result = caseGASTMSyntaxObject(specificTriggerDefinition);
				if (result == null) result = caseGASTMObject(specificTriggerDefinition);
				if (result == null) result = caseVisitable(specificTriggerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SPECIFIC_LESS_EQUAL: {
				SpecificLessEqual specificLessEqual = (SpecificLessEqual)theEObject;
				T result = caseSpecificLessEqual(specificLessEqual);
				if (result == null) result = caseBinaryOperator(specificLessEqual);
				if (result == null) result = caseVisitable(specificLessEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SPECIFIC_GREATER_EQUAL: {
				SpecificGreaterEqual specificGreaterEqual = (SpecificGreaterEqual)theEObject;
				T result = caseSpecificGreaterEqual(specificGreaterEqual);
				if (result == null) result = caseBinaryOperator(specificGreaterEqual);
				if (result == null) result = caseVisitable(specificGreaterEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SPECIFIC_IN: {
				SpecificIn specificIn = (SpecificIn)theEObject;
				T result = caseSpecificIn(specificIn);
				if (result == null) result = caseBinaryOperator(specificIn);
				if (result == null) result = caseVisitable(specificIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SPECIFIC_LIKE: {
				SpecificLike specificLike = (SpecificLike)theEObject;
				T result = caseSpecificLike(specificLike);
				if (result == null) result = caseBinaryOperator(specificLike);
				if (result == null) result = caseVisitable(specificLike);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SPECIFIC_CONCAT_STRING: {
				SpecificConcatString specificConcatString = (SpecificConcatString)theEObject;
				T result = caseSpecificConcatString(specificConcatString);
				if (result == null) result = caseBinaryOperator(specificConcatString);
				if (result == null) result = caseVisitable(specificConcatString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.SPECIFIC_SELECT_STATEMENT: {
				SpecificSelectStatement specificSelectStatement = (SpecificSelectStatement)theEObject;
				T result = caseSpecificSelectStatement(specificSelectStatement);
				if (result == null) result = caseStatement(specificSelectStatement);
				if (result == null) result = caseGASTMSyntaxObject(specificSelectStatement);
				if (result == null) result = caseGASTMObject(specificSelectStatement);
				if (result == null) result = caseVisitable(specificSelectStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstmPackage.VISITABLE: {
				Visitable visitable = (Visitable)theEObject;
				T result = caseVisitable(visitable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delphi Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delphi Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelphiUnit(DelphiUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delphi Interface Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delphi Interface Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelphiInterfaceSection(DelphiInterfaceSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delphi Implementation Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delphi Implementation Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelphiImplementationSection(DelphiImplementationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delphi Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delphi Block Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelphiBlockStatement(DelphiBlockStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delphi Function Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delphi Function Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelphiFunctionCallExpression(DelphiFunctionCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delphi With Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delphi With Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelphiWithStatement(DelphiWithStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GASTM Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GASTM Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMObject(GASTMObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GASTM Source Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GASTM Source Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMSourceObject(GASTMSourceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GASTM Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GASTM Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMSemanticObject(GASTMSemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Syntax Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Syntax Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherSyntaxObject(OtherSyntaxObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageSpecification(StorageSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessKind(AccessKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualParameter(ActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFile(SourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceLocation(SourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GASTM Syntax Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GASTM Syntax Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMSyntaxObject(GASTMSyntaxObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Or Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Or Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationOrDefinition(DeclarationOrDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDefinition(FunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Member Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Member Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMemberAttributes(FunctionMemberAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryDefinition(EntryDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDefinition(DataDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Field Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitFieldDefinition(BitFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteralDefinition(EnumLiteralDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTypeDefinition(NamedTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateTypeDefinition(AggregateTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Space Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Space Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSpaceDefinition(NameSpaceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelDefinition(LabelDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeUnit(IncludeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroCall(MacroCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroDefinition(MacroDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructedType(ConstructedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateType(AggregateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterType(FormalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedType(NamedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassType(ClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derives From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derives From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivesFrom(DerivesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unnamed Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unnamed Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnnamedTypeReference(UnnamedTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTypeReference(NamedTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteStatement(DeleteStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Or Definition Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Or Definition Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationOrDefinitionStatement(DeclarationOrDefinitionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpStatement(JumpStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatement(BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueStatement(ContinueStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledStatement(LabeledStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockStatement(BlockStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyStatement(EmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement(SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase(SwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseBlock(CaseBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopStatement(LoopStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryStatement(TryStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchBlock(CatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesCatchBlock(TypesCatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableCatchBlock(VariableCatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowStatement(ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameReference(NameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAccess(ArrayAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedIdentifierReference(QualifiedIdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Qualified Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Qualified Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQualifiedIdentifierReference(TypeQualifiedIdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression(CastExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorAssign(OperatorAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeExpression(RangeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCallExpression(FunctionCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualParameterExpression(ActualParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewExpression(NewExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelAccess(LabelAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationExpression(AnnotationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalScope(GlobalScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessor Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessor Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessorElement(PreprocessorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionObject(DefinitionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramScope(ProgramScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionScope(FunctionScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSpaceType(NameSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateScope(AggregateScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockScope(BlockScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierReference(IdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterDefinition(FormalParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualSpecification(VirtualSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterDeclaration(FormalParameterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDefinition(VariableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Member Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Member Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMemberAttribute(FunctionMemberAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternal(External object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Persistent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Persistent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPersistent(FunctionPersistent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Local</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileLocal(FileLocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Class Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Class Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerClassMember(PerClassMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoDef(NoDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtual(Virtual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pure Virtual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pure Virtual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePureVirtual(PureVirtual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Virtual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Virtual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonVirtual(NonVirtual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionType(ExceptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(org.xtext.example.delphi.astm.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByte(org.xtext.example.delphi.astm.Byte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortInteger(ShortInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.xtext.example.delphi.astm.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongInteger(LongInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(org.xtext.example.delphi.astm.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(org.xtext.example.delphi.astm.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongDouble(LongDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(org.xtext.example.delphi.astm.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.xtext.example.delphi.astm.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.xtext.example.delphi.astm.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wide Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wide Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWideCharacter(WideCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerType(PointerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureType(StructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionType(UnionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Value Formal Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Value Formal Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByValueFormalParameterType(ByValueFormalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Reference Formal Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Reference Formal Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByReferenceFormalParameterType(ByReferenceFormalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublic(Public object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protected</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protected</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtected(Protected object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivate(Private object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminate Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminateStatement(TerminateStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultBlock(DefaultBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhileStatement(DoWhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Check Before Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Check Before Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForCheckBeforeStatement(ForCheckBeforeStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Check After Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Check After Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForCheckAfterStatement(ForCheckAfterStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExpression(AggregateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Over Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Over Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedOverPointer(QualifiedOverPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Over Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Over Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedOverData(QualifiedOverData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharLiteral(CharLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealLiteral(RealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitLiteral(BitLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryPlus(UnaryPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegate(Negate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitNot(BitNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressOf(AddressOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeref(Deref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrement(Increment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decrement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decrement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecrement(Decrement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Increment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Increment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostIncrement(PostIncrement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Decrement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Decrement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostDecrement(PostDecrement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtract(Subtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulus(Modulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponent(Exponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqual(NotEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotGreater(NotGreater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotLess(NotLess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitAnd(BitAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitOr(BitOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitXor(BitXor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Left Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Left Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitLeftShift(BitLeftShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Right Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitRightShift(BitRightShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missing Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missing Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissingActualParameter(MissingActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Value Actual Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Value Actual Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByValueActualParameterExpression(ByValueActualParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Reference Actual Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Reference Actual Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByReferenceActualParameterExpression(ByReferenceActualParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Trigger Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificTriggerDefinition(SpecificTriggerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Less Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Less Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificLessEqual(SpecificLessEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Greater Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Greater Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificGreaterEqual(SpecificGreaterEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificIn(SpecificIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Like</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Like</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificLike(SpecificLike object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Concat String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Concat String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificConcatString(SpecificConcatString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Select Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Select Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificSelectStatement(SpecificSelectStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visitable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitable(Visitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AstmSwitch
