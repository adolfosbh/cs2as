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
 * An AbstractDelegatingVisitor delegates all visits.
 */
public abstract class AbstractDelegatingVisitor<R, C, @NonNull D extends Visitor<R>>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected final @NonNull D delegate;
	
	protected AbstractDelegatingVisitor(@NonNull D delegate, C context) {
		super(context);
	//	assert delegate != null : "cannot decorate a null visitor"; //$NON-NLS-1$
		this.delegate = delegate;		
	//	delegate.setUndecoratedVisitor(this);
	}

	/**
	 * Delegates to my decorated visitor.
	 */
	//	public @NonNull DecorableVisitor<R> createNestedVisitor() {
	//		return delegate.createNestedVisitor();
	//	}

	/**
	 * Obtains the visitor that I decorate.
	 * 
	 * @return my decorated visitor
	 */
	protected final @NonNull D getDelegate() {
		return delegate;
	}

	@Override
	public R visiting(org.xtext.example.delphi.astm.util.@NonNull Visitable visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitAccessKind(org.xtext.example.delphi.astm.@NonNull AccessKind object) {
		return delegate.visitAccessKind(object);
	}

	@Override
	public R visitActualParameter(org.xtext.example.delphi.astm.@NonNull ActualParameter object) {
		return delegate.visitActualParameter(object);
	}

	@Override
	public R visitActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ActualParameterExpression object) {
		return delegate.visitActualParameterExpression(object);
	}

	@Override
	public R visitAdd(org.xtext.example.delphi.astm.@NonNull Add object) {
		return delegate.visitAdd(object);
	}

	@Override
	public R visitAddressOf(org.xtext.example.delphi.astm.@NonNull AddressOf object) {
		return delegate.visitAddressOf(object);
	}

	@Override
	public R visitAggregateExpression(org.xtext.example.delphi.astm.@NonNull AggregateExpression object) {
		return delegate.visitAggregateExpression(object);
	}

	@Override
	public R visitAggregateScope(org.xtext.example.delphi.astm.@NonNull AggregateScope object) {
		return delegate.visitAggregateScope(object);
	}

	@Override
	public R visitAggregateType(org.xtext.example.delphi.astm.@NonNull AggregateType object) {
		return delegate.visitAggregateType(object);
	}

	@Override
	public R visitAggregateTypeDefinition(org.xtext.example.delphi.astm.@NonNull AggregateTypeDefinition object) {
		return delegate.visitAggregateTypeDefinition(object);
	}

	@Override
	public R visitAnd(org.xtext.example.delphi.astm.@NonNull And object) {
		return delegate.visitAnd(object);
	}

	@Override
	public R visitAnnotationExpression(org.xtext.example.delphi.astm.@NonNull AnnotationExpression object) {
		return delegate.visitAnnotationExpression(object);
	}

	@Override
	public R visitAnnotationType(org.xtext.example.delphi.astm.@NonNull AnnotationType object) {
		return delegate.visitAnnotationType(object);
	}

	@Override
	public R visitArrayAccess(org.xtext.example.delphi.astm.@NonNull ArrayAccess object) {
		return delegate.visitArrayAccess(object);
	}

	@Override
	public R visitArrayType(org.xtext.example.delphi.astm.@NonNull ArrayType object) {
		return delegate.visitArrayType(object);
	}

	@Override
	public R visitAssign(org.xtext.example.delphi.astm.@NonNull Assign object) {
		return delegate.visitAssign(object);
	}

	@Override
	public R visitBinaryExpression(org.xtext.example.delphi.astm.@NonNull BinaryExpression object) {
		return delegate.visitBinaryExpression(object);
	}

	@Override
	public R visitBinaryOperator(org.xtext.example.delphi.astm.@NonNull BinaryOperator object) {
		return delegate.visitBinaryOperator(object);
	}

	@Override
	public R visitBitAnd(org.xtext.example.delphi.astm.@NonNull BitAnd object) {
		return delegate.visitBitAnd(object);
	}

	@Override
	public R visitBitFieldDefinition(org.xtext.example.delphi.astm.@NonNull BitFieldDefinition object) {
		return delegate.visitBitFieldDefinition(object);
	}

	@Override
	public R visitBitLeftShift(org.xtext.example.delphi.astm.@NonNull BitLeftShift object) {
		return delegate.visitBitLeftShift(object);
	}

	@Override
	public R visitBitLiteral(org.xtext.example.delphi.astm.@NonNull BitLiteral object) {
		return delegate.visitBitLiteral(object);
	}

	@Override
	public R visitBitNot(org.xtext.example.delphi.astm.@NonNull BitNot object) {
		return delegate.visitBitNot(object);
	}

	@Override
	public R visitBitOr(org.xtext.example.delphi.astm.@NonNull BitOr object) {
		return delegate.visitBitOr(object);
	}

	@Override
	public R visitBitRightShift(org.xtext.example.delphi.astm.@NonNull BitRightShift object) {
		return delegate.visitBitRightShift(object);
	}

	@Override
	public R visitBitXor(org.xtext.example.delphi.astm.@NonNull BitXor object) {
		return delegate.visitBitXor(object);
	}

	@Override
	public R visitBlockScope(org.xtext.example.delphi.astm.@NonNull BlockScope object) {
		return delegate.visitBlockScope(object);
	}

	@Override
	public R visitBlockStatement(org.xtext.example.delphi.astm.@NonNull BlockStatement object) {
		return delegate.visitBlockStatement(object);
	}

	@Override
	public R visitBoolean(org.xtext.example.delphi.astm.@NonNull Boolean object) {
		return delegate.visitBoolean(object);
	}

	@Override
	public R visitBooleanLiteral(org.xtext.example.delphi.astm.@NonNull BooleanLiteral object) {
		return delegate.visitBooleanLiteral(object);
	}

	@Override
	public R visitBreakStatement(org.xtext.example.delphi.astm.@NonNull BreakStatement object) {
		return delegate.visitBreakStatement(object);
	}

	@Override
	public R visitByReferenceActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByReferenceActualParameterExpression object) {
		return delegate.visitByReferenceActualParameterExpression(object);
	}

	@Override
	public R visitByReferenceFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByReferenceFormalParameterType object) {
		return delegate.visitByReferenceFormalParameterType(object);
	}

	@Override
	public R visitByValueActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByValueActualParameterExpression object) {
		return delegate.visitByValueActualParameterExpression(object);
	}

	@Override
	public R visitByValueFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByValueFormalParameterType object) {
		return delegate.visitByValueFormalParameterType(object);
	}

	@Override
	public R visitByte(org.xtext.example.delphi.astm.@NonNull Byte object) {
		return delegate.visitByte(object);
	}

	@Override
	public R visitCaseBlock(org.xtext.example.delphi.astm.@NonNull CaseBlock object) {
		return delegate.visitCaseBlock(object);
	}

	@Override
	public R visitCastExpression(org.xtext.example.delphi.astm.@NonNull CastExpression object) {
		return delegate.visitCastExpression(object);
	}

	@Override
	public R visitCatchBlock(org.xtext.example.delphi.astm.@NonNull CatchBlock object) {
		return delegate.visitCatchBlock(object);
	}

	@Override
	public R visitCharLiteral(org.xtext.example.delphi.astm.@NonNull CharLiteral object) {
		return delegate.visitCharLiteral(object);
	}

	@Override
	public R visitCharacter(org.xtext.example.delphi.astm.@NonNull Character object) {
		return delegate.visitCharacter(object);
	}

	@Override
	public R visitClassType(org.xtext.example.delphi.astm.@NonNull ClassType object) {
		return delegate.visitClassType(object);
	}

	@Override
	public R visitCollectionType(org.xtext.example.delphi.astm.@NonNull CollectionType object) {
		return delegate.visitCollectionType(object);
	}

	@Override
	public R visitComment(org.xtext.example.delphi.astm.@NonNull Comment object) {
		return delegate.visitComment(object);
	}

	@Override
	public R visitCompilationUnit(org.xtext.example.delphi.astm.@NonNull CompilationUnit object) {
		return delegate.visitCompilationUnit(object);
	}

	@Override
	public R visitConditionalExpression(org.xtext.example.delphi.astm.@NonNull ConditionalExpression object) {
		return delegate.visitConditionalExpression(object);
	}

	@Override
	public R visitConstructedType(org.xtext.example.delphi.astm.@NonNull ConstructedType object) {
		return delegate.visitConstructedType(object);
	}

	@Override
	public R visitContinueStatement(org.xtext.example.delphi.astm.@NonNull ContinueStatement object) {
		return delegate.visitContinueStatement(object);
	}

	@Override
	public R visitDataDefinition(org.xtext.example.delphi.astm.@NonNull DataDefinition object) {
		return delegate.visitDataDefinition(object);
	}

	@Override
	public R visitDataType(org.xtext.example.delphi.astm.@NonNull DataType object) {
		return delegate.visitDataType(object);
	}

	@Override
	public R visitDeclaration(org.xtext.example.delphi.astm.@NonNull Declaration object) {
		return delegate.visitDeclaration(object);
	}

	@Override
	public R visitDeclarationOrDefinition(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinition object) {
		return delegate.visitDeclarationOrDefinition(object);
	}

	@Override
	public R visitDeclarationOrDefinitionStatement(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinitionStatement object) {
		return delegate.visitDeclarationOrDefinitionStatement(object);
	}

	@Override
	public R visitDecrement(org.xtext.example.delphi.astm.@NonNull Decrement object) {
		return delegate.visitDecrement(object);
	}

	@Override
	public R visitDefaultBlock(org.xtext.example.delphi.astm.@NonNull DefaultBlock object) {
		return delegate.visitDefaultBlock(object);
	}

	@Override
	public R visitDefinition(org.xtext.example.delphi.astm.@NonNull Definition object) {
		return delegate.visitDefinition(object);
	}

	@Override
	public R visitDefinitionObject(org.xtext.example.delphi.astm.@NonNull DefinitionObject object) {
		return delegate.visitDefinitionObject(object);
	}

	@Override
	public R visitDeleteStatement(org.xtext.example.delphi.astm.@NonNull DeleteStatement object) {
		return delegate.visitDeleteStatement(object);
	}

	@Override
	public R visitDelphiBlockStatement(org.xtext.example.delphi.astm.@NonNull DelphiBlockStatement object) {
		return delegate.visitDelphiBlockStatement(object);
	}

	@Override
	public R visitDelphiFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull DelphiFunctionCallExpression object) {
		return delegate.visitDelphiFunctionCallExpression(object);
	}

	@Override
	public R visitDelphiImplementationSection(org.xtext.example.delphi.astm.@NonNull DelphiImplementationSection object) {
		return delegate.visitDelphiImplementationSection(object);
	}

	@Override
	public R visitDelphiInterfaceSection(org.xtext.example.delphi.astm.@NonNull DelphiInterfaceSection object) {
		return delegate.visitDelphiInterfaceSection(object);
	}

	@Override
	public R visitDelphiUnit(org.xtext.example.delphi.astm.@NonNull DelphiUnit object) {
		return delegate.visitDelphiUnit(object);
	}

	@Override
	public R visitDelphiWithStatement(org.xtext.example.delphi.astm.@NonNull DelphiWithStatement object) {
		return delegate.visitDelphiWithStatement(object);
	}

	@Override
	public R visitDeref(org.xtext.example.delphi.astm.@NonNull Deref object) {
		return delegate.visitDeref(object);
	}

	@Override
	public R visitDerivesFrom(org.xtext.example.delphi.astm.@NonNull DerivesFrom object) {
		return delegate.visitDerivesFrom(object);
	}

	@Override
	public R visitDimension(org.xtext.example.delphi.astm.@NonNull Dimension object) {
		return delegate.visitDimension(object);
	}

	@Override
	public R visitDivide(org.xtext.example.delphi.astm.@NonNull Divide object) {
		return delegate.visitDivide(object);
	}

	@Override
	public R visitDoWhileStatement(org.xtext.example.delphi.astm.@NonNull DoWhileStatement object) {
		return delegate.visitDoWhileStatement(object);
	}

	@Override
	public R visitDouble(org.xtext.example.delphi.astm.@NonNull Double object) {
		return delegate.visitDouble(object);
	}

	@Override
	public R visitEmptyStatement(org.xtext.example.delphi.astm.@NonNull EmptyStatement object) {
		return delegate.visitEmptyStatement(object);
	}

	@Override
	public R visitEntryDefinition(org.xtext.example.delphi.astm.@NonNull EntryDefinition object) {
		return delegate.visitEntryDefinition(object);
	}

	@Override
	public R visitEnumLiteralDefinition(org.xtext.example.delphi.astm.@NonNull EnumLiteralDefinition object) {
		return delegate.visitEnumLiteralDefinition(object);
	}

	@Override
	public R visitEnumType(org.xtext.example.delphi.astm.@NonNull EnumType object) {
		return delegate.visitEnumType(object);
	}

	@Override
	public R visitEqual(org.xtext.example.delphi.astm.@NonNull Equal object) {
		return delegate.visitEqual(object);
	}

	@Override
	public R visitExceptionType(org.xtext.example.delphi.astm.@NonNull ExceptionType object) {
		return delegate.visitExceptionType(object);
	}

	@Override
	public R visitExponent(org.xtext.example.delphi.astm.@NonNull Exponent object) {
		return delegate.visitExponent(object);
	}

	@Override
	public R visitExpression(org.xtext.example.delphi.astm.@NonNull Expression object) {
		return delegate.visitExpression(object);
	}

	@Override
	public R visitExpressionStatement(org.xtext.example.delphi.astm.@NonNull ExpressionStatement object) {
		return delegate.visitExpressionStatement(object);
	}

	@Override
	public R visitExternal(org.xtext.example.delphi.astm.@NonNull External object) {
		return delegate.visitExternal(object);
	}

	@Override
	public R visitFileLocal(org.xtext.example.delphi.astm.@NonNull FileLocal object) {
		return delegate.visitFileLocal(object);
	}

	@Override
	public R visitFloat(org.xtext.example.delphi.astm.@NonNull Float object) {
		return delegate.visitFloat(object);
	}

	@Override
	public R visitForCheckAfterStatement(org.xtext.example.delphi.astm.@NonNull ForCheckAfterStatement object) {
		return delegate.visitForCheckAfterStatement(object);
	}

	@Override
	public R visitForCheckBeforeStatement(org.xtext.example.delphi.astm.@NonNull ForCheckBeforeStatement object) {
		return delegate.visitForCheckBeforeStatement(object);
	}

	@Override
	public R visitForStatement(org.xtext.example.delphi.astm.@NonNull ForStatement object) {
		return delegate.visitForStatement(object);
	}

	@Override
	public R visitFormalParameterDeclaration(org.xtext.example.delphi.astm.@NonNull FormalParameterDeclaration object) {
		return delegate.visitFormalParameterDeclaration(object);
	}

	@Override
	public R visitFormalParameterDefinition(org.xtext.example.delphi.astm.@NonNull FormalParameterDefinition object) {
		return delegate.visitFormalParameterDefinition(object);
	}

	@Override
	public R visitFormalParameterType(org.xtext.example.delphi.astm.@NonNull FormalParameterType object) {
		return delegate.visitFormalParameterType(object);
	}

	@Override
	public R visitFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull FunctionCallExpression object) {
		return delegate.visitFunctionCallExpression(object);
	}

	@Override
	public R visitFunctionDeclaration(org.xtext.example.delphi.astm.@NonNull FunctionDeclaration object) {
		return delegate.visitFunctionDeclaration(object);
	}

	@Override
	public R visitFunctionDefinition(org.xtext.example.delphi.astm.@NonNull FunctionDefinition object) {
		return delegate.visitFunctionDefinition(object);
	}

	@Override
	public R visitFunctionMemberAttribute(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttribute object) {
		return delegate.visitFunctionMemberAttribute(object);
	}

	@Override
	public R visitFunctionMemberAttributes(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttributes object) {
		return delegate.visitFunctionMemberAttributes(object);
	}

	@Override
	public R visitFunctionPersistent(org.xtext.example.delphi.astm.@NonNull FunctionPersistent object) {
		return delegate.visitFunctionPersistent(object);
	}

	@Override
	public R visitFunctionScope(org.xtext.example.delphi.astm.@NonNull FunctionScope object) {
		return delegate.visitFunctionScope(object);
	}

	@Override
	public R visitFunctionType(org.xtext.example.delphi.astm.@NonNull FunctionType object) {
		return delegate.visitFunctionType(object);
	}

	@Override
	public R visitGASTMObject(org.xtext.example.delphi.astm.@NonNull GASTMObject object) {
		return delegate.visitGASTMObject(object);
	}

	@Override
	public R visitGASTMSemanticObject(org.xtext.example.delphi.astm.@NonNull GASTMSemanticObject object) {
		return delegate.visitGASTMSemanticObject(object);
	}

	@Override
	public R visitGASTMSourceObject(org.xtext.example.delphi.astm.@NonNull GASTMSourceObject object) {
		return delegate.visitGASTMSourceObject(object);
	}

	@Override
	public R visitGASTMSyntaxObject(org.xtext.example.delphi.astm.@NonNull GASTMSyntaxObject object) {
		return delegate.visitGASTMSyntaxObject(object);
	}

	@Override
	public R visitGlobalScope(org.xtext.example.delphi.astm.@NonNull GlobalScope object) {
		return delegate.visitGlobalScope(object);
	}

	@Override
	public R visitGreater(org.xtext.example.delphi.astm.@NonNull Greater object) {
		return delegate.visitGreater(object);
	}

	@Override
	public R visitIdentifierReference(org.xtext.example.delphi.astm.@NonNull IdentifierReference object) {
		return delegate.visitIdentifierReference(object);
	}

	@Override
	public R visitIfStatement(org.xtext.example.delphi.astm.@NonNull IfStatement object) {
		return delegate.visitIfStatement(object);
	}

	@Override
	public R visitIncludeUnit(org.xtext.example.delphi.astm.@NonNull IncludeUnit object) {
		return delegate.visitIncludeUnit(object);
	}

	@Override
	public R visitIncrement(org.xtext.example.delphi.astm.@NonNull Increment object) {
		return delegate.visitIncrement(object);
	}

	@Override
	public R visitInteger(org.xtext.example.delphi.astm.@NonNull Integer object) {
		return delegate.visitInteger(object);
	}

	@Override
	public R visitIntegerLiteral(org.xtext.example.delphi.astm.@NonNull IntegerLiteral object) {
		return delegate.visitIntegerLiteral(object);
	}

	@Override
	public R visitJumpStatement(org.xtext.example.delphi.astm.@NonNull JumpStatement object) {
		return delegate.visitJumpStatement(object);
	}

	@Override
	public R visitLabelAccess(org.xtext.example.delphi.astm.@NonNull LabelAccess object) {
		return delegate.visitLabelAccess(object);
	}

	@Override
	public R visitLabelDefinition(org.xtext.example.delphi.astm.@NonNull LabelDefinition object) {
		return delegate.visitLabelDefinition(object);
	}

	@Override
	public R visitLabelType(org.xtext.example.delphi.astm.@NonNull LabelType object) {
		return delegate.visitLabelType(object);
	}

	@Override
	public R visitLabeledStatement(org.xtext.example.delphi.astm.@NonNull LabeledStatement object) {
		return delegate.visitLabeledStatement(object);
	}

	@Override
	public R visitLess(org.xtext.example.delphi.astm.@NonNull Less object) {
		return delegate.visitLess(object);
	}

	@Override
	public R visitLiteral(org.xtext.example.delphi.astm.@NonNull Literal object) {
		return delegate.visitLiteral(object);
	}

	@Override
	public R visitLongDouble(org.xtext.example.delphi.astm.@NonNull LongDouble object) {
		return delegate.visitLongDouble(object);
	}

	@Override
	public R visitLongInteger(org.xtext.example.delphi.astm.@NonNull LongInteger object) {
		return delegate.visitLongInteger(object);
	}

	@Override
	public R visitLoopStatement(org.xtext.example.delphi.astm.@NonNull LoopStatement object) {
		return delegate.visitLoopStatement(object);
	}

	@Override
	public R visitMacroCall(org.xtext.example.delphi.astm.@NonNull MacroCall object) {
		return delegate.visitMacroCall(object);
	}

	@Override
	public R visitMacroDefinition(org.xtext.example.delphi.astm.@NonNull MacroDefinition object) {
		return delegate.visitMacroDefinition(object);
	}

	@Override
	public R visitMissingActualParameter(org.xtext.example.delphi.astm.@NonNull MissingActualParameter object) {
		return delegate.visitMissingActualParameter(object);
	}

	@Override
	public R visitModulus(org.xtext.example.delphi.astm.@NonNull Modulus object) {
		return delegate.visitModulus(object);
	}

	@Override
	public R visitMultiply(org.xtext.example.delphi.astm.@NonNull Multiply object) {
		return delegate.visitMultiply(object);
	}

	@Override
	public R visitName(org.xtext.example.delphi.astm.@NonNull Name object) {
		return delegate.visitName(object);
	}

	@Override
	public R visitNameReference(org.xtext.example.delphi.astm.@NonNull NameReference object) {
		return delegate.visitNameReference(object);
	}

	@Override
	public R visitNameSpaceDefinition(org.xtext.example.delphi.astm.@NonNull NameSpaceDefinition object) {
		return delegate.visitNameSpaceDefinition(object);
	}

	@Override
	public R visitNameSpaceType(org.xtext.example.delphi.astm.@NonNull NameSpaceType object) {
		return delegate.visitNameSpaceType(object);
	}

	@Override
	public R visitNamedType(org.xtext.example.delphi.astm.@NonNull NamedType object) {
		return delegate.visitNamedType(object);
	}

	@Override
	public R visitNamedTypeDefinition(org.xtext.example.delphi.astm.@NonNull NamedTypeDefinition object) {
		return delegate.visitNamedTypeDefinition(object);
	}

	@Override
	public R visitNamedTypeReference(org.xtext.example.delphi.astm.@NonNull NamedTypeReference object) {
		return delegate.visitNamedTypeReference(object);
	}

	@Override
	public R visitNegate(org.xtext.example.delphi.astm.@NonNull Negate object) {
		return delegate.visitNegate(object);
	}

	@Override
	public R visitNewExpression(org.xtext.example.delphi.astm.@NonNull NewExpression object) {
		return delegate.visitNewExpression(object);
	}

	@Override
	public R visitNoDef(org.xtext.example.delphi.astm.@NonNull NoDef object) {
		return delegate.visitNoDef(object);
	}

	@Override
	public R visitNonVirtual(org.xtext.example.delphi.astm.@NonNull NonVirtual object) {
		return delegate.visitNonVirtual(object);
	}

	@Override
	public R visitNot(org.xtext.example.delphi.astm.@NonNull Not object) {
		return delegate.visitNot(object);
	}

	@Override
	public R visitNotEqual(org.xtext.example.delphi.astm.@NonNull NotEqual object) {
		return delegate.visitNotEqual(object);
	}

	@Override
	public R visitNotGreater(org.xtext.example.delphi.astm.@NonNull NotGreater object) {
		return delegate.visitNotGreater(object);
	}

	@Override
	public R visitNotLess(org.xtext.example.delphi.astm.@NonNull NotLess object) {
		return delegate.visitNotLess(object);
	}

	@Override
	public R visitOperatorAssign(org.xtext.example.delphi.astm.@NonNull OperatorAssign object) {
		return delegate.visitOperatorAssign(object);
	}

	@Override
	public R visitOr(org.xtext.example.delphi.astm.@NonNull Or object) {
		return delegate.visitOr(object);
	}

	@Override
	public R visitOtherSyntaxObject(org.xtext.example.delphi.astm.@NonNull OtherSyntaxObject object) {
		return delegate.visitOtherSyntaxObject(object);
	}

	@Override
	public R visitPerClassMember(org.xtext.example.delphi.astm.@NonNull PerClassMember object) {
		return delegate.visitPerClassMember(object);
	}

	@Override
	public R visitPointerType(org.xtext.example.delphi.astm.@NonNull PointerType object) {
		return delegate.visitPointerType(object);
	}

	@Override
	public R visitPostDecrement(org.xtext.example.delphi.astm.@NonNull PostDecrement object) {
		return delegate.visitPostDecrement(object);
	}

	@Override
	public R visitPostIncrement(org.xtext.example.delphi.astm.@NonNull PostIncrement object) {
		return delegate.visitPostIncrement(object);
	}

	@Override
	public R visitPreprocessorElement(org.xtext.example.delphi.astm.@NonNull PreprocessorElement object) {
		return delegate.visitPreprocessorElement(object);
	}

	@Override
	public R visitPrimitiveType(org.xtext.example.delphi.astm.@NonNull PrimitiveType object) {
		return delegate.visitPrimitiveType(object);
	}

	@Override
	public R visitPrivate(org.xtext.example.delphi.astm.@NonNull Private object) {
		return delegate.visitPrivate(object);
	}

	@Override
	public R visitProgramScope(org.xtext.example.delphi.astm.@NonNull ProgramScope object) {
		return delegate.visitProgramScope(object);
	}

	@Override
	public R visitProject(org.xtext.example.delphi.astm.@NonNull Project object) {
		return delegate.visitProject(object);
	}

	@Override
	public R visitProtected(org.xtext.example.delphi.astm.@NonNull Protected object) {
		return delegate.visitProtected(object);
	}

	@Override
	public R visitPublic(org.xtext.example.delphi.astm.@NonNull Public object) {
		return delegate.visitPublic(object);
	}

	@Override
	public R visitPureVirtual(org.xtext.example.delphi.astm.@NonNull PureVirtual object) {
		return delegate.visitPureVirtual(object);
	}

	@Override
	public R visitQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull QualifiedIdentifierReference object) {
		return delegate.visitQualifiedIdentifierReference(object);
	}

	@Override
	public R visitQualifiedOverData(org.xtext.example.delphi.astm.@NonNull QualifiedOverData object) {
		return delegate.visitQualifiedOverData(object);
	}

	@Override
	public R visitQualifiedOverPointer(org.xtext.example.delphi.astm.@NonNull QualifiedOverPointer object) {
		return delegate.visitQualifiedOverPointer(object);
	}

	@Override
	public R visitRangeExpression(org.xtext.example.delphi.astm.@NonNull RangeExpression object) {
		return delegate.visitRangeExpression(object);
	}

	@Override
	public R visitRangeType(org.xtext.example.delphi.astm.@NonNull RangeType object) {
		return delegate.visitRangeType(object);
	}

	@Override
	public R visitRealLiteral(org.xtext.example.delphi.astm.@NonNull RealLiteral object) {
		return delegate.visitRealLiteral(object);
	}

	@Override
	public R visitReferenceType(org.xtext.example.delphi.astm.@NonNull ReferenceType object) {
		return delegate.visitReferenceType(object);
	}

	@Override
	public R visitReturnStatement(org.xtext.example.delphi.astm.@NonNull ReturnStatement object) {
		return delegate.visitReturnStatement(object);
	}

	@Override
	public R visitScope(org.xtext.example.delphi.astm.@NonNull Scope object) {
		return delegate.visitScope(object);
	}

	@Override
	public R visitShortInteger(org.xtext.example.delphi.astm.@NonNull ShortInteger object) {
		return delegate.visitShortInteger(object);
	}

	@Override
	public R visitSourceFile(org.xtext.example.delphi.astm.@NonNull SourceFile object) {
		return delegate.visitSourceFile(object);
	}

	@Override
	public R visitSourceLocation(org.xtext.example.delphi.astm.@NonNull SourceLocation object) {
		return delegate.visitSourceLocation(object);
	}

	@Override
	public R visitSpecificConcatString(org.xtext.example.delphi.astm.@NonNull SpecificConcatString object) {
		return delegate.visitSpecificConcatString(object);
	}

	@Override
	public R visitSpecificGreaterEqual(org.xtext.example.delphi.astm.@NonNull SpecificGreaterEqual object) {
		return delegate.visitSpecificGreaterEqual(object);
	}

	@Override
	public R visitSpecificIn(org.xtext.example.delphi.astm.@NonNull SpecificIn object) {
		return delegate.visitSpecificIn(object);
	}

	@Override
	public R visitSpecificLessEqual(org.xtext.example.delphi.astm.@NonNull SpecificLessEqual object) {
		return delegate.visitSpecificLessEqual(object);
	}

	@Override
	public R visitSpecificLike(org.xtext.example.delphi.astm.@NonNull SpecificLike object) {
		return delegate.visitSpecificLike(object);
	}

	@Override
	public R visitSpecificSelectStatement(org.xtext.example.delphi.astm.@NonNull SpecificSelectStatement object) {
		return delegate.visitSpecificSelectStatement(object);
	}

	@Override
	public R visitSpecificTriggerDefinition(org.xtext.example.delphi.astm.@NonNull SpecificTriggerDefinition object) {
		return delegate.visitSpecificTriggerDefinition(object);
	}

	@Override
	public R visitStatement(org.xtext.example.delphi.astm.@NonNull Statement object) {
		return delegate.visitStatement(object);
	}

	@Override
	public R visitStorageSpecification(org.xtext.example.delphi.astm.@NonNull StorageSpecification object) {
		return delegate.visitStorageSpecification(object);
	}

	@Override
	public R visitString(org.xtext.example.delphi.astm.@NonNull String object) {
		return delegate.visitString(object);
	}

	@Override
	public R visitStringLiteral(org.xtext.example.delphi.astm.@NonNull StringLiteral object) {
		return delegate.visitStringLiteral(object);
	}

	@Override
	public R visitStructureType(org.xtext.example.delphi.astm.@NonNull StructureType object) {
		return delegate.visitStructureType(object);
	}

	@Override
	public R visitSubtract(org.xtext.example.delphi.astm.@NonNull Subtract object) {
		return delegate.visitSubtract(object);
	}

	@Override
	public R visitSwitchCase(org.xtext.example.delphi.astm.@NonNull SwitchCase object) {
		return delegate.visitSwitchCase(object);
	}

	@Override
	public R visitSwitchStatement(org.xtext.example.delphi.astm.@NonNull SwitchStatement object) {
		return delegate.visitSwitchStatement(object);
	}

	@Override
	public R visitTerminateStatement(org.xtext.example.delphi.astm.@NonNull TerminateStatement object) {
		return delegate.visitTerminateStatement(object);
	}

	@Override
	public R visitThrowStatement(org.xtext.example.delphi.astm.@NonNull ThrowStatement object) {
		return delegate.visitThrowStatement(object);
	}

	@Override
	public R visitTryStatement(org.xtext.example.delphi.astm.@NonNull TryStatement object) {
		return delegate.visitTryStatement(object);
	}

	@Override
	public R visitType(org.xtext.example.delphi.astm.@NonNull Type object) {
		return delegate.visitType(object);
	}

	@Override
	public R visitTypeDefinition(org.xtext.example.delphi.astm.@NonNull TypeDefinition object) {
		return delegate.visitTypeDefinition(object);
	}

	@Override
	public R visitTypeQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull TypeQualifiedIdentifierReference object) {
		return delegate.visitTypeQualifiedIdentifierReference(object);
	}

	@Override
	public R visitTypeReference(org.xtext.example.delphi.astm.@NonNull TypeReference object) {
		return delegate.visitTypeReference(object);
	}

	@Override
	public R visitTypesCatchBlock(org.xtext.example.delphi.astm.@NonNull TypesCatchBlock object) {
		return delegate.visitTypesCatchBlock(object);
	}

	@Override
	public R visitUnaryExpression(org.xtext.example.delphi.astm.@NonNull UnaryExpression object) {
		return delegate.visitUnaryExpression(object);
	}

	@Override
	public R visitUnaryOperator(org.xtext.example.delphi.astm.@NonNull UnaryOperator object) {
		return delegate.visitUnaryOperator(object);
	}

	@Override
	public R visitUnaryPlus(org.xtext.example.delphi.astm.@NonNull UnaryPlus object) {
		return delegate.visitUnaryPlus(object);
	}

	@Override
	public R visitUnionType(org.xtext.example.delphi.astm.@NonNull UnionType object) {
		return delegate.visitUnionType(object);
	}

	@Override
	public R visitUnnamedTypeReference(org.xtext.example.delphi.astm.@NonNull UnnamedTypeReference object) {
		return delegate.visitUnnamedTypeReference(object);
	}

	@Override
	public R visitVariableCatchBlock(org.xtext.example.delphi.astm.@NonNull VariableCatchBlock object) {
		return delegate.visitVariableCatchBlock(object);
	}

	@Override
	public R visitVariableDeclaration(org.xtext.example.delphi.astm.@NonNull VariableDeclaration object) {
		return delegate.visitVariableDeclaration(object);
	}

	@Override
	public R visitVariableDefinition(org.xtext.example.delphi.astm.@NonNull VariableDefinition object) {
		return delegate.visitVariableDefinition(object);
	}

	@Override
	public R visitVirtual(org.xtext.example.delphi.astm.@NonNull Virtual object) {
		return delegate.visitVirtual(object);
	}

	@Override
	public R visitVirtualSpecification(org.xtext.example.delphi.astm.@NonNull VirtualSpecification object) {
		return delegate.visitVirtualSpecification(object);
	}

	@Override
	public R visitVoid(org.xtext.example.delphi.astm.@NonNull Void object) {
		return delegate.visitVoid(object);
	}

	@Override
	public R visitWhileStatement(org.xtext.example.delphi.astm.@NonNull WhileStatement object) {
		return delegate.visitWhileStatement(object);
	}

	@Override
	public R visitWideCharacter(org.xtext.example.delphi.astm.@NonNull WideCharacter object) {
		return delegate.visitWideCharacter(object);
	}
}
