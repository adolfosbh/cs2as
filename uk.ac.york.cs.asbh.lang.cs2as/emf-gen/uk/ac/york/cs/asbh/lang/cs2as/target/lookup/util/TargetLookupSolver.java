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
import java.util.List;

import org.eclipse.ocl.pivot.evaluation.Executor;
import uk.ac.york.cs.asbh.lang.cs2as.target.*;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment;
import uk.ac.york.cs.asbh.lang.cs2as.target.lookup.util.*;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;	

public class TargetLookupSolver {
	
	private Executor executor;
		
	public TargetLookupSolver (Executor executor) {
		this.executor = executor;
	}
	
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.A1> lookupA1(Visitable fromElement, String aName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A1, aName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A1>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.A1.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.A2> lookupA2(Visitable fromElement, String aName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A2, aName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A2>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.A2.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.B> lookupB(Visitable fromElement, String bName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.B, bName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.B>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.B.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.C> lookupC(Visitable fromElement, String cName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.C, cName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.C>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.C.class));
	}
}
