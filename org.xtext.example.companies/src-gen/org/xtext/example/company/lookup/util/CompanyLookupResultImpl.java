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
package	org.xtext.example.company.lookup.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class CompanyLookupResultImpl<NE> implements CompanyLookupResult<NE> {
	
	private @NonNull List<NE> results = new ArrayList<NE>();
	
	public CompanyLookupResultImpl(List<NE> results){
		this.results.addAll(results);
	}
	
	@Override
	public @NonNull List<NE> getAllResults() {
		return Collections.unmodifiableList(results);
	}
	
	@Override
	public @Nullable NE getSingleResult() {
		return results.size() == 0 ? null : results.get(0);
	}
	
	@Override
	public int size() {
		return results.size();
	}
}
