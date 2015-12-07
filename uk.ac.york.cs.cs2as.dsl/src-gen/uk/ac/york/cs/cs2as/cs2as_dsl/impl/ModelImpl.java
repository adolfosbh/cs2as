/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.xtext.essentialoclcs.impl.ContextCSImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect;
import uk.ac.york.cs.cs2as.cs2as_dsl.Model;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getCsDecl <em>Cs Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getAsDecl <em>As Decl</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getMappingSect <em>Mapping Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getDisambiguationSect <em>Disambiguation Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getNameresoSect <em>Namereso Sect</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ModelImpl#getHelpersSect <em>Helpers Sect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends ContextCSImpl implements Model
{
  /**
   * The cached value of the '{@link #getCsDecl() <em>Cs Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCsDecl()
   * @generated
   * @ordered
   */
  protected CSDecl csDecl;

  /**
   * The cached value of the '{@link #getAsDecl() <em>As Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsDecl()
   * @generated
   * @ordered
   */
  protected ASDecl asDecl;

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
  protected ModelImpl()
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
    return Cs2as_dslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSDecl getCsDecl()
  {
    return csDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCsDecl(CSDecl newCsDecl, NotificationChain msgs)
  {
    CSDecl oldCsDecl = csDecl;
    csDecl = newCsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__CS_DECL, oldCsDecl, newCsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCsDecl(CSDecl newCsDecl)
  {
    if (newCsDecl != csDecl)
    {
      NotificationChain msgs = null;
      if (csDecl != null)
        msgs = ((InternalEObject)csDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__CS_DECL, null, msgs);
      if (newCsDecl != null)
        msgs = ((InternalEObject)newCsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__CS_DECL, null, msgs);
      msgs = basicSetCsDecl(newCsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__CS_DECL, newCsDecl, newCsDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASDecl getAsDecl()
  {
    return asDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsDecl(ASDecl newAsDecl, NotificationChain msgs)
  {
    ASDecl oldAsDecl = asDecl;
    asDecl = newAsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__AS_DECL, oldAsDecl, newAsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsDecl(ASDecl newAsDecl)
  {
    if (newAsDecl != asDecl)
    {
      NotificationChain msgs = null;
      if (asDecl != null)
        msgs = ((InternalEObject)asDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__AS_DECL, null, msgs);
      if (newAsDecl != null)
        msgs = ((InternalEObject)newAsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__AS_DECL, null, msgs);
      msgs = basicSetAsDecl(newAsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__AS_DECL, newAsDecl, newAsDecl));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__MAPPING_SECT, oldMappingSect, newMappingSect);
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
        msgs = ((InternalEObject)mappingSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__MAPPING_SECT, null, msgs);
      if (newMappingSect != null)
        msgs = ((InternalEObject)newMappingSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__MAPPING_SECT, null, msgs);
      msgs = basicSetMappingSect(newMappingSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__MAPPING_SECT, newMappingSect, newMappingSect));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT, oldDisambiguationSect, newDisambiguationSect);
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
        msgs = ((InternalEObject)disambiguationSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT, null, msgs);
      if (newDisambiguationSect != null)
        msgs = ((InternalEObject)newDisambiguationSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT, null, msgs);
      msgs = basicSetDisambiguationSect(newDisambiguationSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT, newDisambiguationSect, newDisambiguationSect));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__NAMERESO_SECT, oldNameresoSect, newNameresoSect);
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
        msgs = ((InternalEObject)nameresoSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__NAMERESO_SECT, null, msgs);
      if (newNameresoSect != null)
        msgs = ((InternalEObject)newNameresoSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__NAMERESO_SECT, null, msgs);
      msgs = basicSetNameresoSect(newNameresoSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__NAMERESO_SECT, newNameresoSect, newNameresoSect));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__HELPERS_SECT, oldHelpersSect, newHelpersSect);
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
        msgs = ((InternalEObject)helpersSect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__HELPERS_SECT, null, msgs);
      if (newHelpersSect != null)
        msgs = ((InternalEObject)newHelpersSect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.MODEL__HELPERS_SECT, null, msgs);
      msgs = basicSetHelpersSect(newHelpersSect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.MODEL__HELPERS_SECT, newHelpersSect, newHelpersSect));
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        return basicSetCsDecl(null, msgs);
      case Cs2as_dslPackage.MODEL__AS_DECL:
        return basicSetAsDecl(null, msgs);
      case Cs2as_dslPackage.MODEL__MAPPING_SECT:
        return basicSetMappingSect(null, msgs);
      case Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT:
        return basicSetDisambiguationSect(null, msgs);
      case Cs2as_dslPackage.MODEL__NAMERESO_SECT:
        return basicSetNameresoSect(null, msgs);
      case Cs2as_dslPackage.MODEL__HELPERS_SECT:
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        return getCsDecl();
      case Cs2as_dslPackage.MODEL__AS_DECL:
        return getAsDecl();
      case Cs2as_dslPackage.MODEL__MAPPING_SECT:
        return getMappingSect();
      case Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT:
        return getDisambiguationSect();
      case Cs2as_dslPackage.MODEL__NAMERESO_SECT:
        return getNameresoSect();
      case Cs2as_dslPackage.MODEL__HELPERS_SECT:
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        setCsDecl((CSDecl)newValue);
        return;
      case Cs2as_dslPackage.MODEL__AS_DECL:
        setAsDecl((ASDecl)newValue);
        return;
      case Cs2as_dslPackage.MODEL__MAPPING_SECT:
        setMappingSect((MappingSect)newValue);
        return;
      case Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT:
        setDisambiguationSect((DisambiguationSect)newValue);
        return;
      case Cs2as_dslPackage.MODEL__NAMERESO_SECT:
        setNameresoSect((NameResolutionSect)newValue);
        return;
      case Cs2as_dslPackage.MODEL__HELPERS_SECT:
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        setCsDecl((CSDecl)null);
        return;
      case Cs2as_dslPackage.MODEL__AS_DECL:
        setAsDecl((ASDecl)null);
        return;
      case Cs2as_dslPackage.MODEL__MAPPING_SECT:
        setMappingSect((MappingSect)null);
        return;
      case Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT:
        setDisambiguationSect((DisambiguationSect)null);
        return;
      case Cs2as_dslPackage.MODEL__NAMERESO_SECT:
        setNameresoSect((NameResolutionSect)null);
        return;
      case Cs2as_dslPackage.MODEL__HELPERS_SECT:
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
      case Cs2as_dslPackage.MODEL__CS_DECL:
        return csDecl != null;
      case Cs2as_dslPackage.MODEL__AS_DECL:
        return asDecl != null;
      case Cs2as_dslPackage.MODEL__MAPPING_SECT:
        return mappingSect != null;
      case Cs2as_dslPackage.MODEL__DISAMBIGUATION_SECT:
        return disambiguationSect != null;
      case Cs2as_dslPackage.MODEL__NAMERESO_SECT:
        return nameresoSect != null;
      case Cs2as_dslPackage.MODEL__HELPERS_SECT:
        return helpersSect != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
