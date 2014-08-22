package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Type;

// FIXME Move all the computation graph staff to a proper model 
public abstract class Computation {
	
	private Type context;
	
	/**
	 * @param context the CS context in which the computation is performed
	 */
	public Computation(Type context) {
		this.context = context;
	}
	
	public Type getContext() {
		return context;
	}
	
//	<C extends Computation> C cast() {		
//		return (C)this; 
//	}

}
