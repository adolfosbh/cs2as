/**
 */
package ocldependencyanalysis.cs2asanalysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocldependencyanalysis.cs2asanalysis.ClassRef#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getClassRef()
 * @model abstract="true"
 * @generated
 */
public interface ClassRef extends CS2ASAnalysisNode {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(org.eclipse.ocl.pivot.Class)
	 * @see ocldependencyanalysis.cs2asanalysis.CS2ASAnalysisPackage#getClassRef_Class()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.ocl.pivot.Class getClass_();

	/**
	 * Sets the value of the '{@link ocldependencyanalysis.cs2asanalysis.ClassRef#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.eclipse.ocl.pivot.Class value);

} // ClassRef
