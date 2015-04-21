/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Element CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getPathElementCS()
 * @model
 * @generated
 */
public interface PathElementCS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getPathElementCS_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.source.PathNameCS#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' container reference.
	 * @see #setPathName(PathNameCS)
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getPathElementCS_PathName()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.PathNameCS#getPath
	 * @model opposite="path" required="true" transient="false"
	 * @generated
	 */
	PathNameCS getPathName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS#getPathName <em>Path Name</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' container reference.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(PathNameCS value);

} // PathElementCS
