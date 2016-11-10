/*
 * generated by Xtext 2.10.0
 */
grammar InternalDDL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.plsql.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.plsql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.plsql.services.DDLGrammarAccess;

}

@parser::members {

 	private DDLGrammarAccess grammarAccess;

    public InternalDDLParser(TokenStream input, DDLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Data_definition";
   	}

   	@Override
   	protected DDLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleData_definition
entryRuleData_definition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getData_definitionRule()); }
	iv_ruleData_definition=ruleData_definition
	{ $current=$iv_ruleData_definition.current; }
	EOF;

// Rule Data_definition
ruleData_definition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getData_definitionAccess().getDefinitionsDefinitionParserRuleCall_0());
			}
			lv_definitions_0_0=ruleDefinition
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getData_definitionRule());
				}
				add(
					$current,
					"definitions",
					lv_definitions_0_0,
					"org.xtext.example.plsql.DDL.Definition");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getCreate_tableParserRuleCall_0());
		}
		this_Create_table_0=ruleCreate_table
		{
			$current = $this_Create_table_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getAlter_tableParserRuleCall_1());
		}
		this_Alter_table_1=ruleAlter_table
		{
			$current = $this_Alter_table_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getCreate_sequenceParserRuleCall_2());
		}
		this_Create_sequence_2=ruleCreate_sequence
		{
			$current = $this_Create_sequence_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getCommentParserRuleCall_3());
		}
		this_Comment_3=ruleComment
		{
			$current = $this_Comment_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCreate_table
entryRuleCreate_table returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreate_tableRule()); }
	iv_ruleCreate_table=ruleCreate_table
	{ $current=$iv_ruleCreate_table.current; }
	EOF;

// Rule Create_table
ruleCreate_table returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CREATE'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreate_tableAccess().getCREATEKeyword_0());
		}
		otherlv_1='TABLE'
		{
			newLeafNode(otherlv_1, grammarAccess.getCreate_tableAccess().getTABLEKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_ID
				{
					newLeafNode(lv_id_2_0, grammarAccess.getCreate_tableAccess().getIdIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreate_tableRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getCreate_tableAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreate_tableAccess().getColumnsColumnParserRuleCall_4_0());
				}
				lv_columns_4_0=ruleColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreate_tableRule());
					}
					add(
						$current,
						"columns",
						lv_columns_4_0,
						"org.xtext.example.plsql.DDL.Column");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getCreate_tableAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCreate_tableAccess().getColumnsColumnParserRuleCall_5_1_0());
					}
					lv_columns_6_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCreate_tableRule());
						}
						add(
							$current,
							"columns",
							lv_columns_6_0,
							"org.xtext.example.plsql.DDL.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getCreate_tableAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCreate_tableAccess().getConstraintsConstraintParserRuleCall_6_1_0());
					}
					lv_constraints_8_0=ruleConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCreate_tableRule());
						}
						add(
							$current,
							"constraints",
							lv_constraints_8_0,
							"org.xtext.example.plsql.DDL.Constraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getCreate_tableAccess().getRightParenthesisKeyword_7());
		}
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getCreate_tableAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_id_0_0=RULE_ID
				{
					newLeafNode(lv_id_0_0, grammarAccess.getColumnAccess().getIdIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColumnRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getColumnAccess().getTypeTYPEParserRuleCall_1_0());
				}
				lv_type_1_0=ruleTYPE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColumnRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"org.xtext.example.plsql.DDL.TYPE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					lv_number_3_0=RULE_INT
					{
						newLeafNode(lv_number_3_0, grammarAccess.getColumnAccess().getNumberINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColumnRule());
						}
						setWithLastConsumed(
							$current,
							"number",
							lv_number_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getRightParenthesisKeyword_2_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getColumnAccess().getIsNullISNULLParserRuleCall_3_0());
				}
				lv_isNull_5_0=ruleISNULL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColumnRule());
					}
					set(
						$current,
						"isNull",
						lv_isNull_5_0,
						"org.xtext.example.plsql.DDL.ISNULL");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleAlter_table
