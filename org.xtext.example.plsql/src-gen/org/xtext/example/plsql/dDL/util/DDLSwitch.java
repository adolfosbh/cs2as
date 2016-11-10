/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.plsql.dDL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.plsql.dDL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.plsql.dDL.DDLPackage
 * @generated
 */
public class DDLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DDLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DDLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DDLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DDLPackage.DATA_DEFINITION:
      {
        Data_definition data_definition = (Data_definition)theEObject;
        T result = caseData_definition(data_definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.CREATE_TABLE:
      {
        Create_table create_table = (Create_table)theEObject;
        T result = caseCreate_table(create_table);
        if (result == null) result = caseDefinition(create_table);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.COLUMN:
      {
        Column column = (Column)theEObject;
        T result = caseColumn(column);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.ALTER_TABLE:
      {
        Alter_table alter_table = (Alter_table)theEObject;
        T result = caseAlter_table(alter_table);
        if (result == null) result = caseDefinition(alter_table);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseDefinition(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.CREATE_SEQUENCE:
      {
        Create_sequence create_sequence = (Create_sequence)theEObject;
        T result = caseCreate_sequence(create_sequence);
        if (result == null) result = caseDefinition(create_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.SEQUENCE_OPTIONS:
      {
        Sequence_options sequence_options = (Sequence_options)theEObject;
        T result = caseSequence_options(sequence_options);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.KEY:
      {
        Key key = (Key)theEObject;
        T result = caseKey(key);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.PRIMARY_KEY:
      {
        Primary_key primary_key = (Primary_key)theEObject;
        T result = casePrimary_key(primary_key);
        if (result == null) result = caseKey(primary_key);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.UNIQUE_KEY:
      {
        Unique_key unique_key = (Unique_key)theEObject;
        T result = caseUnique_key(unique_key);
        if (result == null) result = caseKey(unique_key);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.FOREIGN_KEY:
      {
        Foreign_key foreign_key = (Foreign_key)theEObject;
        T result = caseForeign_key(foreign_key);
        if (result == null) result = caseKey(foreign_key);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.COLNAME:
      {
        Colname colname = (Colname)theEObject;
        T result = caseColname(colname);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.TABNAME:
      {
        Tabname tabname = (Tabname)theEObject;
        T result = caseTabname(tabname);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.ISNULL:
      {
        ISNULL isnull = (ISNULL)theEObject;
        T result = caseISNULL(isnull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DDLPackage.TYPE:
      {
        TYPE type = (TYPE)theEObject;
        T result = caseTYPE(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData_definition(Data_definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreate_table(Create_table object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumn(Column object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alter table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alter table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlter_table(Alter_table object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreate_sequence(Create_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequence_options(Sequence_options object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKey(Key object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimary_key(Primary_key object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unique key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unique key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnique_key(Unique_key object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreign key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreign key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeign_key(Foreign_key object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Colname</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Colname</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColname(Colname object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tabname</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tabname</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabname(Tabname object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISNULL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISNULL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISNULL(ISNULL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TYPE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TYPE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTYPE(TYPE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DDLSwitch
