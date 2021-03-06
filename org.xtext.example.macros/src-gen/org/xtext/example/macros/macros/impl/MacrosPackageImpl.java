/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.macros.macros.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.macros.macros.MacrosFactory;
import org.xtext.example.macros.macros.MacrosPackage;
import org.xtext.example.macros.macros.MainRule;
import org.xtext.example.macros.macros.Statement;
import org.xtext.example.macros.macros.Tab_Statement;
import org.xtext.example.macros.macros.Tag_Statement;
import org.xtext.example.macros.macros.Tag_attr;
import org.xtext.example.macros.macros.Url_Statement;
import org.xtext.example.macros.macros.Version_Statement;
import org.xtext.example.macros.macros.Version_attr;
import org.xtext.example.macros.macros.tab_attr;
import org.xtext.example.macros.macros.url_attr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacrosPackageImpl extends EPackageImpl implements MacrosPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass version_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tag_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass url_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tab_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass version_attrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tag_attrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass url_attrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tab_attrEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.macros.macros.MacrosPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MacrosPackageImpl()
  {
    super(eNS_URI, MacrosFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MacrosPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MacrosPackage init()
  {
    if (isInited) return (MacrosPackage)EPackage.Registry.INSTANCE.getEPackage(MacrosPackage.eNS_URI);

    // Obtain or create and register package
    MacrosPackageImpl theMacrosPackage = (MacrosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MacrosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MacrosPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMacrosPackage.createPackageContents();

    // Initialize created meta-data
    theMacrosPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMacrosPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MacrosPackage.eNS_URI, theMacrosPackage);
    return theMacrosPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainRule()
  {
    return mainRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainRule_Version()
  {
    return (EReference)mainRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainRule_Statement()
  {
    return (EReference)mainRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion_Statement()
  {
    return version_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVersion_Statement_Attribute()
  {
    return (EReference)version_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag_Statement()
  {
    return tag_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTag_Statement_Tags()
  {
    return (EReference)tag_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrl_Statement()
  {
    return url_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUrl_Statement_Urls()
  {
    return (EReference)url_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTab_Statement()
  {
    return tab_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Statement_Tabs()
  {
    return (EReference)tab_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion_attr()
  {
    return version_attrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_attr_Value()
  {
    return (EAttribute)version_attrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag_attr()
  {
    return tag_attrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_attr_Tag()
  {
    return (EAttribute)tag_attrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_attr_Value()
  {
    return (EAttribute)tag_attrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geturl_attr()
  {
    return url_attrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geturl_attr_Value()
  {
    return (EAttribute)url_attrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettab_attr()
  {
    return tab_attrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettab_attr_Value()
  {
    return (EAttribute)tab_attrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacrosFactory getMacrosFactory()
  {
    return (MacrosFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mainRuleEClass = createEClass(MAIN_RULE);
    createEReference(mainRuleEClass, MAIN_RULE__VERSION);
    createEReference(mainRuleEClass, MAIN_RULE__STATEMENT);

    version_StatementEClass = createEClass(VERSION_STATEMENT);
    createEReference(version_StatementEClass, VERSION_STATEMENT__ATTRIBUTE);

    statementEClass = createEClass(STATEMENT);

    tag_StatementEClass = createEClass(TAG_STATEMENT);
    createEReference(tag_StatementEClass, TAG_STATEMENT__TAGS);

    url_StatementEClass = createEClass(URL_STATEMENT);
    createEReference(url_StatementEClass, URL_STATEMENT__URLS);

    tab_StatementEClass = createEClass(TAB_STATEMENT);
    createEReference(tab_StatementEClass, TAB_STATEMENT__TABS);

    version_attrEClass = createEClass(VERSION_ATTR);
    createEAttribute(version_attrEClass, VERSION_ATTR__VALUE);

    tag_attrEClass = createEClass(TAG_ATTR);
    createEAttribute(tag_attrEClass, TAG_ATTR__TAG);
    createEAttribute(tag_attrEClass, TAG_ATTR__VALUE);

    url_attrEClass = createEClass(URL_ATTR);
    createEAttribute(url_attrEClass, URL_ATTR__VALUE);

    tab_attrEClass = createEClass(TAB_ATTR);
    createEAttribute(tab_attrEClass, TAB_ATTR__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    tag_StatementEClass.getESuperTypes().add(this.getStatement());
    url_StatementEClass.getESuperTypes().add(this.getStatement());
    tab_StatementEClass.getESuperTypes().add(this.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(mainRuleEClass, MainRule.class, "MainRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMainRule_Version(), this.getVersion_Statement(), null, "version", null, 0, 1, MainRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMainRule_Statement(), this.getStatement(), null, "statement", null, 0, -1, MainRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(version_StatementEClass, Version_Statement.class, "Version_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVersion_Statement_Attribute(), this.getVersion_attr(), null, "attribute", null, 0, 1, Version_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tag_StatementEClass, Tag_Statement.class, "Tag_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTag_Statement_Tags(), this.getTag_attr(), null, "tags", null, 0, -1, Tag_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(url_StatementEClass, Url_Statement.class, "Url_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUrl_Statement_Urls(), this.geturl_attr(), null, "urls", null, 0, -1, Url_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tab_StatementEClass, Tab_Statement.class, "Tab_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTab_Statement_Tabs(), this.gettab_attr(), null, "tabs", null, 0, -1, Tab_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(version_attrEClass, Version_attr.class, "Version_attr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_attr_Value(), ecorePackage.getEString(), "value", null, 0, 1, Version_attr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tag_attrEClass, Tag_attr.class, "Tag_attr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTag_attr_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Tag_attr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTag_attr_Value(), ecorePackage.getEString(), "value", null, 0, 1, Tag_attr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(url_attrEClass, url_attr.class, "url_attr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(geturl_attr_Value(), ecorePackage.getEString(), "value", null, 0, 1, url_attr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tab_attrEClass, tab_attr.class, "tab_attr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettab_attr_Value(), ecorePackage.getEString(), "value", null, 0, 1, tab_attr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MacrosPackageImpl
