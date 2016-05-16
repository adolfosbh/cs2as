/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.miniOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.LogicExpCS#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.LogicExpCS#getOp <em>Op</em>}</li>
 *   <li>{@link uk.ac.york.cs.miniocl.miniOCL.LogicExpCS#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getLogicExpCS()
 * @model
 * @generated
 */
public interface LogicExpCS extends ExpCS
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LogicExpCS)
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getLogicExpCS_Left()
   * @model containment="true"
   * @generated
   */
  LogicExpCS getLeft();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.miniocl.miniOCL.LogicExpCS#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicExpCS value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getLogicExpCS_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.miniocl.miniOCL.LogicExpCS#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(CallExpCS)
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#getLogicExpCS_Right()
   * @model containment="true"
   * @generated
   */
  CallExpCS getRight();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.miniocl.miniOCL.LogicExpCS#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(CallExpCS value);

} // LogicExpCS
