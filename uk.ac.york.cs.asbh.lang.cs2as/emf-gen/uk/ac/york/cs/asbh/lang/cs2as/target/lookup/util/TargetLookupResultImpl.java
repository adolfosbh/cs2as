/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: uk.ac.york.cs.asbh.lang.cs2as/model/TargetMM1.genmodel
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
	
	private List<NE> results = new ArrayList<NE>();
	
	public TargetLookupResultImpl(List<NE> results){
		this.results.addAll(results);
	}
	
	@SuppressWarnings("null")
	@Override
	@NonNull
	public List<NE> getAllResults() {
		return Collections.unmodifiableList(results);
	}
	
	@Override
	@Nullable
	public NE getSingleResult() {
		return results.size() == 0 ? null : results.get(0);
	}
	
	@Override
	public int size() {
		return results.size();
	}
}