entryRuleAlter_table returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlter_tableRule()); }
	iv_ruleAlter_table=ruleAlter_table
	{ $current=$iv_ruleAlter_table.current; }
	EOF;

// Rule Alter_table
ruleAlter_table returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ALTER'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlter_tableAccess().getALTERKeyword_0());
		}
		otherlv_1='TABLE'
		{
			newLeafNode(otherlv_1, grammarAccess.getAlter_tableAccess().getTABLEKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlter_tableAccess().getTabnameTabnameParserRuleCall_2_0());
				}
				lv_tabname_2_0=ruleTabname
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlter_tableRule());
					}
					set(
						$current,
						"tabname",
						lv_tabname_2_0,
						"org.xtext.example.plsql.DDL.Tabname");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					(
						lv_add_3_0='ADD'
						{
							newLeafNode(lv_add_3_0, grammarAccess.getAlter_tableAccess().getAddADDKeyword_3_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAlter_tableRule());
							}
							setWithLastConsumed($current, "add", lv_add_3_0, "ADD");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getAlter_tableAccess().getConstraintConstraintParserRuleCall_3_0_1_0());
						}
						lv_constraint_4_0=ruleConstraint
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAlter_tableRule());
							}
							set(
								$current,
								"constraint",
								lv_constraint_4_0,
								"org.xtext.example.plsql.DDL.Constraint");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					(
						(
							lv_enable_5_0='ENABLE'
							{
								newLeafNode(lv_enable_5_0, grammarAccess.getAlter_tableAccess().getEnableENABLEKeyword_3_1_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAlter_tableRule());
								}
								setWithLastConsumed($current, "enable", lv_enable_5_0, "ENABLE");
							}
						)
					)
					otherlv_6='CONSTRAINT'
					{
						newLeafNode(otherlv_6, grammarAccess.getAlter_tableAccess().getCONSTRAINTKeyword_3_1_0_1());
					}
				)
				(
					(
						lv_id_7_0=RULE_ID
						{
							newLeafNode(lv_id_7_0, grammarAccess.getAlter_tableAccess().getIdIDTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAlter_tableRule());
							}
							setWithLastConsumed(
								$current,
								"id",
								lv_id_7_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getAlter_tableAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleComment
entryRuleComment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommentRule()); }
	iv_ruleComment=ruleComment
	{ $current=$iv_ruleComment.current; }
	EOF;

// Rule Comment
ruleComment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='COMMENT'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCOMMENTKeyword_0());
		}
		otherlv_1='ON'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getONKeyword_1());
		}
		(
			(
				otherlv_2='TABLE'
				{
					newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getTABLEKeyword_2_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCommentAccess().getTabnameTabnameParserRuleCall_2_0_1_0());
						}
						lv_tabname_3_0=ruleTabname
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCommentRule());
							}
							set(
								$current,
								"tabname",
								lv_tabname_3_0,
								"org.xtext.example.plsql.DDL.Tabname");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_4='COLUMN'
				{
					newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getCOLUMNKeyword_2_1_0());
				}
				(
					(
						lv_columnId_5_0=RULE_ID
						{
							newLeafNode(lv_columnId_5_0, grammarAccess.getCommentAccess().getColumnIdIDTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCommentRule());
							}
							setWithLastConsumed(
								$current,
								"columnId",
								lv_columnId_5_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				otherlv_6='.'
				{
					newLeafNode(otherlv_6, grammarAccess.getCommentAccess().getFullStopKeyword_2_1_2());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCommentAccess().getColnameColnameParserRuleCall_2_1_3_0());
						}
						lv_colname_7_0=ruleColname
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCommentRule());
							}
							set(
								$current,
								"colname",
								lv_colname_7_0,
								"org.xtext.example.plsql.DDL.Colname");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		otherlv_8='IS'
		{
			newLeafNode(otherlv_8, grammarAccess.getCommentAccess().getISKeyword_3());
		}
		(
			(
				lv_string_9_0=RULE_STRING
				{
					newLeafNode(lv_string_9_0, grammarAccess.getCommentAccess().getStringSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommentRule());
					}
					setWithLastConsumed(
						$current,
						"string",
						lv_string_9_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getCommentAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleCreate_sequence
entryRuleCreate_sequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreate_sequenceRule()); }
	iv_ruleCreate_sequence=ruleCreate_sequence
	{ $current=$iv_ruleCreate_sequence.current; }
	EOF;

// Rule Create_sequence
ruleCreate_sequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CREATE'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreate_sequenceAccess().getCREATEKeyword_0());
		}
		otherlv_1='SEQUENCE'
		{
			newLeafNode(otherlv_1, grammarAccess.getCreate_sequenceAccess().getSEQUENCEKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_ID
				{
					newLeafNode(lv_id_2_0, grammarAccess.getCreate_sequenceAccess().getIdIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreate_sequenceRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCreate_sequenceAccess().getSequence_optionsSequence_optionsParserRuleCall_3_0());
				}
				lv_sequence_options_3_0=ruleSequence_options
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreate_sequenceRule());
					}
					add(
						$current,
						"sequence_options",
						lv_sequence_options_3_0,
						"org.xtext.example.plsql.DDL.Sequence_options");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getCreate_sequenceAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleSequence_options
