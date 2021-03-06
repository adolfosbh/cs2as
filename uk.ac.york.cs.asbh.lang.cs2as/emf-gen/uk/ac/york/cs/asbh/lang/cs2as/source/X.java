/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#getOwnsY <em>Owns Y</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA1 <em>Is A1</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA2 <em>Is A2</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX()
 * @model
 * @generated
 */
public interface X extends SElement {
	/**
	 * Returns the value of the '<em><b>Owns Y</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.source.Y}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX <em>To X</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns Y</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Y</em>' containment reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX_OwnsY()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.Y#getToX
	 * @model opposite="toX" containment="true"
	 * @generated
	 */
	EList<Y> getOwnsY();

	/**
	 * Returns the value of the '<em><b>Is A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is A1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A1</em>' attribute.
	 * @see #setIsA1(boolean)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX_IsA1()
	 * @model
	 * @generated
	 */
	boolean isIsA1();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA1 <em>Is A1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is A1</em>' attribute.
	 * @see #isIsA1()
	 * @generated
	 */
	void setIsA1(boolean value);

	/**
	 * Returns the value of the '<em><b>Is A2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is A2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A2</em>' attribute.
	 * @see #setIsA2(boolean)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX_IsA2()
	 * @model
	 * @generated
	 */
	boolean isIsA2();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#isIsA2 <em>Is A2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is A2</em>' attribute.
	 * @see #isIsA2()
	 * @generated
	 */
	void setIsA2(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getX_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.X#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // X
