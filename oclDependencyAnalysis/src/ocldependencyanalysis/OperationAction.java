package ocldependencyanalysis;

import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;

public class OperationAction extends ComputationOperation implements   IActionNode{

	public OperationAction(Type context, Operation operation) {
		super(context, operation);
	}

}
