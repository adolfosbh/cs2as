package uk.ac.york.cs.cs2as.generator

import java.util.Map
import java.util.List
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperClass
import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperOp

class CS2ASDSL_To_OCLHelpersVisitor extends CS2ASDSL_To_OCLBaseVisitor {
		
	Map<String, List<HelperClass>> package2classHelpers;
	
	def private computePackage2classHelpers(HelpersSect sect) {
		
		if (sect == null) {
			return emptyMap;
		}
		
		val Map<String, List<HelperClass>> result = newHashMap();
		
		for (classHelper : sect.classHelpers) {
			// Fixme temporal workaround
			val packageName = classHelper.context.ownedPathElements.get(0).name
			var classHelpers = result.get(packageName);
			if (classHelpers == null) {
				classHelpers = newArrayList();
				result.put(packageName,classHelpers);
			}
			classHelpers.add(classHelper);
		}
		return result;
	}
	
	override caseCS2ASModel(CS2ASModel object) {
		// Some initial computations
		
		
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.source.doSwitch»
		«object.target.doSwitch»
		''');
		
		
		package2classHelpers = computePackage2classHelpers(object.helpersSect);
		
		for (entry : package2classHelpers.entrySet) {
			sb.append('''
			package «entry.key»
			
			«FOR classHelper : entry.value»«classHelper.doSwitch»
			«ENDFOR»
			
			endpackage
			''')
		}
		sb.toString;
	}

	override caseHelperClass(HelperClass object) {
		
		'''
		context «object.context.doSwitch»
		«FOR helper : object.helpers»«helper.doSwitch»
		«ENDFOR»
		'''
	}	
	
	override caseHelperOp(HelperOp object) {
		val params = object.params;
		val type = if (object.ownedType == null) ':' else ''':«object.ownedType.doSwitch»'''
		val template = if (object.ownedSignature == null) '' else '''«object.ownedSignature.doSwitch» '''  
		'''
		def : «template»«object.name»(«FOR param : params»«IF params.indexOf(param)>0», «ENDIF»«param.doSwitch»«ENDFOR») «type» =
			«object.helperBody.doSwitch»
		'''
	}

}