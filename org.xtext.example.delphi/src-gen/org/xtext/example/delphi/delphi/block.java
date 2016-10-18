/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.block#getDeclSect <em>Decl Sect</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.block#getExports <em>Exports</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.block#getCompound <em>Compound</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.delphi.DelphiPackage#getblock()
 * @model
 * @generated
 */
public interface block extends CSTrace
{
  /**
	 * Returns the value of the '<em><b>Decl Sect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl Sect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl Sect</em>' containment reference.
	 * @see #setDeclSect(declSection)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getblock_DeclSect()
	 * @model containment="true"
	 * @generated
	 */
  declSection getDeclSect();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.block#getDeclSect <em>Decl Sect</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl Sect</em>' containment reference.
	 * @see #getDeclSect()
	 * @generated
	 */
  void setDeclSect(declSection value);

  /**
	 * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.delphi.exportsStmt}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exports</em>' containment reference list.
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getblock_Exports()
	 * @model containment="true"
	 * @generated
	 */
  EList<exportsStmt> getExports();

  /**
	 * Returns the value of the '<em><b>Compound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound</em>' containment reference.
	 * @see #setCompound(compoundStmt)
	 * @see org.xtext.example.delphi.delphi.DelphiPackage#getblock_Compound()
	 * @model containment="true"
	 * @generated
	 */
  compoundStmt getCompound();

  /**
	 * Sets the value of the '{@link org.xtext.example.delphi.delphi.block#getCompound <em>Compound</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound</em>' containment reference.
	 * @see #getCompound()
	 * @generated
	 */
  void setCompound(compoundStmt value);

} // block