entryRuleSequence_options returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSequence_optionsRule()); }
	iv_ruleSequence_options=ruleSequence_options
	{ $current=$iv_ruleSequence_options.current; }
	EOF;

// Rule Sequence_options
ruleSequence_options returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_increment_0_0='INCREMENT'
					{
						newLeafNode(lv_increment_0_0, grammarAccess.getSequence_optionsAccess().getIncrementINCREMENTKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSequence_optionsRule());
						}
						setWithLastConsumed($current, "increment", lv_increment_0_0, "INCREMENT");
					}
				)
			)
			otherlv_1='BY'
			{
				newLeafNode(otherlv_1, grammarAccess.getSequence_optionsAccess().getBYKeyword_0_1());
			}
			this_INT_2=RULE_INT
			{
				newLeafNode(this_INT_2, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_0_2());
			}
		)
		    |
		(
			(
				(
					lv_start_3_0='START'
					{
						newLeafNode(lv_start_3_0, grammarAccess.getSequence_optionsAccess().getStartSTARTKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSequence_optionsRule());
						}
						setWithLastConsumed($current, "start", lv_start_3_0, "START");
					}
				)
			)
			otherlv_4='WITH'
			{
				newLeafNode(otherlv_4, grammarAccess.getSequence_optionsAccess().getWITHKeyword_1_1());
			}
			this_INT_5=RULE_INT
			{
				newLeafNode(this_INT_5, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_1_2());
			}
		)
		    |
		(
			(
				(
					lv_maxvalue_6_0='MAXVALUE'
					{
						newLeafNode(lv_maxvalue_6_0, grammarAccess.getSequence_optionsAccess().getMaxvalueMAXVALUEKeyword_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSequence_optionsRule());
						}
						setWithLastConsumed($current, "maxvalue", lv_maxvalue_6_0, "MAXVALUE");
					}
				)
			)
			this_INT_7=RULE_INT
			{
				newLeafNode(this_INT_7, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_2_1());
			}
		)
		    |
		(
			(
				lv_nomaxvalue_8_0='NOMAXVALUE'
				{
					newLeafNode(lv_nomaxvalue_8_0, grammarAccess.getSequence_optionsAccess().getNomaxvalueNOMAXVALUEKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSequence_optionsRule());
					}
					setWithLastConsumed($current, "nomaxvalue", lv_nomaxvalue_8_0, "NOMAXVALUE");
				}
			)
		)
		    |
		(
			(
				(
					lv_minvalue_9_0='MINVALUE'
					{
						newLeafNode(lv_minvalue_9_0, grammarAccess.getSequence_optionsAccess().getMinvalueMINVALUEKeyword_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSequence_optionsRule());
						}
						setWithLastConsumed($current, "minvalue", lv_minvalue_9_0, "MINVALUE");
					}
				)
			)
			this_INT_10=RULE_INT
			{
				newLeafNode(this_INT_10, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_4_1());
			}
		)
		    |
		(
			(
				lv_nominvalue_11_0='NOMINVALUE'
				{
					newLeafNode(lv_nominvalue_11_0, grammarAccess.getSequence_optionsAccess().getNominvalueNOMINVALUEKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSequence_optionsRule());
					}
					setWithLastConsumed($current, "nominvalue", lv_nominvalue_11_0, "NOMINVALUE");
				}
			)
		)
		    |
		(
			(
				lv_cycle_12_0='CYCLE'
				{
					newLeafNode(lv_cycle_12_0, grammarAccess.getSequence_optionsAccess().getCycleCYCLEKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSequence_optionsRule());
					}
					setWithLastConsumed($current, "cycle", lv_cycle_12_0, "CYCLE");
				}
			)
		)
		    |
		(
			(
				lv_nocycle_13_0='NOCYCLE'
				{
					newLeafNode(lv_nocycle_13_0, grammarAccess.getSequence_optionsAccess().getNocycleNOCYCLEKeyword_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSequence_optionsRule());
					}
					setWithLastConsumed($current, "nocycle", lv_nocycle_13_0, "NOCYCLE");
				}
			)
		)
		    |
		(
			(
				(
					lv_cache_14_0='CACHE'
					{
						newLeafNode(lv_cache_14_0, grammarAccess.getSequence_optionsAccess().getCacheCACHEKeyword_8_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSequence_optionsRule());
						}
						setWithLastConsumed($current, "cache", lv_cache_14_0, "CACHE");
					}
				)
			)
			this_INT_15=RULE_INT
			{
				newLeafNode(this_INT_15, grammarAccess.getSequence_optionsAccess().getINTTerminalRuleCall_8_1());
			}
		)
		    |
		(
			(
				lv_nocache_16_0='NOCACHE'
				{
					newLeafNode(lv_nocache_16_0, grammarAccess.getSequence_optionsAccess().getNocacheNOCACHEKeyword_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSequence_optionsRule());
					}
					setWithLastConsumed($current, "nocache", lv_nocache_16_0, "NOCACHE");
				}
			)
		)
		    |
		(
			(
				lv_order_17_0='ORDER'
				{
					newLeafNode(lv_order_17_0, grammarAccess.getSequence_optionsAccess().getOrderORDERKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSequence_optionsRule());
					}
					setWithLastConsumed($current, "order", lv_order_17_0, "ORDER");
				}
			)
		)
		    |
		(
			(
				lv_noorder_18_0='NOORDER'
				{
					newLeafNode(lv_noorder_18_0, grammarAccess.getSequence_optionsAccess().getNoorderNOORDERKeyword_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSequence_optionsRule());
					}
					setWithLastConsumed($current, "noorder", lv_noorder_18_0, "NOORDER");
				}
			)
		)
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CONSTRAINT'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCONSTRAINTKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getConstraintAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintAccess().getKeyKeyParserRuleCall_2_0());
				}
				lv_key_2_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintRule());
					}
					set(
						$current,
						"key",
						lv_key_2_0,
						"org.xtext.example.plsql.DDL.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleKey
entryRuleKey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeyRule()); }
	iv_ruleKey=ruleKey
	{ $current=$iv_ruleKey.current; }
	EOF;

