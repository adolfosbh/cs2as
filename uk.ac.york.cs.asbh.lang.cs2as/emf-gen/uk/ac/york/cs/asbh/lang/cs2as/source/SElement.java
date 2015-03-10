/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.SElement#getAst <em>Ast</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getSElement()
 * @model
 * @generated
 */
public interface SElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Ast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ast</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ast</em>' reference.
	 * @see #setAst(EObject)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getSElement_Ast()
	 * @model
	 * @generated
	 */
	EObject getAst();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.SElement#getAst <em>Ast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ast</em>' reference.
	 * @see #getAst()
	 * @generated
	 */
	void setAst(EObject value);

} // SElement
