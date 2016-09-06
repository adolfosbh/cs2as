/**
 */
package org.xtext.example.delphi.astm;

import java.lang.String;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.delphi.astm.AstmFactory
 * @model kind="package"
 * @generated
 */
public interface AstmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "astm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelum.es/modernization/astm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "astm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstmPackage eINSTANCE = org.xtext.example.delphi.astm.impl.AstmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.GASTMObjectImpl <em>GASTM Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.GASTMObjectImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMObject()
	 * @generated
	 */
	int GASTM_OBJECT = 6;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.GASTMSyntaxObjectImpl <em>GASTM Syntax Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.GASTMSyntaxObjectImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMSyntaxObject()
	 * @generated
	 */
	int GASTM_SYNTAX_OBJECT = 20;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.OtherSyntaxObjectImpl <em>Other Syntax Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.OtherSyntaxObjectImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getOtherSyntaxObject()
	 * @generated
	 */
	int OTHER_SYNTAX_OBJECT = 9;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CompilationUnitImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 21;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DelphiUnitImpl <em>Delphi Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DelphiUnitImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiUnit()
	 * @generated
	 */
	int DELPHI_UNIT = 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DelphiInterfaceSectionImpl <em>Delphi Interface Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DelphiInterfaceSectionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiInterfaceSection()
	 * @generated
	 */
	int DELPHI_INTERFACE_SECTION = 1;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DelphiImplementationSectionImpl <em>Delphi Implementation Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DelphiImplementationSectionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiImplementationSection()
	 * @generated
	 */
	int DELPHI_IMPLEMENTATION_SECTION = 2;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.StatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 100;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BlockStatementImpl <em>Block Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BlockStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBlockStatement()
	 * @generated
	 */
	int BLOCK_STATEMENT = 64;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DelphiBlockStatementImpl <em>Delphi Block Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DelphiBlockStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiBlockStatement()
	 * @generated
	 */
	int DELPHI_BLOCK_STATEMENT = 3;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 78;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionCallExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionCallExpression()
	 * @generated
	 */
	int FUNCTION_CALL_EXPRESSION = 90;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DelphiFunctionCallExpressionImpl <em>Delphi Function Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DelphiFunctionCallExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiFunctionCallExpression()
	 * @generated
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION = 4;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DelphiWithStatementImpl <em>Delphi With Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DelphiWithStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiWithStatement()
	 * @generated
	 */
	int DELPHI_WITH_STATEMENT = 5;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.GASTMSourceObjectImpl <em>GASTM Source Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.GASTMSourceObjectImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMSourceObject()
	 * @generated
	 */
	int GASTM_SOURCE_OBJECT = 7;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.GASTMSemanticObjectImpl <em>GASTM Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.GASTMSemanticObjectImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMSemanticObject()
	 * @generated
	 */
	int GASTM_SEMANTIC_OBJECT = 8;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.StorageSpecificationImpl <em>Storage Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.StorageSpecificationImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStorageSpecification()
	 * @generated
	 */
	int STORAGE_SPECIFICATION = 10;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.TypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 43;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DataTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AccessKindImpl <em>Access Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AccessKindImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAccessKind()
	 * @generated
	 */
	int ACCESS_KIND = 12;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.UnaryOperatorImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 13;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BinaryOperatorImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 14;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ActualParameterImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getActualParameter()
	 * @generated
	 */
	int ACTUAL_PARAMETER = 15;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SourceFileImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 16;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SourceLocationImpl <em>Source Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SourceLocationImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSourceLocation()
	 * @generated
	 */
	int SOURCE_LOCATION = 17;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ProjectImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 18;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ScopeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 19;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NameImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 22;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DefinitionObjectImpl <em>Definition Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DefinitionObjectImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDefinitionObject()
	 * @generated
	 */
	int DEFINITION_OBJECT = 97;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionImpl <em>Declaration Or Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeclarationOrDefinition()
	 * @generated
	 */
	int DECLARATION_OR_DEFINITION = 23;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 24;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DeclarationImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 25;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionDeclarationImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 26;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.VariableDeclarationImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 27;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 28;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionMemberAttributesImpl <em>Function Member Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionMemberAttributesImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionMemberAttributes()
	 * @generated
	 */
	int FUNCTION_MEMBER_ATTRIBUTES = 29;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.EntryDefinitionImpl <em>Entry Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.EntryDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEntryDefinition()
	 * @generated
	 */
	int ENTRY_DEFINITION = 30;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DataDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDataDefinition()
	 * @generated
	 */
	int DATA_DEFINITION = 31;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitFieldDefinitionImpl <em>Bit Field Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitFieldDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitFieldDefinition()
	 * @generated
	 */
	int BIT_FIELD_DEFINITION = 32;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.EnumLiteralDefinitionImpl <em>Enum Literal Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.EnumLiteralDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEnumLiteralDefinition()
	 * @generated
	 */
	int ENUM_LITERAL_DEFINITION = 33;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.TypeDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 34;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NamedTypeDefinitionImpl <em>Named Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NamedTypeDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNamedTypeDefinition()
	 * @generated
	 */
	int NAMED_TYPE_DEFINITION = 35;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AggregateTypeDefinitionImpl <em>Aggregate Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AggregateTypeDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateTypeDefinition()
	 * @generated
	 */
	int AGGREGATE_TYPE_DEFINITION = 36;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NameSpaceDefinitionImpl <em>Name Space Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NameSpaceDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNameSpaceDefinition()
	 * @generated
	 */
	int NAME_SPACE_DEFINITION = 37;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LabelDefinitionImpl <em>Label Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LabelDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabelDefinition()
	 * @generated
	 */
	int LABEL_DEFINITION = 38;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PreprocessorElementImpl <em>Preprocessor Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PreprocessorElementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPreprocessorElement()
	 * @generated
	 */
	int PREPROCESSOR_ELEMENT = 96;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.IncludeUnitImpl <em>Include Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.IncludeUnitImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIncludeUnit()
	 * @generated
	 */
	int INCLUDE_UNIT = 39;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.MacroCallImpl <em>Macro Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.MacroCallImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMacroCall()
	 * @generated
	 */
	int MACRO_CALL = 40;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.MacroDefinitionImpl <em>Macro Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.MacroDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMacroDefinition()
	 * @generated
	 */
	int MACRO_DEFINITION = 41;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CommentImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 42;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PrimitiveTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.EnumTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ConstructedTypeImpl <em>Constructed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ConstructedTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getConstructedType()
	 * @generated
	 */
	int CONSTRUCTED_TYPE = 46;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AggregateTypeImpl <em>Aggregate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AggregateTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateType()
	 * @generated
	 */
	int AGGREGATE_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ArrayTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DimensionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 49;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 50;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FormalParameterTypeImpl <em>Formal Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FormalParameterTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFormalParameterType()
	 * @generated
	 */
	int FORMAL_PARAMETER_TYPE = 51;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NamedTypeImpl <em>Named Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NamedTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 52;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ClassTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 53;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DerivesFromImpl <em>Derives From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DerivesFromImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDerivesFrom()
	 * @generated
	 */
	int DERIVES_FROM = 54;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.TypeReferenceImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 99;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.UnnamedTypeReferenceImpl <em>Unnamed Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.UnnamedTypeReferenceImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnnamedTypeReference()
	 * @generated
	 */
	int UNNAMED_TYPE_REFERENCE = 55;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NamedTypeReferenceImpl <em>Named Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NamedTypeReferenceImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNamedTypeReference()
	 * @generated
	 */
	int NAMED_TYPE_REFERENCE = 56;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DeleteStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeleteStatement()
	 * @generated
	 */
	int DELETE_STATEMENT = 57;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionStatementImpl <em>Declaration Or Definition Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeclarationOrDefinitionStatement()
	 * @generated
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT = 58;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ExpressionStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 59;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.JumpStatementImpl <em>Jump Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.JumpStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getJumpStatement()
	 * @generated
	 */
	int JUMP_STATEMENT = 60;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BreakStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 61;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ContinueStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 62;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LabeledStatementImpl <em>Labeled Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LabeledStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabeledStatement()
	 * @generated
	 */
	int LABELED_STATEMENT = 63;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.EmptyStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEmptyStatement()
	 * @generated
	 */
	int EMPTY_STATEMENT = 65;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.IfStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 66;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SwitchStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 67;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SwitchCaseImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 68;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CaseBlockImpl <em>Case Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CaseBlockImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCaseBlock()
	 * @generated
	 */
	int CASE_BLOCK = 69;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ReturnStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 70;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LoopStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLoopStatement()
	 * @generated
	 */
	int LOOP_STATEMENT = 71;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ForStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 72;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.TryStatementImpl <em>Try Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.TryStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTryStatement()
	 * @generated
	 */
	int TRY_STATEMENT = 73;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CatchBlockImpl <em>Catch Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CatchBlockImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCatchBlock()
	 * @generated
	 */
	int CATCH_BLOCK = 74;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.TypesCatchBlockImpl <em>Types Catch Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.TypesCatchBlockImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypesCatchBlock()
	 * @generated
	 */
	int TYPES_CATCH_BLOCK = 75;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.VariableCatchBlockImpl <em>Variable Catch Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.VariableCatchBlockImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVariableCatchBlock()
	 * @generated
	 */
	int VARIABLE_CATCH_BLOCK = 76;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ThrowStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 77;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NameReferenceImpl <em>Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NameReferenceImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNameReference()
	 * @generated
	 */
	int NAME_REFERENCE = 79;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ArrayAccessImpl <em>Array Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ArrayAccessImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getArrayAccess()
	 * @generated
	 */
	int ARRAY_ACCESS = 80;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.QualifiedIdentifierReferenceImpl <em>Qualified Identifier Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.QualifiedIdentifierReferenceImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getQualifiedIdentifierReference()
	 * @generated
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE = 81;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.TypeQualifiedIdentifierReferenceImpl <em>Type Qualified Identifier Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.TypeQualifiedIdentifierReferenceImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypeQualifiedIdentifierReference()
	 * @generated
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE = 82;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LiteralImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 83;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CastExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 84;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.UnaryExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 85;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BinaryExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 86;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.OperatorAssignImpl <em>Operator Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.OperatorAssignImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getOperatorAssign()
	 * @generated
	 */
	int OPERATOR_ASSIGN = 87;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ConditionalExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 88;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.RangeExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getRangeExpression()
	 * @generated
	 */
	int RANGE_EXPRESSION = 89;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ActualParameterExpressionImpl <em>Actual Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ActualParameterExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getActualParameterExpression()
	 * @generated
	 */
	int ACTUAL_PARAMETER_EXPRESSION = 91;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NewExpressionImpl <em>New Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NewExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNewExpression()
	 * @generated
	 */
	int NEW_EXPRESSION = 92;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LabelAccessImpl <em>Label Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LabelAccessImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabelAccess()
	 * @generated
	 */
	int LABEL_ACCESS = 93;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AnnotationExpressionImpl <em>Annotation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AnnotationExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAnnotationExpression()
	 * @generated
	 */
	int ANNOTATION_EXPRESSION = 94;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.GlobalScopeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGlobalScope()
	 * @generated
	 */
	int GLOBAL_SCOPE = 95;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ProgramScopeImpl <em>Program Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ProgramScopeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getProgramScope()
	 * @generated
	 */
	int PROGRAM_SCOPE = 98;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionScopeImpl <em>Function Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionScopeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionScope()
	 * @generated
	 */
	int FUNCTION_SCOPE = 101;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NameSpaceTypeImpl <em>Name Space Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NameSpaceTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNameSpaceType()
	 * @generated
	 */
	int NAME_SPACE_TYPE = 102;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LabelTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 103;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AggregateScopeImpl <em>Aggregate Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AggregateScopeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateScope()
	 * @generated
	 */
	int AGGREGATE_SCOPE = 104;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BlockScopeImpl <em>Block Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BlockScopeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBlockScope()
	 * @generated
	 */
	int BLOCK_SCOPE = 105;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.IdentifierReferenceImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIdentifierReference()
	 * @generated
	 */
	int IDENTIFIER_REFERENCE = 106;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FormalParameterDefinitionImpl <em>Formal Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FormalParameterDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFormalParameterDefinition()
	 * @generated
	 */
	int FORMAL_PARAMETER_DEFINITION = 107;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.VirtualSpecificationImpl <em>Virtual Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.VirtualSpecificationImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVirtualSpecification()
	 * @generated
	 */
	int VIRTUAL_SPECIFICATION = 108;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FormalParameterDeclarationImpl <em>Formal Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FormalParameterDeclarationImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFormalParameterDeclaration()
	 * @generated
	 */
	int FORMAL_PARAMETER_DECLARATION = 109;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.VariableDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVariableDefinition()
	 * @generated
	 */
	int VARIABLE_DEFINITION = 110;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionMemberAttributeImpl <em>Function Member Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionMemberAttributeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionMemberAttribute()
	 * @generated
	 */
	int FUNCTION_MEMBER_ATTRIBUTE = 111;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ExternalImpl <em>External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ExternalImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExternal()
	 * @generated
	 */
	int EXTERNAL = 112;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FunctionPersistentImpl <em>Function Persistent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FunctionPersistentImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionPersistent()
	 * @generated
	 */
	int FUNCTION_PERSISTENT = 113;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FileLocalImpl <em>File Local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FileLocalImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFileLocal()
	 * @generated
	 */
	int FILE_LOCAL = 114;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PerClassMemberImpl <em>Per Class Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PerClassMemberImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPerClassMember()
	 * @generated
	 */
	int PER_CLASS_MEMBER = 115;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NoDefImpl <em>No Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NoDefImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNoDef()
	 * @generated
	 */
	int NO_DEF = 116;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.VirtualImpl <em>Virtual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.VirtualImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVirtual()
	 * @generated
	 */
	int VIRTUAL = 117;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PureVirtualImpl <em>Pure Virtual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PureVirtualImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPureVirtual()
	 * @generated
	 */
	int PURE_VIRTUAL = 118;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NonVirtualImpl <em>Non Virtual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NonVirtualImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNonVirtual()
	 * @generated
	 */
	int NON_VIRTUAL = 119;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ExceptionTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 120;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.VoidImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 121;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ByteImpl <em>Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ByteImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 122;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ShortIntegerImpl <em>Short Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ShortIntegerImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getShortInteger()
	 * @generated
	 */
	int SHORT_INTEGER = 123;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.IntegerImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 124;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LongIntegerImpl <em>Long Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LongIntegerImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLongInteger()
	 * @generated
	 */
	int LONG_INTEGER = 125;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.FloatImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 126;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DoubleImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 127;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LongDoubleImpl <em>Long Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LongDoubleImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLongDouble()
	 * @generated
	 */
	int LONG_DOUBLE = 128;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CharacterImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 129;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.StringImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getString()
	 * @generated
	 */
	int STRING = 130;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BooleanImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 131;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.WideCharacterImpl <em>Wide Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.WideCharacterImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getWideCharacter()
	 * @generated
	 */
	int WIDE_CHARACTER = 132;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CollectionTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 133;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PointerTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPointerType()
	 * @generated
	 */
	int POINTER_TYPE = 134;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ReferenceTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 135;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.RangeTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 136;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.StructureTypeImpl <em>Structure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.StructureTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStructureType()
	 * @generated
	 */
	int STRUCTURE_TYPE = 137;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.UnionTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 138;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AnnotationTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 139;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ByValueFormalParameterTypeImpl <em>By Value Formal Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ByValueFormalParameterTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByValueFormalParameterType()
	 * @generated
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE = 140;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ByReferenceFormalParameterTypeImpl <em>By Reference Formal Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ByReferenceFormalParameterTypeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByReferenceFormalParameterType()
	 * @generated
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE = 141;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PublicImpl <em>Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PublicImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPublic()
	 * @generated
	 */
	int PUBLIC = 142;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ProtectedImpl <em>Protected</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ProtectedImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getProtected()
	 * @generated
	 */
	int PROTECTED = 143;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PrivateImpl <em>Private</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PrivateImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPrivate()
	 * @generated
	 */
	int PRIVATE = 144;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.TerminateStatementImpl <em>Terminate Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.TerminateStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTerminateStatement()
	 * @generated
	 */
	int TERMINATE_STATEMENT = 145;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DefaultBlockImpl <em>Default Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DefaultBlockImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDefaultBlock()
	 * @generated
	 */
	int DEFAULT_BLOCK = 146;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.WhileStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 147;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DoWhileStatementImpl <em>Do While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DoWhileStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDoWhileStatement()
	 * @generated
	 */
	int DO_WHILE_STATEMENT = 148;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ForCheckBeforeStatementImpl <em>For Check Before Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ForCheckBeforeStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getForCheckBeforeStatement()
	 * @generated
	 */
	int FOR_CHECK_BEFORE_STATEMENT = 149;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ForCheckAfterStatementImpl <em>For Check After Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ForCheckAfterStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getForCheckAfterStatement()
	 * @generated
	 */
	int FOR_CHECK_AFTER_STATEMENT = 150;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AggregateExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateExpression()
	 * @generated
	 */
	int AGGREGATE_EXPRESSION = 151;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.QualifiedOverPointerImpl <em>Qualified Over Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.QualifiedOverPointerImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getQualifiedOverPointer()
	 * @generated
	 */
	int QUALIFIED_OVER_POINTER = 152;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.QualifiedOverDataImpl <em>Qualified Over Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.QualifiedOverDataImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getQualifiedOverData()
	 * @generated
	 */
	int QUALIFIED_OVER_DATA = 153;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.IntegerLiteralImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 154;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.StringLiteralImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 155;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.CharLiteralImpl <em>Char Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.CharLiteralImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCharLiteral()
	 * @generated
	 */
	int CHAR_LITERAL = 156;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.RealLiteralImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 157;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BooleanLiteralImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 158;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitLiteralImpl <em>Bit Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitLiteralImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitLiteral()
	 * @generated
	 */
	int BIT_LITERAL = 159;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.UnaryPlusImpl <em>Unary Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.UnaryPlusImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnaryPlus()
	 * @generated
	 */
	int UNARY_PLUS = 160;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NegateImpl <em>Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NegateImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNegate()
	 * @generated
	 */
	int NEGATE = 161;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NotImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 162;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitNotImpl <em>Bit Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitNotImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitNot()
	 * @generated
	 */
	int BIT_NOT = 163;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AddressOfImpl <em>Address Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AddressOfImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAddressOf()
	 * @generated
	 */
	int ADDRESS_OF = 164;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DerefImpl <em>Deref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DerefImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeref()
	 * @generated
	 */
	int DEREF = 165;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.IncrementImpl <em>Increment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.IncrementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIncrement()
	 * @generated
	 */
	int INCREMENT = 166;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DecrementImpl <em>Decrement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DecrementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDecrement()
	 * @generated
	 */
	int DECREMENT = 167;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PostIncrementImpl <em>Post Increment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PostIncrementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPostIncrement()
	 * @generated
	 */
	int POST_INCREMENT = 168;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.PostDecrementImpl <em>Post Decrement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.PostDecrementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPostDecrement()
	 * @generated
	 */
	int POST_DECREMENT = 169;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AddImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 170;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SubtractImpl <em>Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SubtractImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSubtract()
	 * @generated
	 */
	int SUBTRACT = 171;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.MultiplyImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 172;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.DivideImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 173;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ModulusImpl <em>Modulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ModulusImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getModulus()
	 * @generated
	 */
	int MODULUS = 174;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ExponentImpl <em>Exponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ExponentImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExponent()
	 * @generated
	 */
	int EXPONENT = 175;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AndImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 176;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.OrImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getOr()
	 * @generated
	 */
	int OR = 177;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.EqualImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 178;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NotEqualImpl <em>Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NotEqualImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNotEqual()
	 * @generated
	 */
	int NOT_EQUAL = 179;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.GreaterImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 180;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NotGreaterImpl <em>Not Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NotGreaterImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNotGreater()
	 * @generated
	 */
	int NOT_GREATER = 181;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.LessImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 182;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.NotLessImpl <em>Not Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.NotLessImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNotLess()
	 * @generated
	 */
	int NOT_LESS = 183;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitAndImpl <em>Bit And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitAndImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitAnd()
	 * @generated
	 */
	int BIT_AND = 184;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitOrImpl <em>Bit Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitOrImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitOr()
	 * @generated
	 */
	int BIT_OR = 185;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitXorImpl <em>Bit Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitXorImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitXor()
	 * @generated
	 */
	int BIT_XOR = 186;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitLeftShiftImpl <em>Bit Left Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitLeftShiftImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitLeftShift()
	 * @generated
	 */
	int BIT_LEFT_SHIFT = 187;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.BitRightShiftImpl <em>Bit Right Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.BitRightShiftImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitRightShift()
	 * @generated
	 */
	int BIT_RIGHT_SHIFT = 188;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.AssignImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 189;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.MissingActualParameterImpl <em>Missing Actual Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.MissingActualParameterImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMissingActualParameter()
	 * @generated
	 */
	int MISSING_ACTUAL_PARAMETER = 190;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ByValueActualParameterExpressionImpl <em>By Value Actual Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ByValueActualParameterExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByValueActualParameterExpression()
	 * @generated
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION = 191;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.ByReferenceActualParameterExpressionImpl <em>By Reference Actual Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.ByReferenceActualParameterExpressionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByReferenceActualParameterExpression()
	 * @generated
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION = 192;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SpecificTriggerDefinitionImpl <em>Specific Trigger Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SpecificTriggerDefinitionImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificTriggerDefinition()
	 * @generated
	 */
	int SPECIFIC_TRIGGER_DEFINITION = 193;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SpecificLessEqualImpl <em>Specific Less Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SpecificLessEqualImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificLessEqual()
	 * @generated
	 */
	int SPECIFIC_LESS_EQUAL = 194;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SpecificGreaterEqualImpl <em>Specific Greater Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SpecificGreaterEqualImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificGreaterEqual()
	 * @generated
	 */
	int SPECIFIC_GREATER_EQUAL = 195;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SpecificInImpl <em>Specific In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SpecificInImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificIn()
	 * @generated
	 */
	int SPECIFIC_IN = 196;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SpecificLikeImpl <em>Specific Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SpecificLikeImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificLike()
	 * @generated
	 */
	int SPECIFIC_LIKE = 197;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SpecificConcatStringImpl <em>Specific Concat String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SpecificConcatStringImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificConcatString()
	 * @generated
	 */
	int SPECIFIC_CONCAT_STRING = 198;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.impl.SpecificSelectStatementImpl <em>Specific Select Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.impl.SpecificSelectStatementImpl
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificSelectStatement()
	 * @generated
	 */
	int SPECIFIC_SELECT_STATEMENT = 199;

	/**
	 * The meta object id for the '{@link org.xtext.example.delphi.astm.util.Visitable <em>Visitable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.delphi.astm.util.Visitable
	 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVisitable()
	 * @generated
	 */
	int VISITABLE = 200;

	/**
	 * The number of structural features of the '<em>Visitable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Visitable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITABLE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>GASTM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_OBJECT_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GASTM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_OBJECT_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT__LOCATION_INFO = GASTM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS = GASTM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT__ANNOTATIONS = GASTM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GASTM Syntax Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT_FEATURE_COUNT = GASTM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GASTM Syntax Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT_OPERATION_COUNT = GASTM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SYNTAX_OBJECT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SYNTAX_OBJECT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Other Syntax Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SYNTAX_OBJECT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Other Syntax Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SYNTAX_OBJECT_OPERATION_COUNT = GASTM_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__LANGUAGE = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__FRAGMENTS = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OPENS_SCOPE = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__LOCATION_INFO = COMPILATION_UNIT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__PRE_PROCESSOR_ELEMENTS = COMPILATION_UNIT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__ANNOTATIONS = COMPILATION_UNIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__LANGUAGE = COMPILATION_UNIT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__FRAGMENTS = COMPILATION_UNIT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__OPENS_SCOPE = COMPILATION_UNIT__OPENS_SCOPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__NAME = COMPILATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__INTERFACE = COMPILATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT__IMPLEMENTATION = COMPILATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delphi Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Delphi Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_UNIT_OPERATION_COUNT = COMPILATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION__LOCATION_INFO = COMPILATION_UNIT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION__PRE_PROCESSOR_ELEMENTS = COMPILATION_UNIT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION__ANNOTATIONS = COMPILATION_UNIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION__LANGUAGE = COMPILATION_UNIT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION__FRAGMENTS = COMPILATION_UNIT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION__OPENS_SCOPE = COMPILATION_UNIT__OPENS_SCOPE;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION__USES = COMPILATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delphi Interface Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delphi Interface Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_INTERFACE_SECTION_OPERATION_COUNT = COMPILATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__LOCATION_INFO = COMPILATION_UNIT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__PRE_PROCESSOR_ELEMENTS = COMPILATION_UNIT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__ANNOTATIONS = COMPILATION_UNIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__LANGUAGE = COMPILATION_UNIT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__FRAGMENTS = COMPILATION_UNIT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__OPENS_SCOPE = COMPILATION_UNIT__OPENS_SCOPE;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__USES = COMPILATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION__EXPORTS = COMPILATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delphi Implementation Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delphi Implementation Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_IMPLEMENTATION_SECTION_OPERATION_COUNT = COMPILATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = GASTM_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__SUB_STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__OPENS_SCOPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT__LOCATION_INFO = BLOCK_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT__PRE_PROCESSOR_ELEMENTS = BLOCK_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT__ANNOTATIONS = BLOCK_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT__SUB_STATEMENTS = BLOCK_STATEMENT__SUB_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT__OPENS_SCOPE = BLOCK_STATEMENT__OPENS_SCOPE;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT__EXPORTS = BLOCK_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT__DECLARATIONS = BLOCK_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delphi Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT_FEATURE_COUNT = BLOCK_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delphi Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_BLOCK_STATEMENT_OPERATION_COUNT = BLOCK_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_TYPE = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = GASTM_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Called Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION__LOCATION_INFO = FUNCTION_CALL_EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION__PRE_PROCESSOR_ELEMENTS = FUNCTION_CALL_EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION__ANNOTATIONS = FUNCTION_CALL_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION__EXPRESSION_TYPE = FUNCTION_CALL_EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Called Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION = FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION;

	/**
	 * The feature id for the '<em><b>Actual Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS = FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS;

	/**
	 * The feature id for the '<em><b>Apply To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION__APPLY_TO = FUNCTION_CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delphi Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = FUNCTION_CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delphi Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_FUNCTION_CALL_EXPRESSION_OPERATION_COUNT = FUNCTION_CALL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT__LOCATION_INFO = BLOCK_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT__PRE_PROCESSOR_ELEMENTS = BLOCK_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT__ANNOTATIONS = BLOCK_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT__SUB_STATEMENTS = BLOCK_STATEMENT__SUB_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT__OPENS_SCOPE = BLOCK_STATEMENT__OPENS_SCOPE;

	/**
	 * The feature id for the '<em><b>Withs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT__WITHS = BLOCK_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delphi With Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT_FEATURE_COUNT = BLOCK_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delphi With Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELPHI_WITH_STATEMENT_OPERATION_COUNT = BLOCK_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GASTM Source Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SOURCE_OBJECT_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GASTM Source Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SOURCE_OBJECT_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GASTM Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SEMANTIC_OBJECT_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GASTM Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTM_SEMANTIC_OBJECT_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_CONST = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_VOLATILE = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = GASTM_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_VOLATILE = TYPE__IS_VOLATILE;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_KIND_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Access Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_KIND_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actual Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actual Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__PATH_NAME = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_OPERATION_COUNT = GASTM_SOURCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__START_LINE = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__START_COLUMN = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__END_LINE = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__END_COLUMN = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Source File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__IN_SOURCE_FILE = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Source Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION_FEATURE_COUNT = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Source Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION_OPERATION_COUNT = GASTM_SOURCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FILES = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OUTER_SCOPE = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = GASTM_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DEFINITION_OBJECT = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CHILD_SCOPE = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = GASTM_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__NAME_STRING = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Definition Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definition Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT_OPERATION_COUNT = GASTM_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__IS_REGISTER = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS = DEFINITION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__ACCESS_KIND = DEFINITION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Declaration Or Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Declaration Or Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_OPERATION_COUNT = DEFINITION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LOCATION_INFO = DECLARATION_OR_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__PRE_PROCESSOR_ELEMENTS = DECLARATION_OR_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ANNOTATIONS = DECLARATION_OR_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IS_REGISTER = DECLARATION_OR_DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LINKAGE_SPECIFIER = DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__STORAGE_SPECIFIERS = DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ACCESS_KIND = DECLARATION_OR_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IDENTIFIER_NAME = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__DEFINITION_TYPE = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = DECLARATION_OR_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__LOCATION_INFO = DECLARATION_OR_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION_OR_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ANNOTATIONS = DECLARATION_OR_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IS_REGISTER = DECLARATION_OR_DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__LINKAGE_SPECIFIER = DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__STORAGE_SPECIFIERS = DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ACCESS_KIND = DECLARATION_OR_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DEF_REF = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IDENTIFIER_NAME = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DECLARATION_TYPE = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = DECLARATION_OR_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__LOCATION_INFO = DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__IS_REGISTER = DECLARATION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__LINKAGE_SPECIFIER = DECLARATION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__STORAGE_SPECIFIERS = DECLARATION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ACCESS_KIND = DECLARATION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DEF_REF = DECLARATION__DEF_REF;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__IDENTIFIER_NAME = DECLARATION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DECLARATION_TYPE = DECLARATION__DECLARATION_TYPE;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__FORMAL_PARAMETERS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Member Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__RETURN_TYPE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__LOCATION_INFO = DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__IS_REGISTER = DECLARATION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__LINKAGE_SPECIFIER = DECLARATION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__STORAGE_SPECIFIERS = DECLARATION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ACCESS_KIND = DECLARATION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DEF_REF = DECLARATION__DEF_REF;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__IDENTIFIER_NAME = DECLARATION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DECLARATION_TYPE = DECLARATION__DECLARATION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__IS_MUTABLE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__IS_REGISTER = DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__RETURN_TYPE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__FORMAL_PARAMETERS = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__BODY = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Member Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES = DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__OPENS_SCOPE = DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__IS_INLINE = VISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is This Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST = VISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER = VISITABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Member Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function Member Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__IS_REGISTER = DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__FORMAL_PARAMETERS = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__BODY = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entry Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__IS_REGISTER = DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__IS_MUTABLE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__INITIAL_VALUE = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__LOCATION_INFO = DATA_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__PRE_PROCESSOR_ELEMENTS = DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__ANNOTATIONS = DATA_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__IS_REGISTER = DATA_DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__LINKAGE_SPECIFIER = DATA_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__STORAGE_SPECIFIERS = DATA_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__ACCESS_KIND = DATA_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__IDENTIFIER_NAME = DATA_DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__DEFINITION_TYPE = DATA_DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__IS_MUTABLE = DATA_DEFINITION__IS_MUTABLE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__INITIAL_VALUE = DATA_DEFINITION__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Bit Field Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__BIT_FIELD_SIZE = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Field Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit Field Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION_OPERATION_COUNT = DATA_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__IS_REGISTER = DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__VALUE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Literal Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_OPERATION_COUNT = DEFINITION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__LOCATION_INFO = TYPE_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS = TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__ANNOTATIONS = TYPE_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__DEFINITION_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__LOCATION_INFO = TYPE_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS = TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__ANNOTATIONS = TYPE_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregate Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__NAME_SPACE = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__BODY = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Space Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__NAME_SPACE_TYPE = DEFINITION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name Space Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Name Space Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION_OPERATION_COUNT = DEFINITION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Label Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__LABEL_NAME = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__LABEL_TYPE = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION_OPERATION_COUNT = DEFINITION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Preprocessor Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Preprocessor Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT_OPERATION_COUNT = GASTM_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__FILE = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Include Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT_OPERATION_COUNT = PREPROCESSOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__REFERS_TO = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL_OPERATION_COUNT = PREPROCESSOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Macro Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__MACRO_NAME = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__BODY = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Macro Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Macro Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION_OPERATION_COUNT = PREPROCESSOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = PREPROCESSOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IS_VOLATILE = DATA_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IS_SIGNED = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__IS_VOLATILE = DATA_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Enum Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ENUM_LITERALS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__IS_VOLATILE = DATA_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__BASE_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constructed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__IS_VOLATILE = DATA_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__MEMBERS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__OPENS_SCOPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__IS_VOLATILE = CONSTRUCTED_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Ranks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__RANKS = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = CONSTRUCTED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Low Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LOW_BOUND = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HIGH_BOUND = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__IS_VOLATILE = TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__RETURN_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PARAMETER_TYPES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__IS_VOLATILE = DATA_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formal Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Formal Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__IS_VOLATILE = DATA_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__BODY = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__IS_VOLATILE = AGGREGATE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The feature id for the '<em><b>Derives From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DERIVES_FROM = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_OPERATION_COUNT = AGGREGATE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__IS_VIRTUAL = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__ACCESS_KIND = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__CLASS_NAME = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Derives From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Derives From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__IS_VOLATILE = TYPE__IS_VOLATILE;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__LOCATION_INFO = TYPE_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS = TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__ANNOTATIONS = TYPE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__IS_CONST = TYPE_REFERENCE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__IS_VOLATILE = TYPE_REFERENCE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unnamed Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unnamed Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__LOCATION_INFO = TYPE_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS = TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__ANNOTATIONS = TYPE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__IS_CONST = TYPE_REFERENCE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__IS_VOLATILE = TYPE_REFERENCE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__NAME = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__TYPE = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__OPERAND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Decl Or Defn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__DECL_OR_DEFN = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declaration Or Definition Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declaration Or Definition Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jump Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_BODY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Switch Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__SWITCH_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__CASES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__BODY = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__LOCATION_INFO = SWITCH_CASE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__PRE_PROCESSOR_ELEMENTS = SWITCH_CASE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__ANNOTATIONS = SWITCH_CASE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__BODY = SWITCH_CASE__BODY;

	/**
	 * The feature id for the '<em><b>Case Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__CASE_EXPRESSIONS = SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK_FEATURE_COUNT = SWITCH_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Case Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK_OPERATION_COUNT = SWITCH_CASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__RETURN_VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__LOCATION_INFO = LOOP_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__PRE_PROCESSOR_ELEMENTS = LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ANNOTATIONS = LOOP_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Init Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INIT_BODY = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iteration Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ITERATION_BODY = LOOP_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_OPERATION_COUNT = LOOP_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Guarded Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__GUARDED_STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__CATCH_BLOCKS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__FINAL_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Try Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Try Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__BODY = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catch Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Catch Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__LOCATION_INFO = CATCH_BLOCK__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS = CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__ANNOTATIONS = CATCH_BLOCK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__BODY = CATCH_BLOCK__BODY;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__EXCEPTIONS = CATCH_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Types Catch Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK_FEATURE_COUNT = CATCH_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Types Catch Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK_OPERATION_COUNT = CATCH_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__LOCATION_INFO = CATCH_BLOCK__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS = CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__ANNOTATIONS = CATCH_BLOCK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__BODY = CATCH_BLOCK__BODY;

	/**
	 * The feature id for the '<em><b>Exception Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE = CATCH_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Catch Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK_FEATURE_COUNT = CATCH_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Catch Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK_OPERATION_COUNT = CATCH_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__EXCEPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__REFERS_TO = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Array Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ARRAY_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__SUBSCRIPTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO = NAME_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS = NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS = NAME_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE = NAME_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__NAME = NAME_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO = NAME_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__QUALIFIERS = NAME_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__MEMBER = NAME_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualified Identifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT = NAME_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qualified Identifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE_OPERATION_COUNT = NAME_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO = NAME_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS = NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS = NAME_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE = NAME_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__NAME = NAME_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO = NAME_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Aggregate Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__AGGREGATE_TYPE = NAME_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__MEMBER = NAME_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Qualified Identifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT = NAME_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Qualified Identifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE_OPERATION_COUNT = NAME_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Cast Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__CAST_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN__OPERATOR = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operator Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On True Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On False Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>From Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__FROM_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__TO_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION__VALUE = ACTUAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actual Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT = ACTUAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actual Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION_OPERATION_COUNT = ACTUAL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__NEW_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__ACTUAL_PARAMS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>New Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__DEFINITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Annotation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__ANNOTATION_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__MEMBER_VALUES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Global Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Global Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Program Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Program Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Function Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__IS_VOLATILE = TYPE__IS_VOLATILE;

	/**
	 * The number of structural features of the '<em>Name Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Name Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__IS_VOLATILE = TYPE__IS_VOLATILE;

	/**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Aggregate Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregate Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Block Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__LOCATION_INFO = NAME_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS = NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__ANNOTATIONS = NAME_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__EXPRESSION_TYPE = NAME_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__NAME = NAME_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__REFERS_TO = NAME_REFERENCE__REFERS_TO;

	/**
	 * The number of structural features of the '<em>Identifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_FEATURE_COUNT = NAME_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_OPERATION_COUNT = NAME_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__LOCATION_INFO = DATA_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__PRE_PROCESSOR_ELEMENTS = DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__ANNOTATIONS = DATA_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__IS_REGISTER = DATA_DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__LINKAGE_SPECIFIER = DATA_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__STORAGE_SPECIFIERS = DATA_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__ACCESS_KIND = DATA_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__IDENTIFIER_NAME = DATA_DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__DEFINITION_TYPE = DATA_DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__IS_MUTABLE = DATA_DEFINITION__IS_MUTABLE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__INITIAL_VALUE = DATA_DEFINITION__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>Formal Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Formal Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION_OPERATION_COUNT = DATA_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Virtual Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__LOCATION_INFO = DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__IS_REGISTER = DECLARATION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__LINKAGE_SPECIFIER = DECLARATION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__STORAGE_SPECIFIERS = DECLARATION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__ACCESS_KIND = DECLARATION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__DEF_REF = DECLARATION__DEF_REF;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__IDENTIFIER_NAME = DECLARATION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__DECLARATION_TYPE = DECLARATION__DECLARATION_TYPE;

	/**
	 * The number of structural features of the '<em>Formal Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Formal Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__LOCATION_INFO = DATA_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__PRE_PROCESSOR_ELEMENTS = DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__ANNOTATIONS = DATA_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__IS_REGISTER = DATA_DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__LINKAGE_SPECIFIER = DATA_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__STORAGE_SPECIFIERS = DATA_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__ACCESS_KIND = DATA_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__IDENTIFIER_NAME = DATA_DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__DEFINITION_TYPE = DATA_DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__IS_MUTABLE = DATA_DEFINITION__IS_MUTABLE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__INITIAL_VALUE = DATA_DEFINITION__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>Variable Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_OPERATION_COUNT = DATA_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTE__LOCATION_INFO = OTHER_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTE__PRE_PROCESSOR_ELEMENTS = OTHER_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTE__ANNOTATIONS = OTHER_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Function Member Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTE_FEATURE_COUNT = OTHER_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Member Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTE_OPERATION_COUNT = OTHER_SYNTAX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION_COUNT = STORAGE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Persistent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PERSISTENT_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Persistent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PERSISTENT_OPERATION_COUNT = STORAGE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL_OPERATION_COUNT = STORAGE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Per Class Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_CLASS_MEMBER_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Per Class Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_CLASS_MEMBER_OPERATION_COUNT = STORAGE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_DEF_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_DEF_OPERATION_COUNT = STORAGE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL__LOCATION_INFO = VIRTUAL_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL__PRE_PROCESSOR_ELEMENTS = VIRTUAL_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL__ANNOTATIONS = VIRTUAL_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Virtual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_FEATURE_COUNT = VIRTUAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_OPERATION_COUNT = VIRTUAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURE_VIRTUAL__LOCATION_INFO = VIRTUAL_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURE_VIRTUAL__PRE_PROCESSOR_ELEMENTS = VIRTUAL_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURE_VIRTUAL__ANNOTATIONS = VIRTUAL_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Pure Virtual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURE_VIRTUAL_FEATURE_COUNT = VIRTUAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pure Virtual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURE_VIRTUAL_OPERATION_COUNT = VIRTUAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VIRTUAL__LOCATION_INFO = VIRTUAL_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VIRTUAL__PRE_PROCESSOR_ELEMENTS = VIRTUAL_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VIRTUAL__ANNOTATIONS = VIRTUAL_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Non Virtual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VIRTUAL_FEATURE_COUNT = VIRTUAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Virtual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VIRTUAL_OPERATION_COUNT = VIRTUAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__IS_VOLATILE = DATA_TYPE__IS_VOLATILE;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Short Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Short Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Long Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER__IS_VOLATILE = PRIMITIVE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER__IS_SIGNED = PRIMITIVE_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Wide Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wide Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDE_CHARACTER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS_VOLATILE = CONSTRUCTED_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = CONSTRUCTED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__IS_VOLATILE = CONSTRUCTED_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_OPERATION_COUNT = CONSTRUCTED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__IS_VOLATILE = CONSTRUCTED_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = CONSTRUCTED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__IS_VOLATILE = CONSTRUCTED_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_OPERATION_COUNT = CONSTRUCTED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__IS_VOLATILE = AGGREGATE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The number of structural features of the '<em>Structure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_OPERATION_COUNT = AGGREGATE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__IS_VOLATILE = AGGREGATE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_OPERATION_COUNT = AGGREGATE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__IS_VOLATILE = AGGREGATE_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_OPERATION_COUNT = AGGREGATE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__LOCATION_INFO = FORMAL_PARAMETER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS = FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__ANNOTATIONS = FORMAL_PARAMETER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__IS_CONST = FORMAL_PARAMETER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__IS_VOLATILE = FORMAL_PARAMETER_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__TYPE = FORMAL_PARAMETER_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>By Value Formal Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE_FEATURE_COUNT = FORMAL_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>By Value Formal Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE_OPERATION_COUNT = FORMAL_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__LOCATION_INFO = FORMAL_PARAMETER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS = FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__ANNOTATIONS = FORMAL_PARAMETER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__IS_CONST = FORMAL_PARAMETER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__IS_VOLATILE = FORMAL_PARAMETER_TYPE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__TYPE = FORMAL_PARAMETER_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>By Reference Formal Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE_FEATURE_COUNT = FORMAL_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>By Reference Formal Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE_OPERATION_COUNT = FORMAL_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_FEATURE_COUNT = ACCESS_KIND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_COUNT = ACCESS_KIND_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_FEATURE_COUNT = ACCESS_KIND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Protected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_OPERATION_COUNT = ACCESS_KIND_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Private</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_FEATURE_COUNT = ACCESS_KIND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_OPERATION_COUNT = ACCESS_KIND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Terminate Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminate Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__LOCATION_INFO = SWITCH_CASE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__PRE_PROCESSOR_ELEMENTS = SWITCH_CASE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__ANNOTATIONS = SWITCH_CASE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__BODY = SWITCH_CASE__BODY;

	/**
	 * The number of structural features of the '<em>Default Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK_FEATURE_COUNT = SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK_OPERATION_COUNT = SWITCH_CASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__LOCATION_INFO = LOOP_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__PRE_PROCESSOR_ELEMENTS = LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__ANNOTATIONS = LOOP_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = LOOP_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__LOCATION_INFO = LOOP_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__PRE_PROCESSOR_ELEMENTS = LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__ANNOTATIONS = LOOP_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>Do While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Do While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT_OPERATION_COUNT = LOOP_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__LOCATION_INFO = FOR_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__PRE_PROCESSOR_ELEMENTS = FOR_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__ANNOTATIONS = FOR_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__CONDITION = FOR_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__BODY = FOR_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Init Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__INIT_BODY = FOR_STATEMENT__INIT_BODY;

	/**
	 * The feature id for the '<em><b>Iteration Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__ITERATION_BODY = FOR_STATEMENT__ITERATION_BODY;

	/**
	 * The number of structural features of the '<em>For Check Before Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT_FEATURE_COUNT = FOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>For Check Before Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT_OPERATION_COUNT = FOR_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__LOCATION_INFO = FOR_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__PRE_PROCESSOR_ELEMENTS = FOR_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__ANNOTATIONS = FOR_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__CONDITION = FOR_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__BODY = FOR_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Init Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__INIT_BODY = FOR_STATEMENT__INIT_BODY;

	/**
	 * The feature id for the '<em><b>Iteration Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__ITERATION_BODY = FOR_STATEMENT__ITERATION_BODY;

	/**
	 * The number of structural features of the '<em>For Check After Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT_FEATURE_COUNT = FOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>For Check After Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT_OPERATION_COUNT = FOR_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The number of structural features of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__LOCATION_INFO = QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__PRE_PROCESSOR_ELEMENTS = QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__ANNOTATIONS = QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__EXPRESSION_TYPE = QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__NAME = QUALIFIED_IDENTIFIER_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__REFERS_TO = QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__QUALIFIERS = QUALIFIED_IDENTIFIER_REFERENCE__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__MEMBER = QUALIFIED_IDENTIFIER_REFERENCE__MEMBER;

	/**
	 * The number of structural features of the '<em>Qualified Over Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER_FEATURE_COUNT = QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qualified Over Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER_OPERATION_COUNT = QUALIFIED_IDENTIFIER_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__LOCATION_INFO = QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__PRE_PROCESSOR_ELEMENTS = QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__ANNOTATIONS = QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__EXPRESSION_TYPE = QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__NAME = QUALIFIED_IDENTIFIER_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__REFERS_TO = QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__QUALIFIERS = QUALIFIED_IDENTIFIER_REFERENCE__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__MEMBER = QUALIFIED_IDENTIFIER_REFERENCE__MEMBER;

	/**
	 * The number of structural features of the '<em>Qualified Over Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA_FEATURE_COUNT = QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qualified Over Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA_OPERATION_COUNT = QUALIFIED_IDENTIFIER_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Char Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Bit Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unary Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_NOT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Address Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEREF_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEREF_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decrement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decrement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Post Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_INCREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Post Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_INCREMENT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Post Decrement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_DECREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Post Decrement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_DECREMENT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULUS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULUS_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENT_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GREATER_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GREATER_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_LESS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_LESS_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_AND_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_AND_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_OR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_OR_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_XOR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_XOR_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LEFT_SHIFT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_LEFT_SHIFT_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_RIGHT_SHIFT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_RIGHT_SHIFT_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Missing Actual Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_ACTUAL_PARAMETER_FEATURE_COUNT = ACTUAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Missing Actual Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_ACTUAL_PARAMETER_OPERATION_COUNT = ACTUAL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION__VALUE = ACTUAL_PARAMETER_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>By Value Actual Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT = ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>By Value Actual Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION_OPERATION_COUNT = ACTUAL_PARAMETER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION__VALUE = ACTUAL_PARAMETER_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>By Reference Actual Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT = ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>By Reference Actual Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION_OPERATION_COUNT = ACTUAL_PARAMETER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__IS_REGISTER = DEFINITION__IS_REGISTER;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION__BODY = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specific Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRIGGER_DEFINITION_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Less Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LESS_EQUAL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific Less Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LESS_EQUAL_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Greater Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_GREATER_EQUAL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific Greater Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_GREATER_EQUAL_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_IN_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_IN_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LIKE_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LIKE_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Concat String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CONCAT_STRING_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific Concat String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CONCAT_STRING_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_SELECT_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_SELECT_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_SELECT_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Specific Select Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_SELECT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific Select Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_SELECT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DelphiUnit <em>Delphi Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delphi Unit</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiUnit
	 * @generated
	 */
	EClass getDelphiUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DelphiUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiUnit#getName()
	 * @see #getDelphiUnit()
	 * @generated
	 */
	EReference getDelphiUnit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DelphiUnit#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiUnit#getInterface()
	 * @see #getDelphiUnit()
	 * @generated
	 */
	EReference getDelphiUnit_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DelphiUnit#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiUnit#getImplementation()
	 * @see #getDelphiUnit()
	 * @generated
	 */
	EReference getDelphiUnit_Implementation();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DelphiInterfaceSection <em>Delphi Interface Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delphi Interface Section</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiInterfaceSection
	 * @generated
	 */
	EClass getDelphiInterfaceSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.DelphiInterfaceSection#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiInterfaceSection#getUses()
	 * @see #getDelphiInterfaceSection()
	 * @generated
	 */
	EReference getDelphiInterfaceSection_Uses();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DelphiImplementationSection <em>Delphi Implementation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delphi Implementation Section</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiImplementationSection
	 * @generated
	 */
	EClass getDelphiImplementationSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.DelphiImplementationSection#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiImplementationSection#getUses()
	 * @see #getDelphiImplementationSection()
	 * @generated
	 */
	EReference getDelphiImplementationSection_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.DelphiImplementationSection#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exports</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiImplementationSection#getExports()
	 * @see #getDelphiImplementationSection()
	 * @generated
	 */
	EReference getDelphiImplementationSection_Exports();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DelphiBlockStatement <em>Delphi Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delphi Block Statement</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiBlockStatement
	 * @generated
	 */
	EClass getDelphiBlockStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.DelphiBlockStatement#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exports</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiBlockStatement#getExports()
	 * @see #getDelphiBlockStatement()
	 * @generated
	 */
	EReference getDelphiBlockStatement_Exports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.DelphiBlockStatement#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiBlockStatement#getDeclarations()
	 * @see #getDelphiBlockStatement()
	 * @generated
	 */
	EReference getDelphiBlockStatement_Declarations();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DelphiFunctionCallExpression <em>Delphi Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delphi Function Call Expression</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiFunctionCallExpression
	 * @generated
	 */
	EClass getDelphiFunctionCallExpression();

	/**
	 * Returns the meta object for the reference '{@link org.xtext.example.delphi.astm.DelphiFunctionCallExpression#getApplyTo <em>Apply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apply To</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiFunctionCallExpression#getApplyTo()
	 * @see #getDelphiFunctionCallExpression()
	 * @generated
	 */
	EReference getDelphiFunctionCallExpression_ApplyTo();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DelphiWithStatement <em>Delphi With Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delphi With Statement</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiWithStatement
	 * @generated
	 */
	EClass getDelphiWithStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.xtext.example.delphi.astm.DelphiWithStatement#getWiths <em>Withs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Withs</em>'.
	 * @see org.xtext.example.delphi.astm.DelphiWithStatement#getWiths()
	 * @see #getDelphiWithStatement()
	 * @generated
	 */
	EReference getDelphiWithStatement_Withs();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.GASTMObject <em>GASTM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GASTM Object</em>'.
	 * @see org.xtext.example.delphi.astm.GASTMObject
	 * @generated
	 */
	EClass getGASTMObject();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.GASTMSourceObject <em>GASTM Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GASTM Source Object</em>'.
	 * @see org.xtext.example.delphi.astm.GASTMSourceObject
	 * @generated
	 */
	EClass getGASTMSourceObject();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.GASTMSemanticObject <em>GASTM Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GASTM Semantic Object</em>'.
	 * @see org.xtext.example.delphi.astm.GASTMSemanticObject
	 * @generated
	 */
	EClass getGASTMSemanticObject();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.OtherSyntaxObject <em>Other Syntax Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Syntax Object</em>'.
	 * @see org.xtext.example.delphi.astm.OtherSyntaxObject
	 * @generated
	 */
	EClass getOtherSyntaxObject();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.StorageSpecification <em>Storage Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Specification</em>'.
	 * @see org.xtext.example.delphi.astm.StorageSpecification
	 * @generated
	 */
	EClass getStorageSpecification();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.xtext.example.delphi.astm.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Kind</em>'.
	 * @see org.xtext.example.delphi.astm.AccessKind
	 * @generated
	 */
	EClass getAccessKind();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see org.xtext.example.delphi.astm.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see org.xtext.example.delphi.astm.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ActualParameter <em>Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Parameter</em>'.
	 * @see org.xtext.example.delphi.astm.ActualParameter
	 * @generated
	 */
	EClass getActualParameter();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see org.xtext.example.delphi.astm.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.SourceFile#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see org.xtext.example.delphi.astm.SourceFile#getPathName()
	 * @see #getSourceFile()
	 * @generated
	 */
	EAttribute getSourceFile_PathName();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Location</em>'.
	 * @see org.xtext.example.delphi.astm.SourceLocation
	 * @generated
	 */
	EClass getSourceLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.SourceLocation#getStartLine <em>Start Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line</em>'.
	 * @see org.xtext.example.delphi.astm.SourceLocation#getStartLine()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_StartLine();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.SourceLocation#getStartColumn <em>Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Column</em>'.
	 * @see org.xtext.example.delphi.astm.SourceLocation#getStartColumn()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_StartColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.SourceLocation#getEndLine <em>End Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Line</em>'.
	 * @see org.xtext.example.delphi.astm.SourceLocation#getEndLine()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_EndLine();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.SourceLocation#getEndColumn <em>End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Column</em>'.
	 * @see org.xtext.example.delphi.astm.SourceLocation#getEndColumn()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_EndColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.SourceLocation#getInSourceFile <em>In Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Source File</em>'.
	 * @see org.xtext.example.delphi.astm.SourceLocation#getInSourceFile()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EReference getSourceLocation_InSourceFile();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.xtext.example.delphi.astm.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.Project#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.xtext.example.delphi.astm.Project#getFiles()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Files();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Project#getOuterScope <em>Outer Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer Scope</em>'.
	 * @see org.xtext.example.delphi.astm.Project#getOuterScope()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_OuterScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.xtext.example.delphi.astm.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.Scope#getDefinitionObject <em>Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition Object</em>'.
	 * @see org.xtext.example.delphi.astm.Scope#getDefinitionObject()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_DefinitionObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.Scope#getChildScope <em>Child Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Scope</em>'.
	 * @see org.xtext.example.delphi.astm.Scope#getChildScope()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_ChildScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.GASTMSyntaxObject <em>GASTM Syntax Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GASTM Syntax Object</em>'.
	 * @see org.xtext.example.delphi.astm.GASTMSyntaxObject
	 * @generated
	 */
	EClass getGASTMSyntaxObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.GASTMSyntaxObject#getLocationInfo <em>Location Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Info</em>'.
	 * @see org.xtext.example.delphi.astm.GASTMSyntaxObject#getLocationInfo()
	 * @see #getGASTMSyntaxObject()
	 * @generated
	 */
	EReference getGASTMSyntaxObject_LocationInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.GASTMSyntaxObject#getPreProcessorElements <em>Pre Processor Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Processor Elements</em>'.
	 * @see org.xtext.example.delphi.astm.GASTMSyntaxObject#getPreProcessorElements()
	 * @see #getGASTMSyntaxObject()
	 * @generated
	 */
	EReference getGASTMSyntaxObject_PreProcessorElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.GASTMSyntaxObject#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.xtext.example.delphi.astm.GASTMSyntaxObject#getAnnotations()
	 * @see #getGASTMSyntaxObject()
	 * @generated
	 */
	EReference getGASTMSyntaxObject_Annotations();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.xtext.example.delphi.astm.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.CompilationUnit#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.xtext.example.delphi.astm.CompilationUnit#getLanguage()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.CompilationUnit#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see org.xtext.example.delphi.astm.CompilationUnit#getFragments()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Fragments();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.CompilationUnit#getOpensScope <em>Opens Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opens Scope</em>'.
	 * @see org.xtext.example.delphi.astm.CompilationUnit#getOpensScope()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_OpensScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see org.xtext.example.delphi.astm.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.Name#getNameString <em>Name String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name String</em>'.
	 * @see org.xtext.example.delphi.astm.Name#getNameString()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_NameString();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition <em>Declaration Or Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration Or Definition</em>'.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinition
	 * @generated
	 */
	EClass getDeclarationOrDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#isIsRegister <em>Is Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Register</em>'.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinition#isIsRegister()
	 * @see #getDeclarationOrDefinition()
	 * @generated
	 */
	EAttribute getDeclarationOrDefinition_IsRegister();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getLinkageSpecifier <em>Linkage Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linkage Specifier</em>'.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinition#getLinkageSpecifier()
	 * @see #getDeclarationOrDefinition()
	 * @generated
	 */
	EAttribute getDeclarationOrDefinition_LinkageSpecifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getStorageSpecifiers <em>Storage Specifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage Specifiers</em>'.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinition#getStorageSpecifiers()
	 * @see #getDeclarationOrDefinition()
	 * @generated
	 */
	EReference getDeclarationOrDefinition_StorageSpecifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DeclarationOrDefinition#getAccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Kind</em>'.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinition#getAccessKind()
	 * @see #getDeclarationOrDefinition()
	 * @generated
	 */
	EReference getDeclarationOrDefinition_AccessKind();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.xtext.example.delphi.astm.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Definition#getIdentifierName <em>Identifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier Name</em>'.
	 * @see org.xtext.example.delphi.astm.Definition#getIdentifierName()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_IdentifierName();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Definition#getDefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition Type</em>'.
	 * @see org.xtext.example.delphi.astm.Definition#getDefinitionType()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_DefinitionType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.xtext.example.delphi.astm.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Declaration#getDefRef <em>Def Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def Ref</em>'.
	 * @see org.xtext.example.delphi.astm.Declaration#getDefRef()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_DefRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Declaration#getIdentifierName <em>Identifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier Name</em>'.
	 * @see org.xtext.example.delphi.astm.Declaration#getIdentifierName()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_IdentifierName();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Declaration#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration Type</em>'.
	 * @see org.xtext.example.delphi.astm.Declaration#getDeclarationType()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_DeclarationType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.FunctionDeclaration#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDeclaration#getFormalParameters()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_FormalParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionDeclaration#getFunctionMemberAttributes <em>Function Member Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Member Attributes</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDeclaration#getFunctionMemberAttributes()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_FunctionMemberAttributes();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionDeclaration#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDeclaration#getReturnType()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see org.xtext.example.delphi.astm.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.VariableDeclaration#isIsMutable <em>Is Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mutable</em>'.
	 * @see org.xtext.example.delphi.astm.VariableDeclaration#isIsMutable()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_IsMutable();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDefinition#getReturnType()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.FunctionDefinition#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDefinition#getFormalParameters()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_FormalParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.FunctionDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDefinition#getBody()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionDefinition#getFunctionMemberAttributes <em>Function Member Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Member Attributes</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDefinition#getFunctionMemberAttributes()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_FunctionMemberAttributes();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionDefinition#getOpensScope <em>Opens Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opens Scope</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionDefinition#getOpensScope()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_OpensScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionMemberAttributes <em>Function Member Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Member Attributes</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttributes
	 * @generated
	 */
	EClass getFunctionMemberAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.FunctionMemberAttributes#isIsFriend <em>Is Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Friend</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttributes#isIsFriend()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EAttribute getFunctionMemberAttributes_IsFriend();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.FunctionMemberAttributes#isIsInline <em>Is Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inline</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttributes#isIsInline()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EAttribute getFunctionMemberAttributes_IsInline();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.FunctionMemberAttributes#isIsThisConst <em>Is This Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is This Const</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttributes#isIsThisConst()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EAttribute getFunctionMemberAttributes_IsThisConst();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionMemberAttributes#getVirtualSpecifier <em>Virtual Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Specifier</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttributes#getVirtualSpecifier()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EReference getFunctionMemberAttributes_VirtualSpecifier();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.EntryDefinition <em>Entry Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Definition</em>'.
	 * @see org.xtext.example.delphi.astm.EntryDefinition
	 * @generated
	 */
	EClass getEntryDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.EntryDefinition#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see org.xtext.example.delphi.astm.EntryDefinition#getFormalParameters()
	 * @see #getEntryDefinition()
	 * @generated
	 */
	EReference getEntryDefinition_FormalParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.EntryDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.EntryDefinition#getBody()
	 * @see #getEntryDefinition()
	 * @generated
	 */
	EReference getEntryDefinition_Body();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Definition</em>'.
	 * @see org.xtext.example.delphi.astm.DataDefinition
	 * @generated
	 */
	EClass getDataDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.DataDefinition#isIsMutable <em>Is Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mutable</em>'.
	 * @see org.xtext.example.delphi.astm.DataDefinition#isIsMutable()
	 * @see #getDataDefinition()
	 * @generated
	 */
	EAttribute getDataDefinition_IsMutable();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DataDefinition#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.xtext.example.delphi.astm.DataDefinition#getInitialValue()
	 * @see #getDataDefinition()
	 * @generated
	 */
	EReference getDataDefinition_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitFieldDefinition <em>Bit Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Definition</em>'.
	 * @see org.xtext.example.delphi.astm.BitFieldDefinition
	 * @generated
	 */
	EClass getBitFieldDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.BitFieldDefinition#getBitFieldSize <em>Bit Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bit Field Size</em>'.
	 * @see org.xtext.example.delphi.astm.BitFieldDefinition#getBitFieldSize()
	 * @see #getBitFieldDefinition()
	 * @generated
	 */
	EReference getBitFieldDefinition_BitFieldSize();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.EnumLiteralDefinition <em>Enum Literal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Definition</em>'.
	 * @see org.xtext.example.delphi.astm.EnumLiteralDefinition
	 * @generated
	 */
	EClass getEnumLiteralDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.EnumLiteralDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.xtext.example.delphi.astm.EnumLiteralDefinition#getValue()
	 * @see #getEnumLiteralDefinition()
	 * @generated
	 */
	EReference getEnumLiteralDefinition_Value();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see org.xtext.example.delphi.astm.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.TypeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtext.example.delphi.astm.TypeDefinition#getName()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NamedTypeDefinition <em>Named Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type Definition</em>'.
	 * @see org.xtext.example.delphi.astm.NamedTypeDefinition
	 * @generated
	 */
	EClass getNamedTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.NamedTypeDefinition#getDefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition Type</em>'.
	 * @see org.xtext.example.delphi.astm.NamedTypeDefinition#getDefinitionType()
	 * @see #getNamedTypeDefinition()
	 * @generated
	 */
	EReference getNamedTypeDefinition_DefinitionType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AggregateTypeDefinition <em>Aggregate Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Type Definition</em>'.
	 * @see org.xtext.example.delphi.astm.AggregateTypeDefinition
	 * @generated
	 */
	EClass getAggregateTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.AggregateTypeDefinition#getAggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate Type</em>'.
	 * @see org.xtext.example.delphi.astm.AggregateTypeDefinition#getAggregateType()
	 * @see #getAggregateTypeDefinition()
	 * @generated
	 */
	EReference getAggregateTypeDefinition_AggregateType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NameSpaceDefinition <em>Name Space Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Space Definition</em>'.
	 * @see org.xtext.example.delphi.astm.NameSpaceDefinition
	 * @generated
	 */
	EClass getNameSpaceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Space</em>'.
	 * @see org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpace()
	 * @see #getNameSpaceDefinition()
	 * @generated
	 */
	EReference getNameSpaceDefinition_NameSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.NameSpaceDefinition#getBody()
	 * @see #getNameSpaceDefinition()
	 * @generated
	 */
	EReference getNameSpaceDefinition_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpaceType <em>Name Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Space Type</em>'.
	 * @see org.xtext.example.delphi.astm.NameSpaceDefinition#getNameSpaceType()
	 * @see #getNameSpaceDefinition()
	 * @generated
	 */
	EReference getNameSpaceDefinition_NameSpaceType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.LabelDefinition <em>Label Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Definition</em>'.
	 * @see org.xtext.example.delphi.astm.LabelDefinition
	 * @generated
	 */
	EClass getLabelDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LabelDefinition#getLabelName <em>Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Name</em>'.
	 * @see org.xtext.example.delphi.astm.LabelDefinition#getLabelName()
	 * @see #getLabelDefinition()
	 * @generated
	 */
	EReference getLabelDefinition_LabelName();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LabelDefinition#getLabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Type</em>'.
	 * @see org.xtext.example.delphi.astm.LabelDefinition#getLabelType()
	 * @see #getLabelDefinition()
	 * @generated
	 */
	EReference getLabelDefinition_LabelType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.IncludeUnit <em>Include Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Unit</em>'.
	 * @see org.xtext.example.delphi.astm.IncludeUnit
	 * @generated
	 */
	EClass getIncludeUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.IncludeUnit#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see org.xtext.example.delphi.astm.IncludeUnit#getFile()
	 * @see #getIncludeUnit()
	 * @generated
	 */
	EReference getIncludeUnit_File();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.MacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Call</em>'.
	 * @see org.xtext.example.delphi.astm.MacroCall
	 * @generated
	 */
	EClass getMacroCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.MacroCall#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refers To</em>'.
	 * @see org.xtext.example.delphi.astm.MacroCall#getRefersTo()
	 * @see #getMacroCall()
	 * @generated
	 */
	EReference getMacroCall_RefersTo();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.MacroDefinition <em>Macro Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Definition</em>'.
	 * @see org.xtext.example.delphi.astm.MacroDefinition
	 * @generated
	 */
	EClass getMacroDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.MacroDefinition#getMacroName <em>Macro Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macro Name</em>'.
	 * @see org.xtext.example.delphi.astm.MacroDefinition#getMacroName()
	 * @see #getMacroDefinition()
	 * @generated
	 */
	EAttribute getMacroDefinition_MacroName();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.MacroDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.MacroDefinition#getBody()
	 * @see #getMacroDefinition()
	 * @generated
	 */
	EAttribute getMacroDefinition_Body();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.xtext.example.delphi.astm.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.xtext.example.delphi.astm.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.xtext.example.delphi.astm.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.Type#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see org.xtext.example.delphi.astm.Type#isIsConst()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.Type#isIsVolatile <em>Is Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Volatile</em>'.
	 * @see org.xtext.example.delphi.astm.Type#isIsVolatile()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_IsVolatile();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.xtext.example.delphi.astm.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.PrimitiveType#isIsSigned <em>Is Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Signed</em>'.
	 * @see org.xtext.example.delphi.astm.PrimitiveType#isIsSigned()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_IsSigned();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see org.xtext.example.delphi.astm.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.EnumType#getEnumLiterals <em>Enum Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Literals</em>'.
	 * @see org.xtext.example.delphi.astm.EnumType#getEnumLiterals()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_EnumLiterals();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ConstructedType <em>Constructed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructed Type</em>'.
	 * @see org.xtext.example.delphi.astm.ConstructedType
	 * @generated
	 */
	EClass getConstructedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ConstructedType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.xtext.example.delphi.astm.ConstructedType#getBaseType()
	 * @see #getConstructedType()
	 * @generated
	 */
	EReference getConstructedType_BaseType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Type</em>'.
	 * @see org.xtext.example.delphi.astm.AggregateType
	 * @generated
	 */
	EClass getAggregateType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.AggregateType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.xtext.example.delphi.astm.AggregateType#getMembers()
	 * @see #getAggregateType()
	 * @generated
	 */
	EReference getAggregateType_Members();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.AggregateType#getOpensScope <em>Opens Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opens Scope</em>'.
	 * @see org.xtext.example.delphi.astm.AggregateType#getOpensScope()
	 * @see #getAggregateType()
	 * @generated
	 */
	EReference getAggregateType_OpensScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.xtext.example.delphi.astm.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.ArrayType#getRanks <em>Ranks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ranks</em>'.
	 * @see org.xtext.example.delphi.astm.ArrayType#getRanks()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Ranks();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.xtext.example.delphi.astm.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Dimension#getLowBound <em>Low Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low Bound</em>'.
	 * @see org.xtext.example.delphi.astm.Dimension#getLowBound()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_LowBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Dimension#getHighBound <em>High Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High Bound</em>'.
	 * @see org.xtext.example.delphi.astm.Dimension#getHighBound()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_HighBound();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionType#getReturnType()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.FunctionType#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Types</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionType#getParameterTypes()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ParameterTypes();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FormalParameterType <em>Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter Type</em>'.
	 * @see org.xtext.example.delphi.astm.FormalParameterType
	 * @generated
	 */
	EClass getFormalParameterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FormalParameterType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.xtext.example.delphi.astm.FormalParameterType#getType()
	 * @see #getFormalParameterType()
	 * @generated
	 */
	EReference getFormalParameterType_Type();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see org.xtext.example.delphi.astm.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.NamedType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.NamedType#getBody()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Body();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see org.xtext.example.delphi.astm.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.ClassType#getDerivesFrom <em>Derives From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derives From</em>'.
	 * @see org.xtext.example.delphi.astm.ClassType#getDerivesFrom()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_DerivesFrom();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DerivesFrom <em>Derives From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derives From</em>'.
	 * @see org.xtext.example.delphi.astm.DerivesFrom
	 * @generated
	 */
	EClass getDerivesFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.DerivesFrom#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see org.xtext.example.delphi.astm.DerivesFrom#isIsVirtual()
	 * @see #getDerivesFrom()
	 * @generated
	 */
	EAttribute getDerivesFrom_IsVirtual();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DerivesFrom#getAccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Kind</em>'.
	 * @see org.xtext.example.delphi.astm.DerivesFrom#getAccessKind()
	 * @see #getDerivesFrom()
	 * @generated
	 */
	EReference getDerivesFrom_AccessKind();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DerivesFrom#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Name</em>'.
	 * @see org.xtext.example.delphi.astm.DerivesFrom#getClassName()
	 * @see #getDerivesFrom()
	 * @generated
	 */
	EReference getDerivesFrom_ClassName();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.UnnamedTypeReference <em>Unnamed Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unnamed Type Reference</em>'.
	 * @see org.xtext.example.delphi.astm.UnnamedTypeReference
	 * @generated
	 */
	EClass getUnnamedTypeReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.UnnamedTypeReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.xtext.example.delphi.astm.UnnamedTypeReference#getType()
	 * @see #getUnnamedTypeReference()
	 * @generated
	 */
	EReference getUnnamedTypeReference_Type();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NamedTypeReference <em>Named Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type Reference</em>'.
	 * @see org.xtext.example.delphi.astm.NamedTypeReference
	 * @generated
	 */
	EClass getNamedTypeReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.NamedTypeReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtext.example.delphi.astm.NamedTypeReference#getName()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EReference getNamedTypeReference_Name();

	/**
	 * Returns the meta object for the reference '{@link org.xtext.example.delphi.astm.NamedTypeReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.xtext.example.delphi.astm.NamedTypeReference#getType()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EReference getNamedTypeReference_Type();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DeleteStatement <em>Delete Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Statement</em>'.
	 * @see org.xtext.example.delphi.astm.DeleteStatement
	 * @generated
	 */
	EClass getDeleteStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DeleteStatement#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.xtext.example.delphi.astm.DeleteStatement#getOperand()
	 * @see #getDeleteStatement()
	 * @generated
	 */
	EReference getDeleteStatement_Operand();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement <em>Declaration Or Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration Or Definition Statement</em>'.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement
	 * @generated
	 */
	EClass getDeclarationOrDefinitionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement#getDeclOrDefn <em>Decl Or Defn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decl Or Defn</em>'.
	 * @see org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement#getDeclOrDefn()
	 * @see #getDeclarationOrDefinitionStatement()
	 * @generated
	 */
	EReference getDeclarationOrDefinitionStatement_DeclOrDefn();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see org.xtext.example.delphi.astm.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.xtext.example.delphi.astm.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.JumpStatement <em>Jump Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Statement</em>'.
	 * @see org.xtext.example.delphi.astm.JumpStatement
	 * @generated
	 */
	EClass getJumpStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.JumpStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.xtext.example.delphi.astm.JumpStatement#getTarget()
	 * @see #getJumpStatement()
	 * @generated
	 */
	EReference getJumpStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see org.xtext.example.delphi.astm.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.BreakStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.xtext.example.delphi.astm.BreakStatement#getTarget()
	 * @see #getBreakStatement()
	 * @generated
	 */
	EReference getBreakStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see org.xtext.example.delphi.astm.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ContinueStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.xtext.example.delphi.astm.ContinueStatement#getTarget()
	 * @see #getContinueStatement()
	 * @generated
	 */
	EReference getContinueStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.LabeledStatement <em>Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Statement</em>'.
	 * @see org.xtext.example.delphi.astm.LabeledStatement
	 * @generated
	 */
	EClass getLabeledStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LabeledStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.xtext.example.delphi.astm.LabeledStatement#getLabel()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LabeledStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.xtext.example.delphi.astm.LabeledStatement#getStatement()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_Statement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Statement</em>'.
	 * @see org.xtext.example.delphi.astm.BlockStatement
	 * @generated
	 */
	EClass getBlockStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.BlockStatement#getSubStatements <em>Sub Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Statements</em>'.
	 * @see org.xtext.example.delphi.astm.BlockStatement#getSubStatements()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_SubStatements();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.BlockStatement#getOpensScope <em>Opens Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opens Scope</em>'.
	 * @see org.xtext.example.delphi.astm.BlockStatement#getOpensScope()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_OpensScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Statement</em>'.
	 * @see org.xtext.example.delphi.astm.EmptyStatement
	 * @generated
	 */
	EClass getEmptyStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see org.xtext.example.delphi.astm.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.xtext.example.delphi.astm.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.IfStatement#getThenBody <em>Then Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Body</em>'.
	 * @see org.xtext.example.delphi.astm.IfStatement#getThenBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.IfStatement#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Body</em>'.
	 * @see org.xtext.example.delphi.astm.IfStatement#getElseBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseBody();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see org.xtext.example.delphi.astm.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.SwitchStatement#getSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Expression</em>'.
	 * @see org.xtext.example.delphi.astm.SwitchStatement#getSwitchExpression()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_SwitchExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.SwitchStatement#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cases</em>'.
	 * @see org.xtext.example.delphi.astm.SwitchStatement#getCases()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Cases();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see org.xtext.example.delphi.astm.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.SwitchCase#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.SwitchCase#getBody()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Body();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.CaseBlock <em>Case Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Block</em>'.
	 * @see org.xtext.example.delphi.astm.CaseBlock
	 * @generated
	 */
	EClass getCaseBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.CaseBlock#getCaseExpressions <em>Case Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Expressions</em>'.
	 * @see org.xtext.example.delphi.astm.CaseBlock#getCaseExpressions()
	 * @see #getCaseBlock()
	 * @generated
	 */
	EReference getCaseBlock_CaseExpressions();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see org.xtext.example.delphi.astm.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ReturnStatement#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see org.xtext.example.delphi.astm.ReturnStatement#getReturnValue()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_ReturnValue();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Statement</em>'.
	 * @see org.xtext.example.delphi.astm.LoopStatement
	 * @generated
	 */
	EClass getLoopStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LoopStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.xtext.example.delphi.astm.LoopStatement#getCondition()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LoopStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.LoopStatement#getBody()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see org.xtext.example.delphi.astm.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ForStatement#getInitBody <em>Init Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Body</em>'.
	 * @see org.xtext.example.delphi.astm.ForStatement#getInitBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_InitBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.ForStatement#getIterationBody <em>Iteration Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iteration Body</em>'.
	 * @see org.xtext.example.delphi.astm.ForStatement#getIterationBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_IterationBody();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.TryStatement <em>Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Statement</em>'.
	 * @see org.xtext.example.delphi.astm.TryStatement
	 * @generated
	 */
	EClass getTryStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.TryStatement#getGuardedStatement <em>Guarded Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guarded Statement</em>'.
	 * @see org.xtext.example.delphi.astm.TryStatement#getGuardedStatement()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_GuardedStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.TryStatement#getCatchBlocks <em>Catch Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Blocks</em>'.
	 * @see org.xtext.example.delphi.astm.TryStatement#getCatchBlocks()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_CatchBlocks();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.TryStatement#getFinalStatement <em>Final Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Statement</em>'.
	 * @see org.xtext.example.delphi.astm.TryStatement#getFinalStatement()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_FinalStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.CatchBlock <em>Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Block</em>'.
	 * @see org.xtext.example.delphi.astm.CatchBlock
	 * @generated
	 */
	EClass getCatchBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.CatchBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.CatchBlock#getBody()
	 * @see #getCatchBlock()
	 * @generated
	 */
	EReference getCatchBlock_Body();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.TypesCatchBlock <em>Types Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Catch Block</em>'.
	 * @see org.xtext.example.delphi.astm.TypesCatchBlock
	 * @generated
	 */
	EClass getTypesCatchBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.TypesCatchBlock#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see org.xtext.example.delphi.astm.TypesCatchBlock#getExceptions()
	 * @see #getTypesCatchBlock()
	 * @generated
	 */
	EReference getTypesCatchBlock_Exceptions();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.VariableCatchBlock <em>Variable Catch Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Catch Block</em>'.
	 * @see org.xtext.example.delphi.astm.VariableCatchBlock
	 * @generated
	 */
	EClass getVariableCatchBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.VariableCatchBlock#getExceptionVariable <em>Exception Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Variable</em>'.
	 * @see org.xtext.example.delphi.astm.VariableCatchBlock#getExceptionVariable()
	 * @see #getVariableCatchBlock()
	 * @generated
	 */
	EReference getVariableCatchBlock_ExceptionVariable();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see org.xtext.example.delphi.astm.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ThrowStatement#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see org.xtext.example.delphi.astm.ThrowStatement#getException()
	 * @see #getThrowStatement()
	 * @generated
	 */
	EReference getThrowStatement_Exception();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.xtext.example.delphi.astm.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.Expression#getExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Type</em>'.
	 * @see org.xtext.example.delphi.astm.Expression#getExpressionType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ExpressionType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NameReference <em>Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Reference</em>'.
	 * @see org.xtext.example.delphi.astm.NameReference
	 * @generated
	 */
	EClass getNameReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.NameReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtext.example.delphi.astm.NameReference#getName()
	 * @see #getNameReference()
	 * @generated
	 */
	EReference getNameReference_Name();

	/**
	 * Returns the meta object for the reference '{@link org.xtext.example.delphi.astm.NameReference#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see org.xtext.example.delphi.astm.NameReference#getRefersTo()
	 * @see #getNameReference()
	 * @generated
	 */
	EReference getNameReference_RefersTo();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Access</em>'.
	 * @see org.xtext.example.delphi.astm.ArrayAccess
	 * @generated
	 */
	EClass getArrayAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ArrayAccess#getArrayName <em>Array Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Name</em>'.
	 * @see org.xtext.example.delphi.astm.ArrayAccess#getArrayName()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_ArrayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.ArrayAccess#getSubscripts <em>Subscripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscripts</em>'.
	 * @see org.xtext.example.delphi.astm.ArrayAccess#getSubscripts()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Subscripts();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference <em>Qualified Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Identifier Reference</em>'.
	 * @see org.xtext.example.delphi.astm.QualifiedIdentifierReference
	 * @generated
	 */
	EClass getQualifiedIdentifierReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifiers</em>'.
	 * @see org.xtext.example.delphi.astm.QualifiedIdentifierReference#getQualifiers()
	 * @see #getQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getQualifiedIdentifierReference_Qualifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.QualifiedIdentifierReference#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see org.xtext.example.delphi.astm.QualifiedIdentifierReference#getMember()
	 * @see #getQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getQualifiedIdentifierReference_Member();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference <em>Type Qualified Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Qualified Identifier Reference</em>'.
	 * @see org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference
	 * @generated
	 */
	EClass getTypeQualifiedIdentifierReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference#getAggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregate Type</em>'.
	 * @see org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference#getAggregateType()
	 * @see #getTypeQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getTypeQualifiedIdentifierReference_AggregateType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference#getMember()
	 * @see #getTypeQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getTypeQualifiedIdentifierReference_Member();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.xtext.example.delphi.astm.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.delphi.astm.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xtext.example.delphi.astm.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see org.xtext.example.delphi.astm.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for the reference '{@link org.xtext.example.delphi.astm.CastExpression#getCastType <em>Cast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cast Type</em>'.
	 * @see org.xtext.example.delphi.astm.CastExpression#getCastType()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_CastType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.CastExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.xtext.example.delphi.astm.CastExpression#getExpression()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.xtext.example.delphi.astm.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.xtext.example.delphi.astm.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.xtext.example.delphi.astm.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.xtext.example.delphi.astm.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.xtext.example.delphi.astm.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.BinaryExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.xtext.example.delphi.astm.BinaryExpression#getLeftOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.BinaryExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.xtext.example.delphi.astm.BinaryExpression#getRightOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.OperatorAssign <em>Operator Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Assign</em>'.
	 * @see org.xtext.example.delphi.astm.OperatorAssign
	 * @generated
	 */
	EClass getOperatorAssign();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.OperatorAssign#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.xtext.example.delphi.astm.OperatorAssign#getOperator()
	 * @see #getOperatorAssign()
	 * @generated
	 */
	EReference getOperatorAssign_Operator();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see org.xtext.example.delphi.astm.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ConditionalExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.xtext.example.delphi.astm.ConditionalExpression#getCondition()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ConditionalExpression#getOnTrueOperand <em>On True Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On True Operand</em>'.
	 * @see org.xtext.example.delphi.astm.ConditionalExpression#getOnTrueOperand()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_OnTrueOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ConditionalExpression#getOnFalseOperand <em>On False Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On False Operand</em>'.
	 * @see org.xtext.example.delphi.astm.ConditionalExpression#getOnFalseOperand()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_OnFalseOperand();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Expression</em>'.
	 * @see org.xtext.example.delphi.astm.RangeExpression
	 * @generated
	 */
	EClass getRangeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.RangeExpression#getFromExpression <em>From Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Expression</em>'.
	 * @see org.xtext.example.delphi.astm.RangeExpression#getFromExpression()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_FromExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.RangeExpression#getToExpression <em>To Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Expression</em>'.
	 * @see org.xtext.example.delphi.astm.RangeExpression#getToExpression()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_ToExpression();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Expression</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionCallExpression
	 * @generated
	 */
	EClass getFunctionCallExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.FunctionCallExpression#getCalledFunction <em>Called Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called Function</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionCallExpression#getCalledFunction()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_CalledFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.FunctionCallExpression#getActualParams <em>Actual Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Params</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionCallExpression#getActualParams()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_ActualParams();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ActualParameterExpression <em>Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Parameter Expression</em>'.
	 * @see org.xtext.example.delphi.astm.ActualParameterExpression
	 * @generated
	 */
	EClass getActualParameterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.ActualParameterExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.xtext.example.delphi.astm.ActualParameterExpression#getValue()
	 * @see #getActualParameterExpression()
	 * @generated
	 */
	EReference getActualParameterExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NewExpression <em>New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Expression</em>'.
	 * @see org.xtext.example.delphi.astm.NewExpression
	 * @generated
	 */
	EClass getNewExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.NewExpression#getNewType <em>New Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type</em>'.
	 * @see org.xtext.example.delphi.astm.NewExpression#getNewType()
	 * @see #getNewExpression()
	 * @generated
	 */
	EReference getNewExpression_NewType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.NewExpression#getActualParams <em>Actual Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Params</em>'.
	 * @see org.xtext.example.delphi.astm.NewExpression#getActualParams()
	 * @see #getNewExpression()
	 * @generated
	 */
	EReference getNewExpression_ActualParams();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Access</em>'.
	 * @see org.xtext.example.delphi.astm.LabelAccess
	 * @generated
	 */
	EClass getLabelAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LabelAccess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtext.example.delphi.astm.LabelAccess#getName()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EReference getLabelAccess_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.LabelAccess#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.xtext.example.delphi.astm.LabelAccess#getDefinition()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EReference getLabelAccess_Definition();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AnnotationExpression <em>Annotation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Expression</em>'.
	 * @see org.xtext.example.delphi.astm.AnnotationExpression
	 * @generated
	 */
	EClass getAnnotationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.delphi.astm.AnnotationExpression#getAnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Type</em>'.
	 * @see org.xtext.example.delphi.astm.AnnotationExpression#getAnnotationType()
	 * @see #getAnnotationExpression()
	 * @generated
	 */
	EReference getAnnotationExpression_AnnotationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.AnnotationExpression#getMemberValues <em>Member Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Values</em>'.
	 * @see org.xtext.example.delphi.astm.AnnotationExpression#getMemberValues()
	 * @see #getAnnotationExpression()
	 * @generated
	 */
	EReference getAnnotationExpression_MemberValues();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.GlobalScope <em>Global Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Scope</em>'.
	 * @see org.xtext.example.delphi.astm.GlobalScope
	 * @generated
	 */
	EClass getGlobalScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.PreprocessorElement <em>Preprocessor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessor Element</em>'.
	 * @see org.xtext.example.delphi.astm.PreprocessorElement
	 * @generated
	 */
	EClass getPreprocessorElement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DefinitionObject <em>Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Object</em>'.
	 * @see org.xtext.example.delphi.astm.DefinitionObject
	 * @generated
	 */
	EClass getDefinitionObject();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ProgramScope <em>Program Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Scope</em>'.
	 * @see org.xtext.example.delphi.astm.ProgramScope
	 * @generated
	 */
	EClass getProgramScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.xtext.example.delphi.astm.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.xtext.example.delphi.astm.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionScope <em>Function Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Scope</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionScope
	 * @generated
	 */
	EClass getFunctionScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NameSpaceType <em>Name Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Space Type</em>'.
	 * @see org.xtext.example.delphi.astm.NameSpaceType
	 * @generated
	 */
	EClass getNameSpaceType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see org.xtext.example.delphi.astm.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AggregateScope <em>Aggregate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Scope</em>'.
	 * @see org.xtext.example.delphi.astm.AggregateScope
	 * @generated
	 */
	EClass getAggregateScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BlockScope <em>Block Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Scope</em>'.
	 * @see org.xtext.example.delphi.astm.BlockScope
	 * @generated
	 */
	EClass getBlockScope();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.IdentifierReference <em>Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Reference</em>'.
	 * @see org.xtext.example.delphi.astm.IdentifierReference
	 * @generated
	 */
	EClass getIdentifierReference();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FormalParameterDefinition <em>Formal Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter Definition</em>'.
	 * @see org.xtext.example.delphi.astm.FormalParameterDefinition
	 * @generated
	 */
	EClass getFormalParameterDefinition();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.VirtualSpecification <em>Virtual Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Specification</em>'.
	 * @see org.xtext.example.delphi.astm.VirtualSpecification
	 * @generated
	 */
	EClass getVirtualSpecification();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FormalParameterDeclaration <em>Formal Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter Declaration</em>'.
	 * @see org.xtext.example.delphi.astm.FormalParameterDeclaration
	 * @generated
	 */
	EClass getFormalParameterDeclaration();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.VariableDefinition <em>Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Definition</em>'.
	 * @see org.xtext.example.delphi.astm.VariableDefinition
	 * @generated
	 */
	EClass getVariableDefinition();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionMemberAttribute <em>Function Member Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Member Attribute</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionMemberAttribute
	 * @generated
	 */
	EClass getFunctionMemberAttribute();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External</em>'.
	 * @see org.xtext.example.delphi.astm.External
	 * @generated
	 */
	EClass getExternal();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FunctionPersistent <em>Function Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Persistent</em>'.
	 * @see org.xtext.example.delphi.astm.FunctionPersistent
	 * @generated
	 */
	EClass getFunctionPersistent();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.FileLocal <em>File Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Local</em>'.
	 * @see org.xtext.example.delphi.astm.FileLocal
	 * @generated
	 */
	EClass getFileLocal();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.PerClassMember <em>Per Class Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Class Member</em>'.
	 * @see org.xtext.example.delphi.astm.PerClassMember
	 * @generated
	 */
	EClass getPerClassMember();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NoDef <em>No Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Def</em>'.
	 * @see org.xtext.example.delphi.astm.NoDef
	 * @generated
	 */
	EClass getNoDef();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Virtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual</em>'.
	 * @see org.xtext.example.delphi.astm.Virtual
	 * @generated
	 */
	EClass getVirtual();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.PureVirtual <em>Pure Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pure Virtual</em>'.
	 * @see org.xtext.example.delphi.astm.PureVirtual
	 * @generated
	 */
	EClass getPureVirtual();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NonVirtual <em>Non Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Virtual</em>'.
	 * @see org.xtext.example.delphi.astm.NonVirtual
	 * @generated
	 */
	EClass getNonVirtual();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see org.xtext.example.delphi.astm.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see org.xtext.example.delphi.astm.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte</em>'.
	 * @see org.xtext.example.delphi.astm.Byte
	 * @generated
	 */
	EClass getByte();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ShortInteger <em>Short Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Integer</em>'.
	 * @see org.xtext.example.delphi.astm.ShortInteger
	 * @generated
	 */
	EClass getShortInteger();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.xtext.example.delphi.astm.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.LongInteger <em>Long Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Integer</em>'.
	 * @see org.xtext.example.delphi.astm.LongInteger
	 * @generated
	 */
	EClass getLongInteger();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see org.xtext.example.delphi.astm.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see org.xtext.example.delphi.astm.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Double</em>'.
	 * @see org.xtext.example.delphi.astm.LongDouble
	 * @generated
	 */
	EClass getLongDouble();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see org.xtext.example.delphi.astm.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.xtext.example.delphi.astm.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.xtext.example.delphi.astm.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.WideCharacter <em>Wide Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wide Character</em>'.
	 * @see org.xtext.example.delphi.astm.WideCharacter
	 * @generated
	 */
	EClass getWideCharacter();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see org.xtext.example.delphi.astm.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Type</em>'.
	 * @see org.xtext.example.delphi.astm.PointerType
	 * @generated
	 */
	EClass getPointerType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.xtext.example.delphi.astm.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see org.xtext.example.delphi.astm.RangeType
	 * @generated
	 */
	EClass getRangeType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.StructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Type</em>'.
	 * @see org.xtext.example.delphi.astm.StructureType
	 * @generated
	 */
	EClass getStructureType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see org.xtext.example.delphi.astm.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see org.xtext.example.delphi.astm.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ByValueFormalParameterType <em>By Value Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Value Formal Parameter Type</em>'.
	 * @see org.xtext.example.delphi.astm.ByValueFormalParameterType
	 * @generated
	 */
	EClass getByValueFormalParameterType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ByReferenceFormalParameterType <em>By Reference Formal Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Reference Formal Parameter Type</em>'.
	 * @see org.xtext.example.delphi.astm.ByReferenceFormalParameterType
	 * @generated
	 */
	EClass getByReferenceFormalParameterType();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public</em>'.
	 * @see org.xtext.example.delphi.astm.Public
	 * @generated
	 */
	EClass getPublic();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Protected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protected</em>'.
	 * @see org.xtext.example.delphi.astm.Protected
	 * @generated
	 */
	EClass getProtected();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Private <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private</em>'.
	 * @see org.xtext.example.delphi.astm.Private
	 * @generated
	 */
	EClass getPrivate();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.TerminateStatement <em>Terminate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate Statement</em>'.
	 * @see org.xtext.example.delphi.astm.TerminateStatement
	 * @generated
	 */
	EClass getTerminateStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DefaultBlock <em>Default Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Block</em>'.
	 * @see org.xtext.example.delphi.astm.DefaultBlock
	 * @generated
	 */
	EClass getDefaultBlock();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see org.xtext.example.delphi.astm.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.DoWhileStatement <em>Do While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do While Statement</em>'.
	 * @see org.xtext.example.delphi.astm.DoWhileStatement
	 * @generated
	 */
	EClass getDoWhileStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ForCheckBeforeStatement <em>For Check Before Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Check Before Statement</em>'.
	 * @see org.xtext.example.delphi.astm.ForCheckBeforeStatement
	 * @generated
	 */
	EClass getForCheckBeforeStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ForCheckAfterStatement <em>For Check After Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Check After Statement</em>'.
	 * @see org.xtext.example.delphi.astm.ForCheckAfterStatement
	 * @generated
	 */
	EClass getForCheckAfterStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Expression</em>'.
	 * @see org.xtext.example.delphi.astm.AggregateExpression
	 * @generated
	 */
	EClass getAggregateExpression();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.QualifiedOverPointer <em>Qualified Over Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Over Pointer</em>'.
	 * @see org.xtext.example.delphi.astm.QualifiedOverPointer
	 * @generated
	 */
	EClass getQualifiedOverPointer();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.QualifiedOverData <em>Qualified Over Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Over Data</em>'.
	 * @see org.xtext.example.delphi.astm.QualifiedOverData
	 * @generated
	 */
	EClass getQualifiedOverData();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.xtext.example.delphi.astm.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.xtext.example.delphi.astm.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.CharLiteral <em>Char Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Literal</em>'.
	 * @see org.xtext.example.delphi.astm.CharLiteral
	 * @generated
	 */
	EClass getCharLiteral();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see org.xtext.example.delphi.astm.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.xtext.example.delphi.astm.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitLiteral <em>Bit Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Literal</em>'.
	 * @see org.xtext.example.delphi.astm.BitLiteral
	 * @generated
	 */
	EClass getBitLiteral();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.UnaryPlus <em>Unary Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Plus</em>'.
	 * @see org.xtext.example.delphi.astm.UnaryPlus
	 * @generated
	 */
	EClass getUnaryPlus();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate</em>'.
	 * @see org.xtext.example.delphi.astm.Negate
	 * @generated
	 */
	EClass getNegate();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see org.xtext.example.delphi.astm.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitNot <em>Bit Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Not</em>'.
	 * @see org.xtext.example.delphi.astm.BitNot
	 * @generated
	 */
	EClass getBitNot();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.AddressOf <em>Address Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Of</em>'.
	 * @see org.xtext.example.delphi.astm.AddressOf
	 * @generated
	 */
	EClass getAddressOf();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Deref <em>Deref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deref</em>'.
	 * @see org.xtext.example.delphi.astm.Deref
	 * @generated
	 */
	EClass getDeref();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment</em>'.
	 * @see org.xtext.example.delphi.astm.Increment
	 * @generated
	 */
	EClass getIncrement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Decrement <em>Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decrement</em>'.
	 * @see org.xtext.example.delphi.astm.Decrement
	 * @generated
	 */
	EClass getDecrement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.PostIncrement <em>Post Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Increment</em>'.
	 * @see org.xtext.example.delphi.astm.PostIncrement
	 * @generated
	 */
	EClass getPostIncrement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.PostDecrement <em>Post Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Decrement</em>'.
	 * @see org.xtext.example.delphi.astm.PostDecrement
	 * @generated
	 */
	EClass getPostDecrement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see org.xtext.example.delphi.astm.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtract</em>'.
	 * @see org.xtext.example.delphi.astm.Subtract
	 * @generated
	 */
	EClass getSubtract();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see org.xtext.example.delphi.astm.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see org.xtext.example.delphi.astm.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Modulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulus</em>'.
	 * @see org.xtext.example.delphi.astm.Modulus
	 * @generated
	 */
	EClass getModulus();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Exponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponent</em>'.
	 * @see org.xtext.example.delphi.astm.Exponent
	 * @generated
	 */
	EClass getExponent();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.xtext.example.delphi.astm.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see org.xtext.example.delphi.astm.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see org.xtext.example.delphi.astm.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equal</em>'.
	 * @see org.xtext.example.delphi.astm.NotEqual
	 * @generated
	 */
	EClass getNotEqual();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see org.xtext.example.delphi.astm.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NotGreater <em>Not Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Greater</em>'.
	 * @see org.xtext.example.delphi.astm.NotGreater
	 * @generated
	 */
	EClass getNotGreater();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see org.xtext.example.delphi.astm.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.NotLess <em>Not Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Less</em>'.
	 * @see org.xtext.example.delphi.astm.NotLess
	 * @generated
	 */
	EClass getNotLess();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitAnd <em>Bit And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit And</em>'.
	 * @see org.xtext.example.delphi.astm.BitAnd
	 * @generated
	 */
	EClass getBitAnd();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitOr <em>Bit Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Or</em>'.
	 * @see org.xtext.example.delphi.astm.BitOr
	 * @generated
	 */
	EClass getBitOr();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitXor <em>Bit Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Xor</em>'.
	 * @see org.xtext.example.delphi.astm.BitXor
	 * @generated
	 */
	EClass getBitXor();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitLeftShift <em>Bit Left Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Left Shift</em>'.
	 * @see org.xtext.example.delphi.astm.BitLeftShift
	 * @generated
	 */
	EClass getBitLeftShift();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.BitRightShift <em>Bit Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Right Shift</em>'.
	 * @see org.xtext.example.delphi.astm.BitRightShift
	 * @generated
	 */
	EClass getBitRightShift();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see org.xtext.example.delphi.astm.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.MissingActualParameter <em>Missing Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missing Actual Parameter</em>'.
	 * @see org.xtext.example.delphi.astm.MissingActualParameter
	 * @generated
	 */
	EClass getMissingActualParameter();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ByValueActualParameterExpression <em>By Value Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Value Actual Parameter Expression</em>'.
	 * @see org.xtext.example.delphi.astm.ByValueActualParameterExpression
	 * @generated
	 */
	EClass getByValueActualParameterExpression();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.ByReferenceActualParameterExpression <em>By Reference Actual Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Reference Actual Parameter Expression</em>'.
	 * @see org.xtext.example.delphi.astm.ByReferenceActualParameterExpression
	 * @generated
	 */
	EClass getByReferenceActualParameterExpression();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SpecificTriggerDefinition <em>Specific Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trigger Definition</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificTriggerDefinition
	 * @generated
	 */
	EClass getSpecificTriggerDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.delphi.astm.SpecificTriggerDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificTriggerDefinition#getBody()
	 * @see #getSpecificTriggerDefinition()
	 * @generated
	 */
	EReference getSpecificTriggerDefinition_Body();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SpecificLessEqual <em>Specific Less Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Less Equal</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificLessEqual
	 * @generated
	 */
	EClass getSpecificLessEqual();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SpecificGreaterEqual <em>Specific Greater Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Greater Equal</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificGreaterEqual
	 * @generated
	 */
	EClass getSpecificGreaterEqual();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SpecificIn <em>Specific In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific In</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificIn
	 * @generated
	 */
	EClass getSpecificIn();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SpecificLike <em>Specific Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Like</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificLike
	 * @generated
	 */
	EClass getSpecificLike();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SpecificConcatString <em>Specific Concat String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Concat String</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificConcatString
	 * @generated
	 */
	EClass getSpecificConcatString();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.SpecificSelectStatement <em>Specific Select Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Select Statement</em>'.
	 * @see org.xtext.example.delphi.astm.SpecificSelectStatement
	 * @generated
	 */
	EClass getSpecificSelectStatement();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.delphi.astm.util.Visitable <em>Visitable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitable</em>'.
	 * @see org.xtext.example.delphi.astm.util.Visitable
	 * @model instanceClass="org.xtext.example.delphi.astm.util.Visitable"
	 * @generated
	 */
	EClass getVisitable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstmFactory getAstmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DelphiUnitImpl <em>Delphi Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DelphiUnitImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiUnit()
		 * @generated
		 */
		EClass DELPHI_UNIT = eINSTANCE.getDelphiUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_UNIT__NAME = eINSTANCE.getDelphiUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_UNIT__INTERFACE = eINSTANCE.getDelphiUnit_Interface();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_UNIT__IMPLEMENTATION = eINSTANCE.getDelphiUnit_Implementation();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DelphiInterfaceSectionImpl <em>Delphi Interface Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DelphiInterfaceSectionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiInterfaceSection()
		 * @generated
		 */
		EClass DELPHI_INTERFACE_SECTION = eINSTANCE.getDelphiInterfaceSection();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_INTERFACE_SECTION__USES = eINSTANCE.getDelphiInterfaceSection_Uses();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DelphiImplementationSectionImpl <em>Delphi Implementation Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DelphiImplementationSectionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiImplementationSection()
		 * @generated
		 */
		EClass DELPHI_IMPLEMENTATION_SECTION = eINSTANCE.getDelphiImplementationSection();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_IMPLEMENTATION_SECTION__USES = eINSTANCE.getDelphiImplementationSection_Uses();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_IMPLEMENTATION_SECTION__EXPORTS = eINSTANCE.getDelphiImplementationSection_Exports();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DelphiBlockStatementImpl <em>Delphi Block Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DelphiBlockStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiBlockStatement()
		 * @generated
		 */
		EClass DELPHI_BLOCK_STATEMENT = eINSTANCE.getDelphiBlockStatement();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_BLOCK_STATEMENT__EXPORTS = eINSTANCE.getDelphiBlockStatement_Exports();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_BLOCK_STATEMENT__DECLARATIONS = eINSTANCE.getDelphiBlockStatement_Declarations();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DelphiFunctionCallExpressionImpl <em>Delphi Function Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DelphiFunctionCallExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiFunctionCallExpression()
		 * @generated
		 */
		EClass DELPHI_FUNCTION_CALL_EXPRESSION = eINSTANCE.getDelphiFunctionCallExpression();

		/**
		 * The meta object literal for the '<em><b>Apply To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_FUNCTION_CALL_EXPRESSION__APPLY_TO = eINSTANCE.getDelphiFunctionCallExpression_ApplyTo();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DelphiWithStatementImpl <em>Delphi With Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DelphiWithStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDelphiWithStatement()
		 * @generated
		 */
		EClass DELPHI_WITH_STATEMENT = eINSTANCE.getDelphiWithStatement();

		/**
		 * The meta object literal for the '<em><b>Withs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELPHI_WITH_STATEMENT__WITHS = eINSTANCE.getDelphiWithStatement_Withs();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.GASTMObjectImpl <em>GASTM Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.GASTMObjectImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMObject()
		 * @generated
		 */
		EClass GASTM_OBJECT = eINSTANCE.getGASTMObject();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.GASTMSourceObjectImpl <em>GASTM Source Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.GASTMSourceObjectImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMSourceObject()
		 * @generated
		 */
		EClass GASTM_SOURCE_OBJECT = eINSTANCE.getGASTMSourceObject();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.GASTMSemanticObjectImpl <em>GASTM Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.GASTMSemanticObjectImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMSemanticObject()
		 * @generated
		 */
		EClass GASTM_SEMANTIC_OBJECT = eINSTANCE.getGASTMSemanticObject();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.OtherSyntaxObjectImpl <em>Other Syntax Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.OtherSyntaxObjectImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getOtherSyntaxObject()
		 * @generated
		 */
		EClass OTHER_SYNTAX_OBJECT = eINSTANCE.getOtherSyntaxObject();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.StorageSpecificationImpl <em>Storage Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.StorageSpecificationImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStorageSpecification()
		 * @generated
		 */
		EClass STORAGE_SPECIFICATION = eINSTANCE.getStorageSpecification();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DataTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AccessKindImpl <em>Access Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AccessKindImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAccessKind()
		 * @generated
		 */
		EClass ACCESS_KIND = eINSTANCE.getAccessKind();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.UnaryOperatorImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BinaryOperatorImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ActualParameterImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getActualParameter()
		 * @generated
		 */
		EClass ACTUAL_PARAMETER = eINSTANCE.getActualParameter();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SourceFileImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>Path Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE__PATH_NAME = eINSTANCE.getSourceFile_PathName();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SourceLocationImpl <em>Source Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SourceLocationImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSourceLocation()
		 * @generated
		 */
		EClass SOURCE_LOCATION = eINSTANCE.getSourceLocation();

		/**
		 * The meta object literal for the '<em><b>Start Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_LOCATION__START_LINE = eINSTANCE.getSourceLocation_StartLine();

		/**
		 * The meta object literal for the '<em><b>Start Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_LOCATION__START_COLUMN = eINSTANCE.getSourceLocation_StartColumn();

		/**
		 * The meta object literal for the '<em><b>End Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_LOCATION__END_LINE = eINSTANCE.getSourceLocation_EndLine();

		/**
		 * The meta object literal for the '<em><b>End Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_LOCATION__END_COLUMN = eINSTANCE.getSourceLocation_EndColumn();

		/**
		 * The meta object literal for the '<em><b>In Source File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_LOCATION__IN_SOURCE_FILE = eINSTANCE.getSourceLocation_InSourceFile();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ProjectImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FILES = eINSTANCE.getProject_Files();

		/**
		 * The meta object literal for the '<em><b>Outer Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__OUTER_SCOPE = eINSTANCE.getProject_OuterScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ScopeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Definition Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__DEFINITION_OBJECT = eINSTANCE.getScope_DefinitionObject();

		/**
		 * The meta object literal for the '<em><b>Child Scope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CHILD_SCOPE = eINSTANCE.getScope_ChildScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.GASTMSyntaxObjectImpl <em>GASTM Syntax Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.GASTMSyntaxObjectImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGASTMSyntaxObject()
		 * @generated
		 */
		EClass GASTM_SYNTAX_OBJECT = eINSTANCE.getGASTMSyntaxObject();

		/**
		 * The meta object literal for the '<em><b>Location Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GASTM_SYNTAX_OBJECT__LOCATION_INFO = eINSTANCE.getGASTMSyntaxObject_LocationInfo();

		/**
		 * The meta object literal for the '<em><b>Pre Processor Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS = eINSTANCE.getGASTMSyntaxObject_PreProcessorElements();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GASTM_SYNTAX_OBJECT__ANNOTATIONS = eINSTANCE.getGASTMSyntaxObject_Annotations();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CompilationUnitImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__LANGUAGE = eINSTANCE.getCompilationUnit_Language();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__FRAGMENTS = eINSTANCE.getCompilationUnit_Fragments();

		/**
		 * The meta object literal for the '<em><b>Opens Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__OPENS_SCOPE = eINSTANCE.getCompilationUnit_OpensScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NameImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Name String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__NAME_STRING = eINSTANCE.getName_NameString();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionImpl <em>Declaration Or Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeclarationOrDefinition()
		 * @generated
		 */
		EClass DECLARATION_OR_DEFINITION = eINSTANCE.getDeclarationOrDefinition();

		/**
		 * The meta object literal for the '<em><b>Is Register</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION_OR_DEFINITION__IS_REGISTER = eINSTANCE.getDeclarationOrDefinition_IsRegister();

		/**
		 * The meta object literal for the '<em><b>Linkage Specifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER = eINSTANCE.getDeclarationOrDefinition_LinkageSpecifier();

		/**
		 * The meta object literal for the '<em><b>Storage Specifiers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS = eINSTANCE.getDeclarationOrDefinition_StorageSpecifiers();

		/**
		 * The meta object literal for the '<em><b>Access Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION_OR_DEFINITION__ACCESS_KIND = eINSTANCE.getDeclarationOrDefinition_AccessKind();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Identifier Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__IDENTIFIER_NAME = eINSTANCE.getDefinition_IdentifierName();

		/**
		 * The meta object literal for the '<em><b>Definition Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__DEFINITION_TYPE = eINSTANCE.getDefinition_DefinitionType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DeclarationImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Def Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__DEF_REF = eINSTANCE.getDeclaration_DefRef();

		/**
		 * The meta object literal for the '<em><b>Identifier Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__IDENTIFIER_NAME = eINSTANCE.getDeclaration_IdentifierName();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__DECLARATION_TYPE = eINSTANCE.getDeclaration_DeclarationType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionDeclarationImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionDeclaration()
		 * @generated
		 */
		EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECLARATION__FORMAL_PARAMETERS = eINSTANCE.getFunctionDeclaration_FormalParameters();

		/**
		 * The meta object literal for the '<em><b>Function Member Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES = eINSTANCE.getFunctionDeclaration_FunctionMemberAttributes();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECLARATION__RETURN_TYPE = eINSTANCE.getFunctionDeclaration_ReturnType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.VariableDeclarationImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Is Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__IS_MUTABLE = eINSTANCE.getVariableDeclaration_IsMutable();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__RETURN_TYPE = eINSTANCE.getFunctionDefinition_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__FORMAL_PARAMETERS = eINSTANCE.getFunctionDefinition_FormalParameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__BODY = eINSTANCE.getFunctionDefinition_Body();

		/**
		 * The meta object literal for the '<em><b>Function Member Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES = eINSTANCE.getFunctionDefinition_FunctionMemberAttributes();

		/**
		 * The meta object literal for the '<em><b>Opens Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__OPENS_SCOPE = eINSTANCE.getFunctionDefinition_OpensScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionMemberAttributesImpl <em>Function Member Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionMemberAttributesImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionMemberAttributes()
		 * @generated
		 */
		EClass FUNCTION_MEMBER_ATTRIBUTES = eINSTANCE.getFunctionMemberAttributes();

		/**
		 * The meta object literal for the '<em><b>Is Friend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND = eINSTANCE.getFunctionMemberAttributes_IsFriend();

		/**
		 * The meta object literal for the '<em><b>Is Inline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MEMBER_ATTRIBUTES__IS_INLINE = eINSTANCE.getFunctionMemberAttributes_IsInline();

		/**
		 * The meta object literal for the '<em><b>Is This Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST = eINSTANCE.getFunctionMemberAttributes_IsThisConst();

		/**
		 * The meta object literal for the '<em><b>Virtual Specifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER = eINSTANCE.getFunctionMemberAttributes_VirtualSpecifier();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.EntryDefinitionImpl <em>Entry Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.EntryDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEntryDefinition()
		 * @generated
		 */
		EClass ENTRY_DEFINITION = eINSTANCE.getEntryDefinition();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_DEFINITION__FORMAL_PARAMETERS = eINSTANCE.getEntryDefinition_FormalParameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_DEFINITION__BODY = eINSTANCE.getEntryDefinition_Body();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DataDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDataDefinition()
		 * @generated
		 */
		EClass DATA_DEFINITION = eINSTANCE.getDataDefinition();

		/**
		 * The meta object literal for the '<em><b>Is Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DEFINITION__IS_MUTABLE = eINSTANCE.getDataDefinition_IsMutable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DEFINITION__INITIAL_VALUE = eINSTANCE.getDataDefinition_InitialValue();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitFieldDefinitionImpl <em>Bit Field Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitFieldDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitFieldDefinition()
		 * @generated
		 */
		EClass BIT_FIELD_DEFINITION = eINSTANCE.getBitFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Bit Field Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_FIELD_DEFINITION__BIT_FIELD_SIZE = eINSTANCE.getBitFieldDefinition_BitFieldSize();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.EnumLiteralDefinitionImpl <em>Enum Literal Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.EnumLiteralDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEnumLiteralDefinition()
		 * @generated
		 */
		EClass ENUM_LITERAL_DEFINITION = eINSTANCE.getEnumLiteralDefinition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_DEFINITION__VALUE = eINSTANCE.getEnumLiteralDefinition_Value();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.TypeDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__NAME = eINSTANCE.getTypeDefinition_Name();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NamedTypeDefinitionImpl <em>Named Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NamedTypeDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNamedTypeDefinition()
		 * @generated
		 */
		EClass NAMED_TYPE_DEFINITION = eINSTANCE.getNamedTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE_DEFINITION__DEFINITION_TYPE = eINSTANCE.getNamedTypeDefinition_DefinitionType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AggregateTypeDefinitionImpl <em>Aggregate Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AggregateTypeDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateTypeDefinition()
		 * @generated
		 */
		EClass AGGREGATE_TYPE_DEFINITION = eINSTANCE.getAggregateTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Aggregate Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE = eINSTANCE.getAggregateTypeDefinition_AggregateType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NameSpaceDefinitionImpl <em>Name Space Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NameSpaceDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNameSpaceDefinition()
		 * @generated
		 */
		EClass NAME_SPACE_DEFINITION = eINSTANCE.getNameSpaceDefinition();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_SPACE_DEFINITION__NAME_SPACE = eINSTANCE.getNameSpaceDefinition_NameSpace();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_SPACE_DEFINITION__BODY = eINSTANCE.getNameSpaceDefinition_Body();

		/**
		 * The meta object literal for the '<em><b>Name Space Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_SPACE_DEFINITION__NAME_SPACE_TYPE = eINSTANCE.getNameSpaceDefinition_NameSpaceType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LabelDefinitionImpl <em>Label Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LabelDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabelDefinition()
		 * @generated
		 */
		EClass LABEL_DEFINITION = eINSTANCE.getLabelDefinition();

		/**
		 * The meta object literal for the '<em><b>Label Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_DEFINITION__LABEL_NAME = eINSTANCE.getLabelDefinition_LabelName();

		/**
		 * The meta object literal for the '<em><b>Label Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_DEFINITION__LABEL_TYPE = eINSTANCE.getLabelDefinition_LabelType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.IncludeUnitImpl <em>Include Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.IncludeUnitImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIncludeUnit()
		 * @generated
		 */
		EClass INCLUDE_UNIT = eINSTANCE.getIncludeUnit();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_UNIT__FILE = eINSTANCE.getIncludeUnit_File();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.MacroCallImpl <em>Macro Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.MacroCallImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMacroCall()
		 * @generated
		 */
		EClass MACRO_CALL = eINSTANCE.getMacroCall();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_CALL__REFERS_TO = eINSTANCE.getMacroCall_RefersTo();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.MacroDefinitionImpl <em>Macro Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.MacroDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMacroDefinition()
		 * @generated
		 */
		EClass MACRO_DEFINITION = eINSTANCE.getMacroDefinition();

		/**
		 * The meta object literal for the '<em><b>Macro Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_DEFINITION__MACRO_NAME = eINSTANCE.getMacroDefinition_MacroName();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_DEFINITION__BODY = eINSTANCE.getMacroDefinition_Body();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CommentImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.TypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__IS_CONST = eINSTANCE.getType_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__IS_VOLATILE = eINSTANCE.getType_IsVolatile();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PrimitiveTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Is Signed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__IS_SIGNED = eINSTANCE.getPrimitiveType_IsSigned();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.EnumTypeImpl <em>Enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.EnumTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEnumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '<em><b>Enum Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYPE__ENUM_LITERALS = eINSTANCE.getEnumType_EnumLiterals();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ConstructedTypeImpl <em>Constructed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ConstructedTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getConstructedType()
		 * @generated
		 */
		EClass CONSTRUCTED_TYPE = eINSTANCE.getConstructedType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTED_TYPE__BASE_TYPE = eINSTANCE.getConstructedType_BaseType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AggregateTypeImpl <em>Aggregate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AggregateTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateType()
		 * @generated
		 */
		EClass AGGREGATE_TYPE = eINSTANCE.getAggregateType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_TYPE__MEMBERS = eINSTANCE.getAggregateType_Members();

		/**
		 * The meta object literal for the '<em><b>Opens Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_TYPE__OPENS_SCOPE = eINSTANCE.getAggregateType_OpensScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ArrayTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Ranks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__RANKS = eINSTANCE.getArrayType_Ranks();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DimensionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Low Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__LOW_BOUND = eINSTANCE.getDimension_LowBound();

		/**
		 * The meta object literal for the '<em><b>High Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__HIGH_BOUND = eINSTANCE.getDimension_HighBound();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__RETURN_TYPE = eINSTANCE.getFunctionType_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__PARAMETER_TYPES = eINSTANCE.getFunctionType_ParameterTypes();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FormalParameterTypeImpl <em>Formal Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FormalParameterTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFormalParameterType()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_TYPE = eINSTANCE.getFormalParameterType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER_TYPE__TYPE = eINSTANCE.getFormalParameterType_Type();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NamedTypeImpl <em>Named Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NamedTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNamedType()
		 * @generated
		 */
		EClass NAMED_TYPE = eINSTANCE.getNamedType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__BODY = eINSTANCE.getNamedType_Body();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ClassTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '<em><b>Derives From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__DERIVES_FROM = eINSTANCE.getClassType_DerivesFrom();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DerivesFromImpl <em>Derives From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DerivesFromImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDerivesFrom()
		 * @generated
		 */
		EClass DERIVES_FROM = eINSTANCE.getDerivesFrom();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVES_FROM__IS_VIRTUAL = eINSTANCE.getDerivesFrom_IsVirtual();

		/**
		 * The meta object literal for the '<em><b>Access Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVES_FROM__ACCESS_KIND = eINSTANCE.getDerivesFrom_AccessKind();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVES_FROM__CLASS_NAME = eINSTANCE.getDerivesFrom_ClassName();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.UnnamedTypeReferenceImpl <em>Unnamed Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.UnnamedTypeReferenceImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnnamedTypeReference()
		 * @generated
		 */
		EClass UNNAMED_TYPE_REFERENCE = eINSTANCE.getUnnamedTypeReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNNAMED_TYPE_REFERENCE__TYPE = eINSTANCE.getUnnamedTypeReference_Type();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NamedTypeReferenceImpl <em>Named Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NamedTypeReferenceImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNamedTypeReference()
		 * @generated
		 */
		EClass NAMED_TYPE_REFERENCE = eINSTANCE.getNamedTypeReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE_REFERENCE__NAME = eINSTANCE.getNamedTypeReference_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE_REFERENCE__TYPE = eINSTANCE.getNamedTypeReference_Type();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DeleteStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeleteStatement()
		 * @generated
		 */
		EClass DELETE_STATEMENT = eINSTANCE.getDeleteStatement();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_STATEMENT__OPERAND = eINSTANCE.getDeleteStatement_Operand();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionStatementImpl <em>Declaration Or Definition Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DeclarationOrDefinitionStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeclarationOrDefinitionStatement()
		 * @generated
		 */
		EClass DECLARATION_OR_DEFINITION_STATEMENT = eINSTANCE.getDeclarationOrDefinitionStatement();

		/**
		 * The meta object literal for the '<em><b>Decl Or Defn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION_OR_DEFINITION_STATEMENT__DECL_OR_DEFN = eINSTANCE.getDeclarationOrDefinitionStatement_DeclOrDefn();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ExpressionStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.JumpStatementImpl <em>Jump Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.JumpStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getJumpStatement()
		 * @generated
		 */
		EClass JUMP_STATEMENT = eINSTANCE.getJumpStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_STATEMENT__TARGET = eINSTANCE.getJumpStatement_Target();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BreakStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT__TARGET = eINSTANCE.getBreakStatement_Target();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ContinueStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getContinueStatement()
		 * @generated
		 */
		EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINUE_STATEMENT__TARGET = eINSTANCE.getContinueStatement_Target();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LabeledStatementImpl <em>Labeled Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LabeledStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabeledStatement()
		 * @generated
		 */
		EClass LABELED_STATEMENT = eINSTANCE.getLabeledStatement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_STATEMENT__LABEL = eINSTANCE.getLabeledStatement_Label();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_STATEMENT__STATEMENT = eINSTANCE.getLabeledStatement_Statement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BlockStatementImpl <em>Block Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BlockStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBlockStatement()
		 * @generated
		 */
		EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

		/**
		 * The meta object literal for the '<em><b>Sub Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__SUB_STATEMENTS = eINSTANCE.getBlockStatement_SubStatements();

		/**
		 * The meta object literal for the '<em><b>Opens Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__OPENS_SCOPE = eINSTANCE.getBlockStatement_OpensScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.EmptyStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEmptyStatement()
		 * @generated
		 */
		EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.IfStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_BODY = eINSTANCE.getIfStatement_ThenBody();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_BODY = eINSTANCE.getIfStatement_ElseBody();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SwitchStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSwitchStatement()
		 * @generated
		 */
		EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

		/**
		 * The meta object literal for the '<em><b>Switch Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__SWITCH_EXPRESSION = eINSTANCE.getSwitchStatement_SwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__CASES = eINSTANCE.getSwitchStatement_Cases();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SwitchCaseImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSwitchCase()
		 * @generated
		 */
		EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__BODY = eINSTANCE.getSwitchCase_Body();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CaseBlockImpl <em>Case Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CaseBlockImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCaseBlock()
		 * @generated
		 */
		EClass CASE_BLOCK = eINSTANCE.getCaseBlock();

		/**
		 * The meta object literal for the '<em><b>Case Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_BLOCK__CASE_EXPRESSIONS = eINSTANCE.getCaseBlock_CaseExpressions();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ReturnStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__RETURN_VALUE = eINSTANCE.getReturnStatement_ReturnValue();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LoopStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLoopStatement()
		 * @generated
		 */
		EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__CONDITION = eINSTANCE.getLoopStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__BODY = eINSTANCE.getLoopStatement_Body();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ForStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Init Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__INIT_BODY = eINSTANCE.getForStatement_InitBody();

		/**
		 * The meta object literal for the '<em><b>Iteration Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__ITERATION_BODY = eINSTANCE.getForStatement_IterationBody();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.TryStatementImpl <em>Try Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.TryStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTryStatement()
		 * @generated
		 */
		EClass TRY_STATEMENT = eINSTANCE.getTryStatement();

		/**
		 * The meta object literal for the '<em><b>Guarded Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__GUARDED_STATEMENT = eINSTANCE.getTryStatement_GuardedStatement();

		/**
		 * The meta object literal for the '<em><b>Catch Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__CATCH_BLOCKS = eINSTANCE.getTryStatement_CatchBlocks();

		/**
		 * The meta object literal for the '<em><b>Final Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__FINAL_STATEMENT = eINSTANCE.getTryStatement_FinalStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CatchBlockImpl <em>Catch Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CatchBlockImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCatchBlock()
		 * @generated
		 */
		EClass CATCH_BLOCK = eINSTANCE.getCatchBlock();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_BLOCK__BODY = eINSTANCE.getCatchBlock_Body();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.TypesCatchBlockImpl <em>Types Catch Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.TypesCatchBlockImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypesCatchBlock()
		 * @generated
		 */
		EClass TYPES_CATCH_BLOCK = eINSTANCE.getTypesCatchBlock();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_CATCH_BLOCK__EXCEPTIONS = eINSTANCE.getTypesCatchBlock_Exceptions();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.VariableCatchBlockImpl <em>Variable Catch Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.VariableCatchBlockImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVariableCatchBlock()
		 * @generated
		 */
		EClass VARIABLE_CATCH_BLOCK = eINSTANCE.getVariableCatchBlock();

		/**
		 * The meta object literal for the '<em><b>Exception Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE = eINSTANCE.getVariableCatchBlock_ExceptionVariable();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ThrowStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getThrowStatement()
		 * @generated
		 */
		EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_STATEMENT__EXCEPTION = eINSTANCE.getThrowStatement_Exception();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXPRESSION_TYPE = eINSTANCE.getExpression_ExpressionType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NameReferenceImpl <em>Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NameReferenceImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNameReference()
		 * @generated
		 */
		EClass NAME_REFERENCE = eINSTANCE.getNameReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_REFERENCE__NAME = eINSTANCE.getNameReference_Name();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_REFERENCE__REFERS_TO = eINSTANCE.getNameReference_RefersTo();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ArrayAccessImpl <em>Array Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ArrayAccessImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getArrayAccess()
		 * @generated
		 */
		EClass ARRAY_ACCESS = eINSTANCE.getArrayAccess();

		/**
		 * The meta object literal for the '<em><b>Array Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACCESS__ARRAY_NAME = eINSTANCE.getArrayAccess_ArrayName();

		/**
		 * The meta object literal for the '<em><b>Subscripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACCESS__SUBSCRIPTS = eINSTANCE.getArrayAccess_Subscripts();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.QualifiedIdentifierReferenceImpl <em>Qualified Identifier Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.QualifiedIdentifierReferenceImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getQualifiedIdentifierReference()
		 * @generated
		 */
		EClass QUALIFIED_IDENTIFIER_REFERENCE = eINSTANCE.getQualifiedIdentifierReference();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_IDENTIFIER_REFERENCE__QUALIFIERS = eINSTANCE.getQualifiedIdentifierReference_Qualifiers();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_IDENTIFIER_REFERENCE__MEMBER = eINSTANCE.getQualifiedIdentifierReference_Member();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.TypeQualifiedIdentifierReferenceImpl <em>Type Qualified Identifier Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.TypeQualifiedIdentifierReferenceImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypeQualifiedIdentifierReference()
		 * @generated
		 */
		EClass TYPE_QUALIFIED_IDENTIFIER_REFERENCE = eINSTANCE.getTypeQualifiedIdentifierReference();

		/**
		 * The meta object literal for the '<em><b>Aggregate Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_QUALIFIED_IDENTIFIER_REFERENCE__AGGREGATE_TYPE = eINSTANCE.getTypeQualifiedIdentifierReference_AggregateType();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_QUALIFIED_IDENTIFIER_REFERENCE__MEMBER = eINSTANCE.getTypeQualifiedIdentifierReference_Member();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LiteralImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CastExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCastExpression()
		 * @generated
		 */
		EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

		/**
		 * The meta object literal for the '<em><b>Cast Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__CAST_TYPE = eINSTANCE.getCastExpression_CastType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__EXPRESSION = eINSTANCE.getCastExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.UnaryExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BinaryExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_OPERAND = eINSTANCE.getBinaryExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getBinaryExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.OperatorAssignImpl <em>Operator Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.OperatorAssignImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getOperatorAssign()
		 * @generated
		 */
		EClass OPERATOR_ASSIGN = eINSTANCE.getOperatorAssign();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_ASSIGN__OPERATOR = eINSTANCE.getOperatorAssign_Operator();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ConditionalExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__CONDITION = eINSTANCE.getConditionalExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>On True Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND = eINSTANCE.getConditionalExpression_OnTrueOperand();

		/**
		 * The meta object literal for the '<em><b>On False Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND = eINSTANCE.getConditionalExpression_OnFalseOperand();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.RangeExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getRangeExpression()
		 * @generated
		 */
		EClass RANGE_EXPRESSION = eINSTANCE.getRangeExpression();

		/**
		 * The meta object literal for the '<em><b>From Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__FROM_EXPRESSION = eINSTANCE.getRangeExpression_FromExpression();

		/**
		 * The meta object literal for the '<em><b>To Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__TO_EXPRESSION = eINSTANCE.getRangeExpression_ToExpression();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionCallExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionCallExpression()
		 * @generated
		 */
		EClass FUNCTION_CALL_EXPRESSION = eINSTANCE.getFunctionCallExpression();

		/**
		 * The meta object literal for the '<em><b>Called Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION = eINSTANCE.getFunctionCallExpression_CalledFunction();

		/**
		 * The meta object literal for the '<em><b>Actual Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS = eINSTANCE.getFunctionCallExpression_ActualParams();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ActualParameterExpressionImpl <em>Actual Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ActualParameterExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getActualParameterExpression()
		 * @generated
		 */
		EClass ACTUAL_PARAMETER_EXPRESSION = eINSTANCE.getActualParameterExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAMETER_EXPRESSION__VALUE = eINSTANCE.getActualParameterExpression_Value();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NewExpressionImpl <em>New Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NewExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNewExpression()
		 * @generated
		 */
		EClass NEW_EXPRESSION = eINSTANCE.getNewExpression();

		/**
		 * The meta object literal for the '<em><b>New Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_EXPRESSION__NEW_TYPE = eINSTANCE.getNewExpression_NewType();

		/**
		 * The meta object literal for the '<em><b>Actual Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_EXPRESSION__ACTUAL_PARAMS = eINSTANCE.getNewExpression_ActualParams();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LabelAccessImpl <em>Label Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LabelAccessImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabelAccess()
		 * @generated
		 */
		EClass LABEL_ACCESS = eINSTANCE.getLabelAccess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_ACCESS__NAME = eINSTANCE.getLabelAccess_Name();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_ACCESS__DEFINITION = eINSTANCE.getLabelAccess_Definition();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AnnotationExpressionImpl <em>Annotation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AnnotationExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAnnotationExpression()
		 * @generated
		 */
		EClass ANNOTATION_EXPRESSION = eINSTANCE.getAnnotationExpression();

		/**
		 * The meta object literal for the '<em><b>Annotation Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_EXPRESSION__ANNOTATION_TYPE = eINSTANCE.getAnnotationExpression_AnnotationType();

		/**
		 * The meta object literal for the '<em><b>Member Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_EXPRESSION__MEMBER_VALUES = eINSTANCE.getAnnotationExpression_MemberValues();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.GlobalScopeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGlobalScope()
		 * @generated
		 */
		EClass GLOBAL_SCOPE = eINSTANCE.getGlobalScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PreprocessorElementImpl <em>Preprocessor Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PreprocessorElementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPreprocessorElement()
		 * @generated
		 */
		EClass PREPROCESSOR_ELEMENT = eINSTANCE.getPreprocessorElement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DefinitionObjectImpl <em>Definition Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DefinitionObjectImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDefinitionObject()
		 * @generated
		 */
		EClass DEFINITION_OBJECT = eINSTANCE.getDefinitionObject();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ProgramScopeImpl <em>Program Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ProgramScopeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getProgramScope()
		 * @generated
		 */
		EClass PROGRAM_SCOPE = eINSTANCE.getProgramScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.TypeReferenceImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.StatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionScopeImpl <em>Function Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionScopeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionScope()
		 * @generated
		 */
		EClass FUNCTION_SCOPE = eINSTANCE.getFunctionScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NameSpaceTypeImpl <em>Name Space Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NameSpaceTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNameSpaceType()
		 * @generated
		 */
		EClass NAME_SPACE_TYPE = eINSTANCE.getNameSpaceType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LabelTypeImpl <em>Label Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LabelTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLabelType()
		 * @generated
		 */
		EClass LABEL_TYPE = eINSTANCE.getLabelType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AggregateScopeImpl <em>Aggregate Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AggregateScopeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateScope()
		 * @generated
		 */
		EClass AGGREGATE_SCOPE = eINSTANCE.getAggregateScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BlockScopeImpl <em>Block Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BlockScopeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBlockScope()
		 * @generated
		 */
		EClass BLOCK_SCOPE = eINSTANCE.getBlockScope();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.IdentifierReferenceImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIdentifierReference()
		 * @generated
		 */
		EClass IDENTIFIER_REFERENCE = eINSTANCE.getIdentifierReference();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FormalParameterDefinitionImpl <em>Formal Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FormalParameterDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFormalParameterDefinition()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_DEFINITION = eINSTANCE.getFormalParameterDefinition();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.VirtualSpecificationImpl <em>Virtual Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.VirtualSpecificationImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVirtualSpecification()
		 * @generated
		 */
		EClass VIRTUAL_SPECIFICATION = eINSTANCE.getVirtualSpecification();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FormalParameterDeclarationImpl <em>Formal Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FormalParameterDeclarationImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFormalParameterDeclaration()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_DECLARATION = eINSTANCE.getFormalParameterDeclaration();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.VariableDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVariableDefinition()
		 * @generated
		 */
		EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionMemberAttributeImpl <em>Function Member Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionMemberAttributeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionMemberAttribute()
		 * @generated
		 */
		EClass FUNCTION_MEMBER_ATTRIBUTE = eINSTANCE.getFunctionMemberAttribute();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ExternalImpl <em>External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ExternalImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExternal()
		 * @generated
		 */
		EClass EXTERNAL = eINSTANCE.getExternal();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FunctionPersistentImpl <em>Function Persistent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FunctionPersistentImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFunctionPersistent()
		 * @generated
		 */
		EClass FUNCTION_PERSISTENT = eINSTANCE.getFunctionPersistent();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FileLocalImpl <em>File Local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FileLocalImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFileLocal()
		 * @generated
		 */
		EClass FILE_LOCAL = eINSTANCE.getFileLocal();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PerClassMemberImpl <em>Per Class Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PerClassMemberImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPerClassMember()
		 * @generated
		 */
		EClass PER_CLASS_MEMBER = eINSTANCE.getPerClassMember();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NoDefImpl <em>No Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NoDefImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNoDef()
		 * @generated
		 */
		EClass NO_DEF = eINSTANCE.getNoDef();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.VirtualImpl <em>Virtual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.VirtualImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVirtual()
		 * @generated
		 */
		EClass VIRTUAL = eINSTANCE.getVirtual();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PureVirtualImpl <em>Pure Virtual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PureVirtualImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPureVirtual()
		 * @generated
		 */
		EClass PURE_VIRTUAL = eINSTANCE.getPureVirtual();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NonVirtualImpl <em>Non Virtual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NonVirtualImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNonVirtual()
		 * @generated
		 */
		EClass NON_VIRTUAL = eINSTANCE.getNonVirtual();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ExceptionTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExceptionType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.VoidImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVoid()
		 * @generated
		 */
		EClass VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ByteImpl <em>Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ByteImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByte()
		 * @generated
		 */
		EClass BYTE = eINSTANCE.getByte();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ShortIntegerImpl <em>Short Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ShortIntegerImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getShortInteger()
		 * @generated
		 */
		EClass SHORT_INTEGER = eINSTANCE.getShortInteger();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.IntegerImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LongIntegerImpl <em>Long Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LongIntegerImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLongInteger()
		 * @generated
		 */
		EClass LONG_INTEGER = eINSTANCE.getLongInteger();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.FloatImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DoubleImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LongDoubleImpl <em>Long Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LongDoubleImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLongDouble()
		 * @generated
		 */
		EClass LONG_DOUBLE = eINSTANCE.getLongDouble();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CharacterImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.StringImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BooleanImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.WideCharacterImpl <em>Wide Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.WideCharacterImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getWideCharacter()
		 * @generated
		 */
		EClass WIDE_CHARACTER = eINSTANCE.getWideCharacter();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CollectionTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PointerTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPointerType()
		 * @generated
		 */
		EClass POINTER_TYPE = eINSTANCE.getPointerType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ReferenceTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.RangeTypeImpl <em>Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.RangeTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getRangeType()
		 * @generated
		 */
		EClass RANGE_TYPE = eINSTANCE.getRangeType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.StructureTypeImpl <em>Structure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.StructureTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStructureType()
		 * @generated
		 */
		EClass STRUCTURE_TYPE = eINSTANCE.getStructureType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.UnionTypeImpl <em>Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.UnionTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnionType()
		 * @generated
		 */
		EClass UNION_TYPE = eINSTANCE.getUnionType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AnnotationTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAnnotationType()
		 * @generated
		 */
		EClass ANNOTATION_TYPE = eINSTANCE.getAnnotationType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ByValueFormalParameterTypeImpl <em>By Value Formal Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ByValueFormalParameterTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByValueFormalParameterType()
		 * @generated
		 */
		EClass BY_VALUE_FORMAL_PARAMETER_TYPE = eINSTANCE.getByValueFormalParameterType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ByReferenceFormalParameterTypeImpl <em>By Reference Formal Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ByReferenceFormalParameterTypeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByReferenceFormalParameterType()
		 * @generated
		 */
		EClass BY_REFERENCE_FORMAL_PARAMETER_TYPE = eINSTANCE.getByReferenceFormalParameterType();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PublicImpl <em>Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PublicImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPublic()
		 * @generated
		 */
		EClass PUBLIC = eINSTANCE.getPublic();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ProtectedImpl <em>Protected</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ProtectedImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getProtected()
		 * @generated
		 */
		EClass PROTECTED = eINSTANCE.getProtected();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PrivateImpl <em>Private</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PrivateImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPrivate()
		 * @generated
		 */
		EClass PRIVATE = eINSTANCE.getPrivate();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.TerminateStatementImpl <em>Terminate Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.TerminateStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getTerminateStatement()
		 * @generated
		 */
		EClass TERMINATE_STATEMENT = eINSTANCE.getTerminateStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DefaultBlockImpl <em>Default Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DefaultBlockImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDefaultBlock()
		 * @generated
		 */
		EClass DEFAULT_BLOCK = eINSTANCE.getDefaultBlock();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.WhileStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DoWhileStatementImpl <em>Do While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DoWhileStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDoWhileStatement()
		 * @generated
		 */
		EClass DO_WHILE_STATEMENT = eINSTANCE.getDoWhileStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ForCheckBeforeStatementImpl <em>For Check Before Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ForCheckBeforeStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getForCheckBeforeStatement()
		 * @generated
		 */
		EClass FOR_CHECK_BEFORE_STATEMENT = eINSTANCE.getForCheckBeforeStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ForCheckAfterStatementImpl <em>For Check After Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ForCheckAfterStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getForCheckAfterStatement()
		 * @generated
		 */
		EClass FOR_CHECK_AFTER_STATEMENT = eINSTANCE.getForCheckAfterStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AggregateExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAggregateExpression()
		 * @generated
		 */
		EClass AGGREGATE_EXPRESSION = eINSTANCE.getAggregateExpression();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.QualifiedOverPointerImpl <em>Qualified Over Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.QualifiedOverPointerImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getQualifiedOverPointer()
		 * @generated
		 */
		EClass QUALIFIED_OVER_POINTER = eINSTANCE.getQualifiedOverPointer();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.QualifiedOverDataImpl <em>Qualified Over Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.QualifiedOverDataImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getQualifiedOverData()
		 * @generated
		 */
		EClass QUALIFIED_OVER_DATA = eINSTANCE.getQualifiedOverData();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.IntegerLiteralImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.StringLiteralImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.CharLiteralImpl <em>Char Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.CharLiteralImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getCharLiteral()
		 * @generated
		 */
		EClass CHAR_LITERAL = eINSTANCE.getCharLiteral();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.RealLiteralImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BooleanLiteralImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitLiteralImpl <em>Bit Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitLiteralImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitLiteral()
		 * @generated
		 */
		EClass BIT_LITERAL = eINSTANCE.getBitLiteral();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.UnaryPlusImpl <em>Unary Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.UnaryPlusImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getUnaryPlus()
		 * @generated
		 */
		EClass UNARY_PLUS = eINSTANCE.getUnaryPlus();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NegateImpl <em>Negate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NegateImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNegate()
		 * @generated
		 */
		EClass NEGATE = eINSTANCE.getNegate();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NotImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitNotImpl <em>Bit Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitNotImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitNot()
		 * @generated
		 */
		EClass BIT_NOT = eINSTANCE.getBitNot();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AddressOfImpl <em>Address Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AddressOfImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAddressOf()
		 * @generated
		 */
		EClass ADDRESS_OF = eINSTANCE.getAddressOf();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DerefImpl <em>Deref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DerefImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDeref()
		 * @generated
		 */
		EClass DEREF = eINSTANCE.getDeref();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.IncrementImpl <em>Increment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.IncrementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getIncrement()
		 * @generated
		 */
		EClass INCREMENT = eINSTANCE.getIncrement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DecrementImpl <em>Decrement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DecrementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDecrement()
		 * @generated
		 */
		EClass DECREMENT = eINSTANCE.getDecrement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PostIncrementImpl <em>Post Increment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PostIncrementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPostIncrement()
		 * @generated
		 */
		EClass POST_INCREMENT = eINSTANCE.getPostIncrement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.PostDecrementImpl <em>Post Decrement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.PostDecrementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getPostDecrement()
		 * @generated
		 */
		EClass POST_DECREMENT = eINSTANCE.getPostDecrement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AddImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SubtractImpl <em>Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SubtractImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSubtract()
		 * @generated
		 */
		EClass SUBTRACT = eINSTANCE.getSubtract();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.MultiplyImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.DivideImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ModulusImpl <em>Modulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ModulusImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getModulus()
		 * @generated
		 */
		EClass MODULUS = eINSTANCE.getModulus();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ExponentImpl <em>Exponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ExponentImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getExponent()
		 * @generated
		 */
		EClass EXPONENT = eINSTANCE.getExponent();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AndImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.OrImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.EqualImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NotEqualImpl <em>Not Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NotEqualImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNotEqual()
		 * @generated
		 */
		EClass NOT_EQUAL = eINSTANCE.getNotEqual();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.GreaterImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NotGreaterImpl <em>Not Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NotGreaterImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNotGreater()
		 * @generated
		 */
		EClass NOT_GREATER = eINSTANCE.getNotGreater();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.LessImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.NotLessImpl <em>Not Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.NotLessImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getNotLess()
		 * @generated
		 */
		EClass NOT_LESS = eINSTANCE.getNotLess();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitAndImpl <em>Bit And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitAndImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitAnd()
		 * @generated
		 */
		EClass BIT_AND = eINSTANCE.getBitAnd();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitOrImpl <em>Bit Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitOrImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitOr()
		 * @generated
		 */
		EClass BIT_OR = eINSTANCE.getBitOr();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitXorImpl <em>Bit Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitXorImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitXor()
		 * @generated
		 */
		EClass BIT_XOR = eINSTANCE.getBitXor();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitLeftShiftImpl <em>Bit Left Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitLeftShiftImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitLeftShift()
		 * @generated
		 */
		EClass BIT_LEFT_SHIFT = eINSTANCE.getBitLeftShift();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.BitRightShiftImpl <em>Bit Right Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.BitRightShiftImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getBitRightShift()
		 * @generated
		 */
		EClass BIT_RIGHT_SHIFT = eINSTANCE.getBitRightShift();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.AssignImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.MissingActualParameterImpl <em>Missing Actual Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.MissingActualParameterImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getMissingActualParameter()
		 * @generated
		 */
		EClass MISSING_ACTUAL_PARAMETER = eINSTANCE.getMissingActualParameter();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ByValueActualParameterExpressionImpl <em>By Value Actual Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ByValueActualParameterExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByValueActualParameterExpression()
		 * @generated
		 */
		EClass BY_VALUE_ACTUAL_PARAMETER_EXPRESSION = eINSTANCE.getByValueActualParameterExpression();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.ByReferenceActualParameterExpressionImpl <em>By Reference Actual Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.ByReferenceActualParameterExpressionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getByReferenceActualParameterExpression()
		 * @generated
		 */
		EClass BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION = eINSTANCE.getByReferenceActualParameterExpression();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SpecificTriggerDefinitionImpl <em>Specific Trigger Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SpecificTriggerDefinitionImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificTriggerDefinition()
		 * @generated
		 */
		EClass SPECIFIC_TRIGGER_DEFINITION = eINSTANCE.getSpecificTriggerDefinition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRIGGER_DEFINITION__BODY = eINSTANCE.getSpecificTriggerDefinition_Body();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SpecificLessEqualImpl <em>Specific Less Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SpecificLessEqualImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificLessEqual()
		 * @generated
		 */
		EClass SPECIFIC_LESS_EQUAL = eINSTANCE.getSpecificLessEqual();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SpecificGreaterEqualImpl <em>Specific Greater Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SpecificGreaterEqualImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificGreaterEqual()
		 * @generated
		 */
		EClass SPECIFIC_GREATER_EQUAL = eINSTANCE.getSpecificGreaterEqual();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SpecificInImpl <em>Specific In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SpecificInImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificIn()
		 * @generated
		 */
		EClass SPECIFIC_IN = eINSTANCE.getSpecificIn();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SpecificLikeImpl <em>Specific Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SpecificLikeImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificLike()
		 * @generated
		 */
		EClass SPECIFIC_LIKE = eINSTANCE.getSpecificLike();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SpecificConcatStringImpl <em>Specific Concat String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SpecificConcatStringImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificConcatString()
		 * @generated
		 */
		EClass SPECIFIC_CONCAT_STRING = eINSTANCE.getSpecificConcatString();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.impl.SpecificSelectStatementImpl <em>Specific Select Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.impl.SpecificSelectStatementImpl
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getSpecificSelectStatement()
		 * @generated
		 */
		EClass SPECIFIC_SELECT_STATEMENT = eINSTANCE.getSpecificSelectStatement();

		/**
		 * The meta object literal for the '{@link org.xtext.example.delphi.astm.util.Visitable <em>Visitable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.delphi.astm.util.Visitable
		 * @see org.xtext.example.delphi.astm.impl.AstmPackageImpl#getVisitable()
		 * @generated
		 */
		EClass VISITABLE = eINSTANCE.getVisitable();

	}

} //AstmPackage
