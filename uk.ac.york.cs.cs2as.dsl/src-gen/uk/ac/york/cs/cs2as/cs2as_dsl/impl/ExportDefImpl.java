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

import uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl#getContibution <em>Contibution</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl#getOccludingDefs <em>Occluding Defs</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl#getSelectionDef <em>Selection Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportDefImpl extends ClassNameResolutionStmntImpl implements ExportDef
{
  /**
   * The cached value of the '{@link #getContibution() <em>Contibution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContibution()
   * @generated
   * @ordered
   */
  protected ContributionDef contibution;

  /**
   * The cached value of the '{@link #getOccludingDefs() <em>Occluding Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccludingDefs()
   * @generated
   * @ordered
   */
  protected EList<OccludingDef> occludingDefs;

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
  public ContributionDef getContibution()
  {
    return contibution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContibution(ContributionDef newContibution, NotificationChain msgs)
  {
    ContributionDef oldContibution = contibution;
    contibution = newContibution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION, oldContibution, newContibution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContibution(ContributionDef newContibution)
  {
    if (newContibution != contibution)
    {
      NotificationChain msgs = null;
      if (contibution != null)
        msgs = ((InternalEObject)contibution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION, null, msgs);
      if (newContibution != null)
        msgs = ((InternalEObject)newContibution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION, null, msgs);
      msgs = basicSetContibution(newContibution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION, newContibution, newContibution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OccludingDef> getOccludingDefs()
  {
    if (occludingDefs == null)
    {
      occludingDefs = new EObjectContainmentEList<OccludingDef>(OccludingDef.class, this, Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS);
    }
    return occludingDefs;
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION:
        return basicSetContibution(null, msgs);
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        return ((InternalEList<?>)getOccludingDefs()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        return basicSetSelectionDef(null, msgs);
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
      case Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION:
        return getContibution();
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        return getOccludingDefs();
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        return getSelectionDef();
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
      case Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION:
        setContibution((ContributionDef)newValue);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
        getOccludingDefs().addAll((Collection<? extends OccludingDef>)newValue);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        setSelectionDef((SelectionDef)newValue);
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
      case Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION:
        setContibution((ContributionDef)null);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
        return;
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        setSelectionDef((SelectionDef)null);
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
      case Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION:
        return contibution != null;
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        return occludingDefs != null && !occludingDefs.isEmpty();
      case Cs2as_dslPackage.EXPORT_DEF__SELECTION_DEF:
        return selectionDef != null;
    }
    return super.eIsSet(featureID);
  }

} //ExportDefImpl
