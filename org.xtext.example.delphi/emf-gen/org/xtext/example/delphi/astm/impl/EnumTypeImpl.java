/**
 */
package org.xtext.example.delphi.astm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.EnumLiteralDefinition;
import org.xtext.example.delphi.astm.EnumType;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.EnumTypeImpl#getEnumLiterals <em>Enum Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumTypeImpl extends DataTypeImpl implements EnumType {
	/**
	 * The cached value of the '{@link #getEnumLiterals() <em>Enum Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumLiteralDefinition> enumLiterals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.ENUM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumLiteralDefinition> getEnumLiterals() {
		if (enumLiterals == null) {
			enumLiterals = new EObjectContainmentEList<EnumLiteralDefinition>(EnumLiteralDefinition.class, this, AstmPackage.ENUM_TYPE__ENUM_LITERALS);
		}
		return enumLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.ENUM_TYPE__ENUM_LITERALS:
				return ((InternalEList<?>)getEnumLiterals()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.ENUM_TYPE__ENUM_LITERALS:
				return getEnumLiterals();
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
			case AstmPackage.ENUM_TYPE__ENUM_LITERALS:
				getEnumLiterals().clear();
				getEnumLiterals().addAll((Collection<? extends EnumLiteralDefinition>)newValue);
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
			case AstmPackage.ENUM_TYPE__ENUM_LITERALS:
				getEnumLiterals().clear();
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
			case AstmPackage.ENUM_TYPE__ENUM_LITERALS:
				return enumLiterals != null && !enumLiterals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitEnumType(this);
	}

} //EnumTypeImpl
