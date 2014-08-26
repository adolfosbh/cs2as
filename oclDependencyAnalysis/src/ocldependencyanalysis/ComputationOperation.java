package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;

public abstract class ComputationOperation extends Computation {

	private Operation operation;
	
	public ComputationOperation(Type context, Operation operation) {
		super(context, operation);
		this.operation = operation;
	}
	
	public Operation getOperation() {
		return operation;
	}
	
	@Override
	public String toString() {
		return operation.getOwningType().getName() + "::" + operation.getName();
	}
}
