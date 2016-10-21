/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.delphi/model/astm.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.delphi.astm.util;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.internal.evaluation.EvaluationCache;
import org.eclipse.ocl.pivot.internal.evaluation.ExecutorInternal.ExecutorInternalExtension;

import org.xtext.example.delphi.astm.lookup.LookupEnvironment;
import org.xtext.example.delphi.astm.util.Visitable;

public abstract class AbstractAstmCommonLookupVisitor
	extends AbstractExtendingVisitor<@Nullable LookupEnvironment, @NonNull LookupEnvironment> {

	protected final @NonNull EvaluationCache evaluationCache;
	
	protected AbstractAstmCommonLookupVisitor(@NonNull LookupEnvironment context) {
		super(context);
		this.evaluationCache = ((ExecutorInternalExtension)context.getExecutor()).getEvaluationCache();
	}
	
	@Override
	public final LookupEnvironment visiting(@NonNull Visitable visitable) {
		return doVisiting(visitable);
	}
	
	
	abstract protected LookupEnvironment doVisiting(@NonNull Visitable visitable);
	
}
