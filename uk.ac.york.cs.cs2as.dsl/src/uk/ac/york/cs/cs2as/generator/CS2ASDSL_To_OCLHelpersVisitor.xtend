package uk.ac.york.cs.cs2as.generator

import java.util.Map
import uk.ac.york.cs.cs2as.cs2as_dsl.Model
import uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper
import java.util.List
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect
import uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef

class CS2ASDSL_To_OCLHelpersVisitor extends CS2ASDSL_To_OCLBaseVisitor {
		
	Map<String, List<ClassHelper>> package2classHelpers;
	
	def private computePackage2classHelpers(HelpersSect sect) {
		
		if (sect == null) {
			return emptyMap;
		}
		
		val Map<String, List<ClassHelper>> result = newHashMap();
		
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
	
	override caseModel(Model object) {
		// Some initial computations
		
		
		val StringBuilder sb = new StringBuilder();
		sb.append('''
		«object.csDecl.doSwitch»
		«object.asDecl.doSwitch»
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

	override caseClassHelper(ClassHelper object) {
		
		'''
		context «object.context.doSwitch»
		«FOR helper : object.helpers»«helper.doSwitch»
		«ENDFOR»
		'''
	}	
	
	override caseHelperDef(HelperDef object) {
		val params = object.params;
		val type = if (object.ownedType == null) ':' else ''':«object.ownedType.doSwitch»'''
		val template = if (object.ownedSignature == null) '' else '''«object.ownedSignature.doSwitch» '''  
		'''
		def : «template»«object.name»(«FOR param : params»«IF params.indexOf(param)>0», «ENDIF»«param.doSwitch»«ENDFOR») «type» =
			«object.helperBody.doSwitch»
		'''
	}

}