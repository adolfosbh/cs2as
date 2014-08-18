package ocldependencyanalysis;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;

public class ConstructorExpFeatureObj extends FeatureObj {

	private static Map<String, Integer> hash2nextIndex = new HashMap<String, Integer>();
	private static Map<ConstructorExp, Integer> constructor2index = new HashMap<ConstructorExp, Integer>();
	private ConstructorExp constructorExp;
	private int index;
	
	public ConstructorExpFeatureObj(Type context, Operation astOperation, ConstructorExp constructorExp) {
		super(context, astOperation);
		this.constructorExp = constructorExp;
		this.index = computeIndex();
	}
	
	private int computeIndex() {
		Integer counter = constructor2index.get(constructorExp);
		if (counter == null) {
			String hash = computeHash();
			counter = hash2nextIndex.get(hash);			
			if (counter == null) counter = 1;
			constructor2index.put(constructorExp, counter);
			hash2nextIndex.put(hash, counter + 1);
		}
		return counter;
	}
	
	private String computeHash() {
		return getContext().toString() + "-to-" + constructorExp.getType().toString();
	}
	
	public Type getConstructedType() {
		return constructorExp.getType();
	}
	

//	FIXME 	
//  For the time being, I disable the index based ConstructionTypeFeatureObj, because I'm going 
//	to try the analysis of cst operations, which may the need of these index vanish. 
//	If we finally go for that CS2CS remove all thhese ConstructorExp2Index static information
//	@Override
//	public String toString() {
//		Integer lastIndex = hash2nextIndex.get(computeHash());
//		// String index = lastIndex > 2 ? String.valueOf(this.index) : EMPTY_STRING;
//		return getContext().getName() + 
//				LEFT_BRACKET +
//				getFeaturePrefix() +
//				getFeature().getName() +
//				TYPE_SEP +
//				constructorExp.getType().getName() +
//				RIGHT_BRACKET +
//				index; 
//	}
}