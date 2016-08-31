/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.delphi.delphi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.formalParameters;
import org.xtext.example.delphi.delphi.formalParm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>formal Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.formalParametersImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.delphi.delphi.impl.formalParametersImpl#getParamas <em>Paramas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class formalParametersImpl extends MinimalEObjectImpl.Container implements formalParameters
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<formalParm> params;

  /**
   * The cached value of the '{@link #getParamas() <em>Paramas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamas()
   * @generated
   * @ordered
   */
  protected EList<formalParm> paramas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected formalParametersImpl()
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
    return DelphiPackage.Literals.FORMAL_PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<formalParm> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<formalParm>(formalParm.class, this, DelphiPackage.FORMAL_PARAMETERS__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<formalParm> getParamas()
  {
    if (paramas == null)
    {
      paramas = new EObjectContainmentEList<formalParm>(formalParm.class, this, DelphiPackage.FORMAL_PARAMETERS__PARAMAS);
    }
    return paramas;
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
      case DelphiPackage.FORMAL_PARAMETERS__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case DelphiPackage.FORMAL_PARAMETERS__PARAMAS:
        return ((InternalEList<?>)getParamas()).basicRemove(otherEnd, msgs);
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
      case DelphiPackage.FORMAL_PARAMETERS__PARAMS:
        return getParams();
      case DelphiPackage.FORMAL_PARAMETERS__PARAMAS:
        return getParamas();
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
      case DelphiPackage.FORMAL_PARAMETERS__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends formalParm>)newValue);
        return;
      case DelphiPackage.FORMAL_PARAMETERS__PARAMAS:
        getParamas().clear();
        getParamas().addAll((Collection<? extends formalParm>)newValue);
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
      case DelphiPackage.FORMAL_PARAMETERS__PARAMS:
        getParams().clear();
        return;
      case DelphiPackage.FORMAL_PARAMETERS__PARAMAS:
        getParamas().clear();
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
      case DelphiPackage.FORMAL_PARAMETERS__PARAMS:
        return params != null && !params.isEmpty();
      case DelphiPackage.FORMAL_PARAMETERS__PARAMAS:
        return paramas != null && !paramas.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //formalParametersImpl
