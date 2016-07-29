/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XExpression;

import uk.ac.york.cs.cs2as.cs2as_dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage
 * @generated
 */
public class Cs2as_dslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Cs2as_dslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Cs2as_dslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Cs2as_dslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CS_DECL:
      {
        CSDecl csDecl = (CSDecl)theEObject;
        T result = caseCSDecl(csDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.AS_DECL:
      {
        ASDecl asDecl = (ASDecl)theEObject;
        T result = caseASDecl(asDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.MAPPING_SECT:
      {
        MappingSect mappingSect = (MappingSect)theEObject;
        T result = caseMappingSect(mappingSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_MAP:
      {
        ClassMap classMap = (ClassMap)theEObject;
        T result = caseClassMap(classMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_MAP_STMNT:
      {
        ClassMapStmnt classMapStmnt = (ClassMapStmnt)theEObject;
        T result = caseClassMapStmnt(classMapStmnt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROPERTY_MAP:
      {
        PropertyMap propertyMap = (PropertyMap)theEObject;
        T result = casePropertyMap(propertyMap);
        if (result == null) result = caseClassMapStmnt(propertyMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DISAMBIGUATION_SECT:
      {
        DisambiguationSect disambiguationSect = (DisambiguationSect)theEObject;
        T result = caseDisambiguationSect(disambiguationSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_DISAMBIGUATION:
      {
        ClassDisambiguation classDisambiguation = (ClassDisambiguation)theEObject;
        T result = caseClassDisambiguation(classDisambiguation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_DISAMBIGUATION_STMNT:
      {
        ClassDisambiguationStmnt classDisambiguationStmnt = (ClassDisambiguationStmnt)theEObject;
        T result = caseClassDisambiguationStmnt(classDisambiguationStmnt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DISAMBIGUATION_DEF:
      {
        DisambiguationDef disambiguationDef = (DisambiguationDef)theEObject;
        T result = caseDisambiguationDef(disambiguationDef);
        if (result == null) result = caseClassDisambiguationStmnt(disambiguationDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.NAME_RESOLUTION_SECT:
      {
        NameResolutionSect nameResolutionSect = (NameResolutionSect)theEObject;
        T result = caseNameResolutionSect(nameResolutionSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DEFAULT_NAMED_ELEMENT_DEF:
      {
        DefaultNamedElementDef defaultNamedElementDef = (DefaultNamedElementDef)theEObject;
        T result = caseDefaultNamedElementDef(defaultNamedElementDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.DEFAULT_NAME_REFERENCER_DEF:
      {
        DefaultNameReferencerDef defaultNameReferencerDef = (DefaultNameReferencerDef)theEObject;
        T result = caseDefaultNameReferencerDef(defaultNameReferencerDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.NAME_QUALIFIER_DEF:
      {
        NameQualifierDef nameQualifierDef = (NameQualifierDef)theEObject;
        T result = caseNameQualifierDef(nameQualifierDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION:
      {
        ClassNameResolution classNameResolution = (ClassNameResolution)theEObject;
        T result = caseClassNameResolution(classNameResolution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_NAME_RESOLUTION_STMNT:
      {
        ClassNameResolutionStmnt classNameResolutionStmnt = (ClassNameResolutionStmnt)theEObject;
        T result = caseClassNameResolutionStmnt(classNameResolutionStmnt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.NAMED_ELEMENT_DEF:
      {
        NamedElementDef namedElementDef = (NamedElementDef)theEObject;
        T result = caseNamedElementDef(namedElementDef);
        if (result == null) result = caseClassNameResolutionStmnt(namedElementDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.FILTER_DEF:
      {
        FilterDef filterDef = (FilterDef)theEObject;
        T result = caseFilterDef(filterDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.QUALIFICATION_DEF:
      {
        QualificationDef qualificationDef = (QualificationDef)theEObject;
        T result = caseQualificationDef(qualificationDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.ELEMENTS_CONTRIB_EXP:
      {
        ElementsContribExp elementsContribExp = (ElementsContribExp)theEObject;
        T result = caseElementsContribExp(elementsContribExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SCOPE_DEF:
      {
        ScopeDef scopeDef = (ScopeDef)theEObject;
        T result = caseScopeDef(scopeDef);
        if (result == null) result = caseClassNameResolutionStmnt(scopeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.PROVISION_DEF:
      {
        ProvisionDef provisionDef = (ProvisionDef)theEObject;
        T result = caseProvisionDef(provisionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.TARGETS_DEF:
      {
        TargetsDef targetsDef = (TargetsDef)theEObject;
        T result = caseTargetsDef(targetsDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.OCCLUDING_DEF:
      {
        OccludingDef occludingDef = (OccludingDef)theEObject;
        T result = caseOccludingDef(occludingDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CONTRIBUTION_DEF:
      {
        ContributionDef contributionDef = (ContributionDef)theEObject;
        T result = caseContributionDef(contributionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SELECTION_DEF:
      {
        SelectionDef selectionDef = (SelectionDef)theEObject;
        T result = caseSelectionDef(selectionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.EXPORT_DEF:
      {
        ExportDef exportDef = (ExportDef)theEObject;
        T result = caseExportDef(exportDef);
        if (result == null) result = caseClassNameResolutionStmnt(exportDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.HELPERS_SECT:
      {
        HelpersSect helpersSect = (HelpersSect)theEObject;
        T result = caseHelpersSect(helpersSect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.CLASS_HELPER:
      {
        ClassHelper classHelper = (ClassHelper)theEObject;
        T result = caseClassHelper(classHelper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.HELPER_DEF:
      {
        HelperDef helperDef = (HelperDef)theEObject;
        T result = caseHelperDef(helperDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.TRACE_EXP_CS:
      {
        TraceExpCS traceExpCS = (TraceExpCS)theEObject;
        T result = caseTraceExpCS(traceExpCS);
        if (result == null) result = caseXExpression(traceExpCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.LOOKUP_EXP_CS:
      {
        LookupExpCS lookupExpCS = (LookupExpCS)theEObject;
        T result = caseLookupExpCS(lookupExpCS);
        if (result == null) result = caseXExpression(lookupExpCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SELECTION_ALL:
      {
        SelectionAll selectionAll = (SelectionAll)theEObject;
        T result = caseSelectionAll(selectionAll);
        if (result == null) result = caseSelectionDef(selectionAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Cs2as_dslPackage.SELECTION_SPECIFIC:
      {
        SelectionSpecific selectionSpecific = (SelectionSpecific)theEObject;
        T result = caseSelectionSpecific(selectionSpecific);
        if (result == null) result = caseSelectionDef(selectionSpecific);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CS Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CS Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSDecl(CSDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AS Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AS Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASDecl(ASDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingSect(MappingSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassMap(ClassMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Map Stmnt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Map Stmnt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassMapStmnt(ClassMapStmnt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyMap(PropertyMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disambiguation Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disambiguation Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisambiguationSect(DisambiguationSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Disambiguation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Disambiguation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDisambiguation(ClassDisambiguation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Disambiguation Stmnt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Disambiguation Stmnt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDisambiguationStmnt(ClassDisambiguationStmnt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disambiguation Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disambiguation Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisambiguationDef(DisambiguationDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Resolution Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Resolution Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameResolutionSect(NameResolutionSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Named Element Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Named Element Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultNamedElementDef(DefaultNamedElementDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Name Referencer Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Name Referencer Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultNameReferencerDef(DefaultNameReferencerDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Qualifier Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Qualifier Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameQualifierDef(NameQualifierDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Name Resolution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Name Resolution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassNameResolution(ClassNameResolution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Name Resolution Stmnt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Name Resolution Stmnt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassNameResolutionStmnt(ClassNameResolutionStmnt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElementDef(NamedElementDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterDef(FilterDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualification Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualification Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualificationDef(QualificationDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elements Contrib Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elements Contrib Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementsContribExp(ElementsContribExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScopeDef(ScopeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provision Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provision Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvisionDef(ProvisionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Targets Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Targets Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetsDef(TargetsDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Occluding Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Occluding Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOccludingDef(OccludingDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionDef(ContributionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionDef(SelectionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportDef(ExportDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helpers Sect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helpers Sect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelpersSect(HelpersSect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Helper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Helper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassHelper(ClassHelper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helper Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helper Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelperDef(HelperDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trace Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trace Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceExpCS(TraceExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lookup Exp CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lookup Exp CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookupExpCS(LookupExpCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionAll(SelectionAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Specific</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Specific</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionSpecific(SelectionSpecific object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Cs2as_dslSwitch
