/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.miniOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.CallExpCS#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.CallExpCS#getNameExp <em>Name Exp</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getCallExpCS()
 * @model
 * @generated
 */
public interface CallExpCS extends LogicExpCS
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(CallExpCS)
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getCallExpCS_Source()
   * @model containment="true"
   * @generated
   */
  CallExpCS getSource();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.miniocl.miniOCL.CallExpCS#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(CallExpCS value);

  /**
   * Returns the value of the '<em><b>Name Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Exp</em>' containment reference.
   * @see #setNameExp(NameExpCS)
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getCallExpCS_NameExp()
   * @model containment="true"
   * @generated
   */
  NameExpCS getNameExp();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.miniocl.miniOCL.CallExpCS#getNameExp <em>Name Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Exp</em>' containment reference.
   * @see #getNameExp()
   * @generated
   */
  void setNameExp(NameExpCS value);

} // CallExpCS
