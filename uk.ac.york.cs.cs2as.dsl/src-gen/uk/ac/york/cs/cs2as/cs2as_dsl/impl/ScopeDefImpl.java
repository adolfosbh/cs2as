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
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.PropagationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isSameScope <em>Same Scope</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#isAlsoExports <em>Also Exports</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getContibution <em>Contibution</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getOccludingDefs <em>Occluding Defs</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ScopeDefImpl#getPropagationDef <em>Propagation Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeDefImpl extends ClassNameResolutionStmntImpl implements ScopeDef
{
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
   * The cached value of the '{@link #getContibution() <em>Contibution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContibution()
   * @generated
   * @ordered
   */
  protected EList<ElementsContribExp> contibution;

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
   * The cached value of the '{@link #getPropagationDef() <em>Propagation Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropagationDef()
   * @generated
   * @ordered
   */
  protected PropagationDef propagationDef;

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
  public EList<ElementsContribExp> getContibution()
  {
    if (contibution == null)
    {
      contibution = new EObjectContainmentEList<ElementsContribExp>(ElementsContribExp.class, this, Cs2as_dslPackage.SCOPE_DEF__CONTIBUTION);
    }
    return contibution;
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
      occludingDefs = new EObjectContainmentEList<OccludingDef>(OccludingDef.class, this, Cs2as_dslPackage.SCOPE_DEF__OCCLUDING_DEFS);
    }
    return occludingDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropagationDef getPropagationDef()
  {
    return propagationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropagationDef(PropagationDef newPropagationDef, NotificationChain msgs)
  {
    PropagationDef oldPropagationDef = propagationDef;
    propagationDef = newPropagationDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF, oldPropagationDef, newPropagationDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropagationDef(PropagationDef newPropagationDef)
  {
    if (newPropagationDef != propagationDef)
    {
      NotificationChain msgs = null;
      if (propagationDef != null)
        msgs = ((InternalEObject)propagationDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF, null, msgs);
      if (newPropagationDef != null)
        msgs = ((InternalEObject)newPropagationDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF, null, msgs);
      msgs = basicSetPropagationDef(newPropagationDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF, newPropagationDef, newPropagationDef));
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
      case Cs2as_dslPackage.SCOPE_DEF__CONTIBUTION:
        return ((InternalEList<?>)getContibution()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.SCOPE_DEF__OCCLUDING_DEFS:
        return ((InternalEList<?>)getOccludingDefs()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF:
        return basicSetPropagationDef(null, msgs);
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return isSameScope();
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        return isAlsoExports();
      case Cs2as_dslPackage.SCOPE_DEF__CONTIBUTION:
        return getContibution();
      case Cs2as_dslPackage.SCOPE_DEF__OCCLUDING_DEFS:
        return getOccludingDefs();
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF:
        return getPropagationDef();
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        setAlsoExports((Boolean)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__CONTIBUTION:
        getContibution().clear();
        getContibution().addAll((Collection<? extends ElementsContribExp>)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
        getOccludingDefs().addAll((Collection<? extends OccludingDef>)newValue);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF:
        setPropagationDef((PropagationDef)newValue);
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        setSameScope(SAME_SCOPE_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        setAlsoExports(ALSO_EXPORTS_EDEFAULT);
        return;
      case Cs2as_dslPackage.SCOPE_DEF__CONTIBUTION:
        getContibution().clear();
        return;
      case Cs2as_dslPackage.SCOPE_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
        return;
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF:
        setPropagationDef((PropagationDef)null);
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
      case Cs2as_dslPackage.SCOPE_DEF__SAME_SCOPE:
        return sameScope != SAME_SCOPE_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__ALSO_EXPORTS:
        return alsoExports != ALSO_EXPORTS_EDEFAULT;
      case Cs2as_dslPackage.SCOPE_DEF__CONTIBUTION:
        return contibution != null && !contibution.isEmpty();
      case Cs2as_dslPackage.SCOPE_DEF__OCCLUDING_DEFS:
        return occludingDefs != null && !occludingDefs.isEmpty();
      case Cs2as_dslPackage.SCOPE_DEF__PROPAGATION_DEF:
        return propagationDef != null;
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
    result.append(", alsoExports: ");
    result.append(alsoExports);
    result.append(')');
    return result.toString();
  }

} //ScopeDefImpl
