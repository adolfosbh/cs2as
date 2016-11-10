/**
 */
package astm.util;

import astm.AccessKind;
import astm.ActualParameter;
import astm.ActualParameterExpression;
import astm.Add;
import astm.AddressOf;
import astm.AggregateExpression;
import astm.AggregateScope;
import astm.AggregateType;
import astm.AggregateTypeDefinition;
import astm.And;
import astm.AnnotationExpression;
import astm.AnnotationType;
import astm.ArrayAccess;
import astm.ArrayType;
import astm.Assign;
import astm.AstmPackage;
import astm.BinaryExpression;
import astm.BinaryOperator;
import astm.BitAnd;
import astm.BitFieldDefinition;
import astm.BitLeftShift;
import astm.BitLiteral;
import astm.BitNot;
import astm.BitOr;
import astm.BitRightShift;
import astm.BitXor;
import astm.BlockScope;
import astm.BlockStatement;
import astm.BooleanLiteral;
import astm.BreakStatement;
import astm.ByReferenceActualParameterExpression;
import astm.ByReferenceFormalParameterType;
import astm.ByValueActualParameterExpression;
import astm.ByValueFormalParameterType;
import astm.CaseBlock;
import astm.CastExpression;
import astm.CatchBlock;
import astm.CharLiteral;
import astm.ClassType;
import astm.CollectionType;
import astm.Comment;
import astm.CompilationUnit;
import astm.ConditionalExpression;
import astm.ConstructedType;
import astm.ContinueStatement;
import astm.DataDefinition;
import astm.DataType;
import astm.Declaration;
import astm.DeclarationOrDefinition;
import astm.DeclarationOrDefinitionStatement;
import astm.Decrement;
import astm.DefaultBlock;
import astm.Definition;
import astm.DefinitionObject;
import astm.DeleteStatement;
import astm.Deref;
import astm.DerivesFrom;
import astm.Dimension;
import astm.Divide;
import astm.DoWhileStatement;
import astm.EmptyStatement;
import astm.EntryDefinition;
import astm.EnumLiteralDefinition;
import astm.EnumType;
import astm.Equal;
import astm.ExceptionType;
import astm.Exponent;
import astm.Expression;
import astm.ExpressionStatement;
import astm.External;
import astm.FileLocal;
import astm.ForCheckAfterStatement;
import astm.ForCheckBeforeStatement;
import astm.ForStatement;
import astm.FormalParameterDeclaration;
import astm.FormalParameterDefinition;
import astm.FormalParameterType;
import astm.FunctionCallExpression;
import astm.FunctionDeclaration;
import astm.FunctionDefinition;
import astm.FunctionMemberAttribute;
import astm.FunctionMemberAttributes;
import astm.FunctionPersistent;
import astm.FunctionScope;
import astm.FunctionType;
import astm.GASTMObject;
import astm.GASTMSemanticObject;
import astm.GASTMSourceObject;
import astm.GASTMSyntaxObject;
import astm.GlobalScope;
import astm.Greater;
import astm.IdentifierReference;
import astm.IfStatement;
import astm.IncludeUnit;
import astm.Increment;
import astm.IntegerlLiteral;
import astm.JumpStatement;
import astm.LabelAccess;
import astm.LabelDefinition;
import astm.LabelType;
import astm.LabeledStatement;
import astm.Less;
import astm.Literal;
import astm.LongDouble;
import astm.LongInteger;
import astm.LoopStatement;
import astm.MacroCall;
import astm.MacroDefinition;
import astm.MissingActualParameter;
import astm.Modulus;
import astm.Multiply;
import astm.Name;
import astm.NameReference;
import astm.NameSpaceDefinition;
import astm.NameSpaceType;
import astm.NamedType;
import astm.NamedTypeDefinition;
import astm.NamedTypeReference;
import astm.Negate;
import astm.NewExpression;
import astm.NoDef;
import astm.NonVirtual;
import astm.Not;
import astm.NotEqual;
import astm.NotGreater;
import astm.NotLess;
import astm.OperatorAssign;
import astm.Or;
import astm.OtherSyntaxObject;
import astm.PerClassMember;
import astm.PointerType;
import astm.PostDecrement;
import astm.PostIncrement;
import astm.PreprocessorElement;
import astm.PrimitiveType;
import astm.Private;
import astm.ProgramScope;
import astm.Project;
import astm.Protected;
import astm.Public;
import astm.PureVirtual;
import astm.QualifiedIdentifierReference;
import astm.QualifiedOverData;
import astm.QualifiedOverPointer;
import astm.RDBBFile;
import astm.RDBBlob;
import astm.RDBBoolean;
import astm.RDBChar;
import astm.RDBCheckConstraint;
import astm.RDBClob;
import astm.RDBCloseCursorStatement;
import astm.RDBColumnDefinition;
import astm.RDBColumnReference;
import astm.RDBColumnType;
import astm.RDBConnectStatement;
import astm.RDBConstraint;
import astm.RDBCursorDefinition;
import astm.RDBCursorStatement;
import astm.RDBCursorType;
import astm.RDBDataBaseType;
import astm.RDBDatabaseDefinition;
import astm.RDBDate;
import astm.RDBDecimal;
import astm.RDBDeleteStatement;
import astm.RDBFetchCursorStatement;
import astm.RDBFloat;
import astm.RDBHostVariableExpression;
import astm.RDBHostVariableReference;
import astm.RDBIndex;
import astm.RDBIndexColumn;
import astm.RDBInsertStatement;
import astm.RDBInt;
import astm.RDBInteger;
import astm.RDBLong;
import astm.RDBModifyStatement;
import astm.RDBNClob;
import astm.RDBNumber;
import astm.RDBOpenCursorStatement;
import astm.RDBRaw;
import astm.RDBReal;
import astm.RDBRefIntegrity;
import astm.RDBRowid;
import astm.RDBSelectExpression;
import astm.RDBSelectStatement;
import astm.RDBString;
import astm.RDBTableAlias;
import astm.RDBTableDefinition;
import astm.RDBTableReference;
import astm.RDBTableSpaceDefinition;
import astm.RDBTableSpaceReference;
import astm.RDBTableSpaceType;
import astm.RDBTableType;
import astm.RDBTimestamp;
import astm.RDBTrigger;
import astm.RDBUniqueKey;
import astm.RDBUpdateStatement;
import astm.RDBUserDefinition;
import astm.RDBUserType;
import astm.RDBVarchar;
import astm.RDBViewDefinition;
import astm.RDBViewType;
import astm.RangeExpression;
import astm.RangeType;
import astm.RealLiteral;
import astm.ReferenceType;
import astm.ReturnStatement;
import astm.Scope;
import astm.ShortInteger;
import astm.SourceFile;
import astm.SourceLocation;
import astm.SpecificConcatString;
import astm.SpecificGreaterEqual;
import astm.SpecificIn;
import astm.SpecificLessEqual;
import astm.SpecificLike;
import astm.SpecificSelectStatement;
import astm.SpecificTriggerDefinition;
import astm.Statement;
import astm.StorageSpecification;
import astm.StringLiteral;
import astm.StructureType;
import astm.Subtract;
import astm.SwitchCase;
import astm.SwitchStatement;
import astm.TerminateStatement;
import astm.ThrowStatement;
import astm.TryStatement;
import astm.Type;
import astm.TypeDefinition;
import astm.TypeQualifiedIdentifierReference;
import astm.TypeReference;
import astm.TypesCatchBlock;
import astm.UnaryExpression;
import astm.UnaryOperator;
import astm.UnaryPlus;
import astm.UnionType;
import astm.UnnamedTypeReference;
import astm.VariableCatchBlock;
import astm.VariableDeclaration;
import astm.VariableDefinition;
import astm.Virtual;
import astm.VirtualSpecification;
import astm.WhileStatement;
import astm.WideCharacter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jdt.annotation.Nullable;

