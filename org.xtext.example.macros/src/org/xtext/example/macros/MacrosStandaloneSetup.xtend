/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.macros


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MacrosStandaloneSetup extends MacrosStandaloneSetupGenerated {

	def static void doSetup() {
		new MacrosStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
