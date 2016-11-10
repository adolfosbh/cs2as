/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.plsql.dDL.DDLPackage
 * @generated
 */
public interface DDLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DDLFactory eINSTANCE = org.xtext.example.plsql.dDL.impl.DDLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Data definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data definition</em>'.
   * @generated
   */
  Data_definition createData_definition();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Create table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create table</em>'.
   * @generated
   */
  Create_table createCreate_table();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Alter table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter table</em>'.
   * @generated
   */
  Alter_table createAlter_table();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns a new object of class '<em>Create sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create sequence</em>'.
   * @generated
   */
  Create_sequence createCreate_sequence();

  /**
   * Returns a new object of class '<em>Sequence options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence options</em>'.
   * @generated
   */
  Sequence_options createSequence_options();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key</em>'.
   * @generated
   */
  Key createKey();

  /**
   * Returns a new object of class '<em>Primary key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary key</em>'.
   * @generated
   */
  Primary_key createPrimary_key();

  /**
   * Returns a new object of class '<em>Unique key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique key</em>'.
   * @generated
   */
  Unique_key createUnique_key();

  /**
   * Returns a new object of class '<em>Foreign key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreign key</em>'.
   * @generated
   */
  Foreign_key createForeign_key();

  /**
   * Returns a new object of class '<em>Colname</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Colname</em>'.
   * @generated
   */
  Colname createColname();

  /**
   * Returns a new object of class '<em>Tabname</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tabname</em>'.
   * @generated
   */
  Tabname createTabname();

  /**
   * Returns a new object of class '<em>ISNULL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ISNULL</em>'.
   * @generated
   */
  ISNULL createISNULL();

  /**
   * Returns a new object of class '<em>TYPE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TYPE</em>'.
   * @generated
   */
  TYPE createTYPE();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DDLPackage getDDLPackage();

} //DDLFactory