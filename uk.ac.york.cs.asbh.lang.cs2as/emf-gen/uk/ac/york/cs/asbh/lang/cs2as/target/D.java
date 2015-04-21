/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target;

import org.eclipse.emf.ecore.EObject;
import uk.ac.york.cs.asbh.lang.cs2as.target.util.Visitable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToC <em>To C</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToB <em>To B</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToA <em>To A</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsB <em>Refs B</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsC <em>Refs C</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getD()
 * @model superTypes="uk.ac.york.cs.asbh.lang.cs2as.target.Visitable"
 * @generated
 */
public interface D extends EObject, Visitable {
	/**
	 * Returns the value of the '<em><b>To C</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.C#getOwnsD <em>Owns D</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To C</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To C</em>' container reference.
	 * @see #setToC(C)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getD_ToC()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.C#getOwnsD
	 * @model opposite="ownsD" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0!D!toC'"
	 * @generated
	 */
	C getToC();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToC <em>To C</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To C</em>' container reference.
	 * @see #getToC()
	 * @generated
	 */
	void setToC(C value);

	/**
	 * Returns the value of the '<em><b>To B</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.target.B#getOwnsD <em>Owns D</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To B</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To B</em>' container reference.
	 * @see #setToB(B)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getD_ToB()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.B#getOwnsD
	 * @model opposite="ownsD" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0!D!toB'"
	 * @generated
	 */
	B getToB();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToB <em>To B</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To B</em>' container reference.
	 * @see #getToB()
	 * @generated
	 */
	void setToB(B value);

	/**
	 * Returns the value of the '<em><b>To A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To A</em>' reference.
	 * @see #setToA(A)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getD_ToA()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0!D!toA'"
	 * @generated
	 */
	A getToA();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getToA <em>To A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To A</em>' reference.
	 * @see #getToA()
	 * @generated
	 */
	void setToA(A value);

	/**
	 * Returns the value of the '<em><b>Refs B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs B</em>' reference.
	 * @see #setRefsB(B)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getD_RefsB()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0!D!refsB'"
	 * @generated
	 */
	B getRefsB();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsB <em>Refs B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refs B</em>' reference.
	 * @see #getRefsB()
	 * @generated
	 */
	void setRefsB(B value);

	/**
	 * Returns the value of the '<em><b>Refs C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs C</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs C</em>' reference.
	 * @see #setRefsC(C)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.TargetPackage#getD_RefsC()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/targetMM/1.0!D!refsC'"
	 * @generated
	 */
	C getRefsC();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.D#getRefsC <em>Refs C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refs C</em>' reference.
	 * @see #getRefsC()
	 * @generated
	 */
	void setRefsC(C value);

} // D
