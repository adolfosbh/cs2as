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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import uk.ac.york.cs.asbh.lang.cs2as.target.A1;
import uk.ac.york.cs.asbh.lang.cs2as.target.A2;
import uk.ac.york.cs.asbh.lang.cs2as.target.B;
import uk.ac.york.cs.asbh.lang.cs2as.target.C;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.AbstractTargetLookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;

public class TargetQualificationLookupVisitor extends AbstractTargetLookupVisitor {

	public TargetQualificationLookupVisitor(@NonNull LookupEnvironment context) {
		super(context);
	}

    @Override
    public @Nullable LookupEnvironment visiting(@NonNull Visitable visitable) {
        return context;
    }
    
    @Override
    public @Nullable LookupEnvironment visitA1(@NonNull A1 element) {
    	   	
	    @SuppressWarnings("null")
	    final @NonNull /*@Thrown*/ List<B> ownsB = element.getOwnsB();
	    @SuppressWarnings("null")
	    final @NonNull /*@Thrown*/ LookupEnvironment addElements = context.addElements((EList<B>)ownsB);
	    return addElements;
    }
    
    @Override
    public @Nullable LookupEnvironment visitA2(@NonNull A2 element) {
    	   	
	    @SuppressWarnings("null")
	    final @NonNull /*@Thrown*/ List<C> ownsC = element.getOwnsC();
	    @SuppressWarnings("null")
	    final @NonNull /*@Thrown*/ LookupEnvironment addElements = context.addElements((EList<C>)ownsC);
	    return addElements;
    }
    
}
