/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRoot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.SRoot#getOwnedX <em>Owned X</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getSRoot()
 * @model
 * @generated
 */
public interface SRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned X</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.source.X}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned X</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned X</em>' containment reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getSRoot_OwnedX()
	 * @model containment="true"
	 * @generated
	 */
	EList<X> getOwnedX();

} // SRoot
