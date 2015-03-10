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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'}'", "'X'", "'isA1'", "'isA2'", "'Z'", "'Y1'", "'Y2'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:76:1: ruleRoot returns [EObject current=null] : ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedX_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:79:28: ( ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:1: ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:1: ( () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:2: () otherlv_1= 'Root' otherlv_2= '{' ( (lv_ownedX_3_0= ruleX ) )* otherlv_4= '}'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:80:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRootAccess().getSRootAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoot131); 

                	newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoot143); 

                	newLeafNode(otherlv_2, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:94:1: ( (lv_ownedX_3_0= ruleX ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:95:1: (lv_ownedX_3_0= ruleX )
            	    {
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:95:1: (lv_ownedX_3_0= ruleX )
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:96:3: lv_ownedX_3_0= ruleX
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleX_in_ruleRoot164);
            	    lv_ownedX_3_0=ruleX();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedX",
            	            		lv_ownedX_3_0, 
            	            		"X");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoot177); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:124:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:125:2: (iv_ruleY= ruleY EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:126:2: iv_ruleY= ruleY EOF
            {
             newCompositeNode(grammarAccess.getYRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY_in_entryRuleY213);
            iv_ruleY=ruleY();

            state._fsp--;

             current =iv_ruleY; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY223); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:133:1: ruleY returns [EObject current=null] : (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 ) ;
    public final EObject ruleY() throws RecognitionException {
        EObject current = null;

        EObject this_Y1_0 = null;

        EObject this_Y2_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:136:28: ( (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:137:1: (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:137:1: (this_Y1_0= ruleY1 | this_Y2_1= ruleY2 )
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
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:138:5: this_Y1_0= ruleY1
                    {
                     
                            newCompositeNode(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleY1_in_ruleY270);
                    this_Y1_0=ruleY1();

                    state._fsp--;

                     
                            current = this_Y1_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:148:5: this_Y2_1= ruleY2
                    {
                     
                            newCompositeNode(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleY2_in_ruleY297);
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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:164:1: entryRuleX returns [EObject current=null] : iv_ruleX= ruleX EOF ;
    public final EObject entryRuleX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:165:2: (iv_ruleX= ruleX EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:166:2: iv_ruleX= ruleX EOF
            {
             newCompositeNode(grammarAccess.getXRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleX_in_entryRuleX332);
            iv_ruleX=ruleX();

            state._fsp--;

             current =iv_ruleX; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleX342); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:173:1: ruleX returns [EObject current=null] : ( () otherlv_1= 'X' ( ( (lv_isA1_2_0= 'isA1' ) ) | ( (lv_isA2_3_0= 'isA2' ) ) )? otherlv_4= '{' ( (lv_ownsY_5_0= ruleY ) )* otherlv_6= '}' ) ;
    public final EObject ruleX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isA1_2_0=null;
        Token lv_isA2_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownsY_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:176:28: ( ( () otherlv_1= 'X' ( ( (lv_isA1_2_0= 'isA1' ) ) | ( (lv_isA2_3_0= 'isA2' ) ) )? otherlv_4= '{' ( (lv_ownsY_5_0= ruleY ) )* otherlv_6= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:1: ( () otherlv_1= 'X' ( ( (lv_isA1_2_0= 'isA1' ) ) | ( (lv_isA2_3_0= 'isA2' ) ) )? otherlv_4= '{' ( (lv_ownsY_5_0= ruleY ) )* otherlv_6= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:1: ( () otherlv_1= 'X' ( ( (lv_isA1_2_0= 'isA1' ) ) | ( (lv_isA2_3_0= 'isA2' ) ) )? otherlv_4= '{' ( (lv_ownsY_5_0= ruleY ) )* otherlv_6= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:2: () otherlv_1= 'X' ( ( (lv_isA1_2_0= 'isA1' ) ) | ( (lv_isA2_3_0= 'isA2' ) ) )? otherlv_4= '{' ( (lv_ownsY_5_0= ruleY ) )* otherlv_6= '}'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:178:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXAccess().getXAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleX388); 

                	newLeafNode(otherlv_1, grammarAccess.getXAccess().getXKeyword_1());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:187:1: ( ( (lv_isA1_2_0= 'isA1' ) ) | ( (lv_isA2_3_0= 'isA2' ) ) )?
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
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:187:2: ( (lv_isA1_2_0= 'isA1' ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:187:2: ( (lv_isA1_2_0= 'isA1' ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:188:1: (lv_isA1_2_0= 'isA1' )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:188:1: (lv_isA1_2_0= 'isA1' )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:189:3: lv_isA1_2_0= 'isA1'
                    {
                    lv_isA1_2_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleX407); 

                            newLeafNode(lv_isA1_2_0, grammarAccess.getXAccess().getIsA1IsA1Keyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXRule());
                    	        }
                           		setWithLastConsumed(current, "isA1", true, "isA1");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:203:6: ( (lv_isA2_3_0= 'isA2' ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:203:6: ( (lv_isA2_3_0= 'isA2' ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:204:1: (lv_isA2_3_0= 'isA2' )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:204:1: (lv_isA2_3_0= 'isA2' )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:205:3: lv_isA2_3_0= 'isA2'
                    {
                    lv_isA2_3_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleX444); 

                            newLeafNode(lv_isA2_3_0, grammarAccess.getXAccess().getIsA2IsA2Keyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXRule());
                    	        }
                           		setWithLastConsumed(current, "isA2", true, "isA2");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleX471); 

                	newLeafNode(otherlv_4, grammarAccess.getXAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:222:1: ( (lv_ownsY_5_0= ruleY ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:223:1: (lv_ownsY_5_0= ruleY )
            	    {
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:223:1: (lv_ownsY_5_0= ruleY )
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:224:3: lv_ownsY_5_0= ruleY
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXAccess().getOwnsYYParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleY_in_ruleX492);
            	    lv_ownsY_5_0=ruleY();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownsY",
            	            		lv_ownsY_5_0, 
            	            		"Y");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleX505); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:252:1: entryRuleZ returns [EObject current=null] : iv_ruleZ= ruleZ EOF ;
    public final EObject entryRuleZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZ = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:253:2: (iv_ruleZ= ruleZ EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:254:2: iv_ruleZ= ruleZ EOF
            {
             newCompositeNode(grammarAccess.getZRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleZ_in_entryRuleZ541);
            iv_ruleZ=ruleZ();

            state._fsp--;

             current =iv_ruleZ; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleZ551); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:261:1: ruleZ returns [EObject current=null] : ( () otherlv_1= 'Z' ( (lv_name_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleZ() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:264:28: ( ( () otherlv_1= 'Z' ( (lv_name_2_0= RULE_STRING ) )? ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:265:1: ( () otherlv_1= 'Z' ( (lv_name_2_0= RULE_STRING ) )? )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:265:1: ( () otherlv_1= 'Z' ( (lv_name_2_0= RULE_STRING ) )? )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:265:2: () otherlv_1= 'Z' ( (lv_name_2_0= RULE_STRING ) )?
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:265:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:266:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getZAccess().getZAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleZ597); 

                	newLeafNode(otherlv_1, grammarAccess.getZAccess().getZKeyword_1());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:275:1: ( (lv_name_2_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:276:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:276:1: (lv_name_2_0= RULE_STRING )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:277:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleZ614); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getZAccess().getNameSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getZRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"STRING");
                    	    

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:301:1: entryRuleY1 returns [EObject current=null] : iv_ruleY1= ruleY1 EOF ;
    public final EObject entryRuleY1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY1 = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:302:2: (iv_ruleY1= ruleY1 EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:303:2: iv_ruleY1= ruleY1 EOF
            {
             newCompositeNode(grammarAccess.getY1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY1_in_entryRuleY1656);
            iv_ruleY1=ruleY1();

            state._fsp--;

             current =iv_ruleY1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY1666); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:310:1: ruleY1 returns [EObject current=null] : (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) ;
    public final EObject ruleY1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownsZ_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:313:28: ( (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:314:1: (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:314:1: (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:314:3: otherlv_0= 'Y1' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleY1703); 

                	newLeafNode(otherlv_0, grammarAccess.getY1Access().getY1Keyword_0());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:318:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:319:1: (lv_name_1_0= RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:319:1: (lv_name_1_0= RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:320:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleY1720); 

            			newLeafNode(lv_name_1_0, grammarAccess.getY1Access().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getY1Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleY1737); 

                	newLeafNode(otherlv_2, grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:340:1: ( (lv_ownsZ_3_0= ruleZ ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:341:1: (lv_ownsZ_3_0= ruleZ )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:341:1: (lv_ownsZ_3_0= ruleZ )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:342:3: lv_ownsZ_3_0= ruleZ
                    {
                     
                    	        newCompositeNode(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleZ_in_ruleY1758);
                    lv_ownsZ_3_0=ruleZ();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getY1Rule());
                    	        }
                           		set(
                           			current, 
                           			"ownsZ",
                            		lv_ownsZ_3_0, 
                            		"Z");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleY1771); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:370:1: entryRuleY2 returns [EObject current=null] : iv_ruleY2= ruleY2 EOF ;
    public final EObject entryRuleY2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY2 = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:371:2: (iv_ruleY2= ruleY2 EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:372:2: iv_ruleY2= ruleY2 EOF
            {
             newCompositeNode(grammarAccess.getY2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY2_in_entryRuleY2807);
            iv_ruleY2=ruleY2();

            state._fsp--;

             current =iv_ruleY2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY2817); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:379:1: ruleY2 returns [EObject current=null] : (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) ;
    public final EObject ruleY2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownsZ_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:382:28: ( (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:383:1: (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:383:1: (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:383:3: otherlv_0= 'Y2' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleY2854); 

                	newLeafNode(otherlv_0, grammarAccess.getY2Access().getY2Keyword_0());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:387:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:388:1: (lv_name_1_0= RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:388:1: (lv_name_1_0= RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:389:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleY2871); 

            			newLeafNode(lv_name_1_0, grammarAccess.getY2Access().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getY2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleY2888); 

                	newLeafNode(otherlv_2, grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:409:1: ( (lv_ownsZ_3_0= ruleZ ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:410:1: (lv_ownsZ_3_0= ruleZ )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:410:1: (lv_ownsZ_3_0= ruleZ )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:411:3: lv_ownsZ_3_0= ruleZ
                    {
                     
                    	        newCompositeNode(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleZ_in_ruleY2909);
                    lv_ownsZ_3_0=ruleZ();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getY2Rule());
                    	        }
                           		set(
                           			current, 
                           			"ownsZ",
                            		lv_ownsZ_3_0, 
                            		"Z");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleY2922); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRoot131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoot143 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_ruleX_in_ruleRoot164 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleRoot177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY_in_entryRuleY213 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY1_in_ruleY270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY2_in_ruleY297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleX_in_entryRuleX332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleX342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleX388 = new BitSet(new long[]{0x0000000000019000L});
        public static final BitSet FOLLOW_15_in_ruleX407 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_16_in_ruleX444 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleX471 = new BitSet(new long[]{0x00000000000C2000L});
        public static final BitSet FOLLOW_ruleY_in_ruleX492 = new BitSet(new long[]{0x00000000000C2000L});
        public static final BitSet FOLLOW_13_in_ruleX505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleZ_in_entryRuleZ541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleZ551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleZ597 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleZ614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY1_in_entryRuleY1656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleY1703 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleY1720 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleY1737 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_ruleZ_in_ruleY1758 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleY1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY2_in_entryRuleY2807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleY2854 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleY2871 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleY2888 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_ruleZ_in_ruleY2909 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleY2922 = new BitSet(new long[]{0x0000000000000002L});
    }


}