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
 * An AbstractWrappingVisitor delegates all visits wrapping the delegation in a call to a preVisit function and a postVisit function.
 */
public abstract class AbstractWrappingVisitor<R, C, @NonNull D extends Visitor<R>, P>
	extends AbstractVisitor<R, C>
	implements Visitor<R>
{
	protected final @NonNull D delegate;
	
	protected AbstractWrappingVisitor(@NonNull D delegate, C context) {
		super(context);
		this.delegate = delegate;		
	//	delegate.setUndecoratedVisitor(this);
	}

	/**
	 * Intercept an exception thrown by the delegated visit to perform some post-functionality that may use the visitable object,
	 * the result of preVisit and the thrown exception to determine the overall wrapped result.
	 * 
	 * @return a rethrown RuntimeException or a RuntimeException-wrapped non-RuntimeException.
	 */
	protected R badVisit(org.xtext.example.delphi.astm.util.@NonNull Visitable visitable, @Nullable P prologue, @NonNull Throwable e) throws RuntimeException {
		if (e instanceof Exception) {
			throw (RuntimeException)e;
		}
		else {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Obtains the visitor that I wrap.
	 * 
	 * @return my wrapped visitor
	 */
	protected @NonNull D getDelegate() {
		return delegate;
	}

	/**
	 * Intercept the result of the delegated visit to perform some post-functionality that may use the visitable object,
	 * the result of preVisit and the result of the delegated visit to determine the overall wrapped result.
	 * 
	 * @return the epilogue result, which defaults to the delegated result.
	 */
	protected R postVisit(org.xtext.example.delphi.astm.util.@NonNull Visitable visitable, @Nullable P prologue, R result) {
		return result;
	}

	/**
	 * Compute and return some value before performing the delegated visit.
	 * 
	 * @return the prologue result, which defauilts to null.
	 */
	protected @Nullable P preVisit(org.xtext.example.delphi.astm.util.@NonNull Visitable visitable) {
		return null;
	}

	@Override
	public R visiting(org.xtext.example.delphi.astm.util.@NonNull Visitable visitable) {
		throw new UnsupportedOperationException();		// Cannot happen since all methods delegate.
	}

	@Override
	public R visitAccessKind(org.xtext.example.delphi.astm.@NonNull AccessKind object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAccessKind(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitActualParameter(org.xtext.example.delphi.astm.@NonNull ActualParameter object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitActualParameter(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ActualParameterExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitActualParameterExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAdd(org.xtext.example.delphi.astm.@NonNull Add object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAdd(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAddressOf(org.xtext.example.delphi.astm.@NonNull AddressOf object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAddressOf(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAggregateExpression(org.xtext.example.delphi.astm.@NonNull AggregateExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAggregateExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAggregateScope(org.xtext.example.delphi.astm.@NonNull AggregateScope object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAggregateScope(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAggregateType(org.xtext.example.delphi.astm.@NonNull AggregateType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAggregateType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAggregateTypeDefinition(org.xtext.example.delphi.astm.@NonNull AggregateTypeDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAggregateTypeDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAnd(org.xtext.example.delphi.astm.@NonNull And object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAnd(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAnnotationExpression(org.xtext.example.delphi.astm.@NonNull AnnotationExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAnnotationExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAnnotationType(org.xtext.example.delphi.astm.@NonNull AnnotationType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAnnotationType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitArrayAccess(org.xtext.example.delphi.astm.@NonNull ArrayAccess object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitArrayAccess(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitArrayType(org.xtext.example.delphi.astm.@NonNull ArrayType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitArrayType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAssign(org.xtext.example.delphi.astm.@NonNull Assign object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAssign(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBinaryExpression(org.xtext.example.delphi.astm.@NonNull BinaryExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBinaryExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBinaryOperator(org.xtext.example.delphi.astm.@NonNull BinaryOperator object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBinaryOperator(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitAnd(org.xtext.example.delphi.astm.@NonNull BitAnd object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitAnd(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitFieldDefinition(org.xtext.example.delphi.astm.@NonNull BitFieldDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitFieldDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitLeftShift(org.xtext.example.delphi.astm.@NonNull BitLeftShift object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitLeftShift(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitLiteral(org.xtext.example.delphi.astm.@NonNull BitLiteral object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitLiteral(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitNot(org.xtext.example.delphi.astm.@NonNull BitNot object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitNot(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitOr(org.xtext.example.delphi.astm.@NonNull BitOr object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitOr(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitRightShift(org.xtext.example.delphi.astm.@NonNull BitRightShift object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitRightShift(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBitXor(org.xtext.example.delphi.astm.@NonNull BitXor object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBitXor(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBlockScope(org.xtext.example.delphi.astm.@NonNull BlockScope object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBlockScope(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBlockStatement(org.xtext.example.delphi.astm.@NonNull BlockStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBlockStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBoolean(org.xtext.example.delphi.astm.@NonNull Boolean object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBoolean(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBooleanLiteral(org.xtext.example.delphi.astm.@NonNull BooleanLiteral object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBooleanLiteral(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBreakStatement(org.xtext.example.delphi.astm.@NonNull BreakStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBreakStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitByReferenceActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByReferenceActualParameterExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitByReferenceActualParameterExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitByReferenceFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByReferenceFormalParameterType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitByReferenceFormalParameterType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitByValueActualParameterExpression(org.xtext.example.delphi.astm.@NonNull ByValueActualParameterExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitByValueActualParameterExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitByValueFormalParameterType(org.xtext.example.delphi.astm.@NonNull ByValueFormalParameterType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitByValueFormalParameterType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitByte(org.xtext.example.delphi.astm.@NonNull Byte object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitByte(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCaseBlock(org.xtext.example.delphi.astm.@NonNull CaseBlock object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCaseBlock(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCastExpression(org.xtext.example.delphi.astm.@NonNull CastExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCastExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCatchBlock(org.xtext.example.delphi.astm.@NonNull CatchBlock object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCatchBlock(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCharLiteral(org.xtext.example.delphi.astm.@NonNull CharLiteral object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCharLiteral(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCharacter(org.xtext.example.delphi.astm.@NonNull Character object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCharacter(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitClassType(org.xtext.example.delphi.astm.@NonNull ClassType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitClassType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCollectionType(org.xtext.example.delphi.astm.@NonNull CollectionType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCollectionType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitComment(org.xtext.example.delphi.astm.@NonNull Comment object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitComment(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCompilationUnit(org.xtext.example.delphi.astm.@NonNull CompilationUnit object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCompilationUnit(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitConditionalExpression(org.xtext.example.delphi.astm.@NonNull ConditionalExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitConditionalExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitConstructedType(org.xtext.example.delphi.astm.@NonNull ConstructedType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitConstructedType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitContinueStatement(org.xtext.example.delphi.astm.@NonNull ContinueStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitContinueStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDataDefinition(org.xtext.example.delphi.astm.@NonNull DataDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDataDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDataType(org.xtext.example.delphi.astm.@NonNull DataType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDataType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDeclaration(org.xtext.example.delphi.astm.@NonNull Declaration object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDeclaration(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDeclarationOrDefinition(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDeclarationOrDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDeclarationOrDefinitionStatement(org.xtext.example.delphi.astm.@NonNull DeclarationOrDefinitionStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDeclarationOrDefinitionStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDecrement(org.xtext.example.delphi.astm.@NonNull Decrement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDecrement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDefaultBlock(org.xtext.example.delphi.astm.@NonNull DefaultBlock object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDefaultBlock(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDefinition(org.xtext.example.delphi.astm.@NonNull Definition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDefinitionObject(org.xtext.example.delphi.astm.@NonNull DefinitionObject object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDefinitionObject(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDeleteStatement(org.xtext.example.delphi.astm.@NonNull DeleteStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDeleteStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDelphiBlockStatement(org.xtext.example.delphi.astm.@NonNull DelphiBlockStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDelphiBlockStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDelphiFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull DelphiFunctionCallExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDelphiFunctionCallExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDelphiImplementationSection(org.xtext.example.delphi.astm.@NonNull DelphiImplementationSection object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDelphiImplementationSection(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDelphiInterfaceSection(org.xtext.example.delphi.astm.@NonNull DelphiInterfaceSection object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDelphiInterfaceSection(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDelphiUnit(org.xtext.example.delphi.astm.@NonNull DelphiUnit object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDelphiUnit(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDelphiWithStatement(org.xtext.example.delphi.astm.@NonNull DelphiWithStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDelphiWithStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDeref(org.xtext.example.delphi.astm.@NonNull Deref object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDeref(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDerivesFrom(org.xtext.example.delphi.astm.@NonNull DerivesFrom object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDerivesFrom(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDimension(org.xtext.example.delphi.astm.@NonNull Dimension object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDimension(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDivide(org.xtext.example.delphi.astm.@NonNull Divide object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDivide(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDoWhileStatement(org.xtext.example.delphi.astm.@NonNull DoWhileStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDoWhileStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDouble(org.xtext.example.delphi.astm.@NonNull Double object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDouble(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitEmptyStatement(org.xtext.example.delphi.astm.@NonNull EmptyStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitEmptyStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitEntryDefinition(org.xtext.example.delphi.astm.@NonNull EntryDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitEntryDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitEnumLiteralDefinition(org.xtext.example.delphi.astm.@NonNull EnumLiteralDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitEnumLiteralDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitEnumType(org.xtext.example.delphi.astm.@NonNull EnumType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitEnumType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitEqual(org.xtext.example.delphi.astm.@NonNull Equal object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitEqual(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitExceptionType(org.xtext.example.delphi.astm.@NonNull ExceptionType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitExceptionType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitExponent(org.xtext.example.delphi.astm.@NonNull Exponent object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitExponent(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitExpression(org.xtext.example.delphi.astm.@NonNull Expression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitExpressionStatement(org.xtext.example.delphi.astm.@NonNull ExpressionStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitExpressionStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitExternal(org.xtext.example.delphi.astm.@NonNull External object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitExternal(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFileLocal(org.xtext.example.delphi.astm.@NonNull FileLocal object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFileLocal(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFloat(org.xtext.example.delphi.astm.@NonNull Float object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFloat(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitForCheckAfterStatement(org.xtext.example.delphi.astm.@NonNull ForCheckAfterStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitForCheckAfterStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitForCheckBeforeStatement(org.xtext.example.delphi.astm.@NonNull ForCheckBeforeStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitForCheckBeforeStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitForStatement(org.xtext.example.delphi.astm.@NonNull ForStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitForStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFormalParameterDeclaration(org.xtext.example.delphi.astm.@NonNull FormalParameterDeclaration object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFormalParameterDeclaration(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFormalParameterDefinition(org.xtext.example.delphi.astm.@NonNull FormalParameterDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFormalParameterDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFormalParameterType(org.xtext.example.delphi.astm.@NonNull FormalParameterType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFormalParameterType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionCallExpression(org.xtext.example.delphi.astm.@NonNull FunctionCallExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionCallExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionDeclaration(org.xtext.example.delphi.astm.@NonNull FunctionDeclaration object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionDeclaration(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionDefinition(org.xtext.example.delphi.astm.@NonNull FunctionDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionMemberAttribute(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttribute object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionMemberAttribute(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionMemberAttributes(org.xtext.example.delphi.astm.@NonNull FunctionMemberAttributes object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionMemberAttributes(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionPersistent(org.xtext.example.delphi.astm.@NonNull FunctionPersistent object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionPersistent(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionScope(org.xtext.example.delphi.astm.@NonNull FunctionScope object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionScope(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitFunctionType(org.xtext.example.delphi.astm.@NonNull FunctionType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitFunctionType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitGASTMObject(org.xtext.example.delphi.astm.@NonNull GASTMObject object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitGASTMObject(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitGASTMSemanticObject(org.xtext.example.delphi.astm.@NonNull GASTMSemanticObject object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitGASTMSemanticObject(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitGASTMSourceObject(org.xtext.example.delphi.astm.@NonNull GASTMSourceObject object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitGASTMSourceObject(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitGASTMSyntaxObject(org.xtext.example.delphi.astm.@NonNull GASTMSyntaxObject object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitGASTMSyntaxObject(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitGlobalScope(org.xtext.example.delphi.astm.@NonNull GlobalScope object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitGlobalScope(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitGreater(org.xtext.example.delphi.astm.@NonNull Greater object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitGreater(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitIdentifierReference(org.xtext.example.delphi.astm.@NonNull IdentifierReference object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitIdentifierReference(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitIfStatement(org.xtext.example.delphi.astm.@NonNull IfStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitIfStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitIncludeUnit(org.xtext.example.delphi.astm.@NonNull IncludeUnit object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitIncludeUnit(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitIncrement(org.xtext.example.delphi.astm.@NonNull Increment object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitIncrement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitInteger(org.xtext.example.delphi.astm.@NonNull Integer object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitInteger(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitIntegerLiteral(org.xtext.example.delphi.astm.@NonNull IntegerLiteral object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitIntegerLiteral(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitJumpStatement(org.xtext.example.delphi.astm.@NonNull JumpStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitJumpStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLabelAccess(org.xtext.example.delphi.astm.@NonNull LabelAccess object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLabelAccess(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLabelDefinition(org.xtext.example.delphi.astm.@NonNull LabelDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLabelDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLabelType(org.xtext.example.delphi.astm.@NonNull LabelType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLabelType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLabeledStatement(org.xtext.example.delphi.astm.@NonNull LabeledStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLabeledStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLess(org.xtext.example.delphi.astm.@NonNull Less object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLess(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLiteral(org.xtext.example.delphi.astm.@NonNull Literal object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLiteral(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLongDouble(org.xtext.example.delphi.astm.@NonNull LongDouble object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLongDouble(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLongInteger(org.xtext.example.delphi.astm.@NonNull LongInteger object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLongInteger(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLoopStatement(org.xtext.example.delphi.astm.@NonNull LoopStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLoopStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMacroCall(org.xtext.example.delphi.astm.@NonNull MacroCall object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMacroCall(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMacroDefinition(org.xtext.example.delphi.astm.@NonNull MacroDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMacroDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMissingActualParameter(org.xtext.example.delphi.astm.@NonNull MissingActualParameter object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMissingActualParameter(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitModulus(org.xtext.example.delphi.astm.@NonNull Modulus object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitModulus(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMultiply(org.xtext.example.delphi.astm.@NonNull Multiply object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMultiply(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitName(org.xtext.example.delphi.astm.@NonNull Name object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitName(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNameReference(org.xtext.example.delphi.astm.@NonNull NameReference object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNameReference(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNameSpaceDefinition(org.xtext.example.delphi.astm.@NonNull NameSpaceDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNameSpaceDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNameSpaceType(org.xtext.example.delphi.astm.@NonNull NameSpaceType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNameSpaceType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNamedType(org.xtext.example.delphi.astm.@NonNull NamedType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNamedType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNamedTypeDefinition(org.xtext.example.delphi.astm.@NonNull NamedTypeDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNamedTypeDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNamedTypeReference(org.xtext.example.delphi.astm.@NonNull NamedTypeReference object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNamedTypeReference(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNegate(org.xtext.example.delphi.astm.@NonNull Negate object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNegate(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNewExpression(org.xtext.example.delphi.astm.@NonNull NewExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNewExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNoDef(org.xtext.example.delphi.astm.@NonNull NoDef object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNoDef(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNonVirtual(org.xtext.example.delphi.astm.@NonNull NonVirtual object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNonVirtual(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNot(org.xtext.example.delphi.astm.@NonNull Not object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNot(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNotEqual(org.xtext.example.delphi.astm.@NonNull NotEqual object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNotEqual(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNotGreater(org.xtext.example.delphi.astm.@NonNull NotGreater object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNotGreater(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitNotLess(org.xtext.example.delphi.astm.@NonNull NotLess object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitNotLess(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOperatorAssign(org.xtext.example.delphi.astm.@NonNull OperatorAssign object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOperatorAssign(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOr(org.xtext.example.delphi.astm.@NonNull Or object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOr(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOtherSyntaxObject(org.xtext.example.delphi.astm.@NonNull OtherSyntaxObject object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOtherSyntaxObject(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPerClassMember(org.xtext.example.delphi.astm.@NonNull PerClassMember object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPerClassMember(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPointerType(org.xtext.example.delphi.astm.@NonNull PointerType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPointerType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPostDecrement(org.xtext.example.delphi.astm.@NonNull PostDecrement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPostDecrement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPostIncrement(org.xtext.example.delphi.astm.@NonNull PostIncrement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPostIncrement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPreprocessorElement(org.xtext.example.delphi.astm.@NonNull PreprocessorElement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPreprocessorElement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPrimitiveType(org.xtext.example.delphi.astm.@NonNull PrimitiveType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPrimitiveType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPrivate(org.xtext.example.delphi.astm.@NonNull Private object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPrivate(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitProgramScope(org.xtext.example.delphi.astm.@NonNull ProgramScope object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitProgramScope(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitProject(org.xtext.example.delphi.astm.@NonNull Project object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitProject(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitProtected(org.xtext.example.delphi.astm.@NonNull Protected object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitProtected(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPublic(org.xtext.example.delphi.astm.@NonNull Public object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPublic(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitPureVirtual(org.xtext.example.delphi.astm.@NonNull PureVirtual object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitPureVirtual(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull QualifiedIdentifierReference object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitQualifiedIdentifierReference(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitQualifiedOverData(org.xtext.example.delphi.astm.@NonNull QualifiedOverData object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitQualifiedOverData(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitQualifiedOverPointer(org.xtext.example.delphi.astm.@NonNull QualifiedOverPointer object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitQualifiedOverPointer(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitRangeExpression(org.xtext.example.delphi.astm.@NonNull RangeExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitRangeExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitRangeType(org.xtext.example.delphi.astm.@NonNull RangeType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitRangeType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitRealLiteral(org.xtext.example.delphi.astm.@NonNull RealLiteral object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitRealLiteral(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitReferenceType(org.xtext.example.delphi.astm.@NonNull ReferenceType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitReferenceType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitReturnStatement(org.xtext.example.delphi.astm.@NonNull ReturnStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitReturnStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitScope(org.xtext.example.delphi.astm.@NonNull Scope object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitScope(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitShortInteger(org.xtext.example.delphi.astm.@NonNull ShortInteger object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitShortInteger(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSourceFile(org.xtext.example.delphi.astm.@NonNull SourceFile object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSourceFile(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSourceLocation(org.xtext.example.delphi.astm.@NonNull SourceLocation object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSourceLocation(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSpecificConcatString(org.xtext.example.delphi.astm.@NonNull SpecificConcatString object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSpecificConcatString(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSpecificGreaterEqual(org.xtext.example.delphi.astm.@NonNull SpecificGreaterEqual object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSpecificGreaterEqual(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSpecificIn(org.xtext.example.delphi.astm.@NonNull SpecificIn object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSpecificIn(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSpecificLessEqual(org.xtext.example.delphi.astm.@NonNull SpecificLessEqual object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSpecificLessEqual(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSpecificLike(org.xtext.example.delphi.astm.@NonNull SpecificLike object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSpecificLike(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSpecificSelectStatement(org.xtext.example.delphi.astm.@NonNull SpecificSelectStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSpecificSelectStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSpecificTriggerDefinition(org.xtext.example.delphi.astm.@NonNull SpecificTriggerDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSpecificTriggerDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitStatement(org.xtext.example.delphi.astm.@NonNull Statement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitStorageSpecification(org.xtext.example.delphi.astm.@NonNull StorageSpecification object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitStorageSpecification(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitString(org.xtext.example.delphi.astm.@NonNull String object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitString(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitStringLiteral(org.xtext.example.delphi.astm.@NonNull StringLiteral object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitStringLiteral(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitStructureType(org.xtext.example.delphi.astm.@NonNull StructureType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitStructureType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSubtract(org.xtext.example.delphi.astm.@NonNull Subtract object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSubtract(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSwitchCase(org.xtext.example.delphi.astm.@NonNull SwitchCase object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSwitchCase(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSwitchStatement(org.xtext.example.delphi.astm.@NonNull SwitchStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSwitchStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTerminateStatement(org.xtext.example.delphi.astm.@NonNull TerminateStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTerminateStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitThrowStatement(org.xtext.example.delphi.astm.@NonNull ThrowStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitThrowStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTryStatement(org.xtext.example.delphi.astm.@NonNull TryStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTryStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitType(org.xtext.example.delphi.astm.@NonNull Type object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTypeDefinition(org.xtext.example.delphi.astm.@NonNull TypeDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTypeDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTypeQualifiedIdentifierReference(org.xtext.example.delphi.astm.@NonNull TypeQualifiedIdentifierReference object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTypeQualifiedIdentifierReference(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTypeReference(org.xtext.example.delphi.astm.@NonNull TypeReference object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTypeReference(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTypesCatchBlock(org.xtext.example.delphi.astm.@NonNull TypesCatchBlock object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTypesCatchBlock(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUnaryExpression(org.xtext.example.delphi.astm.@NonNull UnaryExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUnaryExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUnaryOperator(org.xtext.example.delphi.astm.@NonNull UnaryOperator object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUnaryOperator(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUnaryPlus(org.xtext.example.delphi.astm.@NonNull UnaryPlus object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUnaryPlus(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUnionType(org.xtext.example.delphi.astm.@NonNull UnionType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUnionType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUnnamedTypeReference(org.xtext.example.delphi.astm.@NonNull UnnamedTypeReference object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUnnamedTypeReference(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVariableCatchBlock(org.xtext.example.delphi.astm.@NonNull VariableCatchBlock object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVariableCatchBlock(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVariableDeclaration(org.xtext.example.delphi.astm.@NonNull VariableDeclaration object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVariableDeclaration(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVariableDefinition(org.xtext.example.delphi.astm.@NonNull VariableDefinition object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVariableDefinition(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVirtual(org.xtext.example.delphi.astm.@NonNull Virtual object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVirtual(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVirtualSpecification(org.xtext.example.delphi.astm.@NonNull VirtualSpecification object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVirtualSpecification(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVoid(org.xtext.example.delphi.astm.@NonNull Void object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVoid(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitWhileStatement(org.xtext.example.delphi.astm.@NonNull WhileStatement object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitWhileStatement(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitWideCharacter(org.xtext.example.delphi.astm.@NonNull WideCharacter object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitWideCharacter(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}
}
