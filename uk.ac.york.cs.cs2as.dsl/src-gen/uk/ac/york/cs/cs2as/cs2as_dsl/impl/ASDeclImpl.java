/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AS Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ASDeclImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ASDeclImpl#getImportedObject <em>Imported Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASDeclImpl extends MinimalEObjectImpl.Container implements ASDecl
{
  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportedObject() <em>Imported Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedObject()
   * @generated
   * @ordered
   */
  protected EObject importedObject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ASDeclImpl()
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
    return Cs2as_dslPackage.Literals.AS_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.AS_DECL__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getImportedObject()
  {
    if (importedObject != null && importedObject.eIsProxy())
    {
      InternalEObject oldImportedObject = (InternalEObject)importedObject;
      importedObject = eResolveProxy(oldImportedObject);
      if (importedObject != oldImportedObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cs2as_dslPackage.AS_DECL__IMPORTED_OBJECT, oldImportedObject, importedObject));
      }
    }
    return importedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetImportedObject()
  {
    return importedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedObject(EObject newImportedObject)
  {
    EObject oldImportedObject = importedObject;
    importedObject = newImportedObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.AS_DECL__IMPORTED_OBJECT, oldImportedObject, importedObject));
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
      case Cs2as_dslPackage.AS_DECL__IMPORTED_NAMESPACE:
        return getImportedNamespace();
      case Cs2as_dslPackage.AS_DECL__IMPORTED_OBJECT:
        if (resolve) return getImportedObject();
        return basicGetImportedObject();
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
      case Cs2as_dslPackage.AS_DECL__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
        return;
      case Cs2as_dslPackage.AS_DECL__IMPORTED_OBJECT:
        setImportedObject((EObject)newValue);
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
      case Cs2as_dslPackage.AS_DECL__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
        return;
      case Cs2as_dslPackage.AS_DECL__IMPORTED_OBJECT:
        setImportedObject((EObject)null);
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
      case Cs2as_dslPackage.AS_DECL__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
      case Cs2as_dslPackage.AS_DECL__IMPORTED_OBJECT:
        return importedObject != null;
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
    result.append(" (importedNamespace: ");
    result.append(importedNamespace);
    result.append(')');
    return result.toString();
  }

} //ASDeclImpl
