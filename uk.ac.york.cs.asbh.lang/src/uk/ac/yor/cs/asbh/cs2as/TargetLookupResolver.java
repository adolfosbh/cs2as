package uk.ac.yor.cs.asbh.cs2as;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.pivot.evaluation.Executor;

import uk.ac.york.cs.asbh.lang.cs2as.target.B;
import uk.ac.york.cs.asbh.lang.cs2as.target.C;
import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;
import uk.ac.york.cs.asbh.lang.cs2as.target.Namespace;
import uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;

public class TargetLookupResolver {
	
	private Executor executor;
		
	public TargetLookupResolver(Executor executor) {
		this.executor = executor;
	}
	
	public LookupResult<NamedElement> lookupNamedElement(Visitable fromElement, String name, boolean isLocal) { 
	
        LookupEnvironment _lookupEnv = new LookupEnvironment(executor, name, TargetPackage.Literals.NAMED_ELEMENT, isLocal);
        TargetLookupVisitor _lookupVisitor = new TargetLookupVisitor(_lookupEnv);
        EList<NamedElement> _lookupResult = fromElement.accept(_lookupVisitor).getNamedElements();
        return new LookupResultImpl<NamedElement>(_lookupResult);
	}
	
	public LookupResult<Namespace> lookupNamespace(Visitable fromElement, String name, boolean isLocal) {
		
		LookupEnvironment _lookupEnv = new LookupEnvironment(executor, name, TargetPackage.Literals.NAMESPACE, isLocal);
	    TargetLookupVisitor _lookupVisitor = new TargetLookupVisitor(_lookupEnv);
	    List<Namespace> nLookupResults = new ArrayList<Namespace>();
	    for (NamedElement ne : fromElement.accept(_lookupVisitor).getNamedElements()){ 
	    	nLookupResults.add((Namespace)ne);
	    }
	    return new LookupResultImpl<Namespace>(nLookupResults);
	}
	
	public LookupResult<C> lookupC(Visitable fromElement, String name, boolean isLocal) {
		
		LookupEnvironment _lookupEnv = new LookupEnvironment(executor, name, TargetPackage.Literals.C, isLocal);
	    TargetLookupVisitor _lookupVisitor = new TargetLookupVisitor(_lookupEnv);
	    List<C> cLookupResults = new ArrayList<C>();
	    for (NamedElement ne : fromElement.accept(_lookupVisitor).getNamedElements()){ 
	    	cLookupResults.add((C)ne);
	    }
	    return new LookupResultImpl<C>(cLookupResults);
	}
	
	public LookupResult<B> lookupB(Visitable fromElement, String name, boolean isLocal) {
		LookupEnvironment _lookupEnv = new LookupEnvironment(executor, name, TargetPackage.Literals.B, isLocal);
	    TargetLookupVisitor _lookupVisitor = new TargetLookupVisitor(_lookupEnv);
	    List<B> bLookupResults = new ArrayList<B>();
	    for (NamedElement ne : fromElement.accept(_lookupVisitor).getNamedElements()){ 
	    	bLookupResults.add((B)ne);
	    }
	    return new LookupResultImpl<B>(bLookupResults);
	}
}