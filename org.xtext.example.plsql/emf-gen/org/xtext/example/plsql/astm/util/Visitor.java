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
import org.eclipse.jdt.annotation.Nullable;

/**
 */
public interface Visitor<R>
{
	/**
	 * Returns an object which is an instance of the given class
	 * associated with this object. Returns <code>null</code> if
	 * no such object can be found.
	 *
	 * @param adapter the adapter class to look up
	 * @return an object of the given class, 
	 *    or <code>null</code> if this object does not
	 *    have an adapter for the given class
	 */
	@Nullable <A> A getAdapter(@NonNull Class<A> adapter);

	/**
	 * Return the result of visiting a visitable for which no more specific pivot type method
	 * is available.
	 */
	R visiting(org.xtext.example.plsql.astm.util.@NonNull Visitable visitable);

	R visitAccessKind(astm.@NonNull AccessKind object);
	R visitActualParameter(astm.@NonNull ActualParameter object);
	R visitActualParameterExpression(astm.@NonNull ActualParameterExpression object);
	R visitAdd(astm.@NonNull Add object);
	R visitAddressOf(astm.@NonNull AddressOf object);
	R visitAggregateExpression(astm.@NonNull AggregateExpression object);
	R visitAggregateScope(astm.@NonNull AggregateScope object);
	R visitAggregateType(astm.@NonNull AggregateType object);
	R visitAggregateTypeDefinition(astm.@NonNull AggregateTypeDefinition object);
	R visitAnd(astm.@NonNull And object);
	R visitAnnotationExpression(astm.@NonNull AnnotationExpression object);
	R visitAnnotationType(astm.@NonNull AnnotationType object);
	R visitArrayAccess(astm.@NonNull ArrayAccess object);
	R visitArrayType(astm.@NonNull ArrayType object);
	R visitAssign(astm.@NonNull Assign object);
	R visitBinaryExpression(astm.@NonNull BinaryExpression object);
	R visitBinaryOperator(astm.@NonNull BinaryOperator object);
	R visitBitAnd(astm.@NonNull BitAnd object);
	R visitBitFieldDefinition(astm.@NonNull BitFieldDefinition object);
	R visitBitLeftShift(astm.@NonNull BitLeftShift object);
	R visitBitLiteral(astm.@NonNull BitLiteral object);
	R visitBitNot(astm.@NonNull BitNot object);
	R visitBitOr(astm.@NonNull BitOr object);
	R visitBitRightShift(astm.@NonNull BitRightShift object);
	R visitBitXor(astm.@NonNull BitXor object);
	R visitBlockScope(astm.@NonNull BlockScope object);
	R visitBlockStatement(astm.@NonNull BlockStatement object);
	R visitBoolean(astm.@NonNull Boolean object);
	R visitBooleanLiteral(astm.@NonNull BooleanLiteral object);
	R visitBreakStatement(astm.@NonNull BreakStatement object);
	R visitByReferenceActualParameterExpression(astm.@NonNull ByReferenceActualParameterExpression object);
	R visitByReferenceFormalParameterType(astm.@NonNull ByReferenceFormalParameterType object);
	R visitByValueActualParameterExpression(astm.@NonNull ByValueActualParameterExpression object);
	R visitByValueFormalParameterType(astm.@NonNull ByValueFormalParameterType object);
	R visitByte(astm.@NonNull Byte object);
	R visitCaseBlock(astm.@NonNull CaseBlock object);
	R visitCastExpression(astm.@NonNull CastExpression object);
	R visitCatchBlock(astm.@NonNull CatchBlock object);
	R visitCharLiteral(astm.@NonNull CharLiteral object);
	R visitCharacter(astm.@NonNull Character object);
	R visitClassType(astm.@NonNull ClassType object);
	R visitCollectionType(astm.@NonNull CollectionType object);
	R visitComment(astm.@NonNull Comment object);
	R visitCompilationUnit(astm.@NonNull CompilationUnit object);
	R visitConditionalExpression(astm.@NonNull ConditionalExpression object);
	R visitConstructedType(astm.@NonNull ConstructedType object);
	R visitContinueStatement(astm.@NonNull ContinueStatement object);
	R visitDataDefinition(astm.@NonNull DataDefinition object);
	R visitDataType(astm.@NonNull DataType object);
	R visitDeclaration(astm.@NonNull Declaration object);
	R visitDeclarationOrDefinition(astm.@NonNull DeclarationOrDefinition object);
	R visitDeclarationOrDefinitionStatement(astm.@NonNull DeclarationOrDefinitionStatement object);
	R visitDecrement(astm.@NonNull Decrement object);
	R visitDefaultBlock(astm.@NonNull DefaultBlock object);
	R visitDefinition(astm.@NonNull Definition object);
	R visitDefinitionObject(astm.@NonNull DefinitionObject object);
	R visitDeleteStatement(astm.@NonNull DeleteStatement object);
	R visitDeref(astm.@NonNull Deref object);
	R visitDerivesFrom(astm.@NonNull DerivesFrom object);
	R visitDimension(astm.@NonNull Dimension object);
	R visitDivide(astm.@NonNull Divide object);
	R visitDoWhileStatement(astm.@NonNull DoWhileStatement object);
	R visitDouble(astm.@NonNull Double object);
	R visitEmptyStatement(astm.@NonNull EmptyStatement object);
	R visitEntryDefinition(astm.@NonNull EntryDefinition object);
	R visitEnumLiteralDefinition(astm.@NonNull EnumLiteralDefinition object);
	R visitEnumType(astm.@NonNull EnumType object);
	R visitEqual(astm.@NonNull Equal object);
	R visitExceptionType(astm.@NonNull ExceptionType object);
	R visitExponent(astm.@NonNull Exponent object);
	R visitExpression(astm.@NonNull Expression object);
	R visitExpressionStatement(astm.@NonNull ExpressionStatement object);
	R visitExternal(astm.@NonNull External object);
	R visitFileLocal(astm.@NonNull FileLocal object);
	R visitFloat(astm.@NonNull Float object);
	R visitForCheckAfterStatement(astm.@NonNull ForCheckAfterStatement object);
	R visitForCheckBeforeStatement(astm.@NonNull ForCheckBeforeStatement object);
	R visitForStatement(astm.@NonNull ForStatement object);
	R visitFormalParameterDeclaration(astm.@NonNull FormalParameterDeclaration object);
	R visitFormalParameterDefinition(astm.@NonNull FormalParameterDefinition object);
	R visitFormalParameterType(astm.@NonNull FormalParameterType object);
	R visitFunctionCallExpression(astm.@NonNull FunctionCallExpression object);
	R visitFunctionDeclaration(astm.@NonNull FunctionDeclaration object);
	R visitFunctionDefinition(astm.@NonNull FunctionDefinition object);
	R visitFunctionMemberAttribute(astm.@NonNull FunctionMemberAttribute object);
	R visitFunctionMemberAttributes(astm.@NonNull FunctionMemberAttributes object);
	R visitFunctionPersistent(astm.@NonNull FunctionPersistent object);
	R visitFunctionScope(astm.@NonNull FunctionScope object);
	R visitFunctionType(astm.@NonNull FunctionType object);
	R visitGASTMObject(astm.@NonNull GASTMObject object);
	R visitGASTMSemanticObject(astm.@NonNull GASTMSemanticObject object);
	R visitGASTMSourceObject(astm.@NonNull GASTMSourceObject object);
	R visitGASTMSyntaxObject(astm.@NonNull GASTMSyntaxObject object);
	R visitGlobalScope(astm.@NonNull GlobalScope object);
	R visitGreater(astm.@NonNull Greater object);
	R visitIdentifierReference(astm.@NonNull IdentifierReference object);
	R visitIfStatement(astm.@NonNull IfStatement object);
	R visitIncludeUnit(astm.@NonNull IncludeUnit object);
	R visitIncrement(astm.@NonNull Increment object);
	R visitInteger(astm.@NonNull Integer object);
	R visitIntegerlLiteral(astm.@NonNull IntegerlLiteral object);
	R visitJumpStatement(astm.@NonNull JumpStatement object);
	R visitLabelAccess(astm.@NonNull LabelAccess object);
	R visitLabelDefinition(astm.@NonNull LabelDefinition object);
	R visitLabelType(astm.@NonNull LabelType object);
	R visitLabeledStatement(astm.@NonNull LabeledStatement object);
	R visitLess(astm.@NonNull Less object);
	R visitLiteral(astm.@NonNull Literal object);
	R visitLongDouble(astm.@NonNull LongDouble object);
	R visitLongInteger(astm.@NonNull LongInteger object);
	R visitLoopStatement(astm.@NonNull LoopStatement object);
	R visitMacroCall(astm.@NonNull MacroCall object);
	R visitMacroDefinition(astm.@NonNull MacroDefinition object);
	R visitMissingActualParameter(astm.@NonNull MissingActualParameter object);
	R visitModulus(astm.@NonNull Modulus object);
	R visitMultiply(astm.@NonNull Multiply object);
	R visitName(astm.@NonNull Name object);
	R visitNameReference(astm.@NonNull NameReference object);
	R visitNameSpaceDefinition(astm.@NonNull NameSpaceDefinition object);
	R visitNameSpaceType(astm.@NonNull NameSpaceType object);
	R visitNamedType(astm.@NonNull NamedType object);
	R visitNamedTypeDefinition(astm.@NonNull NamedTypeDefinition object);
	R visitNamedTypeReference(astm.@NonNull NamedTypeReference object);
	R visitNegate(astm.@NonNull Negate object);
	R visitNewExpression(astm.@NonNull NewExpression object);
	R visitNoDef(astm.@NonNull NoDef object);
	R visitNonVirtual(astm.@NonNull NonVirtual object);
	R visitNot(astm.@NonNull Not object);
	R visitNotEqual(astm.@NonNull NotEqual object);
	R visitNotGreater(astm.@NonNull NotGreater object);
	R visitNotLess(astm.@NonNull NotLess object);
	R visitOperatorAssign(astm.@NonNull OperatorAssign object);
	R visitOr(astm.@NonNull Or object);
	R visitOtherSyntaxObject(astm.@NonNull OtherSyntaxObject object);
	R visitPerClassMember(astm.@NonNull PerClassMember object);
	R visitPointerType(astm.@NonNull PointerType object);
	R visitPostDecrement(astm.@NonNull PostDecrement object);
	R visitPostIncrement(astm.@NonNull PostIncrement object);
	R visitPreprocessorElement(astm.@NonNull PreprocessorElement object);
	R visitPrimitiveType(astm.@NonNull PrimitiveType object);
	R visitPrivate(astm.@NonNull Private object);
	R visitProgramScope(astm.@NonNull ProgramScope object);
	R visitProject(astm.@NonNull Project object);
	R visitProtected(astm.@NonNull Protected object);
	R visitPublic(astm.@NonNull Public object);
	R visitPureVirtual(astm.@NonNull PureVirtual object);
	R visitQualifiedIdentifierReference(astm.@NonNull QualifiedIdentifierReference object);
	R visitQualifiedOverData(astm.@NonNull QualifiedOverData object);
	R visitQualifiedOverPointer(astm.@NonNull QualifiedOverPointer object);
	R visitRDBBFile(astm.@NonNull RDBBFile object);
	R visitRDBBlob(astm.@NonNull RDBBlob object);
	R visitRDBBoolean(astm.@NonNull RDBBoolean object);
	R visitRDBChar(astm.@NonNull RDBChar object);
	R visitRDBCheckConstraint(astm.@NonNull RDBCheckConstraint object);
	R visitRDBClob(astm.@NonNull RDBClob object);
	R visitRDBCloseCursorStatement(astm.@NonNull RDBCloseCursorStatement object);
	R visitRDBColumnDefinition(astm.@NonNull RDBColumnDefinition object);
	R visitRDBColumnReference(astm.@NonNull RDBColumnReference object);
	R visitRDBColumnType(astm.@NonNull RDBColumnType object);
	R visitRDBConnectStatement(astm.@NonNull RDBConnectStatement object);
	R visitRDBConstraint(astm.@NonNull RDBConstraint object);
	R visitRDBCursorDefinition(astm.@NonNull RDBCursorDefinition object);
	R visitRDBCursorStatement(astm.@NonNull RDBCursorStatement object);
	R visitRDBCursorType(astm.@NonNull RDBCursorType object);
	R visitRDBDataBaseType(astm.@NonNull RDBDataBaseType object);
	R visitRDBDatabaseDefinition(astm.@NonNull RDBDatabaseDefinition object);
	R visitRDBDate(astm.@NonNull RDBDate object);
	R visitRDBDecimal(astm.@NonNull RDBDecimal object);
	R visitRDBDeleteStatement(astm.@NonNull RDBDeleteStatement object);
	R visitRDBFetchCursorStatement(astm.@NonNull RDBFetchCursorStatement object);
	R visitRDBFloat(astm.@NonNull RDBFloat object);
	R visitRDBHostVariableExpression(astm.@NonNull RDBHostVariableExpression object);
	R visitRDBHostVariableReference(astm.@NonNull RDBHostVariableReference object);
	R visitRDBIndex(astm.@NonNull RDBIndex object);
	R visitRDBIndexColumn(astm.@NonNull RDBIndexColumn object);
	R visitRDBInsertStatement(astm.@NonNull RDBInsertStatement object);
	R visitRDBInt(astm.@NonNull RDBInt object);
	R visitRDBInteger(astm.@NonNull RDBInteger object);
	R visitRDBLong(astm.@NonNull RDBLong object);
	R visitRDBModifyStatement(astm.@NonNull RDBModifyStatement object);
	R visitRDBNClob(astm.@NonNull RDBNClob object);
	R visitRDBNumber(astm.@NonNull RDBNumber object);
	R visitRDBOpenCursorStatement(astm.@NonNull RDBOpenCursorStatement object);
	R visitRDBRaw(astm.@NonNull RDBRaw object);
	R visitRDBReal(astm.@NonNull RDBReal object);
	R visitRDBRefIntegrity(astm.@NonNull RDBRefIntegrity object);
	R visitRDBRowid(astm.@NonNull RDBRowid object);
	R visitRDBSelectExpression(astm.@NonNull RDBSelectExpression object);
	R visitRDBSelectStatement(astm.@NonNull RDBSelectStatement object);
	R visitRDBString(astm.@NonNull RDBString object);
	R visitRDBTableAlias(astm.@NonNull RDBTableAlias object);
	R visitRDBTableDefinition(astm.@NonNull RDBTableDefinition object);
	R visitRDBTableReference(astm.@NonNull RDBTableReference object);
	R visitRDBTableSpaceDefinition(astm.@NonNull RDBTableSpaceDefinition object);
	R visitRDBTableSpaceReference(astm.@NonNull RDBTableSpaceReference object);
	R visitRDBTableSpaceType(astm.@NonNull RDBTableSpaceType object);
	R visitRDBTableType(astm.@NonNull RDBTableType object);
	R visitRDBTimestamp(astm.@NonNull RDBTimestamp object);
	R visitRDBTrigger(astm.@NonNull RDBTrigger object);
	R visitRDBUniqueKey(astm.@NonNull RDBUniqueKey object);
	R visitRDBUpdateStatement(astm.@NonNull RDBUpdateStatement object);
	R visitRDBUserDefinition(astm.@NonNull RDBUserDefinition object);
	R visitRDBUserType(astm.@NonNull RDBUserType object);
	R visitRDBVarchar(astm.@NonNull RDBVarchar object);
	R visitRDBViewDefinition(astm.@NonNull RDBViewDefinition object);
	R visitRDBViewType(astm.@NonNull RDBViewType object);
	R visitRangeExpression(astm.@NonNull RangeExpression object);
	R visitRangeType(astm.@NonNull RangeType object);
	R visitRealLiteral(astm.@NonNull RealLiteral object);
	R visitReferenceType(astm.@NonNull ReferenceType object);
	R visitReturnStatement(astm.@NonNull ReturnStatement object);
	R visitScope(astm.@NonNull Scope object);
	R visitShortInteger(astm.@NonNull ShortInteger object);
	R visitSourceFile(astm.@NonNull SourceFile object);
	R visitSourceLocation(astm.@NonNull SourceLocation object);
	R visitSpecificConcatString(astm.@NonNull SpecificConcatString object);
	R visitSpecificGreaterEqual(astm.@NonNull SpecificGreaterEqual object);
	R visitSpecificIn(astm.@NonNull SpecificIn object);
	R visitSpecificLessEqual(astm.@NonNull SpecificLessEqual object);
	R visitSpecificLike(astm.@NonNull SpecificLike object);
	R visitSpecificSelectStatement(astm.@NonNull SpecificSelectStatement object);
	R visitSpecificTriggerDefinition(astm.@NonNull SpecificTriggerDefinition object);
	R visitStatement(astm.@NonNull Statement object);
	R visitStorageSpecification(astm.@NonNull StorageSpecification object);
	R visitString(astm.@NonNull String object);
	R visitStringLiteral(astm.@NonNull StringLiteral object);
	R visitStructureType(astm.@NonNull StructureType object);
	R visitSubtract(astm.@NonNull Subtract object);
	R visitSwitchCase(astm.@NonNull SwitchCase object);
	R visitSwitchStatement(astm.@NonNull SwitchStatement object);
	R visitTerminateStatement(astm.@NonNull TerminateStatement object);
	R visitThrowStatement(astm.@NonNull ThrowStatement object);
	R visitTryStatement(astm.@NonNull TryStatement object);
	R visitType(astm.@NonNull Type object);
	R visitTypeDefinition(astm.@NonNull TypeDefinition object);
	R visitTypeQualifiedIdentifierReference(astm.@NonNull TypeQualifiedIdentifierReference object);
	R visitTypeReference(astm.@NonNull TypeReference object);
	R visitTypesCatchBlock(astm.@NonNull TypesCatchBlock object);
	R visitUnaryExpression(astm.@NonNull UnaryExpression object);
	R visitUnaryOperator(astm.@NonNull UnaryOperator object);
	R visitUnaryPlus(astm.@NonNull UnaryPlus object);
	R visitUnionType(astm.@NonNull UnionType object);
	R visitUnnamedTypeReference(astm.@NonNull UnnamedTypeReference object);
	R visitVariableCatchBlock(astm.@NonNull VariableCatchBlock object);
	R visitVariableDeclaration(astm.@NonNull VariableDeclaration object);
	R visitVariableDefinition(astm.@NonNull VariableDefinition object);
	R visitVirtual(astm.@NonNull Virtual object);
	R visitVirtualSpecification(astm.@NonNull VirtualSpecification object);
	R visitVoid(astm.@NonNull Void object);
	R visitWhileStatement(astm.@NonNull WhileStatement object);
	R visitWideCharacter(astm.@NonNull WideCharacter object);
}
