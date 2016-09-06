/**
 */
package org.xtext.example.delphi.astm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.delphi.astm.AstmPackage
 * @generated
 */
public class AstmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AstmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AstmSwitch<@Nullable Adapter> modelSwitch =
		new AstmSwitch<@Nullable Adapter>() {
			@Override
			public Adapter caseDelphiUnit(DelphiUnit object) {
				return createDelphiUnitAdapter();
			}
			@Override
			public Adapter caseDelphiInterfaceSection(DelphiInterfaceSection object) {
				return createDelphiInterfaceSectionAdapter();
			}
			@Override
			public Adapter caseDelphiImplementationSection(DelphiImplementationSection object) {
				return createDelphiImplementationSectionAdapter();
			}
			@Override
			public Adapter caseDelphiBlockStatement(DelphiBlockStatement object) {
				return createDelphiBlockStatementAdapter();
			}
			@Override
			public Adapter caseDelphiFunctionCallExpression(DelphiFunctionCallExpression object) {
				return createDelphiFunctionCallExpressionAdapter();
			}
			@Override
			public Adapter caseDelphiWithStatement(DelphiWithStatement object) {
				return createDelphiWithStatementAdapter();
			}
			@Override
			public Adapter caseGASTMObject(GASTMObject object) {
				return createGASTMObjectAdapter();
			}
			@Override
			public Adapter caseGASTMSourceObject(GASTMSourceObject object) {
				return createGASTMSourceObjectAdapter();
			}
			@Override
			public Adapter caseGASTMSemanticObject(GASTMSemanticObject object) {
				return createGASTMSemanticObjectAdapter();
			}
			@Override
			public Adapter caseOtherSyntaxObject(OtherSyntaxObject object) {
				return createOtherSyntaxObjectAdapter();
			}
			@Override
			public Adapter caseStorageSpecification(StorageSpecification object) {
				return createStorageSpecificationAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseAccessKind(AccessKind object) {
				return createAccessKindAdapter();
			}
			@Override
			public Adapter caseUnaryOperator(UnaryOperator object) {
				return createUnaryOperatorAdapter();
			}
			@Override
			public Adapter caseBinaryOperator(BinaryOperator object) {
				return createBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseActualParameter(ActualParameter object) {
				return createActualParameterAdapter();
			}
			@Override
			public Adapter caseSourceFile(SourceFile object) {
				return createSourceFileAdapter();
			}
			@Override
			public Adapter caseSourceLocation(SourceLocation object) {
				return createSourceLocationAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseGASTMSyntaxObject(GASTMSyntaxObject object) {
				return createGASTMSyntaxObjectAdapter();
			}
			@Override
			public Adapter caseCompilationUnit(CompilationUnit object) {
				return createCompilationUnitAdapter();
			}
			@Override
			public Adapter caseName(Name object) {
				return createNameAdapter();
			}
			@Override
			public Adapter caseDeclarationOrDefinition(DeclarationOrDefinition object) {
				return createDeclarationOrDefinitionAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionDeclaration(FunctionDeclaration object) {
				return createFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionDefinition(FunctionDefinition object) {
				return createFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionMemberAttributes(FunctionMemberAttributes object) {
				return createFunctionMemberAttributesAdapter();
			}
			@Override
			public Adapter caseEntryDefinition(EntryDefinition object) {
				return createEntryDefinitionAdapter();
			}
			@Override
			public Adapter caseDataDefinition(DataDefinition object) {
				return createDataDefinitionAdapter();
			}
			@Override
			public Adapter caseBitFieldDefinition(BitFieldDefinition object) {
				return createBitFieldDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumLiteralDefinition(EnumLiteralDefinition object) {
				return createEnumLiteralDefinitionAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseNamedTypeDefinition(NamedTypeDefinition object) {
				return createNamedTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseAggregateTypeDefinition(AggregateTypeDefinition object) {
				return createAggregateTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseNameSpaceDefinition(NameSpaceDefinition object) {
				return createNameSpaceDefinitionAdapter();
			}
			@Override
			public Adapter caseLabelDefinition(LabelDefinition object) {
				return createLabelDefinitionAdapter();
			}
			@Override
			public Adapter caseIncludeUnit(IncludeUnit object) {
				return createIncludeUnitAdapter();
			}
			@Override
			public Adapter caseMacroCall(MacroCall object) {
				return createMacroCallAdapter();
			}
			@Override
			public Adapter caseMacroDefinition(MacroDefinition object) {
				return createMacroDefinitionAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseEnumType(EnumType object) {
				return createEnumTypeAdapter();
			}
			@Override
			public Adapter caseConstructedType(ConstructedType object) {
				return createConstructedTypeAdapter();
			}
			@Override
			public Adapter caseAggregateType(AggregateType object) {
				return createAggregateTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseFormalParameterType(FormalParameterType object) {
				return createFormalParameterTypeAdapter();
			}
			@Override
			public Adapter caseNamedType(NamedType object) {
				return createNamedTypeAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseDerivesFrom(DerivesFrom object) {
				return createDerivesFromAdapter();
			}
			@Override
			public Adapter caseUnnamedTypeReference(UnnamedTypeReference object) {
				return createUnnamedTypeReferenceAdapter();
			}
			@Override
			public Adapter caseNamedTypeReference(NamedTypeReference object) {
				return createNamedTypeReferenceAdapter();
			}
			@Override
			public Adapter caseDeleteStatement(DeleteStatement object) {
				return createDeleteStatementAdapter();
			}
			@Override
			public Adapter caseDeclarationOrDefinitionStatement(DeclarationOrDefinitionStatement object) {
				return createDeclarationOrDefinitionStatementAdapter();
			}
			@Override
			public Adapter caseExpressionStatement(ExpressionStatement object) {
				return createExpressionStatementAdapter();
			}
			@Override
			public Adapter caseJumpStatement(JumpStatement object) {
				return createJumpStatementAdapter();
			}
			@Override
			public Adapter caseBreakStatement(BreakStatement object) {
				return createBreakStatementAdapter();
			}
			@Override
			public Adapter caseContinueStatement(ContinueStatement object) {
				return createContinueStatementAdapter();
			}
			@Override
			public Adapter caseLabeledStatement(LabeledStatement object) {
				return createLabeledStatementAdapter();
			}
			@Override
			public Adapter caseBlockStatement(BlockStatement object) {
				return createBlockStatementAdapter();
			}
			@Override
			public Adapter caseEmptyStatement(EmptyStatement object) {
				return createEmptyStatementAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseSwitchStatement(SwitchStatement object) {
				return createSwitchStatementAdapter();
			}
			@Override
			public Adapter caseSwitchCase(SwitchCase object) {
				return createSwitchCaseAdapter();
			}
			@Override
			public Adapter caseCaseBlock(CaseBlock object) {
				return createCaseBlockAdapter();
			}
			@Override
			public Adapter caseReturnStatement(ReturnStatement object) {
				return createReturnStatementAdapter();
			}
			@Override
			public Adapter caseLoopStatement(LoopStatement object) {
				return createLoopStatementAdapter();
			}
			@Override
			public Adapter caseForStatement(ForStatement object) {
				return createForStatementAdapter();
			}
			@Override
			public Adapter caseTryStatement(TryStatement object) {
				return createTryStatementAdapter();
			}
			@Override
			public Adapter caseCatchBlock(CatchBlock object) {
				return createCatchBlockAdapter();
			}
			@Override
			public Adapter caseTypesCatchBlock(TypesCatchBlock object) {
				return createTypesCatchBlockAdapter();
			}
			@Override
			public Adapter caseVariableCatchBlock(VariableCatchBlock object) {
				return createVariableCatchBlockAdapter();
			}
			@Override
			public Adapter caseThrowStatement(ThrowStatement object) {
				return createThrowStatementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseNameReference(NameReference object) {
				return createNameReferenceAdapter();
			}
			@Override
			public Adapter caseArrayAccess(ArrayAccess object) {
				return createArrayAccessAdapter();
			}
			@Override
			public Adapter caseQualifiedIdentifierReference(QualifiedIdentifierReference object) {
				return createQualifiedIdentifierReferenceAdapter();
			}
			@Override
			public Adapter caseTypeQualifiedIdentifierReference(TypeQualifiedIdentifierReference object) {
				return createTypeQualifiedIdentifierReferenceAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseCastExpression(CastExpression object) {
				return createCastExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseOperatorAssign(OperatorAssign object) {
				return createOperatorAssignAdapter();
			}
			@Override
			public Adapter caseConditionalExpression(ConditionalExpression object) {
				return createConditionalExpressionAdapter();
			}
			@Override
			public Adapter caseRangeExpression(RangeExpression object) {
				return createRangeExpressionAdapter();
			}
			@Override
			public Adapter caseFunctionCallExpression(FunctionCallExpression object) {
				return createFunctionCallExpressionAdapter();
			}
			@Override
			public Adapter caseActualParameterExpression(ActualParameterExpression object) {
				return createActualParameterExpressionAdapter();
			}
			@Override
			public Adapter caseNewExpression(NewExpression object) {
				return createNewExpressionAdapter();
			}
			@Override
			public Adapter caseLabelAccess(LabelAccess object) {
				return createLabelAccessAdapter();
			}
			@Override
			public Adapter caseAnnotationExpression(AnnotationExpression object) {
				return createAnnotationExpressionAdapter();
			}
			@Override
			public Adapter caseGlobalScope(GlobalScope object) {
				return createGlobalScopeAdapter();
			}
			@Override
			public Adapter casePreprocessorElement(PreprocessorElement object) {
				return createPreprocessorElementAdapter();
			}
			@Override
			public Adapter caseDefinitionObject(DefinitionObject object) {
				return createDefinitionObjectAdapter();
			}
			@Override
			public Adapter caseProgramScope(ProgramScope object) {
				return createProgramScopeAdapter();
			}
			@Override
			public Adapter caseTypeReference(TypeReference object) {
				return createTypeReferenceAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseFunctionScope(FunctionScope object) {
				return createFunctionScopeAdapter();
			}
			@Override
			public Adapter caseNameSpaceType(NameSpaceType object) {
				return createNameSpaceTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseAggregateScope(AggregateScope object) {
				return createAggregateScopeAdapter();
			}
			@Override
			public Adapter caseBlockScope(BlockScope object) {
				return createBlockScopeAdapter();
			}
			@Override
			public Adapter caseIdentifierReference(IdentifierReference object) {
				return createIdentifierReferenceAdapter();
			}
			@Override
			public Adapter caseFormalParameterDefinition(FormalParameterDefinition object) {
				return createFormalParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseVirtualSpecification(VirtualSpecification object) {
				return createVirtualSpecificationAdapter();
			}
			@Override
			public Adapter caseFormalParameterDeclaration(FormalParameterDeclaration object) {
				return createFormalParameterDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableDefinition(VariableDefinition object) {
				return createVariableDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionMemberAttribute(FunctionMemberAttribute object) {
				return createFunctionMemberAttributeAdapter();
			}
			@Override
			public Adapter caseExternal(External object) {
				return createExternalAdapter();
			}
			@Override
			public Adapter caseFunctionPersistent(FunctionPersistent object) {
				return createFunctionPersistentAdapter();
			}
			@Override
			public Adapter caseFileLocal(FileLocal object) {
				return createFileLocalAdapter();
			}
			@Override
			public Adapter casePerClassMember(PerClassMember object) {
				return createPerClassMemberAdapter();
			}
			@Override
			public Adapter caseNoDef(NoDef object) {
				return createNoDefAdapter();
			}
			@Override
			public Adapter caseVirtual(Virtual object) {
				return createVirtualAdapter();
			}
			@Override
			public Adapter casePureVirtual(PureVirtual object) {
				return createPureVirtualAdapter();
			}
			@Override
			public Adapter caseNonVirtual(NonVirtual object) {
				return createNonVirtualAdapter();
			}
			@Override
			public Adapter caseExceptionType(ExceptionType object) {
				return createExceptionTypeAdapter();
			}
			@Override
			public Adapter caseVoid(org.xtext.example.delphi.astm.Void object) {
				return createVoidAdapter();
			}
			@Override
			public Adapter caseByte(org.xtext.example.delphi.astm.Byte object) {
				return createByteAdapter();
			}
			@Override
			public Adapter caseShortInteger(ShortInteger object) {
				return createShortIntegerAdapter();
			}
			@Override
			public Adapter caseInteger(org.xtext.example.delphi.astm.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseLongInteger(LongInteger object) {
				return createLongIntegerAdapter();
			}
			@Override
			public Adapter caseFloat(org.xtext.example.delphi.astm.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseDouble(org.xtext.example.delphi.astm.Double object) {
				return createDoubleAdapter();
			}
			@Override
			public Adapter caseLongDouble(LongDouble object) {
				return createLongDoubleAdapter();
			}
			@Override
			public Adapter caseCharacter(org.xtext.example.delphi.astm.Character object) {
				return createCharacterAdapter();
			}
			@Override
			public Adapter caseString(org.xtext.example.delphi.astm.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseBoolean(org.xtext.example.delphi.astm.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseWideCharacter(WideCharacter object) {
				return createWideCharacterAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter casePointerType(PointerType object) {
				return createPointerTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseStructureType(StructureType object) {
				return createStructureTypeAdapter();
			}
			@Override
			public Adapter caseUnionType(UnionType object) {
				return createUnionTypeAdapter();
			}
			@Override
			public Adapter caseAnnotationType(AnnotationType object) {
				return createAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseByValueFormalParameterType(ByValueFormalParameterType object) {
				return createByValueFormalParameterTypeAdapter();
			}
			@Override
			public Adapter caseByReferenceFormalParameterType(ByReferenceFormalParameterType object) {
				return createByReferenceFormalParameterTypeAdapter();
			}
			@Override
			public Adapter casePublic(Public object) {
				return createPublicAdapter();
			}
			@Override
			public Adapter caseProtected(Protected object) {
				return createProtectedAdapter();
			}
			@Override
			public Adapter casePrivate(Private object) {
				return createPrivateAdapter();
			}
			@Override
			public Adapter caseTerminateStatement(TerminateStatement object) {
				return createTerminateStatementAdapter();
			}
			@Override
			public Adapter caseDefaultBlock(DefaultBlock object) {
				return createDefaultBlockAdapter();
			}
			@Override
			public Adapter caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			@Override
			public Adapter caseDoWhileStatement(DoWhileStatement object) {
				return createDoWhileStatementAdapter();
			}
			@Override
			public Adapter caseForCheckBeforeStatement(ForCheckBeforeStatement object) {
				return createForCheckBeforeStatementAdapter();
			}
			@Override
			public Adapter caseForCheckAfterStatement(ForCheckAfterStatement object) {
				return createForCheckAfterStatementAdapter();
			}
			@Override
			public Adapter caseAggregateExpression(AggregateExpression object) {
				return createAggregateExpressionAdapter();
			}
			@Override
			public Adapter caseQualifiedOverPointer(QualifiedOverPointer object) {
				return createQualifiedOverPointerAdapter();
			}
			@Override
			public Adapter caseQualifiedOverData(QualifiedOverData object) {
				return createQualifiedOverDataAdapter();
			}
			@Override
			public Adapter caseIntegerLiteral(IntegerLiteral object) {
				return createIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			@Override
			public Adapter caseCharLiteral(CharLiteral object) {
				return createCharLiteralAdapter();
			}
			@Override
			public Adapter caseRealLiteral(RealLiteral object) {
				return createRealLiteralAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseBitLiteral(BitLiteral object) {
				return createBitLiteralAdapter();
			}
			@Override
			public Adapter caseUnaryPlus(UnaryPlus object) {
				return createUnaryPlusAdapter();
			}
			@Override
			public Adapter caseNegate(Negate object) {
				return createNegateAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseBitNot(BitNot object) {
				return createBitNotAdapter();
			}
			@Override
			public Adapter caseAddressOf(AddressOf object) {
				return createAddressOfAdapter();
			}
			@Override
			public Adapter caseDeref(Deref object) {
				return createDerefAdapter();
			}
			@Override
			public Adapter caseIncrement(Increment object) {
				return createIncrementAdapter();
			}
			@Override
			public Adapter caseDecrement(Decrement object) {
				return createDecrementAdapter();
			}
			@Override
			public Adapter casePostIncrement(PostIncrement object) {
				return createPostIncrementAdapter();
			}
			@Override
			public Adapter casePostDecrement(PostDecrement object) {
				return createPostDecrementAdapter();
			}
			@Override
			public Adapter caseAdd(Add object) {
				return createAddAdapter();
			}
			@Override
			public Adapter caseSubtract(Subtract object) {
				return createSubtractAdapter();
			}
			@Override
			public Adapter caseMultiply(Multiply object) {
				return createMultiplyAdapter();
			}
			@Override
			public Adapter caseDivide(Divide object) {
				return createDivideAdapter();
			}
			@Override
			public Adapter caseModulus(Modulus object) {
				return createModulusAdapter();
			}
			@Override
			public Adapter caseExponent(Exponent object) {
				return createExponentAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseEqual(Equal object) {
				return createEqualAdapter();
			}
			@Override
			public Adapter caseNotEqual(NotEqual object) {
				return createNotEqualAdapter();
			}
			@Override
			public Adapter caseGreater(Greater object) {
				return createGreaterAdapter();
			}
			@Override
			public Adapter caseNotGreater(NotGreater object) {
				return createNotGreaterAdapter();
			}
			@Override
			public Adapter caseLess(Less object) {
				return createLessAdapter();
			}
			@Override
			public Adapter caseNotLess(NotLess object) {
				return createNotLessAdapter();
			}
			@Override
			public Adapter caseBitAnd(BitAnd object) {
				return createBitAndAdapter();
			}
			@Override
			public Adapter caseBitOr(BitOr object) {
				return createBitOrAdapter();
			}
			@Override
			public Adapter caseBitXor(BitXor object) {
				return createBitXorAdapter();
			}
			@Override
			public Adapter caseBitLeftShift(BitLeftShift object) {
				return createBitLeftShiftAdapter();
			}
			@Override
			public Adapter caseBitRightShift(BitRightShift object) {
				return createBitRightShiftAdapter();
			}
			@Override
			public Adapter caseAssign(Assign object) {
				return createAssignAdapter();
			}
			@Override
			public Adapter caseMissingActualParameter(MissingActualParameter object) {
				return createMissingActualParameterAdapter();
			}
			@Override
			public Adapter caseByValueActualParameterExpression(ByValueActualParameterExpression object) {
				return createByValueActualParameterExpressionAdapter();
			}
			@Override
			public Adapter caseByReferenceActualParameterExpression(ByReferenceActualParameterExpression object) {
				return createByReferenceActualParameterExpressionAdapter();
			}
			@Override
			public Adapter caseSpecificTriggerDefinition(SpecificTriggerDefinition object) {
				return createSpecificTriggerDefinitionAdapter();
			}
			@Override
			public Adapter caseSpecificLessEqual(SpecificLessEqual object) {
				return createSpecificLessEqualAdapter();
			}
			@Override
			public Adapter caseSpecificGreaterEqual(SpecificGreaterEqual object) {
				return createSpecificGreaterEqualAdapter();
			}
			@Override
			public Adapter caseSpecificIn(SpecificIn object) {
				return createSpecificInAdapter();
			}
			@Override
			public Adapter caseSpecificLike(SpecificLike object) {
				return createSpecificLikeAdapter();
			}
			@Override
			public Adapter caseSpecificConcatString(SpecificConcatString object) {
				return createSpecificConcatStringAdapter();
			}
			@Override
			public Adapter caseSpecificSelectStatement(SpecificSelectStatement object) {
				return createSpecificSelectStatementAdapter();
			}
			@Override
			public Adapter caseVisitable(Visitable object) {
				return createVisitableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DelphiUnit <em>Delphi Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DelphiUnit
	 * @generated
	 */
	public Adapter createDelphiUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DelphiInterfaceSection <em>Delphi Interface Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DelphiInterfaceSection
	 * @generated
	 */
	public Adapter createDelphiInterfaceSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DelphiImplementationSection <em>Delphi Implementation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DelphiImplementationSection
	 * @generated
	 */
	public Adapter createDelphiImplementationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DelphiBlockStatement <em>Delphi Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DelphiBlockStatement
	 * @generated
	 */
	public Adapter createDelphiBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DelphiFunctionCallExpression <em>Delphi Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DelphiFunctionCallExpression
	 * @generated
	 */
	public Adapter createDelphiFunctionCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DelphiWithStatement <em>Delphi With Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DelphiWithStatement
	 * @generated
	 */
	public Adapter createDelphiWithStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.GASTMObject <em>GASTM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.GASTMObject
	 * @generated
	 */
	public Adapter createGASTMObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.GASTMSourceObject <em>GASTM Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.GASTMSourceObject
	 * @generated
	 */
	public Adapter createGASTMSourceObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.GASTMSemanticObject <em>GASTM Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.GASTMSemanticObject
	 * @generated
	 */
	public Adapter createGASTMSemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.OtherSyntaxObject <em>Other Syntax Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.OtherSyntaxObject
	 * @generated
	 */
	public Adapter createOtherSyntaxObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.StorageSpecification <em>Storage Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.StorageSpecification
	 * @generated
	 */
	public Adapter createStorageSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AccessKind
	 * @generated
	 */
	public Adapter createAccessKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ActualParameter <em>Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ActualParameter
	 * @generated
	 */
	public Adapter createActualParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SourceLocation
	 * @generated
	 */
	public Adapter createSourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.GASTMSyntaxObject <em>GASTM Syntax Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.GASTMSyntaxObject
	 * @generated
	 */
	public Adapter createGASTMSyntaxObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.CompilationUnit
	 * @generated
	 */
	public Adapter createCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition <em>Declaration Or Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinition
	 * @generated
	 */
	public Adapter createDeclarationOrDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionDeclaration
	 * @generated
	 */
	public Adapter createFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionDefinition
	 * @generated
	 */
	public Adapter createFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionMemberAttributes <em>Function Member Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttributes
	 * @generated
	 */
	public Adapter createFunctionMemberAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.EntryDefinition <em>Entry Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.EntryDefinition
	 * @generated
	 */
	public Adapter createEntryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DataDefinition
	 * @generated
	 */
	public Adapter createDataDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitFieldDefinition <em>Bit Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitFieldDefinition
	 * @generated
	 */
	public Adapter createBitFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.EnumLiteralDefinition <em>Enum Literal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.EnumLiteralDefinition
	 * @generated
	 */
	public Adapter createEnumLiteralDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NamedTypeDefinition <em>Named Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NamedTypeDefinition
	 * @generated
	 */
	public Adapter createNamedTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AggregateTypeDefinition <em>Aggregate Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AggregateTypeDefinition
	 * @generated
	 */
	public Adapter createAggregateTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NameSpaceDefinition <em>Name Space Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NameSpaceDefinition
	 * @generated
	 */
	public Adapter createNameSpaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.LabelDefinition <em>Label Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.LabelDefinition
	 * @generated
	 */
	public Adapter createLabelDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.IncludeUnit <em>Include Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.IncludeUnit
	 * @generated
	 */
	public Adapter createIncludeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.MacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.MacroCall
	 * @generated
	 */
	public Adapter createMacroCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.MacroDefinition <em>Macro Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.MacroDefinition
	 * @generated
	 */
	public Adapter createMacroDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.EnumType
	 * @generated
	 */
	public Adapter createEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ConstructedType <em>Constructed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ConstructedType
	 * @generated
	 */
	public Adapter createConstructedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AggregateType
	 * @generated
	 */
	public Adapter createAggregateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FormalParameterType <em>Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FormalParameterType
	 * @generated
	 */
	public Adapter createFormalParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NamedType
	 * @generated
	 */
	public Adapter createNamedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ClassType
	 * @generated
	 */
	public Adapter createClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DerivesFrom <em>Derives From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DerivesFrom
	 * @generated
	 */
	public Adapter createDerivesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.UnnamedTypeReference <em>Unnamed Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.UnnamedTypeReference
	 * @generated
	 */
	public Adapter createUnnamedTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NamedTypeReference <em>Named Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NamedTypeReference
	 * @generated
	 */
	public Adapter createNamedTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DeleteStatement <em>Delete Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DeleteStatement
	 * @generated
	 */
	public Adapter createDeleteStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement <em>Declaration Or Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement
	 * @generated
	 */
	public Adapter createDeclarationOrDefinitionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ExpressionStatement
	 * @generated
	 */
	public Adapter createExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.JumpStatement <em>Jump Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.JumpStatement
	 * @generated
	 */
	public Adapter createJumpStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BreakStatement
	 * @generated
	 */
	public Adapter createBreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ContinueStatement
	 * @generated
	 */
	public Adapter createContinueStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.LabeledStatement <em>Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.LabeledStatement
	 * @generated
	 */
	public Adapter createLabeledStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BlockStatement
	 * @generated
	 */
	public Adapter createBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.EmptyStatement
	 * @generated
	 */
	public Adapter createEmptyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.CaseBlock <em>Case Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.CaseBlock
	 * @generated
	 */
	public Adapter createCaseBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.LoopStatement
	 * @generated
	 */
	public Adapter createLoopStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.TryStatement <em>Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.TryStatement
	 * @generated
	 */
	public Adapter createTryStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.CatchBlock <em>Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.CatchBlock
	 * @generated
	 */
	public Adapter createCatchBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.TypesCatchBlock <em>Types Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.TypesCatchBlock
	 * @generated
	 */
	public Adapter createTypesCatchBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.VariableCatchBlock <em>Variable Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.VariableCatchBlock
	 * @generated
	 */
	public Adapter createVariableCatchBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ThrowStatement
	 * @generated
	 */
	public Adapter createThrowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NameReference <em>Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NameReference
	 * @generated
	 */
	public Adapter createNameReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ArrayAccess
	 * @generated
	 */
	public Adapter createArrayAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference <em>Qualified Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.QualifiedIdentifierReference
	 * @generated
	 */
	public Adapter createQualifiedIdentifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference <em>Type Qualified Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference
	 * @generated
	 */
	public Adapter createTypeQualifiedIdentifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.CastExpression
	 * @generated
	 */
	public Adapter createCastExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.OperatorAssign <em>Operator Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.OperatorAssign
	 * @generated
	 */
	public Adapter createOperatorAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ConditionalExpression
	 * @generated
	 */
	public Adapter createConditionalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.RangeExpression
	 * @generated
	 */
	public Adapter createRangeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionCallExpression
	 * @generated
	 */
	public Adapter createFunctionCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ActualParameterExpression <em>Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ActualParameterExpression
	 * @generated
	 */
	public Adapter createActualParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NewExpression <em>New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NewExpression
	 * @generated
	 */
	public Adapter createNewExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.LabelAccess
	 * @generated
	 */
	public Adapter createLabelAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AnnotationExpression <em>Annotation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AnnotationExpression
	 * @generated
	 */
	public Adapter createAnnotationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.GlobalScope <em>Global Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.GlobalScope
	 * @generated
	 */
	public Adapter createGlobalScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.PreprocessorElement <em>Preprocessor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.PreprocessorElement
	 * @generated
	 */
	public Adapter createPreprocessorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DefinitionObject <em>Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DefinitionObject
	 * @generated
	 */
	public Adapter createDefinitionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ProgramScope <em>Program Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ProgramScope
	 * @generated
	 */
	public Adapter createProgramScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.TypeReference
	 * @generated
	 */
	public Adapter createTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionScope <em>Function Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionScope
	 * @generated
	 */
	public Adapter createFunctionScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NameSpaceType <em>Name Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NameSpaceType
	 * @generated
	 */
	public Adapter createNameSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AggregateScope <em>Aggregate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AggregateScope
	 * @generated
	 */
	public Adapter createAggregateScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BlockScope <em>Block Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BlockScope
	 * @generated
	 */
	public Adapter createBlockScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.IdentifierReference <em>Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.IdentifierReference
	 * @generated
	 */
	public Adapter createIdentifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FormalParameterDefinition <em>Formal Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FormalParameterDefinition
	 * @generated
	 */
	public Adapter createFormalParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.VirtualSpecification <em>Virtual Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.VirtualSpecification
	 * @generated
	 */
	public Adapter createVirtualSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FormalParameterDeclaration <em>Formal Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FormalParameterDeclaration
	 * @generated
	 */
	public Adapter createFormalParameterDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.VariableDefinition <em>Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.VariableDefinition
	 * @generated
	 */
	public Adapter createVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionMemberAttribute <em>Function Member Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttribute
	 * @generated
	 */
	public Adapter createFunctionMemberAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.External
	 * @generated
	 */
	public Adapter createExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FunctionPersistent <em>Function Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FunctionPersistent
	 * @generated
	 */
	public Adapter createFunctionPersistentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.FileLocal <em>File Local</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.FileLocal
	 * @generated
	 */
	public Adapter createFileLocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.PerClassMember <em>Per Class Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.PerClassMember
	 * @generated
	 */
	public Adapter createPerClassMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NoDef <em>No Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NoDef
	 * @generated
	 */
	public Adapter createNoDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Virtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Virtual
	 * @generated
	 */
	public Adapter createVirtualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.PureVirtual <em>Pure Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.PureVirtual
	 * @generated
	 */
	public Adapter createPureVirtualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NonVirtual <em>Non Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NonVirtual
	 * @generated
	 */
	public Adapter createNonVirtualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ExceptionType
	 * @generated
	 */
	public Adapter createExceptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Void
	 * @generated
	 */
	public Adapter createVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Byte
	 * @generated
	 */
	public Adapter createByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ShortInteger <em>Short Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ShortInteger
	 * @generated
	 */
	public Adapter createShortIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.LongInteger <em>Long Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.LongInteger
	 * @generated
	 */
	public Adapter createLongIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.LongDouble
	 * @generated
	 */
	public Adapter createLongDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.WideCharacter <em>Wide Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.WideCharacter
	 * @generated
	 */
	public Adapter createWideCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.PointerType
	 * @generated
	 */
	public Adapter createPointerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.StructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.StructureType
	 * @generated
	 */
	public Adapter createStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.UnionType
	 * @generated
	 */
	public Adapter createUnionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ByValueFormalParameterType <em>By Value Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ByValueFormalParameterType
	 * @generated
	 */
	public Adapter createByValueFormalParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ByReferenceFormalParameterType <em>By Reference Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ByReferenceFormalParameterType
	 * @generated
	 */
	public Adapter createByReferenceFormalParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Public
	 * @generated
	 */
	public Adapter createPublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Protected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Protected
	 * @generated
	 */
	public Adapter createProtectedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Private <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Private
	 * @generated
	 */
	public Adapter createPrivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.TerminateStatement <em>Terminate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.TerminateStatement
	 * @generated
	 */
	public Adapter createTerminateStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DefaultBlock <em>Default Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DefaultBlock
	 * @generated
	 */
	public Adapter createDefaultBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.DoWhileStatement <em>Do While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.DoWhileStatement
	 * @generated
	 */
	public Adapter createDoWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ForCheckBeforeStatement <em>For Check Before Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ForCheckBeforeStatement
	 * @generated
	 */
	public Adapter createForCheckBeforeStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ForCheckAfterStatement <em>For Check After Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ForCheckAfterStatement
	 * @generated
	 */
	public Adapter createForCheckAfterStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AggregateExpression
	 * @generated
	 */
	public Adapter createAggregateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.QualifiedOverPointer <em>Qualified Over Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.QualifiedOverPointer
	 * @generated
	 */
	public Adapter createQualifiedOverPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.QualifiedOverData <em>Qualified Over Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.QualifiedOverData
	 * @generated
	 */
	public Adapter createQualifiedOverDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.IntegerLiteral
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.CharLiteral <em>Char Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.CharLiteral
	 * @generated
	 */
	public Adapter createCharLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.RealLiteral
	 * @generated
	 */
	public Adapter createRealLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitLiteral <em>Bit Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitLiteral
	 * @generated
	 */
	public Adapter createBitLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.UnaryPlus <em>Unary Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.UnaryPlus
	 * @generated
	 */
	public Adapter createUnaryPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Negate
	 * @generated
	 */
	public Adapter createNegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitNot <em>Bit Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitNot
	 * @generated
	 */
	public Adapter createBitNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.AddressOf <em>Address Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.AddressOf
	 * @generated
	 */
	public Adapter createAddressOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Deref <em>Deref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Deref
	 * @generated
	 */
	public Adapter createDerefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Increment
	 * @generated
	 */
	public Adapter createIncrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Decrement <em>Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Decrement
	 * @generated
	 */
	public Adapter createDecrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.PostIncrement <em>Post Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.PostIncrement
	 * @generated
	 */
	public Adapter createPostIncrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.PostDecrement <em>Post Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.PostDecrement
	 * @generated
	 */
	public Adapter createPostDecrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Subtract
	 * @generated
	 */
	public Adapter createSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Multiply
	 * @generated
	 */
	public Adapter createMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Divide
	 * @generated
	 */
	public Adapter createDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Modulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Modulus
	 * @generated
	 */
	public Adapter createModulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Exponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Exponent
	 * @generated
	 */
	public Adapter createExponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NotEqual
	 * @generated
	 */
	public Adapter createNotEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NotGreater <em>Not Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NotGreater
	 * @generated
	 */
	public Adapter createNotGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.NotLess <em>Not Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.NotLess
	 * @generated
	 */
	public Adapter createNotLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitAnd <em>Bit And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitAnd
	 * @generated
	 */
	public Adapter createBitAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitOr <em>Bit Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitOr
	 * @generated
	 */
	public Adapter createBitOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitXor <em>Bit Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitXor
	 * @generated
	 */
	public Adapter createBitXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitLeftShift <em>Bit Left Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitLeftShift
	 * @generated
	 */
	public Adapter createBitLeftShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.BitRightShift <em>Bit Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.BitRightShift
	 * @generated
	 */
	public Adapter createBitRightShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.MissingActualParameter <em>Missing Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.MissingActualParameter
	 * @generated
	 */
	public Adapter createMissingActualParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ByValueActualParameterExpression <em>By Value Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ByValueActualParameterExpression
	 * @generated
	 */
	public Adapter createByValueActualParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.ByReferenceActualParameterExpression <em>By Reference Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.ByReferenceActualParameterExpression
	 * @generated
	 */
	public Adapter createByReferenceActualParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SpecificTriggerDefinition <em>Specific Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SpecificTriggerDefinition
	 * @generated
	 */
	public Adapter createSpecificTriggerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SpecificLessEqual <em>Specific Less Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SpecificLessEqual
	 * @generated
	 */
	public Adapter createSpecificLessEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SpecificGreaterEqual <em>Specific Greater Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SpecificGreaterEqual
	 * @generated
	 */
	public Adapter createSpecificGreaterEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SpecificIn <em>Specific In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SpecificIn
	 * @generated
	 */
	public Adapter createSpecificInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SpecificLike <em>Specific Like</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SpecificLike
	 * @generated
	 */
	public Adapter createSpecificLikeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SpecificConcatString <em>Specific Concat String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SpecificConcatString
	 * @generated
	 */
	public Adapter createSpecificConcatStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.SpecificSelectStatement <em>Specific Select Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.SpecificSelectStatement
	 * @generated
	 */
	public Adapter createSpecificSelectStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.delphi.astm.util.Visitable <em>Visitable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.delphi.astm.util.Visitable
	 * @generated
	 */
	public Adapter createVisitableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AstmAdapterFactory