// Rule Key
ruleKey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getKeyAccess().getPrimary_keyParserRuleCall_0());
		}
		this_Primary_key_0=rulePrimary_key
		{
			$current = $this_Primary_key_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getKeyAccess().getUnique_keyParserRuleCall_1());
		}
		this_Unique_key_1=ruleUnique_key
		{
			$current = $this_Unique_key_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getKeyAccess().getForeign_keyParserRuleCall_2());
		}
		this_Foreign_key_2=ruleForeign_key
		{
			$current = $this_Foreign_key_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimary_key
entryRulePrimary_key returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimary_keyRule()); }
	iv_rulePrimary_key=rulePrimary_key
	{ $current=$iv_rulePrimary_key.current; }
	EOF;

// Rule Primary_key
rulePrimary_key returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PRIMARY'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrimary_keyAccess().getPRIMARYKeyword_0());
		}
		otherlv_1='KEY'
		{
			newLeafNode(otherlv_1, grammarAccess.getPrimary_keyAccess().getKEYKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getPrimary_keyAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimary_keyAccess().getColNamesColnameParserRuleCall_3_0());
				}
				lv_colNames_3_0=ruleColname
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimary_keyRule());
					}
					add(
						$current,
						"colNames",
						lv_colNames_3_0,
						"org.xtext.example.plsql.DDL.Colname");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimary_keyAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimary_keyAccess().getColNamesColnameParserRuleCall_4_1_0());
					}
					lv_colNames_5_0=ruleColname
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimary_keyRule());
						}
						add(
							$current,
							"colNames",
							lv_colNames_5_0,
							"org.xtext.example.plsql.DDL.Colname");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getPrimary_keyAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleUnique_key
