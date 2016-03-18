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
import uk.ac.york.cs.cs2as.cs2as_dsl.ProvisionDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getSelectionDef <em>Selection Def</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isSameScope <em>Same Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isEmptyScope <em>Empty Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isAlsoExports <em>Also Exports</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getProvisionDefs <em>Provision Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeDefImpl extends ClassNameResolutionStmntImpl implements ScopeDef
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
   * The default value of the '{@link #isSameScope() <em>Same Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameScope()
   * @generated
   * @ordered
   */
  protected static final boolean SAME_SCOPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSameScope() <em>Same Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameScope()
   * @generated
   * @ordered
   */
  protected boolean sameScope = SAME_SCOPE_EDEFAULT;

  /**
   * The default value of the '{@link #isEmptyScope() <em>Empty Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyScope()
   * @generated
   * @ordered
   */
  protected static final boolean EMPTY_SCOPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmptyScope() <em>Empty Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyScope()
   * @generated
   * @ordered
   */
  protected boolean emptyScope = EMPTY_SCOPE_EDEFAULT;

  /**
   * The default value of the '{@link #isAlsoExports() <em>Also Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlsoExports()
   * @generated
   * @ordered
   */
  protected static final boolean ALSO_EXPORTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAlsoExports() <em>Also Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlsoExports()
   * @generated
   * @ordered
   */
  protected boolean alsoExports = ALSO_EXPORTS_EDEFAULT;

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
  protected ScopeDefImpl()
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
    return Cs2as_dslPackage.Literals.SCOPE_DEF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF, oldSelectionDef, newSelectionDef);
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
        msgs = ((InternalEObject)selectionDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF, null, msgs);
      if (newSelectionDef != null)
        msgs = ((InternalEObject)newSelectionDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF, null, msgs);
      msgs = basicSetSelectionDef(newSelectionDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF, newSelectionDef, newSelectionDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSameScope()
  {
    return sameScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSameScope(boolean newSameScope)
  {
    boolean oldSameScope = sameScope;
    sameScope = newSameScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE, oldSameScope, sameScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmptyScope()
  {
    return emptyScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptyScope(boolean newEmptyScope)
  {
    boolean oldEmptyScope = emptyScope;
    emptyScope = newEmptyScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE, oldEmptyScope, emptyScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAlsoExports()
  {
    return alsoExports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlsoExports(boolean newAlsoExports)
  {
    boolean oldAlsoExports = alsoExports;
    alsoExports = newAlsoExports;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS, oldAlsoExports, alsoExports));
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
      provisionDefs = new EObjectContainmentEList<ProvisionDef>(ProvisionDef.class, this, Cs2as_dslPackage.SCOPE_DEF__PROVISION_DEFS);
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
      case Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF:
        return basicSetSelectionDef(null, msgs);
      case Cs2as_dslPackage.SCOPE_DEF__PROVISION_DEFS:
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
      case Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF:
        return getSelectionDef();
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return isSameScope();
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        return isEmptyScope();
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        return isAlsoExports();
      case Cs2as_dslPackage.SCOPE_DEF__PROVISION_DEFS:
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
      case Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF:
        setSelectionDef((SelectionDef)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        setEmptyScope((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        setAlsoExports((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROVISION_DEFS:
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
      case Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF:
        setSelectionDef((SelectionDef)null);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope(SAME_SCOPE_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        setEmptyScope(EMPTY_SCOPE_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        setAlsoExports(ALSO_EXPORTS_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROVISION_DEFS:
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
      case Cs2as_dslPackage.SCOPE_DEF__SELECTION_DEF:
        return selectionDef != null;
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return sameScope != SAME_SCOPE_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__EMPTY_SCOPE:
        return emptyScope != EMPTY_SCOPE_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        return alsoExports != ALSO_EXPORTS_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__PROVISION_DEFS:
        return provisionDefs != null && !provisionDefs.isEmpty();
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
    result.append(" (sameScope: ");
    result.append(sameScope);
    result.append(", emptyScope: ");
    result.append(emptyScope);
    result.append(", alsoExports: ");
    result.append(alsoExports);
    result.append(')');
    return result.toString();
  }

} //ScopeDefImpl
