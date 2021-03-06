/*
 * generated by Xtext 2.10.0
 */
grammar InternalMacros;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.macros.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.macros.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.macros.services.MacrosGrammarAccess;

}

@parser::members {

 	private MacrosGrammarAccess grammarAccess;

    public InternalMacrosParser(TokenStream input, MacrosGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MainRule";
   	}

   	@Override
   	protected MacrosGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMainRule
entryRuleMainRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMainRuleRule()); }
	iv_ruleMainRule=ruleMainRule
	{ $current=$iv_ruleMainRule.current; }
	EOF;

// Rule MainRule
ruleMainRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMainRuleAccess().getVersionVersion_StatementParserRuleCall_0_0());
				}
				lv_version_0_0=ruleVersion_Statement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainRuleRule());
					}
					set(
						$current,
						"version",
						lv_version_0_0,
						"org.xtext.example.macros.Macros.Version_Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMainRuleAccess().getStatementStatementParserRuleCall_1_0());
				}
				lv_statement_1_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainRuleRule());
					}
					add(
						$current,
						"statement",
						lv_statement_1_0,
						"org.xtext.example.macros.Macros.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleVersion_Statement
entryRuleVersion_Statement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVersion_StatementRule()); }
	iv_ruleVersion_Statement=ruleVersion_Statement
	{ $current=$iv_ruleVersion_Statement.current; }
	EOF;

// Rule Version_Statement
ruleVersion_Statement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVersion_StatementAccess().getVersion_StatementAction_0(),
					$current);
			}
		)
		otherlv_1='VERSION'
		{
			newLeafNode(otherlv_1, grammarAccess.getVersion_StatementAccess().getVERSIONKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVersion_StatementAccess().getAttributeVersion_attrParserRuleCall_2_0());
				}
				lv_attribute_2_0=ruleVersion_attr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVersion_StatementRule());
					}
					set(
						$current,
						"attribute",
						lv_attribute_2_0,
						"org.xtext.example.macros.Macros.Version_attr");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getTag_StatementParserRuleCall_0());
		}
		this_Tag_Statement_0=ruleTag_Statement
		{
			$current = $this_Tag_Statement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getUrl_StatementParserRuleCall_1());
		}
		this_Url_Statement_1=ruleUrl_Statement
		{
			$current = $this_Url_Statement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getTab_StatementParserRuleCall_2());
		}
		this_Tab_Statement_2=ruleTab_Statement
		{
			$current = $this_Tab_Statement_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTag_Statement
entryRuleTag_Statement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTag_StatementRule()); }
	iv_ruleTag_Statement=ruleTag_Statement
	{ $current=$iv_ruleTag_Statement.current; }
	EOF;

// Rule Tag_Statement
ruleTag_Statement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTag_StatementAccess().getTag_StatementAction_0(),
					$current);
			}
		)
		otherlv_1='TAG'
		{
			newLeafNode(otherlv_1, grammarAccess.getTag_StatementAccess().getTAGKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTag_StatementAccess().getTagsTag_attrParserRuleCall_2_0());
				}
				lv_tags_2_0=ruleTag_attr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTag_StatementRule());
					}
					add(
						$current,
						"tags",
						lv_tags_2_0,
						"org.xtext.example.macros.Macros.Tag_attr");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleUrl_Statement
entryRuleUrl_Statement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUrl_StatementRule()); }
	iv_ruleUrl_Statement=ruleUrl_Statement
	{ $current=$iv_ruleUrl_Statement.current; }
	EOF;

// Rule Url_Statement
ruleUrl_Statement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUrl_StatementAccess().getUrl_StatementAction_0(),
					$current);
			}
		)
		otherlv_1='URL'
		{
			newLeafNode(otherlv_1, grammarAccess.getUrl_StatementAccess().getURLKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUrl_StatementAccess().getUrlsUrl_attrParserRuleCall_2_0());
				}
				lv_urls_2_0=ruleurl_attr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUrl_StatementRule());
					}
					add(
						$current,
						"urls",
						lv_urls_2_0,
						"org.xtext.example.macros.Macros.url_attr");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTab_Statement
entryRuleTab_Statement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTab_StatementRule()); }
	iv_ruleTab_Statement=ruleTab_Statement
	{ $current=$iv_ruleTab_Statement.current; }
	EOF;

