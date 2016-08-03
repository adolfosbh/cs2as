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

import org.eclipse.ocl.xtext.basecs.PathNameCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.ClassRef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage;
import uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef;
import uk.ac.york.cs.cs2as.cs2as_dsl.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl#getPropRef <em>Prop Ref</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.impl.TargetImpl#getQualifications <em>Qualifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target
{
  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected ClassRef classRef;

  /**
   * The cached value of the '{@link #getPropRef() <em>Prop Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropRef()
   * @generated
   * @ordered
   */
  protected PathNameCS propRef;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected FilterDef filter;

  /**
   * The cached value of the '{@link #getQualifications() <em>Qualifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifications()
   * @generated
   * @ordered
   */
  protected EList<QualificationDef> qualifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetImpl()
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
    return Cs2as_dslPackage.Literals.TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassRef getClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassRef(ClassRef newClassRef, NotificationChain msgs)
  {
    ClassRef oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.TARGET__CLASS_REF, oldClassRef, newClassRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(ClassRef newClassRef)
  {
    if (newClassRef != classRef)
    {
      NotificationChain msgs = null;
      if (classRef != null)
        msgs = ((InternalEObject)classRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.TARGET__CLASS_REF, null, msgs);
      if (newClassRef != null)
        msgs = ((InternalEObject)newClassRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.TARGET__CLASS_REF, null, msgs);
      msgs = basicSetClassRef(newClassRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.TARGET__CLASS_REF, newClassRef, newClassRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathNameCS getPropRef()
  {
    return propRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropRef(PathNameCS newPropRef, NotificationChain msgs)
  {
    PathNameCS oldPropRef = propRef;
    propRef = newPropRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.TARGET__PROP_REF, oldPropRef, newPropRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropRef(PathNameCS newPropRef)
  {
    if (newPropRef != propRef)
    {
      NotificationChain msgs = null;
      if (propRef != null)
        msgs = ((InternalEObject)propRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.TARGET__PROP_REF, null, msgs);
      if (newPropRef != null)
        msgs = ((InternalEObject)newPropRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.TARGET__PROP_REF, null, msgs);
      msgs = basicSetPropRef(newPropRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.TARGET__PROP_REF, newPropRef, newPropRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterDef getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(FilterDef newFilter, NotificationChain msgs)
  {
    FilterDef oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.TARGET__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(FilterDef newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.TARGET__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs2as_dslPackage.TARGET__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Cs2as_dslPackage.TARGET__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualificationDef> getQualifications()
  {
    if (qualifications == null)
    {
      qualifications = new EObjectContainmentEList<QualificationDef>(QualificationDef.class, this, Cs2as_dslPackage.TARGET__QUALIFICATIONS);
    }
    return qualifications;
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
      case Cs2as_dslPackage.TARGET__CLASS_REF:
        return basicSetClassRef(null, msgs);
      case Cs2as_dslPackage.TARGET__PROP_REF:
        return basicSetPropRef(null, msgs);
      case Cs2as_dslPackage.TARGET__FILTER:
        return basicSetFilter(null, msgs);
      case Cs2as_dslPackage.TARGET__QUALIFICATIONS:
        return ((InternalEList<?>)getQualifications()).basicRemove(otherEnd, msgs);
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
      case Cs2as_dslPackage.TARGET__CLASS_REF:
        return getClassRef();
      case Cs2as_dslPackage.TARGET__PROP_REF:
        return getPropRef();
      case Cs2as_dslPackage.TARGET__FILTER:
        return getFilter();
      case Cs2as_dslPackage.TARGET__QUALIFICATIONS:
        return getQualifications();
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
      case Cs2as_dslPackage.TARGET__CLASS_REF:
        setClassRef((ClassRef)newValue);
        return;
      case Cs2as_dslPackage.TARGET__PROP_REF:
        setPropRef((PathNameCS)newValue);
        return;
      case Cs2as_dslPackage.TARGET__FILTER:
        setFilter((FilterDef)newValue);
        return;
      case Cs2as_dslPackage.TARGET__QUALIFICATIONS:
        getQualifications().clear();
        getQualifications().addAll((Collection<? extends QualificationDef>)newValue);
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
      case Cs2as_dslPackage.TARGET__CLASS_REF:
        setClassRef((ClassRef)null);
        return;
      case Cs2as_dslPackage.TARGET__PROP_REF:
        setPropRef((PathNameCS)null);
        return;
      case Cs2as_dslPackage.TARGET__FILTER:
        setFilter((FilterDef)null);
        return;
      case Cs2as_dslPackage.TARGET__QUALIFICATIONS:
        getQualifications().clear();
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
      case Cs2as_dslPackage.TARGET__CLASS_REF:
        return classRef != null;
      case Cs2as_dslPackage.TARGET__PROP_REF:
        return propRef != null;
      case Cs2as_dslPackage.TARGET__FILTER:
        return filter != null;
      case Cs2as_dslPackage.TARGET__QUALIFICATIONS:
        return qualifications != null && !qualifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TargetImpl
