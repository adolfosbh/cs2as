/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.ClassType#getDerivesFrom <em>Derives From</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getClassType()
 * @model
 * @generated
 */
public interface ClassType extends AggregateType {
	/**
	 * Returns the value of the '<em><b>Derives From</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.DerivesFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derives From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derives From</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getClassType_DerivesFrom()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://modelum.es/modernization/astm!ClassType!derivesFrom'"
	 * @generated
	 */
	EList<DerivesFrom> getDerivesFrom();

} // ClassType
