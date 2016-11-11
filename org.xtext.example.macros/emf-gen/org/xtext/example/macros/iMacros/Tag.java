/**
 */
package org.xtext.example.macros.iMacros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.macros.iMacros.Tag#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.macros.iMacros.Tag#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.example.macros.iMacros.Tag#getPos <em>Pos</em>}</li>
 *   <li>{@link org.xtext.example.macros.iMacros.Tag#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Instruction {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getTag_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.xtext.example.macros.iMacros.Tag#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' attribute.
	 * @see #setAttr(String)
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getTag_Attr()
	 * @model
	 * @generated
	 */
	String getAttr();

	/**
	 * Sets the value of the '{@link org.xtext.example.macros.iMacros.Tag#getAttr <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr</em>' attribute.
	 * @see #getAttr()
	 * @generated
	 */
	void setAttr(String value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(int)
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getTag_Pos()
	 * @model
	 * @generated
	 */
	int getPos();

	/**
	 * Sets the value of the '{@link org.xtext.example.macros.iMacros.Tag#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(int value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.xtext.example.macros.iMacros.IMacrosPackage#getTag_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.xtext.example.macros.iMacros.Tag#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Tag
