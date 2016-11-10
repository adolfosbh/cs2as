/**
 */
package astm.impl;

import astm.AnnotationExpression;
import astm.AstmPackage;
import astm.DeclarationOrDefinition;
import astm.Definition;
import astm.DefinitionObject;
import astm.GASTMObject;
import astm.GASTMSyntaxObject;
import astm.Name;
import astm.OtherSyntaxObject;
import astm.PreprocessorElement;
import astm.RDBTrigger;
import astm.SourceLocation;
import astm.Statement;
import astm.TypeReference;

import java.lang.Boolean;
import java.lang.String;

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
 * An implementation of the model object '<em><b>RDB Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link astm.impl.RDBTriggerImpl#getLocationInfo <em>Location Info</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getPreProcessorElements <em>Pre Processor Elements</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#isIsRegister <em>Is Register</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getLinkageSpecifier <em>Linkage Specifier</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getStorageSpecifiers <em>Storage Specifiers</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getDefinitionType <em>Definition Type</em>}</li>
 *   <li>{@link astm.impl.RDBTriggerImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDBTriggerImpl extends OtherSyntaxObjectImpl implements RDBTrigger {
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
	 * The default value of the '{@link #isIsRegister() <em>Is Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRegister()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REGISTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRegister() <em>Is Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRegister()
	 * @generated
	 * @ordered
	 */
	protected boolean isRegister = IS_REGISTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkageSpecifier() <em>Linkage Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkageSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKAGE_SPECIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkageSpecifier() <em>Linkage Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkageSpecifier()
	 * @generated
	 * @ordered
	 */
	protected String linkageSpecifier = LINKAGE_SPECIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStorageSpecifiers() <em>Storage Specifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSpecifiers()
	 * @generated
	 * @ordered
	 */
	protected OtherSyntaxObject storageSpecifiers;

	/**
	 * The cached value of the '{@link #getAccessKind() <em>Access Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKind()
	 * @generated
	 * @ordered
	 */
	protected OtherSyntaxObject accessKind;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstmPackage.eINSTANCE.getRDBTrigger();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__LOCATION_INFO, oldLocationInfo, newLocationInfo);
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
				msgs = ((InternalEObject)locationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__LOCATION_INFO, null, msgs);
			if (newLocationInfo != null)
				msgs = ((InternalEObject)newLocationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__LOCATION_INFO, null, msgs);
			msgs = basicSetLocationInfo(newLocationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__LOCATION_INFO, newLocationInfo, newLocationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreprocessorElement> getPreProcessorElements() {
		if (preProcessorElements == null) {
			preProcessorElements = new EObjectContainmentEList<PreprocessorElement>(PreprocessorElement.class, this, AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS);
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
			annotations = new EObjectContainmentEList<AnnotationExpression>(AnnotationExpression.class, this, AstmPackage.RDB_TRIGGER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRegister() {
		return isRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRegister(boolean newIsRegister) {
		boolean oldIsRegister = isRegister;
		isRegister = newIsRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__IS_REGISTER, oldIsRegister, isRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkageSpecifier() {
		return linkageSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkageSpecifier(String newLinkageSpecifier) {
		String oldLinkageSpecifier = linkageSpecifier;
		linkageSpecifier = newLinkageSpecifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__LINKAGE_SPECIFIER, oldLinkageSpecifier, linkageSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSyntaxObject getStorageSpecifiers() {
		return storageSpecifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageSpecifiers(OtherSyntaxObject newStorageSpecifiers, NotificationChain msgs) {
		OtherSyntaxObject oldStorageSpecifiers = storageSpecifiers;
		storageSpecifiers = newStorageSpecifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS, oldStorageSpecifiers, newStorageSpecifiers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageSpecifiers(OtherSyntaxObject newStorageSpecifiers) {
		if (newStorageSpecifiers != storageSpecifiers) {
			NotificationChain msgs = null;
			if (storageSpecifiers != null)
				msgs = ((InternalEObject)storageSpecifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS, null, msgs);
			if (newStorageSpecifiers != null)
				msgs = ((InternalEObject)newStorageSpecifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS, null, msgs);
			msgs = basicSetStorageSpecifiers(newStorageSpecifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS, newStorageSpecifiers, newStorageSpecifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSyntaxObject getAccessKind() {
		return accessKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessKind(OtherSyntaxObject newAccessKind, NotificationChain msgs) {
		OtherSyntaxObject oldAccessKind = accessKind;
		accessKind = newAccessKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__ACCESS_KIND, oldAccessKind, newAccessKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessKind(OtherSyntaxObject newAccessKind) {
		if (newAccessKind != accessKind) {
			NotificationChain msgs = null;
			if (accessKind != null)
				msgs = ((InternalEObject)accessKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__ACCESS_KIND, null, msgs);
			if (newAccessKind != null)
				msgs = ((InternalEObject)newAccessKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__ACCESS_KIND, null, msgs);
			msgs = basicSetAccessKind(newAccessKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__ACCESS_KIND, newAccessKind, newAccessKind));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME, oldIdentifierName, newIdentifierName);
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
				msgs = ((InternalEObject)identifierName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME, null, msgs);
			if (newIdentifierName != null)
				msgs = ((InternalEObject)newIdentifierName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME, null, msgs);
			msgs = basicSetIdentifierName(newIdentifierName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME, newIdentifierName, newIdentifierName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__DEFINITION_TYPE, oldDefinitionType, newDefinitionType);
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
				msgs = ((InternalEObject)definitionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__DEFINITION_TYPE, null, msgs);
			if (newDefinitionType != null)
				msgs = ((InternalEObject)newDefinitionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstmPackage.RDB_TRIGGER__DEFINITION_TYPE, null, msgs);
			msgs = basicSetDefinitionType(newDefinitionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstmPackage.RDB_TRIGGER__DEFINITION_TYPE, newDefinitionType, newDefinitionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Statement>(Statement.class, this, AstmPackage.RDB_TRIGGER__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstmPackage.RDB_TRIGGER__LOCATION_INFO:
				return basicSetLocationInfo(null, msgs);
			case AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS:
				return ((InternalEList<?>)getPreProcessorElements()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_TRIGGER__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS:
				return basicSetStorageSpecifiers(null, msgs);
			case AstmPackage.RDB_TRIGGER__ACCESS_KIND:
				return basicSetAccessKind(null, msgs);
			case AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME:
				return basicSetIdentifierName(null, msgs);
			case AstmPackage.RDB_TRIGGER__DEFINITION_TYPE:
				return basicSetDefinitionType(null, msgs);
			case AstmPackage.RDB_TRIGGER__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case AstmPackage.RDB_TRIGGER__LOCATION_INFO:
				return getLocationInfo();
			case AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS:
				return getPreProcessorElements();
			case AstmPackage.RDB_TRIGGER__ANNOTATIONS:
				return getAnnotations();
			case AstmPackage.RDB_TRIGGER__IS_REGISTER:
				return isIsRegister();
			case AstmPackage.RDB_TRIGGER__LINKAGE_SPECIFIER:
				return getLinkageSpecifier();
			case AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS:
				return getStorageSpecifiers();
			case AstmPackage.RDB_TRIGGER__ACCESS_KIND:
				return getAccessKind();
			case AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME:
				return getIdentifierName();
			case AstmPackage.RDB_TRIGGER__DEFINITION_TYPE:
				return getDefinitionType();
			case AstmPackage.RDB_TRIGGER__BODY:
				return getBody();
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
			case AstmPackage.RDB_TRIGGER__LOCATION_INFO:
				setLocationInfo((SourceLocation)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS:
				getPreProcessorElements().clear();
				getPreProcessorElements().addAll((Collection<? extends PreprocessorElement>)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends AnnotationExpression>)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__IS_REGISTER:
				setIsRegister((Boolean)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__LINKAGE_SPECIFIER:
				setLinkageSpecifier((String)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS:
				setStorageSpecifiers((OtherSyntaxObject)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__ACCESS_KIND:
				setAccessKind((OtherSyntaxObject)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME:
				setIdentifierName((Name)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__DEFINITION_TYPE:
				setDefinitionType((TypeReference)newValue);
				return;
			case AstmPackage.RDB_TRIGGER__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
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
			case AstmPackage.RDB_TRIGGER__LOCATION_INFO:
				setLocationInfo((SourceLocation)null);
				return;
			case AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS:
				getPreProcessorElements().clear();
				return;
			case AstmPackage.RDB_TRIGGER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case AstmPackage.RDB_TRIGGER__IS_REGISTER:
				setIsRegister(IS_REGISTER_EDEFAULT);
				return;
			case AstmPackage.RDB_TRIGGER__LINKAGE_SPECIFIER:
				setLinkageSpecifier(LINKAGE_SPECIFIER_EDEFAULT);
				return;
			case AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS:
				setStorageSpecifiers((OtherSyntaxObject)null);
				return;
			case AstmPackage.RDB_TRIGGER__ACCESS_KIND:
				setAccessKind((OtherSyntaxObject)null);
				return;
			case AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME:
				setIdentifierName((Name)null);
				return;
			case AstmPackage.RDB_TRIGGER__DEFINITION_TYPE:
				setDefinitionType((TypeReference)null);
				return;
			case AstmPackage.RDB_TRIGGER__BODY:
				getBody().clear();
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
			case AstmPackage.RDB_TRIGGER__LOCATION_INFO:
				return locationInfo != null;
			case AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS:
				return preProcessorElements != null && !preProcessorElements.isEmpty();
			case AstmPackage.RDB_TRIGGER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case AstmPackage.RDB_TRIGGER__IS_REGISTER:
				return isRegister != IS_REGISTER_EDEFAULT;
			case AstmPackage.RDB_TRIGGER__LINKAGE_SPECIFIER:
				return LINKAGE_SPECIFIER_EDEFAULT == null ? linkageSpecifier != null : !LINKAGE_SPECIFIER_EDEFAULT.equals(linkageSpecifier);
			case AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS:
				return storageSpecifiers != null;
			case AstmPackage.RDB_TRIGGER__ACCESS_KIND:
				return accessKind != null;
			case AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME:
				return identifierName != null;
			case AstmPackage.RDB_TRIGGER__DEFINITION_TYPE:
				return definitionType != null;
			case AstmPackage.RDB_TRIGGER__BODY:
				return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GASTMObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GASTMSyntaxObject.class) {
			switch (derivedFeatureID) {
				case AstmPackage.RDB_TRIGGER__LOCATION_INFO: return AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO;
				case AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS: return AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;
				case AstmPackage.RDB_TRIGGER__ANNOTATIONS: return AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == DefinitionObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeclarationOrDefinition.class) {
			switch (derivedFeatureID) {
				case AstmPackage.RDB_TRIGGER__IS_REGISTER: return AstmPackage.DECLARATION_OR_DEFINITION__IS_REGISTER;
				case AstmPackage.RDB_TRIGGER__LINKAGE_SPECIFIER: return AstmPackage.DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER;
				case AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS: return AstmPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS;
				case AstmPackage.RDB_TRIGGER__ACCESS_KIND: return AstmPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND;
				default: return -1;
			}
		}
		if (baseClass == Definition.class) {
			switch (derivedFeatureID) {
				case AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME: return AstmPackage.DEFINITION__IDENTIFIER_NAME;
				case AstmPackage.RDB_TRIGGER__DEFINITION_TYPE: return AstmPackage.DEFINITION__DEFINITION_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GASTMObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GASTMSyntaxObject.class) {
			switch (baseFeatureID) {
				case AstmPackage.GASTM_SYNTAX_OBJECT__LOCATION_INFO: return AstmPackage.RDB_TRIGGER__LOCATION_INFO;
				case AstmPackage.GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS: return AstmPackage.RDB_TRIGGER__PRE_PROCESSOR_ELEMENTS;
				case AstmPackage.GASTM_SYNTAX_OBJECT__ANNOTATIONS: return AstmPackage.RDB_TRIGGER__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == DefinitionObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeclarationOrDefinition.class) {
			switch (baseFeatureID) {
				case AstmPackage.DECLARATION_OR_DEFINITION__IS_REGISTER: return AstmPackage.RDB_TRIGGER__IS_REGISTER;
				case AstmPackage.DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER: return AstmPackage.RDB_TRIGGER__LINKAGE_SPECIFIER;
				case AstmPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS: return AstmPackage.RDB_TRIGGER__STORAGE_SPECIFIERS;
				case AstmPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND: return AstmPackage.RDB_TRIGGER__ACCESS_KIND;
				default: return -1;
			}
		}
		if (baseClass == Definition.class) {
			switch (baseFeatureID) {
				case AstmPackage.DEFINITION__IDENTIFIER_NAME: return AstmPackage.RDB_TRIGGER__IDENTIFIER_NAME;
				case AstmPackage.DEFINITION__DEFINITION_TYPE: return AstmPackage.RDB_TRIGGER__DEFINITION_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isRegister: ");
		result.append(isRegister);
		result.append(", linkageSpecifier: ");
		result.append(linkageSpecifier);
		result.append(')');
		return result.toString();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public <R> R accept(Visitor<R> visitor) {
		return visitor.visitRDBTrigger(this);
	}

} //RDBTriggerImpl
