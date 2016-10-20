/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.delphi/model/astm.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.delphi.astm.util;

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
	R visiting(org.xtext.example.delphi.astm.util.@NonNull Visitable visitable);

	R visitAccessKind(org.xtext.example.delphi.astm.@NonNull AccessKind object);
	R visitActualParameter(org.xtext.example.delphi.astm.@NonNull ActualParameter object);
	R visitActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ActualParameterExpression object);
	R visitAdd(org.xtext.example.delphi.astm.@NonNull Add object);
	R visitAddressOf(org.xtext.example.delphi.astm.@NonNull AddressOf object);
	R visitAggregateExpression(org.xtext.example.delphi.astm.@NonNull AggregateExpression object);
	R visitAggregateScope(org.xtext.example.delphi.astm.@NonNull AggregateScope object);
	R visitAggregateType(org.xtext.example.delphi.astm.@NonNull AggregateType object);
	R visitAggregateTypeDefinition(org.xtext.example.delphi.astm.@NonNull AggregateTypeDefinition object);
	R visitAnd(org.xtext.example.delphi.astm.@NonNull And object);
	R visitAnnotationExpression(org.xtext.example.delphi.astm.@NonNull AnnotationExpression object);
	R visitAnnotationType(org.xtext.example.delphi.astm.@NonNull AnnotationType object);
	R visitArrayAccess(org.xtext.example.delphi.astm.@NonNull ArrayAccess object);
	R visitArrayType(org.xtext.example.delphi.astm.@NonNull ArrayType object);
	R visitAssign(org.xtext.example.delphi.astm.@NonNull Assign object);
	R visitBinaryExpression(org.xtext.example.delphi.astm.@NonNull BinaryExpression object);
	R visitBinaryOperator(org.xtext.example.delphi.astm.@NonNull BinaryOperator object);
	R visitBitAnd(org.xtext.example.delphi.astm.@NonNull BitAnd object);
	R visitBitFieldDefinition(org.xtext.example.delphi.astm.@NonNull BitFieldDefinition object);
	R visitBitLeftShift(org.xtext.example.delphi.astm.@NonNull BitLeftShift object);
	R visitBitLiteral(org.xtext.example.delphi.astm.@NonNull BitLiteral object);
	R visitBitNot(org.xtext.example.delphi.astm.@NonNull BitNot object);
	R visitBitOr(org.xtext.example.delphi.astm.@NonNull BitOr object);
	R visitBitRightShift(org.xtext.example.delphi.astm.@NonNull BitRightShift object);
	R visitBitXor(org.xtext.example.delphi.astm.@NonNull BitXor object);
	R visitBlockScope(org.xtext.example.delphi.astm.@NonNull BlockScope object);
	R visitBlockStatement(org.xtext.example.delphi.astm.@NonNull BlockStatement object);
	R visitBoolean(org.xtext.example.delphi.astm.@NonNull Boolean object);
	R visitBooleanLiteral(org.xtext.example.delphi.astm.@NonNull BooleanLiteral object);
	R visitBreakStatement(org.xtext.example.delphi.astm.@NonNull BreakStatement object);
	R visitByReferenceActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByReferenceActualParameterExpression object);
	R visitByReferenceFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByReferenceFormalParameterType object);
	R visitByValueActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByValueActualParameterExpression object);
	R visitByValueFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByValueFormalParameterType object);
	R visitByte(org.xtext.example.delphi.astm.@NonNull Byte object);
	R visitCaseBlock(org.xtext.example.delphi.astm.@NonNull CaseBlock object);
	R visitCastExpression(org.xtext.example.delphi.astm.@NonNull CastExpression object);
	R visitCatchBlock(org.xtext.example.delphi.astm.@NonNull CatchBlock object);
	R visitCharLiteral(org.xtext.example.delphi.astm.@NonNull CharLiteral object);
	R visitCharacter(org.xtext.example.delphi.astm.@NonNull Character object);
	R visitClassType(org.xtext.example.delphi.astm.@NonNull ClassType object);
	R visitCollectionType(org.xtext.example.delphi.astm.@NonNull CollectionType object);
	R visitComment(org.xtext.example.delphi.astm.@NonNull Comment object);
	R visitCompilationUnit(org.xtext.example.delphi.astm.@NonNull CompilationUnit object);
	R visitConditionalExpression(org.xtext.example.delphi.astm.@NonNull ConditionalExpression object);
	R visitConstructedType(org.xtext.example.delphi.astm.@NonNull ConstructedType object);
	R visitContinueStatement(org.xtext.example.delphi.astm.@NonNull ContinueStatement object);
	R visitDataDefinition(org.xtext.example.delphi.astm.@NonNull DataDefinition object);
	R visitDataType(org.xtext.example.delphi.astm.@NonNull DataType object);
	R visitDeclaration(org.xtext.example.delphi.astm.@NonNull Declaration object);
	R visitDeclarationOrDefinition(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinition object);
	R visitDeclarationOrDefinitionStatement(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinitionStatement object);
	R visitDecrement(org.xtext.example.delphi.astm.@NonNull Decrement object);
	R visitDefaultBlock(org.xtext.example.delphi.astm.@NonNull DefaultBlock object);
	R visitDefinition(org.xtext.example.delphi.astm.@NonNull Definition object);
	R visitDefinitionObject(org.xtext.example.delphi.astm.@NonNull DefinitionObject object);
	R visitDeleteStatement(org.xtext.example.delphi.astm.@NonNull DeleteStatement object);
	R visitDelphiBlockStatement(org.xtext.example.delphi.astm.@NonNull DelphiBlockStatement object);
	R visitDelphiFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull DelphiFunctionCallExpression object);
	R visitDelphiImplementationSection(org.xtext.example.delphi.astm.@NonNull DelphiImplementationSection object);
	R visitDelphiInterfaceSection(org.xtext.example.delphi.astm.@NonNull DelphiInterfaceSection object);
	R visitDelphiUnit(org.xtext.example.delphi.astm.@NonNull DelphiUnit object);
	R visitDelphiWithStatement(org.xtext.example.delphi.astm.@NonNull DelphiWithStatement object);
	R visitDeref(org.xtext.example.delphi.astm.@NonNull Deref object);
	R visitDerivesFrom(org.xtext.example.delphi.astm.@NonNull DerivesFrom object);
	R visitDimension(org.xtext.example.delphi.astm.@NonNull Dimension object);
	R visitDivide(org.xtext.example.delphi.astm.@NonNull Divide object);
	R visitDoWhileStatement(org.xtext.example.delphi.astm.@NonNull DoWhileStatement object);
	R visitDouble(org.xtext.example.delphi.astm.@NonNull Double object);
	R visitEmptyStatement(org.xtext.example.delphi.astm.@NonNull EmptyStatement object);
	R visitEntryDefinition(org.xtext.example.delphi.astm.@NonNull EntryDefinition object);
	R visitEnumLiteralDefinition(org.xtext.example.delphi.astm.@NonNull EnumLiteralDefinition object);
	R visitEnumType(org.xtext.example.delphi.astm.@NonNull EnumType object);
	R visitEqual(org.xtext.example.delphi.astm.@NonNull Equal object);
	R visitExceptionType(org.xtext.example.delphi.astm.@NonNull ExceptionType object);
	R visitExponent(org.xtext.example.delphi.astm.@NonNull Exponent object);
	R visitExpression(org.xtext.example.delphi.astm.@NonNull Expression object);
	R visitExpressionStatement(org.xtext.example.delphi.astm.@NonNull ExpressionStatement object);
	R visitExternal(org.xtext.example.delphi.astm.@NonNull External object);
	R visitFileLocal(org.xtext.example.delphi.astm.@NonNull FileLocal object);
	R visitFloat(org.xtext.example.delphi.astm.@NonNull Float object);
	R visitForCheckAfterStatement(org.xtext.example.delphi.astm.@NonNull ForCheckAfterStatement object);
	R visitForCheckBeforeStatement(org.xtext.example.delphi.astm.@NonNull ForCheckBeforeStatement object);
	R visitForStatement(org.xtext.example.delphi.astm.@NonNull ForStatement object);
	R visitFormalParameterDeclaration(org.xtext.example.delphi.astm.@NonNull FormalParameterDeclaration object);
	R visitFormalParameterDefinition(org.xtext.example.delphi.astm.@NonNull FormalParameterDefinition object);
	R visitFormalParameterType(org.xtext.example.delphi.astm.@NonNull FormalParameterType object);
	R visitFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull FunctionCallExpression object);
	R visitFunctionDeclaration(org.xtext.example.delphi.astm.@NonNull FunctionDeclaration object);
	R visitFunctionDefinition(org.xtext.example.delphi.astm.@NonNull FunctionDefinition object);
	R visitFunctionMemberAttribute(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttribute object);
	R visitFunctionMemberAttributes(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttributes object);
	R visitFunctionPersistent(org.xtext.example.delphi.astm.@NonNull FunctionPersistent object);
	R visitFunctionScope(org.xtext.example.delphi.astm.@NonNull FunctionScope object);
	R visitFunctionType(org.xtext.example.delphi.astm.@NonNull FunctionType object);
	R visitGASTMObject(org.xtext.example.delphi.astm.@NonNull GASTMObject object);
	R visitGASTMSemanticObject(org.xtext.example.delphi.astm.@NonNull GASTMSemanticObject object);
	R visitGASTMSourceObject(org.xtext.example.delphi.astm.@NonNull GASTMSourceObject object);
	R visitGASTMSyntaxObject(org.xtext.example.delphi.astm.@NonNull GASTMSyntaxObject object);
	R visitGlobalScope(org.xtext.example.delphi.astm.@NonNull GlobalScope object);
	R visitGreater(org.xtext.example.delphi.astm.@NonNull Greater object);
	R visitIdentifierReference(org.xtext.example.delphi.astm.@NonNull IdentifierReference object);
	R visitIfStatement(org.xtext.example.delphi.astm.@NonNull IfStatement object);
	R visitIncludeUnit(org.xtext.example.delphi.astm.@NonNull IncludeUnit object);
	R visitIncrement(org.xtext.example.delphi.astm.@NonNull Increment object);
	R visitInteger(org.xtext.example.delphi.astm.@NonNull Integer object);
	R visitIntegerLiteral(org.xtext.example.delphi.astm.@NonNull IntegerLiteral object);
	R visitJumpStatement(org.xtext.example.delphi.astm.@NonNull JumpStatement object);
	R visitLabelAccess(org.xtext.example.delphi.astm.@NonNull LabelAccess object);
	R visitLabelDefinition(org.xtext.example.delphi.astm.@NonNull LabelDefinition object);
	R visitLabelType(org.xtext.example.delphi.astm.@NonNull LabelType object);
	R visitLabeledStatement(org.xtext.example.delphi.astm.@NonNull LabeledStatement object);
	R visitLess(org.xtext.example.delphi.astm.@NonNull Less object);
	R visitLiteral(org.xtext.example.delphi.astm.@NonNull Literal object);
	R visitLongDouble(org.xtext.example.delphi.astm.@NonNull LongDouble object);
	R visitLongInteger(org.xtext.example.delphi.astm.@NonNull LongInteger object);
	R visitLoopStatement(org.xtext.example.delphi.astm.@NonNull LoopStatement object);
	R visitMacroCall(org.xtext.example.delphi.astm.@NonNull MacroCall object);
	R visitMacroDefinition(org.xtext.example.delphi.astm.@NonNull MacroDefinition object);
	R visitMissingActualParameter(org.xtext.example.delphi.astm.@NonNull MissingActualParameter object);
	R visitModulus(org.xtext.example.delphi.astm.@NonNull Modulus object);
	R visitMultiply(org.xtext.example.delphi.astm.@NonNull Multiply object);
	R visitName(org.xtext.example.delphi.astm.@NonNull Name object);
	R visitNameReference(org.xtext.example.delphi.astm.@NonNull NameReference object);
	R visitNameSpaceDefinition(org.xtext.example.delphi.astm.@NonNull NameSpaceDefinition object);
	R visitNameSpaceType(org.xtext.example.delphi.astm.@NonNull NameSpaceType object);
	R visitNamedType(org.xtext.example.delphi.astm.@NonNull NamedType object);
	R visitNamedTypeDefinition(org.xtext.example.delphi.astm.@NonNull NamedTypeDefinition object);
	R visitNamedTypeReference(org.xtext.example.delphi.astm.@NonNull NamedTypeReference object);
	R visitNegate(org.xtext.example.delphi.astm.@NonNull Negate object);
	R visitNewExpression(org.xtext.example.delphi.astm.@NonNull NewExpression object);
	R visitNoDef(org.xtext.example.delphi.astm.@NonNull NoDef object);
	R visitNonVirtual(org.xtext.example.delphi.astm.@NonNull NonVirtual object);
	R visitNot(org.xtext.example.delphi.astm.@NonNull Not object);
	R visitNotEqual(org.xtext.example.delphi.astm.@NonNull NotEqual object);
	R visitNotGreater(org.xtext.example.delphi.astm.@NonNull NotGreater object);
	R visitNotLess(org.xtext.example.delphi.astm.@NonNull NotLess object);
	R visitOperator(org.xtext.example.delphi.astm.@NonNull Operator object);
	R visitOperatorAssign(org.xtext.example.delphi.astm.@NonNull OperatorAssign object);
	R visitOr(org.xtext.example.delphi.astm.@NonNull Or object);
	R visitOtherSyntaxObject(org.xtext.example.delphi.astm.@NonNull OtherSyntaxObject object);
	R visitPerClassMember(org.xtext.example.delphi.astm.@NonNull PerClassMember object);
	R visitPointerType(org.xtext.example.delphi.astm.@NonNull PointerType object);
	R visitPostDecrement(org.xtext.example.delphi.astm.@NonNull PostDecrement object);
	R visitPostIncrement(org.xtext.example.delphi.astm.@NonNull PostIncrement object);
	R visitPreprocessorElement(org.xtext.example.delphi.astm.@NonNull PreprocessorElement object);
	R visitPrimitiveType(org.xtext.example.delphi.astm.@NonNull PrimitiveType object);
	R visitPrivate(org.xtext.example.delphi.astm.@NonNull Private object);
	R visitProgramScope(org.xtext.example.delphi.astm.@NonNull ProgramScope object);
	R visitProject(org.xtext.example.delphi.astm.@NonNull Project object);
	R visitProtected(org.xtext.example.delphi.astm.@NonNull Protected object);
	R visitPublic(org.xtext.example.delphi.astm.@NonNull Public object);
	R visitPureVirtual(org.xtext.example.delphi.astm.@NonNull PureVirtual object);
	R visitQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull QualifiedIdentifierReference object);
	R visitQualifiedOverData(org.xtext.example.delphi.astm.@NonNull QualifiedOverData object);
	R visitQualifiedOverPointer(org.xtext.example.delphi.astm.@NonNull QualifiedOverPointer object);
	R visitRangeExpression(org.xtext.example.delphi.astm.@NonNull RangeExpression object);
	R visitRangeType(org.xtext.example.delphi.astm.@NonNull RangeType object);
	R visitRealLiteral(org.xtext.example.delphi.astm.@NonNull RealLiteral object);
	R visitReferenceType(org.xtext.example.delphi.astm.@NonNull ReferenceType object);
	R visitReturnStatement(org.xtext.example.delphi.astm.@NonNull ReturnStatement object);
	R visitScope(org.xtext.example.delphi.astm.@NonNull Scope object);
	R visitShortInteger(org.xtext.example.delphi.astm.@NonNull ShortInteger object);
	R visitSourceFile(org.xtext.example.delphi.astm.@NonNull SourceFile object);
	R visitSourceLocation(org.xtext.example.delphi.astm.@NonNull SourceLocation object);
	R visitSpecificConcatString(org.xtext.example.delphi.astm.@NonNull SpecificConcatString object);
	R visitSpecificGreaterEqual(org.xtext.example.delphi.astm.@NonNull SpecificGreaterEqual object);
	R visitSpecificIn(org.xtext.example.delphi.astm.@NonNull SpecificIn object);
	R visitSpecificLessEqual(org.xtext.example.delphi.astm.@NonNull SpecificLessEqual object);
	R visitSpecificLike(org.xtext.example.delphi.astm.@NonNull SpecificLike object);
	R visitSpecificSelectStatement(org.xtext.example.delphi.astm.@NonNull SpecificSelectStatement object);
	R visitSpecificTriggerDefinition(org.xtext.example.delphi.astm.@NonNull SpecificTriggerDefinition object);
	R visitStatement(org.xtext.example.delphi.astm.@NonNull Statement object);
	R visitStorageSpecification(org.xtext.example.delphi.astm.@NonNull StorageSpecification object);
	R visitString(org.xtext.example.delphi.astm.@NonNull String object);
	R visitStringLiteral(org.xtext.example.delphi.astm.@NonNull StringLiteral object);
	R visitStructureType(org.xtext.example.delphi.astm.@NonNull StructureType object);
	R visitSubtract(org.xtext.example.delphi.astm.@NonNull Subtract object);
	R visitSwitchCase(org.xtext.example.delphi.astm.@NonNull SwitchCase object);
	R visitSwitchStatement(org.xtext.example.delphi.astm.@NonNull SwitchStatement object);
	R visitTerminateStatement(org.xtext.example.delphi.astm.@NonNull TerminateStatement object);
	R visitThrowStatement(org.xtext.example.delphi.astm.@NonNull ThrowStatement object);
	R visitTryStatement(org.xtext.example.delphi.astm.@NonNull TryStatement object);
	R visitType(org.xtext.example.delphi.astm.@NonNull Type object);
	R visitTypeDefinition(org.xtext.example.delphi.astm.@NonNull TypeDefinition object);
	R visitTypeQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull TypeQualifiedIdentifierReference object);
	R visitTypeReference(org.xtext.example.delphi.astm.@NonNull TypeReference object);
	R visitTypesCatchBlock(org.xtext.example.delphi.astm.@NonNull TypesCatchBlock object);
	R visitUnaryExpression(org.xtext.example.delphi.astm.@NonNull UnaryExpression object);
	R visitUnaryOperator(org.xtext.example.delphi.astm.@NonNull UnaryOperator object);
	R visitUnaryPlus(org.xtext.example.delphi.astm.@NonNull UnaryPlus object);
	R visitUnionType(org.xtext.example.delphi.astm.@NonNull UnionType object);
	R visitUnnamedTypeReference(org.xtext.example.delphi.astm.@NonNull UnnamedTypeReference object);
	R visitVariableCatchBlock(org.xtext.example.delphi.astm.@NonNull VariableCatchBlock object);
	R visitVariableDeclaration(org.xtext.example.delphi.astm.@NonNull VariableDeclaration object);
	R visitVariableDefinition(org.xtext.example.delphi.astm.@NonNull VariableDefinition object);
	R visitVirtual(org.xtext.example.delphi.astm.@NonNull Virtual object);
	R visitVirtualSpecification(org.xtext.example.delphi.astm.@NonNull VirtualSpecification object);
	R visitVoid(org.xtext.example.delphi.astm.@NonNull Void object);
	R visitWhileStatement(org.xtext.example.delphi.astm.@NonNull WhileStatement object);
	R visitWideCharacter(org.xtext.example.delphi.astm.@NonNull WideCharacter object);
}
