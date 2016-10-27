/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.qvtd.cs2as.compiler.internal.CS2ASJavaCompilerImpl$1
 *
 * Do not edit it.
 ********************************************************************************/

package org.xtext.example.delphi._Delphi_qvtp_qvtcas;

import java.util.Iterator;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.AbstractDispatchOperation;
import org.eclipse.ocl.pivot.internal.library.executor.AbstractEvaluationOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsOrderedSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.qvtd.runtime.internal.cs2as.AbstractCS2ASTransformer;
import org.eclipse.qvtd.runtime.library.model.ModelObjectsOfKindOperation;
import org.xtext.example.delphi.astm.ActualParameterExpression;
import org.xtext.example.delphi.astm.Assign;
import org.xtext.example.delphi.astm.AstmFactory;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.BinaryExpression;
import org.xtext.example.delphi.astm.CaseBlock;
import org.xtext.example.delphi.astm.CompilationUnit;
import org.xtext.example.delphi.astm.Definition;
import org.xtext.example.delphi.astm.DefinitionObject;
import org.xtext.example.delphi.astm.DelphiBlockStatement;
import org.xtext.example.delphi.astm.DelphiFunctionCallExpression;
import org.xtext.example.delphi.astm.DelphiImplementationSection;
import org.xtext.example.delphi.astm.DelphiInterfaceSection;
import org.xtext.example.delphi.astm.DelphiUnit;
import org.xtext.example.delphi.astm.DelphiWithStatement;
import org.xtext.example.delphi.astm.Equal;
import org.xtext.example.delphi.astm.Expression;
import org.xtext.example.delphi.astm.ExpressionStatement;
import org.xtext.example.delphi.astm.FunctionCallExpression;
import org.xtext.example.delphi.astm.FunctionDefinition;
import org.xtext.example.delphi.astm.IdentifierReference;
import org.xtext.example.delphi.astm.IfStatement;
import org.xtext.example.delphi.astm.IntegerLiteral;
import org.xtext.example.delphi.astm.LabelDefinition;
import org.xtext.example.delphi.astm.Name;
import org.xtext.example.delphi.astm.NameReference;
import org.xtext.example.delphi.astm.Project;
import org.xtext.example.delphi.astm.QualifiedOverData;
import org.xtext.example.delphi.astm.SourceFile;
import org.xtext.example.delphi.astm.SourceLocation;
import org.xtext.example.delphi.astm.Statement;
import org.xtext.example.delphi.astm.StringLiteral;
import org.xtext.example.delphi.astm.SwitchStatement;
import org.xtext.example.delphi.astm.TryStatement;
import org.xtext.example.delphi.astm.TypeDefinition;
import org.xtext.example.delphi.astm.TypeReference;
import org.xtext.example.delphi.astm.VariableDefinition;
import org.xtext.example.delphi.astm.lookup.LookupEnvironment;
import org.xtext.example.delphi.astm.lookup.LookupPackage;
import org.xtext.example.delphi.astm.lookup.util.AstmLookupSolver;
import org.xtext.example.delphi.astm.util.Visitable;
import org.xtext.example.delphi.delphi.CSTrace;
import org.xtext.example.delphi.delphi.ConstExp;
import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.MineID;
import org.xtext.example.delphi.delphi.MultipleConstExp;
import org.xtext.example.delphi.delphi.MultipleId;
import org.xtext.example.delphi.delphi.RecordConstExp;
import org.xtext.example.delphi.delphi.ReservedId;
import org.xtext.example.delphi.delphi.assignmentStmnt;
import org.xtext.example.delphi.delphi.block;
import org.xtext.example.delphi.delphi.callStmnt;
import org.xtext.example.delphi.delphi.caseLabel;
import org.xtext.example.delphi.delphi.caseSelector;
import org.xtext.example.delphi.delphi.caseStmt;
import org.xtext.example.delphi.delphi.compoundStmt;
import org.xtext.example.delphi.delphi.constExpr;
import org.xtext.example.delphi.delphi.constSection;
import org.xtext.example.delphi.delphi.constantDecl;
import org.xtext.example.delphi.delphi.declSection;
import org.xtext.example.delphi.delphi.designator;
import org.xtext.example.delphi.delphi.designatorPart;
import org.xtext.example.delphi.delphi.designatorSubPart;
import org.xtext.example.delphi.delphi.exprList;
import org.xtext.example.delphi.delphi.expression;
import org.xtext.example.delphi.delphi.factor;
import org.xtext.example.delphi.delphi.file;
import org.xtext.example.delphi.delphi.functionDecl;
import org.xtext.example.delphi.delphi.functionHeading;
import org.xtext.example.delphi.delphi.ident;
import org.xtext.example.delphi.delphi.identList;
import org.xtext.example.delphi.delphi.ifStmt;
import org.xtext.example.delphi.delphi.implementationSection;
import org.xtext.example.delphi.delphi.interfaceDecl;
import org.xtext.example.delphi.delphi.interfaceSection;
import org.xtext.example.delphi.delphi.labelDeclSection;
import org.xtext.example.delphi.delphi.mainRule;
import org.xtext.example.delphi.delphi.mulOp;
import org.xtext.example.delphi.delphi.procedureDecl;
import org.xtext.example.delphi.delphi.procedureDeclSection;
import org.xtext.example.delphi.delphi.procedureHeading;
import org.xtext.example.delphi.delphi.recordConstExpr;
import org.xtext.example.delphi.delphi.relExp;
import org.xtext.example.delphi.delphi.relOp;
import org.xtext.example.delphi.delphi.reservedWord;
import org.xtext.example.delphi.delphi.simpleExpression;
import org.xtext.example.delphi.delphi.statement;
import org.xtext.example.delphi.delphi.stmtList;
import org.xtext.example.delphi.delphi.tryStmt;
import org.xtext.example.delphi.delphi.type;
import org.xtext.example.delphi.delphi.typeDecl;
import org.xtext.example.delphi.delphi.unit;
import org.xtext.example.delphi.delphi.unlabelledStatement;
import org.xtext.example.delphi.delphi.varDecl;
import org.xtext.example.delphi.delphi.withStmt;

/**
 * The Delphi_qvtp_qvtcas transformation:
 * <p>
 * Construct with an evaluator
 * <br>
 * Populate each input model with {@link addRootObjects(String,List)}
 * <br>
 * {@link run()}
 * <br>
 * Extract each output model with {@link getRootObjects(String)}
 */
