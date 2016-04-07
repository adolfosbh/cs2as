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

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.Executor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.TargetUnqualifiedA1LookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.TargetUnqualifiedA2LookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.TargetUnqualifiedBLookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.TargetUnqualifiedCLookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.TargetQualifiedBLookupVisitor;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.TargetQualifiedCLookupVisitor;


public class TargetLookupSolver {
	
	protected final @NonNull Executor executor;
	
	public TargetLookupSolver (@NonNull Executor executor) {
		this.executor = executor;
	}
	
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.B> _lookupQualifiedB(uk.ac.york.cs.asbh.lang.cs2as.target.A1 context, java.lang.String bName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.B,bName);
		TargetQualifiedBLookupVisitor _lookupVisitor = new TargetQualifiedBLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.B>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.B.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.C> _lookupQualifiedC(uk.ac.york.cs.asbh.lang.cs2as.target.A2 context, java.lang.String cName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.C,cName);
		TargetQualifiedCLookupVisitor _lookupVisitor = new TargetQualifiedCLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.C>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.C.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.A1> _lookupUnqualifiedA1(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable context, java.lang.String aName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A1,aName);
		TargetUnqualifiedA1LookupVisitor _lookupVisitor = new TargetUnqualifiedA1LookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A1>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.A1.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.A2> _lookupUnqualifiedA2(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable context, java.lang.String aName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.A2,aName);
		TargetUnqualifiedA2LookupVisitor _lookupVisitor = new TargetUnqualifiedA2LookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.A2>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.A2.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.B> _lookupUnqualifiedB(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable context, java.lang.String bName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.B,bName);
		TargetUnqualifiedBLookupVisitor _lookupVisitor = new TargetUnqualifiedBLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.B>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.B.class));
	}
	
	public TargetLookupResult<uk.ac.york.cs.asbh.lang.cs2as.target.C> _lookupUnqualifiedC(uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable context, java.lang.String cName) {
		TargetSingleResultLookupEnvironment _lookupEnv = new TargetSingleResultLookupEnvironment(executor, uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage.Literals.C,cName);
		TargetUnqualifiedCLookupVisitor _lookupVisitor = new TargetUnqualifiedCLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new TargetLookupResultImpl<uk.ac.york.cs.asbh.lang.cs2as.target.C>
				(_lookupEnv.getNamedElementsByKind(uk.ac.york.cs.asbh.lang.cs2as.target.C.class));
	}
}
