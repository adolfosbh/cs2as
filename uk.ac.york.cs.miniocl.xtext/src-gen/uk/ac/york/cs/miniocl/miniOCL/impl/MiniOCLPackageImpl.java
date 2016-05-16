/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package uk.ac.york.cs.miniocl.miniOCL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.cs.miniocl.miniOCL.BooleanExpCS;
import uk.ac.york.cs.miniocl.miniOCL.BooleanLiteralExpCS;
import uk.ac.york.cs.miniocl.miniOCL.CallExpCS;
import uk.ac.york.cs.miniocl.miniOCL.ClassCS;
import uk.ac.york.cs.miniocl.miniOCL.ConstraintCS;
import uk.ac.york.cs.miniocl.miniOCL.ExpCS;
import uk.ac.york.cs.miniocl.miniOCL.IntLiteralExpCS;
import uk.ac.york.cs.miniocl.miniOCL.InvariantCS;
import uk.ac.york.cs.miniocl.miniOCL.LiteralExpCS;
import uk.ac.york.cs.miniocl.miniOCL.LogicExpCS;
import uk.ac.york.cs.miniocl.miniOCL.MiniOCLFactory;
import uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage;
import uk.ac.york.cs.miniocl.miniOCL.NameExpCS;
import uk.ac.york.cs.miniocl.miniOCL.OperationCS;
import uk.ac.york.cs.miniocl.miniOCL.PackageCS;
import uk.ac.york.cs.miniocl.miniOCL.ParameterCS;
import uk.ac.york.cs.miniocl.miniOCL.PathElementCS;
import uk.ac.york.cs.miniocl.miniOCL.PathNameCS;
import uk.ac.york.cs.miniocl.miniOCL.PrimaryExpCS;
import uk.ac.york.cs.miniocl.miniOCL.PropertyCS;
import uk.ac.york.cs.miniocl.miniOCL.RootCS;
import uk.ac.york.cs.miniocl.miniOCL.RoundedBracketClauseCS;
import uk.ac.york.cs.miniocl.miniOCL.StringLiteralExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniOCLPackageImpl extends EPackageImpl implements MiniOCLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invariantCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roundedBracketClauseCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLiteralExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralExpCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathNameCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathElementCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpCSEClass = null;

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
   * @see uk.ac.york.cs.miniocl.miniOCL.MiniOCLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MiniOCLPackageImpl()
  {
    super(eNS_URI, MiniOCLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MiniOCLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MiniOCLPackage init()
  {
    if (isInited) return (MiniOCLPackage)EPackage.Registry.INSTANCE.getEPackage(MiniOCLPackage.eNS_URI);

    // Obtain or create and register package
    MiniOCLPackageImpl theMiniOCLPackage = (MiniOCLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiniOCLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiniOCLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMiniOCLPackage.createPackageContents();

    // Initialize created meta-data
    theMiniOCLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMiniOCLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MiniOCLPackage.eNS_URI, theMiniOCLPackage);
    return theMiniOCLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRootCS()
  {
    return rootCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRootCS_Packages()
  {
    return (EReference)rootCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRootCS_Contraints()
  {
    return (EReference)rootCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageCS()
  {
    return packageCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageCS_Name()
  {
    return (EAttribute)packageCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageCS_Packages()
  {
    return (EReference)packageCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageCS_Classes()
  {
    return (EReference)packageCSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassCS()
  {
    return classCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassCS_Name()
  {
    return (EAttribute)classCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassCS_Extends()
  {
    return (EReference)classCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassCS_Properties()
  {
    return (EReference)classCSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassCS_Operations()
  {
    return (EReference)classCSEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyCS()
  {
    return propertyCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyCS_Name()
  {
    return (EAttribute)propertyCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyCS_TypeRef()
  {
    return (EReference)propertyCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationCS()
  {
    return operationCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationCS_Name()
  {
    return (EAttribute)operationCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCS_Params()
  {
    return (EReference)operationCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCS_ResultRef()
  {
    return (EReference)operationCSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCS_Body()
  {
    return (EReference)operationCSEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterCS()
  {
    return parameterCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterCS_Name()
  {
    return (EAttribute)parameterCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterCS_TypeRef()
  {
    return (EReference)parameterCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintCS()
  {
    return constraintCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintCS_TypeRef()
  {
    return (EReference)constraintCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintCS_Invariants()
  {
    return (EReference)constraintCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvariantCS()
  {
    return invariantCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantCS_Exp()
  {
    return (EReference)invariantCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpCS()
  {
    return expCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicExpCS()
  {
    return logicExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpCS_Left()
  {
    return (EReference)logicExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicExpCS_Op()
  {
    return (EAttribute)logicExpCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExpCS_Right()
  {
    return (EReference)logicExpCSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallExpCS()
  {
    return callExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallExpCS_Source()
  {
    return (EReference)callExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallExpCS_NameExp()
  {
    return (EReference)callExpCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpCS()
  {
    return primaryExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameExpCS()
  {
    return nameExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameExpCS_ExpName()
  {
    return (EReference)nameExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameExpCS_RoundedBrackets()
  {
    return (EReference)nameExpCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameExpCS_CallExp()
  {
    return (EReference)nameExpCSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoundedBracketClauseCS()
  {
    return roundedBracketClauseCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoundedBracketClauseCS_Args()
  {
    return (EReference)roundedBracketClauseCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralExpCS()
  {
    return literalExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntLiteralExpCS()
  {
    return intLiteralExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntLiteralExpCS_IntSymbol()
  {
    return (EAttribute)intLiteralExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteralExpCS()
  {
    return stringLiteralExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteralExpCS_StringSymbol()
  {
    return (EAttribute)stringLiteralExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteralExpCS()
  {
    return booleanLiteralExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathNameCS()
  {
    return pathNameCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathNameCS_Path()
  {
    return (EReference)pathNameCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathElementCS()
  {
    return pathElementCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathElementCS_PathName()
  {
    return (EAttribute)pathElementCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpCS()
  {
    return booleanExpCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpCS_BoolSymbol()
  {
    return (EAttribute)booleanExpCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniOCLFactory getMiniOCLFactory()
  {
    return (MiniOCLFactory)getEFactoryInstance();
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
    rootCSEClass = createEClass(ROOT_CS);
    createEReference(rootCSEClass, ROOT_CS__PACKAGES);
    createEReference(rootCSEClass, ROOT_CS__CONTRAINTS);

    packageCSEClass = createEClass(PACKAGE_CS);
    createEAttribute(packageCSEClass, PACKAGE_CS__NAME);
    createEReference(packageCSEClass, PACKAGE_CS__PACKAGES);
    createEReference(packageCSEClass, PACKAGE_CS__CLASSES);

    classCSEClass = createEClass(CLASS_CS);
    createEAttribute(classCSEClass, CLASS_CS__NAME);
    createEReference(classCSEClass, CLASS_CS__EXTENDS);
    createEReference(classCSEClass, CLASS_CS__PROPERTIES);
    createEReference(classCSEClass, CLASS_CS__OPERATIONS);

    propertyCSEClass = createEClass(PROPERTY_CS);
    createEAttribute(propertyCSEClass, PROPERTY_CS__NAME);
    createEReference(propertyCSEClass, PROPERTY_CS__TYPE_REF);

    operationCSEClass = createEClass(OPERATION_CS);
    createEAttribute(operationCSEClass, OPERATION_CS__NAME);
    createEReference(operationCSEClass, OPERATION_CS__PARAMS);
    createEReference(operationCSEClass, OPERATION_CS__RESULT_REF);
    createEReference(operationCSEClass, OPERATION_CS__BODY);

    parameterCSEClass = createEClass(PARAMETER_CS);
    createEAttribute(parameterCSEClass, PARAMETER_CS__NAME);
    createEReference(parameterCSEClass, PARAMETER_CS__TYPE_REF);

    constraintCSEClass = createEClass(CONSTRAINT_CS);
    createEReference(constraintCSEClass, CONSTRAINT_CS__TYPE_REF);
    createEReference(constraintCSEClass, CONSTRAINT_CS__INVARIANTS);

    invariantCSEClass = createEClass(INVARIANT_CS);
    createEReference(invariantCSEClass, INVARIANT_CS__EXP);

    expCSEClass = createEClass(EXP_CS);

    logicExpCSEClass = createEClass(LOGIC_EXP_CS);
    createEReference(logicExpCSEClass, LOGIC_EXP_CS__LEFT);
    createEAttribute(logicExpCSEClass, LOGIC_EXP_CS__OP);
    createEReference(logicExpCSEClass, LOGIC_EXP_CS__RIGHT);

    callExpCSEClass = createEClass(CALL_EXP_CS);
    createEReference(callExpCSEClass, CALL_EXP_CS__SOURCE);
    createEReference(callExpCSEClass, CALL_EXP_CS__NAME_EXP);

    primaryExpCSEClass = createEClass(PRIMARY_EXP_CS);

    nameExpCSEClass = createEClass(NAME_EXP_CS);
    createEReference(nameExpCSEClass, NAME_EXP_CS__EXP_NAME);
    createEReference(nameExpCSEClass, NAME_EXP_CS__ROUNDED_BRACKETS);
    createEReference(nameExpCSEClass, NAME_EXP_CS__CALL_EXP);

    roundedBracketClauseCSEClass = createEClass(ROUNDED_BRACKET_CLAUSE_CS);
    createEReference(roundedBracketClauseCSEClass, ROUNDED_BRACKET_CLAUSE_CS__ARGS);

    literalExpCSEClass = createEClass(LITERAL_EXP_CS);

    intLiteralExpCSEClass = createEClass(INT_LITERAL_EXP_CS);
    createEAttribute(intLiteralExpCSEClass, INT_LITERAL_EXP_CS__INT_SYMBOL);

    stringLiteralExpCSEClass = createEClass(STRING_LITERAL_EXP_CS);
    createEAttribute(stringLiteralExpCSEClass, STRING_LITERAL_EXP_CS__STRING_SYMBOL);

    booleanLiteralExpCSEClass = createEClass(BOOLEAN_LITERAL_EXP_CS);

    pathNameCSEClass = createEClass(PATH_NAME_CS);
    createEReference(pathNameCSEClass, PATH_NAME_CS__PATH);

    pathElementCSEClass = createEClass(PATH_ELEMENT_CS);
    createEAttribute(pathElementCSEClass, PATH_ELEMENT_CS__PATH_NAME);

    booleanExpCSEClass = createEClass(BOOLEAN_EXP_CS);
    createEAttribute(booleanExpCSEClass, BOOLEAN_EXP_CS__BOOL_SYMBOL);
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
    logicExpCSEClass.getESuperTypes().add(this.getExpCS());
    callExpCSEClass.getESuperTypes().add(this.getLogicExpCS());
    primaryExpCSEClass.getESuperTypes().add(this.getCallExpCS());
    nameExpCSEClass.getESuperTypes().add(this.getPrimaryExpCS());
    literalExpCSEClass.getESuperTypes().add(this.getPrimaryExpCS());
    intLiteralExpCSEClass.getESuperTypes().add(this.getLiteralExpCS());
    stringLiteralExpCSEClass.getESuperTypes().add(this.getLiteralExpCS());
    booleanLiteralExpCSEClass.getESuperTypes().add(this.getLiteralExpCS());
    booleanExpCSEClass.getESuperTypes().add(this.getBooleanLiteralExpCS());

    // Initialize classes and features; add operations and parameters
    initEClass(rootCSEClass, RootCS.class, "RootCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRootCS_Packages(), this.getPackageCS(), null, "packages", null, 0, -1, RootCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRootCS_Contraints(), this.getConstraintCS(), null, "contraints", null, 0, -1, RootCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageCSEClass, PackageCS.class, "PackageCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageCS_Packages(), this.getPackageCS(), null, "packages", null, 0, -1, PackageCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageCS_Classes(), this.getClassCS(), null, "classes", null, 0, -1, PackageCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classCSEClass, ClassCS.class, "ClassCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassCS_Extends(), this.getPathNameCS(), null, "extends", null, 0, 1, ClassCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassCS_Properties(), this.getPropertyCS(), null, "properties", null, 0, -1, ClassCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassCS_Operations(), this.getOperationCS(), null, "operations", null, 0, -1, ClassCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyCSEClass, PropertyCS.class, "PropertyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyCS_TypeRef(), this.getPathNameCS(), null, "typeRef", null, 0, 1, PropertyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCSEClass, OperationCS.class, "OperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationCS_Params(), this.getParameterCS(), null, "params", null, 0, -1, OperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationCS_ResultRef(), this.getPathNameCS(), null, "resultRef", null, 0, 1, OperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationCS_Body(), this.getExpCS(), null, "body", null, 0, 1, OperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterCSEClass, ParameterCS.class, "ParameterCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterCS_TypeRef(), this.getPathNameCS(), null, "typeRef", null, 0, 1, ParameterCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintCSEClass, ConstraintCS.class, "ConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraintCS_TypeRef(), this.getPathNameCS(), null, "typeRef", null, 0, 1, ConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraintCS_Invariants(), this.getInvariantCS(), null, "invariants", null, 0, -1, ConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invariantCSEClass, InvariantCS.class, "InvariantCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvariantCS_Exp(), this.getExpCS(), null, "exp", null, 0, 1, InvariantCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expCSEClass, ExpCS.class, "ExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicExpCSEClass, LogicExpCS.class, "LogicExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicExpCS_Left(), this.getLogicExpCS(), null, "left", null, 0, 1, LogicExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicExpCS_Op(), ecorePackage.getEString(), "op", null, 0, 1, LogicExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicExpCS_Right(), this.getCallExpCS(), null, "right", null, 0, 1, LogicExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callExpCSEClass, CallExpCS.class, "CallExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallExpCS_Source(), this.getCallExpCS(), null, "source", null, 0, 1, CallExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallExpCS_NameExp(), this.getNameExpCS(), null, "nameExp", null, 0, 1, CallExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpCSEClass, PrimaryExpCS.class, "PrimaryExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameExpCSEClass, NameExpCS.class, "NameExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameExpCS_ExpName(), this.getPathNameCS(), null, "expName", null, 0, 1, NameExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameExpCS_RoundedBrackets(), this.getRoundedBracketClauseCS(), null, "roundedBrackets", null, 0, 1, NameExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameExpCS_CallExp(), this.getCallExpCS(), null, "callExp", null, 0, 1, NameExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roundedBracketClauseCSEClass, RoundedBracketClauseCS.class, "RoundedBracketClauseCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoundedBracketClauseCS_Args(), this.getExpCS(), null, "args", null, 0, -1, RoundedBracketClauseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalExpCSEClass, LiteralExpCS.class, "LiteralExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intLiteralExpCSEClass, IntLiteralExpCS.class, "IntLiteralExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntLiteralExpCS_IntSymbol(), ecorePackage.getEInt(), "intSymbol", null, 0, 1, IntLiteralExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralExpCSEClass, StringLiteralExpCS.class, "StringLiteralExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteralExpCS_StringSymbol(), ecorePackage.getEString(), "stringSymbol", null, 0, 1, StringLiteralExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralExpCSEClass, BooleanLiteralExpCS.class, "BooleanLiteralExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pathNameCSEClass, PathNameCS.class, "PathNameCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathNameCS_Path(), this.getPathElementCS(), null, "path", null, 0, -1, PathNameCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathElementCSEClass, PathElementCS.class, "PathElementCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPathElementCS_PathName(), ecorePackage.getEString(), "pathName", null, 0, 1, PathElementCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpCSEClass, BooleanExpCS.class, "BooleanExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanExpCS_BoolSymbol(), ecorePackage.getEBoolean(), "boolSymbol", null, 0, 1, BooleanExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MiniOCLPackageImpl
