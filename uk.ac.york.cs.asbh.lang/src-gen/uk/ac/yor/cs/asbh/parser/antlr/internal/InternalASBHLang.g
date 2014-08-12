/*
* generated by Xtext
*/
grammar InternalASBHLang;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uk.ac.yor.cs.asbh.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.yor.cs.asbh.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.yor.cs.asbh.services.ASBHLangGrammarAccess;

}

@parser::members {

 	private ASBHLangGrammarAccess grammarAccess;
 	
    public InternalASBHLangParser(TokenStream input, ASBHLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Root";	
   	}
   	
   	@Override
   	protected ASBHLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	 iv_ruleRoot=ruleRoot 
	 { $current=$iv_ruleRoot.current; } 
	 EOF 
;

// Rule Root
ruleRoot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRootAccess().getRootAction_0(),
            $current);
    }
)	otherlv_1='Root' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='ownedX' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRootAccess().getOwnedXKeyword_3_0());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_2_0()); 
	    }
		lv_ownedX_5_0=ruleX		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRootRule());
	        }
       		add(
       			$current, 
       			"ownedX",
        		lv_ownedX_5_0, 
        		"X");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRootAccess().getCommaKeyword_3_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_3_1_0()); 
	    }
		lv_ownedX_7_0=ruleX		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRootRule());
	        }
       		add(
       			$current, 
       			"ownedX",
        		lv_ownedX_7_0, 
        		"X");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_3_4());
    }
)?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleY
entryRuleY returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getYRule()); }
	 iv_ruleY=ruleY 
	 { $current=$iv_ruleY.current; } 
	 EOF 
;

// Rule Y
ruleY returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 
    }
    this_Y1_0=ruleY1
    { 
        $current = $this_Y1_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 
    }
    this_Y2_1=ruleY2
    { 
        $current = $this_Y2_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleX
entryRuleX returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getXRule()); }
	 iv_ruleX=ruleX 
	 { $current=$iv_ruleX.current; } 
	 EOF 
;

// Rule X
ruleX returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getXAccess().getXAction_0(),
            $current);
    }
)(
(
		lv_isA1_1_0=	'isA1' 
    {
        newLeafNode(lv_isA1_1_0, grammarAccess.getXAccess().getIsA1IsA1Keyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getXRule());
	        }
       		setWithLastConsumed($current, "isA1", true, "isA1");
	    }

)
)?	otherlv_2='X' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getXAccess().getXKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getXAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='ownsY' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getXAccess().getOwnsYKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXAccess().getOwnsYYParserRuleCall_4_1_0()); 
	    }
		lv_ownsY_5_0=ruleY		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXRule());
	        }
       		set(
       			$current, 
       			"ownsY",
        		lv_ownsY_5_0, 
        		"Y");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getXAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleZ
entryRuleZ returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getZRule()); }
	 iv_ruleZ=ruleZ 
	 { $current=$iv_ruleZ.current; } 
	 EOF 
;

// Rule Z
ruleZ returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getZAccess().getZAction_0(),
            $current);
    }
)	otherlv_1='Z' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getZAccess().getZKeyword_1());
    }
)
;





// Entry rule entryRuleY1
entryRuleY1 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getY1Rule()); }
	 iv_ruleY1=ruleY1 
	 { $current=$iv_ruleY1.current; } 
	 EOF 
;

// Rule Y1
ruleY1 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getY1Access().getY1Action_0(),
            $current);
    }
)	otherlv_1='Y1' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getY1Access().getY1Keyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getY1Access().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getY1Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getY1Access().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='ownsZ' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getY1Access().getOwnsZKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getY1Access().getOwnsZZParserRuleCall_4_1_0()); 
	    }
		lv_ownsZ_5_0=ruleZ		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getY1Rule());
	        }
       		set(
       			$current, 
       			"ownsZ",
        		lv_ownsZ_5_0, 
        		"Z");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getY1Access().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleY2
entryRuleY2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getY2Rule()); }
	 iv_ruleY2=ruleY2 
	 { $current=$iv_ruleY2.current; } 
	 EOF 
;

// Rule Y2
ruleY2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getY2Access().getY2Action_0(),
            $current);
    }
)	otherlv_1='Y2' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getY2Access().getY2Keyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getY2Access().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getY2Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getY2Access().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='ownsZ' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getY2Access().getOwnsZKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getY2Access().getOwnsZZParserRuleCall_4_1_0()); 
	    }
		lv_ownsZ_5_0=ruleZ		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getY2Rule());
	        }
       		set(
       			$current, 
       			"ownsZ",
        		lv_ownsZ_5_0, 
        		"Z");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getY2Access().getRightCurlyBracketKeyword_5());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

