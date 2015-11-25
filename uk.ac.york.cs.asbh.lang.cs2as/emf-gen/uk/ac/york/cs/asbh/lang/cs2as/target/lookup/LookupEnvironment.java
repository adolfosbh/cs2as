/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.target.lookup;

import org.eclipse.emf.common.util.EList;

import uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment#getParentEnv <em>Parent Env</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage#getLookupEnvironment()
 * @model
 * @generated
 */
public interface LookupEnvironment extends Env4CG {
	/**
	 * Returns the value of the '<em><b>Named Elements</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Elements</em>' reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage#getLookupEnvironment_NamedElements()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/lookup/1.0!LookupEnvironment!namedElements'"
	 * @generated
	 */
	EList<NamedElement> getNamedElements();

	/**
	 * Returns the value of the '<em><b>Parent Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Env</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Env</em>' reference.
	 * @see #setParentEnv(LookupEnvironment)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentPackage#getLookupEnvironment_ParentEnv()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://uk.ac.york.cs.asbh.lang.cs2as/lookup/1.0!LookupEnvironment!parentEnv'"
	 * @generated
	 */
	LookupEnvironment getParentEnv();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment#getParentEnv <em>Parent Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Env</em>' reference.
	 * @see #getParentEnv()
	 * @generated
	 */
	void setParentEnv(LookupEnvironment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * LookupEnvironment{\n *   namedElements = namedElements->includingAll(elements), parentEnv = parentEnv\n * }\n \052/\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Property%> CTORid_namedElements = idResolver.getProperty(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.PROPid_namedElements);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Property%> CTORid_parentEnv = idResolver.getProperty(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.PROPid_parentEnv);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.CLSSid_LookupEnvironment, null);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment%> symbol_0 = (<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment%>)TYP_lookup_c_c_LookupEnvironment_0.createInstance();\n@SuppressWarnings(\"null\")\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%java.util.List%><<%uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement%>> namedElements = this.getNamedElements();\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_namedElements = idResolver.createOrderedSetOfAll(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.ORD_CLSSid_NamedElement, namedElements);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_elements = idResolver.createOrderedSetOfAll(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.ORD_TMPLid_, elements);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.CollectionValue%> includingAll = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation%>.INSTANCE.evaluate(BOXED_namedElements, BOXED_elements);\nfinal <%java.util.List%><? extends <%java.lang.Object%>> UNBOXED_includingAll = includingAll.asEcoreObjects(idResolver, <%java.lang.Object%>.class);\nassert UNBOXED_includingAll != null;\nCTORid_namedElements.initValue(symbol_0, UNBOXED_includingAll);\nfinal @<%org.eclipse.jdt.annotation.Nullable%> /*@Thrown\052/ <%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment%> parentEnv = this.getParentEnv();\nCTORid_parentEnv.initValue(symbol_0, parentEnv);\nreturn symbol_0;'"
	 * @generated
	 */
	<NE extends NamedElement> LookupEnvironment addElements(EList<NE> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * LookupEnvironment{\n *   namedElements = namedElements->including(element), parentEnv = parentEnv\n * }\n \052/\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Property%> CTORid_namedElements = idResolver.getProperty(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.PROPid_namedElements);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Property%> CTORid_parentEnv = idResolver.getProperty(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.PROPid_parentEnv);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.CLSSid_LookupEnvironment, null);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment%> symbol_0 = (<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment%>)TYP_lookup_c_c_LookupEnvironment_0.createInstance();\n@SuppressWarnings(\"null\")\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%java.util.List%><<%uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement%>> namedElements = this.getNamedElements();\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_namedElements = idResolver.createOrderedSetOfAll(<%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironmentTables%>.ORD_CLSSid_NamedElement, namedElements);\nfinal @<%org.eclipse.jdt.annotation.NonNull%> /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> including = (<%org.eclipse.ocl.pivot.values.OrderedSetValue%>)<%org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation%>.INSTANCE.evaluate(BOXED_namedElements, element);\nfinal <%java.util.List%><<%uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement%>> UNBOXED_including = including.asEcoreObjects(idResolver, <%uk.ac.york.cs.asbh.lang.cs2as.target.NamedElement%>.class);\nassert UNBOXED_including != null;\nCTORid_namedElements.initValue(symbol_0, UNBOXED_including);\nfinal @<%org.eclipse.jdt.annotation.Nullable%> /*@Thrown\052/ <%uk.ac.york.cs.asbh.lang.cs2as.target.lookup.LookupEnvironment%> parentEnv = this.getParentEnv();\nCTORid_parentEnv.initValue(symbol_0, parentEnv);\nreturn symbol_0;'"
	 * @generated
	 */
	LookupEnvironment addElement(NamedElement element);

} // LookupEnvironment
