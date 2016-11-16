/**
 */
package org.xtext.example.delphi.astm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.xtext.example.delphi.astm.AnnotationExpression;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.Expression;
import org.xtext.example.delphi.astm.TypeReference;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.AnnotationExpressionImpl#getAnnotationType <em>Annotation Type</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.AnnotationExpressionImpl#getMemberValues <em>Member Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationExpressionImpl extends ExpressionImpl implements AnnotationExpression {
	/**
	 * The cached value of the '{@link #getAnnotationType() <em>Annotation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference annotationType;

	/**
	 * The cached value of the '{@link #getMemberValues() <em>Member Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> memberValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.ANNOTATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getAnnotationType() {
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationType(TypeReference newAnnotationType, NotificationChain msgs) {
		TypeReference oldAnnotationType = annotationType;
		annotationType = newAnnotationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, oldAnnotationType, newAnnotationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationType(TypeReference newAnnotationType) {
		if (newAnnotationType != annotationType) {
			NotificationChain msgs = null;
			if (annotationType != null)
				msgs = ((InternalEObject)annotationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, null, msgs);
			if (newAnnotationType != null)
				msgs = ((InternalEObject)newAnnotationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, null, msgs);
			msgs = basicSetAnnotationType(newAnnotationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, newAnnotationType, newAnnotationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getMemberValues() {
		if (memberValues == null) {
			memberValues = new EObjectContainmentEList<Expression>(Expression.class, this, AstmPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES);
		}
		return memberValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				return basicSetAnnotationType(null, msgs);
			case AstmPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				return ((InternalEList<?>)getMemberValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				return getAnnotationType();
			case AstmPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				return getMemberValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				setAnnotationType((TypeReference)newValue);
				return;
			case AstmPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				getMemberValues().clear();
				getMemberValues().addAll((Collection<? extends Expression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				setAnnotationType((TypeReference)null);
				return;
			case AstmPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				getMemberValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AstmPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				return annotationType != null;
			case AstmPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				return memberValues != null && !memberValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitAnnotationExpression(this);
	}

} //AnnotationExpressionImpl
