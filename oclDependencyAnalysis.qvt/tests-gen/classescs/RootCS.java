/**
 */
package classescs;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link classescs.RootCS#getOwnedPackages <em>Owned Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see classescs.ClassescsPackage#getRootCS()
 * @model
 * @generated
 */
public interface RootCS extends ElementCS {
	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' containment reference list.
	 * The list contents are of type {@link classescs.PackageCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' containment reference list.
	 * @see classescs.ClassescsPackage#getRootCS_OwnedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageCS> getOwnedPackages();

} // RootCS
