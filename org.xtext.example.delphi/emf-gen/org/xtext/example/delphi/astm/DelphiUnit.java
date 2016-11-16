/**
 */
package org.xtext.example.delphi.astm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delphi Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiUnit#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiUnit#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.DelphiUnit#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiUnit()
 * @model
 * @generated
 */
public interface DelphiUnit extends CompilationUnit {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiUnit_Name()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!DelphiUnit!name'"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DelphiUnit#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(DelphiInterfaceSection)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiUnit_Interface()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!DelphiUnit!interface'"
	 * @generated
	 */
	DelphiInterfaceSection getInterface();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DelphiUnit#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(DelphiInterfaceSection value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(DelphiImplementationSection)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getDelphiUnit_Implementation()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!DelphiUnit!implementation'"
	 * @generated
	 */
	DelphiImplementationSection getImplementation();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.DelphiUnit#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(DelphiImplementationSection value);

} // DelphiUnit
