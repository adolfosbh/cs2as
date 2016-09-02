package org.xtext.example.abnf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.abnf.services.ABNFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalABNFParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLEARROW", "RULE_ARROW", "RULE_ID", "RULE_ABSTRACT", "RULE_WS", "';'", "'['", "'<'", "':'", "'>'", "'*'", "'+'", "'?'", "']'"
    };
    public static final int T__9=9;
    public static final int RULE_ID=6;
    public static final int RULE_WS=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ARROW=5;
    public static final int RULE_ABSTRACT=7;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int RULE_DOUBLEARROW=4;

    // delegates
    // delegators


        public InternalABNFParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalABNFParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalABNFParser.tokenNames; }
    public String getGrammarFileName() { return "InternalABNF.g"; }



     	private ABNFGrammarAccess grammarAccess;

        public InternalABNFParser(TokenStream input, ABNFGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "abnf_definition";
       	}

       	@Override
       	protected ABNFGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleabnf_definition"
    // InternalABNF.g:64:1: entryRuleabnf_definition returns [EObject current=null] : iv_ruleabnf_definition= ruleabnf_definition EOF ;
    public final EObject entryRuleabnf_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleabnf_definition = null;


        try {
            // InternalABNF.g:64:56: (iv_ruleabnf_definition= ruleabnf_definition EOF )
            // InternalABNF.g:65:2: iv_ruleabnf_definition= ruleabnf_definition EOF
            {
             newCompositeNode(grammarAccess.getAbnf_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleabnf_definition=ruleabnf_definition();

            state._fsp--;

             current =iv_ruleabnf_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleabnf_definition"


    // $ANTLR start "ruleabnf_definition"
    // InternalABNF.g:71:1: ruleabnf_definition returns [EObject current=null] : ( () ( (lv_rules_1_0= rulerule ) )* ) ;
    public final EObject ruleabnf_definition() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalABNF.g:77:2: ( ( () ( (lv_rules_1_0= rulerule ) )* ) )
            // InternalABNF.g:78:2: ( () ( (lv_rules_1_0= rulerule ) )* )
            {
            // InternalABNF.g:78:2: ( () ( (lv_rules_1_0= rulerule ) )* )
            // InternalABNF.g:79:3: () ( (lv_rules_1_0= rulerule ) )*
            {
            // InternalABNF.g:79:3: ()
            // InternalABNF.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbnf_definitionAccess().getAbnf_definitionAction_0(),
            					current);
            			

            }

            // InternalABNF.g:86:3: ( (lv_rules_1_0= rulerule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalABNF.g:87:4: (lv_rules_1_0= rulerule )
            	    {
            	    // InternalABNF.g:87:4: (lv_rules_1_0= rulerule )
            	    // InternalABNF.g:88:5: lv_rules_1_0= rulerule
            	    {

            	    					newCompositeNode(grammarAccess.getAbnf_definitionAccess().getRulesRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rules_1_0=rulerule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbnf_definitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"org.xtext.example.abnf.ABNF.rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleabnf_definition"


    // $ANTLR start "entryRulerule"
    // InternalABNF.g:109:1: entryRulerule returns [EObject current=null] : iv_rulerule= rulerule EOF ;
    public final EObject entryRulerule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerule = null;


        try {
            // InternalABNF.g:109:45: (iv_rulerule= rulerule EOF )
            // InternalABNF.g:110:2: iv_rulerule= rulerule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerule=rulerule();

            state._fsp--;

             current =iv_rulerule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerule"


    // $ANTLR start "rulerule"
    // InternalABNF.g:116:1: rulerule returns [EObject current=null] : (this_hierarchy_rule_0= rulehierarchy_rule | this_specification_rule_1= rulespecification_rule ) ;
    public final EObject rulerule() throws RecognitionException {
        EObject current = null;

        EObject this_hierarchy_rule_0 = null;

        EObject this_specification_rule_1 = null;



        	enterRule();

        try {
            // InternalABNF.g:122:2: ( (this_hierarchy_rule_0= rulehierarchy_rule | this_specification_rule_1= rulespecification_rule ) )
            // InternalABNF.g:123:2: (this_hierarchy_rule_0= rulehierarchy_rule | this_specification_rule_1= rulespecification_rule )
            {
            // InternalABNF.g:123:2: (this_hierarchy_rule_0= rulehierarchy_rule | this_specification_rule_1= rulespecification_rule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ARROW) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_DOUBLEARROW) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalABNF.g:124:3: this_hierarchy_rule_0= rulehierarchy_rule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getHierarchy_ruleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_hierarchy_rule_0=rulehierarchy_rule();

                    state._fsp--;


                    			current = this_hierarchy_rule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalABNF.g:133:3: this_specification_rule_1= rulespecification_rule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getSpecification_ruleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_specification_rule_1=rulespecification_rule();

                    state._fsp--;


                    			current = this_specification_rule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerule"


    // $ANTLR start "entryRulehierarchy_rule"
    // InternalABNF.g:145:1: entryRulehierarchy_rule returns [EObject current=null] : iv_rulehierarchy_rule= rulehierarchy_rule EOF ;
    public final EObject entryRulehierarchy_rule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehierarchy_rule = null;


        try {
            // InternalABNF.g:145:55: (iv_rulehierarchy_rule= rulehierarchy_rule EOF )
            // InternalABNF.g:146:2: iv_rulehierarchy_rule= rulehierarchy_rule EOF
            {
             newCompositeNode(grammarAccess.getHierarchy_ruleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulehierarchy_rule=rulehierarchy_rule();

            state._fsp--;

             current =iv_rulehierarchy_rule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulehierarchy_rule"


    // $ANTLR start "rulehierarchy_rule"
    // InternalABNF.g:152:1: rulehierarchy_rule returns [EObject current=null] : ( ( (lv_classId_0_0= ruleclassId ) ) (this_DOUBLEARROW_1= RULE_DOUBLEARROW ( (lv_subclassId_2_0= rulesubclassId ) ) )+ otherlv_3= ';' ) ;
    public final EObject rulehierarchy_rule() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLEARROW_1=null;
        Token otherlv_3=null;
        EObject lv_classId_0_0 = null;

        EObject lv_subclassId_2_0 = null;



        	enterRule();

        try {
            // InternalABNF.g:158:2: ( ( ( (lv_classId_0_0= ruleclassId ) ) (this_DOUBLEARROW_1= RULE_DOUBLEARROW ( (lv_subclassId_2_0= rulesubclassId ) ) )+ otherlv_3= ';' ) )
            // InternalABNF.g:159:2: ( ( (lv_classId_0_0= ruleclassId ) ) (this_DOUBLEARROW_1= RULE_DOUBLEARROW ( (lv_subclassId_2_0= rulesubclassId ) ) )+ otherlv_3= ';' )
            {
            // InternalABNF.g:159:2: ( ( (lv_classId_0_0= ruleclassId ) ) (this_DOUBLEARROW_1= RULE_DOUBLEARROW ( (lv_subclassId_2_0= rulesubclassId ) ) )+ otherlv_3= ';' )
            // InternalABNF.g:160:3: ( (lv_classId_0_0= ruleclassId ) ) (this_DOUBLEARROW_1= RULE_DOUBLEARROW ( (lv_subclassId_2_0= rulesubclassId ) ) )+ otherlv_3= ';'
            {
            // InternalABNF.g:160:3: ( (lv_classId_0_0= ruleclassId ) )
            // InternalABNF.g:161:4: (lv_classId_0_0= ruleclassId )
            {
            // InternalABNF.g:161:4: (lv_classId_0_0= ruleclassId )
            // InternalABNF.g:162:5: lv_classId_0_0= ruleclassId
            {

            					newCompositeNode(grammarAccess.getHierarchy_ruleAccess().getClassIdClassIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_classId_0_0=ruleclassId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHierarchy_ruleRule());
            					}
            					set(
            						current,
            						"classId",
            						lv_classId_0_0,
            						"org.xtext.example.abnf.ABNF.classId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalABNF.g:179:3: (this_DOUBLEARROW_1= RULE_DOUBLEARROW ( (lv_subclassId_2_0= rulesubclassId ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOUBLEARROW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalABNF.g:180:4: this_DOUBLEARROW_1= RULE_DOUBLEARROW ( (lv_subclassId_2_0= rulesubclassId ) )
            	    {
            	    this_DOUBLEARROW_1=(Token)match(input,RULE_DOUBLEARROW,FOLLOW_5); 

            	    				newLeafNode(this_DOUBLEARROW_1, grammarAccess.getHierarchy_ruleAccess().getDOUBLEARROWTerminalRuleCall_1_0());
            	    			
            	    // InternalABNF.g:184:4: ( (lv_subclassId_2_0= rulesubclassId ) )
            	    // InternalABNF.g:185:5: (lv_subclassId_2_0= rulesubclassId )
            	    {
            	    // InternalABNF.g:185:5: (lv_subclassId_2_0= rulesubclassId )
            	    // InternalABNF.g:186:6: lv_subclassId_2_0= rulesubclassId
            	    {

            	    						newCompositeNode(grammarAccess.getHierarchy_ruleAccess().getSubclassIdSubclassIdParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_subclassId_2_0=rulesubclassId();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHierarchy_ruleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subclassId",
            	    							lv_subclassId_2_0,
            	    							"org.xtext.example.abnf.ABNF.subclassId");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,9,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getHierarchy_ruleAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulehierarchy_rule"


    // $ANTLR start "entryRulespecification_rule"
    // InternalABNF.g:212:1: entryRulespecification_rule returns [EObject current=null] : iv_rulespecification_rule= rulespecification_rule EOF ;
    public final EObject entryRulespecification_rule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulespecification_rule = null;


        try {
            // InternalABNF.g:212:59: (iv_rulespecification_rule= rulespecification_rule EOF )
            // InternalABNF.g:213:2: iv_rulespecification_rule= rulespecification_rule EOF
            {
             newCompositeNode(grammarAccess.getSpecification_ruleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulespecification_rule=rulespecification_rule();

            state._fsp--;

             current =iv_rulespecification_rule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulespecification_rule"


    // $ANTLR start "rulespecification_rule"
    // InternalABNF.g:219:1: rulespecification_rule returns [EObject current=null] : ( ( (lv_classId_0_0= ruleclassId ) ) this_ARROW_1= RULE_ARROW ( (lv_attribute_2_0= ruleattribute ) )* otherlv_3= ';' ) ;
    public final EObject rulespecification_rule() throws RecognitionException {
        EObject current = null;

        Token this_ARROW_1=null;
        Token otherlv_3=null;
        EObject lv_classId_0_0 = null;

        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalABNF.g:225:2: ( ( ( (lv_classId_0_0= ruleclassId ) ) this_ARROW_1= RULE_ARROW ( (lv_attribute_2_0= ruleattribute ) )* otherlv_3= ';' ) )
            // InternalABNF.g:226:2: ( ( (lv_classId_0_0= ruleclassId ) ) this_ARROW_1= RULE_ARROW ( (lv_attribute_2_0= ruleattribute ) )* otherlv_3= ';' )
            {
            // InternalABNF.g:226:2: ( ( (lv_classId_0_0= ruleclassId ) ) this_ARROW_1= RULE_ARROW ( (lv_attribute_2_0= ruleattribute ) )* otherlv_3= ';' )
            // InternalABNF.g:227:3: ( (lv_classId_0_0= ruleclassId ) ) this_ARROW_1= RULE_ARROW ( (lv_attribute_2_0= ruleattribute ) )* otherlv_3= ';'
            {
            // InternalABNF.g:227:3: ( (lv_classId_0_0= ruleclassId ) )
            // InternalABNF.g:228:4: (lv_classId_0_0= ruleclassId )
            {
            // InternalABNF.g:228:4: (lv_classId_0_0= ruleclassId )
            // InternalABNF.g:229:5: lv_classId_0_0= ruleclassId
            {

            					newCompositeNode(grammarAccess.getSpecification_ruleAccess().getClassIdClassIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_classId_0_0=ruleclassId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecification_ruleRule());
            					}
            					set(
            						current,
            						"classId",
            						lv_classId_0_0,
            						"org.xtext.example.abnf.ABNF.classId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ARROW_1=(Token)match(input,RULE_ARROW,FOLLOW_8); 

            			newLeafNode(this_ARROW_1, grammarAccess.getSpecification_ruleAccess().getARROWTerminalRuleCall_1());
            		
            // InternalABNF.g:250:3: ( (lv_attribute_2_0= ruleattribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=10 && LA4_0<=11)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalABNF.g:251:4: (lv_attribute_2_0= ruleattribute )
            	    {
            	    // InternalABNF.g:251:4: (lv_attribute_2_0= ruleattribute )
            	    // InternalABNF.g:252:5: lv_attribute_2_0= ruleattribute
            	    {

            	    					newCompositeNode(grammarAccess.getSpecification_ruleAccess().getAttributeAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attribute_2_0=ruleattribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecification_ruleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_2_0,
            	    						"org.xtext.example.abnf.ABNF.attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,9,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecification_ruleAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulespecification_rule"


    // $ANTLR start "entryRuleclassId"
    // InternalABNF.g:277:1: entryRuleclassId returns [EObject current=null] : iv_ruleclassId= ruleclassId EOF ;
    public final EObject entryRuleclassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclassId = null;


        try {
            // InternalABNF.g:277:48: (iv_ruleclassId= ruleclassId EOF )
            // InternalABNF.g:278:2: iv_ruleclassId= ruleclassId EOF
            {
             newCompositeNode(grammarAccess.getClassIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleclassId=ruleclassId();

            state._fsp--;

             current =iv_ruleclassId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclassId"


    // $ANTLR start "ruleclassId"
    // InternalABNF.g:284:1: ruleclassId returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleclassId() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalABNF.g:290:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalABNF.g:291:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalABNF.g:291:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalABNF.g:292:3: (lv_id_0_0= RULE_ID )
            {
            // InternalABNF.g:292:3: (lv_id_0_0= RULE_ID )
            // InternalABNF.g:293:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getClassIdAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getClassIdRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.xtext.example.abnf.ABNF.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclassId"


    // $ANTLR start "entryRulesubclassId"
    // InternalABNF.g:312:1: entryRulesubclassId returns [EObject current=null] : iv_rulesubclassId= rulesubclassId EOF ;
    public final EObject entryRulesubclassId() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubclassId = null;


        try {
            // InternalABNF.g:312:51: (iv_rulesubclassId= rulesubclassId EOF )
            // InternalABNF.g:313:2: iv_rulesubclassId= rulesubclassId EOF
            {
             newCompositeNode(grammarAccess.getSubclassIdRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubclassId=rulesubclassId();

            state._fsp--;

             current =iv_rulesubclassId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesubclassId"


    // $ANTLR start "rulesubclassId"
    // InternalABNF.g:319:1: rulesubclassId returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_isAbstract_1_0= RULE_ABSTRACT ) ) ( (lv_id_2_0= RULE_ID ) ) ) ) ;
    public final EObject rulesubclassId() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_isAbstract_1_0=null;
        Token lv_id_2_0=null;


        	enterRule();

        try {
            // InternalABNF.g:325:2: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_isAbstract_1_0= RULE_ABSTRACT ) ) ( (lv_id_2_0= RULE_ID ) ) ) ) )
            // InternalABNF.g:326:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_isAbstract_1_0= RULE_ABSTRACT ) ) ( (lv_id_2_0= RULE_ID ) ) ) )
            {
            // InternalABNF.g:326:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_isAbstract_1_0= RULE_ABSTRACT ) ) ( (lv_id_2_0= RULE_ID ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ABSTRACT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalABNF.g:327:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // InternalABNF.g:327:3: ( (lv_id_0_0= RULE_ID ) )
                    // InternalABNF.g:328:4: (lv_id_0_0= RULE_ID )
                    {
                    // InternalABNF.g:328:4: (lv_id_0_0= RULE_ID )
                    // InternalABNF.g:329:5: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_id_0_0, grammarAccess.getSubclassIdAccess().getIdIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubclassIdRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_0_0,
                    						"org.xtext.example.abnf.ABNF.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalABNF.g:346:3: ( ( (lv_isAbstract_1_0= RULE_ABSTRACT ) ) ( (lv_id_2_0= RULE_ID ) ) )
                    {
                    // InternalABNF.g:346:3: ( ( (lv_isAbstract_1_0= RULE_ABSTRACT ) ) ( (lv_id_2_0= RULE_ID ) ) )
                    // InternalABNF.g:347:4: ( (lv_isAbstract_1_0= RULE_ABSTRACT ) ) ( (lv_id_2_0= RULE_ID ) )
                    {
                    // InternalABNF.g:347:4: ( (lv_isAbstract_1_0= RULE_ABSTRACT ) )
                    // InternalABNF.g:348:5: (lv_isAbstract_1_0= RULE_ABSTRACT )
                    {
                    // InternalABNF.g:348:5: (lv_isAbstract_1_0= RULE_ABSTRACT )
                    // InternalABNF.g:349:6: lv_isAbstract_1_0= RULE_ABSTRACT
                    {
                    lv_isAbstract_1_0=(Token)match(input,RULE_ABSTRACT,FOLLOW_9); 

                    						newLeafNode(lv_isAbstract_1_0, grammarAccess.getSubclassIdAccess().getIsAbstractABSTRACTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubclassIdRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"isAbstract",
                    							true,
                    							"org.xtext.example.abnf.ABNF.ABSTRACT");
                    					

                    }


                    }

                    // InternalABNF.g:365:4: ( (lv_id_2_0= RULE_ID ) )
                    // InternalABNF.g:366:5: (lv_id_2_0= RULE_ID )
                    {
                    // InternalABNF.g:366:5: (lv_id_2_0= RULE_ID )
                    // InternalABNF.g:367:6: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_id_2_0, grammarAccess.getSubclassIdAccess().getIdIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubclassIdRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_2_0,
                    							"org.xtext.example.abnf.ABNF.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesubclassId"


    // $ANTLR start "entryRuleattribute"
    // InternalABNF.g:388:1: entryRuleattribute returns [EObject current=null] : iv_ruleattribute= ruleattribute EOF ;
    public final EObject entryRuleattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattribute = null;


        try {
            // InternalABNF.g:388:50: (iv_ruleattribute= ruleattribute EOF )
            // InternalABNF.g:389:2: iv_ruleattribute= ruleattribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleattribute=ruleattribute();

            state._fsp--;

             current =iv_ruleattribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleattribute"


    // $ANTLR start "ruleattribute"
    // InternalABNF.g:395:1: ruleattribute returns [EObject current=null] : ( ( (lv_OPTA_0_0= '[' ) )? ( (lv_SEM_1_0= '<' ) )? ( (lv_NAME_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_TYPE_4_0= RULE_ID ) ) (otherlv_5= '>' )? ( ( (lv_MULTA_6_0= '*' ) ) | ( (lv_MULTB_7_0= '+' ) ) | ( (lv_OPTB_8_0= '?' ) ) )? (otherlv_9= ']' )? ) ;
    public final EObject ruleattribute() throws RecognitionException {
        EObject current = null;

        Token lv_OPTA_0_0=null;
        Token lv_SEM_1_0=null;
        Token lv_NAME_2_0=null;
        Token otherlv_3=null;
        Token lv_TYPE_4_0=null;
        Token otherlv_5=null;
        Token lv_MULTA_6_0=null;
        Token lv_MULTB_7_0=null;
        Token lv_OPTB_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalABNF.g:401:2: ( ( ( (lv_OPTA_0_0= '[' ) )? ( (lv_SEM_1_0= '<' ) )? ( (lv_NAME_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_TYPE_4_0= RULE_ID ) ) (otherlv_5= '>' )? ( ( (lv_MULTA_6_0= '*' ) ) | ( (lv_MULTB_7_0= '+' ) ) | ( (lv_OPTB_8_0= '?' ) ) )? (otherlv_9= ']' )? ) )
            // InternalABNF.g:402:2: ( ( (lv_OPTA_0_0= '[' ) )? ( (lv_SEM_1_0= '<' ) )? ( (lv_NAME_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_TYPE_4_0= RULE_ID ) ) (otherlv_5= '>' )? ( ( (lv_MULTA_6_0= '*' ) ) | ( (lv_MULTB_7_0= '+' ) ) | ( (lv_OPTB_8_0= '?' ) ) )? (otherlv_9= ']' )? )
            {
            // InternalABNF.g:402:2: ( ( (lv_OPTA_0_0= '[' ) )? ( (lv_SEM_1_0= '<' ) )? ( (lv_NAME_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_TYPE_4_0= RULE_ID ) ) (otherlv_5= '>' )? ( ( (lv_MULTA_6_0= '*' ) ) | ( (lv_MULTB_7_0= '+' ) ) | ( (lv_OPTB_8_0= '?' ) ) )? (otherlv_9= ']' )? )
            // InternalABNF.g:403:3: ( (lv_OPTA_0_0= '[' ) )? ( (lv_SEM_1_0= '<' ) )? ( (lv_NAME_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_TYPE_4_0= RULE_ID ) ) (otherlv_5= '>' )? ( ( (lv_MULTA_6_0= '*' ) ) | ( (lv_MULTB_7_0= '+' ) ) | ( (lv_OPTB_8_0= '?' ) ) )? (otherlv_9= ']' )?
            {
            // InternalABNF.g:403:3: ( (lv_OPTA_0_0= '[' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==10) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalABNF.g:404:4: (lv_OPTA_0_0= '[' )
                    {
                    // InternalABNF.g:404:4: (lv_OPTA_0_0= '[' )
                    // InternalABNF.g:405:5: lv_OPTA_0_0= '['
                    {
                    lv_OPTA_0_0=(Token)match(input,10,FOLLOW_10); 

                    					newLeafNode(lv_OPTA_0_0, grammarAccess.getAttributeAccess().getOPTALeftSquareBracketKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "OPTA", lv_OPTA_0_0, "[");
                    				

                    }


                    }
                    break;

            }

            // InternalABNF.g:417:3: ( (lv_SEM_1_0= '<' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalABNF.g:418:4: (lv_SEM_1_0= '<' )
                    {
                    // InternalABNF.g:418:4: (lv_SEM_1_0= '<' )
                    // InternalABNF.g:419:5: lv_SEM_1_0= '<'
                    {
                    lv_SEM_1_0=(Token)match(input,11,FOLLOW_9); 

                    					newLeafNode(lv_SEM_1_0, grammarAccess.getAttributeAccess().getSEMLessThanSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "SEM", lv_SEM_1_0, "<");
                    				

                    }


                    }
                    break;

            }

            // InternalABNF.g:431:3: ( (lv_NAME_2_0= RULE_ID ) )
            // InternalABNF.g:432:4: (lv_NAME_2_0= RULE_ID )
            {
            // InternalABNF.g:432:4: (lv_NAME_2_0= RULE_ID )
            // InternalABNF.g:433:5: lv_NAME_2_0= RULE_ID
            {
            lv_NAME_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_NAME_2_0, grammarAccess.getAttributeAccess().getNAMEIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"NAME",
            						lv_NAME_2_0,
            						"org.xtext.example.abnf.ABNF.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalABNF.g:453:3: ( (lv_TYPE_4_0= RULE_ID ) )
            // InternalABNF.g:454:4: (lv_TYPE_4_0= RULE_ID )
            {
            // InternalABNF.g:454:4: (lv_TYPE_4_0= RULE_ID )
            // InternalABNF.g:455:5: lv_TYPE_4_0= RULE_ID
            {
            lv_TYPE_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_TYPE_4_0, grammarAccess.getAttributeAccess().getTYPEIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"TYPE",
            						lv_TYPE_4_0,
            						"org.xtext.example.abnf.ABNF.ID");
            				

            }


            }

            // InternalABNF.g:471:3: (otherlv_5= '>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalABNF.g:472:4: otherlv_5= '>'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_5());
                    			

                    }
                    break;

            }

            // InternalABNF.g:477:3: ( ( (lv_MULTA_6_0= '*' ) ) | ( (lv_MULTB_7_0= '+' ) ) | ( (lv_OPTB_8_0= '?' ) ) )?
            int alt9=4;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    alt9=1;
                    }
                    break;
                case 15:
                    {
                    alt9=2;
                    }
                    break;
                case 16:
                    {
                    alt9=3;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // InternalABNF.g:478:4: ( (lv_MULTA_6_0= '*' ) )
                    {
                    // InternalABNF.g:478:4: ( (lv_MULTA_6_0= '*' ) )
                    // InternalABNF.g:479:5: (lv_MULTA_6_0= '*' )
                    {
                    // InternalABNF.g:479:5: (lv_MULTA_6_0= '*' )
                    // InternalABNF.g:480:6: lv_MULTA_6_0= '*'
                    {
                    lv_MULTA_6_0=(Token)match(input,14,FOLLOW_14); 

                    						newLeafNode(lv_MULTA_6_0, grammarAccess.getAttributeAccess().getMULTAAsteriskKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "MULTA", lv_MULTA_6_0, "*");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalABNF.g:493:4: ( (lv_MULTB_7_0= '+' ) )
                    {
                    // InternalABNF.g:493:4: ( (lv_MULTB_7_0= '+' ) )
                    // InternalABNF.g:494:5: (lv_MULTB_7_0= '+' )
                    {
                    // InternalABNF.g:494:5: (lv_MULTB_7_0= '+' )
                    // InternalABNF.g:495:6: lv_MULTB_7_0= '+'
                    {
                    lv_MULTB_7_0=(Token)match(input,15,FOLLOW_14); 

                    						newLeafNode(lv_MULTB_7_0, grammarAccess.getAttributeAccess().getMULTBPlusSignKeyword_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "MULTB", lv_MULTB_7_0, "+");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalABNF.g:508:4: ( (lv_OPTB_8_0= '?' ) )
                    {
                    // InternalABNF.g:508:4: ( (lv_OPTB_8_0= '?' ) )
                    // InternalABNF.g:509:5: (lv_OPTB_8_0= '?' )
                    {
                    // InternalABNF.g:509:5: (lv_OPTB_8_0= '?' )
                    // InternalABNF.g:510:6: lv_OPTB_8_0= '?'
                    {
                    lv_OPTB_8_0=(Token)match(input,16,FOLLOW_14); 

                    						newLeafNode(lv_OPTB_8_0, grammarAccess.getAttributeAccess().getOPTBQuestionMarkKeyword_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "OPTB", lv_OPTB_8_0, "?");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalABNF.g:523:3: (otherlv_9= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalABNF.g:524:4: otherlv_9= ']'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleattribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000E40L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000003E002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});

}