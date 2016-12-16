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
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.qvtd.runtime.evaluation.Connection;
import org.eclipse.qvtd.runtime.evaluation.TransformationExecutor;
import org.eclipse.qvtd.runtime.internal.cs2as.AbstractCS2ASTransformer;
import org.eclipse.qvtd.runtime.library.model.ModelObjectsOfKindOperation;
import org.xtext.example.delphi.astm.ActualParameterExpression;
import org.xtext.example.delphi.astm.Add;
import org.xtext.example.delphi.astm.Assign;
import org.xtext.example.delphi.astm.AstmFactory;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.BinaryExpression;
import org.xtext.example.delphi.astm.BlockStatement;
import org.xtext.example.delphi.astm.CaseBlock;
import org.xtext.example.delphi.astm.CatchBlock;
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
import org.xtext.example.delphi.astm.Multiply;
import org.xtext.example.delphi.astm.Name;
import org.xtext.example.delphi.astm.NameReference;
import org.xtext.example.delphi.astm.NewExpression;
import org.xtext.example.delphi.astm.Not;
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
import org.xtext.example.delphi.astm.UnaryExpression;
import org.xtext.example.delphi.astm.VariableDefinition;
import org.xtext.example.delphi.astm.lookup.LookupEnvironment;
import org.xtext.example.delphi.astm.lookup.LookupPackage;
import org.xtext.example.delphi.astm.lookup.util.AstmLookupSolver;
import org.xtext.example.delphi.astm.util.Visitable;
import org.xtext.example.delphi.delphi.ConstExp;
import org.xtext.example.delphi.delphi.DelphiPackage;
import org.xtext.example.delphi.delphi.MineID;
import org.xtext.example.delphi.delphi.MultipleConstExp;
import org.xtext.example.delphi.delphi.MultipleId;
import org.xtext.example.delphi.delphi.RecordConstExp;
import org.xtext.example.delphi.delphi.ReservedId;
import org.xtext.example.delphi.delphi.addExp;
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
import org.xtext.example.delphi.delphi.exceptionBlock;
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
import org.xtext.example.delphi.delphi.multExp;
import org.xtext.example.delphi.delphi.procedureDecl;
import org.xtext.example.delphi.delphi.procedureHeading;
import org.xtext.example.delphi.delphi.recordConstExpr;
import org.xtext.example.delphi.delphi.relExp;
import org.xtext.example.delphi.delphi.relOp;
import org.xtext.example.delphi.delphi.reservedWord;
import org.xtext.example.delphi.delphi.simpleExpression;
import org.xtext.example.delphi.delphi.simpleFactor;
import org.xtext.example.delphi.delphi.statement;
import org.xtext.example.delphi.delphi.stmtList;
import org.xtext.example.delphi.delphi.term;
import org.xtext.example.delphi.delphi.tryStmt;
import org.xtext.example.delphi.delphi.type;
import org.xtext.example.delphi.delphi.typeDecl;
import org.xtext.example.delphi.delphi.typeSection;
import org.xtext.example.delphi.delphi.unit;
import org.xtext.example.delphi.delphi.unlabelledStatement;
import org.xtext.example.delphi.delphi.varDecl;
import org.xtext.example.delphi.delphi.varSection;
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
	public static final /*@NonInvalid*/ @NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_modelum_es_s_modernization_s_astm = IdManager.getNsURIPackageId("http://modelum.es/modernization/astm", null, AstmPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/2015/QVTbaseLibrary", "qvtbaselib", null);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi = IdManager.getNsURIPackageId("http://www.xtext.org/example/delphi/Delphi", null, DelphiPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull NsURIPackageId PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_delphi_s_lookup = IdManager.getNsURIPackageId("http://xtext.eclipse.org/example/delphi/lookup", null, LookupPackage.eINSTANCE);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ActualParameter = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("ActualParameter", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ActualParameterExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("ActualParameterExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Add = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Add", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Assign = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Assign", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_BinaryExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("BinaryExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_BlockStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("BlockStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CaseBlock = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("CaseBlock", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CatchBlock = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("CatchBlock", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CompilationUnit = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("CompilationUnit", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ConstExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ConstExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Definition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Definition", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DefinitionObject = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DefinitionObject", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DelphiBlockStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiBlockStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DelphiFunctionCallExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiFunctionCallExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DelphiImplementationSection = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiImplementationSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DelphiInterfaceSection = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiInterfaceSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DelphiUnit = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiUnit", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DelphiWithStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("DelphiWithStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Equal = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Equal", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Expression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Expression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ExpressionStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("ExpressionStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_FunctionCallExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("FunctionCallExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_FunctionDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("FunctionDefinition", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IdentifierReference = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("IdentifierReference", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IfStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("IfStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IntegerLiteral = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("IntegerLiteral", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LabelDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("LabelDefinition", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_xtext_eclipse_org_s_example_s_delphi_s_lookup.getClassId("LookupEnvironment", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MineID = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("MineID", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Model = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_2015_s_QVTbaseLibrary.getClassId("Model", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MultipleConstExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("MultipleConstExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MultipleId = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("MultipleId", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Multiply = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Multiply", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Name = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Name", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_NameReference = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("NameReference", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_NewExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("NewExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Not = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Not", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OtherSyntaxObject = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("OtherSyntaxObject", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Project = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Project", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_QualifiedOverData = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("QualifiedOverData", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_RecordConstExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("RecordConstExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ReservedId = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ReservedId", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_SourceFile = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("SourceFile", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_SourceLocation = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("SourceLocation", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Statement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Statement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_StringLiteral = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("StringLiteral", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_SwitchStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("SwitchStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TryStatement = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("TryStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TypeDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("TypeDefinition", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TypeReference = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("TypeReference", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_UnaryExpression = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("UnaryExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_VariableDefinition = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("VariableDefinition", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Visitable = PACKid_http_c_s_s_modelum_es_s_modernization_s_astm.getClassId("Visitable", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_addExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("addExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_assignmentStmnt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("assignmentStmnt", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_block = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("block", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_callStmnt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("callStmnt", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_caseLabel = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("caseLabel", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_caseSelector = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("caseSelector", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_caseStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("caseStmt", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_compoundStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("compoundStmt", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_constExpr = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("constExpr", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_constSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("constSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_constantDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("constantDecl", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_declSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("declSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_designator = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("designator", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_designatorPart = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("designatorPart", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_designatorSubPart = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("designatorSubPart", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_exceptionBlock = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("exceptionBlock", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_exprList = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("exprList", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_expression = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("expression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_factor = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("factor", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_file = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("file", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_functionDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("functionDecl", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_functionHeading = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("functionHeading", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ident = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ident", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_identList = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("identList", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ifStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("ifStmt", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_implementationSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("implementationSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_interfaceDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("interfaceDecl", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_interfaceSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("interfaceSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_labelDeclSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("labelDeclSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_mainRule = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("mainRule", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_multExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("multExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_procedureDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("procedureDecl", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_procedureHeading = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("procedureHeading", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_recordConstExpr = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("recordConstExpr", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_relExp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("relExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_relOp = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("relOp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_reservedWord = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("reservedWord", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_simpleExpression = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("simpleExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_simpleFactor = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("simpleFactor", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_statement = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("statement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_stmtList = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("stmtList", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_term = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("term", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_tryStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("tryStmt", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_type = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("type", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_typeDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("typeDecl", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_typeSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("typeSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_unit = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("unit", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_unlabelledStatement = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("unlabelledStatement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_varDecl = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("varDecl", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_varSection = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("varSection", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_withStmt = PACKid_http_c_s_s_www_xtext_org_s_example_s_delphi_s_Delphi.getClassId("withStmt", 0);
	public static final /*@NonInvalid*/ @NonNull IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_NULLid = TypeId.SEQUENCE.getSpecializedId(TypeId.OCL_VOID);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ @NonNull String STR_ = "";
	public static final /*@NonInvalid*/ @NonNull String STR_Delphi = "Delphi";
	public static final /*@NonInvalid*/ @NonNull String STR__0 = ".";
	public static final /*@NonInvalid*/ @NonNull String STR_eq = "=";
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId COL_CLSSid_ActualParameterExpression = TypeId.COLLECTION.getSpecializedId(CLSSid_ActualParameterExpression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId COL_CLSSid_DefinitionObject = TypeId.COLLECTION.getSpecializedId(CLSSid_DefinitionObject);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_ActualParameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ActualParameter);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_BlockStatement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_BlockStatement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_CatchBlock = TypeId.ORDERED_SET.getSpecializedId(CLSSid_CatchBlock);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_CompilationUnit = TypeId.ORDERED_SET.getSpecializedId(CLSSid_CompilationUnit);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Definition = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Definition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_DefinitionObject = TypeId.ORDERED_SET.getSpecializedId(CLSSid_DefinitionObject);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_DelphiBlockStatement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_DelphiBlockStatement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_FunctionDefinition = TypeId.ORDERED_SET.getSpecializedId(CLSSid_FunctionDefinition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Statement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Statement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_VariableDefinition = TypeId.ORDERED_SET.getSpecializedId(CLSSid_VariableDefinition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_caseLabel = TypeId.ORDERED_SET.getSpecializedId(CLSSid_caseLabel);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_caseSelector = TypeId.ORDERED_SET.getSpecializedId(CLSSid_caseSelector);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_constExpr = TypeId.ORDERED_SET.getSpecializedId(CLSSid_constExpr);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_constantDecl = TypeId.ORDERED_SET.getSpecializedId(CLSSid_constantDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_declSection = TypeId.ORDERED_SET.getSpecializedId(CLSSid_declSection);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_expression = TypeId.ORDERED_SET.getSpecializedId(CLSSid_expression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_ident = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ident);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_interfaceDecl = TypeId.ORDERED_SET.getSpecializedId(CLSSid_interfaceDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_recordConstExpr = TypeId.ORDERED_SET.getSpecializedId(CLSSid_recordConstExpr);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_statement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_statement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_typeDecl = TypeId.ORDERED_SET.getSpecializedId(CLSSid_typeDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_varDecl = TypeId.ORDERED_SET.getSpecializedId(CLSSid_varDecl);
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_actualParams = CLSSid_FunctionCallExpression.getPropertyId("actualParams");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_calledFunction = CLSSid_FunctionCallExpression.getPropertyId("calledFunction");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_inSourceFile = CLSSid_SourceLocation.getPropertyId("inSourceFile");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_leftOperand = CLSSid_BinaryExpression.getPropertyId("leftOperand");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_nameString = CLSSid_Name.getPropertyId("nameString");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_operator = CLSSid_BinaryExpression.getPropertyId("operator");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_parentEnv = CLSSid_LookupEnvironment.getPropertyId("parentEnv");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_rightOperand = CLSSid_BinaryExpression.getPropertyId("rightOperand");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_subStatements = CLSSid_BlockStatement.getPropertyId("subStatements");
	public static final /*@NonInvalid*/ @NonNull PropertyId PROPid_value_0 = CLSSid_ActualParameterExpression.getPropertyId("value");
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_ActualParameterExpression = TypeId.SEQUENCE.getSpecializedId(CLSSid_ActualParameterExpression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_CaseBlock = TypeId.SEQUENCE.getSpecializedId(CLSSid_CaseBlock);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Definition = TypeId.SEQUENCE.getSpecializedId(CLSSid_Definition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_DefinitionObject = TypeId.SEQUENCE.getSpecializedId(CLSSid_DefinitionObject);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Expression = TypeId.SEQUENCE.getSpecializedId(CLSSid_Expression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_FunctionDefinition = TypeId.SEQUENCE.getSpecializedId(CLSSid_FunctionDefinition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Statement = TypeId.SEQUENCE.getSpecializedId(CLSSid_Statement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_TypeDefinition = TypeId.SEQUENCE.getSpecializedId(CLSSid_TypeDefinition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_VariableDefinition = TypeId.SEQUENCE.getSpecializedId(CLSSid_VariableDefinition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Visitable = TypeId.SEQUENCE.getSpecializedId(CLSSid_Visitable);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_constExpr = TypeId.SEQUENCE.getSpecializedId(CLSSid_constExpr);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_declSection = TypeId.SEQUENCE.getSpecializedId(CLSSid_declSection);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_exprList = TypeId.SEQUENCE.getSpecializedId(CLSSid_exprList);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_ConstExp = TypeId.SET.getSpecializedId(CLSSid_ConstExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Expression = TypeId.SET.getSpecializedId(CLSSid_Expression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_MultipleConstExp = TypeId.SET.getSpecializedId(CLSSid_MultipleConstExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_RecordConstExp = TypeId.SET.getSpecializedId(CLSSid_RecordConstExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_addExp = TypeId.SET.getSpecializedId(CLSSid_addExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_assignmentStmnt = TypeId.SET.getSpecializedId(CLSSid_assignmentStmnt);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_block = TypeId.SET.getSpecializedId(CLSSid_block);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_callStmnt = TypeId.SET.getSpecializedId(CLSSid_callStmnt);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_caseSelector = TypeId.SET.getSpecializedId(CLSSid_caseSelector);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_caseStmt = TypeId.SET.getSpecializedId(CLSSid_caseStmt);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_compoundStmt = TypeId.SET.getSpecializedId(CLSSid_compoundStmt);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_constExpr = TypeId.SET.getSpecializedId(CLSSid_constExpr);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_constantDecl = TypeId.SET.getSpecializedId(CLSSid_constantDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_declSection = TypeId.SET.getSpecializedId(CLSSid_declSection);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_designator = TypeId.SET.getSpecializedId(CLSSid_designator);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_exceptionBlock = TypeId.SET.getSpecializedId(CLSSid_exceptionBlock);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_exprList = TypeId.SET.getSpecializedId(CLSSid_exprList);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_expression = TypeId.SET.getSpecializedId(CLSSid_expression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_factor = TypeId.SET.getSpecializedId(CLSSid_factor);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_file = TypeId.SET.getSpecializedId(CLSSid_file);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_functionDecl = TypeId.SET.getSpecializedId(CLSSid_functionDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_ifStmt = TypeId.SET.getSpecializedId(CLSSid_ifStmt);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_implementationSection = TypeId.SET.getSpecializedId(CLSSid_implementationSection);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_interfaceSection = TypeId.SET.getSpecializedId(CLSSid_interfaceSection);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_labelDeclSection = TypeId.SET.getSpecializedId(CLSSid_labelDeclSection);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_mainRule = TypeId.SET.getSpecializedId(CLSSid_mainRule);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_multExp = TypeId.SET.getSpecializedId(CLSSid_multExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_procedureDecl = TypeId.SET.getSpecializedId(CLSSid_procedureDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_relExp = TypeId.SET.getSpecializedId(CLSSid_relExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_simpleFactor = TypeId.SET.getSpecializedId(CLSSid_simpleFactor);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_statement = TypeId.SET.getSpecializedId(CLSSid_statement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_tryStmt = TypeId.SET.getSpecializedId(CLSSid_tryStmt);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_type = TypeId.SET.getSpecializedId(CLSSid_type);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_typeDecl = TypeId.SET.getSpecializedId(CLSSid_typeDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_unit = TypeId.SET.getSpecializedId(CLSSid_unit);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_unlabelledStatement = TypeId.SET.getSpecializedId(CLSSid_unlabelledStatement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_varDecl = TypeId.SET.getSpecializedId(CLSSid_varDecl);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_withStmt = TypeId.SET.getSpecializedId(CLSSid_withStmt);
	public static final /*@NonInvalid*/ @NonNull SequenceValue Sequence_0 = ValueUtil.createSequenceOfEach(SEQ_NULLid);

	/*
	 * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
	 */
	private static final @NonNull ClassId[] classIndex2classId = new @NonNull ClassId[]{
		CLSSid_ConstExp,                      // 0 => ConstExp
		CLSSid_MultipleConstExp,              // 1 => MultipleConstExp
		CLSSid_RecordConstExp,                // 2 => RecordConstExp
		CLSSid_addExp,                        // 3 => addExp
		CLSSid_assignmentStmnt,               // 4 => assignmentStmnt
		CLSSid_block,                         // 5 => block
		CLSSid_callStmnt,                     // 6 => callStmnt
		CLSSid_caseSelector,                  // 7 => caseSelector
		CLSSid_caseStmt,                      // 8 => caseStmt
		CLSSid_compoundStmt,                  // 9 => compoundStmt
		CLSSid_constExpr,                     // 10 => constExpr
		CLSSid_constantDecl,                  // 11 => constantDecl
		CLSSid_designator,                    // 12 => designator
		CLSSid_exceptionBlock,                // 13 => exceptionBlock
		CLSSid_expression,                    // 14 => expression
		CLSSid_factor,                        // 15 => factor
		CLSSid_file,                          // 16 => file
		CLSSid_functionDecl,                  // 17 => functionDecl
		CLSSid_ifStmt,                        // 18 => ifStmt
		CLSSid_implementationSection,         // 19 => implementationSection
		CLSSid_interfaceSection,              // 20 => interfaceSection
		CLSSid_labelDeclSection,              // 21 => labelDeclSection
		CLSSid_mainRule,                      // 22 => mainRule
		CLSSid_multExp,                       // 23 => multExp
		CLSSid_procedureDecl,                 // 24 => procedureDecl
		CLSSid_relExp,                        // 25 => relExp
		CLSSid_simpleFactor,                  // 26 => simpleFactor
		CLSSid_statement,                     // 27 => statement
		CLSSid_tryStmt,                       // 28 => tryStmt
		CLSSid_type,                          // 29 => type
		CLSSid_typeDecl,                      // 30 => typeDecl
		CLSSid_unit,                          // 31 => unit
		CLSSid_unlabelledStatement,           // 32 => unlabelledStatement
		CLSSid_varDecl,                       // 33 => varDecl
		CLSSid_withStmt                       // 34 => withStmt
	};

	/*
	 * Mapping from each ClassIndex to all the ClassIndexes to which an object of the outer index
	 * may contribute results to an allInstances() invocation.
	 * Non trivial inner arrays arise when one ClassId is a derivation of another and so an
	 * instance of the derived classId contributes to derived and inherited ClassIndexes.
	 */
	private final static int @NonNull [] @NonNull [] classIndex2allClassIndexes = new int @NonNull [] @NonNull [] {
		{0,10},                       // 0 : ConstExp -> {ConstExp,constExpr}
		{1,10},                       // 1 : MultipleConstExp -> {MultipleConstExp,constExpr}
		{2,10},                       // 2 : RecordConstExp -> {RecordConstExp,constExpr}
		{3,14},                       // 3 : addExp -> {addExp,expression}
		{4,32},                       // 4 : assignmentStmnt -> {assignmentStmnt,unlabelledStatement}
		{5},                          // 5 : block -> {block}
		{6,32},                       // 6 : callStmnt -> {callStmnt,unlabelledStatement}
		{7},                          // 7 : caseSelector -> {caseSelector}
		{8,32},                       // 8 : caseStmt -> {caseStmt,unlabelledStatement}
		{9,32},                       // 9 : compoundStmt -> {compoundStmt,unlabelledStatement}
		{10},                         // 10 : constExpr -> {constExpr}
		{11},                         // 11 : constantDecl -> {constantDecl}
		{12},                         // 12 : designator -> {designator}
		{13},                         // 13 : exceptionBlock -> {exceptionBlock}
		{14},                         // 14 : expression -> {expression}
		{15,14},                      // 15 : factor -> {factor,expression}
		{16},                         // 16 : file -> {file}
		{17},                         // 17 : functionDecl -> {functionDecl}
		{18,32},                      // 18 : ifStmt -> {ifStmt,unlabelledStatement}
		{19},                         // 19 : implementationSection -> {implementationSection}
		{20},                         // 20 : interfaceSection -> {interfaceSection}
		{21},                         // 21 : labelDeclSection -> {labelDeclSection}
		{22},                         // 22 : mainRule -> {mainRule}
		{23,14},                      // 23 : multExp -> {multExp,expression}
		{24},                         // 24 : procedureDecl -> {procedureDecl}
		{25,14},                      // 25 : relExp -> {relExp,expression}
		{26,14,15},                   // 26 : simpleFactor -> {simpleFactor,expression,factor}
		{27},                         // 27 : statement -> {statement}
		{28,32},                      // 28 : tryStmt -> {tryStmt,unlabelledStatement}
		{29},                         // 29 : type -> {type}
		{30},                         // 30 : typeDecl -> {typeDecl}
		{31,16},                      // 31 : unit -> {unit,file}
		{32},                         // 32 : unlabelledStatement -> {unlabelledStatement}
		{33},                         // 33 : varDecl -> {varDecl}
		{34,32}                       // 34 : withStmt -> {withStmt,unlabelledStatement}
	};

	private final AstmLookupSolver lookupSolver = new AstmLookupSolver(executor);

	public Delphi_qvtp_qvtcas(final @NonNull TransformationExecutor executor) {
		super(executor, new @NonNull String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
	}

	@Override
	public boolean run() {
		return MAP_r___root__() && invocationManager.flush();
	}

	/**
	 * delphi::ident::extract() : String[?]
	 *
	 * null
	 */
	public class CACHE_ident_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull ident self_0 = (/*@NonInvalid*/ @NonNull ident)sourceAndArgumentValues[0];
			return null;
		}

		public String evaluate(final /*@NonInvalid*/ @NonNull ident self_0) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_0});
		}
	}

	protected final @NonNull CACHE_ident_extract INST_ident_extract = new CACHE_ident_extract();

	/**
	 * delphi::MineID::extract() : String[?]
	 *
	 * first
	 */
	public class CACHE_MineID_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull MineID self_1 = (/*@NonInvalid*/ @NonNull MineID)sourceAndArgumentValues[0];
			final /*@Thrown*/ @Nullable String first = self_1.getFirst();
			return first;
		}

		public String evaluate(final /*@NonInvalid*/ @NonNull MineID self_1) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_1});
		}
	}

	protected final @NonNull CACHE_MineID_extract INST_MineID_extract = new CACHE_MineID_extract();

	/**
	 * delphi::ReservedId::extract() : String[?]
	 *
	 * reservedWord.id
	 */
	public class CACHE_ReservedId_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull ReservedId self_2 = (/*@NonInvalid*/ @NonNull ReservedId)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_reservedWord_0 = idResolver.getClass(CLSSid_reservedWord, null);
			final /*@Thrown*/ @Nullable String id = ((reservedWord)TYP_delphi_c_c_reservedWord_0).getId();
			return id;
		}

		public String evaluate(final /*@NonInvalid*/ @NonNull ReservedId self_2) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_2});
		}
	}

	protected final @NonNull CACHE_ReservedId_extract INST_ReservedId_extract = new CACHE_ReservedId_extract();

	/**
	 * delphi::MultipleId::extract() : String[?]
	 *
	 * id->iterate(x; acc : String[?] = '' |
	 *   if self.id->indexOf(x) = 1
	 *   then acc + x
	 *   else acc + '.' + x
	 *   endif)
	 */
	public class CACHE_MultipleId_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull MultipleId self_3 = (/*@NonInvalid*/ @NonNull MultipleId)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<String> id = self_3.getId();
			final /*@Thrown*/ @NonNull SequenceValue BOXED_id = idResolver.createSequenceOfAll(SEQ_PRIMid_String, id);
			/*@NonInvalid*/ @Nullable String acc = STR_;
			@NonNull Iterator<Object> ITERATOR_x = BOXED_id.iterator();
			/*@Thrown*/ @Nullable String iterate;
			while (true) {
				if (!ITERATOR_x.hasNext()) {
					iterate = acc;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull String x = (String)ITERATOR_x.next();
				/**
				 *
				 * if self.id->indexOf(x) = 1
				 * then acc + x
				 * else acc + '.' + x
				 * endif
				 */
				final /*@Thrown*/ @NonNull IntegerValue indexOf = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_id, x);
				final /*@Thrown*/ boolean eq = indexOf.equals(INT_1);
				/*@Thrown*/ @NonNull String symbol_0;
				if (eq) {
					final /*@Thrown*/ @NonNull String sum = StringConcatOperation.INSTANCE.evaluate(acc, x);
					symbol_0 = sum;
				}
				else {
					final /*@Thrown*/ @NonNull String sum_0 = StringConcatOperation.INSTANCE.evaluate(acc, STR__0);
					final /*@Thrown*/ @NonNull String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, x);
					symbol_0 = sum_1;
				}
				//
				acc = symbol_0;
			}
			return iterate;
		}

		public String evaluate(final /*@NonInvalid*/ @NonNull MultipleId self_3) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_3});
		}
	}

	protected final @NonNull CACHE_MultipleId_extract INST_MultipleId_extract = new CACHE_MultipleId_extract();

	/**
	 * delphi::identList::extract() : String[?]
	 *
	 * ids->first().extract()
	 */
	public class CACHE_identList_extract extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull identList self_4 = (/*@NonInvalid*/ @NonNull identList)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<ident> ids = self_4.getIds();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_ids = idResolver.createOrderedSetOfAll(ORD_CLSSid_ident, ids);
			final /*@Thrown*/ @Nullable ident first = (ident)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_ids);
			if (first == null) {
				throw new InvalidValueException("Null source for \'delphi::ident::extract() : String[?]\'");
			}
			final /*@Thrown*/ @Nullable String extract = INSTANCE_ident_extract.evaluate(first);
			return extract;
		}

		public String evaluate(final /*@NonInvalid*/ @NonNull identList self_4) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_4});
		}
	}

	protected final @NonNull CACHE_identList_extract INSTANCE_identList_extract = new CACHE_identList_extract();

	/**
	 * delphi::procedureDecl::getFragments() : Sequence(astm::FunctionDefinition)
	 *
	 * Sequence{self.ast.oclAsType(astm::FunctionDefinition)}
	 */
	public class CACHE_procedureDecl_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull procedureDecl self_5 = (/*@NonInvalid*/ @NonNull procedureDecl)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ @Nullable Visitable ast = self_5.getAst();
			final /*@Thrown*/ @NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
			final /*@Thrown*/ @NonNull SequenceValue Sequence = ValueUtil.createSequenceOfEach(SEQ_CLSSid_FunctionDefinition, oclAsType);
			return Sequence;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull procedureDecl self_5) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_5});
		}
	}

	protected final @NonNull CACHE_procedureDecl_getFragments INST_procedureDecl_getFragments = new CACHE_procedureDecl_getFragments();

	/**
	 * delphi::functionDecl::getFragments() : Sequence(astm::FunctionDefinition)
	 *
	 * Sequence{self.ast.oclAsType(astm::FunctionDefinition)}
	 */
	public class CACHE_functionDecl_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull functionDecl self_6 = (/*@NonInvalid*/ @NonNull functionDecl)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ @Nullable Visitable ast = self_6.getAst();
			final /*@Thrown*/ @NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
			final /*@Thrown*/ @NonNull SequenceValue Sequence = ValueUtil.createSequenceOfEach(SEQ_CLSSid_FunctionDefinition, oclAsType);
			return Sequence;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull functionDecl self_6) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_6});
		}
	}

	protected final @NonNull CACHE_functionDecl_getFragments INST_functionDecl_getFragments = new CACHE_functionDecl_getFragments();

	/**
	 * delphi::declSection::getFragments() : Sequence(astm::DefinitionObject)
	 *
	 * Sequence{}
	 */
	public class CACHE_declSection_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull declSection self_7 = (/*@NonInvalid*/ @NonNull declSection)sourceAndArgumentValues[0];
			return Sequence_0;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull declSection self_7) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_7});
		}
	}

	protected final @NonNull CACHE_declSection_getFragments INST_declSection_getFragments = new CACHE_declSection_getFragments();

	/**
	 * delphi::varSection::getFragments() : Sequence(astm::VariableDefinition)
	 *
	 * self.varDecls.ast.oclAsType(astm::VariableDefinition)
	 */
	public class CACHE_varSection_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull varSection self_8 = (/*@NonInvalid*/ @NonNull varSection)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<varDecl> varDecls = self_8.getVarDecls();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_varDecls = idResolver.createOrderedSetOfAll(ORD_CLSSid_varDecl, varDecls);
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Visitable);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_varDecls.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect_0 = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull varDecl _1 = (varDecl)ITERATOR__1.next();
				/**
				 * ast
				 */
				final /*@Thrown*/ @Nullable Visitable ast = _1.getAst();
				//
				accumulator.add(ast);
			}
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_VariableDefinition);
			@Nullable Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ @Nullable Visitable _1_0 = (Visitable)ITERATOR__1_0.next();
				/**
				 * oclAsType(astm::VariableDefinition)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ @NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_astm_c_c_VariableDefinition_0));
				//
				accumulator_0.add(oclAsType);
			}
			return collect;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull varSection self_8) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_8});
		}
	}

	protected final @NonNull CACHE_varSection_getFragments INST_varSection_getFragments = new CACHE_varSection_getFragments();

	/**
	 * delphi::typeSection::getFragments() : Sequence(astm::TypeDefinition)
	 *
	 * self.typeDecl.ast.oclAsType(astm::TypeDefinition)
	 */
	public class CACHE_typeSection_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull typeSection self_9 = (/*@NonInvalid*/ @NonNull typeSection)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<typeDecl> typeDecl = self_9.getTypeDecl();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_typeDecl = idResolver.createOrderedSetOfAll(ORD_CLSSid_typeDecl, typeDecl);
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Visitable);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_typeDecl.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect_0 = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull typeDecl _1 = (typeDecl)ITERATOR__1.next();
				/**
				 * ast
				 */
				final /*@Thrown*/ @Nullable Visitable ast = _1.getAst();
				//
				accumulator.add(ast);
			}
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_TypeDefinition);
			@Nullable Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ @Nullable Visitable _1_0 = (Visitable)ITERATOR__1_0.next();
				/**
				 * oclAsType(astm::TypeDefinition)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_TypeDefinition_0 = idResolver.getClass(CLSSid_TypeDefinition, null);
				final /*@Thrown*/ @NonNull TypeDefinition oclAsType = ClassUtil.nonNullState((TypeDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_astm_c_c_TypeDefinition_0));
				//
				accumulator_0.add(oclAsType);
			}
			return collect;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull typeSection self_9) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_9});
		}
	}

	protected final @NonNull CACHE_typeSection_getFragments INST_typeSection_getFragments = new CACHE_typeSection_getFragments();

	/**
	 * delphi::constSection::getFragments() : Sequence(astm::VariableDefinition)
	 *
	 * self.constantDecl.ast.oclAsType(astm::VariableDefinition)
	 */
	public class CACHE_constSection_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull constSection self_10 = (/*@NonInvalid*/ @NonNull constSection)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<constantDecl> constantDecl = self_10.getConstantDecl();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_constantDecl = idResolver.createOrderedSetOfAll(ORD_CLSSid_constantDecl, constantDecl);
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Visitable);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_constantDecl.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect_0 = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull constantDecl _1 = (constantDecl)ITERATOR__1.next();
				/**
				 * ast
				 */
				final /*@Thrown*/ @Nullable Visitable ast = _1.getAst();
				//
				accumulator.add(ast);
			}
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_VariableDefinition);
			@Nullable Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ @Nullable Visitable _1_0 = (Visitable)ITERATOR__1_0.next();
				/**
				 * oclAsType(astm::VariableDefinition)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ @NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_astm_c_c_VariableDefinition_0));
				//
				accumulator_0.add(oclAsType);
			}
			return collect;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull constSection self_10) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_10});
		}
	}

	protected final @NonNull CACHE_constSection_getFragments INST_constSection_getFragments = new CACHE_constSection_getFragments();

	/**
	 * delphi::interfaceDecl::getFragments() : Sequence(astm::DefinitionObject)
	 *
	 * Sequence{}
	 */
	public class CACHE_interfaceDecl_getFragments extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull interfaceDecl self_11 = (/*@NonInvalid*/ @NonNull interfaceDecl)sourceAndArgumentValues[0];
			return Sequence_0;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull interfaceDecl self_11) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_11});
		}
	}

	protected final @NonNull CACHE_interfaceDecl_getFragments INST_interfaceDecl_getFragments = new CACHE_interfaceDecl_getFragments();

	/**
	 * delphi::exprList::createActualParams() : Sequence(astm::ActualParameterExpression)
	 *
	 *
	 * self.exps->collect(x |
	 *   astm::ActualParameterExpression{
	 *     value = x.ast.oclAsType(astm::Expression)
	 *   })
	 */
	public class CACHE_exprList_createActualParams extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull exprList self_12 = (/*@NonInvalid*/ @NonNull exprList)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<expression> exps = self_12.getExps();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_exps = idResolver.createOrderedSetOfAll(ORD_CLSSid_expression, exps);
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_ActualParameterExpression);
			@NonNull Iterator<Object> ITERATOR_x = BOXED_exps.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR_x.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull expression x = (expression)ITERATOR_x.next();
				/**
				 *
				 * astm::ActualParameterExpression{
				 *   value = x.ast.oclAsType(astm::Expression)
				 * }
				 */
				final /*@NonInvalid*/ @NonNull Property CTORid_value = idResolver.getProperty(PROPid_value_0);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_ActualParameterExpression_0 = idResolver.getClass(CLSSid_ActualParameterExpression, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ @NonNull ActualParameterExpression symbol_0 = (ActualParameterExpression)TYP_astm_c_c_ActualParameterExpression_0.createInstance();
				final /*@Thrown*/ @Nullable Visitable ast = x.getAst();
				final /*@Thrown*/ @NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
				CTORid_value.initValue(symbol_0, oclAsType);
				//
				accumulator.add(symbol_0);
			}
			return collect;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull exprList self_12) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_12});
		}
	}

	protected final @NonNull CACHE_exprList_createActualParams INSTANCE_exprList_createActualParams = new CACHE_exprList_createActualParams();

	/**
	 * astm::Visitable::_lookupFunctionDefinition(env : lookup::LookupEnvironment[?], fName : String[?]) : OrderedSet(astm::FunctionDefinition)
	 *
	 *
	 * let
	 *   foundFunctionDefinition : OrderedSet(astm::FunctionDefinition) = env.namedElements->selectByKind(FunctionDefinition)
	 *   ->select(identifierName.nameString = fName)
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
	public class CACHE_Visitable__lookupFunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_14 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable LookupEnvironment env = (/*@NonInvalid*/ @Nullable LookupEnvironment)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @Nullable String fName = (/*@NonInvalid*/ @Nullable String)sourceAndArgumentValues[2];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_foundFunctionDefinition;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				if (env == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/delphi/lookup\'::LookupEnvironment::namedElements\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<Definition> namedElements = env.getNamedElements();
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_Definition, namedElements);
				final /*@Thrown*/ @NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_namedElements, TYP_astm_c_c_FunctionDefinition_0);
				/*@Thrown*/ OrderedSetValue.@NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_FunctionDefinition);
				@NonNull Iterator<Object> ITERATOR__1 = selectByKind.iterator();
				/*@Thrown*/ @NonNull OrderedSetValue foundFunctionDefinition;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						foundFunctionDefinition = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull FunctionDefinition _1 = (FunctionDefinition)ITERATOR__1.next();
					/**
					 * identifierName.nameString = fName
					 */
					final /*@Thrown*/ @Nullable Name identifierName = _1.getIdentifierName();
					if (identifierName == null) {
						throw new InvalidValueException("Null source for \'\'http://modelum.es/modernization/astm\'::Name::nameString\'");
					}
					final /*@Thrown*/ @Nullable String nameString = identifierName.getNameString();
					final /*@Thrown*/ boolean eq = (nameString != null) ? nameString.equals(fName) : (fName == null);
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
						throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/delphi/lookup\'::LookupEnvironment::parentEnv\'");
					}
					final /*@Thrown*/ @Nullable LookupEnvironment parentEnv = env.getParentEnv();
					final /*@Thrown*/ boolean eq_0 = parentEnv == null;
					CAUGHT_eq_0 = eq_0;
				}
				catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq_0);
				CAUGHT_not = not;
			}
			catch (Exception e) {
				CAUGHT_not = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ @Nullable Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_isEmpty, CAUGHT_not);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ @NonNull OrderedSetValue symbol_0;
			if (and) {
				if (env == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/delphi/lookup\'::LookupEnvironment::parentEnv\'");
				}
				final /*@Thrown*/ @Nullable LookupEnvironment parentEnv_0 = env.getParentEnv();
				final /*@Thrown*/ @NonNull OrderedSetValue _lookupFunctionDefinition = INSTANCE_Visitable__lookupFunctionDefinition.evaluate(self_14, parentEnv_0, fName);
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

		@SuppressWarnings("null")
		public @NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ @NonNull Visitable self_14, final /*@NonInvalid*/ @Nullable LookupEnvironment env, final /*@NonInvalid*/ @Nullable String fName) {
			return (@NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_14, env, fName});
		}
	}

	protected final @NonNull CACHE_Visitable__lookupFunctionDefinition INSTANCE_Visitable__lookupFunctionDefinition = new CACHE_Visitable__lookupFunctionDefinition();

	/**
	 * astm::Visitable::parentEnv_FunctionDefinition() : lookup::LookupEnvironment[1]
	 *
	 *
	 * let parent : OclElement[?] = oclContainer()
	 * in
	 *   if parent = null
	 *   then lookup::LookupEnvironment{}
	 *   else
	 *     parent.oclAsType(Visitable)
	 *     ._unqualified_env_FunctionDefinition(self)
	 *   endif
	 */
	public class CACHE_Visitable_parentEnv_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_17 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ @Nullable Object parent = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, self_17);
			final /*@NonInvalid*/ boolean eq = parent == null;
			/*@Thrown*/ @NonNull LookupEnvironment symbol_1;
			if (eq) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
				final /*@NonInvalid*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
				symbol_1 = symbol_0;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Visitable_0 = idResolver.getClass(CLSSid_Visitable, null);
				final /*@Thrown*/ @NonNull Visitable oclAsType = ClassUtil.nonNullState((Visitable)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, parent, TYP_astm_c_c_Visitable_0));
				final /*@Thrown*/ @NonNull LookupEnvironment _unqualified_env_FunctionDefinition = INSTANCE_Visitable__unqualified_env_FunctionDefinition.evaluate(oclAsType, self_17);
				symbol_1 = _unqualified_env_FunctionDefinition;
			}
			return symbol_1;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_17) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_17});
		}
	}

	protected final @NonNull CACHE_Visitable_parentEnv_FunctionDefinition INSTANCE_Visitable_parentEnv_FunctionDefinition = new CACHE_Visitable_parentEnv_FunctionDefinition();

	/**
	 * astm::CompilationUnit::_unqualified_env_FunctionDefinition(child : astm::Visitable[?]) : lookup::LookupEnvironment[?]
	 *
	 *
	 * parentEnv_FunctionDefinition()
	 * .nestedEnv()
	 * .addElements(fragments->selectByKind(FunctionDefinition))
	 */
	public class CACHE_CompilationUnit__unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull CompilationUnit self_16 = (/*@NonInvalid*/ @NonNull CompilationUnit)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Visitable child = (/*@NonInvalid*/ @Nullable Visitable)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ @NonNull LookupEnvironment self_27 = INSTANCE_Visitable_parentEnv_FunctionDefinition.evaluate(self_16);
			final /*@NonInvalid*/ @NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_27);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<DefinitionObject> fragments = self_16.getFragments();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_fragments = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, fragments);
			final /*@Thrown*/ @NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_fragments, TYP_astm_c_c_FunctionDefinition_0);
			final /*@Thrown*/ @NonNull List<FunctionDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(FunctionDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}

		public LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull CompilationUnit self_16, final /*@NonInvalid*/ @Nullable Visitable child) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_16, child});
		}
	}

	protected final @NonNull CACHE_CompilationUnit__unqualified_env_FunctionDefinition INST_CompilationUnit__unqualified_env_FunctionDefinition = new CACHE_CompilationUnit__unqualified_env_FunctionDefinition();

	/**
	 * astm::Visitable::_unqualified_env_FunctionDefinition(child : astm::Visitable[?]) : lookup::LookupEnvironment[1]
	 *
	 * parentEnv_FunctionDefinition()
	 */
	public class CACHE_Visitable__unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_18 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Visitable child_0 = (/*@NonInvalid*/ @Nullable Visitable)sourceAndArgumentValues[1];
			final /*@Thrown*/ @NonNull LookupEnvironment parentEnv_FunctionDefinition = INSTANCE_Visitable_parentEnv_FunctionDefinition.evaluate(self_18);
			return parentEnv_FunctionDefinition;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_18, final /*@NonInvalid*/ @Nullable Visitable child_0) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_18, child_0});
		}
	}

	protected final @NonNull CACHE_Visitable__unqualified_env_FunctionDefinition INST_Visitable__unqualified_env_FunctionDefinition = new CACHE_Visitable__unqualified_env_FunctionDefinition();

	/**
	 * astm::DelphiBlockStatement::_unqualified_env_FunctionDefinition(child : astm::Visitable[?]) : lookup::LookupEnvironment[?]
	 *
	 *
	 * parentEnv_FunctionDefinition()
	 * .nestedEnv()
	 * .addElements(declarations->selectByKind(FunctionDefinition))
	 */
	public class CACHE_DelphiBlockStatement__unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull DelphiBlockStatement self_19 = (/*@NonInvalid*/ @NonNull DelphiBlockStatement)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Visitable child_1 = (/*@NonInvalid*/ @Nullable Visitable)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
			final /*@Thrown*/ @NonNull LookupEnvironment self_27 = INSTANCE_Visitable_parentEnv_FunctionDefinition.evaluate(self_19);
			final /*@NonInvalid*/ @NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_27);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<DefinitionObject> declarations = self_19.getDeclarations();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_declarations = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, declarations);
			final /*@Thrown*/ @NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_declarations, TYP_astm_c_c_FunctionDefinition_0);
			final /*@Thrown*/ @NonNull List<FunctionDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(FunctionDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}

		public LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull DelphiBlockStatement self_19, final /*@NonInvalid*/ @Nullable Visitable child_1) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_19, child_1});
		}
	}

	protected final @NonNull CACHE_DelphiBlockStatement__unqualified_env_FunctionDefinition INST_DelphiBlockStatement__unqualified_env_FunctionDefinition = new CACHE_DelphiBlockStatement__unqualified_env_FunctionDefinition();

	/**
	 * astm::Visitable::unqualified_env_FunctionDefinition() : lookup::LookupEnvironment[1]
	 *
	 * _unqualified_env_FunctionDefinition(null)
	 */
	public class CACHE_Visitable_unqualified_env_FunctionDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_15 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@Thrown*/ @NonNull LookupEnvironment _unqualified_env_FunctionDefinition = INSTANCE_Visitable__unqualified_env_FunctionDefinition.evaluate(self_15, null);
			return _unqualified_env_FunctionDefinition;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_15) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_15});
		}
	}

	protected final @NonNull CACHE_Visitable_unqualified_env_FunctionDefinition INSTANCE_Visitable_unqualified_env_FunctionDefinition = new CACHE_Visitable_unqualified_env_FunctionDefinition();

	/**
	 * astm::Visitable::_lookupVariableDefinition(env : lookup::LookupEnvironment[?], vName : String[?]) : OrderedSet(astm::VariableDefinition)
	 *
	 *
	 * let
	 *   foundVariableDefinition : OrderedSet(astm::VariableDefinition) = env.namedElements->selectByKind(VariableDefinition)
	 *   ->select(identifierName.nameString = vName)
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
	public class CACHE_Visitable__lookupVariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_20 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable LookupEnvironment env_0 = (/*@NonInvalid*/ @Nullable LookupEnvironment)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @Nullable String vName = (/*@NonInvalid*/ @Nullable String)sourceAndArgumentValues[2];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_foundVariableDefinition;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				if (env_0 == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/delphi/lookup\'::LookupEnvironment::namedElements\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<Definition> namedElements = env_0.getNamedElements();
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_Definition, namedElements);
				final /*@Thrown*/ @NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_namedElements, TYP_astm_c_c_VariableDefinition_0);
				/*@Thrown*/ OrderedSetValue.@NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_VariableDefinition);
				@NonNull Iterator<Object> ITERATOR__1 = selectByKind.iterator();
				/*@Thrown*/ @NonNull OrderedSetValue foundVariableDefinition;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						foundVariableDefinition = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull VariableDefinition _1 = (VariableDefinition)ITERATOR__1.next();
					/**
					 * identifierName.nameString = vName
					 */
					final /*@Thrown*/ @Nullable Name identifierName = _1.getIdentifierName();
					if (identifierName == null) {
						throw new InvalidValueException("Null source for \'\'http://modelum.es/modernization/astm\'::Name::nameString\'");
					}
					final /*@Thrown*/ @Nullable String nameString = identifierName.getNameString();
					final /*@Thrown*/ boolean eq = (nameString != null) ? nameString.equals(vName) : (vName == null);
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
						throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/delphi/lookup\'::LookupEnvironment::parentEnv\'");
					}
					final /*@Thrown*/ @Nullable LookupEnvironment parentEnv = env_0.getParentEnv();
					final /*@Thrown*/ boolean eq_0 = parentEnv == null;
					CAUGHT_eq_0 = eq_0;
				}
				catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq_0);
				CAUGHT_not = not;
			}
			catch (Exception e) {
				CAUGHT_not = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ @Nullable Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_isEmpty, CAUGHT_not);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@Thrown*/ @NonNull OrderedSetValue symbol_0;
			if (and) {
				if (env_0 == null) {
					throw new InvalidValueException("Null source for \'\'http://xtext.eclipse.org/example/delphi/lookup\'::LookupEnvironment::parentEnv\'");
				}
				final /*@Thrown*/ @Nullable LookupEnvironment parentEnv_0 = env_0.getParentEnv();
				final /*@Thrown*/ @NonNull OrderedSetValue _lookupVariableDefinition = INSTANCE_Visitable__lookupVariableDefinition.evaluate(self_20, parentEnv_0, vName);
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

		@SuppressWarnings("null")
		public @NonNull OrderedSetValue evaluate(final /*@NonInvalid*/ @NonNull Visitable self_20, final /*@NonInvalid*/ @Nullable LookupEnvironment env_0, final /*@NonInvalid*/ @Nullable String vName) {
			return (@NonNull OrderedSetValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_20, env_0, vName});
		}
	}

	protected final @NonNull CACHE_Visitable__lookupVariableDefinition INSTANCE_Visitable__lookupVariableDefinition = new CACHE_Visitable__lookupVariableDefinition();

	/**
	 * astm::Visitable::parentEnv_VariableDefinition() : lookup::LookupEnvironment[1]
	 *
	 *
	 * let parent : OclElement[?] = oclContainer()
	 * in
	 *   if parent = null
	 *   then lookup::LookupEnvironment{}
	 *   else
	 *     parent.oclAsType(Visitable)
	 *     ._unqualified_env_VariableDefinition(self)
	 *   endif
	 */
	public class CACHE_Visitable_parentEnv_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_23 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ @Nullable Object parent = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, self_23);
			final /*@NonInvalid*/ boolean eq = parent == null;
			/*@Thrown*/ @NonNull LookupEnvironment symbol_1;
			if (eq) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
				final /*@NonInvalid*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
				symbol_1 = symbol_0;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Visitable_0 = idResolver.getClass(CLSSid_Visitable, null);
				final /*@Thrown*/ @NonNull Visitable oclAsType = ClassUtil.nonNullState((Visitable)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, parent, TYP_astm_c_c_Visitable_0));
				final /*@Thrown*/ @NonNull LookupEnvironment _unqualified_env_VariableDefinition = INSTANCE_Visitable__unqualified_env_VariableDefinition.evaluate(oclAsType, self_23);
				symbol_1 = _unqualified_env_VariableDefinition;
			}
			return symbol_1;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_23) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_23});
		}
	}

	protected final @NonNull CACHE_Visitable_parentEnv_VariableDefinition INSTANCE_Visitable_parentEnv_VariableDefinition = new CACHE_Visitable_parentEnv_VariableDefinition();

	/**
	 * astm::Visitable::_unqualified_env_VariableDefinition(child : astm::Visitable[?]) : lookup::LookupEnvironment[1]
	 *
	 * parentEnv_VariableDefinition()
	 */
	public class CACHE_Visitable__unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_22 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Visitable child_2 = (/*@NonInvalid*/ @Nullable Visitable)sourceAndArgumentValues[1];
			final /*@Thrown*/ @NonNull LookupEnvironment parentEnv_VariableDefinition = INSTANCE_Visitable_parentEnv_VariableDefinition.evaluate(self_22);
			return parentEnv_VariableDefinition;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_22, final /*@NonInvalid*/ @Nullable Visitable child_2) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_22, child_2});
		}
	}

	protected final @NonNull CACHE_Visitable__unqualified_env_VariableDefinition INST_Visitable__unqualified_env_VariableDefinition = new CACHE_Visitable__unqualified_env_VariableDefinition();

	/**
	 * astm::CompilationUnit::_unqualified_env_VariableDefinition(child : astm::Visitable[?]) : lookup::LookupEnvironment[?]
	 *
	 *
	 * parentEnv_VariableDefinition()
	 * .nestedEnv()
	 * .addElements(fragments->selectByKind(VariableDefinition))
	 */
	public class CACHE_CompilationUnit__unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull CompilationUnit self_24 = (/*@NonInvalid*/ @NonNull CompilationUnit)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Visitable child_3 = (/*@NonInvalid*/ @Nullable Visitable)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
			final /*@Thrown*/ @NonNull LookupEnvironment self_27 = INSTANCE_Visitable_parentEnv_VariableDefinition.evaluate(self_24);
			final /*@NonInvalid*/ @NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_27);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<DefinitionObject> fragments = self_24.getFragments();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_fragments = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, fragments);
			final /*@Thrown*/ @NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_fragments, TYP_astm_c_c_VariableDefinition_0);
			final /*@Thrown*/ @NonNull List<VariableDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(VariableDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}

		public LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull CompilationUnit self_24, final /*@NonInvalid*/ @Nullable Visitable child_3) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_24, child_3});
		}
	}

	protected final @NonNull CACHE_CompilationUnit__unqualified_env_VariableDefinition INST_CompilationUnit__unqualified_env_VariableDefinition = new CACHE_CompilationUnit__unqualified_env_VariableDefinition();

	/**
	 * astm::DelphiBlockStatement::_unqualified_env_VariableDefinition(child : astm::Visitable[?]) : lookup::LookupEnvironment[?]
	 *
	 *
	 * parentEnv_VariableDefinition()
	 * .nestedEnv()
	 * .addElements(declarations->selectByKind(VariableDefinition))
	 */
	public class CACHE_DelphiBlockStatement__unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull DelphiBlockStatement self_25 = (/*@NonInvalid*/ @NonNull DelphiBlockStatement)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @Nullable Visitable child_4 = (/*@NonInvalid*/ @Nullable Visitable)sourceAndArgumentValues[1];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
			final /*@Thrown*/ @NonNull LookupEnvironment self_27 = INSTANCE_Visitable_parentEnv_VariableDefinition.evaluate(self_25);
			final /*@NonInvalid*/ @NonNull Property CTORid_parentEnv = idResolver.getProperty(PROPid_parentEnv);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
			final /*@Thrown*/ @NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
			CTORid_parentEnv.initValue(symbol_0, self_27);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<DefinitionObject> declarations = self_25.getDeclarations();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_declarations = idResolver.createOrderedSetOfAll(ORD_CLSSid_DefinitionObject, declarations);
			final /*@Thrown*/ @NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_declarations, TYP_astm_c_c_VariableDefinition_0);
			final /*@Thrown*/ @NonNull List<VariableDefinition> ECORE_selectByKind = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(VariableDefinition.class, selectByKind);
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull LookupEnvironment addElements = symbol_0.addElements(ECORE_selectByKind);
			return addElements;
		}

		public LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull DelphiBlockStatement self_25, final /*@NonInvalid*/ @Nullable Visitable child_4) {
			return (LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_25, child_4});
		}
	}

	protected final @NonNull CACHE_DelphiBlockStatement__unqualified_env_VariableDefinition INST_DelphiBlockStatement__unqualified_env_VariableDefinition = new CACHE_DelphiBlockStatement__unqualified_env_VariableDefinition();

	/**
	 * astm::Visitable::unqualified_env_VariableDefinition() : lookup::LookupEnvironment[1]
	 *
	 * _unqualified_env_VariableDefinition(null)
	 */
	public class CACHE_Visitable_unqualified_env_VariableDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull Visitable self_21 = (/*@NonInvalid*/ @NonNull Visitable)sourceAndArgumentValues[0];
			final /*@Thrown*/ @NonNull LookupEnvironment _unqualified_env_VariableDefinition = INSTANCE_Visitable__unqualified_env_VariableDefinition.evaluate(self_21, null);
			return _unqualified_env_VariableDefinition;
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_21) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_21});
		}
	}

	protected final @NonNull CACHE_Visitable_unqualified_env_VariableDefinition INSTANCE_Visitable_unqualified_env_VariableDefinition = new CACHE_Visitable_unqualified_env_VariableDefinition();

	/**
	 * delphi::designator::getDefinition() : astm::Definition[?]
	 *
	 *
	 * let
	 *   method : astm::FunctionDefinition[?] = ast.oclAsType(astm::NameReference)
	 *   .lookupFunctionDefinition(subpart.part.id)
	 * in
	 *   if method <> null
	 *   then method
	 *   else
	 *     ast.oclAsType(astm::NameReference)
	 *     .lookupVariableDefinition(subpart.part.id)
	 *   endif
	 */
	public class CACHE_designator_getDefinition extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull designator self_13 = (/*@NonInvalid*/ @NonNull designator)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_NameReference_1 = idResolver.getClass(CLSSid_NameReference, null);
			final /*@Thrown*/ @Nullable Visitable ast_0 = self_13.getAst();
			final /*@Thrown*/ @NonNull NameReference self_28 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_NameReference_1));
			final /*@Thrown*/ @Nullable designatorSubPart subpart = self_13.getSubpart();
			if (subpart == null) {
				throw new InvalidValueException("Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
			}
			final /*@Thrown*/ @Nullable designatorPart part = subpart.getPart();
			if (part == null) {
				throw new InvalidValueException("Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorPart::id\'");
			}
			final /*@Thrown*/ @Nullable String fName_0 = part.getId();
			final /*@Thrown*/ @NonNull LookupEnvironment unqualified_env_FunctionDefinition = INSTANCE_Visitable_unqualified_env_FunctionDefinition.evaluate(self_28);
			final /*@Thrown*/ @NonNull OrderedSetValue foundFunctionDefinition = INSTANCE_Visitable__lookupFunctionDefinition.evaluate(self_28, unqualified_env_FunctionDefinition, fName_0);
			final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(foundFunctionDefinition).booleanValue();
			/*@Thrown*/ @Nullable FunctionDefinition symbol_0;
			if (isEmpty) {
				symbol_0 = null;
			}
			else {
				final /*@Thrown*/ @Nullable FunctionDefinition first = (FunctionDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundFunctionDefinition);
				symbol_0 = first;
			}
			final /*@Thrown*/ boolean ne = symbol_0 != null;
			/*@Thrown*/ @Nullable Definition symbol_2;
			if (ne) {
				symbol_2 = symbol_0;
			}
			else {
				final /*@Thrown*/ @Nullable designatorSubPart subpart_0 = self_13.getSubpart();
				if (subpart_0 == null) {
					throw new InvalidValueException("Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
				}
				final /*@Thrown*/ @Nullable designatorPart part_0 = subpart_0.getPart();
				if (part_0 == null) {
					throw new InvalidValueException("Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorPart::id\'");
				}
				final /*@Thrown*/ @Nullable String vName_0 = part_0.getId();
				final /*@Thrown*/ @NonNull LookupEnvironment unqualified_env_VariableDefinition = INSTANCE_Visitable_unqualified_env_VariableDefinition.evaluate(self_28);
				final /*@Thrown*/ @NonNull OrderedSetValue foundVariableDefinition = INSTANCE_Visitable__lookupVariableDefinition.evaluate(self_28, unqualified_env_VariableDefinition, vName_0);
				final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(foundVariableDefinition).booleanValue();
				/*@Thrown*/ @Nullable VariableDefinition symbol_1;
				if (isEmpty_0) {
					symbol_1 = null;
				}
				else {
					final /*@Thrown*/ @Nullable VariableDefinition first_0 = (VariableDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundVariableDefinition);
					symbol_1 = first_0;
				}
				symbol_2 = symbol_1;
			}
			return symbol_2;
		}

		public Definition evaluate(final /*@NonInvalid*/ @NonNull designator self_13) {
			return (Definition)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_13});
		}
	}

	protected final @NonNull CACHE_designator_getDefinition INSTANCE_designator_getDefinition = new CACHE_designator_getDefinition();

	/**
	 * delphi::withStmt::getDefinitions() : Sequence(astm::Definition)
	 *
	 *
	 * self.vars.ids->collect(x |
	 *   let
	 *     method : astm::FunctionDefinition[?] = ast.oclAsType(astm::DelphiWithStatement)
	 *     .lookupFunctionDefinition(x.extract())
	 *   in
	 *     if method <> null
	 *     then method
	 *     else
	 *       ast.oclAsType(astm::DelphiWithStatement)
	 *       .lookupVariableDefinition(x.extract())
	 *     endif)
	 * ->excluding(null)
	 */
	public class CACHE_withStmt_getDefinitions extends AbstractEvaluationOperation
	{
		@Override
		public @Nullable Object basicEvaluate(@NonNull Executor executor, @NonNull TypedElement caller, @Nullable Object @NonNull [] sourceAndArgumentValues) {
			@SuppressWarnings("null") final /*@NonInvalid*/ @NonNull withStmt self_26 = (/*@NonInvalid*/ @NonNull withStmt)sourceAndArgumentValues[0];
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable identList vars = self_26.getVars();
			if (vars == null) {
				throw new InvalidValueException("Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::identList::ids\'");
			}
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<ident> ids = vars.getIds();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_ids = idResolver.createOrderedSetOfAll(ORD_CLSSid_ident, ids);
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Definition);
			@NonNull Iterator<Object> ITERATOR_x = BOXED_ids.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR_x.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull ident x = (ident)ITERATOR_x.next();
				/**
				 *
				 * let
				 *   method : astm::FunctionDefinition[?] = ast.oclAsType(astm::DelphiWithStatement)
				 *   .lookupFunctionDefinition(x.extract())
				 * in
				 *   if method <> null
				 *   then method
				 *   else
				 *     ast.oclAsType(astm::DelphiWithStatement)
				 *     .lookupVariableDefinition(x.extract())
				 *   endif
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiWithStatement_1 = idResolver.getClass(CLSSid_DelphiWithStatement, null);
				final /*@Thrown*/ @Nullable Visitable ast_0 = self_26.getAst();
				final /*@Thrown*/ @NonNull DelphiWithStatement self_28 = ClassUtil.nonNullState((DelphiWithStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DelphiWithStatement_1));
				final /*@Thrown*/ @Nullable String fName_0 = INSTANCE_ident_extract.evaluate(x);
				final /*@Thrown*/ @NonNull LookupEnvironment unqualified_env_FunctionDefinition = INSTANCE_Visitable_unqualified_env_FunctionDefinition.evaluate(self_28);
				final /*@Thrown*/ @NonNull OrderedSetValue foundFunctionDefinition = INSTANCE_Visitable__lookupFunctionDefinition.evaluate(self_28, unqualified_env_FunctionDefinition, fName_0);
				final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(foundFunctionDefinition).booleanValue();
				/*@Thrown*/ @Nullable FunctionDefinition symbol_0;
				if (isEmpty) {
					symbol_0 = null;
				}
				else {
					final /*@Thrown*/ @Nullable FunctionDefinition first = (FunctionDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundFunctionDefinition);
					symbol_0 = first;
				}
				final /*@Thrown*/ boolean ne = symbol_0 != null;
				/*@Thrown*/ @Nullable Definition symbol_2;
				if (ne) {
					symbol_2 = symbol_0;
				}
				else {
					final /*@Thrown*/ @Nullable String vName_0 = INSTANCE_ident_extract.evaluate(x);
					final /*@Thrown*/ @NonNull LookupEnvironment unqualified_env_VariableDefinition = INSTANCE_Visitable_unqualified_env_VariableDefinition.evaluate(self_28);
					final /*@Thrown*/ @NonNull OrderedSetValue foundVariableDefinition = INSTANCE_Visitable__lookupVariableDefinition.evaluate(self_28, unqualified_env_VariableDefinition, vName_0);
					final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(foundVariableDefinition).booleanValue();
					/*@Thrown*/ @Nullable VariableDefinition symbol_1;
					if (isEmpty_0) {
						symbol_1 = null;
					}
					else {
						final /*@Thrown*/ @Nullable VariableDefinition first_0 = (VariableDefinition)OrderedCollectionFirstOperation.INSTANCE.evaluate(foundVariableDefinition);
						symbol_1 = first_0;
					}
					symbol_2 = symbol_1;
				}
				//
				accumulator.add(symbol_2);
			}
			final /*@Thrown*/ @NonNull SequenceValue excluding = (SequenceValue)CollectionExcludingOperation.INSTANCE.evaluate(collect, (Object)null);
			return excluding;
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull withStmt self_26) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_26});
		}
	}

	protected final @NonNull CACHE_withStmt_getDefinitions INSTANCE_withStmt_getDefinitions = new CACHE_withStmt_getDefinitions();

	protected class VCACHE_ident_extract extends AbstractDispatchOperation
	{
		private VCACHE_ident_extract() {
			install(ident.class, INST_ident_extract);
			install(MineID.class, INST_MineID_extract);
			install(ReservedId.class, INST_ReservedId_extract);
			install(MultipleId.class, INST_MultipleId_extract);
		}

		public String evaluate(final /*@NonInvalid*/ @NonNull ident self_0) {
			return (String)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_0});
		}
	}

	protected final @NonNull VCACHE_ident_extract INSTANCE_ident_extract = new VCACHE_ident_extract();

	protected class VCACHE_declSection_getFragments extends AbstractDispatchOperation
	{
		private VCACHE_declSection_getFragments() {
			install(procedureDecl.class, INST_procedureDecl_getFragments);
			install(functionDecl.class, INST_functionDecl_getFragments);
			install(declSection.class, INST_declSection_getFragments);
			install(varSection.class, INST_varSection_getFragments);
			install(typeSection.class, INST_typeSection_getFragments);
			install(constSection.class, INST_constSection_getFragments);
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull declSection self_7) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_7});
		}
	}

	protected final @NonNull VCACHE_declSection_getFragments INSTANCE_declSection_getFragments = new VCACHE_declSection_getFragments();

	protected class VCACHE_interfaceDecl_getFragments extends AbstractDispatchOperation
	{
		private VCACHE_interfaceDecl_getFragments() {
			install(varSection.class, INST_varSection_getFragments);
			install(interfaceDecl.class, INST_interfaceDecl_getFragments);
			install(typeSection.class, INST_typeSection_getFragments);
			install(constSection.class, INST_constSection_getFragments);
		}

		@SuppressWarnings("null")
		public @NonNull SequenceValue evaluate(final /*@NonInvalid*/ @NonNull interfaceDecl self_11) {
			return (@NonNull SequenceValue)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_11});
		}
	}

	protected final @NonNull VCACHE_interfaceDecl_getFragments INSTANCE_interfaceDecl_getFragments = new VCACHE_interfaceDecl_getFragments();

	protected class VCACHE_Visitable__unqualified_env_FunctionDefinition extends AbstractDispatchOperation
	{
		private VCACHE_Visitable__unqualified_env_FunctionDefinition() {
			install(CompilationUnit.class, INST_CompilationUnit__unqualified_env_FunctionDefinition);
			install(Visitable.class, INST_Visitable__unqualified_env_FunctionDefinition);
			install(DelphiBlockStatement.class, INST_DelphiBlockStatement__unqualified_env_FunctionDefinition);
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_18, final /*@NonInvalid*/ @Nullable Visitable child_0) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_18, child_0});
		}
	}

	protected final @NonNull VCACHE_Visitable__unqualified_env_FunctionDefinition INSTANCE_Visitable__unqualified_env_FunctionDefinition = new VCACHE_Visitable__unqualified_env_FunctionDefinition();

	protected class VCACHE_Visitable__unqualified_env_VariableDefinition extends AbstractDispatchOperation
	{
		private VCACHE_Visitable__unqualified_env_VariableDefinition() {
			install(Visitable.class, INST_Visitable__unqualified_env_VariableDefinition);
			install(CompilationUnit.class, INST_CompilationUnit__unqualified_env_VariableDefinition);
			install(DelphiBlockStatement.class, INST_DelphiBlockStatement__unqualified_env_VariableDefinition);
		}

		@SuppressWarnings("null")
		public @NonNull LookupEnvironment evaluate(final /*@NonInvalid*/ @NonNull Visitable self_22, final /*@NonInvalid*/ @Nullable Visitable child_2) {
			return (@NonNull LookupEnvironment)evaluationCache.getCachedEvaluationResult(this, caller, new @Nullable Object[]{self_22, child_2});
		}
	}

	protected final @NonNull VCACHE_Visitable__unqualified_env_VariableDefinition INSTANCE_Visitable__unqualified_env_VariableDefinition = new VCACHE_Visitable__unqualified_env_VariableDefinition();

	/**
	 *
	 * map r___root__ in Delphi_qvtp_qvtcas {
	 *
	 *   var _'\u00ABConstExp\u00BB' : Set(delphi::ConstExp)[*|?] := leftCS.objectsOfKind(delphi::ConstExp)
	 *   ;
	 * ::ji_ConstExp : delphi::ConstExp[1]var _'\u00ABMultipleConstExp\u00BB' : Set(delphi::MultipleConstExp)[*|?] := leftCS.objectsOfKind(delphi::MultipleConstExp)
	 *   ;
	 * ::ji_MultipleConstExp : delphi::MultipleConstExp[1]var _'\u00ABRecordConstExp\u00BB' : Set(delphi::RecordConstExp)[*|?] := leftCS.objectsOfKind(delphi::RecordConstExp)
	 *   ;
	 * ::ji_RecordConstExp : delphi::RecordConstExp[1]var _'\u00ABaddExp\u00BB' : Set(delphi::addExp)[*|?] := leftCS.objectsOfKind(delphi::addExp)
	 *   ;
	 * ::ji_addExp : delphi::addExp[1]var _'\u00ABassignmentStmnt\u00BB' : Set(delphi::assignmentStmnt)[*|?] := leftCS.objectsOfKind(delphi::assignmentStmnt)
	 *   ;
	 * ::ji_assignmentStmnt : delphi::assignmentStmnt[1]var _'\u00ABblock\u00BB' : Set(delphi::block)[*|?] := leftCS.objectsOfKind(delphi::block)
	 *   ;
	 * ::ji_block : delphi::block[1]var _'\u00ABcallStmnt\u00BB' : Set(delphi::callStmnt)[*|?] := leftCS.objectsOfKind(delphi::callStmnt)
	 *   ;
	 * ::ji_callStmnt : delphi::callStmnt[1]var _'\u00ABcaseSelector\u00BB' : Set(delphi::caseSelector)[*|?] := leftCS.objectsOfKind(delphi::caseSelector)
	 *   ;
	 * ::ji_caseSelector : delphi::caseSelector[1]var _'\u00ABcaseStmt\u00BB' : Set(delphi::caseStmt)[*|?] := leftCS.objectsOfKind(delphi::caseStmt)
	 *   ;
	 * ::ji_caseStmt : delphi::caseStmt[1]var _'\u00ABcompoundStmt\u00BB' : Set(delphi::compoundStmt)[*|?] := leftCS.objectsOfKind(delphi::compoundStmt)
	 *   ;
	 * ::ji_compoundStmt : delphi::compoundStmt[1]var _'\u00ABconstExpr\u00BB' : Set(delphi::constExpr)[*|?] := leftCS.objectsOfKind(delphi::constExpr)
	 *   ;
	 * ::ji_constExpr : delphi::constExpr[1]var _'\u00ABconstantDecl\u00BB' : Set(delphi::constantDecl)[*|?] := leftCS.objectsOfKind(delphi::constantDecl)
	 *   ;
	 * ::ji_constantDecl : delphi::constantDecl[1]var _'\u00ABdesignator\u00BB' : Set(delphi::designator)[*|?] := leftCS.objectsOfKind(delphi::designator)
	 *   ;
	 * ::ji_designator : delphi::designator[1]var _'\u00ABexceptionBlock\u00BB' : Set(delphi::exceptionBlock)[*|?] := leftCS.objectsOfKind(delphi::exceptionBlock)
	 *   ;
	 * ::ji_exceptionBlock : delphi::exceptionBlock[1]var _'\u00ABexpression\u00BB' : Set(delphi::expression)[*|?] := leftCS.objectsOfKind(delphi::expression)
	 *   ;
	 * ::ji_expression : delphi::expression[1]var _'\u00ABfactor\u00BB' : Set(delphi::factor)[*|?] := leftCS.objectsOfKind(delphi::factor)
	 *   ;
	 * ::ji_factor : delphi::factor[1]var _'\u00ABfile\u00BB' : Set(delphi::file)[*|?] := leftCS.objectsOfKind(delphi::file)
	 *   ;
	 * ::ji_file : delphi::file[1]var _'\u00ABfunctionDecl\u00BB' : Set(delphi::functionDecl)[*|?] := leftCS.objectsOfKind(delphi::functionDecl)
	 *   ;
	 * ::ji_functionDecl : delphi::functionDecl[1]var _'\u00ABifStmt\u00BB' : Set(delphi::ifStmt)[*|?] := leftCS.objectsOfKind(delphi::ifStmt)
	 *   ;
	 * ::ji_ifStmt : delphi::ifStmt[1]var _'\u00ABimplementationSection\u00BB' : Set(delphi::implementationSection)[*|?] := leftCS.objectsOfKind(delphi::implementationSection)
	 *   ;
	 * ::ji_implementationSection : delphi::implementationSection[1]var _'\u00ABinterfaceSection\u00BB' : Set(delphi::interfaceSection)[*|?] := leftCS.objectsOfKind(delphi::interfaceSection)
	 *   ;
	 * ::ji_interfaceSection : delphi::interfaceSection[1]var _'\u00ABlabelDeclSection\u00BB' : Set(delphi::labelDeclSection)[*|?] := leftCS.objectsOfKind(delphi::labelDeclSection)
	 *   ;
	 * ::ji_labelDeclSection : delphi::labelDeclSection[1]var _'\u00ABmainRule\u00BB' : Set(delphi::mainRule)[*|?] := leftCS.objectsOfKind(delphi::mainRule)
	 *   ;
	 * ::ji_mainRule : delphi::mainRule[1]var _'\u00ABmultExp\u00BB' : Set(delphi::multExp)[*|?] := leftCS.objectsOfKind(delphi::multExp)
	 *   ;
	 * ::ji_multExp : delphi::multExp[1]var _'\u00ABprocedureDecl\u00BB' : Set(delphi::procedureDecl)[*|?] := leftCS.objectsOfKind(delphi::procedureDecl)
	 *   ;
	 * ::ji_procedureDecl : delphi::procedureDecl[1]var _'\u00ABrelExp\u00BB' : Set(delphi::relExp)[*|?] := leftCS.objectsOfKind(delphi::relExp)
	 *   ;
	 * ::ji_relExp : delphi::relExp[1]var _'\u00ABsimpleFactor\u00BB' : Set(delphi::simpleFactor)[*|?] := leftCS.objectsOfKind(delphi::simpleFactor)
	 *   ;
	 * ::ji_simpleFactor : delphi::simpleFactor[1]var _'\u00ABstatement\u00BB' : Set(delphi::statement)[*|?] := leftCS.objectsOfKind(delphi::statement)
	 *   ;
	 * ::ji_statement : delphi::statement[1]var _'\u00ABtryStmt\u00BB' : Set(delphi::tryStmt)[*|?] := leftCS.objectsOfKind(delphi::tryStmt)
	 *   ;
	 * ::ji_tryStmt : delphi::tryStmt[1]var _'\u00ABtype\u00BB' : Set(delphi::type)[*|?] := leftCS.objectsOfKind(delphi::type)
	 *   ;
	 * ::ji_type : delphi::type[1]var _'\u00ABtypeDecl\u00BB' : Set(delphi::typeDecl)[*|?] := leftCS.objectsOfKind(delphi::typeDecl)
	 *   ;
	 * ::ji_typeDecl : delphi::typeDecl[1]var _'\u00ABunit\u00BB' : Set(delphi::unit)[*|?] := leftCS.objectsOfKind(delphi::unit)
	 *   ;
	 * ::ji_unit : delphi::unit[1]var _'\u00ABunlabelledStatement\u00BB' : Set(delphi::unlabelledStatement)[*|?] := leftCS.objectsOfKind(delphi::unlabelledStatement)
	 *   ;
	 * ::ji_unlabelledStatement : delphi::unlabelledStatement[1]var _'\u00ABvarDecl\u00BB' : Set(delphi::varDecl)[*|?] := leftCS.objectsOfKind(delphi::varDecl)
	 *   ;
	 * ::ji_varDecl : delphi::varDecl[1]var _'\u00ABwithStmt\u00BB' : Set(delphi::withStmt)[*|?] := leftCS.objectsOfKind(delphi::withStmt)
	 *   ;
	 * ::ji_withStmt : delphi::withStmt[1]install m_BinaryExpression_operator_e {
	 * lAddExp consumes ::ji_addExp : delphi::addExp[1];
	 * }
	 *   install m_ExpressionStatement__ast {
	 * lAssignmentStmnt consumes ::ji_assignmentStmnt : delphi::assignmentStmnt[1];
	 * }
	 *   install m_DelphiBlockStatement__ast {
	 * lBlock consumes ::ji_block : delphi::block[1];
	 * }
	 *   install m_ExpressionStatement__ast_1 {
	 * lCallStmnt consumes ::ji_callStmnt : delphi::callStmnt[1];
	 * }
	 *   install m_CaseBlock__ast {
	 * lCaseSelector consumes ::ji_caseSelector : delphi::caseSelector[1];
	 * }
	 *   install m_SwitchStatement__ast {
	 * lCaseStmt consumes ::ji_caseStmt : delphi::caseStmt[1];
	 * }
	 *   install m_BlockStatement__ast {
	 * lCompoundStmt consumes ::ji_compoundStmt : delphi::compoundStmt[1];
	 * }
	 *   install m_VariableDefinition_identifierName_e {
	 * lConstantDecl consumes ::ji_constantDecl : delphi::constantDecl[1];
	 * }
	 *   install m_IdentifierReference__ast {
	 * lDesignator consumes ::ji_designator : delphi::designator[1];
	 * }
	 *   install m_QualifiedOverData__ast {
	 * lDesignator consumes ::ji_designator : delphi::designator[1];
	 * }
	 *   install m_CatchBlock__ast {
	 * lExceptionBlock consumes ::ji_exceptionBlock : delphi::exceptionBlock[1];
	 * }
	 *   install m_DelphiFunctionCallExpression__ast {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_IntegerLiteral__ast {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_NewExpression__ast {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_StringLiteral__ast {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_UnaryExpression__ast {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_FunctionDefinition_identifierName_e {
	 * lFunctionDecl consumes ::ji_functionDecl : delphi::functionDecl[1];
	 * }
	 *   install m_IfStatement__ast {
	 * lIfStmt consumes ::ji_ifStmt : delphi::ifStmt[1];
	 * }
	 *   install m_DelphiImplementationSection__ast {
	 * lImplementationSection consumes ::ji_implementationSection : delphi::implementationSection[1];
	 * }
	 *   install m_DelphiInterfaceSection__ast {
	 * lInterfaceSection consumes ::ji_interfaceSection : delphi::interfaceSection[1];
	 * }
	 *   install m_LabelDefinition__ast {
	 * lLabelDeclSection consumes ::ji_labelDeclSection : delphi::labelDeclSection[1];
	 * }
	 *   install m_Project__ast {
	 * lMainRule consumes ::ji_mainRule : delphi::mainRule[1];
	 * }
	 *   install m_BinaryExpression_operator_e_1 {
	 * lMultExp consumes ::ji_multExp : delphi::multExp[1];
	 * }
	 *   install m_FunctionDefinition_identifierName_e_1 {
	 * lProcedureDecl consumes ::ji_procedureDecl : delphi::procedureDecl[1];
	 * }
	 *   install m_BinaryExpression_operator_e_2 {
	 * lRelExp consumes ::ji_relExp : delphi::relExp[1];
	 * }
	 *   install m_TryStatement__ast {
	 * lTryStmt consumes ::ji_tryStmt : delphi::tryStmt[1];
	 * }
	 *   install m_TypeDefinition_name_e {
	 * lTypeDecl consumes ::ji_typeDecl : delphi::typeDecl[1];
	 * }
	 *   install m_DelphiUnit_language_locationInfo_name_e {
	 * lUnit consumes ::ji_unit : delphi::unit[1];
	 * }
	 *   install m_VariableDefinition_identifierName_isMutable_e {
	 * lVarDecl consumes ::ji_varDecl : delphi::varDecl[1];
	 * }
	 *   install m_DelphiWithStatement__ast {
	 * lWithStmt consumes ::ji_withStmt : delphi::withStmt[1];
	 * }
	 *   install m_Visitable__ast {
	 * lRecordConstExp consumes ::ji_RecordConstExp : delphi::RecordConstExp[1];
	 * }
	 *   install m_OrderedSet__declarations {
	 * lBlock consumes ::ji_block : delphi::block[1];
	 * }
	 *   install m_m_constExpr_ast0 {
	 * lConstExpr consumes ::ji_constExpr : delphi::constExpr[1];
	 * }
	 *   install m_Visitable__NameReference_name {
	 * lDesignator consumes ::ji_designator : delphi::designator[1];
	 * }
	 *   install m_Visitable__QualifiedIdentifierReference_member {
	 * lDesignator consumes ::ji_designator : delphi::designator[1];
	 * }
	 *   install m_Visitable__NameReference_name_1 {
	 * lDesignator consumes ::ji_designator : delphi::designator[1];
	 * }
	 *   install m_m_expression_ast0 {
	 * lExpression consumes ::ji_expression : delphi::expression[1];
	 * }
	 *   install m_Visitable__FunctionCallExpression_calledFunction {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_Visitable__value {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_Visitable__value_1 {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_Visitable__UnaryExpression_operator {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_m_file_ast0 {
	 * lFile consumes ::ji_file : delphi::file[1];
	 * }
	 *   install m_Visitable__body {
	 * lFunctionDecl consumes ::ji_functionDecl : delphi::functionDecl[1];
	 * }
	 *   install m_OrderedSet__fragments {
	 * lImplementationSection consumes ::ji_implementationSection : delphi::implementationSection[1];
	 * }
	 *   install m_OrderedSet__fragments_1 {
	 * lInterfaceSection consumes ::ji_interfaceSection : delphi::interfaceSection[1];
	 * }
	 *   install m_Visitable__files {
	 * lMainRule consumes ::ji_mainRule : delphi::mainRule[1];
	 * }
	 *   install m_Visitable__body_1 {
	 * lProcedureDecl consumes ::ji_procedureDecl : delphi::procedureDecl[1];
	 * }
	 *   install m_Visitable__ast_1 {
	 * lSimpleFactor consumes ::ji_simpleFactor : delphi::simpleFactor[1];
	 * }
	 *   install m_Visitable__ast_2 {
	 * lConstExp consumes ::ji_ConstExp : delphi::ConstExp[1];
	 * }
	 *   install m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_2 {
	 * lAddExp consumes ::ji_addExp : delphi::addExp[1];
	 * }
	 *   install m_OrderedSet__actualParams {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_Visitable__UnaryExpression_operand {
	 * lFactor consumes ::ji_factor : delphi::factor[1];
	 * }
	 *   install m_Visitable__BinaryExpression_BinaryExpression_leftO_lc {
	 * lMultExp consumes ::ji_multExp : delphi::multExp[1];
	 * }
	 *   install m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_1 {
	 * lRelExp consumes ::ji_relExp : delphi::relExp[1];
	 * }
	 *   install m_m_type_ast0 {
	 * lType consumes ::ji_type : delphi::type[1];
	 * }
	 *   install m_Visitable__DelphiUnit_DelphiUnit_implementation_in_lc {
	 * lUnit consumes ::ji_unit : delphi::unit[1];
	 * }
	 *   install m_m_unlabelledStatement_ast0 {
	 * lUnlabelledStatement consumes ::ji_unlabelledStatement : delphi::unlabelledStatement[1];
	 * }
	 *   install m_Visitable__ExpressionStatement_expression {
	 * lAssignmentStmnt consumes ::ji_assignmentStmnt : delphi::assignmentStmnt[1];
	 * }
	 *   install m_Visitable__subStatements {
	 * lBlock consumes ::ji_block : delphi::block[1];
	 * }
	 *   install m_Visitable__ExpressionStatement_expression_1 {
	 * lCallStmnt consumes ::ji_callStmnt : delphi::callStmnt[1];
	 * }
	 *   install m_Visitable__SwitchStatement_cases_switchExpression_lc {
	 * lCaseStmt consumes ::ji_caseStmt : delphi::caseStmt[1];
	 * }
	 *   install m_Visitable__IfStatement_condition {
	 * lIfStmt consumes ::ji_ifStmt : delphi::ifStmt[1];
	 * }
	 *   install m_Visitable__ast_3 {
	 * lStatement consumes ::ji_statement : delphi::statement[1];
	 * }
	 *   install m_Visitable__body_2 {
	 * lCaseSelector consumes ::ji_caseSelector : delphi::caseSelector[1];
	 * }
	 *   install m_Visitable__subStatements_1 {
	 * lCompoundStmt consumes ::ji_compoundStmt : delphi::compoundStmt[1];
	 * }
	 *   install m_Visitable__CatchBlock_body {
	 * lExceptionBlock consumes ::ji_exceptionBlock : delphi::exceptionBlock[1];
	 * }
	 *   install m_Visitable__IfStatement_IfStatement_elseBody_thenBo_lc {
	 * lIfStmt consumes ::ji_ifStmt : delphi::ifStmt[1];
	 * }
	 *   install m_Visitable__TryStatement_TryStatement_catchBlocks_f_lc {
	 * lTryStmt consumes ::ji_tryStmt : delphi::tryStmt[1];
	 * }
	 *   install m_Visitable__Definition_definitionType {
	 * lVarDecl consumes ::ji_varDecl : delphi::varDecl[1];
	 * }
	 *   install m_Visitable__subStatements_2 {
	 * lWithStmt consumes ::ji_withStmt : delphi::withStmt[1];
	 * }
	 *   install m_Visitable__ast_4 {
	 * lMultipleConstExp consumes ::ji_MultipleConstExp : delphi::MultipleConstExp[1];
	 * }
	 *   install m_Visitable__caseExpressions {
	 * lCaseSelector consumes ::ji_caseSelector : delphi::caseSelector[1];
	 * }
	 *   install m_Visitable__DataDefinition_initialValue {
	 * lConstantDecl consumes ::ji_constantDecl : delphi::constantDecl[1];
	 * }
	 *   install m_FunctionDefinition__refersTo {
	 * lDesignator consumes ::ji_designator : delphi::designator[1];
	 * }
	 *   install m_FunctionDefinition__refersTo_1 {
	 * lDesignator consumes ::ji_designator : delphi::designator[1];
	 * }
	 *   install m_FunctionDefinition__withs {
	 * lWithStmt consumes ::ji_withStmt : delphi::withStmt[1];
	 * }
	 */
	protected boolean MAP_r___root__()  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_ConstExp_0 = idResolver.getClass(CLSSid_ConstExp, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_ConstExp, models[0/*leftCS*/], TYP_delphi_c_c_ConstExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_MultipleConstExp_0 = idResolver.getClass(CLSSid_MultipleConstExp, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_0 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_MultipleConstExp, models[0/*leftCS*/], TYP_delphi_c_c_MultipleConstExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_RecordConstExp_0 = idResolver.getClass(CLSSid_RecordConstExp, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_1 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_RecordConstExp, models[0/*leftCS*/], TYP_delphi_c_c_RecordConstExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_addExp_0 = idResolver.getClass(CLSSid_addExp, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_2 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_addExp, models[0/*leftCS*/], TYP_delphi_c_c_addExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_assignmentStmnt_0 = idResolver.getClass(CLSSid_assignmentStmnt, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_3 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_assignmentStmnt, models[0/*leftCS*/], TYP_delphi_c_c_assignmentStmnt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_block_0 = idResolver.getClass(CLSSid_block, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_4 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_block, models[0/*leftCS*/], TYP_delphi_c_c_block_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_callStmnt_0 = idResolver.getClass(CLSSid_callStmnt, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_5 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_callStmnt, models[0/*leftCS*/], TYP_delphi_c_c_callStmnt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_caseSelector_0 = idResolver.getClass(CLSSid_caseSelector, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_6 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_caseSelector, models[0/*leftCS*/], TYP_delphi_c_c_caseSelector_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_caseStmt_0 = idResolver.getClass(CLSSid_caseStmt, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_7 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_caseStmt, models[0/*leftCS*/], TYP_delphi_c_c_caseStmt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_compoundStmt_0 = idResolver.getClass(CLSSid_compoundStmt, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_8 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_compoundStmt, models[0/*leftCS*/], TYP_delphi_c_c_compoundStmt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_constExpr_1 = idResolver.getClass(CLSSid_constExpr, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_9 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_constExpr, models[0/*leftCS*/], TYP_delphi_c_c_constExpr_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_constantDecl_0 = idResolver.getClass(CLSSid_constantDecl, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_10 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_constantDecl, models[0/*leftCS*/], TYP_delphi_c_c_constantDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_designator_0 = idResolver.getClass(CLSSid_designator, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_11 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_designator, models[0/*leftCS*/], TYP_delphi_c_c_designator_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_exceptionBlock_0 = idResolver.getClass(CLSSid_exceptionBlock, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_12 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_exceptionBlock, models[0/*leftCS*/], TYP_delphi_c_c_exceptionBlock_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_expression_1 = idResolver.getClass(CLSSid_expression, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_13 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_expression, models[0/*leftCS*/], TYP_delphi_c_c_expression_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_14 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_factor, models[0/*leftCS*/], TYP_delphi_c_c_factor_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_file_1 = idResolver.getClass(CLSSid_file, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_15 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_file, models[0/*leftCS*/], TYP_delphi_c_c_file_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_functionDecl_0 = idResolver.getClass(CLSSid_functionDecl, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_16 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_functionDecl, models[0/*leftCS*/], TYP_delphi_c_c_functionDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_ifStmt_0 = idResolver.getClass(CLSSid_ifStmt, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_17 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_ifStmt, models[0/*leftCS*/], TYP_delphi_c_c_ifStmt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_implementationSection_0 = idResolver.getClass(CLSSid_implementationSection, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_18 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_implementationSection, models[0/*leftCS*/], TYP_delphi_c_c_implementationSection_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_interfaceSection_0 = idResolver.getClass(CLSSid_interfaceSection, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_19 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_interfaceSection, models[0/*leftCS*/], TYP_delphi_c_c_interfaceSection_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_labelDeclSection_0 = idResolver.getClass(CLSSid_labelDeclSection, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_20 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_labelDeclSection, models[0/*leftCS*/], TYP_delphi_c_c_labelDeclSection_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_mainRule_0 = idResolver.getClass(CLSSid_mainRule, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_21 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_mainRule, models[0/*leftCS*/], TYP_delphi_c_c_mainRule_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_multExp_0 = idResolver.getClass(CLSSid_multExp, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_22 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_multExp, models[0/*leftCS*/], TYP_delphi_c_c_multExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_procedureDecl_0 = idResolver.getClass(CLSSid_procedureDecl, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_23 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_procedureDecl, models[0/*leftCS*/], TYP_delphi_c_c_procedureDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_relExp_0 = idResolver.getClass(CLSSid_relExp, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_24 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_relExp, models[0/*leftCS*/], TYP_delphi_c_c_relExp_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_simpleFactor_0 = idResolver.getClass(CLSSid_simpleFactor, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_25 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_simpleFactor, models[0/*leftCS*/], TYP_delphi_c_c_simpleFactor_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_statement_0 = idResolver.getClass(CLSSid_statement, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_26 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_statement, models[0/*leftCS*/], TYP_delphi_c_c_statement_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_tryStmt_0 = idResolver.getClass(CLSSid_tryStmt, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_27 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_tryStmt, models[0/*leftCS*/], TYP_delphi_c_c_tryStmt_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_type_0 = idResolver.getClass(CLSSid_type, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_28 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_type, models[0/*leftCS*/], TYP_delphi_c_c_type_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_typeDecl_0 = idResolver.getClass(CLSSid_typeDecl, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_29 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_typeDecl, models[0/*leftCS*/], TYP_delphi_c_c_typeDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_unit_0 = idResolver.getClass(CLSSid_unit, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_30 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_unit, models[0/*leftCS*/], TYP_delphi_c_c_unit_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_unlabelledStatement_1 = idResolver.getClass(CLSSid_unlabelledStatement, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_31 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_unlabelledStatement, models[0/*leftCS*/], TYP_delphi_c_c_unlabelledStatement_1);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_varDecl_0 = idResolver.getClass(CLSSid_varDecl, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_32 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_varDecl, models[0/*leftCS*/], TYP_delphi_c_c_varDecl_0);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_withStmt_0 = idResolver.getClass(CLSSid_withStmt, null);
			final /*@NonInvalid*/ @NonNull SetValue objectsOfKind_33 = ModelObjectsOfKindOperation.INSTANCE.evaluate(executor, SET_CLSSid_withStmt, models[0/*leftCS*/], TYP_delphi_c_c_withStmt_0);
			// connection variables
			final @NonNull Connection ji_ConstExp = createConnection("ji_ConstExp", CLSSid_ConstExp, false);
			for (@NonNull ConstExp iterator : ValueUtil.typedIterable(ConstExp.class, objectsOfKind)) {
				ji_ConstExp.append(iterator);
			}
			final @NonNull Connection ji_MultipleConstExp = createConnection("ji_MultipleConstExp", CLSSid_MultipleConstExp, false);
			for (@NonNull MultipleConstExp iterator_0 : ValueUtil.typedIterable(MultipleConstExp.class, objectsOfKind_0)) {
				ji_MultipleConstExp.append(iterator_0);
			}
			final @NonNull Connection ji_RecordConstExp = createConnection("ji_RecordConstExp", CLSSid_RecordConstExp, false);
			for (@NonNull RecordConstExp iterator_1 : ValueUtil.typedIterable(RecordConstExp.class, objectsOfKind_1)) {
				ji_RecordConstExp.append(iterator_1);
			}
			final @NonNull Connection ji_addExp = createConnection("ji_addExp", CLSSid_addExp, false);
			for (@NonNull addExp iterator_2 : ValueUtil.typedIterable(addExp.class, objectsOfKind_2)) {
				ji_addExp.append(iterator_2);
			}
			final @NonNull Connection ji_assignmentStmnt = createConnection("ji_assignmentStmnt", CLSSid_assignmentStmnt, false);
			for (@NonNull assignmentStmnt iterator_3 : ValueUtil.typedIterable(assignmentStmnt.class, objectsOfKind_3)) {
				ji_assignmentStmnt.append(iterator_3);
			}
			final @NonNull Connection ji_block = createConnection("ji_block", CLSSid_block, false);
			for (@NonNull block iterator_4 : ValueUtil.typedIterable(block.class, objectsOfKind_4)) {
				ji_block.append(iterator_4);
			}
			final @NonNull Connection ji_callStmnt = createConnection("ji_callStmnt", CLSSid_callStmnt, false);
			for (@NonNull callStmnt iterator_5 : ValueUtil.typedIterable(callStmnt.class, objectsOfKind_5)) {
				ji_callStmnt.append(iterator_5);
			}
			final @NonNull Connection ji_caseSelector = createConnection("ji_caseSelector", CLSSid_caseSelector, false);
			for (@NonNull caseSelector iterator_6 : ValueUtil.typedIterable(caseSelector.class, objectsOfKind_6)) {
				ji_caseSelector.append(iterator_6);
			}
			final @NonNull Connection ji_caseStmt = createConnection("ji_caseStmt", CLSSid_caseStmt, false);
			for (@NonNull caseStmt iterator_7 : ValueUtil.typedIterable(caseStmt.class, objectsOfKind_7)) {
				ji_caseStmt.append(iterator_7);
			}
			final @NonNull Connection ji_compoundStmt = createConnection("ji_compoundStmt", CLSSid_compoundStmt, false);
			for (@NonNull compoundStmt iterator_8 : ValueUtil.typedIterable(compoundStmt.class, objectsOfKind_8)) {
				ji_compoundStmt.append(iterator_8);
			}
			final @NonNull Connection ji_constExpr = createConnection("ji_constExpr", CLSSid_constExpr, false);
			for (@NonNull constExpr iterator_9 : ValueUtil.typedIterable(constExpr.class, objectsOfKind_9)) {
				ji_constExpr.append(iterator_9);
			}
			final @NonNull Connection ji_constantDecl = createConnection("ji_constantDecl", CLSSid_constantDecl, false);
			for (@NonNull constantDecl iterator_10 : ValueUtil.typedIterable(constantDecl.class, objectsOfKind_10)) {
				ji_constantDecl.append(iterator_10);
			}
			final @NonNull Connection ji_designator = createConnection("ji_designator", CLSSid_designator, false);
			for (@NonNull designator iterator_11 : ValueUtil.typedIterable(designator.class, objectsOfKind_11)) {
				ji_designator.append(iterator_11);
			}
			final @NonNull Connection ji_exceptionBlock = createConnection("ji_exceptionBlock", CLSSid_exceptionBlock, false);
			for (@NonNull exceptionBlock iterator_12 : ValueUtil.typedIterable(exceptionBlock.class, objectsOfKind_12)) {
				ji_exceptionBlock.append(iterator_12);
			}
			final @NonNull Connection ji_expression = createConnection("ji_expression", CLSSid_expression, false);
			for (@NonNull expression iterator_13 : ValueUtil.typedIterable(expression.class, objectsOfKind_13)) {
				ji_expression.append(iterator_13);
			}
			final @NonNull Connection ji_factor = createConnection("ji_factor", CLSSid_factor, false);
			for (@NonNull factor iterator_14 : ValueUtil.typedIterable(factor.class, objectsOfKind_14)) {
				ji_factor.append(iterator_14);
			}
			final @NonNull Connection ji_file = createConnection("ji_file", CLSSid_file, false);
			for (@NonNull file iterator_15 : ValueUtil.typedIterable(file.class, objectsOfKind_15)) {
				ji_file.append(iterator_15);
			}
			final @NonNull Connection ji_functionDecl = createConnection("ji_functionDecl", CLSSid_functionDecl, false);
			for (@NonNull functionDecl iterator_16 : ValueUtil.typedIterable(functionDecl.class, objectsOfKind_16)) {
				ji_functionDecl.append(iterator_16);
			}
			final @NonNull Connection ji_ifStmt = createConnection("ji_ifStmt", CLSSid_ifStmt, false);
			for (@NonNull ifStmt iterator_17 : ValueUtil.typedIterable(ifStmt.class, objectsOfKind_17)) {
				ji_ifStmt.append(iterator_17);
			}
			final @NonNull Connection ji_implementationSection = createConnection("ji_implementationSection", CLSSid_implementationSection, false);
			for (@NonNull implementationSection iterator_18 : ValueUtil.typedIterable(implementationSection.class, objectsOfKind_18)) {
				ji_implementationSection.append(iterator_18);
			}
			final @NonNull Connection ji_interfaceSection = createConnection("ji_interfaceSection", CLSSid_interfaceSection, false);
			for (@NonNull interfaceSection iterator_19 : ValueUtil.typedIterable(interfaceSection.class, objectsOfKind_19)) {
				ji_interfaceSection.append(iterator_19);
			}
			final @NonNull Connection ji_labelDeclSection = createConnection("ji_labelDeclSection", CLSSid_labelDeclSection, false);
			for (@NonNull labelDeclSection iterator_20 : ValueUtil.typedIterable(labelDeclSection.class, objectsOfKind_20)) {
				ji_labelDeclSection.append(iterator_20);
			}
			final @NonNull Connection ji_mainRule = createConnection("ji_mainRule", CLSSid_mainRule, false);
			for (@NonNull mainRule iterator_21 : ValueUtil.typedIterable(mainRule.class, objectsOfKind_21)) {
				ji_mainRule.append(iterator_21);
			}
			final @NonNull Connection ji_multExp = createConnection("ji_multExp", CLSSid_multExp, false);
			for (@NonNull multExp iterator_22 : ValueUtil.typedIterable(multExp.class, objectsOfKind_22)) {
				ji_multExp.append(iterator_22);
			}
			final @NonNull Connection ji_procedureDecl = createConnection("ji_procedureDecl", CLSSid_procedureDecl, false);
			for (@NonNull procedureDecl iterator_23 : ValueUtil.typedIterable(procedureDecl.class, objectsOfKind_23)) {
				ji_procedureDecl.append(iterator_23);
			}
			final @NonNull Connection ji_relExp = createConnection("ji_relExp", CLSSid_relExp, false);
			for (@NonNull relExp iterator_24 : ValueUtil.typedIterable(relExp.class, objectsOfKind_24)) {
				ji_relExp.append(iterator_24);
			}
			final @NonNull Connection ji_simpleFactor = createConnection("ji_simpleFactor", CLSSid_simpleFactor, false);
			for (@NonNull simpleFactor iterator_25 : ValueUtil.typedIterable(simpleFactor.class, objectsOfKind_25)) {
				ji_simpleFactor.append(iterator_25);
			}
			final @NonNull Connection ji_statement = createConnection("ji_statement", CLSSid_statement, false);
			for (@NonNull statement iterator_26 : ValueUtil.typedIterable(statement.class, objectsOfKind_26)) {
				ji_statement.append(iterator_26);
			}
			final @NonNull Connection ji_tryStmt = createConnection("ji_tryStmt", CLSSid_tryStmt, false);
			for (@NonNull tryStmt iterator_27 : ValueUtil.typedIterable(tryStmt.class, objectsOfKind_27)) {
				ji_tryStmt.append(iterator_27);
			}
			final @NonNull Connection ji_type = createConnection("ji_type", CLSSid_type, false);
			for (@NonNull type iterator_28 : ValueUtil.typedIterable(type.class, objectsOfKind_28)) {
				ji_type.append(iterator_28);
			}
			final @NonNull Connection ji_typeDecl = createConnection("ji_typeDecl", CLSSid_typeDecl, false);
			for (@NonNull typeDecl iterator_29 : ValueUtil.typedIterable(typeDecl.class, objectsOfKind_29)) {
				ji_typeDecl.append(iterator_29);
			}
			final @NonNull Connection ji_unit = createConnection("ji_unit", CLSSid_unit, false);
			for (@NonNull unit iterator_30 : ValueUtil.typedIterable(unit.class, objectsOfKind_30)) {
				ji_unit.append(iterator_30);
			}
			final @NonNull Connection ji_unlabelledStatement = createConnection("ji_unlabelledStatement", CLSSid_unlabelledStatement, false);
			for (@NonNull unlabelledStatement iterator_31 : ValueUtil.typedIterable(unlabelledStatement.class, objectsOfKind_31)) {
				ji_unlabelledStatement.append(iterator_31);
			}
			final @NonNull Connection ji_varDecl = createConnection("ji_varDecl", CLSSid_varDecl, false);
			for (@NonNull varDecl iterator_32 : ValueUtil.typedIterable(varDecl.class, objectsOfKind_32)) {
				ji_varDecl.append(iterator_32);
			}
			final @NonNull Connection ji_withStmt = createConnection("ji_withStmt", CLSSid_withStmt, false);
			for (@NonNull withStmt iterator_33 : ValueUtil.typedIterable(withStmt.class, objectsOfKind_33)) {
				ji_withStmt.append(iterator_33);
			}
			// mapping statements
			for (@NonNull addExp lAddExp_1 : ji_addExp.typedIterable(addExp.class)) {
				MAP_m_BinaryExpression_operator_e(lAddExp_1);
			}
			for (@NonNull assignmentStmnt lAssignmentStmnt_1 : ji_assignmentStmnt.typedIterable(assignmentStmnt.class)) {
				MAP_m_ExpressionStatement__ast(lAssignmentStmnt_1);
			}
			for (@NonNull block lBlock_2 : ji_block.typedIterable(block.class)) {
				MAP_m_DelphiBlockStatement__ast(lBlock_2);
			}
			for (@NonNull callStmnt lCallStmnt_1 : ji_callStmnt.typedIterable(callStmnt.class)) {
				MAP_m_ExpressionStatement__ast_1(lCallStmnt_1);
			}
			for (@NonNull caseSelector lCaseSelector_2 : ji_caseSelector.typedIterable(caseSelector.class)) {
				MAP_m_CaseBlock__ast(lCaseSelector_2);
			}
			for (@NonNull caseStmt lCaseStmt_1 : ji_caseStmt.typedIterable(caseStmt.class)) {
				MAP_m_SwitchStatement__ast(lCaseStmt_1);
			}
			for (@NonNull compoundStmt lCompoundStmt_1 : ji_compoundStmt.typedIterable(compoundStmt.class)) {
				MAP_m_BlockStatement__ast(lCompoundStmt_1);
			}
			for (@NonNull constantDecl lConstantDecl_1 : ji_constantDecl.typedIterable(constantDecl.class)) {
				MAP_m_VariableDefinition_identifierName_e(lConstantDecl_1);
			}
			for (@NonNull designator lDesignator_6 : ji_designator.typedIterable(designator.class)) {
				MAP_m_IdentifierReference__ast(lDesignator_6);
			}
			for (@NonNull designator lDesignator_7 : ji_designator.typedIterable(designator.class)) {
				MAP_m_QualifiedOverData__ast(lDesignator_7);
			}
			for (@NonNull exceptionBlock lExceptionBlock_1 : ji_exceptionBlock.typedIterable(exceptionBlock.class)) {
				MAP_m_CatchBlock__ast(lExceptionBlock_1);
			}
			for (@NonNull factor lFactor_10 : ji_factor.typedIterable(factor.class)) {
				MAP_m_DelphiFunctionCallExpression__ast(lFactor_10);
			}
			for (@NonNull factor lFactor_11 : ji_factor.typedIterable(factor.class)) {
				MAP_m_IntegerLiteral__ast(lFactor_11);
			}
			for (@NonNull factor lFactor_12 : ji_factor.typedIterable(factor.class)) {
				MAP_m_NewExpression__ast(lFactor_12);
			}
			for (@NonNull factor lFactor_13 : ji_factor.typedIterable(factor.class)) {
				MAP_m_StringLiteral__ast(lFactor_13);
			}
			for (@NonNull factor lFactor_14 : ji_factor.typedIterable(factor.class)) {
				MAP_m_UnaryExpression__ast(lFactor_14);
			}
			for (@NonNull functionDecl lFunctionDecl_1 : ji_functionDecl.typedIterable(functionDecl.class)) {
				MAP_m_FunctionDefinition_identifierName_e(lFunctionDecl_1);
			}
			for (@NonNull ifStmt lIfStmt_2 : ji_ifStmt.typedIterable(ifStmt.class)) {
				MAP_m_IfStatement__ast(lIfStmt_2);
			}
			for (@NonNull implementationSection lImplementationSection_1 : ji_implementationSection.typedIterable(implementationSection.class)) {
				MAP_m_DelphiImplementationSection__ast(lImplementationSection_1);
			}
			for (@NonNull interfaceSection lInterfaceSection_1 : ji_interfaceSection.typedIterable(interfaceSection.class)) {
				MAP_m_DelphiInterfaceSection__ast(lInterfaceSection_1);
			}
			for (@NonNull labelDeclSection lLabelDeclSection_0 : ji_labelDeclSection.typedIterable(labelDeclSection.class)) {
				MAP_m_LabelDefinition__ast(lLabelDeclSection_0);
			}
			for (@NonNull mainRule lMainRule_1 : ji_mainRule.typedIterable(mainRule.class)) {
				MAP_m_Project__ast(lMainRule_1);
			}
			for (@NonNull multExp lMultExp_1 : ji_multExp.typedIterable(multExp.class)) {
				MAP_m_BinaryExpression_operator_e_1(lMultExp_1);
			}
			for (@NonNull procedureDecl lProcedureDecl_1 : ji_procedureDecl.typedIterable(procedureDecl.class)) {
				MAP_m_FunctionDefinition_identifierName_e_1(lProcedureDecl_1);
			}
			for (@NonNull relExp lRelExp_1 : ji_relExp.typedIterable(relExp.class)) {
				MAP_m_BinaryExpression_operator_e_2(lRelExp_1);
			}
			for (@NonNull tryStmt lTryStmt_1 : ji_tryStmt.typedIterable(tryStmt.class)) {
				MAP_m_TryStatement__ast(lTryStmt_1);
			}
			for (@NonNull typeDecl lTypeDecl_0 : ji_typeDecl.typedIterable(typeDecl.class)) {
				MAP_m_TypeDefinition_name_e(lTypeDecl_0);
			}
			for (@NonNull unit lUnit_1 : ji_unit.typedIterable(unit.class)) {
				MAP_m_DelphiUnit_language_locationInfo_name_e(lUnit_1);
			}
			for (@NonNull varDecl lVarDecl_1 : ji_varDecl.typedIterable(varDecl.class)) {
				MAP_m_VariableDefinition_identifierName_isMutable_e(lVarDecl_1);
			}
			for (@NonNull withStmt lWithStmt_2 : ji_withStmt.typedIterable(withStmt.class)) {
				MAP_m_DelphiWithStatement__ast(lWithStmt_2);
			}
			for (@NonNull RecordConstExp lRecordConstExp_0 : ji_RecordConstExp.typedIterable(RecordConstExp.class)) {
				MAP_m_Visitable__ast(lRecordConstExp_0);
			}
			for (@NonNull block lBlock_3 : ji_block.typedIterable(block.class)) {
				MAP_m_OrderedSet__declarations(lBlock_3);
			}
			for (@NonNull constExpr lConstExpr_0 : ji_constExpr.typedIterable(constExpr.class)) {
				MAP_m_m_constExpr_ast0(lConstExpr_0);
			}
			for (@NonNull designator lDesignator_8 : ji_designator.typedIterable(designator.class)) {
				MAP_m_Visitable__NameReference_name(lDesignator_8);
			}
			for (@NonNull designator lDesignator_9 : ji_designator.typedIterable(designator.class)) {
				MAP_m_Visitable__QualifiedIdentifierReference_member(lDesignator_9);
			}
			for (@NonNull designator lDesignator_10 : ji_designator.typedIterable(designator.class)) {
				MAP_m_Visitable__NameReference_name_1(lDesignator_10);
			}
			for (@NonNull expression lExpression_0 : ji_expression.typedIterable(expression.class)) {
				MAP_m_m_expression_ast0(lExpression_0);
			}
			for (@NonNull factor lFactor_15 : ji_factor.typedIterable(factor.class)) {
				MAP_m_Visitable__FunctionCallExpression_calledFunction(lFactor_15);
			}
			for (@NonNull factor lFactor_16 : ji_factor.typedIterable(factor.class)) {
				MAP_m_Visitable__value(lFactor_16);
			}
			for (@NonNull factor lFactor_17 : ji_factor.typedIterable(factor.class)) {
				MAP_m_Visitable__value_1(lFactor_17);
			}
			for (@NonNull factor lFactor_18 : ji_factor.typedIterable(factor.class)) {
				MAP_m_Visitable__UnaryExpression_operator(lFactor_18);
			}
			for (@NonNull file lFile_0 : ji_file.typedIterable(file.class)) {
				MAP_m_m_file_ast0(lFile_0);
			}
			for (@NonNull functionDecl lFunctionDecl_2 : ji_functionDecl.typedIterable(functionDecl.class)) {
				MAP_m_Visitable__body(lFunctionDecl_2);
			}
			for (@NonNull implementationSection lImplementationSection_2 : ji_implementationSection.typedIterable(implementationSection.class)) {
				MAP_m_OrderedSet__fragments(lImplementationSection_2);
			}
			for (@NonNull interfaceSection lInterfaceSection_2 : ji_interfaceSection.typedIterable(interfaceSection.class)) {
				MAP_m_OrderedSet__fragments_1(lInterfaceSection_2);
			}
			for (@NonNull mainRule lMainRule_2 : ji_mainRule.typedIterable(mainRule.class)) {
				MAP_m_Visitable__files(lMainRule_2);
			}
			for (@NonNull procedureDecl lProcedureDecl_2 : ji_procedureDecl.typedIterable(procedureDecl.class)) {
				MAP_m_Visitable__body_1(lProcedureDecl_2);
			}
			for (@NonNull simpleFactor lSimpleFactor_0 : ji_simpleFactor.typedIterable(simpleFactor.class)) {
				MAP_m_Visitable__ast_1(lSimpleFactor_0);
			}
			for (@NonNull ConstExp lConstExp_0 : ji_ConstExp.typedIterable(ConstExp.class)) {
				MAP_m_Visitable__ast_2(lConstExp_0);
			}
			for (@NonNull addExp lAddExp_2 : ji_addExp.typedIterable(addExp.class)) {
				MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_2(lAddExp_2);
			}
			for (@NonNull factor lFactor_19 : ji_factor.typedIterable(factor.class)) {
				MAP_m_OrderedSet__actualParams(lFactor_19);
			}
			for (@NonNull factor lFactor_20 : ji_factor.typedIterable(factor.class)) {
				MAP_m_Visitable__UnaryExpression_operand(lFactor_20);
			}
			for (@NonNull multExp lMultExp_2 : ji_multExp.typedIterable(multExp.class)) {
				MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc(lMultExp_2);
			}
			for (@NonNull relExp lRelExp_2 : ji_relExp.typedIterable(relExp.class)) {
				MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_1(lRelExp_2);
			}
			for (@NonNull type lType_0 : ji_type.typedIterable(type.class)) {
				MAP_m_m_type_ast0(lType_0);
			}
			for (@NonNull unit lUnit_2 : ji_unit.typedIterable(unit.class)) {
				MAP_m_Visitable__DelphiUnit_DelphiUnit_implementation_in_lc(lUnit_2);
			}
			for (@NonNull unlabelledStatement lUnlabelledStatement_0 : ji_unlabelledStatement.typedIterable(unlabelledStatement.class)) {
				MAP_m_m_unlabelledStatement_ast0(lUnlabelledStatement_0);
			}
			for (@NonNull assignmentStmnt lAssignmentStmnt_2 : ji_assignmentStmnt.typedIterable(assignmentStmnt.class)) {
				MAP_m_Visitable__ExpressionStatement_expression(lAssignmentStmnt_2);
			}
			for (@NonNull block lBlock_4 : ji_block.typedIterable(block.class)) {
				MAP_m_Visitable__subStatements(lBlock_4);
			}
			for (@NonNull callStmnt lCallStmnt_2 : ji_callStmnt.typedIterable(callStmnt.class)) {
				MAP_m_Visitable__ExpressionStatement_expression_1(lCallStmnt_2);
			}
			for (@NonNull caseStmt lCaseStmt_2 : ji_caseStmt.typedIterable(caseStmt.class)) {
				MAP_m_Visitable__SwitchStatement_cases_switchExpression_lc(lCaseStmt_2);
			}
			for (@NonNull ifStmt lIfStmt_3 : ji_ifStmt.typedIterable(ifStmt.class)) {
				MAP_m_Visitable__IfStatement_condition(lIfStmt_3);
			}
			for (@NonNull statement lStatement_0 : ji_statement.typedIterable(statement.class)) {
				MAP_m_Visitable__ast_3(lStatement_0);
			}
			for (@NonNull caseSelector lCaseSelector_3 : ji_caseSelector.typedIterable(caseSelector.class)) {
				MAP_m_Visitable__body_2(lCaseSelector_3);
			}
			for (@NonNull compoundStmt lCompoundStmt_2 : ji_compoundStmt.typedIterable(compoundStmt.class)) {
				MAP_m_Visitable__subStatements_1(lCompoundStmt_2);
			}
			for (@NonNull exceptionBlock lExceptionBlock_2 : ji_exceptionBlock.typedIterable(exceptionBlock.class)) {
				MAP_m_Visitable__CatchBlock_body(lExceptionBlock_2);
			}
			for (@NonNull ifStmt lIfStmt_4 : ji_ifStmt.typedIterable(ifStmt.class)) {
				MAP_m_Visitable__IfStatement_IfStatement_elseBody_thenBo_lc(lIfStmt_4);
			}
			for (@NonNull tryStmt lTryStmt_2 : ji_tryStmt.typedIterable(tryStmt.class)) {
				MAP_m_Visitable__TryStatement_TryStatement_catchBlocks_f_lc(lTryStmt_2);
			}
			for (@NonNull varDecl lVarDecl_2 : ji_varDecl.typedIterable(varDecl.class)) {
				MAP_m_Visitable__Definition_definitionType(lVarDecl_2);
			}
			for (@NonNull withStmt lWithStmt_3 : ji_withStmt.typedIterable(withStmt.class)) {
				MAP_m_Visitable__subStatements_2(lWithStmt_3);
			}
			for (@NonNull MultipleConstExp lMultipleConstExp_0 : ji_MultipleConstExp.typedIterable(MultipleConstExp.class)) {
				MAP_m_Visitable__ast_4(lMultipleConstExp_0);
			}
			for (@NonNull caseSelector lCaseSelector_4 : ji_caseSelector.typedIterable(caseSelector.class)) {
				MAP_m_Visitable__caseExpressions(lCaseSelector_4);
			}
			for (@NonNull constantDecl lConstantDecl_2 : ji_constantDecl.typedIterable(constantDecl.class)) {
				MAP_m_Visitable__DataDefinition_initialValue(lConstantDecl_2);
			}
			for (@NonNull designator lDesignator_11 : ji_designator.typedIterable(designator.class)) {
				MAP_m_FunctionDefinition__refersTo(lDesignator_11);
			}
			for (@NonNull designator lDesignator_12 : ji_designator.typedIterable(designator.class)) {
				MAP_m_FunctionDefinition__refersTo_1(lDesignator_12);
			}
			for (@NonNull withStmt lWithStmt_4 : ji_withStmt.typedIterable(withStmt.class)) {
				MAP_m_FunctionDefinition__withs(lWithStmt_4);
			}
			final /*@Thrown*/ @Nullable Boolean r___root__ = ValueUtil.TRUE_VALUE;
			return r___root__;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_r___root__", e);
		}
	}

	/**
	 *
	 * map m_BinaryExpression_operator_e in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lAddExp  : delphi::addExp[1];
	 * var Add1 : astm::Add[1] := astm::Add{
	 *   };
	 * new:rightAS rBinaryExpression : astm::BinaryExpression[1];
	 * set rBinaryExpression.operator := Add1;
	 * set lAddExp.ast := rBinaryExpression;
	 *
	 */
	protected boolean MAP_m_BinaryExpression_operator_e(final /*@NonInvalid*/ @NonNull addExp lAddExp)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Add_0 = idResolver.getClass(CLSSid_Add, null);
			final /*@NonInvalid*/ @NonNull Add symbol_0 = (Add)TYP_astm_c_c_Add_0.createInstance();
			// creations
			final /*@Thrown*/ @Nullable BinaryExpression rBinaryExpression = AstmFactory.eINSTANCE.createBinaryExpression();
			assert rBinaryExpression != null;
			models[1/*rightAS*/].add(rBinaryExpression);
			// mapping statements
			rBinaryExpression.setOperator(symbol_0);
			lAddExp.setAst(rBinaryExpression);
			final /*@Thrown*/ @Nullable Boolean m_BinaryExpression_operator_e = ValueUtil.TRUE_VALUE;
			return m_BinaryExpression_operator_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_BinaryExpression_operator_e", e);
		}
	}

	/**
	 *
	 * map m_ExpressionStatement__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lAssignmentStmnt  : delphi::assignmentStmnt[1];
	 * new:rightAS rExpressionStatement : astm::ExpressionStatement[1];
	 * set lAssignmentStmnt.ast := rExpressionStatement;
	 *
	 */
	protected boolean MAP_m_ExpressionStatement__ast(final /*@NonInvalid*/ @NonNull assignmentStmnt lAssignmentStmnt)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable ExpressionStatement rExpressionStatement = AstmFactory.eINSTANCE.createExpressionStatement();
			assert rExpressionStatement != null;
			models[1/*rightAS*/].add(rExpressionStatement);
			// mapping statements
			lAssignmentStmnt.setAst(rExpressionStatement);
			final /*@Thrown*/ @Nullable Boolean m_ExpressionStatement__ast = ValueUtil.TRUE_VALUE;
			return m_ExpressionStatement__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ExpressionStatement__ast", e);
		}
	}

	/**
	 *
	 * map m_DelphiBlockStatement__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lBlock  : delphi::block[1];
	 * new:rightAS rDelphiBlockStatement : astm::DelphiBlockStatement[1];
	 * set lBlock.ast := rDelphiBlockStatement;
	 *
	 */
	protected boolean MAP_m_DelphiBlockStatement__ast(final /*@NonInvalid*/ @NonNull block lBlock)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable DelphiBlockStatement rDelphiBlockStatement = AstmFactory.eINSTANCE.createDelphiBlockStatement();
			assert rDelphiBlockStatement != null;
			models[1/*rightAS*/].add(rDelphiBlockStatement);
			// mapping statements
			lBlock.setAst(rDelphiBlockStatement);
			final /*@Thrown*/ @Nullable Boolean m_DelphiBlockStatement__ast = ValueUtil.TRUE_VALUE;
			return m_DelphiBlockStatement__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiBlockStatement__ast", e);
		}
	}

	/**
	 *
	 * map m_ExpressionStatement__ast_1 in Delphi_qvtp_qvtcas {
	 * guard:leftCS lCallStmnt  : delphi::callStmnt[1];
	 * new:rightAS rExpressionStatement : astm::ExpressionStatement[1];
	 * set lCallStmnt.ast := rExpressionStatement;
	 *
	 */
	protected boolean MAP_m_ExpressionStatement__ast_1(final /*@NonInvalid*/ @NonNull callStmnt lCallStmnt)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable ExpressionStatement rExpressionStatement = AstmFactory.eINSTANCE.createExpressionStatement();
			assert rExpressionStatement != null;
			models[1/*rightAS*/].add(rExpressionStatement);
			// mapping statements
			lCallStmnt.setAst(rExpressionStatement);
			final /*@Thrown*/ @Nullable Boolean m_ExpressionStatement__ast_1 = ValueUtil.TRUE_VALUE;
			return m_ExpressionStatement__ast_1;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_ExpressionStatement__ast_1", e);
		}
	}

	/**
	 *
	 * map m_CaseBlock__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lCaseSelector  : delphi::caseSelector[1];
	 * new:rightAS rCaseBlock : astm::CaseBlock[1];
	 * set lCaseSelector.ast := rCaseBlock;
	 *
	 */
	protected boolean MAP_m_CaseBlock__ast(final /*@NonInvalid*/ @NonNull caseSelector lCaseSelector)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable CaseBlock rCaseBlock = AstmFactory.eINSTANCE.createCaseBlock();
			assert rCaseBlock != null;
			models[1/*rightAS*/].add(rCaseBlock);
			// mapping statements
			lCaseSelector.setAst(rCaseBlock);
			final /*@Thrown*/ @Nullable Boolean m_CaseBlock__ast = ValueUtil.TRUE_VALUE;
			return m_CaseBlock__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_CaseBlock__ast", e);
		}
	}

	/**
	 *
	 * map m_SwitchStatement__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lCaseStmt  : delphi::caseStmt[1];
	 * new:rightAS rSwitchStatement : astm::SwitchStatement[1];
	 * set lCaseStmt.ast := rSwitchStatement;
	 *
	 */
	protected boolean MAP_m_SwitchStatement__ast(final /*@NonInvalid*/ @NonNull caseStmt lCaseStmt)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable SwitchStatement rSwitchStatement = AstmFactory.eINSTANCE.createSwitchStatement();
			assert rSwitchStatement != null;
			models[1/*rightAS*/].add(rSwitchStatement);
			// mapping statements
			lCaseStmt.setAst(rSwitchStatement);
			final /*@Thrown*/ @Nullable Boolean m_SwitchStatement__ast = ValueUtil.TRUE_VALUE;
			return m_SwitchStatement__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_SwitchStatement__ast", e);
		}
	}

	/**
	 *
	 * map m_BlockStatement__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lCompoundStmt  : delphi::compoundStmt[1];
	 * new:rightAS rBlockStatement : astm::BlockStatement[1];
	 * set lCompoundStmt.ast := rBlockStatement;
	 *
	 */
	protected boolean MAP_m_BlockStatement__ast(final /*@NonInvalid*/ @NonNull compoundStmt lCompoundStmt)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable BlockStatement rBlockStatement = AstmFactory.eINSTANCE.createBlockStatement();
			assert rBlockStatement != null;
			models[1/*rightAS*/].add(rBlockStatement);
			// mapping statements
			lCompoundStmt.setAst(rBlockStatement);
			final /*@Thrown*/ @Nullable Boolean m_BlockStatement__ast = ValueUtil.TRUE_VALUE;
			return m_BlockStatement__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_BlockStatement__ast", e);
		}
	}

	/**
	 *
	 * map m_VariableDefinition_identifierName_e in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lConstantDecl  : delphi::constantDecl[1];
	 * var id : delphi::ident[?] := lConstantDecl.id;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * new:rightAS rVariableDefinition : astm::VariableDefinition[1];
	 * set lConstantDecl.ast := rVariableDefinition;
	 * set rVariableDefinition.identifierName := Name1;
	 *
	 */
	protected boolean MAP_m_VariableDefinition_identifierName_e(final /*@NonInvalid*/ @NonNull constantDecl lConstantDecl)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable ident id = lConstantDecl.getId();
			if (id == null) {
				throw throwNull(lConstantDecl, "Null source for \'delphi::ident::extract() : String[?]\'");
			}
			final /*@Thrown*/ @Nullable String extract = INSTANCE_ident_extract.evaluate(id);
			final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
			final /*@Thrown*/ @NonNull Name symbol_1 = (Name)TYP_astm_c_c_Name_0.createInstance();
			CTORid_nameString.initValue(symbol_1, extract);
			// creations
			final /*@Thrown*/ @Nullable VariableDefinition rVariableDefinition = AstmFactory.eINSTANCE.createVariableDefinition();
			assert rVariableDefinition != null;
			models[1/*rightAS*/].add(rVariableDefinition);
			// mapping statements
			lConstantDecl.setAst(rVariableDefinition);
			rVariableDefinition.setIdentifierName(symbol_1);
			final /*@Thrown*/ @Nullable Boolean m_VariableDefinition_identifierName_e = ValueUtil.TRUE_VALUE;
			return m_VariableDefinition_identifierName_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_VariableDefinition_identifierName_e", e);
		}
	}

	/**
	 *
	 * map m_IdentifierReference__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * check lDesignator.isIdentifierRef();
	 * new:rightAS rIdentifierReference : astm::IdentifierReference[1];
	 * set lDesignator.ast := rIdentifierReference;
	 *
	 */
	protected boolean MAP_m_IdentifierReference__ast(final /*@NonInvalid*/ @NonNull designator lDesignator)  {
		try {
			final /*@Thrown*/ @Nullable designator designator = lDesignator.getDesignator();
			final /*@Thrown*/ boolean eq = designator == null;
			/*@Thrown*/ @Nullable Boolean symbol_2;
			if (eq) {
				// creations
				final /*@Thrown*/ @Nullable IdentifierReference rIdentifierReference = AstmFactory.eINSTANCE.createIdentifierReference();
				assert rIdentifierReference != null;
				models[1/*rightAS*/].add(rIdentifierReference);
				// mapping statements
				lDesignator.setAst(rIdentifierReference);
				final /*@Thrown*/ @Nullable Boolean m_IdentifierReference__ast = ValueUtil.TRUE_VALUE;
				symbol_2 = m_IdentifierReference__ast;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_IdentifierReference__ast", e);
		}
	}

	/**
	 *
	 * map m_QualifiedOverData__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * check lDesignator.isQualifiedOverData()
	 *   ;
	 * check not lDesignator.isIdentifierRef();
	 * new:rightAS rQualifiedOverData : astm::QualifiedOverData[1];
	 * set lDesignator.ast := rQualifiedOverData;
	 *
	 */
	protected boolean MAP_m_QualifiedOverData__ast(final /*@NonInvalid*/ @NonNull designator lDesignator_0)  {
		try {
			final /*@Thrown*/ @Nullable designator designator = lDesignator_0.getDesignator();
			final /*@Thrown*/ boolean ne = designator != null;
			/*@Thrown*/ @Nullable Boolean symbol_3;
			if (ne) {
				/*@Caught*/ @NonNull Object CAUGHT_eq;
				try {
					final /*@Thrown*/ @Nullable designator designator_0 = lDesignator_0.getDesignator();
					final /*@Thrown*/ boolean eq = designator_0 == null;
					CAUGHT_eq = eq;
				}
				catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq);
				if (not == null) {
					throw throwNull(lDesignator_0, "Null if condition");
				}
				/*@Thrown*/ @Nullable Boolean symbol_2;
				if (not) {
					// creations
					final /*@Thrown*/ @Nullable QualifiedOverData rQualifiedOverData = AstmFactory.eINSTANCE.createQualifiedOverData();
					assert rQualifiedOverData != null;
					models[1/*rightAS*/].add(rQualifiedOverData);
					// mapping statements
					lDesignator_0.setAst(rQualifiedOverData);
					final /*@Thrown*/ @Nullable Boolean m_QualifiedOverData__ast = ValueUtil.TRUE_VALUE;
					symbol_2 = m_QualifiedOverData__ast;
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
			return handleExecutionFailure("MAP_m_QualifiedOverData__ast", e);
		}
	}

	/**
	 *
	 * map m_CatchBlock__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lExceptionBlock  : delphi::exceptionBlock[1];
	 * new:rightAS rCatchBlock : astm::CatchBlock[1];
	 * set lExceptionBlock.ast := rCatchBlock;
	 *
	 */
	protected boolean MAP_m_CatchBlock__ast(final /*@NonInvalid*/ @NonNull exceptionBlock lExceptionBlock)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable CatchBlock rCatchBlock = AstmFactory.eINSTANCE.createCatchBlock();
			assert rCatchBlock != null;
			models[1/*rightAS*/].add(rCatchBlock);
			// mapping statements
			lExceptionBlock.setAst(rCatchBlock);
			final /*@Thrown*/ @Nullable Boolean m_CatchBlock__ast = ValueUtil.TRUE_VALUE;
			return m_CatchBlock__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_CatchBlock__ast", e);
		}
	}

	/**
	 *
	 * map m_DelphiFunctionCallExpression__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check not lFactor.isAString()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.isAFunctionCall()
	 *   ;
	 * check lFactor.oclIsTypeOf(delphi::factor);
	 * new:rightAS rDelphiFunctionCallExpression : astm::DelphiFunctionCallExpression[1];
	 * set lFactor.ast := rDelphiFunctionCallExpression;
	 *
	 */
	protected boolean MAP_m_DelphiFunctionCallExpression__ast(final /*@NonInvalid*/ @NonNull factor lFactor)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_ne;
			try {
				final /*@Thrown*/ @Nullable String string = lFactor.getString();
				final /*@Thrown*/ boolean ne = string != null;
				CAUGHT_ne = ne;
			}
			catch (Exception e) {
				CAUGHT_ne = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
			if (not == null) {
				throw throwNull(lFactor, "Null if condition");
			}
			/*@Thrown*/ @Nullable Boolean symbol_5;
			if (not) {
				/*@Caught*/ @NonNull Object CAUGHT_ne_0;
				try {
					final /*@Thrown*/ @Nullable String number = lFactor.getNumber();
					final /*@Thrown*/ boolean ne_0 = number != null;
					CAUGHT_ne_0 = ne_0;
				}
				catch (Exception e) {
					CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
				if (not_0 == null) {
					throw throwNull(lFactor, "Null if condition");
				}
				/*@Thrown*/ @Nullable Boolean symbol_4;
				if (not_0) {
					final /*@Thrown*/ @Nullable exprList expList = lFactor.getExpList();
					final /*@Thrown*/ boolean ne_1 = expList != null;
					/*@Thrown*/ @Nullable Boolean symbol_3;
					if (ne_1) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor, TYP_delphi_c_c_factor_0).booleanValue();
						/*@Thrown*/ @Nullable Boolean symbol_2;
						if (oclIsTypeOf) {
							// creations
							final /*@Thrown*/ @Nullable DelphiFunctionCallExpression rDelphiFunctionCallExpression = AstmFactory.eINSTANCE.createDelphiFunctionCallExpression();
							assert rDelphiFunctionCallExpression != null;
							models[1/*rightAS*/].add(rDelphiFunctionCallExpression);
							// mapping statements
							lFactor.setAst(rDelphiFunctionCallExpression);
							final /*@Thrown*/ @Nullable Boolean m_DelphiFunctionCallExpression__ast = ValueUtil.TRUE_VALUE;
							symbol_2 = m_DelphiFunctionCallExpression__ast;
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
				symbol_5 = symbol_4;
			}
			else {
				symbol_5 = ValueUtil.FALSE_VALUE;
			}
			return symbol_5;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiFunctionCallExpression__ast", e);
		}
	}

	/**
	 *
	 * map m_IntegerLiteral__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check lFactor.isANumber();
	 * new:rightAS rIntegerLiteral : astm::IntegerLiteral[1];
	 * set lFactor.ast := rIntegerLiteral;
	 *
	 */
	protected boolean MAP_m_IntegerLiteral__ast(final /*@NonInvalid*/ @NonNull factor lFactor_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_0, TYP_delphi_c_c_factor_0).booleanValue();
			/*@Thrown*/ @Nullable Boolean symbol_3;
			if (oclIsTypeOf) {
				final /*@Thrown*/ @Nullable String number = lFactor_0.getNumber();
				final /*@Thrown*/ boolean ne = number != null;
				/*@Thrown*/ @Nullable Boolean symbol_2;
				if (ne) {
					// creations
					final /*@Thrown*/ @Nullable IntegerLiteral rIntegerLiteral = AstmFactory.eINSTANCE.createIntegerLiteral();
					assert rIntegerLiteral != null;
					models[1/*rightAS*/].add(rIntegerLiteral);
					// mapping statements
					lFactor_0.setAst(rIntegerLiteral);
					final /*@Thrown*/ @Nullable Boolean m_IntegerLiteral__ast = ValueUtil.TRUE_VALUE;
					symbol_2 = m_IntegerLiteral__ast;
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
			return handleExecutionFailure("MAP_m_IntegerLiteral__ast", e);
		}
	}

	/**
	 *
	 * map m_NewExpression__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check not lFactor.isAString()
	 *   ;
	 * check not lFactor.isNotExp()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check not lFactor.isAFunctionCall();
	 * new:rightAS rNewExpression : astm::NewExpression[1];
	 * set lFactor.ast := rNewExpression;
	 *
	 */
	protected boolean MAP_m_NewExpression__ast(final /*@NonInvalid*/ @NonNull factor lFactor_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_ne;
			try {
				final /*@Thrown*/ @Nullable String string = lFactor_1.getString();
				final /*@Thrown*/ boolean ne = string != null;
				CAUGHT_ne = ne;
			}
			catch (Exception e) {
				CAUGHT_ne = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
			if (not == null) {
				throw throwNull(lFactor_1, "Null if condition");
			}
			/*@Thrown*/ @Nullable Boolean symbol_6;
			if (not) {
				/*@Caught*/ @NonNull Object CAUGHT_ne_0;
				try {
					final /*@Thrown*/ @Nullable expression exp = lFactor_1.getExp();
					final /*@Thrown*/ boolean ne_0 = exp != null;
					CAUGHT_ne_0 = ne_0;
				}
				catch (Exception e) {
					CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
				if (not_0 == null) {
					throw throwNull(lFactor_1, "Null if condition");
				}
				/*@Thrown*/ @Nullable Boolean symbol_5;
				if (not_0) {
					/*@Caught*/ @NonNull Object CAUGHT_ne_1;
					try {
						final /*@Thrown*/ @Nullable String number = lFactor_1.getNumber();
						final /*@Thrown*/ boolean ne_1 = number != null;
						CAUGHT_ne_1 = ne_1;
					}
					catch (Exception e) {
						CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ @Nullable Boolean not_1 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
					if (not_1 == null) {
						throw throwNull(lFactor_1, "Null if condition");
					}
					/*@Thrown*/ @Nullable Boolean symbol_4;
					if (not_1) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_1, TYP_delphi_c_c_factor_0).booleanValue();
						/*@Thrown*/ @Nullable Boolean symbol_3;
						if (oclIsTypeOf) {
							/*@Caught*/ @NonNull Object CAUGHT_ne_2;
							try {
								final /*@Thrown*/ @Nullable exprList expList = lFactor_1.getExpList();
								final /*@Thrown*/ boolean ne_2 = expList != null;
								CAUGHT_ne_2 = ne_2;
							}
							catch (Exception e) {
								CAUGHT_ne_2 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ @Nullable Boolean not_2 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_2);
							if (not_2 == null) {
								throw throwNull(lFactor_1, "Null if condition");
							}
							/*@Thrown*/ @Nullable Boolean symbol_2;
							if (not_2) {
								// creations
								final /*@Thrown*/ @Nullable NewExpression rNewExpression = AstmFactory.eINSTANCE.createNewExpression();
								assert rNewExpression != null;
								models[1/*rightAS*/].add(rNewExpression);
								// mapping statements
								lFactor_1.setAst(rNewExpression);
								final /*@Thrown*/ @Nullable Boolean m_NewExpression__ast = ValueUtil.TRUE_VALUE;
								symbol_2 = m_NewExpression__ast;
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
					symbol_5 = symbol_4;
				}
				else {
					symbol_5 = ValueUtil.FALSE_VALUE;
				}
				symbol_6 = symbol_5;
			}
			else {
				symbol_6 = ValueUtil.FALSE_VALUE;
			}
			return symbol_6;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_NewExpression__ast", e);
		}
	}

	/**
	 *
	 * map m_StringLiteral__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check lFactor.isAString()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.oclIsTypeOf(delphi::factor);
	 * new:rightAS rStringLiteral : astm::StringLiteral[1];
	 * set lFactor.ast := rStringLiteral;
	 *
	 */
	protected boolean MAP_m_StringLiteral__ast(final /*@NonInvalid*/ @NonNull factor lFactor_2)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable String string = lFactor_2.getString();
			final /*@Thrown*/ boolean ne = string != null;
			/*@Thrown*/ @Nullable Boolean symbol_4;
			if (ne) {
				/*@Caught*/ @NonNull Object CAUGHT_ne_0;
				try {
					final /*@Thrown*/ @Nullable String number = lFactor_2.getNumber();
					final /*@Thrown*/ boolean ne_0 = number != null;
					CAUGHT_ne_0 = ne_0;
				}
				catch (Exception e) {
					CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
				if (not == null) {
					throw throwNull(lFactor_2, "Null if condition");
				}
				/*@Thrown*/ @Nullable Boolean symbol_3;
				if (not) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_2, TYP_delphi_c_c_factor_0).booleanValue();
					/*@Thrown*/ @Nullable Boolean symbol_2;
					if (oclIsTypeOf) {
						// creations
						final /*@Thrown*/ @Nullable StringLiteral rStringLiteral = AstmFactory.eINSTANCE.createStringLiteral();
						assert rStringLiteral != null;
						models[1/*rightAS*/].add(rStringLiteral);
						// mapping statements
						lFactor_2.setAst(rStringLiteral);
						final /*@Thrown*/ @Nullable Boolean m_StringLiteral__ast = ValueUtil.TRUE_VALUE;
						symbol_2 = m_StringLiteral__ast;
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
			return handleExecutionFailure("MAP_m_StringLiteral__ast", e);
		}
	}

	/**
	 *
	 * map m_UnaryExpression__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * check not lFactor.isAString()
	 *   ;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check not lFactor.isAFunctionCall()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.isNotExp();
	 * new:rightAS rUnaryExpression : astm::UnaryExpression[1];
	 * set lFactor.ast := rUnaryExpression;
	 *
	 */
	protected boolean MAP_m_UnaryExpression__ast(final /*@NonInvalid*/ @NonNull factor lFactor_3)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			/*@Caught*/ @NonNull Object CAUGHT_ne;
			try {
				final /*@Thrown*/ @Nullable String string = lFactor_3.getString();
				final /*@Thrown*/ boolean ne = string != null;
				CAUGHT_ne = ne;
			}
			catch (Exception e) {
				CAUGHT_ne = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
			if (not == null) {
				throw throwNull(lFactor_3, "Null if condition");
			}
			/*@Thrown*/ @Nullable Boolean symbol_6;
			if (not) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_3, TYP_delphi_c_c_factor_0).booleanValue();
				/*@Thrown*/ @Nullable Boolean symbol_5;
				if (oclIsTypeOf) {
					/*@Caught*/ @NonNull Object CAUGHT_ne_0;
					try {
						final /*@Thrown*/ @Nullable exprList expList = lFactor_3.getExpList();
						final /*@Thrown*/ boolean ne_0 = expList != null;
						CAUGHT_ne_0 = ne_0;
					}
					catch (Exception e) {
						CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ @Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
					if (not_0 == null) {
						throw throwNull(lFactor_3, "Null if condition");
					}
					/*@Thrown*/ @Nullable Boolean symbol_4;
					if (not_0) {
						/*@Caught*/ @NonNull Object CAUGHT_ne_1;
						try {
							final /*@Thrown*/ @Nullable String number = lFactor_3.getNumber();
							final /*@Thrown*/ boolean ne_1 = number != null;
							CAUGHT_ne_1 = ne_1;
						}
						catch (Exception e) {
							CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ @Nullable Boolean not_1 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
						if (not_1 == null) {
							throw throwNull(lFactor_3, "Null if condition");
						}
						/*@Thrown*/ @Nullable Boolean symbol_3;
						if (not_1) {
							final /*@Thrown*/ @Nullable expression exp = lFactor_3.getExp();
							final /*@Thrown*/ boolean ne_2 = exp != null;
							/*@Thrown*/ @Nullable Boolean symbol_2;
							if (ne_2) {
								// creations
								final /*@Thrown*/ @Nullable UnaryExpression rUnaryExpression = AstmFactory.eINSTANCE.createUnaryExpression();
								assert rUnaryExpression != null;
								models[1/*rightAS*/].add(rUnaryExpression);
								// mapping statements
								lFactor_3.setAst(rUnaryExpression);
								final /*@Thrown*/ @Nullable Boolean m_UnaryExpression__ast = ValueUtil.TRUE_VALUE;
								symbol_2 = m_UnaryExpression__ast;
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
					symbol_5 = symbol_4;
				}
				else {
					symbol_5 = ValueUtil.FALSE_VALUE;
				}
				symbol_6 = symbol_5;
			}
			else {
				symbol_6 = ValueUtil.FALSE_VALUE;
			}
			return symbol_6;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_UnaryExpression__ast", e);
		}
	}

	/**
	 *
	 * map m_FunctionDefinition_identifierName_e in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFunctionDecl  : delphi::functionDecl[1];
	 * var heading : delphi::functionHeading[?] := lFunctionDecl.heading;
	 * var id : delphi::ident[?] := heading.id;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * new:rightAS rFunctionDefinition : astm::FunctionDefinition[1];
	 * set lFunctionDecl.ast := rFunctionDefinition;
	 * set rFunctionDefinition.identifierName := Name1;
	 *
	 */
	protected boolean MAP_m_FunctionDefinition_identifierName_e(final /*@NonInvalid*/ @NonNull functionDecl lFunctionDecl)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable functionHeading heading = lFunctionDecl.getHeading();
			if (heading == null) {
				throw throwNull(lFunctionDecl, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::methodHeading::id\'");
			}
			final /*@Thrown*/ @Nullable ident id = heading.getId();
			if (id == null) {
				throw throwNull(lFunctionDecl, "Null source for \'delphi::ident::extract() : String[?]\'");
			}
			final /*@Thrown*/ @Nullable String extract = INSTANCE_ident_extract.evaluate(id);
			final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
			final /*@Thrown*/ @NonNull Name symbol_1 = (Name)TYP_astm_c_c_Name_0.createInstance();
			CTORid_nameString.initValue(symbol_1, extract);
			// creations
			final /*@Thrown*/ @Nullable FunctionDefinition rFunctionDefinition = AstmFactory.eINSTANCE.createFunctionDefinition();
			assert rFunctionDefinition != null;
			models[1/*rightAS*/].add(rFunctionDefinition);
			// mapping statements
			lFunctionDecl.setAst(rFunctionDefinition);
			rFunctionDefinition.setIdentifierName(symbol_1);
			final /*@Thrown*/ @Nullable Boolean m_FunctionDefinition_identifierName_e = ValueUtil.TRUE_VALUE;
			return m_FunctionDefinition_identifierName_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_FunctionDefinition_identifierName_e", e);
		}
	}

	/**
	 *
	 * map m_IfStatement__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lIfStmt  : delphi::ifStmt[1];
	 * new:rightAS rIfStatement : astm::IfStatement[1];
	 * set lIfStmt.ast := rIfStatement;
	 *
	 */
	protected boolean MAP_m_IfStatement__ast(final /*@NonInvalid*/ @NonNull ifStmt lIfStmt)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable IfStatement rIfStatement = AstmFactory.eINSTANCE.createIfStatement();
			assert rIfStatement != null;
			models[1/*rightAS*/].add(rIfStatement);
			// mapping statements
			lIfStmt.setAst(rIfStatement);
			final /*@Thrown*/ @Nullable Boolean m_IfStatement__ast = ValueUtil.TRUE_VALUE;
			return m_IfStatement__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_IfStatement__ast", e);
		}
	}

	/**
	 *
	 * map m_DelphiImplementationSection__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lImplementationSection  : delphi::implementationSection[1];
	 * new:rightAS rDelphiImplementationSection : astm::DelphiImplementationSection[1];
	 * set lImplementationSection.ast := rDelphiImplementationSection;
	 *
	 */
	protected boolean MAP_m_DelphiImplementationSection__ast(final /*@NonInvalid*/ @NonNull implementationSection lImplementationSection)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable DelphiImplementationSection rDelphiImplementationSection = AstmFactory.eINSTANCE.createDelphiImplementationSection();
			assert rDelphiImplementationSection != null;
			models[1/*rightAS*/].add(rDelphiImplementationSection);
			// mapping statements
			lImplementationSection.setAst(rDelphiImplementationSection);
			final /*@Thrown*/ @Nullable Boolean m_DelphiImplementationSection__ast = ValueUtil.TRUE_VALUE;
			return m_DelphiImplementationSection__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiImplementationSection__ast", e);
		}
	}

	/**
	 *
	 * map m_DelphiInterfaceSection__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lInterfaceSection  : delphi::interfaceSection[1];
	 * new:rightAS rDelphiInterfaceSection : astm::DelphiInterfaceSection[1];
	 * set lInterfaceSection.ast := rDelphiInterfaceSection;
	 *
	 */
	protected boolean MAP_m_DelphiInterfaceSection__ast(final /*@NonInvalid*/ @NonNull interfaceSection lInterfaceSection)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable DelphiInterfaceSection rDelphiInterfaceSection = AstmFactory.eINSTANCE.createDelphiInterfaceSection();
			assert rDelphiInterfaceSection != null;
			models[1/*rightAS*/].add(rDelphiInterfaceSection);
			// mapping statements
			lInterfaceSection.setAst(rDelphiInterfaceSection);
			final /*@Thrown*/ @Nullable Boolean m_DelphiInterfaceSection__ast = ValueUtil.TRUE_VALUE;
			return m_DelphiInterfaceSection__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiInterfaceSection__ast", e);
		}
	}

	/**
	 *
	 * map m_LabelDefinition__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lLabelDeclSection  : delphi::labelDeclSection[1];
	 * new:rightAS rLabelDefinition : astm::LabelDefinition[1];
	 * set lLabelDeclSection.ast := rLabelDefinition;
	 *
	 */
	protected boolean MAP_m_LabelDefinition__ast(final /*@NonInvalid*/ @NonNull labelDeclSection lLabelDeclSection)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable LabelDefinition rLabelDefinition = AstmFactory.eINSTANCE.createLabelDefinition();
			assert rLabelDefinition != null;
			models[1/*rightAS*/].add(rLabelDefinition);
			// mapping statements
			lLabelDeclSection.setAst(rLabelDefinition);
			final /*@Thrown*/ @Nullable Boolean m_LabelDefinition__ast = ValueUtil.TRUE_VALUE;
			return m_LabelDefinition__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_LabelDefinition__ast", e);
		}
	}

	/**
	 *
	 * map m_Project__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lMainRule  : delphi::mainRule[1];
	 * new:rightAS rProject : astm::Project[1];
	 * set lMainRule.ast := rProject;
	 *
	 */
	protected boolean MAP_m_Project__ast(final /*@NonInvalid*/ @NonNull mainRule lMainRule)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable Project rProject = AstmFactory.eINSTANCE.createProject();
			assert rProject != null;
			models[1/*rightAS*/].add(rProject);
			// mapping statements
			lMainRule.setAst(rProject);
			final /*@Thrown*/ @Nullable Boolean m_Project__ast = ValueUtil.TRUE_VALUE;
			return m_Project__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Project__ast", e);
		}
	}

	/**
	 *
	 * map m_BinaryExpression_operator_e_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lMultExp  : delphi::multExp[1];
	 * var Multiply1 : astm::Multiply[1] := astm::Multiply{
	 *   };
	 * new:rightAS rBinaryExpression : astm::BinaryExpression[1];
	 * set lMultExp.ast := rBinaryExpression;
	 * set rBinaryExpression.operator := Multiply1;
	 *
	 */
	protected boolean MAP_m_BinaryExpression_operator_e_1(final /*@NonInvalid*/ @NonNull multExp lMultExp)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Multiply_0 = idResolver.getClass(CLSSid_Multiply, null);
			final /*@NonInvalid*/ @NonNull Multiply symbol_0 = (Multiply)TYP_astm_c_c_Multiply_0.createInstance();
			// creations
			final /*@Thrown*/ @Nullable BinaryExpression rBinaryExpression = AstmFactory.eINSTANCE.createBinaryExpression();
			assert rBinaryExpression != null;
			models[1/*rightAS*/].add(rBinaryExpression);
			// mapping statements
			lMultExp.setAst(rBinaryExpression);
			rBinaryExpression.setOperator(symbol_0);
			final /*@Thrown*/ @Nullable Boolean m_BinaryExpression_operator_e_1 = ValueUtil.TRUE_VALUE;
			return m_BinaryExpression_operator_e_1;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_BinaryExpression_operator_e_1", e);
		}
	}

	/**
	 *
	 * map m_FunctionDefinition_identifierName_e_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lProcedureDecl  : delphi::procedureDecl[1];
	 * var heading : delphi::procedureHeading[?] := lProcedureDecl.heading;
	 * var id : delphi::ident[?] := heading.id;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * new:rightAS rFunctionDefinition : astm::FunctionDefinition[1];
	 * set lProcedureDecl.ast := rFunctionDefinition;
	 * set rFunctionDefinition.identifierName := Name1;
	 *
	 */
	protected boolean MAP_m_FunctionDefinition_identifierName_e_1(final /*@NonInvalid*/ @NonNull procedureDecl lProcedureDecl)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable procedureHeading heading = lProcedureDecl.getHeading();
			if (heading == null) {
				throw throwNull(lProcedureDecl, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::methodHeading::id\'");
			}
			final /*@Thrown*/ @Nullable ident id = heading.getId();
			if (id == null) {
				throw throwNull(lProcedureDecl, "Null source for \'delphi::ident::extract() : String[?]\'");
			}
			final /*@Thrown*/ @Nullable String extract = INSTANCE_ident_extract.evaluate(id);
			final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
			final /*@Thrown*/ @NonNull Name symbol_1 = (Name)TYP_astm_c_c_Name_0.createInstance();
			CTORid_nameString.initValue(symbol_1, extract);
			// creations
			final /*@Thrown*/ @Nullable FunctionDefinition rFunctionDefinition = AstmFactory.eINSTANCE.createFunctionDefinition();
			assert rFunctionDefinition != null;
			models[1/*rightAS*/].add(rFunctionDefinition);
			// mapping statements
			lProcedureDecl.setAst(rFunctionDefinition);
			rFunctionDefinition.setIdentifierName(symbol_1);
			final /*@Thrown*/ @Nullable Boolean m_FunctionDefinition_identifierName_e_1 = ValueUtil.TRUE_VALUE;
			return m_FunctionDefinition_identifierName_e_1;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_FunctionDefinition_identifierName_e_1", e);
		}
	}

	/**
	 *
	 * map m_BinaryExpression_operator_e_2 in Delphi_qvtp_qvtcas {
	 * guard:leftCS lRelExp  : delphi::relExp[1];
	 * var relOp1 : delphi::relOp[?] := lRelExp.relOp;
	 * var op : String[?] := relOp1.op;
	 * var _'=' : Boolean[1] := op =
	 *   '=';
	 * var _'if' : astm::Equal[?] := if _'='
	 *   then astm::Equal{}
	 *   else null
	 *   endif;
	 * new:rightAS rBinaryExpression : astm::BinaryExpression[1];
	 * set lRelExp.ast := rBinaryExpression;
	 * set rBinaryExpression.operator := _'if';
	 *
	 */
	protected boolean MAP_m_BinaryExpression_operator_e_2(final /*@NonInvalid*/ @NonNull relExp lRelExp)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable relOp relOp = lRelExp.getRelOp();
			if (relOp == null) {
				throw throwNull(lRelExp, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::relOp::op\'");
			}
			final /*@Thrown*/ @Nullable String op = relOp.getOp();
			final /*@Thrown*/ boolean symbol_0 = STR_eq.equals(op);
			/*@NonInvalid*/ @Nullable Equal symbol_2;
			if (symbol_0) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Equal_0 = idResolver.getClass(CLSSid_Equal, null);
				final /*@NonInvalid*/ @NonNull Equal symbol_1 = (Equal)TYP_astm_c_c_Equal_0.createInstance();
				symbol_2 = symbol_1;
			}
			else {
				symbol_2 = null;
			}
			// creations
			final /*@Thrown*/ @Nullable BinaryExpression rBinaryExpression = AstmFactory.eINSTANCE.createBinaryExpression();
			assert rBinaryExpression != null;
			models[1/*rightAS*/].add(rBinaryExpression);
			// mapping statements
			lRelExp.setAst(rBinaryExpression);
			rBinaryExpression.setOperator(symbol_2);
			final /*@Thrown*/ @Nullable Boolean m_BinaryExpression_operator_e_2 = ValueUtil.TRUE_VALUE;
			return m_BinaryExpression_operator_e_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_BinaryExpression_operator_e_2", e);
		}
	}

	/**
	 *
	 * map m_TryStatement__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lTryStmt  : delphi::tryStmt[1];
	 * new:rightAS rTryStatement : astm::TryStatement[1];
	 * set lTryStmt.ast := rTryStatement;
	 *
	 */
	protected boolean MAP_m_TryStatement__ast(final /*@NonInvalid*/ @NonNull tryStmt lTryStmt)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable TryStatement rTryStatement = AstmFactory.eINSTANCE.createTryStatement();
			assert rTryStatement != null;
			models[1/*rightAS*/].add(rTryStatement);
			// mapping statements
			lTryStmt.setAst(rTryStatement);
			final /*@Thrown*/ @Nullable Boolean m_TryStatement__ast = ValueUtil.TRUE_VALUE;
			return m_TryStatement__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_TryStatement__ast", e);
		}
	}

	/**
	 *
	 * map m_TypeDefinition_name_e in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lTypeDecl  : delphi::typeDecl[1];
	 * var id : delphi::ident[?] := lTypeDecl.id;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * new:rightAS rTypeDefinition : astm::TypeDefinition[1];
	 * set lTypeDecl.ast := rTypeDefinition;
	 * set rTypeDefinition.name := Name1;
	 *
	 */
	protected boolean MAP_m_TypeDefinition_name_e(final /*@NonInvalid*/ @NonNull typeDecl lTypeDecl)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable ident id = lTypeDecl.getId();
			if (id == null) {
				throw throwNull(lTypeDecl, "Null source for \'delphi::ident::extract() : String[?]\'");
			}
			final /*@Thrown*/ @Nullable String extract = INSTANCE_ident_extract.evaluate(id);
			final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
			final /*@Thrown*/ @NonNull Name symbol_1 = (Name)TYP_astm_c_c_Name_0.createInstance();
			CTORid_nameString.initValue(symbol_1, extract);
			// creations
			final /*@Thrown*/ @Nullable TypeDefinition rTypeDefinition = AstmFactory.eINSTANCE.createTypeDefinition();
			assert rTypeDefinition != null;
			models[1/*rightAS*/].add(rTypeDefinition);
			// mapping statements
			lTypeDecl.setAst(rTypeDefinition);
			rTypeDefinition.setName(symbol_1);
			final /*@Thrown*/ @Nullable Boolean m_TypeDefinition_name_e = ValueUtil.TRUE_VALUE;
			return m_TypeDefinition_name_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_TypeDefinition_name_e", e);
		}
	}

	/**
	 *
	 * map m_DelphiUnit_language_locationInfo_name_e in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lUnit  : delphi::unit[1];
	 * var SourceFile1 : astm::SourceFile[1] := astm::SourceFile{
	 *   }
	 *   ;
	 * var SourceLocation1 : astm::SourceLocation[1] := astm::SourceLocation{inSourceFile = SourceFile1
	 *   }
	 *   ;
	 * var id : delphi::ident[?] := lUnit.id;
	 * var extract : String[?] := id.extract()
	 *   ;
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * new:rightAS rDelphiUnit : astm::DelphiUnit[1];
	 * set rDelphiUnit.language := 'Delphi';
	 * set lUnit.ast := rDelphiUnit;
	 * set rDelphiUnit.locationInfo := SourceLocation1;
	 * set rDelphiUnit.name := Name1;
	 *
	 */
	protected boolean MAP_m_DelphiUnit_language_locationInfo_name_e(final /*@NonInvalid*/ @NonNull unit lUnit)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_SourceFile_0 = idResolver.getClass(CLSSid_SourceFile, null);
			final /*@NonInvalid*/ @NonNull SourceFile symbol_0 = (SourceFile)TYP_astm_c_c_SourceFile_0.createInstance();
			final /*@NonInvalid*/ @NonNull Property CTORid_inSourceFile = idResolver.getProperty(PROPid_inSourceFile);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_SourceLocation_0 = idResolver.getClass(CLSSid_SourceLocation, null);
			final /*@Thrown*/ @NonNull SourceLocation symbol_2 = (SourceLocation)TYP_astm_c_c_SourceLocation_0.createInstance();
			CTORid_inSourceFile.initValue(symbol_2, symbol_0);
			final /*@Thrown*/ @Nullable ident id = lUnit.getId();
			if (id == null) {
				throw throwNull(lUnit, "Null source for \'delphi::ident::extract() : String[?]\'");
			}
			final /*@Thrown*/ @Nullable String extract = INSTANCE_ident_extract.evaluate(id);
			final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
			final /*@Thrown*/ @NonNull Name symbol_4 = (Name)TYP_astm_c_c_Name_0.createInstance();
			CTORid_nameString.initValue(symbol_4, extract);
			// creations
			final /*@Thrown*/ @Nullable DelphiUnit rDelphiUnit = AstmFactory.eINSTANCE.createDelphiUnit();
			assert rDelphiUnit != null;
			models[1/*rightAS*/].add(rDelphiUnit);
			// mapping statements
			rDelphiUnit.setLanguage(STR_Delphi);
			lUnit.setAst(rDelphiUnit);
			rDelphiUnit.setLocationInfo(symbol_2);
			rDelphiUnit.setName(symbol_4);
			final /*@Thrown*/ @Nullable Boolean m_DelphiUnit_language_locationInfo_name_e = ValueUtil.TRUE_VALUE;
			return m_DelphiUnit_language_locationInfo_name_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiUnit_language_locationInfo_name_e", e);
		}
	}

	/**
	 *
	 * map m_VariableDefinition_identifierName_isMutable_e in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lVarDecl  : delphi::varDecl[1];
	 * var idList : delphi::identList[?] := lVarDecl.idList;
	 * var extract : String[?] := idList.extract()
	 *   ;
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * new:rightAS rVariableDefinition : astm::VariableDefinition[1];
	 * set rVariableDefinition.isMutable := true;
	 * set lVarDecl.ast := rVariableDefinition;
	 * set rVariableDefinition.identifierName := Name1;
	 *
	 */
	protected boolean MAP_m_VariableDefinition_identifierName_isMutable_e(final /*@NonInvalid*/ @NonNull varDecl lVarDecl)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable identList idList = lVarDecl.getIdList();
			if (idList == null) {
				throw throwNull(lVarDecl, "Null source for \'delphi::identList::extract() : String[?]\'");
			}
			final /*@Thrown*/ @Nullable String extract = INSTANCE_identList_extract.evaluate(idList);
			final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
			final /*@Thrown*/ @NonNull Name symbol_1 = (Name)TYP_astm_c_c_Name_0.createInstance();
			CTORid_nameString.initValue(symbol_1, extract);
			// creations
			final /*@Thrown*/ @Nullable VariableDefinition rVariableDefinition = AstmFactory.eINSTANCE.createVariableDefinition();
			assert rVariableDefinition != null;
			models[1/*rightAS*/].add(rVariableDefinition);
			// mapping statements
			rVariableDefinition.setIsMutable(ValueUtil.TRUE_VALUE);
			lVarDecl.setAst(rVariableDefinition);
			rVariableDefinition.setIdentifierName(symbol_1);
			final /*@Thrown*/ @Nullable Boolean m_VariableDefinition_identifierName_isMutable_e = ValueUtil.TRUE_VALUE;
			return m_VariableDefinition_identifierName_isMutable_e;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_VariableDefinition_identifierName_isMutable_e", e);
		}
	}

	/**
	 *
	 * map m_DelphiWithStatement__ast in Delphi_qvtp_qvtcas {
	 * guard:leftCS lWithStmt  : delphi::withStmt[1];
	 * new:rightAS rDelphiWithStatement : astm::DelphiWithStatement[1];
	 * set lWithStmt.ast := rDelphiWithStatement;
	 *
	 */
	protected boolean MAP_m_DelphiWithStatement__ast(final /*@NonInvalid*/ @NonNull withStmt lWithStmt)  {
		try {
			// creations
			final /*@Thrown*/ @Nullable DelphiWithStatement rDelphiWithStatement = AstmFactory.eINSTANCE.createDelphiWithStatement();
			assert rDelphiWithStatement != null;
			models[1/*rightAS*/].add(rDelphiWithStatement);
			// mapping statements
			lWithStmt.setAst(rDelphiWithStatement);
			final /*@Thrown*/ @Nullable Boolean m_DelphiWithStatement__ast = ValueUtil.TRUE_VALUE;
			return m_DelphiWithStatement__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_DelphiWithStatement__ast", e);
		}
	}

	/**
	 *
	 * map m_Visitable__ast in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lRecordConstExp  : delphi::RecordConstExp[1];
	 * var exps : OrderedSet(delphi::recordConstExpr) := lRecordConstExp.exps;
	 * var _'\u00ABcollect\u00BB' : Sequence(delphi::constExpr)[*|?] := exps->collect(_'1_' | _'1_'.constExp)
	 *   ;
	 * var _'\u00ABcollect\u00BB1' : Sequence(astm::Expression)[*|?] := _'\u00ABcollect\u00BB'->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Expression))
	 *   ;
	 * var first : astm::Expression[?] := _'\u00ABcollect\u00BB1'->first();
	 * set lRecordConstExp.ast := first;
	 *
	 */
	protected boolean MAP_m_Visitable__ast(final /*@NonInvalid*/ @NonNull RecordConstExp lRecordConstExp)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<recordConstExpr> exps = lRecordConstExp.getExps();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_exps = idResolver.createOrderedSetOfAll(ORD_CLSSid_recordConstExpr, exps);
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_constExpr);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_exps.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull recordConstExpr _1 = (recordConstExpr)ITERATOR__1.next();
				/**
				 * _'1_'.constExp
				 */
				final /*@Thrown*/ @Nullable constExpr constExp = _1.getConstExp();
				//
				accumulator.add(constExp);
			}
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Expression);
			@Nullable Iterator<Object> ITERATOR__1_0 = collect.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect_0 = accumulator_0;
					break;
				}
				/*@NonInvalid*/ @Nullable constExpr _1_0 = (constExpr)ITERATOR__1_0.next();
				/**
				 * _'1_'.ast.oclAsType(astm::Expression)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				if (_1_0 == null) {
					throw throwNull(lRecordConstExp, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast = _1_0.getAst();
				final /*@Thrown*/ @NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
				//
				accumulator_0.add(oclAsType);
			}
			final /*@Thrown*/ @Nullable Expression first = (Expression)OrderedCollectionFirstOperation.INSTANCE.evaluate(collect_0);
			// mapping statements
			lRecordConstExp.setAst(first);
			final /*@Thrown*/ @Nullable Boolean m_Visitable__ast = ValueUtil.TRUE_VALUE;
			return m_Visitable__ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__ast", e);
		}
	}

	/**
	 *
	 * map m_OrderedSet__declarations in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lBlock  : delphi::block[1];
	 * var ast : astm::Visitable[1] := lBlock.ast;
	 * var declSect : delphi::declSection[?] := lBlock.declSect;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var oclAsSet : Set(delphi::declSection) := declSect.oclAsSet()
	 *   ;
	 * var asSequence : Sequence(delphi::declSection) := oclAsSet->asSequence()
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::DefinitionObject) := asSequence->collect(_'1_' |
	 *     _'1_'.getFragments())
	 *   ;
	 * var excluding : Collection(astm::DefinitionObject)[*|?] := _'\u00ABcollect\u00BB'->excluding(null);
	 * set aDelphiBlockStatement.declarations := excluding;
	 *
	 */
	protected boolean MAP_m_OrderedSet__declarations(final /*@NonInvalid*/ @NonNull block lBlock_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lBlock_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lBlock_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable declSection declSect = lBlock_0.getDeclSect();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ @NonNull DelphiBlockStatement oclAsType = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiBlockStatement_0));
				final /*@Thrown*/ @NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_declSection, declSect);
				final /*@Thrown*/ @NonNull SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(oclAsSet);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_DefinitionObject);
				@NonNull Iterator<Object> ITERATOR__1 = asSequence.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull declSection _1 = (declSection)ITERATOR__1.next();
					/**
					 * _'1_'.getFragments()
					 */
					final /*@Thrown*/ @NonNull SequenceValue getFragments = INSTANCE_declSection_getFragments.evaluate(_1);
					//
					for (Object value : getFragments.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				final /*@Thrown*/ @NonNull CollectionValue excluding = CollectionExcludingOperation.INSTANCE.evaluate(collect, (Object)null);
				// mapping statements
				final /*@Thrown*/ @NonNull List<DefinitionObject> ECORE_excluding = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DefinitionObject.class, excluding);
				oclAsType.getDeclarations().addAll(ECORE_excluding);
				final /*@Thrown*/ @Nullable Boolean m_OrderedSet__declarations = ValueUtil.TRUE_VALUE;
				raw_ast = m_OrderedSet__declarations;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_OrderedSet__declarations", e);
		}
	}

	/**
	 *
	 * map m_m_constExpr_ast0 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lConstExpr  : delphi::constExpr[1];
	 * check lConstExpr.oclIsTypeOf(delphi::constExpr);
	 * set lConstExpr.ast := null;
	 *
	 */
	protected boolean MAP_m_m_constExpr_ast0(final /*@NonInvalid*/ @NonNull constExpr lConstExpr)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_constExpr_0_0 = idResolver.getClass(CLSSid_constExpr, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lConstExpr, TYP_delphi_c_c_constExpr_0_0).booleanValue();
			/*@Thrown*/ @Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lConstExpr.setAst(null);
				final /*@Thrown*/ @Nullable Boolean m_m_constExpr_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_m_constExpr_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_m_constExpr_ast0", e);
		}
	}

	/**
	 *
	 * map m_Visitable__NameReference_name in Delphi_qvtp_qvtcas {
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
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aIdentifierReference.name := Name1;
	 *
	 */
	protected boolean MAP_m_Visitable__NameReference_name(final /*@NonInvalid*/ @NonNull designator lDesignator_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lDesignator_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_1, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable designatorSubPart subpart = lDesignator_1.getSubpart();
				final /*@Thrown*/ @Nullable designator designator = lDesignator_1.getDesignator();
				final /*@Thrown*/ boolean eq = designator == null;
				/*@Thrown*/ @Nullable Boolean symbol_5;
				if (eq) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_IdentifierReference_0 = idResolver.getClass(CLSSid_IdentifierReference, null);
					final /*@Thrown*/ @NonNull IdentifierReference oclAsType = ClassUtil.nonNullState((IdentifierReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IdentifierReference_0));
					if (subpart == null) {
						throw throwNull(lDesignator_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
					}
					final /*@Thrown*/ @Nullable designatorPart part = subpart.getPart();
					if (part == null) {
						throw throwNull(lDesignator_1, "Null where non-null value required");
					}
					final /*@Thrown*/ @Nullable String id = part.getId();
					final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
					final /*@Thrown*/ @NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
					CTORid_nameString.initValue(symbol_2, id);
					// mapping statements
					oclAsType.setName(symbol_2);
					final /*@Thrown*/ @Nullable Boolean m_Visitable__NameReference_name = ValueUtil.TRUE_VALUE;
					symbol_5 = m_Visitable__NameReference_name;
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
			return handleExecutionFailure("MAP_m_Visitable__NameReference_name", e);
		}
	}

	/**
	 *
	 * map m_Visitable__QualifiedIdentifierReference_member in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * var ast : astm::Visitable[1] := lDesignator.ast;
	 * var designator1 : delphi::designator[?] := lDesignator.designator;
	 * check not lDesignator.isIdentifierRef()
	 *   ;
	 * check lDesignator.isQualifiedOverData()
	 *   ;
	 * var aQualifiedOverData : astm::QualifiedOverData[1] := ast.oclAsType(astm::QualifiedOverData)
	 *   ;
	 * var ast1 : astm::Visitable[?] := designator1.ast;
	 * var aNameReference : astm::NameReference[1] := ast1.oclAsType(astm::NameReference)
	 *   ;
	 * var aIdentifierReference : astm::IdentifierReference[1] := aNameReference.oclAsType(astm::IdentifierReference);
	 * set aQualifiedOverData.member := aIdentifierReference;
	 *
	 */
	protected boolean MAP_m_Visitable__QualifiedIdentifierReference_member(final /*@NonInvalid*/ @NonNull designator lDesignator_2)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lDesignator_2.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_2, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable designator designator = lDesignator_2.getDesignator();
				/*@Caught*/ @NonNull Object CAUGHT_eq;
				try {
					final /*@Thrown*/ @Nullable designator designator_0 = lDesignator_2.getDesignator();
					final /*@Thrown*/ boolean eq = designator_0 == null;
					CAUGHT_eq = eq;
				}
				catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq);
				if (not == null) {
					throw throwNull(lDesignator_2, "Null if condition");
				}
				/*@Thrown*/ @Nullable Boolean symbol_4;
				if (not) {
					final /*@Thrown*/ @Nullable designator designator_1 = lDesignator_2.getDesignator();
					final /*@Thrown*/ boolean ne = designator_1 != null;
					/*@Thrown*/ @Nullable Boolean symbol_3;
					if (ne) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_QualifiedOverData_0 = idResolver.getClass(CLSSid_QualifiedOverData, null);
						final /*@Thrown*/ @NonNull QualifiedOverData oclAsType = ClassUtil.nonNullState((QualifiedOverData)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_QualifiedOverData_0));
						if (designator == null) {
							throw throwNull(lDesignator_2, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
						}
						final /*@Thrown*/ @Nullable Visitable ast_0 = designator.getAst();
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
						final /*@Thrown*/ @NonNull NameReference oclAsType_0 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_NameReference_0));
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_IdentifierReference_0 = idResolver.getClass(CLSSid_IdentifierReference, null);
						final /*@Thrown*/ @NonNull IdentifierReference oclAsType_1 = ClassUtil.nonNullState((IdentifierReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclAsType_0, TYP_astm_c_c_IdentifierReference_0));
						// mapping statements
						oclAsType.setMember(oclAsType_1);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__QualifiedIdentifierReference_member = ValueUtil.TRUE_VALUE;
						symbol_3 = m_Visitable__QualifiedIdentifierReference_member;
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
			return handleExecutionFailure("MAP_m_Visitable__QualifiedIdentifierReference_member", e);
		}
	}

	/**
	 *
	 * map m_Visitable__NameReference_name_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * var ast : astm::Visitable[1] := lDesignator.ast;
	 * var subpart : delphi::designatorSubPart[?] := lDesignator.subpart;
	 * check not lDesignator.isIdentifierRef()
	 *   ;
	 * check lDesignator.isQualifiedOverData()
	 *   ;
	 * var aQualifiedOverData : astm::QualifiedOverData[1] := ast.oclAsType(astm::QualifiedOverData)
	 *   ;
	 * var part : delphi::designatorPart[?] := subpart.part;
	 * var extract : String[?] := part.extract()
	 *   ;
	 * var Name1 : astm::Name[1] := astm::Name{nameString = extract
	 *   };
	 * set aQualifiedOverData.name := Name1;
	 *
	 */
	protected boolean MAP_m_Visitable__NameReference_name_1(final /*@NonInvalid*/ @NonNull designator lDesignator_3)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lDesignator_3.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_3, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable designatorSubPart subpart = lDesignator_3.getSubpart();
				/*@Caught*/ @NonNull Object CAUGHT_eq;
				try {
					final /*@Thrown*/ @Nullable designator designator = lDesignator_3.getDesignator();
					final /*@Thrown*/ boolean eq = designator == null;
					CAUGHT_eq = eq;
				}
				catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq);
				if (not == null) {
					throw throwNull(lDesignator_3, "Null if condition");
				}
				/*@Thrown*/ @Nullable Boolean symbol_6;
				if (not) {
					final /*@Thrown*/ @Nullable designator designator_0 = lDesignator_3.getDesignator();
					final /*@Thrown*/ boolean ne = designator_0 != null;
					/*@Thrown*/ @Nullable Boolean symbol_5;
					if (ne) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_QualifiedOverData_0 = idResolver.getClass(CLSSid_QualifiedOverData, null);
						final /*@Thrown*/ @NonNull QualifiedOverData oclAsType = ClassUtil.nonNullState((QualifiedOverData)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_QualifiedOverData_0));
						if (subpart == null) {
							throw throwNull(lDesignator_3, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::designatorSubPart::part\'");
						}
						final /*@Thrown*/ @Nullable designatorPart part = subpart.getPart();
						if (part == null) {
							throw throwNull(lDesignator_3, "Null where non-null value required");
						}
						final /*@Thrown*/ @Nullable String id = part.getId();
						final /*@NonInvalid*/ @NonNull Property CTORid_nameString = idResolver.getProperty(PROPid_nameString);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Name_0 = idResolver.getClass(CLSSid_Name, null);
						final /*@Thrown*/ @NonNull Name symbol_2 = (Name)TYP_astm_c_c_Name_0.createInstance();
						CTORid_nameString.initValue(symbol_2, id);
						// mapping statements
						oclAsType.setName(symbol_2);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__NameReference_name_1 = ValueUtil.TRUE_VALUE;
						symbol_5 = m_Visitable__NameReference_name_1;
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
			return handleExecutionFailure("MAP_m_Visitable__NameReference_name_1", e);
		}
	}

	/**
	 *
	 * map m_m_expression_ast0 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lExpression  : delphi::expression[1];
	 * check lExpression.oclIsTypeOf(delphi::expression);
	 * set lExpression.ast := null;
	 *
	 */
	protected boolean MAP_m_m_expression_ast0(final /*@NonInvalid*/ @NonNull expression lExpression)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_expression_0_0 = idResolver.getClass(CLSSid_expression, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lExpression, TYP_delphi_c_c_expression_0_0).booleanValue();
			/*@Thrown*/ @Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lExpression.setAst(null);
				final /*@Thrown*/ @Nullable Boolean m_m_expression_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_m_expression_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_m_expression_ast0", e);
		}
	}

	/**
	 *
	 * map m_Visitable__FunctionCallExpression_calledFunction in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var designator1 : delphi::designator[?] := lFactor.designator;
	 * check lFactor.isAFunctionCall()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check not lFactor.isAString()
	 *   ;
	 * var aDelphiFunctionCallExpression : astm::DelphiFunctionCallExpression[1] := ast.oclAsType(astm::DelphiFunctionCallExpression)
	 *   ;
	 * var ast1 : astm::Visitable[?] := designator1.ast;
	 * var aNameReference : astm::NameReference[1] := ast1.oclAsType(astm::NameReference);
	 * set aDelphiFunctionCallExpression.calledFunction := aNameReference;
	 *
	 */
	protected boolean MAP_m_Visitable__FunctionCallExpression_calledFunction(final /*@NonInvalid*/ @NonNull factor lFactor_4)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lFactor_4.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_4, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable designator designator = lFactor_4.getDesignator();
				final /*@Thrown*/ @Nullable exprList expList = lFactor_4.getExpList();
				final /*@Thrown*/ boolean ne = expList != null;
				/*@Thrown*/ @Nullable Boolean symbol_6;
				if (ne) {
					/*@Caught*/ @NonNull Object CAUGHT_ne_0;
					try {
						final /*@Thrown*/ @Nullable String number = lFactor_4.getNumber();
						final /*@Thrown*/ boolean ne_0 = number != null;
						CAUGHT_ne_0 = ne_0;
					}
					catch (Exception e) {
						CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
					if (not == null) {
						throw throwNull(lFactor_4, "Null if condition");
					}
					/*@Thrown*/ @Nullable Boolean symbol_5;
					if (not) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_4, TYP_delphi_c_c_factor_0).booleanValue();
						/*@Thrown*/ @Nullable Boolean symbol_4;
						if (oclIsTypeOf) {
							/*@Caught*/ @NonNull Object CAUGHT_ne_1;
							try {
								final /*@Thrown*/ @Nullable String string = lFactor_4.getString();
								final /*@Thrown*/ boolean ne_1 = string != null;
								CAUGHT_ne_1 = ne_1;
							}
							catch (Exception e) {
								CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ @Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
							if (not_0 == null) {
								throw throwNull(lFactor_4, "Null if condition");
							}
							/*@Thrown*/ @Nullable Boolean symbol_3;
							if (not_0) {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiFunctionCallExpression_0 = idResolver.getClass(CLSSid_DelphiFunctionCallExpression, null);
								final /*@Thrown*/ @NonNull DelphiFunctionCallExpression oclAsType = ClassUtil.nonNullState((DelphiFunctionCallExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiFunctionCallExpression_0));
								if (designator == null) {
									throw throwNull(lFactor_4, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
								}
								final /*@Thrown*/ @Nullable Visitable ast_0 = designator.getAst();
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
								final /*@Thrown*/ @NonNull NameReference oclAsType_0 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_NameReference_0));
								// mapping statements
								oclAsType.setCalledFunction(oclAsType_0);
								final /*@Thrown*/ @Nullable Boolean m_Visitable__FunctionCallExpression_calledFunction = ValueUtil.TRUE_VALUE;
								symbol_3 = m_Visitable__FunctionCallExpression_calledFunction;
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
			return handleExecutionFailure("MAP_m_Visitable__FunctionCallExpression_calledFunction", e);
		}
	}

	/**
	 *
	 * map m_Visitable__value in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var number : String[?] := lFactor.number;
	 * check lFactor.isANumber()
	 *   ;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * var aIntegerLiteral : astm::IntegerLiteral[1] := ast.oclAsType(astm::IntegerLiteral);
	 * set aIntegerLiteral.value := number;
	 *
	 */
	protected boolean MAP_m_Visitable__value(final /*@NonInvalid*/ @NonNull factor lFactor_5)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lFactor_5.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_5, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable String number = lFactor_5.getNumber();
				final /*@Thrown*/ @Nullable String number_0 = lFactor_5.getNumber();
				final /*@Thrown*/ boolean ne = number_0 != null;
				/*@Thrown*/ @Nullable Boolean symbol_4;
				if (ne) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_5, TYP_delphi_c_c_factor_0).booleanValue();
					/*@Thrown*/ @Nullable Boolean symbol_3;
					if (oclIsTypeOf) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_IntegerLiteral_0 = idResolver.getClass(CLSSid_IntegerLiteral, null);
						final /*@Thrown*/ @NonNull IntegerLiteral oclAsType = ClassUtil.nonNullState((IntegerLiteral)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IntegerLiteral_0));
						// mapping statements
						oclAsType.setValue(number);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__value = ValueUtil.TRUE_VALUE;
						symbol_3 = m_Visitable__value;
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
			return handleExecutionFailure("MAP_m_Visitable__value", e);
		}
	}

	/**
	 *
	 * map m_Visitable__value_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var string : String[?] := lFactor.string;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.isAString()
	 *   ;
	 * var aStringLiteral : astm::StringLiteral[1] := ast.oclAsType(astm::StringLiteral);
	 * set aStringLiteral.value := string;
	 *
	 */
	protected boolean MAP_m_Visitable__value_1(final /*@NonInvalid*/ @NonNull factor lFactor_6)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lFactor_6.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_6, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable String string = lFactor_6.getString();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_6, TYP_delphi_c_c_factor_0).booleanValue();
				/*@Thrown*/ @Nullable Boolean symbol_5;
				if (oclIsTypeOf) {
					/*@Caught*/ @NonNull Object CAUGHT_ne;
					try {
						final /*@Thrown*/ @Nullable String number = lFactor_6.getNumber();
						final /*@Thrown*/ boolean ne = number != null;
						CAUGHT_ne = ne;
					}
					catch (Exception e) {
						CAUGHT_ne = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
					if (not == null) {
						throw throwNull(lFactor_6, "Null if condition");
					}
					/*@Thrown*/ @Nullable Boolean symbol_4;
					if (not) {
						final /*@Thrown*/ @Nullable String string_0 = lFactor_6.getString();
						final /*@Thrown*/ boolean ne_0 = string_0 != null;
						/*@Thrown*/ @Nullable Boolean symbol_3;
						if (ne_0) {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_StringLiteral_0 = idResolver.getClass(CLSSid_StringLiteral, null);
							final /*@Thrown*/ @NonNull StringLiteral oclAsType = ClassUtil.nonNullState((StringLiteral)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_StringLiteral_0));
							// mapping statements
							oclAsType.setValue(string);
							final /*@Thrown*/ @Nullable Boolean m_Visitable__value_1 = ValueUtil.TRUE_VALUE;
							symbol_3 = m_Visitable__value_1;
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
			return handleExecutionFailure("MAP_m_Visitable__value_1", e);
		}
	}

	/**
	 *
	 * map m_Visitable__UnaryExpression_operator in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var Not1 : astm::Not[1] := astm::Not{
	 *   }
	 *   ;
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check not lFactor.isAString()
	 *   ;
	 * check lFactor.isNotExp()
	 *   ;
	 * check not lFactor.isAFunctionCall()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * var aUnaryExpression : astm::UnaryExpression[1] := ast.oclAsType(astm::UnaryExpression);
	 * set aUnaryExpression.operator := Not1;
	 *
	 */
	protected boolean MAP_m_Visitable__UnaryExpression_operator(final /*@NonInvalid*/ @NonNull factor lFactor_7)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Not_0 = idResolver.getClass(CLSSid_Not, null);
			final /*@NonInvalid*/ @NonNull Not symbol_0 = (Not)TYP_astm_c_c_Not_0.createInstance();
			final /*@Thrown*/ @Nullable Visitable ast = lFactor_7.getAst();
			final /*@Thrown*/ boolean symbol_1 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_1) {
				if (ast == null) {
					throw throwNull(lFactor_7, "Null where non-null value required");
				}
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_7, TYP_delphi_c_c_factor_0).booleanValue();
				/*@Thrown*/ @Nullable Boolean symbol_8;
				if (oclIsTypeOf) {
					/*@Caught*/ @NonNull Object CAUGHT_ne;
					try {
						final /*@Thrown*/ @Nullable String string = lFactor_7.getString();
						final /*@Thrown*/ boolean ne = string != null;
						CAUGHT_ne = ne;
					}
					catch (Exception e) {
						CAUGHT_ne = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
					if (not == null) {
						throw throwNull(lFactor_7, "Null if condition");
					}
					/*@Thrown*/ @Nullable Boolean symbol_7;
					if (not) {
						final /*@Thrown*/ @Nullable expression exp = lFactor_7.getExp();
						final /*@Thrown*/ boolean ne_0 = exp != null;
						/*@Thrown*/ @Nullable Boolean symbol_6;
						if (ne_0) {
							/*@Caught*/ @NonNull Object CAUGHT_ne_1;
							try {
								final /*@Thrown*/ @Nullable exprList expList = lFactor_7.getExpList();
								final /*@Thrown*/ boolean ne_1 = expList != null;
								CAUGHT_ne_1 = ne_1;
							}
							catch (Exception e) {
								CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ @Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
							if (not_0 == null) {
								throw throwNull(lFactor_7, "Null if condition");
							}
							/*@Thrown*/ @Nullable Boolean symbol_5;
							if (not_0) {
								/*@Caught*/ @NonNull Object CAUGHT_ne_2;
								try {
									final /*@Thrown*/ @Nullable String number = lFactor_7.getNumber();
									final /*@Thrown*/ boolean ne_2 = number != null;
									CAUGHT_ne_2 = ne_2;
								}
								catch (Exception e) {
									CAUGHT_ne_2 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ @Nullable Boolean not_1 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_2);
								if (not_1 == null) {
									throw throwNull(lFactor_7, "Null if condition");
								}
								/*@Thrown*/ @Nullable Boolean symbol_4;
								if (not_1) {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_UnaryExpression_0 = idResolver.getClass(CLSSid_UnaryExpression, null);
									final /*@Thrown*/ @NonNull UnaryExpression oclAsType = ClassUtil.nonNullState((UnaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_UnaryExpression_0));
									// mapping statements
									oclAsType.setOperator(symbol_0);
									final /*@Thrown*/ @Nullable Boolean m_Visitable__UnaryExpression_operator = ValueUtil.TRUE_VALUE;
									symbol_4 = m_Visitable__UnaryExpression_operator;
								}
								else {
									symbol_4 = ValueUtil.FALSE_VALUE;
								}
								symbol_5 = symbol_4;
							}
							else {
								symbol_5 = ValueUtil.FALSE_VALUE;
							}
							symbol_6 = symbol_5;
						}
						else {
							symbol_6 = ValueUtil.FALSE_VALUE;
						}
						symbol_7 = symbol_6;
					}
					else {
						symbol_7 = ValueUtil.FALSE_VALUE;
					}
					symbol_8 = symbol_7;
				}
				else {
					symbol_8 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = symbol_8;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__UnaryExpression_operator", e);
		}
	}

	/**
	 *
	 * map m_m_file_ast0 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFile  : delphi::file[1];
	 * check lFile.oclIsTypeOf(delphi::file);
	 * set lFile.ast := null;
	 *
	 */
	protected boolean MAP_m_m_file_ast0(final /*@NonInvalid*/ @NonNull file lFile)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_file_0_0 = idResolver.getClass(CLSSid_file, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFile, TYP_delphi_c_c_file_0_0).booleanValue();
			/*@Thrown*/ @Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lFile.setAst(null);
				final /*@Thrown*/ @Nullable Boolean m_m_file_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_m_file_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_m_file_ast0", e);
		}
	}

	/**
	 *
	 * map m_Visitable__body in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFunctionDecl  : delphi::functionDecl[1];
	 * var ast : astm::Visitable[1] := lFunctionDecl.ast;
	 * var block1 : delphi::block[?] := lFunctionDecl.block;
	 * var aFunctionDefinition : astm::FunctionDefinition[1] := ast.oclAsType(astm::FunctionDefinition)
	 *   ;
	 * var ast1 : astm::Visitable[?] := block1.ast;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast1.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var OrderedSet1 : OrderedSet(astm::DelphiBlockStatement) := OrderedSet{aDelphiBlockStatement
	 *   };
	 * set aFunctionDefinition.body := OrderedSet1;
	 *
	 */
	protected boolean MAP_m_Visitable__body(final /*@NonInvalid*/ @NonNull functionDecl lFunctionDecl_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lFunctionDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFunctionDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable block block = lFunctionDecl_0.getBlock();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				final /*@Thrown*/ @NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
				if (block == null) {
					throw throwNull(lFunctionDecl_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = block.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ @NonNull DelphiBlockStatement oclAsType_0 = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DelphiBlockStatement_0));
				final /*@Thrown*/ @NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_DelphiBlockStatement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ @NonNull List<DelphiBlockStatement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DelphiBlockStatement.class, OrderedSet);
				oclAsType.getBody().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__body = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__body;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__body", e);
		}
	}

	/**
	 *
	 * map m_OrderedSet__fragments in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lImplementationSection  : delphi::implementationSection[1];
	 * var ast : astm::Visitable[1] := lImplementationSection.ast;
	 * var declSect : OrderedSet(delphi::declSection) := lImplementationSection.declSect;
	 * var aDelphiImplementationSection : astm::DelphiImplementationSection[1] := ast.oclAsType(astm::DelphiImplementationSection)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::DefinitionObject) := declSect->collect(_'1_' |
	 *     _'1_'.getFragments());
	 * set aDelphiImplementationSection.fragments := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_OrderedSet__fragments(final /*@NonInvalid*/ @NonNull implementationSection lImplementationSection_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lImplementationSection_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lImplementationSection_0, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<declSection> declSect = lImplementationSection_0.getDeclSect();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiImplementationSection_0 = idResolver.getClass(CLSSid_DelphiImplementationSection, null);
				final /*@Thrown*/ @NonNull DelphiImplementationSection oclAsType = ClassUtil.nonNullState((DelphiImplementationSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiImplementationSection_0));
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_declSect = idResolver.createOrderedSetOfAll(ORD_CLSSid_declSection, declSect);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_DefinitionObject);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_declSect.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull declSection _1 = (declSection)ITERATOR__1.next();
					/**
					 * _'1_'.getFragments()
					 */
					final /*@Thrown*/ @NonNull SequenceValue getFragments = INSTANCE_declSection_getFragments.evaluate(_1);
					//
					for (Object value : getFragments.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<DefinitionObject> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DefinitionObject.class, collect);
				oclAsType.getFragments().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_OrderedSet__fragments = ValueUtil.TRUE_VALUE;
				raw_ast = m_OrderedSet__fragments;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_OrderedSet__fragments", e);
		}
	}

	/**
	 *
	 * map m_OrderedSet__fragments_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lInterfaceSection  : delphi::interfaceSection[1];
	 * var ast : astm::Visitable[1] := lInterfaceSection.ast;
	 * var interfaceDecl1 : OrderedSet(delphi::interfaceDecl) := lInterfaceSection.interfaceDecl;
	 * var aDelphiInterfaceSection : astm::DelphiInterfaceSection[1] := ast.oclAsType(astm::DelphiInterfaceSection)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::DefinitionObject) := interfaceDecl1->collect(_'1_' |
	 *     _'1_'.getFragments());
	 * set aDelphiInterfaceSection.fragments := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_OrderedSet__fragments_1(final /*@NonInvalid*/ @NonNull interfaceSection lInterfaceSection_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lInterfaceSection_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lInterfaceSection_0, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<interfaceDecl> interfaceDecl = lInterfaceSection_0.getInterfaceDecl();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiInterfaceSection_0 = idResolver.getClass(CLSSid_DelphiInterfaceSection, null);
				final /*@Thrown*/ @NonNull DelphiInterfaceSection oclAsType = ClassUtil.nonNullState((DelphiInterfaceSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiInterfaceSection_0));
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_interfaceDecl = idResolver.createOrderedSetOfAll(ORD_CLSSid_interfaceDecl, interfaceDecl);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_DefinitionObject);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_interfaceDecl.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull interfaceDecl _1 = (interfaceDecl)ITERATOR__1.next();
					/**
					 * _'1_'.getFragments()
					 */
					final /*@Thrown*/ @NonNull SequenceValue getFragments = INSTANCE_interfaceDecl_getFragments.evaluate(_1);
					//
					for (Object value : getFragments.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<DefinitionObject> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DefinitionObject.class, collect);
				oclAsType.getFragments().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_OrderedSet__fragments_1 = ValueUtil.TRUE_VALUE;
				raw_ast = m_OrderedSet__fragments_1;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_OrderedSet__fragments_1", e);
		}
	}

	/**
	 *
	 * map m_Visitable__files in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lMainRule  : delphi::mainRule[1];
	 * var ast : astm::Visitable[1] := lMainRule.ast;
	 * var file1 : delphi::file[?] := lMainRule.file;
	 * var aProject : astm::Project[1] := ast.oclAsType(astm::Project)
	 *   ;
	 * var ast1 : astm::Visitable[?] := file1.ast;
	 * var aCompilationUnit : astm::CompilationUnit[1] := ast1.oclAsType(astm::CompilationUnit)
	 *   ;
	 * var OrderedSet1 : OrderedSet(astm::CompilationUnit) := OrderedSet{aCompilationUnit
	 *   };
	 * set aProject.files := OrderedSet1;
	 *
	 */
	protected boolean MAP_m_Visitable__files(final /*@NonInvalid*/ @NonNull mainRule lMainRule_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lMainRule_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lMainRule_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable file file = lMainRule_0.getFile();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Project_0 = idResolver.getClass(CLSSid_Project, null);
				final /*@Thrown*/ @NonNull Project oclAsType = ClassUtil.nonNullState((Project)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Project_0));
				if (file == null) {
					throw throwNull(lMainRule_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = file.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_CompilationUnit_0 = idResolver.getClass(CLSSid_CompilationUnit, null);
				final /*@Thrown*/ @NonNull CompilationUnit oclAsType_0 = ClassUtil.nonNullState((CompilationUnit)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_CompilationUnit_0));
				final /*@Thrown*/ @NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_CompilationUnit, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ @NonNull List<CompilationUnit> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(CompilationUnit.class, OrderedSet);
				oclAsType.getFiles().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__files = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__files;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__files", e);
		}
	}

	/**
	 *
	 * map m_Visitable__body_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lProcedureDecl  : delphi::procedureDecl[1];
	 * var ast : astm::Visitable[1] := lProcedureDecl.ast;
	 * var block1 : delphi::block[?] := lProcedureDecl.block;
	 * var aFunctionDefinition : astm::FunctionDefinition[1] := ast.oclAsType(astm::FunctionDefinition)
	 *   ;
	 * var ast1 : astm::Visitable[?] := block1.ast;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast1.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var OrderedSet1 : OrderedSet(astm::DelphiBlockStatement) := OrderedSet{aDelphiBlockStatement
	 *   };
	 * set aFunctionDefinition.body := OrderedSet1;
	 *
	 */
	protected boolean MAP_m_Visitable__body_1(final /*@NonInvalid*/ @NonNull procedureDecl lProcedureDecl_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lProcedureDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lProcedureDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable block block = lProcedureDecl_0.getBlock();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionDefinition_0 = idResolver.getClass(CLSSid_FunctionDefinition, null);
				final /*@Thrown*/ @NonNull FunctionDefinition oclAsType = ClassUtil.nonNullState((FunctionDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_FunctionDefinition_0));
				if (block == null) {
					throw throwNull(lProcedureDecl_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = block.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ @NonNull DelphiBlockStatement oclAsType_0 = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_DelphiBlockStatement_0));
				final /*@Thrown*/ @NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_DelphiBlockStatement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ @NonNull List<DelphiBlockStatement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(DelphiBlockStatement.class, OrderedSet);
				oclAsType.getBody().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__body_1 = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__body_1;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__body_1", e);
		}
	}

	/**
	 *
	 * map m_Visitable__ast_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lSimpleFactor  : delphi::simpleFactor[1];
	 * var designator1 : delphi::designator[?] := lSimpleFactor.designator;
	 * var ast : astm::Visitable[?] := designator1.ast;
	 * var aNameReference : astm::NameReference[1] := ast.oclAsType(astm::NameReference);
	 * set lSimpleFactor.ast := aNameReference;
	 *
	 */
	protected boolean MAP_m_Visitable__ast_1(final /*@NonInvalid*/ @NonNull simpleFactor lSimpleFactor)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable designator designator = lSimpleFactor.getDesignator();
			if (designator == null) {
				throw throwNull(lSimpleFactor, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
			}
			final /*@Thrown*/ @Nullable Visitable ast = designator.getAst();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
			final /*@Thrown*/ @NonNull NameReference oclAsType = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_NameReference_0));
			// mapping statements
			lSimpleFactor.setAst(oclAsType);
			final /*@Thrown*/ @Nullable Boolean m_Visitable__ast_1 = ValueUtil.TRUE_VALUE;
			return m_Visitable__ast_1;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__ast_1", e);
		}
	}

	/**
	 *
	 * map m_Visitable__ast_2 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lConstExp  : delphi::ConstExp[1];
	 * var exp : delphi::expression[?] := lConstExp.exp;
	 * var ast : astm::Visitable[?] := exp.ast;
	 * var aExpression : astm::Expression[1] := ast.oclAsType(astm::Expression);
	 * set lConstExp.ast := aExpression;
	 *
	 */
	protected boolean MAP_m_Visitable__ast_2(final /*@NonInvalid*/ @NonNull ConstExp lConstExp)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable expression exp = lConstExp.getExp();
			if (exp == null) {
				throw throwNull(lConstExp, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
			}
			final /*@Thrown*/ @Nullable Visitable ast = exp.getAst();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
			final /*@Thrown*/ @NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
			// mapping statements
			lConstExp.setAst(oclAsType);
			final /*@Thrown*/ @Nullable Boolean m_Visitable__ast_2 = ValueUtil.TRUE_VALUE;
			return m_Visitable__ast_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__ast_2", e);
		}
	}

	/**
	 *
	 * map m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_2 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lAddExp  : delphi::addExp[1];
	 * var ast : astm::Visitable[1] := lAddExp.ast;
	 * var ast3 : astm::Visitable[1] := lAddExp.ast;
	 * var left : delphi::simpleExpression[?] := lAddExp.left;
	 * var right : delphi::term[?] := lAddExp.right;
	 * var aBinaryExpression : astm::BinaryExpression[1] := ast.oclAsType(astm::BinaryExpression);
	 * var ast1 : astm::Visitable[?] := right.ast;
	 * var ast2 : astm::Visitable[?] := left.ast;
	 * check ast3 =
	 *   lAddExp.ast;
	 * var aExpression : astm::Expression[1] := ast2.oclAsType(astm::Expression)
	 *   ;
	 * var aExpression1 : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aBinaryExpression.leftOperand := aExpression;
	 * set aBinaryExpression.rightOperand := aExpression1;
	 *
	 */
	protected boolean MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_2(final /*@NonInvalid*/ @NonNull addExp lAddExp_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lAddExp_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lAddExp_0, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast3;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lAddExp_0, "Null where non-null value required");
					}
					final /*@Thrown*/ @Nullable simpleExpression left = lAddExp_0.getLeft();
					final /*@Thrown*/ @Nullable term right = lAddExp_0.getRight();
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
					final /*@Thrown*/ @NonNull BinaryExpression oclAsType = ClassUtil.nonNullState((BinaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_BinaryExpression_0));
					if (right == null) {
						throw throwNull(lAddExp_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_1 = right.getAst();
					if (left == null) {
						throw throwNull(lAddExp_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_2 = left.getAst();
					final /*@Thrown*/ boolean symbol_2 = ast.equals(ast);
					/*@Thrown*/ @Nullable Boolean symbol_6;
					if (symbol_2) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
						final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_2, TYP_astm_c_c_Expression_0));
						final /*@Thrown*/ @NonNull Expression oclAsType_1 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Expression_0));
						// mapping statements
						oclAsType.setLeftOperand(oclAsType_0);
						oclAsType.setRightOperand(oclAsType_1);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_2 = ValueUtil.TRUE_VALUE;
						symbol_6 = m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_2;
					}
					else {
						symbol_6 = ValueUtil.FALSE_VALUE;
					}
					raw_ast3 = symbol_6;
				}
				else {
					raw_ast3 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast3;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_2", e);
		}
	}

	/**
	 *
	 * map m_OrderedSet__actualParams in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var expList : delphi::exprList[?] := lFactor.expList;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check lFactor.isAFunctionCall()
	 *   ;
	 * check not lFactor.isAString()
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * var aDelphiFunctionCallExpression : astm::DelphiFunctionCallExpression[1] := ast.oclAsType(astm::DelphiFunctionCallExpression)
	 *   ;
	 * var createActualParams : Sequence(astm::ActualParameterExpression) := expList.createActualParams();
	 * set aDelphiFunctionCallExpression.actualParams := createActualParams;
	 *
	 */
	protected boolean MAP_m_OrderedSet__actualParams(final /*@NonInvalid*/ @NonNull factor lFactor_8)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lFactor_8.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_8, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable exprList expList = lFactor_8.getExpList();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_8, TYP_delphi_c_c_factor_0).booleanValue();
				/*@Thrown*/ @Nullable Boolean symbol_6;
				if (oclIsTypeOf) {
					final /*@Thrown*/ @Nullable exprList expList_0 = lFactor_8.getExpList();
					final /*@Thrown*/ boolean ne = expList_0 != null;
					/*@Thrown*/ @Nullable Boolean symbol_5;
					if (ne) {
						/*@Caught*/ @NonNull Object CAUGHT_ne_0;
						try {
							final /*@Thrown*/ @Nullable String string = lFactor_8.getString();
							final /*@Thrown*/ boolean ne_0 = string != null;
							CAUGHT_ne_0 = ne_0;
						}
						catch (Exception e) {
							CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_0);
						if (not == null) {
							throw throwNull(lFactor_8, "Null if condition");
						}
						/*@Thrown*/ @Nullable Boolean symbol_4;
						if (not) {
							/*@Caught*/ @NonNull Object CAUGHT_ne_1;
							try {
								final /*@Thrown*/ @Nullable String number = lFactor_8.getNumber();
								final /*@Thrown*/ boolean ne_1 = number != null;
								CAUGHT_ne_1 = ne_1;
							}
							catch (Exception e) {
								CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ @Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
							if (not_0 == null) {
								throw throwNull(lFactor_8, "Null if condition");
							}
							/*@Thrown*/ @Nullable Boolean symbol_3;
							if (not_0) {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiFunctionCallExpression_0 = idResolver.getClass(CLSSid_DelphiFunctionCallExpression, null);
								final /*@Thrown*/ @NonNull DelphiFunctionCallExpression oclAsType = ClassUtil.nonNullState((DelphiFunctionCallExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiFunctionCallExpression_0));
								if (expList == null) {
									throw throwNull(lFactor_8, "Null source for \'delphi::exprList::createActualParams() : Sequence(astm::ActualParameterExpression)\'");
								}
								final /*@Thrown*/ @NonNull SequenceValue createActualParams = INSTANCE_exprList_createActualParams.evaluate(expList);
								// mapping statements
								final /*@Thrown*/ @NonNull List<ActualParameterExpression> ECORE_createActualParams = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(ActualParameterExpression.class, createActualParams);
								oclAsType.getActualParams().addAll(ECORE_createActualParams);
								final /*@Thrown*/ @Nullable Boolean m_OrderedSet__actualParams = ValueUtil.TRUE_VALUE;
								symbol_3 = m_OrderedSet__actualParams;
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
			return handleExecutionFailure("MAP_m_OrderedSet__actualParams", e);
		}
	}

	/**
	 *
	 * map m_Visitable__UnaryExpression_operand in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lFactor  : delphi::factor[1];
	 * var ast : astm::Visitable[1] := lFactor.ast;
	 * var exp : delphi::expression[?] := lFactor.exp;
	 * check lFactor.oclIsTypeOf(delphi::factor)
	 *   ;
	 * check not lFactor.isANumber()
	 *   ;
	 * check lFactor.isNotExp()
	 *   ;
	 * check not lFactor.isAString()
	 *   ;
	 * check not lFactor.isAFunctionCall()
	 *   ;
	 * var aUnaryExpression : astm::UnaryExpression[1] := ast.oclAsType(astm::UnaryExpression)
	 *   ;
	 * var ast1 : astm::Visitable[?] := exp.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aUnaryExpression.operand := aExpression;
	 *
	 */
	protected boolean MAP_m_Visitable__UnaryExpression_operand(final /*@NonInvalid*/ @NonNull factor lFactor_9)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lFactor_9.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lFactor_9, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable expression exp = lFactor_9.getExp();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_factor_0 = idResolver.getClass(CLSSid_factor, null);
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lFactor_9, TYP_delphi_c_c_factor_0).booleanValue();
				/*@Thrown*/ @Nullable Boolean symbol_7;
				if (oclIsTypeOf) {
					/*@Caught*/ @NonNull Object CAUGHT_ne;
					try {
						final /*@Thrown*/ @Nullable String number = lFactor_9.getNumber();
						final /*@Thrown*/ boolean ne = number != null;
						CAUGHT_ne = ne;
					}
					catch (Exception e) {
						CAUGHT_ne = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne);
					if (not == null) {
						throw throwNull(lFactor_9, "Null if condition");
					}
					/*@Thrown*/ @Nullable Boolean symbol_6;
					if (not) {
						final /*@Thrown*/ @Nullable expression exp_0 = lFactor_9.getExp();
						final /*@Thrown*/ boolean ne_0 = exp_0 != null;
						/*@Thrown*/ @Nullable Boolean symbol_5;
						if (ne_0) {
							/*@Caught*/ @NonNull Object CAUGHT_ne_1;
							try {
								final /*@Thrown*/ @Nullable String string = lFactor_9.getString();
								final /*@Thrown*/ boolean ne_1 = string != null;
								CAUGHT_ne_1 = ne_1;
							}
							catch (Exception e) {
								CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ @Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_1);
							if (not_0 == null) {
								throw throwNull(lFactor_9, "Null if condition");
							}
							/*@Thrown*/ @Nullable Boolean symbol_4;
							if (not_0) {
								/*@Caught*/ @NonNull Object CAUGHT_ne_2;
								try {
									final /*@Thrown*/ @Nullable exprList expList = lFactor_9.getExpList();
									final /*@Thrown*/ boolean ne_2 = expList != null;
									CAUGHT_ne_2 = ne_2;
								}
								catch (Exception e) {
									CAUGHT_ne_2 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ @Nullable Boolean not_1 = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_ne_2);
								if (not_1 == null) {
									throw throwNull(lFactor_9, "Null if condition");
								}
								/*@Thrown*/ @Nullable Boolean symbol_3;
								if (not_1) {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_UnaryExpression_0 = idResolver.getClass(CLSSid_UnaryExpression, null);
									final /*@Thrown*/ @NonNull UnaryExpression oclAsType = ClassUtil.nonNullState((UnaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_UnaryExpression_0));
									if (exp == null) {
										throw throwNull(lFactor_9, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
									}
									final /*@Thrown*/ @Nullable Visitable ast_0 = exp.getAst();
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
									final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
									// mapping statements
									oclAsType.setOperand(oclAsType_0);
									final /*@Thrown*/ @Nullable Boolean m_Visitable__UnaryExpression_operand = ValueUtil.TRUE_VALUE;
									symbol_3 = m_Visitable__UnaryExpression_operand;
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
						symbol_6 = symbol_5;
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
			return handleExecutionFailure("MAP_m_Visitable__UnaryExpression_operand", e);
		}
	}

	/**
	 *
	 * map m_Visitable__BinaryExpression_BinaryExpression_leftO_lc in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lMultExp  : delphi::multExp[1];
	 * var ast : astm::Visitable[1] := lMultExp.ast;
	 * var ast3 : astm::Visitable[1] := lMultExp.ast;
	 * var left : delphi::term[?] := lMultExp.left;
	 * var right : delphi::factor[?] := lMultExp.right;
	 * var aBinaryExpression : astm::BinaryExpression[1] := ast.oclAsType(astm::BinaryExpression);
	 * var ast1 : astm::Visitable[?] := right.ast;
	 * var ast2 : astm::Visitable[?] := left.ast;
	 * check ast3 =
	 *   lMultExp.ast;
	 * var aExpression : astm::Expression[1] := ast2.oclAsType(astm::Expression)
	 *   ;
	 * var aExpression1 : astm::Expression[1] := ast1.oclAsType(astm::Expression);
	 * set aBinaryExpression.leftOperand := aExpression;
	 * set aBinaryExpression.rightOperand := aExpression1;
	 *
	 */
	protected boolean MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc(final /*@NonInvalid*/ @NonNull multExp lMultExp_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lMultExp_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lMultExp_0, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast3;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lMultExp_0, "Null where non-null value required");
					}
					final /*@Thrown*/ @Nullable term left = lMultExp_0.getLeft();
					final /*@Thrown*/ @Nullable factor right = lMultExp_0.getRight();
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
					final /*@Thrown*/ @NonNull BinaryExpression oclAsType = ClassUtil.nonNullState((BinaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_BinaryExpression_0));
					if (right == null) {
						throw throwNull(lMultExp_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_1 = right.getAst();
					if (left == null) {
						throw throwNull(lMultExp_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_2 = left.getAst();
					final /*@Thrown*/ boolean symbol_2 = ast.equals(ast);
					/*@Thrown*/ @Nullable Boolean symbol_6;
					if (symbol_2) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
						final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_2, TYP_astm_c_c_Expression_0));
						final /*@Thrown*/ @NonNull Expression oclAsType_1 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Expression_0));
						// mapping statements
						oclAsType.setLeftOperand(oclAsType_0);
						oclAsType.setRightOperand(oclAsType_1);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__BinaryExpression_BinaryExpression_leftO_lc = ValueUtil.TRUE_VALUE;
						symbol_6 = m_Visitable__BinaryExpression_BinaryExpression_leftO_lc;
					}
					else {
						symbol_6 = ValueUtil.FALSE_VALUE;
					}
					raw_ast3 = symbol_6;
				}
				else {
					raw_ast3 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast3;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc", e);
		}
	}

	/**
	 *
	 * map m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lRelExp  : delphi::relExp[1];
	 * var ast : astm::Visitable[1] := lRelExp.ast;
	 * var ast3 : astm::Visitable[1] := lRelExp.ast;
	 * var left : delphi::expression[?] := lRelExp.left;
	 * var right : delphi::simpleExpression[?] := lRelExp.right;
	 * var aBinaryExpression : astm::BinaryExpression[1] := ast.oclAsType(astm::BinaryExpression);
	 * var ast1 : astm::Visitable[?] := left.ast;
	 * var ast2 : astm::Visitable[?] := right.ast;
	 * check ast3 =
	 *   lRelExp.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression)
	 *   ;
	 * var aExpression1 : astm::Expression[1] := ast2.oclAsType(astm::Expression);
	 * set aBinaryExpression.leftOperand := aExpression;
	 * set aBinaryExpression.rightOperand := aExpression1;
	 *
	 */
	protected boolean MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_1(final /*@NonInvalid*/ @NonNull relExp lRelExp_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lRelExp_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lRelExp_0, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast3;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lRelExp_0, "Null where non-null value required");
					}
					final /*@Thrown*/ @Nullable expression left = lRelExp_0.getLeft();
					final /*@Thrown*/ @Nullable simpleExpression right = lRelExp_0.getRight();
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
					final /*@Thrown*/ @NonNull BinaryExpression oclAsType = ClassUtil.nonNullState((BinaryExpression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_BinaryExpression_0));
					if (left == null) {
						throw throwNull(lRelExp_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_1 = left.getAst();
					if (right == null) {
						throw throwNull(lRelExp_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_2 = right.getAst();
					final /*@Thrown*/ boolean symbol_2 = ast.equals(ast);
					/*@Thrown*/ @Nullable Boolean symbol_6;
					if (symbol_2) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
						final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Expression_0));
						final /*@Thrown*/ @NonNull Expression oclAsType_1 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_2, TYP_astm_c_c_Expression_0));
						// mapping statements
						oclAsType.setLeftOperand(oclAsType_0);
						oclAsType.setRightOperand(oclAsType_1);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_1 = ValueUtil.TRUE_VALUE;
						symbol_6 = m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_1;
					}
					else {
						symbol_6 = ValueUtil.FALSE_VALUE;
					}
					raw_ast3 = symbol_6;
				}
				else {
					raw_ast3 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast3;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__BinaryExpression_BinaryExpression_leftO_lc_1", e);
		}
	}

	/**
	 *
	 * map m_m_type_ast0 in Delphi_qvtp_qvtcas {
	 * guard:leftCS lType  : delphi::type[1];
	 * set lType.ast := null;
	 *
	 */
	protected boolean MAP_m_m_type_ast0(final /*@NonInvalid*/ @NonNull type lType)  {
		try {
			// mapping statements
			lType.setAst(null);
			final /*@Thrown*/ @Nullable Boolean m_m_type_ast0 = ValueUtil.TRUE_VALUE;
			return m_m_type_ast0;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_m_type_ast0", e);
		}
	}

	/**
	 *
	 * map m_Visitable__DelphiUnit_DelphiUnit_implementation_in_lc in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lUnit  : delphi::unit[1];
	 * var ast : astm::Visitable[1] := lUnit.ast;
	 * var ast3 : astm::Visitable[1] := lUnit.ast;
	 * var implementationSect : delphi::implementationSection[?] := lUnit.implementationSect;
	 * var interfaceSect : delphi::interfaceSection[?] := lUnit.interfaceSect;
	 * var aDelphiUnit : astm::DelphiUnit[1] := ast.oclAsType(astm::DelphiUnit);
	 * var ast1 : astm::Visitable[?] := interfaceSect.ast;
	 * var ast2 : astm::Visitable[?] := implementationSect.ast;
	 * check ast3 =
	 *   lUnit.ast;
	 * var aDelphiImplementationSection : astm::DelphiImplementationSection[1] := ast2.oclAsType(astm::DelphiImplementationSection)
	 *   ;
	 * var aDelphiInterfaceSection : astm::DelphiInterfaceSection[1] := ast1.oclAsType(astm::DelphiInterfaceSection);
	 * set aDelphiUnit.implementation := aDelphiImplementationSection;
	 * set aDelphiUnit.interface := aDelphiInterfaceSection;
	 *
	 */
	protected boolean MAP_m_Visitable__DelphiUnit_DelphiUnit_implementation_in_lc(final /*@NonInvalid*/ @NonNull unit lUnit_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lUnit_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lUnit_0, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast3;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lUnit_0, "Null where non-null value required");
					}
					final /*@Thrown*/ @Nullable implementationSection implementationSect = lUnit_0.getImplementationSect();
					final /*@Thrown*/ @Nullable interfaceSection interfaceSect = lUnit_0.getInterfaceSect();
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiUnit_0 = idResolver.getClass(CLSSid_DelphiUnit, null);
					final /*@Thrown*/ @NonNull DelphiUnit oclAsType = ClassUtil.nonNullState((DelphiUnit)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiUnit_0));
					if (interfaceSect == null) {
						throw throwNull(lUnit_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_1 = interfaceSect.getAst();
					if (implementationSect == null) {
						throw throwNull(lUnit_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_2 = implementationSect.getAst();
					final /*@Thrown*/ boolean symbol_2 = ast.equals(ast);
					/*@Thrown*/ @Nullable Boolean symbol_6;
					if (symbol_2) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiImplementationSection_0 = idResolver.getClass(CLSSid_DelphiImplementationSection, null);
						final /*@Thrown*/ @NonNull DelphiImplementationSection oclAsType_0 = ClassUtil.nonNullState((DelphiImplementationSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_2, TYP_astm_c_c_DelphiImplementationSection_0));
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiInterfaceSection_0 = idResolver.getClass(CLSSid_DelphiInterfaceSection, null);
						final /*@Thrown*/ @NonNull DelphiInterfaceSection oclAsType_1 = ClassUtil.nonNullState((DelphiInterfaceSection)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_DelphiInterfaceSection_0));
						// mapping statements
						oclAsType.setImplementation(oclAsType_0);
						oclAsType.setInterface(oclAsType_1);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__DelphiUnit_DelphiUnit_implementation_in_lc = ValueUtil.TRUE_VALUE;
						symbol_6 = m_Visitable__DelphiUnit_DelphiUnit_implementation_in_lc;
					}
					else {
						symbol_6 = ValueUtil.FALSE_VALUE;
					}
					raw_ast3 = symbol_6;
				}
				else {
					raw_ast3 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast3;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__DelphiUnit_DelphiUnit_implementation_in_lc", e);
		}
	}

	/**
	 *
	 * map m_m_unlabelledStatement_ast0 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lUnlabelledStatement  : delphi::unlabelledStatement[1];
	 * check lUnlabelledStatement.oclIsTypeOf(delphi::unlabelledStatement);
	 * set lUnlabelledStatement.ast := null;
	 *
	 */
	protected boolean MAP_m_m_unlabelledStatement_ast0(final /*@NonInvalid*/ @NonNull unlabelledStatement lUnlabelledStatement)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_delphi_c_c_unlabelledStatement_0_0 = idResolver.getClass(CLSSid_unlabelledStatement, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, lUnlabelledStatement, TYP_delphi_c_c_unlabelledStatement_0_0).booleanValue();
			/*@Thrown*/ @Nullable Boolean symbol_2;
			if (oclIsTypeOf) {
				// mapping statements
				lUnlabelledStatement.setAst(null);
				final /*@Thrown*/ @Nullable Boolean m_m_unlabelledStatement_ast0 = ValueUtil.TRUE_VALUE;
				symbol_2 = m_m_unlabelledStatement_ast0;
			}
			else {
				symbol_2 = ValueUtil.FALSE_VALUE;
			}
			return symbol_2;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_m_unlabelledStatement_ast0", e);
		}
	}

	/**
	 *
	 * map m_Visitable__ExpressionStatement_expression in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lAssignmentStmnt  : delphi::assignmentStmnt[1];
	 * var Assign1 : astm::Assign[1] := astm::Assign{
	 *   }
	 *   ;
	 * var ast : astm::Visitable[1] := lAssignmentStmnt.ast;
	 * var designator1 : delphi::designator[?] := lAssignmentStmnt.designator;
	 * var exp : delphi::expression[?] := lAssignmentStmnt.exp;
	 * var aExpressionStatement : astm::ExpressionStatement[1] := ast.oclAsType(astm::ExpressionStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := designator1.ast;
	 * var ast2 : astm::Visitable[?] := exp.ast;
	 * var aExpression : astm::Expression[1] := ast2.oclAsType(astm::Expression)
	 *   ;
	 * var aNameReference : astm::NameReference[1] := ast1.oclAsType(astm::NameReference)
	 *   ;
	 * var BinaryExpression1 : astm::BinaryExpression[1] := astm::BinaryExpression{leftOperand = aNameReference, operator = Assign1, rightOperand = aExpression
	 *   };
	 * set aExpressionStatement.expression := BinaryExpression1;
	 *
	 */
	protected boolean MAP_m_Visitable__ExpressionStatement_expression(final /*@NonInvalid*/ @NonNull assignmentStmnt lAssignmentStmnt_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Assign_0 = idResolver.getClass(CLSSid_Assign, null);
			final /*@NonInvalid*/ @NonNull Assign symbol_0 = (Assign)TYP_astm_c_c_Assign_0.createInstance();
			final /*@Thrown*/ @Nullable Visitable ast = lAssignmentStmnt_0.getAst();
			final /*@Thrown*/ boolean symbol_1 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_1) {
				if (ast == null) {
					throw throwNull(lAssignmentStmnt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable designator designator = lAssignmentStmnt_0.getDesignator();
				final /*@Thrown*/ @Nullable expression exp = lAssignmentStmnt_0.getExp();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_ExpressionStatement_0 = idResolver.getClass(CLSSid_ExpressionStatement, null);
				final /*@Thrown*/ @NonNull ExpressionStatement oclAsType = ClassUtil.nonNullState((ExpressionStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_ExpressionStatement_0));
				if (designator == null) {
					throw throwNull(lAssignmentStmnt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = designator.getAst();
				if (exp == null) {
					throw throwNull(lAssignmentStmnt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_1 = exp.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Expression_0));
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
				final /*@Thrown*/ @NonNull NameReference oclAsType_1 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_NameReference_0));
				final /*@NonInvalid*/ @NonNull Property CTORid_leftOperand = idResolver.getProperty(PROPid_leftOperand);
				final /*@NonInvalid*/ @NonNull Property CTORid_operator = idResolver.getProperty(PROPid_operator);
				final /*@NonInvalid*/ @NonNull Property CTORid_rightOperand = idResolver.getProperty(PROPid_rightOperand);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BinaryExpression_0 = idResolver.getClass(CLSSid_BinaryExpression, null);
				final /*@Thrown*/ @NonNull BinaryExpression symbol_5 = (BinaryExpression)TYP_astm_c_c_BinaryExpression_0.createInstance();
				CTORid_leftOperand.initValue(symbol_5, oclAsType_1);
				CTORid_operator.initValue(symbol_5, symbol_0);
				CTORid_rightOperand.initValue(symbol_5, oclAsType_0);
				// mapping statements
				oclAsType.setExpression(symbol_5);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__ExpressionStatement_expression = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__ExpressionStatement_expression;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__ExpressionStatement_expression", e);
		}
	}

	/**
	 *
	 * map m_Visitable__subStatements in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lBlock  : delphi::block[1];
	 * var ast : astm::Visitable[1] := lBlock.ast;
	 * var compound : delphi::compoundStmt[?] := lBlock.compound;
	 * var aDelphiBlockStatement : astm::DelphiBlockStatement[1] := ast.oclAsType(astm::DelphiBlockStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := compound.ast;
	 * var aBlockStatement : astm::BlockStatement[1] := ast1.oclAsType(astm::BlockStatement)
	 *   ;
	 * var OrderedSet1 : OrderedSet(astm::BlockStatement) := OrderedSet{aBlockStatement
	 *   };
	 * set aDelphiBlockStatement.subStatements := OrderedSet1;
	 *
	 */
	protected boolean MAP_m_Visitable__subStatements(final /*@NonInvalid*/ @NonNull block lBlock_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lBlock_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lBlock_1, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable compoundStmt compound = lBlock_1.getCompound();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiBlockStatement_0 = idResolver.getClass(CLSSid_DelphiBlockStatement, null);
				final /*@Thrown*/ @NonNull DelphiBlockStatement oclAsType = ClassUtil.nonNullState((DelphiBlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiBlockStatement_0));
				if (compound == null) {
					throw throwNull(lBlock_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = compound.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BlockStatement_0 = idResolver.getClass(CLSSid_BlockStatement, null);
				final /*@Thrown*/ @NonNull BlockStatement oclAsType_0 = ClassUtil.nonNullState((BlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_BlockStatement_0));
				final /*@Thrown*/ @NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_BlockStatement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ @NonNull List<BlockStatement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(BlockStatement.class, OrderedSet);
				oclAsType.getSubStatements().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__subStatements = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__subStatements;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__subStatements", e);
		}
	}

	/**
	 *
	 * map m_Visitable__ExpressionStatement_expression_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lCallStmnt  : delphi::callStmnt[1];
	 * var args : delphi::exprList[?] := lCallStmnt.args;
	 * var ast : astm::Visitable[1] := lCallStmnt.ast;
	 * var designator1 : delphi::designator[?] := lCallStmnt.designator;
	 * var aExpressionStatement : astm::ExpressionStatement[1] := ast.oclAsType(astm::ExpressionStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := designator1.ast;
	 * var oclAsSet : Set(delphi::exprList) := args.oclAsSet()
	 *   ;
	 * var aNameReference : astm::NameReference[1] := ast1.oclAsType(astm::NameReference)
	 *   ;
	 * var asSequence : Sequence(delphi::exprList) := oclAsSet->asSequence()
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::ActualParameterExpression) := asSequence->collect(_'1_' |
	 *     _'1_'.createActualParams())
	 *   ;
	 * var excluding : Collection(astm::ActualParameterExpression)[*|?] := _'\u00ABcollect\u00BB'->excluding(null)
	 *   ;
	 * var FunctionCallExpression1 : astm::FunctionCallExpression[1] := astm::FunctionCallExpression{calledFunction = aNameReference, actualParams = excluding
	 *   };
	 * set aExpressionStatement.expression := FunctionCallExpression1;
	 *
	 */
	protected boolean MAP_m_Visitable__ExpressionStatement_expression_1(final /*@NonInvalid*/ @NonNull callStmnt lCallStmnt_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable exprList args = lCallStmnt_0.getArgs();
			final /*@Thrown*/ @Nullable Visitable ast = lCallStmnt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCallStmnt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable designator designator = lCallStmnt_0.getDesignator();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_ExpressionStatement_0 = idResolver.getClass(CLSSid_ExpressionStatement, null);
				final /*@Thrown*/ @NonNull ExpressionStatement oclAsType = ClassUtil.nonNullState((ExpressionStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_ExpressionStatement_0));
				if (designator == null) {
					throw throwNull(lCallStmnt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = designator.getAst();
				final /*@Thrown*/ @NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_exprList, args);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_NameReference_0 = idResolver.getClass(CLSSid_NameReference, null);
				final /*@Thrown*/ @NonNull NameReference oclAsType_0 = ClassUtil.nonNullState((NameReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_NameReference_0));
				final /*@Thrown*/ @NonNull SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(oclAsSet);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_ActualParameterExpression);
				@NonNull Iterator<Object> ITERATOR__1 = asSequence.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull exprList _1 = (exprList)ITERATOR__1.next();
					/**
					 * _'1_'.createActualParams()
					 */
					final /*@Thrown*/ @NonNull SequenceValue createActualParams = INSTANCE_exprList_createActualParams.evaluate(_1);
					//
					for (Object value : createActualParams.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				final /*@Thrown*/ @NonNull CollectionValue excluding = CollectionExcludingOperation.INSTANCE.evaluate(collect, (Object)null);
				final /*@NonInvalid*/ @NonNull Property CTORid_calledFunction = idResolver.getProperty(PROPid_calledFunction);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_FunctionCallExpression_0 = idResolver.getClass(CLSSid_FunctionCallExpression, null);
				final /*@NonInvalid*/ @NonNull Property CTORid_actualParams = idResolver.getProperty(PROPid_actualParams);
				final /*@Thrown*/ @NonNull FunctionCallExpression symbol_3 = (FunctionCallExpression)TYP_astm_c_c_FunctionCallExpression_0.createInstance();
				CTORid_calledFunction.initValue(symbol_3, oclAsType_0);
				final List<ActualParameterExpression> UNBOXED_excluding = excluding.asEcoreObjects(idResolver, ActualParameterExpression.class);
				assert UNBOXED_excluding != null;
				CTORid_actualParams.initValue(symbol_3, UNBOXED_excluding);
				// mapping statements
				oclAsType.setExpression(symbol_3);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__ExpressionStatement_expression_1 = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__ExpressionStatement_expression_1;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__ExpressionStatement_expression_1", e);
		}
	}

	/**
	 *
	 * map m_Visitable__SwitchStatement_cases_switchExpression_lc in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lCaseStmt  : delphi::caseStmt[1];
	 * var ast : astm::Visitable[1] := lCaseStmt.ast;
	 * var ast2 : astm::Visitable[1] := lCaseStmt.ast;
	 * var cases : OrderedSet(delphi::caseSelector) := lCaseStmt.cases;
	 * var expression1 : delphi::expression[?] := lCaseStmt.expression;
	 * var aSwitchStatement : astm::SwitchStatement[1] := ast.oclAsType(astm::SwitchStatement);
	 * var ast1 : astm::Visitable[?] := expression1.ast;
	 * check ast2 =
	 *   lCaseStmt.ast;
	 * var aExpression : astm::Expression[1] := ast1.oclAsType(astm::Expression)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::CaseBlock)[*|?] := cases->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::CaseBlock));
	 * set aSwitchStatement.cases := _'\u00ABcollect\u00BB';
	 * set aSwitchStatement.switchExpression := aExpression;
	 *
	 */
	protected boolean MAP_m_Visitable__SwitchStatement_cases_switchExpression_lc(final /*@NonInvalid*/ @NonNull caseStmt lCaseStmt_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lCaseStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCaseStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast2;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lCaseStmt_0, "Null where non-null value required");
					}
					@SuppressWarnings("null")
					final /*@Thrown*/ @NonNull List<caseSelector> cases = lCaseStmt_0.getCases();
					final /*@Thrown*/ @Nullable expression expression = lCaseStmt_0.getExpression();
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_SwitchStatement_0 = idResolver.getClass(CLSSid_SwitchStatement, null);
					final /*@Thrown*/ @NonNull SwitchStatement oclAsType = ClassUtil.nonNullState((SwitchStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_SwitchStatement_0));
					if (expression == null) {
						throw throwNull(lCaseStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_1 = expression.getAst();
					final /*@Thrown*/ boolean symbol_2 = ast.equals(ast);
					/*@Thrown*/ @Nullable Boolean symbol_6;
					if (symbol_2) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
						final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Expression_0));
						final /*@Thrown*/ @NonNull OrderedSetValue BOXED_cases = idResolver.createOrderedSetOfAll(ORD_CLSSid_caseSelector, cases);
						/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_CaseBlock);
						@NonNull Iterator<Object> ITERATOR__1 = BOXED_cases.iterator();
						/*@Thrown*/ @NonNull SequenceValue collect;
						while (true) {
							if (!ITERATOR__1.hasNext()) {
								collect = accumulator;
								break;
							}
							@SuppressWarnings("null")
							/*@NonInvalid*/ @NonNull caseSelector _1 = (caseSelector)ITERATOR__1.next();
							/**
							 * _'1_'.ast.oclAsType(astm::CaseBlock)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_CaseBlock_0 = idResolver.getClass(CLSSid_CaseBlock, null);
							final /*@Thrown*/ @Nullable Visitable ast_3 = _1.getAst();
							final /*@Thrown*/ @NonNull CaseBlock oclAsType_1 = ClassUtil.nonNullState((CaseBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_3, TYP_astm_c_c_CaseBlock_0));
							//
							accumulator.add(oclAsType_1);
						}
						// mapping statements
						final /*@Thrown*/ @NonNull List<CaseBlock> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(CaseBlock.class, collect);
						oclAsType.getCases().addAll(ECORE_collect);
						oclAsType.setSwitchExpression(oclAsType_0);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__SwitchStatement_cases_switchExpression_lc = ValueUtil.TRUE_VALUE;
						symbol_6 = m_Visitable__SwitchStatement_cases_switchExpression_lc;
					}
					else {
						symbol_6 = ValueUtil.FALSE_VALUE;
					}
					raw_ast2 = symbol_6;
				}
				else {
					raw_ast2 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast2;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__SwitchStatement_cases_switchExpression_lc", e);
		}
	}

	/**
	 *
	 * map m_Visitable__IfStatement_condition in Delphi_qvtp_qvtcas {
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
	protected boolean MAP_m_Visitable__IfStatement_condition(final /*@NonInvalid*/ @NonNull ifStmt lIfStmt_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lIfStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lIfStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable expression condition = lIfStmt_0.getCondition();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_IfStatement_0 = idResolver.getClass(CLSSid_IfStatement, null);
				final /*@Thrown*/ @NonNull IfStatement oclAsType = ClassUtil.nonNullState((IfStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IfStatement_0));
				if (condition == null) {
					throw throwNull(lIfStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = condition.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				// mapping statements
				oclAsType.setCondition(oclAsType_0);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__IfStatement_condition = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__IfStatement_condition;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__IfStatement_condition", e);
		}
	}

	/**
	 *
	 * map m_Visitable__ast_3 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lStatement  : delphi::statement[1];
	 * var statement1 : delphi::unlabelledStatement[?] := lStatement.statement;
	 * var ast : astm::Visitable[?] := statement1.ast;
	 * var aStatement : astm::Statement[1] := ast.oclAsType(astm::Statement);
	 * set lStatement.ast := aStatement;
	 *
	 */
	protected boolean MAP_m_Visitable__ast_3(final /*@NonInvalid*/ @NonNull statement lStatement)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable unlabelledStatement statement = lStatement.getStatement();
			if (statement == null) {
				throw throwNull(lStatement, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
			}
			final /*@Thrown*/ @Nullable Visitable ast = statement.getAst();
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
			final /*@Thrown*/ @NonNull Statement oclAsType = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Statement_0));
			// mapping statements
			lStatement.setAst(oclAsType);
			final /*@Thrown*/ @Nullable Boolean m_Visitable__ast_3 = ValueUtil.TRUE_VALUE;
			return m_Visitable__ast_3;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__ast_3", e);
		}
	}

	/**
	 *
	 * map m_Visitable__body_2 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lCaseSelector  : delphi::caseSelector[1];
	 * var ast : astm::Visitable[1] := lCaseSelector.ast;
	 * var stmt : delphi::statement[?] := lCaseSelector.stmt;
	 * var aCaseBlock : astm::CaseBlock[1] := ast.oclAsType(astm::CaseBlock)
	 *   ;
	 * var ast1 : astm::Visitable[?] := stmt.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement)
	 *   ;
	 * var OrderedSet1 : OrderedSet(astm::Statement) := OrderedSet{aStatement
	 *   };
	 * set aCaseBlock.body := OrderedSet1;
	 *
	 */
	protected boolean MAP_m_Visitable__body_2(final /*@NonInvalid*/ @NonNull caseSelector lCaseSelector_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lCaseSelector_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCaseSelector_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable statement stmt = lCaseSelector_0.getStmt();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_CaseBlock_0 = idResolver.getClass(CLSSid_CaseBlock, null);
				final /*@Thrown*/ @NonNull CaseBlock oclAsType = ClassUtil.nonNullState((CaseBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_CaseBlock_0));
				if (stmt == null) {
					throw throwNull(lCaseSelector_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = stmt.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ @NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				final /*@Thrown*/ @NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_Statement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ @NonNull List<Statement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Statement.class, OrderedSet);
				oclAsType.getBody().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__body_2 = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__body_2;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__body_2", e);
		}
	}

	/**
	 *
	 * map m_Visitable__subStatements_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lCompoundStmt  : delphi::compoundStmt[1];
	 * var ast : astm::Visitable[1] := lCompoundStmt.ast;
	 * var stamtList : delphi::stmtList[?] := lCompoundStmt.stamtList;
	 * var aBlockStatement : astm::BlockStatement[1] := ast.oclAsType(astm::BlockStatement)
	 *   ;
	 * var statments : OrderedSet(delphi::statement) := stamtList.statments;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Statement)[*|?] := statments->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Statement));
	 * set aBlockStatement.subStatements := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_Visitable__subStatements_1(final /*@NonInvalid*/ @NonNull compoundStmt lCompoundStmt_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lCompoundStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCompoundStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable stmtList stamtList = lCompoundStmt_0.getStamtList();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BlockStatement_0 = idResolver.getClass(CLSSid_BlockStatement, null);
				final /*@Thrown*/ @NonNull BlockStatement oclAsType = ClassUtil.nonNullState((BlockStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_BlockStatement_0));
				if (stamtList == null) {
					throw throwNull(lCompoundStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::stmtList::statments\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<statement> statments = stamtList.getStatments();
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_statments = idResolver.createOrderedSetOfAll(ORD_CLSSid_statement, statments);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Statement);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_statments.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull statement _1 = (statement)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(astm::Statement)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
					final /*@Thrown*/ @Nullable Visitable ast_0 = _1.getAst();
					final /*@Thrown*/ @NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
					//
					accumulator.add(oclAsType_0);
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<Statement> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Statement.class, collect);
				oclAsType.getSubStatements().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__subStatements_1 = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__subStatements_1;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__subStatements_1", e);
		}
	}

	/**
	 *
	 * map m_Visitable__CatchBlock_body in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lExceptionBlock  : delphi::exceptionBlock[1];
	 * var ast : astm::Visitable[1] := lExceptionBlock.ast;
	 * var elseStmts : delphi::stmtList[?] := lExceptionBlock.elseStmts;
	 * var aCatchBlock : astm::CatchBlock[1] := ast.oclAsType(astm::CatchBlock)
	 *   ;
	 * var statments : OrderedSet(delphi::statement) := elseStmts.statments;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Statement)[*|?] := statments->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Statement))
	 *   ;
	 * var BlockStatement1 : astm::BlockStatement[1] := astm::BlockStatement{subStatements = _'\u00ABcollect\u00BB'
	 *   };
	 * set aCatchBlock.body := BlockStatement1;
	 *
	 */
	protected boolean MAP_m_Visitable__CatchBlock_body(final /*@NonInvalid*/ @NonNull exceptionBlock lExceptionBlock_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lExceptionBlock_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lExceptionBlock_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable stmtList elseStmts = lExceptionBlock_0.getElseStmts();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_CatchBlock_0 = idResolver.getClass(CLSSid_CatchBlock, null);
				final /*@Thrown*/ @NonNull CatchBlock oclAsType = ClassUtil.nonNullState((CatchBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_CatchBlock_0));
				if (elseStmts == null) {
					throw throwNull(lExceptionBlock_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::stmtList::statments\'");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<statement> statments = elseStmts.getStatments();
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_statments = idResolver.createOrderedSetOfAll(ORD_CLSSid_statement, statments);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Statement);
				@NonNull Iterator<Object> ITERATOR__1 = BOXED_statments.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull statement _1 = (statement)ITERATOR__1.next();
					/**
					 * _'1_'.ast.oclAsType(astm::Statement)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
					final /*@Thrown*/ @Nullable Visitable ast_0 = _1.getAst();
					final /*@Thrown*/ @NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
					//
					accumulator.add(oclAsType_0);
				}
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BlockStatement_0 = idResolver.getClass(CLSSid_BlockStatement, null);
				final /*@NonInvalid*/ @NonNull Property CTORid_subStatements = idResolver.getProperty(PROPid_subStatements);
				final /*@Thrown*/ @NonNull BlockStatement symbol_2 = (BlockStatement)TYP_astm_c_c_BlockStatement_0.createInstance();
				final List<Statement> UNBOXED_collect = collect.asEcoreObjects(idResolver, Statement.class);
				assert UNBOXED_collect != null;
				CTORid_subStatements.initValue(symbol_2, UNBOXED_collect);
				// mapping statements
				oclAsType.setBody(symbol_2);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__CatchBlock_body = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__CatchBlock_body;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__CatchBlock_body", e);
		}
	}

	/**
	 *
	 * map m_Visitable__IfStatement_IfStatement_elseBody_thenBo_lc in Delphi_qvtp_qvtcas {
	 * guard:leftCS lIfStmt  : delphi::ifStmt[1];
	 * var ast : astm::Visitable[1] := lIfStmt.ast;
	 * var ast2 : astm::Visitable[1] := lIfStmt.ast;
	 * var _'else' : delphi::statement[?] := lIfStmt._'else';
	 * var _'then' : delphi::statement[?] := lIfStmt._'then';
	 * var _'=' : Boolean[1] := _'else' =
	 *   null;
	 * var aIfStatement : astm::IfStatement[1] := ast.oclAsType(astm::IfStatement);
	 * var ast1 : astm::Visitable[?] := _'then'.ast;
	 * check ast2 =
	 *   lIfStmt.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement)
	 *   ;
	 * var _'if' : astm::Visitable[?] := if _'='
	 *   then null
	 *   else _'else'.ast
	 *   endif;
	 * var _'=1' : Boolean[1] := _'if' =
	 *   null;
	 * var if1 : astm::Statement[?] := if _'=1'
	 *   then null
	 *   else _'if'.oclAsType(astm::Statement)
	 *   endif;
	 * set aIfStatement.thenBody := aStatement;
	 * set aIfStatement.elseBody := if1;
	 *
	 */
	protected boolean MAP_m_Visitable__IfStatement_IfStatement_elseBody_thenBo_lc(final /*@NonInvalid*/ @NonNull ifStmt lIfStmt_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lIfStmt_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lIfStmt_1, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast2;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lIfStmt_1, "Null where non-null value required");
					}
					final /*@Thrown*/ @Nullable statement symbol_2 = lIfStmt_1.getElse();
					final /*@Thrown*/ @Nullable statement then = lIfStmt_1.getThen();
					final /*@Thrown*/ boolean symbol_3 = symbol_2 == null;
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_IfStatement_0 = idResolver.getClass(CLSSid_IfStatement, null);
					final /*@Thrown*/ @NonNull IfStatement oclAsType = ClassUtil.nonNullState((IfStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IfStatement_0));
					if (then == null) {
						throw throwNull(lIfStmt_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_1 = then.getAst();
					final /*@Thrown*/ boolean symbol_4 = ast.equals(ast);
					/*@Thrown*/ @Nullable Boolean symbol_11;
					if (symbol_4) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
						final /*@Thrown*/ @NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Statement_0));
						/*@Thrown*/ @Nullable Visitable symbol_5;
						if (symbol_3) {
							symbol_5 = null;
						}
						else {
							if (symbol_2 == null) {
								throw throwNull(lIfStmt_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
							}
							final /*@Thrown*/ @Nullable Visitable ast_3 = symbol_2.getAst();
							symbol_5 = ast_3;
						}
						final /*@Thrown*/ boolean symbol_6 = symbol_5 == null;
						/*@Thrown*/ @Nullable Statement symbol_7;
						if (symbol_6) {
							symbol_7 = null;
						}
						else {
							final /*@Thrown*/ @NonNull Statement oclAsType_1 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, symbol_5, TYP_astm_c_c_Statement_0));
							symbol_7 = oclAsType_1;
						}
						// mapping statements
						oclAsType.setThenBody(oclAsType_0);
						oclAsType.setElseBody(symbol_7);
						final /*@Thrown*/ @Nullable Boolean m_Visitable__IfStatement_IfStatement_elseBody_thenBo_lc = ValueUtil.TRUE_VALUE;
						symbol_11 = m_Visitable__IfStatement_IfStatement_elseBody_thenBo_lc;
					}
					else {
						symbol_11 = ValueUtil.FALSE_VALUE;
					}
					raw_ast2 = symbol_11;
				}
				else {
					raw_ast2 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast2;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__IfStatement_IfStatement_elseBody_thenBo_lc", e);
		}
	}

	/**
	 *
	 * map m_Visitable__TryStatement_TryStatement_catchBlocks_f_lc in Delphi_qvtp_qvtcas {
	 * guard:leftCS lTryStmt  : delphi::tryStmt[1];
	 * var ast : astm::Visitable[1] := lTryStmt.ast;
	 * var ast2 : astm::Visitable[1] := lTryStmt.ast;
	 * var ast3 : astm::Visitable[1] := lTryStmt.ast;
	 * var exception : delphi::exceptionBlock[?] := lTryStmt.exception;
	 * var final : delphi::stmtList[?] := lTryStmt.final;
	 * var stmtList1 : delphi::stmtList[?] := lTryStmt.stmtList;
	 * var _'=' : Boolean[1] := final =
	 *   null;
	 * var aTryStatement : astm::TryStatement[1] := ast.oclAsType(astm::TryStatement);
	 * var ast1 : astm::Visitable[?] := exception.ast;
	 * var statments : OrderedSet(delphi::statement) := stmtList1.statments;
	 * check ast2 = lTryStmt.ast;
	 * check ast3 =
	 *   lTryStmt.ast;
	 * var aCatchBlock : astm::CatchBlock[1] := ast1.oclAsType(astm::CatchBlock)
	 *   ;
	 * var _'if' : astm::Statement[?] := if _'='
	 *   then null
	 *   else final.statments->first().ast.oclAsType(astm::Statement)
	 *   endif
	 *   ;
	 * var OrderedSet1 : OrderedSet(astm::CatchBlock) := OrderedSet{aCatchBlock
	 *   }
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Statement)[*|?] := statments->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Statement))
	 *   ;
	 * var BlockStatement1 : astm::BlockStatement[1] := astm::BlockStatement{subStatements = _'\u00ABcollect\u00BB'
	 *   };
	 * set aTryStatement.finalStatement := _'if';
	 * set aTryStatement.catchBlocks := OrderedSet1;
	 * set aTryStatement.guardedStatement := BlockStatement1;
	 *
	 */
	protected boolean MAP_m_Visitable__TryStatement_TryStatement_catchBlocks_f_lc(final /*@NonInvalid*/ @NonNull tryStmt lTryStmt_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lTryStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lTryStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ boolean symbol_1 = ast != null;
				/*@Thrown*/ @Nullable Boolean raw_ast2;
				if (symbol_1) {
					if (ast == null) {
						throw throwNull(lTryStmt_0, "Null where non-null value required");
					}
					final /*@Thrown*/ boolean symbol_2 = ast != null;
					/*@Thrown*/ @Nullable Boolean raw_ast3;
					if (symbol_2) {
						if (ast == null) {
							throw throwNull(lTryStmt_0, "Null where non-null value required");
						}
						final /*@Thrown*/ @Nullable exceptionBlock exception = lTryStmt_0.getException();
						final /*@Thrown*/ @Nullable stmtList symbol_3 = lTryStmt_0.getFinal();
						final /*@Thrown*/ @Nullable stmtList stmtList = lTryStmt_0.getStmtList();
						final /*@Thrown*/ boolean symbol_4 = symbol_3 == null;
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_TryStatement_0 = idResolver.getClass(CLSSid_TryStatement, null);
						final /*@Thrown*/ @NonNull TryStatement oclAsType = ClassUtil.nonNullState((TryStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_TryStatement_0));
						if (exception == null) {
							throw throwNull(lTryStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
						}
						final /*@Thrown*/ @Nullable Visitable ast_2 = exception.getAst();
						if (stmtList == null) {
							throw throwNull(lTryStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::stmtList::statments\'");
						}
						@SuppressWarnings("null")
						final /*@Thrown*/ @NonNull List<statement> statments = stmtList.getStatments();
						final /*@Thrown*/ boolean symbol_5 = ast.equals(ast);
						/*@Thrown*/ @Nullable Boolean symbol_15;
						if (symbol_5) {
							final /*@Thrown*/ boolean symbol_6 = ast.equals(ast);
							/*@Thrown*/ @Nullable Boolean symbol_14;
							if (symbol_6) {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_CatchBlock_0 = idResolver.getClass(CLSSid_CatchBlock, null);
								final /*@Thrown*/ @NonNull CatchBlock oclAsType_0 = ClassUtil.nonNullState((CatchBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_2, TYP_astm_c_c_CatchBlock_0));
								/*@Thrown*/ @Nullable Statement symbol_7;
								if (symbol_4) {
									symbol_7 = null;
								}
								else {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
									if (symbol_3 == null) {
										throw throwNull(lTryStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::stmtList::statments\'");
									}
									@SuppressWarnings("null")
									final /*@Thrown*/ @NonNull List<statement> statments_0 = symbol_3.getStatments();
									final /*@Thrown*/ @NonNull OrderedSetValue BOXED_statments_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_statement, statments_0);
									final /*@Thrown*/ @Nullable statement first = (statement)OrderedCollectionFirstOperation.INSTANCE.evaluate(BOXED_statments_0);
									if (first == null) {
										throw throwNull(lTryStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
									}
									final /*@Thrown*/ @Nullable Visitable ast_5 = first.getAst();
									final /*@Thrown*/ @NonNull Statement oclAsType_1 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_5, TYP_astm_c_c_Statement_0));
									symbol_7 = oclAsType_1;
								}
								final /*@Thrown*/ @NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_CatchBlock, oclAsType_0);
								final /*@Thrown*/ @NonNull OrderedSetValue BOXED_statments = idResolver.createOrderedSetOfAll(ORD_CLSSid_statement, statments);
								/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Statement);
								@NonNull Iterator<Object> ITERATOR__1 = BOXED_statments.iterator();
								/*@Thrown*/ @NonNull SequenceValue collect;
								while (true) {
									if (!ITERATOR__1.hasNext()) {
										collect = accumulator;
										break;
									}
									@SuppressWarnings("null")
									/*@NonInvalid*/ @NonNull statement _1 = (statement)ITERATOR__1.next();
									/**
									 * _'1_'.ast.oclAsType(astm::Statement)
									 */
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_1 = idResolver.getClass(CLSSid_Statement, null);
									final /*@Thrown*/ @Nullable Visitable ast_6 = _1.getAst();
									final /*@Thrown*/ @NonNull Statement oclAsType_2 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_6, TYP_astm_c_c_Statement_1));
									//
									accumulator.add(oclAsType_2);
								}
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_BlockStatement_0 = idResolver.getClass(CLSSid_BlockStatement, null);
								final /*@NonInvalid*/ @NonNull Property CTORid_subStatements = idResolver.getProperty(PROPid_subStatements);
								final /*@Thrown*/ @NonNull BlockStatement symbol_9 = (BlockStatement)TYP_astm_c_c_BlockStatement_0.createInstance();
								final List<Statement> UNBOXED_collect = collect.asEcoreObjects(idResolver, Statement.class);
								assert UNBOXED_collect != null;
								CTORid_subStatements.initValue(symbol_9, UNBOXED_collect);
								// mapping statements
								oclAsType.setFinalStatement(symbol_7);
								final /*@Thrown*/ @NonNull List<CatchBlock> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(CatchBlock.class, OrderedSet);
								oclAsType.getCatchBlocks().addAll(ECORE_OrderedSet);
								oclAsType.setGuardedStatement(symbol_9);
								final /*@Thrown*/ @Nullable Boolean m_Visitable__TryStatement_TryStatement_catchBlocks_f_lc = ValueUtil.TRUE_VALUE;
								symbol_14 = m_Visitable__TryStatement_TryStatement_catchBlocks_f_lc;
							}
							else {
								symbol_14 = ValueUtil.FALSE_VALUE;
							}
							symbol_15 = symbol_14;
						}
						else {
							symbol_15 = ValueUtil.FALSE_VALUE;
						}
						raw_ast3 = symbol_15;
					}
					else {
						raw_ast3 = ValueUtil.FALSE_VALUE;
					}
					raw_ast2 = raw_ast3;
				}
				else {
					raw_ast2 = ValueUtil.FALSE_VALUE;
				}
				raw_ast = raw_ast2;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__TryStatement_TryStatement_catchBlocks_f_lc", e);
		}
	}

	/**
	 *
	 * map m_Visitable__Definition_definitionType in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lVarDecl  : delphi::varDecl[1];
	 * var ast : astm::Visitable[1] := lVarDecl.ast;
	 * var type1 : delphi::type[?] := lVarDecl.type;
	 * var aVariableDefinition : astm::VariableDefinition[1] := ast.oclAsType(astm::VariableDefinition)
	 *   ;
	 * var ast1 : astm::Visitable[?] := type1.ast;
	 * var aTypeReference : astm::TypeReference[1] := ast1.oclAsType(astm::TypeReference);
	 * set aVariableDefinition.definitionType := aTypeReference;
	 *
	 */
	protected boolean MAP_m_Visitable__Definition_definitionType(final /*@NonInvalid*/ @NonNull varDecl lVarDecl_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lVarDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lVarDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable type type = lVarDecl_0.getType();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ @NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_VariableDefinition_0));
				if (type == null) {
					throw throwNull(lVarDecl_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = type.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_TypeReference_0 = idResolver.getClass(CLSSid_TypeReference, null);
				final /*@Thrown*/ @NonNull TypeReference oclAsType_0 = ClassUtil.nonNullState((TypeReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_TypeReference_0));
				// mapping statements
				oclAsType.setDefinitionType(oclAsType_0);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__Definition_definitionType = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__Definition_definitionType;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__Definition_definitionType", e);
		}
	}

	/**
	 *
	 * map m_Visitable__subStatements_2 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lWithStmt  : delphi::withStmt[1];
	 * var ast : astm::Visitable[1] := lWithStmt.ast;
	 * var stmt : delphi::statement[?] := lWithStmt.stmt;
	 * var aDelphiWithStatement : astm::DelphiWithStatement[1] := ast.oclAsType(astm::DelphiWithStatement)
	 *   ;
	 * var ast1 : astm::Visitable[?] := stmt.ast;
	 * var aStatement : astm::Statement[1] := ast1.oclAsType(astm::Statement)
	 *   ;
	 * var OrderedSet1 : OrderedSet(astm::Statement) := OrderedSet{aStatement
	 *   };
	 * set aDelphiWithStatement.subStatements := OrderedSet1;
	 *
	 */
	protected boolean MAP_m_Visitable__subStatements_2(final /*@NonInvalid*/ @NonNull withStmt lWithStmt_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lWithStmt_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lWithStmt_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable statement stmt = lWithStmt_0.getStmt();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiWithStatement_0 = idResolver.getClass(CLSSid_DelphiWithStatement, null);
				final /*@Thrown*/ @NonNull DelphiWithStatement oclAsType = ClassUtil.nonNullState((DelphiWithStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiWithStatement_0));
				if (stmt == null) {
					throw throwNull(lWithStmt_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = stmt.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Statement_0 = idResolver.getClass(CLSSid_Statement, null);
				final /*@Thrown*/ @NonNull Statement oclAsType_0 = ClassUtil.nonNullState((Statement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Statement_0));
				final /*@Thrown*/ @NonNull OrderedSetValue OrderedSet = ValueUtil.createOrderedSetOfEach(ORD_CLSSid_Statement, oclAsType_0);
				// mapping statements
				final /*@Thrown*/ @NonNull List<Statement> ECORE_OrderedSet = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Statement.class, OrderedSet);
				oclAsType.getSubStatements().addAll(ECORE_OrderedSet);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__subStatements_2 = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__subStatements_2;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__subStatements_2", e);
		}
	}

	/**
	 *
	 * map m_Visitable__ast_4 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lMultipleConstExp  : delphi::MultipleConstExp[1];
	 * var exps : OrderedSet(delphi::constExpr) := lMultipleConstExp.exps;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Expression)[*|?] := exps->collect(_'1_' |
	 *     _'1_'.ast.oclAsType(astm::Expression))
	 *   ;
	 * var first : astm::Expression[?] := _'\u00ABcollect\u00BB'->first();
	 * set lMultipleConstExp.ast := first;
	 *
	 */
	protected boolean MAP_m_Visitable__ast_4(final /*@NonInvalid*/ @NonNull MultipleConstExp lMultipleConstExp)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			@SuppressWarnings("null")
			final /*@Thrown*/ @NonNull List<constExpr> exps = lMultipleConstExp.getExps();
			final /*@Thrown*/ @NonNull OrderedSetValue BOXED_exps = idResolver.createOrderedSetOfAll(ORD_CLSSid_constExpr, exps);
			/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Expression);
			@NonNull Iterator<Object> ITERATOR__1 = BOXED_exps.iterator();
			/*@Thrown*/ @NonNull SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				@SuppressWarnings("null")
				/*@NonInvalid*/ @NonNull constExpr _1 = (constExpr)ITERATOR__1.next();
				/**
				 * _'1_'.ast.oclAsType(astm::Expression)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ @Nullable Visitable ast = _1.getAst();
				final /*@Thrown*/ @NonNull Expression oclAsType = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_Expression_0));
				//
				accumulator.add(oclAsType);
			}
			final /*@Thrown*/ @Nullable Expression first = (Expression)OrderedCollectionFirstOperation.INSTANCE.evaluate(collect);
			// mapping statements
			lMultipleConstExp.setAst(first);
			final /*@Thrown*/ @Nullable Boolean m_Visitable__ast_4 = ValueUtil.TRUE_VALUE;
			return m_Visitable__ast_4;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__ast_4", e);
		}
	}

	/**
	 *
	 * map m_Visitable__caseExpressions in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lCaseSelector  : delphi::caseSelector[1];
	 * var ast : astm::Visitable[1] := lCaseSelector.ast;
	 * var labels : OrderedSet(delphi::caseLabel) := lCaseSelector.labels;
	 * var aCaseBlock : astm::CaseBlock[1] := ast.oclAsType(astm::CaseBlock)
	 *   ;
	 * var _'\u00ABcollect\u00BB' : Sequence(astm::Expression)[*|?] := labels->collect(x |
	 *     x.first.ast.oclAsType(astm::Expression)
	 *     .oclAsSet()
	 *     ->including(x.last.ast.oclAsType(astm::Expression)));
	 * set aCaseBlock.caseExpressions := _'\u00ABcollect\u00BB';
	 *
	 */
	protected boolean MAP_m_Visitable__caseExpressions(final /*@NonInvalid*/ @NonNull caseSelector lCaseSelector_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lCaseSelector_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lCaseSelector_1, "Null where non-null value required");
				}
				@SuppressWarnings("null")
				final /*@Thrown*/ @NonNull List<caseLabel> labels = lCaseSelector_1.getLabels();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_CaseBlock_0 = idResolver.getClass(CLSSid_CaseBlock, null);
				final /*@Thrown*/ @NonNull CaseBlock oclAsType = ClassUtil.nonNullState((CaseBlock)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_CaseBlock_0));
				final /*@Thrown*/ @NonNull OrderedSetValue BOXED_labels = idResolver.createOrderedSetOfAll(ORD_CLSSid_caseLabel, labels);
				/*@Thrown*/ SequenceValue.@NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Expression);
				@NonNull Iterator<Object> ITERATOR_x = BOXED_labels.iterator();
				/*@Thrown*/ @NonNull SequenceValue collect;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						collect = accumulator;
						break;
					}
					@SuppressWarnings("null")
					/*@NonInvalid*/ @NonNull caseLabel x = (caseLabel)ITERATOR_x.next();
					/**
					 *
					 * x.first.ast.oclAsType(astm::Expression)
					 * .oclAsSet()
					 * ->including(x.last.ast.oclAsType(astm::Expression))
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_1 = idResolver.getClass(CLSSid_Expression, null);
					final /*@Thrown*/ @Nullable constExpr first = x.getFirst();
					if (first == null) {
						throw throwNull(lCaseSelector_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_0 = first.getAst();
					final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_1));
					final /*@Thrown*/ @NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_Expression, oclAsType_0);
					final /*@Thrown*/ @Nullable constExpr last = x.getLast();
					if (last == null) {
						throw throwNull(lCaseSelector_1, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
					}
					final /*@Thrown*/ @Nullable Visitable ast_1 = last.getAst();
					final /*@Thrown*/ @NonNull Expression oclAsType_1 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_1, TYP_astm_c_c_Expression_1));
					final /*@Thrown*/ @NonNull SetValue including = (SetValue)CollectionIncludingOperation.INSTANCE.evaluate(oclAsSet, oclAsType_1);
					//
					for (Object value : including.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				// mapping statements
				final /*@Thrown*/ @NonNull List<Expression> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Expression.class, collect);
				oclAsType.getCaseExpressions().addAll(ECORE_collect);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__caseExpressions = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__caseExpressions;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__caseExpressions", e);
		}
	}

	/**
	 *
	 * map m_Visitable__DataDefinition_initialValue in Delphi_qvtp_qvtcas {
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
	protected boolean MAP_m_Visitable__DataDefinition_initialValue(final /*@NonInvalid*/ @NonNull constantDecl lConstantDecl_0)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lConstantDecl_0.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lConstantDecl_0, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable constExpr symbol_1 = lConstantDecl_0.getConst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_VariableDefinition_0 = idResolver.getClass(CLSSid_VariableDefinition, null);
				final /*@Thrown*/ @NonNull VariableDefinition oclAsType = ClassUtil.nonNullState((VariableDefinition)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_VariableDefinition_0));
				if (symbol_1 == null) {
					throw throwNull(lConstantDecl_0, "Null source for \'\'http://www.xtext.org/example/delphi/Delphi\'::CSTrace::ast\'");
				}
				final /*@Thrown*/ @Nullable Visitable ast_0 = symbol_1.getAst();
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_Expression_0 = idResolver.getClass(CLSSid_Expression, null);
				final /*@Thrown*/ @NonNull Expression oclAsType_0 = ClassUtil.nonNullState((Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast_0, TYP_astm_c_c_Expression_0));
				// mapping statements
				oclAsType.setInitialValue(oclAsType_0);
				final /*@Thrown*/ @Nullable Boolean m_Visitable__DataDefinition_initialValue = ValueUtil.TRUE_VALUE;
				raw_ast = m_Visitable__DataDefinition_initialValue;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_Visitable__DataDefinition_initialValue", e);
		}
	}

	/**
	 *
	 * map m_FunctionDefinition__refersTo in Delphi_qvtp_qvtcas {
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
	protected boolean MAP_m_FunctionDefinition__refersTo(final /*@NonInvalid*/ @NonNull designator lDesignator_4)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lDesignator_4.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_4, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable Definition getDefinition = INSTANCE_designator_getDefinition.evaluate(lDesignator_4);
				final /*@Thrown*/ @Nullable designator designator = lDesignator_4.getDesignator();
				final /*@Thrown*/ boolean eq = designator == null;
				/*@Thrown*/ @Nullable Boolean symbol_3;
				if (eq) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_IdentifierReference_0 = idResolver.getClass(CLSSid_IdentifierReference, null);
					final /*@Thrown*/ @NonNull IdentifierReference oclAsType = ClassUtil.nonNullState((IdentifierReference)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_IdentifierReference_0));
					// mapping statements
					oclAsType.setRefersTo(getDefinition);
					final /*@Thrown*/ @Nullable Boolean m_FunctionDefinition__refersTo = ValueUtil.TRUE_VALUE;
					symbol_3 = m_FunctionDefinition__refersTo;
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
			return handleExecutionFailure("MAP_m_FunctionDefinition__refersTo", e);
		}
	}

	/**
	 *
	 * map m_FunctionDefinition__refersTo_1 in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lDesignator  : delphi::designator[1];
	 * var ast : astm::Visitable[1] := lDesignator.ast;
	 * var getDefinition : astm::Definition[?] := lDesignator.getDefinition()
	 *   ;
	 * check not lDesignator.isIdentifierRef()
	 *   ;
	 * check lDesignator.isQualifiedOverData()
	 *   ;
	 * var aQualifiedOverData : astm::QualifiedOverData[1] := ast.oclAsType(astm::QualifiedOverData);
	 * set aQualifiedOverData.refersTo := getDefinition;
	 *
	 */
	protected boolean MAP_m_FunctionDefinition__refersTo_1(final /*@NonInvalid*/ @NonNull designator lDesignator_5)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lDesignator_5.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lDesignator_5, "Null where non-null value required");
				}
				final /*@Thrown*/ @Nullable Definition getDefinition = INSTANCE_designator_getDefinition.evaluate(lDesignator_5);
				/*@Caught*/ @NonNull Object CAUGHT_eq;
				try {
					final /*@Thrown*/ @Nullable designator designator = lDesignator_5.getDesignator();
					final /*@Thrown*/ boolean eq = designator == null;
					CAUGHT_eq = eq;
				}
				catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ @Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_eq);
				if (not == null) {
					throw throwNull(lDesignator_5, "Null if condition");
				}
				/*@Thrown*/ @Nullable Boolean symbol_4;
				if (not) {
					final /*@Thrown*/ @Nullable designator designator_0 = lDesignator_5.getDesignator();
					final /*@Thrown*/ boolean ne = designator_0 != null;
					/*@Thrown*/ @Nullable Boolean symbol_3;
					if (ne) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_QualifiedOverData_0 = idResolver.getClass(CLSSid_QualifiedOverData, null);
						final /*@Thrown*/ @NonNull QualifiedOverData oclAsType = ClassUtil.nonNullState((QualifiedOverData)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_QualifiedOverData_0));
						// mapping statements
						oclAsType.setRefersTo(getDefinition);
						final /*@Thrown*/ @Nullable Boolean m_FunctionDefinition__refersTo_1 = ValueUtil.TRUE_VALUE;
						symbol_3 = m_FunctionDefinition__refersTo_1;
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
			return handleExecutionFailure("MAP_m_FunctionDefinition__refersTo_1", e);
		}
	}

	/**
	 *
	 * map m_FunctionDefinition__withs in Delphi_qvtp_qvtcas {
	 *
	 *   guard:leftCS lWithStmt  : delphi::withStmt[1];
	 * var ast : astm::Visitable[1] := lWithStmt.ast;
	 * var getDefinitions : Sequence(astm::Definition) := lWithStmt.getDefinitions()
	 *   ;
	 * var aDelphiWithStatement : astm::DelphiWithStatement[1] := ast.oclAsType(astm::DelphiWithStatement);
	 * set aDelphiWithStatement.withs := getDefinitions;
	 *
	 */
	protected boolean MAP_m_FunctionDefinition__withs(final /*@NonInvalid*/ @NonNull withStmt lWithStmt_1)  {
		try {
			final /*@NonInvalid*/ @NonNull IdResolver idResolver = executor.getIdResolver();
			final /*@Thrown*/ @Nullable Visitable ast = lWithStmt_1.getAst();
			final /*@Thrown*/ boolean symbol_0 = ast != null;
			/*@Thrown*/ @Nullable Boolean raw_ast;
			if (symbol_0) {
				if (ast == null) {
					throw throwNull(lWithStmt_1, "Null where non-null value required");
				}
				final /*@Thrown*/ @NonNull SequenceValue getDefinitions = INSTANCE_withStmt_getDefinitions.evaluate(lWithStmt_1);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_astm_c_c_DelphiWithStatement_0 = idResolver.getClass(CLSSid_DelphiWithStatement, null);
				final /*@Thrown*/ @NonNull DelphiWithStatement oclAsType = ClassUtil.nonNullState((DelphiWithStatement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ast, TYP_astm_c_c_DelphiWithStatement_0));
				// mapping statements
				final /*@Thrown*/ @NonNull List<Definition> ECORE_getDefinitions = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Definition.class, getDefinitions);
				oclAsType.getWiths().addAll(ECORE_getDefinitions);
				final /*@Thrown*/ @Nullable Boolean m_FunctionDefinition__withs = ValueUtil.TRUE_VALUE;
				raw_ast = m_FunctionDefinition__withs;
			}
			else {
				raw_ast = ValueUtil.FALSE_VALUE;
			}
			return raw_ast;
		} catch (Throwable e) {
			return handleExecutionFailure("MAP_m_FunctionDefinition__withs", e);
		}
	}
}
