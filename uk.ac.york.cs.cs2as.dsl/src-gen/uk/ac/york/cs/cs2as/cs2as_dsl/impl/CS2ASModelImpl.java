/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.CS2ASModel;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.SourceDomain;
import uk.ac.york.cs.cs2as.cs2as_dsl.TargetDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS2AS Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl#getMappingSect <em>Mapping Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl#getDisambiguationSect <em>Disambiguation Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl#getNameresoSect <em>Namereso Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.CS2ASModelImpl#getHelpersSect <em>Helpers Sect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CS2ASModelImpl extends MinimalEObjectImpl.Container implements CS2ASModel
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected SourceDomain source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected TargetDomain target;

  /**
   * The cached value of the '{@link #getMappingSect() <em>Mapping Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingSect()
   * @generated
   * @ordered
   */
  protected MappingSect mappingSect;

  /**
   * The cached value of the '{@link #getDisambiguationSect() <em>Disambiguation Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisambiguationSect()
   * @generated
   * @ordered
   */
  protected DisambiguationSect disambiguationSect;

  /**
   * The cached value of the '{@link #getNameresoSect() <em>Namereso Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameresoSect()
   * @generated
   * @ordered
   */
  protected NameResolutionSect nameresoSect;

  /**
   * The cached value of the '{@link #getHelpersSect() <em>Helpers Sect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpersSect()
   * @generated
   * @ordered
   */
  protected HelpersSect helpersSect;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CS2ASModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Cs2as_dslPackage.Literals.CS2AS_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceDomain getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(SourceDomain newSource, NotificationChain msgs)
  {
    SourceDomain oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(SourceDomain newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetDomain getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(TargetDomain newTarget, NotificationChain msgs)
  {
    TargetDomain oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(TargetDomain newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingSect getMappingSect()
  {
    return mappingSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappingSect(MappingSect newMappingSect, NotificationChain msgs)
  {
    MappingSect oldMappingSect = mappingSect;
    mappingSect = newMappingSect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT, oldMappingSect, newMappingSect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappingSect(MappingSect newMappingSect)
  {
    if (newMappingSect != mappingSect)
    {
      NotificationChain msgs = null;
      if (mappingSect != null)
        msgs = ((InternalEObject)mappingSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT, null, msgs);
      if (newMappingSect != null)
        msgs = ((InternalEObject)newMappingSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT, null, msgs);
      msgs = basicSetMappingSect(newMappingSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT, newMappingSect, newMappingSect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisambiguationSect getDisambiguationSect()
  {
    return disambiguationSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisambiguationSect(DisambiguationSect newDisambiguationSect, NotificationChain msgs)
  {
    DisambiguationSect oldDisambiguationSect = disambiguationSect;
    disambiguationSect = newDisambiguationSect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT, oldDisambiguationSect, newDisambiguationSect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisambiguationSect(DisambiguationSect newDisambiguationSect)
  {
    if (newDisambiguationSect != disambiguationSect)
    {
      NotificationChain msgs = null;
      if (disambiguationSect != null)
        msgs = ((InternalEObject)disambiguationSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT, null, msgs);
      if (newDisambiguationSect != null)
        msgs = ((InternalEObject)newDisambiguationSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT, null, msgs);
      msgs = basicSetDisambiguationSect(newDisambiguationSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT, newDisambiguationSect, newDisambiguationSect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameResolutionSect getNameresoSect()
  {
    return nameresoSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameresoSect(NameResolutionSect newNameresoSect, NotificationChain msgs)
  {
    NameResolutionSect oldNameresoSect = nameresoSect;
    nameresoSect = newNameresoSect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT, oldNameresoSect, newNameresoSect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameresoSect(NameResolutionSect newNameresoSect)
  {
    if (newNameresoSect != nameresoSect)
    {
      NotificationChain msgs = null;
      if (nameresoSect != null)
        msgs = ((InternalEObject)nameresoSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT, null, msgs);
      if (newNameresoSect != null)
        msgs = ((InternalEObject)newNameresoSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT, null, msgs);
      msgs = basicSetNameresoSect(newNameresoSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT, newNameresoSect, newNameresoSect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelpersSect getHelpersSect()
  {
    return helpersSect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHelpersSect(HelpersSect newHelpersSect, NotificationChain msgs)
  {
    HelpersSect oldHelpersSect = helpersSect;
    helpersSect = newHelpersSect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT, oldHelpersSect, newHelpersSect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelpersSect(HelpersSect newHelpersSect)
  {
    if (newHelpersSect != helpersSect)
    {
      NotificationChain msgs = null;
      if (helpersSect != null)
        msgs = ((InternalEObject)helpersSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT, null, msgs);
      if (newHelpersSect != null)
        msgs = ((InternalEObject)newHelpersSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT, null, msgs);
      msgs = basicSetHelpersSect(newHelpersSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT, newHelpersSect, newHelpersSect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CS2AS_MODEL__SOURCE:
        return basicSetSource(null, msgs);
      case Cs2as_dslPackage.CS2AS_MODEL__TARGET:
        return basicSetTarget(null, msgs);
      case Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT:
        return basicSetMappingSect(null, msgs);
      case Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT:
        return basicSetDisambiguationSect(null, msgs);
      case Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT:
        return basicSetNameresoSect(null, msgs);
      case Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT:
        return basicSetHelpersSect(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CS2AS_MODEL__SOURCE:
        return getSource();
      case Cs2as_dslPackage.CS2AS_MODEL__TARGET:
        return getTarget();
      case Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT:
        return getMappingSect();
      case Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT:
        return getDisambiguationSect();
      case Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT:
        return getNameresoSect();
      case Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT:
        return getHelpersSect();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CS2AS_MODEL__SOURCE:
        setSource((SourceDomain)newValue);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__TARGET:
        setTarget((TargetDomain)newValue);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT:
        setMappingSect((MappingSect)newValue);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT:
        setDisambiguationSect((DisambiguationSect)newValue);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT:
        setNameresoSect((NameResolutionSect)newValue);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT:
        setHelpersSect((HelpersSect)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CS2AS_MODEL__SOURCE:
        setSource((SourceDomain)null);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__TARGET:
        setTarget((TargetDomain)null);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT:
        setMappingSect((MappingSect)null);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT:
        setDisambiguationSect((DisambiguationSect)null);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT:
        setNameresoSect((NameResolutionSect)null);
        return;
      case Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT:
        setHelpersSect((HelpersSect)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.CS2AS_MODEL__SOURCE:
        return source != null;
      case Cs2as_dslPackage.CS2AS_MODEL__TARGET:
        return target != null;
      case Cs2as_dslPackage.CS2AS_MODEL__MAPPING_SECT:
        return mappingSect != null;
      case Cs2as_dslPackage.CS2AS_MODEL__DISAMBIGUATION_SECT:
        return disambiguationSect != null;
      case Cs2as_dslPackage.CS2AS_MODEL__NAMERESO_SECT:
        return nameresoSect != null;
      case Cs2as_dslPackage.CS2AS_MODEL__HELPERS_SECT:
        return helpersSect != null;
    }
    return super.eIsSet(featureID);
  }

} //CS2ASModelImpl
