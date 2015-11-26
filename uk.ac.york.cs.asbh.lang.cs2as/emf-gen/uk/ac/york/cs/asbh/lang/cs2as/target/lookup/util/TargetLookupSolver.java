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

import org.eclipse.ocl.pivot.evaluation.Executor;

public class TargetLookupSolver {
	
	private Executor executor;
		
	public TargetLookupSolver (Executor executor) {
		this.executor = executor;
	}
	
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.B> _lookupQualifiedB(uk.ac.york.cs.asbh.lang.cs2as.target.A1 fromElement, String bName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.B, bName);
		TargetQualificationLookupVisitor _lookupVisitor = new TargetQualificationLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.B>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.B.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.C> _lookupQualifiedC(uk.ac.york.cs.asbh.lang.cs2as.target.A2 fromElement, String cName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.C, cName);
		TargetQualificationLookupVisitor _lookupVisitor = new TargetQualificationLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.C>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.C.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.A1> _lookupA1(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable fromElement, String aName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A1, aName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A1>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.A1.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.A2> _lookupA2(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable fromElement, String aName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A2, aName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A2>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.A2.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.B> _lookupB(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable fromElement, String bName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.B, bName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.B>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.B.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.C> _lookupC(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable fromElement, String cName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.C, cName);
		TargetDefaultLookupVisitor _lookupVisitor = new TargetDefaultLookupVisitor(_lookupEnv);
		fromElement.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.C>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.C.class));
	}
}
