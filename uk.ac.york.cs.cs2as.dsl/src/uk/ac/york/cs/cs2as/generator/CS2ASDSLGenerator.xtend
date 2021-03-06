/*
 * generated by Xtext
 */
package uk.ac.york.cs.cs2as.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CS2ASDSLGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val baseFileName = resource.URI.trimFileExtension.lastSegment;
		val mappingsfileName = baseFileName+".ocl";
		val lookupFileName = baseFileName+"Lookup.ocl";
		val disambiguationFileName = baseFileName+"Disambiguation.ocl";
		val helpersFileNAme = baseFileName+"Helpers.ocl"
		val rootElement = resource.contents.get(0);
		fsa.generateFile(mappingsfileName, new CS2ASDSL_To_OCLMappingsVisitor(baseFileName).doSwitch(rootElement))
		fsa.generateFile(lookupFileName, new CS2ASDSL_To_OCLLookupVisitor(baseFileName).doSwitch(rootElement))
		fsa.generateFile(disambiguationFileName, new CS2ASDSL_To_OCLDisambiguationVisitor(baseFileName).doSwitch(rootElement))
		fsa.generateFile(helpersFileNAme, new CS2ASDSL_To_OCLHelpersVisitor().doSwitch(rootElement))
	}
}