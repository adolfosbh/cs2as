/**
 */
package astm.impl;

import astm.AnnotationExpression;
import astm.AstmPackage;
import astm.GASTMSyntaxObject;
import astm.PreprocessorElement;
import astm.SourceLocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GASTM Syntax Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.GASTMSyntaxObjectImpl#getLocationInfo <em>Location Info</em>}</li>
 *   <li>{@link astm.impl.GASTMSyntaxObjectImpl#getPreProcessorElements <em>Pre Processor Elements</em>}</li>
 *   <li>{@link astm.impl.GASTMSyntaxObjectImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GASTMSyntaxObjectImpl extends GASTMObjectImpl implements GASTMSyntaxObject {
	/**
	 * The cached value of the '{@link #getLocationInfo() <em>Location Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationInfo()
	 * @generated
	 * @ordered
	 */
	protected SourceLocation locationInfo;

	/**
	 * The cached value of the '{@link #getPreProcessorElements() <em>Pre Processor Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreProcessorElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PreprocessorElement> preProcessorElements;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationExpression> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GASTMSyntaxObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getGASTMSyntaxObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceLocation getLocationInfo() {
		return locationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationInfo(SourceLocation newLocationInfo, NotificationChain msgs) {
		SourceLocation oldLocationInfo = locationInfo;
		locationInfo = newLocationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO, oldLocationInfo, newLocationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationInfo(SourceLocation newLocationInfo) {
		if (newLocationInfo != locationInfo) {
			NotificationChain msgs = null;
			if (locationInfo != null)
				msgs = ((InternalEObject)locationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO, null, msgs);
			if (newLocationInfo != null)
				msgs = ((InternalEObject)newLocationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO, null, msgs);
			msgs = basicSetLocationInfo(newLocationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO, newLocationInfo, newLocationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreprocessorElement> getPreProcessorElements() {
		if (preProcessorElements == null) {
			preProcessorElements = new EObjectContainmentEList<PreprocessorElement>(PreprocessorElement.class, this, AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS);
		}
		return preProcessorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationExpression> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<AnnotationExpression>(AnnotationExpression.class, this, AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO:
				return basicSetLocationInfo(null, msgs);
			case AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS:
				return ((InternalEList<?>)getPreProcessorElements()).basicRemove(otherEnd, msgs);
			case AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO:
				return getLocationInfo();
			case AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS:
				return getPreProcessorElements();
			case AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS:
				return getAnnotations();
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
			case AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO:
				setLocationInfo((SourceLocation)newValue);
				return;
			case AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS:
				getPreProcessorElements().clear();
				getPreProcessorElements().addAll((Collection<? extends PreprocessorElement>)newValue);
				return;
			case AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends AnnotationExpression>)newValue);
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
			case AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO:
				setLocationInfo((SourceLocation)null);
				return;
			case AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS:
				getPreProcessorElements().clear();
				return;
			case AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS:
				getAnnotations().clear();
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
			case AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO:
				return locationInfo != null;
			case AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS:
				return preProcessorElements != null && !preProcessorElements.isEmpty();
			case AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}


} //GASTMSyntaxObjectImpl
