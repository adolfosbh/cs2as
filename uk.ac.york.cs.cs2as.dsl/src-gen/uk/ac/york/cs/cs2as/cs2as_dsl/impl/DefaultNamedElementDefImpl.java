/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xcore.XAttribute;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNamedElementDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Named Element Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DefaultNamedElementDefImpl#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.DefaultNamedElementDefImpl#getNameProperty <em>Name Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultNamedElementDefImpl extends MinimalEObjectImpl.Container implements DefaultNamedElementDef
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
   * The cached value of the '{@link #getNameProperty() <em>Name Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameProperty()
   * @generated
   * @ordered
   */
  protected XAttribute nameProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultNamedElementDefImpl()
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
    return Cs2as_dslPackage.Literals.DEFAULT_NAMED_ELEMENT_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_ELEMENT, oldNameElement, nameElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XAttribute getNameProperty()
  {
    if (nameProperty != null && nameProperty.eIsProxy())
    {
      InternalEObject oldNameProperty = (InternalEObject)nameProperty;
      nameProperty = (XAttribute)eResolveProxy(oldNameProperty);
      if (nameProperty != oldNameProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_PROPERTY, oldNameProperty, nameProperty));
      }
    }
    return nameProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XAttribute basicGetNameProperty()
  {
    return nameProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameProperty(XAttribute newNameProperty)
  {
    XAttribute oldNameProperty = nameProperty;
    nameProperty = newNameProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_PROPERTY, oldNameProperty, nameProperty));
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
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_ELEMENT:
        return getNameElement();
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_PROPERTY:
        if (resolve) return getNameProperty();
        return basicGetNameProperty();
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
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_ELEMENT:
        setNameElement((String)newValue);
        return;
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_PROPERTY:
        setNameProperty((XAttribute)newValue);
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
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_ELEMENT:
        setNameElement(NAME_ELEMENT_EDEFAULT);
        return;
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_PROPERTY:
        setNameProperty((XAttribute)null);
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
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_ELEMENT:
        return NAME_ELEMENT_EDEFAULT == null ? nameElement != null : !NAME_ELEMENT_EDEFAULT.equals(nameElement);
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF__NAME_PROPERTY:
        return nameProperty != null;
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
    result.append(')');
    return result.toString();
  }

} //DefaultNamedElementDefImpl
