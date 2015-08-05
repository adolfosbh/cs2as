package uk.ac.york.cs.cs2as.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.york.cs.cs2as.services.CS2ASDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCS2ASDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cs'", "','", "'as'", "':'", "'::*'", "'map'", "'to'", "'{'", "'}'", "'rule'", "'produces'", "'redefine'", "'<-'", "'lookup'", "'('", "')'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'::'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'++'", "'Lambda'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'['", "']'", "'in'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'|?'", "'|1'", "'?'", "'extends'", "'&&'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_ESCAPED_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalCS2ASDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCS2ASDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCS2ASDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private CS2ASDSLGrammarAccess grammarAccess;
     	
        public InternalCS2ASDSLParser(TokenStream input, CS2ASDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CS2ASDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:82:1: ruleModel returns [EObject current=null] : ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( (lv_mappings_2_0= ruleClassMap ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_csDecl_0_0 = null;

        EObject lv_asDecl_1_0 = null;

        EObject lv_mappings_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:85:28: ( ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( (lv_mappings_2_0= ruleClassMap ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:86:1: ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( (lv_mappings_2_0= ruleClassMap ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:86:1: ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( (lv_mappings_2_0= ruleClassMap ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:86:2: ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( (lv_mappings_2_0= ruleClassMap ) )*
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:86:2: ( (lv_csDecl_0_0= ruleCSDecl ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:87:1: (lv_csDecl_0_0= ruleCSDecl )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:87:1: (lv_csDecl_0_0= ruleCSDecl )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:88:3: lv_csDecl_0_0= ruleCSDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getCsDeclCSDeclParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCSDecl_in_ruleModel137);
            lv_csDecl_0_0=ruleCSDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"csDecl",
                      		lv_csDecl_0_0, 
                      		"CSDecl");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:104:2: ( (lv_asDecl_1_0= ruleASDecl ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:105:1: (lv_asDecl_1_0= ruleASDecl )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:105:1: (lv_asDecl_1_0= ruleASDecl )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:106:3: lv_asDecl_1_0= ruleASDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getAsDeclASDeclParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleASDecl_in_ruleModel158);
            lv_asDecl_1_0=ruleASDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"asDecl",
                      		lv_asDecl_1_0, 
                      		"ASDecl");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:122:2: ( (lv_mappings_2_0= ruleClassMap ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:123:1: (lv_mappings_2_0= ruleClassMap )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:123:1: (lv_mappings_2_0= ruleClassMap )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:124:3: lv_mappings_2_0= ruleClassMap
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getMappingsClassMapParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleClassMap_in_ruleModel179);
            	    lv_mappings_2_0=ruleClassMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_2_0, 
            	              		"ClassMap");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCSDecl"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:148:1: entryRuleCSDecl returns [EObject current=null] : iv_ruleCSDecl= ruleCSDecl EOF ;
    public final EObject entryRuleCSDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSDecl = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:149:2: (iv_ruleCSDecl= ruleCSDecl EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:150:2: iv_ruleCSDecl= ruleCSDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCSDecl_in_entryRuleCSDecl216);
            iv_ruleCSDecl=ruleCSDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCSDecl226); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSDecl"


    // $ANTLR start "ruleCSDecl"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:157:1: ruleCSDecl returns [EObject current=null] : (otherlv_0= 'cs' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) ;
    public final EObject ruleCSDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metamodels_1_0 = null;

        EObject lv_metamodels_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:160:28: ( (otherlv_0= 'cs' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:161:1: (otherlv_0= 'cs' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:161:1: (otherlv_0= 'cs' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:161:3: otherlv_0= 'cs' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCSDecl263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCSDeclAccess().getCsKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:165:1: ( (lv_metamodels_1_0= ruleImportCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:166:1: (lv_metamodels_1_0= ruleImportCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:166:1: (lv_metamodels_1_0= ruleImportCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:167:3: lv_metamodels_1_0= ruleImportCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSDeclAccess().getMetamodelsImportCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportCS_in_ruleCSDecl284);
            lv_metamodels_1_0=ruleImportCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSDeclRule());
              	        }
                     		add(
                     			current, 
                     			"metamodels",
                      		lv_metamodels_1_0, 
                      		"ImportCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:183:2: (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:183:4: otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCSDecl297); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCSDeclAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:187:1: ( (lv_metamodels_3_0= ruleImportCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:188:1: (lv_metamodels_3_0= ruleImportCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:188:1: (lv_metamodels_3_0= ruleImportCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:189:3: lv_metamodels_3_0= ruleImportCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCSDeclAccess().getMetamodelsImportCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportCS_in_ruleCSDecl318);
            	    lv_metamodels_3_0=ruleImportCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCSDeclRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"metamodels",
            	              		lv_metamodels_3_0, 
            	              		"ImportCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCSDecl"


    // $ANTLR start "entryRuleASDecl"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:213:1: entryRuleASDecl returns [EObject current=null] : iv_ruleASDecl= ruleASDecl EOF ;
    public final EObject entryRuleASDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASDecl = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:214:2: (iv_ruleASDecl= ruleASDecl EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:215:2: iv_ruleASDecl= ruleASDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASDecl_in_entryRuleASDecl356);
            iv_ruleASDecl=ruleASDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleASDecl366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleASDecl"


    // $ANTLR start "ruleASDecl"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:222:1: ruleASDecl returns [EObject current=null] : (otherlv_0= 'as' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) ;
    public final EObject ruleASDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metamodels_1_0 = null;

        EObject lv_metamodels_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:225:28: ( (otherlv_0= 'as' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:226:1: (otherlv_0= 'as' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:226:1: (otherlv_0= 'as' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:226:3: otherlv_0= 'as' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleASDecl403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getASDeclAccess().getAsKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:230:1: ( (lv_metamodels_1_0= ruleImportCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:231:1: (lv_metamodels_1_0= ruleImportCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:231:1: (lv_metamodels_1_0= ruleImportCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:232:3: lv_metamodels_1_0= ruleImportCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getASDeclAccess().getMetamodelsImportCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportCS_in_ruleASDecl424);
            lv_metamodels_1_0=ruleImportCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getASDeclRule());
              	        }
                     		add(
                     			current, 
                     			"metamodels",
                      		lv_metamodels_1_0, 
                      		"ImportCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:248:2: (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:248:4: otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleASDecl437); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getASDeclAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:252:1: ( (lv_metamodels_3_0= ruleImportCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:253:1: (lv_metamodels_3_0= ruleImportCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:253:1: (lv_metamodels_3_0= ruleImportCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:254:3: lv_metamodels_3_0= ruleImportCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getASDeclAccess().getMetamodelsImportCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportCS_in_ruleASDecl458);
            	    lv_metamodels_3_0=ruleImportCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getASDeclRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"metamodels",
            	              		lv_metamodels_3_0, 
            	              		"ImportCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleASDecl"


    // $ANTLR start "entryRuleImportCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:278:1: entryRuleImportCS returns [EObject current=null] : iv_ruleImportCS= ruleImportCS EOF ;
    public final EObject entryRuleImportCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:279:2: (iv_ruleImportCS= ruleImportCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:280:2: iv_ruleImportCS= ruleImportCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportCS_in_entryRuleImportCS496);
            iv_ruleImportCS=ruleImportCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportCS506); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportCS"


    // $ANTLR start "ruleImportCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:287:1: ruleImportCS returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? ) ;
    public final EObject ruleImportCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isAll_3_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedPathName_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:290:28: ( ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:291:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:291:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:291:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:291:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SIMPLE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=1;
                }
            }
            else if ( (LA4_0==RULE_ESCAPED_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==19) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:291:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':'
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:291:3: ( (lv_name_0_0= ruleIdentifier ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:292:1: (lv_name_0_0= ruleIdentifier )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:292:1: (lv_name_0_0= ruleIdentifier )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:293:3: lv_name_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportCSAccess().getNameIdentifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleImportCS553);
                    lv_name_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportCSRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleImportCS565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImportCSAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:313:3: ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:314:1: (lv_ownedPathName_2_0= ruleURIPathNameCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:314:1: (lv_ownedPathName_2_0= ruleURIPathNameCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:315:3: lv_ownedPathName_2_0= ruleURIPathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportCSAccess().getOwnedPathNameURIPathNameCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIPathNameCS_in_ruleImportCS588);
            lv_ownedPathName_2_0=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPathName",
                      		lv_ownedPathName_2_0, 
                      		"URIPathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:331:2: ( (lv_isAll_3_0= '::*' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:332:1: (lv_isAll_3_0= '::*' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:332:1: (lv_isAll_3_0= '::*' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:333:3: lv_isAll_3_0= '::*'
                    {
                    lv_isAll_3_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleImportCS606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isAll_3_0, grammarAccess.getImportCSAccess().getIsAllColonColonAsteriskKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportCSRule());
                      	        }
                             		setWithLastConsumed(current, "isAll", true, "::*");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImportCS"


    // $ANTLR start "entryRuleClassMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:354:1: entryRuleClassMap returns [EObject current=null] : iv_ruleClassMap= ruleClassMap EOF ;
    public final EObject entryRuleClassMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMap = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:355:2: (iv_ruleClassMap= ruleClassMap EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:356:2: iv_ruleClassMap= ruleClassMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassMapRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassMap_in_entryRuleClassMap656);
            iv_ruleClassMap=ruleClassMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassMap; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassMap666); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassMap"


    // $ANTLR start "ruleClassMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:363:1: ruleClassMap returns [EObject current=null] : (otherlv_0= 'map' ( (lv_from_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( ( (lv_mappingDef_5_0= ruleSimpleMap ) ) | ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+ )? otherlv_7= '}' ) ;
    public final EObject ruleClassMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_from_1_0=null;
        Token otherlv_2=null;
        Token lv_to_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_mappingDef_5_0 = null;

        EObject lv_disambiguationRules_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:366:28: ( (otherlv_0= 'map' ( (lv_from_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( ( (lv_mappingDef_5_0= ruleSimpleMap ) ) | ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+ )? otherlv_7= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:367:1: (otherlv_0= 'map' ( (lv_from_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( ( (lv_mappingDef_5_0= ruleSimpleMap ) ) | ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+ )? otherlv_7= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:367:1: (otherlv_0= 'map' ( (lv_from_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( ( (lv_mappingDef_5_0= ruleSimpleMap ) ) | ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+ )? otherlv_7= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:367:3: otherlv_0= 'map' ( (lv_from_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( ( (lv_mappingDef_5_0= ruleSimpleMap ) ) | ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+ )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleClassMap703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassMapAccess().getMapKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:371:1: ( (lv_from_1_0= RULE_SIMPLE_ID ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:372:1: (lv_from_1_0= RULE_SIMPLE_ID )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:372:1: (lv_from_1_0= RULE_SIMPLE_ID )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:373:3: lv_from_1_0= RULE_SIMPLE_ID
            {
            lv_from_1_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleClassMap720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_from_1_0, grammarAccess.getClassMapAccess().getFromSIMPLE_IDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassMapRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"from",
                      		lv_from_1_0, 
                      		"SIMPLE_ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleClassMap737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassMapAccess().getToKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:393:1: ( (lv_to_3_0= RULE_SIMPLE_ID ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:394:1: (lv_to_3_0= RULE_SIMPLE_ID )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:394:1: (lv_to_3_0= RULE_SIMPLE_ID )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:395:3: lv_to_3_0= RULE_SIMPLE_ID
            {
            lv_to_3_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleClassMap754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_to_3_0, grammarAccess.getClassMapAccess().getToSIMPLE_IDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassMapRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"to",
                      		lv_to_3_0, 
                      		"SIMPLE_ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClassMap771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassMapAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:415:1: ( ( (lv_mappingDef_5_0= ruleSimpleMap ) ) | ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+ )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SIMPLE_ID && LA7_0<=RULE_SINGLE_QUOTED_STRING)||LA7_0==21||LA7_0==27||(LA7_0>=29 && LA7_0<=30)||(LA7_0>=32 && LA7_0<=34)||(LA7_0>=51 && LA7_0<=52)||(LA7_0>=54 && LA7_0<=66)||(LA7_0>=69 && LA7_0<=73)||LA7_0==81||(LA7_0>=86 && LA7_0<=87)) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:415:2: ( (lv_mappingDef_5_0= ruleSimpleMap ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:415:2: ( (lv_mappingDef_5_0= ruleSimpleMap ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:416:1: (lv_mappingDef_5_0= ruleSimpleMap )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:416:1: (lv_mappingDef_5_0= ruleSimpleMap )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:417:3: lv_mappingDef_5_0= ruleSimpleMap
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassMapAccess().getMappingDefSimpleMapParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleMap_in_ruleClassMap793);
                    lv_mappingDef_5_0=ruleSimpleMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassMapRule());
                      	        }
                             		set(
                             			current, 
                             			"mappingDef",
                              		lv_mappingDef_5_0, 
                              		"SimpleMap");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:434:6: ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:434:6: ( (lv_disambiguationRules_6_0= ruleDisambiguationMap ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:435:1: (lv_disambiguationRules_6_0= ruleDisambiguationMap )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:435:1: (lv_disambiguationRules_6_0= ruleDisambiguationMap )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:436:3: lv_disambiguationRules_6_0= ruleDisambiguationMap
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassMapAccess().getDisambiguationRulesDisambiguationMapParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleDisambiguationMap_in_ruleClassMap820);
                    	    lv_disambiguationRules_6_0=ruleDisambiguationMap();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassMapRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"disambiguationRules",
                    	              		lv_disambiguationRules_6_0, 
                    	              		"DisambiguationMap");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClassMap835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getClassMapAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassMap"


    // $ANTLR start "entryRuleDisambiguationMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:464:1: entryRuleDisambiguationMap returns [EObject current=null] : iv_ruleDisambiguationMap= ruleDisambiguationMap EOF ;
    public final EObject entryRuleDisambiguationMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisambiguationMap = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:465:2: (iv_ruleDisambiguationMap= ruleDisambiguationMap EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:466:2: iv_ruleDisambiguationMap= ruleDisambiguationMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisambiguationMapRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDisambiguationMap_in_entryRuleDisambiguationMap871);
            iv_ruleDisambiguationMap=ruleDisambiguationMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisambiguationMap; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisambiguationMap881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisambiguationMap"


    // $ANTLR start "ruleDisambiguationMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:473:1: ruleDisambiguationMap returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_rule_1_0= ruleExpCS ) ) otherlv_2= 'produces' ( (lv_produces_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( (lv_mappingDef_5_0= ruleSimpleMap ) )? otherlv_6= '}' ) ;
    public final EObject ruleDisambiguationMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_produces_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rule_1_0 = null;

        EObject lv_mappingDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:476:28: ( (otherlv_0= 'rule' ( (lv_rule_1_0= ruleExpCS ) ) otherlv_2= 'produces' ( (lv_produces_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( (lv_mappingDef_5_0= ruleSimpleMap ) )? otherlv_6= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:477:1: (otherlv_0= 'rule' ( (lv_rule_1_0= ruleExpCS ) ) otherlv_2= 'produces' ( (lv_produces_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( (lv_mappingDef_5_0= ruleSimpleMap ) )? otherlv_6= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:477:1: (otherlv_0= 'rule' ( (lv_rule_1_0= ruleExpCS ) ) otherlv_2= 'produces' ( (lv_produces_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( (lv_mappingDef_5_0= ruleSimpleMap ) )? otherlv_6= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:477:3: otherlv_0= 'rule' ( (lv_rule_1_0= ruleExpCS ) ) otherlv_2= 'produces' ( (lv_produces_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' ( (lv_mappingDef_5_0= ruleSimpleMap ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDisambiguationMap918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDisambiguationMapAccess().getRuleKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:481:1: ( (lv_rule_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:482:1: (lv_rule_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:482:1: (lv_rule_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:483:3: lv_rule_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDisambiguationMapAccess().getRuleExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleDisambiguationMap939);
            lv_rule_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDisambiguationMapRule());
              	        }
                     		set(
                     			current, 
                     			"rule",
                      		lv_rule_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDisambiguationMap951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDisambiguationMapAccess().getProducesKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:503:1: ( (lv_produces_3_0= RULE_SIMPLE_ID ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:504:1: (lv_produces_3_0= RULE_SIMPLE_ID )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:504:1: (lv_produces_3_0= RULE_SIMPLE_ID )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:505:3: lv_produces_3_0= RULE_SIMPLE_ID
            {
            lv_produces_3_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleDisambiguationMap968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_produces_3_0, grammarAccess.getDisambiguationMapAccess().getProducesSIMPLE_IDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDisambiguationMapRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"produces",
                      		lv_produces_3_0, 
                      		"SIMPLE_ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDisambiguationMap985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDisambiguationMapAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:525:1: ( (lv_mappingDef_5_0= ruleSimpleMap ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SIMPLE_ID && LA8_0<=RULE_SINGLE_QUOTED_STRING)||LA8_0==21||LA8_0==27||(LA8_0>=29 && LA8_0<=30)||(LA8_0>=32 && LA8_0<=34)||(LA8_0>=51 && LA8_0<=52)||(LA8_0>=54 && LA8_0<=66)||(LA8_0>=69 && LA8_0<=73)||LA8_0==81||(LA8_0>=86 && LA8_0<=87)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:526:1: (lv_mappingDef_5_0= ruleSimpleMap )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:526:1: (lv_mappingDef_5_0= ruleSimpleMap )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:527:3: lv_mappingDef_5_0= ruleSimpleMap
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDisambiguationMapAccess().getMappingDefSimpleMapParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleMap_in_ruleDisambiguationMap1006);
                    lv_mappingDef_5_0=ruleSimpleMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDisambiguationMapRule());
                      	        }
                             		set(
                             			current, 
                             			"mappingDef",
                              		lv_mappingDef_5_0, 
                              		"SimpleMap");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDisambiguationMap1019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDisambiguationMapAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDisambiguationMap"


    // $ANTLR start "entryRuleSimpleMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:555:1: entryRuleSimpleMap returns [EObject current=null] : iv_ruleSimpleMap= ruleSimpleMap EOF ;
    public final EObject entryRuleSimpleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMap = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:556:2: (iv_ruleSimpleMap= ruleSimpleMap EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:557:2: iv_ruleSimpleMap= ruleSimpleMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleMapRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleMap_in_entryRuleSimpleMap1055);
            iv_ruleSimpleMap=ruleSimpleMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleMap; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleMap1065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleMap"


    // $ANTLR start "ruleSimpleMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:564:1: ruleSimpleMap returns [EObject current=null] : ( () ( (lv_mappedProperties_1_0= rulePropertyMap ) )+ ) ;
    public final EObject ruleSimpleMap() throws RecognitionException {
        EObject current = null;

        EObject lv_mappedProperties_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:567:28: ( ( () ( (lv_mappedProperties_1_0= rulePropertyMap ) )+ ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:568:1: ( () ( (lv_mappedProperties_1_0= rulePropertyMap ) )+ )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:568:1: ( () ( (lv_mappedProperties_1_0= rulePropertyMap ) )+ )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:568:2: () ( (lv_mappedProperties_1_0= rulePropertyMap ) )+
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:568:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:569:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSimpleMapAccess().getSimpleMapAction_0(),
                          current);
                  
            }

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:577:2: ( (lv_mappedProperties_1_0= rulePropertyMap ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_SIMPLE_ID && LA9_0<=RULE_SINGLE_QUOTED_STRING)||LA9_0==21||LA9_0==27||(LA9_0>=29 && LA9_0<=30)||(LA9_0>=32 && LA9_0<=34)||(LA9_0>=51 && LA9_0<=52)||(LA9_0>=54 && LA9_0<=66)||(LA9_0>=69 && LA9_0<=73)||LA9_0==81||(LA9_0>=86 && LA9_0<=87)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:578:1: (lv_mappedProperties_1_0= rulePropertyMap )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:578:1: (lv_mappedProperties_1_0= rulePropertyMap )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:579:3: lv_mappedProperties_1_0= rulePropertyMap
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleMapAccess().getMappedPropertiesPropertyMapParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePropertyMap_in_ruleSimpleMap1123);
            	    lv_mappedProperties_1_0=rulePropertyMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimpleMapRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappedProperties",
            	              		lv_mappedProperties_1_0, 
            	              		"PropertyMap");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleMap"


    // $ANTLR start "entryRulePropertyMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:603:1: entryRulePropertyMap returns [EObject current=null] : iv_rulePropertyMap= rulePropertyMap EOF ;
    public final EObject entryRulePropertyMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMap = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:604:2: (iv_rulePropertyMap= rulePropertyMap EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:605:2: iv_rulePropertyMap= rulePropertyMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyMapRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyMap_in_entryRulePropertyMap1160);
            iv_rulePropertyMap=rulePropertyMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyMap; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyMap1170); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyMap"


    // $ANTLR start "rulePropertyMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:612:1: rulePropertyMap returns [EObject current=null] : ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= '<-' ( (lv_rhs_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePropertyMap() throws RecognitionException {
        EObject current = null;

        Token lv_redefine_0_0=null;
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:615:28: ( ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= '<-' ( (lv_rhs_3_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:616:1: ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= '<-' ( (lv_rhs_3_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:616:1: ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= '<-' ( (lv_rhs_3_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:616:2: ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= '<-' ( (lv_rhs_3_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:616:2: ( (lv_redefine_0_0= 'redefine' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:617:1: (lv_redefine_0_0= 'redefine' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:617:1: (lv_redefine_0_0= 'redefine' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:618:3: lv_redefine_0_0= 'redefine'
                    {
                    lv_redefine_0_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePropertyMap1213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_redefine_0_0, grammarAccess.getPropertyMapAccess().getRedefineRedefineKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyMapRule());
                      	        }
                             		setWithLastConsumed(current, "redefine", true, "redefine");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:631:3: ( (lv_lhs_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:632:1: (lv_lhs_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:632:1: (lv_lhs_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:633:3: lv_lhs_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyMapAccess().getLhsExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePropertyMap1248);
            lv_lhs_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyMapRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePropertyMap1260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyMapAccess().getLessThanSignHyphenMinusKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:653:1: ( (lv_rhs_3_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:654:1: (lv_rhs_3_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:654:1: (lv_rhs_3_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:655:3: lv_rhs_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyMapAccess().getRhsExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePropertyMap1281);
            lv_rhs_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyMapRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_3_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyMap"


    // $ANTLR start "entryRulePrimaryExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:679:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:680:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:681:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS1317);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS1327); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:688:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_SelfExpCS_2 = null;

        EObject this_PrimitiveLiteralExpCS_3 = null;

        EObject this_TupleLiteralExpCS_4 = null;

        EObject this_MapLiteralExpCS_5 = null;

        EObject this_CollectionLiteralExpCS_6 = null;

        EObject this_LambdaLiteralExpCS_7 = null;

        EObject this_TypeLiteralExpCS_8 = null;

        EObject this_NameExpCS_9 = null;

        EObject this_MapExpCS_10 = null;

        EObject this_LookupExpCS_11 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:691:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:692:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:692:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS )
            int alt11=12;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:693:2: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS1377);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:706:2: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS1407);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:719:2: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS1437);
                    this_SelfExpCS_2=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:732:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS1467);
                    this_PrimitiveLiteralExpCS_3=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:745:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS1497);
                    this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:758:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_rulePrimaryExpCS1527);
                    this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapLiteralExpCS_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:771:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS1557);
                    this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionLiteralExpCS_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:784:2: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLambdaLiteralExpCS_in_rulePrimaryExpCS1587);
                    this_LambdaLiteralExpCS_7=ruleLambdaLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LambdaLiteralExpCS_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:797:2: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS1617);
                    this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralExpCS_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:810:2: this_NameExpCS_9= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_rulePrimaryExpCS1647);
                    this_NameExpCS_9=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameExpCS_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:823:2: this_MapExpCS_10= ruleMapExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapExpCSParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapExpCS_in_rulePrimaryExpCS1677);
                    this_MapExpCS_10=ruleMapExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapExpCS_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:836:2: this_LookupExpCS_11= ruleLookupExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLookupExpCSParserRuleCall_11()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLookupExpCS_in_rulePrimaryExpCS1707);
                    this_LookupExpCS_11=ruleLookupExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LookupExpCS_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleMapExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:855:1: entryRuleMapExpCS returns [EObject current=null] : iv_ruleMapExpCS= ruleMapExpCS EOF ;
    public final EObject entryRuleMapExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:856:2: (iv_ruleMapExpCS= ruleMapExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:857:2: iv_ruleMapExpCS= ruleMapExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapExpCS_in_entryRuleMapExpCS1742);
            iv_ruleMapExpCS=ruleMapExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapExpCS1752); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapExpCS"


    // $ANTLR start "ruleMapExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:864:1: ruleMapExpCS returns [EObject current=null] : ( () otherlv_1= 'map' ) ;
    public final EObject ruleMapExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:867:28: ( ( () otherlv_1= 'map' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:868:1: ( () otherlv_1= 'map' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:868:1: ( () otherlv_1= 'map' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:868:2: () otherlv_1= 'map'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:868:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:869:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMapExpCSAccess().getMapExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMapExpCS1801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapExpCSAccess().getMapKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMapExpCS"


    // $ANTLR start "entryRuleLookupExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:889:1: entryRuleLookupExpCS returns [EObject current=null] : iv_ruleLookupExpCS= ruleLookupExpCS EOF ;
    public final EObject entryRuleLookupExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:890:2: (iv_ruleLookupExpCS= ruleLookupExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:891:2: iv_ruleLookupExpCS= ruleLookupExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLookupExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLookupExpCS_in_entryRuleLookupExpCS1837);
            iv_ruleLookupExpCS=ruleLookupExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLookupExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLookupExpCS1847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLookupExpCS"


    // $ANTLR start "ruleLookupExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:898:1: ruleLookupExpCS returns [EObject current=null] : (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleLookupExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:901:28: ( (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:902:1: (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:902:1: (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:902:3: otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLookupExpCS1884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLookupExpCSAccess().getLookupKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLookupExpCS1896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLookupExpCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:910:1: ( (lv_args_2_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:911:1: (lv_args_2_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:911:1: (lv_args_2_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:912:3: lv_args_2_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLookupExpCSAccess().getArgsNavigatingArgExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1917);
            lv_args_2_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLookupExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"args",
                      		lv_args_2_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:928:2: (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:928:4: otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLookupExpCS1930); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getLookupExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:932:1: ( (lv_args_4_0= ruleNavigatingArgExpCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:933:1: (lv_args_4_0= ruleNavigatingArgExpCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:933:1: (lv_args_4_0= ruleNavigatingArgExpCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:934:3: lv_args_4_0= ruleNavigatingArgExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLookupExpCSAccess().getArgsNavigatingArgExpCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1951);
            	    lv_args_4_0=ruleNavigatingArgExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLookupExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"args",
            	              		lv_args_4_0, 
            	              		"NavigatingArgExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLookupExpCS1965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLookupExpCSAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLookupExpCS"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:964:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:965:2: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:966:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName2004);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName2015); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorName"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:973:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:976:28: ( (kw= '-' | kw= 'not' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:977:1: (kw= '-' | kw= 'not' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:977:1: (kw= '-' | kw= 'not' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:978:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLUnaryOperatorName2053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:985:2: kw= 'not'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLUnaryOperatorName2072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEssentialOCLUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:998:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:999:2: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1000:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName2113);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName2124); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorName"


    // $ANTLR start "ruleEssentialOCLInfixOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1007:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1010:28: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1011:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1011:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt14=14;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt14=1;
                }
                break;
            case 35:
                {
                alt14=2;
                }
                break;
            case 36:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 37:
                {
                alt14=5;
                }
                break;
            case 38:
                {
                alt14=6;
                }
                break;
            case 39:
                {
                alt14=7;
                }
                break;
            case 40:
                {
                alt14=8;
                }
                break;
            case 41:
                {
                alt14=9;
                }
                break;
            case 42:
                {
                alt14=10;
                }
                break;
            case 43:
                {
                alt14=11;
                }
                break;
            case 44:
                {
                alt14=12;
                }
                break;
            case 45:
                {
                alt14=13;
                }
                break;
            case 46:
                {
                alt14=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1012:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperatorName2162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1019:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLInfixOperatorName2181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1026:2: kw= '+'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLInfixOperatorName2200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1033:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLInfixOperatorName2219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1040:2: kw= '>'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperatorName2238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1047:2: kw= '<'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperatorName2257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1054:2: kw= '>='
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1061:2: kw= '<='
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1068:2: kw= '='
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1075:2: kw= '<>'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1082:2: kw= 'and'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1089:2: kw= 'or'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1096:2: kw= 'xor'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1103:2: kw= 'implies'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_13()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEssentialOCLInfixOperatorName"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1116:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1117:2: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1118:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2450);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2461); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1125:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1128:28: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1129:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1129:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt15=1;
                }
                break;
            case 48:
                {
                alt15=2;
                }
                break;
            case 49:
                {
                alt15=3;
                }
                break;
            case 50:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1130:2: kw= '.'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEssentialOCLNavigationOperatorName2499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1137:2: kw= '->'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1144:2: kw= '?.'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1151:2: kw= '?->'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleBinaryOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1164:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1165:2: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1166:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2597);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorName2608); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOperatorName"


    // $ANTLR start "ruleBinaryOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1173:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1176:28: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1177:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1177:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32||(LA16_0>=34 && LA16_0<=46)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=47 && LA16_0<=50)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1178:5: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2655);
                    this_InfixOperatorName_0=ruleInfixOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixOperatorName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1190:5: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2688);
                    this_NavigationOperatorName_1=ruleNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NavigationOperatorName_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBinaryOperatorName"


    // $ANTLR start "entryRuleInfixOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1208:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1209:2: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1210:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2734);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorName2745); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixOperatorName"


    // $ANTLR start "ruleInfixOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1217:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1220:28: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1222:5: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2791);
            this_EssentialOCLInfixOperatorName_0=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLInfixOperatorName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInfixOperatorName"


    // $ANTLR start "entryRuleNavigationOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1240:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1241:2: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1242:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2836);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorName2847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOperatorName"


    // $ANTLR start "ruleNavigationOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1249:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1252:28: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1254:5: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2893);
            this_EssentialOCLNavigationOperatorName_0=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLNavigationOperatorName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigationOperatorName"


    // $ANTLR start "entryRuleUnaryOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1272:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1273:2: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1274:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2938);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorName2949); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOperatorName"


    // $ANTLR start "ruleUnaryOperatorName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1281:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1284:28: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1286:5: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2995);
            this_EssentialOCLUnaryOperatorName_0=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnaryOperatorName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1304:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1305:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1306:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName3040);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName3051); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1313:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1316:28: (this_Identifier_0= ruleIdentifier )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1318:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName3097);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1336:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1337:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1338:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName3142);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName3153); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1345:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1348:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1350:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName3199);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1368:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1369:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1370:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName3244);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName3255); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1377:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1380:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1381:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1381:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt17=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt17=2;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt17=3;
                }
                break;
            case 51:
                {
                alt17=4;
                }
                break;
            case 52:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1382:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3302);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UnrestrictedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1394:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3335);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CollectionTypeIdentifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1406:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3368);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimitiveTypeIdentifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1418:2: kw= 'Map'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEssentialOCLUnreservedName3392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1425:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEssentialOCLUnreservedName3411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRuleUnreservedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1438:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1439:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1440:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3452);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName3463); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1447:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1450:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1452:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3509);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRuleURIPathNameCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1470:1: entryRuleURIPathNameCS returns [EObject current=null] : iv_ruleURIPathNameCS= ruleURIPathNameCS EOF ;
    public final EObject entryRuleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIPathNameCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1471:2: (iv_ruleURIPathNameCS= ruleURIPathNameCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1472:2: iv_ruleURIPathNameCS= ruleURIPathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIPathNameCS_in_entryRuleURIPathNameCS3553);
            iv_ruleURIPathNameCS=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIPathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIPathNameCS3563); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURIPathNameCS"


    // $ANTLR start "ruleURIPathNameCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1479:1: ruleURIPathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject ruleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1482:28: ( ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1483:1: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1483:1: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1483:2: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1483:2: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1484:1: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1484:1: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1485:3: lv_ownedPathElements_0_0= ruleURIFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsURIFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_ruleURIPathNameCS3609);
            lv_ownedPathElements_0_0=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getURIPathNameCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedPathElements",
                      		lv_ownedPathElements_0_0, 
                      		"URIFirstPathElementCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1501:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1501:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleURIPathNameCS3622); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getURIPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1505:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1506:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1506:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1507:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_ruleURIPathNameCS3643);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getURIPathNameCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPathElements",
            	              		lv_ownedPathElements_2_0, 
            	              		"NextPathElementCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleURIPathNameCS"


    // $ANTLR start "entryRuleURIFirstPathElementCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1531:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1532:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1533:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3681);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3691); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURIFirstPathElementCS"


    // $ANTLR start "ruleURIFirstPathElementCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1540:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1543:28: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1544:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1544:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_SIMPLE_ID && LA19_0<=RULE_ESCAPED_ID)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1544:2: ( ( ruleUnrestrictedName ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1544:2: ( ( ruleUnrestrictedName ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1545:1: ( ruleUnrestrictedName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1545:1: ( ruleUnrestrictedName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1546:3: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3743);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1563:6: ( () ( ( ruleURI ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1563:6: ( () ( ( ruleURI ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1563:7: () ( ( ruleURI ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1563:7: ()
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1564:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getURIFirstPathElementCSAccess().getPathElementWithURICSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1572:2: ( ( ruleURI ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1573:1: ( ruleURI )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1573:1: ( ruleURI )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1574:3: ruleURI
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamespaceCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3789);
                    ruleURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleURIFirstPathElementCS"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1598:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1599:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1600:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3827);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3838); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1607:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1610:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1611:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1611:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt20=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt20=1;
                }
                break;
            case 55:
                {
                alt20=2;
                }
                break;
            case 56:
                {
                alt20=3;
                }
                break;
            case 57:
                {
                alt20=4;
                }
                break;
            case 58:
                {
                alt20=5;
                }
                break;
            case 59:
                {
                alt20=6;
                }
                break;
            case 60:
                {
                alt20=7;
                }
                break;
            case 61:
                {
                alt20=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1612:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimitiveTypeIdentifier3876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1619:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimitiveTypeIdentifier3895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1626:2: kw= 'Real'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePrimitiveTypeIdentifier3914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1633:2: kw= 'String'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveTypeIdentifier3933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1640:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePrimitiveTypeIdentifier3952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1647:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveTypeIdentifier3971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1654:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePrimitiveTypeIdentifier3990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1661:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulePrimitiveTypeIdentifier4009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1674:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1675:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1676:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS4049);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS4059); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1683:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1686:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1687:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1687:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1688:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1688:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1689:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS4104);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"PrimitiveTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1713:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1714:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1715:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier4140);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier4151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1722:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1725:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1726:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1726:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt21=1;
                }
                break;
            case 63:
                {
                alt21=2;
                }
                break;
            case 64:
                {
                alt21=3;
                }
                break;
            case 65:
                {
                alt21=4;
                }
                break;
            case 66:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1727:2: kw= 'Set'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCollectionTypeIdentifier4189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1734:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCollectionTypeIdentifier4208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1741:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier4227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1748:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionTypeIdentifier4246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1755:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleCollectionTypeIdentifier4265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1768:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1769:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1770:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4305);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS4315); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1777:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1780:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1781:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1781:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1781:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1781:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1782:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1782:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1783:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4361);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"CollectionTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1799:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1799:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionTypeCS4374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1803:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1804:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1804:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1805:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4395);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionTypeCS4407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMapTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1833:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1834:2: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1835:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4445);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapTypeCS4455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapTypeCS"


    // $ANTLR start "ruleMapTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1842:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleMapTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1845:28: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1846:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1846:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1846:2: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1846:2: ( (lv_name_0_0= 'Map' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1847:1: (lv_name_0_0= 'Map' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1847:1: (lv_name_0_0= 'Map' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1848:3: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMapTypeCS4498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getMapTypeCSAccess().getNameMapKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMapTypeCSRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Map");
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1861:2: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1861:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMapTypeCS4524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1865:1: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1866:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1866:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1867:3: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4545);
                    lv_ownedKeyType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedKeyType",
                              		lv_ownedKeyType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMapTypeCS4557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1887:1: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1888:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1888:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1889:3: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4578);
                    lv_ownedValueType_4_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedValueType",
                              		lv_ownedValueType_4_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMapTypeCS4590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMapTypeCSAccess().getRightParenthesisKeyword_1_4());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMapTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1917:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1918:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1919:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4628);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS4638); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1926:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1929:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1930:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1930:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1930:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1930:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1931:1: (lv_name_0_0= 'Tuple' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1931:1: (lv_name_0_0= 'Tuple' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1932:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTupleTypeCS4681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTupleTypeCSRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1945:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                switch ( input.LA(2) ) {
                    case RULE_SIMPLE_ID:
                        {
                        int LA26_3 = input.LA(3);

                        if ( (LA26_3==19) ) {
                            alt26=1;
                        }
                        }
                        break;
                    case RULE_ESCAPED_ID:
                        {
                        int LA26_4 = input.LA(3);

                        if ( (LA26_4==19) ) {
                            alt26=1;
                        }
                        }
                        break;
                    case 31:
                        {
                        alt26=1;
                        }
                        break;
                }

            }
            switch (alt26) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1945:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTupleTypeCS4707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1949:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=RULE_SIMPLE_ID && LA25_0<=RULE_ESCAPED_ID)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1949:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1949:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1950:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1950:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1951:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4729);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedParts",
                                      		lv_ownedParts_2_0, 
                                      		"TuplePartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1967:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==17) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1967:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleTypeCS4742); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1971:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1972:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1972:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1973:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4763);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedParts",
                            	              		lv_ownedParts_4_0, 
                            	              		"TuplePartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTupleTypeCS4779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2001:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2002:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2003:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4817);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS4827); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2010:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2013:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2014:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2014:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2014:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2014:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2015:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2015:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2016:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4873);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTuplePartCS4885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2036:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2037:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2037:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2038:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4906);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_2_0, 
                      		"TypeExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2062:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2063:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2064:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4942);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4952); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2071:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2074:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2075:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2075:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2075:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2075:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2076:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2076:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2077:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4998);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionLiteralExpCS5010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2097:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SIMPLE_ID && LA28_0<=RULE_SINGLE_QUOTED_STRING)||LA28_0==19||LA28_0==21||(LA28_0>=29 && LA28_0<=30)||(LA28_0>=32 && LA28_0<=34)||(LA28_0>=51 && LA28_0<=52)||(LA28_0>=54 && LA28_0<=66)||(LA28_0>=69 && LA28_0<=73)||LA28_0==81||(LA28_0>=86 && LA28_0<=87)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2097:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2097:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2098:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2098:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2099:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS5032);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"CollectionLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2115:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==17) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2115:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCollectionLiteralExpCS5045); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2119:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2120:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2120:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2121:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS5066);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"CollectionLiteralPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCollectionLiteralExpCS5082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2149:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2150:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2151:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS5118);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS5128); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2158:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2161:28: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2162:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2162:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt30=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 21:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 81:
            case 86:
            case 87:
                {
                alt30=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==19) ) {
                    alt30=2;
                }
                else if ( (LA30_2==EOF||LA30_2==17||(LA30_2>=23 && LA30_2<=24)||LA30_2==30||LA30_2==32||(LA30_2>=34 && LA30_2<=50)||LA30_2==53||LA30_2==67||LA30_2==74||LA30_2==76) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==EOF||LA30_3==17||(LA30_3>=23 && LA30_3<=24)||LA30_3==30||LA30_3==32||(LA30_3>=34 && LA30_3<=50)||LA30_3==53||LA30_3==67||LA30_3==74||LA30_3==76) ) {
                    alt30=1;
                }
                else if ( (LA30_3==19) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt30=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2162:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2162:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2162:3: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2162:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2163:1: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2163:1: (lv_ownedExpression_0_0= ruleExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2164:3: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5175);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_0_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2180:2: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==67) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2180:4: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCollectionLiteralPartCS5188); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2184:1: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2185:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2185:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2186:3: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5209);
                            lv_ownedLastExpression_2_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedLastExpression",
                                      		lv_ownedLastExpression_2_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2203:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2203:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2204:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2204:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2205:3: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS5239);
                    lv_ownedExpression_3_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_3_0, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleCollectionPatternCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2229:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2230:2: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2231:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5275);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionPatternCS5285); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionPatternCS"


    // $ANTLR start "ruleCollectionPatternCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2238:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        AntlrDatatypeRuleToken lv_restVariableName_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2241:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2242:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2242:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2242:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2242:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2243:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2243:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2244:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5331);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionPatternCS5343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2264:1: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_SIMPLE_ID && LA32_0<=RULE_ESCAPED_ID)||LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2264:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2264:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2265:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2265:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2266:3: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5365);
                    lv_ownedParts_2_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2282:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==17) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2282:4: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCollectionPatternCS5378); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2286:1: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2287:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2287:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2288:3: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5399);
                    	    lv_ownedParts_4_0=rulePatternExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"PatternExpCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2304:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2304:6: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCollectionPatternCS5414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2308:1: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2309:1: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2309:1: (lv_restVariableName_6_0= ruleIdentifier )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2310:3: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5435);
                    lv_restVariableName_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      	        }
                             		set(
                             			current, 
                             			"restVariableName",
                              		lv_restVariableName_6_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCollectionPatternCS5450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCollectionPatternCSAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectionPatternCS"


    // $ANTLR start "entryRuleShadowPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2338:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2339:2: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2340:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5486);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShadowPartCS5496); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShadowPartCS"


    // $ANTLR start "ruleShadowPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2347:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2350:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2351:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2351:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2351:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2351:2: ( ( ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2352:1: ( ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2352:1: ( ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2353:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getShadowPartCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getReferredPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5548);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleShadowPartCS5560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2373:1: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2374:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2374:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2375:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2375:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            int alt33=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 21:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 81:
            case 86:
            case 87:
                {
                alt33=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EOF||LA33_2==17||(LA33_2>=23 && LA33_2<=24)||LA33_2==30||LA33_2==32||(LA33_2>=34 && LA33_2<=50)||LA33_2==53||LA33_2==74||LA33_2==76) ) {
                    alt33=1;
                }
                else if ( (LA33_2==19) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA33_3 = input.LA(2);

                if ( (LA33_3==EOF||LA33_3==17||(LA33_3>=23 && LA33_3<=24)||LA33_3==30||LA33_3==32||(LA33_3>=34 && LA33_3<=50)||LA33_3==53||LA33_3==74||LA33_3==76) ) {
                    alt33=1;
                }
                else if ( (LA33_3==19) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt33=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2376:3: lv_ownedInitExpression_2_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleShadowPartCS5583);
                    lv_ownedInitExpression_2_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedInitExpression",
                              		lv_ownedInitExpression_2_1, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2391:8: lv_ownedInitExpression_2_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5602);
                    lv_ownedInitExpression_2_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedInitExpression",
                              		lv_ownedInitExpression_2_2, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleShadowPartCS"


    // $ANTLR start "entryRulePatternExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2417:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2418:2: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2419:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5641);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePatternExpCS5651); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternExpCS"


    // $ANTLR start "rulePatternExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2426:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2429:28: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2430:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2430:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2430:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2430:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_SIMPLE_ID && LA34_0<=RULE_ESCAPED_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2431:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2431:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2432:3: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5697);
                    lv_patternVariableName_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"patternVariableName",
                              		lv_patternVariableName_0_0, 
                              		"UnrestrictedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePatternExpCS5710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2452:1: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2453:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2453:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2454:3: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5731);
            lv_ownedPatternType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPatternType",
                      		lv_ownedPatternType_2_0, 
                      		"TypeExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePatternExpCS"


    // $ANTLR start "entryRuleLambdaLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2478:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2479:2: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2480:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5767);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5777); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLambdaLiteralExpCS"


    // $ANTLR start "ruleLambdaLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2487:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2490:28: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2491:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2491:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2491:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLambdaLiteralExpCS5814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLambdaLiteralExpCS5826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2499:1: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2500:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2500:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2501:3: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5847);
            lv_ownedExpressionCS_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLambdaLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedExpressionCS",
                      		lv_ownedExpressionCS_2_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLambdaLiteralExpCS5859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLambdaLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLambdaLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2529:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2530:2: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2531:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5895);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralExpCS5905); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralExpCS"


    // $ANTLR start "ruleMapLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2538:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2541:28: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2542:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2542:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2542:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2542:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2543:1: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2543:1: (lv_ownedType_0_0= ruleMapTypeCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2544:3: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5951);
            lv_ownedType_0_0=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"MapTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMapLiteralExpCS5963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2564:1: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_SIMPLE_ID && LA36_0<=RULE_SINGLE_QUOTED_STRING)||LA36_0==21||(LA36_0>=29 && LA36_0<=30)||(LA36_0>=32 && LA36_0<=34)||(LA36_0>=51 && LA36_0<=52)||(LA36_0>=54 && LA36_0<=66)||(LA36_0>=69 && LA36_0<=73)||LA36_0==81||(LA36_0>=86 && LA36_0<=87)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2564:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2564:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2565:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2565:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2566:3: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5985);
                    lv_ownedParts_2_0=ruleMapLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"MapLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2582:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2582:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMapLiteralExpCS5998); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2586:1: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2587:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2587:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2588:3: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS6019);
                    	    lv_ownedParts_4_0=ruleMapLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"MapLiteralPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMapLiteralExpCS6035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMapLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMapLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2616:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2617:2: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2618:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS6071);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralPartCS6081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralPartCS"


    // $ANTLR start "ruleMapLiteralPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2625:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2628:28: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2629:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2629:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2629:2: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2629:2: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2630:1: (lv_ownedKey_0_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2630:1: (lv_ownedKey_0_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2631:3: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS6127);
            lv_ownedKey_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedKey",
                      		lv_ownedKey_0_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMapLiteralPartCS6139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2651:1: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2652:1: (lv_ownedValue_2_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2652:1: (lv_ownedValue_2_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2653:3: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS6160);
            lv_ownedValue_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_2_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMapLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2677:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2678:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2679:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS6196);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS6206); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2686:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2689:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2690:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2690:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt37=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt37=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt37=2;
                }
                break;
            case 70:
            case 71:
                {
                alt37=3;
                }
                break;
            case 34:
                {
                alt37=4;
                }
                break;
            case 72:
                {
                alt37=5;
                }
                break;
            case 73:
                {
                alt37=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2691:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS6256);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteralExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2704:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6286);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteralExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2717:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6316);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteralExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2730:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6346);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnlimitedNaturalLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2743:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6376);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvalidLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2756:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6406);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteralExpCS_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2775:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2776:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2777:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6441);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6451); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2784:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2787:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2788:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2788:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2788:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTupleLiteralExpCS6488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleLiteralExpCS6500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2796:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2797:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2797:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2798:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6521);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedParts",
                      		lv_ownedParts_2_0, 
                      		"TupleLiteralPartCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2814:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2814:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleLiteralExpCS6534); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2818:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2819:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2819:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2820:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6555);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedParts",
            	              		lv_ownedParts_4_0, 
            	              		"TupleLiteralPartCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTupleLiteralExpCS6569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2848:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2849:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2850:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6605);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2857:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2860:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2861:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2861:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2861:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2861:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2862:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2862:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2863:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6661);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2879:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2879:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTupleLiteralPartCS6674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2883:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2884:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2884:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2885:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6695);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTupleLiteralPartCS6709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2905:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2906:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2906:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2907:3: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6730);
            lv_ownedInitExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedInitExpression",
                      		lv_ownedInitExpression_4_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2931:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2932:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2933:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6766);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2940:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2943:28: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2944:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2944:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2945:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2945:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2946:3: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6821);
            lv_symbol_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"symbol",
                      		lv_symbol_0_0, 
                      		"NUMBER_LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2970:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2971:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2972:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6856);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS6866); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2979:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2982:28: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2983:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2983:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_SINGLE_QUOTED_STRING) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred81_InternalCS2ASDSL()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2984:1: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2984:1: (lv_segments_0_0= ruleStringLiteral )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2985:3: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6911);
            	    lv_segments_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_0_0, 
            	              		"StringLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3009:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3010:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3011:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6947);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6957); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3018:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3021:28: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3022:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3022:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==70) ) {
                alt41=1;
            }
            else if ( (LA41_0==71) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3022:2: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3022:2: ( (lv_symbol_0_0= 'true' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3023:1: (lv_symbol_0_0= 'true' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3023:1: (lv_symbol_0_0= 'true' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3024:3: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleBooleanLiteralExpCS7000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_0_0, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3038:6: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3038:6: ( (lv_symbol_1_0= 'false' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3039:1: (lv_symbol_1_0= 'false' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3039:1: (lv_symbol_1_0= 'false' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3040:3: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleBooleanLiteralExpCS7037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_1_0, "false");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3061:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3062:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3063:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7086);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7096); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3070:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3073:28: ( ( () otherlv_1= '*' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3074:1: ( () otherlv_1= '*' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3074:1: ( () otherlv_1= '*' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3074:2: () otherlv_1= '*'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3074:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3075:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS7145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3095:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3096:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3097:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS7181);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS7191); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3104:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3107:28: ( ( () otherlv_1= 'invalid' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3108:1: ( () otherlv_1= 'invalid' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3108:1: ( () otherlv_1= 'invalid' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3108:2: () otherlv_1= 'invalid'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3108:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3109:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleInvalidLiteralExpCS7240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3129:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3130:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3131:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7276);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS7286); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3138:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3141:28: ( ( () otherlv_1= 'null' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3142:1: ( () otherlv_1= 'null' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3142:1: ( () otherlv_1= 'null' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3142:2: () otherlv_1= 'null'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3142:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3143:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleNullLiteralExpCS7335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3163:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3164:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3165:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS7371);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS7381); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3172:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3175:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3176:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3176:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt42=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt42=2;
                }
                break;
            case 51:
                {
                alt42=3;
                }
                break;
            case 52:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3177:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS7431);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveTypeCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3190:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS7461);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionTypeCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3203:2: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_ruleTypeLiteralCS7491);
                    this_MapTypeCS_2=ruleMapTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapTypeCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3216:2: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS7521);
                    this_TupleTypeCS_3=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleTypeCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3235:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3236:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3237:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7556);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7566); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3244:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3247:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3248:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3248:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3249:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7616);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3260:1: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==76) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3261:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3261:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3262:3: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7636);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedMultiplicity",
                              		lv_ownedMultiplicity_1_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3286:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3287:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3288:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7673);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7683); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3295:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3298:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3299:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3299:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3300:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3300:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3301:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7728);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"TypeLiteralWithMultiplicityCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3325:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3326:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3327:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7763);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS7773); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3334:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3337:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3338:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3338:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3338:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3338:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3339:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3339:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3340:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7819);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPathName",
                      		lv_ownedPathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3356:2: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3356:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3356:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3357:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3357:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3358:3: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7841);
                    lv_ownedCurlyBracketedClause_1_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCurlyBracketedClause",
                              		lv_ownedCurlyBracketedClause_1_0, 
                              		"CurlyBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3374:2: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==23) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3374:4: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTypeNameExpCS7854); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:1: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3379:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3379:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3380:3: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7875);
                            lv_ownedPatternGuard_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedPatternGuard",
                                      		lv_ownedPatternGuard_3_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTypeNameExpCS7887); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getTypeNameExpCSAccess().getRightCurlyBracketKeyword_1_1_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3408:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3409:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3410:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7927);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS7937); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3417:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3420:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3421:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3421:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3421:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3421:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3422:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7988);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeNameExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3435:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8018);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3448:2: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getCollectionPatternCSParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS8048);
                    this_CollectionPatternCS_2=ruleCollectionPatternCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionPatternCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3459:2: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==76) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3460:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3460:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3461:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8069);
                    lv_ownedMultiplicity_3_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedMultiplicity",
                              		lv_ownedMultiplicity_3_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3485:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3486:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3487:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS8106);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS8116); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3494:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3497:28: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3498:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3498:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3498:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3498:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3499:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS8167);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedPrimaryExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt48=2;
                    alt48 = dfa48.predict(input);
                    switch (alt48) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:2: ()
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3511:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0(),
                                          current);
                                  
                            }

                            }

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3519:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3520:1: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3520:1: (lv_name_2_0= ruleBinaryOperatorName )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3521:3: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_ruleExpCS8200);
                            lv_name_2_0=ruleBinaryOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_2_0, 
                                      		"BinaryOperatorName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3537:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3538:1: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3538:1: (lv_ownedRight_3_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3539:3: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleExpCS8221);
                            lv_ownedRight_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedRight",
                                      		lv_ownedRight_3_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3557:2: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS8255);
                    this_PrefixedLetExpCS_4=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedLetExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedLetExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3576:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3577:2: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3578:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS8290);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedLetExpCS8300); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedLetExpCS"


    // $ANTLR start "rulePrefixedLetExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3585:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3588:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3589:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3589:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=32 && LA50_0<=33)) ) {
                alt50=1;
            }
            else if ( (LA50_0==86) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3589:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3589:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3589:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3589:3: ()
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3590:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedLetExpCSAccess().getPrefixExpCSAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3598:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3599:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3599:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3600:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS8359);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"UnaryOperatorName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3616:2: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3617:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3617:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3618:3: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS8380);
                    lv_ownedRight_2_0=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRight",
                              		lv_ownedRight_2_0, 
                              		"PrefixedLetExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3636:2: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS8412);
                    this_LetExpCS_3=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrefixedLetExpCS"


    // $ANTLR start "entryRulePrefixedPrimaryExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3655:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3656:2: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3657:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8447);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8457); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedPrimaryExpCS"


    // $ANTLR start "rulePrefixedPrimaryExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3664:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3667:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3668:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3668:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=32 && LA51_0<=33)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=RULE_SIMPLE_ID && LA51_0<=RULE_SINGLE_QUOTED_STRING)||LA51_0==21||(LA51_0>=29 && LA51_0<=30)||LA51_0==34||(LA51_0>=51 && LA51_0<=52)||(LA51_0>=54 && LA51_0<=66)||(LA51_0>=69 && LA51_0<=73)||LA51_0==81||LA51_0==87) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3668:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3668:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3668:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3668:3: ()
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3669:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedPrimaryExpCSAccess().getPrefixExpCSAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3677:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3678:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3678:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3679:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8516);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"UnaryOperatorName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3695:2: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3696:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3696:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3697:3: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8537);
                    lv_ownedRight_2_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRight",
                              		lv_ownedRight_2_0, 
                              		"PrefixedPrimaryExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3715:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8569);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrefixedPrimaryExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3734:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3735:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3736:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8604);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameExpCS8614); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3743:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_isPre_4_0=null;
        Token otherlv_5=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedSquareBracketedClauses_1_0 = null;

        EObject lv_ownedRoundBracketedClause_2_0 = null;

        EObject lv_ownedCurlyBracketedClause_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3746:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3747:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3747:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3747:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3747:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3748:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3748:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3749:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleNameExpCS8660);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPathName",
                      		lv_ownedPathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3765:2: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==76) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3766:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3766:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3767:3: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8681);
            	    lv_ownedSquareBracketedClauses_1_0=ruleSquareBracketedClauseCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSquareBracketedClauses",
            	              		lv_ownedSquareBracketedClauses_1_0, 
            	              		"SquareBracketedClauseCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3783:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3784:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3784:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3785:3: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8703);
                    lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRoundBracketedClause",
                              		lv_ownedRoundBracketedClause_2_0, 
                              		"RoundBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3801:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3802:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3802:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3803:3: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8725);
                    lv_ownedCurlyBracketedClause_3_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCurlyBracketedClause",
                              		lv_ownedCurlyBracketedClause_3_0, 
                              		"CurlyBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3819:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==74) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3819:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3819:4: ( (lv_isPre_4_0= '@' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3820:1: (lv_isPre_4_0= '@' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3820:1: (lv_isPre_4_0= '@' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3821:3: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleNameExpCS8745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isPre_4_0, grammarAccess.getNameExpCSAccess().getIsPreCommercialAtKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "isPre", true, "@");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleNameExpCS8770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNameExpCSAccess().getPreKeyword_4_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleCurlyBracketedClauseCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3846:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3847:2: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3848:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8808);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8818); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCurlyBracketedClauseCS"


    // $ANTLR start "ruleCurlyBracketedClauseCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3855:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3858:28: ( ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3859:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3859:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3859:2: () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3859:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3860:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCurlyBracketedClauseCSAccess().getCurlyBracketedClauseCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCurlyBracketedClauseCS8867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3872:1: ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_SIMPLE_ID && LA58_0<=RULE_ESCAPED_ID)||LA58_0==24) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3872:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3872:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_SIMPLE_ID && LA57_0<=RULE_ESCAPED_ID)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3872:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3872:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3873:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3873:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3874:3: lv_ownedParts_2_0= ruleShadowPartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8890);
                            lv_ownedParts_2_0=ruleShadowPartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedParts",
                                      		lv_ownedParts_2_0, 
                                      		"ShadowPartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3890:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==17) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3890:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCurlyBracketedClauseCS8903); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_0_1_0());
                            	          
                            	    }
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3894:1: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3895:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    {
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3895:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3896:3: lv_ownedParts_4_0= ruleShadowPartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8924);
                            	    lv_ownedParts_4_0=ruleShadowPartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedParts",
                            	              		lv_ownedParts_4_0, 
                            	              		"ShadowPartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3913:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3913:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3914:1: (lv_value_5_0= ruleStringLiteral )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3914:1: (lv_value_5_0= ruleStringLiteral )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3915:3: lv_value_5_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getValueStringLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8955);
                    lv_value_5_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"StringLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCurlyBracketedClauseCS8968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCurlyBracketedClauseCSAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCurlyBracketedClauseCS"


    // $ANTLR start "entryRuleRoundBracketedClauseCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3943:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3944:2: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3945:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS9004);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS9014); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRoundBracketedClauseCS"


    // $ANTLR start "ruleRoundBracketedClauseCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3952:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) ;
    public final EObject ruleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_ownedArguments_2_0 = null;

        EObject lv_ownedArguments_3_0 = null;

        EObject lv_ownedArguments_4_0 = null;

        EObject lv_ownedArguments_5_0 = null;

        EObject lv_ownedArguments_6_0 = null;

        EObject lv_ownedArguments_7_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3955:28: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3956:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3956:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3956:2: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3956:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3957:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRoundBracketedClauseCSAccess().getRoundBracketedClauseCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRoundBracketedClauseCS9063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3969:1: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_SIMPLE_ID && LA64_0<=RULE_SINGLE_QUOTED_STRING)||LA64_0==19||LA64_0==21||(LA64_0>=29 && LA64_0<=30)||(LA64_0>=32 && LA64_0<=34)||(LA64_0>=51 && LA64_0<=52)||(LA64_0>=54 && LA64_0<=66)||(LA64_0>=69 && LA64_0<=73)||LA64_0==81||(LA64_0>=86 && LA64_0<=87)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3969:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3969:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3970:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3970:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3971:3: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS9085);
                    lv_ownedArguments_2_0=ruleNavigatingArgCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedArguments",
                              		lv_ownedArguments_2_0, 
                              		"NavigatingArgCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3987:2: ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==17) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3988:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3988:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3989:3: lv_ownedArguments_3_0= ruleNavigatingCommaArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS9106);
                    	    lv_ownedArguments_3_0=ruleNavigatingCommaArgCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedArguments",
                    	              		lv_ownedArguments_3_0, 
                    	              		"NavigatingCommaArgCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4005:3: ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==80) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4005:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4005:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4006:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4006:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4007:3: lv_ownedArguments_4_0= ruleNavigatingSemiArgCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS9129);
                            lv_ownedArguments_4_0=ruleNavigatingSemiArgCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedArguments",
                                      		lv_ownedArguments_4_0, 
                                      		"NavigatingSemiArgCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4023:2: ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==17) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4024:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4024:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4025:3: lv_ownedArguments_5_0= ruleNavigatingCommaArgCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS9150);
                            	    lv_ownedArguments_5_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedArguments",
                            	              		lv_ownedArguments_5_0, 
                            	              		"NavigatingCommaArgCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4041:5: ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==79) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4041:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4041:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4042:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4042:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4043:3: lv_ownedArguments_6_0= ruleNavigatingBarArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS9175);
                    	    lv_ownedArguments_6_0=ruleNavigatingBarArgCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedArguments",
                    	              		lv_ownedArguments_6_0, 
                    	              		"NavigatingBarArgCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4059:2: ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    loop62:
                    	    do {
                    	        int alt62=2;
                    	        int LA62_0 = input.LA(1);

                    	        if ( (LA62_0==17) ) {
                    	            alt62=1;
                    	        }


                    	        switch (alt62) {
                    	    	case 1 :
                    	    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4060:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    {
                    	    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4060:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4061:3: lv_ownedArguments_7_0= ruleNavigatingCommaArgCS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_3_1_0()); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS9196);
                    	    	    lv_ownedArguments_7_0=ruleNavigatingCommaArgCS();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	    	      	        }
                    	    	             		add(
                    	    	             			current, 
                    	    	             			"ownedArguments",
                    	    	              		lv_ownedArguments_7_0, 
                    	    	              		"NavigatingCommaArgCS");
                    	    	      	        afterParserOrEnumRuleCall();
                    	    	      	    
                    	    	    }

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop62;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRoundBracketedClauseCS9213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRoundBracketedClauseCSAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRoundBracketedClauseCS"


    // $ANTLR start "entryRuleSquareBracketedClauseCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4089:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4090:2: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4091:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS9249);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS9259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSquareBracketedClauseCS"


    // $ANTLR start "ruleSquareBracketedClauseCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4098:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4101:28: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4102:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4102:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4102:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleSquareBracketedClauseCS9296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4106:1: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4107:1: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4107:1: (lv_ownedTerms_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4108:3: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9317);
            lv_ownedTerms_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedTerms",
                      		lv_ownedTerms_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4124:2: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==17) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4124:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSquareBracketedClauseCS9330); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4128:1: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4129:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4129:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4130:3: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9351);
            	    lv_ownedTerms_3_0=ruleExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedTerms",
            	              		lv_ownedTerms_3_0, 
            	              		"ExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_4=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleSquareBracketedClauseCS9365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSquareBracketedClauseCSAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSquareBracketedClauseCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4158:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4159:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4160:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS9401);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS9411); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4167:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedNameExpression_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;

        EObject lv_ownedInitExpression_6_0 = null;

        EObject lv_ownedType_8_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4170:28: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4171:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4171:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_SIMPLE_ID && LA68_0<=RULE_SINGLE_QUOTED_STRING)||LA68_0==21||(LA68_0>=29 && LA68_0<=30)||(LA68_0>=32 && LA68_0<=34)||(LA68_0>=51 && LA68_0<=52)||(LA68_0>=54 && LA68_0<=66)||(LA68_0>=69 && LA68_0<=73)||LA68_0==81||(LA68_0>=86 && LA68_0<=87)) ) {
                alt68=1;
            }
            else if ( (LA68_0==19) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4171:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4171:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4171:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4171:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4172:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4172:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4173:3: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9458);
                    lv_ownedNameExpression_0_0=ruleNavigatingArgExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedNameExpression",
                              		lv_ownedNameExpression_0_0, 
                              		"NavigatingArgExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4189:2: ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    int alt67=3;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==19) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==78) ) {
                        alt67=2;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4189:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4189:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4189:5: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingArgCS9472); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_0_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4193:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4194:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4194:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4195:3: lv_ownedType_2_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9493);
                            lv_ownedType_2_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedType",
                                      		lv_ownedType_2_0, 
                                      		"TypeExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4211:2: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==41) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4211:4: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingArgCS9506); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                          
                                    }
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4215:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4216:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4216:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4217:3: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9527);
                                    lv_ownedInitExpression_4_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"ownedInitExpression",
                                              		lv_ownedInitExpression_4_0, 
                                              		"ExpCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4234:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4234:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4234:8: otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            {
                            otherlv_5=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleNavigatingArgCS9549); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_1_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4238:1: ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4239:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4239:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4240:3: lv_ownedInitExpression_6_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9570);
                            lv_ownedInitExpression_6_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_6_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4257:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4257:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4257:8: otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingArgCS9593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4261:1: ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4262:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4262:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4263:3: lv_ownedType_8_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9614);
                    lv_ownedType_8_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_8_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4287:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4288:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4289:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9651);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4296:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4299:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4300:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4300:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4300:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4300:2: ( (lv_prefix_0_0= '|' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4301:1: (lv_prefix_0_0= '|' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4301:1: (lv_prefix_0_0= '|' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4302:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleNavigatingBarArgCS9704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4315:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4316:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4316:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4317:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9738);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedNameExpression",
                      		lv_ownedNameExpression_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4333:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==19) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4333:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingBarArgCS9751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4337:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4338:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4338:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4339:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9772);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4355:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==41) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4355:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingBarArgCS9785); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4359:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4360:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4360:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4361:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9806);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4385:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4386:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4387:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9846);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9856); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4394:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;

        EObject lv_ownedInitExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4397:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4398:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4398:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4398:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4398:2: ( (lv_prefix_0_0= ',' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4399:1: (lv_prefix_0_0= ',' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4399:1: (lv_prefix_0_0= ',' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4400:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleNavigatingCommaArgCS9899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4413:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4414:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4414:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4415:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9933);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedNameExpression",
                      		lv_ownedNameExpression_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4431:2: ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==19) ) {
                alt72=1;
            }
            else if ( (LA72_0==78) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4431:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4431:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4431:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingCommaArgCS9947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4435:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4436:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4436:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4437:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9968);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4453:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==41) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4453:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingCommaArgCS9981); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4457:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4458:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4458:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4459:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10002);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4476:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4476:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4476:8: otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    {
                    otherlv_6=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleNavigatingCommaArgCS10024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4480:1: ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4481:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4481:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4482:3: lv_ownedInitExpression_7_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10045);
                    lv_ownedInitExpression_7_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedInitExpression",
                              		lv_ownedInitExpression_7_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4506:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4507:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4508:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10084);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10094); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4515:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4518:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4519:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4519:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4519:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4519:2: ( (lv_prefix_0_0= ';' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4520:1: (lv_prefix_0_0= ';' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4520:1: (lv_prefix_0_0= ';' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4521:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleNavigatingSemiArgCS10137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4534:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4535:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4535:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4536:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10171);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedNameExpression",
                      		lv_ownedNameExpression_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4552:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==19) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4552:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingSemiArgCS10184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4556:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4557:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4557:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4558:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10205);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4574:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==41) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4574:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingSemiArgCS10218); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4578:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4579:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4579:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4580:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10239);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4604:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4605:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4606:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10279);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10289); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4613:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4616:28: (this_ExpCS_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4618:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10338);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4637:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4638:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4639:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS10372);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS10382); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4646:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_1 = null;

        EObject lv_ownedCondition_1_2 = null;

        EObject lv_ownedThenExpression_3_0 = null;

        EObject lv_ownedIfThenExpressions_4_0 = null;

        EObject lv_ownedElseExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4649:28: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4650:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4650:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4650:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleIfExpCS10419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4654:1: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4655:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4655:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4656:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4656:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt75=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 21:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 81:
            case 86:
            case 87:
                {
                alt75=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA75_2 = input.LA(2);

                if ( (LA75_2==23||LA75_2==30||LA75_2==32||(LA75_2>=34 && LA75_2<=50)||LA75_2==53||LA75_2==74||LA75_2==76||LA75_2==82) ) {
                    alt75=1;
                }
                else if ( (LA75_2==19) ) {
                    alt75=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA75_3 = input.LA(2);

                if ( (LA75_3==23||LA75_3==30||LA75_3==32||(LA75_3>=34 && LA75_3<=50)||LA75_3==53||LA75_3==74||LA75_3==76||LA75_3==82) ) {
                    alt75=1;
                }
                else if ( (LA75_3==19) ) {
                    alt75=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt75=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4657:3: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10442);
                    lv_ownedCondition_1_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCondition",
                              		lv_ownedCondition_1_1, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4672:8: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleIfExpCS10461);
                    lv_ownedCondition_1_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCondition",
                              		lv_ownedCondition_1_2, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleIfExpCS10476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4694:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4695:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4695:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4696:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10497);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedThenExpression",
                      		lv_ownedThenExpression_3_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4712:2: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==85) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4713:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4713:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4714:3: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10518);
            	    lv_ownedIfThenExpressions_4_0=ruleElseIfThenExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedIfThenExpressions",
            	              		lv_ownedIfThenExpressions_4_0, 
            	              		"ElseIfThenExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_5=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleIfExpCS10531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4734:1: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4735:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4735:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4736:3: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10552);
            lv_ownedElseExpression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedElseExpression",
                      		lv_ownedElseExpression_6_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleIfExpCS10564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIfExpCSAccess().getEndifKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleElseIfThenExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4764:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4765:2: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4766:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10600);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElseIfThenExpCS10610); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseIfThenExpCS"


    // $ANTLR start "ruleElseIfThenExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4773:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4776:28: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4777:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4777:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4777:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleElseIfThenExpCS10647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4781:1: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4782:1: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4782:1: (lv_ownedCondition_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4783:3: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10668);
            lv_ownedCondition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedCondition",
                      		lv_ownedCondition_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleElseIfThenExpCS10680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4803:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4804:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4804:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4805:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10701);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedThenExpression",
                      		lv_ownedThenExpression_3_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleElseIfThenExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4829:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4830:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4831:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10737);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS10747); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4838:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedVariables_1_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedInExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4841:28: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4842:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4842:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4842:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleLetExpCS10784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4846:1: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4847:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4847:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4848:3: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10805);
            lv_ownedVariables_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedVariables",
                      		lv_ownedVariables_1_0, 
                      		"LetVariableCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4864:2: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==17) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4864:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLetExpCS10818); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4868:1: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4869:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4869:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4870:3: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10839);
            	    lv_ownedVariables_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedVariables",
            	              		lv_ownedVariables_3_0, 
            	              		"LetVariableCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_4=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleLetExpCS10853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4890:1: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4891:1: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4891:1: (lv_ownedInExpression_5_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4892:3: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS10874);
            lv_ownedInExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedInExpression",
                      		lv_ownedInExpression_5_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4916:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4917:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4918:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10910);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS10920); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4925:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRoundBracketedClause_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4928:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4929:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4929:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4929:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4929:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4930:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4930:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4931:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10966);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4947:2: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==30) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4948:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4948:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4949:3: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10987);
                    lv_ownedRoundBracketedClause_1_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRoundBracketedClause",
                              		lv_ownedRoundBracketedClause_1_0, 
                              		"RoundBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4965:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==19) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4965:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLetVariableCS11001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4969:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4970:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4970:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4971:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11022);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleLetVariableCS11036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4991:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4992:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4992:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4993:3: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS11057);
            lv_ownedInitExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedInitExpression",
                      		lv_ownedInitExpression_5_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5017:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5018:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5019:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11093);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS11103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5026:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5029:28: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5030:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5030:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5030:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNestedExpCS11140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5034:1: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5035:1: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5035:1: (lv_ownedExpression_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5036:3: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS11161);
            lv_ownedExpression_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedExpression",
                      		lv_ownedExpression_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNestedExpCS11173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5064:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5065:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5066:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11209);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS11219); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5073:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5076:28: ( ( () otherlv_1= 'self' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5077:1: ( () otherlv_1= 'self' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5077:1: ( () otherlv_1= 'self' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5077:2: () otherlv_1= 'self'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5077:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5078:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleSelfExpCS11268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5098:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5099:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5100:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS11304);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS11314); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5107:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5110:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5111:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5111:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5111:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5111:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5112:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5112:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5113:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS11360);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_0_0, 
                      		"LOWER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5129:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==67) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5129:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMultiplicityBoundsCS11373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5133:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5134:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5134:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5135:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS11394);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_0, 
                              		"UPPER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5159:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5160:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5161:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS11432);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS11442); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5168:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_isNullFree_4_0=null;
        Token otherlv_5=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5171:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5172:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5172:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5172:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleMultiplicityCS11479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5176:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_INT) ) {
                alt81=1;
            }
            else if ( (LA81_0==34||LA81_0==36||LA81_0==90) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5177:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11505);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityBoundsCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5190:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11535);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityStringCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5201:2: (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )?
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==88) ) {
                alt82=1;
            }
            else if ( (LA82_0==89) ) {
                alt82=2;
            }
            switch (alt82) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5201:4: otherlv_3= '|?'
                    {
                    otherlv_3=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleMultiplicityCS11548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5206:6: ( (lv_isNullFree_4_0= '|1' ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5206:6: ( (lv_isNullFree_4_0= '|1' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5207:1: (lv_isNullFree_4_0= '|1' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5207:1: (lv_isNullFree_4_0= '|1' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5208:3: lv_isNullFree_4_0= '|1'
                    {
                    lv_isNullFree_4_0=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleMultiplicityCS11572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNullFree_4_0, grammarAccess.getMultiplicityCSAccess().getIsNullFree1Keyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityCSRule());
                      	        }
                             		setWithLastConsumed(current, "isNullFree", true, "|1");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleMultiplicityCS11599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5233:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5234:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5235:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11635);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS11645); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5242:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5245:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5246:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5246:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5247:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5247:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5248:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5248:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt83=1;
                }
                break;
            case 36:
                {
                alt83=2;
                }
                break;
            case 90:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5249:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiplicityStringCS11689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5261:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultiplicityStringCS11718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5273:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleMultiplicityStringCS11747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRulePathNameCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5296:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5297:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5298:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS11798);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS11808); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5305:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5308:28: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5309:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5309:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5309:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5309:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5310:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5310:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5311:3: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11854);
            lv_ownedPathElements_0_0=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedPathElements",
                      		lv_ownedPathElements_0_0, 
                      		"FirstPathElementCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5327:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==53) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5327:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePathNameCS11867); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5331:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5332:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5332:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5333:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11888);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPathElements",
            	              		lv_ownedPathElements_2_0, 
            	              		"NextPathElementCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleFirstPathElementCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5357:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5358:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5359:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11926);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS11936); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFirstPathElementCS"


    // $ANTLR start "ruleFirstPathElementCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5366:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5369:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5370:1: ( ( ruleUnrestrictedName ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5370:1: ( ( ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5371:1: ( ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5371:1: ( ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5372:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFirstPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11987);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFirstPathElementCS"


    // $ANTLR start "entryRuleNextPathElementCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5396:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5397:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5398:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS12022);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS12032); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNextPathElementCS"


    // $ANTLR start "ruleNextPathElementCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5405:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5408:28: ( ( ( ruleUnreservedName ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5409:1: ( ( ruleUnreservedName ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5409:1: ( ( ruleUnreservedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5410:1: ( ruleUnreservedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5410:1: ( ruleUnreservedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5411:3: ruleUnreservedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNextPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextPathElementCSAccess().getReferredElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS12083);
            ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNextPathElementCS"


    // $ANTLR start "entryRuleTemplateBindingCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5435:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5436:2: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5437:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS12118);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateBindingCS12128); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateBindingCS"


    // $ANTLR start "ruleTemplateBindingCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5444:1: ruleTemplateBindingCS returns [EObject current=null] : ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedSubstitutions_0_0 = null;

        EObject lv_ownedSubstitutions_2_0 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5447:28: ( ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5448:1: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5448:1: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5448:2: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5448:2: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5449:1: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5449:1: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5450:3: lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS12174);
            lv_ownedSubstitutions_0_0=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedSubstitutions",
                      		lv_ownedSubstitutions_0_0, 
                      		"TemplateParameterSubstitutionCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5466:2: (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==17) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5466:4: otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTemplateBindingCS12187); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5470:1: ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5471:1: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5471:1: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5472:3: lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS12208);
            	    lv_ownedSubstitutions_2_0=ruleTemplateParameterSubstitutionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSubstitutions",
            	              		lv_ownedSubstitutions_2_0, 
            	              		"TemplateParameterSubstitutionCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5488:4: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==76) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5489:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5489:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5490:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTemplateBindingCS12231);
                    lv_ownedMultiplicity_3_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedMultiplicity",
                              		lv_ownedMultiplicity_3_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateBindingCS"


    // $ANTLR start "entryRuleTemplateParameterSubstitutionCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5514:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5515:2: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5516:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS12268);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS12278); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateParameterSubstitutionCS"


    // $ANTLR start "ruleTemplateParameterSubstitutionCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5523:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5526:28: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5527:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5527:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5528:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5528:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5529:3: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS12323);
            lv_ownedActualParameter_0_0=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateParameterSubstitutionCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedActualParameter",
                      		lv_ownedActualParameter_0_0, 
                      		"TypeRefCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateParameterSubstitutionCS"


    // $ANTLR start "entryRuleTypeParameterCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5555:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5556:2: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5557:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS12360);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeParameterCS12370); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeParameterCS"


    // $ANTLR start "ruleTypeParameterCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5564:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5567:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5568:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5568:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5568:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5568:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5569:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5569:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5570:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS12416);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5586:2: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==91) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5586:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleTypeParameterCS12429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5590:1: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5591:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5591:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5592:3: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12450);
                    lv_ownedExtends_2_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedExtends",
                              		lv_ownedExtends_2_0, 
                              		"TypedRefCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5608:2: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==92) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5608:4: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleTypeParameterCS12463); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5612:1: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5613:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5613:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5614:3: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12484);
                    	    lv_ownedExtends_4_0=ruleTypedRefCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedExtends",
                    	              		lv_ownedExtends_4_0, 
                    	              		"TypedRefCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeParameterCS"


    // $ANTLR start "entryRuleTypeRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5638:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5639:2: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5640:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12524);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRefCS12534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeRefCS"


    // $ANTLR start "ruleTypeRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5647:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5650:28: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5651:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5651:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=RULE_SIMPLE_ID && LA89_0<=RULE_ESCAPED_ID)) ) {
                alt89=1;
            }
            else if ( (LA89_0==90) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5652:2: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12584);
                    this_TypedRefCS_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedRefCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5665:2: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12614);
                    this_WildcardTypeRefCS_1=ruleWildcardTypeRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WildcardTypeRefCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeRefCS"


    // $ANTLR start "entryRuleTypedRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5684:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5685:2: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5686:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12649);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedRefCS12659); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedRefCS"


    // $ANTLR start "ruleTypedRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5693:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5696:28: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5698:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12708);
            this_TypedTypeRefCS_0=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypedTypeRefCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypedRefCS"


    // $ANTLR start "entryRuleTypedTypeRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5717:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5718:2: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5719:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12742);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedTypeRefCS12752); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedTypeRefCS"


    // $ANTLR start "ruleTypedTypeRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5726:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5729:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5730:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5730:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5730:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5730:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5731:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5731:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5732:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12798);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPathName",
                      		lv_ownedPathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5748:2: (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==30) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5748:4: otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTypedTypeRefCS12811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypedTypeRefCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5752:1: ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5753:1: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5753:1: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5754:3: lv_ownedBinding_2_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12832);
                    lv_ownedBinding_2_0=ruleTemplateBindingCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedBinding",
                              		lv_ownedBinding_2_0, 
                              		"TemplateBindingCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTypedTypeRefCS12844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypedTypeRefCSAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypedTypeRefCS"


    // $ANTLR start "entryRuleWildcardTypeRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5782:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5783:2: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5784:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12882);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12892); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWildcardTypeRefCS"


    // $ANTLR start "ruleWildcardTypeRefCS"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5791:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5794:28: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5795:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5795:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5795:2: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5795:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5796:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWildcardTypeRefCSAccess().getWildcardTypeRefCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleWildcardTypeRefCS12941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5808:1: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==91) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5808:3: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleWildcardTypeRefCS12954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5812:1: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5813:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5813:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5814:3: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12975);
                    lv_ownedExtends_3_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWildcardTypeRefCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExtends",
                              		lv_ownedExtends_3_0, 
                              		"TypedRefCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWildcardTypeRefCS"


    // $ANTLR start "entryRuleID"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5838:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5839:2: (iv_ruleID= ruleID EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5840:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID13014);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID13025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5847:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5850:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5851:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5851:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_SIMPLE_ID) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_ESCAPED_ID) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5851:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID13065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5859:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID13091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESCAPED_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESCAPED_ID_1, grammarAccess.getIDAccess().getESCAPED_IDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleIdentifier"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5874:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5875:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5876:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier13137);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier13148); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5883:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5886:28: (this_ID_0= ruleID )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5888:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier13194);
            this_ID_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleLOWER"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5906:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5907:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5908:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER13239);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER13250); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5915:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5918:28: (this_INT_0= RULE_INT )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5919:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER13289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5934:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5935:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5936:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL13334);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL13345); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5943:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5946:28: (this_INT_0= RULE_INT )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5947:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL13384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleStringLiteral"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5962:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5963:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5964:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral13429);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral13440); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5971:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5974:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5975:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral13479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleUPPER"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5990:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5991:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5992:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER13524);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER13535); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5999:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6002:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6003:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6003:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_INT) ) {
                alt93=1;
            }
            else if ( (LA93_0==34) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6003:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER13575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6012:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUPPER13599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleURI"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6025:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6026:2: (iv_ruleURI= ruleURI EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6027:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI13640);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI13651); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6034:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6037:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:6038:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getURIAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleURI"

    // $ANTLR start synpred16_InternalCS2ASDSL
    public final void synpred16_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:745:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:745:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred16_InternalCS2ASDSL1497);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalCS2ASDSL

    // $ANTLR start synpred17_InternalCS2ASDSL
    public final void synpred17_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:758:2: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:758:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_synpred17_InternalCS2ASDSL1527);
        this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalCS2ASDSL

    // $ANTLR start synpred18_InternalCS2ASDSL
    public final void synpred18_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:771:2: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:771:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred18_InternalCS2ASDSL1557);
        this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalCS2ASDSL

    // $ANTLR start synpred20_InternalCS2ASDSL
    public final void synpred20_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_8 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:797:2: (this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:797:2: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred20_InternalCS2ASDSL1617);
        this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalCS2ASDSL

    // $ANTLR start synpred59_InternalCS2ASDSL
    public final void synpred59_InternalCS2ASDSL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedType_2_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1799:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1799:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
        {
        otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_synpred59_InternalCS2ASDSL4374); if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1803:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1804:1: (lv_ownedType_2_0= ruleTypeExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1804:1: (lv_ownedType_2_0= ruleTypeExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1805:3: lv_ownedType_2_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred59_InternalCS2ASDSL4395);
        lv_ownedType_2_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred59_InternalCS2ASDSL4407); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalCS2ASDSL

    // $ANTLR start synpred60_InternalCS2ASDSL
    public final void synpred60_InternalCS2ASDSL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1861:4: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1861:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
        {
        otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_synpred60_InternalCS2ASDSL4524); if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1865:1: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1866:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1866:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1867:3: lv_ownedKeyType_2_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred60_InternalCS2ASDSL4545);
        lv_ownedKeyType_2_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred60_InternalCS2ASDSL4557); if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1887:1: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1888:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1888:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1889:3: lv_ownedValueType_4_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred60_InternalCS2ASDSL4578);
        lv_ownedValueType_4_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred60_InternalCS2ASDSL4590); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalCS2ASDSL

    // $ANTLR start synpred81_InternalCS2ASDSL
    public final void synpred81_InternalCS2ASDSL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_segments_0_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2984:1: ( (lv_segments_0_0= ruleStringLiteral ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2984:1: (lv_segments_0_0= ruleStringLiteral )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2984:1: (lv_segments_0_0= ruleStringLiteral )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2985:3: lv_segments_0_0= ruleStringLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_synpred81_InternalCS2ASDSL6911);
        lv_segments_0_0=ruleStringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred81_InternalCS2ASDSL

    // $ANTLR start synpred90_InternalCS2ASDSL
    public final void synpred90_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3435:2: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3435:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_synpred90_InternalCS2ASDSL8018);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_InternalCS2ASDSL

    // $ANTLR start synpred92_InternalCS2ASDSL
    public final void synpred92_InternalCS2ASDSL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:2: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:2: ()
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3511:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3519:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3520:1: (lv_name_2_0= ruleBinaryOperatorName )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3520:1: (lv_name_2_0= ruleBinaryOperatorName )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3521:3: lv_name_2_0= ruleBinaryOperatorName
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred92_InternalCS2ASDSL8200);
        lv_name_2_0=ruleBinaryOperatorName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3537:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3538:1: (lv_ownedRight_3_0= ruleExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3538:1: (lv_ownedRight_3_0= ruleExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3539:3: lv_ownedRight_3_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred92_InternalCS2ASDSL8221);
        lv_ownedRight_3_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred92_InternalCS2ASDSL

    // $ANTLR start synpred93_InternalCS2ASDSL
    public final void synpred93_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3498:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3498:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3498:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3499:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_synpred93_InternalCS2ASDSL8167);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==32||(LA103_0>=34 && LA103_0<=50)) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3510:2: ()
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3511:2: 
                {
                if ( state.backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3519:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3520:1: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3520:1: (lv_name_2_0= ruleBinaryOperatorName )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3521:3: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred93_InternalCS2ASDSL8200);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3537:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3538:1: (lv_ownedRight_3_0= ruleExpCS )
                {
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3538:1: (lv_ownedRight_3_0= ruleExpCS )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3539:3: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred93_InternalCS2ASDSL8221);
                lv_ownedRight_3_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred93_InternalCS2ASDSL

    // $ANTLR start synpred97_InternalCS2ASDSL
    public final void synpred97_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject lv_ownedRoundBracketedClause_2_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3784:1: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3784:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3784:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3785:3: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_synpred97_InternalCS2ASDSL8703);
        lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred97_InternalCS2ASDSL

    // Delegated rules

    public final boolean synpred18_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA11_eotS =
        "\42\uffff";
    static final String DFA11_eofS =
        "\42\uffff";
    static final String DFA11_minS =
        "\1\4\12\uffff\7\0\20\uffff";
    static final String DFA11_maxS =
        "\1\127\12\uffff\7\0\20\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\1\11\7\uffff\1\12\1\uffff"+
        "\1\13\1\14\1\5\1\6\1\7";
    static final String DFA11_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\20\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\33\2\4\15\uffff\1\35\7\uffff\1\36\1\1\3\uffff\1\4\20\uffff"+
            "\1\14\1\13\1\uffff\10\23\1\15\1\16\1\17\1\20\1\21\2\uffff\1"+
            "\22\4\4\7\uffff\1\2\5\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "692:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalCS2ASDSL()) ) {s = 31;}

                        else if ( (synpred20_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCS2ASDSL()) ) {s = 32;}

                        else if ( (synpred20_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred20_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred20_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred20_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred20_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred20_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\107\uffff";
    static final String DFA22_eofS =
        "\1\2\106\uffff";
    static final String DFA22_minS =
        "\1\4\1\0\105\uffff";
    static final String DFA22_maxS =
        "\1\127\1\0\105\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\103\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\105\uffff}>";
    static final String[] DFA22_transitionS = {
            "\4\2\11\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\4\2\1\1\26\2\1\uffff\24\2\2\uffff\14\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1799:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalCS2ASDSL()) ) {s = 70;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\107\uffff";
    static final String DFA23_eofS =
        "\1\2\106\uffff";
    static final String DFA23_minS =
        "\1\4\1\0\105\uffff";
    static final String DFA23_maxS =
        "\1\127\1\0\105\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\103\uffff\1\1";
    static final String DFA23_specialS =
        "\1\uffff\1\0\105\uffff}>";
    static final String[] DFA23_transitionS = {
            "\4\2\11\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\4\2\1\1\26\2\1\uffff\24\2\2\uffff\14\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1861:2: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalCS2ASDSL()) ) {s = 70;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\23\uffff";
    static final String DFA46_eofS =
        "\23\uffff";
    static final String DFA46_minS =
        "\1\4\12\uffff\5\0\3\uffff";
    static final String DFA46_maxS =
        "\1\102\12\uffff\5\0\3\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3";
    static final String DFA46_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] DFA46_transitionS = {
            "\2\1\55\uffff\2\3\1\uffff\10\3\1\13\1\14\1\15\1\16\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "3421:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_11 = input.LA(1);

                         
                        int index46_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index46_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_12 = input.LA(1);

                         
                        int index46_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index46_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_13 = input.LA(1);

                         
                        int index46_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index46_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_14 = input.LA(1);

                         
                        int index46_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index46_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_15 = input.LA(1);

                         
                        int index46_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index46_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA49_eotS =
        "\42\uffff";
    static final String DFA49_eofS =
        "\42\uffff";
    static final String DFA49_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA49_maxS =
        "\1\127\2\0\37\uffff";
    static final String DFA49_acceptS =
        "\3\uffff\1\1\35\uffff\1\2";
    static final String DFA49_specialS =
        "\1\uffff\1\0\1\1\37\uffff}>";
    static final String[] DFA49_transitionS = {
            "\4\3\15\uffff\1\3\7\uffff\2\3\1\uffff\1\1\1\2\1\3\20\uffff"+
            "\2\3\1\uffff\15\3\2\uffff\5\3\7\uffff\1\3\4\uffff\1\41\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3498:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\103\uffff";
    static final String DFA48_eofS =
        "\1\23\102\uffff";
    static final String DFA48_minS =
        "\1\4\1\0\2\uffff\1\0\76\uffff";
    static final String DFA48_maxS =
        "\1\127\1\0\2\uffff\1\0\76\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\1\20\uffff\1\2\57\uffff";
    static final String DFA48_specialS =
        "\1\uffff\1\0\2\uffff\1\1\76\uffff}>";
    static final String[] DFA48_transitionS = {
            "\4\23\11\uffff\1\23\1\uffff\1\23\1\uffff\1\23\2\uffff\1\23"+
            "\1\uffff\6\23\1\4\1\23\1\1\20\2\2\23\1\uffff\16\23\1\uffff\5"+
            "\23\3\uffff\13\23",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "3510:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_1 = input.LA(1);

                         
                        int index48_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index48_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_4 = input.LA(1);

                         
                        int index48_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index48_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\106\uffff";
    static final String DFA53_eofS =
        "\1\2\105\uffff";
    static final String DFA53_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA53_maxS =
        "\1\127\1\0\104\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA53_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA53_transitionS = {
            "\4\2\11\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\4\2\1\1\26\2\1\uffff\16\2\1\uffff\6\2\2\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3783:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalCS2ASDSL()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCSDecl_in_ruleModel137 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleASDecl_in_ruleModel158 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleClassMap_in_ruleModel179 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleCSDecl_in_entryRuleCSDecl216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCSDecl226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleCSDecl263 = new BitSet(new long[]{0x00000000000000B0L});
        public static final BitSet FOLLOW_ruleImportCS_in_ruleCSDecl284 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleCSDecl297 = new BitSet(new long[]{0x00000000000000B0L});
        public static final BitSet FOLLOW_ruleImportCS_in_ruleCSDecl318 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleASDecl_in_entryRuleASDecl356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleASDecl366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleASDecl403 = new BitSet(new long[]{0x00000000000000B0L});
        public static final BitSet FOLLOW_ruleImportCS_in_ruleASDecl424 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleASDecl437 = new BitSet(new long[]{0x00000000000000B0L});
        public static final BitSet FOLLOW_ruleImportCS_in_ruleASDecl458 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleImportCS_in_entryRuleImportCS496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportCS506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleImportCS553 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleImportCS565 = new BitSet(new long[]{0x00000000000000B0L});
        public static final BitSet FOLLOW_ruleURIPathNameCS_in_ruleImportCS588 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleImportCS606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassMap_in_entryRuleClassMap656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassMap666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleClassMap703 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleClassMap720 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleClassMap737 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleClassMap754 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleClassMap771 = new BitSet(new long[]{0xFFD800076B2000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleSimpleMap_in_ruleClassMap793 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleDisambiguationMap_in_ruleClassMap820 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleClassMap835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisambiguationMap_in_entryRuleDisambiguationMap871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisambiguationMap881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleDisambiguationMap918 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleDisambiguationMap939 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleDisambiguationMap951 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleDisambiguationMap968 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleDisambiguationMap985 = new BitSet(new long[]{0xFFD80007692000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleSimpleMap_in_ruleDisambiguationMap1006 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDisambiguationMap1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleMap_in_entryRuleSimpleMap1055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMap1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyMap_in_ruleSimpleMap1123 = new BitSet(new long[]{0xFFD80007682000F2L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_rulePropertyMap_in_entryRulePropertyMap1160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyMap1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rulePropertyMap1213 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePropertyMap1248 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePropertyMap1260 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePropertyMap1281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS1317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS1327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS1467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_rulePrimaryExpCS1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLambdaLiteralExpCS_in_rulePrimaryExpCS1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_rulePrimaryExpCS1647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpCS_in_rulePrimaryExpCS1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLookupExpCS_in_rulePrimaryExpCS1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpCS_in_entryRuleMapExpCS1742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapExpCS1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMapExpCS1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLookupExpCS_in_entryRuleLookupExpCS1837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLookupExpCS1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleLookupExpCS1884 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLookupExpCS1896 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1917 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_17_in_ruleLookupExpCS1930 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1951 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_31_in_ruleLookupExpCS1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName2004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLUnaryOperatorName2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLUnaryOperatorName2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName2113 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName2124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperatorName2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLInfixOperatorName2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLInfixOperatorName2200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLInfixOperatorName2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperatorName2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperatorName2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEssentialOCLNavigationOperatorName2499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorName2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2734 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorName2745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorName2847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorName2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName3040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName3142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName3153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName3199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName3244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEssentialOCLUnreservedName3392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEssentialOCLUnreservedName3411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName3463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIPathNameCS_in_entryRuleURIPathNameCS3553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIPathNameCS3563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_ruleURIPathNameCS3609 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleURIPathNameCS3622 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_ruleURIPathNameCS3643 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimitiveTypeIdentifier3876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePrimitiveTypeIdentifier3895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePrimitiveTypeIdentifier3914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveTypeIdentifier3933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulePrimitiveTypeIdentifier3952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveTypeIdentifier3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePrimitiveTypeIdentifier3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rulePrimitiveTypeIdentifier4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS4049 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS4059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS4104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier4140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier4151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCollectionTypeIdentifier4189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCollectionTypeIdentifier4208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier4227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionTypeIdentifier4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCollectionTypeIdentifier4265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS4315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4361 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleCollectionTypeCS4374 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4395 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionTypeCS4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapTypeCS4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleMapTypeCS4498 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleMapTypeCS4524 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4545 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMapTypeCS4557 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4578 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMapTypeCS4590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS4638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTupleTypeCS4681 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTupleTypeCS4707 = new BitSet(new long[]{0x0000000080000030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4729 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_17_in_ruleTupleTypeCS4742 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4763 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_31_in_ruleTupleTypeCS4779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4817 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS4827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4873 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTuplePartCS4885 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4998 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCollectionLiteralExpCS5010 = new BitSet(new long[]{0xFFD80007692800F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS5032 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_17_in_ruleCollectionLiteralExpCS5045 = new BitSet(new long[]{0xFFD80007682800F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS5066 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleCollectionLiteralExpCS5082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS5118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS5128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleCollectionLiteralPartCS5188 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS5239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionPatternCS5285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5331 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCollectionPatternCS5343 = new BitSet(new long[]{0xFFD80007692800F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5365 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
        public static final BitSet FOLLOW_17_in_ruleCollectionPatternCS5378 = new BitSet(new long[]{0xFFD80007682800F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5399 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleCollectionPatternCS5414 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5435 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleCollectionPatternCS5450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShadowPartCS5496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5548 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleShadowPartCS5560 = new BitSet(new long[]{0xFFD80007682800F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleShadowPartCS5583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePatternExpCS5651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5697 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePatternExpCS5710 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleLambdaLiteralExpCS5814 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLambdaLiteralExpCS5826 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5847 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLambdaLiteralExpCS5859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5895 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralExpCS5905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5951 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMapLiteralExpCS5963 = new BitSet(new long[]{0xFFD80007692000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5985 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_17_in_ruleMapLiteralExpCS5998 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS6019 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleMapLiteralExpCS6035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS6071 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralPartCS6081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS6127 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleMapLiteralPartCS6139 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS6160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS6196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS6206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS6256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTupleLiteralExpCS6488 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTupleLiteralExpCS6500 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6521 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_17_in_ruleTupleLiteralExpCS6534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6555 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleTupleLiteralExpCS6569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6661 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleTupleLiteralPartCS6674 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6695 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTupleLiteralPartCS6709 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6766 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS6866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6911 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleBooleanLiteralExpCS7000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleBooleanLiteralExpCS7037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS7145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS7181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS7191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleInvalidLiteralExpCS7240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7276 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS7286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleNullLiteralExpCS7335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS7371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS7381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS7431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS7461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_ruleTypeLiteralCS7491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS7521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS7773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7819 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7841 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleTypeNameExpCS7854 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7875 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTypeNameExpCS7887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS7937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8018 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS8048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS8106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS8116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS8167 = new BitSet(new long[]{0x0007FFFD00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_ruleExpCS8200 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleExpCS8221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS8255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS8290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedLetExpCS8300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS8359 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS8380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS8412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8516 = new BitSet(new long[]{0xFFD80007602000F0L,0x00000000008203E7L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameExpCS8614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleNameExpCS8660 = new BitSet(new long[]{0x0000000040800002L,0x0000000000001400L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8681 = new BitSet(new long[]{0x0000000040800002L,0x0000000000001400L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8703 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000400L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_ruleNameExpCS8745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleNameExpCS8770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCurlyBracketedClauseCS8867 = new BitSet(new long[]{0x00000000010000B0L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8890 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_17_in_ruleCurlyBracketedClauseCS8903 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8924 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8955 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleCurlyBracketedClauseCS8968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS9004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS9014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRoundBracketedClauseCS9063 = new BitSet(new long[]{0xFFD80007E82800F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS9085 = new BitSet(new long[]{0x0000000080020000L,0x0000000000018000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS9106 = new BitSet(new long[]{0x0000000080020000L,0x0000000000018000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS9129 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS9150 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS9175 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS9196 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_31_in_ruleRoundBracketedClauseCS9213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS9249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS9259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleSquareBracketedClauseCS9296 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9317 = new BitSet(new long[]{0x0000000000020000L,0x0000000000002000L});
        public static final BitSet FOLLOW_17_in_ruleSquareBracketedClauseCS9330 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9351 = new BitSet(new long[]{0x0000000000020000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleSquareBracketedClauseCS9365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS9401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS9411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9458 = new BitSet(new long[]{0x0000000000080002L,0x0000000000004000L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingArgCS9472 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9493 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingArgCS9506 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleNavigatingArgCS9549 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingArgCS9593 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleNavigatingBarArgCS9704 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9738 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingBarArgCS9751 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9772 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingBarArgCS9785 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleNavigatingCommaArgCS9899 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9933 = new BitSet(new long[]{0x0000000000080002L,0x0000000000004000L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingCommaArgCS9947 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9968 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingCommaArgCS9981 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleNavigatingCommaArgCS10024 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleNavigatingSemiArgCS10137 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10171 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingSemiArgCS10184 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10205 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingSemiArgCS10218 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS10372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS10382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleIfExpCS10419 = new BitSet(new long[]{0xFFD80007682800F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleIfExpCS10461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleIfExpCS10476 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000280000L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000280000L});
        public static final BitSet FOLLOW_83_in_ruleIfExpCS10531 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleIfExpCS10564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElseIfThenExpCS10610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleElseIfThenExpCS10647 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleElseIfThenExpCS10680 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS10747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleLetExpCS10784 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10805 = new BitSet(new long[]{0x0000000000020000L,0x0000000000004000L});
        public static final BitSet FOLLOW_17_in_ruleLetExpCS10818 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10839 = new BitSet(new long[]{0x0000000000020000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleLetExpCS10853 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS10874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS10920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10966 = new BitSet(new long[]{0x0000020040080000L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10987 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleLetVariableCS11001 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11022 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleLetVariableCS11036 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS11057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11093 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS11103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNestedExpCS11140 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS11161 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleNestedExpCS11173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS11219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleSelfExpCS11268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS11304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS11314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS11360 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleMultiplicityBoundsCS11373 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS11394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS11432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS11442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleMultiplicityCS11479 = new BitSet(new long[]{0x0000001400000040L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11505 = new BitSet(new long[]{0x0000000000000000L,0x0000000003002000L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11535 = new BitSet(new long[]{0x0000000000000000L,0x0000000003002000L});
        public static final BitSet FOLLOW_88_in_ruleMultiplicityCS11548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_89_in_ruleMultiplicityCS11572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleMultiplicityCS11599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11635 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS11645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleMultiplicityStringCS11689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMultiplicityStringCS11718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleMultiplicityStringCS11747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS11798 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS11808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11854 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_rulePathNameCS11867 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11888 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS11936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS12022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS12032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS12083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS12118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateBindingCS12128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS12174 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001000L});
        public static final BitSet FOLLOW_17_in_ruleTemplateBindingCS12187 = new BitSet(new long[]{0x0000000000000030L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS12208 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTemplateBindingCS12231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS12268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS12278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS12323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS12360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameterCS12370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS12416 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_ruleTypeParameterCS12429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12450 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleTypeParameterCS12463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12484 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRefCS12534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedRefCS12659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedTypeRefCS12752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12798 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTypedTypeRefCS12811 = new BitSet(new long[]{0x0000000000000030L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12832 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTypedTypeRefCS12844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleWildcardTypeRefCS12941 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_ruleWildcardTypeRefCS12954 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID13014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID13025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID13065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID13091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier13137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier13148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier13194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER13239 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER13250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER13289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL13334 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL13345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL13384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral13429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral13440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral13479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER13524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER13535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER13575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUPPER13599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI13640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI13651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred16_InternalCS2ASDSL1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_synpred17_InternalCS2ASDSL1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred18_InternalCS2ASDSL1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred20_InternalCS2ASDSL1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred59_InternalCS2ASDSL4374 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred59_InternalCS2ASDSL4395 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_synpred59_InternalCS2ASDSL4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred60_InternalCS2ASDSL4524 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred60_InternalCS2ASDSL4545 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred60_InternalCS2ASDSL4557 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred60_InternalCS2ASDSL4578 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_synpred60_InternalCS2ASDSL4590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_synpred81_InternalCS2ASDSL6911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_synpred90_InternalCS2ASDSL8018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred92_InternalCS2ASDSL8200 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred92_InternalCS2ASDSL8221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_synpred93_InternalCS2ASDSL8167 = new BitSet(new long[]{0x0007FFFD00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred93_InternalCS2ASDSL8200 = new BitSet(new long[]{0xFFD80007682000F0L,0x0000000000C203E7L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred93_InternalCS2ASDSL8221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_synpred97_InternalCS2ASDSL8703 = new BitSet(new long[]{0x0000000000000002L});
    }


}