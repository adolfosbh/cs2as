/*
 * generated by Xtext
 */
package uk.ac.york.cs.cs2as;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CS2ASDSLStandaloneSetup extends CS2ASDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new CS2ASDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

