/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNamedElementDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Resolution Sect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNameReferencer <em>Name Referencer</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNameQualifier <em>Name Qualifier</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNameResolutions <em>Name Resolutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameResolutionSectImpl extends MinimalEObjectImpl.Container implements NameResolutionSect
{
  /**
   * The cached value of the '{@link #getNamedElement() <em>Named Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedElement()
   * @generated
   * @ordered
   */
  protected DefaultNamedElementDef namedElement;

  /**
   * The cached value of the '{@link #getNameReferencer() <em>Name Referencer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameReferencer()
   * @generated
   * @ordered
   */
  protected DefaultNameReferencerDef nameReferencer;

  /**
   * The cached value of the '{@link #getNameQualifier() <em>Name Qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameQualifier()
   * @generated
   * @ordered
   */
  protected NameQualifierDef nameQualifier;

  /**
   * The cached value of the '{@link #getNameResolutions() <em>Name Resolutions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameResolutions()
   * @generated
   * @ordered
   */
  protected EList<ClassNameResolution> nameResolutions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameResolutionSectImpl()
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
    return Cs2as_dslPackage.Literals.NAME_RESOLUTION_SECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultNamedElementDef getNamedElement()
  {
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamedElement(DefaultNamedElementDef newNamedElement, NotificationChain msgs)
  {
    DefaultNamedElementDef oldNamedElement = namedElement;
    namedElement = newNamedElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT, oldNamedElement, newNamedElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamedElement(DefaultNamedElementDef newNamedElement)
  {
    if (newNamedElement != namedElement)
    {
      NotificationChain msgs = null;
      if (namedElement != null)
        msgs = ((InternalEObject)namedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT, null, msgs);
      if (newNamedElement != null)
        msgs = ((InternalEObject)newNamedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT, null, msgs);
      msgs = basicSetNamedElement(newNamedElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT, newNamedElement, newNamedElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultNameReferencerDef getNameReferencer()
  {
    return nameReferencer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameReferencer(DefaultNameReferencerDef newNameReferencer, NotificationChain msgs)
  {
    DefaultNameReferencerDef oldNameReferencer = nameReferencer;
    nameReferencer = newNameReferencer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER, oldNameReferencer, newNameReferencer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameReferencer(DefaultNameReferencerDef newNameReferencer)
  {
    if (newNameReferencer != nameReferencer)
    {
      NotificationChain msgs = null;
      if (nameReferencer != null)
        msgs = ((InternalEObject)nameReferencer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER, null, msgs);
      if (newNameReferencer != null)
        msgs = ((InternalEObject)newNameReferencer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER, null, msgs);
      msgs = basicSetNameReferencer(newNameReferencer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER, newNameReferencer, newNameReferencer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameQualifierDef getNameQualifier()
  {
    return nameQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameQualifier(NameQualifierDef newNameQualifier, NotificationChain msgs)
  {
    NameQualifierDef oldNameQualifier = nameQualifier;
    nameQualifier = newNameQualifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER, oldNameQualifier, newNameQualifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameQualifier(NameQualifierDef newNameQualifier)
  {
    if (newNameQualifier != nameQualifier)
    {
      NotificationChain msgs = null;
      if (nameQualifier != null)
        msgs = ((InternalEObject)nameQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER, null, msgs);
      if (newNameQualifier != null)
        msgs = ((InternalEObject)newNameQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER, null, msgs);
      msgs = basicSetNameQualifier(newNameQualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER, newNameQualifier, newNameQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassNameResolution> getNameResolutions()
  {
    if (nameResolutions == null)
    {
      nameResolutions = new EObjectContainmentEList<ClassNameResolution>(ClassNameResolution.class, this, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_RESOLUTIONS);
    }
    return nameResolutions;
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT:
        return basicSetNamedElement(null, msgs);
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER:
        return basicSetNameReferencer(null, msgs);
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        return basicSetNameQualifier(null, msgs);
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_RESOLUTIONS:
        return ((InternalEList<?>)getNameResolutions()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT:
        return getNamedElement();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER:
        return getNameReferencer();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        return getNameQualifier();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_RESOLUTIONS:
        return getNameResolutions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT:
        setNamedElement((DefaultNamedElementDef)newValue);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER:
        setNameReferencer((DefaultNameReferencerDef)newValue);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        setNameQualifier((NameQualifierDef)newValue);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_RESOLUTIONS:
        getNameResolutions().clear();
        getNameResolutions().addAll((Collection<? extends ClassNameResolution>)newValue);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT:
        setNamedElement((DefaultNamedElementDef)null);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER:
        setNameReferencer((DefaultNameReferencerDef)null);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        setNameQualifier((NameQualifierDef)null);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_RESOLUTIONS:
        getNameResolutions().clear();
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAMED_ELEMENT:
        return namedElement != null;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_REFERENCER:
        return nameReferencer != null;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        return nameQualifier != null;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_RESOLUTIONS:
        return nameResolutions != null && !nameResolutions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NameResolutionSectImpl
