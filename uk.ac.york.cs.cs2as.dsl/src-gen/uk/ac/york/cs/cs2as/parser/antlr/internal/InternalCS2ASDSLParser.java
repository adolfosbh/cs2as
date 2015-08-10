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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "','", "'out'", "':'", "'::*'", "'map'", "'from'", "'{'", "'when'", "';'", "'}'", "'redefine'", "':='", "'lookup'", "'('", "')'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'::'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'['", "']'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'|?'", "'|1'", "'?'", "'extends'", "'&&'"
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:157:1: ruleCSDecl returns [EObject current=null] : (otherlv_0= 'in' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) ;
    public final EObject ruleCSDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metamodels_1_0 = null;

        EObject lv_metamodels_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:160:28: ( (otherlv_0= 'in' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:161:1: (otherlv_0= 'in' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:161:1: (otherlv_0= 'in' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:161:3: otherlv_0= 'in' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCSDecl263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCSDeclAccess().getInKeyword_0());
                  
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:222:1: ruleASDecl returns [EObject current=null] : (otherlv_0= 'out' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) ;
    public final EObject ruleASDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metamodels_1_0 = null;

        EObject lv_metamodels_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:225:28: ( (otherlv_0= 'out' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:226:1: (otherlv_0= 'out' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:226:1: (otherlv_0= 'out' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:226:3: otherlv_0= 'out' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleASDecl403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getASDeclAccess().getOutKeyword_0());
                  
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:363:1: ruleClassMap returns [EObject current=null] : (otherlv_0= 'map' ( (lv_to_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'from' ( (lv_from_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' (otherlv_5= 'when' ( (lv_rule_6_0= ruleExpCS ) ) otherlv_7= ';' )? ( (lv_mappedProperties_8_0= rulePropertyMap ) )* otherlv_9= '}' ) ;
    public final EObject ruleClassMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_to_1_0=null;
        Token otherlv_2=null;
        Token lv_from_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_rule_6_0 = null;

        EObject lv_mappedProperties_8_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:366:28: ( (otherlv_0= 'map' ( (lv_to_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'from' ( (lv_from_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' (otherlv_5= 'when' ( (lv_rule_6_0= ruleExpCS ) ) otherlv_7= ';' )? ( (lv_mappedProperties_8_0= rulePropertyMap ) )* otherlv_9= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:367:1: (otherlv_0= 'map' ( (lv_to_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'from' ( (lv_from_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' (otherlv_5= 'when' ( (lv_rule_6_0= ruleExpCS ) ) otherlv_7= ';' )? ( (lv_mappedProperties_8_0= rulePropertyMap ) )* otherlv_9= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:367:1: (otherlv_0= 'map' ( (lv_to_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'from' ( (lv_from_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' (otherlv_5= 'when' ( (lv_rule_6_0= ruleExpCS ) ) otherlv_7= ';' )? ( (lv_mappedProperties_8_0= rulePropertyMap ) )* otherlv_9= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:367:3: otherlv_0= 'map' ( (lv_to_1_0= RULE_SIMPLE_ID ) ) otherlv_2= 'from' ( (lv_from_3_0= RULE_SIMPLE_ID ) ) otherlv_4= '{' (otherlv_5= 'when' ( (lv_rule_6_0= ruleExpCS ) ) otherlv_7= ';' )? ( (lv_mappedProperties_8_0= rulePropertyMap ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleClassMap703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassMapAccess().getMapKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:371:1: ( (lv_to_1_0= RULE_SIMPLE_ID ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:372:1: (lv_to_1_0= RULE_SIMPLE_ID )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:372:1: (lv_to_1_0= RULE_SIMPLE_ID )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:373:3: lv_to_1_0= RULE_SIMPLE_ID
            {
            lv_to_1_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleClassMap720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_to_1_0, grammarAccess.getClassMapAccess().getToSIMPLE_IDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassMapRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"to",
                      		lv_to_1_0, 
                      		"SIMPLE_ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleClassMap737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassMapAccess().getFromKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:393:1: ( (lv_from_3_0= RULE_SIMPLE_ID ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:394:1: (lv_from_3_0= RULE_SIMPLE_ID )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:394:1: (lv_from_3_0= RULE_SIMPLE_ID )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:395:3: lv_from_3_0= RULE_SIMPLE_ID
            {
            lv_from_3_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleClassMap754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_from_3_0, grammarAccess.getClassMapAccess().getFromSIMPLE_IDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassMapRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"from",
                      		lv_from_3_0, 
                      		"SIMPLE_ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleClassMap771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassMapAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:415:1: (otherlv_5= 'when' ( (lv_rule_6_0= ruleExpCS ) ) otherlv_7= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:415:3: otherlv_5= 'when' ( (lv_rule_6_0= ruleExpCS ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClassMap784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClassMapAccess().getWhenKeyword_5_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:419:1: ( (lv_rule_6_0= ruleExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:420:1: (lv_rule_6_0= ruleExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:420:1: (lv_rule_6_0= ruleExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:421:3: lv_rule_6_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassMapAccess().getRuleExpCSParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleClassMap805);
                    lv_rule_6_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassMapRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_6_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleClassMap817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getClassMapAccess().getSemicolonKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:441:3: ( (lv_mappedProperties_8_0= rulePropertyMap ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_SIMPLE_ID && LA7_0<=RULE_SINGLE_QUOTED_STRING)||LA7_0==21||LA7_0==27||(LA7_0>=29 && LA7_0<=30)||(LA7_0>=32 && LA7_0<=34)||(LA7_0>=51 && LA7_0<=52)||(LA7_0>=54 && LA7_0<=66)||LA7_0==69||(LA7_0>=71 && LA7_0<=74)||LA7_0==80||(LA7_0>=85 && LA7_0<=86)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:442:1: (lv_mappedProperties_8_0= rulePropertyMap )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:442:1: (lv_mappedProperties_8_0= rulePropertyMap )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:443:3: lv_mappedProperties_8_0= rulePropertyMap
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassMapAccess().getMappedPropertiesPropertyMapParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePropertyMap_in_ruleClassMap840);
            	    lv_mappedProperties_8_0=rulePropertyMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassMapRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappedProperties",
            	              		lv_mappedProperties_8_0, 
            	              		"PropertyMap");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleClassMap853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClassMapAccess().getRightCurlyBracketKeyword_7());
                  
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


    // $ANTLR start "entryRulePropertyMap"
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:471:1: entryRulePropertyMap returns [EObject current=null] : iv_rulePropertyMap= rulePropertyMap EOF ;
    public final EObject entryRulePropertyMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMap = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:472:2: (iv_rulePropertyMap= rulePropertyMap EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:473:2: iv_rulePropertyMap= rulePropertyMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyMapRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyMap_in_entryRulePropertyMap889);
            iv_rulePropertyMap=rulePropertyMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyMap; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyMap899); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:480:1: rulePropertyMap returns [EObject current=null] : ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= ':=' ( (lv_rhs_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePropertyMap() throws RecognitionException {
        EObject current = null;

        Token lv_redefine_0_0=null;
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:483:28: ( ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= ':=' ( (lv_rhs_3_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:484:1: ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= ':=' ( (lv_rhs_3_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:484:1: ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= ':=' ( (lv_rhs_3_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:484:2: ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_lhs_1_0= ruleExpCS ) ) otherlv_2= ':=' ( (lv_rhs_3_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:484:2: ( (lv_redefine_0_0= 'redefine' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:485:1: (lv_redefine_0_0= 'redefine' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:485:1: (lv_redefine_0_0= 'redefine' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:486:3: lv_redefine_0_0= 'redefine'
                    {
                    lv_redefine_0_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePropertyMap942); if (state.failed) return current;
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:499:3: ( (lv_lhs_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:500:1: (lv_lhs_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:500:1: (lv_lhs_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:501:3: lv_lhs_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyMapAccess().getLhsExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePropertyMap977);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePropertyMap989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyMapAccess().getColonEqualsSignKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:521:1: ( (lv_rhs_3_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:522:1: (lv_rhs_3_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:522:1: (lv_rhs_3_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:523:3: lv_rhs_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyMapAccess().getRhsExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePropertyMap1010);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:547:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:548:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:549:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS1046);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS1056); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:556:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:559:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:560:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:560:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS )
            int alt9=12;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:561:2: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS1106);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:574:2: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS1136);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:587:2: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS1166);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:600:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS1196);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:613:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS1226);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:626:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_rulePrimaryExpCS1256);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:639:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS1286);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:652:2: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLambdaLiteralExpCS_in_rulePrimaryExpCS1316);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:665:2: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS1346);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:678:2: this_NameExpCS_9= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_rulePrimaryExpCS1376);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:691:2: this_MapExpCS_10= ruleMapExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapExpCSParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapExpCS_in_rulePrimaryExpCS1406);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:704:2: this_LookupExpCS_11= ruleLookupExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLookupExpCSParserRuleCall_11()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLookupExpCS_in_rulePrimaryExpCS1436);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:723:1: entryRuleMapExpCS returns [EObject current=null] : iv_ruleMapExpCS= ruleMapExpCS EOF ;
    public final EObject entryRuleMapExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:724:2: (iv_ruleMapExpCS= ruleMapExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:725:2: iv_ruleMapExpCS= ruleMapExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapExpCS_in_entryRuleMapExpCS1471);
            iv_ruleMapExpCS=ruleMapExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapExpCS1481); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:732:1: ruleMapExpCS returns [EObject current=null] : ( () otherlv_1= 'map' ) ;
    public final EObject ruleMapExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:735:28: ( ( () otherlv_1= 'map' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:736:1: ( () otherlv_1= 'map' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:736:1: ( () otherlv_1= 'map' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:736:2: () otherlv_1= 'map'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:736:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:737:2: 
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

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMapExpCS1530); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:757:1: entryRuleLookupExpCS returns [EObject current=null] : iv_ruleLookupExpCS= ruleLookupExpCS EOF ;
    public final EObject entryRuleLookupExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:758:2: (iv_ruleLookupExpCS= ruleLookupExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:759:2: iv_ruleLookupExpCS= ruleLookupExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLookupExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLookupExpCS_in_entryRuleLookupExpCS1566);
            iv_ruleLookupExpCS=ruleLookupExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLookupExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLookupExpCS1576); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:766:1: ruleLookupExpCS returns [EObject current=null] : (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:769:28: ( (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:770:1: (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:770:1: (otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:770:3: otherlv_0= 'lookup' otherlv_1= '(' ( (lv_args_2_0= ruleNavigatingArgExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLookupExpCS1613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLookupExpCSAccess().getLookupKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLookupExpCS1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLookupExpCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:778:1: ( (lv_args_2_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:779:1: (lv_args_2_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:779:1: (lv_args_2_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:780:3: lv_args_2_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLookupExpCSAccess().getArgsNavigatingArgExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1646);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:796:2: (otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:796:4: otherlv_3= ',' ( (lv_args_4_0= ruleNavigatingArgExpCS ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLookupExpCS1659); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getLookupExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:800:1: ( (lv_args_4_0= ruleNavigatingArgExpCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:801:1: (lv_args_4_0= ruleNavigatingArgExpCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:801:1: (lv_args_4_0= ruleNavigatingArgExpCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:802:3: lv_args_4_0= ruleNavigatingArgExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLookupExpCSAccess().getArgsNavigatingArgExpCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1680);
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
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLookupExpCS1694); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:832:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:833:2: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:834:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName1733);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName1744); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:841:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:844:28: ( (kw= '-' | kw= 'not' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:845:1: (kw= '-' | kw= 'not' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:845:1: (kw= '-' | kw= 'not' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:846:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLUnaryOperatorName1782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:853:2: kw= 'not'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLUnaryOperatorName1801); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:866:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:867:2: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:868:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName1842);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName1853); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:875:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:878:28: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:879:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:879:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt12=14;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 37:
                {
                alt12=5;
                }
                break;
            case 38:
                {
                alt12=6;
                }
                break;
            case 39:
                {
                alt12=7;
                }
                break;
            case 40:
                {
                alt12=8;
                }
                break;
            case 41:
                {
                alt12=9;
                }
                break;
            case 42:
                {
                alt12=10;
                }
                break;
            case 43:
                {
                alt12=11;
                }
                break;
            case 44:
                {
                alt12=12;
                }
                break;
            case 45:
                {
                alt12=13;
                }
                break;
            case 46:
                {
                alt12=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:880:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperatorName1891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:887:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLInfixOperatorName1910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:894:2: kw= '+'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLInfixOperatorName1929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:901:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLInfixOperatorName1948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:908:2: kw= '>'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperatorName1967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:915:2: kw= '<'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperatorName1986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:922:2: kw= '>='
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:929:2: kw= '<='
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:936:2: kw= '='
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:943:2: kw= '<>'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:950:2: kw= 'and'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:957:2: kw= 'or'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:964:2: kw= 'xor'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:971:2: kw= 'implies'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2138); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:984:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:985:2: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:986:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2179);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2190); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:993:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:996:28: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:997:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:997:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt13=1;
                }
                break;
            case 48:
                {
                alt13=2;
                }
                break;
            case 49:
                {
                alt13=3;
                }
                break;
            case 50:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:998:2: kw= '.'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEssentialOCLNavigationOperatorName2228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1005:2: kw= '->'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1012:2: kw= '?.'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1019:2: kw= '?->'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2285); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1032:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1033:2: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1034:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2326);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorName2337); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1041:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1044:28: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1045:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1045:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32||(LA14_0>=34 && LA14_0<=46)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=47 && LA14_0<=50)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1046:5: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2384);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1058:5: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2417);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1076:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1077:2: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1078:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2463);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorName2474); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1085:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1088:28: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1090:5: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2520);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1108:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1109:2: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1110:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2565);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorName2576); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1117:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1120:28: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1122:5: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2622);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1140:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1141:2: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1142:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2667);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorName2678); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1149:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1152:28: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1154:5: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2724);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1172:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1173:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1174:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName2769);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName2780); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1181:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1184:28: (this_Identifier_0= ruleIdentifier )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1186:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName2826);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1204:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1205:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1206:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName2871);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName2882); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1213:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1216:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1218:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName2928);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1236:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1237:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1238:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName2973);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName2984); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1245:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1248:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1249:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1249:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt15=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt15=2;
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
                alt15=3;
                }
                break;
            case 51:
                {
                alt15=4;
                }
                break;
            case 52:
                {
                alt15=5;
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1250:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3031);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1262:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3064);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1274:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3097);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1286:2: kw= 'Map'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEssentialOCLUnreservedName3121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1293:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEssentialOCLUnreservedName3140); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1306:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1307:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1308:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3181);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName3192); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1315:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1318:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1320:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3238);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1338:1: entryRuleURIPathNameCS returns [EObject current=null] : iv_ruleURIPathNameCS= ruleURIPathNameCS EOF ;
    public final EObject entryRuleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIPathNameCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1339:2: (iv_ruleURIPathNameCS= ruleURIPathNameCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1340:2: iv_ruleURIPathNameCS= ruleURIPathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIPathNameCS_in_entryRuleURIPathNameCS3282);
            iv_ruleURIPathNameCS=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIPathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIPathNameCS3292); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1347:1: ruleURIPathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject ruleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1350:28: ( ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1351:1: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1351:1: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1351:2: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1351:2: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1352:1: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1352:1: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1353:3: lv_ownedPathElements_0_0= ruleURIFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsURIFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_ruleURIPathNameCS3338);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1369:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==53) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1369:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleURIPathNameCS3351); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getURIPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1373:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1374:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1374:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1375:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_ruleURIPathNameCS3372);
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
            	    break loop16;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1399:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1400:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1401:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3410);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3420); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1408:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1411:28: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1412:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1412:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_SIMPLE_ID && LA17_0<=RULE_ESCAPED_ID)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1412:2: ( ( ruleUnrestrictedName ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1412:2: ( ( ruleUnrestrictedName ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1413:1: ( ruleUnrestrictedName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1413:1: ( ruleUnrestrictedName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1414:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3472);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1431:6: ( () ( ( ruleURI ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1431:6: ( () ( ( ruleURI ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1431:7: () ( ( ruleURI ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1431:7: ()
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1432:2: 
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1440:2: ( ( ruleURI ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1441:1: ( ruleURI )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1441:1: ( ruleURI )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1442:3: ruleURI
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
                    pushFollow(FollowSets000.FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3518);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1466:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1467:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1468:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3556);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3567); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1475:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1478:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1479:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1479:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt18=1;
                }
                break;
            case 55:
                {
                alt18=2;
                }
                break;
            case 56:
                {
                alt18=3;
                }
                break;
            case 57:
                {
                alt18=4;
                }
                break;
            case 58:
                {
                alt18=5;
                }
                break;
            case 59:
                {
                alt18=6;
                }
                break;
            case 60:
                {
                alt18=7;
                }
                break;
            case 61:
                {
                alt18=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1480:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimitiveTypeIdentifier3605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1487:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimitiveTypeIdentifier3624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1494:2: kw= 'Real'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePrimitiveTypeIdentifier3643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1501:2: kw= 'String'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveTypeIdentifier3662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1508:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePrimitiveTypeIdentifier3681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1515:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveTypeIdentifier3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1522:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePrimitiveTypeIdentifier3719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1529:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulePrimitiveTypeIdentifier3738); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1542:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1543:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1544:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS3778);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS3788); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1551:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1554:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1555:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1555:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1556:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1556:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1557:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3833);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1581:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1582:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1583:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier3869);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier3880); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1590:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1593:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1594:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1594:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt19=1;
                }
                break;
            case 63:
                {
                alt19=2;
                }
                break;
            case 64:
                {
                alt19=3;
                }
                break;
            case 65:
                {
                alt19=4;
                }
                break;
            case 66:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1595:2: kw= 'Set'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCollectionTypeIdentifier3918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1602:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCollectionTypeIdentifier3937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1609:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier3956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1616:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionTypeIdentifier3975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1623:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleCollectionTypeIdentifier3994); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1636:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1637:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1638:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4034);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS4044); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1645:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1648:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1649:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1649:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1649:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1649:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1650:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1650:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1651:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4090);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1667:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1667:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionTypeCS4103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1671:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1672:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1672:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1673:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4124);
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

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionTypeCS4136); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1701:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1702:2: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1703:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4174);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapTypeCS4184); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1710:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1713:28: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1714:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1714:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1714:2: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1714:2: ( (lv_name_0_0= 'Map' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1715:1: (lv_name_0_0= 'Map' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1715:1: (lv_name_0_0= 'Map' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1716:3: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMapTypeCS4227); if (state.failed) return current;
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1729:2: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1729:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMapTypeCS4253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1733:1: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1734:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1734:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1735:3: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4274);
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

                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMapTypeCS4286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1755:1: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1756:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1756:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1757:3: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4307);
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

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMapTypeCS4319); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1785:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1786:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1787:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4357);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS4367); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1794:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1797:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1798:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1798:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1798:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1798:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1799:1: (lv_name_0_0= 'Tuple' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1799:1: (lv_name_0_0= 'Tuple' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1800:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTupleTypeCS4410); if (state.failed) return current;
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1813:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                switch ( input.LA(2) ) {
                    case RULE_SIMPLE_ID:
                        {
                        int LA24_3 = input.LA(3);

                        if ( (LA24_3==19) ) {
                            alt24=1;
                        }
                        }
                        break;
                    case RULE_ESCAPED_ID:
                        {
                        int LA24_4 = input.LA(3);

                        if ( (LA24_4==19) ) {
                            alt24=1;
                        }
                        }
                        break;
                    case 31:
                        {
                        alt24=1;
                        }
                        break;
                }

            }
            switch (alt24) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1813:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTupleTypeCS4436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1817:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=RULE_SIMPLE_ID && LA23_0<=RULE_ESCAPED_ID)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1817:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1817:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1818:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1818:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1819:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4458);
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

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1835:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==17) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1835:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleTypeCS4471); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1839:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1840:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1840:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1841:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4492);
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
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTupleTypeCS4508); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1869:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1870:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1871:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4546);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS4556); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1878:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1881:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1882:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1882:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1882:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1882:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1883:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1883:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1884:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4602);
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

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTuplePartCS4614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1904:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1905:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1905:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1906:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4635);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1930:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1931:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1932:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4671);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4681); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1939:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1942:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1943:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1943:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1943:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1943:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1944:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1944:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1945:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4727);
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionLiteralExpCS4739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1965:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_SIMPLE_ID && LA26_0<=RULE_SINGLE_QUOTED_STRING)||LA26_0==19||LA26_0==21||(LA26_0>=29 && LA26_0<=30)||(LA26_0>=32 && LA26_0<=34)||(LA26_0>=51 && LA26_0<=52)||(LA26_0>=54 && LA26_0<=66)||LA26_0==69||(LA26_0>=71 && LA26_0<=74)||LA26_0==80||(LA26_0>=85 && LA26_0<=86)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1965:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1965:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1966:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1966:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1967:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4761);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1983:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==17) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1983:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCollectionLiteralExpCS4774); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1987:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1988:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1988:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1989:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4795);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCollectionLiteralExpCS4811); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2017:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2018:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2019:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4847);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4857); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2026:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2029:28: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2030:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2030:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt28=2;
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
            case 71:
            case 72:
            case 73:
            case 74:
            case 80:
            case 85:
            case 86:
                {
                alt28=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==EOF||LA28_2==17||LA28_2==23||LA28_2==26||LA28_2==30||LA28_2==32||(LA28_2>=34 && LA28_2<=50)||LA28_2==53||LA28_2==67||LA28_2==75||LA28_2==77) ) {
                    alt28=1;
                }
                else if ( (LA28_2==19) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==19) ) {
                    alt28=2;
                }
                else if ( (LA28_3==EOF||LA28_3==17||LA28_3==23||LA28_3==26||LA28_3==30||LA28_3==32||(LA28_3>=34 && LA28_3<=50)||LA28_3==53||LA28_3==67||LA28_3==75||LA28_3==77) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt28=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2030:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2030:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2030:3: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2030:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2031:1: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2031:1: (lv_ownedExpression_0_0= ruleExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2032:3: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4904);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2048:2: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==67) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2048:4: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCollectionLiteralPartCS4917); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2052:1: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2053:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2053:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2054:3: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4938);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2071:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2071:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2072:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2072:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2073:3: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS4968);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2097:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2098:2: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2099:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5004);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionPatternCS5014); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2106:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2109:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2110:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2110:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2110:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2110:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2111:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2111:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2112:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5060);
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionPatternCS5072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2132:1: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_SIMPLE_ID && LA30_0<=RULE_ESCAPED_ID)||LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2132:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2132:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2133:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2133:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2134:3: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5094);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2150:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==17) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2150:4: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCollectionPatternCS5107); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2154:1: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2155:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2155:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2156:3: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5128);
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
                    	    break loop29;
                        }
                    } while (true);

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2172:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2172:6: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCollectionPatternCS5143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2176:1: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2177:1: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2177:1: (lv_restVariableName_6_0= ruleIdentifier )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2178:3: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5164);
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

            otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCollectionPatternCS5179); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2206:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2207:2: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2208:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5215);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShadowPartCS5225); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2215:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2218:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2219:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2219:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2219:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2219:2: ( ( ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2220:1: ( ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2220:1: ( ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2221:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5277);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleShadowPartCS5289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2241:1: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2242:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2242:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2243:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2243:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            int alt31=2;
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
            case 71:
            case 72:
            case 73:
            case 74:
            case 80:
            case 85:
            case 86:
                {
                alt31=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==EOF||LA31_2==17||LA31_2==23||LA31_2==26||LA31_2==30||LA31_2==32||(LA31_2>=34 && LA31_2<=50)||LA31_2==53||LA31_2==75||LA31_2==77) ) {
                    alt31=1;
                }
                else if ( (LA31_2==19) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA31_3 = input.LA(2);

                if ( (LA31_3==EOF||LA31_3==17||LA31_3==23||LA31_3==26||LA31_3==30||LA31_3==32||(LA31_3>=34 && LA31_3<=50)||LA31_3==53||LA31_3==75||LA31_3==77) ) {
                    alt31=1;
                }
                else if ( (LA31_3==19) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt31=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2244:3: lv_ownedInitExpression_2_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleShadowPartCS5312);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2259:8: lv_ownedInitExpression_2_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5331);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2285:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2286:2: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2287:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5370);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePatternExpCS5380); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2294:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2297:28: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2298:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2298:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2298:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2298:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_SIMPLE_ID && LA32_0<=RULE_ESCAPED_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2299:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2299:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2300:3: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5426);
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

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePatternExpCS5439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2320:1: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2321:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2321:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2322:3: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5460);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2346:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2347:2: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2348:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5496);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5506); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2355:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2358:28: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2359:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2359:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2359:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLambdaLiteralExpCS5543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLambdaLiteralExpCS5555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2367:1: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2368:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2368:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2369:3: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5576);
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

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLambdaLiteralExpCS5588); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2397:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2398:2: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2399:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5624);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralExpCS5634); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2406:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2409:28: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2410:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2410:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2410:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2410:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2411:1: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2411:1: (lv_ownedType_0_0= ruleMapTypeCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2412:3: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5680);
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMapLiteralExpCS5692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2432:1: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_SIMPLE_ID && LA34_0<=RULE_SINGLE_QUOTED_STRING)||LA34_0==21||(LA34_0>=29 && LA34_0<=30)||(LA34_0>=32 && LA34_0<=34)||(LA34_0>=51 && LA34_0<=52)||(LA34_0>=54 && LA34_0<=66)||LA34_0==69||(LA34_0>=71 && LA34_0<=74)||LA34_0==80||(LA34_0>=85 && LA34_0<=86)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2432:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2432:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2433:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2433:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2434:3: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5714);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2450:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==17) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2450:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMapLiteralExpCS5727); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2454:1: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2455:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2455:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2456:3: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5748);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMapLiteralExpCS5764); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2484:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2485:2: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2486:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS5800);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralPartCS5810); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2493:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2496:28: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2497:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2497:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2497:2: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2497:2: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2498:1: (lv_ownedKey_0_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2498:1: (lv_ownedKey_0_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2499:3: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5856);
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

            otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleMapLiteralPartCS5868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2519:1: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2520:1: (lv_ownedValue_2_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2520:1: (lv_ownedValue_2_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2521:3: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5889);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2545:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2546:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2547:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS5925);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS5935); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2554:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2557:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2558:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2558:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt35=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt35=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt35=2;
                }
                break;
            case 71:
            case 72:
                {
                alt35=3;
                }
                break;
            case 34:
                {
                alt35=4;
                }
                break;
            case 73:
                {
                alt35=5;
                }
                break;
            case 74:
                {
                alt35=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2559:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS5985);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2572:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6015);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2585:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6045);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2598:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6075);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2611:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6105);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2624:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6135);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2643:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2644:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2645:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6170);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6180); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2652:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2655:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2656:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2656:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2656:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTupleLiteralExpCS6217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleLiteralExpCS6229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2664:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2665:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2665:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2666:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6250);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2682:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2682:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleLiteralExpCS6263); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2686:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2687:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2687:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2688:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6284);
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
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTupleLiteralExpCS6298); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2716:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2717:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2718:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6334);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6344); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2725:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2728:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2729:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2729:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2729:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2729:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2730:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2730:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2731:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6390);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2747:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2747:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTupleLiteralPartCS6403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2751:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2752:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2752:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2753:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6424);
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

            otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTupleLiteralPartCS6438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2773:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2774:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2774:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2775:3: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6459);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2799:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2800:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2801:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6495);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6505); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2808:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2811:28: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2812:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2812:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2813:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2813:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2814:3: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6550);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2838:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2839:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2840:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6585);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS6595); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2847:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2850:28: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2851:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2851:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_SINGLE_QUOTED_STRING) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred78_InternalCS2ASDSL()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2852:1: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2852:1: (lv_segments_0_0= ruleStringLiteral )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2853:3: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6640);
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
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2877:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2878:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2879:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6676);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6686); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2886:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2889:28: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2890:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2890:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==71) ) {
                alt39=1;
            }
            else if ( (LA39_0==72) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2890:2: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2890:2: ( (lv_symbol_0_0= 'true' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2891:1: (lv_symbol_0_0= 'true' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2891:1: (lv_symbol_0_0= 'true' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2892:3: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleBooleanLiteralExpCS6729); if (state.failed) return current;
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2906:6: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2906:6: ( (lv_symbol_1_0= 'false' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2907:1: (lv_symbol_1_0= 'false' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2907:1: (lv_symbol_1_0= 'false' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2908:3: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleBooleanLiteralExpCS6766); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2929:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2930:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2931:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS6815);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS6825); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2938:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2941:28: ( ( () otherlv_1= '*' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2942:1: ( () otherlv_1= '*' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2942:1: ( () otherlv_1= '*' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2942:2: () otherlv_1= '*'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2942:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2943:2: 
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

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS6874); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2963:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2964:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2965:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS6910);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS6920); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2972:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2975:28: ( ( () otherlv_1= 'invalid' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2976:1: ( () otherlv_1= 'invalid' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2976:1: ( () otherlv_1= 'invalid' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2976:2: () otherlv_1= 'invalid'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2976:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2977:2: 
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

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleInvalidLiteralExpCS6969); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2997:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2998:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2999:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7005);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS7015); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3006:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3009:28: ( ( () otherlv_1= 'null' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3010:1: ( () otherlv_1= 'null' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3010:1: ( () otherlv_1= 'null' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3010:2: () otherlv_1= 'null'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3010:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3011:2: 
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

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleNullLiteralExpCS7064); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3031:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3032:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3033:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS7100);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS7110); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3040:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3043:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3044:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3044:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt40=4;
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
                alt40=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt40=2;
                }
                break;
            case 51:
                {
                alt40=3;
                }
                break;
            case 52:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3045:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS7160);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3058:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS7190);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3071:2: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_ruleTypeLiteralCS7220);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3084:2: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS7250);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3103:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3104:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3105:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7285);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7295); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3112:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3115:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3116:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3116:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3117:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7345);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3128:1: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==77) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3129:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3129:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3130:3: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7365);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3154:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3155:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3156:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7402);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7412); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3163:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3166:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3167:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3167:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3168:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3168:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3169:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7457);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3193:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3194:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3195:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7492);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS7502); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3202:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3205:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3206:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3206:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3206:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3206:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3207:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3207:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3208:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7548);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3224:2: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3224:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3224:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3225:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3225:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3226:3: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7570);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3242:2: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==23) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3242:4: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTypeNameExpCS7583); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3246:1: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3247:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3247:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3248:3: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7604);
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

                            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeNameExpCS7616); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3276:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3277:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3278:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7656);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS7666); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3285:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3288:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3289:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3289:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3289:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3289:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3290:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7717);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3303:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS7747);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3316:2: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getCollectionPatternCSParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS7777);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3327:2: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==77) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3328:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3328:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3329:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS7798);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3353:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3354:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3355:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS7835);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS7845); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3362:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3365:28: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3366:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3366:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3366:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3366:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3367:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS7896);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedPrimaryExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt46=2;
                    alt46 = dfa46.predict(input);
                    switch (alt46) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:2: ()
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3379:2: 
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

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3387:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3388:1: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3388:1: (lv_name_2_0= ruleBinaryOperatorName )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3389:3: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_ruleExpCS7929);
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

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3405:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3406:1: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3406:1: (lv_ownedRight_3_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3407:3: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleExpCS7950);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3425:2: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS7984);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3444:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3445:2: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3446:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS8019);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedLetExpCS8029); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3453:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3456:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3457:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3457:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=32 && LA48_0<=33)) ) {
                alt48=1;
            }
            else if ( (LA48_0==85) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3457:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3457:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3457:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3457:3: ()
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3458:2: 
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3466:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3467:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3467:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3468:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS8088);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3484:2: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3485:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3485:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3486:3: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS8109);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3504:2: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS8141);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3523:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3524:2: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3525:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8176);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8186); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3532:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3535:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3536:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3536:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=32 && LA49_0<=33)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_SIMPLE_ID && LA49_0<=RULE_SINGLE_QUOTED_STRING)||LA49_0==21||(LA49_0>=29 && LA49_0<=30)||LA49_0==34||(LA49_0>=51 && LA49_0<=52)||(LA49_0>=54 && LA49_0<=66)||LA49_0==69||(LA49_0>=71 && LA49_0<=74)||LA49_0==80||LA49_0==86) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3536:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3536:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3536:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3536:3: ()
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3537:2: 
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3545:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3546:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3546:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3547:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8245);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3563:2: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3564:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3564:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3565:3: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8266);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3583:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8298);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3602:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3603:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3604:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8333);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameExpCS8343); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3611:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3614:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3615:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3615:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3615:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3615:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3616:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3616:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3617:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleNameExpCS8389);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3633:2: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==77) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3634:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3634:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3635:3: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8410);
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
            	    break loop50;
                }
            } while (true);

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3651:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3652:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3652:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3653:3: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8432);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3669:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==23) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3670:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3670:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3671:3: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8454);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3687:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==75) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3687:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3687:4: ( (lv_isPre_4_0= '@' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3688:1: (lv_isPre_4_0= '@' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3688:1: (lv_isPre_4_0= '@' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3689:3: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleNameExpCS8474); if (state.failed) return current;
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

                    otherlv_5=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleNameExpCS8499); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3714:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3715:2: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3716:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8537);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8547); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3723:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3726:28: ( ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3727:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3727:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3727:2: () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3727:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3728:2: 
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCurlyBracketedClauseCS8596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3740:1: ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_SIMPLE_ID && LA56_0<=RULE_ESCAPED_ID)||LA56_0==26) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3740:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3740:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=RULE_SIMPLE_ID && LA55_0<=RULE_ESCAPED_ID)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3740:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3740:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3741:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3741:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3742:3: lv_ownedParts_2_0= ruleShadowPartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8619);
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

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3758:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==17) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3758:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCurlyBracketedClauseCS8632); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_0_1_0());
                            	          
                            	    }
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3762:1: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3763:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    {
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3763:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3764:3: lv_ownedParts_4_0= ruleShadowPartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8653);
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
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3781:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3781:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3782:1: (lv_value_5_0= ruleStringLiteral )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3782:1: (lv_value_5_0= ruleStringLiteral )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3783:3: lv_value_5_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getValueStringLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8684);
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

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCurlyBracketedClauseCS8697); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3811:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3812:2: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3813:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS8733);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS8743); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3820:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3823:28: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3824:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3824:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3824:2: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3824:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3825:2: 
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRoundBracketedClauseCS8792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3837:1: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_SIMPLE_ID && LA62_0<=RULE_SINGLE_QUOTED_STRING)||LA62_0==19||LA62_0==21||(LA62_0>=29 && LA62_0<=30)||(LA62_0>=32 && LA62_0<=34)||(LA62_0>=51 && LA62_0<=52)||(LA62_0>=54 && LA62_0<=66)||LA62_0==69||(LA62_0>=71 && LA62_0<=74)||LA62_0==80||(LA62_0>=85 && LA62_0<=86)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3837:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3837:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3838:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3838:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3839:3: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS8814);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3855:2: ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==17) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3856:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3856:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3857:3: lv_ownedArguments_3_0= ruleNavigatingCommaArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8835);
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
                    	    break loop57;
                        }
                    } while (true);

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3873:3: ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==25) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3873:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3873:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3874:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3874:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3875:3: lv_ownedArguments_4_0= ruleNavigatingSemiArgCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS8858);
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

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3891:2: ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==17) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3892:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3892:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3893:3: lv_ownedArguments_5_0= ruleNavigatingCommaArgCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8879);
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
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3909:5: ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==79) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3909:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3909:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3910:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3910:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3911:3: lv_ownedArguments_6_0= ruleNavigatingBarArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS8904);
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

                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3927:2: ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    loop60:
                    	    do {
                    	        int alt60=2;
                    	        int LA60_0 = input.LA(1);

                    	        if ( (LA60_0==17) ) {
                    	            alt60=1;
                    	        }


                    	        switch (alt60) {
                    	    	case 1 :
                    	    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3928:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    {
                    	    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3928:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3929:3: lv_ownedArguments_7_0= ruleNavigatingCommaArgCS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_3_1_0()); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8925);
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
                    	    	    break loop60;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRoundBracketedClauseCS8942); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3957:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3958:2: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3959:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS8978);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS8988); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3966:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3969:28: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3970:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3970:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3970:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleSquareBracketedClauseCS9025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3974:1: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3975:1: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3975:1: (lv_ownedTerms_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3976:3: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9046);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3992:2: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==17) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3992:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSquareBracketedClauseCS9059); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3996:1: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3997:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3997:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3998:3: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9080);
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
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleSquareBracketedClauseCS9094); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4026:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4027:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4028:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS9130);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS9140); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4035:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4038:28: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4039:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4039:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_SIMPLE_ID && LA66_0<=RULE_SINGLE_QUOTED_STRING)||LA66_0==21||(LA66_0>=29 && LA66_0<=30)||(LA66_0>=32 && LA66_0<=34)||(LA66_0>=51 && LA66_0<=52)||(LA66_0>=54 && LA66_0<=66)||LA66_0==69||(LA66_0>=71 && LA66_0<=74)||LA66_0==80||(LA66_0>=85 && LA66_0<=86)) ) {
                alt66=1;
            }
            else if ( (LA66_0==19) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4039:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4039:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4039:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4039:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4040:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4040:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4041:3: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9187);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4057:2: ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    int alt65=3;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==19) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==16) ) {
                        alt65=2;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4057:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4057:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4057:5: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingArgCS9201); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_0_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4061:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4062:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4062:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4063:3: lv_ownedType_2_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9222);
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

                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4079:2: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==41) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4079:4: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingArgCS9235); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                          
                                    }
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4083:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4084:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4084:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4085:3: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9256);
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
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4102:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4102:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4102:8: otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            {
                            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNavigatingArgCS9278); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_1_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4106:1: ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4107:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4107:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4108:3: lv_ownedInitExpression_6_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9299);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4125:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4125:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4125:8: otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingArgCS9322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4129:1: ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4130:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4130:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4131:3: lv_ownedType_8_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9343);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4155:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4156:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4157:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9380);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9390); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4164:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4167:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4168:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4168:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4168:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4168:2: ( (lv_prefix_0_0= '|' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4169:1: (lv_prefix_0_0= '|' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4169:1: (lv_prefix_0_0= '|' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4170:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleNavigatingBarArgCS9433); if (state.failed) return current;
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4183:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4184:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4184:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4185:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9467);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4201:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==19) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4201:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingBarArgCS9480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4205:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4206:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4206:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4207:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9501);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4223:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==41) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4223:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingBarArgCS9514); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4227:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4228:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4228:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4229:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9535);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4253:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4254:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4255:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9575);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9585); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4262:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4265:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4266:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4266:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4266:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4266:2: ( (lv_prefix_0_0= ',' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4267:1: (lv_prefix_0_0= ',' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4267:1: (lv_prefix_0_0= ',' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4268:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleNavigatingCommaArgCS9628); if (state.failed) return current;
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4281:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4282:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4282:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4283:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9662);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4299:2: ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==19) ) {
                alt70=1;
            }
            else if ( (LA70_0==16) ) {
                alt70=2;
            }
            switch (alt70) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4299:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4299:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4299:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingCommaArgCS9676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4303:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4304:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4304:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4305:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9697);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4321:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==41) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4321:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingCommaArgCS9710); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4325:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4326:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4326:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4327:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9731);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4344:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4344:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4344:8: otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    {
                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNavigatingCommaArgCS9753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4348:1: ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4349:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4349:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4350:3: lv_ownedInitExpression_7_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9774);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4374:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4375:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4376:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS9813);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS9823); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4383:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4386:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4387:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4387:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4387:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4387:2: ( (lv_prefix_0_0= ';' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4388:1: (lv_prefix_0_0= ';' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4388:1: (lv_prefix_0_0= ';' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4389:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNavigatingSemiArgCS9866); if (state.failed) return current;
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4402:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4403:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4403:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4404:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS9900);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4420:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==19) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4420:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNavigatingSemiArgCS9913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4424:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4425:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4425:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4426:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9934);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4442:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==41) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4442:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNavigatingSemiArgCS9947); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4446:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4447:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4447:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4448:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9968);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4472:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4473:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4474:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10008);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10018); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4481:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4484:28: (this_ExpCS_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4486:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10067);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4505:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4506:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4507:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS10101);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS10111); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4514:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4517:28: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4518:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4518:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4518:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleIfExpCS10148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4522:1: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4523:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4523:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4524:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4524:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt73=2;
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
            case 71:
            case 72:
            case 73:
            case 74:
            case 80:
            case 85:
            case 86:
                {
                alt73=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==19) ) {
                    alt73=2;
                }
                else if ( (LA73_2==23||LA73_2==30||LA73_2==32||(LA73_2>=34 && LA73_2<=50)||LA73_2==53||LA73_2==75||LA73_2==77||LA73_2==81) ) {
                    alt73=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA73_3 = input.LA(2);

                if ( (LA73_3==23||LA73_3==30||LA73_3==32||(LA73_3>=34 && LA73_3<=50)||LA73_3==53||LA73_3==75||LA73_3==77||LA73_3==81) ) {
                    alt73=1;
                }
                else if ( (LA73_3==19) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt73=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4525:3: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10171);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4540:8: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleIfExpCS10190);
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

            otherlv_2=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleIfExpCS10205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4562:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4563:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4563:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4564:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10226);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4580:2: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==84) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4581:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4581:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4582:3: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10247);
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
            	    break loop74;
                }
            } while (true);

            otherlv_5=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleIfExpCS10260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4602:1: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4603:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4603:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4604:3: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10281);
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

            otherlv_7=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleIfExpCS10293); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4632:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4633:2: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4634:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10329);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElseIfThenExpCS10339); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4641:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4644:28: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4645:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4645:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4645:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleElseIfThenExpCS10376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4649:1: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4650:1: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4650:1: (lv_ownedCondition_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4651:3: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10397);
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

            otherlv_2=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleElseIfThenExpCS10409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4671:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4672:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4672:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4673:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10430);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4697:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4698:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4699:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10466);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS10476); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4706:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4709:28: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4710:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4710:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4710:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleLetExpCS10513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4714:1: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4715:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4715:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4716:3: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10534);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4732:2: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==17) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4732:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLetExpCS10547); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4736:1: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4737:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4737:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4738:3: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10568);
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
            	    break loop75;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLetExpCS10582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4758:1: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4759:1: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4759:1: (lv_ownedInExpression_5_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4760:3: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS10603);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4784:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4785:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4786:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10639);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS10649); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4793:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4796:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4797:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4797:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4797:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4797:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4798:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4798:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4799:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10695);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4815:2: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==30) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4816:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4816:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4817:3: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10716);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4833:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==19) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4833:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLetVariableCS10730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4837:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4838:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4838:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4839:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS10751);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleLetVariableCS10765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4859:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4860:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4860:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4861:3: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS10786);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4885:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4886:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4887:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS10822);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS10832); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4894:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4897:28: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4898:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4898:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4898:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNestedExpCS10869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4902:1: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4903:1: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4903:1: (lv_ownedExpression_1_0= ruleExpCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4904:3: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS10890);
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

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNestedExpCS10902); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4932:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4933:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4934:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS10938);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS10948); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4941:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4944:28: ( ( () otherlv_1= 'self' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4945:1: ( () otherlv_1= 'self' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4945:1: ( () otherlv_1= 'self' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4945:2: () otherlv_1= 'self'
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4945:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4946:2: 
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

            otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleSelfExpCS10997); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4966:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4967:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4968:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS11033);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS11043); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4975:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4978:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4979:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4979:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4979:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4979:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4980:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4980:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4981:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS11089);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4997:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==67) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:4997:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMultiplicityBoundsCS11102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5001:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5002:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5002:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5003:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS11123);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5027:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5028:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5029:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS11161);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS11171); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5036:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) ;
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
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5039:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5040:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5040:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5040:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleMultiplicityCS11208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5044:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                alt79=1;
            }
            else if ( (LA79_0==34||LA79_0==36||LA79_0==89) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5045:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11234);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5058:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11264);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5069:2: (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==87) ) {
                alt80=1;
            }
            else if ( (LA80_0==88) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5069:4: otherlv_3= '|?'
                    {
                    otherlv_3=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleMultiplicityCS11277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5074:6: ( (lv_isNullFree_4_0= '|1' ) )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5074:6: ( (lv_isNullFree_4_0= '|1' ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5075:1: (lv_isNullFree_4_0= '|1' )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5075:1: (lv_isNullFree_4_0= '|1' )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5076:3: lv_isNullFree_4_0= '|1'
                    {
                    lv_isNullFree_4_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleMultiplicityCS11301); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleMultiplicityCS11328); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5101:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5102:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5103:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11364);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS11374); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5110:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5113:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5114:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5114:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5115:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5115:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5116:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5116:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt81=1;
                }
                break;
            case 36:
                {
                alt81=2;
                }
                break;
            case 89:
                {
                alt81=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5117:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiplicityStringCS11418); if (state.failed) return current;
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5129:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultiplicityStringCS11447); if (state.failed) return current;
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5141:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleMultiplicityStringCS11476); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5164:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5165:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5166:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS11527);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS11537); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5173:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5176:28: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5177:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5177:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5177:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5177:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5178:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5178:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5179:3: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11583);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5195:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==53) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5195:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePathNameCS11596); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5199:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5200:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5200:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5201:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11617);
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
            	    break loop82;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5225:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5226:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5227:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11655);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS11665); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5234:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5237:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5238:1: ( ( ruleUnrestrictedName ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5238:1: ( ( ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5239:1: ( ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5239:1: ( ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5240:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11716);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5264:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5265:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5266:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS11751);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS11761); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5273:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5276:28: ( ( ( ruleUnreservedName ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5277:1: ( ( ruleUnreservedName ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5277:1: ( ( ruleUnreservedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5278:1: ( ruleUnreservedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5278:1: ( ruleUnreservedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5279:3: ruleUnreservedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS11812);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5303:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5304:2: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5305:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS11847);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateBindingCS11857); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5312:1: ruleTemplateBindingCS returns [EObject current=null] : ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedSubstitutions_0_0 = null;

        EObject lv_ownedSubstitutions_2_0 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5315:28: ( ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5316:1: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5316:1: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5316:2: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5316:2: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5317:1: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5317:1: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5318:3: lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11903);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5334:2: (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==17) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5334:4: otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTemplateBindingCS11916); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5338:1: ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5339:1: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5339:1: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5340:3: lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11937);
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
            	    break loop83;
                }
            } while (true);

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5356:4: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==77) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5357:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5357:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5358:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTemplateBindingCS11960);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5382:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5383:2: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5384:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS11997);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS12007); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5391:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5394:28: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5395:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5395:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5396:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5396:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5397:3: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS12052);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5423:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5424:2: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5425:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS12089);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeParameterCS12099); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5432:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5435:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5436:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5436:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5436:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5436:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5437:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5437:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5438:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS12145);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5454:2: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==90) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5454:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleTypeParameterCS12158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5458:1: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5459:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5459:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5460:3: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12179);
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

                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5476:2: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==91) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5476:4: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleTypeParameterCS12192); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5480:1: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5481:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5481:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5482:3: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12213);
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
                    	    break loop85;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5506:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5507:2: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5508:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12253);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRefCS12263); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5515:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5518:28: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5519:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5519:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=RULE_SIMPLE_ID && LA87_0<=RULE_ESCAPED_ID)) ) {
                alt87=1;
            }
            else if ( (LA87_0==89) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5520:2: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12313);
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
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5533:2: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12343);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5552:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5553:2: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5554:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12378);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedRefCS12388); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5561:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5564:28: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5566:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12437);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5585:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5586:2: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5587:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12471);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedTypeRefCS12481); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5594:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5597:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5598:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5598:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5598:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5598:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5599:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5599:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5600:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12527);
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

            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5616:2: (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==30) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5616:4: otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTypedTypeRefCS12540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypedTypeRefCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5620:1: ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5621:1: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5621:1: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5622:3: lv_ownedBinding_2_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12561);
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

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTypedTypeRefCS12573); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5650:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5651:2: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5652:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12611);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12621); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5659:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5662:28: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5663:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5663:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5663:2: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5663:2: ()
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5664:2: 
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

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleWildcardTypeRefCS12670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5676:1: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==90) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5676:3: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleWildcardTypeRefCS12683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5680:1: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5681:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5681:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5682:3: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12704);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5706:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5707:2: (iv_ruleID= ruleID EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5708:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID12743);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID12754); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5715:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5718:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5719:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5719:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_SIMPLE_ID) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_ESCAPED_ID) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5719:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID12794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5727:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID12820); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5742:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5743:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5744:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier12866);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier12877); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5751:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5754:28: (this_ID_0= ruleID )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5756:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier12923);
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5774:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5775:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5776:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER12968);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER12979); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5783:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5786:28: (this_INT_0= RULE_INT )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5787:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER13018); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5802:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5803:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5804:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL13063);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL13074); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5811:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5814:28: (this_INT_0= RULE_INT )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5815:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL13113); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5830:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5831:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5832:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral13158);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral13169); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5839:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5842:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5843:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral13208); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5858:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5859:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5860:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER13253);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER13264); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5867:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5870:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5871:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5871:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_INT) ) {
                alt91=1;
            }
            else if ( (LA91_0==34) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5871:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER13304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5880:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUPPER13328); if (state.failed) return current;
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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5893:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5894:2: (iv_ruleURI= ruleURI EOF )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5895:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI13369);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI13380); if (state.failed) return current;

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
    // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5902:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5905:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:5906:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13419); if (state.failed) return current;
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

    // $ANTLR start synpred13_InternalCS2ASDSL
    public final void synpred13_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:613:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:613:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred13_InternalCS2ASDSL1226);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalCS2ASDSL

    // $ANTLR start synpred14_InternalCS2ASDSL
    public final void synpred14_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:626:2: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:626:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_synpred14_InternalCS2ASDSL1256);
        this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalCS2ASDSL

    // $ANTLR start synpred15_InternalCS2ASDSL
    public final void synpred15_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:639:2: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:639:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred15_InternalCS2ASDSL1286);
        this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalCS2ASDSL

    // $ANTLR start synpred17_InternalCS2ASDSL
    public final void synpred17_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_8 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:665:2: (this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:665:2: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred17_InternalCS2ASDSL1346);
        this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalCS2ASDSL

    // $ANTLR start synpred56_InternalCS2ASDSL
    public final void synpred56_InternalCS2ASDSL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedType_2_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1667:4: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1667:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
        {
        otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_synpred56_InternalCS2ASDSL4103); if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1671:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1672:1: (lv_ownedType_2_0= ruleTypeExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1672:1: (lv_ownedType_2_0= ruleTypeExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1673:3: lv_ownedType_2_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred56_InternalCS2ASDSL4124);
        lv_ownedType_2_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred56_InternalCS2ASDSL4136); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalCS2ASDSL

    // $ANTLR start synpred57_InternalCS2ASDSL
    public final void synpred57_InternalCS2ASDSL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1729:4: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1729:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
        {
        otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_synpred57_InternalCS2ASDSL4253); if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1733:1: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1734:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1734:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1735:3: lv_ownedKeyType_2_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred57_InternalCS2ASDSL4274);
        lv_ownedKeyType_2_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred57_InternalCS2ASDSL4286); if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1755:1: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1756:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1756:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:1757:3: lv_ownedValueType_4_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_synpred57_InternalCS2ASDSL4307);
        lv_ownedValueType_4_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred57_InternalCS2ASDSL4319); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalCS2ASDSL

    // $ANTLR start synpred78_InternalCS2ASDSL
    public final void synpred78_InternalCS2ASDSL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_segments_0_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2852:1: ( (lv_segments_0_0= ruleStringLiteral ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2852:1: (lv_segments_0_0= ruleStringLiteral )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2852:1: (lv_segments_0_0= ruleStringLiteral )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:2853:3: lv_segments_0_0= ruleStringLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_synpred78_InternalCS2ASDSL6640);
        lv_segments_0_0=ruleStringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred78_InternalCS2ASDSL

    // $ANTLR start synpred87_InternalCS2ASDSL
    public final void synpred87_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3303:2: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3303:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_synpred87_InternalCS2ASDSL7747);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalCS2ASDSL

    // $ANTLR start synpred89_InternalCS2ASDSL
    public final void synpred89_InternalCS2ASDSL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:2: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:2: ()
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3379:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3387:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3388:1: (lv_name_2_0= ruleBinaryOperatorName )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3388:1: (lv_name_2_0= ruleBinaryOperatorName )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3389:3: lv_name_2_0= ruleBinaryOperatorName
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred89_InternalCS2ASDSL7929);
        lv_name_2_0=ruleBinaryOperatorName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3405:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3406:1: (lv_ownedRight_3_0= ruleExpCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3406:1: (lv_ownedRight_3_0= ruleExpCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3407:3: lv_ownedRight_3_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred89_InternalCS2ASDSL7950);
        lv_ownedRight_3_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred89_InternalCS2ASDSL

    // $ANTLR start synpred90_InternalCS2ASDSL
    public final void synpred90_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3366:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3366:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3366:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3367:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_synpred90_InternalCS2ASDSL7896);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==32||(LA100_0>=34 && LA100_0<=50)) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3378:2: ()
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3379:2: 
                {
                if ( state.backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3387:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3388:1: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3388:1: (lv_name_2_0= ruleBinaryOperatorName )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3389:3: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred90_InternalCS2ASDSL7929);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3405:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3406:1: (lv_ownedRight_3_0= ruleExpCS )
                {
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3406:1: (lv_ownedRight_3_0= ruleExpCS )
                // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3407:3: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred90_InternalCS2ASDSL7950);
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
    // $ANTLR end synpred90_InternalCS2ASDSL

    // $ANTLR start synpred94_InternalCS2ASDSL
    public final void synpred94_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject lv_ownedRoundBracketedClause_2_0 = null;


        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3652:1: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3652:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
        {
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3652:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
        // ../uk.ac.york.cs.cs2as.dsl/src-gen/uk/ac/york/cs/cs2as/parser/antlr/internal/InternalCS2ASDSL.g:3653:3: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_synpred94_InternalCS2ASDSL8432);
        lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred94_InternalCS2ASDSL

    // Delegated rules

    public final boolean synpred56_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalCS2ASDSL_fragment(); // can never throw exception
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
    public final boolean synpred13_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalCS2ASDSL_fragment(); // can never throw exception
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA9_eotS =
        "\42\uffff";
    static final String DFA9_eofS =
        "\42\uffff";
    static final String DFA9_minS =
        "\1\4\12\uffff\7\0\20\uffff";
    static final String DFA9_maxS =
        "\1\126\12\uffff\7\0\20\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\1\11\7\uffff\1\12\1\uffff"+
        "\1\13\1\14\1\5\1\6\1\7";
    static final String DFA9_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\20\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\33\2\4\15\uffff\1\35\7\uffff\1\36\1\1\3\uffff\1\4\20\uffff"+
            "\1\14\1\13\1\uffff\10\23\1\15\1\16\1\17\1\20\1\21\2\uffff\1"+
            "\22\1\uffff\4\4\5\uffff\1\2\5\uffff\1\3",
            "",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "560:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_MapExpCS_10= ruleMapExpCS | this_LookupExpCS_11= ruleLookupExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCS2ASDSL()) ) {s = 31;}

                        else if ( (synpred17_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_12 = input.LA(1);

                         
                        int index9_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalCS2ASDSL()) ) {s = 32;}

                        else if ( (synpred17_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index9_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred17_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred17_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred17_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred17_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_17 = input.LA(1);

                         
                        int index9_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred17_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index9_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\107\uffff";
    static final String DFA20_eofS =
        "\1\2\106\uffff";
    static final String DFA20_minS =
        "\1\4\1\0\105\uffff";
    static final String DFA20_maxS =
        "\1\126\1\0\105\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\103\uffff\1\1";
    static final String DFA20_specialS =
        "\1\uffff\1\0\105\uffff}>";
    static final String[] DFA20_transitionS = {
            "\4\2\10\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\1\1\26\2\1\uffff\25\2\2\uffff\12\2",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1667:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalCS2ASDSL()) ) {s = 70;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\107\uffff";
    static final String DFA21_eofS =
        "\1\2\106\uffff";
    static final String DFA21_minS =
        "\1\4\1\0\105\uffff";
    static final String DFA21_maxS =
        "\1\126\1\0\105\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\103\uffff\1\1";
    static final String DFA21_specialS =
        "\1\uffff\1\0\105\uffff}>";
    static final String[] DFA21_transitionS = {
            "\4\2\10\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\1\1\26\2\1\uffff\25\2\2\uffff\12\2",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1729:2: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalCS2ASDSL()) ) {s = 70;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\23\uffff";
    static final String DFA44_eofS =
        "\23\uffff";
    static final String DFA44_minS =
        "\1\4\12\uffff\5\0\3\uffff";
    static final String DFA44_maxS =
        "\1\102\12\uffff\5\0\3\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3";
    static final String DFA44_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] DFA44_transitionS = {
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "3289:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_15 = input.LA(1);

                         
                        int index44_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index44_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\42\uffff";
    static final String DFA47_eofS =
        "\42\uffff";
    static final String DFA47_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA47_maxS =
        "\1\126\2\0\37\uffff";
    static final String DFA47_acceptS =
        "\3\uffff\1\1\35\uffff\1\2";
    static final String DFA47_specialS =
        "\1\uffff\1\0\1\1\37\uffff}>";
    static final String[] DFA47_transitionS = {
            "\4\3\15\uffff\1\3\7\uffff\2\3\1\uffff\1\1\1\2\1\3\20\uffff"+
            "\2\3\1\uffff\15\3\2\uffff\1\3\1\uffff\4\3\5\uffff\1\3\4\uffff"+
            "\1\41\1\3",
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

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "3366:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\103\uffff";
    static final String DFA46_eofS =
        "\1\23\102\uffff";
    static final String DFA46_minS =
        "\1\4\1\0\2\uffff\1\0\76\uffff";
    static final String DFA46_maxS =
        "\1\126\1\0\2\uffff\1\0\76\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\1\20\uffff\1\2\57\uffff";
    static final String DFA46_specialS =
        "\1\uffff\1\0\2\uffff\1\1\76\uffff}>";
    static final String[] DFA46_transitionS = {
            "\4\23\10\uffff\2\23\1\uffff\1\23\1\uffff\1\23\3\uffff\7\23"+
            "\1\4\1\23\1\1\20\2\2\23\1\uffff\16\23\1\uffff\6\23\3\uffff\11"+
            "\23",
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
            return "3378:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_4 = input.LA(1);

                         
                        int index46_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index46_4);
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
    static final String DFA51_eotS =
        "\106\uffff";
    static final String DFA51_eofS =
        "\1\2\105\uffff";
    static final String DFA51_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA51_maxS =
        "\1\126\1\0\104\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA51_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA51_transitionS = {
            "\4\2\10\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\1\1\26\2\1\uffff\16\2\1\uffff\7\2\2\uffff\11\2",
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "3651:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalCS2ASDSL()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
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
        public static final BitSet FOLLOW_23_in_ruleClassMap771 = new BitSet(new long[]{0xFFD800076D2000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_24_in_ruleClassMap784 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleClassMap805 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleClassMap817 = new BitSet(new long[]{0xFFD800076C2000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_rulePropertyMap_in_ruleClassMap840 = new BitSet(new long[]{0xFFD800076C2000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_26_in_ruleClassMap853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyMap_in_entryRulePropertyMap889 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyMap899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rulePropertyMap942 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePropertyMap977 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePropertyMap989 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePropertyMap1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS1046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_rulePrimaryExpCS1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLambdaLiteralExpCS_in_rulePrimaryExpCS1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_rulePrimaryExpCS1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpCS_in_rulePrimaryExpCS1406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLookupExpCS_in_rulePrimaryExpCS1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpCS_in_entryRuleMapExpCS1471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapExpCS1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMapExpCS1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLookupExpCS_in_entryRuleLookupExpCS1566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLookupExpCS1576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleLookupExpCS1613 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLookupExpCS1625 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1646 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_17_in_ruleLookupExpCS1659 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleLookupExpCS1680 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_31_in_ruleLookupExpCS1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName1733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLUnaryOperatorName1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLUnaryOperatorName1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName1842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName1853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperatorName1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLInfixOperatorName1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLInfixOperatorName1929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLInfixOperatorName1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperatorName1967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperatorName1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEssentialOCLNavigationOperatorName2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorName2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorName2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorName2576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorName2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName2769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName2826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName2871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName2928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName2973 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEssentialOCLUnreservedName3121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEssentialOCLUnreservedName3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName3192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIPathNameCS_in_entryRuleURIPathNameCS3282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIPathNameCS3292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_ruleURIPathNameCS3338 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleURIPathNameCS3351 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_ruleURIPathNameCS3372 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3410 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimitiveTypeIdentifier3605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePrimitiveTypeIdentifier3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePrimitiveTypeIdentifier3643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveTypeIdentifier3662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulePrimitiveTypeIdentifier3681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveTypeIdentifier3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePrimitiveTypeIdentifier3719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rulePrimitiveTypeIdentifier3738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS3778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS3788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier3869 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier3880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCollectionTypeIdentifier3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCollectionTypeIdentifier3937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier3956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionTypeIdentifier3975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCollectionTypeIdentifier3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4034 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS4044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4090 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleCollectionTypeCS4103 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4124 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionTypeCS4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapTypeCS4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleMapTypeCS4227 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleMapTypeCS4253 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4274 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMapTypeCS4286 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4307 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMapTypeCS4319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTupleTypeCS4410 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTupleTypeCS4436 = new BitSet(new long[]{0x0000000080000030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4458 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_17_in_ruleTupleTypeCS4471 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4492 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_31_in_ruleTupleTypeCS4508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS4556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4602 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTuplePartCS4614 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4727 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCollectionLiteralExpCS4739 = new BitSet(new long[]{0xFFD800076C2800F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4761 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_17_in_ruleCollectionLiteralExpCS4774 = new BitSet(new long[]{0xFFD80007682800F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4795 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleCollectionLiteralExpCS4811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleCollectionLiteralPartCS4917 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS4968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionPatternCS5014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5060 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCollectionPatternCS5072 = new BitSet(new long[]{0xFFD800076C2800F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5094 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
        public static final BitSet FOLLOW_17_in_ruleCollectionPatternCS5107 = new BitSet(new long[]{0xFFD80007682800F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5128 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleCollectionPatternCS5143 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5164 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCollectionPatternCS5179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShadowPartCS5225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5277 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleShadowPartCS5289 = new BitSet(new long[]{0xFFD80007682800F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleShadowPartCS5312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePatternExpCS5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5426 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePatternExpCS5439 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleLambdaLiteralExpCS5543 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLambdaLiteralExpCS5555 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5576 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLambdaLiteralExpCS5588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralExpCS5634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5680 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMapLiteralExpCS5692 = new BitSet(new long[]{0xFFD800076C2000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5714 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_17_in_ruleMapLiteralExpCS5727 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5748 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleMapLiteralExpCS5764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS5800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralPartCS5810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleMapLiteralPartCS5868 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS5925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS5935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS5985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTupleLiteralExpCS6217 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTupleLiteralExpCS6229 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6250 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_17_in_ruleTupleLiteralExpCS6263 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6284 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleTupleLiteralExpCS6298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6334 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6390 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleTupleLiteralPartCS6403 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6424 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTupleLiteralPartCS6438 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6585 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS6595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6640 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6676 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleBooleanLiteralExpCS6729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleBooleanLiteralExpCS6766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS6815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS6825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS6910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS6920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleInvalidLiteralExpCS6969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS7015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleNullLiteralExpCS7064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS7100 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS7110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS7160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS7190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_ruleTypeLiteralCS7220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS7250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7345 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7402 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS7502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7548 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7570 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleTypeNameExpCS7583 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7604 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTypeNameExpCS7616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS7666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS7747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS7777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS7798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS7835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS7845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS7896 = new BitSet(new long[]{0x0007FFFD00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_ruleExpCS7929 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleExpCS7950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS7984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS8019 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedLetExpCS8029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS8088 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS8109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS8141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8176 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8245 = new BitSet(new long[]{0xFFD80007602000F0L,0x00000000004107A7L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameExpCS8343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleNameExpCS8389 = new BitSet(new long[]{0x0000000040800002L,0x0000000000002800L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8410 = new BitSet(new long[]{0x0000000040800002L,0x0000000000002800L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8432 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleNameExpCS8474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleNameExpCS8499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCurlyBracketedClauseCS8596 = new BitSet(new long[]{0x00000000040000B0L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8619 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_17_in_ruleCurlyBracketedClauseCS8632 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8653 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8684 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCurlyBracketedClauseCS8697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS8733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS8743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRoundBracketedClauseCS8792 = new BitSet(new long[]{0xFFD80007E82800F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS8814 = new BitSet(new long[]{0x0000000082020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8835 = new BitSet(new long[]{0x0000000082020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS8858 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8879 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS8904 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8925 = new BitSet(new long[]{0x0000000080020000L,0x0000000000008000L});
        public static final BitSet FOLLOW_31_in_ruleRoundBracketedClauseCS8942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS8978 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS8988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleSquareBracketedClauseCS9025 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9046 = new BitSet(new long[]{0x0000000000020000L,0x0000000000004000L});
        public static final BitSet FOLLOW_17_in_ruleSquareBracketedClauseCS9059 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9080 = new BitSet(new long[]{0x0000000000020000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleSquareBracketedClauseCS9094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS9130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS9140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9187 = new BitSet(new long[]{0x0000000000090002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingArgCS9201 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9222 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingArgCS9235 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleNavigatingArgCS9278 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingArgCS9322 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleNavigatingBarArgCS9433 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9467 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingBarArgCS9480 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9501 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingBarArgCS9514 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9575 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleNavigatingCommaArgCS9628 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9662 = new BitSet(new long[]{0x0000000000090002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingCommaArgCS9676 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9697 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingCommaArgCS9710 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleNavigatingCommaArgCS9753 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS9813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS9823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleNavigatingSemiArgCS9866 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS9900 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleNavigatingSemiArgCS9913 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9934 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleNavigatingSemiArgCS9947 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS10101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS10111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleIfExpCS10148 = new BitSet(new long[]{0xFFD80007682800F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleIfExpCS10190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_81_in_ruleIfExpCS10205 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000140000L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000140000L});
        public static final BitSet FOLLOW_82_in_ruleIfExpCS10260 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_83_in_ruleIfExpCS10293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElseIfThenExpCS10339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleElseIfThenExpCS10376 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_81_in_ruleElseIfThenExpCS10409 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS10476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleLetExpCS10513 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10534 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleLetExpCS10547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10568 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleLetExpCS10582 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS10603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS10649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10695 = new BitSet(new long[]{0x0000020040080000L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10716 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_19_in_ruleLetVariableCS10730 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS10751 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleLetVariableCS10765 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS10786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS10822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS10832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNestedExpCS10869 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS10890 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleNestedExpCS10902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS10938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS10948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleSelfExpCS10997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS11033 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS11043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS11089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleMultiplicityBoundsCS11102 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS11123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS11161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS11171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleMultiplicityCS11208 = new BitSet(new long[]{0x0000001400000040L,0x0000000002000000L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11234 = new BitSet(new long[]{0x0000000000000000L,0x0000000001804000L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11264 = new BitSet(new long[]{0x0000000000000000L,0x0000000001804000L});
        public static final BitSet FOLLOW_87_in_ruleMultiplicityCS11277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_88_in_ruleMultiplicityCS11301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleMultiplicityCS11328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS11374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleMultiplicityStringCS11418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMultiplicityStringCS11447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleMultiplicityStringCS11476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS11527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS11537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11583 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_rulePathNameCS11596 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11617 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS11665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS11751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS11761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS11812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS11847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateBindingCS11857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11903 = new BitSet(new long[]{0x0000000000020002L,0x0000000000002000L});
        public static final BitSet FOLLOW_17_in_ruleTemplateBindingCS11916 = new BitSet(new long[]{0x0000000000000030L,0x0000000002000000L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11937 = new BitSet(new long[]{0x0000000000020002L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTemplateBindingCS11960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS11997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS12007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS12052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS12089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameterCS12099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS12145 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_90_in_ruleTypeParameterCS12158 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12179 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_ruleTypeParameterCS12192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12213 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRefCS12263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedRefCS12388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedTypeRefCS12481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12527 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTypedTypeRefCS12540 = new BitSet(new long[]{0x0000000000000030L,0x0000000002000000L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12561 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTypedTypeRefCS12573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleWildcardTypeRefCS12670 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_90_in_ruleWildcardTypeRefCS12683 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID12743 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID12754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID12794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID12820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier12866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier12877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier12923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER12968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER12979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER13018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL13063 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL13074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL13113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral13158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral13169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral13208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER13253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER13264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER13304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUPPER13328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI13369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI13380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred13_InternalCS2ASDSL1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_synpred14_InternalCS2ASDSL1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred15_InternalCS2ASDSL1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred17_InternalCS2ASDSL1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred56_InternalCS2ASDSL4103 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred56_InternalCS2ASDSL4124 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_synpred56_InternalCS2ASDSL4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred57_InternalCS2ASDSL4253 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred57_InternalCS2ASDSL4274 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred57_InternalCS2ASDSL4286 = new BitSet(new long[]{0xFFD8000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_synpred57_InternalCS2ASDSL4307 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_synpred57_InternalCS2ASDSL4319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_synpred78_InternalCS2ASDSL6640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_synpred87_InternalCS2ASDSL7747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred89_InternalCS2ASDSL7929 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred89_InternalCS2ASDSL7950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_synpred90_InternalCS2ASDSL7896 = new BitSet(new long[]{0x0007FFFD00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred90_InternalCS2ASDSL7929 = new BitSet(new long[]{0xFFD80007682000F0L,0x00000000006107A7L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred90_InternalCS2ASDSL7950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_synpred94_InternalCS2ASDSL8432 = new BitSet(new long[]{0x0000000000000002L});
    }


}