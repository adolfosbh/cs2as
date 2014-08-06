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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASBHLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'ownedX'", "','", "'}'", "'isA1'", "'X'", "'ownsY'", "'Z'", "'Y1'", "'ownsZ'", "'Y2'"
    };
    public static final int RULE_ID=5;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalASBHLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalASBHLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalASBHLangParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g"; }



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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:67:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:68:2: (iv_ruleRoot= ruleRoot EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:69:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot85); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:76:1: ruleRoot returns [EObject current=null] : ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'ownedX' otherlv_4= '{' ( (lv_ownedX_5_0= ruleX ) ) (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_ownedX_5_0 = null;

        EObject lv_ownedX_7_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:79:28: ( ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'ownedX' otherlv_4= '{' ( (lv_ownedX_5_0= ruleX ) ) (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:1: ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'ownedX' otherlv_4= '{' ( (lv_ownedX_5_0= ruleX ) ) (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:1: ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'ownedX' otherlv_4= '{' ( (lv_ownedX_5_0= ruleX ) ) (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:2: () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'ownedX' otherlv_4= '{' ( (lv_ownedX_5_0= ruleX ) ) (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRootAccess().getRootAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoot131); 

                	newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoot143); 

                	newLeafNode(otherlv_2, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:94:1: (otherlv_3= 'ownedX' otherlv_4= '{' ( (lv_ownedX_5_0= ruleX ) ) (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:94:3: otherlv_3= 'ownedX' otherlv_4= '{' ( (lv_ownedX_5_0= ruleX ) ) (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoot156); 

                        	newLeafNode(otherlv_3, grammarAccess.getRootAccess().getOwnedXKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoot168); 

                        	newLeafNode(otherlv_4, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:102:1: ( (lv_ownedX_5_0= ruleX ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:103:1: (lv_ownedX_5_0= ruleX )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:103:1: (lv_ownedX_5_0= ruleX )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:104:3: lv_ownedX_5_0= ruleX
                    {
                     
                    	        newCompositeNode(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleX_in_ruleRoot189);
                    lv_ownedX_5_0=ruleX();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRootRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedX",
                            		lv_ownedX_5_0, 
                            		"X");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:120:2: (otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:120:4: otherlv_6= ',' ( (lv_ownedX_7_0= ruleX ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRoot202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRootAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:124:1: ( (lv_ownedX_7_0= ruleX ) )
                    	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:125:1: (lv_ownedX_7_0= ruleX )
                    	    {
                    	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:125:1: (lv_ownedX_7_0= ruleX )
                    	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:126:3: lv_ownedX_7_0= ruleX
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleX_in_ruleRoot223);
                    	    lv_ownedX_7_0=ruleX();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRootRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedX",
                    	            		lv_ownedX_7_0, 
                    	            		"X");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRoot237); 

                        	newLeafNode(otherlv_8, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRoot251); 

                	newLeafNode(otherlv_9, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:158:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:159:2: (iv_ruleY= ruleY EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:160:2: iv_ruleY= ruleY EOF
            {
             newCompositeNode(grammarAccess.getYRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY_in_entryRuleY287);
            iv_ruleY=ruleY();

            state._fsp--;

             current =iv_ruleY; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY297); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:167:1: ruleY returns [EObject current=null] : (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 ) ;
    public final EObject ruleY() throws RecognitionException {
        EObject current = null;

        EObject this_Y1_0 = null;

        EObject this_Y2_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:170:28: ( (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:171:1: (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:171:1: (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:172:5: this_Y1_0= ruleY1
                    {
                     
                            newCompositeNode(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleY1_in_ruleY344);
                    this_Y1_0=ruleY1();

                    state._fsp--;

                     
                            current = this_Y1_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:182:5: this_Y2_1= ruleY2
                    {
                     
                            newCompositeNode(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleY2_in_ruleY371);
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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:198:1: entryRuleX returns [EObject current=null] : iv_ruleX= ruleX EOF ;
    public final EObject entryRuleX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:199:2: (iv_ruleX= ruleX EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:200:2: iv_ruleX= ruleX EOF
            {
             newCompositeNode(grammarAccess.getXRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleX_in_entryRuleX406);
            iv_ruleX=ruleX();

            state._fsp--;

             current =iv_ruleX; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleX416); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:207:1: ruleX returns [EObject current=null] : ( () ( (lv_isA1_1_0= 'isA1' ) )? otherlv_2= 'X' otherlv_3= '{' (otherlv_4= 'ownsY' ( (lv_ownsY_5_0= ruleY ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleX() throws RecognitionException {
        EObject current = null;

        Token lv_isA1_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownsY_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:210:28: ( ( () ( (lv_isA1_1_0= 'isA1' ) )? otherlv_2= 'X' otherlv_3= '{' (otherlv_4= 'ownsY' ( (lv_ownsY_5_0= ruleY ) ) )? otherlv_6= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:211:1: ( () ( (lv_isA1_1_0= 'isA1' ) )? otherlv_2= 'X' otherlv_3= '{' (otherlv_4= 'ownsY' ( (lv_ownsY_5_0= ruleY ) ) )? otherlv_6= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:211:1: ( () ( (lv_isA1_1_0= 'isA1' ) )? otherlv_2= 'X' otherlv_3= '{' (otherlv_4= 'ownsY' ( (lv_ownsY_5_0= ruleY ) ) )? otherlv_6= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:211:2: () ( (lv_isA1_1_0= 'isA1' ) )? otherlv_2= 'X' otherlv_3= '{' (otherlv_4= 'ownsY' ( (lv_ownsY_5_0= ruleY ) ) )? otherlv_6= '}'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:211:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:212:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXAccess().getXAction_0(),
                        current);
                

            }

            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:217:2: ( (lv_isA1_1_0= 'isA1' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:218:1: (lv_isA1_1_0= 'isA1' )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:218:1: (lv_isA1_1_0= 'isA1' )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:219:3: lv_isA1_1_0= 'isA1'
                    {
                    lv_isA1_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleX468); 

                            newLeafNode(lv_isA1_1_0, grammarAccess.getXAccess().getIsA1IsA1Keyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXRule());
                    	        }
                           		setWithLastConsumed(current, "isA1", true, "isA1");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleX494); 

                	newLeafNode(otherlv_2, grammarAccess.getXAccess().getXKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleX506); 

                	newLeafNode(otherlv_3, grammarAccess.getXAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:240:1: (otherlv_4= 'ownsY' ( (lv_ownsY_5_0= ruleY ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:240:3: otherlv_4= 'ownsY' ( (lv_ownsY_5_0= ruleY ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleX519); 

                        	newLeafNode(otherlv_4, grammarAccess.getXAccess().getOwnsYKeyword_4_0());
                        
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:244:1: ( (lv_ownsY_5_0= ruleY ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:245:1: (lv_ownsY_5_0= ruleY )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:245:1: (lv_ownsY_5_0= ruleY )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:246:3: lv_ownsY_5_0= ruleY
                    {
                     
                    	        newCompositeNode(grammarAccess.getXAccess().getOwnsYYParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleY_in_ruleX540);
                    lv_ownsY_5_0=ruleY();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXRule());
                    	        }
                           		set(
                           			current, 
                           			"ownsY",
                            		lv_ownsY_5_0, 
                            		"Y");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleX554); 

                	newLeafNode(otherlv_6, grammarAccess.getXAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:274:1: entryRuleZ returns [EObject current=null] : iv_ruleZ= ruleZ EOF ;
    public final EObject entryRuleZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZ = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:275:2: (iv_ruleZ= ruleZ EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:276:2: iv_ruleZ= ruleZ EOF
            {
             newCompositeNode(grammarAccess.getZRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleZ_in_entryRuleZ590);
            iv_ruleZ=ruleZ();

            state._fsp--;

             current =iv_ruleZ; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleZ600); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:283:1: ruleZ returns [EObject current=null] : ( () otherlv_1= 'Z' ) ;
    public final EObject ruleZ() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:286:28: ( ( () otherlv_1= 'Z' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:287:1: ( () otherlv_1= 'Z' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:287:1: ( () otherlv_1= 'Z' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:287:2: () otherlv_1= 'Z'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:287:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:288:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getZAccess().getZAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleZ646); 

                	newLeafNode(otherlv_1, grammarAccess.getZAccess().getZKeyword_1());
                

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:305:1: entryRuleY1 returns [EObject current=null] : iv_ruleY1= ruleY1 EOF ;
    public final EObject entryRuleY1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY1 = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:306:2: (iv_ruleY1= ruleY1 EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:307:2: iv_ruleY1= ruleY1 EOF
            {
             newCompositeNode(grammarAccess.getY1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY1_in_entryRuleY1682);
            iv_ruleY1=ruleY1();

            state._fsp--;

             current =iv_ruleY1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY1692); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:314:1: ruleY1 returns [EObject current=null] : ( () otherlv_1= 'Y1' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleY1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownsZ_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:317:28: ( ( () otherlv_1= 'Y1' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:318:1: ( () otherlv_1= 'Y1' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:318:1: ( () otherlv_1= 'Y1' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:318:2: () otherlv_1= 'Y1' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:318:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:319:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getY1Access().getY1Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleY1738); 

                	newLeafNode(otherlv_1, grammarAccess.getY1Access().getY1Keyword_1());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:328:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:329:1: (lv_name_2_0= RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:329:1: (lv_name_2_0= RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:330:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleY1755); 

            			newLeafNode(lv_name_2_0, grammarAccess.getY1Access().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getY1Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleY1772); 

                	newLeafNode(otherlv_3, grammarAccess.getY1Access().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:350:1: (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:350:3: otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) )
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleY1785); 

                        	newLeafNode(otherlv_4, grammarAccess.getY1Access().getOwnsZKeyword_4_0());
                        
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:354:1: ( (lv_ownsZ_5_0= ruleZ ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:355:1: (lv_ownsZ_5_0= ruleZ )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:355:1: (lv_ownsZ_5_0= ruleZ )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:356:3: lv_ownsZ_5_0= ruleZ
                    {
                     
                    	        newCompositeNode(grammarAccess.getY1Access().getOwnsZZParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleZ_in_ruleY1806);
                    lv_ownsZ_5_0=ruleZ();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getY1Rule());
                    	        }
                           		set(
                           			current, 
                           			"ownsZ",
                            		lv_ownsZ_5_0, 
                            		"Z");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleY1820); 

                	newLeafNode(otherlv_6, grammarAccess.getY1Access().getRightCurlyBracketKeyword_5());
                

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:384:1: entryRuleY2 returns [EObject current=null] : iv_ruleY2= ruleY2 EOF ;
    public final EObject entryRuleY2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY2 = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:385:2: (iv_ruleY2= ruleY2 EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:386:2: iv_ruleY2= ruleY2 EOF
            {
             newCompositeNode(grammarAccess.getY2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY2_in_entryRuleY2856);
            iv_ruleY2=ruleY2();

            state._fsp--;

             current =iv_ruleY2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY2866); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:393:1: ruleY2 returns [EObject current=null] : ( () otherlv_1= 'Y2' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleY2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownsZ_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:396:28: ( ( () otherlv_1= 'Y2' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:397:1: ( () otherlv_1= 'Y2' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:397:1: ( () otherlv_1= 'Y2' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:397:2: () otherlv_1= 'Y2' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )? otherlv_6= '}'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:397:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:398:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getY2Access().getY2Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleY2912); 

                	newLeafNode(otherlv_1, grammarAccess.getY2Access().getY2Keyword_1());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:407:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:408:1: (lv_name_2_0= RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:408:1: (lv_name_2_0= RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:409:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleY2929); 

            			newLeafNode(lv_name_2_0, grammarAccess.getY2Access().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getY2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleY2946); 

                	newLeafNode(otherlv_3, grammarAccess.getY2Access().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:429:1: (otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:429:3: otherlv_4= 'ownsZ' ( (lv_ownsZ_5_0= ruleZ ) )
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleY2959); 

                        	newLeafNode(otherlv_4, grammarAccess.getY2Access().getOwnsZKeyword_4_0());
                        
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:433:1: ( (lv_ownsZ_5_0= ruleZ ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:434:1: (lv_ownsZ_5_0= ruleZ )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:434:1: (lv_ownsZ_5_0= ruleZ )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:435:3: lv_ownsZ_5_0= ruleZ
                    {
                     
                    	        newCompositeNode(grammarAccess.getY2Access().getOwnsZZParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleZ_in_ruleY2980);
                    lv_ownsZ_5_0=ruleZ();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getY2Rule());
                    	        }
                           		set(
                           			current, 
                           			"ownsZ",
                            		lv_ownsZ_5_0, 
                            		"Z");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleY2994); 

                	newLeafNode(otherlv_6, grammarAccess.getY2Access().getRightCurlyBracketKeyword_5());
                

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRoot131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoot143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleRoot156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoot168 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleX_in_ruleRoot189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRoot202 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleX_in_ruleRoot223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRoot237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRoot251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY_in_entryRuleY287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY1_in_ruleY344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY2_in_ruleY371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleX_in_entryRuleX406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleX416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleX468 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleX494 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleX506 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleX519 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_ruleY_in_ruleX540 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleX554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleZ_in_entryRuleZ590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleZ600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleZ646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY1_in_entryRuleY1682 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY1692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleY1738 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleY1755 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleY1772 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_ruleY1785 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleZ_in_ruleY1806 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleY1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY2_in_entryRuleY2856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleY2912 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleY2929 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleY2946 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_ruleY2959 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleZ_in_ruleY2980 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleY2994 = new BitSet(new long[]{0x0000000000000002L});
    }


}