/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.RootCS;

import org.eclipse.ocl.xtext.basecs.util.VisitableCS;

import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

import uk.ac.york.cs.cs2as.cs2as_dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage
 * @generated
 */
public class Cs2as_dslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Cs2as_dslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cs2as_dslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Cs2as_dslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Cs2as_dslSwitch<Adapter> modelSwitch =
    new Cs2as_dslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCSDecl(CSDecl object)
      {
        return createCSDeclAdapter();
      }
      @Override
      public Adapter caseASDecl(ASDecl object)
      {
        return createASDeclAdapter();
      }
      @Override
      public Adapter caseMappingSect(MappingSect object)
      {
        return createMappingSectAdapter();
      }
      @Override
      public Adapter caseClassMap(ClassMap object)
      {
        return createClassMapAdapter();
      }
      @Override
      public Adapter caseClassMapStmnt(ClassMapStmnt object)
      {
        return createClassMapStmntAdapter();
      }
      @Override
      public Adapter casePropertyMap(PropertyMap object)
      {
        return createPropertyMapAdapter();
      }
      @Override
      public Adapter caseDisambiguationSect(DisambiguationSect object)
      {
        return createDisambiguationSectAdapter();
      }
      @Override
      public Adapter caseClassDisambiguation(ClassDisambiguation object)
      {
        return createClassDisambiguationAdapter();
      }
      @Override
      public Adapter caseClassDisambiguationStmnt(ClassDisambiguationStmnt object)
      {
        return createClassDisambiguationStmntAdapter();
      }
      @Override
      public Adapter caseDisambiguationDef(DisambiguationDef object)
      {
        return createDisambiguationDefAdapter();
      }
      @Override
      public Adapter caseNameResolutionSect(NameResolutionSect object)
      {
        return createNameResolutionSectAdapter();
      }
      @Override
      public Adapter caseDefaultNamedElementDef(DefaultNamedElementDef object)
      {
        return createDefaultNamedElementDefAdapter();
      }
      @Override
      public Adapter caseDefaultNameReferencerDef(DefaultNameReferencerDef object)
      {
        return createDefaultNameReferencerDefAdapter();
      }
      @Override
      public Adapter caseNameQualifierDef(NameQualifierDef object)
      {
        return createNameQualifierDefAdapter();
      }
      @Override
      public Adapter caseClassNameResolution(ClassNameResolution object)
      {
        return createClassNameResolutionAdapter();
      }
      @Override
      public Adapter caseClassNameResolutionStmnt(ClassNameResolutionStmnt object)
      {
        return createClassNameResolutionStmntAdapter();
      }
      @Override
      public Adapter caseNamedElementDef(NamedElementDef object)
      {
        return createNamedElementDefAdapter();
      }
      @Override
      public Adapter caseFilterDef(FilterDef object)
      {
        return createFilterDefAdapter();
      }
      @Override
      public Adapter caseQualificationDef(QualificationDef object)
      {
        return createQualificationDefAdapter();
      }
      @Override
      public Adapter caseElementsContribExp(ElementsContribExp object)
      {
        return createElementsContribExpAdapter();
      }
      @Override
      public Adapter caseScopeDef(ScopeDef object)
      {
        return createScopeDefAdapter();
      }
      @Override
      public Adapter caseOccludingDef(OccludingDef object)
      {
        return createOccludingDefAdapter();
      }
      @Override
      public Adapter caseContributionDef(ContributionDef object)
      {
        return createContributionDefAdapter();
      }
      @Override
      public Adapter caseSelectionDef(SelectionDef object)
      {
        return createSelectionDefAdapter();
      }
      @Override
      public Adapter caseExportDef(ExportDef object)
      {
        return createExportDefAdapter();
      }
      @Override
      public Adapter caseHelpersSect(HelpersSect object)
      {
        return createHelpersSectAdapter();
      }
      @Override
      public Adapter caseClassHelper(ClassHelper object)
      {
        return createClassHelperAdapter();
      }
      @Override
      public Adapter caseHelperDef(HelperDef object)
      {
        return createHelperDefAdapter();
      }
      @Override
      public Adapter caseResolveExpCS(ResolveExpCS object)
      {
        return createResolveExpCSAdapter();
      }
      @Override
      public Adapter caseLookupExpCS(LookupExpCS object)
      {
        return createLookupExpCSAdapter();
      }
      @Override
      public Adapter caseSelectionAll(SelectionAll object)
      {
        return createSelectionAllAdapter();
      }
      @Override
      public Adapter caseSelectionSpecific(SelectionSpecific object)
      {
        return createSelectionSpecificAdapter();
      }
      @Override
      public Adapter caseVisitableCS(VisitableCS object)
      {
        return createVisitableCSAdapter();
      }
      @Override
      public Adapter caseElementCS(ElementCS object)
      {
        return createElementCSAdapter();
      }
      @Override
      public Adapter casePivotable(Pivotable object)
      {
        return createPivotableAdapter();
      }
      @Override
      public Adapter casePivotableElementCS(PivotableElementCS object)
      {
        return createPivotableElementCSAdapter();
      }
      @Override
      public Adapter caseModelElementCS(ModelElementCS object)
      {
        return createModelElementCSAdapter();
      }
      @Override
      public Adapter caseNameable(Nameable object)
      {
        return createNameableAdapter();
      }
      @Override
      public Adapter caseNamedElementCS(NamedElementCS object)
      {
        return createNamedElementCSAdapter();
      }
      @Override
      public Adapter caseRootCS(RootCS object)
      {
        return createRootCSAdapter();
      }
      @Override
      public Adapter caseContextCS(ContextCS object)
      {
        return createContextCSAdapter();
      }
      @Override
      public Adapter caseExpCS(ExpCS object)
      {
        return createExpCSAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl <em>CS Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.CSDecl
   * @generated
   */
  public Adapter createCSDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl <em>AS Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ASDecl
   * @generated
   */
  public Adapter createASDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect <em>Mapping Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.MappingSect
   * @generated
   */
  public Adapter createMappingSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap <em>Class Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMap
   * @generated
   */
  public Adapter createClassMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt <em>Class Map Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassMapStmnt
   * @generated
   */
  public Adapter createClassMapStmntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap <em>Property Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap
   * @generated
   */
  public Adapter createPropertyMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect <em>Disambiguation Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationSect
   * @generated
   */
  public Adapter createDisambiguationSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation <em>Class Disambiguation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguation
   * @generated
   */
  public Adapter createClassDisambiguationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguationStmnt <em>Class Disambiguation Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassDisambiguationStmnt
   * @generated
   */
  public Adapter createClassDisambiguationStmntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef <em>Disambiguation Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DisambiguationDef
   * @generated
   */
  public Adapter createDisambiguationDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect <em>Name Resolution Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameResolutionSect
   * @generated
   */
  public Adapter createNameResolutionSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNamedElementDef <em>Default Named Element Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNamedElementDef
   * @generated
   */
  public Adapter createDefaultNamedElementDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef <em>Default Name Referencer Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.DefaultNameReferencerDef
   * @generated
   */
  public Adapter createDefaultNameReferencerDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef <em>Name Qualifier Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NameQualifierDef
   * @generated
   */
  public Adapter createNameQualifierDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution <em>Class Name Resolution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolution
   * @generated
   */
  public Adapter createClassNameResolutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt <em>Class Name Resolution Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassNameResolutionStmnt
   * @generated
   */
  public Adapter createClassNameResolutionStmntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef <em>Named Element Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.NamedElementDef
   * @generated
   */
  public Adapter createNamedElementDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef <em>Filter Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.FilterDef
   * @generated
   */
  public Adapter createFilterDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef <em>Qualification Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.QualificationDef
   * @generated
   */
  public Adapter createQualificationDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp <em>Elements Contrib Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ElementsContribExp
   * @generated
   */
  public Adapter createElementsContribExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef <em>Scope Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ScopeDef
   * @generated
   */
  public Adapter createScopeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef <em>Occluding Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.OccludingDef
   * @generated
   */
  public Adapter createOccludingDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef <em>Contribution Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ContributionDef
   * @generated
   */
  public Adapter createContributionDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef <em>Selection Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionDef
   * @generated
   */
  public Adapter createSelectionDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef <em>Export Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ExportDef
   * @generated
   */
  public Adapter createExportDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect <em>Helpers Sect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelpersSect
   * @generated
   */
  public Adapter createHelpersSectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper <em>Class Helper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ClassHelper
   * @generated
   */
  public Adapter createClassHelperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef <em>Helper Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.HelperDef
   * @generated
   */
  public Adapter createHelperDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.ResolveExpCS <em>Resolve Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.ResolveExpCS
   * @generated
   */
  public Adapter createResolveExpCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS <em>Lookup Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.LookupExpCS
   * @generated
   */
  public Adapter createLookupExpCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll <em>Selection All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionAll
   * @generated
   */
  public Adapter createSelectionAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific <em>Selection Specific</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.SelectionSpecific
   * @generated
   */
  public Adapter createSelectionSpecificAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.util.VisitableCS <em>Visitable CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.util.VisitableCS
   * @generated
   */
  public Adapter createVisitableCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ElementCS <em>Element CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.ElementCS
   * @generated
   */
  public Adapter createElementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.pivot.utilities.Pivotable <em>Pivotable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.pivot.utilities.Pivotable
   * @generated
   */
  public Adapter createPivotableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.PivotableElementCS <em>Pivotable Element CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.PivotableElementCS
   * @generated
   */
  public Adapter createPivotableElementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ModelElementCS <em>Model Element CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.ModelElementCS
   * @generated
   */
  public Adapter createModelElementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.pivot.utilities.Nameable <em>Nameable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.pivot.utilities.Nameable
   * @generated
   */
  public Adapter createNameableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.NamedElementCS <em>Named Element CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.NamedElementCS
   * @generated
   */
  public Adapter createNamedElementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.RootCS <em>Root CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.basecs.RootCS
   * @generated
   */
  public Adapter createRootCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.ContextCS <em>Context CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.essentialoclcs.ContextCS
   * @generated
   */
  public Adapter createContextCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS <em>Exp CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.ocl.xtext.essentialoclcs.ExpCS
   * @generated
   */
  public Adapter createExpCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Cs2as_dslAdapterFactory
