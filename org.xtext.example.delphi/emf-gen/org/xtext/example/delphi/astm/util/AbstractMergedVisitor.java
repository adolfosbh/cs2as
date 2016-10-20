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

/**
 * An AbstractMergedVisitor merges all visits direct to visiting().
 * This can be used by a decorating visitor to execute shared code before redispatching to a decorated visitor.
 */
public abstract class AbstractMergedVisitor<R, C>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected AbstractMergedVisitor(C context) {
		super(context);
	}

	@Override
	public R visitAccessKind(org.xtext.example.delphi.astm.@NonNull AccessKind object) {
		return visiting(object);
	}

	@Override
	public R visitActualParameter(org.xtext.example.delphi.astm.@NonNull ActualParameter object) {
		return visiting(object);
	}

	@Override
	public R visitActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ActualParameterExpression object) {
		return visiting(object);
	}

	@Override
	public R visitAdd(org.xtext.example.delphi.astm.@NonNull Add object) {
		return visiting(object);
	}

	@Override
	public R visitAddressOf(org.xtext.example.delphi.astm.@NonNull AddressOf object) {
		return visiting(object);
	}

	@Override
	public R visitAggregateExpression(org.xtext.example.delphi.astm.@NonNull AggregateExpression object) {
		return visiting(object);
	}

	@Override
	public R visitAggregateScope(org.xtext.example.delphi.astm.@NonNull AggregateScope object) {
		return visiting(object);
	}

	@Override
	public R visitAggregateType(org.xtext.example.delphi.astm.@NonNull AggregateType object) {
		return visiting(object);
	}

	@Override
	public R visitAggregateTypeDefinition(org.xtext.example.delphi.astm.@NonNull AggregateTypeDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitAnd(org.xtext.example.delphi.astm.@NonNull And object) {
		return visiting(object);
	}

	@Override
	public R visitAnnotationExpression(org.xtext.example.delphi.astm.@NonNull AnnotationExpression object) {
		return visiting(object);
	}

	@Override
	public R visitAnnotationType(org.xtext.example.delphi.astm.@NonNull AnnotationType object) {
		return visiting(object);
	}

	@Override
	public R visitArrayAccess(org.xtext.example.delphi.astm.@NonNull ArrayAccess object) {
		return visiting(object);
	}

	@Override
	public R visitArrayType(org.xtext.example.delphi.astm.@NonNull ArrayType object) {
		return visiting(object);
	}

	@Override
	public R visitAssign(org.xtext.example.delphi.astm.@NonNull Assign object) {
		return visiting(object);
	}

	@Override
	public R visitBinaryExpression(org.xtext.example.delphi.astm.@NonNull BinaryExpression object) {
		return visiting(object);
	}

	@Override
	public R visitBinaryOperator(org.xtext.example.delphi.astm.@NonNull BinaryOperator object) {
		return visiting(object);
	}

	@Override
	public R visitBitAnd(org.xtext.example.delphi.astm.@NonNull BitAnd object) {
		return visiting(object);
	}

	@Override
	public R visitBitFieldDefinition(org.xtext.example.delphi.astm.@NonNull BitFieldDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitBitLeftShift(org.xtext.example.delphi.astm.@NonNull BitLeftShift object) {
		return visiting(object);
	}

	@Override
	public R visitBitLiteral(org.xtext.example.delphi.astm.@NonNull BitLiteral object) {
		return visiting(object);
	}

	@Override
	public R visitBitNot(org.xtext.example.delphi.astm.@NonNull BitNot object) {
		return visiting(object);
	}

	@Override
	public R visitBitOr(org.xtext.example.delphi.astm.@NonNull BitOr object) {
		return visiting(object);
	}

	@Override
	public R visitBitRightShift(org.xtext.example.delphi.astm.@NonNull BitRightShift object) {
		return visiting(object);
	}

	@Override
	public R visitBitXor(org.xtext.example.delphi.astm.@NonNull BitXor object) {
		return visiting(object);
	}

	@Override
	public R visitBlockScope(org.xtext.example.delphi.astm.@NonNull BlockScope object) {
		return visiting(object);
	}

	@Override
	public R visitBlockStatement(org.xtext.example.delphi.astm.@NonNull BlockStatement object) {
		return visiting(object);
	}

	@Override
	public R visitBoolean(org.xtext.example.delphi.astm.@NonNull Boolean object) {
		return visiting(object);
	}

	@Override
	public R visitBooleanLiteral(org.xtext.example.delphi.astm.@NonNull BooleanLiteral object) {
		return visiting(object);
	}

	@Override
	public R visitBreakStatement(org.xtext.example.delphi.astm.@NonNull BreakStatement object) {
		return visiting(object);
	}

	@Override
	public R visitByReferenceActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByReferenceActualParameterExpression object) {
		return visiting(object);
	}

	@Override
	public R visitByReferenceFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByReferenceFormalParameterType object) {
		return visiting(object);
	}

	@Override
	public R visitByValueActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByValueActualParameterExpression object) {
		return visiting(object);
	}

	@Override
	public R visitByValueFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByValueFormalParameterType object) {
		return visiting(object);
	}

	@Override
	public R visitByte(org.xtext.example.delphi.astm.@NonNull Byte object) {
		return visiting(object);
	}

	@Override
	public R visitCaseBlock(org.xtext.example.delphi.astm.@NonNull CaseBlock object) {
		return visiting(object);
	}

	@Override
	public R visitCastExpression(org.xtext.example.delphi.astm.@NonNull CastExpression object) {
		return visiting(object);
	}

	@Override
	public R visitCatchBlock(org.xtext.example.delphi.astm.@NonNull CatchBlock object) {
		return visiting(object);
	}

	@Override
	public R visitCharLiteral(org.xtext.example.delphi.astm.@NonNull CharLiteral object) {
		return visiting(object);
	}

	@Override
	public R visitCharacter(org.xtext.example.delphi.astm.@NonNull Character object) {
		return visiting(object);
	}

	@Override
	public R visitClassType(org.xtext.example.delphi.astm.@NonNull ClassType object) {
		return visiting(object);
	}

	@Override
	public R visitCollectionType(org.xtext.example.delphi.astm.@NonNull CollectionType object) {
		return visiting(object);
	}

	@Override
	public R visitComment(org.xtext.example.delphi.astm.@NonNull Comment object) {
		return visiting(object);
	}

	@Override
	public R visitCompilationUnit(org.xtext.example.delphi.astm.@NonNull CompilationUnit object) {
		return visiting(object);
	}

	@Override
	public R visitConditionalExpression(org.xtext.example.delphi.astm.@NonNull ConditionalExpression object) {
		return visiting(object);
	}

	@Override
	public R visitConstructedType(org.xtext.example.delphi.astm.@NonNull ConstructedType object) {
		return visiting(object);
	}

	@Override
	public R visitContinueStatement(org.xtext.example.delphi.astm.@NonNull ContinueStatement object) {
		return visiting(object);
	}

	@Override
	public R visitDataDefinition(org.xtext.example.delphi.astm.@NonNull DataDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitDataType(org.xtext.example.delphi.astm.@NonNull DataType object) {
		return visiting(object);
	}

	@Override
	public R visitDeclaration(org.xtext.example.delphi.astm.@NonNull Declaration object) {
		return visiting(object);
	}

	@Override
	public R visitDeclarationOrDefinition(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitDeclarationOrDefinitionStatement(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinitionStatement object) {
		return visiting(object);
	}

	@Override
	public R visitDecrement(org.xtext.example.delphi.astm.@NonNull Decrement object) {
		return visiting(object);
	}

	@Override
	public R visitDefaultBlock(org.xtext.example.delphi.astm.@NonNull DefaultBlock object) {
		return visiting(object);
	}

	@Override
	public R visitDefinition(org.xtext.example.delphi.astm.@NonNull Definition object) {
		return visiting(object);
	}

	@Override
	public R visitDefinitionObject(org.xtext.example.delphi.astm.@NonNull DefinitionObject object) {
		return visiting(object);
	}

	@Override
	public R visitDeleteStatement(org.xtext.example.delphi.astm.@NonNull DeleteStatement object) {
		return visiting(object);
	}

	@Override
	public R visitDelphiBlockStatement(org.xtext.example.delphi.astm.@NonNull DelphiBlockStatement object) {
		return visiting(object);
	}

	@Override
	public R visitDelphiFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull DelphiFunctionCallExpression object) {
		return visiting(object);
	}

	@Override
	public R visitDelphiImplementationSection(org.xtext.example.delphi.astm.@NonNull DelphiImplementationSection object) {
		return visiting(object);
	}

	@Override
	public R visitDelphiInterfaceSection(org.xtext.example.delphi.astm.@NonNull DelphiInterfaceSection object) {
		return visiting(object);
	}

	@Override
	public R visitDelphiUnit(org.xtext.example.delphi.astm.@NonNull DelphiUnit object) {
		return visiting(object);
	}

	@Override
	public R visitDelphiWithStatement(org.xtext.example.delphi.astm.@NonNull DelphiWithStatement object) {
		return visiting(object);
	}

	@Override
	public R visitDeref(org.xtext.example.delphi.astm.@NonNull Deref object) {
		return visiting(object);
	}

	@Override
	public R visitDerivesFrom(org.xtext.example.delphi.astm.@NonNull DerivesFrom object) {
		return visiting(object);
	}

	@Override
	public R visitDimension(org.xtext.example.delphi.astm.@NonNull Dimension object) {
		return visiting(object);
	}

	@Override
	public R visitDivide(org.xtext.example.delphi.astm.@NonNull Divide object) {
		return visiting(object);
	}

	@Override
	public R visitDoWhileStatement(org.xtext.example.delphi.astm.@NonNull DoWhileStatement object) {
		return visiting(object);
	}

	@Override
	public R visitDouble(org.xtext.example.delphi.astm.@NonNull Double object) {
		return visiting(object);
	}

	@Override
	public R visitEmptyStatement(org.xtext.example.delphi.astm.@NonNull EmptyStatement object) {
		return visiting(object);
	}

	@Override
	public R visitEntryDefinition(org.xtext.example.delphi.astm.@NonNull EntryDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitEnumLiteralDefinition(org.xtext.example.delphi.astm.@NonNull EnumLiteralDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitEnumType(org.xtext.example.delphi.astm.@NonNull EnumType object) {
		return visiting(object);
	}

	@Override
	public R visitEqual(org.xtext.example.delphi.astm.@NonNull Equal object) {
		return visiting(object);
	}

	@Override
	public R visitExceptionType(org.xtext.example.delphi.astm.@NonNull ExceptionType object) {
		return visiting(object);
	}

	@Override
	public R visitExponent(org.xtext.example.delphi.astm.@NonNull Exponent object) {
		return visiting(object);
	}

	@Override
	public R visitExpression(org.xtext.example.delphi.astm.@NonNull Expression object) {
		return visiting(object);
	}

	@Override
	public R visitExpressionStatement(org.xtext.example.delphi.astm.@NonNull ExpressionStatement object) {
		return visiting(object);
	}

	@Override
	public R visitExternal(org.xtext.example.delphi.astm.@NonNull External object) {
		return visiting(object);
	}

	@Override
	public R visitFileLocal(org.xtext.example.delphi.astm.@NonNull FileLocal object) {
		return visiting(object);
	}

	@Override
	public R visitFloat(org.xtext.example.delphi.astm.@NonNull Float object) {
		return visiting(object);
	}

	@Override
	public R visitForCheckAfterStatement(org.xtext.example.delphi.astm.@NonNull ForCheckAfterStatement object) {
		return visiting(object);
	}

	@Override
	public R visitForCheckBeforeStatement(org.xtext.example.delphi.astm.@NonNull ForCheckBeforeStatement object) {
		return visiting(object);
	}

	@Override
	public R visitForStatement(org.xtext.example.delphi.astm.@NonNull ForStatement object) {
		return visiting(object);
	}

	@Override
	public R visitFormalParameterDeclaration(org.xtext.example.delphi.astm.@NonNull FormalParameterDeclaration object) {
		return visiting(object);
	}

	@Override
	public R visitFormalParameterDefinition(org.xtext.example.delphi.astm.@NonNull FormalParameterDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitFormalParameterType(org.xtext.example.delphi.astm.@NonNull FormalParameterType object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull FunctionCallExpression object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionDeclaration(org.xtext.example.delphi.astm.@NonNull FunctionDeclaration object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionDefinition(org.xtext.example.delphi.astm.@NonNull FunctionDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionMemberAttribute(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttribute object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionMemberAttributes(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttributes object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionPersistent(org.xtext.example.delphi.astm.@NonNull FunctionPersistent object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionScope(org.xtext.example.delphi.astm.@NonNull FunctionScope object) {
		return visiting(object);
	}

	@Override
	public R visitFunctionType(org.xtext.example.delphi.astm.@NonNull FunctionType object) {
		return visiting(object);
	}

	@Override
	public R visitGASTMObject(org.xtext.example.delphi.astm.@NonNull GASTMObject object) {
		return visiting(object);
	}

	@Override
	public R visitGASTMSemanticObject(org.xtext.example.delphi.astm.@NonNull GASTMSemanticObject object) {
		return visiting(object);
	}

	@Override
	public R visitGASTMSourceObject(org.xtext.example.delphi.astm.@NonNull GASTMSourceObject object) {
		return visiting(object);
	}

	@Override
	public R visitGASTMSyntaxObject(org.xtext.example.delphi.astm.@NonNull GASTMSyntaxObject object) {
		return visiting(object);
	}

	@Override
	public R visitGlobalScope(org.xtext.example.delphi.astm.@NonNull GlobalScope object) {
		return visiting(object);
	}

	@Override
	public R visitGreater(org.xtext.example.delphi.astm.@NonNull Greater object) {
		return visiting(object);
	}

	@Override
	public R visitIdentifierReference(org.xtext.example.delphi.astm.@NonNull IdentifierReference object) {
		return visiting(object);
	}

	@Override
	public R visitIfStatement(org.xtext.example.delphi.astm.@NonNull IfStatement object) {
		return visiting(object);
	}

	@Override
	public R visitIncludeUnit(org.xtext.example.delphi.astm.@NonNull IncludeUnit object) {
		return visiting(object);
	}

	@Override
	public R visitIncrement(org.xtext.example.delphi.astm.@NonNull Increment object) {
		return visiting(object);
	}

	@Override
	public R visitInteger(org.xtext.example.delphi.astm.@NonNull Integer object) {
		return visiting(object);
	}

	@Override
	public R visitIntegerLiteral(org.xtext.example.delphi.astm.@NonNull IntegerLiteral object) {
		return visiting(object);
	}

	@Override
	public R visitJumpStatement(org.xtext.example.delphi.astm.@NonNull JumpStatement object) {
		return visiting(object);
	}

	@Override
	public R visitLabelAccess(org.xtext.example.delphi.astm.@NonNull LabelAccess object) {
		return visiting(object);
	}

	@Override
	public R visitLabelDefinition(org.xtext.example.delphi.astm.@NonNull LabelDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitLabelType(org.xtext.example.delphi.astm.@NonNull LabelType object) {
		return visiting(object);
	}

	@Override
	public R visitLabeledStatement(org.xtext.example.delphi.astm.@NonNull LabeledStatement object) {
		return visiting(object);
	}

	@Override
	public R visitLess(org.xtext.example.delphi.astm.@NonNull Less object) {
		return visiting(object);
	}

	@Override
	public R visitLiteral(org.xtext.example.delphi.astm.@NonNull Literal object) {
		return visiting(object);
	}

	@Override
	public R visitLongDouble(org.xtext.example.delphi.astm.@NonNull LongDouble object) {
		return visiting(object);
	}

	@Override
	public R visitLongInteger(org.xtext.example.delphi.astm.@NonNull LongInteger object) {
		return visiting(object);
	}

	@Override
	public R visitLoopStatement(org.xtext.example.delphi.astm.@NonNull LoopStatement object) {
		return visiting(object);
	}

	@Override
	public R visitMacroCall(org.xtext.example.delphi.astm.@NonNull MacroCall object) {
		return visiting(object);
	}

	@Override
	public R visitMacroDefinition(org.xtext.example.delphi.astm.@NonNull MacroDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitMissingActualParameter(org.xtext.example.delphi.astm.@NonNull MissingActualParameter object) {
		return visiting(object);
	}

	@Override
	public R visitModulus(org.xtext.example.delphi.astm.@NonNull Modulus object) {
		return visiting(object);
	}

	@Override
	public R visitMultiply(org.xtext.example.delphi.astm.@NonNull Multiply object) {
		return visiting(object);
	}

	@Override
	public R visitName(org.xtext.example.delphi.astm.@NonNull Name object) {
		return visiting(object);
	}

	@Override
	public R visitNameReference(org.xtext.example.delphi.astm.@NonNull NameReference object) {
		return visiting(object);
	}

	@Override
	public R visitNameSpaceDefinition(org.xtext.example.delphi.astm.@NonNull NameSpaceDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitNameSpaceType(org.xtext.example.delphi.astm.@NonNull NameSpaceType object) {
		return visiting(object);
	}

	@Override
	public R visitNamedType(org.xtext.example.delphi.astm.@NonNull NamedType object) {
		return visiting(object);
	}

	@Override
	public R visitNamedTypeDefinition(org.xtext.example.delphi.astm.@NonNull NamedTypeDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitNamedTypeReference(org.xtext.example.delphi.astm.@NonNull NamedTypeReference object) {
		return visiting(object);
	}

	@Override
	public R visitNegate(org.xtext.example.delphi.astm.@NonNull Negate object) {
		return visiting(object);
	}

	@Override
	public R visitNewExpression(org.xtext.example.delphi.astm.@NonNull NewExpression object) {
		return visiting(object);
	}

	@Override
	public R visitNoDef(org.xtext.example.delphi.astm.@NonNull NoDef object) {
		return visiting(object);
	}

	@Override
	public R visitNonVirtual(org.xtext.example.delphi.astm.@NonNull NonVirtual object) {
		return visiting(object);
	}

	@Override
	public R visitNot(org.xtext.example.delphi.astm.@NonNull Not object) {
		return visiting(object);
	}

	@Override
	public R visitNotEqual(org.xtext.example.delphi.astm.@NonNull NotEqual object) {
		return visiting(object);
	}

	@Override
	public R visitNotGreater(org.xtext.example.delphi.astm.@NonNull NotGreater object) {
		return visiting(object);
	}

	@Override
	public R visitNotLess(org.xtext.example.delphi.astm.@NonNull NotLess object) {
		return visiting(object);
	}

	@Override
	public R visitOperator(org.xtext.example.delphi.astm.@NonNull Operator object) {
		return visiting(object);
	}

	@Override
	public R visitOperatorAssign(org.xtext.example.delphi.astm.@NonNull OperatorAssign object) {
		return visiting(object);
	}

	@Override
	public R visitOr(org.xtext.example.delphi.astm.@NonNull Or object) {
		return visiting(object);
	}

	@Override
	public R visitOtherSyntaxObject(org.xtext.example.delphi.astm.@NonNull OtherSyntaxObject object) {
		return visiting(object);
	}

	@Override
	public R visitPerClassMember(org.xtext.example.delphi.astm.@NonNull PerClassMember object) {
		return visiting(object);
	}

	@Override
	public R visitPointerType(org.xtext.example.delphi.astm.@NonNull PointerType object) {
		return visiting(object);
	}

	@Override
	public R visitPostDecrement(org.xtext.example.delphi.astm.@NonNull PostDecrement object) {
		return visiting(object);
	}

	@Override
	public R visitPostIncrement(org.xtext.example.delphi.astm.@NonNull PostIncrement object) {
		return visiting(object);
	}

	@Override
	public R visitPreprocessorElement(org.xtext.example.delphi.astm.@NonNull PreprocessorElement object) {
		return visiting(object);
	}

	@Override
	public R visitPrimitiveType(org.xtext.example.delphi.astm.@NonNull PrimitiveType object) {
		return visiting(object);
	}

	@Override
	public R visitPrivate(org.xtext.example.delphi.astm.@NonNull Private object) {
		return visiting(object);
	}

	@Override
	public R visitProgramScope(org.xtext.example.delphi.astm.@NonNull ProgramScope object) {
		return visiting(object);
	}

	@Override
	public R visitProject(org.xtext.example.delphi.astm.@NonNull Project object) {
		return visiting(object);
	}

	@Override
	public R visitProtected(org.xtext.example.delphi.astm.@NonNull Protected object) {
		return visiting(object);
	}

	@Override
	public R visitPublic(org.xtext.example.delphi.astm.@NonNull Public object) {
		return visiting(object);
	}

	@Override
	public R visitPureVirtual(org.xtext.example.delphi.astm.@NonNull PureVirtual object) {
		return visiting(object);
	}

	@Override
	public R visitQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull QualifiedIdentifierReference object) {
		return visiting(object);
	}

	@Override
	public R visitQualifiedOverData(org.xtext.example.delphi.astm.@NonNull QualifiedOverData object) {
		return visiting(object);
	}

	@Override
	public R visitQualifiedOverPointer(org.xtext.example.delphi.astm.@NonNull QualifiedOverPointer object) {
		return visiting(object);
	}

	@Override
	public R visitRangeExpression(org.xtext.example.delphi.astm.@NonNull RangeExpression object) {
		return visiting(object);
	}

	@Override
	public R visitRangeType(org.xtext.example.delphi.astm.@NonNull RangeType object) {
		return visiting(object);
	}

	@Override
	public R visitRealLiteral(org.xtext.example.delphi.astm.@NonNull RealLiteral object) {
		return visiting(object);
	}

	@Override
	public R visitReferenceType(org.xtext.example.delphi.astm.@NonNull ReferenceType object) {
		return visiting(object);
	}

	@Override
	public R visitReturnStatement(org.xtext.example.delphi.astm.@NonNull ReturnStatement object) {
		return visiting(object);
	}

	@Override
	public R visitScope(org.xtext.example.delphi.astm.@NonNull Scope object) {
		return visiting(object);
	}

	@Override
	public R visitShortInteger(org.xtext.example.delphi.astm.@NonNull ShortInteger object) {
		return visiting(object);
	}

	@Override
	public R visitSourceFile(org.xtext.example.delphi.astm.@NonNull SourceFile object) {
		return visiting(object);
	}

	@Override
	public R visitSourceLocation(org.xtext.example.delphi.astm.@NonNull SourceLocation object) {
		return visiting(object);
	}

	@Override
	public R visitSpecificConcatString(org.xtext.example.delphi.astm.@NonNull SpecificConcatString object) {
		return visiting(object);
	}

	@Override
	public R visitSpecificGreaterEqual(org.xtext.example.delphi.astm.@NonNull SpecificGreaterEqual object) {
		return visiting(object);
	}

	@Override
	public R visitSpecificIn(org.xtext.example.delphi.astm.@NonNull SpecificIn object) {
		return visiting(object);
	}

	@Override
	public R visitSpecificLessEqual(org.xtext.example.delphi.astm.@NonNull SpecificLessEqual object) {
		return visiting(object);
	}

	@Override
	public R visitSpecificLike(org.xtext.example.delphi.astm.@NonNull SpecificLike object) {
		return visiting(object);
	}

	@Override
	public R visitSpecificSelectStatement(org.xtext.example.delphi.astm.@NonNull SpecificSelectStatement object) {
		return visiting(object);
	}

	@Override
	public R visitSpecificTriggerDefinition(org.xtext.example.delphi.astm.@NonNull SpecificTriggerDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitStatement(org.xtext.example.delphi.astm.@NonNull Statement object) {
		return visiting(object);
	}

	@Override
	public R visitStorageSpecification(org.xtext.example.delphi.astm.@NonNull StorageSpecification object) {
		return visiting(object);
	}

	@Override
	public R visitString(org.xtext.example.delphi.astm.@NonNull String object) {
		return visiting(object);
	}

	@Override
	public R visitStringLiteral(org.xtext.example.delphi.astm.@NonNull StringLiteral object) {
		return visiting(object);
	}

	@Override
	public R visitStructureType(org.xtext.example.delphi.astm.@NonNull StructureType object) {
		return visiting(object);
	}

	@Override
	public R visitSubtract(org.xtext.example.delphi.astm.@NonNull Subtract object) {
		return visiting(object);
	}

	@Override
	public R visitSwitchCase(org.xtext.example.delphi.astm.@NonNull SwitchCase object) {
		return visiting(object);
	}

	@Override
	public R visitSwitchStatement(org.xtext.example.delphi.astm.@NonNull SwitchStatement object) {
		return visiting(object);
	}

	@Override
	public R visitTerminateStatement(org.xtext.example.delphi.astm.@NonNull TerminateStatement object) {
		return visiting(object);
	}

	@Override
	public R visitThrowStatement(org.xtext.example.delphi.astm.@NonNull ThrowStatement object) {
		return visiting(object);
	}

	@Override
	public R visitTryStatement(org.xtext.example.delphi.astm.@NonNull TryStatement object) {
		return visiting(object);
	}

	@Override
	public R visitType(org.xtext.example.delphi.astm.@NonNull Type object) {
		return visiting(object);
	}

	@Override
	public R visitTypeDefinition(org.xtext.example.delphi.astm.@NonNull TypeDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitTypeQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull TypeQualifiedIdentifierReference object) {
		return visiting(object);
	}

	@Override
	public R visitTypeReference(org.xtext.example.delphi.astm.@NonNull TypeReference object) {
		return visiting(object);
	}

	@Override
	public R visitTypesCatchBlock(org.xtext.example.delphi.astm.@NonNull TypesCatchBlock object) {
		return visiting(object);
	}

	@Override
	public R visitUnaryExpression(org.xtext.example.delphi.astm.@NonNull UnaryExpression object) {
		return visiting(object);
	}

	@Override
	public R visitUnaryOperator(org.xtext.example.delphi.astm.@NonNull UnaryOperator object) {
		return visiting(object);
	}

	@Override
	public R visitUnaryPlus(org.xtext.example.delphi.astm.@NonNull UnaryPlus object) {
		return visiting(object);
	}

	@Override
	public R visitUnionType(org.xtext.example.delphi.astm.@NonNull UnionType object) {
		return visiting(object);
	}

	@Override
	public R visitUnnamedTypeReference(org.xtext.example.delphi.astm.@NonNull UnnamedTypeReference object) {
		return visiting(object);
	}

	@Override
	public R visitVariableCatchBlock(org.xtext.example.delphi.astm.@NonNull VariableCatchBlock object) {
		return visiting(object);
	}

	@Override
	public R visitVariableDeclaration(org.xtext.example.delphi.astm.@NonNull VariableDeclaration object) {
		return visiting(object);
	}

	@Override
	public R visitVariableDefinition(org.xtext.example.delphi.astm.@NonNull VariableDefinition object) {
		return visiting(object);
	}

	@Override
	public R visitVirtual(org.xtext.example.delphi.astm.@NonNull Virtual object) {
		return visiting(object);
	}

	@Override
	public R visitVirtualSpecification(org.xtext.example.delphi.astm.@NonNull VirtualSpecification object) {
		return visiting(object);
	}

	@Override
	public R visitVoid(org.xtext.example.delphi.astm.@NonNull Void object) {
		return visiting(object);
	}

	@Override
	public R visitWhileStatement(org.xtext.example.delphi.astm.@NonNull WhileStatement object) {
		return visiting(object);
	}

	@Override
	public R visitWideCharacter(org.xtext.example.delphi.astm.@NonNull WideCharacter object) {
		return visiting(object);
	}
}
