package uk.ac.york.cs.asbh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.york.cs.asbh.services.ASBHLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASBHLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'}'", "'X'", "'isA1'", "'isA2'", "'Z'", "'Y1'", "'Y2'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalASBHLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalASBHLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalASBHLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalASBHLang.g"; }



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




    // $ANTLR start "entryRuleRoot"
    // InternalASBHLang.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalASBHLang.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalASBHLang.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalASBHLang.g:71:1: ruleRoot returns [EObject current=null] : ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedX_3_0 = null;



        	enterRule();

        try {
            // InternalASBHLang.g:77:2: ( ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' ) )
            // InternalASBHLang.g:78:2: ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' )
            {
            // InternalASBHLang.g:78:2: ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' )
            // InternalASBHLang.g:79:3: () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}'
            {
            // InternalASBHLang.g:79:3: ()
            // InternalASBHLang.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootAccess().getSRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalASBHLang.g:94:3: ( (lv_ownedX_3_0= ruleX ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalASBHLang.g:95:4: (lv_ownedX_3_0= ruleX )
            	    {
            	    // InternalASBHLang.g:95:4: (lv_ownedX_3_0= ruleX )
            	    // InternalASBHLang.g:96:5: lv_ownedX_3_0= ruleX
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_ownedX_3_0=ruleX();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedX",
            	    						lv_ownedX_3_0,
            	    						"uk.ac.york.cs.asbh.ASBHLang.X");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleY"
    // InternalASBHLang.g:121:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // InternalASBHLang.g:121:42: (iv_ruleY= ruleY EOF )
            // InternalASBHLang.g:122:2: iv_ruleY= ruleY EOF
            {
             newCompositeNode(grammarAccess.getYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleY=ruleY();

            state._fsp--;

             current =iv_ruleY; 
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
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // InternalASBHLang.g:128:1: ruleY returns [EObject current=null] : (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 ) ;
    public final EObject ruleY() throws RecognitionException {
        EObject current = null;

        EObject this_Y1_0 = null;

        EObject this_Y2_1 = null;



        	enterRule();

        try {
            // InternalASBHLang.g:134:2: ( (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 ) )
            // InternalASBHLang.g:135:2: (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 )
            {
            // InternalASBHLang.g:135:2: (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalASBHLang.g:136:3: this_Y1_0= ruleY1
                    {

                    			newCompositeNode(grammarAccess.getYAccess().getY1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Y1_0=ruleY1();

                    state._fsp--;


                    			current = this_Y1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalASBHLang.g:145:3: this_Y2_1= ruleY2
                    {

                    			newCompositeNode(grammarAccess.getYAccess().getY2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Y2_1=ruleY2();

                    state._fsp--;


                    			current = this_Y2_1;
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
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleX"
    // InternalASBHLang.g:157:1: entryRuleX returns [EObject current=null] : iv_ruleX= ruleX EOF ;
    public final EObject entryRuleX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX = null;


        try {
            // InternalASBHLang.g:157:42: (iv_ruleX= ruleX EOF )
            // InternalASBHLang.g:158:2: iv_ruleX= ruleX EOF
            {
             newCompositeNode(grammarAccess.getXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleX=ruleX();

            state._fsp--;

             current =iv_ruleX; 
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
    // $ANTLR end "entryRuleX"


    // $ANTLR start "ruleX"
    // InternalASBHLang.g:164:1: ruleX returns [EObject current=null] : ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' ) ;
    public final EObject ruleX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_isA1_3_0=null;
        Token lv_isA2_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownsY_6_0 = null;



        	enterRule();

        try {
            // InternalASBHLang.g:170:2: ( ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' ) )
            // InternalASBHLang.g:171:2: ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' )
            {
            // InternalASBHLang.g:171:2: ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' )
            // InternalASBHLang.g:172:3: () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}'
            {
            // InternalASBHLang.g:172:3: ()
            // InternalASBHLang.g:173:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXAccess().getXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getXAccess().getXKeyword_1());
            		
            // InternalASBHLang.g:183:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalASBHLang.g:184:4: (lv_name_2_0= RULE_ID )
            {
            // InternalASBHLang.g:184:4: (lv_name_2_0= RULE_ID )
            // InternalASBHLang.g:185:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalASBHLang.g:201:3: ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // InternalASBHLang.g:202:4: ( (lv_isA1_3_0= 'isA1' ) )
                    {
                    // InternalASBHLang.g:202:4: ( (lv_isA1_3_0= 'isA1' ) )
                    // InternalASBHLang.g:203:5: (lv_isA1_3_0= 'isA1' )
                    {
                    // InternalASBHLang.g:203:5: (lv_isA1_3_0= 'isA1' )
                    // InternalASBHLang.g:204:6: lv_isA1_3_0= 'isA1'
                    {
                    lv_isA1_3_0=(Token)match(input,15,FOLLOW_3); 

                    						newLeafNode(lv_isA1_3_0, grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXRule());
                    						}
                    						setWithLastConsumed(current, "isA1", true, "isA1");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalASBHLang.g:217:4: ( (lv_isA2_4_0= 'isA2' ) )
                    {
                    // InternalASBHLang.g:217:4: ( (lv_isA2_4_0= 'isA2' ) )
                    // InternalASBHLang.g:218:5: (lv_isA2_4_0= 'isA2' )
                    {
                    // InternalASBHLang.g:218:5: (lv_isA2_4_0= 'isA2' )
                    // InternalASBHLang.g:219:6: lv_isA2_4_0= 'isA2'
                    {
                    lv_isA2_4_0=(Token)match(input,16,FOLLOW_3); 

                    						newLeafNode(lv_isA2_4_0, grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXRule());
                    						}
                    						setWithLastConsumed(current, "isA2", true, "isA2");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getXAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalASBHLang.g:236:3: ( (lv_ownsY_6_0= ruleY ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalASBHLang.g:237:4: (lv_ownsY_6_0= ruleY )
            	    {
            	    // InternalASBHLang.g:237:4: (lv_ownsY_6_0= ruleY )
            	    // InternalASBHLang.g:238:5: lv_ownsY_6_0= ruleY
            	    {

            	    					newCompositeNode(grammarAccess.getXAccess().getOwnsYYParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_ownsY_6_0=ruleY();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownsY",
            	    						lv_ownsY_6_0,
            	    						"uk.ac.york.cs.asbh.ASBHLang.Y");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getXAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleX"


    // $ANTLR start "entryRuleZ"
    // InternalASBHLang.g:263:1: entryRuleZ returns [EObject current=null] : iv_ruleZ= ruleZ EOF ;
    public final EObject entryRuleZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZ = null;


        try {
            // InternalASBHLang.g:263:42: (iv_ruleZ= ruleZ EOF )
            // InternalASBHLang.g:264:2: iv_ruleZ= ruleZ EOF
            {
             newCompositeNode(grammarAccess.getZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZ=ruleZ();

            state._fsp--;

             current =iv_ruleZ; 
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
    // $ANTLR end "entryRuleZ"


    // $ANTLR start "ruleZ"
    // InternalASBHLang.g:270:1: ruleZ returns [EObject current=null] : ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? ) ;
    public final EObject ruleZ() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refers_2_0 = null;



        	enterRule();

        try {
            // InternalASBHLang.g:276:2: ( ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? ) )
            // InternalASBHLang.g:277:2: ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? )
            {
            // InternalASBHLang.g:277:2: ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? )
            // InternalASBHLang.g:278:3: () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )?
            {
            // InternalASBHLang.g:278:3: ()
            // InternalASBHLang.g:279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getZAccess().getZAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getZAccess().getZKeyword_1());
            		
            // InternalASBHLang.g:289:3: ( (lv_refers_2_0= rulePathNameCS ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalASBHLang.g:290:4: (lv_refers_2_0= rulePathNameCS )
                    {
                    // InternalASBHLang.g:290:4: (lv_refers_2_0= rulePathNameCS )
                    // InternalASBHLang.g:291:5: lv_refers_2_0= rulePathNameCS
                    {

                    					newCompositeNode(grammarAccess.getZAccess().getRefersPathNameCSParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_refers_2_0=rulePathNameCS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getZRule());
                    					}
                    					set(
                    						current,
                    						"refers",
                    						lv_refers_2_0,
                    						"uk.ac.york.cs.asbh.ASBHLang.PathNameCS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleZ"


    // $ANTLR start "entryRuleY1"
    // InternalASBHLang.g:312:1: entryRuleY1 returns [EObject current=null] : iv_ruleY1= ruleY1 EOF ;
    public final EObject entryRuleY1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY1 = null;


        try {
            // InternalASBHLang.g:312:43: (iv_ruleY1= ruleY1 EOF )
            // InternalASBHLang.g:313:2: iv_ruleY1= ruleY1 EOF
            {
             newCompositeNode(grammarAccess.getY1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleY1=ruleY1();

            state._fsp--;

             current =iv_ruleY1; 
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
    // $ANTLR end "entryRuleY1"


    // $ANTLR start "ruleY1"
    // InternalASBHLang.g:319:1: ruleY1 returns [EObject current=null] : (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) ;
    public final EObject ruleY1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownsZ_3_0 = null;



        	enterRule();

        try {
            // InternalASBHLang.g:325:2: ( (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) )
            // InternalASBHLang.g:326:2: (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            {
            // InternalASBHLang.g:326:2: (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            // InternalASBHLang.g:327:3: otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getY1Access().getY1Keyword_0());
            		
            // InternalASBHLang.g:331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASBHLang.g:332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASBHLang.g:332:4: (lv_name_1_0= RULE_ID )
            // InternalASBHLang.g:333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getY1Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getY1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalASBHLang.g:353:3: ( (lv_ownsZ_3_0= ruleZ ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalASBHLang.g:354:4: (lv_ownsZ_3_0= ruleZ )
                    {
                    // InternalASBHLang.g:354:4: (lv_ownsZ_3_0= ruleZ )
                    // InternalASBHLang.g:355:5: lv_ownsZ_3_0= ruleZ
                    {

                    					newCompositeNode(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_ownsZ_3_0=ruleZ();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getY1Rule());
                    					}
                    					set(
                    						current,
                    						"ownsZ",
                    						lv_ownsZ_3_0,
                    						"uk.ac.york.cs.asbh.ASBHLang.Z");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getY1Access().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleY1"


    // $ANTLR start "entryRuleY2"
    // InternalASBHLang.g:380:1: entryRuleY2 returns [EObject current=null] : iv_ruleY2= ruleY2 EOF ;
    public final EObject entryRuleY2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY2 = null;


        try {
            // InternalASBHLang.g:380:43: (iv_ruleY2= ruleY2 EOF )
            // InternalASBHLang.g:381:2: iv_ruleY2= ruleY2 EOF
            {
             newCompositeNode(grammarAccess.getY2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleY2=ruleY2();

            state._fsp--;

             current =iv_ruleY2; 
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
    // $ANTLR end "entryRuleY2"


    // $ANTLR start "ruleY2"
    // InternalASBHLang.g:387:1: ruleY2 returns [EObject current=null] : (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) ;
    public final EObject ruleY2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownsZ_3_0 = null;



        	enterRule();

        try {
            // InternalASBHLang.g:393:2: ( (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) )
            // InternalASBHLang.g:394:2: (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            {
            // InternalASBHLang.g:394:2: (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            // InternalASBHLang.g:395:3: otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getY2Access().getY2Keyword_0());
            		
            // InternalASBHLang.g:399:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalASBHLang.g:400:4: (lv_name_1_0= RULE_ID )
            {
            // InternalASBHLang.g:400:4: (lv_name_1_0= RULE_ID )
            // InternalASBHLang.g:401:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getY2Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getY2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalASBHLang.g:421:3: ( (lv_ownsZ_3_0= ruleZ ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalASBHLang.g:422:4: (lv_ownsZ_3_0= ruleZ )
                    {
                    // InternalASBHLang.g:422:4: (lv_ownsZ_3_0= ruleZ )
                    // InternalASBHLang.g:423:5: lv_ownsZ_3_0= ruleZ
                    {

                    					newCompositeNode(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_ownsZ_3_0=ruleZ();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getY2Rule());
                    					}
                    					set(
                    						current,
                    						"ownsZ",
                    						lv_ownsZ_3_0,
                    						"uk.ac.york.cs.asbh.ASBHLang.Z");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getY2Access().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleY2"


    // $ANTLR start "entryRulePathNameCS"
    // InternalASBHLang.g:448:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalASBHLang.g:448:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalASBHLang.g:449:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
             newCompositeNode(grammarAccess.getPathNameCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;

             current =iv_rulePathNameCS; 
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
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // InternalASBHLang.g:455:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalASBHLang.g:461:2: ( ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* ) )
            // InternalASBHLang.g:462:2: ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* )
            {
            // InternalASBHLang.g:462:2: ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* )
            // InternalASBHLang.g:463:3: ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )*
            {
            // InternalASBHLang.g:463:3: ( (lv_path_0_0= rulePathElementCS ) )
            // InternalASBHLang.g:464:4: (lv_path_0_0= rulePathElementCS )
            {
            // InternalASBHLang.g:464:4: (lv_path_0_0= rulePathElementCS )
            // InternalASBHLang.g:465:5: lv_path_0_0= rulePathElementCS
            {

            					newCompositeNode(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_path_0_0=rulePathElementCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            					}
            					add(
            						current,
            						"path",
            						lv_path_0_0,
            						"uk.ac.york.cs.asbh.ASBHLang.PathElementCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalASBHLang.g:482:3: (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalASBHLang.g:483:4: otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalASBHLang.g:487:4: ( (lv_path_2_0= rulePathElementCS ) )
            	    // InternalASBHLang.g:488:5: (lv_path_2_0= rulePathElementCS )
            	    {
            	    // InternalASBHLang.g:488:5: (lv_path_2_0= rulePathElementCS )
            	    // InternalASBHLang.g:489:6: lv_path_2_0= rulePathElementCS
            	    {

            	    						newCompositeNode(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_path_2_0=rulePathElementCS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"path",
            	    							lv_path_2_0,
            	    							"uk.ac.york.cs.asbh.ASBHLang.PathElementCS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRulePathElementCS"
    // InternalASBHLang.g:511:1: entryRulePathElementCS returns [EObject current=null] : iv_rulePathElementCS= rulePathElementCS EOF ;
    public final EObject entryRulePathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElementCS = null;


        try {
            // InternalASBHLang.g:511:54: (iv_rulePathElementCS= rulePathElementCS EOF )
            // InternalASBHLang.g:512:2: iv_rulePathElementCS= rulePathElementCS EOF
            {
             newCompositeNode(grammarAccess.getPathElementCSRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathElementCS=rulePathElementCS();

            state._fsp--;

             current =iv_rulePathElementCS; 
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
    // $ANTLR end "entryRulePathElementCS"


    // $ANTLR start "rulePathElementCS"
    // InternalASBHLang.g:518:1: rulePathElementCS returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePathElementCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalASBHLang.g:524:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalASBHLang.g:525:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalASBHLang.g:525:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalASBHLang.g:526:3: (lv_name_0_0= RULE_ID )
            {
            // InternalASBHLang.g:526:3: (lv_name_0_0= RULE_ID )
            // InternalASBHLang.g:527:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPathElementCSAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPathElementCSRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "rulePathElementCS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});

}