@SuppressWarnings("nls")
public class Delphi_qvtp_qvtcas extends AbstractCS2ASTransformer
{
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_modelum_es_s_modernization_s_astm = IdManager.getNsURIPackageId("http://modelum.es/modernization/astm", null, AstmPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/2015/QVTbaseLibrary", "qvtbaselib", null);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi = IdManager.getNsURIPackageId("http://www.xtext.org/example/delphi/Delphi", null, DelphiPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/companies", null, LookupPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ActualParameter = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("ActualParameter", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ActualParameterExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("ActualParameterExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Assign = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Assign", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_BinaryExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("BinaryExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_CSTrace = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("CSTrace", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_CaseBlock = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("CaseBlock", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_CompilationUnit = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("CompilationUnit", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ConstExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ConstExp", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Definition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Definition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DefinitionObject = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DefinitionObject", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DelphiBlockStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiBlockStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DelphiFunctionCallExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiFunctionCallExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DelphiImplementationSection = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiImplementationSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DelphiInterfaceSection = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiInterfaceSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DelphiUnit = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiUnit", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DelphiWithStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiWithStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Equal = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Equal", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Expression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Expression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ExpressionStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("ExpressionStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_FunctionCallExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("FunctionCallExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_FunctionDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("FunctionDefinition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IdentifierReference = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("IdentifierReference", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IfStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("IfStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IntegerLiteral = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("IntegerLiteral", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LabelDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("LabelDefinition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_companies.getClassId("LookupEnvironment", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MineID = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("MineID", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Model = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary.getClassId("Model", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MultipleConstExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("MultipleConstExp", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MultipleId = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("MultipleId", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Name = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Name", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_NameReference = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("NameReference", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OtherSyntaxObject = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("OtherSyntaxObject", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Project = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Project", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_QualifiedOverData = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("QualifiedOverData", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_RecordConstExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("RecordConstExp", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ReservedId = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ReservedId", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_SourceFile = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("SourceFile", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_SourceLocation = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("SourceLocation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Statement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Statement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_StringLiteral = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("StringLiteral", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_SwitchStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("SwitchStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TryStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("TryStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TypeDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("TypeDefinition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TypeReference = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("TypeReference", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_VariableDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("VariableDefinition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Visitable = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Visitable", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_assignmentStmnt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("assignmentStmnt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_block = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("block", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_callStmnt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("callStmnt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_caseLabel = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("caseLabel", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_caseSelector = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("caseSelector", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_caseStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("caseStmt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_compoundStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("compoundStmt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_constExpr = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("constExpr", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_constSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("constSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_constantDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("constantDecl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_declSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("declSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_designator = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("designator", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_designatorPart = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("designatorPart", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_designatorSubPart = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("designatorSubPart", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_exprList = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("exprList", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_expression = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("expression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_factor = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("factor", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_file = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("file", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_functionDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("functionDecl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_functionHeading = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("functionHeading", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ident = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ident", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_identList = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("identList", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ifStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ifStmt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_implementationSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("implementationSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_interfaceDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("interfaceDecl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_interfaceSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("interfaceSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_labelDeclSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("labelDeclSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_mainRule = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("mainRule", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_mulOp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("mulOp", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_procedureDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("procedureDecl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_procedureDeclSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("procedureDeclSection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_procedureHeading = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("procedureHeading", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_recordConstExpr = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("recordConstExpr", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_relExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("relExp", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_relOp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("relOp", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_reservedWord = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("reservedWord", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_simpleExpression = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("simpleExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_statement = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("statement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_stmtList = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("stmtList", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_tryStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("tryStmt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_type = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("type", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_typeDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("typeDecl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_unit = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("unit", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_unlabelledStatement = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("unlabelledStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_varDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("varDecl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_withStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("withStmt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_NULLid = TypeId.ORDERED_SET.getSpecializedId(TypeId.OCL_VOID);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_Delphi = "Delphi";
	public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_eq = "=";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ActualParameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ActualParameter);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ActualParameterExpression = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ActualParameterExpression);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_CompilationUnit = TypeId.ORDERED_SET.getSpecializedId(CLSSid_CompilationUnit);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Definition = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Definition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_DefinitionObject = TypeId.ORDERED_SET.getSpecializedId(CLSSid_DefinitionObject);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_DelphiBlockStatement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_DelphiBlockStatement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_FunctionDefinition = TypeId.ORDERED_SET.getSpecializedId(CLSSid_FunctionDefinition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Statement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Statement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_VariableDefinition = TypeId.ORDERED_SET.getSpecializedId(CLSSid_VariableDefinition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_caseLabel = TypeId.ORDERED_SET.getSpecializedId(CLSSid_caseLabel);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_caseSelector = TypeId.ORDERED_SET.getSpecializedId(CLSSid_caseSelector);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_constExpr = TypeId.ORDERED_SET.getSpecializedId(CLSSid_constExpr);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_constantDecl = TypeId.ORDERED_SET.getSpecializedId(CLSSid_constantDecl);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_declSection = TypeId.ORDERED_SET.getSpecializedId(CLSSid_declSection);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_expression = TypeId.ORDERED_SET.getSpecializedId(CLSSid_expression);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ident = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ident);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_interfaceDecl = TypeId.ORDERED_SET.getSpecializedId(CLSSid_interfaceDecl);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_recordConstExpr = TypeId.ORDERED_SET.getSpecializedId(CLSSid_recordConstExpr);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_statement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_statement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet_0 = ValueUtil.createOrderedSetOfEach(ORD_NULLid);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_actualParams = CLSSid_FunctionCallExpression.getPropertyId("actualParams");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_calledFunction = CLSSid_FunctionCallExpression.getPropertyId("calledFunction");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_inSourceFile = CLSSid_SourceLocation.getPropertyId("inSourceFile");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_leftOperand = CLSSid_BinaryExpression.getPropertyId("leftOperand");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_nameString = CLSSid_Name.getPropertyId("nameString");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_operator = CLSSid_BinaryExpression.getPropertyId("operator");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_parentEnv = CLSSid_LookupEnvironment.getPropertyId("parentEnv");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_rightOperand = CLSSid_BinaryExpression.getPropertyId("rightOperand");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_value = CLSSid_ActualParameterExpression.getPropertyId("value");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_ActualParameterExpression = TypeId.SEQUENCE.getSpecializedId(CLSSid_ActualParameterExpression);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_CaseBlock = TypeId.SEQUENCE.getSpecializedId(CLSSid_CaseBlock);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_DefinitionObject = TypeId.SEQUENCE.getSpecializedId(CLSSid_DefinitionObject);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Expression = TypeId.SEQUENCE.getSpecializedId(CLSSid_Expression);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Statement = TypeId.SEQUENCE.getSpecializedId(CLSSid_Statement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_VariableDefinition = TypeId.SEQUENCE.getSpecializedId(CLSSid_VariableDefinition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Visitable = TypeId.SEQUENCE.getSpecializedId(CLSSid_Visitable);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_constExpr = TypeId.SEQUENCE.getSpecializedId(CLSSid_constExpr);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_CSTrace = TypeId.SET.getSpecializedId(CLSSid_CSTrace);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_ConstExp = TypeId.SET.getSpecializedId(CLSSid_ConstExp);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Expression = TypeId.SET.getSpecializedId(CLSSid_Expression);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_MultipleConstExp = TypeId.SET.getSpecializedId(CLSSid_MultipleConstExp);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_RecordConstExp = TypeId.SET.getSpecializedId(CLSSid_RecordConstExp);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_assignmentStmnt = TypeId.SET.getSpecializedId(CLSSid_assignmentStmnt);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_block = TypeId.SET.getSpecializedId(CLSSid_block);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_callStmnt = TypeId.SET.getSpecializedId(CLSSid_callStmnt);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_caseSelector = TypeId.SET.getSpecializedId(CLSSid_caseSelector);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_caseStmt = TypeId.SET.getSpecializedId(CLSSid_caseStmt);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_constExpr = TypeId.SET.getSpecializedId(CLSSid_constExpr);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_constantDecl = TypeId.SET.getSpecializedId(CLSSid_constantDecl);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_designator = TypeId.SET.getSpecializedId(CLSSid_designator);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_expression = TypeId.SET.getSpecializedId(CLSSid_expression);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_factor = TypeId.SET.getSpecializedId(CLSSid_factor);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_file = TypeId.SET.getSpecializedId(CLSSid_file);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_functionDecl = TypeId.SET.getSpecializedId(CLSSid_functionDecl);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_ident = TypeId.SET.getSpecializedId(CLSSid_ident);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_ifStmt = TypeId.SET.getSpecializedId(CLSSid_ifStmt);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_implementationSection = TypeId.SET.getSpecializedId(CLSSid_implementationSection);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_interfaceSection = TypeId.SET.getSpecializedId(CLSSid_interfaceSection);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_labelDeclSection = TypeId.SET.getSpecializedId(CLSSid_labelDeclSection);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_mainRule = TypeId.SET.getSpecializedId(CLSSid_mainRule);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_mulOp = TypeId.SET.getSpecializedId(CLSSid_mulOp);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_procedureDecl = TypeId.SET.getSpecializedId(CLSSid_procedureDecl);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_relExp = TypeId.SET.getSpecializedId(CLSSid_relExp);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_statement = TypeId.SET.getSpecializedId(CLSSid_statement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_tryStmt = TypeId.SET.getSpecializedId(CLSSid_tryStmt);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_type = TypeId.SET.getSpecializedId(CLSSid_type);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_typeDecl = TypeId.SET.getSpecializedId(CLSSid_typeDecl);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_unit = TypeId.SET.getSpecializedId(CLSSid_unit);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_unlabelledStatement = TypeId.SET.getSpecializedId(CLSSid_unlabelledStatement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_varDecl = TypeId.SET.getSpecializedId(CLSSid_varDecl);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_withStmt = TypeId.SET.getSpecializedId(CLSSid_withStmt);
	
	/*
	 * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
	 */
	private static final @NonNull ClassId[] classIndex2classId = new @NonNull ClassId[]{
		CLSSid_CSTrace,                       // 0 => CSTrace
		CLSSid_ConstExp,                      // 1 => ConstExp
		CLSSid_MultipleConstExp,              // 2 => MultipleConstExp
		CLSSid_RecordConstExp,                // 3 => RecordConstExp
		CLSSid_assignmentStmnt,               // 4 => assignmentStmnt
		CLSSid_block,                         // 5 => block
		CLSSid_callStmnt,                     // 6 => callStmnt
		CLSSid_caseSelector,                  // 7 => caseSelector
		CLSSid_caseStmt,                      // 8 => caseStmt
		CLSSid_constExpr,                     // 9 => constExpr
		CLSSid_constantDecl,                  // 10 => constantDecl
		CLSSid_designator,                    // 11 => designator
		CLSSid_expression,                    // 12 => expression
		CLSSid_factor,                        // 13 => factor
		CLSSid_file,                          // 14 => file
		CLSSid_functionDecl,                  // 15 => functionDecl
		CLSSid_ident,                         // 16 => ident
		CLSSid_ifStmt,                        // 17 => ifStmt
		CLSSid_implementationSection,         // 18 => implementationSection
		CLSSid_interfaceSection,              // 19 => interfaceSection
		CLSSid_labelDeclSection,              // 20 => labelDeclSection
		CLSSid_mainRule,                      // 21 => mainRule
		CLSSid_mulOp,                         // 22 => mulOp
		CLSSid_procedureDecl,                 // 23 => procedureDecl
		CLSSid_relExp,                        // 24 => relExp
		CLSSid_statement,                     // 25 => statement
		CLSSid_tryStmt,                       // 26 => tryStmt
		CLSSid_type,                          // 27 => type
		CLSSid_typeDecl,                      // 28 => typeDecl
		CLSSid_unit,                          // 29 => unit
		CLSSid_unlabelledStatement,           // 30 => unlabelledStatement
		CLSSid_varDecl,                       // 31 => varDecl
		CLSSid_withStmt                       // 32 => withStmt
	};
	
	/*
	 * Mapping from each ClassIndex to all the ClassIndexes to which an object of the outer index
	 * may contribute results to an allInstances() invocation.
	 * Non trivial inner arrays arise when one ClassId is a derivation of another and so an
	 * instance of the derived classId contributes to derived and inherited ClassIndexes.
	 */
	private final static int @NonNull [] @NonNull [] classIndex2allClassIndexes = new int @NonNull [] @NonNull [] {
		{0},                          // 0 : CSTrace -> {CSTrace}
		{1,0,9},                      // 1 : ConstExp -> {ConstExp,CSTrace,constExpr}
		{2,0,9},                      // 2 : MultipleConstExp -> {MultipleConstExp,CSTrace,constExpr}
		{3,0,9},                      // 3 : RecordConstExp -> {RecordConstExp,CSTrace,constExpr}
		{4,0,30},                     // 4 : assignmentStmnt -> {assignmentStmnt,CSTrace,unlabelledStatement}
		{5,0},                        // 5 : block -> {block,CSTrace}
		{6,0,30},                     // 6 : callStmnt -> {callStmnt,CSTrace,unlabelledStatement}
		{7,0},                        // 7 : caseSelector -> {caseSelector,CSTrace}
		{8,0,30},                     // 8 : caseStmt -> {caseStmt,CSTrace,unlabelledStatement}
		{9,0},                        // 9 : constExpr -> {constExpr,CSTrace}
		{10,0},                       // 10 : constantDecl -> {constantDecl,CSTrace}
		{11,0},                       // 11 : designator -> {designator,CSTrace}
		{12,0},                       // 12 : expression -> {expression,CSTrace}
		{13,0,12},                    // 13 : factor -> {factor,CSTrace,expression}
		{14,0},                       // 14 : file -> {file,CSTrace}
		{15,0},                       // 15 : functionDecl -> {functionDecl,CSTrace}
		{16,0},                       // 16 : ident -> {ident,CSTrace}
		{17,0,30},                    // 17 : ifStmt -> {ifStmt,CSTrace,unlabelledStatement}
		{18,0},                       // 18 : implementationSection -> {implementationSection,CSTrace}
		{19,0},                       // 19 : interfaceSection -> {interfaceSection,CSTrace}
		{20,0},                       // 20 : labelDeclSection -> {labelDeclSection,CSTrace}
		{21,0},                       // 21 : mainRule -> {mainRule,CSTrace}
		{22,0},                       // 22 : mulOp -> {mulOp,CSTrace}
		{23,0},                       // 23 : procedureDecl -> {procedureDecl,CSTrace}
		{24,0,12},                    // 24 : relExp -> {relExp,CSTrace,expression}
		{25,0},                       // 25 : statement -> {statement,CSTrace}
		{26,0,30},                    // 26 : tryStmt -> {tryStmt,CSTrace,unlabelledStatement}
		{27,0},                       // 27 : type -> {type,CSTrace}
		{28,0},                       // 28 : typeDecl -> {typeDecl,CSTrace}
		{29,0,14},                    // 29 : unit -> {unit,CSTrace,file}
		{30,0},                       // 30 : unlabelledStatement -> {unlabelledStatement,CSTrace}
		{31,0},                       // 31 : varDecl -> {varDecl,CSTrace}
		{32,0,30}                     // 32 : withStmt -> {withStmt,CSTrace,unlabelledStatement}
	};
	
	private final AstmLookupSolver lookupSolver = new AstmLookupSolver(executor);
	
	public Delphi_qvtp_qvtcas(final @NonNull Executor executor) {
		super(executor, new @NonNull String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
	}
	
	@Override
	public boolean run() {
		return MAP___root__() && invocationManager.flush();
	}
	
	/**
	 * delphi::declSection::getFragments() : OrderedSet(astm::DefinitionObject)
	 * 
	 * OrderedSet{}
	 */
	protected class CACHE_declSection_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull declSection self_0 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull declSection)sourceAndArgumentValues[0];
			return OrderedSet_0;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull declSection self_0) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_0});
		}
	}
	
	/**
	 * delphi::constSection::getFragments() : OrderedSet(astm::VariableDefinition)
	 * 
	 * 
	 * self.constantDecl.ast.oclAsType(astm::VariableDefinition)
	 * ->asOrderedSet()
	 */
	protected class CACHE_constSection_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constSection self_1 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constSection)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<constantDecl> constantDecl = self_1.getConstantDecl();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_constantDecl = idResolver.createOrderedSetOfAll(ORD_CLSSid_constantDecl, constantDecl);
			/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Visitable);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_constantDecl.iterator();
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect_0 = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl _1 = (constantDecl)ITERATOR__1.next();
				/**
				 * ast
				 */
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = _1.getAst();
				//
				accumulator.add(ast);
			}
			/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_VariableDefinition);
			@Nullable Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable _1_0 = (Visitable)ITERATOR__1_0.next();
				/**
				 * oclAsType(astm::VariableDefinition)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_astm_c_c_VariableDefinition_0));
				//
				accumulator_0.add(oclAsType);
			}
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue asOrderedSet = CollectionAsOrderedSetOperation.INSTANCE.evaluate(collect);
			return asOrderedSet;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constSection self_1) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_1});
		}
	}
	
	/**
	 * delphi::procedureDeclSection::getFragments() : OrderedSet(astm::FunctionDefinition)
	 * 
	 * OrderedSet{self.ast.oclAsType(astm::FunctionDefinition)}
	 */
	protected class CACHE_procedureDeclSection_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDeclSection self_2 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDeclSection)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = self_2.getAst();
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_FunctionDefinition, oclAsType);
			return OrderedSet;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDeclSection self_2) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_2});
		}
	}
	
	/**
	 * delphi::functionDecl::getFragments() : OrderedSet(astm::FunctionDefinition)
	 * 
	 * OrderedSet{self.ast.oclAsType(astm::FunctionDefinition)}
	 */
	protected class CACHE_functionDecl_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl self_3 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = self_3.getAst();
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_FunctionDefinition, oclAsType);
			return OrderedSet;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl self_3) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_3});
		}
	}
	
	/**
	 * delphi::interfaceDecl::getFragments() : OrderedSet(astm::DefinitionObject)
	 * 
	 * OrderedSet{}
	 */
	protected class CACHE_interfaceDecl_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceDecl self_4 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceDecl)sourceAndArgumentValues[0];
			return OrderedSet_0;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceDecl self_4) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_4});
		}
	}
	
	protected class VCACHE_declSection_getFragments extends AbstractDispatchOperation
	{
		private VCACHE_declSection_getFragments() {
			install(procedureDeclSection.class, new CACHE_procedureDeclSection_getFragments());
			install(functionDecl.class, new CACHE_functionDecl_getFragments());
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull declSection self_0) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_0});
		}
	}
	
	protected final @NonNull VCACHE_declSection_getFragments INST_declSection_getFragments = new VCACHE_declSection_getFragments();
	
	/**
	 * delphi::exprList::createActualParams() : OrderedSet(astm::ActualParameterExpression)
	 * 
	 * 
	 * self.exps->collect(x |
	 *   astm::ActualParameterExpression{
	 *     value = x.ast.oclAsType(astm::Expression)
	 *   })
	 * ->asOrderedSet()
	 */
	protected class CACHE_exprList_createActualParams extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull exprList self_5 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull exprList)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<expression> exps = self_5.getExps();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_exps = idResolver.createOrderedSetOfAll(ORD_CLSSid_expression, exps);
			/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_ActualParameterExpression);
			@NonNull Iterator<Object> ITERATOR_x = BOXED_exps.iterator();
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR_x.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull expression x = (expression)ITERATOR_x.next();
				/**
				 * 
				 * astm::ActualParameterExpression{
				 *   value = x.ast.oclAsType(astm::Expression)
				 * }
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_value = idResolver.getProperty(PROPid_value);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_ActualParameterExpression_0 = idResolver.getClass(CLSSid_ActualParameterExpression, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull ActualParameterExpression symbol_0 = (ActualParameterExpression)TYP_astm_c_c_ActualParameterExpression_0.createInstance();
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = x.getAst();
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
				CTORid_value.initValue(symbol_0, oclAsType);
				//
				accumulator.add(symbol_0);
			}
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue asOrderedSet = CollectionAsOrderedSetOperation.INSTANCE.evaluate(collect);
			return asOrderedSet;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull exprList self_5) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_5});
		}
	}
	
	protected final @NonNull CACHE_exprList_createActualParams INST_exprList_createActualParams = new CACHE_exprList_createActualParams();
	
	/**
	 * delphi::MineID::extract() : String[?]
	 * 
	 * first
	 */
	protected class CACHE_MineID_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MineID self_6 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MineID)sourceAndArgumentValues[0];
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String first = self_6.getFirst();
			return first;
		}
		
		public String evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MineID self_6) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_6});
		}
	}
	
	/**
	 * delphi::ident::extract() : String[?]
	 * 
	 * null
	 */
	protected class CACHE_ident_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident self_7 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident)sourceAndArgumentValues[0];
			return null;
		}
		
		public String evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident self_7) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_7});
		}
	}
	
	/**
	 * delphi::ReservedId::extract() : String[?]
	 * 
	 * reservedWord.id
	 */
	protected class CACHE_ReservedId_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ReservedId self_8 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ReservedId)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_reservedWord_0 = idResolver.getClass(CLSSid_reservedWord, null);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String id = ((reservedWord)TYP_delphi_c_c_reservedWord_0).getId();
			return id;
		}
		
		public String evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ReservedId self_8) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_8});
		}
	}
	
	/**
	 * delphi::MultipleId::extract() : String[?]
	 * 
	 * id->first()
	 */
	protected class CACHE_MultipleId_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MultipleId self_9 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MultipleId)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<String> id = self_9.getId();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue BOXED_id = idResolver.createSequenceOfAll(SEQ_PRIMid_String, id);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String first = (String)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_id);
			return first;
		}
		
		public String evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MultipleId self_9) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_9});
		}
	}
	
	protected class VCACHE_ident_extract extends AbstractDispatchOperation
	{
		private VCACHE_ident_extract() {
			install(MineID.class, new CACHE_MineID_extract());
			install(ident.class, new CACHE_ident_extract());
			install(ReservedId.class, new CACHE_ReservedId_extract());
			install(MultipleId.class, new CACHE_MultipleId_extract());
		}
		
		public String evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident self_7) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_7});
		}
	}
	
	protected final @NonNull VCACHE_ident_extract INST_ident_extract = new VCACHE_ident_extract();
	
	/**
	 * astm::Visitable::_lookupFunctionDefinition(env : lookup::LookupEnvironment[?], fName : String[?]) : OrderedSet(astm::FunctionDefinition)
	 * 
	 * 
	 * let
	 *   foundFunctionDefinition : OrderedSet(astm::FunctionDefinition)[*|1] = env.namedElements->selectByKind(FunctionDefinition)
	 *   ->select(identifierName = fName)
	 * in
	 *   if
	 *     foundFunctionDefinition->isEmpty() and
	 *     not (env.parentEnv = null
	 *     )
	 *   then
	 *     _lookupFunctionDefinition(env.parentEnv, fName)
	 *   else foundFunctionDefinition
	 *   endif
	 */
	protected class CACHE_Visitable__lookupFunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.NonNull Visitable self_10 = (/*@NonInvalid*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment env = (/*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String fName = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String)sourceAndArgumentValues[2];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_foundFunctionDefinition;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				if (env == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::namedElements\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Definition> namedElements = env.getNamedElements();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_Definition, namedElements);
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_namedElements, TYP_astm_c_c_FunctionDefinition_0);
				/*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_FunctionDefinition);
				@NonNull Iterator<Object> ITERATOR__1 = selectByKind.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundFunctionDefinition;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						foundFunctionDefinition = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionDefinition _1 = (FunctionDefinition)ITERATOR__1.next();
					/**
					 * identifierName = fName
					 */
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Name identifierName = _1.getIdentifierName();
					final /*@Thrown*/ boolean eq = (identifierName != null) ? identifierName.equals(fName) : (fName == null);
					//
					if (eq == ValueUtil.TRUE_VALUE) {
						accumulator.add(_1);
					}
				}
				CAUGHT_foundFunctionDefinition = foundFunctionDefinition;
			}
			catch (Exception e) {
				CAUGHT_foundFunctionDefinition = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ @NonNull Object CAUGHT_isEmpty;
			try {
				if (CAUGHT_foundFunctionDefinition instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_foundFunctionDefinition;
				}
				final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(CAUGHT_foundFunctionDefinition).booleanValue();
				CAUGHT_isEmpty = isEmpty;
			}
			catch (Exception e) {
				CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ @Nullable Object CAUGHT_not;
			try {
				/*@Caught*/ @NonNull Object CAUGHT_eq_0;
				try {
					if (env == null) {
						throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::parentEnv\'");
					}
					final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = env.getParentEnv();
					final /*@Thrown*/ boolean eq_0 = parentEnv == null;
					CAUGHT_eq_0 = eq_0;
				}
				catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq_0);
				CAUGHT_not = not;
			}
			catch (Exception e) {
				CAUGHT_not = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_isEmpty, CAUGHT_not);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue symbol_0;
			if (and) {
				if (env == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::parentEnv\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = env.getParentEnv();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue _lookupFunctionDefinition = INST_Visitable__lookupFunctionDefinition.evaluate(self_10, parentEnv_0, fName);
				symbol_0 = _lookupFunctionDefinition;
			}
			else {
				if (CAUGHT_foundFunctionDefinition instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_foundFunctionDefinition;
				}
				symbol_0 = (OrderedSetValue)CAUGHT_foundFunctionDefinition;
			}
			return symbol_0;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.NonNull Visitable self_10, final /*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment env, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String fName) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_10, env, fName});
		}
	}
	
	protected final @NonNull CACHE_Visitable__lookupFunctionDefinition INST_Visitable__lookupFunctionDefinition = new CACHE_Visitable__lookupFunctionDefinition();
	
	protected class VCACHE_OclElement__unqualified_env_FunctionDefinition extends AbstractDispatchOperation
	{
		private VCACHE_OclElement__unqualified_env_FunctionDefinition() {
			install(CompilationUnit.class, new CACHE_CompilationUnit__unqualified_env_FunctionDefinition());
			install(Object.class, new CACHE_OclElement__unqualified_env_FunctionDefinition());
			install(DelphiBlockStatement.class, new CACHE_DelphiBlockStatement__unqualified_env_FunctionDefinition());
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_14, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_0) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_14, child_0});
		}
	}
	
	protected final @NonNull VCACHE_OclElement__unqualified_env_FunctionDefinition INST_OclElement__unqualified_env_FunctionDefinition = new VCACHE_OclElement__unqualified_env_FunctionDefinition();
	
	/**
	 * ocl::OclElement::parentEnv_FunctionDefinition() : lookup::LookupEnvironment[1]
	 * 
	 * 
	 * let parent : OclElement[?] = oclContainer()
	 * in
	 *   if parent = null
	 *   then lookup::LookupEnvironment{}
	 *   else parent._unqualified_env_FunctionDefinition(self)
	 *   endif
	 */
	protected class CACHE_OclElement_parentEnv_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_13 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object parent = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, self_13);
			final /*@NonInvalid*/ boolean eq = parent == null;
			/*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_1;
			if (eq) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
				final /*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
				symbol_1 = symbol_0;
			}
			else {
				if (parent == null) {
					throw new InvalidValueException("Null source for \'OclElement::_unqualified_env_FunctionDefinition(OclElement[?]) : lookup::LookupEnvironment[1]\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment _unqualified_env_FunctionDefinition = INST_OclElement__unqualified_env_FunctionDefinition.evaluate(parent, self_13);
				symbol_1 = _unqualified_env_FunctionDefinition;
			}
			return symbol_1;
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_13) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_13});
		}
	}
	
	protected final @NonNull CACHE_OclElement_parentEnv_FunctionDefinition INST_OclElement_parentEnv_FunctionDefinition = new CACHE_OclElement_parentEnv_FunctionDefinition();
	
	/**
	 * astm::CompilationUnit::_unqualified_env_FunctionDefinition(child : OclElement[?]) : lookup::LookupEnvironment[?]
	 * 
	 * 
	 * parentEnv_FunctionDefinition()
	 * .nestedEnv()
	 * .addElements(fragments->selectByKind(FunctionDefinition))
	 */
	protected class CACHE_CompilationUnit__unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CompilationUnit self_12 = (/*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CompilationUnit)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment self_23 = INST_OclElement_parentEnv_FunctionDefinition.evaluate(self_12);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_23);
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DefinitionObject> fragments = self_12.getFragments();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_fragments = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, fragments);
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_fragments, TYP_astm_c_c_FunctionDefinition_0);
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<FunctionDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(FunctionDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}
		
		public LookupEnvironment evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CompilationUnit self_12, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_12, child});
		}
	}
	
	/**
	 * ocl::OclElement::_unqualified_env_FunctionDefinition(child : OclElement[?]) : lookup::LookupEnvironment[1]
	 * 
	 * parentEnv_FunctionDefinition()
	 */
	protected class CACHE_OclElement__unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_14 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_0 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object)sourceAndArgumentValues[1];
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment parentEnv_FunctionDefinition = INST_OclElement_parentEnv_FunctionDefinition.evaluate(self_14);
			return parentEnv_FunctionDefinition;
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_14, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_0) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_14, child_0});
		}
	}
	
	/**
	 * astm::DelphiBlockStatement::_unqualified_env_FunctionDefinition(child : OclElement[?]) : lookup::LookupEnvironment[?]
	 * 
	 * 
	 * parentEnv_FunctionDefinition()
	 * .nestedEnv()
	 * .addElements(declarations->selectByKind(FunctionDefinition))
	 */
	protected class CACHE_DelphiBlockStatement__unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement self_15 = (/*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_1 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment self_23 = INST_OclElement_parentEnv_FunctionDefinition.evaluate(self_15);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_23);
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DefinitionObject> declarations = self_15.getDeclarations();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_declarations = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, declarations);
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_declarations, TYP_astm_c_c_FunctionDefinition_0);
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<FunctionDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(FunctionDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}
		
		public LookupEnvironment evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement self_15, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_1) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_15, child_1});
		}
	}
	
	/**
	 * ocl::OclElement::unqualified_env_FunctionDefinition() : lookup::LookupEnvironment[1]
	 * 
	 * _unqualified_env_FunctionDefinition(null)
	 */
	protected class CACHE_OclElement_unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_11 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment _unqualified_env_FunctionDefinition = INST_OclElement__unqualified_env_FunctionDefinition.evaluate(self_11, null);
			return _unqualified_env_FunctionDefinition;
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_11) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_11});
		}
	}
	
	protected final @NonNull CACHE_OclElement_unqualified_env_FunctionDefinition INST_OclElement_unqualified_env_FunctionDefinition = new CACHE_OclElement_unqualified_env_FunctionDefinition();
	
	/**
	 * astm::Visitable::_lookupVariableDefinition(env : lookup::LookupEnvironment[?], vName : String[?]) : OrderedSet(astm::VariableDefinition)
	 * 
	 * 
	 * let
	 *   foundVariableDefinition : OrderedSet(astm::VariableDefinition)[*|1] = env.namedElements->selectByKind(VariableDefinition)
	 *   ->select(identifierName = vName)
	 * in
	 *   if
	 *     foundVariableDefinition->isEmpty() and
	 *     not (env.parentEnv = null
	 *     )
	 *   then
	 *     _lookupVariableDefinition(env.parentEnv, vName)
	 *   else foundVariableDefinition
	 *   endif
	 */
	protected class CACHE_Visitable__lookupVariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.NonNull Visitable self_16 = (/*@NonInvalid*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment env_0 = (/*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String vName = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String)sourceAndArgumentValues[2];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_foundVariableDefinition;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				if (env_0 == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::namedElements\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Definition> namedElements = env_0.getNamedElements();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_Definition, namedElements);
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_namedElements, TYP_astm_c_c_VariableDefinition_0);
				/*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_VariableDefinition);
				@NonNull Iterator<Object> ITERATOR__1 = selectByKind.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundVariableDefinition;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						foundVariableDefinition = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull VariableDefinition _1 = (VariableDefinition)ITERATOR__1.next();
					/**
					 * identifierName = vName
					 */
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Name identifierName = _1.getIdentifierName();
					final /*@Thrown*/ boolean eq = (identifierName != null) ? identifierName.equals(vName) : (vName == null);
					//
					if (eq == ValueUtil.TRUE_VALUE) {
						accumulator.add(_1);
					}
				}
				CAUGHT_foundVariableDefinition = foundVariableDefinition;
			}
			catch (Exception e) {
				CAUGHT_foundVariableDefinition = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ @NonNull Object CAUGHT_isEmpty;
			try {
				if (CAUGHT_foundVariableDefinition instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_foundVariableDefinition;
				}
				final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(CAUGHT_foundVariableDefinition).booleanValue();
				CAUGHT_isEmpty = isEmpty;
			}
			catch (Exception e) {
				CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ @Nullable Object CAUGHT_not;
			try {
				/*@Caught*/ @NonNull Object CAUGHT_eq_0;
				try {
					if (env_0 == null) {
						throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::parentEnv\'");
					}
					final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = env_0.getParentEnv();
					final /*@Thrown*/ boolean eq_0 = parentEnv == null;
					CAUGHT_eq_0 = eq_0;
				}
				catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq_0);
				CAUGHT_not = not;
			}
			catch (Exception e) {
				CAUGHT_not = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_isEmpty, CAUGHT_not);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue symbol_0;
			if (and) {
				if (env_0 == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/companies\'::LookupEnvironment::parentEnv\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = env_0.getParentEnv();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue _lookupVariableDefinition = INST_Visitable__lookupVariableDefinition.evaluate(self_16, parentEnv_0, vName);
				symbol_0 = _lookupVariableDefinition;
			}
			else {
				if (CAUGHT_foundVariableDefinition instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_foundVariableDefinition;
				}
				symbol_0 = (OrderedSetValue)CAUGHT_foundVariableDefinition;
			}
			return symbol_0;
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.NonNull Visitable self_16, final /*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment env_0, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String vName) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_16, env_0, vName});
		}
	}
	
	protected final @NonNull CACHE_Visitable__lookupVariableDefinition INST_Visitable__lookupVariableDefinition = new CACHE_Visitable__lookupVariableDefinition();
	
	protected class VCACHE_OclElement__unqualified_env_VariableDefinition extends AbstractDispatchOperation
	{
		private VCACHE_OclElement__unqualified_env_VariableDefinition() {
			install(Object.class, new CACHE_OclElement__unqualified_env_VariableDefinition());
			install(DelphiBlockStatement.class, new CACHE_DelphiBlockStatement__unqualified_env_VariableDefinition());
			install(CompilationUnit.class, new CACHE_CompilationUnit__unqualified_env_VariableDefinition());
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_18, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_2) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_18, child_2});
		}
	}
	
	protected final @NonNull VCACHE_OclElement__unqualified_env_VariableDefinition INST_OclElement__unqualified_env_VariableDefinition = new VCACHE_OclElement__unqualified_env_VariableDefinition();
	
	/**
	 * ocl::OclElement::parentEnv_VariableDefinition() : lookup::LookupEnvironment[1]
	 * 
	 * 
	 * let parent : OclElement[?] = oclContainer()
	 * in
	 *   if parent = null
	 *   then lookup::LookupEnvironment{}
	 *   else parent._unqualified_env_VariableDefinition(self)
	 *   endif
	 */
	protected class CACHE_OclElement_parentEnv_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_19 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object parent = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, self_19);
			final /*@NonInvalid*/ boolean eq = parent == null;
			/*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_1;
			if (eq) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
				final /*@NonInvalid*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
				symbol_1 = symbol_0;
			}
			else {
				if (parent == null) {
					throw new InvalidValueException("Null source for \'OclElement::_unqualified_env_VariableDefinition(OclElement[?]) : lookup::LookupEnvironment[1]\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment _unqualified_env_VariableDefinition = INST_OclElement__unqualified_env_VariableDefinition.evaluate(parent, self_19);
				symbol_1 = _unqualified_env_VariableDefinition;
			}
			return symbol_1;
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_19) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_19});
		}
	}
	
	protected final @NonNull CACHE_OclElement_parentEnv_VariableDefinition INST_OclElement_parentEnv_VariableDefinition = new CACHE_OclElement_parentEnv_VariableDefinition();
	
	/**
	 * ocl::OclElement::_unqualified_env_VariableDefinition(child : OclElement[?]) : lookup::LookupEnvironment[1]
	 * 
	 * parentEnv_VariableDefinition()
	 */
	protected class CACHE_OclElement__unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_18 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_2 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object)sourceAndArgumentValues[1];
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment parentEnv_VariableDefinition = INST_OclElement_parentEnv_VariableDefinition.evaluate(self_18);
			return parentEnv_VariableDefinition;
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_18, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_2) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_18, child_2});
		}
	}
	
	/**
	 * astm::DelphiBlockStatement::_unqualified_env_VariableDefinition(child : OclElement[?]) : lookup::LookupEnvironment[?]
	 * 
	 * 
	 * parentEnv_VariableDefinition()
	 * .nestedEnv()
	 * .addElements(declarations->selectByKind(VariableDefinition))
	 */
	protected class CACHE_DelphiBlockStatement__unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement self_20 = (/*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_3 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment self_23 = INST_OclElement_parentEnv_VariableDefinition.evaluate(self_20);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_23);
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DefinitionObject> declarations = self_20.getDeclarations();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_declarations = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, declarations);
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_declarations, TYP_astm_c_c_VariableDefinition_0);
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<VariableDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(VariableDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}
		
		public LookupEnvironment evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement self_20, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_3) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_20, child_3});
		}
	}
	
	/**
	 * astm::CompilationUnit::_unqualified_env_VariableDefinition(child : OclElement[?]) : lookup::LookupEnvironment[?]
	 * 
	 * 
	 * parentEnv_VariableDefinition()
	 * .nestedEnv()
	 * .addElements(fragments->selectByKind(VariableDefinition))
	 */
	protected class CACHE_CompilationUnit__unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CompilationUnit self_21 = (/*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CompilationUnit)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_4 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment self_23 = INST_OclElement_parentEnv_VariableDefinition.evaluate(self_21);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_23);
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DefinitionObject> fragments = self_21.getFragments();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_fragments = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, fragments);
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_fragments, TYP_astm_c_c_VariableDefinition_0);
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<VariableDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(VariableDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}
		
		public LookupEnvironment evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CompilationUnit self_21, final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child_4) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_21, child_4});
		}
	}
	
	/**
	 * ocl::OclElement::unqualified_env_VariableDefinition() : lookup::LookupEnvironment[1]
	 * 
	 * _unqualified_env_VariableDefinition(null)
	 */
	protected class CACHE_OclElement_unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_17 = (/*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object)sourceAndArgumentValues[0];
			final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment _unqualified_env_VariableDefinition = INST_OclElement__unqualified_env_VariableDefinition.evaluate(self_17, null);
			return _unqualified_env_VariableDefinition;
		}
		
		@SuppressWarnings("null")
		public org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object self_17) {
			return (org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_17});
		}
	}
	
	protected final @NonNull CACHE_OclElement_unqualified_env_VariableDefinition INST_OclElement_unqualified_env_VariableDefinition = new CACHE_OclElement_unqualified_env_VariableDefinition();
	
	protected class VCACHE_interfaceDecl_getFragments extends AbstractDispatchOperation
	{
		private VCACHE_interfaceDecl_getFragments() {
			install(declSection.class, new CACHE_declSection_getFragments());
			install(constSection.class, new CACHE_constSection_getFragments());
			install(interfaceDecl.class, new CACHE_interfaceDecl_getFragments());
		}
		
		@SuppressWarnings("unchecked")
		public org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceDecl self_4) {
			return (org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_4});
		}
	}
	
	protected final @NonNull VCACHE_interfaceDecl_getFragments INST_interfaceDecl_getFragments = new VCACHE_interfaceDecl_getFragments();
	
	/**
	 * delphi::identList::extract() : String[?]
	 * 
	 * ids->first().extract()
	 */
	protected class CACHE_identList_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull identList self_22 = (/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull identList)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ident> ids = self_22.getIds();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ids = idResolver.createOrderedSetOfAll(ORD_CLSSid_ident, ids);
			final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable ident first = (ident)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_ids);
			if (first == null) {
				throw new InvalidValueException("Null source for \'delphi::ident::extract() : String[?]\'");
			}
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_ident_extract.evaluate(first);
			return extract;
		}
		
		public String evaluate(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull identList self_22) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_22});
		}
	}
	
	protected final @NonNull CACHE_identList_extract INST_identList_extract = new CACHE_identList_extract();
	
	/**
	 * 
	 * map __root__ in Delphi_qvtp_qvtcas {
	 * 
	 *   var _'\u00ABCSTrace\u00BB' : Set(delphi::CSTrace) := leftCS.objectsOfKind(delphi::CSTrace)
	 *   ;
	 * ::ji_CSTrace : Set(delphi::CSTrace)[*|1]var _'\u00ABConstExp\u00BB' : Set(delphi::ConstExp) := leftCS.objectsOfKind(delphi::ConstExp)
	 *   ;
	 * ::ji_ConstExp : Set(delphi::ConstExp)[*|1]var _'\u00ABMultipleConstExp\u00BB' : Set(delphi::MultipleConstExp) := leftCS.objectsOfKind(delphi::MultipleConstExp)
	 *   ;
	 * ::ji_MultipleConstExp : Set(delphi::MultipleConstExp)[*|1]var _'\u00ABRecordConstExp\u00BB' : Set(delphi::RecordConstExp) := leftCS.objectsOfKind(delphi::RecordConstExp)
	 *   ;
	 * ::ji_RecordConstExp : Set(delphi::RecordConstExp)[*|1]var _'\u00ABassignmentStmnt\u00BB' : Set(delphi::assignmentStmnt) := leftCS.objectsOfKind(delphi::assignmentStmnt)
	 *   ;
	 * ::ji_assignmentStmnt : Set(delphi::assignmentStmnt)[*|1]var _'\u00ABblock\u00BB' : Set(delphi::block) := leftCS.objectsOfKind(delphi::block)
	 *   ;
	 * ::ji_block : Set(delphi::block)[*|1]var _'\u00ABcallStmnt\u00BB' : Set(delphi::callStmnt) := leftCS.objectsOfKind(delphi::callStmnt)
	 *   ;
	 * ::ji_callStmnt : Set(delphi::callStmnt)[*|1]var _'\u00ABcaseSelector\u00BB' : Set(delphi::caseSelector) := leftCS.objectsOfKind(delphi::caseSelector)
	 *   ;
	 * ::ji_caseSelector : Set(delphi::caseSelector)[*|1]var _'\u00ABcaseStmt\u00BB' : Set(delphi::caseStmt) := leftCS.objectsOfKind(delphi::caseStmt)
	 *   ;
	 * ::ji_caseStmt : Set(delphi::caseStmt)[*|1]var _'\u00ABconstExpr\u00BB' : Set(delphi::constExpr) := leftCS.objectsOfKind(delphi::constExpr)
	 *   ;
	 * ::ji_constExpr : Set(delphi::constExpr)[*|1]var _'\u00ABconstantDecl\u00BB' : Set(delphi::constantDecl) := leftCS.objectsOfKind(delphi::constantDecl)
	 *   ;
	 * ::ji_constantDecl : Set(delphi::constantDecl)[*|1]var _'\u00ABdesignator\u00BB' : Set(delphi::designator) := leftCS.objectsOfKind(delphi::designator)
	 *   ;
	 * ::ji_designator : Set(delphi::designator)[*|1]var _'\u00ABexpression\u00BB' : Set(delphi::expression) := leftCS.objectsOfKind(delphi::expression)
	 *   ;
	 * ::ji_expression : Set(delphi::expression)[*|1]var _'\u00ABfactor\u00BB' : Set(delphi::factor) := leftCS.objectsOfKind(delphi::factor)
	 *   ;
	 * ::ji_factor : Set(delphi::factor)[*|1]var _'\u00ABfile\u00BB' : Set(delphi::file) := leftCS.objectsOfKind(delphi::file)
	 *   ;
	 * ::ji_file : Set(delphi::file)[*|1]var _'\u00ABfunctionDecl\u00BB' : Set(delphi::functionDecl) := leftCS.objectsOfKind(delphi::functionDecl)
	 *   ;
	 * ::ji_functionDecl : Set(delphi::functionDecl)[*|1]var _'\u00ABident\u00BB' : Set(delphi::ident) := leftCS.objectsOfKind(delphi::ident)
	 *   ;
	 * ::ji_ident : Set(delphi::ident)[*|1]var _'\u00ABifStmt\u00BB' : Set(delphi::ifStmt) := leftCS.objectsOfKind(delphi::ifStmt)
	 *   ;
	 * ::ji_ifStmt : Set(delphi::ifStmt)[*|1]var _'\u00ABimplementationSection\u00BB' : Set(delphi::implementationSection) := leftCS.objectsOfKind(delphi::implementationSection)
	 *   ;
	 * ::ji_implementationSection : Set(delphi::implementationSection)[*|1]var _'\u00ABinterfaceSection\u00BB' : Set(delphi::interfaceSection) := leftCS.objectsOfKind(delphi::interfaceSection)
	 *   ;
	 * ::ji_interfaceSection : Set(delphi::interfaceSection)[*|1]var _'\u00ABlabelDeclSection\u00BB' : Set(delphi::labelDeclSection) := leftCS.objectsOfKind(delphi::labelDeclSection)
	 *   ;
	 * ::ji_labelDeclSection : Set(delphi::labelDeclSection)[*|1]var _'\u00ABmainRule\u00BB' : Set(delphi::mainRule) := leftCS.objectsOfKind(delphi::mainRule)
	 *   ;
	 * ::ji_mainRule : Set(delphi::mainRule)[*|1]var _'\u00ABmulOp\u00BB' : Set(delphi::mulOp) := leftCS.objectsOfKind(delphi::mulOp)
	 *   ;
	 * ::ji_mulOp : Set(delphi::mulOp)[*|1]var _'\u00ABprocedureDecl\u00BB' : Set(delphi::procedureDecl) := leftCS.objectsOfKind(delphi::procedureDecl)
	 *   ;
	 * ::ji_procedureDecl : Set(delphi::procedureDecl)[*|1]var _'\u00ABrelExp\u00BB' : Set(delphi::relExp) := leftCS.objectsOfKind(delphi::relExp)
	 *   ;
	 * ::ji_relExp : Set(delphi::relExp)[*|1]var _'\u00ABstatement\u00BB' : Set(delphi::statement) := leftCS.objectsOfKind(delphi::statement)
	 *   ;
	 * ::ji_statement : Set(delphi::statement)[*|1]var _'\u00ABtryStmt\u00BB' : Set(delphi::tryStmt) := leftCS.objectsOfKind(delphi::tryStmt)
	 *   ;
	 * ::ji_tryStmt : Set(delphi::tryStmt)[*|1]var _'\u00ABtype\u00BB' : Set(delphi::type) := leftCS.objectsOfKind(delphi::type)
	 *   ;
	 * ::ji_type : Set(delphi::type)[*|1]var _'\u00ABtypeDecl\u00BB' : Set(delphi::typeDecl) := leftCS.objectsOfKind(delphi::typeDecl)
	 *   ;
	 * ::ji_typeDecl : Set(delphi::typeDecl)[*|1]var _'\u00ABunit\u00BB' : Set(delphi::unit) := leftCS.objectsOfKind(delphi::unit)
	 *   ;
	 * ::ji_unit : Set(delphi::unit)[*|1]var _'\u00ABunlabelledStatement\u00BB' : Set(delphi::unlabelledStatement) := leftCS.objectsOfKind(delphi::unlabelledStatement)
	 *   ;
	 * ::ji_unlabelledStatement : Set(delphi::unlabelledStatement)[*|1]var _'\u00ABvarDecl\u00BB' : Set(delphi::varDecl) := leftCS.objectsOfKind(delphi::varDecl)
	 *   ;
	 * ::ji_varDecl : Set(delphi::varDecl)[*|1]var _'\u00ABwithStmt\u00BB' : Set(delphi::withStmt) := leftCS.objectsOfKind(delphi::withStmt)
	 *   ;
	 * ::ji_withStmt : Set(delphi::withStmt)[*|1]for loop0 : delphi::assignmentStmnt[1] in ji_assignmentStmnt {
	 *     call m_ExpressionStatement_assignmentStmnt {
	 * lAssignmentStmnt iterates loop0 : delphi::assignmentStmnt[1];
	 * }}
	 *   for loop0 : delphi::block[1] in ji_block {
	 *     call m_DelphiBlockStatement_block {
	 * lBlock iterates loop0 : delphi::block[1];
	 * }}
	 *   for loop0 : delphi::callStmnt[1] in ji_callStmnt {
	 *     call m_ExpressionStatement_callStmnt {
	 * lCallStmnt iterates loop0 : delphi::callStmnt[1];
	 * }}
	 *   for loop0 : delphi::caseSelector[1] in ji_caseSelector {
	 *     call m_CaseBlock_caseSelector {
	 * lCaseSelector iterates loop0 : delphi::caseSelector[1];
	 * }}
	 *   for loop0 : delphi::caseStmt[1] in ji_caseStmt {
	 *     call m_SwitchStatement_caseStmt {
	 * lCaseStmt iterates loop0 : delphi::caseStmt[1];
	 * }}
	 *   for loop0 : delphi::constantDecl[1] in ji_constantDecl {
	 *     call m_VariableDefinition_constantDecl {
	 * lConstantDecl iterates loop0 : delphi::constantDecl[1];
	 * }}
	 *   for loop0 : delphi::designator[1] in ji_designator {
	 *     call m_IdentifierReference_designator_Boolean {
	 * lDesignator iterates loop0 : delphi::designator[1];
	 * }}
	 *   for loop0 : delphi::designator[1] in ji_designator {
	 *     call m_QualifiedOverData_designator_Boolean_Boolean {
	 * lDesignator iterates loop0 : delphi::designator[1];
	 * }}
	 *   for loop0 : delphi::factor[1] in ji_factor {
	 *     call m_DelphiFunctionCallExpression_factor_Boolean_Bool {
	 * lFactor iterates loop0 : delphi::factor[1];
	 * }}
	 *   for loop0 : delphi::factor[1] in ji_factor {
	 *     call m_IntegerLiteral_factor_Boolean {
	 * lFactor iterates loop0 : delphi::factor[1];
	 * }}
	 *   for loop0 : delphi::factor[1] in ji_factor {
	 *     call m_StringLiteral_factor_Boolean_Boolean {
	 * lFactor iterates loop0 : delphi::factor[1];
	 * }}
	 *   for loop0 : delphi::functionDecl[1] in ji_functionDecl {
	 *     call m_FunctionDefinition_functionDecl {
	 * lFunctionDecl iterates loop0 : delphi::functionDecl[1];
	 * }}
	 *   for loop0 : delphi::ifStmt[1] in ji_ifStmt {
	 *     call m_IfStatement_ifStmt {
	 * lIfStmt iterates loop0 : delphi::ifStmt[1];
	 * }}
	 *   for loop0 : delphi::implementationSection[1] in ji_implementationSection {
	 *     call m_DelphiImplementationSection_implementationSectio {
	 * lImplementationSection iterates loop0 : delphi::implementationSection[1];
	 * }}
	 *   for loop0 : delphi::interfaceSection[1] in ji_interfaceSection {
	 *     call m_DelphiInterfaceSection_interfaceSection {
	 * lInterfaceSection iterates loop0 : delphi::interfaceSection[1];
	 * }}
	 *   for loop0 : delphi::labelDeclSection[1] in ji_labelDeclSection {
	 *     call m_LabelDefinition_labelDeclSection {
	 * lLabelDeclSection iterates loop0 : delphi::labelDeclSection[1];
	 * }}
	 *   for loop0 : delphi::mainRule[1] in ji_mainRule {
	 *     call m_Project_mainRule {
	 * lMainRule iterates loop0 : delphi::mainRule[1];
	 * }}
	 *   for loop0 : delphi::mulOp[1] in ji_mulOp {
	 *     call m_BinaryExpression_mulOp {
	 * lMulOp iterates loop0 : delphi::mulOp[1];
	 * }}
	 *   for loop0 : delphi::procedureDecl[1] in ji_procedureDecl {
	 *     call m_FunctionDefinition_procedureDecl {
	 * lProcedureDecl iterates loop0 : delphi::procedureDecl[1];
	 * }}
	 *   for loop0 : delphi::relExp[1] in ji_relExp {
	 *     call m_BinaryExpression_relExp {
	 * lRelExp iterates loop0 : delphi::relExp[1];
	 * }}
	 *   for loop0 : delphi::tryStmt[1] in ji_tryStmt {
	 *     call m_TryStatement_tryStmt {
	 * lTryStmt iterates loop0 : delphi::tryStmt[1];
	 * }}
	 *   for loop0 : delphi::typeDecl[1] in ji_typeDecl {
	 *     call m_TypeDefinition_typeDecl {
	 * lTypeDecl iterates loop0 : delphi::typeDecl[1];
	 * }}
	 *   for loop0 : delphi::unit[1] in ji_unit {
	 *     call m_DelphiUnit_unit {
	 * lUnit iterates loop0 : delphi::unit[1];
	 * }}
	 *   for loop0 : delphi::varDecl[1] in ji_varDecl {
	 *     call m_VariableDefinition_varDecl {
	 * lVarDecl iterates loop0 : delphi::varDecl[1];
	 * }}
	 *   for loop0 : delphi::withStmt[1] in ji_withStmt {
	 *     call m_DelphiWithStatement_withStmt {
	 * lWithStmt iterates loop0 : delphi::withStmt[1];
	 * }}
	 *   for loop0 : delphi::CSTrace[1] in ji_CSTrace {
	 *     call m_CSTrace_ast0 {
	 * lCSTrace iterates loop0 : delphi::CSTrace[1];
	 * }}
	 *   for loop0 : delphi::ConstExp[1] in ji_ConstExp {
	 *     call m_ConstExp_ast_exp {
	 * lConstExp iterates loop0 : delphi::ConstExp[1];
	 * }}
	 *   for loop0 : delphi::MultipleConstExp[1] in ji_MultipleConstExp {
	 *     call m_MultipleConstExp_ast_exps {
	 * lMultipleConstExp iterates loop0 : delphi::MultipleConstExp[1];
	 * }}
	 *   for loop0 : delphi::RecordConstExp[1] in ji_RecordConstExp {
	 *     call m_RecordConstExp_ast_exps {
	 * lRecordConstExp iterates loop0 : delphi::RecordConstExp[1];
	 * }}
	 *   for loop0 : delphi::assignmentStmnt[1] in ji_assignmentStmnt {
	 *     call m_assignmentStmnt_ast_designator_exp {
	 * lAssignmentStmnt iterates loop0 : delphi::assignmentStmnt[1];
	 * }}
	 *   for loop0 : delphi::block[1] in ji_block {
	 *     call m_block_ast_declSect {
	 * lBlock iterates loop0 : delphi::block[1];
	 * }}
	 *   for loop0 : delphi::block[1] in ji_block {
	 *     call m_block_ast_compound {
	 * lBlock iterates loop0 : delphi::block[1];
	 * }}
	 *   for loop0 : delphi::callStmnt[1] in ji_callStmnt {
	 *     call m_callStmnt_args_ast_designator {
	 * lCallStmnt iterates loop0 : delphi::callStmnt[1];
	 * }}
	 *   for loop0 : delphi::caseSelector[1] in ji_caseSelector {
	 *     call m_caseSelector_ast_stmt {
	 * lCaseSelector iterates loop0 : delphi::caseSelector[1];
	 * }}
	 *   for loop0 : delphi::caseSelector[1] in ji_caseSelector {
	 *     call m_caseSelector_ast_labels {
	 * lCaseSelector iterates loop0 : delphi::caseSelector[1];
	 * }}
	 *   for loop0 : delphi::caseStmt[1] in ji_caseStmt {
	 *     call m_caseStmt_ast_cases {
	 * lCaseStmt iterates loop0 : delphi::caseStmt[1];
	 * }}
	 *   for loop0 : delphi::caseStmt[1] in ji_caseStmt {
	 *     call m_caseStmt_ast_expression {
	 * lCaseStmt iterates loop0 : delphi::caseStmt[1];
	 * }}
	 *   for loop0 : delphi::constExpr[1] in ji_constExpr {
	 *     call m_constExpr_ast0 {
	 * lConstExpr iterates loop0 : delphi::constExpr[1];
	 * }}
	 *   for loop0 : delphi::constantDecl[1] in ji_constantDecl {
	 *     call m_constantDecl_ast_id {
	 * lConstantDecl iterates loop0 : delphi::constantDecl[1];
	 * }}
	 *   for loop0 : delphi::constantDecl[1] in ji_constantDecl {
	 *     call m_constantDecl_ast_const {
	 * lConstantDecl iterates loop0 : delphi::constantDecl[1];
	 * }}
	 *   for loop0 : delphi::designator[1] in ji_designator {
	 *     call m_designator_ast_subpart {
	 * lDesignator iterates loop0 : delphi::designator[1];
	 * }}
	 *   for loop0 : delphi::designator[1] in ji_designator {
	 *     call m_designator_ast_subpart_1 {
	 * lDesignator iterates loop0 : delphi::designator[1];
	 * }}
	 *   for loop0 : delphi::expression[1] in ji_expression {
	 *     call m_expression_ast0 {
	 * lExpression iterates loop0 : delphi::expression[1];
	 * }}
	 *   for loop0 : delphi::factor[1] in ji_factor {
	 *     call m_factor_ast_expList {
	 * lFactor iterates loop0 : delphi::factor[1];
	 * }}
	 *   for loop0 : delphi::factor[1] in ji_factor {
	 *     call m_factor_ast_designator {
	 * lFactor iterates loop0 : delphi::factor[1];
	 * }}
	 *   for loop0 : delphi::factor[1] in ji_factor {
	 *     call m_factor_ast_number {
	 * lFactor iterates loop0 : delphi::factor[1];
	 * }}
	 *   for loop0 : delphi::factor[1] in ji_factor {
	 *     call m_factor_ast_string {
	 * lFactor iterates loop0 : delphi::factor[1];
	 * }}
	 *   for loop0 : delphi::file[1] in ji_file {
	 *     call m_file_ast0 {
	 * lFile iterates loop0 : delphi::file[1];
	 * }}
	 *   for loop0 : delphi::functionDecl[1] in ji_functionDecl {
	 *     call m_functionDecl_ast_block {
	 * lFunctionDecl iterates loop0 : delphi::functionDecl[1];
	 * }}
	 *   for loop0 : delphi::functionDecl[1] in ji_functionDecl {
	 *     call m_functionDecl_ast_heading {
	 * lFunctionDecl iterates loop0 : delphi::functionDecl[1];
	 * }}
	 *   for loop0 : delphi::ifStmt[1] in ji_ifStmt {
	 *     call m_ifStmt_ast_condition {
	 * lIfStmt iterates loop0 : delphi::ifStmt[1];
	 * }}
	 *   for loop0 : delphi::ifStmt[1] in ji_ifStmt {
	 *     call m_ifStmt_ast_else {
	 * lIfStmt iterates loop0 : delphi::ifStmt[1];
	 * }}
	 *   for loop0 : delphi::ifStmt[1] in ji_ifStmt {
	 *     call m_ifStmt_ast_then {
	 * lIfStmt iterates loop0 : delphi::ifStmt[1];
	 * }}
	 *   for loop0 : delphi::implementationSection[1] in ji_implementationSection {
	 *     call m_implementationSection_ast_declSect {
	 * lImplementationSection iterates loop0 : delphi::implementationSection[1];
	 * }}
	 *   for loop0 : delphi::interfaceSection[1] in ji_interfaceSection {
	 *     call m_interfaceSection_ast_interfaceDecl {
	 * lInterfaceSection iterates loop0 : delphi::interfaceSection[1];
	 * }}
	 *   for loop0 : delphi::mainRule[1] in ji_mainRule {
	 *     call m_mainRule_ast_file {
	 * lMainRule iterates loop0 : delphi::mainRule[1];
	 * }}
	 *   for loop0 : delphi::procedureDecl[1] in ji_procedureDecl {
	 *     call m_procedureDecl_ast_block {
	 * lProcedureDecl iterates loop0 : delphi::procedureDecl[1];
	 * }}
	 *   for loop0 : delphi::procedureDecl[1] in ji_procedureDecl {
	 *     call m_procedureDecl_ast_heading {
	 * lProcedureDecl iterates loop0 : delphi::procedureDecl[1];
	 * }}
	 *   for loop0 : delphi::designator[1] in ji_designator {
	 *     call m_designator_ast {
	 * lDesignator iterates loop0 : delphi::designator[1];
	 * }}
	 *   for loop0 : delphi::designator[1] in ji_designator {
	 *     call m_designator_ast_1 {
	 * lDesignator iterates loop0 : delphi::designator[1];
	 * }}
	 *   for loop0 : delphi::ident[1] in ji_ident {
	 *     call m_ident_ast_oclContainer {
	 * lIdent iterates loop0 : delphi::ident[1];
	 * }}
	 *   for loop0 : delphi::relExp[1] in ji_relExp {
	 *     call m_relExp_ast_left {
	 * lRelExp iterates loop0 : delphi::relExp[1];
	 * }}
	 *   for loop0 : delphi::relExp[1] in ji_relExp {
	 *     call m_relExp_ast_relOp {
	 * lRelExp iterates loop0 : delphi::relExp[1];
	 * }}
	 *   for loop0 : delphi::relExp[1] in ji_relExp {
	 *     call m_relExp_ast_right {
	 * lRelExp iterates loop0 : delphi::relExp[1];
	 * }}
	 *   for loop0 : delphi::statement[1] in ji_statement {
	 *     call m_statement_ast_statement {
	 * lStatement iterates loop0 : delphi::statement[1];
	 * }}
	 *   for loop0 : delphi::tryStmt[1] in ji_tryStmt {
	 *     call m_tryStmt_ast_final {
	 * lTryStmt iterates loop0 : delphi::tryStmt[1];
	 * }}
	 *   for loop0 : delphi::tryStmt[1] in ji_tryStmt {
	 *     call m_tryStmt_ast_stmtList {
	 * lTryStmt iterates loop0 : delphi::tryStmt[1];
	 * }}
	 *   for loop0 : delphi::typeDecl[1] in ji_typeDecl {
	 *     call m_typeDecl_ast_id {
	 * lTypeDecl iterates loop0 : delphi::typeDecl[1];
	 * }}
	 *   for loop0 : delphi::type[1] in ji_type {
	 *     call m_type_ast0 {
	 * lType iterates loop0 : delphi::type[1];
	 * }}
	 *   for loop0 : delphi::unit[1] in ji_unit {
	 *     call m_unit_ast_implementationSect {
	 * lUnit iterates loop0 : delphi::unit[1];
	 * }}
	 *   for loop0 : delphi::unit[1] in ji_unit {
	 *     call m_unit_ast_interfaceSect {
	 * lUnit iterates loop0 : delphi::unit[1];
	 * }}
	 *   for loop0 : delphi::unit[1] in ji_unit {
	 *     call m_unit_ast_id {
	 * lUnit iterates loop0 : delphi::unit[1];
	 * }}
	 *   for loop0 : delphi::unlabelledStatement[1] in ji_unlabelledStatement {
	 *     call m_unlabelledStatement_ast0 {
	 * lUnlabelledStatement iterates loop0 : delphi::unlabelledStatement[1];
	 * }}
	 *   for loop0 : delphi::varDecl[1] in ji_varDecl {
	 *     call m_varDecl_ast_type {
	 * lVarDecl iterates loop0 : delphi::varDecl[1];
	 * }}
	 *   for loop0 : delphi::varDecl[1] in ji_varDecl {
	 *     call m_varDecl_ast_idList {
	 * lVarDecl iterates loop0 : delphi::varDecl[1];
	 * }}
	 *   for loop0 : delphi::withStmt[1] in ji_withStmt {
	 *     call m_withStmt_ast_stmt {
	 * lWithStmt iterates loop0 : delphi::withStmt[1];
	 * }}
	 *   for loop0 : delphi::withStmt[1] in ji_withStmt {
	 *     call m_withStmt_ast_vars {
	 * lWithStmt iterates loop0 : delphi::withStmt[1];
	 * }}
	 */
	protected boolean MAP___root__()  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_CSTrace_1 = idResolver.getClass(CLSSid_CSTrace, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_CSTrace, models[0/*leftCS*/], TYP_delphi_c_c_CSTrace_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_ConstExp_0 = idResolver.getClass(CLSSid_ConstExp, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_0 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_ConstExp, models[0/*leftCS*/], TYP_delphi_c_c_ConstExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_MultipleConstExp_0 = idResolver.getClass(CLSSid_MultipleConstExp, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_1 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_MultipleConstExp, models[0/*leftCS*/], TYP_delphi_c_c_MultipleConstExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_RecordConstExp_0 = idResolver.getClass(CLSSid_RecordConstExp, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_2 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_RecordConstExp, models[0/*leftCS*/], TYP_delphi_c_c_RecordConstExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_assignmentStmnt_0 = idResolver.getClass(CLSSid_assignmentStmnt, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_3 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_assignmentStmnt, models[0/*leftCS*/], TYP_delphi_c_c_assignmentStmnt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_block_0 = idResolver.getClass(CLSSid_block, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_4 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_block, models[0/*leftCS*/], TYP_delphi_c_c_block_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_callStmnt_0 = idResolver.getClass(CLSSid_callStmnt, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_5 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_callStmnt, models[0/*leftCS*/], TYP_delphi_c_c_callStmnt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_caseSelector_0 = idResolver.getClass(CLSSid_caseSelector, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_6 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_caseSelector, models[0/*leftCS*/], TYP_delphi_c_c_caseSelector_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_caseStmt_0 = idResolver.getClass(CLSSid_caseStmt, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_7 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_caseStmt, models[0/*leftCS*/], TYP_delphi_c_c_caseStmt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_constExpr_1 = idResolver.getClass(CLSSid_constExpr, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_8 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_constExpr, models[0/*leftCS*/], TYP_delphi_c_c_constExpr_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_constantDecl_0 = idResolver.getClass(CLSSid_constantDecl, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_9 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_constantDecl, models[0/*leftCS*/], TYP_delphi_c_c_constantDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_designator_0 = idResolver.getClass(CLSSid_designator, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_10 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_designator, models[0/*leftCS*/], TYP_delphi_c_c_designator_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_expression_1 = idResolver.getClass(CLSSid_expression, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_11 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_expression, models[0/*leftCS*/], TYP_delphi_c_c_expression_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_12 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_factor, models[0/*leftCS*/], TYP_delphi_c_c_factor_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_file_1 = idResolver.getClass(CLSSid_file, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_13 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_file, models[0/*leftCS*/], TYP_delphi_c_c_file_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_functionDecl_0 = idResolver.getClass(CLSSid_functionDecl, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_14 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_functionDecl, models[0/*leftCS*/], TYP_delphi_c_c_functionDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_ident_1 = idResolver.getClass(CLSSid_ident, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_15 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_ident, models[0/*leftCS*/], TYP_delphi_c_c_ident_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_ifStmt_0 = idResolver.getClass(CLSSid_ifStmt, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_16 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_ifStmt, models[0/*leftCS*/], TYP_delphi_c_c_ifStmt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_implementationSection_0 = idResolver.getClass(CLSSid_implementationSection, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_17 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_implementationSection, models[0/*leftCS*/], TYP_delphi_c_c_implementationSection_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_interfaceSection_0 = idResolver.getClass(CLSSid_interfaceSection, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_18 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_interfaceSection, models[0/*leftCS*/], TYP_delphi_c_c_interfaceSection_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_labelDeclSection_0 = idResolver.getClass(CLSSid_labelDeclSection, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_19 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_labelDeclSection, models[0/*leftCS*/], TYP_delphi_c_c_labelDeclSection_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_mainRule_0 = idResolver.getClass(CLSSid_mainRule, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_20 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_mainRule, models[0/*leftCS*/], TYP_delphi_c_c_mainRule_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_mulOp_0 = idResolver.getClass(CLSSid_mulOp, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_21 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_mulOp, models[0/*leftCS*/], TYP_delphi_c_c_mulOp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_procedureDecl_0 = idResolver.getClass(CLSSid_procedureDecl, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_22 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_procedureDecl, models[0/*leftCS*/], TYP_delphi_c_c_procedureDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_relExp_0 = idResolver.getClass(CLSSid_relExp, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_23 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_relExp, models[0/*leftCS*/], TYP_delphi_c_c_relExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_statement_0 = idResolver.getClass(CLSSid_statement, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_24 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_statement, models[0/*leftCS*/], TYP_delphi_c_c_statement_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_tryStmt_0 = idResolver.getClass(CLSSid_tryStmt, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_25 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_tryStmt, models[0/*leftCS*/], TYP_delphi_c_c_tryStmt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_type_1 = idResolver.getClass(CLSSid_type, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_26 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_type, models[0/*leftCS*/], TYP_delphi_c_c_type_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_typeDecl_0 = idResolver.getClass(CLSSid_typeDecl, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_27 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_typeDecl, models[0/*leftCS*/], TYP_delphi_c_c_typeDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_unit_0 = idResolver.getClass(CLSSid_unit, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_28 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_unit, models[0/*leftCS*/], TYP_delphi_c_c_unit_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_unlabelledStatement_1 = idResolver.getClass(CLSSid_unlabelledStatement, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_29 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_unlabelledStatement, models[0/*leftCS*/], TYP_delphi_c_c_unlabelledStatement_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_varDecl_0 = idResolver.getClass(CLSSid_varDecl, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_30 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_varDecl, models[0/*leftCS*/], TYP_delphi_c_c_varDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_withStmt_0 = idResolver.getClass(CLSSid_withStmt, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue objectsOfKind_31 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_withStmt, models[0/*leftCS*/], TYP_delphi_c_c_withStmt_0);
			// connection variables
			final SetValue.@NonNull Accumulator ji_CSTrace = createUnenforcedSetAccumulatorValue(SET_CLSSid_CSTrace);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull CSTrace iterator : ValueUtil.typedIterable(CSTrace.class, objectsOfKind)) {
				ji_CSTrace.add(iterator);
			}
			final SetValue.@NonNull Accumulator ji_ConstExp = createUnenforcedSetAccumulatorValue(SET_CLSSid_ConstExp);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ConstExp iterator_0 : ValueUtil.typedIterable(ConstExp.class, objectsOfKind_0)) {
				ji_ConstExp.add(iterator_0);
			}
			final SetValue.@NonNull Accumulator ji_MultipleConstExp = createUnenforcedSetAccumulatorValue(SET_CLSSid_MultipleConstExp);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MultipleConstExp iterator_1 : ValueUtil.typedIterable(MultipleConstExp.class, objectsOfKind_1)) {
				ji_MultipleConstExp.add(iterator_1);
			}
			final SetValue.@NonNull Accumulator ji_RecordConstExp = createUnenforcedSetAccumulatorValue(SET_CLSSid_RecordConstExp);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull RecordConstExp iterator_2 : ValueUtil.typedIterable(RecordConstExp.class, objectsOfKind_2)) {
				ji_RecordConstExp.add(iterator_2);
			}
			final SetValue.@NonNull Accumulator ji_assignmentStmnt = createUnenforcedSetAccumulatorValue(SET_CLSSid_assignmentStmnt);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull assignmentStmnt iterator_3 : ValueUtil.typedIterable(assignmentStmnt.class, objectsOfKind_3)) {
				ji_assignmentStmnt.add(iterator_3);
			}
			final SetValue.@NonNull Accumulator ji_block = createUnenforcedSetAccumulatorValue(SET_CLSSid_block);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull block iterator_4 : ValueUtil.typedIterable(block.class, objectsOfKind_4)) {
				ji_block.add(iterator_4);
			}
			final SetValue.@NonNull Accumulator ji_callStmnt = createUnenforcedSetAccumulatorValue(SET_CLSSid_callStmnt);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull callStmnt iterator_5 : ValueUtil.typedIterable(callStmnt.class, objectsOfKind_5)) {
				ji_callStmnt.add(iterator_5);
			}
			final SetValue.@NonNull Accumulator ji_caseSelector = createUnenforcedSetAccumulatorValue(SET_CLSSid_caseSelector);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector iterator_6 : ValueUtil.typedIterable(caseSelector.class, objectsOfKind_6)) {
				ji_caseSelector.add(iterator_6);
			}
			final SetValue.@NonNull Accumulator ji_caseStmt = createUnenforcedSetAccumulatorValue(SET_CLSSid_caseStmt);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseStmt iterator_7 : ValueUtil.typedIterable(caseStmt.class, objectsOfKind_7)) {
				ji_caseStmt.add(iterator_7);
			}
			final SetValue.@NonNull Accumulator ji_constExpr = createUnenforcedSetAccumulatorValue(SET_CLSSid_constExpr);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constExpr iterator_8 : ValueUtil.typedIterable(constExpr.class, objectsOfKind_8)) {
				ji_constExpr.add(iterator_8);
			}
			final SetValue.@NonNull Accumulator ji_constantDecl = createUnenforcedSetAccumulatorValue(SET_CLSSid_constantDecl);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl iterator_9 : ValueUtil.typedIterable(constantDecl.class, objectsOfKind_9)) {
				ji_constantDecl.add(iterator_9);
			}
			final SetValue.@NonNull Accumulator ji_designator = createUnenforcedSetAccumulatorValue(SET_CLSSid_designator);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator iterator_10 : ValueUtil.typedIterable(designator.class, objectsOfKind_10)) {
				ji_designator.add(iterator_10);
			}
			final SetValue.@NonNull Accumulator ji_expression = createUnenforcedSetAccumulatorValue(SET_CLSSid_expression);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull expression iterator_11 : ValueUtil.typedIterable(expression.class, objectsOfKind_11)) {
				ji_expression.add(iterator_11);
			}
			final SetValue.@NonNull Accumulator ji_factor = createUnenforcedSetAccumulatorValue(SET_CLSSid_factor);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor iterator_12 : ValueUtil.typedIterable(factor.class, objectsOfKind_12)) {
				ji_factor.add(iterator_12);
			}
			final SetValue.@NonNull Accumulator ji_file = createUnenforcedSetAccumulatorValue(SET_CLSSid_file);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull file iterator_13 : ValueUtil.typedIterable(file.class, objectsOfKind_13)) {
				ji_file.add(iterator_13);
			}
			final SetValue.@NonNull Accumulator ji_functionDecl = createUnenforcedSetAccumulatorValue(SET_CLSSid_functionDecl);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl iterator_14 : ValueUtil.typedIterable(functionDecl.class, objectsOfKind_14)) {
				ji_functionDecl.add(iterator_14);
			}
			final SetValue.@NonNull Accumulator ji_ident = createUnenforcedSetAccumulatorValue(SET_CLSSid_ident);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident iterator_15 : ValueUtil.typedIterable(ident.class, objectsOfKind_15)) {
				ji_ident.add(iterator_15);
			}
			final SetValue.@NonNull Accumulator ji_ifStmt = createUnenforcedSetAccumulatorValue(SET_CLSSid_ifStmt);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt iterator_16 : ValueUtil.typedIterable(ifStmt.class, objectsOfKind_16)) {
				ji_ifStmt.add(iterator_16);
			}
			final SetValue.@NonNull Accumulator ji_implementationSection = createUnenforcedSetAccumulatorValue(SET_CLSSid_implementationSection);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull implementationSection iterator_17 : ValueUtil.typedIterable(implementationSection.class, objectsOfKind_17)) {
				ji_implementationSection.add(iterator_17);
			}
			final SetValue.@NonNull Accumulator ji_interfaceSection = createUnenforcedSetAccumulatorValue(SET_CLSSid_interfaceSection);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceSection iterator_18 : ValueUtil.typedIterable(interfaceSection.class, objectsOfKind_18)) {
				ji_interfaceSection.add(iterator_18);
			}
			final SetValue.@NonNull Accumulator ji_labelDeclSection = createUnenforcedSetAccumulatorValue(SET_CLSSid_labelDeclSection);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull labelDeclSection iterator_19 : ValueUtil.typedIterable(labelDeclSection.class, objectsOfKind_19)) {
				ji_labelDeclSection.add(iterator_19);
			}
			final SetValue.@NonNull Accumulator ji_mainRule = createUnenforcedSetAccumulatorValue(SET_CLSSid_mainRule);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mainRule iterator_20 : ValueUtil.typedIterable(mainRule.class, objectsOfKind_20)) {
				ji_mainRule.add(iterator_20);
			}
			final SetValue.@NonNull Accumulator ji_mulOp = createUnenforcedSetAccumulatorValue(SET_CLSSid_mulOp);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mulOp iterator_21 : ValueUtil.typedIterable(mulOp.class, objectsOfKind_21)) {
				ji_mulOp.add(iterator_21);
			}
			final SetValue.@NonNull Accumulator ji_procedureDecl = createUnenforcedSetAccumulatorValue(SET_CLSSid_procedureDecl);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDecl iterator_22 : ValueUtil.typedIterable(procedureDecl.class, objectsOfKind_22)) {
				ji_procedureDecl.add(iterator_22);
			}
			final SetValue.@NonNull Accumulator ji_relExp = createUnenforcedSetAccumulatorValue(SET_CLSSid_relExp);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp iterator_23 : ValueUtil.typedIterable(relExp.class, objectsOfKind_23)) {
				ji_relExp.add(iterator_23);
			}
			final SetValue.@NonNull Accumulator ji_statement = createUnenforcedSetAccumulatorValue(SET_CLSSid_statement);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull statement iterator_24 : ValueUtil.typedIterable(statement.class, objectsOfKind_24)) {
				ji_statement.add(iterator_24);
			}
			final SetValue.@NonNull Accumulator ji_tryStmt = createUnenforcedSetAccumulatorValue(SET_CLSSid_tryStmt);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull tryStmt iterator_25 : ValueUtil.typedIterable(tryStmt.class, objectsOfKind_25)) {
				ji_tryStmt.add(iterator_25);
			}
			final SetValue.@NonNull Accumulator ji_type = createUnenforcedSetAccumulatorValue(SET_CLSSid_type);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull type iterator_26 : ValueUtil.typedIterable(type.class, objectsOfKind_26)) {
				ji_type.add(iterator_26);
			}
			final SetValue.@NonNull Accumulator ji_typeDecl = createUnenforcedSetAccumulatorValue(SET_CLSSid_typeDecl);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull typeDecl iterator_27 : ValueUtil.typedIterable(typeDecl.class, objectsOfKind_27)) {
				ji_typeDecl.add(iterator_27);
			}
			final SetValue.@NonNull Accumulator ji_unit = createUnenforcedSetAccumulatorValue(SET_CLSSid_unit);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit iterator_28 : ValueUtil.typedIterable(unit.class, objectsOfKind_28)) {
				ji_unit.add(iterator_28);
			}
			final SetValue.@NonNull Accumulator ji_unlabelledStatement = createUnenforcedSetAccumulatorValue(SET_CLSSid_unlabelledStatement);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unlabelledStatement iterator_29 : ValueUtil.typedIterable(unlabelledStatement.class, objectsOfKind_29)) {
				ji_unlabelledStatement.add(iterator_29);
			}
			final SetValue.@NonNull Accumulator ji_varDecl = createUnenforcedSetAccumulatorValue(SET_CLSSid_varDecl);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull varDecl iterator_30 : ValueUtil.typedIterable(varDecl.class, objectsOfKind_30)) {
				ji_varDecl.add(iterator_30);
			}
			final SetValue.@NonNull Accumulator ji_withStmt = createUnenforcedSetAccumulatorValue(SET_CLSSid_withStmt);
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull withStmt iterator_31 : ValueUtil.typedIterable(withStmt.class, objectsOfKind_31)) {
				ji_withStmt.add(iterator_31);
			}
			// mapping statements
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull assignmentStmnt loop0 : ValueUtil.typedIterable(assignmentStmnt.class, ji_assignmentStmnt)) {
				MAP_m_ExpressionStatement_assignmentStmnt(loop0);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull block loop0_0 : ValueUtil.typedIterable(block.class, ji_block)) {
				MAP_m_DelphiBlockStatement_block(loop0_0);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull callStmnt loop0_1 : ValueUtil.typedIterable(callStmnt.class, ji_callStmnt)) {
				MAP_m_ExpressionStatement_callStmnt(loop0_1);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector loop0_2 : ValueUtil.typedIterable(caseSelector.class, ji_caseSelector)) {
				MAP_m_CaseBlock_caseSelector(loop0_2);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseStmt loop0_3 : ValueUtil.typedIterable(caseStmt.class, ji_caseStmt)) {
				MAP_m_SwitchStatement_caseStmt(loop0_3);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl loop0_4 : ValueUtil.typedIterable(constantDecl.class, ji_constantDecl)) {
				MAP_m_VariableDefinition_constantDecl(loop0_4);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator loop0_5 : ValueUtil.typedIterable(designator.class, ji_designator)) {
				MAP_m_IdentifierReference_designator_Boolean(loop0_5);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator loop0_6 : ValueUtil.typedIterable(designator.class, ji_designator)) {
				MAP_m_QualifiedOverData_designator_Boolean_Boolean(loop0_6);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor loop0_7 : ValueUtil.typedIterable(factor.class, ji_factor)) {
				MAP_m_DelphiFunctionCallExpression_factor_Boolean_Bool(loop0_7);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor loop0_8 : ValueUtil.typedIterable(factor.class, ji_factor)) {
				MAP_m_IntegerLiteral_factor_Boolean(loop0_8);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor loop0_9 : ValueUtil.typedIterable(factor.class, ji_factor)) {
				MAP_m_StringLiteral_factor_Boolean_Boolean(loop0_9);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl loop0_10 : ValueUtil.typedIterable(functionDecl.class, ji_functionDecl)) {
				MAP_m_FunctionDefinition_functionDecl(loop0_10);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt loop0_11 : ValueUtil.typedIterable(ifStmt.class, ji_ifStmt)) {
				MAP_m_IfStatement_ifStmt(loop0_11);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull implementationSection loop0_12 : ValueUtil.typedIterable(implementationSection.class, ji_implementationSection)) {
				MAP_m_DelphiImplementationSection_implementationSectio(loop0_12);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceSection loop0_13 : ValueUtil.typedIterable(interfaceSection.class, ji_interfaceSection)) {
				MAP_m_DelphiInterfaceSection_interfaceSection(loop0_13);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull labelDeclSection loop0_14 : ValueUtil.typedIterable(labelDeclSection.class, ji_labelDeclSection)) {
				MAP_m_LabelDefinition_labelDeclSection(loop0_14);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mainRule loop0_15 : ValueUtil.typedIterable(mainRule.class, ji_mainRule)) {
				MAP_m_Project_mainRule(loop0_15);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mulOp loop0_16 : ValueUtil.typedIterable(mulOp.class, ji_mulOp)) {
				MAP_m_BinaryExpression_mulOp(loop0_16);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDecl loop0_17 : ValueUtil.typedIterable(procedureDecl.class, ji_procedureDecl)) {
				MAP_m_FunctionDefinition_procedureDecl(loop0_17);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp loop0_18 : ValueUtil.typedIterable(relExp.class, ji_relExp)) {
				MAP_m_BinaryExpression_relExp(loop0_18);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull tryStmt loop0_19 : ValueUtil.typedIterable(tryStmt.class, ji_tryStmt)) {
				MAP_m_TryStatement_tryStmt(loop0_19);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull typeDecl loop0_20 : ValueUtil.typedIterable(typeDecl.class, ji_typeDecl)) {
				MAP_m_TypeDefinition_typeDecl(loop0_20);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit loop0_21 : ValueUtil.typedIterable(unit.class, ji_unit)) {
				MAP_m_DelphiUnit_unit(loop0_21);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull varDecl loop0_22 : ValueUtil.typedIterable(varDecl.class, ji_varDecl)) {
				MAP_m_VariableDefinition_varDecl(loop0_22);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull withStmt loop0_23 : ValueUtil.typedIterable(withStmt.class, ji_withStmt)) {
				MAP_m_DelphiWithStatement_withStmt(loop0_23);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull CSTrace loop0_24 : ValueUtil.typedIterable(CSTrace.class, ji_CSTrace)) {
				MAP_m_CSTrace_ast0(loop0_24);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ConstExp loop0_25 : ValueUtil.typedIterable(ConstExp.class, ji_ConstExp)) {
				MAP_m_ConstExp_ast_exp(loop0_25);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MultipleConstExp loop0_26 : ValueUtil.typedIterable(MultipleConstExp.class, ji_MultipleConstExp)) {
				MAP_m_MultipleConstExp_ast_exps(loop0_26);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull RecordConstExp loop0_27 : ValueUtil.typedIterable(RecordConstExp.class, ji_RecordConstExp)) {
				MAP_m_RecordConstExp_ast_exps(loop0_27);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull assignmentStmnt loop0_28 : ValueUtil.typedIterable(assignmentStmnt.class, ji_assignmentStmnt)) {
				MAP_m_assignmentStmnt_ast_designator_exp(loop0_28);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull block loop0_29 : ValueUtil.typedIterable(block.class, ji_block)) {
				MAP_m_block_ast_declSect(loop0_29);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull block loop0_30 : ValueUtil.typedIterable(block.class, ji_block)) {
				MAP_m_block_ast_compound(loop0_30);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull callStmnt loop0_31 : ValueUtil.typedIterable(callStmnt.class, ji_callStmnt)) {
				MAP_m_callStmnt_args_ast_designator(loop0_31);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector loop0_32 : ValueUtil.typedIterable(caseSelector.class, ji_caseSelector)) {
				MAP_m_caseSelector_ast_stmt(loop0_32);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector loop0_33 : ValueUtil.typedIterable(caseSelector.class, ji_caseSelector)) {
				MAP_m_caseSelector_ast_labels(loop0_33);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseStmt loop0_34 : ValueUtil.typedIterable(caseStmt.class, ji_caseStmt)) {
				MAP_m_caseStmt_ast_cases(loop0_34);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseStmt loop0_35 : ValueUtil.typedIterable(caseStmt.class, ji_caseStmt)) {
				MAP_m_caseStmt_ast_expression(loop0_35);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constExpr loop0_36 : ValueUtil.typedIterable(constExpr.class, ji_constExpr)) {
				MAP_m_constExpr_ast0(loop0_36);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl loop0_37 : ValueUtil.typedIterable(constantDecl.class, ji_constantDecl)) {
				MAP_m_constantDecl_ast_id(loop0_37);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl loop0_38 : ValueUtil.typedIterable(constantDecl.class, ji_constantDecl)) {
				MAP_m_constantDecl_ast_const(loop0_38);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator loop0_39 : ValueUtil.typedIterable(designator.class, ji_designator)) {
				MAP_m_designator_ast_subpart(loop0_39);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator loop0_40 : ValueUtil.typedIterable(designator.class, ji_designator)) {
				MAP_m_designator_ast_subpart_1(loop0_40);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull expression loop0_41 : ValueUtil.typedIterable(expression.class, ji_expression)) {
				MAP_m_expression_ast0(loop0_41);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor loop0_42 : ValueUtil.typedIterable(factor.class, ji_factor)) {
				MAP_m_factor_ast_expList(loop0_42);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor loop0_43 : ValueUtil.typedIterable(factor.class, ji_factor)) {
				MAP_m_factor_ast_designator(loop0_43);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor loop0_44 : ValueUtil.typedIterable(factor.class, ji_factor)) {
				MAP_m_factor_ast_number(loop0_44);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor loop0_45 : ValueUtil.typedIterable(factor.class, ji_factor)) {
				MAP_m_factor_ast_string(loop0_45);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull file loop0_46 : ValueUtil.typedIterable(file.class, ji_file)) {
				MAP_m_file_ast0(loop0_46);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl loop0_47 : ValueUtil.typedIterable(functionDecl.class, ji_functionDecl)) {
				MAP_m_functionDecl_ast_block(loop0_47);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl loop0_48 : ValueUtil.typedIterable(functionDecl.class, ji_functionDecl)) {
				MAP_m_functionDecl_ast_heading(loop0_48);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt loop0_49 : ValueUtil.typedIterable(ifStmt.class, ji_ifStmt)) {
				MAP_m_ifStmt_ast_condition(loop0_49);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt loop0_50 : ValueUtil.typedIterable(ifStmt.class, ji_ifStmt)) {
				MAP_m_ifStmt_ast_else(loop0_50);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt loop0_51 : ValueUtil.typedIterable(ifStmt.class, ji_ifStmt)) {
				MAP_m_ifStmt_ast_then(loop0_51);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull implementationSection loop0_52 : ValueUtil.typedIterable(implementationSection.class, ji_implementationSection)) {
				MAP_m_implementationSection_ast_declSect(loop0_52);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceSection loop0_53 : ValueUtil.typedIterable(interfaceSection.class, ji_interfaceSection)) {
				MAP_m_interfaceSection_ast_interfaceDecl(loop0_53);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mainRule loop0_54 : ValueUtil.typedIterable(mainRule.class, ji_mainRule)) {
				MAP_m_mainRule_ast_file(loop0_54);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDecl loop0_55 : ValueUtil.typedIterable(procedureDecl.class, ji_procedureDecl)) {
				MAP_m_procedureDecl_ast_block(loop0_55);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDecl loop0_56 : ValueUtil.typedIterable(procedureDecl.class, ji_procedureDecl)) {
				MAP_m_procedureDecl_ast_heading(loop0_56);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator loop0_57 : ValueUtil.typedIterable(designator.class, ji_designator)) {
				MAP_m_designator_ast(loop0_57);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator loop0_58 : ValueUtil.typedIterable(designator.class, ji_designator)) {
				MAP_m_designator_ast_1(loop0_58);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident loop0_59 : ValueUtil.typedIterable(ident.class, ji_ident)) {
				MAP_m_ident_ast_oclContainer(loop0_59);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp loop0_60 : ValueUtil.typedIterable(relExp.class, ji_relExp)) {
				MAP_m_relExp_ast_left(loop0_60);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp loop0_61 : ValueUtil.typedIterable(relExp.class, ji_relExp)) {
				MAP_m_relExp_ast_relOp(loop0_61);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp loop0_62 : ValueUtil.typedIterable(relExp.class, ji_relExp)) {
				MAP_m_relExp_ast_right(loop0_62);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull statement loop0_63 : ValueUtil.typedIterable(statement.class, ji_statement)) {
				MAP_m_statement_ast_statement(loop0_63);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull tryStmt loop0_64 : ValueUtil.typedIterable(tryStmt.class, ji_tryStmt)) {
				MAP_m_tryStmt_ast_final(loop0_64);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull tryStmt loop0_65 : ValueUtil.typedIterable(tryStmt.class, ji_tryStmt)) {
				MAP_m_tryStmt_ast_stmtList(loop0_65);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull typeDecl loop0_66 : ValueUtil.typedIterable(typeDecl.class, ji_typeDecl)) {
				MAP_m_typeDecl_ast_id(loop0_66);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull type loop0_67 : ValueUtil.typedIterable(type.class, ji_type)) {
				MAP_m_type_ast0(loop0_67);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit loop0_68 : ValueUtil.typedIterable(unit.class, ji_unit)) {
				MAP_m_unit_ast_implementationSect(loop0_68);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit loop0_69 : ValueUtil.typedIterable(unit.class, ji_unit)) {
				MAP_m_unit_ast_interfaceSect(loop0_69);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit loop0_70 : ValueUtil.typedIterable(unit.class, ji_unit)) {
				MAP_m_unit_ast_id(loop0_70);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unlabelledStatement loop0_71 : ValueUtil.typedIterable(unlabelledStatement.class, ji_unlabelledStatement)) {
				MAP_m_unlabelledStatement_ast0(loop0_71);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull varDecl loop0_72 : ValueUtil.typedIterable(varDecl.class, ji_varDecl)) {
				MAP_m_varDecl_ast_type(loop0_72);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull varDecl loop0_73 : ValueUtil.typedIterable(varDecl.class, ji_varDecl)) {
				MAP_m_varDecl_ast_idList(loop0_73);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull withStmt loop0_74 : ValueUtil.typedIterable(withStmt.class, ji_withStmt)) {
				MAP_m_withStmt_ast_stmt(loop0_74);
			}
			for (org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull withStmt loop0_75 : ValueUtil.typedIterable(withStmt.class, ji_withStmt)) {
				MAP_m_withStmt_ast_vars(loop0_75);
			}
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean __root__ = ValueUtil.TRUE_VALUE;
			return __root__;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP___root__", e);
		}
	}
	
	/**
	 * 
	 * map m_BinaryExpression_mulOp in Delphi_qvtp_qvtcas {
	 * guard:leftCS lMulOp  : delphi::mulOp[1];
	 * new:rightAS rBinaryExpression : astm::BinaryExpression[1];
	 * set lMulOp.ast := rBinaryExpression;
	 * 
	 */
	protected boolean MAP_m_BinaryExpression_mulOp(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mulOp lMulOp)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable BinaryExpression rBinaryExpression = AstmFactory.eINSTANCE.createBinaryExpression();
			assert rBinaryExpression != null;
			models[1/*rightAS*/].add(rBinaryExpression);
			// mapping statements
			lMulOp.setAst(rBinaryExpression);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_BinaryExpression_mulOp = ValueUtil.TRUE_VALUE;
			return m_BinaryExpression_mulOp;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_BinaryExpression_mulOp", e);
		}
	}
	
	/**
	 * 
	 * map m_BinaryExpression_relExp in Delphi_qvtp_qvtcas {
	 * guard:leftCS lRelExp  : delphi::relExp[1];
	 * new:rightAS rBinaryExpression : astm::BinaryExpression[1];
	 * set lRelExp.ast := rBinaryExpression;
	 * 
	 */
	protected boolean MAP_m_BinaryExpression_relExp(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp lRelExp)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable BinaryExpression rBinaryExpression = AstmFactory.eINSTANCE.createBinaryExpression();
			assert rBinaryExpression != null;
			models[1/*rightAS*/].add(rBinaryExpression);
			// mapping statements
			lRelExp.setAst(rBinaryExpression);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_BinaryExpression_relExp = ValueUtil.TRUE_VALUE;
			return m_BinaryExpression_relExp;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_BinaryExpression_relExp", e);
		}
	}
	
	/**
	 * 
	 * map m_CSTrace_ast0 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lCSTrace  : delphi::CSTrace[1];
	 * check lCSTrace.oclIsTypeOf(delphi::CSTrace);
	 * set lCSTrace.ast := null;
	 * 
	 */
	protected boolean MAP_m_CSTrace_ast0(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull CSTrace lCSTrace)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_CSTrace_0_0 = idResolver.getClass(CLSSid_CSTrace, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lCSTrace, TYP_delphi_c_c_CSTrace_0_0).booleanValue();
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lCSTrace.setAst(null);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_CSTrace_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_CSTrace_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_CSTrace_ast0", e);
		}
	}
	
	/**
	 * 
	 * map m_CaseBlock_caseSelector in Delphi_qvtp_qvtcas {
	 * guard:leftCS lCaseSelector  : delphi::caseSelector[1];
	 * new:rightAS rCaseBlock : astm::CaseBlock[1];
	 * set lCaseSelector.ast := rCaseBlock;
	 * 
	 */
	protected boolean MAP_m_CaseBlock_caseSelector(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector lCaseSelector)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable CaseBlock rCaseBlock = AstmFactory.eINSTANCE.createCaseBlock();
			assert rCaseBlock != null;
			models[1/*rightAS*/].add(rCaseBlock);
			// mapping statements
			lCaseSelector.setAst(rCaseBlock);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_CaseBlock_caseSelector = ValueUtil.TRUE_VALUE;
			return m_CaseBlock_caseSelector;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_CaseBlock_caseSelector", e);
		}
	}
	
	/**
	 * 
	 * map m_ConstExp_ast_exp in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lConstExp  : delphi::ConstExp[1];
	 * var exp : delphi::expression[?] := lConstExp.exp;
	 * var ast : astm::Visitable[?] := exp.ast;
	 * var aExpression : astm::Expression[1] := ast.oclAsType(astm::Expression);
	 * set lConstExp.ast := aExpression;
	 * 
	 */
	protected boolean MAP_m_ConstExp_ast_exp(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ConstExp lConstExp)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable expression exp = lConstExp.getExp();
			if (exp == null) {
				throw throwNull(lConstExp, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
			}
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = exp.getAst();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
			// mapping statements
			lConstExp.setAst(oclAsType);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_ConstExp_ast_exp = ValueUtil.TRUE_VALUE;
			return m_ConstExp_ast_exp;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ConstExp_ast_exp", e);
		}
	}
	
	/**
	 * 
	 * map m_DelphiBlockStatement_block in Delphi_qvtp_qvtcas {
	 * guard:leftCS lBlock  : delphi::block[1];
	 * new:rightAS rDelphiBlockStatement : astm::DelphiBlockStatement[1];
	 * set lBlock.ast := rDelphiBlockStatement;
	 * 
	 */
	protected boolean MAP_m_DelphiBlockStatement_block(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull block lBlock)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable DelphiBlockStatement rDelphiBlockStatement = AstmFactory.eINSTANCE.createDelphiBlockStatement();
			assert rDelphiBlockStatement != null;
			models[1/*rightAS*/].add(rDelphiBlockStatement);
			// mapping statements
			lBlock.setAst(rDelphiBlockStatement);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_DelphiBlockStatement_block = ValueUtil.TRUE_VALUE;
			return m_DelphiBlockStatement_block;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiBlockStatement_block", e);
		}
	}
	
	/**
	 * 
	 * map m_DelphiFunctionCallExpression_factor_Boolean_Bool in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check lFactor.isAFunctionCall()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check not lFactor.isAString();
	 * new:rightAS rDelphiFunctionCallExpression : astm::DelphiFunctionCallExpression[1];
	 * set lFactor.ast := rDelphiFunctionCallExpression;
	 * 
	 */
	protected boolean MAP_m_DelphiFunctionCallExpression_factor_Boolean_Bool(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor lFactor)  {
		try {
			final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable exprList expList = lFactor.getExpList();
			final /*@Thrown*/ boolean ne = expList != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_4;
			if (ne) {
				/*@Caught*/ @NonNull Object CAUGHT_ne_0;
				try {
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number = lFactor.getNumber();
					final /*@Thrown*/ boolean ne_0 = number != null;
					CAUGHT_ne_0 = ne_0;
				}
				catch (Exception e) {
					CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
				if (not == null) {
					throw throwNull(lFactor, "Null if condition");
				}
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
				if (not) {
					/*@Caught*/ @NonNull Object CAUGHT_ne_1;
					try {
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String string = lFactor.getString();
						final /*@Thrown*/ boolean ne_1 = string != null;
						CAUGHT_ne_1 = ne_1;
					}
					catch (Exception e) {
						CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
					if (not_0 == null) {
						throw throwNull(lFactor, "Null if condition");
					}
					/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
					if (not_0) {
						// creations
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable DelphiFunctionCallExpression rDelphiFunctionCallExpression = AstmFactory.eINSTANCE.createDelphiFunctionCallExpression();
						assert rDelphiFunctionCallExpression != null;
						models[1/*rightAS*/].add(rDelphiFunctionCallExpression);
						// mapping statements
						lFactor.setAst(rDelphiFunctionCallExpression);
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_DelphiFunctionCallExpression_factor_Boolean_Bool = ValueUtil.TRUE_VALUE;
						symbol_2 = m_DelphiFunctionCallExpression_factor_Boolean_Bool;
					}
					else {
						symbol_2 = ValueUtil.FALSE_VALUE;
					}
					symbol_3 = symbol_2;
				}
				else {
					symbol_3 = ValueUtil.FALSE_VALUE;
				}
				symbol_4 = symbol_3;
			}
			else {
				symbol_4 = ValueUtil.FALSE_VALUE;
			}
			return symbol_4;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiFunctionCallExpression_factor_Boolean_Bool", e);
		}
	}
	
	/**
	 * 
	 * map m_DelphiImplementationSection_implementationSectio in Delphi_qvtp_qvtcas {
	 * guard:leftCS lImplementationSection  : delphi::implementationSection[1];
	 * new:rightAS rDelphiImplementationSection : astm::DelphiImplementationSection[1];
	 * set lImplementationSection.ast := rDelphiImplementationSection;
	 * 
	 */
	protected boolean MAP_m_DelphiImplementationSection_implementationSectio(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull implementationSection lImplementationSection)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable DelphiImplementationSection rDelphiImplementationSection = AstmFactory.eINSTANCE.createDelphiImplementationSection();
			assert rDelphiImplementationSection != null;
			models[1/*rightAS*/].add(rDelphiImplementationSection);
			// mapping statements
			lImplementationSection.setAst(rDelphiImplementationSection);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_DelphiImplementationSection_implementationSectio = ValueUtil.TRUE_VALUE;
			return m_DelphiImplementationSection_implementationSectio;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiImplementationSection_implementationSectio", e);
		}
	}
	
	/**
	 * 
	 * map m_DelphiInterfaceSection_interfaceSection in Delphi_qvtp_qvtcas {
	 * guard:leftCS lInterfaceSection  : delphi::interfaceSection[1];
	 * new:rightAS rDelphiInterfaceSection : astm::DelphiInterfaceSection[1];
	 * set lInterfaceSection.ast := rDelphiInterfaceSection;
	 * 
	 */
	protected boolean MAP_m_DelphiInterfaceSection_interfaceSection(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceSection lInterfaceSection)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable DelphiInterfaceSection rDelphiInterfaceSection = AstmFactory.eINSTANCE.createDelphiInterfaceSection();
			assert rDelphiInterfaceSection != null;
			models[1/*rightAS*/].add(rDelphiInterfaceSection);
			// mapping statements
			lInterfaceSection.setAst(rDelphiInterfaceSection);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_DelphiInterfaceSection_interfaceSection = ValueUtil.TRUE_VALUE;
			return m_DelphiInterfaceSection_interfaceSection;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiInterfaceSection_interfaceSection", e);
		}
	}
	
	/**
	 * 
	 * map m_DelphiUnit_unit in Delphi_qvtp_qvtcas {
	 * guard:leftCS lUnit  : delphi::unit[1];
	 * new:rightAS rDelphiUnit : astm::DelphiUnit[1];
	 * set lUnit.ast := rDelphiUnit;
	 * 
	 */
	protected boolean MAP_m_DelphiUnit_unit(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit lUnit)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable DelphiUnit rDelphiUnit = AstmFactory.eINSTANCE.createDelphiUnit();
			assert rDelphiUnit != null;
			models[1/*rightAS*/].add(rDelphiUnit);
			// mapping statements
			lUnit.setAst(rDelphiUnit);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_DelphiUnit_unit = ValueUtil.TRUE_VALUE;
			return m_DelphiUnit_unit;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiUnit_unit", e);
		}
	}
	
	/**
	 * 
	 * map m_DelphiWithStatement_withStmt in Delphi_qvtp_qvtcas {
	 * guard:leftCS lWithStmt  : delphi::withStmt[1];
	 * new:rightAS rDelphiWithStatement : astm::DelphiWithStatement[1];
	 * set lWithStmt.ast := rDelphiWithStatement;
	 * 
	 */
	protected boolean MAP_m_DelphiWithStatement_withStmt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull withStmt lWithStmt)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable DelphiWithStatement rDelphiWithStatement = AstmFactory.eINSTANCE.createDelphiWithStatement();
			assert rDelphiWithStatement != null;
			models[1/*rightAS*/].add(rDelphiWithStatement);
			// mapping statements
			lWithStmt.setAst(rDelphiWithStatement);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_DelphiWithStatement_withStmt = ValueUtil.TRUE_VALUE;
			return m_DelphiWithStatement_withStmt;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiWithStatement_withStmt", e);
		}
	}
	
	/**
	 * 
	 * map m_ExpressionStatement_assignmentStmnt in Delphi_qvtp_qvtcas {
	 * guard:leftCS lAssignmentStmnt  : delphi::assignmentStmnt[1];
	 * new:rightAS rExpressionStatement : astm::ExpressionStatement[1];
	 * set lAssignmentStmnt.ast := rExpressionStatement;
	 * 
	 */
	protected boolean MAP_m_ExpressionStatement_assignmentStmnt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull assignmentStmnt lAssignmentStmnt)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable ExpressionStatement rExpressionStatement = AstmFactory.eINSTANCE.createExpressionStatement();
			assert rExpressionStatement != null;
			models[1/*rightAS*/].add(rExpressionStatement);
			// mapping statements
			lAssignmentStmnt.setAst(rExpressionStatement);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_ExpressionStatement_assignmentStmnt = ValueUtil.TRUE_VALUE;
			return m_ExpressionStatement_assignmentStmnt;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ExpressionStatement_assignmentStmnt", e);
		}
	}
	
	/**
	 * 
	 * map m_ExpressionStatement_callStmnt in Delphi_qvtp_qvtcas {
	 * guard:leftCS lCallStmnt  : delphi::callStmnt[1];
	 * new:rightAS rExpressionStatement : astm::ExpressionStatement[1];
	 * set lCallStmnt.ast := rExpressionStatement;
	 * 
	 */
	protected boolean MAP_m_ExpressionStatement_callStmnt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull callStmnt lCallStmnt)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable ExpressionStatement rExpressionStatement = AstmFactory.eINSTANCE.createExpressionStatement();
			assert rExpressionStatement != null;
			models[1/*rightAS*/].add(rExpressionStatement);
			// mapping statements
			lCallStmnt.setAst(rExpressionStatement);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_ExpressionStatement_callStmnt = ValueUtil.TRUE_VALUE;
			return m_ExpressionStatement_callStmnt;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ExpressionStatement_callStmnt", e);
		}
	}
	
	/**
	 * 
	 * map m_FunctionDefinition_functionDecl in Delphi_qvtp_qvtcas {
	 * guard:leftCS lFunctionDecl  : delphi::functionDecl[1];
	 * new:rightAS rFunctionDefinition : astm::FunctionDefinition[1];
	 * set lFunctionDecl.ast := rFunctionDefinition;
	 * 
	 */
	protected boolean MAP_m_FunctionDefinition_functionDecl(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl lFunctionDecl)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition rFunctionDefinition = AstmFactory.eINSTANCE.createFunctionDefinition();
			assert rFunctionDefinition != null;
			models[1/*rightAS*/].add(rFunctionDefinition);
			// mapping statements
			lFunctionDecl.setAst(rFunctionDefinition);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_FunctionDefinition_functionDecl = ValueUtil.TRUE_VALUE;
			return m_FunctionDefinition_functionDecl;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_FunctionDefinition_functionDecl", e);
		}
	}
	
	/**
	 * 
	 * map m_FunctionDefinition_procedureDecl in Delphi_qvtp_qvtcas {
	 * guard:leftCS lProcedureDecl  : delphi::procedureDecl[1];
	 * new:rightAS rFunctionDefinition : astm::FunctionDefinition[1];
	 * set lProcedureDecl.ast := rFunctionDefinition;
	 * 
	 */
	protected boolean MAP_m_FunctionDefinition_procedureDecl(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDecl lProcedureDecl)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition rFunctionDefinition = AstmFactory.eINSTANCE.createFunctionDefinition();
			assert rFunctionDefinition != null;
			models[1/*rightAS*/].add(rFunctionDefinition);
			// mapping statements
			lProcedureDecl.setAst(rFunctionDefinition);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_FunctionDefinition_procedureDecl = ValueUtil.TRUE_VALUE;
			return m_FunctionDefinition_procedureDecl;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_FunctionDefinition_procedureDecl", e);
		}
	}
	
	/**
	 * 
	 * map m_IdentifierReference_designator_Boolean in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * check lDesignator.isIdentifierRef();
	 * new:rightAS rIdentifierReference : astm::IdentifierReference[1];
	 * set lDesignator.ast := rIdentifierReference;
	 * 
	 */
	protected boolean MAP_m_IdentifierReference_designator_Boolean(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator lDesignator)  {
		try {
			final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lDesignator.getDesignator();
			final /*@Thrown*/ boolean eq = designator == null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (eq) {
				// creations
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable IdentifierReference rIdentifierReference = AstmFactory.eINSTANCE.createIdentifierReference();
				assert rIdentifierReference != null;
				models[1/*rightAS*/].add(rIdentifierReference);
				// mapping statements
				lDesignator.setAst(rIdentifierReference);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_IdentifierReference_designator_Boolean = ValueUtil.TRUE_VALUE;
				symbol_2 = m_IdentifierReference_designator_Boolean;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_IdentifierReference_designator_Boolean", e);
		}
	}
	
	/**
	 * 
	 * map m_IfStatement_ifStmt in Delphi_qvtp_qvtcas {
	 * guard:leftCS lIfStmt  : delphi::ifStmt[1];
	 * new:rightAS rIfStatement : astm::IfStatement[1];
	 * set lIfStmt.ast := rIfStatement;
	 * 
	 */
	protected boolean MAP_m_IfStatement_ifStmt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt lIfStmt)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable IfStatement rIfStatement = AstmFactory.eINSTANCE.createIfStatement();
			assert rIfStatement != null;
			models[1/*rightAS*/].add(rIfStatement);
			// mapping statements
			lIfStmt.setAst(rIfStatement);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_IfStatement_ifStmt = ValueUtil.TRUE_VALUE;
			return m_IfStatement_ifStmt;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_IfStatement_ifStmt", e);
		}
	}
	
	/**
	 * 
	 * map m_IntegerLiteral_factor_Boolean in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check lFactor.isANumber();
	 * new:rightAS rIntegerLiteral : astm::IntegerLiteral[1];
	 * set lFactor.ast := rIntegerLiteral;
	 * 
	 */
	protected boolean MAP_m_IntegerLiteral_factor_Boolean(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor lFactor_0)  {
		try {
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number = lFactor_0.getNumber();
			final /*@Thrown*/ boolean ne = number != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (ne) {
				// creations
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable IntegerLiteral rIntegerLiteral = AstmFactory.eINSTANCE.createIntegerLiteral();
				assert rIntegerLiteral != null;
				models[1/*rightAS*/].add(rIntegerLiteral);
				// mapping statements
				lFactor_0.setAst(rIntegerLiteral);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_IntegerLiteral_factor_Boolean = ValueUtil.TRUE_VALUE;
				symbol_2 = m_IntegerLiteral_factor_Boolean;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_IntegerLiteral_factor_Boolean", e);
		}
	}
	
	/**
	 * 
	 * map m_LabelDefinition_labelDeclSection in Delphi_qvtp_qvtcas {
	 * guard:leftCS lLabelDeclSection  : delphi::labelDeclSection[1];
	 * new:rightAS rLabelDefinition : astm::LabelDefinition[1];
	 * set lLabelDeclSection.ast := rLabelDefinition;
	 * 
	 */
	protected boolean MAP_m_LabelDefinition_labelDeclSection(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull labelDeclSection lLabelDeclSection)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable LabelDefinition rLabelDefinition = AstmFactory.eINSTANCE.createLabelDefinition();
			assert rLabelDefinition != null;
			models[1/*rightAS*/].add(rLabelDefinition);
			// mapping statements
			lLabelDeclSection.setAst(rLabelDefinition);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_LabelDefinition_labelDeclSection = ValueUtil.TRUE_VALUE;
			return m_LabelDefinition_labelDeclSection;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_LabelDefinition_labelDeclSection", e);
		}
	}
	
	/**
	 * 
	 * map m_MultipleConstExp_ast_exps in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lMultipleConstExp  : delphi::MultipleConstExp[1];
	 * var exps : OrderedSet(delphi::constExpr)[*|1] := lMultipleConstExp.exps;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Expression) := exps->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Expression))
	 *   ;
	 * var first : astm::Expression[?] := _'\u00ABcollect\u00BB'->first();
	 * set lMultipleConstExp.ast := first;
	 * 
	 */
	protected boolean MAP_m_MultipleConstExp_ast_exps(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull MultipleConstExp lMultipleConstExp)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<constExpr> exps = lMultipleConstExp.getExps();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_exps = idResolver.createOrderedSetOfAll(ORD_CLSSid_constExpr, exps);
			/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Expression);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_exps.iterator();
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constExpr _1 = (constExpr)ITERATOR__1.next();
				/**
				 * _'1_'.ast.oclAsType(astm::Expression)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = _1.getAst();
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
				//
				accumulator.add(oclAsType);
			}
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Expression first = (Expression)OrderedCollectionFirstOperation.INSTANCE.evaluate(collect);
			// mapping statements
			lMultipleConstExp.setAst(first);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_MultipleConstExp_ast_exps = ValueUtil.TRUE_VALUE;
			return m_MultipleConstExp_ast_exps;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_MultipleConstExp_ast_exps", e);
		}
	}
	
	/**
	 * 
	 * map m_Project_mainRule in Delphi_qvtp_qvtcas {
	 * guard:leftCS lMainRule  : delphi::mainRule[1];
	 * new:rightAS rProject : astm::Project[1];
	 * set lMainRule.ast := rProject;
	 * 
	 */
	protected boolean MAP_m_Project_mainRule(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mainRule lMainRule)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Project rProject = AstmFactory.eINSTANCE.createProject();
			assert rProject != null;
			models[1/*rightAS*/].add(rProject);
			// mapping statements
			lMainRule.setAst(rProject);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_Project_mainRule = ValueUtil.TRUE_VALUE;
			return m_Project_mainRule;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Project_mainRule", e);
		}
	}
	
	/**
	 * 
	 * map m_QualifiedOverData_designator_Boolean_Boolean in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * check lDesignator.isQualifiedOverData()
	 *   ;
	 * check not lDesignator.isIdentifierRef();
	 * new:rightAS rQualifiedOverData : astm::QualifiedOverData[1];
	 * set lDesignator.ast := rQualifiedOverData;
	 * 
	 */
	protected boolean MAP_m_QualifiedOverData_designator_Boolean_Boolean(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator lDesignator_0)  {
		try {
			final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lDesignator_0.getDesignator();
			final /*@Thrown*/ boolean ne = designator != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
			if (ne) {
				/*@Caught*/ @NonNull Object CAUGHT_eq;
				try {
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator_0 = lDesignator_0.getDesignator();
					final /*@Thrown*/ boolean eq = designator_0 == null;
					CAUGHT_eq = eq;
				}
				catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq);
				if (not == null) {
					throw throwNull(lDesignator_0, "Null if condition");
				}
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
				if (not) {
					// creations
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable QualifiedOverData rQualifiedOverData = AstmFactory.eINSTANCE.createQualifiedOverData();
					assert rQualifiedOverData != null;
					models[1/*rightAS*/].add(rQualifiedOverData);
					// mapping statements
					lDesignator_0.setAst(rQualifiedOverData);
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_QualifiedOverData_designator_Boolean_Boolean = ValueUtil.TRUE_VALUE;
					symbol_2 = m_QualifiedOverData_designator_Boolean_Boolean;
				}
				else {
					symbol_2 = ValueUtil.FALSE_VALUE;
				}
				symbol_3 = symbol_2;
			}
			else {
				symbol_3 = ValueUtil.FALSE_VALUE;
			}
			return symbol_3;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_QualifiedOverData_designator_Boolean_Boolean", e);
		}
	}
	
	/**
	 * 
	 * map m_RecordConstExp_ast_exps in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lRecordConstExp  : delphi::RecordConstExp[1];
	 * var exps : OrderedSet(delphi::recordConstExpr)[*|1] := lRecordConstExp.exps;
	 * var _'\u00ABcollect\u00BB' : Sequence(delphi::constExpr) := exps->collect(_'1_' | _'1_'.constExp)
	 *   ;
	 * var _'\u00ABcollect\u00BB1' : Sequence(astm::Expression) := _'\u00ABcollect\u00BB'->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Expression))
	 *   ;
	 * var first : astm::Expression[?] := _'\u00ABcollect\u00BB1'->first();
	 * set lRecordConstExp.ast := first;
	 * 
	 */
	protected boolean MAP_m_RecordConstExp_ast_exps(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull RecordConstExp lRecordConstExp)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<recordConstExpr> exps = lRecordConstExp.getExps();
			final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_exps = idResolver.createOrderedSetOfAll(ORD_CLSSid_recordConstExpr, exps);
			/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_constExpr);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_exps.iterator();
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull recordConstExpr _1 = (recordConstExpr)ITERATOR__1.next();
				/**
				 * _'1_'.constExp
				 */
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable constExpr constExp = _1.getConstExp();
				//
				accumulator.add(constExp);
			}
			/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Expression);
			@Nullable Iterator<Object> ITERATOR__1_0 = collect.iterator();
			/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect_0 = accumulator_0;
					break;
				}
				/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable constExpr _1_0 = (constExpr)ITERATOR__1_0.next();
				/**
				 * _'1_'.ast.oclAsType(astm::Expression)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				if (_1_0 == null) {
					throw throwNull(lRecordConstExp, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = _1_0.getAst();
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
				//
				accumulator_0.add(oclAsType);
			}
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Expression first = (Expression)OrderedCollectionFirstOperation.INSTANCE.evaluate(collect_0);
			// mapping statements
			lRecordConstExp.setAst(first);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_RecordConstExp_ast_exps = ValueUtil.TRUE_VALUE;
			return m_RecordConstExp_ast_exps;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_RecordConstExp_ast_exps", e);
		}
	}
	
	/**
	 * 
	 * map m_StringLiteral_factor_Boolean_Boolean in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.isAString();
	 * new:rightAS rStringLiteral : astm::StringLiteral[1];
	 * set lFactor.ast := rStringLiteral;
	 * 
	 */
	protected boolean MAP_m_StringLiteral_factor_Boolean_Boolean(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor lFactor_1)  {
		try {
			/*@Caught*/ @NonNull Object CAUGHT_ne;
			try {
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number = lFactor_1.getNumber();
				final /*@Thrown*/ boolean ne = number != null;
				CAUGHT_ne = ne;
			}
			catch (Exception e) {
				CAUGHT_ne = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
			if (not == null) {
				throw throwNull(lFactor_1, "Null if condition");
			}
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
			if (not) {
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String string = lFactor_1.getString();
				final /*@Thrown*/ boolean ne_0 = string != null;
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
				if (ne_0) {
					// creations
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable StringLiteral rStringLiteral = AstmFactory.eINSTANCE.createStringLiteral();
					assert rStringLiteral != null;
					models[1/*rightAS*/].add(rStringLiteral);
					// mapping statements
					lFactor_1.setAst(rStringLiteral);
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_StringLiteral_factor_Boolean_Boolean = ValueUtil.TRUE_VALUE;
					symbol_2 = m_StringLiteral_factor_Boolean_Boolean;
				}
				else {
					symbol_2 = ValueUtil.FALSE_VALUE;
				}
				symbol_3 = symbol_2;
			}
			else {
				symbol_3 = ValueUtil.FALSE_VALUE;
			}
			return symbol_3;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_StringLiteral_factor_Boolean_Boolean", e);
		}
	}
	
	/**
	 * 
	 * map m_SwitchStatement_caseStmt in Delphi_qvtp_qvtcas {
	 * guard:leftCS lCaseStmt  : delphi::caseStmt[1];
	 * new:rightAS rSwitchStatement : astm::SwitchStatement[1];
	 * set lCaseStmt.ast := rSwitchStatement;
	 * 
	 */
	protected boolean MAP_m_SwitchStatement_caseStmt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseStmt lCaseStmt)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable SwitchStatement rSwitchStatement = AstmFactory.eINSTANCE.createSwitchStatement();
			assert rSwitchStatement != null;
			models[1/*rightAS*/].add(rSwitchStatement);
			// mapping statements
			lCaseStmt.setAst(rSwitchStatement);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_SwitchStatement_caseStmt = ValueUtil.TRUE_VALUE;
			return m_SwitchStatement_caseStmt;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_SwitchStatement_caseStmt", e);
		}
	}
	
	/**
	 * 
	 * map m_TryStatement_tryStmt in Delphi_qvtp_qvtcas {
	 * guard:leftCS lTryStmt  : delphi::tryStmt[1];
	 * new:rightAS rTryStatement : astm::TryStatement[1];
	 * set lTryStmt.ast := rTryStatement;
	 * 
	 */
	protected boolean MAP_m_TryStatement_tryStmt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull tryStmt lTryStmt)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable TryStatement rTryStatement = AstmFactory.eINSTANCE.createTryStatement();
			assert rTryStatement != null;
			models[1/*rightAS*/].add(rTryStatement);
			// mapping statements
			lTryStmt.setAst(rTryStatement);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_TryStatement_tryStmt = ValueUtil.TRUE_VALUE;
			return m_TryStatement_tryStmt;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_TryStatement_tryStmt", e);
		}
	}
	
	/**
	 * 
	 * map m_TypeDefinition_typeDecl in Delphi_qvtp_qvtcas {
	 * guard:leftCS lTypeDecl  : delphi::typeDecl[1];
	 * new:rightAS rTypeDefinition : astm::TypeDefinition[1];
	 * set lTypeDecl.ast := rTypeDefinition;
	 * 
	 */
	protected boolean MAP_m_TypeDefinition_typeDecl(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull typeDecl lTypeDecl)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable TypeDefinition rTypeDefinition = AstmFactory.eINSTANCE.createTypeDefinition();
			assert rTypeDefinition != null;
			models[1/*rightAS*/].add(rTypeDefinition);
			// mapping statements
			lTypeDecl.setAst(rTypeDefinition);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_TypeDefinition_typeDecl = ValueUtil.TRUE_VALUE;
			return m_TypeDefinition_typeDecl;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_TypeDefinition_typeDecl", e);
		}
	}
	
	/**
	 * 
	 * map m_VariableDefinition_constantDecl in Delphi_qvtp_qvtcas {
	 * guard:leftCS lConstantDecl  : delphi::constantDecl[1];
	 * new:rightAS rVariableDefinition : astm::VariableDefinition[1];
	 * set lConstantDecl.ast := rVariableDefinition;
	 * 
	 */
	protected boolean MAP_m_VariableDefinition_constantDecl(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl lConstantDecl)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition rVariableDefinition = AstmFactory.eINSTANCE.createVariableDefinition();
			assert rVariableDefinition != null;
			models[1/*rightAS*/].add(rVariableDefinition);
			// mapping statements
			lConstantDecl.setAst(rVariableDefinition);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_VariableDefinition_constantDecl = ValueUtil.TRUE_VALUE;
			return m_VariableDefinition_constantDecl;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_VariableDefinition_constantDecl", e);
		}
	}
	
	/**
	 * 
	 * map m_VariableDefinition_varDecl in Delphi_qvtp_qvtcas {
	 * guard:leftCS lVarDecl  : delphi::varDecl[1];
	 * new:rightAS rVariableDefinition : astm::VariableDefinition[1];
	 * set lVarDecl.ast := rVariableDefinition;
	 * 
	 */
	protected boolean MAP_m_VariableDefinition_varDecl(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull varDecl lVarDecl)  {
		try {
			// creations
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition rVariableDefinition = AstmFactory.eINSTANCE.createVariableDefinition();
			assert rVariableDefinition != null;
			models[1/*rightAS*/].add(rVariableDefinition);
			// mapping statements
			lVarDecl.setAst(rVariableDefinition);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_VariableDefinition_varDecl = ValueUtil.TRUE_VALUE;
			return m_VariableDefinition_varDecl;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_VariableDefinition_varDecl", e);
		}
	}
	
	/**
	 * 
	 * map m_assignmentStmnt_ast_designator_exp in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lAssignmentStmnt  : delphi::assignmentStmnt[1];
	 * var Assign : astm::Assign[1] := astm::Assign{
	 *   }
	 *   ;
	 * var ast : astm::Visitable[1] := lAssignmentStmnt.ast;
	 * var designator : delphi::designator[?] := lAssignmentStmnt.designator;
	 * var exp : delphi::expression[?] := lAssignmentStmnt.exp;
	 * var aExpressionStatement : astm::ExpressionStatement[1] := ast.oclAsType(astm::ExpressionStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := exp.ast;
	 * var ast2 : astm::Visitable[?] := designator.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression)
	 *   ;
	 * var aNameReference : astm::NameReference[1] := ast2.oclAsType(astm::NameReference)
	 *   ;
	 * var BinaryExpression : astm::BinaryExpression[1] := astm::BinaryExpression{leftOperand = aNameReference, operator = Assign, rightOperand = aExpression
	 *   };
	 * set aExpressionStatement.expression := BinaryExpression;
	 * 
	 */
	protected boolean MAP_m_assignmentStmnt_ast_designator_exp(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull assignmentStmnt lAssignmentStmnt_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Assign_0 = idResolver.getClass(CLSSid_Assign, null);
			final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Assign symbol_0 = (Assign)TYP_astm_c_c_Assign_0.createInstance();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lAssignmentStmnt_0.getAst();
			final /*@Thrown*/ boolean symbol_1 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_1) {
				if (ast == null) {
					throw throwNull(lAssignmentStmnt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lAssignmentStmnt_0.getDesignator();
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable expression exp = lAssignmentStmnt_0.getExp();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_ExpressionStatement_0 = idResolver.getClass(CLSSid_ExpressionStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull ExpressionStatement oclAsType = ClassUtil.nonNullState((ExpressionStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_ExpressionStatement_0));
				if (exp == null) {
					throw throwNull(lAssignmentStmnt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = exp.getAst();
				if (designator == null) {
					throw throwNull(lAssignmentStmnt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_1 = designator.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull NameReference oclAsType_1 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_NameReference_0));
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_leftOperand = idResolver.getProperty(PROPid_leftOperand);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_operator = idResolver.getProperty(PROPid_operator);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_rightOperand = idResolver.getProperty(PROPid_rightOperand);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull BinaryExpression symbol_5 = (BinaryExpression)TYP_astm_c_c_BinaryExpression_0.createInstance();
				CTORid_leftOperand.initValue(symbol_5, oclAsType_1);
				CTORid_operator.initValue(symbol_5, symbol_0);
				CTORid_rightOperand.initValue(symbol_5, oclAsType_0);
				// mapping statements
				oclAsType.setExpression(symbol_5);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_assignmentStmnt_ast_designator_exp = ValueUtil.TRUE_VALUE;
				raw_ast = m_assignmentStmnt_ast_designator_exp;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_assignmentStmnt_ast_designator_exp", e);
		}
	}
	
	/**
	 * 
	 * map m_block_ast_compound in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lBlock  : delphi::block[1];
	 * var ast : astm::Visitable[1] := lBlock.ast;
	 * var compound : delphi::compoundStmt[?] := lBlock.compound;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var stamtList : delphi::stmtList[?] := compound.stamtList;
	 * var statments : OrderedSet(delphi::statement)[*|1] := stamtList.statments;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Statement) := statments->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Statement));
	 * set aDelphiBlockStatement.subStatements := _'\u00ABcollect\u00BB';
	 * 
	 */
	protected boolean MAP_m_block_ast_compound(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull block lBlock_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lBlock_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lBlock_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable compoundStmt compound = lBlock_0.getCompound();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement oclAsType = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiBlockStatement_0));
				if (compound == null) {
					throw throwNull(lBlock_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::compoundStmt::stamtList\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable stmtList stamtList = compound.getStamtList();
				if (stamtList == null) {
					throw throwNull(lBlock_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::stmtList::statments\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<statement> statments = stamtList.getStatments();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_statments = idResolver.createOrderedSetOfAll(ORD_CLSSid_statement, statments);
				/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Statement);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_statments.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull statement _1 = (statement)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(astm::Statement)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
					final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = _1.getAst();
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Statement> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Statement.class, collect);
				oclAsType.getSubStatements().addAll(ECORE_collect);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_block_ast_compound = ValueUtil.TRUE_VALUE;
				raw_ast = m_block_ast_compound;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_block_ast_compound", e);
		}
	}
	
	/**
	 * 
	 * map m_block_ast_declSect in Delphi_qvtp_qvtcas {
	 * guard:leftCS lBlock  : delphi::block[1];
	 * var ast : astm::Visitable[1] := lBlock.ast;
	 * var declSect : delphi::declSection[?] := lBlock.declSect;
	 * var _'=' : Boolean[1] := declSect =
	 *   null;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var _'if' : OrderedSet(astm::DefinitionObject)[?] := if _'='
	 *   then null
	 *   else declSect.getFragments()
	 *   endif;
	 * set aDelphiBlockStatement.declarations := _'if';
	 * 
	 */
	protected boolean MAP_m_block_ast_declSect(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull block lBlock_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lBlock_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lBlock_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable declSection declSect = lBlock_1.getDeclSect();
				final /*@Thrown*/ boolean symbol_1 = declSect == null;
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement oclAsType = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiBlockStatement_0));
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.Nullable OrderedSetValue symbol_2;
				if (symbol_1) {
					symbol_2 = null;
				}
				else {
					if (declSect == null) {
						throw throwNull(lBlock_1, "Null source for \'delphi::declSection::getFragments() : OrderedSet(astm::DefinitionObject)\'");
					}
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue getFragments = INST_declSection_getFragments.evaluate(declSect);
					symbol_2 = getFragments;
				}
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.Nullable List<DefinitionObject> ECORE_symbol_2 = symbol_2 == null ? null : ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DefinitionObject.class, symbol_2);
				oclAsType.getDeclarations().addAll(ECORE_symbol_2);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_block_ast_declSect = ValueUtil.TRUE_VALUE;
				raw_ast = m_block_ast_declSect;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_block_ast_declSect", e);
		}
	}
	
	/**
	 * 
	 * map m_callStmnt_args_ast_designator in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lCallStmnt  : delphi::callStmnt[1];
	 * var args : delphi::exprList[?] := lCallStmnt.args;
	 * var ast : astm::Visitable[1] := lCallStmnt.ast;
	 * var designator : delphi::designator[?] := lCallStmnt.designator;
	 * var aExpressionStatement : astm::ExpressionStatement[1] := ast.oclAsType(astm::ExpressionStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := designator.ast;
	 * var createActualParams : OrderedSet(astm::ActualParameterExpression) := args.createActualParams()
	 *   ;
	 * var aNameReference : astm::NameReference[1] := ast1.oclAsType(astm::NameReference)
	 *   ;
	 * var FunctionCallExpression : astm::FunctionCallExpression[1] := astm::FunctionCallExpression{calledFunction = aNameReference, actualParams = createActualParams
	 *   };
	 * set aExpressionStatement.expression := FunctionCallExpression;
	 * 
	 */
	protected boolean MAP_m_callStmnt_args_ast_designator(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull callStmnt lCallStmnt_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable exprList args = lCallStmnt_0.getArgs();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lCallStmnt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCallStmnt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lCallStmnt_0.getDesignator();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_ExpressionStatement_0 = idResolver.getClass(CLSSid_ExpressionStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull ExpressionStatement oclAsType = ClassUtil.nonNullState((ExpressionStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_ExpressionStatement_0));
				if (designator == null) {
					throw throwNull(lCallStmnt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = designator.getAst();
				if (args == null) {
					throw throwNull(lCallStmnt_0, "Null source for \'delphi::exprList::createActualParams() : OrderedSet(astm::ActualParameterExpression)\'");
				}
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue createActualParams = INST_exprList_createActualParams.evaluate(args);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull NameReference oclAsType_0 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_NameReference_0));
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_calledFunction = idResolver.getProperty(PROPid_calledFunction);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionCallExpression_0 = idResolver.getClass(CLSSid_FunctionCallExpression, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_actualParams = idResolver.getProperty(PROPid_actualParams);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionCallExpression symbol_3 = (FunctionCallExpression)TYP_astm_c_c_FunctionCallExpression_0.createInstance();
				CTORid_calledFunction.initValue(symbol_3, oclAsType_0);
				final List<ActualParameterExpression> UNBOXED_createActualParams = createActualParams.asEcoreObjects(idResolver, ActualParameterExpression.class);
				assert UNBOXED_createActualParams != null;
				CTORid_actualParams.initValue(symbol_3, UNBOXED_createActualParams);
				// mapping statements
				oclAsType.setExpression(symbol_3);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_callStmnt_args_ast_designator = ValueUtil.TRUE_VALUE;
				raw_ast = m_callStmnt_args_ast_designator;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_callStmnt_args_ast_designator", e);
		}
	}
	
	/**
	 * 
	 * map m_caseSelector_ast_labels in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lCaseSelector  : delphi::caseSelector[1];
	 * var ast : astm::Visitable[1] := lCaseSelector.ast;
	 * var labels : OrderedSet(delphi::caseLabel)[*|1] := lCaseSelector.labels;
	 * var aCaseBlock : astm::CaseBlock[1] := ast.oclAsType(astm::CaseBlock)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Expression) := labels->collect(x |
	 *     x.first.ast.oclAsType(astm::Expression)
	 *     .oclAsSet()
	 *     ->including(x.last.ast.oclAsType(astm::Expression)));
	 * set aCaseBlock.caseExpressions := _'\u00ABcollect\u00BB';
	 * 
	 */
	protected boolean MAP_m_caseSelector_ast_labels(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector lCaseSelector_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lCaseSelector_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCaseSelector_0, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<caseLabel> labels = lCaseSelector_0.getLabels();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_CaseBlock_0 = idResolver.getClass(CLSSid_CaseBlock, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CaseBlock oclAsType = ClassUtil.nonNullState((CaseBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_CaseBlock_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_labels = idResolver.createOrderedSetOfAll(ORD_CLSSid_caseLabel, labels);
				/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Expression);
				@NonNull Iterator<Object> ITERATOR_x = BOXED_labels.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseLabel x = (caseLabel)ITERATOR_x.next();
					/**
					 * 
					 * x.first.ast.oclAsType(astm::Expression)
					 * .oclAsSet()
					 * ->including(x.last.ast.oclAsType(astm::Expression))
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_1 = idResolver.getClass(CLSSid_Expression, null);
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable constExpr first = x.getFirst();
					if (first == null) {
						throw throwNull(lCaseSelector_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = first.getAst();
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_1));
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_Expression, oclAsType_0);
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable constExpr last = x.getLast();
					if (last == null) {
						throw throwNull(lCaseSelector_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_1 = last.getAst();
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_1 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Expression_1));
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue including = (SetValue)CollectionIncludingOperation.INSTANCE.evaluate(oclAsSet, oclAsType_1);
					//
					for (Object value : including.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Expression> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Expression.class, collect);
				oclAsType.getCaseExpressions().addAll(ECORE_collect);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_caseSelector_ast_labels = ValueUtil.TRUE_VALUE;
				raw_ast = m_caseSelector_ast_labels;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_caseSelector_ast_labels", e);
		}
	}
	
	/**
	 * 
	 * map m_caseSelector_ast_stmt in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lCaseSelector  : delphi::caseSelector[1];
	 * var ast : astm::Visitable[1] := lCaseSelector.ast;
	 * var stmt : delphi::statement[?] := lCaseSelector.stmt;
	 * var aCaseBlock : astm::CaseBlock[1] := ast.oclAsType(astm::CaseBlock)
	 *   ;
	 * var ast1 : astm::Visitable[?] := stmt.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement)
	 *   ;
	 * var OrderedSet : OrderedSet(astm::Statement)[*|1] := OrderedSet{aStatement
	 *   };
	 * set aCaseBlock.body := OrderedSet;
	 * 
	 */
	protected boolean MAP_m_caseSelector_ast_stmt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector lCaseSelector_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lCaseSelector_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCaseSelector_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable statement stmt = lCaseSelector_1.getStmt();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_CaseBlock_0 = idResolver.getClass(CLSSid_CaseBlock, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CaseBlock oclAsType = ClassUtil.nonNullState((CaseBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_CaseBlock_0));
				if (stmt == null) {
					throw throwNull(lCaseSelector_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = stmt.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_Statement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Statement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Statement.class, OrderedSet);
				oclAsType.getBody().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_caseSelector_ast_stmt = ValueUtil.TRUE_VALUE;
				raw_ast = m_caseSelector_ast_stmt;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_caseSelector_ast_stmt", e);
		}
	}
	
	/**
	 * 
	 * map m_caseStmt_ast_cases in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lCaseStmt  : delphi::caseStmt[1];
	 * var ast : astm::Visitable[1] := lCaseStmt.ast;
	 * var cases : OrderedSet(delphi::caseSelector)[*|1] := lCaseStmt.cases;
	 * var aSwitchStatement : astm::SwitchStatement[1] := ast.oclAsType(astm::SwitchStatement)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::CaseBlock) := cases->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::CaseBlock));
	 * set aSwitchStatement.cases := _'\u00ABcollect\u00BB';
	 * 
	 */
	protected boolean MAP_m_caseStmt_ast_cases(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseStmt lCaseStmt_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lCaseStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCaseStmt_0, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<caseSelector> cases = lCaseStmt_0.getCases();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_SwitchStatement_0 = idResolver.getClass(CLSSid_SwitchStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull SwitchStatement oclAsType = ClassUtil.nonNullState((SwitchStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_SwitchStatement_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_cases = idResolver.createOrderedSetOfAll(ORD_CLSSid_caseSelector, cases);
				/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_CaseBlock);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_cases.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseSelector _1 = (caseSelector)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(astm::CaseBlock)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_CaseBlock_0 = idResolver.getClass(CLSSid_CaseBlock, null);
					final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = _1.getAst();
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CaseBlock oclAsType_0 = ClassUtil.nonNullState((CaseBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_CaseBlock_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<CaseBlock> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(CaseBlock.class, collect);
				oclAsType.getCases().addAll(ECORE_collect);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_caseStmt_ast_cases = ValueUtil.TRUE_VALUE;
				raw_ast = m_caseStmt_ast_cases;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_caseStmt_ast_cases", e);
		}
	}
	
	/**
	 * 
	 * map m_caseStmt_ast_expression in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lCaseStmt  : delphi::caseStmt[1];
	 * var ast : astm::Visitable[1] := lCaseStmt.ast;
	 * var expression : delphi::expression[?] := lCaseStmt.expression;
	 * var aSwitchStatement : astm::SwitchStatement[1] := ast.oclAsType(astm::SwitchStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := expression.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aSwitchStatement.switchExpression := aExpression;
	 * 
	 */
	protected boolean MAP_m_caseStmt_ast_expression(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull caseStmt lCaseStmt_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lCaseStmt_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCaseStmt_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable expression expression = lCaseStmt_1.getExpression();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_SwitchStatement_0 = idResolver.getClass(CLSSid_SwitchStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull SwitchStatement oclAsType = ClassUtil.nonNullState((SwitchStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_SwitchStatement_0));
				if (expression == null) {
					throw throwNull(lCaseStmt_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = expression.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				// mapping statements
				oclAsType.setSwitchExpression(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_caseStmt_ast_expression = ValueUtil.TRUE_VALUE;
				raw_ast = m_caseStmt_ast_expression;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_caseStmt_ast_expression", e);
		}
	}
	
	/**
	 * 
	 * map m_constExpr_ast0 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lConstExpr  : delphi::constExpr[1];
	 * check lConstExpr.oclIsTypeOf(delphi::constExpr);
	 * set lConstExpr.ast := null;
	 * 
	 */
	protected boolean MAP_m_constExpr_ast0(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constExpr lConstExpr)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_constExpr_0_0 = idResolver.getClass(CLSSid_constExpr, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lConstExpr, TYP_delphi_c_c_constExpr_0_0).booleanValue();
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lConstExpr.setAst(null);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_constExpr_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_constExpr_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_constExpr_ast0", e);
		}
	}
	
	/**
	 * 
	 * map m_constantDecl_ast_const in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lConstantDecl  : delphi::constantDecl[1];
	 * var ast : astm::Visitable[1] := lConstantDecl.ast;
	 * var const : delphi::constExpr[?] := lConstantDecl.const;
	 * var aVariableDefinition : astm::VariableDefinition[1] := ast.oclAsType(astm::VariableDefinition)
	 *   ;
	 * var ast1 : astm::Visitable[?] := const.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aVariableDefinition.initialValue := aExpression;
	 * 
	 */
	protected boolean MAP_m_constantDecl_ast_const(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl lConstantDecl_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lConstantDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lConstantDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable constExpr symbol_1 = lConstantDecl_0.getConst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_VariableDefinition_0));
				if (symbol_1 == null) {
					throw throwNull(lConstantDecl_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = symbol_1.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				// mapping statements
				oclAsType.setInitialValue(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_constantDecl_ast_const = ValueUtil.TRUE_VALUE;
				raw_ast = m_constantDecl_ast_const;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_constantDecl_ast_const", e);
		}
	}
	
	/**
	 * 
	 * map m_constantDecl_ast_id in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lConstantDecl  : delphi::constantDecl[1];
	 * var ast : astm::Visitable[1] := lConstantDecl.ast;
	 * var id : delphi::ident[?] := lConstantDecl.id;
	 * var aVariableDefinition : astm::VariableDefinition[1] := ast.oclAsType(astm::VariableDefinition)
	 *   ;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aVariableDefinition.identifierName := Name;
	 * 
	 */
	protected boolean MAP_m_constantDecl_ast_id(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull constantDecl lConstantDecl_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lConstantDecl_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lConstantDecl_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable ident id = lConstantDecl_1.getId();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_VariableDefinition_0));
				if (id == null) {
					throw throwNull(lConstantDecl_1, "Null source for \'delphi::ident::extract() : String[?]\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_ident_extract.evaluate(id);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
				CTORid_nameString.initValue(symbol_2, extract);
				// mapping statements
				oclAsType.setIdentifierName(symbol_2);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_constantDecl_ast_id = ValueUtil.TRUE_VALUE;
				raw_ast = m_constantDecl_ast_id;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_constantDecl_ast_id", e);
		}
	}
	
	/**
	 * 
	 * map m_designator_ast in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * var ast : astm::Visitable[1] := lDesignator.ast;
	 * var getDefinition : astm::Definition[?] := lDesignator.getDefinition()
	 *   ;
	 * check lDesignator.isIdentifierRef()
	 *   ;
	 * var aIdentifierReference : astm::IdentifierReference[1] := ast.oclAsType(astm::IdentifierReference);
	 * set aIdentifierReference.refersTo := getDefinition;
	 * 
	 */
	protected boolean MAP_m_designator_ast(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator lDesignator_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lDesignator_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable self_24 = lDesignator_1.getAst();
				if (self_24 == null) {
					throw throwNull(lDesignator_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorSubPart subpart = lDesignator_1.getSubpart();
				if (subpart == null) {
					throw throwNull(lDesignator_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorPart part = subpart.getPart();
				if (part == null) {
					throw throwNull(lDesignator_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorPart::id\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String fName_0 = part.getId();
				final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment unqualified_env_FunctionDefinition = INST_OclElement_unqualified_env_FunctionDefinition.evaluate(self_24);
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundFunctionDefinition = INST_Visitable__lookupFunctionDefinition.evaluate(self_24, unqualified_env_FunctionDefinition, fName_0);
				final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(foundFunctionDefinition).booleanValue();
				/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition symbol_1;
				if (isEmpty) {
					symbol_1 = null;
				}
				else {
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition first = (FunctionDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundFunctionDefinition);
					symbol_1 = first;
				}
				final /*@Thrown*/ boolean ne = symbol_1 != null;
				/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Definition symbol_3;
				if (ne) {
					symbol_3 = symbol_1;
				}
				else {
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorSubPart subpart_0 = lDesignator_1.getSubpart();
					if (subpart_0 == null) {
						throw throwNull(lDesignator_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
					}
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorPart part_0 = subpart_0.getPart();
					if (part_0 == null) {
						throw throwNull(lDesignator_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorPart::id\'");
					}
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String vName_0 = part_0.getId();
					final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment unqualified_env_VariableDefinition = INST_OclElement_unqualified_env_VariableDefinition.evaluate(self_24);
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundVariableDefinition = INST_Visitable__lookupVariableDefinition.evaluate(self_24, unqualified_env_VariableDefinition, vName_0);
					final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(foundVariableDefinition).booleanValue();
					/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition symbol_2;
					if (isEmpty_0) {
						symbol_2 = null;
					}
					else {
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition first_0 = (VariableDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundVariableDefinition);
						symbol_2 = first_0;
					}
					symbol_3 = symbol_2;
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lDesignator_1.getDesignator();
				final /*@Thrown*/ boolean eq = designator == null;
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_6;
				if (eq) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_IdentifierReference_0 = idResolver.getClass(CLSSid_IdentifierReference, null);
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull IdentifierReference oclAsType = ClassUtil.nonNullState((IdentifierReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IdentifierReference_0));
					// mapping statements
					oclAsType.setRefersTo(symbol_3);
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_designator_ast = ValueUtil.TRUE_VALUE;
					symbol_6 = m_designator_ast;
				}
				else {
					symbol_6 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_6;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_designator_ast", e);
		}
	}
	
	/**
	 * 
	 * map m_designator_ast_1 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * var ast : astm::Visitable[1] := lDesignator.ast;
	 * var getDefinition : astm::Definition[?] := lDesignator.getDefinition()
	 *   ;
	 * check lDesignator.isQualifiedOverData()
	 *   ;
	 * check not lDesignator.isIdentifierRef()
	 *   ;
	 * var aQualifiedOverData : astm::QualifiedOverData[1] := ast.oclAsType(astm::QualifiedOverData);
	 * set aQualifiedOverData.refersTo := getDefinition;
	 * 
	 */
	protected boolean MAP_m_designator_ast_1(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator lDesignator_2)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lDesignator_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_2, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable self_24 = lDesignator_2.getAst();
				if (self_24 == null) {
					throw throwNull(lDesignator_2, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorSubPart subpart = lDesignator_2.getSubpart();
				if (subpart == null) {
					throw throwNull(lDesignator_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorPart part = subpart.getPart();
				if (part == null) {
					throw throwNull(lDesignator_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorPart::id\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String fName_0 = part.getId();
				final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment unqualified_env_FunctionDefinition = INST_OclElement_unqualified_env_FunctionDefinition.evaluate(self_24);
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundFunctionDefinition = INST_Visitable__lookupFunctionDefinition.evaluate(self_24, unqualified_env_FunctionDefinition, fName_0);
				final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(foundFunctionDefinition).booleanValue();
				/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition symbol_1;
				if (isEmpty) {
					symbol_1 = null;
				}
				else {
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition first = (FunctionDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundFunctionDefinition);
					symbol_1 = first;
				}
				final /*@Thrown*/ boolean ne = symbol_1 != null;
				/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Definition symbol_3;
				if (ne) {
					symbol_3 = symbol_1;
				}
				else {
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorSubPart subpart_0 = lDesignator_2.getSubpart();
					if (subpart_0 == null) {
						throw throwNull(lDesignator_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
					}
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorPart part_0 = subpart_0.getPart();
					if (part_0 == null) {
						throw throwNull(lDesignator_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorPart::id\'");
					}
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String vName_0 = part_0.getId();
					final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment unqualified_env_VariableDefinition = INST_OclElement_unqualified_env_VariableDefinition.evaluate(self_24);
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundVariableDefinition = INST_Visitable__lookupVariableDefinition.evaluate(self_24, unqualified_env_VariableDefinition, vName_0);
					final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(foundVariableDefinition).booleanValue();
					/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition symbol_2;
					if (isEmpty_0) {
						symbol_2 = null;
					}
					else {
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition first_0 = (VariableDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundVariableDefinition);
						symbol_2 = first_0;
					}
					symbol_3 = symbol_2;
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lDesignator_2.getDesignator();
				final /*@Thrown*/ boolean ne_0 = designator != null;
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_7;
				if (ne_0) {
					/*@Caught*/ @NonNull Object CAUGHT_eq;
					try {
						final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator_0 = lDesignator_2.getDesignator();
						final /*@Thrown*/ boolean eq = designator_0 == null;
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq);
					if (not == null) {
						throw throwNull(lDesignator_2, "Null if condition");
					}
					/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_6;
					if (not) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_QualifiedOverData_0 = idResolver.getClass(CLSSid_QualifiedOverData, null);
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull QualifiedOverData oclAsType = ClassUtil.nonNullState((QualifiedOverData)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_QualifiedOverData_0));
						// mapping statements
						oclAsType.setRefersTo(symbol_3);
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_designator_ast_1 = ValueUtil.TRUE_VALUE;
						symbol_6 = m_designator_ast_1;
					}
					else {
						symbol_6 = ValueUtil.FALSE_VALUE;
					}
					symbol_7 = symbol_6;
				}
				else {
					symbol_7 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_7;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_designator_ast_1", e);
		}
	}
	
	/**
	 * 
	 * map m_designator_ast_subpart in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * var ast : astm::Visitable[1] := lDesignator.ast;
	 * var subpart : delphi::designatorSubPart[?] := lDesignator.subpart;
	 * check lDesignator.isIdentifierRef()
	 *   ;
	 * var aIdentifierReference : astm::IdentifierReference[1] := ast.oclAsType(astm::IdentifierReference)
	 *   ;
	 * var part : delphi::designatorPart[?] := subpart.part;
	 * var extract : String[?] := part.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aIdentifierReference.name := Name;
	 * 
	 */
	protected boolean MAP_m_designator_ast_subpart(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator lDesignator_3)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lDesignator_3.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_3, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorSubPart subpart = lDesignator_3.getSubpart();
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lDesignator_3.getDesignator();
				final /*@Thrown*/ boolean eq = designator == null;
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_5;
				if (eq) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_IdentifierReference_0 = idResolver.getClass(CLSSid_IdentifierReference, null);
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull IdentifierReference oclAsType = ClassUtil.nonNullState((IdentifierReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IdentifierReference_0));
					if (subpart == null) {
						throw throwNull(lDesignator_3, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
					}
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorPart part = subpart.getPart();
					if (part == null) {
						throw throwNull(lDesignator_3, "Null where non-null value required");
					}
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String id = part.getId();
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
					CTORid_nameString.initValue(symbol_2, id);
					// mapping statements
					oclAsType.setName(symbol_2);
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_designator_ast_subpart = ValueUtil.TRUE_VALUE;
					symbol_5 = m_designator_ast_subpart;
				}
				else {
					symbol_5 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_5;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_designator_ast_subpart", e);
		}
	}
	
	/**
	 * 
	 * map m_designator_ast_subpart_1 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * var ast : astm::Visitable[1] := lDesignator.ast;
	 * var subpart : delphi::designatorSubPart[?] := lDesignator.subpart;
	 * check lDesignator.isQualifiedOverData()
	 *   ;
	 * check not lDesignator.isIdentifierRef()
	 *   ;
	 * var aQualifiedOverData : astm::QualifiedOverData[1] := ast.oclAsType(astm::QualifiedOverData)
	 *   ;
	 * var part : delphi::designatorPart[?] := subpart.part;
	 * var extract : String[?] := part.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aQualifiedOverData.name := Name;
	 * 
	 */
	protected boolean MAP_m_designator_ast_subpart_1(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull designator lDesignator_4)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lDesignator_4.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_4, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorSubPart subpart = lDesignator_4.getSubpart();
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lDesignator_4.getDesignator();
				final /*@Thrown*/ boolean ne = designator != null;
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_6;
				if (ne) {
					/*@Caught*/ @NonNull Object CAUGHT_eq;
					try {
						final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator_0 = lDesignator_4.getDesignator();
						final /*@Thrown*/ boolean eq = designator_0 == null;
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq);
					if (not == null) {
						throw throwNull(lDesignator_4, "Null if condition");
					}
					/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_5;
					if (not) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_QualifiedOverData_0 = idResolver.getClass(CLSSid_QualifiedOverData, null);
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull QualifiedOverData oclAsType = ClassUtil.nonNullState((QualifiedOverData)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_QualifiedOverData_0));
						if (subpart == null) {
							throw throwNull(lDesignator_4, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
						}
						final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designatorPart part = subpart.getPart();
						if (part == null) {
							throw throwNull(lDesignator_4, "Null where non-null value required");
						}
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String id = part.getId();
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
						CTORid_nameString.initValue(symbol_2, id);
						// mapping statements
						oclAsType.setName(symbol_2);
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_designator_ast_subpart_1 = ValueUtil.TRUE_VALUE;
						symbol_5 = m_designator_ast_subpart_1;
					}
					else {
						symbol_5 = ValueUtil.FALSE_VALUE;
					}
					symbol_6 = symbol_5;
				}
				else {
					symbol_6 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_6;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_designator_ast_subpart_1", e);
		}
	}
	
	/**
	 * 
	 * map m_expression_ast0 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lExpression  : delphi::expression[1];
	 * check lExpression.oclIsTypeOf(delphi::expression);
	 * set lExpression.ast := null;
	 * 
	 */
	protected boolean MAP_m_expression_ast0(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull expression lExpression)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_expression_0_0 = idResolver.getClass(CLSSid_expression, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lExpression, TYP_delphi_c_c_expression_0_0).booleanValue();
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lExpression.setAst(null);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_expression_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_expression_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_expression_ast0", e);
		}
	}
	
	/**
	 * 
	 * map m_factor_ast_designator in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var designator : delphi::designator[?] := lFactor.designator;
	 * check not lFactor.isAString()
	 *   ;
	 * check lFactor.isAFunctionCall()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * var aDelphiFunctionCallExpression : astm::DelphiFunctionCallExpression[1] := ast.oclAsType(astm::DelphiFunctionCallExpression)
	 *   ;
	 * var ast1 : astm::Visitable[?] := designator.ast;
	 * var aNameReference : astm::NameReference[1] := ast1.oclAsType(astm::NameReference);
	 * set aDelphiFunctionCallExpression.calledFunction := aNameReference;
	 * 
	 */
	protected boolean MAP_m_factor_ast_designator(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor lFactor_2)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lFactor_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_2, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable designator designator = lFactor_2.getDesignator();
				/*@Caught*/ @NonNull Object CAUGHT_ne;
				try {
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String string = lFactor_2.getString();
					final /*@Thrown*/ boolean ne = string != null;
					CAUGHT_ne = ne;
				}
				catch (Exception e) {
					CAUGHT_ne = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
				if (not == null) {
					throw throwNull(lFactor_2, "Null if condition");
				}
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_5;
				if (not) {
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable exprList expList = lFactor_2.getExpList();
					final /*@Thrown*/ boolean ne_0 = expList != null;
					/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_4;
					if (ne_0) {
						/*@Caught*/ @NonNull Object CAUGHT_ne_1;
						try {
							final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number = lFactor_2.getNumber();
							final /*@Thrown*/ boolean ne_1 = number != null;
							CAUGHT_ne_1 = ne_1;
						}
						catch (Exception e) {
							CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
						if (not_0 == null) {
							throw throwNull(lFactor_2, "Null if condition");
						}
						/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
						if (not_0) {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiFunctionCallExpression_0 = idResolver.getClass(CLSSid_DelphiFunctionCallExpression, null);
							final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiFunctionCallExpression oclAsType = ClassUtil.nonNullState((DelphiFunctionCallExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiFunctionCallExpression_0));
							if (designator == null) {
								throw throwNull(lFactor_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
							}
							final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = designator.getAst();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
							final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull NameReference oclAsType_0 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_NameReference_0));
							// mapping statements
							oclAsType.setCalledFunction(oclAsType_0);
							final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_factor_ast_designator = ValueUtil.TRUE_VALUE;
							symbol_3 = m_factor_ast_designator;
						}
						else {
							symbol_3 = ValueUtil.FALSE_VALUE;
						}
						symbol_4 = symbol_3;
					}
					else {
						symbol_4 = ValueUtil.FALSE_VALUE;
					}
					symbol_5 = symbol_4;
				}
				else {
					symbol_5 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_5;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_factor_ast_designator", e);
		}
	}
	
	/**
	 * 
	 * map m_factor_ast_expList in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var expList : delphi::exprList[?] := lFactor.expList;
	 * check not lFactor.isAString()
	 *   ;
	 * check lFactor.isAFunctionCall()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * var aDelphiFunctionCallExpression : astm::DelphiFunctionCallExpression[1] := ast.oclAsType(astm::DelphiFunctionCallExpression)
	 *   ;
	 * var createActualParams : OrderedSet(astm::ActualParameterExpression) := expList.createActualParams();
	 * set aDelphiFunctionCallExpression.actualParams := createActualParams;
	 * 
	 */
	protected boolean MAP_m_factor_ast_expList(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor lFactor_3)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lFactor_3.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_3, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable exprList expList = lFactor_3.getExpList();
				/*@Caught*/ @NonNull Object CAUGHT_ne;
				try {
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String string = lFactor_3.getString();
					final /*@Thrown*/ boolean ne = string != null;
					CAUGHT_ne = ne;
				}
				catch (Exception e) {
					CAUGHT_ne = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
				if (not == null) {
					throw throwNull(lFactor_3, "Null if condition");
				}
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_5;
				if (not) {
					final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable exprList expList_0 = lFactor_3.getExpList();
					final /*@Thrown*/ boolean ne_0 = expList_0 != null;
					/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_4;
					if (ne_0) {
						/*@Caught*/ @NonNull Object CAUGHT_ne_1;
						try {
							final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number = lFactor_3.getNumber();
							final /*@Thrown*/ boolean ne_1 = number != null;
							CAUGHT_ne_1 = ne_1;
						}
						catch (Exception e) {
							CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
						if (not_0 == null) {
							throw throwNull(lFactor_3, "Null if condition");
						}
						/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
						if (not_0) {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiFunctionCallExpression_0 = idResolver.getClass(CLSSid_DelphiFunctionCallExpression, null);
							final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiFunctionCallExpression oclAsType = ClassUtil.nonNullState((DelphiFunctionCallExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiFunctionCallExpression_0));
							if (expList == null) {
								throw throwNull(lFactor_3, "Null source for \'delphi::exprList::createActualParams() : OrderedSet(astm::ActualParameterExpression)\'");
							}
							final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue createActualParams = INST_exprList_createActualParams.evaluate(expList);
							// mapping statements
							final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ActualParameterExpression> ECORE_createActualParams = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(ActualParameterExpression.class, createActualParams);
							oclAsType.getActualParams().addAll(ECORE_createActualParams);
							final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_factor_ast_expList = ValueUtil.TRUE_VALUE;
							symbol_3 = m_factor_ast_expList;
						}
						else {
							symbol_3 = ValueUtil.FALSE_VALUE;
						}
						symbol_4 = symbol_3;
					}
					else {
						symbol_4 = ValueUtil.FALSE_VALUE;
					}
					symbol_5 = symbol_4;
				}
				else {
					symbol_5 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_5;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_factor_ast_expList", e);
		}
	}
	
	/**
	 * 
	 * map m_factor_ast_number in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var number : String[?] := lFactor.number;
	 * check lFactor.isANumber()
	 *   ;
	 * var aIntegerLiteral : astm::IntegerLiteral[1] := ast.oclAsType(astm::IntegerLiteral);
	 * set aIntegerLiteral.value := number;
	 * 
	 */
	protected boolean MAP_m_factor_ast_number(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor lFactor_4)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lFactor_4.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_4, "Null where non-null value required");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number = lFactor_4.getNumber();
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number_0 = lFactor_4.getNumber();
				final /*@Thrown*/ boolean ne = number_0 != null;
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
				if (ne) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_IntegerLiteral_0 = idResolver.getClass(CLSSid_IntegerLiteral, null);
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull IntegerLiteral oclAsType = ClassUtil.nonNullState((IntegerLiteral)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IntegerLiteral_0));
					// mapping statements
					oclAsType.setValue(number);
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_factor_ast_number = ValueUtil.TRUE_VALUE;
					symbol_3 = m_factor_ast_number;
				}
				else {
					symbol_3 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_3;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_factor_ast_number", e);
		}
	}
	
	/**
	 * 
	 * map m_factor_ast_string in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var string : String[?] := lFactor.string;
	 * check lFactor.isAString()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * var aStringLiteral : astm::StringLiteral[1] := ast.oclAsType(astm::StringLiteral);
	 * set aStringLiteral.value := string;
	 * 
	 */
	protected boolean MAP_m_factor_ast_string(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull factor lFactor_5)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lFactor_5.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_5, "Null where non-null value required");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String string = lFactor_5.getString();
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String string_0 = lFactor_5.getString();
				final /*@Thrown*/ boolean ne = string_0 != null;
				/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_4;
				if (ne) {
					/*@Caught*/ @NonNull Object CAUGHT_ne_0;
					try {
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String number = lFactor_5.getNumber();
						final /*@Thrown*/ boolean ne_0 = number != null;
						CAUGHT_ne_0 = ne_0;
					}
					catch (Exception e) {
						CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
					if (not == null) {
						throw throwNull(lFactor_5, "Null if condition");
					}
					/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_3;
					if (not) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_StringLiteral_0 = idResolver.getClass(CLSSid_StringLiteral, null);
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull StringLiteral oclAsType = ClassUtil.nonNullState((StringLiteral)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_StringLiteral_0));
						// mapping statements
						oclAsType.setValue(string);
						final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_factor_ast_string = ValueUtil.TRUE_VALUE;
						symbol_3 = m_factor_ast_string;
					}
					else {
						symbol_3 = ValueUtil.FALSE_VALUE;
					}
					symbol_4 = symbol_3;
				}
				else {
					symbol_4 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_4;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_factor_ast_string", e);
		}
	}
	
	/**
	 * 
	 * map m_file_ast0 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFile  : delphi::file[1];
	 * check lFile.oclIsTypeOf(delphi::file);
	 * set lFile.ast := null;
	 * 
	 */
	protected boolean MAP_m_file_ast0(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull file lFile)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_file_0_0 = idResolver.getClass(CLSSid_file, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFile, TYP_delphi_c_c_file_0_0).booleanValue();
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lFile.setAst(null);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_file_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_file_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_file_ast0", e);
		}
	}
	
	/**
	 * 
	 * map m_functionDecl_ast_block in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFunctionDecl  : delphi::functionDecl[1];
	 * var ast : astm::Visitable[1] := lFunctionDecl.ast;
	 * var block : delphi::block[?] := lFunctionDecl.block;
	 * var aFunctionDefinition : astm::FunctionDefinition[1] := ast.oclAsType(astm::FunctionDefinition)
	 *   ;
	 * var ast1 : astm::Visitable[?] := block.ast;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast1.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var OrderedSet : OrderedSet(astm::DelphiBlockStatement)[*|1] := OrderedSet{aDelphiBlockStatement
	 *   };
	 * set aFunctionDefinition.body := OrderedSet;
	 * 
	 */
	protected boolean MAP_m_functionDecl_ast_block(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl lFunctionDecl_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lFunctionDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFunctionDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable block block = lFunctionDecl_0.getBlock();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
				if (block == null) {
					throw throwNull(lFunctionDecl_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = block.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement oclAsType_0 = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DelphiBlockStatement_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_DelphiBlockStatement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DelphiBlockStatement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DelphiBlockStatement.class, OrderedSet);
				oclAsType.getBody().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_functionDecl_ast_block = ValueUtil.TRUE_VALUE;
				raw_ast = m_functionDecl_ast_block;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_functionDecl_ast_block", e);
		}
	}
	
	/**
	 * 
	 * map m_functionDecl_ast_heading in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lFunctionDecl  : delphi::functionDecl[1];
	 * var ast : astm::Visitable[1] := lFunctionDecl.ast;
	 * var heading : delphi::functionHeading[?] := lFunctionDecl.heading;
	 * var aFunctionDefinition : astm::FunctionDefinition[1] := ast.oclAsType(astm::FunctionDefinition)
	 *   ;
	 * var id : delphi::ident[?] := heading.id;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aFunctionDefinition.identifierName := Name;
	 * 
	 */
	protected boolean MAP_m_functionDecl_ast_heading(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull functionDecl lFunctionDecl_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lFunctionDecl_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFunctionDecl_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable functionHeading heading = lFunctionDecl_1.getHeading();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
				if (heading == null) {
					throw throwNull(lFunctionDecl_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::methodHeading::id\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable ident id = heading.getId();
				if (id == null) {
					throw throwNull(lFunctionDecl_1, "Null source for \'delphi::ident::extract() : String[?]\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_ident_extract.evaluate(id);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
				CTORid_nameString.initValue(symbol_2, extract);
				// mapping statements
				oclAsType.setIdentifierName(symbol_2);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_functionDecl_ast_heading = ValueUtil.TRUE_VALUE;
				raw_ast = m_functionDecl_ast_heading;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_functionDecl_ast_heading", e);
		}
	}
	
	/**
	 * 
	 * map m_ident_ast_oclContainer in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lIdent  : delphi::ident[1];
	 * var extract : String[?] := lIdent.extract()
	 *   ;
	 * var oclContainer : OclElement[?] := lIdent.oclContainer;
	 * check lIdent.oclIsTypeOf(delphi::ident)
	 *   ;
	 * var aCSTrace : delphi::CSTrace[1] := oclContainer.oclAsType(delphi::CSTrace)
	 *   ;
	 * var ast : astm::Visitable[?] := aCSTrace.ast;
	 * var lookupFunctionDefinition : astm::FunctionDefinition[?] := ast.lookupFunctionDefinition(extract);
	 * var _'<>' : Boolean[1] := lookupFunctionDefinition <>
	 *   null;
	 * var _'if' : astm::Definition[?] := if _'<>'
	 *   then lookupFunctionDefinition
	 *   else ast.lookupVariableDefinition(extract)
	 *   endif;
	 * set lIdent.ast := _'if';
	 * 
	 */
	protected boolean MAP_m_ident_ast_oclContainer(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident lIdent)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_ident_extract.evaluate(lIdent);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = lIdent.eContainer();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_ident_0_0 = idResolver.getClass(CLSSid_ident, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lIdent, TYP_delphi_c_c_ident_0_0).booleanValue();
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_6;
			if (oclIsTypeOf) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_CSTrace_1 = idResolver.getClass(CLSSid_CSTrace, null);
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull CSTrace oclAsType = ClassUtil.nonNullState((CSTrace)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_delphi_c_c_CSTrace_1));
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = oclAsType.getAst();
				if (ast == null) {
					throw throwNull(lIdent, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment unqualified_env_FunctionDefinition = INST_OclElement_unqualified_env_FunctionDefinition.evaluate(ast);
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundFunctionDefinition = INST_Visitable__lookupFunctionDefinition.evaluate(ast, unqualified_env_FunctionDefinition, extract);
				final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(foundFunctionDefinition).booleanValue();
				/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition symbol_0;
				if (isEmpty) {
					symbol_0 = null;
				}
				else {
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable FunctionDefinition first = (FunctionDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundFunctionDefinition);
					symbol_0 = first;
				}
				final /*@Thrown*/ boolean symbol_1 = symbol_0 != null;
				/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Definition symbol_3;
				if (symbol_1) {
					symbol_3 = symbol_0;
				}
				else {
					final /*@Thrown*/ org.xtext.example.delphi.astm.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment unqualified_env_VariableDefinition = INST_OclElement_unqualified_env_VariableDefinition.evaluate(ast);
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue foundVariableDefinition = INST_Visitable__lookupVariableDefinition.evaluate(ast, unqualified_env_VariableDefinition, extract);
					final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(foundVariableDefinition).booleanValue();
					/*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition symbol_2;
					if (isEmpty_0) {
						symbol_2 = null;
					}
					else {
						final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable VariableDefinition first_0 = (VariableDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundVariableDefinition);
						symbol_2 = first_0;
					}
					symbol_3 = symbol_2;
				}
				// mapping statements
				lIdent.setAst(symbol_3);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_ident_ast_oclContainer = ValueUtil.TRUE_VALUE;
				symbol_6 = m_ident_ast_oclContainer;
			}
			else {
				symbol_6 = ValueUtil.FALSE_VALUE;
			}
			return symbol_6;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ident_ast_oclContainer", e);
		}
	}
	
	/**
	 * 
	 * map m_ifStmt_ast_condition in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lIfStmt  : delphi::ifStmt[1];
	 * var ast : astm::Visitable[1] := lIfStmt.ast;
	 * var condition : delphi::expression[?] := lIfStmt.condition;
	 * var aIfStatement : astm::IfStatement[1] := ast.oclAsType(astm::IfStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := condition.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aIfStatement.condition := aExpression;
	 * 
	 */
	protected boolean MAP_m_ifStmt_ast_condition(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt lIfStmt_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lIfStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lIfStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable expression condition = lIfStmt_0.getCondition();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_IfStatement_0 = idResolver.getClass(CLSSid_IfStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull IfStatement oclAsType = ClassUtil.nonNullState((IfStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IfStatement_0));
				if (condition == null) {
					throw throwNull(lIfStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = condition.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				// mapping statements
				oclAsType.setCondition(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_ifStmt_ast_condition = ValueUtil.TRUE_VALUE;
				raw_ast = m_ifStmt_ast_condition;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ifStmt_ast_condition", e);
		}
	}
	
	/**
	 * 
	 * map m_ifStmt_ast_else in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lIfStmt  : delphi::ifStmt[1];
	 * var ast : astm::Visitable[1] := lIfStmt.ast;
	 * var _'else' : delphi::statement[?] := lIfStmt._'else';
	 * var aIfStatement : astm::IfStatement[1] := ast.oclAsType(astm::IfStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := _'else'.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement);
	 * set aIfStatement.elseBody := aStatement;
	 * 
	 */
	protected boolean MAP_m_ifStmt_ast_else(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt lIfStmt_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lIfStmt_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lIfStmt_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable statement symbol_1 = lIfStmt_1.getElse();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_IfStatement_0 = idResolver.getClass(CLSSid_IfStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull IfStatement oclAsType = ClassUtil.nonNullState((IfStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IfStatement_0));
				if (symbol_1 == null) {
					throw throwNull(lIfStmt_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = symbol_1.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				// mapping statements
				oclAsType.setElseBody(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_ifStmt_ast_else = ValueUtil.TRUE_VALUE;
				raw_ast = m_ifStmt_ast_else;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ifStmt_ast_else", e);
		}
	}
	
	/**
	 * 
	 * map m_ifStmt_ast_then in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lIfStmt  : delphi::ifStmt[1];
	 * var ast : astm::Visitable[1] := lIfStmt.ast;
	 * var _'then' : delphi::statement[?] := lIfStmt._'then';
	 * var aIfStatement : astm::IfStatement[1] := ast.oclAsType(astm::IfStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := _'then'.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement);
	 * set aIfStatement.thenBody := aStatement;
	 * 
	 */
	protected boolean MAP_m_ifStmt_ast_then(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ifStmt lIfStmt_2)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lIfStmt_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lIfStmt_2, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable statement then = lIfStmt_2.getThen();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_IfStatement_0 = idResolver.getClass(CLSSid_IfStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull IfStatement oclAsType = ClassUtil.nonNullState((IfStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IfStatement_0));
				if (then == null) {
					throw throwNull(lIfStmt_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = then.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				// mapping statements
				oclAsType.setThenBody(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_ifStmt_ast_then = ValueUtil.TRUE_VALUE;
				raw_ast = m_ifStmt_ast_then;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ifStmt_ast_then", e);
		}
	}
	
	/**
	 * 
	 * map m_implementationSection_ast_declSect in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lImplementationSection  : delphi::implementationSection[1];
	 * var ast : astm::Visitable[1] := lImplementationSection.ast;
	 * var declSect : OrderedSet(delphi::declSection)[*|1] := lImplementationSection.declSect;
	 * var aDelphiImplementationSection : astm::DelphiImplementationSection[1] := ast.oclAsType(astm::DelphiImplementationSection)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::DefinitionObject) := declSect->collect(_'1_' |
	 *     _'1_'.getFragments());
	 * set aDelphiImplementationSection.fragments := _'\u00ABcollect\u00BB';
	 * 
	 */
	protected boolean MAP_m_implementationSection_ast_declSect(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull implementationSection lImplementationSection_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lImplementationSection_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lImplementationSection_0, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<declSection> declSect = lImplementationSection_0.getDeclSect();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiImplementationSection_0 = idResolver.getClass(CLSSid_DelphiImplementationSection, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiImplementationSection oclAsType = ClassUtil.nonNullState((DelphiImplementationSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiImplementationSection_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_declSect = idResolver.createOrderedSetOfAll(ORD_CLSSid_declSection, declSect);
				/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_DefinitionObject);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_declSect.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull declSection _1 = (declSection)ITERATOR__1.next();
					/**
					 * _'1_'.getFragments()
					 */
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue getFragments = INST_declSection_getFragments.evaluate(_1);
					//
					for (Object value : getFragments.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DefinitionObject> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DefinitionObject.class, collect);
				oclAsType.getFragments().addAll(ECORE_collect);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_implementationSection_ast_declSect = ValueUtil.TRUE_VALUE;
				raw_ast = m_implementationSection_ast_declSect;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_implementationSection_ast_declSect", e);
		}
	}
	
	/**
	 * 
	 * map m_interfaceSection_ast_interfaceDecl in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lInterfaceSection  : delphi::interfaceSection[1];
	 * var ast : astm::Visitable[1] := lInterfaceSection.ast;
	 * var interfaceDecl : OrderedSet(delphi::interfaceDecl)[*|1] := lInterfaceSection.interfaceDecl;
	 * var aDelphiInterfaceSection : astm::DelphiInterfaceSection[1] := ast.oclAsType(astm::DelphiInterfaceSection)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::DefinitionObject) := interfaceDecl->collect(_'1_' |
	 *     _'1_'.getFragments());
	 * set aDelphiInterfaceSection.fragments := _'\u00ABcollect\u00BB';
	 * 
	 */
	protected boolean MAP_m_interfaceSection_ast_interfaceDecl(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceSection lInterfaceSection_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lInterfaceSection_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lInterfaceSection_0, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<interfaceDecl> interfaceDecl = lInterfaceSection_0.getInterfaceDecl();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiInterfaceSection_0 = idResolver.getClass(CLSSid_DelphiInterfaceSection, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiInterfaceSection oclAsType = ClassUtil.nonNullState((DelphiInterfaceSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiInterfaceSection_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_interfaceDecl = idResolver.createOrderedSetOfAll(ORD_CLSSid_interfaceDecl, interfaceDecl);
				/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_DefinitionObject);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_interfaceDecl.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull interfaceDecl _1 = (interfaceDecl)ITERATOR__1.next();
					/**
					 * _'1_'.getFragments()
					 */
					final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue getFragments = INST_interfaceDecl_getFragments.evaluate(_1);
					//
					for (Object value : getFragments.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DefinitionObject> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DefinitionObject.class, collect);
				oclAsType.getFragments().addAll(ECORE_collect);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_interfaceSection_ast_interfaceDecl = ValueUtil.TRUE_VALUE;
				raw_ast = m_interfaceSection_ast_interfaceDecl;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_interfaceSection_ast_interfaceDecl", e);
		}
	}
	
	/**
	 * 
	 * map m_mainRule_ast_file in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lMainRule  : delphi::mainRule[1];
	 * var ast : astm::Visitable[1] := lMainRule.ast;
	 * var file : delphi::file[?] := lMainRule.file;
	 * var aProject : astm::Project[1] := ast.oclAsType(astm::Project)
	 *   ;
	 * var ast1 : astm::Visitable[?] := file.ast;
	 * var aCompilationUnit : astm::CompilationUnit[1] := ast1.oclAsType(astm::CompilationUnit)
	 *   ;
	 * var OrderedSet : OrderedSet(astm::CompilationUnit)[*|1] := OrderedSet{aCompilationUnit
	 *   };
	 * set aProject.files := OrderedSet;
	 * 
	 */
	protected boolean MAP_m_mainRule_ast_file(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull mainRule lMainRule_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lMainRule_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lMainRule_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable file file = lMainRule_0.getFile();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Project_0 = idResolver.getClass(CLSSid_Project, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Project oclAsType = ClassUtil.nonNullState((Project)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Project_0));
				if (file == null) {
					throw throwNull(lMainRule_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = file.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_CompilationUnit_0 = idResolver.getClass(CLSSid_CompilationUnit, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull CompilationUnit oclAsType_0 = ClassUtil.nonNullState((CompilationUnit)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_CompilationUnit_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_CompilationUnit, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<CompilationUnit> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(CompilationUnit.class, OrderedSet);
				oclAsType.getFiles().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_mainRule_ast_file = ValueUtil.TRUE_VALUE;
				raw_ast = m_mainRule_ast_file;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_mainRule_ast_file", e);
		}
	}
	
	/**
	 * 
	 * map m_procedureDecl_ast_block in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lProcedureDecl  : delphi::procedureDecl[1];
	 * var ast : astm::Visitable[1] := lProcedureDecl.ast;
	 * var block : delphi::block[?] := lProcedureDecl.block;
	 * var aFunctionDefinition : astm::FunctionDefinition[1] := ast.oclAsType(astm::FunctionDefinition)
	 *   ;
	 * var ast1 : astm::Visitable[?] := block.ast;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast1.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var OrderedSet : OrderedSet(astm::DelphiBlockStatement)[*|1] := OrderedSet{aDelphiBlockStatement
	 *   };
	 * set aFunctionDefinition.body := OrderedSet;
	 * 
	 */
	protected boolean MAP_m_procedureDecl_ast_block(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDecl lProcedureDecl_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lProcedureDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lProcedureDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable block block = lProcedureDecl_0.getBlock();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
				if (block == null) {
					throw throwNull(lProcedureDecl_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = block.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiBlockStatement oclAsType_0 = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DelphiBlockStatement_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_DelphiBlockStatement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DelphiBlockStatement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DelphiBlockStatement.class, OrderedSet);
				oclAsType.getBody().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_procedureDecl_ast_block = ValueUtil.TRUE_VALUE;
				raw_ast = m_procedureDecl_ast_block;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_procedureDecl_ast_block", e);
		}
	}
	
	/**
	 * 
	 * map m_procedureDecl_ast_heading in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lProcedureDecl  : delphi::procedureDecl[1];
	 * var ast : astm::Visitable[1] := lProcedureDecl.ast;
	 * var heading : delphi::procedureHeading[?] := lProcedureDecl.heading;
	 * var aFunctionDefinition : astm::FunctionDefinition[1] := ast.oclAsType(astm::FunctionDefinition)
	 *   ;
	 * var id : delphi::ident[?] := heading.id;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aFunctionDefinition.identifierName := Name;
	 * 
	 */
	protected boolean MAP_m_procedureDecl_ast_heading(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull procedureDecl lProcedureDecl_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lProcedureDecl_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lProcedureDecl_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable procedureHeading heading = lProcedureDecl_1.getHeading();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
				if (heading == null) {
					throw throwNull(lProcedureDecl_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::methodHeading::id\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable ident id = heading.getId();
				if (id == null) {
					throw throwNull(lProcedureDecl_1, "Null source for \'delphi::ident::extract() : String[?]\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_ident_extract.evaluate(id);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
				CTORid_nameString.initValue(symbol_2, extract);
				// mapping statements
				oclAsType.setIdentifierName(symbol_2);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_procedureDecl_ast_heading = ValueUtil.TRUE_VALUE;
				raw_ast = m_procedureDecl_ast_heading;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_procedureDecl_ast_heading", e);
		}
	}
	
	/**
	 * 
	 * map m_relExp_ast_left in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lRelExp  : delphi::relExp[1];
	 * var ast : astm::Visitable[1] := lRelExp.ast;
	 * var left : delphi::expression[?] := lRelExp.left;
	 * var aBinaryExpression : astm::BinaryExpression[1] := ast.oclAsType(astm::BinaryExpression)
	 *   ;
	 * var ast1 : astm::Visitable[?] := left.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aBinaryExpression.leftOperand := aExpression;
	 * 
	 */
	protected boolean MAP_m_relExp_ast_left(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp lRelExp_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lRelExp_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lRelExp_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable expression left = lRelExp_0.getLeft();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull BinaryExpression oclAsType = ClassUtil.nonNullState((BinaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_BinaryExpression_0));
				if (left == null) {
					throw throwNull(lRelExp_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = left.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				// mapping statements
				oclAsType.setLeftOperand(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_relExp_ast_left = ValueUtil.TRUE_VALUE;
				raw_ast = m_relExp_ast_left;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_relExp_ast_left", e);
		}
	}
	
	/**
	 * 
	 * map m_relExp_ast_relOp in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lRelExp  : delphi::relExp[1];
	 * var ast : astm::Visitable[1] := lRelExp.ast;
	 * var relOp : delphi::relOp[?] := lRelExp.relOp;
	 * var aBinaryExpression : astm::BinaryExpression[1] := ast.oclAsType(astm::BinaryExpression);
	 * var op : String[?] := relOp.op;
	 * var _'=' : Boolean[1] := op =
	 *   '=';
	 * var _'if' : astm::Equal[?] := if _'='
	 *   then astm::Equal{}
	 *   else null
	 *   endif;
	 * set aBinaryExpression.operator := _'if';
	 * 
	 */
	protected boolean MAP_m_relExp_ast_relOp(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp lRelExp_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lRelExp_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lRelExp_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable relOp relOp = lRelExp_1.getRelOp();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull BinaryExpression oclAsType = ClassUtil.nonNullState((BinaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_BinaryExpression_0));
				if (relOp == null) {
					throw throwNull(lRelExp_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::relOp::op\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String op = relOp.getOp();
				final /*@Thrown*/ boolean symbol_1 = STR_eq.equals(op);
				/*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.Nullable Equal symbol_3;
				if (symbol_1) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Equal_0 = idResolver.getClass(CLSSid_Equal, null);
					final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Equal symbol_2 = (Equal)TYP_astm_c_c_Equal_0.createInstance();
					symbol_3 = symbol_2;
				}
				else {
					symbol_3 = null;
				}
				// mapping statements
				oclAsType.setOperator(symbol_3);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_relExp_ast_relOp = ValueUtil.TRUE_VALUE;
				raw_ast = m_relExp_ast_relOp;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_relExp_ast_relOp", e);
		}
	}
	
	/**
	 * 
	 * map m_relExp_ast_right in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lRelExp  : delphi::relExp[1];
	 * var ast : astm::Visitable[1] := lRelExp.ast;
	 * var right : delphi::simpleExpression[?] := lRelExp.right;
	 * var aBinaryExpression : astm::BinaryExpression[1] := ast.oclAsType(astm::BinaryExpression)
	 *   ;
	 * var ast1 : astm::Visitable[?] := right.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aBinaryExpression.rightOperand := aExpression;
	 * 
	 */
	protected boolean MAP_m_relExp_ast_right(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull relExp lRelExp_2)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lRelExp_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lRelExp_2, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable simpleExpression right = lRelExp_2.getRight();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull BinaryExpression oclAsType = ClassUtil.nonNullState((BinaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_BinaryExpression_0));
				if (right == null) {
					throw throwNull(lRelExp_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = right.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				// mapping statements
				oclAsType.setRightOperand(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_relExp_ast_right = ValueUtil.TRUE_VALUE;
				raw_ast = m_relExp_ast_right;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_relExp_ast_right", e);
		}
	}
	
	/**
	 * 
	 * map m_statement_ast_statement in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lStatement  : delphi::statement[1];
	 * var statement : delphi::unlabelledStatement[?] := lStatement.statement;
	 * var ast : astm::Visitable[?] := statement.ast;
	 * var aStatement : astm::Statement[1] := ast.oclAsType(astm::Statement);
	 * set lStatement.ast := aStatement;
	 * 
	 */
	protected boolean MAP_m_statement_ast_statement(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull statement lStatement)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable unlabelledStatement statement = lStatement.getStatement();
			if (statement == null) {
				throw throwNull(lStatement, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
			}
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = statement.getAst();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Statement_0));
			// mapping statements
			lStatement.setAst(oclAsType);
			final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_statement_ast_statement = ValueUtil.TRUE_VALUE;
			return m_statement_ast_statement;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_statement_ast_statement", e);
		}
	}
	
	/**
	 * 
	 * map m_tryStmt_ast_final in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lTryStmt  : delphi::tryStmt[1];
	 * var ast : astm::Visitable[1] := lTryStmt.ast;
	 * var final : delphi::stmtList[?] := lTryStmt.final;
	 * var aTryStatement : astm::TryStatement[1] := ast.oclAsType(astm::TryStatement)
	 *   ;
	 * var statments : OrderedSet(delphi::statement)[*|1] := final.statments;
	 * var first : delphi::statement[?] := statments->first()
	 *   ;
	 * var ast1 : astm::Visitable[?] := first.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement);
	 * check ast1 = first.ast;
	 * set aTryStatement.finalStatement := aStatement;
	 * 
	 */
	protected boolean MAP_m_tryStmt_ast_final(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull tryStmt lTryStmt_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lTryStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lTryStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable stmtList symbol_1 = lTryStmt_0.getFinal();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_TryStatement_0 = idResolver.getClass(CLSSid_TryStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull TryStatement oclAsType = ClassUtil.nonNullState((TryStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_TryStatement_0));
				if (symbol_1 == null) {
					throw throwNull(lTryStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::stmtList::statments\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<statement> statments = symbol_1.getStatments();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_statments = idResolver.createOrderedSetOfAll(ORD_CLSSid_statement, statments);
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable statement first = (statement)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_statments);
				if (first == null) {
					throw throwNull(lTryStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = first.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				// mapping statements
				oclAsType.setFinalStatement(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_tryStmt_ast_final = ValueUtil.TRUE_VALUE;
				raw_ast = m_tryStmt_ast_final;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_tryStmt_ast_final", e);
		}
	}
	
	/**
	 * 
	 * map m_tryStmt_ast_stmtList in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lTryStmt  : delphi::tryStmt[1];
	 * var ast : astm::Visitable[1] := lTryStmt.ast;
	 * var stmtList : delphi::stmtList[?] := lTryStmt.stmtList;
	 * var aTryStatement : astm::TryStatement[1] := ast.oclAsType(astm::TryStatement)
	 *   ;
	 * var statments : OrderedSet(delphi::statement)[*|1] := stmtList.statments;
	 * var first : delphi::statement[?] := statments->first()
	 *   ;
	 * var ast1 : astm::Visitable[?] := first.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement);
	 * check ast1 = first.ast;
	 * set aTryStatement.guardedStatement := aStatement;
	 * 
	 */
	protected boolean MAP_m_tryStmt_ast_stmtList(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull tryStmt lTryStmt_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lTryStmt_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lTryStmt_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable stmtList stmtList = lTryStmt_1.getStmtList();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_TryStatement_0 = idResolver.getClass(CLSSid_TryStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull TryStatement oclAsType = ClassUtil.nonNullState((TryStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_TryStatement_0));
				if (stmtList == null) {
					throw throwNull(lTryStmt_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::stmtList::statments\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<statement> statments = stmtList.getStatments();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_statments = idResolver.createOrderedSetOfAll(ORD_CLSSid_statement, statments);
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable statement first = (statement)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_statments);
				if (first == null) {
					throw throwNull(lTryStmt_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = first.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				// mapping statements
				oclAsType.setGuardedStatement(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_tryStmt_ast_stmtList = ValueUtil.TRUE_VALUE;
				raw_ast = m_tryStmt_ast_stmtList;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_tryStmt_ast_stmtList", e);
		}
	}
	
	/**
	 * 
	 * map m_typeDecl_ast_id in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lTypeDecl  : delphi::typeDecl[1];
	 * var ast : astm::Visitable[1] := lTypeDecl.ast;
	 * var id : delphi::ident[?] := lTypeDecl.id;
	 * var aTypeDefinition : astm::TypeDefinition[1] := ast.oclAsType(astm::TypeDefinition)
	 *   ;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aTypeDefinition.name := Name;
	 * 
	 */
	protected boolean MAP_m_typeDecl_ast_id(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull typeDecl lTypeDecl_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lTypeDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lTypeDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable ident id = lTypeDecl_0.getId();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_TypeDefinition_0 = idResolver.getClass(CLSSid_TypeDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull TypeDefinition oclAsType = ClassUtil.nonNullState((TypeDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_TypeDefinition_0));
				if (id == null) {
					throw throwNull(lTypeDecl_0, "Null source for \'delphi::ident::extract() : String[?]\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_ident_extract.evaluate(id);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
				CTORid_nameString.initValue(symbol_2, extract);
				// mapping statements
				oclAsType.setName(symbol_2);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_typeDecl_ast_id = ValueUtil.TRUE_VALUE;
				raw_ast = m_typeDecl_ast_id;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_typeDecl_ast_id", e);
		}
	}
	
	/**
	 * 
	 * map m_type_ast0 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lType  : delphi::type[1];
	 * check lType.oclIsTypeOf(delphi::type);
	 * set lType.ast := null;
	 * 
	 */
	protected boolean MAP_m_type_ast0(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull type lType)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_type_0_0 = idResolver.getClass(CLSSid_type, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lType, TYP_delphi_c_c_type_0_0).booleanValue();
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lType.setAst(null);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_type_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_type_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_type_ast0", e);
		}
	}
	
	/**
	 * 
	 * map m_unit_ast_id in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lUnit  : delphi::unit[1];
	 * var SourceFile : astm::SourceFile[1] := astm::SourceFile{
	 *   }
	 *   ;
	 * var SourceLocation : astm::SourceLocation[1] := astm::SourceLocation{inSourceFile = SourceFile
	 *   }
	 *   ;
	 * var ast : astm::Visitable[1] := lUnit.ast;
	 * var id : delphi::ident[?] := lUnit.id;
	 * var aDelphiUnit : astm::DelphiUnit[1] := ast.oclAsType(astm::DelphiUnit)
	 *   ;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aDelphiUnit.language := 'Delphi';
	 * set aDelphiUnit.locationInfo := SourceLocation;
	 * set aDelphiUnit.name := Name;
	 * 
	 */
	protected boolean MAP_m_unit_ast_id(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit lUnit_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_SourceFile_0 = idResolver.getClass(CLSSid_SourceFile, null);
			final /*@NonInvalid*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull SourceFile symbol_0 = (SourceFile)TYP_astm_c_c_SourceFile_0.createInstance();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_inSourceFile = idResolver.getProperty(PROPid_inSourceFile);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_SourceLocation_0 = idResolver.getClass(CLSSid_SourceLocation, null);
			final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull SourceLocation symbol_2 = (SourceLocation)TYP_astm_c_c_SourceLocation_0.createInstance();
			CTORid_inSourceFile.initValue(symbol_2, symbol_0);
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lUnit_0.getAst();
			final /*@Thrown*/ boolean symbol_3 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_3) {
				if (ast == null) {
					throw throwNull(lUnit_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable ident id = lUnit_0.getId();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiUnit_0 = idResolver.getClass(CLSSid_DelphiUnit, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiUnit oclAsType = ClassUtil.nonNullState((DelphiUnit)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiUnit_0));
				if (id == null) {
					throw throwNull(lUnit_0, "Null source for \'delphi::ident::extract() : String[?]\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_ident_extract.evaluate(id);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_5 = (Name)TYP_astm_c_c_Name_0.createInstance();
				CTORid_nameString.initValue(symbol_5, extract);
				// mapping statements
				oclAsType.setLanguage(STR_Delphi);
				oclAsType.setLocationInfo(symbol_2);
				oclAsType.setName(symbol_5);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_unit_ast_id = ValueUtil.TRUE_VALUE;
				raw_ast = m_unit_ast_id;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_unit_ast_id", e);
		}
	}
	
	/**
	 * 
	 * map m_unit_ast_implementationSect in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lUnit  : delphi::unit[1];
	 * var ast : astm::Visitable[1] := lUnit.ast;
	 * var implementationSect : delphi::implementationSection[?] := lUnit.implementationSect;
	 * var aDelphiUnit : astm::DelphiUnit[1] := ast.oclAsType(astm::DelphiUnit)
	 *   ;
	 * var ast1 : astm::Visitable[?] := implementationSect.ast;
	 * var aDelphiImplementationSection : astm::DelphiImplementationSection[1] := ast1.oclAsType(astm::DelphiImplementationSection);
	 * set aDelphiUnit.implementation := aDelphiImplementationSection;
	 * 
	 */
	protected boolean MAP_m_unit_ast_implementationSect(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit lUnit_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lUnit_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lUnit_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable implementationSection implementationSect = lUnit_1.getImplementationSect();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiUnit_0 = idResolver.getClass(CLSSid_DelphiUnit, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiUnit oclAsType = ClassUtil.nonNullState((DelphiUnit)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiUnit_0));
				if (implementationSect == null) {
					throw throwNull(lUnit_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = implementationSect.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiImplementationSection_0 = idResolver.getClass(CLSSid_DelphiImplementationSection, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiImplementationSection oclAsType_0 = ClassUtil.nonNullState((DelphiImplementationSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DelphiImplementationSection_0));
				// mapping statements
				oclAsType.setImplementation(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_unit_ast_implementationSect = ValueUtil.TRUE_VALUE;
				raw_ast = m_unit_ast_implementationSect;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_unit_ast_implementationSect", e);
		}
	}
	
	/**
	 * 
	 * map m_unit_ast_interfaceSect in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lUnit  : delphi::unit[1];
	 * var ast : astm::Visitable[1] := lUnit.ast;
	 * var interfaceSect : delphi::interfaceSection[?] := lUnit.interfaceSect;
	 * var aDelphiUnit : astm::DelphiUnit[1] := ast.oclAsType(astm::DelphiUnit)
	 *   ;
	 * var ast1 : astm::Visitable[?] := interfaceSect.ast;
	 * var aDelphiInterfaceSection : astm::DelphiInterfaceSection[1] := ast1.oclAsType(astm::DelphiInterfaceSection);
	 * set aDelphiUnit.interface := aDelphiInterfaceSection;
	 * 
	 */
	protected boolean MAP_m_unit_ast_interfaceSect(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unit lUnit_2)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lUnit_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lUnit_2, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable interfaceSection interfaceSect = lUnit_2.getInterfaceSect();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiUnit_0 = idResolver.getClass(CLSSid_DelphiUnit, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiUnit oclAsType = ClassUtil.nonNullState((DelphiUnit)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiUnit_0));
				if (interfaceSect == null) {
					throw throwNull(lUnit_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = interfaceSect.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiInterfaceSection_0 = idResolver.getClass(CLSSid_DelphiInterfaceSection, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiInterfaceSection oclAsType_0 = ClassUtil.nonNullState((DelphiInterfaceSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DelphiInterfaceSection_0));
				// mapping statements
				oclAsType.setInterface(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_unit_ast_interfaceSect = ValueUtil.TRUE_VALUE;
				raw_ast = m_unit_ast_interfaceSect;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_unit_ast_interfaceSect", e);
		}
	}
	
	/**
	 * 
	 * map m_unlabelledStatement_ast0 in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lUnlabelledStatement  : delphi::unlabelledStatement[1];
	 * check lUnlabelledStatement.oclIsTypeOf(delphi::unlabelledStatement);
	 * set lUnlabelledStatement.ast := null;
	 * 
	 */
	protected boolean MAP_m_unlabelledStatement_ast0(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull unlabelledStatement lUnlabelledStatement)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_delphi_c_c_unlabelledStatement_0_0 = idResolver.getClass(CLSSid_unlabelledStatement, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lUnlabelledStatement, TYP_delphi_c_c_unlabelledStatement_0_0).booleanValue();
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lUnlabelledStatement.setAst(null);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_unlabelledStatement_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_unlabelledStatement_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_unlabelledStatement_ast0", e);
		}
	}
	
	/**
	 * 
	 * map m_varDecl_ast_idList in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lVarDecl  : delphi::varDecl[1];
	 * var ast : astm::Visitable[1] := lVarDecl.ast;
	 * var idList : delphi::identList[?] := lVarDecl.idList;
	 * var aVariableDefinition : astm::VariableDefinition[1] := ast.oclAsType(astm::VariableDefinition)
	 *   ;
	 * var extract : String[?] := idList.extract()
	 *   ;
	 * var Name : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aVariableDefinition.isMutable := true;
	 * set aVariableDefinition.identifierName := Name;
	 * 
	 */
	protected boolean MAP_m_varDecl_ast_idList(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull varDecl lVarDecl_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lVarDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lVarDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable identList idList = lVarDecl_0.getIdList();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_VariableDefinition_0));
				if (idList == null) {
					throw throwNull(lVarDecl_0, "Null source for \'delphi::identList::extract() : String[?]\'");
				}
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String extract = INST_identList_extract.evaluate(idList);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
				CTORid_nameString.initValue(symbol_2, extract);
				// mapping statements
				oclAsType.setIsMutable(ValueUtil.TRUE_VALUE);
				oclAsType.setIdentifierName(symbol_2);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_varDecl_ast_idList = ValueUtil.TRUE_VALUE;
				raw_ast = m_varDecl_ast_idList;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_varDecl_ast_idList", e);
		}
	}
	
	/**
	 * 
	 * map m_varDecl_ast_type in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lVarDecl  : delphi::varDecl[1];
	 * var ast : astm::Visitable[1] := lVarDecl.ast;
	 * var type : delphi::type[?] := lVarDecl.type;
	 * var aVariableDefinition : astm::VariableDefinition[1] := ast.oclAsType(astm::VariableDefinition)
	 *   ;
	 * var ast1 : astm::Visitable[?] := type.ast;
	 * var aTypeReference : astm::TypeReference[1] := ast1.oclAsType(astm::TypeReference);
	 * set aVariableDefinition.definitionType := aTypeReference;
	 * 
	 */
	protected boolean MAP_m_varDecl_ast_type(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull varDecl lVarDecl_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lVarDecl_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lVarDecl_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable type type = lVarDecl_1.getType();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_VariableDefinition_0));
				if (type == null) {
					throw throwNull(lVarDecl_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = type.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_TypeReference_0 = idResolver.getClass(CLSSid_TypeReference, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull TypeReference oclAsType_0 = ClassUtil.nonNullState((TypeReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_TypeReference_0));
				// mapping statements
				oclAsType.setDefinitionType(oclAsType_0);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_varDecl_ast_type = ValueUtil.TRUE_VALUE;
				raw_ast = m_varDecl_ast_type;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_varDecl_ast_type", e);
		}
	}
	
	/**
	 * 
	 * map m_withStmt_ast_stmt in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lWithStmt  : delphi::withStmt[1];
	 * var ast : astm::Visitable[1] := lWithStmt.ast;
	 * var stmt : delphi::statement[?] := lWithStmt.stmt;
	 * var aDelphiWithStatement : astm::DelphiWithStatement[1] := ast.oclAsType(astm::DelphiWithStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := stmt.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement)
	 *   ;
	 * var OrderedSet : OrderedSet(astm::Statement)[*|1] := OrderedSet{aStatement
	 *   };
	 * set aDelphiWithStatement.subStatements := OrderedSet;
	 * 
	 */
	protected boolean MAP_m_withStmt_ast_stmt(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull withStmt lWithStmt_0)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lWithStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lWithStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable statement stmt = lWithStmt_0.getStmt();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiWithStatement_0 = idResolver.getClass(CLSSid_DelphiWithStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiWithStatement oclAsType = ClassUtil.nonNullState((DelphiWithStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiWithStatement_0));
				if (stmt == null) {
					throw throwNull(lWithStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = stmt.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_Statement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Statement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Statement.class, OrderedSet);
				oclAsType.getSubStatements().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_withStmt_ast_stmt = ValueUtil.TRUE_VALUE;
				raw_ast = m_withStmt_ast_stmt;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_withStmt_ast_stmt", e);
		}
	}
	
	/**
	 * 
	 * map m_withStmt_ast_vars in Delphi_qvtp_qvtcas {
	 * 
	 *   guard:leftCS lWithStmt  : delphi::withStmt[1];
	 * var ast : astm::Visitable[1] := lWithStmt.ast;
	 * var vars : delphi::identList[?] := lWithStmt.vars;
	 * var aDelphiWithStatement : astm::DelphiWithStatement[1] := ast.oclAsType(astm::DelphiWithStatement)
	 *   ;
	 * var ids : OrderedSet(delphi::ident)[*|1] := vars.ids;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::DefinitionObject) := ids->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::DefinitionObject));
	 * set aDelphiWithStatement.withs := _'\u00ABcollect\u00BB';
	 * 
	 */
	protected boolean MAP_m_withStmt_ast_vars(final /*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull withStmt lWithStmt_1)  {
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast = lWithStmt_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lWithStmt_1, "Null where non-null value required");
				}
				final /*@Thrown*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.Nullable identList vars = lWithStmt_1.getVars();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DelphiWithStatement_0 = idResolver.getClass(CLSSid_DelphiWithStatement, null);
				final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DelphiWithStatement oclAsType = ClassUtil.nonNullState((DelphiWithStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiWithStatement_0));
				if (vars == null) {
					throw throwNull(lWithStmt_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::identList::ids\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ident> ids = vars.getIds();
				final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ids = idResolver.createOrderedSetOfAll(ORD_CLSSid_ident, ids);
				/*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_DefinitionObject);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_ids.iterator();
				/*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ org.xtext.example.delphi.delphi.@org.eclipse.jdt.annotation.NonNull ident _1 = (ident)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(astm::DefinitionObject)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_astm_c_c_DefinitionObject_0 = idResolver.getClass(CLSSid_DefinitionObject, null);
					final /*@Thrown*/ org.xtext.example.delphi.astm.util.@org.eclipse.jdt.annotation.Nullable Visitable ast_0 = _1.getAst();
					final /*@Thrown*/ org.xtext.example.delphi.astm.@org.eclipse.jdt.annotation.NonNull DefinitionObject oclAsType_0 = ClassUtil.nonNullState((DefinitionObject)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DefinitionObject_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<DefinitionObject> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DefinitionObject.class, collect);
				oclAsType.getWiths().addAll(ECORE_collect);
				final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean m_withStmt_ast_vars = ValueUtil.TRUE_VALUE;
				raw_ast = m_withStmt_ast_vars;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_withStmt_ast_vars", e);
		}
	}
}
