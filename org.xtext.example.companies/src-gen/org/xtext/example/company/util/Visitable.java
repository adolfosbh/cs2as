/*******************************************************************************
 * <copyright>
 *
 * </copyright>
 *
 * This code is auto-generated
 * from: org.xtext.example.companies/model/Company.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.xtext.example.company.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;

public interface Visitable
{
	/**
	 * Returns the result of accepting a visit from a visitor.
	 * Implementations typically invoke a derived-class-specific
	 * variant of visitXXX() to facilitate derived-class-specific
	 * processing or just visit() when no such method is available.
	 * <p>
	 * Implementations of visit() may use the EcoreSwitch to perform
	 * derived-class-specific processing.
	 * <p>
	 * Derived implementations of accept() may use getAdapter() to obtain
	 * richer visitor interfaces.
	 * @param <R>
	 * @param visitor
	 * @return the result of the visit.
	 */
	<R> R accept(org.xtext.example.company.util.@NonNull Visitor<R> visitor);

	EClass eClass();
}
