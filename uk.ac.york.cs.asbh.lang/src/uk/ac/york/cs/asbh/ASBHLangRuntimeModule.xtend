/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.asbh

import uk.ac.york.cs.asbh.linker.CS2ASLinker

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ASBHLangRuntimeModule extends AbstractASBHLangRuntimeModule {
	
	override bindILinker() {
		return CS2ASLinker;
	}
	
}