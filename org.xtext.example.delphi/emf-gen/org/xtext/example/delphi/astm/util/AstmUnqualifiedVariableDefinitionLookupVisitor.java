/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupUnqualifiedCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package org.xtext.example.delphi.astm.util;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.AbstractEvaluationOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.CompilationUnit;
import org.xtext.example.delphi.astm.DefinitionObject;
import org.xtext.example.delphi.astm.DelphiBlockStatement;
import org.xtext.example.delphi.astm.VariableDefinition;
import org.xtext.example.delphi.astm.lookup.LookupEnvironment;
import org.xtext.example.delphi.astm.lookup.LookupPackage;
import org.xtext.example.delphi.astm.util.AbstractAstmCommonLookupVisitor;
import org.xtext.example.delphi.astm.util.Visitable;

public class AstmUnqualifiedVariableDefinitionLookupVisitor
	extends AbstractAstmCommonLookupVisitor
{
    public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_modelum_es_s_modernization_s_astm = IdManager.getNsURIPackageId("http://modelum.es/modernization/astm", null, AstmPackage.eINSTANCE);
    public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/companies", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ RootPackageId PACKid_java_c_s_s_org_xtext_example_delphi_astm_util = IdManager.getRootPackageId("java://org.xtext.example.delphi.astm.util");
    public static final /*@NonInvalid*/ RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
    public static final /*@NonInvalid*/ ClassId CLSSid_AstmUnqualifiedVariableDefinitionLookupVisitor = PACKid_java_c_s_s_org_xtext_example_delphi_astm_util.getClassId("AstmUnqualifiedVariableDefinitionLookupVisitor", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_CompilationUnit = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("CompilationUnit", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_DefinitionObject = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DefinitionObject", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_DelphiBlockStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiBlockStatement", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ ClassId CLSSid_VariableDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("VariableDefinition", 0);
    public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DefinitionObject = TypeId.ORDERED_SET.getSpecializedId(CLSSid_DefinitionObject);
    public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_VariableDefinition = TypeId.ORDERED_SET.getSpecializedId(CLSSid_VariableDefinition);
    
    protected final /*@Thrown*/ Executor executor;
    protected final /*@Thrown*/ IdResolver idResolver;
    protected /*@Thrown*/ Object child_0;
    
    public AstmUnqualifiedVariableDefinitionLookupVisitor(/*@NonNull*/ LookupEnvironment context) {
        super(context);
        this.executor = ClassUtil.nonNull(context.getExecutor());
        this.idResolver = executor.getIdResolver();
    }
    
    @Override
    protected /*@Nullable*/ LookupEnvironment doVisiting(/*@NonNull*/ Visitable visitable) {
        return parentEnv((EObject)visitable);
    }
    
    /**
     * Continue the search for matches in the parent of element.
     */
    protected /*@Nullable*/ LookupEnvironment parentEnv(/*@NonNull*/ EObject element) {
        EObject parent = element.eContainer();
        if (parent instanceof Visitable) {
            this.child_0 = element;
            return ((Visitable)parent).accept(this);
        }
        else {
            return context;
        }
    }
    
    /**
     * _'org.xtext.example.delphi.astm.util'::AstmUnqualifiedVariableDefinitionLookupVisitor::visitCompilationUnit(element : astm::CompilationUnit[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    protected class CACHE_AstmUnqualifiedVariableDefinitionLookupVisitor_visitCompilationUnit extends AbstractEvaluationOperation
    {
        @Override
        public /*@Nullable*/ Object basicEvaluate(/*@NonNull*/ Executor executor, /*@NonNull*/ TypedElement caller, /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
            @SuppressWarnings("null") final /*@NonInvalid*/ CompilationUnit element_0 = (/*@NonInvalid*/ CompilationUnit)sourceAndArgumentValues[0];
            final /*@NonInvalid*/ Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
            final /*@Thrown*/ List<DefinitionObject> fragments = element_0.getFragments();
            final /*@Thrown*/ OrderedSetValue BOXED_fragments = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, fragments);
            final /*@Thrown*/ OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_fragments, TYP_astm_c_c_VariableDefinition_0);
            final /*@Thrown*/ List<VariableDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(VariableDefinition.class, selectByKind);
            final /*@Thrown*/ LookupEnvironment inner = context.addElements(ECORE_selectByKind);
            final /*@Thrown*/ boolean hasFinalResult_0 = inner.hasFinalResult();
            /*@Thrown*/ LookupEnvironment symbol_0;
            if (hasFinalResult_0) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ LookupEnvironment parentEnv_0 = AstmUnqualifiedVariableDefinitionLookupVisitor.this.parentEnv(element_0);
                symbol_0 = parentEnv_0;
            }
            return symbol_0;
        }
        
        public LookupEnvironment evaluate(final /*@NonInvalid*/ CompilationUnit element_0) {
            return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new /*@Nullable*/ Object[]{element_0});
        }
    }
    
    protected final /*@NonNull*/ CACHE_AstmUnqualifiedVariableDefinitionLookupVisitor_visitCompilationUnit INST_AstmUnqualifiedVariableDefinitionLookupVisitor_visitCompilationUnit = new CACHE_AstmUnqualifiedVariableDefinitionLookupVisitor_visitCompilationUnit();
    
    /**
     * _'org.xtext.example.delphi.astm.util'::AstmUnqualifiedVariableDefinitionLookupVisitor::visitDelphiBlockStatement(element : astm::DelphiBlockStatement[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    protected class CACHE_AstmUnqualifiedVariableDefinitionLookupVisitor_visitDelphiBlockStatement extends AbstractEvaluationOperation
    {
        @Override
        public /*@Nullable*/ Object basicEvaluate(/*@NonNull*/ Executor executor, /*@NonNull*/ TypedElement caller, /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
            @SuppressWarnings("null") final /*@NonInvalid*/ DelphiBlockStatement element_1 = (/*@NonInvalid*/ DelphiBlockStatement)sourceAndArgumentValues[0];
            final /*@NonInvalid*/ Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
            final /*@Thrown*/ List<DefinitionObject> declarations = element_1.getDeclarations();
            final /*@Thrown*/ OrderedSetValue BOXED_declarations = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, declarations);
            final /*@Thrown*/ OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_declarations, TYP_astm_c_c_VariableDefinition_0);
            final /*@Thrown*/ List<VariableDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(VariableDefinition.class, selectByKind);
            final /*@Thrown*/ LookupEnvironment inner = context.addElements(ECORE_selectByKind);
            final /*@Thrown*/ boolean hasFinalResult_0 = inner.hasFinalResult();
            /*@Thrown*/ LookupEnvironment symbol_0;
            if (hasFinalResult_0) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ LookupEnvironment parentEnv_0 = AstmUnqualifiedVariableDefinitionLookupVisitor.this.parentEnv(element_1);
                symbol_0 = parentEnv_0;
            }
            return symbol_0;
        }
        
        public LookupEnvironment evaluate(final /*@NonInvalid*/ DelphiBlockStatement element_1) {
            return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new /*@Nullable*/ Object[]{element_1});
        }
    }
    
    protected final /*@NonNull*/ CACHE_AstmUnqualifiedVariableDefinitionLookupVisitor_visitDelphiBlockStatement INST_AstmUnqualifiedVariableDefinitionLookupVisitor_visitDelphiBlockStatement = new CACHE_AstmUnqualifiedVariableDefinitionLookupVisitor_visitDelphiBlockStatement();
}
