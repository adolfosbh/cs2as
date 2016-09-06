/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.Definition;
import org.xtext.example.delphi.astm.Name;
import org.xtext.example.delphi.astm.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.DefinitionImpl#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.DefinitionImpl#getDefinitionType <em>Definition Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DefinitionImpl extends DeclarationOrDefinitionImpl implements Definition {
	/**
	 * The cached value of the '{@link #getIdentifierName() <em>Identifier Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierName()
	 * @generated
	 * @ordered
	 */
	protected Name identifierName;

	/**
	 * The cached value of the '{@link #getDefinitionType() <em>Definition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference definitionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getIdentifierName() {
		return identifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifierName(Name newIdentifierName, NotificationChain msgs) {
		Name oldIdentifierName = identifierName;
		identifierName = newIdentifierName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.DEFINITION__IDENTIFIER_NAME, oldIdentifierName, newIdentifierName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierName(Name newIdentifierName) {
		if (newIdentifierName != identifierName) {
			NotificationChain msgs = null;
			if (identifierName != null)
				msgs = ((InternalEObject)identifierName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DEFINITION__IDENTIFIER_NAME, null, msgs);
			if (newIdentifierName != null)
				msgs = ((InternalEObject)newIdentifierName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DEFINITION__IDENTIFIER_NAME, null, msgs);
			msgs = basicSetIdentifierName(newIdentifierName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.DEFINITION__IDENTIFIER_NAME, newIdentifierName, newIdentifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getDefinitionType() {
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionType(TypeReference newDefinitionType, NotificationChain msgs) {
		TypeReference oldDefinitionType = definitionType;
		definitionType = newDefinitionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.DEFINITION__DEFINITION_TYPE, oldDefinitionType, newDefinitionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionType(TypeReference newDefinitionType) {
		if (newDefinitionType != definitionType) {
			NotificationChain msgs = null;
			if (definitionType != null)
				msgs = ((InternalEObject)definitionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DEFINITION__DEFINITION_TYPE, null, msgs);
			if (newDefinitionType != null)
				msgs = ((InternalEObject)newDefinitionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.DEFINITION__DEFINITION_TYPE, null, msgs);
			msgs = basicSetDefinitionType(newDefinitionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.DEFINITION__DEFINITION_TYPE, newDefinitionType, newDefinitionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.DEFINITION__IDENTIFIER_NAME:
				return basicSetIdentifierName(null, msgs);
			case AstmPackage.DEFINITION__DEFINITION_TYPE:
				return basicSetDefinitionType(null, msgs);
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
			case AstmPackage.DEFINITION__IDENTIFIER_NAME:
				return getIdentifierName();
			case AstmPackage.DEFINITION__DEFINITION_TYPE:
				return getDefinitionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstmPackage.DEFINITION__IDENTIFIER_NAME:
				setIdentifierName((Name)newValue);
				return;
			case AstmPackage.DEFINITION__DEFINITION_TYPE:
				setDefinitionType((TypeReference)newValue);
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
			case AstmPackage.DEFINITION__IDENTIFIER_NAME:
				setIdentifierName((Name)null);
				return;
			case AstmPackage.DEFINITION__DEFINITION_TYPE:
				setDefinitionType((TypeReference)null);
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
			case AstmPackage.DEFINITION__IDENTIFIER_NAME:
				return identifierName != null;
			case AstmPackage.DEFINITION__DEFINITION_TYPE:
				return definitionType != null;
		}
		return super.eIsSet(featureID);
	}


} //DefinitionImpl
