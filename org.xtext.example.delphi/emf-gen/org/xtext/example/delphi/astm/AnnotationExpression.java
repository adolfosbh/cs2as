/**
 */
package org.xtext.example.delphi.astm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.AnnotationExpression#getAnnotationType <em>Annotation Type</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.AnnotationExpression#getMemberValues <em>Member Values</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.delphi.astm.AstmPackage#getAnnotationExpression()
 * @model
 * @generated
 */
public interface AnnotationExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Annotation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Type</em>' containment reference.
	 * @see #setAnnotationType(TypeReference)
	 * @see org.xtext.example.delphi.astm.AstmPackage#getAnnotationExpression_AnnotationType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getAnnotationType();

	/**
	 * Sets the value of the '{@link org.xtext.example.delphi.astm.AnnotationExpression#getAnnotationType <em>Annotation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Type</em>' containment reference.
	 * @see #getAnnotationType()
	 * @generated
	 */
	void setAnnotationType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Member Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.delphi.astm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Values</em>' containment reference list.
	 * @see org.xtext.example.delphi.astm.AstmPackage#getAnnotationExpression_MemberValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getMemberValues();

} // AnnotationExpression
