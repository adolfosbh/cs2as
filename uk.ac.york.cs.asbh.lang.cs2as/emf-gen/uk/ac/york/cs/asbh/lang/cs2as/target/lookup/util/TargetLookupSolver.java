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
		LookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A1, aName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		List<uk.ac.york.cs.asbh.lang.cs2as.target.A1> nLookupResults = new ArrayList<uk.ac.york.cs.asbh.lang.cs2as.target.A1>();
		for (NamedElement ne : fromElement.accept(_lookupVisitor).getNamedElements()) {
			nLookupResults.add((uk.ac.york.cs.asbh.lang.cs2as.target.A1)ne);
		}
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A1>(nLookupResults);
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.A2> lookupA2(Visitable fromElement, String aName) {
		LookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A2, aName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		List<uk.ac.york.cs.asbh.lang.cs2as.target.A2> nLookupResults = new ArrayList<uk.ac.york.cs.asbh.lang.cs2as.target.A2>();
		for (NamedElement ne : fromElement.accept(_lookupVisitor).getNamedElements()) {
			nLookupResults.add((uk.ac.york.cs.asbh.lang.cs2as.target.A2)ne);
		}
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A2>(nLookupResults);
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.B> lookupB(Visitable fromElement, String bName) {
		LookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.B, bName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		List<uk.ac.york.cs.asbh.lang.cs2as.target.B> nLookupResults = new ArrayList<uk.ac.york.cs.asbh.lang.cs2as.target.B>();
		for (NamedElement ne : fromElement.accept(_lookupVisitor).getNamedElements()) {
			nLookupResults.add((uk.ac.york.cs.asbh.lang.cs2as.target.B)ne);
		}
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.B>(nLookupResults);
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.C> lookupC(Visitable fromElement, String cName) {
		LookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.C, cName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		List<uk.ac.york.cs.asbh.lang.cs2as.target.C> nLookupResults = new ArrayList<uk.ac.york.cs.asbh.lang.cs2as.target.C>();
		for (NamedElement ne : fromElement.accept(_lookupVisitor).getNamedElements()) {
			nLookupResults.add((uk.ac.york.cs.asbh.lang.cs2as.target.C)ne);
		}
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.C>(nLookupResults);
	}
}