entryRuleUnique_key returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnique_keyRule()); }
	iv_ruleUnique_key=ruleUnique_key
	{ $current=$iv_ruleUnique_key.current; }
	EOF;

// Rule Unique_key
ruleUnique_key returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='UNIQUE'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnique_keyAccess().getUNIQUEKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getUnique_keyAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUnique_keyAccess().getColNamesColnameParserRuleCall_2_0());
				}
				lv_colNames_2_0=ruleColname
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnique_keyRule());
					}
					add(
						$current,
						"colNames",
						lv_colNames_2_0,
						"org.xtext.example.plsql.DDL.Colname");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getUnique_keyAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUnique_keyAccess().getColNamesColnameParserRuleCall_3_1_0());
					}
					lv_colNames_4_0=ruleColname
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnique_keyRule());
						}
						add(
							$current,
							"colNames",
							lv_colNames_4_0,
							"org.xtext.example.plsql.DDL.Colname");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getUnique_keyAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleForeign_key
entryRuleForeign_key returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForeign_keyRule()); }
	iv_ruleForeign_key=ruleForeign_key
	{ $current=$iv_ruleForeign_key.current; }
	EOF;

// Rule Foreign_key
ruleForeign_key returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FOREIGN'
		{
			newLeafNode(otherlv_0, grammarAccess.getForeign_keyAccess().getFOREIGNKeyword_0());
		}
		otherlv_1='KEY'
		{
			newLeafNode(otherlv_1, grammarAccess.getForeign_keyAccess().getKEYKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getForeign_keyAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeign_keyAccess().getColNamesColnameParserRuleCall_3_0());
				}
				lv_colNames_3_0=ruleColname
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeign_keyRule());
					}
					add(
						$current,
						"colNames",
						lv_colNames_3_0,
						"org.xtext.example.plsql.DDL.Colname");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getForeign_keyAccess().getRightParenthesisKeyword_4());
		}
		otherlv_5='REFERENCES'
		{
			newLeafNode(otherlv_5, grammarAccess.getForeign_keyAccess().getREFERENCESKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeign_keyAccess().getTabnameTabnameParserRuleCall_6_0());
				}
				lv_tabname_6_0=ruleTabname
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeign_keyRule());
					}
					set(
						$current,
						"tabname",
						lv_tabname_6_0,
						"org.xtext.example.plsql.DDL.Tabname");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='('
		{
			newLeafNode(otherlv_7, grammarAccess.getForeign_keyAccess().getLeftParenthesisKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeign_keyAccess().getColNamesColnameParserRuleCall_8_0());
				}
				lv_colNames_8_0=ruleColname
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeign_keyRule());
					}
					add(
						$current,
						"colNames",
						lv_colNames_8_0,
						"org.xtext.example.plsql.DDL.Colname");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getForeign_keyAccess().getRightParenthesisKeyword_9());
		}
	)
