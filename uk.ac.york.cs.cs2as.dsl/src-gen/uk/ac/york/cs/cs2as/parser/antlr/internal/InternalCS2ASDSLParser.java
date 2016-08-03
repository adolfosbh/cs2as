package uk.ac.york.cs.cs2as.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source'", "','", "'target'", "':'", "'::*'", "'mappings'", "'{'", "'}'", "'map'", "'from'", "'when'", "';'", "'redefine'", "':='", "'disambiguation'", "'name-resolution'", "'targets'", "'using'", "'qualifies'", "'inputs'", "'qualifier'", "'providers'", "'vars'", "'filtered'", "'by'", "'preceding'", "'imported'", "'in'", "'current-scope'", "'and'", "'exported-scope'", "'provides'", "'occluding'", "'adding'", "'resetting'", "'for'", "'all'", "'excepting'", "'helpers'", "'('", "')'", "'trace'", "'lookup'", "'lookupFrom'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'::'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'['", "']'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'|?'", "'|1'", "'?'", "'extends'", "'&&'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int T__95=95;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=11;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalCS2ASDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCS2ASDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCS2ASDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCS2ASDSL.g"; }



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
    // InternalCS2ASDSL.g:74:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getModelAccess().getUnorderedGroup_2()
        		);
        	
        try {
            // InternalCS2ASDSL.g:80:2: (iv_ruleModel= ruleModel EOF )
            // InternalCS2ASDSL.g:81:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCS2ASDSL.g:91:1: ruleModel returns [EObject current=null] : ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_csDecl_0_0 = null;

        EObject lv_asDecl_1_0 = null;

        EObject lv_mappingSect_3_0 = null;

        EObject lv_disambiguationSect_4_0 = null;

        EObject lv_nameresoSect_5_0 = null;

        EObject lv_helpersSect_6_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getModelAccess().getUnorderedGroup_2()
        		);
            
        try {
            // InternalCS2ASDSL.g:97:28: ( ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalCS2ASDSL.g:98:1: ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalCS2ASDSL.g:98:1: ( ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) ) ) )
            // InternalCS2ASDSL.g:98:2: ( (lv_csDecl_0_0= ruleCSDecl ) ) ( (lv_asDecl_1_0= ruleASDecl ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalCS2ASDSL.g:98:2: ( (lv_csDecl_0_0= ruleCSDecl ) )
            // InternalCS2ASDSL.g:99:1: (lv_csDecl_0_0= ruleCSDecl )
            {
            // InternalCS2ASDSL.g:99:1: (lv_csDecl_0_0= ruleCSDecl )
            // InternalCS2ASDSL.g:100:3: lv_csDecl_0_0= ruleCSDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getCsDeclCSDeclParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_3);
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
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.CSDecl");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:116:2: ( (lv_asDecl_1_0= ruleASDecl ) )
            // InternalCS2ASDSL.g:117:1: (lv_asDecl_1_0= ruleASDecl )
            {
            // InternalCS2ASDSL.g:117:1: (lv_asDecl_1_0= ruleASDecl )
            // InternalCS2ASDSL.g:118:3: lv_asDecl_1_0= ruleASDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getAsDeclASDeclParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
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
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ASDecl");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:134:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) ) )
            // InternalCS2ASDSL.g:136:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) )
            {
            // InternalCS2ASDSL.g:136:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?) )
            // InternalCS2ASDSL.g:137:2: ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_2());
            // InternalCS2ASDSL.g:140:2: ( ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?)
            // InternalCS2ASDSL.g:141:3: ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+ {...}?
            {
            // InternalCS2ASDSL.g:141:3: ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 3) ) {
                    alt1=4;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCS2ASDSL.g:143:4: ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) )
            	    {
            	    // InternalCS2ASDSL.g:143:4: ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) )
            	    // InternalCS2ASDSL.g:144:5: {...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalCS2ASDSL.g:144:102: ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) )
            	    // InternalCS2ASDSL.g:145:6: ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 0);
            	    // InternalCS2ASDSL.g:148:6: ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) )
            	    // InternalCS2ASDSL.g:148:7: {...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalCS2ASDSL.g:148:16: ( (lv_mappingSect_3_0= ruleMappingSect ) )
            	    // InternalCS2ASDSL.g:149:1: (lv_mappingSect_3_0= ruleMappingSect )
            	    {
            	    // InternalCS2ASDSL.g:149:1: (lv_mappingSect_3_0= ruleMappingSect )
            	    // InternalCS2ASDSL.g:150:3: lv_mappingSect_3_0= ruleMappingSect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getMappingSectMappingSectParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_mappingSect_3_0=ruleMappingSect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"mappingSect",
            	              		lv_mappingSect_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.MappingSect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCS2ASDSL.g:173:4: ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) )
            	    {
            	    // InternalCS2ASDSL.g:173:4: ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) )
            	    // InternalCS2ASDSL.g:174:5: {...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalCS2ASDSL.g:174:102: ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) )
            	    // InternalCS2ASDSL.g:175:6: ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 1);
            	    // InternalCS2ASDSL.g:178:6: ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) )
            	    // InternalCS2ASDSL.g:178:7: {...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalCS2ASDSL.g:178:16: ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) )
            	    // InternalCS2ASDSL.g:179:1: (lv_disambiguationSect_4_0= ruleDisambiguationSect )
            	    {
            	    // InternalCS2ASDSL.g:179:1: (lv_disambiguationSect_4_0= ruleDisambiguationSect )
            	    // InternalCS2ASDSL.g:180:3: lv_disambiguationSect_4_0= ruleDisambiguationSect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getDisambiguationSectDisambiguationSectParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_disambiguationSect_4_0=ruleDisambiguationSect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"disambiguationSect",
            	              		lv_disambiguationSect_4_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.DisambiguationSect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCS2ASDSL.g:203:4: ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) )
            	    {
            	    // InternalCS2ASDSL.g:203:4: ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) )
            	    // InternalCS2ASDSL.g:204:5: {...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalCS2ASDSL.g:204:102: ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) )
            	    // InternalCS2ASDSL.g:205:6: ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 2);
            	    // InternalCS2ASDSL.g:208:6: ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) )
            	    // InternalCS2ASDSL.g:208:7: {...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalCS2ASDSL.g:208:16: ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) )
            	    // InternalCS2ASDSL.g:209:1: (lv_nameresoSect_5_0= ruleNameResolutionSect )
            	    {
            	    // InternalCS2ASDSL.g:209:1: (lv_nameresoSect_5_0= ruleNameResolutionSect )
            	    // InternalCS2ASDSL.g:210:3: lv_nameresoSect_5_0= ruleNameResolutionSect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getNameresoSectNameResolutionSectParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_nameresoSect_5_0=ruleNameResolutionSect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"nameresoSect",
            	              		lv_nameresoSect_5_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.NameResolutionSect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCS2ASDSL.g:233:4: ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) )
            	    {
            	    // InternalCS2ASDSL.g:233:4: ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) )
            	    // InternalCS2ASDSL.g:234:5: {...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalCS2ASDSL.g:234:102: ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) )
            	    // InternalCS2ASDSL.g:235:6: ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 3);
            	    // InternalCS2ASDSL.g:238:6: ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) )
            	    // InternalCS2ASDSL.g:238:7: {...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalCS2ASDSL.g:238:16: ( (lv_helpersSect_6_0= ruleHelpersSect ) )
            	    // InternalCS2ASDSL.g:239:1: (lv_helpersSect_6_0= ruleHelpersSect )
            	    {
            	    // InternalCS2ASDSL.g:239:1: (lv_helpersSect_6_0= ruleHelpersSect )
            	    // InternalCS2ASDSL.g:240:3: lv_helpersSect_6_0= ruleHelpersSect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getHelpersSectHelpersSectParserRuleCall_2_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_helpersSect_6_0=ruleHelpersSect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"helpersSect",
            	              		lv_helpersSect_6_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.HelpersSect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_2());

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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCSDecl"
    // InternalCS2ASDSL.g:282:1: entryRuleCSDecl returns [EObject current=null] : iv_ruleCSDecl= ruleCSDecl EOF ;
    public final EObject entryRuleCSDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSDecl = null;


        try {
            // InternalCS2ASDSL.g:283:2: (iv_ruleCSDecl= ruleCSDecl EOF )
            // InternalCS2ASDSL.g:284:2: iv_ruleCSDecl= ruleCSDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCSDecl=ruleCSDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:291:1: ruleCSDecl returns [EObject current=null] : (otherlv_0= 'source' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) ;
    public final EObject ruleCSDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metamodels_1_0 = null;

        EObject lv_metamodels_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:294:28: ( (otherlv_0= 'source' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) )
            // InternalCS2ASDSL.g:295:1: (otherlv_0= 'source' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            {
            // InternalCS2ASDSL.g:295:1: (otherlv_0= 'source' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            // InternalCS2ASDSL.g:295:3: otherlv_0= 'source' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCSDeclAccess().getSourceKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:299:1: ( (lv_metamodels_1_0= ruleImportCS ) )
            // InternalCS2ASDSL.g:300:1: (lv_metamodels_1_0= ruleImportCS )
            {
            // InternalCS2ASDSL.g:300:1: (lv_metamodels_1_0= ruleImportCS )
            // InternalCS2ASDSL.g:301:3: lv_metamodels_1_0= ruleImportCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSDeclAccess().getMetamodelsImportCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
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
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ImportCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:317:2: (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCS2ASDSL.g:317:4: otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCSDeclAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:321:1: ( (lv_metamodels_3_0= ruleImportCS ) )
            	    // InternalCS2ASDSL.g:322:1: (lv_metamodels_3_0= ruleImportCS )
            	    {
            	    // InternalCS2ASDSL.g:322:1: (lv_metamodels_3_0= ruleImportCS )
            	    // InternalCS2ASDSL.g:323:3: lv_metamodels_3_0= ruleImportCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCSDeclAccess().getMetamodelsImportCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
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
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ImportCS");
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
    // InternalCS2ASDSL.g:347:1: entryRuleASDecl returns [EObject current=null] : iv_ruleASDecl= ruleASDecl EOF ;
    public final EObject entryRuleASDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASDecl = null;


        try {
            // InternalCS2ASDSL.g:348:2: (iv_ruleASDecl= ruleASDecl EOF )
            // InternalCS2ASDSL.g:349:2: iv_ruleASDecl= ruleASDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleASDecl=ruleASDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:356:1: ruleASDecl returns [EObject current=null] : (otherlv_0= 'target' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) ;
    public final EObject ruleASDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metamodels_1_0 = null;

        EObject lv_metamodels_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:359:28: ( (otherlv_0= 'target' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* ) )
            // InternalCS2ASDSL.g:360:1: (otherlv_0= 'target' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            {
            // InternalCS2ASDSL.g:360:1: (otherlv_0= 'target' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )* )
            // InternalCS2ASDSL.g:360:3: otherlv_0= 'target' ( (lv_metamodels_1_0= ruleImportCS ) ) (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getASDeclAccess().getTargetKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:364:1: ( (lv_metamodels_1_0= ruleImportCS ) )
            // InternalCS2ASDSL.g:365:1: (lv_metamodels_1_0= ruleImportCS )
            {
            // InternalCS2ASDSL.g:365:1: (lv_metamodels_1_0= ruleImportCS )
            // InternalCS2ASDSL.g:366:3: lv_metamodels_1_0= ruleImportCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getASDeclAccess().getMetamodelsImportCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
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
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ImportCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:382:2: (otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCS2ASDSL.g:382:4: otherlv_2= ',' ( (lv_metamodels_3_0= ruleImportCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getASDeclAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:386:1: ( (lv_metamodels_3_0= ruleImportCS ) )
            	    // InternalCS2ASDSL.g:387:1: (lv_metamodels_3_0= ruleImportCS )
            	    {
            	    // InternalCS2ASDSL.g:387:1: (lv_metamodels_3_0= ruleImportCS )
            	    // InternalCS2ASDSL.g:388:3: lv_metamodels_3_0= ruleImportCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getASDeclAccess().getMetamodelsImportCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
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
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ImportCS");
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
    // InternalCS2ASDSL.g:412:1: entryRuleImportCS returns [EObject current=null] : iv_ruleImportCS= ruleImportCS EOF ;
    public final EObject entryRuleImportCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportCS = null;


        try {
            // InternalCS2ASDSL.g:413:2: (iv_ruleImportCS= ruleImportCS EOF )
            // InternalCS2ASDSL.g:414:2: iv_ruleImportCS= ruleImportCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImportCS=ruleImportCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:421:1: ruleImportCS returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? ) ;
    public final EObject ruleImportCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isAll_3_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedPathName_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:424:28: ( ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? ) )
            // InternalCS2ASDSL.g:425:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? )
            {
            // InternalCS2ASDSL.g:425:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )? )
            // InternalCS2ASDSL.g:425:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) ) ( (lv_isAll_3_0= '::*' ) )?
            {
            // InternalCS2ASDSL.g:425:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )?
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
                    // InternalCS2ASDSL.g:425:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':'
                    {
                    // InternalCS2ASDSL.g:425:3: ( (lv_name_0_0= ruleIdentifier ) )
                    // InternalCS2ASDSL.g:426:1: (lv_name_0_0= ruleIdentifier )
                    {
                    // InternalCS2ASDSL.g:426:1: (lv_name_0_0= ruleIdentifier )
                    // InternalCS2ASDSL.g:427:3: lv_name_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportCSAccess().getNameIdentifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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
                              		"org.eclipse.ocl.xtext.base.Base.Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImportCSAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // InternalCS2ASDSL.g:447:3: ( (lv_ownedPathName_2_0= ruleURIPathNameCS ) )
            // InternalCS2ASDSL.g:448:1: (lv_ownedPathName_2_0= ruleURIPathNameCS )
            {
            // InternalCS2ASDSL.g:448:1: (lv_ownedPathName_2_0= ruleURIPathNameCS )
            // InternalCS2ASDSL.g:449:3: lv_ownedPathName_2_0= ruleURIPathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportCSAccess().getOwnedPathNameURIPathNameCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_9);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.URIPathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:465:2: ( (lv_isAll_3_0= '::*' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCS2ASDSL.g:466:1: (lv_isAll_3_0= '::*' )
                    {
                    // InternalCS2ASDSL.g:466:1: (lv_isAll_3_0= '::*' )
                    // InternalCS2ASDSL.g:467:3: lv_isAll_3_0= '::*'
                    {
                    lv_isAll_3_0=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMappingSect"
    // InternalCS2ASDSL.g:488:1: entryRuleMappingSect returns [EObject current=null] : iv_ruleMappingSect= ruleMappingSect EOF ;
    public final EObject entryRuleMappingSect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingSect = null;


        try {
            // InternalCS2ASDSL.g:489:2: (iv_ruleMappingSect= ruleMappingSect EOF )
            // InternalCS2ASDSL.g:490:2: iv_ruleMappingSect= ruleMappingSect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingSectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMappingSect=ruleMappingSect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingSect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingSect"


    // $ANTLR start "ruleMappingSect"
    // InternalCS2ASDSL.g:497:1: ruleMappingSect returns [EObject current=null] : ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleClassMap ) )* otherlv_4= '}' ) ;
    public final EObject ruleMappingSect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:500:28: ( ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleClassMap ) )* otherlv_4= '}' ) )
            // InternalCS2ASDSL.g:501:1: ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleClassMap ) )* otherlv_4= '}' )
            {
            // InternalCS2ASDSL.g:501:1: ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleClassMap ) )* otherlv_4= '}' )
            // InternalCS2ASDSL.g:501:2: () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleClassMap ) )* otherlv_4= '}'
            {
            // InternalCS2ASDSL.g:501:2: ()
            // InternalCS2ASDSL.g:502:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMappingSectAccess().getMappingSectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingSectAccess().getMappingsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMappingSectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:518:1: ( (lv_mappings_3_0= ruleClassMap ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCS2ASDSL.g:519:1: (lv_mappings_3_0= ruleClassMap )
            	    {
            	    // InternalCS2ASDSL.g:519:1: (lv_mappings_3_0= ruleClassMap )
            	    // InternalCS2ASDSL.g:520:3: lv_mappings_3_0= ruleClassMap
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingSectAccess().getMappingsClassMapParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_mappings_3_0=ruleClassMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMappingSectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ClassMap");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMappingSectAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleMappingSect"


    // $ANTLR start "entryRuleClassMap"
    // InternalCS2ASDSL.g:548:1: entryRuleClassMap returns [EObject current=null] : iv_ruleClassMap= ruleClassMap EOF ;
    public final EObject entryRuleClassMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMap = null;


        try {
            // InternalCS2ASDSL.g:549:2: (iv_ruleClassMap= ruleClassMap EOF )
            // InternalCS2ASDSL.g:550:2: iv_ruleClassMap= ruleClassMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassMapRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassMap=ruleClassMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassMap; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:557:1: ruleClassMap returns [EObject current=null] : (otherlv_0= 'map' ( (lv_to_1_0= rulePathNameCS ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePathNameCS ) ) (otherlv_4= 'when' ( (lv_rule_5_0= RULE_SIMPLE_ID ) ) )? otherlv_6= '{' ( (lv_statements_7_0= ruleClassMapStmnt ) )* otherlv_8= '}' ) ;
    public final EObject ruleClassMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_rule_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_to_1_0 = null;

        EObject lv_from_3_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:560:28: ( (otherlv_0= 'map' ( (lv_to_1_0= rulePathNameCS ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePathNameCS ) ) (otherlv_4= 'when' ( (lv_rule_5_0= RULE_SIMPLE_ID ) ) )? otherlv_6= '{' ( (lv_statements_7_0= ruleClassMapStmnt ) )* otherlv_8= '}' ) )
            // InternalCS2ASDSL.g:561:1: (otherlv_0= 'map' ( (lv_to_1_0= rulePathNameCS ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePathNameCS ) ) (otherlv_4= 'when' ( (lv_rule_5_0= RULE_SIMPLE_ID ) ) )? otherlv_6= '{' ( (lv_statements_7_0= ruleClassMapStmnt ) )* otherlv_8= '}' )
            {
            // InternalCS2ASDSL.g:561:1: (otherlv_0= 'map' ( (lv_to_1_0= rulePathNameCS ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePathNameCS ) ) (otherlv_4= 'when' ( (lv_rule_5_0= RULE_SIMPLE_ID ) ) )? otherlv_6= '{' ( (lv_statements_7_0= ruleClassMapStmnt ) )* otherlv_8= '}' )
            // InternalCS2ASDSL.g:561:3: otherlv_0= 'map' ( (lv_to_1_0= rulePathNameCS ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePathNameCS ) ) (otherlv_4= 'when' ( (lv_rule_5_0= RULE_SIMPLE_ID ) ) )? otherlv_6= '{' ( (lv_statements_7_0= ruleClassMapStmnt ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassMapAccess().getMapKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:565:1: ( (lv_to_1_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:566:1: (lv_to_1_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:566:1: (lv_to_1_0= rulePathNameCS )
            // InternalCS2ASDSL.g:567:3: lv_to_1_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassMapAccess().getToPathNameCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_to_1_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassMapRule());
              	        }
                     		set(
                     			current, 
                     			"to",
                      		lv_to_1_0, 
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassMapAccess().getFromKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:587:1: ( (lv_from_3_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:588:1: (lv_from_3_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:588:1: (lv_from_3_0= rulePathNameCS )
            // InternalCS2ASDSL.g:589:3: lv_from_3_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassMapAccess().getFromPathNameCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_from_3_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassMapRule());
              	        }
                     		set(
                     			current, 
                     			"from",
                      		lv_from_3_0, 
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:605:2: (otherlv_4= 'when' ( (lv_rule_5_0= RULE_SIMPLE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCS2ASDSL.g:605:4: otherlv_4= 'when' ( (lv_rule_5_0= RULE_SIMPLE_ID ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassMapAccess().getWhenKeyword_4_0());
                          
                    }
                    // InternalCS2ASDSL.g:609:1: ( (lv_rule_5_0= RULE_SIMPLE_ID ) )
                    // InternalCS2ASDSL.g:610:1: (lv_rule_5_0= RULE_SIMPLE_ID )
                    {
                    // InternalCS2ASDSL.g:610:1: (lv_rule_5_0= RULE_SIMPLE_ID )
                    // InternalCS2ASDSL.g:611:3: lv_rule_5_0= RULE_SIMPLE_ID
                    {
                    lv_rule_5_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rule_5_0, grammarAccess.getClassMapAccess().getRuleSIMPLE_IDTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassMapRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rule",
                              		lv_rule_5_0, 
                              		"org.eclipse.ocl.xtext.base.Base.SIMPLE_ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClassMapAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // InternalCS2ASDSL.g:631:1: ( (lv_statements_7_0= ruleClassMapStmnt ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SIMPLE_ID||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCS2ASDSL.g:632:1: (lv_statements_7_0= ruleClassMapStmnt )
            	    {
            	    // InternalCS2ASDSL.g:632:1: (lv_statements_7_0= ruleClassMapStmnt )
            	    // InternalCS2ASDSL.g:633:3: lv_statements_7_0= ruleClassMapStmnt
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassMapAccess().getStatementsClassMapStmntParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_statements_7_0=ruleClassMapStmnt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassMapRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_7_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ClassMapStmnt");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getClassMapAccess().getRightCurlyBracketKeyword_7());
                  
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


    // $ANTLR start "entryRuleClassMapStmnt"
    // InternalCS2ASDSL.g:661:1: entryRuleClassMapStmnt returns [EObject current=null] : iv_ruleClassMapStmnt= ruleClassMapStmnt EOF ;
    public final EObject entryRuleClassMapStmnt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMapStmnt = null;


        try {
            // InternalCS2ASDSL.g:662:2: (iv_ruleClassMapStmnt= ruleClassMapStmnt EOF )
            // InternalCS2ASDSL.g:663:2: iv_ruleClassMapStmnt= ruleClassMapStmnt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassMapStmntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassMapStmnt=ruleClassMapStmnt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassMapStmnt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassMapStmnt"


    // $ANTLR start "ruleClassMapStmnt"
    // InternalCS2ASDSL.g:670:1: ruleClassMapStmnt returns [EObject current=null] : (this_PropertyMap_0= rulePropertyMap otherlv_1= ';' ) ;
    public final EObject ruleClassMapStmnt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PropertyMap_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:673:28: ( (this_PropertyMap_0= rulePropertyMap otherlv_1= ';' ) )
            // InternalCS2ASDSL.g:674:1: (this_PropertyMap_0= rulePropertyMap otherlv_1= ';' )
            {
            // InternalCS2ASDSL.g:674:1: (this_PropertyMap_0= rulePropertyMap otherlv_1= ';' )
            // InternalCS2ASDSL.g:675:2: this_PropertyMap_0= rulePropertyMap otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassMapStmntAccess().getPropertyMapParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_17);
            this_PropertyMap_0=rulePropertyMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PropertyMap_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassMapStmntAccess().getSemicolonKeyword_1());
                  
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
    // $ANTLR end "ruleClassMapStmnt"


    // $ANTLR start "entryRulePropertyMap"
    // InternalCS2ASDSL.g:698:1: entryRulePropertyMap returns [EObject current=null] : iv_rulePropertyMap= rulePropertyMap EOF ;
    public final EObject entryRulePropertyMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMap = null;


        try {
            // InternalCS2ASDSL.g:699:2: (iv_rulePropertyMap= rulePropertyMap EOF )
            // InternalCS2ASDSL.g:700:2: iv_rulePropertyMap= rulePropertyMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyMapRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyMap=rulePropertyMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyMap; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:707:1: rulePropertyMap returns [EObject current=null] : ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_propName_1_0= RULE_SIMPLE_ID ) ) otherlv_2= ':=' ( (lv_propInit_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePropertyMap() throws RecognitionException {
        EObject current = null;

        Token lv_redefine_0_0=null;
        Token lv_propName_1_0=null;
        Token otherlv_2=null;
        EObject lv_propInit_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:710:28: ( ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_propName_1_0= RULE_SIMPLE_ID ) ) otherlv_2= ':=' ( (lv_propInit_3_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:711:1: ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_propName_1_0= RULE_SIMPLE_ID ) ) otherlv_2= ':=' ( (lv_propInit_3_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:711:1: ( ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_propName_1_0= RULE_SIMPLE_ID ) ) otherlv_2= ':=' ( (lv_propInit_3_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:711:2: ( (lv_redefine_0_0= 'redefine' ) )? ( (lv_propName_1_0= RULE_SIMPLE_ID ) ) otherlv_2= ':=' ( (lv_propInit_3_0= ruleExpCS ) )
            {
            // InternalCS2ASDSL.g:711:2: ( (lv_redefine_0_0= 'redefine' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCS2ASDSL.g:712:1: (lv_redefine_0_0= 'redefine' )
                    {
                    // InternalCS2ASDSL.g:712:1: (lv_redefine_0_0= 'redefine' )
                    // InternalCS2ASDSL.g:713:3: lv_redefine_0_0= 'redefine'
                    {
                    lv_redefine_0_0=(Token)match(input,28,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalCS2ASDSL.g:726:3: ( (lv_propName_1_0= RULE_SIMPLE_ID ) )
            // InternalCS2ASDSL.g:727:1: (lv_propName_1_0= RULE_SIMPLE_ID )
            {
            // InternalCS2ASDSL.g:727:1: (lv_propName_1_0= RULE_SIMPLE_ID )
            // InternalCS2ASDSL.g:728:3: lv_propName_1_0= RULE_SIMPLE_ID
            {
            lv_propName_1_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_propName_1_0, grammarAccess.getPropertyMapAccess().getPropNameSIMPLE_IDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyMapRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"propName",
                      		lv_propName_1_0, 
                      		"org.eclipse.ocl.xtext.base.Base.SIMPLE_ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyMapAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:748:1: ( (lv_propInit_3_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:749:1: (lv_propInit_3_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:749:1: (lv_propInit_3_0= ruleExpCS )
            // InternalCS2ASDSL.g:750:3: lv_propInit_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyMapAccess().getPropInitExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_propInit_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyMapRule());
              	        }
                     		set(
                     			current, 
                     			"propInit",
                      		lv_propInit_3_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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


    // $ANTLR start "entryRuleDisambiguationSect"
    // InternalCS2ASDSL.g:774:1: entryRuleDisambiguationSect returns [EObject current=null] : iv_ruleDisambiguationSect= ruleDisambiguationSect EOF ;
    public final EObject entryRuleDisambiguationSect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisambiguationSect = null;


        try {
            // InternalCS2ASDSL.g:775:2: (iv_ruleDisambiguationSect= ruleDisambiguationSect EOF )
            // InternalCS2ASDSL.g:776:2: iv_ruleDisambiguationSect= ruleDisambiguationSect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisambiguationSectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisambiguationSect=ruleDisambiguationSect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisambiguationSect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisambiguationSect"


    // $ANTLR start "ruleDisambiguationSect"
    // InternalCS2ASDSL.g:783:1: ruleDisambiguationSect returns [EObject current=null] : ( () otherlv_1= 'disambiguation' otherlv_2= '{' ( (lv_disambiguations_3_0= ruleClassDisambiguation ) )* otherlv_4= '}' ) ;
    public final EObject ruleDisambiguationSect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_disambiguations_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:786:28: ( ( () otherlv_1= 'disambiguation' otherlv_2= '{' ( (lv_disambiguations_3_0= ruleClassDisambiguation ) )* otherlv_4= '}' ) )
            // InternalCS2ASDSL.g:787:1: ( () otherlv_1= 'disambiguation' otherlv_2= '{' ( (lv_disambiguations_3_0= ruleClassDisambiguation ) )* otherlv_4= '}' )
            {
            // InternalCS2ASDSL.g:787:1: ( () otherlv_1= 'disambiguation' otherlv_2= '{' ( (lv_disambiguations_3_0= ruleClassDisambiguation ) )* otherlv_4= '}' )
            // InternalCS2ASDSL.g:787:2: () otherlv_1= 'disambiguation' otherlv_2= '{' ( (lv_disambiguations_3_0= ruleClassDisambiguation ) )* otherlv_4= '}'
            {
            // InternalCS2ASDSL.g:787:2: ()
            // InternalCS2ASDSL.g:788:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDisambiguationSectAccess().getDisambiguationSectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDisambiguationSectAccess().getDisambiguationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDisambiguationSectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:804:1: ( (lv_disambiguations_3_0= ruleClassDisambiguation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_SIMPLE_ID && LA10_0<=RULE_ESCAPED_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCS2ASDSL.g:805:1: (lv_disambiguations_3_0= ruleClassDisambiguation )
            	    {
            	    // InternalCS2ASDSL.g:805:1: (lv_disambiguations_3_0= ruleClassDisambiguation )
            	    // InternalCS2ASDSL.g:806:3: lv_disambiguations_3_0= ruleClassDisambiguation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisambiguationSectAccess().getDisambiguationsClassDisambiguationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_disambiguations_3_0=ruleClassDisambiguation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDisambiguationSectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"disambiguations",
            	              		lv_disambiguations_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ClassDisambiguation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDisambiguationSectAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleDisambiguationSect"


    // $ANTLR start "entryRuleClassDisambiguation"
    // InternalCS2ASDSL.g:834:1: entryRuleClassDisambiguation returns [EObject current=null] : iv_ruleClassDisambiguation= ruleClassDisambiguation EOF ;
    public final EObject entryRuleClassDisambiguation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDisambiguation = null;


        try {
            // InternalCS2ASDSL.g:835:2: (iv_ruleClassDisambiguation= ruleClassDisambiguation EOF )
            // InternalCS2ASDSL.g:836:2: iv_ruleClassDisambiguation= ruleClassDisambiguation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDisambiguationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassDisambiguation=ruleClassDisambiguation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDisambiguation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDisambiguation"


    // $ANTLR start "ruleClassDisambiguation"
    // InternalCS2ASDSL.g:843:1: ruleClassDisambiguation returns [EObject current=null] : ( ( (lv_class_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleClassDisambiguationStmnt ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDisambiguation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_class_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:846:28: ( ( ( (lv_class_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleClassDisambiguationStmnt ) )* otherlv_3= '}' ) )
            // InternalCS2ASDSL.g:847:1: ( ( (lv_class_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleClassDisambiguationStmnt ) )* otherlv_3= '}' )
            {
            // InternalCS2ASDSL.g:847:1: ( ( (lv_class_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleClassDisambiguationStmnt ) )* otherlv_3= '}' )
            // InternalCS2ASDSL.g:847:2: ( (lv_class_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleClassDisambiguationStmnt ) )* otherlv_3= '}'
            {
            // InternalCS2ASDSL.g:847:2: ( (lv_class_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:848:1: (lv_class_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:848:1: (lv_class_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:849:3: lv_class_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassDisambiguationAccess().getClassPathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_class_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassDisambiguationRule());
              	        }
                     		set(
                     			current, 
                     			"class",
                      		lv_class_0_0, 
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassDisambiguationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:869:1: ( (lv_statements_2_0= ruleClassDisambiguationStmnt ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SIMPLE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCS2ASDSL.g:870:1: (lv_statements_2_0= ruleClassDisambiguationStmnt )
            	    {
            	    // InternalCS2ASDSL.g:870:1: (lv_statements_2_0= ruleClassDisambiguationStmnt )
            	    // InternalCS2ASDSL.g:871:3: lv_statements_2_0= ruleClassDisambiguationStmnt
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassDisambiguationAccess().getStatementsClassDisambiguationStmntParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_statements_2_0=ruleClassDisambiguationStmnt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassDisambiguationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ClassDisambiguationStmnt");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getClassDisambiguationAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleClassDisambiguation"


    // $ANTLR start "entryRuleClassDisambiguationStmnt"
    // InternalCS2ASDSL.g:899:1: entryRuleClassDisambiguationStmnt returns [EObject current=null] : iv_ruleClassDisambiguationStmnt= ruleClassDisambiguationStmnt EOF ;
    public final EObject entryRuleClassDisambiguationStmnt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDisambiguationStmnt = null;


        try {
            // InternalCS2ASDSL.g:900:2: (iv_ruleClassDisambiguationStmnt= ruleClassDisambiguationStmnt EOF )
            // InternalCS2ASDSL.g:901:2: iv_ruleClassDisambiguationStmnt= ruleClassDisambiguationStmnt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDisambiguationStmntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassDisambiguationStmnt=ruleClassDisambiguationStmnt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDisambiguationStmnt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDisambiguationStmnt"


    // $ANTLR start "ruleClassDisambiguationStmnt"
    // InternalCS2ASDSL.g:908:1: ruleClassDisambiguationStmnt returns [EObject current=null] : (this_DisambiguationDef_0= ruleDisambiguationDef otherlv_1= ';' ) ;
    public final EObject ruleClassDisambiguationStmnt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DisambiguationDef_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:911:28: ( (this_DisambiguationDef_0= ruleDisambiguationDef otherlv_1= ';' ) )
            // InternalCS2ASDSL.g:912:1: (this_DisambiguationDef_0= ruleDisambiguationDef otherlv_1= ';' )
            {
            // InternalCS2ASDSL.g:912:1: (this_DisambiguationDef_0= ruleDisambiguationDef otherlv_1= ';' )
            // InternalCS2ASDSL.g:913:2: this_DisambiguationDef_0= ruleDisambiguationDef otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassDisambiguationStmntAccess().getDisambiguationDefParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_17);
            this_DisambiguationDef_0=ruleDisambiguationDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DisambiguationDef_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassDisambiguationStmntAccess().getSemicolonKeyword_1());
                  
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
    // $ANTLR end "ruleClassDisambiguationStmnt"


    // $ANTLR start "entryRuleDisambiguationDef"
    // InternalCS2ASDSL.g:936:1: entryRuleDisambiguationDef returns [EObject current=null] : iv_ruleDisambiguationDef= ruleDisambiguationDef EOF ;
    public final EObject entryRuleDisambiguationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisambiguationDef = null;


        try {
            // InternalCS2ASDSL.g:937:2: (iv_ruleDisambiguationDef= ruleDisambiguationDef EOF )
            // InternalCS2ASDSL.g:938:2: iv_ruleDisambiguationDef= ruleDisambiguationDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisambiguationDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisambiguationDef=ruleDisambiguationDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisambiguationDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisambiguationDef"


    // $ANTLR start "ruleDisambiguationDef"
    // InternalCS2ASDSL.g:945:1: ruleDisambiguationDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_SIMPLE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleDisambiguationDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:948:28: ( ( ( (lv_name_0_0= RULE_SIMPLE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:949:1: ( ( (lv_name_0_0= RULE_SIMPLE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:949:1: ( ( (lv_name_0_0= RULE_SIMPLE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:949:2: ( (lv_name_0_0= RULE_SIMPLE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExpCS ) )
            {
            // InternalCS2ASDSL.g:949:2: ( (lv_name_0_0= RULE_SIMPLE_ID ) )
            // InternalCS2ASDSL.g:950:1: (lv_name_0_0= RULE_SIMPLE_ID )
            {
            // InternalCS2ASDSL.g:950:1: (lv_name_0_0= RULE_SIMPLE_ID )
            // InternalCS2ASDSL.g:951:3: lv_name_0_0= RULE_SIMPLE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDisambiguationDefAccess().getNameSIMPLE_IDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDisambiguationDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.ocl.xtext.base.Base.SIMPLE_ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDisambiguationDefAccess().getColonEqualsSignKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:971:1: ( (lv_exp_2_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:972:1: (lv_exp_2_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:972:1: (lv_exp_2_0= ruleExpCS )
            // InternalCS2ASDSL.g:973:3: lv_exp_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDisambiguationDefAccess().getExpExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_exp_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDisambiguationDefRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_2_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // $ANTLR end "ruleDisambiguationDef"


    // $ANTLR start "entryRuleNameResolutionSect"
    // InternalCS2ASDSL.g:997:1: entryRuleNameResolutionSect returns [EObject current=null] : iv_ruleNameResolutionSect= ruleNameResolutionSect EOF ;
    public final EObject entryRuleNameResolutionSect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameResolutionSect = null;


        try {
            // InternalCS2ASDSL.g:998:2: (iv_ruleNameResolutionSect= ruleNameResolutionSect EOF )
            // InternalCS2ASDSL.g:999:2: iv_ruleNameResolutionSect= ruleNameResolutionSect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameResolutionSectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNameResolutionSect=ruleNameResolutionSect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameResolutionSect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameResolutionSect"


    // $ANTLR start "ruleNameResolutionSect"
    // InternalCS2ASDSL.g:1006:1: ruleNameResolutionSect returns [EObject current=null] : ( () otherlv_1= 'name-resolution' otherlv_2= '{' ( (lv_targetsDef_3_0= ruleTargets ) ) ( (lv_inputsDef_4_0= ruleInputs ) ) ( (lv_providersDef_5_0= ruleProviders ) ) otherlv_6= '}' ) ;
    public final EObject ruleNameResolutionSect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_targetsDef_3_0 = null;

        EObject lv_inputsDef_4_0 = null;

        EObject lv_providersDef_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1009:28: ( ( () otherlv_1= 'name-resolution' otherlv_2= '{' ( (lv_targetsDef_3_0= ruleTargets ) ) ( (lv_inputsDef_4_0= ruleInputs ) ) ( (lv_providersDef_5_0= ruleProviders ) ) otherlv_6= '}' ) )
            // InternalCS2ASDSL.g:1010:1: ( () otherlv_1= 'name-resolution' otherlv_2= '{' ( (lv_targetsDef_3_0= ruleTargets ) ) ( (lv_inputsDef_4_0= ruleInputs ) ) ( (lv_providersDef_5_0= ruleProviders ) ) otherlv_6= '}' )
            {
            // InternalCS2ASDSL.g:1010:1: ( () otherlv_1= 'name-resolution' otherlv_2= '{' ( (lv_targetsDef_3_0= ruleTargets ) ) ( (lv_inputsDef_4_0= ruleInputs ) ) ( (lv_providersDef_5_0= ruleProviders ) ) otherlv_6= '}' )
            // InternalCS2ASDSL.g:1010:2: () otherlv_1= 'name-resolution' otherlv_2= '{' ( (lv_targetsDef_3_0= ruleTargets ) ) ( (lv_inputsDef_4_0= ruleInputs ) ) ( (lv_providersDef_5_0= ruleProviders ) ) otherlv_6= '}'
            {
            // InternalCS2ASDSL.g:1010:2: ()
            // InternalCS2ASDSL.g:1011:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNameResolutionSectAccess().getNameResolutionSectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNameResolutionSectAccess().getNameResolutionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNameResolutionSectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:1027:1: ( (lv_targetsDef_3_0= ruleTargets ) )
            // InternalCS2ASDSL.g:1028:1: (lv_targetsDef_3_0= ruleTargets )
            {
            // InternalCS2ASDSL.g:1028:1: (lv_targetsDef_3_0= ruleTargets )
            // InternalCS2ASDSL.g:1029:3: lv_targetsDef_3_0= ruleTargets
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameResolutionSectAccess().getTargetsDefTargetsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_targetsDef_3_0=ruleTargets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameResolutionSectRule());
              	        }
                     		set(
                     			current, 
                     			"targetsDef",
                      		lv_targetsDef_3_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.Targets");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:1045:2: ( (lv_inputsDef_4_0= ruleInputs ) )
            // InternalCS2ASDSL.g:1046:1: (lv_inputsDef_4_0= ruleInputs )
            {
            // InternalCS2ASDSL.g:1046:1: (lv_inputsDef_4_0= ruleInputs )
            // InternalCS2ASDSL.g:1047:3: lv_inputsDef_4_0= ruleInputs
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameResolutionSectAccess().getInputsDefInputsParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_inputsDef_4_0=ruleInputs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameResolutionSectRule());
              	        }
                     		set(
                     			current, 
                     			"inputsDef",
                      		lv_inputsDef_4_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.Inputs");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:1063:2: ( (lv_providersDef_5_0= ruleProviders ) )
            // InternalCS2ASDSL.g:1064:1: (lv_providersDef_5_0= ruleProviders )
            {
            // InternalCS2ASDSL.g:1064:1: (lv_providersDef_5_0= ruleProviders )
            // InternalCS2ASDSL.g:1065:3: lv_providersDef_5_0= ruleProviders
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameResolutionSectAccess().getProvidersDefProvidersParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_providersDef_5_0=ruleProviders();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameResolutionSectRule());
              	        }
                     		set(
                     			current, 
                     			"providersDef",
                      		lv_providersDef_5_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.Providers");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNameResolutionSectAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleNameResolutionSect"


    // $ANTLR start "entryRuleTargets"
    // InternalCS2ASDSL.g:1093:1: entryRuleTargets returns [EObject current=null] : iv_ruleTargets= ruleTargets EOF ;
    public final EObject entryRuleTargets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargets = null;


        try {
            // InternalCS2ASDSL.g:1094:2: (iv_ruleTargets= ruleTargets EOF )
            // InternalCS2ASDSL.g:1095:2: iv_ruleTargets= ruleTargets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTargets=ruleTargets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargets; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargets"


    // $ANTLR start "ruleTargets"
    // InternalCS2ASDSL.g:1102:1: ruleTargets returns [EObject current=null] : ( () otherlv_1= 'targets' otherlv_2= '{' ( (lv_targets_3_0= ruleTarget ) )* otherlv_4= '}' ) ;
    public final EObject ruleTargets() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_targets_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1105:28: ( ( () otherlv_1= 'targets' otherlv_2= '{' ( (lv_targets_3_0= ruleTarget ) )* otherlv_4= '}' ) )
            // InternalCS2ASDSL.g:1106:1: ( () otherlv_1= 'targets' otherlv_2= '{' ( (lv_targets_3_0= ruleTarget ) )* otherlv_4= '}' )
            {
            // InternalCS2ASDSL.g:1106:1: ( () otherlv_1= 'targets' otherlv_2= '{' ( (lv_targets_3_0= ruleTarget ) )* otherlv_4= '}' )
            // InternalCS2ASDSL.g:1106:2: () otherlv_1= 'targets' otherlv_2= '{' ( (lv_targets_3_0= ruleTarget ) )* otherlv_4= '}'
            {
            // InternalCS2ASDSL.g:1106:2: ()
            // InternalCS2ASDSL.g:1107:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTargetsAccess().getTargetsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTargetsAccess().getTargetsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTargetsAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:1123:1: ( (lv_targets_3_0= ruleTarget ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_SIMPLE_ID && LA12_0<=RULE_ESCAPED_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCS2ASDSL.g:1124:1: (lv_targets_3_0= ruleTarget )
            	    {
            	    // InternalCS2ASDSL.g:1124:1: (lv_targets_3_0= ruleTarget )
            	    // InternalCS2ASDSL.g:1125:3: lv_targets_3_0= ruleTarget
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTargetsAccess().getTargetsTargetParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_targets_3_0=ruleTarget();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTargetsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"targets",
            	              		lv_targets_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.Target");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTargetsAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleTargets"


    // $ANTLR start "entryRuleTarget"
    // InternalCS2ASDSL.g:1153:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalCS2ASDSL.g:1154:2: (iv_ruleTarget= ruleTarget EOF )
            // InternalCS2ASDSL.g:1155:2: iv_ruleTarget= ruleTarget EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTarget; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalCS2ASDSL.g:1162:1: ruleTarget returns [EObject current=null] : ( ( (lv_classRef_0_0= ruleClassRef ) ) (otherlv_1= 'using' ( (lv_propRef_2_0= rulePathNameCS ) ) )? ( (lv_filter_3_0= ruleFilterDef ) )? (otherlv_4= 'qualifies' ( (lv_qualifications_5_0= ruleQualificationDef ) ) (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_classRef_0_0 = null;

        EObject lv_propRef_2_0 = null;

        EObject lv_filter_3_0 = null;

        EObject lv_qualifications_5_0 = null;

        EObject lv_qualifications_7_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1165:28: ( ( ( (lv_classRef_0_0= ruleClassRef ) ) (otherlv_1= 'using' ( (lv_propRef_2_0= rulePathNameCS ) ) )? ( (lv_filter_3_0= ruleFilterDef ) )? (otherlv_4= 'qualifies' ( (lv_qualifications_5_0= ruleQualificationDef ) ) (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )* )? otherlv_8= ';' ) )
            // InternalCS2ASDSL.g:1166:1: ( ( (lv_classRef_0_0= ruleClassRef ) ) (otherlv_1= 'using' ( (lv_propRef_2_0= rulePathNameCS ) ) )? ( (lv_filter_3_0= ruleFilterDef ) )? (otherlv_4= 'qualifies' ( (lv_qualifications_5_0= ruleQualificationDef ) ) (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )* )? otherlv_8= ';' )
            {
            // InternalCS2ASDSL.g:1166:1: ( ( (lv_classRef_0_0= ruleClassRef ) ) (otherlv_1= 'using' ( (lv_propRef_2_0= rulePathNameCS ) ) )? ( (lv_filter_3_0= ruleFilterDef ) )? (otherlv_4= 'qualifies' ( (lv_qualifications_5_0= ruleQualificationDef ) ) (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )* )? otherlv_8= ';' )
            // InternalCS2ASDSL.g:1166:2: ( (lv_classRef_0_0= ruleClassRef ) ) (otherlv_1= 'using' ( (lv_propRef_2_0= rulePathNameCS ) ) )? ( (lv_filter_3_0= ruleFilterDef ) )? (otherlv_4= 'qualifies' ( (lv_qualifications_5_0= ruleQualificationDef ) ) (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )* )? otherlv_8= ';'
            {
            // InternalCS2ASDSL.g:1166:2: ( (lv_classRef_0_0= ruleClassRef ) )
            // InternalCS2ASDSL.g:1167:1: (lv_classRef_0_0= ruleClassRef )
            {
            // InternalCS2ASDSL.g:1167:1: (lv_classRef_0_0= ruleClassRef )
            // InternalCS2ASDSL.g:1168:3: lv_classRef_0_0= ruleClassRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTargetAccess().getClassRefClassRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_classRef_0_0=ruleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTargetRule());
              	        }
                     		set(
                     			current, 
                     			"classRef",
                      		lv_classRef_0_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ClassRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:1184:2: (otherlv_1= 'using' ( (lv_propRef_2_0= rulePathNameCS ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCS2ASDSL.g:1184:4: otherlv_1= 'using' ( (lv_propRef_2_0= rulePathNameCS ) )
                    {
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTargetAccess().getUsingKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:1188:1: ( (lv_propRef_2_0= rulePathNameCS ) )
                    // InternalCS2ASDSL.g:1189:1: (lv_propRef_2_0= rulePathNameCS )
                    {
                    // InternalCS2ASDSL.g:1189:1: (lv_propRef_2_0= rulePathNameCS )
                    // InternalCS2ASDSL.g:1190:3: lv_propRef_2_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTargetAccess().getPropRefPathNameCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_propRef_2_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTargetRule());
                      	        }
                             		set(
                             			current, 
                             			"propRef",
                              		lv_propRef_2_0, 
                              		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:1206:4: ( (lv_filter_3_0= ruleFilterDef ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCS2ASDSL.g:1207:1: (lv_filter_3_0= ruleFilterDef )
                    {
                    // InternalCS2ASDSL.g:1207:1: (lv_filter_3_0= ruleFilterDef )
                    // InternalCS2ASDSL.g:1208:3: lv_filter_3_0= ruleFilterDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTargetAccess().getFilterFilterDefParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_filter_3_0=ruleFilterDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTargetRule());
                      	        }
                             		set(
                             			current, 
                             			"filter",
                              		lv_filter_3_0, 
                              		"uk.ac.york.cs.cs2as.CS2ASDSL.FilterDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:1224:3: (otherlv_4= 'qualifies' ( (lv_qualifications_5_0= ruleQualificationDef ) ) (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCS2ASDSL.g:1224:5: otherlv_4= 'qualifies' ( (lv_qualifications_5_0= ruleQualificationDef ) ) (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )*
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getQualifiesKeyword_3_0());
                          
                    }
                    // InternalCS2ASDSL.g:1228:1: ( (lv_qualifications_5_0= ruleQualificationDef ) )
                    // InternalCS2ASDSL.g:1229:1: (lv_qualifications_5_0= ruleQualificationDef )
                    {
                    // InternalCS2ASDSL.g:1229:1: (lv_qualifications_5_0= ruleQualificationDef )
                    // InternalCS2ASDSL.g:1230:3: lv_qualifications_5_0= ruleQualificationDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTargetAccess().getQualificationsQualificationDefParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_qualifications_5_0=ruleQualificationDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTargetRule());
                      	        }
                             		add(
                             			current, 
                             			"qualifications",
                              		lv_qualifications_5_0, 
                              		"uk.ac.york.cs.cs2as.CS2ASDSL.QualificationDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:1246:2: (otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:1246:4: otherlv_6= ',' ( (lv_qualifications_7_0= ruleQualificationDef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getTargetAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:1250:1: ( (lv_qualifications_7_0= ruleQualificationDef ) )
                    	    // InternalCS2ASDSL.g:1251:1: (lv_qualifications_7_0= ruleQualificationDef )
                    	    {
                    	    // InternalCS2ASDSL.g:1251:1: (lv_qualifications_7_0= ruleQualificationDef )
                    	    // InternalCS2ASDSL.g:1252:3: lv_qualifications_7_0= ruleQualificationDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTargetAccess().getQualificationsQualificationDefParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    lv_qualifications_7_0=ruleQualificationDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTargetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"qualifications",
                    	              		lv_qualifications_7_0, 
                    	              		"uk.ac.york.cs.cs2as.CS2ASDSL.QualificationDef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTargetAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleInputs"
    // InternalCS2ASDSL.g:1280:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalCS2ASDSL.g:1281:2: (iv_ruleInputs= ruleInputs EOF )
            // InternalCS2ASDSL.g:1282:2: iv_ruleInputs= ruleInputs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInputs=ruleInputs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // InternalCS2ASDSL.g:1289:1: ruleInputs returns [EObject current=null] : ( () otherlv_1= 'inputs' otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' ) ;
    public final EObject ruleInputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputs_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1292:28: ( ( () otherlv_1= 'inputs' otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' ) )
            // InternalCS2ASDSL.g:1293:1: ( () otherlv_1= 'inputs' otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' )
            {
            // InternalCS2ASDSL.g:1293:1: ( () otherlv_1= 'inputs' otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' )
            // InternalCS2ASDSL.g:1293:2: () otherlv_1= 'inputs' otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}'
            {
            // InternalCS2ASDSL.g:1293:2: ()
            // InternalCS2ASDSL.g:1294:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInputsAccess().getInputsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getInputsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInputsAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:1310:1: ( (lv_inputs_3_0= ruleInput ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SIMPLE_ID && LA17_0<=RULE_ESCAPED_ID)||LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCS2ASDSL.g:1311:1: (lv_inputs_3_0= ruleInput )
            	    {
            	    // InternalCS2ASDSL.g:1311:1: (lv_inputs_3_0= ruleInput )
            	    // InternalCS2ASDSL.g:1312:3: lv_inputs_3_0= ruleInput
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_inputs_3_0=ruleInput();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInputsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.Input");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInputsAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleInput"
    // InternalCS2ASDSL.g:1340:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalCS2ASDSL.g:1341:2: (iv_ruleInput= ruleInput EOF )
            // InternalCS2ASDSL.g:1342:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalCS2ASDSL.g:1349:1: ruleInput returns [EObject current=null] : ( ( (lv_qualifier_0_0= 'qualifier' ) )? ( (lv_classRef_1_0= ruleClassRef ) ) (otherlv_2= 'using' ( (lv_propRef_3_0= rulePathNameCS ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_qualifier_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_classRef_1_0 = null;

        EObject lv_propRef_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1352:28: ( ( ( (lv_qualifier_0_0= 'qualifier' ) )? ( (lv_classRef_1_0= ruleClassRef ) ) (otherlv_2= 'using' ( (lv_propRef_3_0= rulePathNameCS ) ) )? otherlv_4= ';' ) )
            // InternalCS2ASDSL.g:1353:1: ( ( (lv_qualifier_0_0= 'qualifier' ) )? ( (lv_classRef_1_0= ruleClassRef ) ) (otherlv_2= 'using' ( (lv_propRef_3_0= rulePathNameCS ) ) )? otherlv_4= ';' )
            {
            // InternalCS2ASDSL.g:1353:1: ( ( (lv_qualifier_0_0= 'qualifier' ) )? ( (lv_classRef_1_0= ruleClassRef ) ) (otherlv_2= 'using' ( (lv_propRef_3_0= rulePathNameCS ) ) )? otherlv_4= ';' )
            // InternalCS2ASDSL.g:1353:2: ( (lv_qualifier_0_0= 'qualifier' ) )? ( (lv_classRef_1_0= ruleClassRef ) ) (otherlv_2= 'using' ( (lv_propRef_3_0= rulePathNameCS ) ) )? otherlv_4= ';'
            {
            // InternalCS2ASDSL.g:1353:2: ( (lv_qualifier_0_0= 'qualifier' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCS2ASDSL.g:1354:1: (lv_qualifier_0_0= 'qualifier' )
                    {
                    // InternalCS2ASDSL.g:1354:1: (lv_qualifier_0_0= 'qualifier' )
                    // InternalCS2ASDSL.g:1355:3: lv_qualifier_0_0= 'qualifier'
                    {
                    lv_qualifier_0_0=(Token)match(input,36,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_qualifier_0_0, grammarAccess.getInputAccess().getQualifierQualifierKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputRule());
                      	        }
                             		setWithLastConsumed(current, "qualifier", true, "qualifier");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:1368:3: ( (lv_classRef_1_0= ruleClassRef ) )
            // InternalCS2ASDSL.g:1369:1: (lv_classRef_1_0= ruleClassRef )
            {
            // InternalCS2ASDSL.g:1369:1: (lv_classRef_1_0= ruleClassRef )
            // InternalCS2ASDSL.g:1370:3: lv_classRef_1_0= ruleClassRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputAccess().getClassRefClassRefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_classRef_1_0=ruleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputRule());
              	        }
                     		set(
                     			current, 
                     			"classRef",
                      		lv_classRef_1_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ClassRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:1386:2: (otherlv_2= 'using' ( (lv_propRef_3_0= rulePathNameCS ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCS2ASDSL.g:1386:4: otherlv_2= 'using' ( (lv_propRef_3_0= rulePathNameCS ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getUsingKeyword_2_0());
                          
                    }
                    // InternalCS2ASDSL.g:1390:1: ( (lv_propRef_3_0= rulePathNameCS ) )
                    // InternalCS2ASDSL.g:1391:1: (lv_propRef_3_0= rulePathNameCS )
                    {
                    // InternalCS2ASDSL.g:1391:1: (lv_propRef_3_0= rulePathNameCS )
                    // InternalCS2ASDSL.g:1392:3: lv_propRef_3_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputAccess().getPropRefPathNameCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_propRef_3_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputRule());
                      	        }
                             		set(
                             			current, 
                             			"propRef",
                              		lv_propRef_3_0, 
                              		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInputAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleProviders"
    // InternalCS2ASDSL.g:1420:1: entryRuleProviders returns [EObject current=null] : iv_ruleProviders= ruleProviders EOF ;
    public final EObject entryRuleProviders() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviders = null;


        try {
            // InternalCS2ASDSL.g:1421:2: (iv_ruleProviders= ruleProviders EOF )
            // InternalCS2ASDSL.g:1422:2: iv_ruleProviders= ruleProviders EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProviders=ruleProviders();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProviders; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProviders"


    // $ANTLR start "ruleProviders"
    // InternalCS2ASDSL.g:1429:1: ruleProviders returns [EObject current=null] : ( () otherlv_1= 'providers' otherlv_2= '{' ( (lv_providers_3_0= ruleProvider ) )* otherlv_4= '}' ) ;
    public final EObject ruleProviders() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_providers_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1432:28: ( ( () otherlv_1= 'providers' otherlv_2= '{' ( (lv_providers_3_0= ruleProvider ) )* otherlv_4= '}' ) )
            // InternalCS2ASDSL.g:1433:1: ( () otherlv_1= 'providers' otherlv_2= '{' ( (lv_providers_3_0= ruleProvider ) )* otherlv_4= '}' )
            {
            // InternalCS2ASDSL.g:1433:1: ( () otherlv_1= 'providers' otherlv_2= '{' ( (lv_providers_3_0= ruleProvider ) )* otherlv_4= '}' )
            // InternalCS2ASDSL.g:1433:2: () otherlv_1= 'providers' otherlv_2= '{' ( (lv_providers_3_0= ruleProvider ) )* otherlv_4= '}'
            {
            // InternalCS2ASDSL.g:1433:2: ()
            // InternalCS2ASDSL.g:1434:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getProvidersAccess().getProvidersAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getProvidersAccess().getProvidersKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProvidersAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:1450:1: ( (lv_providers_3_0= ruleProvider ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SIMPLE_ID && LA20_0<=RULE_ESCAPED_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCS2ASDSL.g:1451:1: (lv_providers_3_0= ruleProvider )
            	    {
            	    // InternalCS2ASDSL.g:1451:1: (lv_providers_3_0= ruleProvider )
            	    // InternalCS2ASDSL.g:1452:3: lv_providers_3_0= ruleProvider
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProvidersAccess().getProvidersProviderParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_providers_3_0=ruleProvider();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProvidersRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"providers",
            	              		lv_providers_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.Provider");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProvidersAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleProviders"


    // $ANTLR start "entryRuleProvider"
    // InternalCS2ASDSL.g:1480:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // InternalCS2ASDSL.g:1481:2: (iv_ruleProvider= ruleProvider EOF )
            // InternalCS2ASDSL.g:1482:2: iv_ruleProvider= ruleProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProvider=ruleProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalCS2ASDSL.g:1489:1: ruleProvider returns [EObject current=null] : ( ( (lv_classRef_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_varsDecl_2_0= ruleProviderVars ) )? ( (lv_statements_3_0= ruleProviderStmnt ) )* otherlv_4= '}' ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_classRef_0_0 = null;

        EObject lv_varsDecl_2_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1492:28: ( ( ( (lv_classRef_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_varsDecl_2_0= ruleProviderVars ) )? ( (lv_statements_3_0= ruleProviderStmnt ) )* otherlv_4= '}' ) )
            // InternalCS2ASDSL.g:1493:1: ( ( (lv_classRef_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_varsDecl_2_0= ruleProviderVars ) )? ( (lv_statements_3_0= ruleProviderStmnt ) )* otherlv_4= '}' )
            {
            // InternalCS2ASDSL.g:1493:1: ( ( (lv_classRef_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_varsDecl_2_0= ruleProviderVars ) )? ( (lv_statements_3_0= ruleProviderStmnt ) )* otherlv_4= '}' )
            // InternalCS2ASDSL.g:1493:2: ( (lv_classRef_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_varsDecl_2_0= ruleProviderVars ) )? ( (lv_statements_3_0= ruleProviderStmnt ) )* otherlv_4= '}'
            {
            // InternalCS2ASDSL.g:1493:2: ( (lv_classRef_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:1494:1: (lv_classRef_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:1494:1: (lv_classRef_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:1495:3: lv_classRef_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProviderAccess().getClassRefPathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_classRef_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProviderRule());
              	        }
                     		set(
                     			current, 
                     			"classRef",
                      		lv_classRef_0_0, 
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getProviderAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:1515:1: ( (lv_varsDecl_2_0= ruleProviderVars ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCS2ASDSL.g:1516:1: (lv_varsDecl_2_0= ruleProviderVars )
                    {
                    // InternalCS2ASDSL.g:1516:1: (lv_varsDecl_2_0= ruleProviderVars )
                    // InternalCS2ASDSL.g:1517:3: lv_varsDecl_2_0= ruleProviderVars
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProviderAccess().getVarsDeclProviderVarsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_varsDecl_2_0=ruleProviderVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProviderRule());
                      	        }
                             		set(
                             			current, 
                             			"varsDecl",
                              		lv_varsDecl_2_0, 
                              		"uk.ac.york.cs.cs2as.CS2ASDSL.ProviderVars");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:1533:3: ( (lv_statements_3_0= ruleProviderStmnt ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43||LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCS2ASDSL.g:1534:1: (lv_statements_3_0= ruleProviderStmnt )
            	    {
            	    // InternalCS2ASDSL.g:1534:1: (lv_statements_3_0= ruleProviderStmnt )
            	    // InternalCS2ASDSL.g:1535:3: lv_statements_3_0= ruleProviderStmnt
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProviderAccess().getStatementsProviderStmntParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    lv_statements_3_0=ruleProviderStmnt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProviderRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ProviderStmnt");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProviderAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleProviderVars"
    // InternalCS2ASDSL.g:1563:1: entryRuleProviderVars returns [EObject current=null] : iv_ruleProviderVars= ruleProviderVars EOF ;
    public final EObject entryRuleProviderVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderVars = null;


        try {
            // InternalCS2ASDSL.g:1564:2: (iv_ruleProviderVars= ruleProviderVars EOF )
            // InternalCS2ASDSL.g:1565:2: iv_ruleProviderVars= ruleProviderVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProviderVarsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProviderVars=ruleProviderVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProviderVars; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProviderVars"


    // $ANTLR start "ruleProviderVars"
    // InternalCS2ASDSL.g:1572:1: ruleProviderVars returns [EObject current=null] : (otherlv_0= 'vars' ( (lv_varDecl_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_varDecl_3_0= ruleLetVariableCS ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleProviderVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_varDecl_1_0 = null;

        EObject lv_varDecl_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1575:28: ( (otherlv_0= 'vars' ( (lv_varDecl_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_varDecl_3_0= ruleLetVariableCS ) ) )* otherlv_4= ';' ) )
            // InternalCS2ASDSL.g:1576:1: (otherlv_0= 'vars' ( (lv_varDecl_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_varDecl_3_0= ruleLetVariableCS ) ) )* otherlv_4= ';' )
            {
            // InternalCS2ASDSL.g:1576:1: (otherlv_0= 'vars' ( (lv_varDecl_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_varDecl_3_0= ruleLetVariableCS ) ) )* otherlv_4= ';' )
            // InternalCS2ASDSL.g:1576:3: otherlv_0= 'vars' ( (lv_varDecl_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_varDecl_3_0= ruleLetVariableCS ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProviderVarsAccess().getVarsKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:1580:1: ( (lv_varDecl_1_0= ruleLetVariableCS ) )
            // InternalCS2ASDSL.g:1581:1: (lv_varDecl_1_0= ruleLetVariableCS )
            {
            // InternalCS2ASDSL.g:1581:1: (lv_varDecl_1_0= ruleLetVariableCS )
            // InternalCS2ASDSL.g:1582:3: lv_varDecl_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProviderVarsAccess().getVarDeclLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_29);
            lv_varDecl_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProviderVarsRule());
              	        }
                     		add(
                     			current, 
                     			"varDecl",
                      		lv_varDecl_1_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:1598:2: (otherlv_2= ',' ( (lv_varDecl_3_0= ruleLetVariableCS ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCS2ASDSL.g:1598:4: otherlv_2= ',' ( (lv_varDecl_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getProviderVarsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:1602:1: ( (lv_varDecl_3_0= ruleLetVariableCS ) )
            	    // InternalCS2ASDSL.g:1603:1: (lv_varDecl_3_0= ruleLetVariableCS )
            	    {
            	    // InternalCS2ASDSL.g:1603:1: (lv_varDecl_3_0= ruleLetVariableCS )
            	    // InternalCS2ASDSL.g:1604:3: lv_varDecl_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProviderVarsAccess().getVarDeclLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_varDecl_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProviderVarsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"varDecl",
            	              		lv_varDecl_3_0, 
            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProviderVarsAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleProviderVars"


    // $ANTLR start "entryRuleProviderStmnt"
    // InternalCS2ASDSL.g:1632:1: entryRuleProviderStmnt returns [EObject current=null] : iv_ruleProviderStmnt= ruleProviderStmnt EOF ;
    public final EObject entryRuleProviderStmnt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderStmnt = null;


        try {
            // InternalCS2ASDSL.g:1633:2: (iv_ruleProviderStmnt= ruleProviderStmnt EOF )
            // InternalCS2ASDSL.g:1634:2: iv_ruleProviderStmnt= ruleProviderStmnt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProviderStmntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProviderStmnt=ruleProviderStmnt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProviderStmnt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProviderStmnt"


    // $ANTLR start "ruleProviderStmnt"
    // InternalCS2ASDSL.g:1641:1: ruleProviderStmnt returns [EObject current=null] : ( (this_ScopeDef_0= ruleScopeDef | this_ExportDef_1= ruleExportDef ) otherlv_2= ';' ) ;
    public final EObject ruleProviderStmnt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ScopeDef_0 = null;

        EObject this_ExportDef_1 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1644:28: ( ( (this_ScopeDef_0= ruleScopeDef | this_ExportDef_1= ruleExportDef ) otherlv_2= ';' ) )
            // InternalCS2ASDSL.g:1645:1: ( (this_ScopeDef_0= ruleScopeDef | this_ExportDef_1= ruleExportDef ) otherlv_2= ';' )
            {
            // InternalCS2ASDSL.g:1645:1: ( (this_ScopeDef_0= ruleScopeDef | this_ExportDef_1= ruleExportDef ) otherlv_2= ';' )
            // InternalCS2ASDSL.g:1645:2: (this_ScopeDef_0= ruleScopeDef | this_ExportDef_1= ruleExportDef ) otherlv_2= ';'
            {
            // InternalCS2ASDSL.g:1645:2: (this_ScopeDef_0= ruleScopeDef | this_ExportDef_1= ruleExportDef )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred27_InternalCS2ASDSL()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==43) ) {
                int LA24_2 = input.LA(2);

                if ( (synpred27_InternalCS2ASDSL()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCS2ASDSL.g:1646:2: this_ScopeDef_0= ruleScopeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getProviderStmntAccess().getScopeDefParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    this_ScopeDef_0=ruleScopeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScopeDef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:1659:2: this_ExportDef_1= ruleExportDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getProviderStmntAccess().getExportDefParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    this_ExportDef_1=ruleExportDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExportDef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProviderStmntAccess().getSemicolonKeyword_1());
                  
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
    // $ANTLR end "ruleProviderStmnt"


    // $ANTLR start "entryRuleFilterDef"
    // InternalCS2ASDSL.g:1682:1: entryRuleFilterDef returns [EObject current=null] : iv_ruleFilterDef= ruleFilterDef EOF ;
    public final EObject entryRuleFilterDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterDef = null;


        try {
            // InternalCS2ASDSL.g:1683:2: (iv_ruleFilterDef= ruleFilterDef EOF )
            // InternalCS2ASDSL.g:1684:2: iv_ruleFilterDef= ruleFilterDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilterDef=ruleFilterDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterDef"


    // $ANTLR start "ruleFilterDef"
    // InternalCS2ASDSL.g:1691:1: ruleFilterDef returns [EObject current=null] : (otherlv_0= 'filtered' (otherlv_1= 'by' ( (lv_params_2_0= ruleParameterDef ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )* )? otherlv_5= 'when' ( (lv_expression_6_0= ruleExpCS ) ) ) ;
    public final EObject ruleFilterDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1694:28: ( (otherlv_0= 'filtered' (otherlv_1= 'by' ( (lv_params_2_0= ruleParameterDef ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )* )? otherlv_5= 'when' ( (lv_expression_6_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:1695:1: (otherlv_0= 'filtered' (otherlv_1= 'by' ( (lv_params_2_0= ruleParameterDef ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )* )? otherlv_5= 'when' ( (lv_expression_6_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:1695:1: (otherlv_0= 'filtered' (otherlv_1= 'by' ( (lv_params_2_0= ruleParameterDef ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )* )? otherlv_5= 'when' ( (lv_expression_6_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:1695:3: otherlv_0= 'filtered' (otherlv_1= 'by' ( (lv_params_2_0= ruleParameterDef ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )* )? otherlv_5= 'when' ( (lv_expression_6_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFilterDefAccess().getFilteredKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:1699:1: (otherlv_1= 'by' ( (lv_params_2_0= ruleParameterDef ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCS2ASDSL.g:1699:3: otherlv_1= 'by' ( (lv_params_2_0= ruleParameterDef ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )*
                    {
                    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFilterDefAccess().getByKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:1703:1: ( (lv_params_2_0= ruleParameterDef ) )
                    // InternalCS2ASDSL.g:1704:1: (lv_params_2_0= ruleParameterDef )
                    {
                    // InternalCS2ASDSL.g:1704:1: (lv_params_2_0= ruleParameterDef )
                    // InternalCS2ASDSL.g:1705:3: lv_params_2_0= ruleParameterDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFilterDefAccess().getParamsParameterDefParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_params_2_0=ruleParameterDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFilterDefRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"uk.ac.york.cs.cs2as.CS2ASDSL.ParameterDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:1721:2: (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==17) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:1721:4: otherlv_3= ',' ( (lv_params_4_0= ruleParameterDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFilterDefAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:1725:1: ( (lv_params_4_0= ruleParameterDef ) )
                    	    // InternalCS2ASDSL.g:1726:1: (lv_params_4_0= ruleParameterDef )
                    	    {
                    	    // InternalCS2ASDSL.g:1726:1: (lv_params_4_0= ruleParameterDef )
                    	    // InternalCS2ASDSL.g:1727:3: lv_params_4_0= ruleParameterDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFilterDefAccess().getParamsParameterDefParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_params_4_0=ruleParameterDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFilterDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ParameterDef");
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

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFilterDefAccess().getWhenKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:1747:1: ( (lv_expression_6_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:1748:1: (lv_expression_6_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:1748:1: (lv_expression_6_0= ruleExpCS )
            // InternalCS2ASDSL.g:1749:3: lv_expression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFilterDefAccess().getExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFilterDefRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // $ANTLR end "ruleFilterDef"


    // $ANTLR start "entryRuleQualificationDef"
    // InternalCS2ASDSL.g:1773:1: entryRuleQualificationDef returns [EObject current=null] : iv_ruleQualificationDef= ruleQualificationDef EOF ;
    public final EObject entryRuleQualificationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualificationDef = null;


        try {
            // InternalCS2ASDSL.g:1774:2: (iv_ruleQualificationDef= ruleQualificationDef EOF )
            // InternalCS2ASDSL.g:1775:2: iv_ruleQualificationDef= ruleQualificationDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualificationDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualificationDef=ruleQualificationDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualificationDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualificationDef"


    // $ANTLR start "ruleQualificationDef"
    // InternalCS2ASDSL.g:1782:1: ruleQualificationDef returns [EObject current=null] : ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleElementsContribExp ) ) ) ;
    public final EObject ruleQualificationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_targetsDef_0_0 = null;

        EObject lv_contribution_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1785:28: ( ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleElementsContribExp ) ) ) )
            // InternalCS2ASDSL.g:1786:1: ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleElementsContribExp ) ) )
            {
            // InternalCS2ASDSL.g:1786:1: ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleElementsContribExp ) ) )
            // InternalCS2ASDSL.g:1786:2: ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleElementsContribExp ) )
            {
            // InternalCS2ASDSL.g:1786:2: ( (lv_targetsDef_0_0= ruleMultipleClassRef ) )
            // InternalCS2ASDSL.g:1787:1: (lv_targetsDef_0_0= ruleMultipleClassRef )
            {
            // InternalCS2ASDSL.g:1787:1: (lv_targetsDef_0_0= ruleMultipleClassRef )
            // InternalCS2ASDSL.g:1788:3: lv_targetsDef_0_0= ruleMultipleClassRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualificationDefAccess().getTargetsDefMultipleClassRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_targetsDef_0_0=ruleMultipleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQualificationDefRule());
              	        }
                     		set(
                     			current, 
                     			"targetsDef",
                      		lv_targetsDef_0_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.MultipleClassRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQualificationDefAccess().getUsingKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:1808:1: ( (lv_contribution_2_0= ruleElementsContribExp ) )
            // InternalCS2ASDSL.g:1809:1: (lv_contribution_2_0= ruleElementsContribExp )
            {
            // InternalCS2ASDSL.g:1809:1: (lv_contribution_2_0= ruleElementsContribExp )
            // InternalCS2ASDSL.g:1810:3: lv_contribution_2_0= ruleElementsContribExp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualificationDefAccess().getContributionElementsContribExpParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_contribution_2_0=ruleElementsContribExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQualificationDefRule());
              	        }
                     		add(
                     			current, 
                     			"contribution",
                      		lv_contribution_2_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ElementsContribExp");
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
    // $ANTLR end "ruleQualificationDef"


    // $ANTLR start "entryRuleElementsContribExp"
    // InternalCS2ASDSL.g:1834:1: entryRuleElementsContribExp returns [EObject current=null] : iv_ruleElementsContribExp= ruleElementsContribExp EOF ;
    public final EObject entryRuleElementsContribExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementsContribExp = null;


        try {
            // InternalCS2ASDSL.g:1835:2: (iv_ruleElementsContribExp= ruleElementsContribExp EOF )
            // InternalCS2ASDSL.g:1836:2: iv_ruleElementsContribExp= ruleElementsContribExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementsContribExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElementsContribExp=ruleElementsContribExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementsContribExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementsContribExp"


    // $ANTLR start "ruleElementsContribExp"
    // InternalCS2ASDSL.g:1843:1: ruleElementsContribExp returns [EObject current=null] : ( ( ( (lv_isPreceding_0_0= 'preceding' ) ) | ( (lv_isImported_1_0= 'imported' ) )? )? ( (lv_expression_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleElementsContribExp() throws RecognitionException {
        EObject current = null;

        Token lv_isPreceding_0_0=null;
        Token lv_isImported_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1846:28: ( ( ( ( (lv_isPreceding_0_0= 'preceding' ) ) | ( (lv_isImported_1_0= 'imported' ) )? )? ( (lv_expression_2_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:1847:1: ( ( ( (lv_isPreceding_0_0= 'preceding' ) ) | ( (lv_isImported_1_0= 'imported' ) )? )? ( (lv_expression_2_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:1847:1: ( ( ( (lv_isPreceding_0_0= 'preceding' ) ) | ( (lv_isImported_1_0= 'imported' ) )? )? ( (lv_expression_2_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:1847:2: ( ( (lv_isPreceding_0_0= 'preceding' ) ) | ( (lv_isImported_1_0= 'imported' ) )? )? ( (lv_expression_2_0= ruleExpCS ) )
            {
            // InternalCS2ASDSL.g:1847:2: ( ( (lv_isPreceding_0_0= 'preceding' ) ) | ( (lv_isImported_1_0= 'imported' ) )? )?
            int alt28=3;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalCS2ASDSL.g:1847:3: ( (lv_isPreceding_0_0= 'preceding' ) )
                    {
                    // InternalCS2ASDSL.g:1847:3: ( (lv_isPreceding_0_0= 'preceding' ) )
                    // InternalCS2ASDSL.g:1848:1: (lv_isPreceding_0_0= 'preceding' )
                    {
                    // InternalCS2ASDSL.g:1848:1: (lv_isPreceding_0_0= 'preceding' )
                    // InternalCS2ASDSL.g:1849:3: lv_isPreceding_0_0= 'preceding'
                    {
                    lv_isPreceding_0_0=(Token)match(input,41,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isPreceding_0_0, grammarAccess.getElementsContribExpAccess().getIsPrecedingPrecedingKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementsContribExpRule());
                      	        }
                             		setWithLastConsumed(current, "isPreceding", true, "preceding");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:1863:6: ( (lv_isImported_1_0= 'imported' ) )?
                    {
                    // InternalCS2ASDSL.g:1863:6: ( (lv_isImported_1_0= 'imported' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==42) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalCS2ASDSL.g:1864:1: (lv_isImported_1_0= 'imported' )
                            {
                            // InternalCS2ASDSL.g:1864:1: (lv_isImported_1_0= 'imported' )
                            // InternalCS2ASDSL.g:1865:3: lv_isImported_1_0= 'imported'
                            {
                            lv_isImported_1_0=(Token)match(input,42,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isImported_1_0, grammarAccess.getElementsContribExpAccess().getIsImportedImportedKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getElementsContribExpRule());
                              	        }
                                     		setWithLastConsumed(current, "isImported", true, "imported");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:1878:5: ( (lv_expression_2_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:1879:1: (lv_expression_2_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:1879:1: (lv_expression_2_0= ruleExpCS )
            // InternalCS2ASDSL.g:1880:3: lv_expression_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementsContribExpAccess().getExpressionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementsContribExpRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // $ANTLR end "ruleElementsContribExp"


    // $ANTLR start "entryRuleScopeDef"
    // InternalCS2ASDSL.g:1904:1: entryRuleScopeDef returns [EObject current=null] : iv_ruleScopeDef= ruleScopeDef EOF ;
    public final EObject entryRuleScopeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDef = null;


        try {
            // InternalCS2ASDSL.g:1905:2: (iv_ruleScopeDef= ruleScopeDef EOF )
            // InternalCS2ASDSL.g:1906:2: iv_ruleScopeDef= ruleScopeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScopeDef=ruleScopeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopeDef"


    // $ANTLR start "ruleScopeDef"
    // InternalCS2ASDSL.g:1913:1: ruleScopeDef returns [EObject current=null] : ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'current-scope' (otherlv_3= 'and' ( (lv_alsoExports_4_0= 'exported-scope' ) ) )? otherlv_5= 'provides' (otherlv_6= 'occluding' | ( (lv_sameScope_7_0= 'adding' ) ) | ( (lv_emptyScope_8_0= 'resetting' ) ) )? ( (lv_provisionDefs_9_0= ruleProvisionDef ) )+ ) ;
    public final EObject ruleScopeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_alsoExports_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_sameScope_7_0=null;
        Token lv_emptyScope_8_0=null;
        EObject lv_selectionDef_0_0 = null;

        EObject lv_provisionDefs_9_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:1916:28: ( ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'current-scope' (otherlv_3= 'and' ( (lv_alsoExports_4_0= 'exported-scope' ) ) )? otherlv_5= 'provides' (otherlv_6= 'occluding' | ( (lv_sameScope_7_0= 'adding' ) ) | ( (lv_emptyScope_8_0= 'resetting' ) ) )? ( (lv_provisionDefs_9_0= ruleProvisionDef ) )+ ) )
            // InternalCS2ASDSL.g:1917:1: ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'current-scope' (otherlv_3= 'and' ( (lv_alsoExports_4_0= 'exported-scope' ) ) )? otherlv_5= 'provides' (otherlv_6= 'occluding' | ( (lv_sameScope_7_0= 'adding' ) ) | ( (lv_emptyScope_8_0= 'resetting' ) ) )? ( (lv_provisionDefs_9_0= ruleProvisionDef ) )+ )
            {
            // InternalCS2ASDSL.g:1917:1: ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'current-scope' (otherlv_3= 'and' ( (lv_alsoExports_4_0= 'exported-scope' ) ) )? otherlv_5= 'provides' (otherlv_6= 'occluding' | ( (lv_sameScope_7_0= 'adding' ) ) | ( (lv_emptyScope_8_0= 'resetting' ) ) )? ( (lv_provisionDefs_9_0= ruleProvisionDef ) )+ )
            // InternalCS2ASDSL.g:1917:2: ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'current-scope' (otherlv_3= 'and' ( (lv_alsoExports_4_0= 'exported-scope' ) ) )? otherlv_5= 'provides' (otherlv_6= 'occluding' | ( (lv_sameScope_7_0= 'adding' ) ) | ( (lv_emptyScope_8_0= 'resetting' ) ) )? ( (lv_provisionDefs_9_0= ruleProvisionDef ) )+
            {
            // InternalCS2ASDSL.g:1917:2: ( (lv_selectionDef_0_0= ruleSelectionDef ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCS2ASDSL.g:1918:1: (lv_selectionDef_0_0= ruleSelectionDef )
                    {
                    // InternalCS2ASDSL.g:1918:1: (lv_selectionDef_0_0= ruleSelectionDef )
                    // InternalCS2ASDSL.g:1919:3: lv_selectionDef_0_0= ruleSelectionDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScopeDefAccess().getSelectionDefSelectionDefParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_selectionDef_0_0=ruleSelectionDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScopeDefRule());
                      	        }
                             		set(
                             			current, 
                             			"selectionDef",
                              		lv_selectionDef_0_0, 
                              		"uk.ac.york.cs.cs2as.CS2ASDSL.SelectionDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScopeDefAccess().getInKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeDefAccess().getCurrentScopeKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:1943:1: (otherlv_3= 'and' ( (lv_alsoExports_4_0= 'exported-scope' ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCS2ASDSL.g:1943:3: otherlv_3= 'and' ( (lv_alsoExports_4_0= 'exported-scope' ) )
                    {
                    otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getScopeDefAccess().getAndKeyword_3_0());
                          
                    }
                    // InternalCS2ASDSL.g:1947:1: ( (lv_alsoExports_4_0= 'exported-scope' ) )
                    // InternalCS2ASDSL.g:1948:1: (lv_alsoExports_4_0= 'exported-scope' )
                    {
                    // InternalCS2ASDSL.g:1948:1: (lv_alsoExports_4_0= 'exported-scope' )
                    // InternalCS2ASDSL.g:1949:3: lv_alsoExports_4_0= 'exported-scope'
                    {
                    lv_alsoExports_4_0=(Token)match(input,46,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_alsoExports_4_0, grammarAccess.getScopeDefAccess().getAlsoExportsExportedScopeKeyword_3_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeDefRule());
                      	        }
                             		setWithLastConsumed(current, "alsoExports", true, "exported-scope");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getScopeDefAccess().getProvidesKeyword_4());
                  
            }
            // InternalCS2ASDSL.g:1966:1: (otherlv_6= 'occluding' | ( (lv_sameScope_7_0= 'adding' ) ) | ( (lv_emptyScope_8_0= 'resetting' ) ) )?
            int alt31=4;
            switch ( input.LA(1) ) {
                case 48:
                    {
                    alt31=1;
                    }
                    break;
                case 49:
                    {
                    alt31=2;
                    }
                    break;
                case 50:
                    {
                    alt31=3;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // InternalCS2ASDSL.g:1966:3: otherlv_6= 'occluding'
                    {
                    otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getScopeDefAccess().getOccludingKeyword_5_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:1971:6: ( (lv_sameScope_7_0= 'adding' ) )
                    {
                    // InternalCS2ASDSL.g:1971:6: ( (lv_sameScope_7_0= 'adding' ) )
                    // InternalCS2ASDSL.g:1972:1: (lv_sameScope_7_0= 'adding' )
                    {
                    // InternalCS2ASDSL.g:1972:1: (lv_sameScope_7_0= 'adding' )
                    // InternalCS2ASDSL.g:1973:3: lv_sameScope_7_0= 'adding'
                    {
                    lv_sameScope_7_0=(Token)match(input,49,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_sameScope_7_0, grammarAccess.getScopeDefAccess().getSameScopeAddingKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeDefRule());
                      	        }
                             		setWithLastConsumed(current, "sameScope", true, "adding");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCS2ASDSL.g:1987:6: ( (lv_emptyScope_8_0= 'resetting' ) )
                    {
                    // InternalCS2ASDSL.g:1987:6: ( (lv_emptyScope_8_0= 'resetting' ) )
                    // InternalCS2ASDSL.g:1988:1: (lv_emptyScope_8_0= 'resetting' )
                    {
                    // InternalCS2ASDSL.g:1988:1: (lv_emptyScope_8_0= 'resetting' )
                    // InternalCS2ASDSL.g:1989:3: lv_emptyScope_8_0= 'resetting'
                    {
                    lv_emptyScope_8_0=(Token)match(input,50,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_emptyScope_8_0, grammarAccess.getScopeDefAccess().getEmptyScopeResettingKeyword_5_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeDefRule());
                      	        }
                             		setWithLastConsumed(current, "emptyScope", true, "resetting");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:2002:4: ( (lv_provisionDefs_9_0= ruleProvisionDef ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_SIMPLE_ID && LA32_0<=RULE_ESCAPED_ID)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCS2ASDSL.g:2003:1: (lv_provisionDefs_9_0= ruleProvisionDef )
            	    {
            	    // InternalCS2ASDSL.g:2003:1: (lv_provisionDefs_9_0= ruleProvisionDef )
            	    // InternalCS2ASDSL.g:2004:3: lv_provisionDefs_9_0= ruleProvisionDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeDefAccess().getProvisionDefsProvisionDefParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_provisionDefs_9_0=ruleProvisionDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"provisionDefs",
            	              		lv_provisionDefs_9_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ProvisionDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // $ANTLR end "ruleScopeDef"


    // $ANTLR start "entryRuleSelectionDef"
    // InternalCS2ASDSL.g:2028:1: entryRuleSelectionDef returns [EObject current=null] : iv_ruleSelectionDef= ruleSelectionDef EOF ;
    public final EObject entryRuleSelectionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionDef = null;


        try {
            // InternalCS2ASDSL.g:2029:2: (iv_ruleSelectionDef= ruleSelectionDef EOF )
            // InternalCS2ASDSL.g:2030:2: iv_ruleSelectionDef= ruleSelectionDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelectionDef=ruleSelectionDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionDef"


    // $ANTLR start "ruleSelectionDef"
    // InternalCS2ASDSL.g:2037:1: ruleSelectionDef returns [EObject current=null] : (otherlv_0= 'for' ( ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? ) | ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) ) ) ) ;
    public final EObject ruleSelectionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_exceptionProperties_4_0 = null;

        EObject lv_exceptionProperties_6_0 = null;

        EObject lv_selectedProperties_8_0 = null;

        EObject lv_selectedProperties_10_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2040:28: ( (otherlv_0= 'for' ( ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? ) | ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) ) ) ) )
            // InternalCS2ASDSL.g:2041:1: (otherlv_0= 'for' ( ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? ) | ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) ) ) )
            {
            // InternalCS2ASDSL.g:2041:1: (otherlv_0= 'for' ( ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? ) | ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) ) ) )
            // InternalCS2ASDSL.g:2041:3: otherlv_0= 'for' ( ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? ) | ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectionDefAccess().getForKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:2045:1: ( ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? ) | ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=RULE_SIMPLE_ID && LA36_0<=RULE_SINGLE_QUOTED_STRING)||LA36_0==55||(LA36_0>=57 && LA36_0<=62)||(LA36_0>=78 && LA36_0<=79)||(LA36_0>=81 && LA36_0<=93)||LA36_0==96||(LA36_0>=98 && LA36_0<=101)||LA36_0==107||(LA36_0>=112 && LA36_0<=113)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalCS2ASDSL.g:2045:2: ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? )
                    {
                    // InternalCS2ASDSL.g:2045:2: ( () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )? )
                    // InternalCS2ASDSL.g:2045:3: () otherlv_2= 'all' (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )?
                    {
                    // InternalCS2ASDSL.g:2045:3: ()
                    // InternalCS2ASDSL.g:2046:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSelectionDefAccess().getSelectionAllAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSelectionDefAccess().getAllKeyword_1_0_1());
                          
                    }
                    // InternalCS2ASDSL.g:2058:1: (otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==53) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalCS2ASDSL.g:2058:3: otherlv_3= 'excepting' ( (lv_exceptionProperties_4_0= ruleExpCS ) ) (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )*
                            {
                            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getSelectionDefAccess().getExceptingKeyword_1_0_2_0());
                                  
                            }
                            // InternalCS2ASDSL.g:2062:1: ( (lv_exceptionProperties_4_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:2063:1: (lv_exceptionProperties_4_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:2063:1: (lv_exceptionProperties_4_0= ruleExpCS )
                            // InternalCS2ASDSL.g:2064:3: lv_exceptionProperties_4_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectionDefAccess().getExceptionPropertiesExpCSParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_exceptionProperties_4_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectionDefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"exceptionProperties",
                                      		lv_exceptionProperties_4_0, 
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalCS2ASDSL.g:2080:2: (otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==17) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalCS2ASDSL.g:2080:4: otherlv_5= ',' ( (lv_exceptionProperties_6_0= ruleExpCS ) )
                            	    {
                            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getSelectionDefAccess().getCommaKeyword_1_0_2_2_0());
                            	          
                            	    }
                            	    // InternalCS2ASDSL.g:2084:1: ( (lv_exceptionProperties_6_0= ruleExpCS ) )
                            	    // InternalCS2ASDSL.g:2085:1: (lv_exceptionProperties_6_0= ruleExpCS )
                            	    {
                            	    // InternalCS2ASDSL.g:2085:1: (lv_exceptionProperties_6_0= ruleExpCS )
                            	    // InternalCS2ASDSL.g:2086:3: lv_exceptionProperties_6_0= ruleExpCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSelectionDefAccess().getExceptionPropertiesExpCSParserRuleCall_1_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_7);
                            	    lv_exceptionProperties_6_0=ruleExpCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSelectionDefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"exceptionProperties",
                            	              		lv_exceptionProperties_6_0, 
                            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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


                    }


                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:2103:6: ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) )
                    {
                    // InternalCS2ASDSL.g:2103:6: ( () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* ) )
                    // InternalCS2ASDSL.g:2103:7: () ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* )
                    {
                    // InternalCS2ASDSL.g:2103:7: ()
                    // InternalCS2ASDSL.g:2104:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSelectionDefAccess().getSelectionSpecificAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalCS2ASDSL.g:2112:2: ( ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )* )
                    // InternalCS2ASDSL.g:2112:3: ( (lv_selectedProperties_8_0= ruleExpCS ) ) (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )*
                    {
                    // InternalCS2ASDSL.g:2112:3: ( (lv_selectedProperties_8_0= ruleExpCS ) )
                    // InternalCS2ASDSL.g:2113:1: (lv_selectedProperties_8_0= ruleExpCS )
                    {
                    // InternalCS2ASDSL.g:2113:1: (lv_selectedProperties_8_0= ruleExpCS )
                    // InternalCS2ASDSL.g:2114:3: lv_selectedProperties_8_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectionDefAccess().getSelectedPropertiesExpCSParserRuleCall_1_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_selectedProperties_8_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectionDefRule());
                      	        }
                             		add(
                             			current, 
                             			"selectedProperties",
                              		lv_selectedProperties_8_0, 
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:2130:2: (otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:2130:4: otherlv_9= ',' ( (lv_selectedProperties_10_0= ruleExpCS ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getSelectionDefAccess().getCommaKeyword_1_1_1_1_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:2134:1: ( (lv_selectedProperties_10_0= ruleExpCS ) )
                    	    // InternalCS2ASDSL.g:2135:1: (lv_selectedProperties_10_0= ruleExpCS )
                    	    {
                    	    // InternalCS2ASDSL.g:2135:1: (lv_selectedProperties_10_0= ruleExpCS )
                    	    // InternalCS2ASDSL.g:2136:3: lv_selectedProperties_10_0= ruleExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSelectionDefAccess().getSelectedPropertiesExpCSParserRuleCall_1_1_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_selectedProperties_10_0=ruleExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSelectionDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"selectedProperties",
                    	              		lv_selectedProperties_10_0, 
                    	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // $ANTLR end "ruleSelectionDef"


    // $ANTLR start "entryRuleProvisionDef"
    // InternalCS2ASDSL.g:2160:1: entryRuleProvisionDef returns [EObject current=null] : iv_ruleProvisionDef= ruleProvisionDef EOF ;
    public final EObject entryRuleProvisionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvisionDef = null;


        try {
            // InternalCS2ASDSL.g:2161:2: (iv_ruleProvisionDef= ruleProvisionDef EOF )
            // InternalCS2ASDSL.g:2162:2: iv_ruleProvisionDef= ruleProvisionDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvisionDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProvisionDef=ruleProvisionDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvisionDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvisionDef"


    // $ANTLR start "ruleProvisionDef"
    // InternalCS2ASDSL.g:2169:1: ruleProvisionDef returns [EObject current=null] : ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleContributionDef ) ) ( (lv_occludingDefs_3_0= ruleOccludingDef ) )* ) ;
    public final EObject ruleProvisionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_targetsDef_0_0 = null;

        EObject lv_contribution_2_0 = null;

        EObject lv_occludingDefs_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2172:28: ( ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleContributionDef ) ) ( (lv_occludingDefs_3_0= ruleOccludingDef ) )* ) )
            // InternalCS2ASDSL.g:2173:1: ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleContributionDef ) ) ( (lv_occludingDefs_3_0= ruleOccludingDef ) )* )
            {
            // InternalCS2ASDSL.g:2173:1: ( ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleContributionDef ) ) ( (lv_occludingDefs_3_0= ruleOccludingDef ) )* )
            // InternalCS2ASDSL.g:2173:2: ( (lv_targetsDef_0_0= ruleMultipleClassRef ) ) otherlv_1= 'using' ( (lv_contribution_2_0= ruleContributionDef ) ) ( (lv_occludingDefs_3_0= ruleOccludingDef ) )*
            {
            // InternalCS2ASDSL.g:2173:2: ( (lv_targetsDef_0_0= ruleMultipleClassRef ) )
            // InternalCS2ASDSL.g:2174:1: (lv_targetsDef_0_0= ruleMultipleClassRef )
            {
            // InternalCS2ASDSL.g:2174:1: (lv_targetsDef_0_0= ruleMultipleClassRef )
            // InternalCS2ASDSL.g:2175:3: lv_targetsDef_0_0= ruleMultipleClassRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProvisionDefAccess().getTargetsDefMultipleClassRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_targetsDef_0_0=ruleMultipleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProvisionDefRule());
              	        }
                     		set(
                     			current, 
                     			"targetsDef",
                      		lv_targetsDef_0_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.MultipleClassRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getProvisionDefAccess().getUsingKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:2195:1: ( (lv_contribution_2_0= ruleContributionDef ) )
            // InternalCS2ASDSL.g:2196:1: (lv_contribution_2_0= ruleContributionDef )
            {
            // InternalCS2ASDSL.g:2196:1: (lv_contribution_2_0= ruleContributionDef )
            // InternalCS2ASDSL.g:2197:3: lv_contribution_2_0= ruleContributionDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProvisionDefAccess().getContributionContributionDefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_contribution_2_0=ruleContributionDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProvisionDefRule());
              	        }
                     		set(
                     			current, 
                     			"contribution",
                      		lv_contribution_2_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ContributionDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:2213:2: ( (lv_occludingDefs_3_0= ruleOccludingDef ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==48) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCS2ASDSL.g:2214:1: (lv_occludingDefs_3_0= ruleOccludingDef )
            	    {
            	    // InternalCS2ASDSL.g:2214:1: (lv_occludingDefs_3_0= ruleOccludingDef )
            	    // InternalCS2ASDSL.g:2215:3: lv_occludingDefs_3_0= ruleOccludingDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProvisionDefAccess().getOccludingDefsOccludingDefParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
            	    lv_occludingDefs_3_0=ruleOccludingDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProvisionDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"occludingDefs",
            	              		lv_occludingDefs_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.OccludingDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleProvisionDef"


    // $ANTLR start "entryRuleClassRef"
    // InternalCS2ASDSL.g:2239:1: entryRuleClassRef returns [EObject current=null] : iv_ruleClassRef= ruleClassRef EOF ;
    public final EObject entryRuleClassRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassRef = null;


        try {
            // InternalCS2ASDSL.g:2240:2: (iv_ruleClassRef= ruleClassRef EOF )
            // InternalCS2ASDSL.g:2241:2: iv_ruleClassRef= ruleClassRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassRef=ruleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassRef"


    // $ANTLR start "ruleClassRef"
    // InternalCS2ASDSL.g:2248:1: ruleClassRef returns [EObject current=null] : ( (lv_className_0_0= rulePathNameCS ) ) ;
    public final EObject ruleClassRef() throws RecognitionException {
        EObject current = null;

        EObject lv_className_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2251:28: ( ( (lv_className_0_0= rulePathNameCS ) ) )
            // InternalCS2ASDSL.g:2252:1: ( (lv_className_0_0= rulePathNameCS ) )
            {
            // InternalCS2ASDSL.g:2252:1: ( (lv_className_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:2253:1: (lv_className_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:2253:1: (lv_className_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:2254:3: lv_className_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassRefAccess().getClassNamePathNameCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_className_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassRefRule());
              	        }
                     		set(
                     			current, 
                     			"className",
                      		lv_className_0_0, 
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
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
    // $ANTLR end "ruleClassRef"


    // $ANTLR start "entryRuleMultipleClassRef"
    // InternalCS2ASDSL.g:2278:1: entryRuleMultipleClassRef returns [EObject current=null] : iv_ruleMultipleClassRef= ruleMultipleClassRef EOF ;
    public final EObject entryRuleMultipleClassRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleClassRef = null;


        try {
            // InternalCS2ASDSL.g:2279:2: (iv_ruleMultipleClassRef= ruleMultipleClassRef EOF )
            // InternalCS2ASDSL.g:2280:2: iv_ruleMultipleClassRef= ruleMultipleClassRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultipleClassRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultipleClassRef=ruleMultipleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultipleClassRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleClassRef"


    // $ANTLR start "ruleMultipleClassRef"
    // InternalCS2ASDSL.g:2287:1: ruleMultipleClassRef returns [EObject current=null] : ( ( (lv_classNames_0_0= rulePathNameCS ) ) (otherlv_1= ',' ( (lv_classNames_2_0= rulePathNameCS ) ) )* ) ;
    public final EObject ruleMultipleClassRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_classNames_0_0 = null;

        EObject lv_classNames_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2290:28: ( ( ( (lv_classNames_0_0= rulePathNameCS ) ) (otherlv_1= ',' ( (lv_classNames_2_0= rulePathNameCS ) ) )* ) )
            // InternalCS2ASDSL.g:2291:1: ( ( (lv_classNames_0_0= rulePathNameCS ) ) (otherlv_1= ',' ( (lv_classNames_2_0= rulePathNameCS ) ) )* )
            {
            // InternalCS2ASDSL.g:2291:1: ( ( (lv_classNames_0_0= rulePathNameCS ) ) (otherlv_1= ',' ( (lv_classNames_2_0= rulePathNameCS ) ) )* )
            // InternalCS2ASDSL.g:2291:2: ( (lv_classNames_0_0= rulePathNameCS ) ) (otherlv_1= ',' ( (lv_classNames_2_0= rulePathNameCS ) ) )*
            {
            // InternalCS2ASDSL.g:2291:2: ( (lv_classNames_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:2292:1: (lv_classNames_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:2292:1: (lv_classNames_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:2293:3: lv_classNames_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultipleClassRefAccess().getClassNamesPathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            lv_classNames_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultipleClassRefRule());
              	        }
                     		add(
                     			current, 
                     			"classNames",
                      		lv_classNames_0_0, 
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:2309:2: (otherlv_1= ',' ( (lv_classNames_2_0= rulePathNameCS ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCS2ASDSL.g:2309:4: otherlv_1= ',' ( (lv_classNames_2_0= rulePathNameCS ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getMultipleClassRefAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:2313:1: ( (lv_classNames_2_0= rulePathNameCS ) )
            	    // InternalCS2ASDSL.g:2314:1: (lv_classNames_2_0= rulePathNameCS )
            	    {
            	    // InternalCS2ASDSL.g:2314:1: (lv_classNames_2_0= rulePathNameCS )
            	    // InternalCS2ASDSL.g:2315:3: lv_classNames_2_0= rulePathNameCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultipleClassRefAccess().getClassNamesPathNameCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_classNames_2_0=rulePathNameCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultipleClassRefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classNames",
            	              		lv_classNames_2_0, 
            	              		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
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
    // $ANTLR end "ruleMultipleClassRef"


    // $ANTLR start "entryRuleOccludingDef"
    // InternalCS2ASDSL.g:2339:1: entryRuleOccludingDef returns [EObject current=null] : iv_ruleOccludingDef= ruleOccludingDef EOF ;
    public final EObject entryRuleOccludingDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccludingDef = null;


        try {
            // InternalCS2ASDSL.g:2340:2: (iv_ruleOccludingDef= ruleOccludingDef EOF )
            // InternalCS2ASDSL.g:2341:2: iv_ruleOccludingDef= ruleOccludingDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOccludingDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOccludingDef=ruleOccludingDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOccludingDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccludingDef"


    // $ANTLR start "ruleOccludingDef"
    // InternalCS2ASDSL.g:2348:1: ruleOccludingDef returns [EObject current=null] : (otherlv_0= 'occluding' ( (lv_contribution_1_0= ruleContributionDef ) ) ) ;
    public final EObject ruleOccludingDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_contribution_1_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2351:28: ( (otherlv_0= 'occluding' ( (lv_contribution_1_0= ruleContributionDef ) ) ) )
            // InternalCS2ASDSL.g:2352:1: (otherlv_0= 'occluding' ( (lv_contribution_1_0= ruleContributionDef ) ) )
            {
            // InternalCS2ASDSL.g:2352:1: (otherlv_0= 'occluding' ( (lv_contribution_1_0= ruleContributionDef ) ) )
            // InternalCS2ASDSL.g:2352:3: otherlv_0= 'occluding' ( (lv_contribution_1_0= ruleContributionDef ) )
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOccludingDefAccess().getOccludingKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:2356:1: ( (lv_contribution_1_0= ruleContributionDef ) )
            // InternalCS2ASDSL.g:2357:1: (lv_contribution_1_0= ruleContributionDef )
            {
            // InternalCS2ASDSL.g:2357:1: (lv_contribution_1_0= ruleContributionDef )
            // InternalCS2ASDSL.g:2358:3: lv_contribution_1_0= ruleContributionDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOccludingDefAccess().getContributionContributionDefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_contribution_1_0=ruleContributionDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOccludingDefRule());
              	        }
                     		set(
                     			current, 
                     			"contribution",
                      		lv_contribution_1_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ContributionDef");
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
    // $ANTLR end "ruleOccludingDef"


    // $ANTLR start "entryRuleContributionDef"
    // InternalCS2ASDSL.g:2382:1: entryRuleContributionDef returns [EObject current=null] : iv_ruleContributionDef= ruleContributionDef EOF ;
    public final EObject entryRuleContributionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionDef = null;


        try {
            // InternalCS2ASDSL.g:2383:2: (iv_ruleContributionDef= ruleContributionDef EOF )
            // InternalCS2ASDSL.g:2384:2: iv_ruleContributionDef= ruleContributionDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContributionDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContributionDef=ruleContributionDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContributionDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContributionDef"


    // $ANTLR start "ruleContributionDef"
    // InternalCS2ASDSL.g:2391:1: ruleContributionDef returns [EObject current=null] : ( ( (lv_contributions_0_0= ruleElementsContribExp ) ) (otherlv_1= ',' ( (lv_contributions_2_0= ruleElementsContribExp ) ) )* ) ;
    public final EObject ruleContributionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_contributions_0_0 = null;

        EObject lv_contributions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2394:28: ( ( ( (lv_contributions_0_0= ruleElementsContribExp ) ) (otherlv_1= ',' ( (lv_contributions_2_0= ruleElementsContribExp ) ) )* ) )
            // InternalCS2ASDSL.g:2395:1: ( ( (lv_contributions_0_0= ruleElementsContribExp ) ) (otherlv_1= ',' ( (lv_contributions_2_0= ruleElementsContribExp ) ) )* )
            {
            // InternalCS2ASDSL.g:2395:1: ( ( (lv_contributions_0_0= ruleElementsContribExp ) ) (otherlv_1= ',' ( (lv_contributions_2_0= ruleElementsContribExp ) ) )* )
            // InternalCS2ASDSL.g:2395:2: ( (lv_contributions_0_0= ruleElementsContribExp ) ) (otherlv_1= ',' ( (lv_contributions_2_0= ruleElementsContribExp ) ) )*
            {
            // InternalCS2ASDSL.g:2395:2: ( (lv_contributions_0_0= ruleElementsContribExp ) )
            // InternalCS2ASDSL.g:2396:1: (lv_contributions_0_0= ruleElementsContribExp )
            {
            // InternalCS2ASDSL.g:2396:1: (lv_contributions_0_0= ruleElementsContribExp )
            // InternalCS2ASDSL.g:2397:3: lv_contributions_0_0= ruleElementsContribExp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContributionDefAccess().getContributionsElementsContribExpParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            lv_contributions_0_0=ruleElementsContribExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContributionDefRule());
              	        }
                     		add(
                     			current, 
                     			"contributions",
                      		lv_contributions_0_0, 
                      		"uk.ac.york.cs.cs2as.CS2ASDSL.ElementsContribExp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:2413:2: (otherlv_1= ',' ( (lv_contributions_2_0= ruleElementsContribExp ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==17) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCS2ASDSL.g:2413:4: otherlv_1= ',' ( (lv_contributions_2_0= ruleElementsContribExp ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getContributionDefAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:2417:1: ( (lv_contributions_2_0= ruleElementsContribExp ) )
            	    // InternalCS2ASDSL.g:2418:1: (lv_contributions_2_0= ruleElementsContribExp )
            	    {
            	    // InternalCS2ASDSL.g:2418:1: (lv_contributions_2_0= ruleElementsContribExp )
            	    // InternalCS2ASDSL.g:2419:3: lv_contributions_2_0= ruleElementsContribExp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContributionDefAccess().getContributionsElementsContribExpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_contributions_2_0=ruleElementsContribExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContributionDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contributions",
            	              		lv_contributions_2_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ElementsContribExp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleContributionDef"


    // $ANTLR start "entryRuleExportDef"
    // InternalCS2ASDSL.g:2443:1: entryRuleExportDef returns [EObject current=null] : iv_ruleExportDef= ruleExportDef EOF ;
    public final EObject entryRuleExportDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportDef = null;


        try {
            // InternalCS2ASDSL.g:2444:2: (iv_ruleExportDef= ruleExportDef EOF )
            // InternalCS2ASDSL.g:2445:2: iv_ruleExportDef= ruleExportDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExportDef=ruleExportDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExportDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExportDef"


    // $ANTLR start "ruleExportDef"
    // InternalCS2ASDSL.g:2452:1: ruleExportDef returns [EObject current=null] : ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'exported-scope' otherlv_3= 'provides' ( (lv_provisionDefs_4_0= ruleProvisionDef ) )+ ) ;
    public final EObject ruleExportDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_selectionDef_0_0 = null;

        EObject lv_provisionDefs_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2455:28: ( ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'exported-scope' otherlv_3= 'provides' ( (lv_provisionDefs_4_0= ruleProvisionDef ) )+ ) )
            // InternalCS2ASDSL.g:2456:1: ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'exported-scope' otherlv_3= 'provides' ( (lv_provisionDefs_4_0= ruleProvisionDef ) )+ )
            {
            // InternalCS2ASDSL.g:2456:1: ( ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'exported-scope' otherlv_3= 'provides' ( (lv_provisionDefs_4_0= ruleProvisionDef ) )+ )
            // InternalCS2ASDSL.g:2456:2: ( (lv_selectionDef_0_0= ruleSelectionDef ) )? otherlv_1= 'in' otherlv_2= 'exported-scope' otherlv_3= 'provides' ( (lv_provisionDefs_4_0= ruleProvisionDef ) )+
            {
            // InternalCS2ASDSL.g:2456:2: ( (lv_selectionDef_0_0= ruleSelectionDef ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCS2ASDSL.g:2457:1: (lv_selectionDef_0_0= ruleSelectionDef )
                    {
                    // InternalCS2ASDSL.g:2457:1: (lv_selectionDef_0_0= ruleSelectionDef )
                    // InternalCS2ASDSL.g:2458:3: lv_selectionDef_0_0= ruleSelectionDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExportDefAccess().getSelectionDefSelectionDefParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_selectionDef_0_0=ruleSelectionDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExportDefRule());
                      	        }
                             		set(
                             			current, 
                             			"selectionDef",
                              		lv_selectionDef_0_0, 
                              		"uk.ac.york.cs.cs2as.CS2ASDSL.SelectionDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExportDefAccess().getInKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExportDefAccess().getExportedScopeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExportDefAccess().getProvidesKeyword_3());
                  
            }
            // InternalCS2ASDSL.g:2486:1: ( (lv_provisionDefs_4_0= ruleProvisionDef ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_SIMPLE_ID && LA41_0<=RULE_ESCAPED_ID)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCS2ASDSL.g:2487:1: (lv_provisionDefs_4_0= ruleProvisionDef )
            	    {
            	    // InternalCS2ASDSL.g:2487:1: (lv_provisionDefs_4_0= ruleProvisionDef )
            	    // InternalCS2ASDSL.g:2488:3: lv_provisionDefs_4_0= ruleProvisionDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExportDefAccess().getProvisionDefsProvisionDefParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_provisionDefs_4_0=ruleProvisionDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExportDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"provisionDefs",
            	              		lv_provisionDefs_4_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ProvisionDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // $ANTLR end "ruleExportDef"


    // $ANTLR start "entryRuleHelpersSect"
    // InternalCS2ASDSL.g:2512:1: entryRuleHelpersSect returns [EObject current=null] : iv_ruleHelpersSect= ruleHelpersSect EOF ;
    public final EObject entryRuleHelpersSect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpersSect = null;


        try {
            // InternalCS2ASDSL.g:2513:2: (iv_ruleHelpersSect= ruleHelpersSect EOF )
            // InternalCS2ASDSL.g:2514:2: iv_ruleHelpersSect= ruleHelpersSect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHelpersSectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHelpersSect=ruleHelpersSect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHelpersSect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHelpersSect"


    // $ANTLR start "ruleHelpersSect"
    // InternalCS2ASDSL.g:2521:1: ruleHelpersSect returns [EObject current=null] : ( () otherlv_1= 'helpers' otherlv_2= '{' ( (lv_classHelpers_3_0= ruleClassHelper ) )* otherlv_4= '}' ) ;
    public final EObject ruleHelpersSect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_classHelpers_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2524:28: ( ( () otherlv_1= 'helpers' otherlv_2= '{' ( (lv_classHelpers_3_0= ruleClassHelper ) )* otherlv_4= '}' ) )
            // InternalCS2ASDSL.g:2525:1: ( () otherlv_1= 'helpers' otherlv_2= '{' ( (lv_classHelpers_3_0= ruleClassHelper ) )* otherlv_4= '}' )
            {
            // InternalCS2ASDSL.g:2525:1: ( () otherlv_1= 'helpers' otherlv_2= '{' ( (lv_classHelpers_3_0= ruleClassHelper ) )* otherlv_4= '}' )
            // InternalCS2ASDSL.g:2525:2: () otherlv_1= 'helpers' otherlv_2= '{' ( (lv_classHelpers_3_0= ruleClassHelper ) )* otherlv_4= '}'
            {
            // InternalCS2ASDSL.g:2525:2: ()
            // InternalCS2ASDSL.g:2526:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHelpersSectAccess().getHelpersSectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHelpersSectAccess().getHelpersKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHelpersSectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:2542:1: ( (lv_classHelpers_3_0= ruleClassHelper ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_SIMPLE_ID && LA42_0<=RULE_ESCAPED_ID)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCS2ASDSL.g:2543:1: (lv_classHelpers_3_0= ruleClassHelper )
            	    {
            	    // InternalCS2ASDSL.g:2543:1: (lv_classHelpers_3_0= ruleClassHelper )
            	    // InternalCS2ASDSL.g:2544:3: lv_classHelpers_3_0= ruleClassHelper
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHelpersSectAccess().getClassHelpersClassHelperParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_classHelpers_3_0=ruleClassHelper();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHelpersSectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classHelpers",
            	              		lv_classHelpers_3_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ClassHelper");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getHelpersSectAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleHelpersSect"


    // $ANTLR start "entryRuleClassHelper"
    // InternalCS2ASDSL.g:2572:1: entryRuleClassHelper returns [EObject current=null] : iv_ruleClassHelper= ruleClassHelper EOF ;
    public final EObject entryRuleClassHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassHelper = null;


        try {
            // InternalCS2ASDSL.g:2573:2: (iv_ruleClassHelper= ruleClassHelper EOF )
            // InternalCS2ASDSL.g:2574:2: iv_ruleClassHelper= ruleClassHelper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassHelperRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassHelper=ruleClassHelper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassHelper; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassHelper"


    // $ANTLR start "ruleClassHelper"
    // InternalCS2ASDSL.g:2581:1: ruleClassHelper returns [EObject current=null] : ( ( (lv_context_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_helpers_2_0= ruleHelperDef ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_context_0_0 = null;

        EObject lv_helpers_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2584:28: ( ( ( (lv_context_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_helpers_2_0= ruleHelperDef ) )* otherlv_3= '}' ) )
            // InternalCS2ASDSL.g:2585:1: ( ( (lv_context_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_helpers_2_0= ruleHelperDef ) )* otherlv_3= '}' )
            {
            // InternalCS2ASDSL.g:2585:1: ( ( (lv_context_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_helpers_2_0= ruleHelperDef ) )* otherlv_3= '}' )
            // InternalCS2ASDSL.g:2585:2: ( (lv_context_0_0= rulePathNameCS ) ) otherlv_1= '{' ( (lv_helpers_2_0= ruleHelperDef ) )* otherlv_3= '}'
            {
            // InternalCS2ASDSL.g:2585:2: ( (lv_context_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:2586:1: (lv_context_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:2586:1: (lv_context_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:2587:3: lv_context_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassHelperAccess().getContextPathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_context_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassHelperRule());
              	        }
                     		set(
                     			current, 
                     			"context",
                      		lv_context_0_0, 
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassHelperAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:2607:1: ( (lv_helpers_2_0= ruleHelperDef ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_SIMPLE_ID && LA43_0<=RULE_ESCAPED_ID)||LA43_0==55) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCS2ASDSL.g:2608:1: (lv_helpers_2_0= ruleHelperDef )
            	    {
            	    // InternalCS2ASDSL.g:2608:1: (lv_helpers_2_0= ruleHelperDef )
            	    // InternalCS2ASDSL.g:2609:3: lv_helpers_2_0= ruleHelperDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassHelperAccess().getHelpersHelperDefParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    lv_helpers_2_0=ruleHelperDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassHelperRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"helpers",
            	              		lv_helpers_2_0, 
            	              		"uk.ac.york.cs.cs2as.CS2ASDSL.HelperDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getClassHelperAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleClassHelper"


    // $ANTLR start "entryRuleHelperDef"
    // InternalCS2ASDSL.g:2637:1: entryRuleHelperDef returns [EObject current=null] : iv_ruleHelperDef= ruleHelperDef EOF ;
    public final EObject entryRuleHelperDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelperDef = null;


        try {
            // InternalCS2ASDSL.g:2638:2: (iv_ruleHelperDef= ruleHelperDef EOF )
            // InternalCS2ASDSL.g:2639:2: iv_ruleHelperDef= ruleHelperDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHelperDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHelperDef=ruleHelperDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHelperDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHelperDef"


    // $ANTLR start "ruleHelperDef"
    // InternalCS2ASDSL.g:2646:1: ruleHelperDef returns [EObject current=null] : ( ( (lv_ownedSignature_0_0= ruleTemplateSignatureCS ) )? ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )? otherlv_9= ':=' ( (lv_helperBody_10_0= ruleExpCS ) ) otherlv_11= ';' ) ;
    public final EObject ruleHelperDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_ownedSignature_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_ownedType_8_0 = null;

        EObject lv_helperBody_10_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2649:28: ( ( ( (lv_ownedSignature_0_0= ruleTemplateSignatureCS ) )? ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )? otherlv_9= ':=' ( (lv_helperBody_10_0= ruleExpCS ) ) otherlv_11= ';' ) )
            // InternalCS2ASDSL.g:2650:1: ( ( (lv_ownedSignature_0_0= ruleTemplateSignatureCS ) )? ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )? otherlv_9= ':=' ( (lv_helperBody_10_0= ruleExpCS ) ) otherlv_11= ';' )
            {
            // InternalCS2ASDSL.g:2650:1: ( ( (lv_ownedSignature_0_0= ruleTemplateSignatureCS ) )? ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )? otherlv_9= ':=' ( (lv_helperBody_10_0= ruleExpCS ) ) otherlv_11= ';' )
            // InternalCS2ASDSL.g:2650:2: ( (lv_ownedSignature_0_0= ruleTemplateSignatureCS ) )? ( (lv_name_1_0= ruleUnrestrictedName ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )? otherlv_9= ':=' ( (lv_helperBody_10_0= ruleExpCS ) ) otherlv_11= ';'
            {
            // InternalCS2ASDSL.g:2650:2: ( (lv_ownedSignature_0_0= ruleTemplateSignatureCS ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCS2ASDSL.g:2651:1: (lv_ownedSignature_0_0= ruleTemplateSignatureCS )
                    {
                    // InternalCS2ASDSL.g:2651:1: (lv_ownedSignature_0_0= ruleTemplateSignatureCS )
                    // InternalCS2ASDSL.g:2652:3: lv_ownedSignature_0_0= ruleTemplateSignatureCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHelperDefAccess().getOwnedSignatureTemplateSignatureCSParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_ownedSignature_0_0=ruleTemplateSignatureCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHelperDefRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedSignature",
                              		lv_ownedSignature_0_0, 
                              		"org.eclipse.ocl.xtext.base.Base.TemplateSignatureCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:2668:3: ( (lv_name_1_0= ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:2669:1: (lv_name_1_0= ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:2669:1: (lv_name_1_0= ruleUnrestrictedName )
            // InternalCS2ASDSL.g:2670:3: lv_name_1_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHelperDefAccess().getNameUnrestrictedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_name_1_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHelperDefRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHelperDefAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:2690:1: ( ( (lv_params_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_SIMPLE_ID && LA46_0<=RULE_ESCAPED_ID)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCS2ASDSL.g:2690:2: ( (lv_params_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )*
                    {
                    // InternalCS2ASDSL.g:2690:2: ( (lv_params_3_0= ruleParameterDef ) )
                    // InternalCS2ASDSL.g:2691:1: (lv_params_3_0= ruleParameterDef )
                    {
                    // InternalCS2ASDSL.g:2691:1: (lv_params_3_0= ruleParameterDef )
                    // InternalCS2ASDSL.g:2692:3: lv_params_3_0= ruleParameterDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHelperDefAccess().getParamsParameterDefParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
                    lv_params_3_0=ruleParameterDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHelperDefRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"uk.ac.york.cs.cs2as.CS2ASDSL.ParameterDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:2708:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==17) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:2708:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameterDef ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getHelperDefAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:2712:1: ( (lv_params_5_0= ruleParameterDef ) )
                    	    // InternalCS2ASDSL.g:2713:1: (lv_params_5_0= ruleParameterDef )
                    	    {
                    	    // InternalCS2ASDSL.g:2713:1: (lv_params_5_0= ruleParameterDef )
                    	    // InternalCS2ASDSL.g:2714:3: lv_params_5_0= ruleParameterDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getHelperDefAccess().getParamsParameterDefParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_51);
                    	    lv_params_5_0=ruleParameterDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getHelperDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"uk.ac.york.cs.cs2as.CS2ASDSL.ParameterDef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHelperDefAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalCS2ASDSL.g:2734:1: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCS2ASDSL.g:2734:3: otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getHelperDefAccess().getColonKeyword_5_0());
                          
                    }
                    // InternalCS2ASDSL.g:2738:1: ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:2739:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:2739:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:2740:3: lv_ownedType_8_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHelperDefAccess().getOwnedTypeTypeExpCSParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_ownedType_8_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHelperDefRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_8_0, 
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getHelperDefAccess().getColonEqualsSignKeyword_6());
                  
            }
            // InternalCS2ASDSL.g:2760:1: ( (lv_helperBody_10_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:2761:1: (lv_helperBody_10_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:2761:1: (lv_helperBody_10_0= ruleExpCS )
            // InternalCS2ASDSL.g:2762:3: lv_helperBody_10_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHelperDefAccess().getHelperBodyExpCSParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_helperBody_10_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHelperDefRule());
              	        }
                     		set(
                     			current, 
                     			"helperBody",
                      		lv_helperBody_10_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getHelperDefAccess().getSemicolonKeyword_8());
                  
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
    // $ANTLR end "ruleHelperDef"


    // $ANTLR start "entryRuleParameterDef"
    // InternalCS2ASDSL.g:2790:1: entryRuleParameterDef returns [EObject current=null] : iv_ruleParameterDef= ruleParameterDef EOF ;
    public final EObject entryRuleParameterDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDef = null;


        try {
            // InternalCS2ASDSL.g:2791:2: (iv_ruleParameterDef= ruleParameterDef EOF )
            // InternalCS2ASDSL.g:2792:2: iv_ruleParameterDef= ruleParameterDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameterDef=ruleParameterDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDef"


    // $ANTLR start "ruleParameterDef"
    // InternalCS2ASDSL.g:2799:1: ruleParameterDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleParameterDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2802:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalCS2ASDSL.g:2803:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalCS2ASDSL.g:2803:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalCS2ASDSL.g:2803:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalCS2ASDSL.g:2803:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:2804:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:2804:1: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCS2ASDSL.g:2805:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDefAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDefRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterDefAccess().getColonKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:2825:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalCS2ASDSL.g:2826:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalCS2ASDSL.g:2826:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalCS2ASDSL.g:2827:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDefAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDefRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_2_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
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
    // $ANTLR end "ruleParameterDef"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalCS2ASDSL.g:2851:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalCS2ASDSL.g:2852:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalCS2ASDSL.g:2853:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:2860:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_TraceExpCS_10= ruleTraceExpCS | this_LookupExpCS_11= ruleLookupExpCS ) ;
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

        EObject this_TraceExpCS_10 = null;

        EObject this_LookupExpCS_11 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:2863:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_TraceExpCS_10= ruleTraceExpCS | this_LookupExpCS_11= ruleLookupExpCS ) )
            // InternalCS2ASDSL.g:2864:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_TraceExpCS_10= ruleTraceExpCS | this_LookupExpCS_11= ruleLookupExpCS )
            {
            // InternalCS2ASDSL.g:2864:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_TraceExpCS_10= ruleTraceExpCS | this_LookupExpCS_11= ruleLookupExpCS )
            int alt48=12;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalCS2ASDSL.g:2865:2: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2878:2: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2891:2: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2904:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2917:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2930:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2943:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2956:2: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2969:2: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2982:2: this_NameExpCS_9= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:2995:2: this_TraceExpCS_10= ruleTraceExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTraceExpCSParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TraceExpCS_10=ruleTraceExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TraceExpCS_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalCS2ASDSL.g:3008:2: this_LookupExpCS_11= ruleLookupExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLookupExpCSParserRuleCall_11()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleTraceExpCS"
    // InternalCS2ASDSL.g:3027:1: entryRuleTraceExpCS returns [EObject current=null] : iv_ruleTraceExpCS= ruleTraceExpCS EOF ;
    public final EObject entryRuleTraceExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExpCS = null;


        try {
            // InternalCS2ASDSL.g:3028:2: (iv_ruleTraceExpCS= ruleTraceExpCS EOF )
            // InternalCS2ASDSL.g:3029:2: iv_ruleTraceExpCS= ruleTraceExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTraceExpCS=ruleTraceExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceExpCS"


    // $ANTLR start "ruleTraceExpCS"
    // InternalCS2ASDSL.g:3036:1: ruleTraceExpCS returns [EObject current=null] : ( () otherlv_1= 'trace' ) ;
    public final EObject ruleTraceExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3039:28: ( ( () otherlv_1= 'trace' ) )
            // InternalCS2ASDSL.g:3040:1: ( () otherlv_1= 'trace' )
            {
            // InternalCS2ASDSL.g:3040:1: ( () otherlv_1= 'trace' )
            // InternalCS2ASDSL.g:3040:2: () otherlv_1= 'trace'
            {
            // InternalCS2ASDSL.g:3040:2: ()
            // InternalCS2ASDSL.g:3041:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTraceExpCSAccess().getTraceExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceExpCSAccess().getTraceKeyword_1());
                  
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
    // $ANTLR end "ruleTraceExpCS"


    // $ANTLR start "entryRuleLookupExpCS"
    // InternalCS2ASDSL.g:3061:1: entryRuleLookupExpCS returns [EObject current=null] : iv_ruleLookupExpCS= ruleLookupExpCS EOF ;
    public final EObject entryRuleLookupExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupExpCS = null;


        try {
            // InternalCS2ASDSL.g:3062:2: (iv_ruleLookupExpCS= ruleLookupExpCS EOF )
            // InternalCS2ASDSL.g:3063:2: iv_ruleLookupExpCS= ruleLookupExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLookupExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLookupExpCS=ruleLookupExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLookupExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3070:1: ruleLookupExpCS returns [EObject current=null] : ( (otherlv_0= 'lookup' | ( (lv_fromExp_1_0= 'lookupFrom' ) ) ) otherlv_2= '(' ( (lv_args_3_0= ruleNavigatingArgExpCS ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleNavigatingArgExpCS ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleLookupExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fromExp_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3073:28: ( ( (otherlv_0= 'lookup' | ( (lv_fromExp_1_0= 'lookupFrom' ) ) ) otherlv_2= '(' ( (lv_args_3_0= ruleNavigatingArgExpCS ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleNavigatingArgExpCS ) ) )* otherlv_6= ')' ) )
            // InternalCS2ASDSL.g:3074:1: ( (otherlv_0= 'lookup' | ( (lv_fromExp_1_0= 'lookupFrom' ) ) ) otherlv_2= '(' ( (lv_args_3_0= ruleNavigatingArgExpCS ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleNavigatingArgExpCS ) ) )* otherlv_6= ')' )
            {
            // InternalCS2ASDSL.g:3074:1: ( (otherlv_0= 'lookup' | ( (lv_fromExp_1_0= 'lookupFrom' ) ) ) otherlv_2= '(' ( (lv_args_3_0= ruleNavigatingArgExpCS ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleNavigatingArgExpCS ) ) )* otherlv_6= ')' )
            // InternalCS2ASDSL.g:3074:2: (otherlv_0= 'lookup' | ( (lv_fromExp_1_0= 'lookupFrom' ) ) ) otherlv_2= '(' ( (lv_args_3_0= ruleNavigatingArgExpCS ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleNavigatingArgExpCS ) ) )* otherlv_6= ')'
            {
            // InternalCS2ASDSL.g:3074:2: (otherlv_0= 'lookup' | ( (lv_fromExp_1_0= 'lookupFrom' ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            else if ( (LA49_0==59) ) {
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
                    // InternalCS2ASDSL.g:3074:4: otherlv_0= 'lookup'
                    {
                    otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getLookupExpCSAccess().getLookupKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:3079:6: ( (lv_fromExp_1_0= 'lookupFrom' ) )
                    {
                    // InternalCS2ASDSL.g:3079:6: ( (lv_fromExp_1_0= 'lookupFrom' ) )
                    // InternalCS2ASDSL.g:3080:1: (lv_fromExp_1_0= 'lookupFrom' )
                    {
                    // InternalCS2ASDSL.g:3080:1: (lv_fromExp_1_0= 'lookupFrom' )
                    // InternalCS2ASDSL.g:3081:3: lv_fromExp_1_0= 'lookupFrom'
                    {
                    lv_fromExp_1_0=(Token)match(input,59,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_fromExp_1_0, grammarAccess.getLookupExpCSAccess().getFromExpLookupFromKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLookupExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "fromExp", true, "lookupFrom");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLookupExpCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:3098:1: ( (lv_args_3_0= ruleNavigatingArgExpCS ) )
            // InternalCS2ASDSL.g:3099:1: (lv_args_3_0= ruleNavigatingArgExpCS )
            {
            // InternalCS2ASDSL.g:3099:1: (lv_args_3_0= ruleNavigatingArgExpCS )
            // InternalCS2ASDSL.g:3100:3: lv_args_3_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLookupExpCSAccess().getArgsNavigatingArgExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_51);
            lv_args_3_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLookupExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"args",
                      		lv_args_3_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:3116:2: (otherlv_4= ',' ( (lv_args_5_0= ruleNavigatingArgExpCS ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==17) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCS2ASDSL.g:3116:4: otherlv_4= ',' ( (lv_args_5_0= ruleNavigatingArgExpCS ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getLookupExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:3120:1: ( (lv_args_5_0= ruleNavigatingArgExpCS ) )
            	    // InternalCS2ASDSL.g:3121:1: (lv_args_5_0= ruleNavigatingArgExpCS )
            	    {
            	    // InternalCS2ASDSL.g:3121:1: (lv_args_5_0= ruleNavigatingArgExpCS )
            	    // InternalCS2ASDSL.g:3122:3: lv_args_5_0= ruleNavigatingArgExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLookupExpCSAccess().getArgsNavigatingArgExpCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_args_5_0=ruleNavigatingArgExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLookupExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"args",
            	              		lv_args_5_0, 
            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLookupExpCSAccess().getRightParenthesisKeyword_4());
                  
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
    // InternalCS2ASDSL.g:3152:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalCS2ASDSL.g:3153:2: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalCS2ASDSL.g:3154:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3161:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3164:28: ( (kw= '-' | kw= 'not' ) )
            // InternalCS2ASDSL.g:3165:1: (kw= '-' | kw= 'not' )
            {
            // InternalCS2ASDSL.g:3165:1: (kw= '-' | kw= 'not' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            else if ( (LA51_0==61) ) {
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
                    // InternalCS2ASDSL.g:3166:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:3173:2: kw= 'not'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:3186:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalCS2ASDSL.g:3187:2: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalCS2ASDSL.g:3188:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3195:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3198:28: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalCS2ASDSL.g:3199:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalCS2ASDSL.g:3199:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt52=14;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt52=1;
                }
                break;
            case 63:
                {
                alt52=2;
                }
                break;
            case 64:
                {
                alt52=3;
                }
                break;
            case 60:
                {
                alt52=4;
                }
                break;
            case 65:
                {
                alt52=5;
                }
                break;
            case 66:
                {
                alt52=6;
                }
                break;
            case 67:
                {
                alt52=7;
                }
                break;
            case 68:
                {
                alt52=8;
                }
                break;
            case 69:
                {
                alt52=9;
                }
                break;
            case 70:
                {
                alt52=10;
                }
                break;
            case 45:
                {
                alt52=11;
                }
                break;
            case 71:
                {
                alt52=12;
                }
                break;
            case 72:
                {
                alt52=13;
                }
                break;
            case 73:
                {
                alt52=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalCS2ASDSL.g:3200:2: kw= '*'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:3207:2: kw= '/'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalCS2ASDSL.g:3214:2: kw= '+'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalCS2ASDSL.g:3221:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalCS2ASDSL.g:3228:2: kw= '>'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalCS2ASDSL.g:3235:2: kw= '<'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalCS2ASDSL.g:3242:2: kw= '>='
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalCS2ASDSL.g:3249:2: kw= '<='
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalCS2ASDSL.g:3256:2: kw= '='
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalCS2ASDSL.g:3263:2: kw= '<>'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalCS2ASDSL.g:3270:2: kw= 'and'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalCS2ASDSL.g:3277:2: kw= 'or'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // InternalCS2ASDSL.g:3284:2: kw= 'xor'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // InternalCS2ASDSL.g:3291:2: kw= 'implies'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:3304:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalCS2ASDSL.g:3305:2: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalCS2ASDSL.g:3306:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3313:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3316:28: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalCS2ASDSL.g:3317:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalCS2ASDSL.g:3317:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt53=1;
                }
                break;
            case 75:
                {
                alt53=2;
                }
                break;
            case 76:
                {
                alt53=3;
                }
                break;
            case 77:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalCS2ASDSL.g:3318:2: kw= '.'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:3325:2: kw= '->'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalCS2ASDSL.g:3332:2: kw= '?.'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalCS2ASDSL.g:3339:2: kw= '?->'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:3352:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalCS2ASDSL.g:3353:2: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalCS2ASDSL.g:3354:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3361:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3364:28: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // InternalCS2ASDSL.g:3365:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // InternalCS2ASDSL.g:3365:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45||LA54_0==60||(LA54_0>=62 && LA54_0<=73)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=74 && LA54_0<=77)) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalCS2ASDSL.g:3366:5: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:3378:5: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:3396:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // InternalCS2ASDSL.g:3397:2: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // InternalCS2ASDSL.g:3398:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3405:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3408:28: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // InternalCS2ASDSL.g:3410:5: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:3428:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // InternalCS2ASDSL.g:3429:2: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // InternalCS2ASDSL.g:3430:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3437:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3440:28: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // InternalCS2ASDSL.g:3442:5: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:3460:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalCS2ASDSL.g:3461:2: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalCS2ASDSL.g:3462:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3469:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3472:28: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalCS2ASDSL.g:3474:5: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:3492:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalCS2ASDSL.g:3493:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalCS2ASDSL.g:3494:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3501:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3504:28: (this_Identifier_0= ruleIdentifier )
            // InternalCS2ASDSL.g:3506:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:3524:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalCS2ASDSL.g:3525:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalCS2ASDSL.g:3526:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3533:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3536:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalCS2ASDSL.g:3538:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:3556:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalCS2ASDSL.g:3557:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalCS2ASDSL.g:3558:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3565:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3568:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // InternalCS2ASDSL.g:3569:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // InternalCS2ASDSL.g:3569:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt55=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt55=1;
                }
                break;
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt55=2;
                }
                break;
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt55=3;
                }
                break;
            case 78:
                {
                alt55=4;
                }
                break;
            case 79:
                {
                alt55=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalCS2ASDSL.g:3570:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:3582:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:3594:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:3606:2: kw= 'Map'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalCS2ASDSL.g:3613:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:3626:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalCS2ASDSL.g:3627:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalCS2ASDSL.g:3628:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3635:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3638:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalCS2ASDSL.g:3640:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:3658:1: entryRuleURIPathNameCS returns [EObject current=null] : iv_ruleURIPathNameCS= ruleURIPathNameCS EOF ;
    public final EObject entryRuleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIPathNameCS = null;


        try {
            // InternalCS2ASDSL.g:3659:2: (iv_ruleURIPathNameCS= ruleURIPathNameCS EOF )
            // InternalCS2ASDSL.g:3660:2: iv_ruleURIPathNameCS= ruleURIPathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURIPathNameCS=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIPathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3667:1: ruleURIPathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject ruleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3670:28: ( ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalCS2ASDSL.g:3671:1: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalCS2ASDSL.g:3671:1: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalCS2ASDSL.g:3671:2: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalCS2ASDSL.g:3671:2: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) )
            // InternalCS2ASDSL.g:3672:1: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            {
            // InternalCS2ASDSL.g:3672:1: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            // InternalCS2ASDSL.g:3673:3: lv_ownedPathElements_0_0= ruleURIFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsURIFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_54);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.URIFirstPathElementCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:3689:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==80) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCS2ASDSL.g:3689:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,80,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getURIPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:3693:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalCS2ASDSL.g:3694:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalCS2ASDSL.g:3694:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalCS2ASDSL.g:3695:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
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
            	              		"org.eclipse.ocl.xtext.base.Base.NextPathElementCS");
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
    // InternalCS2ASDSL.g:3719:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // InternalCS2ASDSL.g:3720:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // InternalCS2ASDSL.g:3721:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3728:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) | ( () ( (lv_uri_2_0= ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_uri_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3731:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) | ( () ( (lv_uri_2_0= ruleURI ) ) ) ) )
            // InternalCS2ASDSL.g:3732:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) | ( () ( (lv_uri_2_0= ruleURI ) ) ) )
            {
            // InternalCS2ASDSL.g:3732:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) | ( () ( (lv_uri_2_0= ruleURI ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_SIMPLE_ID && LA57_0<=RULE_ESCAPED_ID)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalCS2ASDSL.g:3732:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
                    {
                    // InternalCS2ASDSL.g:3732:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
                    // InternalCS2ASDSL.g:3733:1: (lv_name_0_0= ruleUnrestrictedName )
                    {
                    // InternalCS2ASDSL.g:3733:1: (lv_name_0_0= ruleUnrestrictedName )
                    // InternalCS2ASDSL.g:3734:3: lv_name_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_name_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:3751:6: ( () ( (lv_uri_2_0= ruleURI ) ) )
                    {
                    // InternalCS2ASDSL.g:3751:6: ( () ( (lv_uri_2_0= ruleURI ) ) )
                    // InternalCS2ASDSL.g:3751:7: () ( (lv_uri_2_0= ruleURI ) )
                    {
                    // InternalCS2ASDSL.g:3751:7: ()
                    // InternalCS2ASDSL.g:3752:2: 
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

                    // InternalCS2ASDSL.g:3760:2: ( (lv_uri_2_0= ruleURI ) )
                    // InternalCS2ASDSL.g:3761:1: (lv_uri_2_0= ruleURI )
                    {
                    // InternalCS2ASDSL.g:3761:1: (lv_uri_2_0= ruleURI )
                    // InternalCS2ASDSL.g:3762:3: lv_uri_2_0= ruleURI
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getUriURIParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_uri_2_0=ruleURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                             		set(
                             			current, 
                             			"uri",
                              		lv_uri_2_0, 
                              		"org.eclipse.ocl.xtext.base.Base.URI");
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
    // InternalCS2ASDSL.g:3786:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalCS2ASDSL.g:3787:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalCS2ASDSL.g:3788:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3795:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3798:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalCS2ASDSL.g:3799:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalCS2ASDSL.g:3799:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt58=8;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt58=1;
                }
                break;
            case 82:
                {
                alt58=2;
                }
                break;
            case 83:
                {
                alt58=3;
                }
                break;
            case 84:
                {
                alt58=4;
                }
                break;
            case 85:
                {
                alt58=5;
                }
                break;
            case 86:
                {
                alt58=6;
                }
                break;
            case 87:
                {
                alt58=7;
                }
                break;
            case 88:
                {
                alt58=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalCS2ASDSL.g:3800:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:3807:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalCS2ASDSL.g:3814:2: kw= 'Real'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalCS2ASDSL.g:3821:2: kw= 'String'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalCS2ASDSL.g:3828:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalCS2ASDSL.g:3835:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalCS2ASDSL.g:3842:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalCS2ASDSL.g:3849:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:3862:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalCS2ASDSL.g:3863:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalCS2ASDSL.g:3864:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3871:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3874:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalCS2ASDSL.g:3875:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalCS2ASDSL.g:3875:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalCS2ASDSL.g:3876:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalCS2ASDSL.g:3876:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalCS2ASDSL.g:3877:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrimitiveTypeIdentifier");
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
    // InternalCS2ASDSL.g:3901:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalCS2ASDSL.g:3902:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalCS2ASDSL.g:3903:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3910:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3913:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalCS2ASDSL.g:3914:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalCS2ASDSL.g:3914:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt59=5;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt59=1;
                }
                break;
            case 90:
                {
                alt59=2;
                }
                break;
            case 91:
                {
                alt59=3;
                }
                break;
            case 92:
                {
                alt59=4;
                }
                break;
            case 93:
                {
                alt59=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalCS2ASDSL.g:3915:2: kw= 'Set'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:3922:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalCS2ASDSL.g:3929:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalCS2ASDSL.g:3936:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalCS2ASDSL.g:3943:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:3956:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalCS2ASDSL.g:3957:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalCS2ASDSL.g:3958:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:3965:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:3968:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // InternalCS2ASDSL.g:3969:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // InternalCS2ASDSL.g:3969:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // InternalCS2ASDSL.g:3969:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // InternalCS2ASDSL.g:3969:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalCS2ASDSL.g:3970:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalCS2ASDSL.g:3970:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalCS2ASDSL.g:3971:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_55);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:3987:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==55) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCS2ASDSL.g:3987:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:3991:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:3992:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:3992:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:3993:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:4021:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalCS2ASDSL.g:4022:2: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalCS2ASDSL.g:4023:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4030:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
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
            // InternalCS2ASDSL.g:4033:28: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalCS2ASDSL.g:4034:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalCS2ASDSL.g:4034:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalCS2ASDSL.g:4034:2: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalCS2ASDSL.g:4034:2: ( (lv_name_0_0= 'Map' ) )
            // InternalCS2ASDSL.g:4035:1: (lv_name_0_0= 'Map' )
            {
            // InternalCS2ASDSL.g:4035:1: (lv_name_0_0= 'Map' )
            // InternalCS2ASDSL.g:4036:3: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,78,FollowSets000.FOLLOW_55); if (state.failed) return current;
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

            // InternalCS2ASDSL.g:4049:2: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==55) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCS2ASDSL.g:4049:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:4053:1: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:4054:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:4054:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:4055:3: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                          
                    }
                    // InternalCS2ASDSL.g:4075:1: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:4076:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:4076:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:4077:3: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:4105:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalCS2ASDSL.g:4106:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalCS2ASDSL.g:4107:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4114:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
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
            // InternalCS2ASDSL.g:4117:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalCS2ASDSL.g:4118:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalCS2ASDSL.g:4118:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalCS2ASDSL.g:4118:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalCS2ASDSL.g:4118:2: ( (lv_name_0_0= 'Tuple' ) )
            // InternalCS2ASDSL.g:4119:1: (lv_name_0_0= 'Tuple' )
            {
            // InternalCS2ASDSL.g:4119:1: (lv_name_0_0= 'Tuple' )
            // InternalCS2ASDSL.g:4120:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,79,FollowSets000.FOLLOW_55); if (state.failed) return current;
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

            // InternalCS2ASDSL.g:4133:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==55) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCS2ASDSL.g:4133:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:4137:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=RULE_SIMPLE_ID && LA63_0<=RULE_ESCAPED_ID)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalCS2ASDSL.g:4137:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalCS2ASDSL.g:4137:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalCS2ASDSL.g:4138:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalCS2ASDSL.g:4138:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalCS2ASDSL.g:4139:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_51);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalCS2ASDSL.g:4155:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==17) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // InternalCS2ASDSL.g:4155:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // InternalCS2ASDSL.g:4159:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalCS2ASDSL.g:4160:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalCS2ASDSL.g:4160:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalCS2ASDSL.g:4161:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_51);
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
                            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

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

                    }

                    otherlv_5=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:4189:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalCS2ASDSL.g:4190:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalCS2ASDSL.g:4191:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4198:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:4201:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalCS2ASDSL.g:4202:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalCS2ASDSL.g:4202:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalCS2ASDSL.g:4202:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalCS2ASDSL.g:4202:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:4203:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:4203:1: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCS2ASDSL.g:4204:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_8);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4224:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalCS2ASDSL.g:4225:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalCS2ASDSL.g:4225:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalCS2ASDSL.g:4226:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
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
    // InternalCS2ASDSL.g:4250:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:4251:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalCS2ASDSL.g:4252:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4259:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // InternalCS2ASDSL.g:4262:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalCS2ASDSL.g:4263:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalCS2ASDSL.g:4263:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalCS2ASDSL.g:4263:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalCS2ASDSL.g:4263:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalCS2ASDSL.g:4264:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalCS2ASDSL.g:4264:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalCS2ASDSL.g:4265:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4285:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_SIMPLE_ID && LA66_0<=RULE_SINGLE_QUOTED_STRING)||LA66_0==19||LA66_0==55||(LA66_0>=57 && LA66_0<=62)||(LA66_0>=78 && LA66_0<=79)||(LA66_0>=81 && LA66_0<=93)||LA66_0==96||(LA66_0>=98 && LA66_0<=101)||LA66_0==107||(LA66_0>=112 && LA66_0<=113)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCS2ASDSL.g:4285:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalCS2ASDSL.g:4285:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalCS2ASDSL.g:4286:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalCS2ASDSL.g:4286:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalCS2ASDSL.g:4287:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:4303:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==17) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:4303:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:4307:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalCS2ASDSL.g:4308:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalCS2ASDSL.g:4308:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalCS2ASDSL.g:4309:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_59);
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
                    	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:4337:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalCS2ASDSL.g:4338:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalCS2ASDSL.g:4339:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4346:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:4349:28: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalCS2ASDSL.g:4350:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalCS2ASDSL.g:4350:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt68=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 78:
            case 79:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 96:
            case 98:
            case 99:
            case 100:
            case 101:
            case 107:
            case 112:
            case 113:
                {
                alt68=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==19) ) {
                    alt68=2;
                }
                else if ( (LA68_2==EOF||LA68_2==17||(LA68_2>=22 && LA68_2<=23)||LA68_2==45||LA68_2==55||LA68_2==60||(LA68_2>=62 && LA68_2<=77)||LA68_2==80||LA68_2==94||LA68_2==102||LA68_2==104) ) {
                    alt68=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA68_3 = input.LA(2);

                if ( (LA68_3==EOF||LA68_3==17||(LA68_3>=22 && LA68_3<=23)||LA68_3==45||LA68_3==55||LA68_3==60||(LA68_3>=62 && LA68_3<=77)||LA68_3==80||LA68_3==94||LA68_3==102||LA68_3==104) ) {
                    alt68=1;
                }
                else if ( (LA68_3==19) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt68=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalCS2ASDSL.g:4350:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalCS2ASDSL.g:4350:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalCS2ASDSL.g:4350:3: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalCS2ASDSL.g:4350:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalCS2ASDSL.g:4351:1: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalCS2ASDSL.g:4351:1: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalCS2ASDSL.g:4352:3: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_61);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:4368:2: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==94) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalCS2ASDSL.g:4368:4: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,94,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                                  
                            }
                            // InternalCS2ASDSL.g:4372:1: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:4373:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:4373:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalCS2ASDSL.g:4374:3: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
                    // InternalCS2ASDSL.g:4391:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalCS2ASDSL.g:4391:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalCS2ASDSL.g:4392:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalCS2ASDSL.g:4392:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalCS2ASDSL.g:4393:3: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
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
    // InternalCS2ASDSL.g:4417:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalCS2ASDSL.g:4418:2: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalCS2ASDSL.g:4419:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4426:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
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
            // InternalCS2ASDSL.g:4429:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // InternalCS2ASDSL.g:4430:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // InternalCS2ASDSL.g:4430:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // InternalCS2ASDSL.g:4430:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // InternalCS2ASDSL.g:4430:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalCS2ASDSL.g:4431:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalCS2ASDSL.g:4431:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalCS2ASDSL.g:4432:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4452:1: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_SIMPLE_ID && LA70_0<=RULE_ESCAPED_ID)||LA70_0==19) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCS2ASDSL.g:4452:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // InternalCS2ASDSL.g:4452:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalCS2ASDSL.g:4453:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalCS2ASDSL.g:4453:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalCS2ASDSL.g:4454:3: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:4470:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==17) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:4470:4: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:4474:1: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalCS2ASDSL.g:4475:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalCS2ASDSL.g:4475:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalCS2ASDSL.g:4476:3: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_62);
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
                    	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    // InternalCS2ASDSL.g:4492:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // InternalCS2ASDSL.g:4492:6: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,95,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                          
                    }
                    // InternalCS2ASDSL.g:4496:1: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // InternalCS2ASDSL.g:4497:1: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // InternalCS2ASDSL.g:4497:1: (lv_restVariableName_6_0= ruleIdentifier )
                    // InternalCS2ASDSL.g:4498:3: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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
                              		"org.eclipse.ocl.xtext.base.Base.Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:4526:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalCS2ASDSL.g:4527:2: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalCS2ASDSL.g:4528:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4535:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:4538:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) )
            // InternalCS2ASDSL.g:4539:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            {
            // InternalCS2ASDSL.g:4539:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            // InternalCS2ASDSL.g:4539:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            {
            // InternalCS2ASDSL.g:4539:2: ( ( ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:4540:1: ( ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:4540:1: ( ruleUnrestrictedName )
            // InternalCS2ASDSL.g:4541:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_63);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4561:1: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            // InternalCS2ASDSL.g:4562:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            {
            // InternalCS2ASDSL.g:4562:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            // InternalCS2ASDSL.g:4563:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            {
            // InternalCS2ASDSL.g:4563:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            int alt71=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 78:
            case 79:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 96:
            case 98:
            case 99:
            case 100:
            case 101:
            case 107:
            case 112:
            case 113:
                {
                alt71=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA71_2 = input.LA(2);

                if ( (LA71_2==19) ) {
                    alt71=2;
                }
                else if ( (LA71_2==EOF||LA71_2==17||(LA71_2>=22 && LA71_2<=23)||LA71_2==45||LA71_2==55||LA71_2==60||(LA71_2>=62 && LA71_2<=77)||LA71_2==80||LA71_2==102||LA71_2==104) ) {
                    alt71=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA71_3 = input.LA(2);

                if ( (LA71_3==EOF||LA71_3==17||(LA71_3>=22 && LA71_3<=23)||LA71_3==45||LA71_3==55||LA71_3==60||(LA71_3>=62 && LA71_3<=77)||LA71_3==80||LA71_3==102||LA71_3==104) ) {
                    alt71=1;
                }
                else if ( (LA71_3==19) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt71=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalCS2ASDSL.g:4564:3: lv_ownedInitExpression_2_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:4579:8: lv_ownedInitExpression_2_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
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
    // InternalCS2ASDSL.g:4605:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalCS2ASDSL.g:4606:2: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalCS2ASDSL.g:4607:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4614:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:4617:28: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalCS2ASDSL.g:4618:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalCS2ASDSL.g:4618:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalCS2ASDSL.g:4618:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalCS2ASDSL.g:4618:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_SIMPLE_ID && LA72_0<=RULE_ESCAPED_ID)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalCS2ASDSL.g:4619:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalCS2ASDSL.g:4619:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalCS2ASDSL.g:4620:3: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4640:1: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalCS2ASDSL.g:4641:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalCS2ASDSL.g:4641:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalCS2ASDSL.g:4642:3: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
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
    // InternalCS2ASDSL.g:4666:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:4667:2: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalCS2ASDSL.g:4668:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4675:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:4678:28: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalCS2ASDSL.g:4679:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalCS2ASDSL.g:4679:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalCS2ASDSL.g:4679:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,96,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4687:1: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:4688:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:4688:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalCS2ASDSL.g:4689:3: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:4717:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:4718:2: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalCS2ASDSL.g:4719:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4726:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // InternalCS2ASDSL.g:4729:28: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalCS2ASDSL.g:4730:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalCS2ASDSL.g:4730:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalCS2ASDSL.g:4730:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalCS2ASDSL.g:4730:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalCS2ASDSL.g:4731:1: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalCS2ASDSL.g:4731:1: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalCS2ASDSL.g:4732:3: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4752:1: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_SIMPLE_ID && LA74_0<=RULE_SINGLE_QUOTED_STRING)||LA74_0==55||(LA74_0>=57 && LA74_0<=62)||(LA74_0>=78 && LA74_0<=79)||(LA74_0>=81 && LA74_0<=93)||LA74_0==96||(LA74_0>=98 && LA74_0<=101)||LA74_0==107||(LA74_0>=112 && LA74_0<=113)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCS2ASDSL.g:4752:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalCS2ASDSL.g:4752:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalCS2ASDSL.g:4753:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalCS2ASDSL.g:4753:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalCS2ASDSL.g:4754:3: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:4770:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==17) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:4770:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:4774:1: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalCS2ASDSL.g:4775:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalCS2ASDSL.g:4775:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalCS2ASDSL.g:4776:3: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_59);
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
                    	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:4804:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalCS2ASDSL.g:4805:2: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalCS2ASDSL.g:4806:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4813:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:4816:28: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:4817:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:4817:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:4817:2: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalCS2ASDSL.g:4817:2: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:4818:1: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:4818:1: (lv_ownedKey_0_0= ruleExpCS )
            // InternalCS2ASDSL.g:4819:3: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_65);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,97,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4839:1: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:4840:1: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:4840:1: (lv_ownedValue_2_0= ruleExpCS )
            // InternalCS2ASDSL.g:4841:3: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:4865:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:4866:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalCS2ASDSL.g:4867:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4874:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalCS2ASDSL.g:4877:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalCS2ASDSL.g:4878:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalCS2ASDSL.g:4878:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt75=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt75=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt75=2;
                }
                break;
            case 98:
            case 99:
                {
                alt75=3;
                }
                break;
            case 62:
                {
                alt75=4;
                }
                break;
            case 100:
                {
                alt75=5;
                }
                break;
            case 101:
                {
                alt75=6;
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
                    // InternalCS2ASDSL.g:4879:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:4892:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:4905:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:4918:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:4931:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:4944:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:4963:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:4964:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalCS2ASDSL.g:4965:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:4972:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalCS2ASDSL.g:4975:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalCS2ASDSL.g:4976:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalCS2ASDSL.g:4976:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalCS2ASDSL.g:4976:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,79,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:4984:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalCS2ASDSL.g:4985:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalCS2ASDSL.g:4985:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalCS2ASDSL.g:4986:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:5002:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==17) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalCS2ASDSL.g:5002:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:5006:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalCS2ASDSL.g:5007:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalCS2ASDSL.g:5007:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalCS2ASDSL.g:5008:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
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
            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:5036:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalCS2ASDSL.g:5037:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalCS2ASDSL.g:5038:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5045:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5048:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:5049:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:5049:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:5049:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalCS2ASDSL.g:5049:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:5050:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:5050:1: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCS2ASDSL.g:5051:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_66);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:5067:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==19) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCS2ASDSL.g:5067:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:5071:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:5072:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:5072:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:5073:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,69,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:5093:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:5094:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:5094:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalCS2ASDSL.g:5095:3: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:5119:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:5120:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalCS2ASDSL.g:5121:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5128:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5131:28: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalCS2ASDSL.g:5132:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalCS2ASDSL.g:5132:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // InternalCS2ASDSL.g:5133:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // InternalCS2ASDSL.g:5133:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // InternalCS2ASDSL.g:5134:3: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.base.Base.NUMBER_LITERAL");
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
    // InternalCS2ASDSL.g:5158:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:5159:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalCS2ASDSL.g:5160:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5167:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5170:28: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalCS2ASDSL.g:5171:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalCS2ASDSL.g:5171:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalCS2ASDSL.g:5172:1: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalCS2ASDSL.g:5172:1: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalCS2ASDSL.g:5173:3: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_67);
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
            	              		"org.eclipse.ocl.xtext.base.Base.StringLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
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
    // InternalCS2ASDSL.g:5197:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:5198:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalCS2ASDSL.g:5199:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5206:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5209:28: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalCS2ASDSL.g:5210:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalCS2ASDSL.g:5210:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==98) ) {
                alt79=1;
            }
            else if ( (LA79_0==99) ) {
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
                    // InternalCS2ASDSL.g:5210:2: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalCS2ASDSL.g:5210:2: ( (lv_symbol_0_0= 'true' ) )
                    // InternalCS2ASDSL.g:5211:1: (lv_symbol_0_0= 'true' )
                    {
                    // InternalCS2ASDSL.g:5211:1: (lv_symbol_0_0= 'true' )
                    // InternalCS2ASDSL.g:5212:3: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalCS2ASDSL.g:5226:6: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalCS2ASDSL.g:5226:6: ( (lv_symbol_1_0= 'false' ) )
                    // InternalCS2ASDSL.g:5227:1: (lv_symbol_1_0= 'false' )
                    {
                    // InternalCS2ASDSL.g:5227:1: (lv_symbol_1_0= 'false' )
                    // InternalCS2ASDSL.g:5228:3: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:5249:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:5250:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalCS2ASDSL.g:5251:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5258:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5261:28: ( ( () otherlv_1= '*' ) )
            // InternalCS2ASDSL.g:5262:1: ( () otherlv_1= '*' )
            {
            // InternalCS2ASDSL.g:5262:1: ( () otherlv_1= '*' )
            // InternalCS2ASDSL.g:5262:2: () otherlv_1= '*'
            {
            // InternalCS2ASDSL.g:5262:2: ()
            // InternalCS2ASDSL.g:5263:2: 
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

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:5283:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:5284:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalCS2ASDSL.g:5285:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5292:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5295:28: ( ( () otherlv_1= 'invalid' ) )
            // InternalCS2ASDSL.g:5296:1: ( () otherlv_1= 'invalid' )
            {
            // InternalCS2ASDSL.g:5296:1: ( () otherlv_1= 'invalid' )
            // InternalCS2ASDSL.g:5296:2: () otherlv_1= 'invalid'
            {
            // InternalCS2ASDSL.g:5296:2: ()
            // InternalCS2ASDSL.g:5297:2: 
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

            otherlv_1=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:5317:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:5318:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalCS2ASDSL.g:5319:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5326:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5329:28: ( ( () otherlv_1= 'null' ) )
            // InternalCS2ASDSL.g:5330:1: ( () otherlv_1= 'null' )
            {
            // InternalCS2ASDSL.g:5330:1: ( () otherlv_1= 'null' )
            // InternalCS2ASDSL.g:5330:2: () otherlv_1= 'null'
            {
            // InternalCS2ASDSL.g:5330:2: ()
            // InternalCS2ASDSL.g:5331:2: 
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

            otherlv_1=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:5351:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalCS2ASDSL.g:5352:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalCS2ASDSL.g:5353:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5360:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5363:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalCS2ASDSL.g:5364:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalCS2ASDSL.g:5364:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt80=4;
            switch ( input.LA(1) ) {
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt80=1;
                }
                break;
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt80=2;
                }
                break;
            case 78:
                {
                alt80=3;
                }
                break;
            case 79:
                {
                alt80=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalCS2ASDSL.g:5365:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:5378:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:5391:2: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:5404:2: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:5423:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalCS2ASDSL.g:5424:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalCS2ASDSL.g:5425:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5432:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5435:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalCS2ASDSL.g:5436:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalCS2ASDSL.g:5436:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalCS2ASDSL.g:5437:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_68);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalCS2ASDSL.g:5448:1: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==104) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalCS2ASDSL.g:5449:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalCS2ASDSL.g:5449:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalCS2ASDSL.g:5450:3: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
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
    // InternalCS2ASDSL.g:5474:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalCS2ASDSL.g:5475:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalCS2ASDSL.g:5476:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5483:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5486:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalCS2ASDSL.g:5487:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalCS2ASDSL.g:5487:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalCS2ASDSL.g:5488:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalCS2ASDSL.g:5488:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalCS2ASDSL.g:5489:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeLiteralWithMultiplicityCS");
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
    // InternalCS2ASDSL.g:5513:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalCS2ASDSL.g:5514:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalCS2ASDSL.g:5515:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5522:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5525:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalCS2ASDSL.g:5526:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalCS2ASDSL.g:5526:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalCS2ASDSL.g:5526:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalCS2ASDSL.g:5526:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:5527:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:5527:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:5528:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_69);
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
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:5544:2: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==22) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalCS2ASDSL.g:5544:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalCS2ASDSL.g:5544:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalCS2ASDSL.g:5545:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalCS2ASDSL.g:5545:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalCS2ASDSL.g:5546:3: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:5562:2: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==22) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalCS2ASDSL.g:5562:4: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                                  
                            }
                            // InternalCS2ASDSL.g:5566:1: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:5567:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:5567:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalCS2ASDSL.g:5568:3: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_25);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:5596:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalCS2ASDSL.g:5597:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalCS2ASDSL.g:5598:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5605:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5608:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // InternalCS2ASDSL.g:5609:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // InternalCS2ASDSL.g:5609:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // InternalCS2ASDSL.g:5609:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // InternalCS2ASDSL.g:5609:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt84=3;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // InternalCS2ASDSL.g:5610:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
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
                    // InternalCS2ASDSL.g:5623:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
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
                    // InternalCS2ASDSL.g:5636:2: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getCollectionPatternCSParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
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

            // InternalCS2ASDSL.g:5647:2: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==104) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalCS2ASDSL.g:5648:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // InternalCS2ASDSL.g:5648:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // InternalCS2ASDSL.g:5649:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
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
    // InternalCS2ASDSL.g:5673:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalCS2ASDSL.g:5674:2: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalCS2ASDSL.g:5675:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5682:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5685:28: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalCS2ASDSL.g:5686:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalCS2ASDSL.g:5686:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // InternalCS2ASDSL.g:5686:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalCS2ASDSL.g:5686:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalCS2ASDSL.g:5687:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_70);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedPrimaryExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalCS2ASDSL.g:5698:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==45||LA86_0==60||(LA86_0>=62 && LA86_0<=77)) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalCS2ASDSL.g:5698:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalCS2ASDSL.g:5698:2: ()
                            // InternalCS2ASDSL.g:5699:2: 
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

                            // InternalCS2ASDSL.g:5707:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // InternalCS2ASDSL.g:5708:1: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // InternalCS2ASDSL.g:5708:1: (lv_name_2_0= ruleBinaryOperatorName )
                            // InternalCS2ASDSL.g:5709:3: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_19);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.BinaryOperatorName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalCS2ASDSL.g:5725:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:5726:1: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:5726:1: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalCS2ASDSL.g:5727:3: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
                    // InternalCS2ASDSL.g:5745:2: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:5764:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalCS2ASDSL.g:5765:2: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalCS2ASDSL.g:5766:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5773:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5776:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalCS2ASDSL.g:5777:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalCS2ASDSL.g:5777:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=60 && LA88_0<=61)) ) {
                alt88=1;
            }
            else if ( (LA88_0==112) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalCS2ASDSL.g:5777:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalCS2ASDSL.g:5777:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalCS2ASDSL.g:5777:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalCS2ASDSL.g:5777:3: ()
                    // InternalCS2ASDSL.g:5778:2: 
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

                    // InternalCS2ASDSL.g:5786:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalCS2ASDSL.g:5787:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalCS2ASDSL.g:5787:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalCS2ASDSL.g:5788:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:5804:2: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalCS2ASDSL.g:5805:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalCS2ASDSL.g:5805:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalCS2ASDSL.g:5806:3: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedLetExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:5824:2: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:5843:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalCS2ASDSL.g:5844:2: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalCS2ASDSL.g:5845:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5852:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:5855:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalCS2ASDSL.g:5856:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalCS2ASDSL.g:5856:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=60 && LA89_0<=61)) ) {
                alt89=1;
            }
            else if ( ((LA89_0>=RULE_SIMPLE_ID && LA89_0<=RULE_SINGLE_QUOTED_STRING)||LA89_0==55||(LA89_0>=57 && LA89_0<=59)||LA89_0==62||(LA89_0>=78 && LA89_0<=79)||(LA89_0>=81 && LA89_0<=93)||LA89_0==96||(LA89_0>=98 && LA89_0<=101)||LA89_0==107||LA89_0==113) ) {
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
                    // InternalCS2ASDSL.g:5856:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalCS2ASDSL.g:5856:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalCS2ASDSL.g:5856:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalCS2ASDSL.g:5856:3: ()
                    // InternalCS2ASDSL.g:5857:2: 
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

                    // InternalCS2ASDSL.g:5865:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalCS2ASDSL.g:5866:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalCS2ASDSL.g:5866:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalCS2ASDSL.g:5867:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:5883:2: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalCS2ASDSL.g:5884:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalCS2ASDSL.g:5884:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalCS2ASDSL.g:5885:3: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedPrimaryExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:5903:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:5922:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalCS2ASDSL.g:5923:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalCS2ASDSL.g:5924:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:5931:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
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
            // InternalCS2ASDSL.g:5934:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // InternalCS2ASDSL.g:5935:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // InternalCS2ASDSL.g:5935:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // InternalCS2ASDSL.g:5935:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // InternalCS2ASDSL.g:5935:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:5936:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:5936:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:5937:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_72);
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
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:5953:2: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==104) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalCS2ASDSL.g:5954:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalCS2ASDSL.g:5954:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalCS2ASDSL.g:5955:3: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
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
            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.SquareBracketedClauseCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // InternalCS2ASDSL.g:5971:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==55) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalCS2ASDSL.g:5972:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalCS2ASDSL.g:5972:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalCS2ASDSL.g:5973:3: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:5989:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==22) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalCS2ASDSL.g:5990:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalCS2ASDSL.g:5990:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalCS2ASDSL.g:5991:3: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:6007:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==102) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalCS2ASDSL.g:6007:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // InternalCS2ASDSL.g:6007:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalCS2ASDSL.g:6008:1: (lv_isPre_4_0= '@' )
                    {
                    // InternalCS2ASDSL.g:6008:1: (lv_isPre_4_0= '@' )
                    // InternalCS2ASDSL.g:6009:3: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,102,FollowSets000.FOLLOW_75); if (state.failed) return current;
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

                    otherlv_5=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:6034:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalCS2ASDSL.g:6035:2: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalCS2ASDSL.g:6036:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6043:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) ;
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
            // InternalCS2ASDSL.g:6046:28: ( ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) )
            // InternalCS2ASDSL.g:6047:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            {
            // InternalCS2ASDSL.g:6047:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            // InternalCS2ASDSL.g:6047:2: () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}'
            {
            // InternalCS2ASDSL.g:6047:2: ()
            // InternalCS2ASDSL.g:6048:2: 
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

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:6060:1: ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_SIMPLE_ID && LA96_0<=RULE_ESCAPED_ID)||LA96_0==23) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalCS2ASDSL.g:6060:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    {
                    // InternalCS2ASDSL.g:6060:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( ((LA95_0>=RULE_SIMPLE_ID && LA95_0<=RULE_ESCAPED_ID)) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalCS2ASDSL.g:6060:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            {
                            // InternalCS2ASDSL.g:6060:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                            // InternalCS2ASDSL.g:6061:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            {
                            // InternalCS2ASDSL.g:6061:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            // InternalCS2ASDSL.g:6062:3: lv_ownedParts_2_0= ruleShadowPartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_59);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalCS2ASDSL.g:6078:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==17) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // InternalCS2ASDSL.g:6078:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_0_1_0());
                            	          
                            	    }
                            	    // InternalCS2ASDSL.g:6082:1: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    // InternalCS2ASDSL.g:6083:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    {
                            	    // InternalCS2ASDSL.g:6083:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    // InternalCS2ASDSL.g:6084:3: lv_ownedParts_4_0= ruleShadowPartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_59);
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
                            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:6101:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    {
                    // InternalCS2ASDSL.g:6101:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    // InternalCS2ASDSL.g:6102:1: (lv_value_5_0= ruleStringLiteral )
                    {
                    // InternalCS2ASDSL.g:6102:1: (lv_value_5_0= ruleStringLiteral )
                    // InternalCS2ASDSL.g:6103:3: lv_value_5_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getValueStringLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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
                              		"org.eclipse.ocl.xtext.base.Base.StringLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:6131:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalCS2ASDSL.g:6132:2: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalCS2ASDSL.g:6133:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6140:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) ;
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
            // InternalCS2ASDSL.g:6143:28: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) )
            // InternalCS2ASDSL.g:6144:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            {
            // InternalCS2ASDSL.g:6144:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            // InternalCS2ASDSL.g:6144:2: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')'
            {
            // InternalCS2ASDSL.g:6144:2: ()
            // InternalCS2ASDSL.g:6145:2: 
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

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:6157:1: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=RULE_SIMPLE_ID && LA102_0<=RULE_SINGLE_QUOTED_STRING)||LA102_0==19||LA102_0==55||(LA102_0>=57 && LA102_0<=62)||(LA102_0>=78 && LA102_0<=79)||(LA102_0>=81 && LA102_0<=93)||LA102_0==96||(LA102_0>=98 && LA102_0<=101)||LA102_0==107||(LA102_0>=112 && LA102_0<=113)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalCS2ASDSL.g:6157:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    {
                    // InternalCS2ASDSL.g:6157:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalCS2ASDSL.g:6158:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalCS2ASDSL.g:6158:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalCS2ASDSL.g:6159:3: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_78);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:6175:2: ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==17) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:6176:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    {
                    	    // InternalCS2ASDSL.g:6176:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    // InternalCS2ASDSL.g:6177:3: lv_ownedArguments_3_0= ruleNavigatingCommaArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_78);
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
                    	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingCommaArgCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    // InternalCS2ASDSL.g:6193:3: ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==27) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalCS2ASDSL.g:6193:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            {
                            // InternalCS2ASDSL.g:6193:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) )
                            // InternalCS2ASDSL.g:6194:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            {
                            // InternalCS2ASDSL.g:6194:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            // InternalCS2ASDSL.g:6195:3: lv_ownedArguments_4_0= ruleNavigatingSemiArgCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_79);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingSemiArgCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalCS2ASDSL.g:6211:2: ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            loop98:
                            do {
                                int alt98=2;
                                int LA98_0 = input.LA(1);

                                if ( (LA98_0==17) ) {
                                    alt98=1;
                                }


                                switch (alt98) {
                            	case 1 :
                            	    // InternalCS2ASDSL.g:6212:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // InternalCS2ASDSL.g:6212:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    // InternalCS2ASDSL.g:6213:3: lv_ownedArguments_5_0= ruleNavigatingCommaArgCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_79);
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
                            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingCommaArgCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop98;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalCS2ASDSL.g:6229:5: ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==106) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:6229:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    {
                    	    // InternalCS2ASDSL.g:6229:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) )
                    	    // InternalCS2ASDSL.g:6230:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalCS2ASDSL.g:6230:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    // InternalCS2ASDSL.g:6231:3: lv_ownedArguments_6_0= ruleNavigatingBarArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_79);
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
                    	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingBarArgCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalCS2ASDSL.g:6247:2: ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    loop100:
                    	    do {
                    	        int alt100=2;
                    	        int LA100_0 = input.LA(1);

                    	        if ( (LA100_0==17) ) {
                    	            alt100=1;
                    	        }


                    	        switch (alt100) {
                    	    	case 1 :
                    	    	    // InternalCS2ASDSL.g:6248:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    {
                    	    	    // InternalCS2ASDSL.g:6248:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    // InternalCS2ASDSL.g:6249:3: lv_ownedArguments_7_0= ruleNavigatingCommaArgCS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_3_1_0()); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FollowSets000.FOLLOW_79);
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
                    	    	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingCommaArgCS");
                    	    	      	        afterParserOrEnumRuleCall();
                    	    	      	    
                    	    	    }

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop100;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:6277:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalCS2ASDSL.g:6278:2: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalCS2ASDSL.g:6279:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6286:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:6289:28: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalCS2ASDSL.g:6290:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalCS2ASDSL.g:6290:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalCS2ASDSL.g:6290:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,104,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:6294:1: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:6295:1: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:6295:1: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalCS2ASDSL.g:6296:3: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_80);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:6312:2: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==17) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalCS2ASDSL.g:6312:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:6316:1: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalCS2ASDSL.g:6317:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalCS2ASDSL.g:6317:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalCS2ASDSL.g:6318:3: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_80);
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
            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            otherlv_4=(Token)match(input,105,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:6346:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalCS2ASDSL.g:6347:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalCS2ASDSL.g:6348:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6355:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) ;
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
            // InternalCS2ASDSL.g:6358:28: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) )
            // InternalCS2ASDSL.g:6359:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            {
            // InternalCS2ASDSL.g:6359:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_SIMPLE_ID && LA106_0<=RULE_SINGLE_QUOTED_STRING)||LA106_0==55||(LA106_0>=57 && LA106_0<=62)||(LA106_0>=78 && LA106_0<=79)||(LA106_0>=81 && LA106_0<=93)||LA106_0==96||(LA106_0>=98 && LA106_0<=101)||LA106_0==107||(LA106_0>=112 && LA106_0<=113)) ) {
                alt106=1;
            }
            else if ( (LA106_0==19) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalCS2ASDSL.g:6359:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalCS2ASDSL.g:6359:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    // InternalCS2ASDSL.g:6359:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    {
                    // InternalCS2ASDSL.g:6359:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalCS2ASDSL.g:6360:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalCS2ASDSL.g:6360:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalCS2ASDSL.g:6361:3: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_81);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:6377:2: ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    int alt105=3;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==19) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==43) ) {
                        alt105=2;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalCS2ASDSL.g:6377:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalCS2ASDSL.g:6377:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalCS2ASDSL.g:6377:5: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_0_0());
                                  
                            }
                            // InternalCS2ASDSL.g:6381:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                            // InternalCS2ASDSL.g:6382:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            {
                            // InternalCS2ASDSL.g:6382:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            // InternalCS2ASDSL.g:6383:3: lv_ownedType_2_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_82);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalCS2ASDSL.g:6399:2: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt104=2;
                            int LA104_0 = input.LA(1);

                            if ( (LA104_0==69) ) {
                                alt104=1;
                            }
                            switch (alt104) {
                                case 1 :
                                    // InternalCS2ASDSL.g:6399:4: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,69,FollowSets000.FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                          
                                    }
                                    // InternalCS2ASDSL.g:6403:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalCS2ASDSL.g:6404:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalCS2ASDSL.g:6404:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalCS2ASDSL.g:6405:3: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
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
                                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
                            // InternalCS2ASDSL.g:6422:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            {
                            // InternalCS2ASDSL.g:6422:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            // InternalCS2ASDSL.g:6422:8: otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            {
                            otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_1_0());
                                  
                            }
                            // InternalCS2ASDSL.g:6426:1: ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:6427:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:6427:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            // InternalCS2ASDSL.g:6428:3: lv_ownedInitExpression_6_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
                    // InternalCS2ASDSL.g:6445:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    {
                    // InternalCS2ASDSL.g:6445:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    // InternalCS2ASDSL.g:6445:8: otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:6449:1: ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:6450:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:6450:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:6451:3: lv_ownedType_8_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
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
    // InternalCS2ASDSL.g:6475:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalCS2ASDSL.g:6476:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalCS2ASDSL.g:6477:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6484:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // InternalCS2ASDSL.g:6487:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalCS2ASDSL.g:6488:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalCS2ASDSL.g:6488:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalCS2ASDSL.g:6488:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalCS2ASDSL.g:6488:2: ( (lv_prefix_0_0= '|' ) )
            // InternalCS2ASDSL.g:6489:1: (lv_prefix_0_0= '|' )
            {
            // InternalCS2ASDSL.g:6489:1: (lv_prefix_0_0= '|' )
            // InternalCS2ASDSL.g:6490:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,106,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            // InternalCS2ASDSL.g:6503:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalCS2ASDSL.g:6504:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalCS2ASDSL.g:6504:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalCS2ASDSL.g:6505:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_83);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:6521:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==19) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalCS2ASDSL.g:6521:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // InternalCS2ASDSL.g:6525:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:6526:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:6526:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:6527:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_82);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:6543:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==69) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalCS2ASDSL.g:6543:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,69,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // InternalCS2ASDSL.g:6547:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:6548:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:6548:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalCS2ASDSL.g:6549:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:6573:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalCS2ASDSL.g:6574:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalCS2ASDSL.g:6575:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6582:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) ;
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
            // InternalCS2ASDSL.g:6585:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) )
            // InternalCS2ASDSL.g:6586:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            {
            // InternalCS2ASDSL.g:6586:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            // InternalCS2ASDSL.g:6586:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            {
            // InternalCS2ASDSL.g:6586:2: ( (lv_prefix_0_0= ',' ) )
            // InternalCS2ASDSL.g:6587:1: (lv_prefix_0_0= ',' )
            {
            // InternalCS2ASDSL.g:6587:1: (lv_prefix_0_0= ',' )
            // InternalCS2ASDSL.g:6588:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            // InternalCS2ASDSL.g:6601:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalCS2ASDSL.g:6602:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalCS2ASDSL.g:6602:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalCS2ASDSL.g:6603:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_81);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:6619:2: ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            int alt110=3;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==19) ) {
                alt110=1;
            }
            else if ( (LA110_0==43) ) {
                alt110=2;
            }
            switch (alt110) {
                case 1 :
                    // InternalCS2ASDSL.g:6619:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalCS2ASDSL.g:6619:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalCS2ASDSL.g:6619:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0_0());
                          
                    }
                    // InternalCS2ASDSL.g:6623:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:6624:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:6624:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:6625:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_82);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:6641:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==69) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalCS2ASDSL.g:6641:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,69,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                                  
                            }
                            // InternalCS2ASDSL.g:6645:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:6646:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:6646:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalCS2ASDSL.g:6647:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
                    // InternalCS2ASDSL.g:6664:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    {
                    // InternalCS2ASDSL.g:6664:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    // InternalCS2ASDSL.g:6664:8: otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    {
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:6668:1: ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    // InternalCS2ASDSL.g:6669:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    {
                    // InternalCS2ASDSL.g:6669:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    // InternalCS2ASDSL.g:6670:3: lv_ownedInitExpression_7_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:6694:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalCS2ASDSL.g:6695:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalCS2ASDSL.g:6696:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6703:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // InternalCS2ASDSL.g:6706:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalCS2ASDSL.g:6707:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalCS2ASDSL.g:6707:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalCS2ASDSL.g:6707:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalCS2ASDSL.g:6707:2: ( (lv_prefix_0_0= ';' ) )
            // InternalCS2ASDSL.g:6708:1: (lv_prefix_0_0= ';' )
            {
            // InternalCS2ASDSL.g:6708:1: (lv_prefix_0_0= ';' )
            // InternalCS2ASDSL.g:6709:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            // InternalCS2ASDSL.g:6722:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalCS2ASDSL.g:6723:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalCS2ASDSL.g:6723:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalCS2ASDSL.g:6724:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_83);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:6740:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==19) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalCS2ASDSL.g:6740:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // InternalCS2ASDSL.g:6744:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:6745:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:6745:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:6746:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_82);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:6762:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==69) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // InternalCS2ASDSL.g:6762:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,69,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // InternalCS2ASDSL.g:6766:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalCS2ASDSL.g:6767:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalCS2ASDSL.g:6767:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalCS2ASDSL.g:6768:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:6792:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalCS2ASDSL.g:6793:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalCS2ASDSL.g:6794:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6801:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:6804:28: (this_ExpCS_0= ruleExpCS )
            // InternalCS2ASDSL.g:6806:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:6825:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalCS2ASDSL.g:6826:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalCS2ASDSL.g:6827:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6834:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
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
            // InternalCS2ASDSL.g:6837:28: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalCS2ASDSL.g:6838:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalCS2ASDSL.g:6838:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalCS2ASDSL.g:6838:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,107,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:6842:1: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalCS2ASDSL.g:6843:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalCS2ASDSL.g:6843:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalCS2ASDSL.g:6844:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalCS2ASDSL.g:6844:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt113=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 78:
            case 79:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 96:
            case 98:
            case 99:
            case 100:
            case 101:
            case 107:
            case 112:
            case 113:
                {
                alt113=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA113_2 = input.LA(2);

                if ( (LA113_2==22||LA113_2==45||LA113_2==55||LA113_2==60||(LA113_2>=62 && LA113_2<=77)||LA113_2==80||LA113_2==102||LA113_2==104||LA113_2==108) ) {
                    alt113=1;
                }
                else if ( (LA113_2==19) ) {
                    alt113=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA113_3 = input.LA(2);

                if ( (LA113_3==19) ) {
                    alt113=2;
                }
                else if ( (LA113_3==22||LA113_3==45||LA113_3==55||LA113_3==60||(LA113_3>=62 && LA113_3<=77)||LA113_3==80||LA113_3==102||LA113_3==104||LA113_3==108) ) {
                    alt113=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt113=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalCS2ASDSL.g:6845:3: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_84);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:6860:8: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_84);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:6882:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:6883:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:6883:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalCS2ASDSL.g:6884:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_85);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:6900:2: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==111) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalCS2ASDSL.g:6901:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalCS2ASDSL.g:6901:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalCS2ASDSL.g:6902:3: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_85);
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
            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ElseIfThenExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            otherlv_5=(Token)match(input,109,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
                  
            }
            // InternalCS2ASDSL.g:6922:1: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:6923:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:6923:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalCS2ASDSL.g:6924:3: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_86);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,110,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:6952:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalCS2ASDSL.g:6953:2: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalCS2ASDSL.g:6954:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:6961:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:6964:28: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:6965:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:6965:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:6965:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,111,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:6969:1: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:6970:1: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:6970:1: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalCS2ASDSL.g:6971:3: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_84);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
                  
            }
            // InternalCS2ASDSL.g:6991:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:6992:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:6992:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalCS2ASDSL.g:6993:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:7017:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalCS2ASDSL.g:7018:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalCS2ASDSL.g:7019:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7026:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
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
            // InternalCS2ASDSL.g:7029:28: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:7030:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:7030:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:7030:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,112,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:7034:1: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalCS2ASDSL.g:7035:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalCS2ASDSL.g:7035:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalCS2ASDSL.g:7036:3: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_87);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:7052:2: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==17) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // InternalCS2ASDSL.g:7052:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:7056:1: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalCS2ASDSL.g:7057:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalCS2ASDSL.g:7057:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalCS2ASDSL.g:7058:3: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_87);
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
            	              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // InternalCS2ASDSL.g:7078:1: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:7079:1: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:7079:1: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalCS2ASDSL.g:7080:3: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:7104:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalCS2ASDSL.g:7105:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalCS2ASDSL.g:7106:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7113:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
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
            // InternalCS2ASDSL.g:7116:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalCS2ASDSL.g:7117:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalCS2ASDSL.g:7117:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalCS2ASDSL.g:7117:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalCS2ASDSL.g:7117:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:7118:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:7118:1: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCS2ASDSL.g:7119:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_88);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:7135:2: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==55) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalCS2ASDSL.g:7136:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalCS2ASDSL.g:7136:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalCS2ASDSL.g:7137:3: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalCS2ASDSL.g:7153:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==19) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalCS2ASDSL.g:7153:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                          
                    }
                    // InternalCS2ASDSL.g:7157:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalCS2ASDSL.g:7158:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalCS2ASDSL.g:7158:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalCS2ASDSL.g:7159:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
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
                              		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,69,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalCS2ASDSL.g:7179:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:7180:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:7180:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalCS2ASDSL.g:7181:3: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
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
    // InternalCS2ASDSL.g:7205:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalCS2ASDSL.g:7206:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalCS2ASDSL.g:7207:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7214:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7217:28: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalCS2ASDSL.g:7218:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalCS2ASDSL.g:7218:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalCS2ASDSL.g:7218:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:7222:1: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalCS2ASDSL.g:7223:1: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalCS2ASDSL.g:7223:1: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalCS2ASDSL.g:7224:3: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_56);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:7252:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalCS2ASDSL.g:7253:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalCS2ASDSL.g:7254:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7261:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7264:28: ( ( () otherlv_1= 'self' ) )
            // InternalCS2ASDSL.g:7265:1: ( () otherlv_1= 'self' )
            {
            // InternalCS2ASDSL.g:7265:1: ( () otherlv_1= 'self' )
            // InternalCS2ASDSL.g:7265:2: () otherlv_1= 'self'
            {
            // InternalCS2ASDSL.g:7265:2: ()
            // InternalCS2ASDSL.g:7266:2: 
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

            otherlv_1=(Token)match(input,113,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:7286:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalCS2ASDSL.g:7287:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalCS2ASDSL.g:7288:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7295:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7298:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalCS2ASDSL.g:7299:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalCS2ASDSL.g:7299:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalCS2ASDSL.g:7299:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalCS2ASDSL.g:7299:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalCS2ASDSL.g:7300:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalCS2ASDSL.g:7300:1: (lv_lowerBound_0_0= ruleLOWER )
            // InternalCS2ASDSL.g:7301:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
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
                      		"org.eclipse.ocl.xtext.base.Base.LOWER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:7317:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==94) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalCS2ASDSL.g:7317:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,94,FollowSets000.FOLLOW_89); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:7321:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalCS2ASDSL.g:7322:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalCS2ASDSL.g:7322:1: (lv_upperBound_2_0= ruleUPPER )
                    // InternalCS2ASDSL.g:7323:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.base.Base.UPPER");
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
    // InternalCS2ASDSL.g:7347:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalCS2ASDSL.g:7348:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalCS2ASDSL.g:7349:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7356:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) ;
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
            // InternalCS2ASDSL.g:7359:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) )
            // InternalCS2ASDSL.g:7360:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            {
            // InternalCS2ASDSL.g:7360:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            // InternalCS2ASDSL.g:7360:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,104,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:7364:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RULE_INT) ) {
                alt119=1;
            }
            else if ( (LA119_0==62||LA119_0==64||LA119_0==116) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // InternalCS2ASDSL.g:7365:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_91);
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
                    // InternalCS2ASDSL.g:7378:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_91);
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

            // InternalCS2ASDSL.g:7389:2: (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )?
            int alt120=3;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==114) ) {
                alt120=1;
            }
            else if ( (LA120_0==115) ) {
                alt120=2;
            }
            switch (alt120) {
                case 1 :
                    // InternalCS2ASDSL.g:7389:4: otherlv_3= '|?'
                    {
                    otherlv_3=(Token)match(input,114,FollowSets000.FOLLOW_92); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:7394:6: ( (lv_isNullFree_4_0= '|1' ) )
                    {
                    // InternalCS2ASDSL.g:7394:6: ( (lv_isNullFree_4_0= '|1' ) )
                    // InternalCS2ASDSL.g:7395:1: (lv_isNullFree_4_0= '|1' )
                    {
                    // InternalCS2ASDSL.g:7395:1: (lv_isNullFree_4_0= '|1' )
                    // InternalCS2ASDSL.g:7396:3: lv_isNullFree_4_0= '|1'
                    {
                    lv_isNullFree_4_0=(Token)match(input,115,FollowSets000.FOLLOW_92); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,105,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:7421:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalCS2ASDSL.g:7422:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalCS2ASDSL.g:7423:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7430:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7433:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalCS2ASDSL.g:7434:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalCS2ASDSL.g:7434:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalCS2ASDSL.g:7435:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalCS2ASDSL.g:7435:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalCS2ASDSL.g:7436:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalCS2ASDSL.g:7436:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt121=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt121=1;
                }
                break;
            case 64:
                {
                alt121=2;
                }
                break;
            case 116:
                {
                alt121=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalCS2ASDSL.g:7437:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalCS2ASDSL.g:7449:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalCS2ASDSL.g:7461:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,116,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:7484:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalCS2ASDSL.g:7485:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalCS2ASDSL.g:7486:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7493:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7496:28: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalCS2ASDSL.g:7497:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalCS2ASDSL.g:7497:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalCS2ASDSL.g:7497:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalCS2ASDSL.g:7497:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // InternalCS2ASDSL.g:7498:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // InternalCS2ASDSL.g:7498:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // InternalCS2ASDSL.g:7499:3: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_54);
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
                      		"org.eclipse.ocl.xtext.base.Base.FirstPathElementCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:7515:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==80) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // InternalCS2ASDSL.g:7515:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,80,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:7519:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalCS2ASDSL.g:7520:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalCS2ASDSL.g:7520:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalCS2ASDSL.g:7521:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
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
            	              		"org.eclipse.ocl.xtext.base.Base.NextPathElementCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
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
    // InternalCS2ASDSL.g:7545:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // InternalCS2ASDSL.g:7546:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // InternalCS2ASDSL.g:7547:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7554:1: ruleFirstPathElementCS returns [EObject current=null] : ( (lv_name_0_0= ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7557:28: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) )
            // InternalCS2ASDSL.g:7558:1: ( (lv_name_0_0= ruleUnrestrictedName ) )
            {
            // InternalCS2ASDSL.g:7558:1: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:7559:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:7559:1: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCS2ASDSL.g:7560:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getNameUnrestrictedNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFirstPathElementCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
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
    // InternalCS2ASDSL.g:7584:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // InternalCS2ASDSL.g:7585:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // InternalCS2ASDSL.g:7586:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7593:1: ruleNextPathElementCS returns [EObject current=null] : ( (lv_name_0_0= ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7596:28: ( ( (lv_name_0_0= ruleUnreservedName ) ) )
            // InternalCS2ASDSL.g:7597:1: ( (lv_name_0_0= ruleUnreservedName ) )
            {
            // InternalCS2ASDSL.g:7597:1: ( (lv_name_0_0= ruleUnreservedName ) )
            // InternalCS2ASDSL.g:7598:1: (lv_name_0_0= ruleUnreservedName )
            {
            // InternalCS2ASDSL.g:7598:1: (lv_name_0_0= ruleUnreservedName )
            // InternalCS2ASDSL.g:7599:3: lv_name_0_0= ruleUnreservedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextPathElementCSAccess().getNameUnreservedNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNextPathElementCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnreservedName");
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
    // InternalCS2ASDSL.g:7623:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // InternalCS2ASDSL.g:7624:2: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // InternalCS2ASDSL.g:7625:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7632:1: ruleTemplateBindingCS returns [EObject current=null] : ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedSubstitutions_0_0 = null;

        EObject lv_ownedSubstitutions_2_0 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7635:28: ( ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // InternalCS2ASDSL.g:7636:1: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // InternalCS2ASDSL.g:7636:1: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // InternalCS2ASDSL.g:7636:2: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // InternalCS2ASDSL.g:7636:2: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) )
            // InternalCS2ASDSL.g:7637:1: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            {
            // InternalCS2ASDSL.g:7637:1: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            // InternalCS2ASDSL.g:7638:3: lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_93);
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
                      		"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:7654:2: (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==17) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // InternalCS2ASDSL.g:7654:4: otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_94); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:7658:1: ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    // InternalCS2ASDSL.g:7659:1: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // InternalCS2ASDSL.g:7659:1: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    // InternalCS2ASDSL.g:7660:3: lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_93);
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
            	              		"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            // InternalCS2ASDSL.g:7676:4: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==104) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalCS2ASDSL.g:7677:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // InternalCS2ASDSL.g:7677:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // InternalCS2ASDSL.g:7678:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
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
    // InternalCS2ASDSL.g:7702:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // InternalCS2ASDSL.g:7703:2: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // InternalCS2ASDSL.g:7704:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7711:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7714:28: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // InternalCS2ASDSL.g:7715:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // InternalCS2ASDSL.g:7715:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // InternalCS2ASDSL.g:7716:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // InternalCS2ASDSL.g:7716:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // InternalCS2ASDSL.g:7717:3: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"org.eclipse.ocl.xtext.base.Base.TypeRefCS");
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


    // $ANTLR start "entryRuleTemplateSignatureCS"
    // InternalCS2ASDSL.g:7741:1: entryRuleTemplateSignatureCS returns [EObject current=null] : iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF ;
    public final EObject entryRuleTemplateSignatureCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSignatureCS = null;


        try {
            // InternalCS2ASDSL.g:7742:2: (iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF )
            // InternalCS2ASDSL.g:7743:2: iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSignatureCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateSignatureCS=ruleTemplateSignatureCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSignatureCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateSignatureCS"


    // $ANTLR start "ruleTemplateSignatureCS"
    // InternalCS2ASDSL.g:7750:1: ruleTemplateSignatureCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTemplateSignatureCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedParameters_1_0 = null;

        EObject lv_ownedParameters_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7753:28: ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) )
            // InternalCS2ASDSL.g:7754:1: (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' )
            {
            // InternalCS2ASDSL.g:7754:1: (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' )
            // InternalCS2ASDSL.g:7754:3: otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateSignatureCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalCS2ASDSL.g:7758:1: ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) )
            // InternalCS2ASDSL.g:7759:1: (lv_ownedParameters_1_0= ruleTypeParameterCS )
            {
            // InternalCS2ASDSL.g:7759:1: (lv_ownedParameters_1_0= ruleTypeParameterCS )
            // InternalCS2ASDSL.g:7760:3: lv_ownedParameters_1_0= ruleTypeParameterCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_51);
            lv_ownedParameters_1_0=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedParameters",
                      		lv_ownedParameters_1_0, 
                      		"org.eclipse.ocl.xtext.base.Base.TypeParameterCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:7776:2: (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==17) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalCS2ASDSL.g:7776:4: otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTemplateSignatureCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalCS2ASDSL.g:7780:1: ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) )
            	    // InternalCS2ASDSL.g:7781:1: (lv_ownedParameters_3_0= ruleTypeParameterCS )
            	    {
            	    // InternalCS2ASDSL.g:7781:1: (lv_ownedParameters_3_0= ruleTypeParameterCS )
            	    // InternalCS2ASDSL.g:7782:3: lv_ownedParameters_3_0= ruleTypeParameterCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_ownedParameters_3_0=ruleTypeParameterCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedParameters",
            	              		lv_ownedParameters_3_0, 
            	              		"org.eclipse.ocl.xtext.base.Base.TypeParameterCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTemplateSignatureCSAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleTemplateSignatureCS"


    // $ANTLR start "entryRuleTypeParameterCS"
    // InternalCS2ASDSL.g:7810:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // InternalCS2ASDSL.g:7811:2: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // InternalCS2ASDSL.g:7812:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7819:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7822:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // InternalCS2ASDSL.g:7823:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // InternalCS2ASDSL.g:7823:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // InternalCS2ASDSL.g:7823:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // InternalCS2ASDSL.g:7823:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCS2ASDSL.g:7824:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCS2ASDSL.g:7824:1: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCS2ASDSL.g:7825:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_95);
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
                      		"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:7841:2: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==117) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalCS2ASDSL.g:7841:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,117,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:7845:1: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // InternalCS2ASDSL.g:7846:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // InternalCS2ASDSL.g:7846:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // InternalCS2ASDSL.g:7847:3: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_96);
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
                              		"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCS2ASDSL.g:7863:2: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==118) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalCS2ASDSL.g:7863:4: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,118,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalCS2ASDSL.g:7867:1: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // InternalCS2ASDSL.g:7868:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // InternalCS2ASDSL.g:7868:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // InternalCS2ASDSL.g:7869:3: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_96);
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
                    	              		"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
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
    // InternalCS2ASDSL.g:7893:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // InternalCS2ASDSL.g:7894:2: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // InternalCS2ASDSL.g:7895:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7902:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7905:28: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // InternalCS2ASDSL.g:7906:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // InternalCS2ASDSL.g:7906:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=RULE_SIMPLE_ID && LA128_0<=RULE_ESCAPED_ID)) ) {
                alt128=1;
            }
            else if ( (LA128_0==116) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // InternalCS2ASDSL.g:7907:2: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalCS2ASDSL.g:7920:2: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:7939:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // InternalCS2ASDSL.g:7940:2: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // InternalCS2ASDSL.g:7941:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7948:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7951:28: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // InternalCS2ASDSL.g:7953:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:7972:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // InternalCS2ASDSL.g:7973:2: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // InternalCS2ASDSL.g:7974:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:7981:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:7984:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) )
            // InternalCS2ASDSL.g:7985:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            {
            // InternalCS2ASDSL.g:7985:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            // InternalCS2ASDSL.g:7985:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            {
            // InternalCS2ASDSL.g:7985:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalCS2ASDSL.g:7986:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalCS2ASDSL.g:7986:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalCS2ASDSL.g:7987:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_55);
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
                      		"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCS2ASDSL.g:8003:2: (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==55) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalCS2ASDSL.g:8003:4: otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_94); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypedTypeRefCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalCS2ASDSL.g:8007:1: ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) )
                    // InternalCS2ASDSL.g:8008:1: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    {
                    // InternalCS2ASDSL.g:8008:1: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    // InternalCS2ASDSL.g:8009:3: lv_ownedBinding_2_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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
                              		"org.eclipse.ocl.xtext.base.Base.TemplateBindingCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:8037:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // InternalCS2ASDSL.g:8038:2: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // InternalCS2ASDSL.g:8039:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8046:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8049:28: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // InternalCS2ASDSL.g:8050:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // InternalCS2ASDSL.g:8050:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // InternalCS2ASDSL.g:8050:2: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // InternalCS2ASDSL.g:8050:2: ()
            // InternalCS2ASDSL.g:8051:2: 
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

            otherlv_1=(Token)match(input,116,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
                  
            }
            // InternalCS2ASDSL.g:8063:1: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==117) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalCS2ASDSL.g:8063:3: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,117,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                          
                    }
                    // InternalCS2ASDSL.g:8067:1: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // InternalCS2ASDSL.g:8068:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // InternalCS2ASDSL.g:8068:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // InternalCS2ASDSL.g:8069:3: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
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
    // InternalCS2ASDSL.g:8093:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // InternalCS2ASDSL.g:8094:2: (iv_ruleID= ruleID EOF )
            // InternalCS2ASDSL.g:8095:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8102:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8105:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // InternalCS2ASDSL.g:8106:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // InternalCS2ASDSL.g:8106:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==RULE_SIMPLE_ID) ) {
                alt131=1;
            }
            else if ( (LA131_0==RULE_ESCAPED_ID) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // InternalCS2ASDSL.g:8106:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:8114:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:8129:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalCS2ASDSL.g:8130:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalCS2ASDSL.g:8131:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8138:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8141:28: (this_ID_0= ruleID )
            // InternalCS2ASDSL.g:8143:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalCS2ASDSL.g:8161:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalCS2ASDSL.g:8162:2: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalCS2ASDSL.g:8163:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8170:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8173:28: (this_INT_0= RULE_INT )
            // InternalCS2ASDSL.g:8174:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:8189:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalCS2ASDSL.g:8190:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalCS2ASDSL.g:8191:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8198:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8201:28: (this_INT_0= RULE_INT )
            // InternalCS2ASDSL.g:8202:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:8217:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalCS2ASDSL.g:8218:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalCS2ASDSL.g:8219:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8226:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8229:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalCS2ASDSL.g:8230:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:8245:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalCS2ASDSL.g:8246:2: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalCS2ASDSL.g:8247:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8254:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8257:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalCS2ASDSL.g:8258:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalCS2ASDSL.g:8258:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_INT) ) {
                alt132=1;
            }
            else if ( (LA132_0==62) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalCS2ASDSL.g:8258:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCS2ASDSL.g:8267:2: kw= '*'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCS2ASDSL.g:8280:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // InternalCS2ASDSL.g:8281:2: (iv_ruleURI= ruleURI EOF )
            // InternalCS2ASDSL.g:8282:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalCS2ASDSL.g:8289:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // InternalCS2ASDSL.g:8292:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalCS2ASDSL.g:8293:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalCS2ASDSL
    public final void synpred1_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject lv_mappingSect_3_0 = null;


        // InternalCS2ASDSL.g:143:4: ( ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) ) )
        // InternalCS2ASDSL.g:143:4: ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) )
        {
        // InternalCS2ASDSL.g:143:4: ({...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) ) )
        // InternalCS2ASDSL.g:144:5: {...}? => ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred1_InternalCS2ASDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalCS2ASDSL.g:144:102: ( ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) ) )
        // InternalCS2ASDSL.g:145:6: ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 0);
        // InternalCS2ASDSL.g:148:6: ({...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) ) )
        // InternalCS2ASDSL.g:148:7: {...}? => ( (lv_mappingSect_3_0= ruleMappingSect ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred1_InternalCS2ASDSL", "true");
        }
        // InternalCS2ASDSL.g:148:16: ( (lv_mappingSect_3_0= ruleMappingSect ) )
        // InternalCS2ASDSL.g:149:1: (lv_mappingSect_3_0= ruleMappingSect )
        {
        // InternalCS2ASDSL.g:149:1: (lv_mappingSect_3_0= ruleMappingSect )
        // InternalCS2ASDSL.g:150:3: lv_mappingSect_3_0= ruleMappingSect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getModelAccess().getMappingSectMappingSectParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_mappingSect_3_0=ruleMappingSect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalCS2ASDSL

    // $ANTLR start synpred2_InternalCS2ASDSL
    public final void synpred2_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject lv_disambiguationSect_4_0 = null;


        // InternalCS2ASDSL.g:173:4: ( ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) ) )
        // InternalCS2ASDSL.g:173:4: ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) )
        {
        // InternalCS2ASDSL.g:173:4: ({...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) ) )
        // InternalCS2ASDSL.g:174:5: {...}? => ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalCS2ASDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalCS2ASDSL.g:174:102: ( ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) ) )
        // InternalCS2ASDSL.g:175:6: ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 1);
        // InternalCS2ASDSL.g:178:6: ({...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) ) )
        // InternalCS2ASDSL.g:178:7: {...}? => ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalCS2ASDSL", "true");
        }
        // InternalCS2ASDSL.g:178:16: ( (lv_disambiguationSect_4_0= ruleDisambiguationSect ) )
        // InternalCS2ASDSL.g:179:1: (lv_disambiguationSect_4_0= ruleDisambiguationSect )
        {
        // InternalCS2ASDSL.g:179:1: (lv_disambiguationSect_4_0= ruleDisambiguationSect )
        // InternalCS2ASDSL.g:180:3: lv_disambiguationSect_4_0= ruleDisambiguationSect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getModelAccess().getDisambiguationSectDisambiguationSectParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_disambiguationSect_4_0=ruleDisambiguationSect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalCS2ASDSL

    // $ANTLR start synpred3_InternalCS2ASDSL
    public final void synpred3_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject lv_nameresoSect_5_0 = null;


        // InternalCS2ASDSL.g:203:4: ( ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) ) )
        // InternalCS2ASDSL.g:203:4: ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) )
        {
        // InternalCS2ASDSL.g:203:4: ({...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) ) )
        // InternalCS2ASDSL.g:204:5: {...}? => ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalCS2ASDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 2)");
        }
        // InternalCS2ASDSL.g:204:102: ( ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) ) )
        // InternalCS2ASDSL.g:205:6: ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 2);
        // InternalCS2ASDSL.g:208:6: ({...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) ) )
        // InternalCS2ASDSL.g:208:7: {...}? => ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalCS2ASDSL", "true");
        }
        // InternalCS2ASDSL.g:208:16: ( (lv_nameresoSect_5_0= ruleNameResolutionSect ) )
        // InternalCS2ASDSL.g:209:1: (lv_nameresoSect_5_0= ruleNameResolutionSect )
        {
        // InternalCS2ASDSL.g:209:1: (lv_nameresoSect_5_0= ruleNameResolutionSect )
        // InternalCS2ASDSL.g:210:3: lv_nameresoSect_5_0= ruleNameResolutionSect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getModelAccess().getNameresoSectNameResolutionSectParserRuleCall_2_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_nameresoSect_5_0=ruleNameResolutionSect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalCS2ASDSL

    // $ANTLR start synpred4_InternalCS2ASDSL
    public final void synpred4_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject lv_helpersSect_6_0 = null;


        // InternalCS2ASDSL.g:233:4: ( ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) ) )
        // InternalCS2ASDSL.g:233:4: ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) )
        {
        // InternalCS2ASDSL.g:233:4: ({...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) ) )
        // InternalCS2ASDSL.g:234:5: {...}? => ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalCS2ASDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_2(), 3)");
        }
        // InternalCS2ASDSL.g:234:102: ( ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) ) )
        // InternalCS2ASDSL.g:235:6: ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_2(), 3);
        // InternalCS2ASDSL.g:238:6: ({...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) ) )
        // InternalCS2ASDSL.g:238:7: {...}? => ( (lv_helpersSect_6_0= ruleHelpersSect ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalCS2ASDSL", "true");
        }
        // InternalCS2ASDSL.g:238:16: ( (lv_helpersSect_6_0= ruleHelpersSect ) )
        // InternalCS2ASDSL.g:239:1: (lv_helpersSect_6_0= ruleHelpersSect )
        {
        // InternalCS2ASDSL.g:239:1: (lv_helpersSect_6_0= ruleHelpersSect )
        // InternalCS2ASDSL.g:240:3: lv_helpersSect_6_0= ruleHelpersSect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getModelAccess().getHelpersSectHelpersSectParserRuleCall_2_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_helpersSect_6_0=ruleHelpersSect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalCS2ASDSL

    // $ANTLR start synpred27_InternalCS2ASDSL
    public final void synpred27_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_ScopeDef_0 = null;


        // InternalCS2ASDSL.g:1646:2: (this_ScopeDef_0= ruleScopeDef )
        // InternalCS2ASDSL.g:1646:2: this_ScopeDef_0= ruleScopeDef
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ScopeDef_0=ruleScopeDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalCS2ASDSL

    // $ANTLR start synpred32_InternalCS2ASDSL
    public final void synpred32_InternalCS2ASDSL_fragment() throws RecognitionException {   
        Token lv_isImported_1_0=null;

        // InternalCS2ASDSL.g:1863:6: ( ( (lv_isImported_1_0= 'imported' ) )? )
        // InternalCS2ASDSL.g:1863:6: ( (lv_isImported_1_0= 'imported' ) )?
        {
        // InternalCS2ASDSL.g:1863:6: ( (lv_isImported_1_0= 'imported' ) )?
        int alt135=2;
        int LA135_0 = input.LA(1);

        if ( (LA135_0==42) ) {
            alt135=1;
        }
        switch (alt135) {
            case 1 :
                // InternalCS2ASDSL.g:1864:1: (lv_isImported_1_0= 'imported' )
                {
                // InternalCS2ASDSL.g:1864:1: (lv_isImported_1_0= 'imported' )
                // InternalCS2ASDSL.g:1865:3: lv_isImported_1_0= 'imported'
                {
                lv_isImported_1_0=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred32_InternalCS2ASDSL

    // $ANTLR start synpred58_InternalCS2ASDSL
    public final void synpred58_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // InternalCS2ASDSL.g:2917:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // InternalCS2ASDSL.g:2917:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalCS2ASDSL

    // $ANTLR start synpred59_InternalCS2ASDSL
    public final void synpred59_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // InternalCS2ASDSL.g:2930:2: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // InternalCS2ASDSL.g:2930:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalCS2ASDSL

    // $ANTLR start synpred60_InternalCS2ASDSL
    public final void synpred60_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // InternalCS2ASDSL.g:2943:2: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // InternalCS2ASDSL.g:2943:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalCS2ASDSL

    // $ANTLR start synpred62_InternalCS2ASDSL
    public final void synpred62_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_8 = null;


        // InternalCS2ASDSL.g:2969:2: (this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS )
        // InternalCS2ASDSL.g:2969:2: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalCS2ASDSL

    // $ANTLR start synpred133_InternalCS2ASDSL
    public final void synpred133_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalCS2ASDSL.g:5623:2: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalCS2ASDSL.g:5623:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_InternalCS2ASDSL

    // $ANTLR start synpred136_InternalCS2ASDSL
    public final void synpred136_InternalCS2ASDSL_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalCS2ASDSL.g:5686:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalCS2ASDSL.g:5686:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalCS2ASDSL.g:5686:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalCS2ASDSL.g:5687:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_70);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalCS2ASDSL.g:5698:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( (LA148_0==45||LA148_0==60||(LA148_0>=62 && LA148_0<=77)) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // InternalCS2ASDSL.g:5698:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalCS2ASDSL.g:5698:2: ()
                // InternalCS2ASDSL.g:5699:2: 
                {
                if ( state.backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                // InternalCS2ASDSL.g:5707:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // InternalCS2ASDSL.g:5708:1: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // InternalCS2ASDSL.g:5708:1: (lv_name_2_0= ruleBinaryOperatorName )
                // InternalCS2ASDSL.g:5709:3: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_19);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalCS2ASDSL.g:5725:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalCS2ASDSL.g:5726:1: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalCS2ASDSL.g:5726:1: (lv_ownedRight_3_0= ruleExpCS )
                // InternalCS2ASDSL.g:5727:3: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_2);
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
    // $ANTLR end synpred136_InternalCS2ASDSL

    // Delegated rules

    public final boolean synpred136_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalCS2ASDSL_fragment(); // can never throw exception
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
    public final boolean synpred133_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCS2ASDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCS2ASDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA87 dfa87 = new DFA87(this);
    static final String dfa_1s = "\46\uffff";
    static final String dfa_2s = "\1\4\2\uffff\42\0\1\uffff";
    static final String dfa_3s = "\1\161\2\uffff\42\0\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\42\uffff\1\3";
    static final String dfa_5s = "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff}>";
    static final String[] dfa_6s = {
            "\1\37\1\40\1\10\1\11\41\uffff\1\1\1\2\14\uffff\1\5\1\uffff\1\41\1\42\1\43\1\3\1\4\1\14\17\uffff\1\20\1\17\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\21\1\22\1\23\1\24\1\25\2\uffff\1\26\1\uffff\1\12\1\13\1\15\1\16\5\uffff\1\6\4\uffff\1\44\1\7",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1847:2: ( ( (lv_isPreceding_0_0= 'preceding' ) ) | ( (lv_isImported_1_0= 'imported' ) )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_9 = input.LA(1);

                         
                        int index28_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_10 = input.LA(1);

                         
                        int index28_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_11 = input.LA(1);

                         
                        int index28_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_12 = input.LA(1);

                         
                        int index28_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA28_13 = input.LA(1);

                         
                        int index28_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA28_14 = input.LA(1);

                         
                        int index28_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA28_15 = input.LA(1);

                         
                        int index28_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA28_16 = input.LA(1);

                         
                        int index28_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA28_17 = input.LA(1);

                         
                        int index28_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA28_18 = input.LA(1);

                         
                        int index28_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA28_19 = input.LA(1);

                         
                        int index28_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA28_20 = input.LA(1);

                         
                        int index28_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA28_21 = input.LA(1);

                         
                        int index28_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA28_22 = input.LA(1);

                         
                        int index28_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA28_23 = input.LA(1);

                         
                        int index28_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_23);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA28_24 = input.LA(1);

                         
                        int index28_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_24);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA28_25 = input.LA(1);

                         
                        int index28_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_25);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA28_26 = input.LA(1);

                         
                        int index28_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_26);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA28_27 = input.LA(1);

                         
                        int index28_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA28_28 = input.LA(1);

                         
                        int index28_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_28);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA28_29 = input.LA(1);

                         
                        int index28_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_29);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA28_30 = input.LA(1);

                         
                        int index28_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_30);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA28_31 = input.LA(1);

                         
                        int index28_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_31);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA28_32 = input.LA(1);

                         
                        int index28_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_32);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA28_33 = input.LA(1);

                         
                        int index28_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_33);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA28_34 = input.LA(1);

                         
                        int index28_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_34);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA28_35 = input.LA(1);

                         
                        int index28_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_35);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA28_36 = input.LA(1);

                         
                        int index28_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCS2ASDSL()) ) {s = 2;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index28_36);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\43\uffff";
    static final String dfa_8s = "\1\4\12\uffff\7\0\21\uffff";
    static final String dfa_9s = "\1\161\12\uffff\7\0\21\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\1\11\7\uffff\1\12\1\uffff\1\13\1\14\1\uffff\1\5\1\6\1\7";
    static final String dfa_11s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\21\uffff}>";
    static final String[] dfa_12s = {
            "\2\33\2\4\57\uffff\1\1\1\uffff\1\35\2\36\2\uffff\1\4\17\uffff\1\14\1\13\1\uffff\10\23\1\15\1\16\1\17\1\20\1\21\2\uffff\1\22\1\uffff\4\4\5\uffff\1\2\5\uffff\1\3",
            "",
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
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2864:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS | this_TraceExpCS_10= ruleTraceExpCS | this_LookupExpCS_11= ruleLookupExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_11 = input.LA(1);

                         
                        int index48_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalCS2ASDSL()) ) {s = 32;}

                        else if ( (synpred62_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index48_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_12 = input.LA(1);

                         
                        int index48_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalCS2ASDSL()) ) {s = 33;}

                        else if ( (synpred62_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index48_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_13 = input.LA(1);

                         
                        int index48_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalCS2ASDSL()) ) {s = 34;}

                        else if ( (synpred62_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index48_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_14 = input.LA(1);

                         
                        int index48_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalCS2ASDSL()) ) {s = 34;}

                        else if ( (synpred62_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index48_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_15 = input.LA(1);

                         
                        int index48_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalCS2ASDSL()) ) {s = 34;}

                        else if ( (synpred62_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index48_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_16 = input.LA(1);

                         
                        int index48_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalCS2ASDSL()) ) {s = 34;}

                        else if ( (synpred62_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index48_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_17 = input.LA(1);

                         
                        int index48_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalCS2ASDSL()) ) {s = 34;}

                        else if ( (synpred62_InternalCS2ASDSL()) ) {s = 19;}

                         
                        input.seek(index48_17);
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
    static final String dfa_13s = "\23\uffff";
    static final String dfa_14s = "\1\4\12\uffff\5\0\3\uffff";
    static final String dfa_15s = "\1\135\12\uffff\5\0\3\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3";
    static final String dfa_17s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_18s = {
            "\2\1\110\uffff\2\3\1\uffff\10\3\1\13\1\14\1\15\1\16\1\17",
            "",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "5609:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_11 = input.LA(1);

                         
                        int index84_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index84_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_12 = input.LA(1);

                         
                        int index84_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index84_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_13 = input.LA(1);

                         
                        int index84_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index84_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA84_14 = input.LA(1);

                         
                        int index84_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index84_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA84_15 = input.LA(1);

                         
                        int index84_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index84_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\1\4\2\0\40\uffff";
    static final String dfa_20s = "\1\161\2\0\40\uffff";
    static final String dfa_21s = "\3\uffff\1\1\36\uffff\1\2";
    static final String dfa_22s = "\1\uffff\1\0\1\1\40\uffff}>";
    static final String[] dfa_23s = {
            "\4\3\57\uffff\1\3\1\uffff\3\3\1\1\1\2\1\3\17\uffff\2\3\1\uffff\15\3\2\uffff\1\3\1\uffff\4\3\5\uffff\1\3\4\uffff\1\42\1\3",
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
            "",
            ""
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "5686:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA87_2 = input.LA(1);

                         
                        int index87_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_InternalCS2ASDSL()) ) {s = 3;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index87_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00400000C0200000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00400000C0200002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000B0L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010800010L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x7E800000000000F0L,0x0003083D3FFEC000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800010L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008608000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008408000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000408000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000800030L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000208000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008084000800000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008080000800000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x7E800600000000F0L,0x0003083D3FFEC000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000A00000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007000000000030L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0007000000000032L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x7E900000000000F0L,0x0003083D3FFEC000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000800030L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000030L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000020000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000020080000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000030L,0x000000003FFEC000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x7E800000008800F0L,0x0003083D3FFEC000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x7E800000000800F0L,0x0003083D3FFEC000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000020000L,0x0000000080000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x7E800000008000F0L,0x0003083D3FFEC000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xD000200000000002L,0x0000000000003FFFL});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x7E800000000000F0L,0x0002083D3FFEC000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0080000000400002L,0x0000014000000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000400002L,0x0000004000000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x00000000008000B0L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x7F800000000800F0L,0x0003083D3FFEC000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0100000008020000L,0x0000040000000000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0100000000020000L,0x0000040000000000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000020000L,0x0000020000000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000080000080002L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000A00000000000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000080000020000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0080000000080000L,0x0000000000000020L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x4000000000000040L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x4000000000000040L,0x0010000000000001L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x000C020000000000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000020002L,0x0000010000000000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000030L,0x0010000000000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    }


}