// Rule Tab_Statement
ruleTab_Statement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTab_StatementAccess().getTab_StatementAction_0(),
					$current);
			}
		)
		otherlv_1='TAB'
		{
			newLeafNode(otherlv_1, grammarAccess.getTab_StatementAccess().getTABKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTab_StatementAccess().getTabsTab_attrParserRuleCall_2_0());
				}
				lv_tabs_2_0=ruletab_attr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTab_StatementRule());
					}
					add(
						$current,
						"tabs",
						lv_tabs_2_0,
						"org.xtext.example.macros.Macros.tab_attr");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleVersion_attr
entryRuleVersion_attr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVersion_attrRule()); }
	iv_ruleVersion_attr=ruleVersion_attr
	{ $current=$iv_ruleVersion_attr.current; }
	EOF;

// Rule Version_attr
ruleVersion_attr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='BUILD'
		{
			newLeafNode(otherlv_0, grammarAccess.getVersion_attrAccess().getBUILDKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getVersion_attrAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_DQVAL
				{
					newLeafNode(lv_value_2_0, grammarAccess.getVersion_attrAccess().getValueDQVALTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVersion_attrRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.macros.Macros.DQVAL");
				}
			)
		)
	)
;

// Entry rule entryRuleTag_attr
entryRuleTag_attr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTag_attrRule()); }
	iv_ruleTag_attr=ruleTag_attr
	{ $current=$iv_ruleTag_attr.current; }
	EOF;

// Rule Tag_attr
ruleTag_attr returns [EObject current=null]
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
					lv_tag_0_1='TYPE'
					{
						newLeafNode(lv_tag_0_1, grammarAccess.getTag_attrAccess().getTagTYPEKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTag_attrRule());
						}
						setWithLastConsumed($current, "tag", lv_tag_0_1, null);
					}
					    |
					lv_tag_0_2='ATTR'
					{
						newLeafNode(lv_tag_0_2, grammarAccess.getTag_attrAccess().getTagATTRKeyword_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTag_attrRule());
						}
						setWithLastConsumed($current, "tag", lv_tag_0_2, null);
					}
					    |
					lv_tag_0_3='POS'
					{
						newLeafNode(lv_tag_0_3, grammarAccess.getTag_attrAccess().getTagPOSKeyword_0_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTag_attrRule());
						}
						setWithLastConsumed($current, "tag", lv_tag_0_3, null);
					}
					    |
					lv_tag_0_4='CONTENT'
					{
						newLeafNode(lv_tag_0_4, grammarAccess.getTag_attrAccess().getTagCONTENTKeyword_0_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTag_attrRule());
						}
						setWithLastConsumed($current, "tag", lv_tag_0_4, null);
					}
				)
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getTag_attrAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_DQVAL
				{
					newLeafNode(lv_value_2_0, grammarAccess.getTag_attrAccess().getValueDQVALTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTag_attrRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.macros.Macros.DQVAL");
				}
			)
		)
	)
;

// Entry rule entryRuleurl_attr
entryRuleurl_attr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUrl_attrRule()); }
	iv_ruleurl_attr=ruleurl_attr
	{ $current=$iv_ruleurl_attr.current; }
	EOF;

// Rule url_attr
ruleurl_attr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GOTO'
		{
			newLeafNode(otherlv_0, grammarAccess.getUrl_attrAccess().getGOTOKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getUrl_attrAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_DQVAL
				{
					newLeafNode(lv_value_2_0, grammarAccess.getUrl_attrAccess().getValueDQVALTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUrl_attrRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.macros.Macros.DQVAL");
				}
			)
		)
	)
;

// Entry rule entryRuletab_attr
entryRuletab_attr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTab_attrRule()); }
	iv_ruletab_attr=ruletab_attr
	{ $current=$iv_ruletab_attr.current; }
	EOF;

// Rule tab_attr
ruletab_attr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='T'
		{
			newLeafNode(otherlv_0, grammarAccess.getTab_attrAccess().getTKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getTab_attrAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_DQVAL
				{
					newLeafNode(lv_value_2_0, grammarAccess.getTab_attrAccess().getValueDQVALTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTab_attrRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.macros.Macros.DQVAL");
				}
			)
		)
	)
;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_DQVAL : ~((' '|'\t'|'\r'|'\n'))+;
