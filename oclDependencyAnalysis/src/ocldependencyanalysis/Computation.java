package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Type;

// FIXME Move all the computation graph staff to a proper model 
public abstract class Computation {
	
	private Type context;
	
	private Element element;
	
	/**
	 * @param context the CS context in which the computation is performed
	 */
	public Computation(Type context, Element element) {
		this.context = context;
		this.element = element;
	}
	
	public Type getContext() {
		return context;
	}
	
	
	public Element getReferredElement() {
		return element;
	}

//	<C extends Computation> C cast() {		
//		return (C)this; 
//	}

}
