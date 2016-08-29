package uk.ac.york.cs.cs2as.generator

import org.eclipse.emf.ecore.EObject
import org.eclipse.ocl.xtext.basecs.util.BaseCSSwitch
import org.eclipse.ocl.xtext.basecs.PathNameCS
import org.eclipse.ocl.xtext.basecs.PathElementCS
import org.eclipse.ocl.xtext.basecs.ImportCS
import org.eclipse.ocl.xtext.basecs.PathElementWithURICS
import org.eclipse.ocl.xtext.basecs.PrimitiveTypeRefCS

class BaseCSToStringVisitor extends BaseCSSwitch<String>{
	
	
	override defaultCase(EObject object) {
		throw new IllegalStateException(class.name + " doesn't implement " + object.eClass.name + " case");
	}
	
	override caseImportCS(ImportCS object) {
		var importName = if (object.name != null) ''' «object.name» :''' else '';
		 
		'''import «importName» '«object.ownedPathName.doSwitch»' '''
	}

	override casePathNameCS(PathNameCS object) {
		var firstPathElmnt = object.ownedPathElements.get(0)
		'''«FOR pElement: object.ownedPathElements»«IF pElement!=firstPathElmnt»::«ENDIF»«pElement.doSwitch»«ENDFOR»'''
	}
	
	override casePathElementCS(PathElementCS object) {
		// TODO include all additional CompleteOCL keywords
		if (#['body','context'].contains(object.name))
			'''_«object.name»'''
		else
			object.name;
	}
	
	override casePathElementWithURICS(PathElementWithURICS object) {
		object.uri;
	}
	
	override casePrimitiveTypeRefCS(PrimitiveTypeRefCS object) {
		val mult = object.ownedMultiplicity;
		'''«object.name»«IF mult!=null»«mult.doSwitch»«ENDIF»'''
	}
}