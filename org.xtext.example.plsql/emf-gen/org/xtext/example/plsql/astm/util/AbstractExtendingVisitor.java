/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.plsql/model/astm.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.plsql.astm.util;

import org.eclipse.jdt.annotation.NonNull;

/**
 * An AbstractExtendingVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingVisitor<R, C>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractExtendingVisitor(C context) {
		super(context);
	}	

	@Override
	public R visitAccessKind(astm.@NonNull AccessKind object) {
		return visiting(object);
	}

	@Override
	public R visitActualParameter(astm.@NonNull ActualParameter object) {
		return visiting(object);
	}

	@Override
	public R visitActualParameterExpression(astm.@NonNull ActualParameterExpression object) {
		return visitActualParameter(object);
	}

	@Override
	public R visitAdd(astm.@NonNull Add object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitAddressOf(astm.@NonNull AddressOf object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitAggregateExpression(astm.@NonNull AggregateExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitAggregateScope(astm.@NonNull AggregateScope object) {
		return visitScope(object);
	}

	@Override
	public R visitAggregateType(astm.@NonNull AggregateType object) {
		return visitDataType(object);
	}

	@Override
	public R visitAggregateTypeDefinition(astm.@NonNull AggregateTypeDefinition object) {
		return visitTypeDefinition(object);
	}

	@Override
	public R visitAnd(astm.@NonNull And object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitAnnotationExpression(astm.@NonNull AnnotationExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitAnnotationType(astm.@NonNull AnnotationType object) {
		return visitAggregateType(object);
	}

	@Override
	public R visitArrayAccess(astm.@NonNull ArrayAccess object) {
		return visitExpression(object);
	}

	@Override
	public R visitArrayType(astm.@NonNull ArrayType object) {
		return visitConstructedType(object);
	}

	@Override
	public R visitAssign(astm.@NonNull Assign object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitBinaryExpression(astm.@NonNull BinaryExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitBinaryOperator(astm.@NonNull BinaryOperator object) {
		return visiting(object);
	}

	@Override
	public R visitBitAnd(astm.@NonNull BitAnd object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitBitFieldDefinition(astm.@NonNull BitFieldDefinition object) {
		return visitDataDefinition(object);
	}

	@Override
	public R visitBitLeftShift(astm.@NonNull BitLeftShift object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitBitLiteral(astm.@NonNull BitLiteral object) {
		return visitLiteral(object);
	}

	@Override
	public R visitBitNot(astm.@NonNull BitNot object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitBitOr(astm.@NonNull BitOr object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitBitRightShift(astm.@NonNull BitRightShift object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitBitXor(astm.@NonNull BitXor object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitBlockScope(astm.@NonNull BlockScope object) {
		return visitScope(object);
	}

	@Override
	public R visitBlockStatement(astm.@NonNull BlockStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitBoolean(astm.@NonNull Boolean object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitBooleanLiteral(astm.@NonNull BooleanLiteral object) {
		return visitLiteral(object);
	}

	@Override
	public R visitBreakStatement(astm.@NonNull BreakStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitByReferenceActualParameterExpression(astm.@NonNull ByReferenceActualParameterExpression object) {
		return visitActualParameterExpression(object);
	}

	@Override
	public R visitByReferenceFormalParameterType(astm.@NonNull ByReferenceFormalParameterType object) {
		return visitFormalParameterType(object);
	}

	@Override
	public R visitByValueActualParameterExpression(astm.@NonNull ByValueActualParameterExpression object) {
		return visitActualParameterExpression(object);
	}

	@Override
	public R visitByValueFormalParameterType(astm.@NonNull ByValueFormalParameterType object) {
		return visitFormalParameterType(object);
	}

	@Override
	public R visitByte(astm.@NonNull Byte object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitCaseBlock(astm.@NonNull CaseBlock object) {
		return visitSwitchCase(object);
	}

	@Override
	public R visitCastExpression(astm.@NonNull CastExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitCatchBlock(astm.@NonNull CatchBlock object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitCharLiteral(astm.@NonNull CharLiteral object) {
		return visitLiteral(object);
	}

	@Override
	public R visitCharacter(astm.@NonNull Character object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitClassType(astm.@NonNull ClassType object) {
		return visitAggregateType(object);
	}

	@Override
	public R visitCollectionType(astm.@NonNull CollectionType object) {
		return visitConstructedType(object);
	}

	@Override
	public R visitComment(astm.@NonNull Comment object) {
		return visitPreprocessorElement(object);
	}

	@Override
	public R visitCompilationUnit(astm.@NonNull CompilationUnit object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitConditionalExpression(astm.@NonNull ConditionalExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitConstructedType(astm.@NonNull ConstructedType object) {
		return visitDataType(object);
	}

	@Override
	public R visitContinueStatement(astm.@NonNull ContinueStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitDataDefinition(astm.@NonNull DataDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitDataType(astm.@NonNull DataType object) {
		return visiting(object);
	}

	@Override
	public R visitDeclaration(astm.@NonNull Declaration object) {
		return visitDeclarationOrDefinition(object);
	}

	@Override
	public R visitDeclarationOrDefinition(astm.@NonNull DeclarationOrDefinition object) {
		return visitDefinitionObject(object);
	}

	@Override
	public R visitDeclarationOrDefinitionStatement(astm.@NonNull DeclarationOrDefinitionStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitDecrement(astm.@NonNull Decrement object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitDefaultBlock(astm.@NonNull DefaultBlock object) {
		return visitSwitchCase(object);
	}

	@Override
	public R visitDefinition(astm.@NonNull Definition object) {
		return visitDeclarationOrDefinition(object);
	}

	@Override
	public R visitDefinitionObject(astm.@NonNull DefinitionObject object) {
		return visitGASTMSyntaxObject(object);
	}

	@Override
	public R visitDeleteStatement(astm.@NonNull DeleteStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitDeref(astm.@NonNull Deref object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitDerivesFrom(astm.@NonNull DerivesFrom object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitDimension(astm.@NonNull Dimension object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitDivide(astm.@NonNull Divide object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitDoWhileStatement(astm.@NonNull DoWhileStatement object) {
		return visitLoopStatement(object);
	}

	@Override
	public R visitDouble(astm.@NonNull Double object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitEmptyStatement(astm.@NonNull EmptyStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitEntryDefinition(astm.@NonNull EntryDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitEnumLiteralDefinition(astm.@NonNull EnumLiteralDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitEnumType(astm.@NonNull EnumType object) {
		return visitDataType(object);
	}

	@Override
	public R visitEqual(astm.@NonNull Equal object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitExceptionType(astm.@NonNull ExceptionType object) {
		return visitDataType(object);
	}

	@Override
	public R visitExponent(astm.@NonNull Exponent object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitExpression(astm.@NonNull Expression object) {
		return visitGASTMSyntaxObject(object);
	}

	@Override
	public R visitExpressionStatement(astm.@NonNull ExpressionStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitExternal(astm.@NonNull External object) {
		return visitStorageSpecification(object);
	}

	@Override
	public R visitFileLocal(astm.@NonNull FileLocal object) {
		return visitStorageSpecification(object);
	}

	@Override
	public R visitFloat(astm.@NonNull Float object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitForCheckAfterStatement(astm.@NonNull ForCheckAfterStatement object) {
		return visitForStatement(object);
	}

	@Override
	public R visitForCheckBeforeStatement(astm.@NonNull ForCheckBeforeStatement object) {
		return visitForStatement(object);
	}

	@Override
	public R visitForStatement(astm.@NonNull ForStatement object) {
		return visitLoopStatement(object);
	}

	@Override
	public R visitFormalParameterDeclaration(astm.@NonNull FormalParameterDeclaration object) {
		return visitDeclaration(object);
	}

	@Override
	public R visitFormalParameterDefinition(astm.@NonNull FormalParameterDefinition object) {
		return visitDataDefinition(object);
	}

	@Override
	public R visitFormalParameterType(astm.@NonNull FormalParameterType object) {
		return visitDataType(object);
	}

	@Override
	public R visitFunctionCallExpression(astm.@NonNull FunctionCallExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitFunctionDeclaration(astm.@NonNull FunctionDeclaration object) {
		return visitDeclaration(object);
	}

	@Override
	public R visitFunctionDefinition(astm.@NonNull FunctionDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitFunctionMemberAttribute(astm.@NonNull FunctionMemberAttribute object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitFunctionMemberAttributes(astm.@NonNull FunctionMemberAttributes object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionPersistent(astm.@NonNull FunctionPersistent object) {
		return visitStorageSpecification(object);
	}

	@Override
	public R visitFunctionScope(astm.@NonNull FunctionScope object) {
		return visitScope(object);
	}

	@Override
	public R visitFunctionType(astm.@NonNull FunctionType object) {
		return visitType(object);
	}

	@Override
	public R visitGASTMObject(astm.@NonNull GASTMObject object) {
		return visiting(object);
	}

	@Override
	public R visitGASTMSemanticObject(astm.@NonNull GASTMSemanticObject object) {
		return visiting(object);
	}

	@Override
	public R visitGASTMSourceObject(astm.@NonNull GASTMSourceObject object) {
		return visiting(object);
	}

	@Override
	public R visitGASTMSyntaxObject(astm.@NonNull GASTMSyntaxObject object) {
		return visitGASTMObject(object);
	}

	@Override
	public R visitGlobalScope(astm.@NonNull GlobalScope object) {
		return visitScope(object);
	}

	@Override
	public R visitGreater(astm.@NonNull Greater object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitIdentifierReference(astm.@NonNull IdentifierReference object) {
		return visitNameReference(object);
	}

	@Override
	public R visitIfStatement(astm.@NonNull IfStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitIncludeUnit(astm.@NonNull IncludeUnit object) {
		return visitPreprocessorElement(object);
	}

	@Override
	public R visitIncrement(astm.@NonNull Increment object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitInteger(astm.@NonNull Integer object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitIntegerlLiteral(astm.@NonNull IntegerlLiteral object) {
		return visitLiteral(object);
	}

	@Override
	public R visitJumpStatement(astm.@NonNull JumpStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitLabelAccess(astm.@NonNull LabelAccess object) {
		return visitExpression(object);
	}

	@Override
	public R visitLabelDefinition(astm.@NonNull LabelDefinition object) {
		return visitDefinitionObject(object);
	}

	@Override
	public R visitLabelType(astm.@NonNull LabelType object) {
		return visitType(object);
	}

	@Override
	public R visitLabeledStatement(astm.@NonNull LabeledStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitLess(astm.@NonNull Less object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitLiteral(astm.@NonNull Literal object) {
		return visitExpression(object);
	}

	@Override
	public R visitLongDouble(astm.@NonNull LongDouble object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitLongInteger(astm.@NonNull LongInteger object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitLoopStatement(astm.@NonNull LoopStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitMacroCall(astm.@NonNull MacroCall object) {
		return visitPreprocessorElement(object);
	}

	@Override
	public R visitMacroDefinition(astm.@NonNull MacroDefinition object) {
		return visitPreprocessorElement(object);
	}

	@Override
	public R visitMissingActualParameter(astm.@NonNull MissingActualParameter object) {
		return visitActualParameter(object);
	}

	@Override
	public R visitModulus(astm.@NonNull Modulus object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitMultiply(astm.@NonNull Multiply object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitName(astm.@NonNull Name object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitNameReference(astm.@NonNull NameReference object) {
		return visitExpression(object);
	}

	@Override
	public R visitNameSpaceDefinition(astm.@NonNull NameSpaceDefinition object) {
		return visitDefinitionObject(object);
	}

	@Override
	public R visitNameSpaceType(astm.@NonNull NameSpaceType object) {
		return visitType(object);
	}

	@Override
	public R visitNamedType(astm.@NonNull NamedType object) {
		return visitDataType(object);
	}

	@Override
	public R visitNamedTypeDefinition(astm.@NonNull NamedTypeDefinition object) {
		return visitTypeDefinition(object);
	}

	@Override
	public R visitNamedTypeReference(astm.@NonNull NamedTypeReference object) {
		return visitTypeReference(object);
	}

	@Override
	public R visitNegate(astm.@NonNull Negate object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitNewExpression(astm.@NonNull NewExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitNoDef(astm.@NonNull NoDef object) {
		return visitStorageSpecification(object);
	}

	@Override
	public R visitNonVirtual(astm.@NonNull NonVirtual object) {
		return visitVirtualSpecification(object);
	}

	@Override
	public R visitNot(astm.@NonNull Not object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitNotEqual(astm.@NonNull NotEqual object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitNotGreater(astm.@NonNull NotGreater object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitNotLess(astm.@NonNull NotLess object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitOperatorAssign(astm.@NonNull OperatorAssign object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitOr(astm.@NonNull Or object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitOtherSyntaxObject(astm.@NonNull OtherSyntaxObject object) {
		return visiting(object);
	}

	@Override
	public R visitPerClassMember(astm.@NonNull PerClassMember object) {
		return visitStorageSpecification(object);
	}

	@Override
	public R visitPointerType(astm.@NonNull PointerType object) {
		return visitConstructedType(object);
	}

	@Override
	public R visitPostDecrement(astm.@NonNull PostDecrement object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitPostIncrement(astm.@NonNull PostIncrement object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitPreprocessorElement(astm.@NonNull PreprocessorElement object) {
		return visitGASTMSyntaxObject(object);
	}

	@Override
	public R visitPrimitiveType(astm.@NonNull PrimitiveType object) {
		return visitDataType(object);
	}

	@Override
	public R visitPrivate(astm.@NonNull Private object) {
		return visitAccessKind(object);
	}

	@Override
	public R visitProgramScope(astm.@NonNull ProgramScope object) {
		return visitScope(object);
	}

	@Override
	public R visitProject(astm.@NonNull Project object) {
		return visitGASTMSemanticObject(object);
	}

	@Override
	public R visitProtected(astm.@NonNull Protected object) {
		return visitAccessKind(object);
	}

	@Override
	public R visitPublic(astm.@NonNull Public object) {
		return visitAccessKind(object);
	}

	@Override
	public R visitPureVirtual(astm.@NonNull PureVirtual object) {
		return visitVirtualSpecification(object);
	}

	@Override
	public R visitQualifiedIdentifierReference(astm.@NonNull QualifiedIdentifierReference object) {
		return visitNameReference(object);
	}

	@Override
	public R visitQualifiedOverData(astm.@NonNull QualifiedOverData object) {
		return visitQualifiedIdentifierReference(object);
	}

	@Override
	public R visitQualifiedOverPointer(astm.@NonNull QualifiedOverPointer object) {
		return visitQualifiedIdentifierReference(object);
	}

	@Override
	public R visitRDBBFile(astm.@NonNull RDBBFile object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBBlob(astm.@NonNull RDBBlob object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBBoolean(astm.@NonNull RDBBoolean object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBChar(astm.@NonNull RDBChar object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBCheckConstraint(astm.@NonNull RDBCheckConstraint object) {
		return visitRDBConstraint(object);
	}

	@Override
	public R visitRDBClob(astm.@NonNull RDBClob object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBCloseCursorStatement(astm.@NonNull RDBCloseCursorStatement object) {
		return visitRDBCursorStatement(object);
	}

	@Override
	public R visitRDBColumnDefinition(astm.@NonNull RDBColumnDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitRDBColumnReference(astm.@NonNull RDBColumnReference object) {
		return visitIdentifierReference(object);
	}

	@Override
	public R visitRDBColumnType(astm.@NonNull RDBColumnType object) {
		return visitDataType(object);
	}

	@Override
	public R visitRDBConnectStatement(astm.@NonNull RDBConnectStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitRDBConstraint(astm.@NonNull RDBConstraint object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitRDBCursorDefinition(astm.@NonNull RDBCursorDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitRDBCursorStatement(astm.@NonNull RDBCursorStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitRDBCursorType(astm.@NonNull RDBCursorType object) {
		return visitDataType(object);
	}

	@Override
	public R visitRDBDataBaseType(astm.@NonNull RDBDataBaseType object) {
		return visitDataType(object);
	}

	@Override
	public R visitRDBDatabaseDefinition(astm.@NonNull RDBDatabaseDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitRDBDate(astm.@NonNull RDBDate object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBDecimal(astm.@NonNull RDBDecimal object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBDeleteStatement(astm.@NonNull RDBDeleteStatement object) {
		return visitRDBModifyStatement(object);
	}

	@Override
	public R visitRDBFetchCursorStatement(astm.@NonNull RDBFetchCursorStatement object) {
		return visitRDBCursorStatement(object);
	}

	@Override
	public R visitRDBFloat(astm.@NonNull RDBFloat object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBHostVariableExpression(astm.@NonNull RDBHostVariableExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitRDBHostVariableReference(astm.@NonNull RDBHostVariableReference object) {
		return visiting(object);
	}

	@Override
	public R visitRDBIndex(astm.@NonNull RDBIndex object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitRDBIndexColumn(astm.@NonNull RDBIndexColumn object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitRDBInsertStatement(astm.@NonNull RDBInsertStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitRDBInt(astm.@NonNull RDBInt object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBInteger(astm.@NonNull RDBInteger object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBLong(astm.@NonNull RDBLong object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBModifyStatement(astm.@NonNull RDBModifyStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitRDBNClob(astm.@NonNull RDBNClob object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBNumber(astm.@NonNull RDBNumber object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBOpenCursorStatement(astm.@NonNull RDBOpenCursorStatement object) {
		return visitRDBCursorStatement(object);
	}

	@Override
	public R visitRDBRaw(astm.@NonNull RDBRaw object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBReal(astm.@NonNull RDBReal object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBRefIntegrity(astm.@NonNull RDBRefIntegrity object) {
		return visitRDBConstraint(object);
	}

	@Override
	public R visitRDBRowid(astm.@NonNull RDBRowid object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBSelectExpression(astm.@NonNull RDBSelectExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitRDBSelectStatement(astm.@NonNull RDBSelectStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitRDBString(astm.@NonNull RDBString object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBTableAlias(astm.@NonNull RDBTableAlias object) {
		return visitIdentifierReference(object);
	}

	@Override
	public R visitRDBTableDefinition(astm.@NonNull RDBTableDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitRDBTableReference(astm.@NonNull RDBTableReference object) {
		return visitIdentifierReference(object);
	}

	@Override
	public R visitRDBTableSpaceDefinition(astm.@NonNull RDBTableSpaceDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitRDBTableSpaceReference(astm.@NonNull RDBTableSpaceReference object) {
		return visiting(object);
	}

	@Override
	public R visitRDBTableSpaceType(astm.@NonNull RDBTableSpaceType object) {
		return visitDataType(object);
	}

	@Override
	public R visitRDBTableType(astm.@NonNull RDBTableType object) {
		return visitDataType(object);
	}

	@Override
	public R visitRDBTimestamp(astm.@NonNull RDBTimestamp object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBTrigger(astm.@NonNull RDBTrigger object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitRDBUniqueKey(astm.@NonNull RDBUniqueKey object) {
		return visitRDBConstraint(object);
	}

	@Override
	public R visitRDBUpdateStatement(astm.@NonNull RDBUpdateStatement object) {
		return visitRDBModifyStatement(object);
	}

	@Override
	public R visitRDBUserDefinition(astm.@NonNull RDBUserDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitRDBUserType(astm.@NonNull RDBUserType object) {
		return visitDataType(object);
	}

	@Override
	public R visitRDBVarchar(astm.@NonNull RDBVarchar object) {
		return visitRDBColumnType(object);
	}

	@Override
	public R visitRDBViewDefinition(astm.@NonNull RDBViewDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitRDBViewType(astm.@NonNull RDBViewType object) {
		return visitDataType(object);
	}

	@Override
	public R visitRangeExpression(astm.@NonNull RangeExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitRangeType(astm.@NonNull RangeType object) {
		return visitConstructedType(object);
	}

	@Override
	public R visitRealLiteral(astm.@NonNull RealLiteral object) {
		return visitLiteral(object);
	}

	@Override
	public R visitReferenceType(astm.@NonNull ReferenceType object) {
		return visitConstructedType(object);
	}

	@Override
	public R visitReturnStatement(astm.@NonNull ReturnStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitScope(astm.@NonNull Scope object) {
		return visitGASTMSemanticObject(object);
	}

	@Override
	public R visitShortInteger(astm.@NonNull ShortInteger object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitSourceFile(astm.@NonNull SourceFile object) {
		return visitGASTMSourceObject(object);
	}

	@Override
	public R visitSourceLocation(astm.@NonNull SourceLocation object) {
		return visitGASTMSourceObject(object);
	}

	@Override
	public R visitSpecificConcatString(astm.@NonNull SpecificConcatString object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitSpecificGreaterEqual(astm.@NonNull SpecificGreaterEqual object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitSpecificIn(astm.@NonNull SpecificIn object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitSpecificLessEqual(astm.@NonNull SpecificLessEqual object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitSpecificLike(astm.@NonNull SpecificLike object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitSpecificSelectStatement(astm.@NonNull SpecificSelectStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitSpecificTriggerDefinition(astm.@NonNull SpecificTriggerDefinition object) {
		return visitDefinition(object);
	}

	@Override
	public R visitStatement(astm.@NonNull Statement object) {
		return visitGASTMSyntaxObject(object);
	}

	@Override
	public R visitStorageSpecification(astm.@NonNull StorageSpecification object) {
		return visiting(object);
	}

	@Override
	public R visitString(astm.@NonNull String object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitStringLiteral(astm.@NonNull StringLiteral object) {
		return visitLiteral(object);
	}

	@Override
	public R visitStructureType(astm.@NonNull StructureType object) {
		return visitAggregateType(object);
	}

	@Override
	public R visitSubtract(astm.@NonNull Subtract object) {
		return visitBinaryOperator(object);
	}

	@Override
	public R visitSwitchCase(astm.@NonNull SwitchCase object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitSwitchStatement(astm.@NonNull SwitchStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitTerminateStatement(astm.@NonNull TerminateStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitThrowStatement(astm.@NonNull ThrowStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitTryStatement(astm.@NonNull TryStatement object) {
		return visitStatement(object);
	}

	@Override
	public R visitType(astm.@NonNull Type object) {
		return visitGASTMSyntaxObject(object);
	}

	@Override
	public R visitTypeDefinition(astm.@NonNull TypeDefinition object) {
		return visitDefinitionObject(object);
	}

	@Override
	public R visitTypeQualifiedIdentifierReference(astm.@NonNull TypeQualifiedIdentifierReference object) {
		return visitNameReference(object);
	}

	@Override
	public R visitTypeReference(astm.@NonNull TypeReference object) {
		return visitType(object);
	}

	@Override
	public R visitTypesCatchBlock(astm.@NonNull TypesCatchBlock object) {
		return visitCatchBlock(object);
	}

	@Override
	public R visitUnaryExpression(astm.@NonNull UnaryExpression object) {
		return visitExpression(object);
	}

	@Override
	public R visitUnaryOperator(astm.@NonNull UnaryOperator object) {
		return visiting(object);
	}

	@Override
	public R visitUnaryPlus(astm.@NonNull UnaryPlus object) {
		return visitUnaryOperator(object);
	}

	@Override
	public R visitUnionType(astm.@NonNull UnionType object) {
		return visitAggregateType(object);
	}

	@Override
	public R visitUnnamedTypeReference(astm.@NonNull UnnamedTypeReference object) {
		return visitTypeReference(object);
	}

	@Override
	public R visitVariableCatchBlock(astm.@NonNull VariableCatchBlock object) {
		return visitCatchBlock(object);
	}

	@Override
	public R visitVariableDeclaration(astm.@NonNull VariableDeclaration object) {
		return visitDeclaration(object);
	}

	@Override
	public R visitVariableDefinition(astm.@NonNull VariableDefinition object) {
		return visitDataDefinition(object);
	}

	@Override
	public R visitVirtual(astm.@NonNull Virtual object) {
		return visitVirtualSpecification(object);
	}

	@Override
	public R visitVirtualSpecification(astm.@NonNull VirtualSpecification object) {
		return visitOtherSyntaxObject(object);
	}

	@Override
	public R visitVoid(astm.@NonNull Void object) {
		return visitPrimitiveType(object);
	}

	@Override
	public R visitWhileStatement(astm.@NonNull WhileStatement object) {
		return visitLoopStatement(object);
	}

	@Override
	public R visitWideCharacter(astm.@NonNull WideCharacter object) {
		return visitPrimitiveType(object);
	}
}
