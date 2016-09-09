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
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.FormalParameterDefinition;
import org.xtext.example.delphi.astm.FunctionDefinition;
import org.xtext.example.delphi.astm.FunctionMemberAttributes;
import org.xtext.example.delphi.astm.FunctionScope;
import org.xtext.example.delphi.astm.Statement;
import org.xtext.example.delphi.astm.TypeReference;
import org.xtext.example.delphi.astm.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl#getFunctionMemberAttributes <em>Function Member Attributes</em>}</li>
 *   <li>{@link org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends DefinitionImpl implements FunctionDefinition {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference returnType;

	/**
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameterDefinition> formalParameters;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

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
	 * The cached value of the '{@link #getOpensScope() <em>Opens Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpensScope()
	 * @generated
	 * @ordered
	 */
	protected FunctionScope opensScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.Literals.FUNCTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		TypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameterDefinition> getFormalParameters() {
		if (formalParameters == null) {
			formalParameters = new EObjectContainmentEList<FormalParameterDefinition>(FormalParameterDefinition.class, this, AstmPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS);
		}
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Statement>(Statement.class, this, AstmPackage.FUNCTION_DEFINITION__BODY);
		}
		return body;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, oldFunctionMemberAttributes, newFunctionMemberAttributes);
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
				msgs = ((InternalEObject)functionMemberAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, null, msgs);
			if (newFunctionMemberAttributes != null)
				msgs = ((InternalEObject)newFunctionMemberAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, null, msgs);
			msgs = basicSetFunctionMemberAttributes(newFunctionMemberAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, newFunctionMemberAttributes, newFunctionMemberAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionScope getOpensScope() {
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpensScope(FunctionScope newOpensScope, NotificationChain msgs) {
		FunctionScope oldOpensScope = opensScope;
		opensScope = newOpensScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE, oldOpensScope, newOpensScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpensScope(FunctionScope newOpensScope) {
		if (newOpensScope != opensScope) {
			NotificationChain msgs = null;
			if (opensScope != null)
				msgs = ((InternalEObject)opensScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE, null, msgs);
			if (newOpensScope != null)
				msgs = ((InternalEObject)newOpensScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE, null, msgs);
			msgs = basicSetOpensScope(newOpensScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE, newOpensScope, newOpensScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case AstmPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				return ((InternalEList<?>)getFormalParameters()).basicRemove(otherEnd, msgs);
			case AstmPackage.FUNCTION_DEFINITION__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				return basicSetFunctionMemberAttributes(null, msgs);
			case AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				return basicSetOpensScope(null, msgs);
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
			case AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return getReturnType();
			case AstmPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				return getFormalParameters();
			case AstmPackage.FUNCTION_DEFINITION__BODY:
				return getBody();
			case AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				return getFunctionMemberAttributes();
			case AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				return getOpensScope();
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
			case AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case AstmPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection<? extends FormalParameterDefinition>)newValue);
				return;
			case AstmPackage.FUNCTION_DEFINITION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
				return;
			case AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				setFunctionMemberAttributes((FunctionMemberAttributes)newValue);
				return;
			case AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				setOpensScope((FunctionScope)newValue);
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
			case AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case AstmPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				return;
			case AstmPackage.FUNCTION_DEFINITION__BODY:
				getBody().clear();
				return;
			case AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				setFunctionMemberAttributes((FunctionMemberAttributes)null);
				return;
			case AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				setOpensScope((FunctionScope)null);
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
			case AstmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return returnType != null;
			case AstmPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				return formalParameters != null && !formalParameters.isEmpty();
			case AstmPackage.FUNCTION_DEFINITION__BODY:
				return body != null && !body.isEmpty();
			case AstmPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				return functionMemberAttributes != null;
			case AstmPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				return opensScope != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitFunctionDefinition(this);
	}

} //FunctionDefinitionImpl
