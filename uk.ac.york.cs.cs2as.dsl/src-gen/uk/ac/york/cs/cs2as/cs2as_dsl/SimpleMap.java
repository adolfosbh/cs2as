/**
 */
package uk.ac.york.cs.cs2as.cs2as_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.cs2as.cs2as_dsl.SimpleMap#getMappedProperties <em>Mapped Properties</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getSimpleMap()
 * @model
 * @generated
 */
public interface SimpleMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapped Properties</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.cs2as.cs2as_dsl.PropertyMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Properties</em>' containment reference list.
   * @see uk.ac.york.cs.cs2as.cs2as_dsl.Cs2as_dslPackage#getSimpleMap_MappedProperties()
   * @model containment="true"
   * @generated
   */
  EList<PropertyMap> getMappedProperties();

} // SimpleMap