;

// Entry rule entryRuleColname
entryRuleColname returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColnameRule()); }
	iv_ruleColname=ruleColname
	{ $current=$iv_ruleColname.current; }
	EOF;

// Rule Colname
ruleColname returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_id_0_0=RULE_ID
			{
				newLeafNode(lv_id_0_0, grammarAccess.getColnameAccess().getIdIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getColnameRule());
				}
				setWithLastConsumed(
					$current,
					"id",
					lv_id_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleTabname
entryRuleTabname returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTabnameRule()); }
	iv_ruleTabname=ruleTabname
	{ $current=$iv_ruleTabname.current; }
	EOF;

// Rule Tabname
ruleTabname returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_id_0_0=RULE_ID
					{
						newLeafNode(lv_id_0_0, grammarAccess.getTabnameAccess().getIdIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTabnameRule());
						}
						setWithLastConsumed(
							$current,
							"id",
							lv_id_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_1='.'
			{
				newLeafNode(otherlv_1, grammarAccess.getTabnameAccess().getFullStopKeyword_0_1());
			}
		)?
		(
			(
				lv_basename_2_0=RULE_ID
				{
					newLeafNode(lv_basename_2_0, grammarAccess.getTabnameAccess().getBasenameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTabnameRule());
					}
					setWithLastConsumed(
						$current,
						"basename",
						lv_basename_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleISNULL
entryRuleISNULL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getISNULLRule()); }
	iv_ruleISNULL=ruleISNULL
	{ $current=$iv_ruleISNULL.current; }
	EOF;

// Rule ISNULL
ruleISNULL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_null_0_0='NULL'
				{
					newLeafNode(lv_null_0_0, grammarAccess.getISNULLAccess().getNullNULLKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getISNULLRule());
					}
					setWithLastConsumed($current, "null", true, "NULL");
				}
			)
		)
		    |
		(
			(
				(
					lv_nonNull_1_0='NOT'
					{
						newLeafNode(lv_nonNull_1_0, grammarAccess.getISNULLAccess().getNonNullNOTKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getISNULLRule());
						}
						setWithLastConsumed($current, "nonNull", true, "NOT");
					}
				)
			)
			otherlv_2='NULL'
			{
				newLeafNode(otherlv_2, grammarAccess.getISNULLAccess().getNULLKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleTYPE
entryRuleTYPE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTYPERule()); }
	iv_ruleTYPE=ruleTYPE
	{ $current=$iv_ruleTYPE.current; }
	EOF;

// Rule TYPE
ruleTYPE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_id_0_1='NUMBER'
				{
					newLeafNode(lv_id_0_1, grammarAccess.getTYPEAccess().getIdNUMBERKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTYPERule());
					}
					setWithLastConsumed($current, "id", lv_id_0_1, null);
				}
				    |
				lv_id_0_2='VARCHAR2'
				{
					newLeafNode(lv_id_0_2, grammarAccess.getTYPEAccess().getIdVARCHAR2Keyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTYPERule());
					}
					setWithLastConsumed($current, "id", lv_id_0_2, null);
				}
				    |
				lv_id_0_3='DATE'
				{
					newLeafNode(lv_id_0_3, grammarAccess.getTYPEAccess().getIdDATEKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTYPERule());
					}
					setWithLastConsumed($current, "id", lv_id_0_3, null);
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
