/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xcore.XAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Name Referencer Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef#getNameReferencer <em>Name Referencer</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef#getNameProperty <em>Name Property</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getDefaultNameReferencerDef()
 * @model
 * @generated
 */
public interface DefaultNameReferencerDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Referencer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Referencer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Referencer</em>' attribute.
   * @see #setNameReferencer(String)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getDefaultNameReferencerDef_NameReferencer()
   * @model
   * @generated
   */
  String getNameReferencer();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef#getNameReferencer <em>Name Referencer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Referencer</em>' attribute.
   * @see #getNameReferencer()
   * @generated
   */
  void setNameReferencer(String value);

  /**
   * Returns the value of the '<em><b>Name Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Property</em>' reference.
   * @see #setNameProperty(XAttribute)
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getDefaultNameReferencerDef_NameProperty()
   * @model
   * @generated
   */
  XAttribute getNameProperty();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef#getNameProperty <em>Name Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Property</em>' reference.
   * @see #getNameProperty()
   * @generated
   */
  void setNameProperty(XAttribute value);

} // DefaultNameReferencerDef
