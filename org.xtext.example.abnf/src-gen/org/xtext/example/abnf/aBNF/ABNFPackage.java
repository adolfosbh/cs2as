/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.abnf.aBNF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.abnf.aBNF.ABNFFactory
 * @model kind="package"
 * @generated
 */
public interface ABNFPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aBNF";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/abnf/ABNF";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aBNF";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ABNFPackage eINSTANCE = org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.abnf.aBNF.impl.abnf_definitionImpl <em>abnf definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abnf.aBNF.impl.abnf_definitionImpl
   * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getabnf_definition()
   * @generated
   */
  int ABNF_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABNF_DEFINITION__RULES = 0;

  /**
   * The number of structural features of the '<em>abnf definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABNF_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.abnf.aBNF.impl.ruleImpl <em>rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abnf.aBNF.impl.ruleImpl
   * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getrule()
   * @generated
   */
  int RULE = 1;

  /**
   * The feature id for the '<em><b>Class Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CLASS_ID = 0;

  /**
   * The number of structural features of the '<em>rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.abnf.aBNF.impl.hierarchy_ruleImpl <em>hierarchy rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abnf.aBNF.impl.hierarchy_ruleImpl
   * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#gethierarchy_rule()
   * @generated
   */
  int HIERARCHY_RULE = 2;

  /**
   * The feature id for the '<em><b>Class Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_RULE__CLASS_ID = RULE__CLASS_ID;

  /**
   * The feature id for the '<em><b>Subclass Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_RULE__SUBCLASS_ID = RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>hierarchy rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.abnf.aBNF.impl.specification_ruleImpl <em>specification rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abnf.aBNF.impl.specification_ruleImpl
   * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getspecification_rule()
   * @generated
   */
  int SPECIFICATION_RULE = 3;

  /**
   * The feature id for the '<em><b>Class Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_RULE__CLASS_ID = RULE__CLASS_ID;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_RULE__ATTRIBUTE = RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>specification rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.abnf.aBNF.impl.classIdImpl <em>class Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abnf.aBNF.impl.classIdImpl
   * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getclassId()
   * @generated
   */
  int CLASS_ID = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ID__ID = 0;

  /**
   * The number of structural features of the '<em>class Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.abnf.aBNF.impl.subclassIdImpl <em>subclass Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abnf.aBNF.impl.subclassIdImpl
   * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getsubclassId()
   * @generated
   */
  int SUBCLASS_ID = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCLASS_ID__ID = 0;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCLASS_ID__IS_ABSTRACT = 1;

  /**
   * The number of structural features of the '<em>subclass Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCLASS_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.abnf.aBNF.impl.attributeImpl <em>attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.abnf.aBNF.impl.attributeImpl
   * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getattribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>OPTA</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OPTA = 0;

  /**
   * The feature id for the '<em><b>SEM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__SEM = 1;

  /**
   * The feature id for the '<em><b>NAME</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The feature id for the '<em><b>TYPE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 3;

  /**
   * The feature id for the '<em><b>MULTA</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MULTA = 4;

  /**
   * The feature id for the '<em><b>MULTB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MULTB = 5;

  /**
   * The feature id for the '<em><b>OPTB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OPTB = 6;

  /**
   * The number of structural features of the '<em>attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 7;


  /**
   * Returns the meta object for class '{@link org.xtext.example.abnf.aBNF.abnf_definition <em>abnf definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>abnf definition</em>'.
   * @see org.xtext.example.abnf.aBNF.abnf_definition
   * @generated
   */
  EClass getabnf_definition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.abnf.aBNF.abnf_definition#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.xtext.example.abnf.aBNF.abnf_definition#getRules()
   * @see #getabnf_definition()
   * @generated
   */
  EReference getabnf_definition_Rules();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abnf.aBNF.rule <em>rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule</em>'.
   * @see org.xtext.example.abnf.aBNF.rule
   * @generated
   */
  EClass getrule();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.abnf.aBNF.rule#getClassId <em>Class Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Id</em>'.
   * @see org.xtext.example.abnf.aBNF.rule#getClassId()
   * @see #getrule()
   * @generated
   */
  EReference getrule_ClassId();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abnf.aBNF.hierarchy_rule <em>hierarchy rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>hierarchy rule</em>'.
   * @see org.xtext.example.abnf.aBNF.hierarchy_rule
   * @generated
   */
  EClass gethierarchy_rule();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.abnf.aBNF.hierarchy_rule#getSubclassId <em>Subclass Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subclass Id</em>'.
   * @see org.xtext.example.abnf.aBNF.hierarchy_rule#getSubclassId()
   * @see #gethierarchy_rule()
   * @generated
   */
  EReference gethierarchy_rule_SubclassId();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abnf.aBNF.specification_rule <em>specification rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>specification rule</em>'.
   * @see org.xtext.example.abnf.aBNF.specification_rule
   * @generated
   */
  EClass getspecification_rule();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.abnf.aBNF.specification_rule#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.xtext.example.abnf.aBNF.specification_rule#getAttribute()
   * @see #getspecification_rule()
   * @generated
   */
  EReference getspecification_rule_Attribute();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abnf.aBNF.classId <em>class Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>class Id</em>'.
   * @see org.xtext.example.abnf.aBNF.classId
   * @generated
   */
  EClass getclassId();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.classId#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.abnf.aBNF.classId#getId()
   * @see #getclassId()
   * @generated
   */
  EAttribute getclassId_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abnf.aBNF.subclassId <em>subclass Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>subclass Id</em>'.
   * @see org.xtext.example.abnf.aBNF.subclassId
   * @generated
   */
  EClass getsubclassId();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.subclassId#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.abnf.aBNF.subclassId#getId()
   * @see #getsubclassId()
   * @generated
   */
  EAttribute getsubclassId_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.subclassId#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see org.xtext.example.abnf.aBNF.subclassId#isIsAbstract()
   * @see #getsubclassId()
   * @generated
   */
  EAttribute getsubclassId_IsAbstract();

  /**
   * Returns the meta object for class '{@link org.xtext.example.abnf.aBNF.attribute <em>attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>attribute</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute
   * @generated
   */
  EClass getattribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.attribute#getOPTA <em>OPTA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>OPTA</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute#getOPTA()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_OPTA();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.attribute#getSEM <em>SEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>SEM</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute#getSEM()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_SEM();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.attribute#getNAME <em>NAME</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>NAME</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute#getNAME()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_NAME();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.attribute#getTYPE <em>TYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>TYPE</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute#getTYPE()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_TYPE();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.attribute#getMULTA <em>MULTA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>MULTA</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute#getMULTA()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_MULTA();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.attribute#getMULTB <em>MULTB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>MULTB</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute#getMULTB()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_MULTB();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.abnf.aBNF.attribute#getOPTB <em>OPTB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>OPTB</em>'.
   * @see org.xtext.example.abnf.aBNF.attribute#getOPTB()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_OPTB();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ABNFFactory getABNFFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.abnf.aBNF.impl.abnf_definitionImpl <em>abnf definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abnf.aBNF.impl.abnf_definitionImpl
     * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getabnf_definition()
     * @generated
     */
    EClass ABNF_DEFINITION = eINSTANCE.getabnf_definition();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABNF_DEFINITION__RULES = eINSTANCE.getabnf_definition_Rules();

    /**
     * The meta object literal for the '{@link org.xtext.example.abnf.aBNF.impl.ruleImpl <em>rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abnf.aBNF.impl.ruleImpl
     * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getrule()
     * @generated
     */
    EClass RULE = eINSTANCE.getrule();

    /**
     * The meta object literal for the '<em><b>Class Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__CLASS_ID = eINSTANCE.getrule_ClassId();

    /**
     * The meta object literal for the '{@link org.xtext.example.abnf.aBNF.impl.hierarchy_ruleImpl <em>hierarchy rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abnf.aBNF.impl.hierarchy_ruleImpl
     * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#gethierarchy_rule()
     * @generated
     */
    EClass HIERARCHY_RULE = eINSTANCE.gethierarchy_rule();

    /**
     * The meta object literal for the '<em><b>Subclass Id</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIERARCHY_RULE__SUBCLASS_ID = eINSTANCE.gethierarchy_rule_SubclassId();

    /**
     * The meta object literal for the '{@link org.xtext.example.abnf.aBNF.impl.specification_ruleImpl <em>specification rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abnf.aBNF.impl.specification_ruleImpl
     * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getspecification_rule()
     * @generated
     */
    EClass SPECIFICATION_RULE = eINSTANCE.getspecification_rule();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION_RULE__ATTRIBUTE = eINSTANCE.getspecification_rule_Attribute();

    /**
     * The meta object literal for the '{@link org.xtext.example.abnf.aBNF.impl.classIdImpl <em>class Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abnf.aBNF.impl.classIdImpl
     * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getclassId()
     * @generated
     */
    EClass CLASS_ID = eINSTANCE.getclassId();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_ID__ID = eINSTANCE.getclassId_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.abnf.aBNF.impl.subclassIdImpl <em>subclass Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abnf.aBNF.impl.subclassIdImpl
     * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getsubclassId()
     * @generated
     */
    EClass SUBCLASS_ID = eINSTANCE.getsubclassId();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCLASS_ID__ID = eINSTANCE.getsubclassId_Id();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBCLASS_ID__IS_ABSTRACT = eINSTANCE.getsubclassId_IsAbstract();

    /**
     * The meta object literal for the '{@link org.xtext.example.abnf.aBNF.impl.attributeImpl <em>attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.abnf.aBNF.impl.attributeImpl
     * @see org.xtext.example.abnf.aBNF.impl.ABNFPackageImpl#getattribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getattribute();

    /**
     * The meta object literal for the '<em><b>OPTA</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OPTA = eINSTANCE.getattribute_OPTA();

    /**
     * The meta object literal for the '<em><b>SEM</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__SEM = eINSTANCE.getattribute_SEM();

    /**
     * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getattribute_NAME();

    /**
     * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getattribute_TYPE();

    /**
     * The meta object literal for the '<em><b>MULTA</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MULTA = eINSTANCE.getattribute_MULTA();

    /**
     * The meta object literal for the '<em><b>MULTB</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MULTB = eINSTANCE.getattribute_MULTB();

    /**
     * The meta object literal for the '<em><b>OPTB</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OPTB = eINSTANCE.getattribute_OPTB();

  }

} //ABNFPackage