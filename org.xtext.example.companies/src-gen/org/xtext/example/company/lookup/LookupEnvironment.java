/**
 */
package org.xtext.example.company.lookup;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.xtext.example.company.Employee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.company.lookup.LookupEnvironment#getNamedElements <em>Named Elements</em>}</li>
 *   <li>{@link org.xtext.example.company.lookup.LookupEnvironment#getParentEnv <em>Parent Env</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.company.lookup.LookupPackage#getLookupEnvironment()
 * @model
 * @generated
 */
public interface LookupEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Elements</b></em>' reference list.
	 * The list contents are of type {@link org.xtext.example.company.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Elements</em>' reference list.
	 * @see org.xtext.example.company.lookup.LookupPackage#getLookupEnvironment_NamedElements()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://xtext.eclipse.org/example/companies/lookup!LookupEnvironment!namedElements'"
	 * @generated
	 */
	EList<Employee> getNamedElements();

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
	 * @see org.xtext.example.company.lookup.LookupPackage#getLookupEnvironment_ParentEnv()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://xtext.eclipse.org/example/companies/lookup!LookupEnvironment!parentEnv'"
	 * @generated
	 */
	LookupEnvironment getParentEnv();

	/**
	 * Sets the value of the '{@link org.xtext.example.company.lookup.LookupEnvironment#getParentEnv <em>Parent Env</em>}' reference.
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
	 * @model required="true" elementsType="org.eclipse.ocl.pivot.oclstdlib.Collection<NE>" elementsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * LookupEnvironment{namedElements = namedElements->includingAll(elements)}\n \052/\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.evaluation.@<%org.eclipse.jdt.annotation.NonNull%> Executor executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.ids.@<%org.eclipse.jdt.annotation.NonNull%> IdResolver idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.@<%org.eclipse.jdt.annotation.NonNull%> Property CTORid_namedElements = idResolver.getProperty(<%org.xtext.example.company.lookup.LookupTables%>.PROPid_namedElements);\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.@<%org.eclipse.jdt.annotation.NonNull%> Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(<%org.xtext.example.company.lookup.LookupTables%>.CLSSid_LookupEnvironment, null);\nfinal /*@Thrown\052/ org.xtext.example.company.lookup.@<%org.eclipse.jdt.annotation.NonNull%> LookupEnvironment symbol_0 = (<%org.xtext.example.company.lookup.LookupEnvironment%>)TYP_lookup_c_c_LookupEnvironment_0.createInstance();\n@SuppressWarnings(\"null\")\nfinal /*@Thrown\052/ java.util.@<%org.eclipse.jdt.annotation.NonNull%> List<<%org.xtext.example.company.Employee%>> namedElements = this.getNamedElements();\nfinal /*@Thrown\052/ org.eclipse.ocl.pivot.values.@<%org.eclipse.jdt.annotation.NonNull%> OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(<%org.xtext.example.company.lookup.LookupTables%>.ORD_CLSSid_Employee, namedElements);\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.values.@<%org.eclipse.jdt.annotation.NonNull%> CollectionValue BOXED_elements = idResolver.createCollectionOfAll(<%org.xtext.example.company.lookup.LookupTables%>.COL_TMPLid_, elements);\nfinal /*@Thrown\052/ org.eclipse.ocl.pivot.values.@<%org.eclipse.jdt.annotation.NonNull%> CollectionValue includingAll = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation%>.INSTANCE.evaluate(BOXED_namedElements, BOXED_elements);\nfinal <%java.util.List%><? extends <%java.lang.Object%>> UNBOXED_includingAll = includingAll.asEcoreObjects(idResolver, <%java.lang.Object%>.class);\nassert UNBOXED_includingAll != null;\nCTORid_namedElements.initValue(symbol_0, UNBOXED_includingAll);\nreturn symbol_0;'"
	 * @generated
	 */
	<NE extends Employee> LookupEnvironment addElements(Collection<NE> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * LookupEnvironment{namedElements = namedElements->including(element)}\n \052/\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.evaluation.@<%org.eclipse.jdt.annotation.NonNull%> Executor executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.ids.@<%org.eclipse.jdt.annotation.NonNull%> IdResolver idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.@<%org.eclipse.jdt.annotation.NonNull%> Property CTORid_namedElements = idResolver.getProperty(<%org.xtext.example.company.lookup.LookupTables%>.PROPid_namedElements);\nfinal /*@NonInvalid\052/ org.eclipse.ocl.pivot.@<%org.eclipse.jdt.annotation.NonNull%> Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(<%org.xtext.example.company.lookup.LookupTables%>.CLSSid_LookupEnvironment, null);\nfinal /*@Thrown\052/ org.xtext.example.company.lookup.@<%org.eclipse.jdt.annotation.NonNull%> LookupEnvironment symbol_0 = (<%org.xtext.example.company.lookup.LookupEnvironment%>)TYP_lookup_c_c_LookupEnvironment_0.createInstance();\n@SuppressWarnings(\"null\")\nfinal /*@Thrown\052/ java.util.@<%org.eclipse.jdt.annotation.NonNull%> List<<%org.xtext.example.company.Employee%>> namedElements = this.getNamedElements();\nfinal /*@Thrown\052/ org.eclipse.ocl.pivot.values.@<%org.eclipse.jdt.annotation.NonNull%> OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(<%org.xtext.example.company.lookup.LookupTables%>.ORD_CLSSid_Employee, namedElements);\nfinal /*@Thrown\052/ org.eclipse.ocl.pivot.values.@<%org.eclipse.jdt.annotation.NonNull%> OrderedSetValue including = (<%org.eclipse.ocl.pivot.values.OrderedSetValue%>)<%org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation%>.INSTANCE.evaluate(BOXED_namedElements, element);\nfinal <%java.util.List%><<%org.xtext.example.company.Employee%>> UNBOXED_including = including.asEcoreObjects(idResolver, <%org.xtext.example.company.Employee%>.class);\nassert UNBOXED_including != null;\nCTORid_namedElements.initValue(symbol_0, UNBOXED_including);\nreturn symbol_0;'"
	 * @generated
	 */
	LookupEnvironment addElement(Employee element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Enviroment::hasFinalResult() has been created for CG purposes. Don\'t call this method\");'"
	 * @generated
	 */
	boolean hasFinalResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.xtext.example.company.lookup.Executor"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Enviroment::getEvaluator() has been created for CG purposes. Don\'t call this method\");'"
	 * @generated
	 */
	Executor getExecutor();

} // LookupEnvironment
