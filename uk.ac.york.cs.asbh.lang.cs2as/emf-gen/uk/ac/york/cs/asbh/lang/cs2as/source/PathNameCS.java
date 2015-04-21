/**
 */
package uk.ac.york.cs.asbh.lang.cs2as.source;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Name CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.asbh.lang.cs2as.source.PathNameCS#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getPathNameCS()
 * @model
 * @generated
 */
public interface PathNameCS extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.SourcePackage#getPathNameCS_Path()
	 * @see uk.ac.york.cs.asbh.lang.cs2as.source.PathElementCS#getPathName
	 * @model opposite="pathName" containment="true" required="true"
	 * @generated
	 */
	EList<PathElementCS> getPath();

} // PathNameCS
