/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.macros.macros.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.macros.macros.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacrosFactoryImpl extends EFactoryImpl implements MacrosFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MacrosFactory init()
  {
    try
    {
      MacrosFactory theMacrosFactory = (MacrosFactory)EPackage.Registry.INSTANCE.getEFactory(MacrosPackage.eNS_URI);
      if (theMacrosFactory != null)
      {
        return theMacrosFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MacrosFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacrosFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MacrosPackage.MAIN_RULE: return createMainRule();
      case MacrosPackage.VERSION_STATEMENT: return createVersion_Statement();
      case MacrosPackage.STATEMENT: return createStatement();
      case MacrosPackage.TAG_STATEMENT: return createTag_Statement();
      case MacrosPackage.URL_STATEMENT: return createUrl_Statement();
      case MacrosPackage.TAB_STATEMENT: return createTab_Statement();
      case MacrosPackage.VERSION_ATTR: return createVersion_attr();
      case MacrosPackage.TAG_ATTR: return createTag_attr();
      case MacrosPackage.URL_ATTR: return createurl_attr();
      case MacrosPackage.TAB_ATTR: return createtab_attr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainRule createMainRule()
  {
    MainRuleImpl mainRule = new MainRuleImpl();
    return mainRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version_Statement createVersion_Statement()
  {
    Version_StatementImpl version_Statement = new Version_StatementImpl();
    return version_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag_Statement createTag_Statement()
  {
    Tag_StatementImpl tag_Statement = new Tag_StatementImpl();
    return tag_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Url_Statement createUrl_Statement()
  {
    Url_StatementImpl url_Statement = new Url_StatementImpl();
    return url_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tab_Statement createTab_Statement()
  {
    Tab_StatementImpl tab_Statement = new Tab_StatementImpl();
    return tab_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version_attr createVersion_attr()
  {
    Version_attrImpl version_attr = new Version_attrImpl();
    return version_attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag_attr createTag_attr()
  {
    Tag_attrImpl tag_attr = new Tag_attrImpl();
    return tag_attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public url_attr createurl_attr()
  {
    url_attrImpl url_attr = new url_attrImpl();
    return url_attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tab_attr createtab_attr()
  {
    tab_attrImpl tab_attr = new tab_attrImpl();
    return tab_attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacrosPackage getMacrosPackage()
  {
    return (MacrosPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MacrosPackage getPackage()
  {
    return MacrosPackage.eINSTANCE;
  }

} //MacrosFactoryImpl