import org.xtext.example.plsql.astm.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see astm.AstmPackage
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
			public Adapter caseVoid(astm.Void object) {
				return createVoidAdapter();
			}
			@Override
			public Adapter caseByte(astm.Byte object) {
				return createByteAdapter();
			}
			@Override
			public Adapter caseShortInteger(ShortInteger object) {
				return createShortIntegerAdapter();
			}
			@Override
			public Adapter caseInteger(astm.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseLongInteger(LongInteger object) {
				return createLongIntegerAdapter();
			}
			@Override
			public Adapter caseFloat(astm.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseDouble(astm.Double object) {
				return createDoubleAdapter();
			}
			@Override
			public Adapter caseLongDouble(LongDouble object) {
				return createLongDoubleAdapter();
			}
			@Override
			public Adapter caseCharacter(astm.Character object) {
				return createCharacterAdapter();
			}
			@Override
			public Adapter caseString(astm.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseBoolean(astm.Boolean object) {
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
			public Adapter caseIntegerlLiteral(IntegerlLiteral object) {
				return createIntegerlLiteralAdapter();
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
			public Adapter caseRDBDatabaseDefinition(RDBDatabaseDefinition object) {
				return createRDBDatabaseDefinitionAdapter();
			}
			@Override
			public Adapter caseRDBTableSpaceReference(RDBTableSpaceReference object) {
				return createRDBTableSpaceReferenceAdapter();
			}
			@Override
			public Adapter caseRDBUserDefinition(RDBUserDefinition object) {
				return createRDBUserDefinitionAdapter();
			}
			@Override
			public Adapter caseRDBTableSpaceDefinition(RDBTableSpaceDefinition object) {
				return createRDBTableSpaceDefinitionAdapter();
			}
			@Override
			public Adapter caseRDBTableDefinition(RDBTableDefinition object) {
				return createRDBTableDefinitionAdapter();
			}
			@Override
			public Adapter caseRDBColumnDefinition(RDBColumnDefinition object) {
				return createRDBColumnDefinitionAdapter();
			}
			@Override
			public Adapter caseRDBViewDefinition(RDBViewDefinition object) {
				return createRDBViewDefinitionAdapter();
			}
			@Override
			public Adapter caseRDBCursorDefinition(RDBCursorDefinition object) {
				return createRDBCursorDefinitionAdapter();
			}
			@Override
			public Adapter caseRDBIndex(RDBIndex object) {
				return createRDBIndexAdapter();
			}
			@Override
			public Adapter caseRDBIndexColumn(RDBIndexColumn object) {
				return createRDBIndexColumnAdapter();
			}
			@Override
			public Adapter caseRDBTrigger(RDBTrigger object) {
				return createRDBTriggerAdapter();
			}
			@Override
			public Adapter caseRDBConstraint(RDBConstraint object) {
				return createRDBConstraintAdapter();
			}
			@Override
			public Adapter caseRDBCheckConstraint(RDBCheckConstraint object) {
				return createRDBCheckConstraintAdapter();
			}
			@Override
			public Adapter caseRDBRefIntegrity(RDBRefIntegrity object) {
				return createRDBRefIntegrityAdapter();
			}
			@Override
			public Adapter caseRDBUniqueKey(RDBUniqueKey object) {
				return createRDBUniqueKeyAdapter();
			}
			@Override
			public Adapter caseRDBConnectStatement(RDBConnectStatement object) {
				return createRDBConnectStatementAdapter();
			}
			@Override
			public Adapter caseRDBSelectStatement(RDBSelectStatement object) {
				return createRDBSelectStatementAdapter();
			}
			@Override
			public Adapter caseRDBInsertStatement(RDBInsertStatement object) {
				return createRDBInsertStatementAdapter();
			}
			@Override
			public Adapter caseRDBModifyStatement(RDBModifyStatement object) {
				return createRDBModifyStatementAdapter();
			}
			@Override
			public Adapter caseRDBUpdateStatement(RDBUpdateStatement object) {
				return createRDBUpdateStatementAdapter();
			}
			@Override
			public Adapter caseRDBCursorStatement(RDBCursorStatement object) {
				return createRDBCursorStatementAdapter();
			}
			@Override
			public Adapter caseRDBOpenCursorStatement(RDBOpenCursorStatement object) {
				return createRDBOpenCursorStatementAdapter();
			}
			@Override
			public Adapter caseRDBFetchCursorStatement(RDBFetchCursorStatement object) {
				return createRDBFetchCursorStatementAdapter();
			}
			@Override
			public Adapter caseRDBHostVariableReference(RDBHostVariableReference object) {
				return createRDBHostVariableReferenceAdapter();
			}
			@Override
			public Adapter caseRDBSelectExpression(RDBSelectExpression object) {
				return createRDBSelectExpressionAdapter();
			}
			@Override
			public Adapter caseRDBTableReference(RDBTableReference object) {
				return createRDBTableReferenceAdapter();
			}
			@Override
			public Adapter caseRDBTableAlias(RDBTableAlias object) {
				return createRDBTableAliasAdapter();
			}
			@Override
			public Adapter caseRDBColumnReference(RDBColumnReference object) {
				return createRDBColumnReferenceAdapter();
			}
			@Override
			public Adapter caseRDBDataBaseType(RDBDataBaseType object) {
				return createRDBDataBaseTypeAdapter();
			}
			@Override
			public Adapter caseRDBUserType(RDBUserType object) {
				return createRDBUserTypeAdapter();
			}
			@Override
			public Adapter caseRDBTableSpaceType(RDBTableSpaceType object) {
				return createRDBTableSpaceTypeAdapter();
			}
			@Override
			public Adapter caseRDBTableType(RDBTableType object) {
				return createRDBTableTypeAdapter();
			}
			@Override
			public Adapter caseRDBViewType(RDBViewType object) {
				return createRDBViewTypeAdapter();
			}
			@Override
			public Adapter caseRDBCursorType(RDBCursorType object) {
				return createRDBCursorTypeAdapter();
			}
			@Override
			public Adapter caseRDBColumnType(RDBColumnType object) {
				return createRDBColumnTypeAdapter();
			}
			@Override
			public Adapter caseRDBInteger(RDBInteger object) {
				return createRDBIntegerAdapter();
			}
			@Override
			public Adapter caseRDBInt(RDBInt object) {
				return createRDBIntAdapter();
			}
			@Override
			public Adapter caseRDBReal(RDBReal object) {
				return createRDBRealAdapter();
			}
			@Override
			public Adapter caseRDBFloat(RDBFloat object) {
				return createRDBFloatAdapter();
			}
			@Override
			public Adapter caseRDBDecimal(RDBDecimal object) {
				return createRDBDecimalAdapter();
			}
			@Override
			public Adapter caseRDBNumber(RDBNumber object) {
				return createRDBNumberAdapter();
			}
			@Override
			public Adapter caseRDBLong(RDBLong object) {
				return createRDBLongAdapter();
			}
			@Override
			public Adapter caseRDBChar(RDBChar object) {
				return createRDBCharAdapter();
			}
			@Override
			public Adapter caseRDBVarchar(RDBVarchar object) {
				return createRDBVarcharAdapter();
			}
			@Override
			public Adapter caseRDBString(RDBString object) {
				return createRDBStringAdapter();
			}
			@Override
			public Adapter caseRDBRaw(RDBRaw object) {
				return createRDBRawAdapter();
			}
			@Override
			public Adapter caseRDBDate(RDBDate object) {
				return createRDBDateAdapter();
			}
			@Override
			public Adapter caseRDBTimestamp(RDBTimestamp object) {
				return createRDBTimestampAdapter();
			}
			@Override
			public Adapter caseRDBRowid(RDBRowid object) {
				return createRDBRowidAdapter();
			}
			@Override
			public Adapter caseRDBBoolean(RDBBoolean object) {
				return createRDBBooleanAdapter();
			}
			@Override
			public Adapter caseRDBBlob(RDBBlob object) {
				return createRDBBlobAdapter();
			}
			@Override
			public Adapter caseRDBClob(RDBClob object) {
				return createRDBClobAdapter();
			}
			@Override
			public Adapter caseRDBNClob(RDBNClob object) {
				return createRDBNClobAdapter();
			}
			@Override
			public Adapter caseRDBBFile(RDBBFile object) {
				return createRDBBFileAdapter();
			}
			@Override
			public Adapter caseRDBDeleteStatement(RDBDeleteStatement object) {
				return createRDBDeleteStatementAdapter();
			}
			@Override
			public Adapter caseRDBCloseCursorStatement(RDBCloseCursorStatement object) {
				return createRDBCloseCursorStatementAdapter();
			}
			@Override
			public Adapter caseRDBHostVariableExpression(RDBHostVariableExpression object) {
				return createRDBHostVariableExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link astm.GASTMObject <em>GASTM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.GASTMObject
	 * @generated
	 */
	public Adapter createGASTMObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.GASTMSourceObject <em>GASTM Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.GASTMSourceObject
	 * @generated
	 */
	public Adapter createGASTMSourceObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.GASTMSemanticObject <em>GASTM Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.GASTMSemanticObject
	 * @generated
	 */
	public Adapter createGASTMSemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.OtherSyntaxObject <em>Other Syntax Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.OtherSyntaxObject
	 * @generated
	 */
	public Adapter createOtherSyntaxObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.StorageSpecification <em>Storage Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.StorageSpecification
	 * @generated
	 */
	public Adapter createStorageSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AccessKind
	 * @generated
	 */
	public Adapter createAccessKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ActualParameter <em>Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ActualParameter
	 * @generated
	 */
	public Adapter createActualParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SourceLocation
	 * @generated
	 */
	public Adapter createSourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.GASTMSyntaxObject <em>GASTM Syntax Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.GASTMSyntaxObject
	 * @generated
	 */
	public Adapter createGASTMSyntaxObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.CompilationUnit
	 * @generated
	 */
	public Adapter createCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DeclarationOrDefinition <em>Declaration Or Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DeclarationOrDefinition
	 * @generated
	 */
	public Adapter createDeclarationOrDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionDeclaration
	 * @generated
	 */
	public Adapter createFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionDefinition
	 * @generated
	 */
	public Adapter createFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionMemberAttributes <em>Function Member Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionMemberAttributes
	 * @generated
	 */
	public Adapter createFunctionMemberAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.EntryDefinition <em>Entry Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.EntryDefinition
	 * @generated
	 */
	public Adapter createEntryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DataDefinition
	 * @generated
	 */
	public Adapter createDataDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitFieldDefinition <em>Bit Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitFieldDefinition
	 * @generated
	 */
	public Adapter createBitFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.EnumLiteralDefinition <em>Enum Literal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.EnumLiteralDefinition
	 * @generated
	 */
	public Adapter createEnumLiteralDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NamedTypeDefinition <em>Named Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NamedTypeDefinition
	 * @generated
	 */
	public Adapter createNamedTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AggregateTypeDefinition <em>Aggregate Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AggregateTypeDefinition
	 * @generated
	 */
	public Adapter createAggregateTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NameSpaceDefinition <em>Name Space Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NameSpaceDefinition
	 * @generated
	 */
	public Adapter createNameSpaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.LabelDefinition <em>Label Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.LabelDefinition
	 * @generated
	 */
	public Adapter createLabelDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.IncludeUnit <em>Include Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.IncludeUnit
	 * @generated
	 */
	public Adapter createIncludeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.MacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.MacroCall
	 * @generated
	 */
	public Adapter createMacroCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.MacroDefinition <em>Macro Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.MacroDefinition
	 * @generated
	 */
	public Adapter createMacroDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.EnumType
	 * @generated
	 */
	public Adapter createEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ConstructedType <em>Constructed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ConstructedType
	 * @generated
	 */
	public Adapter createConstructedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AggregateType
	 * @generated
	 */
	public Adapter createAggregateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FormalParameterType <em>Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FormalParameterType
	 * @generated
	 */
	public Adapter createFormalParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NamedType
	 * @generated
	 */
	public Adapter createNamedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ClassType
	 * @generated
	 */
	public Adapter createClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DerivesFrom <em>Derives From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DerivesFrom
	 * @generated
	 */
	public Adapter createDerivesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.UnnamedTypeReference <em>Unnamed Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.UnnamedTypeReference
	 * @generated
	 */
	public Adapter createUnnamedTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NamedTypeReference <em>Named Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NamedTypeReference
	 * @generated
	 */
	public Adapter createNamedTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DeleteStatement <em>Delete Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DeleteStatement
	 * @generated
	 */
	public Adapter createDeleteStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DeclarationOrDefinitionStatement <em>Declaration Or Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DeclarationOrDefinitionStatement
	 * @generated
	 */
	public Adapter createDeclarationOrDefinitionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ExpressionStatement
	 * @generated
	 */
	public Adapter createExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.JumpStatement <em>Jump Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.JumpStatement
	 * @generated
	 */
	public Adapter createJumpStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BreakStatement
	 * @generated
	 */
	public Adapter createBreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ContinueStatement
	 * @generated
	 */
	public Adapter createContinueStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.LabeledStatement <em>Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.LabeledStatement
	 * @generated
	 */
	public Adapter createLabeledStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BlockStatement
	 * @generated
	 */
	public Adapter createBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.EmptyStatement
	 * @generated
	 */
	public Adapter createEmptyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.CaseBlock <em>Case Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.CaseBlock
	 * @generated
	 */
	public Adapter createCaseBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.LoopStatement
	 * @generated
	 */
	public Adapter createLoopStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.TryStatement <em>Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.TryStatement
	 * @generated
	 */
	public Adapter createTryStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.CatchBlock <em>Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.CatchBlock
	 * @generated
	 */
	public Adapter createCatchBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.TypesCatchBlock <em>Types Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.TypesCatchBlock
	 * @generated
	 */
	public Adapter createTypesCatchBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.VariableCatchBlock <em>Variable Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.VariableCatchBlock
	 * @generated
	 */
	public Adapter createVariableCatchBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ThrowStatement
	 * @generated
	 */
	public Adapter createThrowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NameReference <em>Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NameReference
	 * @generated
	 */
	public Adapter createNameReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ArrayAccess
	 * @generated
	 */
	public Adapter createArrayAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.QualifiedIdentifierReference <em>Qualified Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.QualifiedIdentifierReference
	 * @generated
	 */
	public Adapter createQualifiedIdentifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.TypeQualifiedIdentifierReference <em>Type Qualified Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.TypeQualifiedIdentifierReference
	 * @generated
	 */
	public Adapter createTypeQualifiedIdentifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.CastExpression
	 * @generated
	 */
	public Adapter createCastExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.OperatorAssign <em>Operator Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.OperatorAssign
	 * @generated
	 */
	public Adapter createOperatorAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ConditionalExpression
	 * @generated
	 */
	public Adapter createConditionalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RangeExpression
	 * @generated
	 */
	public Adapter createRangeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionCallExpression
	 * @generated
	 */
	public Adapter createFunctionCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ActualParameterExpression <em>Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ActualParameterExpression
	 * @generated
	 */
	public Adapter createActualParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NewExpression <em>New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NewExpression
	 * @generated
	 */
	public Adapter createNewExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.LabelAccess
	 * @generated
	 */
	public Adapter createLabelAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AnnotationExpression <em>Annotation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AnnotationExpression
	 * @generated
	 */
	public Adapter createAnnotationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.GlobalScope <em>Global Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.GlobalScope
	 * @generated
	 */
	public Adapter createGlobalScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.PreprocessorElement <em>Preprocessor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.PreprocessorElement
	 * @generated
	 */
	public Adapter createPreprocessorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DefinitionObject <em>Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DefinitionObject
	 * @generated
	 */
	public Adapter createDefinitionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ProgramScope <em>Program Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ProgramScope
	 * @generated
	 */
	public Adapter createProgramScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.TypeReference
	 * @generated
	 */
	public Adapter createTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionScope <em>Function Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionScope
	 * @generated
	 */
	public Adapter createFunctionScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NameSpaceType <em>Name Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NameSpaceType
	 * @generated
	 */
	public Adapter createNameSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AggregateScope <em>Aggregate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AggregateScope
	 * @generated
	 */
	public Adapter createAggregateScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BlockScope <em>Block Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BlockScope
	 * @generated
	 */
	public Adapter createBlockScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.IdentifierReference <em>Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.IdentifierReference
	 * @generated
	 */
	public Adapter createIdentifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FormalParameterDefinition <em>Formal Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FormalParameterDefinition
	 * @generated
	 */
	public Adapter createFormalParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.VirtualSpecification <em>Virtual Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.VirtualSpecification
	 * @generated
	 */
	public Adapter createVirtualSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FormalParameterDeclaration <em>Formal Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FormalParameterDeclaration
	 * @generated
	 */
	public Adapter createFormalParameterDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.VariableDefinition <em>Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.VariableDefinition
	 * @generated
	 */
	public Adapter createVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionMemberAttribute <em>Function Member Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionMemberAttribute
	 * @generated
	 */
	public Adapter createFunctionMemberAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.External
	 * @generated
	 */
	public Adapter createExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FunctionPersistent <em>Function Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FunctionPersistent
	 * @generated
	 */
	public Adapter createFunctionPersistentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.FileLocal <em>File Local</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.FileLocal
	 * @generated
	 */
	public Adapter createFileLocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.PerClassMember <em>Per Class Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.PerClassMember
	 * @generated
	 */
	public Adapter createPerClassMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NoDef <em>No Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NoDef
	 * @generated
	 */
	public Adapter createNoDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Virtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Virtual
	 * @generated
	 */
	public Adapter createVirtualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.PureVirtual <em>Pure Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.PureVirtual
	 * @generated
	 */
	public Adapter createPureVirtualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NonVirtual <em>Non Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NonVirtual
	 * @generated
	 */
	public Adapter createNonVirtualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ExceptionType
	 * @generated
	 */
	public Adapter createExceptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Void
	 * @generated
	 */
	public Adapter createVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Byte
	 * @generated
	 */
	public Adapter createByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ShortInteger <em>Short Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ShortInteger
	 * @generated
	 */
	public Adapter createShortIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.LongInteger <em>Long Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.LongInteger
	 * @generated
	 */
	public Adapter createLongIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.LongDouble
	 * @generated
	 */
	public Adapter createLongDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.WideCharacter <em>Wide Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.WideCharacter
	 * @generated
	 */
	public Adapter createWideCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.PointerType
	 * @generated
	 */
	public Adapter createPointerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.StructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.StructureType
	 * @generated
	 */
	public Adapter createStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.UnionType
	 * @generated
	 */
	public Adapter createUnionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ByValueFormalParameterType <em>By Value Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ByValueFormalParameterType
	 * @generated
	 */
	public Adapter createByValueFormalParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ByReferenceFormalParameterType <em>By Reference Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ByReferenceFormalParameterType
	 * @generated
	 */
	public Adapter createByReferenceFormalParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Public
	 * @generated
	 */
	public Adapter createPublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Protected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Protected
	 * @generated
	 */
	public Adapter createProtectedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Private <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Private
	 * @generated
	 */
	public Adapter createPrivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.TerminateStatement <em>Terminate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.TerminateStatement
	 * @generated
	 */
	public Adapter createTerminateStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DefaultBlock <em>Default Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DefaultBlock
	 * @generated
	 */
	public Adapter createDefaultBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.DoWhileStatement <em>Do While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.DoWhileStatement
	 * @generated
	 */
	public Adapter createDoWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ForCheckBeforeStatement <em>For Check Before Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ForCheckBeforeStatement
	 * @generated
	 */
	public Adapter createForCheckBeforeStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ForCheckAfterStatement <em>For Check After Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ForCheckAfterStatement
	 * @generated
	 */
	public Adapter createForCheckAfterStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AggregateExpression
	 * @generated
	 */
	public Adapter createAggregateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.QualifiedOverPointer <em>Qualified Over Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.QualifiedOverPointer
	 * @generated
	 */
	public Adapter createQualifiedOverPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.QualifiedOverData <em>Qualified Over Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.QualifiedOverData
	 * @generated
	 */
	public Adapter createQualifiedOverDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.IntegerlLiteral <em>Integerl Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.IntegerlLiteral
	 * @generated
	 */
	public Adapter createIntegerlLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.CharLiteral <em>Char Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.CharLiteral
	 * @generated
	 */
	public Adapter createCharLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RealLiteral
	 * @generated
	 */
	public Adapter createRealLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitLiteral <em>Bit Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitLiteral
	 * @generated
	 */
	public Adapter createBitLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.UnaryPlus <em>Unary Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.UnaryPlus
	 * @generated
	 */
	public Adapter createUnaryPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Negate
	 * @generated
	 */
	public Adapter createNegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitNot <em>Bit Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitNot
	 * @generated
	 */
	public Adapter createBitNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.AddressOf <em>Address Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.AddressOf
	 * @generated
	 */
	public Adapter createAddressOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Deref <em>Deref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Deref
	 * @generated
	 */
	public Adapter createDerefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Increment
	 * @generated
	 */
	public Adapter createIncrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Decrement <em>Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Decrement
	 * @generated
	 */
	public Adapter createDecrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.PostIncrement <em>Post Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.PostIncrement
	 * @generated
	 */
	public Adapter createPostIncrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.PostDecrement <em>Post Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.PostDecrement
	 * @generated
	 */
	public Adapter createPostDecrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Subtract
	 * @generated
	 */
	public Adapter createSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Multiply
	 * @generated
	 */
	public Adapter createMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Divide
	 * @generated
	 */
	public Adapter createDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Modulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Modulus
	 * @generated
	 */
	public Adapter createModulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Exponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Exponent
	 * @generated
	 */
	public Adapter createExponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NotEqual
	 * @generated
	 */
	public Adapter createNotEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NotGreater <em>Not Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NotGreater
	 * @generated
	 */
	public Adapter createNotGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.NotLess <em>Not Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.NotLess
	 * @generated
	 */
	public Adapter createNotLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitAnd <em>Bit And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitAnd
	 * @generated
	 */
	public Adapter createBitAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitOr <em>Bit Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitOr
	 * @generated
	 */
	public Adapter createBitOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitXor <em>Bit Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitXor
	 * @generated
	 */
	public Adapter createBitXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitLeftShift <em>Bit Left Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitLeftShift
	 * @generated
	 */
	public Adapter createBitLeftShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.BitRightShift <em>Bit Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.BitRightShift
	 * @generated
	 */
	public Adapter createBitRightShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.MissingActualParameter <em>Missing Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.MissingActualParameter
	 * @generated
	 */
	public Adapter createMissingActualParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ByValueActualParameterExpression <em>By Value Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ByValueActualParameterExpression
	 * @generated
	 */
	public Adapter createByValueActualParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.ByReferenceActualParameterExpression <em>By Reference Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.ByReferenceActualParameterExpression
	 * @generated
	 */
	public Adapter createByReferenceActualParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SpecificTriggerDefinition <em>Specific Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SpecificTriggerDefinition
	 * @generated
	 */
	public Adapter createSpecificTriggerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SpecificLessEqual <em>Specific Less Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SpecificLessEqual
	 * @generated
	 */
	public Adapter createSpecificLessEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SpecificGreaterEqual <em>Specific Greater Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SpecificGreaterEqual
	 * @generated
	 */
	public Adapter createSpecificGreaterEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SpecificIn <em>Specific In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SpecificIn
	 * @generated
	 */
	public Adapter createSpecificInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SpecificLike <em>Specific Like</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SpecificLike
	 * @generated
	 */
	public Adapter createSpecificLikeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SpecificConcatString <em>Specific Concat String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SpecificConcatString
	 * @generated
	 */
	public Adapter createSpecificConcatStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.SpecificSelectStatement <em>Specific Select Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.SpecificSelectStatement
	 * @generated
	 */
	public Adapter createSpecificSelectStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBDatabaseDefinition <em>RDB Database Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBDatabaseDefinition
	 * @generated
	 */
	public Adapter createRDBDatabaseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTableSpaceReference <em>RDB Table Space Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTableSpaceReference
	 * @generated
	 */
	public Adapter createRDBTableSpaceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBUserDefinition <em>RDB User Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBUserDefinition
	 * @generated
	 */
	public Adapter createRDBUserDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTableSpaceDefinition <em>RDB Table Space Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTableSpaceDefinition
	 * @generated
	 */
	public Adapter createRDBTableSpaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTableDefinition <em>RDB Table Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTableDefinition
	 * @generated
	 */
	public Adapter createRDBTableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBColumnDefinition <em>RDB Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBColumnDefinition
	 * @generated
	 */
	public Adapter createRDBColumnDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBViewDefinition <em>RDB View Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBViewDefinition
	 * @generated
	 */
	public Adapter createRDBViewDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBCursorDefinition <em>RDB Cursor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBCursorDefinition
	 * @generated
	 */
	public Adapter createRDBCursorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBIndex <em>RDB Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBIndex
	 * @generated
	 */
	public Adapter createRDBIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBIndexColumn <em>RDB Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBIndexColumn
	 * @generated
	 */
	public Adapter createRDBIndexColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTrigger <em>RDB Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTrigger
	 * @generated
	 */
	public Adapter createRDBTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBConstraint <em>RDB Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBConstraint
	 * @generated
	 */
	public Adapter createRDBConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBCheckConstraint <em>RDB Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBCheckConstraint
	 * @generated
	 */
	public Adapter createRDBCheckConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBRefIntegrity <em>RDB Ref Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBRefIntegrity
	 * @generated
	 */
	public Adapter createRDBRefIntegrityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBUniqueKey <em>RDB Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBUniqueKey
	 * @generated
	 */
	public Adapter createRDBUniqueKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBConnectStatement <em>RDB Connect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBConnectStatement
	 * @generated
	 */
	public Adapter createRDBConnectStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBSelectStatement <em>RDB Select Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBSelectStatement
	 * @generated
	 */
	public Adapter createRDBSelectStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBInsertStatement <em>RDB Insert Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBInsertStatement
	 * @generated
	 */
	public Adapter createRDBInsertStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBModifyStatement <em>RDB Modify Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBModifyStatement
	 * @generated
	 */
	public Adapter createRDBModifyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBUpdateStatement <em>RDB Update Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBUpdateStatement
	 * @generated
	 */
	public Adapter createRDBUpdateStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBCursorStatement <em>RDB Cursor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBCursorStatement
	 * @generated
	 */
	public Adapter createRDBCursorStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBOpenCursorStatement <em>RDB Open Cursor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBOpenCursorStatement
	 * @generated
	 */
	public Adapter createRDBOpenCursorStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBFetchCursorStatement <em>RDB Fetch Cursor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBFetchCursorStatement
	 * @generated
	 */
	public Adapter createRDBFetchCursorStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBHostVariableReference <em>RDB Host Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBHostVariableReference
	 * @generated
	 */
	public Adapter createRDBHostVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBSelectExpression <em>RDB Select Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBSelectExpression
	 * @generated
	 */
	public Adapter createRDBSelectExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTableReference <em>RDB Table Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTableReference
	 * @generated
	 */
	public Adapter createRDBTableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTableAlias <em>RDB Table Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTableAlias
	 * @generated
	 */
	public Adapter createRDBTableAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBColumnReference <em>RDB Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBColumnReference
	 * @generated
	 */
	public Adapter createRDBColumnReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBDataBaseType <em>RDB Data Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBDataBaseType
	 * @generated
	 */
	public Adapter createRDBDataBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBUserType <em>RDB User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBUserType
	 * @generated
	 */
	public Adapter createRDBUserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTableSpaceType <em>RDB Table Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTableSpaceType
	 * @generated
	 */
	public Adapter createRDBTableSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTableType <em>RDB Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTableType
	 * @generated
	 */
	public Adapter createRDBTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBViewType <em>RDB View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBViewType
	 * @generated
	 */
	public Adapter createRDBViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBCursorType <em>RDB Cursor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBCursorType
	 * @generated
	 */
	public Adapter createRDBCursorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBColumnType <em>RDB Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBColumnType
	 * @generated
	 */
	public Adapter createRDBColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBInteger <em>RDB Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBInteger
	 * @generated
	 */
	public Adapter createRDBIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBInt <em>RDB Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBInt
	 * @generated
	 */
	public Adapter createRDBIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBReal <em>RDB Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBReal
	 * @generated
	 */
	public Adapter createRDBRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBFloat <em>RDB Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBFloat
	 * @generated
	 */
	public Adapter createRDBFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBDecimal <em>RDB Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBDecimal
	 * @generated
	 */
	public Adapter createRDBDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBNumber <em>RDB Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBNumber
	 * @generated
	 */
	public Adapter createRDBNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBLong <em>RDB Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBLong
	 * @generated
	 */
	public Adapter createRDBLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBChar <em>RDB Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBChar
	 * @generated
	 */
	public Adapter createRDBCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBVarchar <em>RDB Varchar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBVarchar
	 * @generated
	 */
	public Adapter createRDBVarcharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBString <em>RDB String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBString
	 * @generated
	 */
	public Adapter createRDBStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBRaw <em>RDB Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBRaw
	 * @generated
	 */
	public Adapter createRDBRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBDate <em>RDB Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBDate
	 * @generated
	 */
	public Adapter createRDBDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBTimestamp <em>RDB Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBTimestamp
	 * @generated
	 */
	public Adapter createRDBTimestampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBRowid <em>RDB Rowid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBRowid
	 * @generated
	 */
	public Adapter createRDBRowidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBBoolean <em>RDB Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBBoolean
	 * @generated
	 */
	public Adapter createRDBBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBBlob <em>RDB Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBBlob
	 * @generated
	 */
	public Adapter createRDBBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBClob <em>RDB Clob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBClob
	 * @generated
	 */
	public Adapter createRDBClobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBNClob <em>RDBN Clob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBNClob
	 * @generated
	 */
	public Adapter createRDBNClobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBBFile <em>RDBB File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBBFile
	 * @generated
	 */
	public Adapter createRDBBFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBDeleteStatement <em>RDB Delete Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBDeleteStatement
	 * @generated
	 */
	public Adapter createRDBDeleteStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBCloseCursorStatement <em>RDB Close Cursor Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBCloseCursorStatement
	 * @generated
	 */
	public Adapter createRDBCloseCursorStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link astm.RDBHostVariableExpression <em>RDB Host Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see astm.RDBHostVariableExpression
	 * @generated
	 */
	public Adapter createRDBHostVariableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.plsql.astm.util.Visitable <em>Visitable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.plsql.astm.util.Visitable
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
