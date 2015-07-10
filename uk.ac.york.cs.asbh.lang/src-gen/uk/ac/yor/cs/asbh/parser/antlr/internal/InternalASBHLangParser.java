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
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot85); 

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

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleRoot131); 

                	newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRoot143); 

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
            	    	    
            	    pushFollow(FOLLOW_ruleX_in_ruleRoot164);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRoot177); 

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
            pushFollow(FOLLOW_ruleY_in_entryRuleY213);
            iv_ruleY=ruleY();

            state._fsp--;

             current =iv_ruleY; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleY223); 

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
                        
                    pushFollow(FOLLOW_ruleY1_in_ruleY270);
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
                        
                    pushFollow(FOLLOW_ruleY2_in_ruleY297);
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
            pushFollow(FOLLOW_ruleX_in_entryRuleX332);
            iv_ruleX=ruleX();

            state._fsp--;

             current =iv_ruleX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleX342); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:173:1: ruleX returns [EObject current=null] : ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' ) ;
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
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:176:28: ( ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:1: ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:1: ( () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:2: () otherlv_1= 'X' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )? otherlv_5= '{' ( (lv_ownsY_6_0= ruleY ) )* otherlv_7= '}'
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:177:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:178:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXAccess().getXAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleX388); 

                	newLeafNode(otherlv_1, grammarAccess.getXAccess().getXKeyword_1());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:187:1: ( (lv_name_2_0= RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:188:1: (lv_name_2_0= RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:188:1: (lv_name_2_0= RULE_ID )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:189:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleX405); 

            			newLeafNode(lv_name_2_0, grammarAccess.getXAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:205:2: ( ( (lv_isA1_3_0= 'isA1' ) ) | ( (lv_isA2_4_0= 'isA2' ) ) )?
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
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:205:3: ( (lv_isA1_3_0= 'isA1' ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:205:3: ( (lv_isA1_3_0= 'isA1' ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:206:1: (lv_isA1_3_0= 'isA1' )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:206:1: (lv_isA1_3_0= 'isA1' )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:207:3: lv_isA1_3_0= 'isA1'
                    {
                    lv_isA1_3_0=(Token)match(input,15,FOLLOW_15_in_ruleX429); 

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
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:221:6: ( (lv_isA2_4_0= 'isA2' ) )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:221:6: ( (lv_isA2_4_0= 'isA2' ) )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:222:1: (lv_isA2_4_0= 'isA2' )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:222:1: (lv_isA2_4_0= 'isA2' )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:223:3: lv_isA2_4_0= 'isA2'
                    {
                    lv_isA2_4_0=(Token)match(input,16,FOLLOW_16_in_ruleX466); 

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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleX493); 

                	newLeafNode(otherlv_5, grammarAccess.getXAccess().getLeftCurlyBracketKeyword_4());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:240:1: ( (lv_ownsY_6_0= ruleY ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:241:1: (lv_ownsY_6_0= ruleY )
            	    {
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:241:1: (lv_ownsY_6_0= ruleY )
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:242:3: lv_ownsY_6_0= ruleY
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXAccess().getOwnsYYParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleY_in_ruleX514);
            	    lv_ownsY_6_0=ruleY();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownsY",
            	            		lv_ownsY_6_0, 
            	            		"Y");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleX527); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:270:1: entryRuleZ returns [EObject current=null] : iv_ruleZ= ruleZ EOF ;
    public final EObject entryRuleZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZ = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:271:2: (iv_ruleZ= ruleZ EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:272:2: iv_ruleZ= ruleZ EOF
            {
             newCompositeNode(grammarAccess.getZRule()); 
            pushFollow(FOLLOW_ruleZ_in_entryRuleZ563);
            iv_ruleZ=ruleZ();

            state._fsp--;

             current =iv_ruleZ; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZ573); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:279:1: ruleZ returns [EObject current=null] : ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? ) ;
    public final EObject ruleZ() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refers_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:282:28: ( ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:283:1: ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:283:1: ( () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )? )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:283:2: () otherlv_1= 'Z' ( (lv_refers_2_0= rulePathNameCS ) )?
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:283:2: ()
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:284:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getZAccess().getZAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleZ619); 

                	newLeafNode(otherlv_1, grammarAccess.getZAccess().getZKeyword_1());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:293:1: ( (lv_refers_2_0= rulePathNameCS ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:294:1: (lv_refers_2_0= rulePathNameCS )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:294:1: (lv_refers_2_0= rulePathNameCS )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:295:3: lv_refers_2_0= rulePathNameCS
                    {
                     
                    	        newCompositeNode(grammarAccess.getZAccess().getRefersPathNameCSParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathNameCS_in_ruleZ640);
                    lv_refers_2_0=rulePathNameCS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getZRule());
                    	        }
                           		set(
                           			current, 
                           			"refers",
                            		lv_refers_2_0, 
                            		"PathNameCS");
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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:319:1: entryRuleY1 returns [EObject current=null] : iv_ruleY1= ruleY1 EOF ;
    public final EObject entryRuleY1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY1 = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:320:2: (iv_ruleY1= ruleY1 EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:321:2: iv_ruleY1= ruleY1 EOF
            {
             newCompositeNode(grammarAccess.getY1Rule()); 
            pushFollow(FOLLOW_ruleY1_in_entryRuleY1677);
            iv_ruleY1=ruleY1();

            state._fsp--;

             current =iv_ruleY1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleY1687); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:328:1: ruleY1 returns [EObject current=null] : (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) ;
    public final EObject ruleY1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownsZ_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:331:28: ( (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:332:1: (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:332:1: (otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:332:3: otherlv_0= 'Y1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleY1724); 

                	newLeafNode(otherlv_0, grammarAccess.getY1Access().getY1Keyword_0());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:336:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:337:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:337:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:338:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleY1741); 

            			newLeafNode(lv_name_1_0, grammarAccess.getY1Access().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getY1Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleY1758); 

                	newLeafNode(otherlv_2, grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:358:1: ( (lv_ownsZ_3_0= ruleZ ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:359:1: (lv_ownsZ_3_0= ruleZ )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:359:1: (lv_ownsZ_3_0= ruleZ )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:360:3: lv_ownsZ_3_0= ruleZ
                    {
                     
                    	        newCompositeNode(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleZ_in_ruleY1779);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleY1792); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:388:1: entryRuleY2 returns [EObject current=null] : iv_ruleY2= ruleY2 EOF ;
    public final EObject entryRuleY2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY2 = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:389:2: (iv_ruleY2= ruleY2 EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:390:2: iv_ruleY2= ruleY2 EOF
            {
             newCompositeNode(grammarAccess.getY2Rule()); 
            pushFollow(FOLLOW_ruleY2_in_entryRuleY2828);
            iv_ruleY2=ruleY2();

            state._fsp--;

             current =iv_ruleY2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleY2838); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:397:1: ruleY2 returns [EObject current=null] : (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) ;
    public final EObject ruleY2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownsZ_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:400:28: ( (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:401:1: (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:401:1: (otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}' )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:401:3: otherlv_0= 'Y2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ownsZ_3_0= ruleZ ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleY2875); 

                	newLeafNode(otherlv_0, grammarAccess.getY2Access().getY2Keyword_0());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:405:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:406:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:406:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:407:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleY2892); 

            			newLeafNode(lv_name_1_0, grammarAccess.getY2Access().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getY2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleY2909); 

                	newLeafNode(otherlv_2, grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:427:1: ( (lv_ownsZ_3_0= ruleZ ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:428:1: (lv_ownsZ_3_0= ruleZ )
                    {
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:428:1: (lv_ownsZ_3_0= ruleZ )
                    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:429:3: lv_ownsZ_3_0= ruleZ
                    {
                     
                    	        newCompositeNode(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleZ_in_ruleY2930);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleY2943); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:457:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:458:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:459:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
             newCompositeNode(grammarAccess.getPathNameCSRule()); 
            pushFollow(FOLLOW_rulePathNameCS_in_entryRulePathNameCS979);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;

             current =iv_rulePathNameCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathNameCS989); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:466:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:469:28: ( ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:470:1: ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:470:1: ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )* )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:470:2: ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )*
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:470:2: ( (lv_path_0_0= rulePathElementCS ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:471:1: (lv_path_0_0= rulePathElementCS )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:471:1: (lv_path_0_0= rulePathElementCS )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:472:3: lv_path_0_0= rulePathElementCS
            {
             
            	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePathElementCS_in_rulePathNameCS1035);
            lv_path_0_0=rulePathElementCS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	        }
                   		add(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"PathElementCS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:488:2: (otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:488:4: otherlv_1= '.' ( (lv_path_2_0= rulePathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePathNameCS1048); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getFullStopKeyword_1_0());
            	        
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:492:1: ( (lv_path_2_0= rulePathElementCS ) )
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:493:1: (lv_path_2_0= rulePathElementCS )
            	    {
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:493:1: (lv_path_2_0= rulePathElementCS )
            	    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:494:3: lv_path_2_0= rulePathElementCS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElementCS_in_rulePathNameCS1069);
            	    lv_path_2_0=rulePathElementCS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"path",
            	            		lv_path_2_0, 
            	            		"PathElementCS");
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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:518:1: entryRulePathElementCS returns [EObject current=null] : iv_rulePathElementCS= rulePathElementCS EOF ;
    public final EObject entryRulePathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElementCS = null;


        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:519:2: (iv_rulePathElementCS= rulePathElementCS EOF )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:520:2: iv_rulePathElementCS= rulePathElementCS EOF
            {
             newCompositeNode(grammarAccess.getPathElementCSRule()); 
            pushFollow(FOLLOW_rulePathElementCS_in_entryRulePathElementCS1107);
            iv_rulePathElementCS=rulePathElementCS();

            state._fsp--;

             current =iv_rulePathElementCS; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElementCS1117); 

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
    // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:527:1: rulePathElementCS returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePathElementCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:530:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:531:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:531:1: ( (lv_name_0_0= RULE_ID ) )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:532:1: (lv_name_0_0= RULE_ID )
            {
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:532:1: (lv_name_0_0= RULE_ID )
            // ../uk.ac.york.cs.asbh.lang/src-gen/uk/ac/yor/cs/asbh/parser/antlr/internal/InternalASBHLang.g:533:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElementCS1158); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPathElementCSAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPathElementCSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    public static final BitSet FOLLOW_14_in_ruleX388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleX405 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_15_in_ruleX429 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16_in_ruleX466 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleX493 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_ruleY_in_ruleX514 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_13_in_ruleX527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZ_in_entryRuleZ563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZ573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleZ619 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePathNameCS_in_ruleZ640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY1_in_entryRuleY1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleY1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleY1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleY1741 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleY1758 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleZ_in_ruleY1779 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleY1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleY2_in_entryRuleY2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleY2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleY2875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleY2892 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleY2909 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleZ_in_ruleY2930 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleY2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElementCS_in_rulePathNameCS1035 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePathNameCS1048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePathElementCS_in_rulePathNameCS1069 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulePathElementCS_in_entryRulePathElementCS1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElementCS1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElementCS1158 = new BitSet(new long[]{0x0000000000000002L});

}