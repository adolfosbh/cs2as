/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: uk.ac.york.cs.asbh.lang.cs2as/model/TargetMM1.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	uk.ac.york.cs.asbh.lang.cs2as.target.lookup.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class TargetLookupResultImpl<NE> implements TargetLookupResult<NE> {
	
	private @NonNull List<NE> results = new ArrayList<NE>();
	
	public TargetLookupResultImpl(List<NE> results){
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
