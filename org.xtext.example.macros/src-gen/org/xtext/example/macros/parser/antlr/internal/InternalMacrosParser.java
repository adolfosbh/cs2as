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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMacrosParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DQVAL", "RULE_WS", "'VERSION'", "'TAG'", "'URL'", "'TAB'", "'BUILD'", "'='", "'TYPE'", "'ATTR'", "'POS'", "'CONTENT'", "'GOTO'", "'T'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int RULE_WS=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_DQVAL=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators


        public InternalMacrosParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMacrosParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMacrosParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMacros.g"; }



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




    // $ANTLR start "entryRuleMainRule"
    // InternalMacros.g:64:1: entryRuleMainRule returns [EObject current=null] : iv_ruleMainRule= ruleMainRule EOF ;
    public final EObject entryRuleMainRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainRule = null;


        try {
            // InternalMacros.g:64:49: (iv_ruleMainRule= ruleMainRule EOF )
            // InternalMacros.g:65:2: iv_ruleMainRule= ruleMainRule EOF
            {
             newCompositeNode(grammarAccess.getMainRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainRule=ruleMainRule();

            state._fsp--;

             current =iv_ruleMainRule; 
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
    // $ANTLR end "entryRuleMainRule"


    // $ANTLR start "ruleMainRule"
    // InternalMacros.g:71:1: ruleMainRule returns [EObject current=null] : ( ( (lv_version_0_0= ruleVersion_Statement ) )? ( (lv_statement_1_0= ruleStatement ) )* ) ;
    public final EObject ruleMainRule() throws RecognitionException {
        EObject current = null;

        EObject lv_version_0_0 = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            // InternalMacros.g:77:2: ( ( ( (lv_version_0_0= ruleVersion_Statement ) )? ( (lv_statement_1_0= ruleStatement ) )* ) )
            // InternalMacros.g:78:2: ( ( (lv_version_0_0= ruleVersion_Statement ) )? ( (lv_statement_1_0= ruleStatement ) )* )
            {
            // InternalMacros.g:78:2: ( ( (lv_version_0_0= ruleVersion_Statement ) )? ( (lv_statement_1_0= ruleStatement ) )* )
            // InternalMacros.g:79:3: ( (lv_version_0_0= ruleVersion_Statement ) )? ( (lv_statement_1_0= ruleStatement ) )*
            {
            // InternalMacros.g:79:3: ( (lv_version_0_0= ruleVersion_Statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==6) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMacros.g:80:4: (lv_version_0_0= ruleVersion_Statement )
                    {
                    // InternalMacros.g:80:4: (lv_version_0_0= ruleVersion_Statement )
                    // InternalMacros.g:81:5: lv_version_0_0= ruleVersion_Statement
                    {

                    					newCompositeNode(grammarAccess.getMainRuleAccess().getVersionVersion_StatementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_version_0_0=ruleVersion_Statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainRuleRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_0_0,
                    						"org.xtext.example.macros.Macros.Version_Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMacros.g:98:3: ( (lv_statement_1_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=7 && LA2_0<=9)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMacros.g:99:4: (lv_statement_1_0= ruleStatement )
            	    {
            	    // InternalMacros.g:99:4: (lv_statement_1_0= ruleStatement )
            	    // InternalMacros.g:100:5: lv_statement_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMainRuleAccess().getStatementStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statement_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statement",
            	    						lv_statement_1_0,
            	    						"org.xtext.example.macros.Macros.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleMainRule"


    // $ANTLR start "entryRuleVersion_Statement"
    // InternalMacros.g:121:1: entryRuleVersion_Statement returns [EObject current=null] : iv_ruleVersion_Statement= ruleVersion_Statement EOF ;
    public final EObject entryRuleVersion_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion_Statement = null;


        try {
            // InternalMacros.g:121:58: (iv_ruleVersion_Statement= ruleVersion_Statement EOF )
            // InternalMacros.g:122:2: iv_ruleVersion_Statement= ruleVersion_Statement EOF
            {
             newCompositeNode(grammarAccess.getVersion_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion_Statement=ruleVersion_Statement();

            state._fsp--;

             current =iv_ruleVersion_Statement; 
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
    // $ANTLR end "entryRuleVersion_Statement"


    // $ANTLR start "ruleVersion_Statement"
    // InternalMacros.g:128:1: ruleVersion_Statement returns [EObject current=null] : ( () otherlv_1= 'VERSION' ( (lv_attribute_2_0= ruleVersion_attr ) ) ) ;
    public final EObject ruleVersion_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalMacros.g:134:2: ( ( () otherlv_1= 'VERSION' ( (lv_attribute_2_0= ruleVersion_attr ) ) ) )
            // InternalMacros.g:135:2: ( () otherlv_1= 'VERSION' ( (lv_attribute_2_0= ruleVersion_attr ) ) )
            {
            // InternalMacros.g:135:2: ( () otherlv_1= 'VERSION' ( (lv_attribute_2_0= ruleVersion_attr ) ) )
            // InternalMacros.g:136:3: () otherlv_1= 'VERSION' ( (lv_attribute_2_0= ruleVersion_attr ) )
            {
            // InternalMacros.g:136:3: ()
            // InternalMacros.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersion_StatementAccess().getVersion_StatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,6,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVersion_StatementAccess().getVERSIONKeyword_1());
            		
            // InternalMacros.g:147:3: ( (lv_attribute_2_0= ruleVersion_attr ) )
            // InternalMacros.g:148:4: (lv_attribute_2_0= ruleVersion_attr )
            {
            // InternalMacros.g:148:4: (lv_attribute_2_0= ruleVersion_attr )
            // InternalMacros.g:149:5: lv_attribute_2_0= ruleVersion_attr
            {

            					newCompositeNode(grammarAccess.getVersion_StatementAccess().getAttributeVersion_attrParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attribute_2_0=ruleVersion_attr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersion_StatementRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.xtext.example.macros.Macros.Version_attr");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleVersion_Statement"


    // $ANTLR start "entryRuleStatement"
    // InternalMacros.g:170:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMacros.g:170:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMacros.g:171:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMacros.g:177:1: ruleStatement returns [EObject current=null] : (this_Tag_Statement_0= ruleTag_Statement | this_Url_Statement_1= ruleUrl_Statement | this_Tab_Statement_2= ruleTab_Statement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Tag_Statement_0 = null;

        EObject this_Url_Statement_1 = null;

        EObject this_Tab_Statement_2 = null;



        	enterRule();

        try {
            // InternalMacros.g:183:2: ( (this_Tag_Statement_0= ruleTag_Statement | this_Url_Statement_1= ruleUrl_Statement | this_Tab_Statement_2= ruleTab_Statement ) )
            // InternalMacros.g:184:2: (this_Tag_Statement_0= ruleTag_Statement | this_Url_Statement_1= ruleUrl_Statement | this_Tab_Statement_2= ruleTab_Statement )
            {
            // InternalMacros.g:184:2: (this_Tag_Statement_0= ruleTag_Statement | this_Url_Statement_1= ruleUrl_Statement | this_Tab_Statement_2= ruleTab_Statement )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 7:
                {
                alt3=1;
                }
                break;
            case 8:
                {
                alt3=2;
                }
                break;
            case 9:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMacros.g:185:3: this_Tag_Statement_0= ruleTag_Statement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTag_StatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tag_Statement_0=ruleTag_Statement();

                    state._fsp--;


                    			current = this_Tag_Statement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMacros.g:194:3: this_Url_Statement_1= ruleUrl_Statement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUrl_StatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Url_Statement_1=ruleUrl_Statement();

                    state._fsp--;


                    			current = this_Url_Statement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMacros.g:203:3: this_Tab_Statement_2= ruleTab_Statement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTab_StatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tab_Statement_2=ruleTab_Statement();

                    state._fsp--;


                    			current = this_Tab_Statement_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTag_Statement"
    // InternalMacros.g:215:1: entryRuleTag_Statement returns [EObject current=null] : iv_ruleTag_Statement= ruleTag_Statement EOF ;
    public final EObject entryRuleTag_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag_Statement = null;


        try {
            // InternalMacros.g:215:54: (iv_ruleTag_Statement= ruleTag_Statement EOF )
            // InternalMacros.g:216:2: iv_ruleTag_Statement= ruleTag_Statement EOF
            {
             newCompositeNode(grammarAccess.getTag_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag_Statement=ruleTag_Statement();

            state._fsp--;

             current =iv_ruleTag_Statement; 
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
    // $ANTLR end "entryRuleTag_Statement"


    // $ANTLR start "ruleTag_Statement"
    // InternalMacros.g:222:1: ruleTag_Statement returns [EObject current=null] : ( () otherlv_1= 'TAG' ( (lv_tags_2_0= ruleTag_attr ) )* ) ;
    public final EObject ruleTag_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_tags_2_0 = null;



        	enterRule();

        try {
            // InternalMacros.g:228:2: ( ( () otherlv_1= 'TAG' ( (lv_tags_2_0= ruleTag_attr ) )* ) )
            // InternalMacros.g:229:2: ( () otherlv_1= 'TAG' ( (lv_tags_2_0= ruleTag_attr ) )* )
            {
            // InternalMacros.g:229:2: ( () otherlv_1= 'TAG' ( (lv_tags_2_0= ruleTag_attr ) )* )
            // InternalMacros.g:230:3: () otherlv_1= 'TAG' ( (lv_tags_2_0= ruleTag_attr ) )*
            {
            // InternalMacros.g:230:3: ()
            // InternalMacros.g:231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTag_StatementAccess().getTag_StatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,7,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTag_StatementAccess().getTAGKeyword_1());
            		
            // InternalMacros.g:241:3: ( (lv_tags_2_0= ruleTag_attr ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMacros.g:242:4: (lv_tags_2_0= ruleTag_attr )
            	    {
            	    // InternalMacros.g:242:4: (lv_tags_2_0= ruleTag_attr )
            	    // InternalMacros.g:243:5: lv_tags_2_0= ruleTag_attr
            	    {

            	    					newCompositeNode(grammarAccess.getTag_StatementAccess().getTagsTag_attrParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tags_2_0=ruleTag_attr();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTag_StatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tags",
            	    						lv_tags_2_0,
            	    						"org.xtext.example.macros.Macros.Tag_attr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleTag_Statement"


    // $ANTLR start "entryRuleUrl_Statement"
    // InternalMacros.g:264:1: entryRuleUrl_Statement returns [EObject current=null] : iv_ruleUrl_Statement= ruleUrl_Statement EOF ;
    public final EObject entryRuleUrl_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrl_Statement = null;


        try {
            // InternalMacros.g:264:54: (iv_ruleUrl_Statement= ruleUrl_Statement EOF )
            // InternalMacros.g:265:2: iv_ruleUrl_Statement= ruleUrl_Statement EOF
            {
             newCompositeNode(grammarAccess.getUrl_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUrl_Statement=ruleUrl_Statement();

            state._fsp--;

             current =iv_ruleUrl_Statement; 
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
    // $ANTLR end "entryRuleUrl_Statement"


    // $ANTLR start "ruleUrl_Statement"
    // InternalMacros.g:271:1: ruleUrl_Statement returns [EObject current=null] : ( () otherlv_1= 'URL' ( (lv_urls_2_0= ruleurl_attr ) )* ) ;
    public final EObject ruleUrl_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_urls_2_0 = null;



        	enterRule();

        try {
            // InternalMacros.g:277:2: ( ( () otherlv_1= 'URL' ( (lv_urls_2_0= ruleurl_attr ) )* ) )
            // InternalMacros.g:278:2: ( () otherlv_1= 'URL' ( (lv_urls_2_0= ruleurl_attr ) )* )
            {
            // InternalMacros.g:278:2: ( () otherlv_1= 'URL' ( (lv_urls_2_0= ruleurl_attr ) )* )
            // InternalMacros.g:279:3: () otherlv_1= 'URL' ( (lv_urls_2_0= ruleurl_attr ) )*
            {
            // InternalMacros.g:279:3: ()
            // InternalMacros.g:280:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUrl_StatementAccess().getUrl_StatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUrl_StatementAccess().getURLKeyword_1());
            		
            // InternalMacros.g:290:3: ( (lv_urls_2_0= ruleurl_attr ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMacros.g:291:4: (lv_urls_2_0= ruleurl_attr )
            	    {
            	    // InternalMacros.g:291:4: (lv_urls_2_0= ruleurl_attr )
            	    // InternalMacros.g:292:5: lv_urls_2_0= ruleurl_attr
            	    {

            	    					newCompositeNode(grammarAccess.getUrl_StatementAccess().getUrlsUrl_attrParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_urls_2_0=ruleurl_attr();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUrl_StatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"urls",
            	    						lv_urls_2_0,
            	    						"org.xtext.example.macros.Macros.url_attr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleUrl_Statement"


    // $ANTLR start "entryRuleTab_Statement"
    // InternalMacros.g:313:1: entryRuleTab_Statement returns [EObject current=null] : iv_ruleTab_Statement= ruleTab_Statement EOF ;
    public final EObject entryRuleTab_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab_Statement = null;


        try {
            // InternalMacros.g:313:54: (iv_ruleTab_Statement= ruleTab_Statement EOF )
            // InternalMacros.g:314:2: iv_ruleTab_Statement= ruleTab_Statement EOF
            {
             newCompositeNode(grammarAccess.getTab_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTab_Statement=ruleTab_Statement();

            state._fsp--;

             current =iv_ruleTab_Statement; 
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
    // $ANTLR end "entryRuleTab_Statement"


    // $ANTLR start "ruleTab_Statement"
    // InternalMacros.g:320:1: ruleTab_Statement returns [EObject current=null] : ( () otherlv_1= 'TAB' ( (lv_tabs_2_0= ruletab_attr ) )* ) ;
    public final EObject ruleTab_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_tabs_2_0 = null;



        	enterRule();

        try {
            // InternalMacros.g:326:2: ( ( () otherlv_1= 'TAB' ( (lv_tabs_2_0= ruletab_attr ) )* ) )
            // InternalMacros.g:327:2: ( () otherlv_1= 'TAB' ( (lv_tabs_2_0= ruletab_attr ) )* )
            {
            // InternalMacros.g:327:2: ( () otherlv_1= 'TAB' ( (lv_tabs_2_0= ruletab_attr ) )* )
            // InternalMacros.g:328:3: () otherlv_1= 'TAB' ( (lv_tabs_2_0= ruletab_attr ) )*
            {
            // InternalMacros.g:328:3: ()
            // InternalMacros.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTab_StatementAccess().getTab_StatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,9,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTab_StatementAccess().getTABKeyword_1());
            		
            // InternalMacros.g:339:3: ( (lv_tabs_2_0= ruletab_attr ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMacros.g:340:4: (lv_tabs_2_0= ruletab_attr )
            	    {
            	    // InternalMacros.g:340:4: (lv_tabs_2_0= ruletab_attr )
            	    // InternalMacros.g:341:5: lv_tabs_2_0= ruletab_attr
            	    {

            	    					newCompositeNode(grammarAccess.getTab_StatementAccess().getTabsTab_attrParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_tabs_2_0=ruletab_attr();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTab_StatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tabs",
            	    						lv_tabs_2_0,
            	    						"org.xtext.example.macros.Macros.tab_attr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleTab_Statement"


    // $ANTLR start "entryRuleVersion_attr"
    // InternalMacros.g:362:1: entryRuleVersion_attr returns [EObject current=null] : iv_ruleVersion_attr= ruleVersion_attr EOF ;
    public final EObject entryRuleVersion_attr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion_attr = null;


        try {
            // InternalMacros.g:362:53: (iv_ruleVersion_attr= ruleVersion_attr EOF )
            // InternalMacros.g:363:2: iv_ruleVersion_attr= ruleVersion_attr EOF
            {
             newCompositeNode(grammarAccess.getVersion_attrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion_attr=ruleVersion_attr();

            state._fsp--;

             current =iv_ruleVersion_attr; 
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
    // $ANTLR end "entryRuleVersion_attr"


    // $ANTLR start "ruleVersion_attr"
    // InternalMacros.g:369:1: ruleVersion_attr returns [EObject current=null] : (otherlv_0= 'BUILD' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) ;
    public final EObject ruleVersion_attr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMacros.g:375:2: ( (otherlv_0= 'BUILD' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) )
            // InternalMacros.g:376:2: (otherlv_0= 'BUILD' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            {
            // InternalMacros.g:376:2: (otherlv_0= 'BUILD' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            // InternalMacros.g:377:3: otherlv_0= 'BUILD' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) )
            {
            otherlv_0=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVersion_attrAccess().getBUILDKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVersion_attrAccess().getEqualsSignKeyword_1());
            		
            // InternalMacros.g:385:3: ( (lv_value_2_0= RULE_DQVAL ) )
            // InternalMacros.g:386:4: (lv_value_2_0= RULE_DQVAL )
            {
            // InternalMacros.g:386:4: (lv_value_2_0= RULE_DQVAL )
            // InternalMacros.g:387:5: lv_value_2_0= RULE_DQVAL
            {
            lv_value_2_0=(Token)match(input,RULE_DQVAL,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getVersion_attrAccess().getValueDQVALTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersion_attrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.macros.Macros.DQVAL");
            				

            }


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
    // $ANTLR end "ruleVersion_attr"


    // $ANTLR start "entryRuleTag_attr"
    // InternalMacros.g:407:1: entryRuleTag_attr returns [EObject current=null] : iv_ruleTag_attr= ruleTag_attr EOF ;
    public final EObject entryRuleTag_attr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag_attr = null;


        try {
            // InternalMacros.g:407:49: (iv_ruleTag_attr= ruleTag_attr EOF )
            // InternalMacros.g:408:2: iv_ruleTag_attr= ruleTag_attr EOF
            {
             newCompositeNode(grammarAccess.getTag_attrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag_attr=ruleTag_attr();

            state._fsp--;

             current =iv_ruleTag_attr; 
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
    // $ANTLR end "entryRuleTag_attr"


    // $ANTLR start "ruleTag_attr"
    // InternalMacros.g:414:1: ruleTag_attr returns [EObject current=null] : ( ( ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) ;
    public final EObject ruleTag_attr() throws RecognitionException {
        EObject current = null;

        Token lv_tag_0_1=null;
        Token lv_tag_0_2=null;
        Token lv_tag_0_3=null;
        Token lv_tag_0_4=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMacros.g:420:2: ( ( ( ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) )
            // InternalMacros.g:421:2: ( ( ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            {
            // InternalMacros.g:421:2: ( ( ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            // InternalMacros.g:422:3: ( ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) )
            {
            // InternalMacros.g:422:3: ( ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) ) )
            // InternalMacros.g:423:4: ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) )
            {
            // InternalMacros.g:423:4: ( (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' ) )
            // InternalMacros.g:424:5: (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' )
            {
            // InternalMacros.g:424:5: (lv_tag_0_1= 'TYPE' | lv_tag_0_2= 'ATTR' | lv_tag_0_3= 'POS' | lv_tag_0_4= 'CONTENT' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMacros.g:425:6: lv_tag_0_1= 'TYPE'
                    {
                    lv_tag_0_1=(Token)match(input,12,FOLLOW_8); 

                    						newLeafNode(lv_tag_0_1, grammarAccess.getTag_attrAccess().getTagTYPEKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTag_attrRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMacros.g:436:6: lv_tag_0_2= 'ATTR'
                    {
                    lv_tag_0_2=(Token)match(input,13,FOLLOW_8); 

                    						newLeafNode(lv_tag_0_2, grammarAccess.getTag_attrAccess().getTagATTRKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTag_attrRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMacros.g:447:6: lv_tag_0_3= 'POS'
                    {
                    lv_tag_0_3=(Token)match(input,14,FOLLOW_8); 

                    						newLeafNode(lv_tag_0_3, grammarAccess.getTag_attrAccess().getTagPOSKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTag_attrRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMacros.g:458:6: lv_tag_0_4= 'CONTENT'
                    {
                    lv_tag_0_4=(Token)match(input,15,FOLLOW_8); 

                    						newLeafNode(lv_tag_0_4, grammarAccess.getTag_attrAccess().getTagCONTENTKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTag_attrRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTag_attrAccess().getEqualsSignKeyword_1());
            		
            // InternalMacros.g:475:3: ( (lv_value_2_0= RULE_DQVAL ) )
            // InternalMacros.g:476:4: (lv_value_2_0= RULE_DQVAL )
            {
            // InternalMacros.g:476:4: (lv_value_2_0= RULE_DQVAL )
            // InternalMacros.g:477:5: lv_value_2_0= RULE_DQVAL
            {
            lv_value_2_0=(Token)match(input,RULE_DQVAL,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTag_attrAccess().getValueDQVALTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTag_attrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.macros.Macros.DQVAL");
            				

            }


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
    // $ANTLR end "ruleTag_attr"


    // $ANTLR start "entryRuleurl_attr"
    // InternalMacros.g:497:1: entryRuleurl_attr returns [EObject current=null] : iv_ruleurl_attr= ruleurl_attr EOF ;
    public final EObject entryRuleurl_attr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleurl_attr = null;


        try {
            // InternalMacros.g:497:49: (iv_ruleurl_attr= ruleurl_attr EOF )
            // InternalMacros.g:498:2: iv_ruleurl_attr= ruleurl_attr EOF
            {
             newCompositeNode(grammarAccess.getUrl_attrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleurl_attr=ruleurl_attr();

            state._fsp--;

             current =iv_ruleurl_attr; 
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
    // $ANTLR end "entryRuleurl_attr"


    // $ANTLR start "ruleurl_attr"
    // InternalMacros.g:504:1: ruleurl_attr returns [EObject current=null] : (otherlv_0= 'GOTO' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) ;
    public final EObject ruleurl_attr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMacros.g:510:2: ( (otherlv_0= 'GOTO' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) )
            // InternalMacros.g:511:2: (otherlv_0= 'GOTO' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            {
            // InternalMacros.g:511:2: (otherlv_0= 'GOTO' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            // InternalMacros.g:512:3: otherlv_0= 'GOTO' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getUrl_attrAccess().getGOTOKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUrl_attrAccess().getEqualsSignKeyword_1());
            		
            // InternalMacros.g:520:3: ( (lv_value_2_0= RULE_DQVAL ) )
            // InternalMacros.g:521:4: (lv_value_2_0= RULE_DQVAL )
            {
            // InternalMacros.g:521:4: (lv_value_2_0= RULE_DQVAL )
            // InternalMacros.g:522:5: lv_value_2_0= RULE_DQVAL
            {
            lv_value_2_0=(Token)match(input,RULE_DQVAL,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getUrl_attrAccess().getValueDQVALTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUrl_attrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.macros.Macros.DQVAL");
            				

            }


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
    // $ANTLR end "ruleurl_attr"


    // $ANTLR start "entryRuletab_attr"
    // InternalMacros.g:542:1: entryRuletab_attr returns [EObject current=null] : iv_ruletab_attr= ruletab_attr EOF ;
    public final EObject entryRuletab_attr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletab_attr = null;


        try {
            // InternalMacros.g:542:49: (iv_ruletab_attr= ruletab_attr EOF )
            // InternalMacros.g:543:2: iv_ruletab_attr= ruletab_attr EOF
            {
             newCompositeNode(grammarAccess.getTab_attrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletab_attr=ruletab_attr();

            state._fsp--;

             current =iv_ruletab_attr; 
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
    // $ANTLR end "entryRuletab_attr"


    // $ANTLR start "ruletab_attr"
    // InternalMacros.g:549:1: ruletab_attr returns [EObject current=null] : (otherlv_0= 'T' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) ;
    public final EObject ruletab_attr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMacros.g:555:2: ( (otherlv_0= 'T' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) ) )
            // InternalMacros.g:556:2: (otherlv_0= 'T' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            {
            // InternalMacros.g:556:2: (otherlv_0= 'T' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) ) )
            // InternalMacros.g:557:3: otherlv_0= 'T' otherlv_1= '=' ( (lv_value_2_0= RULE_DQVAL ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTab_attrAccess().getTKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTab_attrAccess().getEqualsSignKeyword_1());
            		
            // InternalMacros.g:565:3: ( (lv_value_2_0= RULE_DQVAL ) )
            // InternalMacros.g:566:4: (lv_value_2_0= RULE_DQVAL )
            {
            // InternalMacros.g:566:4: (lv_value_2_0= RULE_DQVAL )
            // InternalMacros.g:567:5: lv_value_2_0= RULE_DQVAL
            {
            lv_value_2_0=(Token)match(input,RULE_DQVAL,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTab_attrAccess().getValueDQVALTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTab_attrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.macros.Macros.DQVAL");
            				

            }


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
    // $ANTLR end "ruletab_attr"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000382L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}