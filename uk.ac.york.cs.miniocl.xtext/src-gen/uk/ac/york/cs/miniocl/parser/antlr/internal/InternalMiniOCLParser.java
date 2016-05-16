package uk.ac.york.cs.miniocl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.york.cs.miniocl.services.MiniOCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniOCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'class'", "'extends'", "'prop'", "':'", "';'", "'op'", "'('", "','", "')'", "'='", "'context'", "'inv'", "'<>'", "'.'", "'->'", "'true'", "'false'", "'::'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMiniOCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniOCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniOCLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniOCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private MiniOCLGrammarAccess grammarAccess;

        public InternalMiniOCLParser(TokenStream input, MiniOCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RootCS";
       	}

       	@Override
       	protected MiniOCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRootCS"
    // InternalMiniOCL.g:70:1: entryRuleRootCS returns [EObject current=null] : iv_ruleRootCS= ruleRootCS EOF ;
    public final EObject entryRuleRootCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootCS = null;


        try {
            // InternalMiniOCL.g:70:47: (iv_ruleRootCS= ruleRootCS EOF )
            // InternalMiniOCL.g:71:2: iv_ruleRootCS= ruleRootCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRootCS=ruleRootCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootCS"


    // $ANTLR start "ruleRootCS"
    // InternalMiniOCL.g:77:1: ruleRootCS returns [EObject current=null] : ( ( (lv_packages_0_0= rulePackageCS ) ) | ( (lv_contraints_1_0= ruleConstraintCS ) ) )* ;
    public final EObject ruleRootCS() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;

        EObject lv_contraints_1_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:83:2: ( ( ( (lv_packages_0_0= rulePackageCS ) ) | ( (lv_contraints_1_0= ruleConstraintCS ) ) )* )
            // InternalMiniOCL.g:84:2: ( ( (lv_packages_0_0= rulePackageCS ) ) | ( (lv_contraints_1_0= ruleConstraintCS ) ) )*
            {
            // InternalMiniOCL.g:84:2: ( ( (lv_packages_0_0= rulePackageCS ) ) | ( (lv_contraints_1_0= ruleConstraintCS ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( (LA1_0==24) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniOCL.g:85:3: ( (lv_packages_0_0= rulePackageCS ) )
            	    {
            	    // InternalMiniOCL.g:85:3: ( (lv_packages_0_0= rulePackageCS ) )
            	    // InternalMiniOCL.g:86:4: (lv_packages_0_0= rulePackageCS )
            	    {
            	    // InternalMiniOCL.g:86:4: (lv_packages_0_0= rulePackageCS )
            	    // InternalMiniOCL.g:87:5: lv_packages_0_0= rulePackageCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootCSAccess().getPackagesPackageCSParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_packages_0_0=rulePackageCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"packages",
            	      						lv_packages_0_0,
            	      						"uk.ac.york.cs.miniocl.MiniOCL.PackageCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMiniOCL.g:105:3: ( (lv_contraints_1_0= ruleConstraintCS ) )
            	    {
            	    // InternalMiniOCL.g:105:3: ( (lv_contraints_1_0= ruleConstraintCS ) )
            	    // InternalMiniOCL.g:106:4: (lv_contraints_1_0= ruleConstraintCS )
            	    {
            	    // InternalMiniOCL.g:106:4: (lv_contraints_1_0= ruleConstraintCS )
            	    // InternalMiniOCL.g:107:5: lv_contraints_1_0= ruleConstraintCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootCSAccess().getContraintsConstraintCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_contraints_1_0=ruleConstraintCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"contraints",
            	      						lv_contraints_1_0,
            	      						"uk.ac.york.cs.miniocl.MiniOCL.ConstraintCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleRootCS"


    // $ANTLR start "entryRulePackageCS"
    // InternalMiniOCL.g:128:1: entryRulePackageCS returns [EObject current=null] : iv_rulePackageCS= rulePackageCS EOF ;
    public final EObject entryRulePackageCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageCS = null;


        try {
            // InternalMiniOCL.g:128:50: (iv_rulePackageCS= rulePackageCS EOF )
            // InternalMiniOCL.g:129:2: iv_rulePackageCS= rulePackageCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageCS=rulePackageCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageCS"


    // $ANTLR start "rulePackageCS"
    // InternalMiniOCL.g:135:1: rulePackageCS returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_packages_3_0= rulePackageCS ) ) | ( (lv_classes_4_0= ruleClassCS ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_packages_3_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:141:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_packages_3_0= rulePackageCS ) ) | ( (lv_classes_4_0= ruleClassCS ) ) )* otherlv_5= '}' ) )
            // InternalMiniOCL.g:142:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_packages_3_0= rulePackageCS ) ) | ( (lv_classes_4_0= ruleClassCS ) ) )* otherlv_5= '}' )
            {
            // InternalMiniOCL.g:142:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_packages_3_0= rulePackageCS ) ) | ( (lv_classes_4_0= ruleClassCS ) ) )* otherlv_5= '}' )
            // InternalMiniOCL.g:143:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_packages_3_0= rulePackageCS ) ) | ( (lv_classes_4_0= ruleClassCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageCSAccess().getPackageKeyword_0());
              		
            }
            // InternalMiniOCL.g:147:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniOCL.g:148:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniOCL.g:148:4: (lv_name_1_0= RULE_ID )
            // InternalMiniOCL.g:149:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPackageCSAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPackageCSRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPackageCSAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMiniOCL.g:169:3: ( ( (lv_packages_3_0= rulePackageCS ) ) | ( (lv_classes_4_0= ruleClassCS ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }
                else if ( (LA2_0==14) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMiniOCL.g:170:4: ( (lv_packages_3_0= rulePackageCS ) )
            	    {
            	    // InternalMiniOCL.g:170:4: ( (lv_packages_3_0= rulePackageCS ) )
            	    // InternalMiniOCL.g:171:5: (lv_packages_3_0= rulePackageCS )
            	    {
            	    // InternalMiniOCL.g:171:5: (lv_packages_3_0= rulePackageCS )
            	    // InternalMiniOCL.g:172:6: lv_packages_3_0= rulePackageCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageCSAccess().getPackagesPackageCSParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_packages_3_0=rulePackageCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"packages",
            	      							lv_packages_3_0,
            	      							"uk.ac.york.cs.miniocl.MiniOCL.PackageCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMiniOCL.g:190:4: ( (lv_classes_4_0= ruleClassCS ) )
            	    {
            	    // InternalMiniOCL.g:190:4: ( (lv_classes_4_0= ruleClassCS ) )
            	    // InternalMiniOCL.g:191:5: (lv_classes_4_0= ruleClassCS )
            	    {
            	    // InternalMiniOCL.g:191:5: (lv_classes_4_0= ruleClassCS )
            	    // InternalMiniOCL.g:192:6: lv_classes_4_0= ruleClassCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageCSAccess().getClassesClassCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleClassCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"classes",
            	      							lv_classes_4_0,
            	      							"uk.ac.york.cs.miniocl.MiniOCL.ClassCS");
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

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPackageCSAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "rulePackageCS"


    // $ANTLR start "entryRuleClassCS"
    // InternalMiniOCL.g:218:1: entryRuleClassCS returns [EObject current=null] : iv_ruleClassCS= ruleClassCS EOF ;
    public final EObject entryRuleClassCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassCS = null;


        try {
            // InternalMiniOCL.g:218:48: (iv_ruleClassCS= ruleClassCS EOF )
            // InternalMiniOCL.g:219:2: iv_ruleClassCS= ruleClassCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassCS=ruleClassCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassCS"


    // $ANTLR start "ruleClassCS"
    // InternalMiniOCL.g:225:1: ruleClassCS returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= rulePathNameCS ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulePropertyCS ) ) | ( (lv_operations_6_0= ruleOperationCS ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleClassCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_extends_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_operations_6_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:231:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= rulePathNameCS ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulePropertyCS ) ) | ( (lv_operations_6_0= ruleOperationCS ) ) )* otherlv_7= '}' ) )
            // InternalMiniOCL.g:232:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= rulePathNameCS ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulePropertyCS ) ) | ( (lv_operations_6_0= ruleOperationCS ) ) )* otherlv_7= '}' )
            {
            // InternalMiniOCL.g:232:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= rulePathNameCS ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulePropertyCS ) ) | ( (lv_operations_6_0= ruleOperationCS ) ) )* otherlv_7= '}' )
            // InternalMiniOCL.g:233:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extends_3_0= rulePathNameCS ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulePropertyCS ) ) | ( (lv_operations_6_0= ruleOperationCS ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassCSAccess().getClassKeyword_0());
              		
            }
            // InternalMiniOCL.g:237:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniOCL.g:238:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniOCL.g:238:4: (lv_name_1_0= RULE_ID )
            // InternalMiniOCL.g:239:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getClassCSAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClassCSRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniOCL.g:255:3: (otherlv_2= 'extends' ( (lv_extends_3_0= rulePathNameCS ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniOCL.g:256:4: otherlv_2= 'extends' ( (lv_extends_3_0= rulePathNameCS ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getClassCSAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMiniOCL.g:260:4: ( (lv_extends_3_0= rulePathNameCS ) )
                    // InternalMiniOCL.g:261:5: (lv_extends_3_0= rulePathNameCS )
                    {
                    // InternalMiniOCL.g:261:5: (lv_extends_3_0= rulePathNameCS )
                    // InternalMiniOCL.g:262:6: lv_extends_3_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassCSAccess().getExtendsPathNameCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_extends_3_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getClassCSRule());
                      						}
                      						set(
                      							current,
                      							"extends",
                      							lv_extends_3_0,
                      							"uk.ac.york.cs.miniocl.MiniOCL.PathNameCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getClassCSAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMiniOCL.g:284:3: ( ( (lv_properties_5_0= rulePropertyCS ) ) | ( (lv_operations_6_0= ruleOperationCS ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }
                else if ( (LA4_0==19) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMiniOCL.g:285:4: ( (lv_properties_5_0= rulePropertyCS ) )
            	    {
            	    // InternalMiniOCL.g:285:4: ( (lv_properties_5_0= rulePropertyCS ) )
            	    // InternalMiniOCL.g:286:5: (lv_properties_5_0= rulePropertyCS )
            	    {
            	    // InternalMiniOCL.g:286:5: (lv_properties_5_0= rulePropertyCS )
            	    // InternalMiniOCL.g:287:6: lv_properties_5_0= rulePropertyCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassCSAccess().getPropertiesPropertyCSParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_properties_5_0=rulePropertyCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClassCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_5_0,
            	      							"uk.ac.york.cs.miniocl.MiniOCL.PropertyCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMiniOCL.g:305:4: ( (lv_operations_6_0= ruleOperationCS ) )
            	    {
            	    // InternalMiniOCL.g:305:4: ( (lv_operations_6_0= ruleOperationCS ) )
            	    // InternalMiniOCL.g:306:5: (lv_operations_6_0= ruleOperationCS )
            	    {
            	    // InternalMiniOCL.g:306:5: (lv_operations_6_0= ruleOperationCS )
            	    // InternalMiniOCL.g:307:6: lv_operations_6_0= ruleOperationCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassCSAccess().getOperationsOperationCSParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_operations_6_0=ruleOperationCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClassCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operations",
            	      							lv_operations_6_0,
            	      							"uk.ac.york.cs.miniocl.MiniOCL.OperationCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getClassCSAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleClassCS"


    // $ANTLR start "entryRulePropertyCS"
    // InternalMiniOCL.g:333:1: entryRulePropertyCS returns [EObject current=null] : iv_rulePropertyCS= rulePropertyCS EOF ;
    public final EObject entryRulePropertyCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCS = null;


        try {
            // InternalMiniOCL.g:333:51: (iv_rulePropertyCS= rulePropertyCS EOF )
            // InternalMiniOCL.g:334:2: iv_rulePropertyCS= rulePropertyCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyCS=rulePropertyCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCS"


    // $ANTLR start "rulePropertyCS"
    // InternalMiniOCL.g:340:1: rulePropertyCS returns [EObject current=null] : (otherlv_0= 'prop' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= rulePathNameCS ) ) otherlv_4= ';' ) ;
    public final EObject rulePropertyCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeRef_3_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:346:2: ( (otherlv_0= 'prop' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= rulePathNameCS ) ) otherlv_4= ';' ) )
            // InternalMiniOCL.g:347:2: (otherlv_0= 'prop' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= rulePathNameCS ) ) otherlv_4= ';' )
            {
            // InternalMiniOCL.g:347:2: (otherlv_0= 'prop' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= rulePathNameCS ) ) otherlv_4= ';' )
            // InternalMiniOCL.g:348:3: otherlv_0= 'prop' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_typeRef_3_0= rulePathNameCS ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyCSAccess().getPropKeyword_0());
              		
            }
            // InternalMiniOCL.g:352:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniOCL.g:353:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniOCL.g:353:4: (lv_name_1_0= RULE_ID )
            // InternalMiniOCL.g:354:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPropertyCSAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyCSRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertyCSAccess().getColonKeyword_2());
              		
            }
            // InternalMiniOCL.g:374:3: ( (lv_typeRef_3_0= rulePathNameCS ) )
            // InternalMiniOCL.g:375:4: (lv_typeRef_3_0= rulePathNameCS )
            {
            // InternalMiniOCL.g:375:4: (lv_typeRef_3_0= rulePathNameCS )
            // InternalMiniOCL.g:376:5: lv_typeRef_3_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyCSAccess().getTypeRefPathNameCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_typeRef_3_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyCSRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_3_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyCSAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "rulePropertyCS"


    // $ANTLR start "entryRuleOperationCS"
    // InternalMiniOCL.g:401:1: entryRuleOperationCS returns [EObject current=null] : iv_ruleOperationCS= ruleOperationCS EOF ;
    public final EObject entryRuleOperationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCS = null;


        try {
            // InternalMiniOCL.g:401:52: (iv_ruleOperationCS= ruleOperationCS EOF )
            // InternalMiniOCL.g:402:2: iv_ruleOperationCS= ruleOperationCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationCS=ruleOperationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationCS"


    // $ANTLR start "ruleOperationCS"
    // InternalMiniOCL.g:408:1: ruleOperationCS returns [EObject current=null] : (otherlv_0= 'op' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterCS ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_resultRef_8_0= rulePathNameCS ) ) otherlv_9= '=' ( (lv_body_10_0= ruleExpCS ) ) otherlv_11= ';' ) ;
    public final EObject ruleOperationCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_resultRef_8_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:414:2: ( (otherlv_0= 'op' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterCS ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_resultRef_8_0= rulePathNameCS ) ) otherlv_9= '=' ( (lv_body_10_0= ruleExpCS ) ) otherlv_11= ';' ) )
            // InternalMiniOCL.g:415:2: (otherlv_0= 'op' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterCS ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_resultRef_8_0= rulePathNameCS ) ) otherlv_9= '=' ( (lv_body_10_0= ruleExpCS ) ) otherlv_11= ';' )
            {
            // InternalMiniOCL.g:415:2: (otherlv_0= 'op' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterCS ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_resultRef_8_0= rulePathNameCS ) ) otherlv_9= '=' ( (lv_body_10_0= ruleExpCS ) ) otherlv_11= ';' )
            // InternalMiniOCL.g:416:3: otherlv_0= 'op' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameterCS ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_resultRef_8_0= rulePathNameCS ) ) otherlv_9= '=' ( (lv_body_10_0= ruleExpCS ) ) otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationCSAccess().getOpKeyword_0());
              		
            }
            // InternalMiniOCL.g:420:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniOCL.g:421:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniOCL.g:421:4: (lv_name_1_0= RULE_ID )
            // InternalMiniOCL.g:422:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getOperationCSAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperationCSRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperationCSAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMiniOCL.g:442:3: ( ( (lv_params_3_0= ruleParameterCS ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniOCL.g:443:4: ( (lv_params_3_0= ruleParameterCS ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )*
                    {
                    // InternalMiniOCL.g:443:4: ( (lv_params_3_0= ruleParameterCS ) )
                    // InternalMiniOCL.g:444:5: (lv_params_3_0= ruleParameterCS )
                    {
                    // InternalMiniOCL.g:444:5: (lv_params_3_0= ruleParameterCS )
                    // InternalMiniOCL.g:445:6: lv_params_3_0= ruleParameterCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationCSAccess().getParamsParameterCSParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_params_3_0=ruleParameterCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationCSRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"uk.ac.york.cs.miniocl.MiniOCL.ParameterCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniOCL.g:462:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMiniOCL.g:463:5: otherlv_4= ',' ( (lv_params_5_0= ruleParameterCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOperationCSAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalMiniOCL.g:467:5: ( (lv_params_5_0= ruleParameterCS ) )
                    	    // InternalMiniOCL.g:468:6: (lv_params_5_0= ruleParameterCS )
                    	    {
                    	    // InternalMiniOCL.g:468:6: (lv_params_5_0= ruleParameterCS )
                    	    // InternalMiniOCL.g:469:7: lv_params_5_0= ruleParameterCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationCSAccess().getParamsParameterCSParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_params_5_0=ruleParameterCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperationCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_5_0,
                    	      								"uk.ac.york.cs.miniocl.MiniOCL.ParameterCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOperationCSAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationCSAccess().getColonKeyword_5());
              		
            }
            // InternalMiniOCL.g:496:3: ( (lv_resultRef_8_0= rulePathNameCS ) )
            // InternalMiniOCL.g:497:4: (lv_resultRef_8_0= rulePathNameCS )
            {
            // InternalMiniOCL.g:497:4: (lv_resultRef_8_0= rulePathNameCS )
            // InternalMiniOCL.g:498:5: lv_resultRef_8_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationCSAccess().getResultRefPathNameCSParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_resultRef_8_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationCSRule());
              					}
              					set(
              						current,
              						"resultRef",
              						lv_resultRef_8_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getOperationCSAccess().getEqualsSignKeyword_7());
              		
            }
            // InternalMiniOCL.g:519:3: ( (lv_body_10_0= ruleExpCS ) )
            // InternalMiniOCL.g:520:4: (lv_body_10_0= ruleExpCS )
            {
            // InternalMiniOCL.g:520:4: (lv_body_10_0= ruleExpCS )
            // InternalMiniOCL.g:521:5: lv_body_10_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationCSAccess().getBodyExpCSParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_body_10_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationCSRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getOperationCSAccess().getSemicolonKeyword_9());
              		
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
    // $ANTLR end "ruleOperationCS"


    // $ANTLR start "entryRuleParameterCS"
    // InternalMiniOCL.g:546:1: entryRuleParameterCS returns [EObject current=null] : iv_ruleParameterCS= ruleParameterCS EOF ;
    public final EObject entryRuleParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCS = null;


        try {
            // InternalMiniOCL.g:546:52: (iv_ruleParameterCS= ruleParameterCS EOF )
            // InternalMiniOCL.g:547:2: iv_ruleParameterCS= ruleParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterCS=ruleParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterCS"


    // $ANTLR start "ruleParameterCS"
    // InternalMiniOCL.g:553:1: ruleParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= rulePathNameCS ) ) ) ;
    public final EObject ruleParameterCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeRef_2_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:559:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= rulePathNameCS ) ) ) )
            // InternalMiniOCL.g:560:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= rulePathNameCS ) ) )
            {
            // InternalMiniOCL.g:560:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= rulePathNameCS ) ) )
            // InternalMiniOCL.g:561:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeRef_2_0= rulePathNameCS ) )
            {
            // InternalMiniOCL.g:561:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMiniOCL.g:562:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMiniOCL.g:562:4: (lv_name_0_0= RULE_ID )
            // InternalMiniOCL.g:563:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParameterCSAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterCSRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterCSAccess().getColonKeyword_1());
              		
            }
            // InternalMiniOCL.g:583:3: ( (lv_typeRef_2_0= rulePathNameCS ) )
            // InternalMiniOCL.g:584:4: (lv_typeRef_2_0= rulePathNameCS )
            {
            // InternalMiniOCL.g:584:4: (lv_typeRef_2_0= rulePathNameCS )
            // InternalMiniOCL.g:585:5: lv_typeRef_2_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterCSAccess().getTypeRefPathNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeRef_2_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterCSRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_2_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.PathNameCS");
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
    // $ANTLR end "ruleParameterCS"


    // $ANTLR start "entryRuleConstraintCS"
    // InternalMiniOCL.g:606:1: entryRuleConstraintCS returns [EObject current=null] : iv_ruleConstraintCS= ruleConstraintCS EOF ;
    public final EObject entryRuleConstraintCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCS = null;


        try {
            // InternalMiniOCL.g:606:53: (iv_ruleConstraintCS= ruleConstraintCS EOF )
            // InternalMiniOCL.g:607:2: iv_ruleConstraintCS= ruleConstraintCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraintCS=ruleConstraintCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintCS"


    // $ANTLR start "ruleConstraintCS"
    // InternalMiniOCL.g:613:1: ruleConstraintCS returns [EObject current=null] : (otherlv_0= 'context' ( (lv_typeRef_1_0= rulePathNameCS ) ) otherlv_2= '{' ( (lv_invariants_3_0= ruleInvariantCS ) )* otherlv_4= '}' ) ;
    public final EObject ruleConstraintCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeRef_1_0 = null;

        EObject lv_invariants_3_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:619:2: ( (otherlv_0= 'context' ( (lv_typeRef_1_0= rulePathNameCS ) ) otherlv_2= '{' ( (lv_invariants_3_0= ruleInvariantCS ) )* otherlv_4= '}' ) )
            // InternalMiniOCL.g:620:2: (otherlv_0= 'context' ( (lv_typeRef_1_0= rulePathNameCS ) ) otherlv_2= '{' ( (lv_invariants_3_0= ruleInvariantCS ) )* otherlv_4= '}' )
            {
            // InternalMiniOCL.g:620:2: (otherlv_0= 'context' ( (lv_typeRef_1_0= rulePathNameCS ) ) otherlv_2= '{' ( (lv_invariants_3_0= ruleInvariantCS ) )* otherlv_4= '}' )
            // InternalMiniOCL.g:621:3: otherlv_0= 'context' ( (lv_typeRef_1_0= rulePathNameCS ) ) otherlv_2= '{' ( (lv_invariants_3_0= ruleInvariantCS ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstraintCSAccess().getContextKeyword_0());
              		
            }
            // InternalMiniOCL.g:625:3: ( (lv_typeRef_1_0= rulePathNameCS ) )
            // InternalMiniOCL.g:626:4: (lv_typeRef_1_0= rulePathNameCS )
            {
            // InternalMiniOCL.g:626:4: (lv_typeRef_1_0= rulePathNameCS )
            // InternalMiniOCL.g:627:5: lv_typeRef_1_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstraintCSAccess().getTypeRefPathNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_typeRef_1_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstraintCSRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_1_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstraintCSAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMiniOCL.g:648:3: ( (lv_invariants_3_0= ruleInvariantCS ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMiniOCL.g:649:4: (lv_invariants_3_0= ruleInvariantCS )
            	    {
            	    // InternalMiniOCL.g:649:4: (lv_invariants_3_0= ruleInvariantCS )
            	    // InternalMiniOCL.g:650:5: lv_invariants_3_0= ruleInvariantCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstraintCSAccess().getInvariantsInvariantCSParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_invariants_3_0=ruleInvariantCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstraintCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"invariants",
            	      						lv_invariants_3_0,
            	      						"uk.ac.york.cs.miniocl.MiniOCL.InvariantCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConstraintCSAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleConstraintCS"


    // $ANTLR start "entryRuleInvariantCS"
    // InternalMiniOCL.g:675:1: entryRuleInvariantCS returns [EObject current=null] : iv_ruleInvariantCS= ruleInvariantCS EOF ;
    public final EObject entryRuleInvariantCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantCS = null;


        try {
            // InternalMiniOCL.g:675:52: (iv_ruleInvariantCS= ruleInvariantCS EOF )
            // InternalMiniOCL.g:676:2: iv_ruleInvariantCS= ruleInvariantCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvariantCS=ruleInvariantCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariantCS"


    // $ANTLR start "ruleInvariantCS"
    // InternalMiniOCL.g:682:1: ruleInvariantCS returns [EObject current=null] : (otherlv_0= 'inv' otherlv_1= ':' ( (lv_exp_2_0= ruleExpCS ) ) otherlv_3= ';' ) ;
    public final EObject ruleInvariantCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:688:2: ( (otherlv_0= 'inv' otherlv_1= ':' ( (lv_exp_2_0= ruleExpCS ) ) otherlv_3= ';' ) )
            // InternalMiniOCL.g:689:2: (otherlv_0= 'inv' otherlv_1= ':' ( (lv_exp_2_0= ruleExpCS ) ) otherlv_3= ';' )
            {
            // InternalMiniOCL.g:689:2: (otherlv_0= 'inv' otherlv_1= ':' ( (lv_exp_2_0= ruleExpCS ) ) otherlv_3= ';' )
            // InternalMiniOCL.g:690:3: otherlv_0= 'inv' otherlv_1= ':' ( (lv_exp_2_0= ruleExpCS ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantCSAccess().getInvKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvariantCSAccess().getColonKeyword_1());
              		
            }
            // InternalMiniOCL.g:698:3: ( (lv_exp_2_0= ruleExpCS ) )
            // InternalMiniOCL.g:699:4: (lv_exp_2_0= ruleExpCS )
            {
            // InternalMiniOCL.g:699:4: (lv_exp_2_0= ruleExpCS )
            // InternalMiniOCL.g:700:5: lv_exp_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvariantCSAccess().getExpExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_exp_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvariantCSRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_2_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInvariantCSAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleInvariantCS"


    // $ANTLR start "entryRuleExpCS"
    // InternalMiniOCL.g:725:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalMiniOCL.g:725:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalMiniOCL.g:726:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalMiniOCL.g:732:1: ruleExpCS returns [EObject current=null] : this_LogicExpCS_0= ruleLogicExpCS ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_LogicExpCS_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:738:2: (this_LogicExpCS_0= ruleLogicExpCS )
            // InternalMiniOCL.g:739:2: this_LogicExpCS_0= ruleLogicExpCS
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpCSAccess().getLogicExpCSParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_LogicExpCS_0=ruleLogicExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_LogicExpCS_0;
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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRuleLogicExpCS"
    // InternalMiniOCL.g:753:1: entryRuleLogicExpCS returns [EObject current=null] : iv_ruleLogicExpCS= ruleLogicExpCS EOF ;
    public final EObject entryRuleLogicExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExpCS = null;


        try {
            // InternalMiniOCL.g:753:51: (iv_ruleLogicExpCS= ruleLogicExpCS EOF )
            // InternalMiniOCL.g:754:2: iv_ruleLogicExpCS= ruleLogicExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicExpCS=ruleLogicExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicExpCS"


    // $ANTLR start "ruleLogicExpCS"
    // InternalMiniOCL.g:760:1: ruleLogicExpCS returns [EObject current=null] : (this_CallExpCS_0= ruleCallExpCS ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleCallExpCS ) ) )* ) ;
    public final EObject ruleLogicExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_CallExpCS_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:766:2: ( (this_CallExpCS_0= ruleCallExpCS ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleCallExpCS ) ) )* ) )
            // InternalMiniOCL.g:767:2: (this_CallExpCS_0= ruleCallExpCS ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleCallExpCS ) ) )* )
            {
            // InternalMiniOCL.g:767:2: (this_CallExpCS_0= ruleCallExpCS ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleCallExpCS ) ) )* )
            // InternalMiniOCL.g:768:3: this_CallExpCS_0= ruleCallExpCS ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleCallExpCS ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicExpCSAccess().getCallExpCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_CallExpCS_0=ruleCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CallExpCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniOCL.g:779:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleCallExpCS ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMiniOCL.g:780:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleCallExpCS ) )
            	    {
            	    // InternalMiniOCL.g:780:4: ()
            	    // InternalMiniOCL.g:781:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicExpCSAccess().getLogicExpCSLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMiniOCL.g:790:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalMiniOCL.g:791:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalMiniOCL.g:791:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalMiniOCL.g:792:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalMiniOCL.g:792:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==23) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==26) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalMiniOCL.g:793:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getLogicExpCSAccess().getOpEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getLogicExpCSRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniOCL.g:804:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getLogicExpCSAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getLogicExpCSRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMiniOCL.g:817:4: ( (lv_right_3_0= ruleCallExpCS ) )
            	    // InternalMiniOCL.g:818:5: (lv_right_3_0= ruleCallExpCS )
            	    {
            	    // InternalMiniOCL.g:818:5: (lv_right_3_0= ruleCallExpCS )
            	    // InternalMiniOCL.g:819:6: lv_right_3_0= ruleCallExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicExpCSAccess().getRightCallExpCSParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleCallExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicExpCSRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"uk.ac.york.cs.miniocl.MiniOCL.CallExpCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleLogicExpCS"


    // $ANTLR start "entryRuleCallExpCS"
    // InternalMiniOCL.g:841:1: entryRuleCallExpCS returns [EObject current=null] : iv_ruleCallExpCS= ruleCallExpCS EOF ;
    public final EObject entryRuleCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpCS = null;


        try {
            // InternalMiniOCL.g:841:50: (iv_ruleCallExpCS= ruleCallExpCS EOF )
            // InternalMiniOCL.g:842:2: iv_ruleCallExpCS= ruleCallExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallExpCS=ruleCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallExpCS"


    // $ANTLR start "ruleCallExpCS"
    // InternalMiniOCL.g:848:1: ruleCallExpCS returns [EObject current=null] : (this_PrimaryExpCS_0= rulePrimaryExpCS ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) ) )* ) ;
    public final EObject ruleCallExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PrimaryExpCS_0 = null;

        EObject lv_nameExp_3_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:854:2: ( (this_PrimaryExpCS_0= rulePrimaryExpCS ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) ) )* ) )
            // InternalMiniOCL.g:855:2: (this_PrimaryExpCS_0= rulePrimaryExpCS ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) ) )* )
            {
            // InternalMiniOCL.g:855:2: (this_PrimaryExpCS_0= rulePrimaryExpCS ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) ) )* )
            // InternalMiniOCL.g:856:3: this_PrimaryExpCS_0= rulePrimaryExpCS ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCallExpCSAccess().getPrimaryExpCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_PrimaryExpCS_0=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniOCL.g:867:3: ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred14_InternalMiniOCL()) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==28) ) {
                    int LA11_3 = input.LA(2);

                    if ( (synpred14_InternalMiniOCL()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniOCL.g:868:4: () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) )
            	    {
            	    // InternalMiniOCL.g:868:4: ()
            	    // InternalMiniOCL.g:869:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getCallExpCSAccess().getCallExpCSSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMiniOCL.g:878:4: ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) )
            	    // InternalMiniOCL.g:879:5: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
            	    {
            	    // InternalMiniOCL.g:879:5: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
            	    // InternalMiniOCL.g:880:6: (lv_op_2_1= '.' | lv_op_2_2= '->' )
            	    {
            	    // InternalMiniOCL.g:880:6: (lv_op_2_1= '.' | lv_op_2_2= '->' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==27) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==28) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMiniOCL.g:881:7: lv_op_2_1= '.'
            	            {
            	            lv_op_2_1=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getCallExpCSAccess().getOpFullStopKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getCallExpCSRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniOCL.g:892:7: lv_op_2_2= '->'
            	            {
            	            lv_op_2_2=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getCallExpCSAccess().getOpHyphenMinusGreaterThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getCallExpCSRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMiniOCL.g:905:4: ( (lv_nameExp_3_0= ruleNameExpCS ) )
            	    // InternalMiniOCL.g:906:5: (lv_nameExp_3_0= ruleNameExpCS )
            	    {
            	    // InternalMiniOCL.g:906:5: (lv_nameExp_3_0= ruleNameExpCS )
            	    // InternalMiniOCL.g:907:6: lv_nameExp_3_0= ruleNameExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCallExpCSAccess().getNameExpNameExpCSParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_nameExp_3_0=ruleNameExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCallExpCSRule());
            	      						}
            	      						set(
            	      							current,
            	      							"nameExp",
            	      							lv_nameExp_3_0,
            	      							"uk.ac.york.cs.miniocl.MiniOCL.NameExpCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleCallExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalMiniOCL.g:929:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalMiniOCL.g:929:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalMiniOCL.g:930:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalMiniOCL.g:936:1: rulePrimaryExpCS returns [EObject current=null] : (this_NameExpCS_0= ruleNameExpCS | this_LiteralExpCS_1= ruleLiteralExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpCS_0 = null;

        EObject this_LiteralExpCS_1 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:942:2: ( (this_NameExpCS_0= ruleNameExpCS | this_LiteralExpCS_1= ruleLiteralExpCS ) )
            // InternalMiniOCL.g:943:2: (this_NameExpCS_0= ruleNameExpCS | this_LiteralExpCS_1= ruleLiteralExpCS )
            {
            // InternalMiniOCL.g:943:2: (this_NameExpCS_0= ruleNameExpCS | this_LiteralExpCS_1= ruleLiteralExpCS )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)||(LA12_0>=29 && LA12_0<=30)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniOCL.g:944:3: this_NameExpCS_0= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NameExpCS_0=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniOCL.g:956:3: this_LiteralExpCS_1= ruleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralExpCS_1=ruleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralExpCS_1;
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


    // $ANTLR start "entryRuleNameExpCS"
    // InternalMiniOCL.g:971:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalMiniOCL.g:971:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalMiniOCL.g:972:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalMiniOCL.g:978:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_expName_0_0= rulePathNameCS ) ) ( (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS ) )? ( (lv_callExp_2_0= ruleCallExpCS ) )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_expName_0_0 = null;

        EObject lv_roundedBrackets_1_0 = null;

        EObject lv_callExp_2_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:984:2: ( ( ( (lv_expName_0_0= rulePathNameCS ) ) ( (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS ) )? ( (lv_callExp_2_0= ruleCallExpCS ) )? ) )
            // InternalMiniOCL.g:985:2: ( ( (lv_expName_0_0= rulePathNameCS ) ) ( (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS ) )? ( (lv_callExp_2_0= ruleCallExpCS ) )? )
            {
            // InternalMiniOCL.g:985:2: ( ( (lv_expName_0_0= rulePathNameCS ) ) ( (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS ) )? ( (lv_callExp_2_0= ruleCallExpCS ) )? )
            // InternalMiniOCL.g:986:3: ( (lv_expName_0_0= rulePathNameCS ) ) ( (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS ) )? ( (lv_callExp_2_0= ruleCallExpCS ) )?
            {
            // InternalMiniOCL.g:986:3: ( (lv_expName_0_0= rulePathNameCS ) )
            // InternalMiniOCL.g:987:4: (lv_expName_0_0= rulePathNameCS )
            {
            // InternalMiniOCL.g:987:4: (lv_expName_0_0= rulePathNameCS )
            // InternalMiniOCL.g:988:5: lv_expName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getExpNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_expName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              					}
              					set(
              						current,
              						"expName",
              						lv_expName_0_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniOCL.g:1005:3: ( (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniOCL.g:1006:4: (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS )
                    {
                    // InternalMiniOCL.g:1006:4: (lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS )
                    // InternalMiniOCL.g:1007:5: lv_roundedBrackets_1_0= ruleRoundedBracketClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getRoundedBracketsRoundedBracketClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_roundedBrackets_1_0=ruleRoundedBracketClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"roundedBrackets",
                      						lv_roundedBrackets_1_0,
                      						"uk.ac.york.cs.miniocl.MiniOCL.RoundedBracketClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniOCL.g:1024:3: ( (lv_callExp_2_0= ruleCallExpCS ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=29 && LA14_0<=30)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniOCL.g:1025:4: (lv_callExp_2_0= ruleCallExpCS )
                    {
                    // InternalMiniOCL.g:1025:4: (lv_callExp_2_0= ruleCallExpCS )
                    // InternalMiniOCL.g:1026:5: lv_callExp_2_0= ruleCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getCallExpCallExpCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_callExp_2_0=ruleCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"callExp",
                      						lv_callExp_2_0,
                      						"uk.ac.york.cs.miniocl.MiniOCL.CallExpCS");
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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleRoundedBracketClauseCS"
    // InternalMiniOCL.g:1047:1: entryRuleRoundedBracketClauseCS returns [EObject current=null] : iv_ruleRoundedBracketClauseCS= ruleRoundedBracketClauseCS EOF ;
    public final EObject entryRuleRoundedBracketClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundedBracketClauseCS = null;


        try {
            // InternalMiniOCL.g:1047:63: (iv_ruleRoundedBracketClauseCS= ruleRoundedBracketClauseCS EOF )
            // InternalMiniOCL.g:1048:2: iv_ruleRoundedBracketClauseCS= ruleRoundedBracketClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundedBracketClauseCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoundedBracketClauseCS=ruleRoundedBracketClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundedBracketClauseCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundedBracketClauseCS"


    // $ANTLR start "ruleRoundedBracketClauseCS"
    // InternalMiniOCL.g:1054:1: ruleRoundedBracketClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_args_2_0= ruleExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleRoundedBracketClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:1060:2: ( ( () otherlv_1= '(' ( ( (lv_args_2_0= ruleExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )* )? otherlv_5= ')' ) )
            // InternalMiniOCL.g:1061:2: ( () otherlv_1= '(' ( ( (lv_args_2_0= ruleExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )* )? otherlv_5= ')' )
            {
            // InternalMiniOCL.g:1061:2: ( () otherlv_1= '(' ( ( (lv_args_2_0= ruleExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )* )? otherlv_5= ')' )
            // InternalMiniOCL.g:1062:3: () otherlv_1= '(' ( ( (lv_args_2_0= ruleExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )* )? otherlv_5= ')'
            {
            // InternalMiniOCL.g:1062:3: ()
            // InternalMiniOCL.g:1063:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoundedBracketClauseCSAccess().getRoundedBracketClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundedBracketClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniOCL.g:1076:3: ( ( (lv_args_2_0= ruleExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||(LA16_0>=29 && LA16_0<=30)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniOCL.g:1077:4: ( (lv_args_2_0= ruleExpCS ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )*
                    {
                    // InternalMiniOCL.g:1077:4: ( (lv_args_2_0= ruleExpCS ) )
                    // InternalMiniOCL.g:1078:5: (lv_args_2_0= ruleExpCS )
                    {
                    // InternalMiniOCL.g:1078:5: (lv_args_2_0= ruleExpCS )
                    // InternalMiniOCL.g:1079:6: lv_args_2_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundedBracketClauseCSAccess().getArgsExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_args_2_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundedBracketClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_2_0,
                      							"uk.ac.york.cs.miniocl.MiniOCL.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniOCL.g:1096:4: (otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMiniOCL.g:1097:5: otherlv_3= ',' ( (lv_args_4_0= ruleExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getRoundedBracketClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMiniOCL.g:1101:5: ( (lv_args_4_0= ruleExpCS ) )
                    	    // InternalMiniOCL.g:1102:6: (lv_args_4_0= ruleExpCS )
                    	    {
                    	    // InternalMiniOCL.g:1102:6: (lv_args_4_0= ruleExpCS )
                    	    // InternalMiniOCL.g:1103:7: lv_args_4_0= ruleExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRoundedBracketClauseCSAccess().getArgsExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_args_4_0=ruleExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRoundedBracketClauseCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_4_0,
                    	      								"uk.ac.york.cs.miniocl.MiniOCL.ExpCS");
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

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRoundedBracketClauseCSAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleRoundedBracketClauseCS"


    // $ANTLR start "entryRuleLiteralExpCS"
    // InternalMiniOCL.g:1130:1: entryRuleLiteralExpCS returns [EObject current=null] : iv_ruleLiteralExpCS= ruleLiteralExpCS EOF ;
    public final EObject entryRuleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpCS = null;


        try {
            // InternalMiniOCL.g:1130:53: (iv_ruleLiteralExpCS= ruleLiteralExpCS EOF )
            // InternalMiniOCL.g:1131:2: iv_ruleLiteralExpCS= ruleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpCS=ruleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpCS"


    // $ANTLR start "ruleLiteralExpCS"
    // InternalMiniOCL.g:1137:1: ruleLiteralExpCS returns [EObject current=null] : (this_IntLiteralExpCS_0= ruleIntLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS ) ;
    public final EObject ruleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:1143:2: ( (this_IntLiteralExpCS_0= ruleIntLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS ) )
            // InternalMiniOCL.g:1144:2: (this_IntLiteralExpCS_0= ruleIntLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS )
            {
            // InternalMiniOCL.g:1144:2: (this_IntLiteralExpCS_0= ruleIntLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case 29:
            case 30:
                {
                alt17=3;
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
                    // InternalMiniOCL.g:1145:3: this_IntLiteralExpCS_0= ruleIntLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpCSAccess().getIntLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteralExpCS_0=ruleIntLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniOCL.g:1157:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalMiniOCL.g:1169:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpCS_2;
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
    // $ANTLR end "ruleLiteralExpCS"


    // $ANTLR start "entryRuleIntLiteralExpCS"
    // InternalMiniOCL.g:1184:1: entryRuleIntLiteralExpCS returns [EObject current=null] : iv_ruleIntLiteralExpCS= ruleIntLiteralExpCS EOF ;
    public final EObject entryRuleIntLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteralExpCS = null;


        try {
            // InternalMiniOCL.g:1184:56: (iv_ruleIntLiteralExpCS= ruleIntLiteralExpCS EOF )
            // InternalMiniOCL.g:1185:2: iv_ruleIntLiteralExpCS= ruleIntLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteralExpCS=ruleIntLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteralExpCS"


    // $ANTLR start "ruleIntLiteralExpCS"
    // InternalMiniOCL.g:1191:1: ruleIntLiteralExpCS returns [EObject current=null] : ( (lv_intSymbol_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_intSymbol_0_0=null;


        	enterRule();

        try {
            // InternalMiniOCL.g:1197:2: ( ( (lv_intSymbol_0_0= RULE_INT ) ) )
            // InternalMiniOCL.g:1198:2: ( (lv_intSymbol_0_0= RULE_INT ) )
            {
            // InternalMiniOCL.g:1198:2: ( (lv_intSymbol_0_0= RULE_INT ) )
            // InternalMiniOCL.g:1199:3: (lv_intSymbol_0_0= RULE_INT )
            {
            // InternalMiniOCL.g:1199:3: (lv_intSymbol_0_0= RULE_INT )
            // InternalMiniOCL.g:1200:4: lv_intSymbol_0_0= RULE_INT
            {
            lv_intSymbol_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_intSymbol_0_0, grammarAccess.getIntLiteralExpCSAccess().getIntSymbolINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntLiteralExpCSRule());
              				}
              				setWithLastConsumed(
              					current,
              					"intSymbol",
              					lv_intSymbol_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleIntLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalMiniOCL.g:1219:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalMiniOCL.g:1219:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalMiniOCL.g:1220:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalMiniOCL.g:1226:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_stringSymbol_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringSymbol_0_0=null;


        	enterRule();

        try {
            // InternalMiniOCL.g:1232:2: ( ( (lv_stringSymbol_0_0= RULE_STRING ) ) )
            // InternalMiniOCL.g:1233:2: ( (lv_stringSymbol_0_0= RULE_STRING ) )
            {
            // InternalMiniOCL.g:1233:2: ( (lv_stringSymbol_0_0= RULE_STRING ) )
            // InternalMiniOCL.g:1234:3: (lv_stringSymbol_0_0= RULE_STRING )
            {
            // InternalMiniOCL.g:1234:3: (lv_stringSymbol_0_0= RULE_STRING )
            // InternalMiniOCL.g:1235:4: lv_stringSymbol_0_0= RULE_STRING
            {
            lv_stringSymbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_stringSymbol_0_0, grammarAccess.getStringLiteralExpCSAccess().getStringSymbolSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringLiteralExpCSRule());
              				}
              				setWithLastConsumed(
              					current,
              					"stringSymbol",
              					lv_stringSymbol_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalMiniOCL.g:1254:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalMiniOCL.g:1254:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalMiniOCL.g:1255:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalMiniOCL.g:1261:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( () ( ( (lv_boolSymbol_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_boolSymbol_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMiniOCL.g:1267:2: ( ( () ( ( (lv_boolSymbol_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalMiniOCL.g:1268:2: ( () ( ( (lv_boolSymbol_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalMiniOCL.g:1268:2: ( () ( ( (lv_boolSymbol_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalMiniOCL.g:1269:3: () ( ( (lv_boolSymbol_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalMiniOCL.g:1269:3: ()
            // InternalMiniOCL.g:1270:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralExpCSAccess().getBooleanExpCSAction_0(),
              					current);
              			
            }

            }

            // InternalMiniOCL.g:1279:3: ( ( (lv_boolSymbol_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==30) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniOCL.g:1280:4: ( (lv_boolSymbol_1_0= 'true' ) )
                    {
                    // InternalMiniOCL.g:1280:4: ( (lv_boolSymbol_1_0= 'true' ) )
                    // InternalMiniOCL.g:1281:5: (lv_boolSymbol_1_0= 'true' )
                    {
                    // InternalMiniOCL.g:1281:5: (lv_boolSymbol_1_0= 'true' )
                    // InternalMiniOCL.g:1282:6: lv_boolSymbol_1_0= 'true'
                    {
                    lv_boolSymbol_1_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_boolSymbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getBoolSymbolTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      						}
                      						setWithLastConsumed(current, "boolSymbol", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniOCL.g:1295:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralExpCSAccess().getFalseKeyword_1_1());
                      			
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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRulePathNameCS"
    // InternalMiniOCL.g:1304:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalMiniOCL.g:1304:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalMiniOCL.g:1305:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalMiniOCL.g:1311:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= rulePathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalMiniOCL.g:1317:2: ( ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= rulePathElementCS ) ) )* ) )
            // InternalMiniOCL.g:1318:2: ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= rulePathElementCS ) ) )* )
            {
            // InternalMiniOCL.g:1318:2: ( ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= rulePathElementCS ) ) )* )
            // InternalMiniOCL.g:1319:3: ( (lv_path_0_0= rulePathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= rulePathElementCS ) ) )*
            {
            // InternalMiniOCL.g:1319:3: ( (lv_path_0_0= rulePathElementCS ) )
            // InternalMiniOCL.g:1320:4: (lv_path_0_0= rulePathElementCS )
            {
            // InternalMiniOCL.g:1320:4: (lv_path_0_0= rulePathElementCS )
            // InternalMiniOCL.g:1321:5: lv_path_0_0= rulePathElementCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_path_0_0=rulePathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              					}
              					add(
              						current,
              						"path",
              						lv_path_0_0,
              						"uk.ac.york.cs.miniocl.MiniOCL.PathElementCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniOCL.g:1338:3: (otherlv_1= '::' ( (lv_path_2_0= rulePathElementCS ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniOCL.g:1339:4: otherlv_1= '::' ( (lv_path_2_0= rulePathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalMiniOCL.g:1343:4: ( (lv_path_2_0= rulePathElementCS ) )
            	    // InternalMiniOCL.g:1344:5: (lv_path_2_0= rulePathElementCS )
            	    {
            	    // InternalMiniOCL.g:1344:5: (lv_path_2_0= rulePathElementCS )
            	    // InternalMiniOCL.g:1345:6: lv_path_2_0= rulePathElementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_path_2_0=rulePathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"path",
            	      							lv_path_2_0,
            	      							"uk.ac.york.cs.miniocl.MiniOCL.PathElementCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "entryRulePathElementCS"
    // InternalMiniOCL.g:1367:1: entryRulePathElementCS returns [EObject current=null] : iv_rulePathElementCS= rulePathElementCS EOF ;
    public final EObject entryRulePathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElementCS = null;


        try {
            // InternalMiniOCL.g:1367:54: (iv_rulePathElementCS= rulePathElementCS EOF )
            // InternalMiniOCL.g:1368:2: iv_rulePathElementCS= rulePathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathElementCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathElementCS=rulePathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathElementCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalMiniOCL.g:1374:1: rulePathElementCS returns [EObject current=null] : ( (lv_pathName_0_0= RULE_ID ) ) ;
    public final EObject rulePathElementCS() throws RecognitionException {
        EObject current = null;

        Token lv_pathName_0_0=null;


        	enterRule();

        try {
            // InternalMiniOCL.g:1380:2: ( ( (lv_pathName_0_0= RULE_ID ) ) )
            // InternalMiniOCL.g:1381:2: ( (lv_pathName_0_0= RULE_ID ) )
            {
            // InternalMiniOCL.g:1381:2: ( (lv_pathName_0_0= RULE_ID ) )
            // InternalMiniOCL.g:1382:3: (lv_pathName_0_0= RULE_ID )
            {
            // InternalMiniOCL.g:1382:3: (lv_pathName_0_0= RULE_ID )
            // InternalMiniOCL.g:1383:4: lv_pathName_0_0= RULE_ID
            {
            lv_pathName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_pathName_0_0, grammarAccess.getPathElementCSAccess().getPathNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPathElementCSRule());
              				}
              				setWithLastConsumed(
              					current,
              					"pathName",
              					lv_pathName_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // $ANTLR end "rulePathElementCS"

    // $ANTLR start synpred14_InternalMiniOCL
    public final void synpred14_InternalMiniOCL_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_nameExp_3_0 = null;


        // InternalMiniOCL.g:868:4: ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) ) )
        // InternalMiniOCL.g:868:4: () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_nameExp_3_0= ruleNameExpCS ) )
        {
        // InternalMiniOCL.g:868:4: ()
        // InternalMiniOCL.g:869:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMiniOCL.g:878:4: ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) )
        // InternalMiniOCL.g:879:5: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
        {
        // InternalMiniOCL.g:879:5: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
        // InternalMiniOCL.g:880:6: (lv_op_2_1= '.' | lv_op_2_2= '->' )
        {
        // InternalMiniOCL.g:880:6: (lv_op_2_1= '.' | lv_op_2_2= '->' )
        int alt22=2;
        int LA22_0 = input.LA(1);

        if ( (LA22_0==27) ) {
            alt22=1;
        }
        else if ( (LA22_0==28) ) {
            alt22=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 22, 0, input);

            throw nvae;
        }
        switch (alt22) {
            case 1 :
                // InternalMiniOCL.g:881:7: lv_op_2_1= '.'
                {
                lv_op_2_1=(Token)match(input,27,FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMiniOCL.g:892:7: lv_op_2_2= '->'
                {
                lv_op_2_2=(Token)match(input,28,FOLLOW_4); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalMiniOCL.g:905:4: ( (lv_nameExp_3_0= ruleNameExpCS ) )
        // InternalMiniOCL.g:906:5: (lv_nameExp_3_0= ruleNameExpCS )
        {
        // InternalMiniOCL.g:906:5: (lv_nameExp_3_0= ruleNameExpCS )
        // InternalMiniOCL.g:907:6: lv_nameExp_3_0= ruleNameExpCS
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCallExpCSAccess().getNameExpNameExpCSParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_nameExp_3_0=ruleNameExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalMiniOCL

    // Delegated rules

    public final boolean synpred14_InternalMiniOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMiniOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060100072L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000072L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060400070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000002L});

}