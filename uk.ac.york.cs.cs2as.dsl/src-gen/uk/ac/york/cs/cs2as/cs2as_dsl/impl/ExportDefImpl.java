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

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp;
import uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef;

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
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl#isAcceptingAll <em>Accepting All</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.ExportDefImpl#getAcceptingElement <em>Accepting Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportDefImpl extends ClassNameResolutionStmntImpl implements ExportDef
{
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
   * The default value of the '{@link #isAcceptingAll() <em>Accepting All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAcceptingAll()
   * @generated
   * @ordered
   */
  protected static final boolean ACCEPTING_ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAcceptingAll() <em>Accepting All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAcceptingAll()
   * @generated
   * @ordered
   */
  protected boolean acceptingAll = ACCEPTING_ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getAcceptingElement() <em>Accepting Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptingElement()
   * @generated
   * @ordered
   */
  protected ExpCS acceptingElement;

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
  public EList<ElementsContribExp> getContibution()
  {
    if (contibution == null)
    {
      contibution = new EObjectContainmentEList<ElementsContribExp>(ElementsContribExp.class, this, Cs2as_dslPackage.EXPORT_DEF__CONTIBUTION);
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
      occludingDefs = new EObjectContainmentEList<OccludingDef>(OccludingDef.class, this, Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS);
    }
    return occludingDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAcceptingAll()
  {
    return acceptingAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptingAll(boolean newAcceptingAll)
  {
    boolean oldAcceptingAll = acceptingAll;
    acceptingAll = newAcceptingAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ALL, oldAcceptingAll, acceptingAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getAcceptingElement()
  {
    return acceptingElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcceptingElement(ExpCS newAcceptingElement, NotificationChain msgs)
  {
    ExpCS oldAcceptingElement = acceptingElement;
    acceptingElement = newAcceptingElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT, oldAcceptingElement, newAcceptingElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptingElement(ExpCS newAcceptingElement)
  {
    if (newAcceptingElement != acceptingElement)
    {
      NotificationChain msgs = null;
      if (acceptingElement != null)
        msgs = ((InternalEObject)acceptingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT, null, msgs);
      if (newAcceptingElement != null)
        msgs = ((InternalEObject)newAcceptingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT, null, msgs);
      msgs = basicSetAcceptingElement(newAcceptingElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT, newAcceptingElement, newAcceptingElement));
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
        return ((InternalEList<?>)getContibution()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        return ((InternalEList<?>)getOccludingDefs()).basicRemove(otherEnd, msgs);
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT:
        return basicSetAcceptingElement(null, msgs);
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
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ALL:
        return isAcceptingAll();
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT:
        return getAcceptingElement();
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
        getContibution().clear();
        getContibution().addAll((Collection<? extends ElementsContribExp>)newValue);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
        getOccludingDefs().addAll((Collection<? extends OccludingDef>)newValue);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ALL:
        setAcceptingAll((Boolean)newValue);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT:
        setAcceptingElement((ExpCS)newValue);
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
        getContibution().clear();
        return;
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        getOccludingDefs().clear();
        return;
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ALL:
        setAcceptingAll(ACCEPTING_ALL_EDEFAULT);
        return;
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT:
        setAcceptingElement((ExpCS)null);
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
        return contibution != null && !contibution.isEmpty();
      case Cs2as_dslPackage.EXPORT_DEF__OCCLUDING_DEFS:
        return occludingDefs != null && !occludingDefs.isEmpty();
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ALL:
        return acceptingAll != ACCEPTING_ALL_EDEFAULT;
      case Cs2as_dslPackage.EXPORT_DEF__ACCEPTING_ELEMENT:
        return acceptingElement != null;
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
    result.append(" (acceptingAll: ");
    result.append(acceptingAll);
    result.append(')');
    return result.toString();
  }

} //ExportDefImpl
