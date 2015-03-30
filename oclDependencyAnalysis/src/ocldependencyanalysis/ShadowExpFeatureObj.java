package ocldependencyanalysis;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.ShadowExp;
import org.eclipse.ocl.pivot.Type;

public class ShadowExpFeatureObj extends FeatureObj {

	private static Map<String, Integer> hash2nextIndex = new HashMap<String, Integer>();
	private static Map<ShadowExp, Integer> shadow2index = new HashMap<ShadowExp, Integer>();
	private ShadowExp shadowExp;
	private int index;
	
	public ShadowExpFeatureObj(Type context, Operation astOperation, ShadowExp shadowExp) {
		super(context, astOperation);
		this.shadowExp = shadowExp;
		this.index = computeIndex();
	}
	
	private int computeIndex() {
		Integer counter = shadow2index.get(shadowExp);
		if (counter == null) {
			String hash = computeHash();
			counter = hash2nextIndex.get(hash);			
			if (counter == null) counter = 1;
			shadow2index.put(shadowExp, counter);
			hash2nextIndex.put(hash, counter + 1);
		}
		return counter;
	}
	
	private String computeHash() {
		return getContext().toString() + "-to-" + shadowExp.getType().toString();
	}
	
	public Type getConstructedType() {
		return shadowExp.getType();
	}
	

	//	FIXME 	
	//  For the time being, I disable the index based ConstructionTypeFeatureObj, because I'm going 
	//	to try the analysis of cst operations, which may the need of these index vanish. 
	//	If we finally go for that CS2CS remove all thhese ShadowExp2Index static information
	@Override
	public String toString() {
		//Integer lastIndex = hash2nextIndex.get(computeHash());
		// String index = lastIndex > 2 ? String.valueOf(this.index) : EMPTY_STRING;
		return getContext().getName() + 
				LEFT_BRACKET +
				getFeaturePrefix() +
				getFeature().getName() +
				TYPE_SEP +
				shadowExp.getType().getName() +
				RIGHT_BRACKET;
		//		+ index; 
	}
}