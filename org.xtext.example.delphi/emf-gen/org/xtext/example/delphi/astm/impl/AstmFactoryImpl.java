/**
 */
package org.xtext.example.delphi.astm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.xtext.example.delphi.astm.AccessKind;
import org.xtext.example.delphi.astm.ActualParameterExpression;
import org.xtext.example.delphi.astm.Add;
import org.xtext.example.delphi.astm.AddressOf;
import org.xtext.example.delphi.astm.AggregateExpression;
import org.xtext.example.delphi.astm.AggregateScope;
import org.xtext.example.delphi.astm.AggregateTypeDefinition;
import org.xtext.example.delphi.astm.And;
import org.xtext.example.delphi.astm.AnnotationExpression;
import org.xtext.example.delphi.astm.AnnotationType;
import org.xtext.example.delphi.astm.ArrayAccess;
import org.xtext.example.delphi.astm.ArrayType;
import org.xtext.example.delphi.astm.Assign;
import org.xtext.example.delphi.astm.AstmFactory;
import org.xtext.example.delphi.astm.AstmPackage;
import org.xtext.example.delphi.astm.BinaryExpression;
import org.xtext.example.delphi.astm.BitAnd;
import org.xtext.example.delphi.astm.BitFieldDefinition;
import org.xtext.example.delphi.astm.BitLeftShift;
import org.xtext.example.delphi.astm.BitLiteral;
import org.xtext.example.delphi.astm.BitNot;
import org.xtext.example.delphi.astm.BitOr;
import org.xtext.example.delphi.astm.BitRightShift;
import org.xtext.example.delphi.astm.BitXor;
import org.xtext.example.delphi.astm.BlockScope;
import org.xtext.example.delphi.astm.BlockStatement;
import org.xtext.example.delphi.astm.BooleanLiteral;
import org.xtext.example.delphi.astm.BreakStatement;
import org.xtext.example.delphi.astm.ByReferenceActualParameterExpression;
import org.xtext.example.delphi.astm.ByReferenceFormalParameterType;
import org.xtext.example.delphi.astm.ByValueActualParameterExpression;
import org.xtext.example.delphi.astm.ByValueFormalParameterType;
import org.xtext.example.delphi.astm.CaseBlock;
import org.xtext.example.delphi.astm.CastExpression;
import org.xtext.example.delphi.astm.CatchBlock;
import org.xtext.example.delphi.astm.CharLiteral;
import org.xtext.example.delphi.astm.ClassType;
import org.xtext.example.delphi.astm.CollectionType;
import org.xtext.example.delphi.astm.Comment;
import org.xtext.example.delphi.astm.CompilationUnit;
import org.xtext.example.delphi.astm.ConditionalExpression;
import org.xtext.example.delphi.astm.ContinueStatement;
import org.xtext.example.delphi.astm.DeclarationOrDefinitionStatement;
import org.xtext.example.delphi.astm.Decrement;
import org.xtext.example.delphi.astm.DefaultBlock;
import org.xtext.example.delphi.astm.DeleteStatement;
import org.xtext.example.delphi.astm.DelphiBlockStatement;
import org.xtext.example.delphi.astm.DelphiFunctionCallExpression;
import org.xtext.example.delphi.astm.DelphiImplementationSection;
import org.xtext.example.delphi.astm.DelphiInterfaceSection;
import org.xtext.example.delphi.astm.DelphiUnit;
import org.xtext.example.delphi.astm.DelphiWithStatement;
import org.xtext.example.delphi.astm.Deref;
import org.xtext.example.delphi.astm.DerivesFrom;
import org.xtext.example.delphi.astm.Dimension;
import org.xtext.example.delphi.astm.Divide;
import org.xtext.example.delphi.astm.DoWhileStatement;
import org.xtext.example.delphi.astm.EmptyStatement;
import org.xtext.example.delphi.astm.EntryDefinition;
import org.xtext.example.delphi.astm.EnumLiteralDefinition;
import org.xtext.example.delphi.astm.EnumType;
import org.xtext.example.delphi.astm.Equal;
import org.xtext.example.delphi.astm.ExceptionType;
import org.xtext.example.delphi.astm.Exponent;
import org.xtext.example.delphi.astm.ExpressionStatement;
import org.xtext.example.delphi.astm.External;
import org.xtext.example.delphi.astm.FileLocal;
import org.xtext.example.delphi.astm.ForCheckAfterStatement;
import org.xtext.example.delphi.astm.ForCheckBeforeStatement;
import org.xtext.example.delphi.astm.FormalParameterDeclaration;
import org.xtext.example.delphi.astm.FormalParameterDefinition;
import org.xtext.example.delphi.astm.FunctionCallExpression;
import org.xtext.example.delphi.astm.FunctionDeclaration;
import org.xtext.example.delphi.astm.FunctionDefinition;
import org.xtext.example.delphi.astm.FunctionMemberAttribute;
import org.xtext.example.delphi.astm.FunctionMemberAttributes;
import org.xtext.example.delphi.astm.FunctionPersistent;
import org.xtext.example.delphi.astm.FunctionScope;
import org.xtext.example.delphi.astm.FunctionType;
import org.xtext.example.delphi.astm.GASTMObject;
import org.xtext.example.delphi.astm.GlobalScope;
import org.xtext.example.delphi.astm.Greater;
import org.xtext.example.delphi.astm.IdentifierReference;
import org.xtext.example.delphi.astm.IfStatement;
import org.xtext.example.delphi.astm.IncludeUnit;
import org.xtext.example.delphi.astm.Increment;
import org.xtext.example.delphi.astm.IntegerLiteral;
import org.xtext.example.delphi.astm.JumpStatement;
import org.xtext.example.delphi.astm.LabelAccess;
import org.xtext.example.delphi.astm.LabelDefinition;
import org.xtext.example.delphi.astm.LabelType;
import org.xtext.example.delphi.astm.LabeledStatement;
import org.xtext.example.delphi.astm.Less;
import org.xtext.example.delphi.astm.Literal;
import org.xtext.example.delphi.astm.LongDouble;
import org.xtext.example.delphi.astm.LongInteger;
import org.xtext.example.delphi.astm.LoopStatement;
import org.xtext.example.delphi.astm.MacroCall;
import org.xtext.example.delphi.astm.MacroDefinition;
import org.xtext.example.delphi.astm.MissingActualParameter;
import org.xtext.example.delphi.astm.Modulus;
import org.xtext.example.delphi.astm.Multiply;
import org.xtext.example.delphi.astm.Name;
import org.xtext.example.delphi.astm.NameSpaceDefinition;
import org.xtext.example.delphi.astm.NameSpaceType;
import org.xtext.example.delphi.astm.NamedType;
import org.xtext.example.delphi.astm.NamedTypeDefinition;
import org.xtext.example.delphi.astm.NamedTypeReference;
import org.xtext.example.delphi.astm.Negate;
import org.xtext.example.delphi.astm.NewExpression;
import org.xtext.example.delphi.astm.NoDef;
import org.xtext.example.delphi.astm.NonVirtual;
import org.xtext.example.delphi.astm.Not;
import org.xtext.example.delphi.astm.NotEqual;
import org.xtext.example.delphi.astm.NotGreater;
import org.xtext.example.delphi.astm.NotLess;
import org.xtext.example.delphi.astm.Operator;
import org.xtext.example.delphi.astm.OperatorAssign;
import org.xtext.example.delphi.astm.Or;
import org.xtext.example.delphi.astm.PerClassMember;
import org.xtext.example.delphi.astm.PointerType;
import org.xtext.example.delphi.astm.PostDecrement;
import org.xtext.example.delphi.astm.PostIncrement;
import org.xtext.example.delphi.astm.Private;
import org.xtext.example.delphi.astm.ProgramScope;
import org.xtext.example.delphi.astm.Project;
import org.xtext.example.delphi.astm.Protected;
import org.xtext.example.delphi.astm.Public;
import org.xtext.example.delphi.astm.PureVirtual;
import org.xtext.example.delphi.astm.QualifiedOverData;
import org.xtext.example.delphi.astm.QualifiedOverPointer;
import org.xtext.example.delphi.astm.RangeExpression;
import org.xtext.example.delphi.astm.RangeType;
import org.xtext.example.delphi.astm.RealLiteral;
import org.xtext.example.delphi.astm.ReferenceType;
import org.xtext.example.delphi.astm.ReturnStatement;
import org.xtext.example.delphi.astm.Scope;
import org.xtext.example.delphi.astm.ShortInteger;
import org.xtext.example.delphi.astm.SourceFile;
import org.xtext.example.delphi.astm.SourceLocation;
import org.xtext.example.delphi.astm.SpecificConcatString;
import org.xtext.example.delphi.astm.SpecificGreaterEqual;
import org.xtext.example.delphi.astm.SpecificIn;
import org.xtext.example.delphi.astm.SpecificLessEqual;
import org.xtext.example.delphi.astm.SpecificLike;
import org.xtext.example.delphi.astm.SpecificSelectStatement;
import org.xtext.example.delphi.astm.SpecificTriggerDefinition;
import org.xtext.example.delphi.astm.StringLiteral;
import org.xtext.example.delphi.astm.StructureType;
import org.xtext.example.delphi.astm.Subtract;
import org.xtext.example.delphi.astm.SwitchCase;
import org.xtext.example.delphi.astm.SwitchStatement;
import org.xtext.example.delphi.astm.TerminateStatement;
import org.xtext.example.delphi.astm.ThrowStatement;
import org.xtext.example.delphi.astm.TryStatement;
import org.xtext.example.delphi.astm.TypeDefinition;
import org.xtext.example.delphi.astm.TypeQualifiedIdentifierReference;
import org.xtext.example.delphi.astm.TypesCatchBlock;
import org.xtext.example.delphi.astm.UnaryExpression;
import org.xtext.example.delphi.astm.UnaryPlus;
import org.xtext.example.delphi.astm.UnionType;
import org.xtext.example.delphi.astm.UnnamedTypeReference;
import org.xtext.example.delphi.astm.VariableCatchBlock;
import org.xtext.example.delphi.astm.VariableDeclaration;
import org.xtext.example.delphi.astm.VariableDefinition;
import org.xtext.example.delphi.astm.Virtual;
import org.xtext.example.delphi.astm.WhileStatement;
import org.xtext.example.delphi.astm.WideCharacter;
import org.xtext.example.delphi.astm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstmFactoryImpl extends EFactoryImpl implements AstmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AstmFactory init() {
		try {
			AstmFactory theAstmFactory = (AstmFactory)EPackage.Registry.INSTANCE.getEFactory(AstmPackage.eNS_URI);
			if (theAstmFactory != null) {
				return theAstmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AstmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AstmPackage.DELPHI_UNIT: return createDelphiUnit();
			case AstmPackage.DELPHI_INTERFACE_SECTION: return createDelphiInterfaceSection();
			case AstmPackage.DELPHI_IMPLEMENTATION_SECTION: return createDelphiImplementationSection();
			case AstmPackage.DELPHI_BLOCK_STATEMENT: return createDelphiBlockStatement();
			case AstmPackage.DELPHI_FUNCTION_CALL_EXPRESSION: return createDelphiFunctionCallExpression();
			case AstmPackage.DELPHI_WITH_STATEMENT: return createDelphiWithStatement();
			case AstmPackage.GASTM_OBJECT: return createGASTMObject();
			case AstmPackage.ACCESS_KIND: return createAccessKind();
			case AstmPackage.SOURCE_FILE: return createSourceFile();
			case AstmPackage.SOURCE_LOCATION: return createSourceLocation();
			case AstmPackage.PROJECT: return createProject();
			case AstmPackage.SCOPE: return createScope();
			case AstmPackage.COMPILATION_UNIT: return createCompilationUnit();
			case AstmPackage.NAME: return createName();
			case AstmPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
			case AstmPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case AstmPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
			case AstmPackage.FUNCTION_MEMBER_ATTRIBUTES: return createFunctionMemberAttributes();
			case AstmPackage.ENTRY_DEFINITION: return createEntryDefinition();
			case AstmPackage.BIT_FIELD_DEFINITION: return createBitFieldDefinition();
			case AstmPackage.ENUM_LITERAL_DEFINITION: return createEnumLiteralDefinition();
			case AstmPackage.TYPE_DEFINITION: return createTypeDefinition();
			case AstmPackage.NAMED_TYPE_DEFINITION: return createNamedTypeDefinition();
			case AstmPackage.AGGREGATE_TYPE_DEFINITION: return createAggregateTypeDefinition();
			case AstmPackage.NAME_SPACE_DEFINITION: return createNameSpaceDefinition();
			case AstmPackage.LABEL_DEFINITION: return createLabelDefinition();
			case AstmPackage.INCLUDE_UNIT: return createIncludeUnit();
			case AstmPackage.MACRO_CALL: return createMacroCall();
			case AstmPackage.MACRO_DEFINITION: return createMacroDefinition();
			case AstmPackage.COMMENT: return createComment();
			case AstmPackage.ENUM_TYPE: return createEnumType();
			case AstmPackage.ARRAY_TYPE: return createArrayType();
			case AstmPackage.DIMENSION: return createDimension();
			case AstmPackage.FUNCTION_TYPE: return createFunctionType();
			case AstmPackage.NAMED_TYPE: return createNamedType();
			case AstmPackage.CLASS_TYPE: return createClassType();
			case AstmPackage.DERIVES_FROM: return createDerivesFrom();
			case AstmPackage.UNNAMED_TYPE_REFERENCE: return createUnnamedTypeReference();
			case AstmPackage.NAMED_TYPE_REFERENCE: return createNamedTypeReference();
			case AstmPackage.DELETE_STATEMENT: return createDeleteStatement();
			case AstmPackage.DECLARATION_OR_DEFINITION_STATEMENT: return createDeclarationOrDefinitionStatement();
			case AstmPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
			case AstmPackage.JUMP_STATEMENT: return createJumpStatement();
			case AstmPackage.BREAK_STATEMENT: return createBreakStatement();
			case AstmPackage.CONTINUE_STATEMENT: return createContinueStatement();
			case AstmPackage.LABELED_STATEMENT: return createLabeledStatement();
			case AstmPackage.BLOCK_STATEMENT: return createBlockStatement();
			case AstmPackage.EMPTY_STATEMENT: return createEmptyStatement();
			case AstmPackage.IF_STATEMENT: return createIfStatement();
			case AstmPackage.SWITCH_STATEMENT: return createSwitchStatement();
			case AstmPackage.SWITCH_CASE: return createSwitchCase();
			case AstmPackage.CASE_BLOCK: return createCaseBlock();
			case AstmPackage.RETURN_STATEMENT: return createReturnStatement();
			case AstmPackage.LOOP_STATEMENT: return createLoopStatement();
			case AstmPackage.TRY_STATEMENT: return createTryStatement();
			case AstmPackage.CATCH_BLOCK: return createCatchBlock();
			case AstmPackage.TYPES_CATCH_BLOCK: return createTypesCatchBlock();
			case AstmPackage.VARIABLE_CATCH_BLOCK: return createVariableCatchBlock();
			case AstmPackage.THROW_STATEMENT: return createThrowStatement();
			case AstmPackage.ARRAY_ACCESS: return createArrayAccess();
			case AstmPackage.TYPE_QUALIFIED_IDENTIFIER_REFERENCE: return createTypeQualifiedIdentifierReference();
			case AstmPackage.LITERAL: return createLiteral();
			case AstmPackage.CAST_EXPRESSION: return createCastExpression();
			case AstmPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case AstmPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case AstmPackage.OPERATOR_ASSIGN: return createOperatorAssign();
			case AstmPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case AstmPackage.RANGE_EXPRESSION: return createRangeExpression();
			case AstmPackage.FUNCTION_CALL_EXPRESSION: return createFunctionCallExpression();
			case AstmPackage.ACTUAL_PARAMETER_EXPRESSION: return createActualParameterExpression();
			case AstmPackage.NEW_EXPRESSION: return createNewExpression();
			case AstmPackage.LABEL_ACCESS: return createLabelAccess();
			case AstmPackage.ANNOTATION_EXPRESSION: return createAnnotationExpression();
			case AstmPackage.GLOBAL_SCOPE: return createGlobalScope();
			case AstmPackage.PROGRAM_SCOPE: return createProgramScope();
			case AstmPackage.FUNCTION_SCOPE: return createFunctionScope();
			case AstmPackage.NAME_SPACE_TYPE: return createNameSpaceType();
			case AstmPackage.LABEL_TYPE: return createLabelType();
			case AstmPackage.AGGREGATE_SCOPE: return createAggregateScope();
			case AstmPackage.BLOCK_SCOPE: return createBlockScope();
			case AstmPackage.IDENTIFIER_REFERENCE: return createIdentifierReference();
			case AstmPackage.FORMAL_PARAMETER_DEFINITION: return createFormalParameterDefinition();
			case AstmPackage.FORMAL_PARAMETER_DECLARATION: return createFormalParameterDeclaration();
			case AstmPackage.VARIABLE_DEFINITION: return createVariableDefinition();
			case AstmPackage.FUNCTION_MEMBER_ATTRIBUTE: return createFunctionMemberAttribute();
			case AstmPackage.EXTERNAL: return createExternal();
			case AstmPackage.FUNCTION_PERSISTENT: return createFunctionPersistent();
			case AstmPackage.FILE_LOCAL: return createFileLocal();
			case AstmPackage.PER_CLASS_MEMBER: return createPerClassMember();
			case AstmPackage.NO_DEF: return createNoDef();
			case AstmPackage.VIRTUAL: return createVirtual();
			case AstmPackage.PURE_VIRTUAL: return createPureVirtual();
			case AstmPackage.NON_VIRTUAL: return createNonVirtual();
			case AstmPackage.EXCEPTION_TYPE: return createExceptionType();
			case AstmPackage.VOID: return createVoid();
			case AstmPackage.BYTE: return createByte();
			case AstmPackage.SHORT_INTEGER: return createShortInteger();
			case AstmPackage.INTEGER: return createInteger();
			case AstmPackage.LONG_INTEGER: return createLongInteger();
			case AstmPackage.FLOAT: return createFloat();
			case AstmPackage.DOUBLE: return createDouble();
			case AstmPackage.LONG_DOUBLE: return createLongDouble();
			case AstmPackage.CHARACTER: return createCharacter();
			case AstmPackage.STRING: return createString();
			case AstmPackage.BOOLEAN: return createBoolean();
			case AstmPackage.WIDE_CHARACTER: return createWideCharacter();
			case AstmPackage.COLLECTION_TYPE: return createCollectionType();
			case AstmPackage.POINTER_TYPE: return createPointerType();
			case AstmPackage.REFERENCE_TYPE: return createReferenceType();
			case AstmPackage.RANGE_TYPE: return createRangeType();
			case AstmPackage.STRUCTURE_TYPE: return createStructureType();
			case AstmPackage.UNION_TYPE: return createUnionType();
			case AstmPackage.ANNOTATION_TYPE: return createAnnotationType();
			case AstmPackage.BY_VALUE_FORMAL_PARAMETER_TYPE: return createByValueFormalParameterType();
			case AstmPackage.BY_REFERENCE_FORMAL_PARAMETER_TYPE: return createByReferenceFormalParameterType();
			case AstmPackage.PUBLIC: return createPublic();
			case AstmPackage.PROTECTED: return createProtected();
			case AstmPackage.PRIVATE: return createPrivate();
			case AstmPackage.TERMINATE_STATEMENT: return createTerminateStatement();
			case AstmPackage.DEFAULT_BLOCK: return createDefaultBlock();
			case AstmPackage.WHILE_STATEMENT: return createWhileStatement();
			case AstmPackage.DO_WHILE_STATEMENT: return createDoWhileStatement();
			case AstmPackage.FOR_CHECK_BEFORE_STATEMENT: return createForCheckBeforeStatement();
			case AstmPackage.FOR_CHECK_AFTER_STATEMENT: return createForCheckAfterStatement();
			case AstmPackage.AGGREGATE_EXPRESSION: return createAggregateExpression();
			case AstmPackage.QUALIFIED_OVER_POINTER: return createQualifiedOverPointer();
			case AstmPackage.QUALIFIED_OVER_DATA: return createQualifiedOverData();
			case AstmPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case AstmPackage.STRING_LITERAL: return createStringLiteral();
			case AstmPackage.CHAR_LITERAL: return createCharLiteral();
			case AstmPackage.REAL_LITERAL: return createRealLiteral();
			case AstmPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case AstmPackage.BIT_LITERAL: return createBitLiteral();
			case AstmPackage.UNARY_PLUS: return createUnaryPlus();
			case AstmPackage.NEGATE: return createNegate();
			case AstmPackage.NOT: return createNot();
			case AstmPackage.BIT_NOT: return createBitNot();
			case AstmPackage.ADDRESS_OF: return createAddressOf();
			case AstmPackage.DEREF: return createDeref();
			case AstmPackage.INCREMENT: return createIncrement();
			case AstmPackage.DECREMENT: return createDecrement();
			case AstmPackage.POST_INCREMENT: return createPostIncrement();
			case AstmPackage.POST_DECREMENT: return createPostDecrement();
			case AstmPackage.ADD: return createAdd();
			case AstmPackage.SUBTRACT: return createSubtract();
			case AstmPackage.MULTIPLY: return createMultiply();
			case AstmPackage.DIVIDE: return createDivide();
			case AstmPackage.MODULUS: return createModulus();
			case AstmPackage.EXPONENT: return createExponent();
			case AstmPackage.AND: return createAnd();
			case AstmPackage.OR: return createOr();
			case AstmPackage.EQUAL: return createEqual();
			case AstmPackage.NOT_EQUAL: return createNotEqual();
			case AstmPackage.GREATER: return createGreater();
			case AstmPackage.NOT_GREATER: return createNotGreater();
			case AstmPackage.LESS: return createLess();
			case AstmPackage.NOT_LESS: return createNotLess();
			case AstmPackage.BIT_AND: return createBitAnd();
			case AstmPackage.BIT_OR: return createBitOr();
			case AstmPackage.BIT_XOR: return createBitXor();
			case AstmPackage.BIT_LEFT_SHIFT: return createBitLeftShift();
			case AstmPackage.BIT_RIGHT_SHIFT: return createBitRightShift();
			case AstmPackage.ASSIGN: return createAssign();
			case AstmPackage.MISSING_ACTUAL_PARAMETER: return createMissingActualParameter();
			case AstmPackage.BY_VALUE_ACTUAL_PARAMETER_EXPRESSION: return createByValueActualParameterExpression();
			case AstmPackage.BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION: return createByReferenceActualParameterExpression();
			case AstmPackage.SPECIFIC_TRIGGER_DEFINITION: return createSpecificTriggerDefinition();
			case AstmPackage.SPECIFIC_LESS_EQUAL: return createSpecificLessEqual();
			case AstmPackage.SPECIFIC_GREATER_EQUAL: return createSpecificGreaterEqual();
			case AstmPackage.SPECIFIC_IN: return createSpecificIn();
			case AstmPackage.SPECIFIC_LIKE: return createSpecificLike();
			case AstmPackage.SPECIFIC_CONCAT_STRING: return createSpecificConcatString();
			case AstmPackage.SPECIFIC_SELECT_STATEMENT: return createSpecificSelectStatement();
			case AstmPackage.OPERATOR: return createOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelphiUnit createDelphiUnit() {
		DelphiUnitImpl delphiUnit = new DelphiUnitImpl();
		return delphiUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelphiInterfaceSection createDelphiInterfaceSection() {
		DelphiInterfaceSectionImpl delphiInterfaceSection = new DelphiInterfaceSectionImpl();
		return delphiInterfaceSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelphiImplementationSection createDelphiImplementationSection() {
		DelphiImplementationSectionImpl delphiImplementationSection = new DelphiImplementationSectionImpl();
		return delphiImplementationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelphiBlockStatement createDelphiBlockStatement() {
		DelphiBlockStatementImpl delphiBlockStatement = new DelphiBlockStatementImpl();
		return delphiBlockStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelphiFunctionCallExpression createDelphiFunctionCallExpression() {
		DelphiFunctionCallExpressionImpl delphiFunctionCallExpression = new DelphiFunctionCallExpressionImpl();
		return delphiFunctionCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelphiWithStatement createDelphiWithStatement() {
		DelphiWithStatementImpl delphiWithStatement = new DelphiWithStatementImpl();
		return delphiWithStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GASTMObject createGASTMObject() {
		GASTMObjectImpl gastmObject = new GASTMObjectImpl();
		return gastmObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessKind createAccessKind() {
		AccessKindImpl accessKind = new AccessKindImpl();
		return accessKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceLocation createSourceLocation() {
		SourceLocationImpl sourceLocation = new SourceLocationImpl();
		return sourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration createFunctionDeclaration() {
		FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition createFunctionDefinition() {
		FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMemberAttributes createFunctionMemberAttributes() {
		FunctionMemberAttributesImpl functionMemberAttributes = new FunctionMemberAttributesImpl();
		return functionMemberAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryDefinition createEntryDefinition() {
		EntryDefinitionImpl entryDefinition = new EntryDefinitionImpl();
		return entryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitFieldDefinition createBitFieldDefinition() {
		BitFieldDefinitionImpl bitFieldDefinition = new BitFieldDefinitionImpl();
		return bitFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralDefinition createEnumLiteralDefinition() {
		EnumLiteralDefinitionImpl enumLiteralDefinition = new EnumLiteralDefinitionImpl();
		return enumLiteralDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeDefinition createNamedTypeDefinition() {
		NamedTypeDefinitionImpl namedTypeDefinition = new NamedTypeDefinitionImpl();
		return namedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateTypeDefinition createAggregateTypeDefinition() {
		AggregateTypeDefinitionImpl aggregateTypeDefinition = new AggregateTypeDefinitionImpl();
		return aggregateTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameSpaceDefinition createNameSpaceDefinition() {
		NameSpaceDefinitionImpl nameSpaceDefinition = new NameSpaceDefinitionImpl();
		return nameSpaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDefinition createLabelDefinition() {
		LabelDefinitionImpl labelDefinition = new LabelDefinitionImpl();
		return labelDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeUnit createIncludeUnit() {
		IncludeUnitImpl includeUnit = new IncludeUnitImpl();
		return includeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroCall createMacroCall() {
		MacroCallImpl macroCall = new MacroCallImpl();
		return macroCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroDefinition createMacroDefinition() {
		MacroDefinitionImpl macroDefinition = new MacroDefinitionImpl();
		return macroDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedType createNamedType() {
		NamedTypeImpl namedType = new NamedTypeImpl();
		return namedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivesFrom createDerivesFrom() {
		DerivesFromImpl derivesFrom = new DerivesFromImpl();
		return derivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnnamedTypeReference createUnnamedTypeReference() {
		UnnamedTypeReferenceImpl unnamedTypeReference = new UnnamedTypeReferenceImpl();
		return unnamedTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeReference createNamedTypeReference() {
		NamedTypeReferenceImpl namedTypeReference = new NamedTypeReferenceImpl();
		return namedTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteStatement createDeleteStatement() {
		DeleteStatementImpl deleteStatement = new DeleteStatementImpl();
		return deleteStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationOrDefinitionStatement createDeclarationOrDefinitionStatement() {
		DeclarationOrDefinitionStatementImpl declarationOrDefinitionStatement = new DeclarationOrDefinitionStatementImpl();
		return declarationOrDefinitionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpStatement createJumpStatement() {
		JumpStatementImpl jumpStatement = new JumpStatementImpl();
		return jumpStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueStatement createContinueStatement() {
		ContinueStatementImpl continueStatement = new ContinueStatementImpl();
		return continueStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledStatement createLabeledStatement() {
		LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
		return labeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockStatement createBlockStatement() {
		BlockStatementImpl blockStatement = new BlockStatementImpl();
		return blockStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCase createSwitchCase() {
		SwitchCaseImpl switchCase = new SwitchCaseImpl();
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseBlock createCaseBlock() {
		CaseBlockImpl caseBlock = new CaseBlockImpl();
		return caseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopStatement createLoopStatement() {
		LoopStatementImpl loopStatement = new LoopStatementImpl();
		return loopStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryStatement createTryStatement() {
		TryStatementImpl tryStatement = new TryStatementImpl();
		return tryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchBlock createCatchBlock() {
		CatchBlockImpl catchBlock = new CatchBlockImpl();
		return catchBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesCatchBlock createTypesCatchBlock() {
		TypesCatchBlockImpl typesCatchBlock = new TypesCatchBlockImpl();
		return typesCatchBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableCatchBlock createVariableCatchBlock() {
		VariableCatchBlockImpl variableCatchBlock = new VariableCatchBlockImpl();
		return variableCatchBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowStatement createThrowStatement() {
		ThrowStatementImpl throwStatement = new ThrowStatementImpl();
		return throwStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeQualifiedIdentifierReference createTypeQualifiedIdentifierReference() {
		TypeQualifiedIdentifierReferenceImpl typeQualifiedIdentifierReference = new TypeQualifiedIdentifierReferenceImpl();
		return typeQualifiedIdentifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorAssign createOperatorAssign() {
		OperatorAssignImpl operatorAssign = new OperatorAssignImpl();
		return operatorAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeExpression createRangeExpression() {
		RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
		return rangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCallExpression createFunctionCallExpression() {
		FunctionCallExpressionImpl functionCallExpression = new FunctionCallExpressionImpl();
		return functionCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualParameterExpression createActualParameterExpression() {
		ActualParameterExpressionImpl actualParameterExpression = new ActualParameterExpressionImpl();
		return actualParameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewExpression createNewExpression() {
		NewExpressionImpl newExpression = new NewExpressionImpl();
		return newExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccess createLabelAccess() {
		LabelAccessImpl labelAccess = new LabelAccessImpl();
		return labelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationExpression createAnnotationExpression() {
		AnnotationExpressionImpl annotationExpression = new AnnotationExpressionImpl();
		return annotationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScope createGlobalScope() {
		GlobalScopeImpl globalScope = new GlobalScopeImpl();
		return globalScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramScope createProgramScope() {
		ProgramScopeImpl programScope = new ProgramScopeImpl();
		return programScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionScope createFunctionScope() {
		FunctionScopeImpl functionScope = new FunctionScopeImpl();
		return functionScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameSpaceType createNameSpaceType() {
		NameSpaceTypeImpl nameSpaceType = new NameSpaceTypeImpl();
		return nameSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateScope createAggregateScope() {
		AggregateScopeImpl aggregateScope = new AggregateScopeImpl();
		return aggregateScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockScope createBlockScope() {
		BlockScopeImpl blockScope = new BlockScopeImpl();
		return blockScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference createIdentifierReference() {
		IdentifierReferenceImpl identifierReference = new IdentifierReferenceImpl();
		return identifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameterDefinition createFormalParameterDefinition() {
		FormalParameterDefinitionImpl formalParameterDefinition = new FormalParameterDefinitionImpl();
		return formalParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameterDeclaration createFormalParameterDeclaration() {
		FormalParameterDeclarationImpl formalParameterDeclaration = new FormalParameterDeclarationImpl();
		return formalParameterDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDefinition createVariableDefinition() {
		VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
		return variableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMemberAttribute createFunctionMemberAttribute() {
		FunctionMemberAttributeImpl functionMemberAttribute = new FunctionMemberAttributeImpl();
		return functionMemberAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public External createExternal() {
		ExternalImpl external = new ExternalImpl();
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPersistent createFunctionPersistent() {
		FunctionPersistentImpl functionPersistent = new FunctionPersistentImpl();
		return functionPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileLocal createFileLocal() {
		FileLocalImpl fileLocal = new FileLocalImpl();
		return fileLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerClassMember createPerClassMember() {
		PerClassMemberImpl perClassMember = new PerClassMemberImpl();
		return perClassMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoDef createNoDef() {
		NoDefImpl noDef = new NoDefImpl();
		return noDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtual createVirtual() {
		VirtualImpl virtual = new VirtualImpl();
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PureVirtual createPureVirtual() {
		PureVirtualImpl pureVirtual = new PureVirtualImpl();
		return pureVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonVirtual createNonVirtual() {
		NonVirtualImpl nonVirtual = new NonVirtualImpl();
		return nonVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.Byte createByte() {
		ByteImpl byte_ = new ByteImpl();
		return byte_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortInteger createShortInteger() {
		ShortIntegerImpl shortInteger = new ShortIntegerImpl();
		return shortInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongInteger createLongInteger() {
		LongIntegerImpl longInteger = new LongIntegerImpl();
		return longInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongDouble createLongDouble() {
		LongDoubleImpl longDouble = new LongDoubleImpl();
		return longDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.example.delphi.astm.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WideCharacter createWideCharacter() {
		WideCharacterImpl wideCharacter = new WideCharacterImpl();
		return wideCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerType createPointerType() {
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType createStructureType() {
		StructureTypeImpl structureType = new StructureTypeImpl();
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionType createUnionType() {
		UnionTypeImpl unionType = new UnionTypeImpl();
		return unionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByValueFormalParameterType createByValueFormalParameterType() {
		ByValueFormalParameterTypeImpl byValueFormalParameterType = new ByValueFormalParameterTypeImpl();
		return byValueFormalParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByReferenceFormalParameterType createByReferenceFormalParameterType() {
		ByReferenceFormalParameterTypeImpl byReferenceFormalParameterType = new ByReferenceFormalParameterTypeImpl();
		return byReferenceFormalParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Public createPublic() {
		PublicImpl public_ = new PublicImpl();
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protected createProtected() {
		ProtectedImpl protected_ = new ProtectedImpl();
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Private createPrivate() {
		PrivateImpl private_ = new PrivateImpl();
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateStatement createTerminateStatement() {
		TerminateStatementImpl terminateStatement = new TerminateStatementImpl();
		return terminateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBlock createDefaultBlock() {
		DefaultBlockImpl defaultBlock = new DefaultBlockImpl();
		return defaultBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoWhileStatement createDoWhileStatement() {
		DoWhileStatementImpl doWhileStatement = new DoWhileStatementImpl();
		return doWhileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForCheckBeforeStatement createForCheckBeforeStatement() {
		ForCheckBeforeStatementImpl forCheckBeforeStatement = new ForCheckBeforeStatementImpl();
		return forCheckBeforeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForCheckAfterStatement createForCheckAfterStatement() {
		ForCheckAfterStatementImpl forCheckAfterStatement = new ForCheckAfterStatementImpl();
		return forCheckAfterStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateExpression createAggregateExpression() {
		AggregateExpressionImpl aggregateExpression = new AggregateExpressionImpl();
		return aggregateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedOverPointer createQualifiedOverPointer() {
		QualifiedOverPointerImpl qualifiedOverPointer = new QualifiedOverPointerImpl();
		return qualifiedOverPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedOverData createQualifiedOverData() {
		QualifiedOverDataImpl qualifiedOverData = new QualifiedOverDataImpl();
		return qualifiedOverData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharLiteral createCharLiteral() {
		CharLiteralImpl charLiteral = new CharLiteralImpl();
		return charLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealLiteral createRealLiteral() {
		RealLiteralImpl realLiteral = new RealLiteralImpl();
		return realLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitLiteral createBitLiteral() {
		BitLiteralImpl bitLiteral = new BitLiteralImpl();
		return bitLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryPlus createUnaryPlus() {
		UnaryPlusImpl unaryPlus = new UnaryPlusImpl();
		return unaryPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negate createNegate() {
		NegateImpl negate = new NegateImpl();
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitNot createBitNot() {
		BitNotImpl bitNot = new BitNotImpl();
		return bitNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressOf createAddressOf() {
		AddressOfImpl addressOf = new AddressOfImpl();
		return addressOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deref createDeref() {
		DerefImpl deref = new DerefImpl();
		return deref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment createIncrement() {
		IncrementImpl increment = new IncrementImpl();
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decrement createDecrement() {
		DecrementImpl decrement = new DecrementImpl();
		return decrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostIncrement createPostIncrement() {
		PostIncrementImpl postIncrement = new PostIncrementImpl();
		return postIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostDecrement createPostDecrement() {
		PostDecrementImpl postDecrement = new PostDecrementImpl();
		return postDecrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtract createSubtract() {
		SubtractImpl subtract = new SubtractImpl();
		return subtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulus createModulus() {
		ModulusImpl modulus = new ModulusImpl();
		return modulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exponent createExponent() {
		ExponentImpl exponent = new ExponentImpl();
		return exponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEqual createNotEqual() {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotGreater createNotGreater() {
		NotGreaterImpl notGreater = new NotGreaterImpl();
		return notGreater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotLess createNotLess() {
		NotLessImpl notLess = new NotLessImpl();
		return notLess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitAnd createBitAnd() {
		BitAndImpl bitAnd = new BitAndImpl();
		return bitAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitOr createBitOr() {
		BitOrImpl bitOr = new BitOrImpl();
		return bitOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitXor createBitXor() {
		BitXorImpl bitXor = new BitXorImpl();
		return bitXor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitLeftShift createBitLeftShift() {
		BitLeftShiftImpl bitLeftShift = new BitLeftShiftImpl();
		return bitLeftShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitRightShift createBitRightShift() {
		BitRightShiftImpl bitRightShift = new BitRightShiftImpl();
		return bitRightShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingActualParameter createMissingActualParameter() {
		MissingActualParameterImpl missingActualParameter = new MissingActualParameterImpl();
		return missingActualParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByValueActualParameterExpression createByValueActualParameterExpression() {
		ByValueActualParameterExpressionImpl byValueActualParameterExpression = new ByValueActualParameterExpressionImpl();
		return byValueActualParameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByReferenceActualParameterExpression createByReferenceActualParameterExpression() {
		ByReferenceActualParameterExpressionImpl byReferenceActualParameterExpression = new ByReferenceActualParameterExpressionImpl();
		return byReferenceActualParameterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificTriggerDefinition createSpecificTriggerDefinition() {
		SpecificTriggerDefinitionImpl specificTriggerDefinition = new SpecificTriggerDefinitionImpl();
		return specificTriggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificLessEqual createSpecificLessEqual() {
		SpecificLessEqualImpl specificLessEqual = new SpecificLessEqualImpl();
		return specificLessEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificGreaterEqual createSpecificGreaterEqual() {
		SpecificGreaterEqualImpl specificGreaterEqual = new SpecificGreaterEqualImpl();
		return specificGreaterEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificIn createSpecificIn() {
		SpecificInImpl specificIn = new SpecificInImpl();
		return specificIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificLike createSpecificLike() {
		SpecificLikeImpl specificLike = new SpecificLikeImpl();
		return specificLike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificConcatString createSpecificConcatString() {
		SpecificConcatStringImpl specificConcatString = new SpecificConcatStringImpl();
		return specificConcatString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificSelectStatement createSpecificSelectStatement() {
		SpecificSelectStatementImpl specificSelectStatement = new SpecificSelectStatementImpl();
		return specificSelectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstmPackage getAstmPackage() {
		return (AstmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AstmPackage getPackage() {
		return AstmPackage.eINSTANCE;
	}

} //AstmFactoryImpl
