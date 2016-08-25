/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.asbh.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uk.ac.york.cs.asbh.lang.ui.internal.LangActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ASBHLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LangActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LangActivator.getInstance().getInjector(LangActivator.UK_AC_YORK_CS_ASBH_ASBHLANG);
	}
	
}