/**
 */
package astm.impl;

import astm.AstmPackage;
import astm.FormalParameterDeclaration;
import astm.FunctionDeclaration;
import astm.FunctionMemberAttributes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.plsql.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.FunctionDeclarationImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link astm.impl.FunctionDeclarationImpl#getFunctionMemberAttributes <em>Function Member Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends DeclarationImpl implements FunctionDeclaration {
	/**
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameterDeclaration> formalParameters;

	/**
	 * The cached value of the '{@link #getFunctionMemberAttributes() <em>Function Member Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 * @ordered
	 */
	protected FunctionMemberAttributes functionMemberAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getFunctionDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameterDeclaration> getFormalParameters() {
		if (formalParameters == null) {
			formalParameters = new EObjectContainmentEList<FormalParameterDeclaration>(FormalParameterDeclaration.class, this, AstmPackage.FUNCTION_DECLARATION__FORMAL_PARAMETERS);
		}
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMemberAttributes getFunctionMemberAttributes() {
		return functionMemberAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionMemberAttributes(FunctionMemberAttributes newFunctionMemberAttributes, NotificationChain msgs) {
		FunctionMemberAttributes oldFunctionMemberAttributes = functionMemberAttributes;
		functionMemberAttributes = newFunctionMemberAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES, oldFunctionMemberAttributes, newFunctionMemberAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionMemberAttributes(FunctionMemberAttributes newFunctionMemberAttributes) {
		if (newFunctionMemberAttributes != functionMemberAttributes) {
			NotificationChain msgs = null;
			if (functionMemberAttributes != null)
				msgs = ((InternalEObject)functionMemberAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES, null, msgs);
			if (newFunctionMemberAttributes != null)
				msgs = ((InternalEObject)newFunctionMemberAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES, null, msgs);
			msgs = basicSetFunctionMemberAttributes(newFunctionMemberAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES, newFunctionMemberAttributes, newFunctionMemberAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.FUNCTION_DECLARATION__FORMAL_PARAMETERS:
				return ((InternalEList<?>)getFormalParameters()).basicRemove(otherEnd, msgs);
			case AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES:
				return basicSetFunctionMemberAttributes(null, msgs);
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
			case AstmPackage.FUNCTION_DECLARATION__FORMAL_PARAMETERS:
				return getFormalParameters();
			case AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES:
				return getFunctionMemberAttributes();
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
			case AstmPackage.FUNCTION_DECLARATION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection<? extends FormalParameterDeclaration>)newValue);
				return;
			case AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES:
				setFunctionMemberAttributes((FunctionMemberAttributes)newValue);
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
			case AstmPackage.FUNCTION_DECLARATION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				return;
			case AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES:
				setFunctionMemberAttributes((FunctionMemberAttributes)null);
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
			case AstmPackage.FUNCTION_DECLARATION__FORMAL_PARAMETERS:
				return formalParameters != null && !formalParameters.isEmpty();
			case AstmPackage.FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES:
				return functionMemberAttributes != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitFunctionDeclaration(this);
	}

} //FunctionDeclarationImpl
