/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.companies/model/Company.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.company.util;
import org.eclipse.jdt.annotation.NonNull;
import org.xtext.example.company.lookup.LookupEnvironment;
import org.xtext.example.company.util.Visitable;

public abstract class AbstractCompanyCommonLookupVisitor
	extends AbstractExtendingVisitor<LookupEnvironment, LookupEnvironment> {

	protected AbstractCompanyCommonLookupVisitor(LookupEnvironment context) {
		super(context);
	}
	
	@Override
	public final LookupEnvironment visiting(@NonNull Visitable visitable) {
		return doVisiting(visitable);
	}
	
	
	abstract protected LookupEnvironment doVisiting(@NonNull Visitable visitable);
	
}
