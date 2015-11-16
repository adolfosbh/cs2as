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

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Resolution Sect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNameProperty <em>Name Property</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNameQualifier <em>Name Qualifier</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.NameResolutionSectImpl#getNameResolutions <em>Name Resolutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameResolutionSectImpl extends MinimalEObjectImpl.Container implements NameResolutionSect
{
  /**
   * The default value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameElement()
   * @generated
   * @ordered
   */
  protected static final String NAME_ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameElement()
   * @generated
   * @ordered
   */
  protected String nameElement = NAME_ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameProperty() <em>Name Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameProperty()
   * @generated
   * @ordered
   */
  protected NameExpCS nameProperty;

  /**
   * The default value of the '{@link #getNameQualifier() <em>Name Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameQualifier()
   * @generated
   * @ordered
   */
  protected static final String NAME_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameQualifier() <em>Name Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameQualifier()
   * @generated
   * @ordered
   */
  protected String nameQualifier = NAME_QUALIFIER_EDEFAULT;

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
  public String getNameElement()
  {
    return nameElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameElement(String newNameElement)
  {
    String oldNameElement = nameElement;
    nameElement = newNameElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_ELEMENT, oldNameElement, nameElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpCS getNameProperty()
  {
    return nameProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameProperty(NameExpCS newNameProperty, NotificationChain msgs)
  {
    NameExpCS oldNameProperty = nameProperty;
    nameProperty = newNameProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY, oldNameProperty, newNameProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameProperty(NameExpCS newNameProperty)
  {
    if (newNameProperty != nameProperty)
    {
      NotificationChain msgs = null;
      if (nameProperty != null)
        msgs = ((InternalEObject)nameProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY, null, msgs);
      if (newNameProperty != null)
        msgs = ((InternalEObject)newNameProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY, null, msgs);
      msgs = basicSetNameProperty(newNameProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY, newNameProperty, newNameProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameQualifier()
  {
    return nameQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameQualifier(String newNameQualifier)
  {
    String oldNameQualifier = nameQualifier;
    nameQualifier = newNameQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER, oldNameQualifier, nameQualifier));
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY:
        return basicSetNameProperty(null, msgs);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_ELEMENT:
        return getNameElement();
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY:
        return getNameProperty();
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_ELEMENT:
        setNameElement((String)newValue);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY:
        setNameProperty((NameExpCS)newValue);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        setNameQualifier((String)newValue);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_ELEMENT:
        setNameElement(NAME_ELEMENT_EDEFAULT);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY:
        setNameProperty((NameExpCS)null);
        return;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        setNameQualifier(NAME_QUALIFIER_EDEFAULT);
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
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_ELEMENT:
        return NAME_ELEMENT_EDEFAULT == null ? nameElement != null : !NAME_ELEMENT_EDEFAULT.equals(nameElement);
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_PROPERTY:
        return nameProperty != null;
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_QUALIFIER:
        return NAME_QUALIFIER_EDEFAULT == null ? nameQualifier != null : !NAME_QUALIFIER_EDEFAULT.equals(nameQualifier);
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT__NAME_RESOLUTIONS:
        return nameResolutions != null && !nameResolutions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nameElement: ");
    result.append(nameElement);
    result.append(", nameQualifier: ");
    result.append(nameQualifier);
    result.append(')');
    return result.toString();
  }

} //NameResolutionSectImpl
