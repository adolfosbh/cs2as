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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl#getSelectionDef <em>Selection Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl#getProvisionDefs <em>Provision Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportDefImpl extends ClassNameResolutionStmntImpl implements ExportDef
{
  /**
   * The cached value of the '{@link #getSelectionDef() <em>Selection Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectionDef()
   * @generated
   * @ordered
   */
  protected SelectionDef selectionDef;

  /**
   * The cached value of the '{@link #getProvisionDefs() <em>Provision Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvisionDefs()
   * @generated
   * @ordered
   */
  protected EList<ProvisionDef> provisionDefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExportDefImpl()
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
    return Cs2as_dslPackage.Literals.EXPORT_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionDef getSelectionDef()
  {
    return selectionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectionDef(SelectionDef newSelectionDef, NotificationChain msgs)
  {
    SelectionDef oldSelectionDef = selectionDef;
    selectionDef = newSelectionDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF, oldSelectionDef, newSelectionDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectionDef(SelectionDef newSelectionDef)
  {
    if (newSelectionDef != selectionDef)
    {
      NotificationChain msgs = null;
      if (selectionDef != null)
        msgs = ((InternalEObject)selectionDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF, null, msgs);
      if (newSelectionDef != null)
        msgs = ((InternalEObject)newSelectionDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF, null, msgs);
      msgs = basicSetSelectionDef(newSelectionDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF, newSelectionDef, newSelectionDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProvisionDef> getProvisionDefs()
  {
    if (provisionDefs == null)
    {
      provisionDefs = new EObjectContainmentEList<ProvisionDef>(ProvisionDef.class, this, Cs2as_dslPackage.EXPORT_DEF__PROVISION_DEFS);
    }
    return provisionDefs;
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
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        return basicSetSelectionDef(null, msgs);
      case Cs2as_dslPackage.EXPORT_DEF__PROVISION_DEFS:
        return ((InternalEList<?>)getProvisionDefs()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        return getSelectionDef();
      case Cs2as_dslPackage.EXPORT_DEF__PROVISION_DEFS:
        return getProvisionDefs();
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
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        setSelectionDef((SelectionDef)newValue);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__PROVISION_DEFS:
        getProvisionDefs().clear();
        getProvisionDefs().addAll((Collection<? extends ProvisionDef>)newValue);
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
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        setSelectionDef((SelectionDef)null);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__PROVISION_DEFS:
        getProvisionDefs().clear();
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
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        return selectionDef != null;
      case Cs2as_dslPackage.EXPORT_DEF__PROVISION_DEFS:
        return provisionDefs != null && !provisionDefs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExportDefImpl
