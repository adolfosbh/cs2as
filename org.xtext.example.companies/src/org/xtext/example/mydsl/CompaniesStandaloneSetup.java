/*
 * generated by Xtext
 */
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CompaniesStandaloneSetup extends CompaniesStandaloneSetupGenerated{

	public static void doSetup() {
		new CompaniesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

