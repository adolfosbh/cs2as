/**
 */
package org.xtext.example.macros.iMacros;

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
 * @see org.xtext.example.macros.iMacros.IMacrosFactory
 * @model kind="package"
 * @generated
 */
public interface IMacrosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iMacros";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/language/iMacros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iMacros";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IMacrosPackage eINSTANCE = org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xtext.example.macros.astm.util.Visitable <em>Visitable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.macros.astm.util.Visitable
	 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getVisitable()
	 * @generated
	 */
	int VISITABLE = 6;

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
	 * The meta object id for the '{@link org.xtext.example.macros.iMacros.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.macros.iMacros.impl.ScriptImpl
	 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__VERSION = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__INSTRUCTIONS = VISITABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.macros.iMacros.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.macros.iMacros.impl.VersionImpl
	 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 1;

	/**
	 * The feature id for the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__BUILD = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.macros.iMacros.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.macros.iMacros.impl.InstructionImpl
	 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = VISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = VISITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.macros.iMacros.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.macros.iMacros.impl.TagImpl
	 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ATTR = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__POS = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CONTENT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.macros.iMacros.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.macros.iMacros.impl.UrlImpl
	 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 4;

	/**
	 * The feature id for the '<em><b>Goto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__GOTO = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.macros.iMacros.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.macros.iMacros.impl.TabImpl
	 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 5;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__T = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.xtext.example.macros.iMacros.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see org.xtext.example.macros.iMacros.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the reference '{@link org.xtext.example.macros.iMacros.Script#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.xtext.example.macros.iMacros.Script#getVersion()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Version();

	/**
	 * Returns the meta object for the reference list '{@link org.xtext.example.macros.iMacros.Script#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instructions</em>'.
	 * @see org.xtext.example.macros.iMacros.Script#getInstructions()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Instructions();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.macros.iMacros.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.xtext.example.macros.iMacros.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.macros.iMacros.Version#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build</em>'.
	 * @see org.xtext.example.macros.iMacros.Version#getBuild()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Build();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.macros.iMacros.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.xtext.example.macros.iMacros.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.macros.iMacros.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.xtext.example.macros.iMacros.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.macros.iMacros.Tag#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xtext.example.macros.iMacros.Tag#getType()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.macros.iMacros.Tag#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see org.xtext.example.macros.iMacros.Tag#getAttr()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Attr();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.macros.iMacros.Tag#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.xtext.example.macros.iMacros.Tag#getPos()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Pos();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.macros.iMacros.Tag#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.xtext.example.macros.iMacros.Tag#getContent()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Content();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.macros.iMacros.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see org.xtext.example.macros.iMacros.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.macros.iMacros.Url#getGoto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goto</em>'.
	 * @see org.xtext.example.macros.iMacros.Url#getGoto()
	 * @see #getUrl()
	 * @generated
	 */
	EAttribute getUrl_Goto();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.macros.iMacros.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see org.xtext.example.macros.iMacros.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.macros.iMacros.Tab#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>T</em>'.
	 * @see org.xtext.example.macros.iMacros.Tab#getT()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_T();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.macros.astm.util.Visitable <em>Visitable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitable</em>'.
	 * @see org.xtext.example.macros.astm.util.Visitable
	 * @model instanceClass="org.xtext.example.macros.astm.util.Visitable"
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
	IMacrosFactory getIMacrosFactory();

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
		 * The meta object literal for the '{@link org.xtext.example.macros.iMacros.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.macros.iMacros.impl.ScriptImpl
		 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__VERSION = eINSTANCE.getScript_Version();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__INSTRUCTIONS = eINSTANCE.getScript_Instructions();

		/**
		 * The meta object literal for the '{@link org.xtext.example.macros.iMacros.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.macros.iMacros.impl.VersionImpl
		 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__BUILD = eINSTANCE.getVersion_Build();

		/**
		 * The meta object literal for the '{@link org.xtext.example.macros.iMacros.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.macros.iMacros.impl.InstructionImpl
		 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link org.xtext.example.macros.iMacros.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.macros.iMacros.impl.TagImpl
		 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__TYPE = eINSTANCE.getTag_Type();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__ATTR = eINSTANCE.getTag_Attr();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__POS = eINSTANCE.getTag_Pos();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__CONTENT = eINSTANCE.getTag_Content();

		/**
		 * The meta object literal for the '{@link org.xtext.example.macros.iMacros.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.macros.iMacros.impl.UrlImpl
		 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '<em><b>Goto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__GOTO = eINSTANCE.getUrl_Goto();

		/**
		 * The meta object literal for the '{@link org.xtext.example.macros.iMacros.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.macros.iMacros.impl.TabImpl
		 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__T = eINSTANCE.getTab_T();

		/**
		 * The meta object literal for the '{@link org.xtext.example.macros.astm.util.Visitable <em>Visitable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.macros.astm.util.Visitable
		 * @see org.xtext.example.macros.iMacros.impl.IMacrosPackageImpl#getVisitable()
		 * @generated
		 */
		EClass VISITABLE = eINSTANCE.getVisitable();

	}

} //IMacrosPackage
