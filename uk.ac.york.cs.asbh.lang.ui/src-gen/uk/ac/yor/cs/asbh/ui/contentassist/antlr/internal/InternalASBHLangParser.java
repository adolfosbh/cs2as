package uk.ac.yor.cs.asbh.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uk.ac.yor.cs.asbh.services.ASBHLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASBHLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'}'", "'ownedX'", "','", "'X'", "'ownsY'", "'Z'", "'Y1'", "'ownsZ'", "'Y2'", "'isA1'"
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
    public String getGrammarFileName() { return "../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g"; }


     
     	private ASBHLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ASBHLangGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRoot"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:61:1: ( ruleRoot EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot61);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:74:1: ( ( rule__Root__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:76:1: ( rule__Root__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:76:2: rule__Root__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0_in_ruleRoot94);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleY"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:88:1: entryRuleY : ruleY EOF ;
    public final void entryRuleY() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:89:1: ( ruleY EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:90:1: ruleY EOF
            {
             before(grammarAccess.getYRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY_in_entryRuleY121);
            ruleY();

            state._fsp--;

             after(grammarAccess.getYRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:97:1: ruleY : ( ( rule__Y__Alternatives ) ) ;
    public final void ruleY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:101:2: ( ( ( rule__Y__Alternatives ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:102:1: ( ( rule__Y__Alternatives ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:102:1: ( ( rule__Y__Alternatives ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:103:1: ( rule__Y__Alternatives )
            {
             before(grammarAccess.getYAccess().getAlternatives()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:104:1: ( rule__Y__Alternatives )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:104:2: rule__Y__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y__Alternatives_in_ruleY154);
            rule__Y__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleX"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:116:1: entryRuleX : ruleX EOF ;
    public final void entryRuleX() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:117:1: ( ruleX EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:118:1: ruleX EOF
            {
             before(grammarAccess.getXRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleX_in_entryRuleX181);
            ruleX();

            state._fsp--;

             after(grammarAccess.getXRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleX188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleX"


    // $ANTLR start "ruleX"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:125:1: ruleX : ( ( rule__X__Group__0 ) ) ;
    public final void ruleX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:129:2: ( ( ( rule__X__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:130:1: ( ( rule__X__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:130:1: ( ( rule__X__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:131:1: ( rule__X__Group__0 )
            {
             before(grammarAccess.getXAccess().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:132:1: ( rule__X__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:132:2: rule__X__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group__0_in_ruleX214);
            rule__X__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleX"


    // $ANTLR start "entryRuleZ"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:144:1: entryRuleZ : ruleZ EOF ;
    public final void entryRuleZ() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:145:1: ( ruleZ EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:146:1: ruleZ EOF
            {
             before(grammarAccess.getZRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleZ_in_entryRuleZ241);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getZRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleZ248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZ"


    // $ANTLR start "ruleZ"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:153:1: ruleZ : ( ( rule__Z__Group__0 ) ) ;
    public final void ruleZ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:157:2: ( ( ( rule__Z__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:158:1: ( ( rule__Z__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:158:1: ( ( rule__Z__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:159:1: ( rule__Z__Group__0 )
            {
             before(grammarAccess.getZAccess().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:160:1: ( rule__Z__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:160:2: rule__Z__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Z__Group__0_in_ruleZ274);
            rule__Z__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZ"


    // $ANTLR start "entryRuleY1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:172:1: entryRuleY1 : ruleY1 EOF ;
    public final void entryRuleY1() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:173:1: ( ruleY1 EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:174:1: ruleY1 EOF
            {
             before(grammarAccess.getY1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY1_in_entryRuleY1301);
            ruleY1();

            state._fsp--;

             after(grammarAccess.getY1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY1308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleY1"


    // $ANTLR start "ruleY1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:181:1: ruleY1 : ( ( rule__Y1__Group__0 ) ) ;
    public final void ruleY1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:185:2: ( ( ( rule__Y1__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:186:1: ( ( rule__Y1__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:186:1: ( ( rule__Y1__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:187:1: ( rule__Y1__Group__0 )
            {
             before(grammarAccess.getY1Access().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:188:1: ( rule__Y1__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:188:2: rule__Y1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__0_in_ruleY1334);
            rule__Y1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getY1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY1"


    // $ANTLR start "entryRuleY2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:200:1: entryRuleY2 : ruleY2 EOF ;
    public final void entryRuleY2() throws RecognitionException {
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:201:1: ( ruleY2 EOF )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:202:1: ruleY2 EOF
            {
             before(grammarAccess.getY2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleY2_in_entryRuleY2361);
            ruleY2();

            state._fsp--;

             after(grammarAccess.getY2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleY2368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleY2"


    // $ANTLR start "ruleY2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:209:1: ruleY2 : ( ( rule__Y2__Group__0 ) ) ;
    public final void ruleY2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:213:2: ( ( ( rule__Y2__Group__0 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:214:1: ( ( rule__Y2__Group__0 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:214:1: ( ( rule__Y2__Group__0 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:215:1: ( rule__Y2__Group__0 )
            {
             before(grammarAccess.getY2Access().getGroup()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:216:1: ( rule__Y2__Group__0 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:216:2: rule__Y2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__0_in_ruleY2394);
            rule__Y2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getY2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY2"


    // $ANTLR start "rule__Y__Alternatives"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:228:1: rule__Y__Alternatives : ( ( ruleY1 ) | ( ruleY2 ) );
    public final void rule__Y__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:232:1: ( ( ruleY1 ) | ( ruleY2 ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:233:1: ( ruleY1 )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:233:1: ( ruleY1 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:234:1: ruleY1
                    {
                     before(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleY1_in_rule__Y__Alternatives430);
                    ruleY1();

                    state._fsp--;

                     after(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:239:6: ( ruleY2 )
                    {
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:239:6: ( ruleY2 )
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:240:1: ruleY2
                    {
                     before(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleY2_in_rule__Y__Alternatives447);
                    ruleY2();

                    state._fsp--;

                     after(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:252:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:256:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:257:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0477);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0480);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:264:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:268:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:269:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:269:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:270:1: ()
            {
             before(grammarAccess.getRootAccess().getSRootAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:271:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:273:1: 
            {
            }

             after(grammarAccess.getRootAccess().getSRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:283:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:287:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:288:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1538);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2_in_rule__Root__Group__1541);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:295:1: rule__Root__Group__1__Impl : ( 'Root' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:299:1: ( ( 'Root' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:300:1: ( 'Root' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:300:1: ( 'Root' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:301:1: 'Root'
            {
             before(grammarAccess.getRootAccess().getRootKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Root__Group__1__Impl569); 
             after(grammarAccess.getRootAccess().getRootKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:314:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:318:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:319:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__2600);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__3_in_rule__Root__Group__2603);
            rule__Root__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:326:1: rule__Root__Group__2__Impl : ( '{' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:330:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:331:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:331:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:332:1: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Root__Group__2__Impl631); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:345:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:349:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:350:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__3__Impl_in_rule__Root__Group__3662);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__4_in_rule__Root__Group__3665);
            rule__Root__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:357:1: rule__Root__Group__3__Impl : ( ( rule__Root__Group_3__0 )? ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:361:1: ( ( ( rule__Root__Group_3__0 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:362:1: ( ( rule__Root__Group_3__0 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:362:1: ( ( rule__Root__Group_3__0 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:363:1: ( rule__Root__Group_3__0 )?
            {
             before(grammarAccess.getRootAccess().getGroup_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:364:1: ( rule__Root__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:364:2: rule__Root__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__0_in_rule__Root__Group__3__Impl692);
                    rule__Root__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:374:1: rule__Root__Group__4 : rule__Root__Group__4__Impl ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:378:1: ( rule__Root__Group__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:379:2: rule__Root__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__4__Impl_in_rule__Root__Group__4723);
            rule__Root__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:385:1: rule__Root__Group__4__Impl : ( '}' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:389:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:390:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:390:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:391:1: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Root__Group__4__Impl751); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group_3__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:414:1: rule__Root__Group_3__0 : rule__Root__Group_3__0__Impl rule__Root__Group_3__1 ;
    public final void rule__Root__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:418:1: ( rule__Root__Group_3__0__Impl rule__Root__Group_3__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:419:2: rule__Root__Group_3__0__Impl rule__Root__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__0__Impl_in_rule__Root__Group_3__0792);
            rule__Root__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__1_in_rule__Root__Group_3__0795);
            rule__Root__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__0"


    // $ANTLR start "rule__Root__Group_3__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:426:1: rule__Root__Group_3__0__Impl : ( 'ownedX' ) ;
    public final void rule__Root__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:430:1: ( ( 'ownedX' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:431:1: ( 'ownedX' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:431:1: ( 'ownedX' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:432:1: 'ownedX'
            {
             before(grammarAccess.getRootAccess().getOwnedXKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Root__Group_3__0__Impl823); 
             after(grammarAccess.getRootAccess().getOwnedXKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__0__Impl"


    // $ANTLR start "rule__Root__Group_3__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:445:1: rule__Root__Group_3__1 : rule__Root__Group_3__1__Impl rule__Root__Group_3__2 ;
    public final void rule__Root__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:449:1: ( rule__Root__Group_3__1__Impl rule__Root__Group_3__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:450:2: rule__Root__Group_3__1__Impl rule__Root__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__1__Impl_in_rule__Root__Group_3__1854);
            rule__Root__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__2_in_rule__Root__Group_3__1857);
            rule__Root__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__1"


    // $ANTLR start "rule__Root__Group_3__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:457:1: rule__Root__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Root__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:461:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:462:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:462:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:463:1: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Root__Group_3__1__Impl885); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__1__Impl"


    // $ANTLR start "rule__Root__Group_3__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:476:1: rule__Root__Group_3__2 : rule__Root__Group_3__2__Impl rule__Root__Group_3__3 ;
    public final void rule__Root__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:480:1: ( rule__Root__Group_3__2__Impl rule__Root__Group_3__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:481:2: rule__Root__Group_3__2__Impl rule__Root__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__2__Impl_in_rule__Root__Group_3__2916);
            rule__Root__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__3_in_rule__Root__Group_3__2919);
            rule__Root__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__2"


    // $ANTLR start "rule__Root__Group_3__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:488:1: rule__Root__Group_3__2__Impl : ( ( rule__Root__OwnedXAssignment_3_2 ) ) ;
    public final void rule__Root__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:492:1: ( ( ( rule__Root__OwnedXAssignment_3_2 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:493:1: ( ( rule__Root__OwnedXAssignment_3_2 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:493:1: ( ( rule__Root__OwnedXAssignment_3_2 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:494:1: ( rule__Root__OwnedXAssignment_3_2 )
            {
             before(grammarAccess.getRootAccess().getOwnedXAssignment_3_2()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:495:1: ( rule__Root__OwnedXAssignment_3_2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:495:2: rule__Root__OwnedXAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__OwnedXAssignment_3_2_in_rule__Root__Group_3__2__Impl946);
            rule__Root__OwnedXAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getOwnedXAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__2__Impl"


    // $ANTLR start "rule__Root__Group_3__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:505:1: rule__Root__Group_3__3 : rule__Root__Group_3__3__Impl rule__Root__Group_3__4 ;
    public final void rule__Root__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:509:1: ( rule__Root__Group_3__3__Impl rule__Root__Group_3__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:510:2: rule__Root__Group_3__3__Impl rule__Root__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__3__Impl_in_rule__Root__Group_3__3976);
            rule__Root__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__4_in_rule__Root__Group_3__3979);
            rule__Root__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__3"


    // $ANTLR start "rule__Root__Group_3__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:517:1: rule__Root__Group_3__3__Impl : ( ( rule__Root__Group_3_3__0 )* ) ;
    public final void rule__Root__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:521:1: ( ( ( rule__Root__Group_3_3__0 )* ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:522:1: ( ( rule__Root__Group_3_3__0 )* )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:522:1: ( ( rule__Root__Group_3_3__0 )* )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:523:1: ( rule__Root__Group_3_3__0 )*
            {
             before(grammarAccess.getRootAccess().getGroup_3_3()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:524:1: ( rule__Root__Group_3_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:524:2: rule__Root__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3_3__0_in_rule__Root__Group_3__3__Impl1006);
            	    rule__Root__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__3__Impl"


    // $ANTLR start "rule__Root__Group_3__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:534:1: rule__Root__Group_3__4 : rule__Root__Group_3__4__Impl ;
    public final void rule__Root__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:538:1: ( rule__Root__Group_3__4__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:539:2: rule__Root__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3__4__Impl_in_rule__Root__Group_3__41037);
            rule__Root__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__4"


    // $ANTLR start "rule__Root__Group_3__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:545:1: rule__Root__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Root__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:549:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:550:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:550:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:551:1: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Root__Group_3__4__Impl1065); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__4__Impl"


    // $ANTLR start "rule__Root__Group_3_3__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:574:1: rule__Root__Group_3_3__0 : rule__Root__Group_3_3__0__Impl rule__Root__Group_3_3__1 ;
    public final void rule__Root__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:578:1: ( rule__Root__Group_3_3__0__Impl rule__Root__Group_3_3__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:579:2: rule__Root__Group_3_3__0__Impl rule__Root__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3_3__0__Impl_in_rule__Root__Group_3_3__01106);
            rule__Root__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3_3__1_in_rule__Root__Group_3_3__01109);
            rule__Root__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3_3__0"


    // $ANTLR start "rule__Root__Group_3_3__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:586:1: rule__Root__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Root__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:590:1: ( ( ',' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:591:1: ( ',' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:591:1: ( ',' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:592:1: ','
            {
             before(grammarAccess.getRootAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Root__Group_3_3__0__Impl1137); 
             after(grammarAccess.getRootAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3_3__0__Impl"


    // $ANTLR start "rule__Root__Group_3_3__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:605:1: rule__Root__Group_3_3__1 : rule__Root__Group_3_3__1__Impl ;
    public final void rule__Root__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:609:1: ( rule__Root__Group_3_3__1__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:610:2: rule__Root__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_3_3__1__Impl_in_rule__Root__Group_3_3__11168);
            rule__Root__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3_3__1"


    // $ANTLR start "rule__Root__Group_3_3__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:616:1: rule__Root__Group_3_3__1__Impl : ( ( rule__Root__OwnedXAssignment_3_3_1 ) ) ;
    public final void rule__Root__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:620:1: ( ( ( rule__Root__OwnedXAssignment_3_3_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:621:1: ( ( rule__Root__OwnedXAssignment_3_3_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:621:1: ( ( rule__Root__OwnedXAssignment_3_3_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:622:1: ( rule__Root__OwnedXAssignment_3_3_1 )
            {
             before(grammarAccess.getRootAccess().getOwnedXAssignment_3_3_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:623:1: ( rule__Root__OwnedXAssignment_3_3_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:623:2: rule__Root__OwnedXAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__OwnedXAssignment_3_3_1_in_rule__Root__Group_3_3__1__Impl1195);
            rule__Root__OwnedXAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getOwnedXAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3_3__1__Impl"


    // $ANTLR start "rule__X__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:637:1: rule__X__Group__0 : rule__X__Group__0__Impl rule__X__Group__1 ;
    public final void rule__X__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:641:1: ( rule__X__Group__0__Impl rule__X__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:642:2: rule__X__Group__0__Impl rule__X__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group__0__Impl_in_rule__X__Group__01229);
            rule__X__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__X__Group__1_in_rule__X__Group__01232);
            rule__X__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__0"


    // $ANTLR start "rule__X__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:649:1: rule__X__Group__0__Impl : ( () ) ;
    public final void rule__X__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:653:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:654:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:654:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:655:1: ()
            {
             before(grammarAccess.getXAccess().getXAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:656:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:658:1: 
            {
            }

             after(grammarAccess.getXAccess().getXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__0__Impl"


    // $ANTLR start "rule__X__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:668:1: rule__X__Group__1 : rule__X__Group__1__Impl rule__X__Group__2 ;
    public final void rule__X__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:672:1: ( rule__X__Group__1__Impl rule__X__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:673:2: rule__X__Group__1__Impl rule__X__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group__1__Impl_in_rule__X__Group__11290);
            rule__X__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__X__Group__2_in_rule__X__Group__11293);
            rule__X__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__1"


    // $ANTLR start "rule__X__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:680:1: rule__X__Group__1__Impl : ( ( rule__X__IsA1Assignment_1 )? ) ;
    public final void rule__X__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:684:1: ( ( ( rule__X__IsA1Assignment_1 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:685:1: ( ( rule__X__IsA1Assignment_1 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:685:1: ( ( rule__X__IsA1Assignment_1 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:686:1: ( rule__X__IsA1Assignment_1 )?
            {
             before(grammarAccess.getXAccess().getIsA1Assignment_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:687:1: ( rule__X__IsA1Assignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:687:2: rule__X__IsA1Assignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__X__IsA1Assignment_1_in_rule__X__Group__1__Impl1320);
                    rule__X__IsA1Assignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAccess().getIsA1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__1__Impl"


    // $ANTLR start "rule__X__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:697:1: rule__X__Group__2 : rule__X__Group__2__Impl rule__X__Group__3 ;
    public final void rule__X__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:701:1: ( rule__X__Group__2__Impl rule__X__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:702:2: rule__X__Group__2__Impl rule__X__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group__2__Impl_in_rule__X__Group__21351);
            rule__X__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__X__Group__3_in_rule__X__Group__21354);
            rule__X__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__2"


    // $ANTLR start "rule__X__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:709:1: rule__X__Group__2__Impl : ( 'X' ) ;
    public final void rule__X__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:713:1: ( ( 'X' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:714:1: ( 'X' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:714:1: ( 'X' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:715:1: 'X'
            {
             before(grammarAccess.getXAccess().getXKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__X__Group__2__Impl1382); 
             after(grammarAccess.getXAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__2__Impl"


    // $ANTLR start "rule__X__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:728:1: rule__X__Group__3 : rule__X__Group__3__Impl rule__X__Group__4 ;
    public final void rule__X__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:732:1: ( rule__X__Group__3__Impl rule__X__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:733:2: rule__X__Group__3__Impl rule__X__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group__3__Impl_in_rule__X__Group__31413);
            rule__X__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__X__Group__4_in_rule__X__Group__31416);
            rule__X__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__3"


    // $ANTLR start "rule__X__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:740:1: rule__X__Group__3__Impl : ( '{' ) ;
    public final void rule__X__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:744:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:745:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:745:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:746:1: '{'
            {
             before(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__X__Group__3__Impl1444); 
             after(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__3__Impl"


    // $ANTLR start "rule__X__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:759:1: rule__X__Group__4 : rule__X__Group__4__Impl rule__X__Group__5 ;
    public final void rule__X__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:763:1: ( rule__X__Group__4__Impl rule__X__Group__5 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:764:2: rule__X__Group__4__Impl rule__X__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group__4__Impl_in_rule__X__Group__41475);
            rule__X__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__X__Group__5_in_rule__X__Group__41478);
            rule__X__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__4"


    // $ANTLR start "rule__X__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:771:1: rule__X__Group__4__Impl : ( ( rule__X__Group_4__0 )? ) ;
    public final void rule__X__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:775:1: ( ( ( rule__X__Group_4__0 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:776:1: ( ( rule__X__Group_4__0 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:776:1: ( ( rule__X__Group_4__0 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:777:1: ( rule__X__Group_4__0 )?
            {
             before(grammarAccess.getXAccess().getGroup_4()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:778:1: ( rule__X__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:778:2: rule__X__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__X__Group_4__0_in_rule__X__Group__4__Impl1505);
                    rule__X__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__4__Impl"


    // $ANTLR start "rule__X__Group__5"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:788:1: rule__X__Group__5 : rule__X__Group__5__Impl ;
    public final void rule__X__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:792:1: ( rule__X__Group__5__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:793:2: rule__X__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group__5__Impl_in_rule__X__Group__51536);
            rule__X__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__5"


    // $ANTLR start "rule__X__Group__5__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:799:1: rule__X__Group__5__Impl : ( '}' ) ;
    public final void rule__X__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:803:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:804:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:804:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:805:1: '}'
            {
             before(grammarAccess.getXAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__X__Group__5__Impl1564); 
             after(grammarAccess.getXAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group__5__Impl"


    // $ANTLR start "rule__X__Group_4__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:830:1: rule__X__Group_4__0 : rule__X__Group_4__0__Impl rule__X__Group_4__1 ;
    public final void rule__X__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:834:1: ( rule__X__Group_4__0__Impl rule__X__Group_4__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:835:2: rule__X__Group_4__0__Impl rule__X__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group_4__0__Impl_in_rule__X__Group_4__01607);
            rule__X__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__X__Group_4__1_in_rule__X__Group_4__01610);
            rule__X__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group_4__0"


    // $ANTLR start "rule__X__Group_4__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:842:1: rule__X__Group_4__0__Impl : ( 'ownsY' ) ;
    public final void rule__X__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:846:1: ( ( 'ownsY' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:847:1: ( 'ownsY' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:847:1: ( 'ownsY' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:848:1: 'ownsY'
            {
             before(grammarAccess.getXAccess().getOwnsYKeyword_4_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__X__Group_4__0__Impl1638); 
             after(grammarAccess.getXAccess().getOwnsYKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group_4__0__Impl"


    // $ANTLR start "rule__X__Group_4__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:861:1: rule__X__Group_4__1 : rule__X__Group_4__1__Impl ;
    public final void rule__X__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:865:1: ( rule__X__Group_4__1__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:866:2: rule__X__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__Group_4__1__Impl_in_rule__X__Group_4__11669);
            rule__X__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group_4__1"


    // $ANTLR start "rule__X__Group_4__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:872:1: rule__X__Group_4__1__Impl : ( ( rule__X__OwnsYAssignment_4_1 ) ) ;
    public final void rule__X__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:876:1: ( ( ( rule__X__OwnsYAssignment_4_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:877:1: ( ( rule__X__OwnsYAssignment_4_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:877:1: ( ( rule__X__OwnsYAssignment_4_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:878:1: ( rule__X__OwnsYAssignment_4_1 )
            {
             before(grammarAccess.getXAccess().getOwnsYAssignment_4_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:879:1: ( rule__X__OwnsYAssignment_4_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:879:2: rule__X__OwnsYAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__X__OwnsYAssignment_4_1_in_rule__X__Group_4__1__Impl1696);
            rule__X__OwnsYAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXAccess().getOwnsYAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__Group_4__1__Impl"


    // $ANTLR start "rule__Z__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:893:1: rule__Z__Group__0 : rule__Z__Group__0__Impl rule__Z__Group__1 ;
    public final void rule__Z__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:897:1: ( rule__Z__Group__0__Impl rule__Z__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:898:2: rule__Z__Group__0__Impl rule__Z__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Z__Group__0__Impl_in_rule__Z__Group__01730);
            rule__Z__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Z__Group__1_in_rule__Z__Group__01733);
            rule__Z__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__0"


    // $ANTLR start "rule__Z__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:905:1: rule__Z__Group__0__Impl : ( () ) ;
    public final void rule__Z__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:909:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:910:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:910:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:911:1: ()
            {
             before(grammarAccess.getZAccess().getZAction_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:912:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:914:1: 
            {
            }

             after(grammarAccess.getZAccess().getZAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__0__Impl"


    // $ANTLR start "rule__Z__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:924:1: rule__Z__Group__1 : rule__Z__Group__1__Impl ;
    public final void rule__Z__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:928:1: ( rule__Z__Group__1__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:929:2: rule__Z__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Z__Group__1__Impl_in_rule__Z__Group__11791);
            rule__Z__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__1"


    // $ANTLR start "rule__Z__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:935:1: rule__Z__Group__1__Impl : ( 'Z' ) ;
    public final void rule__Z__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:939:1: ( ( 'Z' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:940:1: ( 'Z' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:940:1: ( 'Z' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:941:1: 'Z'
            {
             before(grammarAccess.getZAccess().getZKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Z__Group__1__Impl1819); 
             after(grammarAccess.getZAccess().getZKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Z__Group__1__Impl"


    // $ANTLR start "rule__Y1__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:958:1: rule__Y1__Group__0 : rule__Y1__Group__0__Impl rule__Y1__Group__1 ;
    public final void rule__Y1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:962:1: ( rule__Y1__Group__0__Impl rule__Y1__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:963:2: rule__Y1__Group__0__Impl rule__Y1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__0__Impl_in_rule__Y1__Group__01854);
            rule__Y1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__1_in_rule__Y1__Group__01857);
            rule__Y1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__0"


    // $ANTLR start "rule__Y1__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:970:1: rule__Y1__Group__0__Impl : ( () ) ;
    public final void rule__Y1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:974:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:975:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:975:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:976:1: ()
            {
             before(grammarAccess.getY1Access().getY1Action_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:977:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:979:1: 
            {
            }

             after(grammarAccess.getY1Access().getY1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__0__Impl"


    // $ANTLR start "rule__Y1__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:989:1: rule__Y1__Group__1 : rule__Y1__Group__1__Impl rule__Y1__Group__2 ;
    public final void rule__Y1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:993:1: ( rule__Y1__Group__1__Impl rule__Y1__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:994:2: rule__Y1__Group__1__Impl rule__Y1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__1__Impl_in_rule__Y1__Group__11915);
            rule__Y1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__2_in_rule__Y1__Group__11918);
            rule__Y1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__1"


    // $ANTLR start "rule__Y1__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1001:1: rule__Y1__Group__1__Impl : ( 'Y1' ) ;
    public final void rule__Y1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1005:1: ( ( 'Y1' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1006:1: ( 'Y1' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1006:1: ( 'Y1' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1007:1: 'Y1'
            {
             before(grammarAccess.getY1Access().getY1Keyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Y1__Group__1__Impl1946); 
             after(grammarAccess.getY1Access().getY1Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__1__Impl"


    // $ANTLR start "rule__Y1__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1020:1: rule__Y1__Group__2 : rule__Y1__Group__2__Impl rule__Y1__Group__3 ;
    public final void rule__Y1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1024:1: ( rule__Y1__Group__2__Impl rule__Y1__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1025:2: rule__Y1__Group__2__Impl rule__Y1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__2__Impl_in_rule__Y1__Group__21977);
            rule__Y1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__3_in_rule__Y1__Group__21980);
            rule__Y1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__2"


    // $ANTLR start "rule__Y1__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1032:1: rule__Y1__Group__2__Impl : ( ( rule__Y1__NameAssignment_2 ) ) ;
    public final void rule__Y1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1036:1: ( ( ( rule__Y1__NameAssignment_2 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1037:1: ( ( rule__Y1__NameAssignment_2 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1037:1: ( ( rule__Y1__NameAssignment_2 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1038:1: ( rule__Y1__NameAssignment_2 )
            {
             before(grammarAccess.getY1Access().getNameAssignment_2()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1039:1: ( rule__Y1__NameAssignment_2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1039:2: rule__Y1__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__NameAssignment_2_in_rule__Y1__Group__2__Impl2007);
            rule__Y1__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getY1Access().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__2__Impl"


    // $ANTLR start "rule__Y1__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1049:1: rule__Y1__Group__3 : rule__Y1__Group__3__Impl rule__Y1__Group__4 ;
    public final void rule__Y1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1053:1: ( rule__Y1__Group__3__Impl rule__Y1__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1054:2: rule__Y1__Group__3__Impl rule__Y1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__3__Impl_in_rule__Y1__Group__32037);
            rule__Y1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__4_in_rule__Y1__Group__32040);
            rule__Y1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__3"


    // $ANTLR start "rule__Y1__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1061:1: rule__Y1__Group__3__Impl : ( '{' ) ;
    public final void rule__Y1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1065:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1066:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1066:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1067:1: '{'
            {
             before(grammarAccess.getY1Access().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Y1__Group__3__Impl2068); 
             after(grammarAccess.getY1Access().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__3__Impl"


    // $ANTLR start "rule__Y1__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1080:1: rule__Y1__Group__4 : rule__Y1__Group__4__Impl rule__Y1__Group__5 ;
    public final void rule__Y1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1084:1: ( rule__Y1__Group__4__Impl rule__Y1__Group__5 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1085:2: rule__Y1__Group__4__Impl rule__Y1__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__4__Impl_in_rule__Y1__Group__42099);
            rule__Y1__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__5_in_rule__Y1__Group__42102);
            rule__Y1__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__4"


    // $ANTLR start "rule__Y1__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1092:1: rule__Y1__Group__4__Impl : ( ( rule__Y1__Group_4__0 )? ) ;
    public final void rule__Y1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1096:1: ( ( ( rule__Y1__Group_4__0 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1097:1: ( ( rule__Y1__Group_4__0 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1097:1: ( ( rule__Y1__Group_4__0 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1098:1: ( rule__Y1__Group_4__0 )?
            {
             before(grammarAccess.getY1Access().getGroup_4()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1099:1: ( rule__Y1__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1099:2: rule__Y1__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Y1__Group_4__0_in_rule__Y1__Group__4__Impl2129);
                    rule__Y1__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getY1Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__4__Impl"


    // $ANTLR start "rule__Y1__Group__5"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1109:1: rule__Y1__Group__5 : rule__Y1__Group__5__Impl ;
    public final void rule__Y1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1113:1: ( rule__Y1__Group__5__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1114:2: rule__Y1__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group__5__Impl_in_rule__Y1__Group__52160);
            rule__Y1__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__5"


    // $ANTLR start "rule__Y1__Group__5__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1120:1: rule__Y1__Group__5__Impl : ( '}' ) ;
    public final void rule__Y1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1124:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1125:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1125:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1126:1: '}'
            {
             before(grammarAccess.getY1Access().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Y1__Group__5__Impl2188); 
             after(grammarAccess.getY1Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group__5__Impl"


    // $ANTLR start "rule__Y1__Group_4__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1151:1: rule__Y1__Group_4__0 : rule__Y1__Group_4__0__Impl rule__Y1__Group_4__1 ;
    public final void rule__Y1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1155:1: ( rule__Y1__Group_4__0__Impl rule__Y1__Group_4__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1156:2: rule__Y1__Group_4__0__Impl rule__Y1__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group_4__0__Impl_in_rule__Y1__Group_4__02231);
            rule__Y1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group_4__1_in_rule__Y1__Group_4__02234);
            rule__Y1__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group_4__0"


    // $ANTLR start "rule__Y1__Group_4__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1163:1: rule__Y1__Group_4__0__Impl : ( 'ownsZ' ) ;
    public final void rule__Y1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1167:1: ( ( 'ownsZ' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1168:1: ( 'ownsZ' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1168:1: ( 'ownsZ' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1169:1: 'ownsZ'
            {
             before(grammarAccess.getY1Access().getOwnsZKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Y1__Group_4__0__Impl2262); 
             after(grammarAccess.getY1Access().getOwnsZKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group_4__0__Impl"


    // $ANTLR start "rule__Y1__Group_4__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1182:1: rule__Y1__Group_4__1 : rule__Y1__Group_4__1__Impl ;
    public final void rule__Y1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1186:1: ( rule__Y1__Group_4__1__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1187:2: rule__Y1__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__Group_4__1__Impl_in_rule__Y1__Group_4__12293);
            rule__Y1__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group_4__1"


    // $ANTLR start "rule__Y1__Group_4__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1193:1: rule__Y1__Group_4__1__Impl : ( ( rule__Y1__OwnsZAssignment_4_1 ) ) ;
    public final void rule__Y1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1197:1: ( ( ( rule__Y1__OwnsZAssignment_4_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1198:1: ( ( rule__Y1__OwnsZAssignment_4_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1198:1: ( ( rule__Y1__OwnsZAssignment_4_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1199:1: ( rule__Y1__OwnsZAssignment_4_1 )
            {
             before(grammarAccess.getY1Access().getOwnsZAssignment_4_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1200:1: ( rule__Y1__OwnsZAssignment_4_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1200:2: rule__Y1__OwnsZAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y1__OwnsZAssignment_4_1_in_rule__Y1__Group_4__1__Impl2320);
            rule__Y1__OwnsZAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getY1Access().getOwnsZAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__Group_4__1__Impl"


    // $ANTLR start "rule__Y2__Group__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1214:1: rule__Y2__Group__0 : rule__Y2__Group__0__Impl rule__Y2__Group__1 ;
    public final void rule__Y2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1218:1: ( rule__Y2__Group__0__Impl rule__Y2__Group__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1219:2: rule__Y2__Group__0__Impl rule__Y2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__0__Impl_in_rule__Y2__Group__02354);
            rule__Y2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__1_in_rule__Y2__Group__02357);
            rule__Y2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__0"


    // $ANTLR start "rule__Y2__Group__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1226:1: rule__Y2__Group__0__Impl : ( () ) ;
    public final void rule__Y2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1230:1: ( ( () ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1231:1: ( () )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1231:1: ( () )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1232:1: ()
            {
             before(grammarAccess.getY2Access().getY2Action_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1233:1: ()
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1235:1: 
            {
            }

             after(grammarAccess.getY2Access().getY2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__0__Impl"


    // $ANTLR start "rule__Y2__Group__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1245:1: rule__Y2__Group__1 : rule__Y2__Group__1__Impl rule__Y2__Group__2 ;
    public final void rule__Y2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1249:1: ( rule__Y2__Group__1__Impl rule__Y2__Group__2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1250:2: rule__Y2__Group__1__Impl rule__Y2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__1__Impl_in_rule__Y2__Group__12415);
            rule__Y2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__2_in_rule__Y2__Group__12418);
            rule__Y2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__1"


    // $ANTLR start "rule__Y2__Group__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1257:1: rule__Y2__Group__1__Impl : ( 'Y2' ) ;
    public final void rule__Y2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1261:1: ( ( 'Y2' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1262:1: ( 'Y2' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1262:1: ( 'Y2' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1263:1: 'Y2'
            {
             before(grammarAccess.getY2Access().getY2Keyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Y2__Group__1__Impl2446); 
             after(grammarAccess.getY2Access().getY2Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__1__Impl"


    // $ANTLR start "rule__Y2__Group__2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1276:1: rule__Y2__Group__2 : rule__Y2__Group__2__Impl rule__Y2__Group__3 ;
    public final void rule__Y2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1280:1: ( rule__Y2__Group__2__Impl rule__Y2__Group__3 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1281:2: rule__Y2__Group__2__Impl rule__Y2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__2__Impl_in_rule__Y2__Group__22477);
            rule__Y2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__3_in_rule__Y2__Group__22480);
            rule__Y2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__2"


    // $ANTLR start "rule__Y2__Group__2__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1288:1: rule__Y2__Group__2__Impl : ( ( rule__Y2__NameAssignment_2 ) ) ;
    public final void rule__Y2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1292:1: ( ( ( rule__Y2__NameAssignment_2 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1293:1: ( ( rule__Y2__NameAssignment_2 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1293:1: ( ( rule__Y2__NameAssignment_2 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1294:1: ( rule__Y2__NameAssignment_2 )
            {
             before(grammarAccess.getY2Access().getNameAssignment_2()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1295:1: ( rule__Y2__NameAssignment_2 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1295:2: rule__Y2__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__NameAssignment_2_in_rule__Y2__Group__2__Impl2507);
            rule__Y2__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getY2Access().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__2__Impl"


    // $ANTLR start "rule__Y2__Group__3"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1305:1: rule__Y2__Group__3 : rule__Y2__Group__3__Impl rule__Y2__Group__4 ;
    public final void rule__Y2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1309:1: ( rule__Y2__Group__3__Impl rule__Y2__Group__4 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1310:2: rule__Y2__Group__3__Impl rule__Y2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__3__Impl_in_rule__Y2__Group__32537);
            rule__Y2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__4_in_rule__Y2__Group__32540);
            rule__Y2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__3"


    // $ANTLR start "rule__Y2__Group__3__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1317:1: rule__Y2__Group__3__Impl : ( '{' ) ;
    public final void rule__Y2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1321:1: ( ( '{' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1322:1: ( '{' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1322:1: ( '{' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1323:1: '{'
            {
             before(grammarAccess.getY2Access().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Y2__Group__3__Impl2568); 
             after(grammarAccess.getY2Access().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__3__Impl"


    // $ANTLR start "rule__Y2__Group__4"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1336:1: rule__Y2__Group__4 : rule__Y2__Group__4__Impl rule__Y2__Group__5 ;
    public final void rule__Y2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1340:1: ( rule__Y2__Group__4__Impl rule__Y2__Group__5 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1341:2: rule__Y2__Group__4__Impl rule__Y2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__4__Impl_in_rule__Y2__Group__42599);
            rule__Y2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__5_in_rule__Y2__Group__42602);
            rule__Y2__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__4"


    // $ANTLR start "rule__Y2__Group__4__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1348:1: rule__Y2__Group__4__Impl : ( ( rule__Y2__Group_4__0 )? ) ;
    public final void rule__Y2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1352:1: ( ( ( rule__Y2__Group_4__0 )? ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1353:1: ( ( rule__Y2__Group_4__0 )? )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1353:1: ( ( rule__Y2__Group_4__0 )? )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1354:1: ( rule__Y2__Group_4__0 )?
            {
             before(grammarAccess.getY2Access().getGroup_4()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1355:1: ( rule__Y2__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1355:2: rule__Y2__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Y2__Group_4__0_in_rule__Y2__Group__4__Impl2629);
                    rule__Y2__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getY2Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__4__Impl"


    // $ANTLR start "rule__Y2__Group__5"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1365:1: rule__Y2__Group__5 : rule__Y2__Group__5__Impl ;
    public final void rule__Y2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1369:1: ( rule__Y2__Group__5__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1370:2: rule__Y2__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group__5__Impl_in_rule__Y2__Group__52660);
            rule__Y2__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__5"


    // $ANTLR start "rule__Y2__Group__5__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1376:1: rule__Y2__Group__5__Impl : ( '}' ) ;
    public final void rule__Y2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1380:1: ( ( '}' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1381:1: ( '}' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1381:1: ( '}' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1382:1: '}'
            {
             before(grammarAccess.getY2Access().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Y2__Group__5__Impl2688); 
             after(grammarAccess.getY2Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group__5__Impl"


    // $ANTLR start "rule__Y2__Group_4__0"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1407:1: rule__Y2__Group_4__0 : rule__Y2__Group_4__0__Impl rule__Y2__Group_4__1 ;
    public final void rule__Y2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1411:1: ( rule__Y2__Group_4__0__Impl rule__Y2__Group_4__1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1412:2: rule__Y2__Group_4__0__Impl rule__Y2__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group_4__0__Impl_in_rule__Y2__Group_4__02731);
            rule__Y2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group_4__1_in_rule__Y2__Group_4__02734);
            rule__Y2__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group_4__0"


    // $ANTLR start "rule__Y2__Group_4__0__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1419:1: rule__Y2__Group_4__0__Impl : ( 'ownsZ' ) ;
    public final void rule__Y2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1423:1: ( ( 'ownsZ' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1424:1: ( 'ownsZ' )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1424:1: ( 'ownsZ' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1425:1: 'ownsZ'
            {
             before(grammarAccess.getY2Access().getOwnsZKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Y2__Group_4__0__Impl2762); 
             after(grammarAccess.getY2Access().getOwnsZKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group_4__0__Impl"


    // $ANTLR start "rule__Y2__Group_4__1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1438:1: rule__Y2__Group_4__1 : rule__Y2__Group_4__1__Impl ;
    public final void rule__Y2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1442:1: ( rule__Y2__Group_4__1__Impl )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1443:2: rule__Y2__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__Group_4__1__Impl_in_rule__Y2__Group_4__12793);
            rule__Y2__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group_4__1"


    // $ANTLR start "rule__Y2__Group_4__1__Impl"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1449:1: rule__Y2__Group_4__1__Impl : ( ( rule__Y2__OwnsZAssignment_4_1 ) ) ;
    public final void rule__Y2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1453:1: ( ( ( rule__Y2__OwnsZAssignment_4_1 ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1454:1: ( ( rule__Y2__OwnsZAssignment_4_1 ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1454:1: ( ( rule__Y2__OwnsZAssignment_4_1 ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1455:1: ( rule__Y2__OwnsZAssignment_4_1 )
            {
             before(grammarAccess.getY2Access().getOwnsZAssignment_4_1()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1456:1: ( rule__Y2__OwnsZAssignment_4_1 )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1456:2: rule__Y2__OwnsZAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Y2__OwnsZAssignment_4_1_in_rule__Y2__Group_4__1__Impl2820);
            rule__Y2__OwnsZAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getY2Access().getOwnsZAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__Group_4__1__Impl"


    // $ANTLR start "rule__Root__OwnedXAssignment_3_2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1471:1: rule__Root__OwnedXAssignment_3_2 : ( ruleX ) ;
    public final void rule__Root__OwnedXAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1475:1: ( ( ruleX ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1476:1: ( ruleX )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1476:1: ( ruleX )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1477:1: ruleX
            {
             before(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_3_22859);
            ruleX();

            state._fsp--;

             after(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__OwnedXAssignment_3_2"


    // $ANTLR start "rule__Root__OwnedXAssignment_3_3_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1486:1: rule__Root__OwnedXAssignment_3_3_1 : ( ruleX ) ;
    public final void rule__Root__OwnedXAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1490:1: ( ( ruleX ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1491:1: ( ruleX )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1491:1: ( ruleX )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1492:1: ruleX
            {
             before(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_3_3_12890);
            ruleX();

            state._fsp--;

             after(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__OwnedXAssignment_3_3_1"


    // $ANTLR start "rule__X__IsA1Assignment_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1501:1: rule__X__IsA1Assignment_1 : ( ( 'isA1' ) ) ;
    public final void rule__X__IsA1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1505:1: ( ( ( 'isA1' ) ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1506:1: ( ( 'isA1' ) )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1506:1: ( ( 'isA1' ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1507:1: ( 'isA1' )
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_1_0()); 
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1508:1: ( 'isA1' )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1509:1: 'isA1'
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_1_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__X__IsA1Assignment_12926); 
             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_1_0()); 

            }

             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__IsA1Assignment_1"


    // $ANTLR start "rule__X__OwnsYAssignment_4_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1524:1: rule__X__OwnsYAssignment_4_1 : ( ruleY ) ;
    public final void rule__X__OwnsYAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1528:1: ( ( ruleY ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1529:1: ( ruleY )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1529:1: ( ruleY )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1530:1: ruleY
            {
             before(grammarAccess.getXAccess().getOwnsYYParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleY_in_rule__X__OwnsYAssignment_4_12965);
            ruleY();

            state._fsp--;

             after(grammarAccess.getXAccess().getOwnsYYParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X__OwnsYAssignment_4_1"


    // $ANTLR start "rule__Y1__NameAssignment_2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1539:1: rule__Y1__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Y1__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1543:1: ( ( RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1544:1: ( RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1544:1: ( RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1545:1: RULE_STRING
            {
             before(grammarAccess.getY1Access().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Y1__NameAssignment_22996); 
             after(grammarAccess.getY1Access().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__NameAssignment_2"


    // $ANTLR start "rule__Y1__OwnsZAssignment_4_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1554:1: rule__Y1__OwnsZAssignment_4_1 : ( ruleZ ) ;
    public final void rule__Y1__OwnsZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1558:1: ( ( ruleZ ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1559:1: ( ruleZ )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1559:1: ( ruleZ )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1560:1: ruleZ
            {
             before(grammarAccess.getY1Access().getOwnsZZParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleZ_in_rule__Y1__OwnsZAssignment_4_13027);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getY1Access().getOwnsZZParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y1__OwnsZAssignment_4_1"


    // $ANTLR start "rule__Y2__NameAssignment_2"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1569:1: rule__Y2__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Y2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1573:1: ( ( RULE_STRING ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1574:1: ( RULE_STRING )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1574:1: ( RULE_STRING )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1575:1: RULE_STRING
            {
             before(grammarAccess.getY2Access().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Y2__NameAssignment_23058); 
             after(grammarAccess.getY2Access().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__NameAssignment_2"


    // $ANTLR start "rule__Y2__OwnsZAssignment_4_1"
    // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1584:1: rule__Y2__OwnsZAssignment_4_1 : ( ruleZ ) ;
    public final void rule__Y2__OwnsZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1588:1: ( ( ruleZ ) )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1589:1: ( ruleZ )
            {
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1589:1: ( ruleZ )
            // ../uk.ac.york.cs.asbh.lang.ui/src-gen/uk/ac/yor/cs/asbh/ui/contentassist/antlr/internal/InternalASBHLang.g:1590:1: ruleZ
            {
             before(grammarAccess.getY2Access().getOwnsZZParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleZ_in_rule__Y2__OwnsZAssignment_4_13089);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getY2Access().getOwnsZZParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y2__OwnsZAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY_in_entryRuleY121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y__Alternatives_in_ruleY154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleX_in_entryRuleX181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleX188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group__0_in_ruleX214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleZ_in_entryRuleZ241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleZ248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Z__Group__0_in_ruleZ274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY1_in_entryRuleY1301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group__0_in_ruleY1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY2_in_entryRuleY2361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleY2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group__0_in_ruleY2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY1_in_rule__Y__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY2_in_rule__Y__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0477 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Root__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__2600 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Root__Group__3_in_rule__Root__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Root__Group__2__Impl631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__3__Impl_in_rule__Root__Group__3662 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Root__Group__4_in_rule__Root__Group__3665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3__0_in_rule__Root__Group__3__Impl692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__4__Impl_in_rule__Root__Group__4723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Root__Group__4__Impl751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3__0__Impl_in_rule__Root__Group_3__0792 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Root__Group_3__1_in_rule__Root__Group_3__0795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Root__Group_3__0__Impl823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3__1__Impl_in_rule__Root__Group_3__1854 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__Root__Group_3__2_in_rule__Root__Group_3__1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Root__Group_3__1__Impl885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3__2__Impl_in_rule__Root__Group_3__2916 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Root__Group_3__3_in_rule__Root__Group_3__2919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__OwnedXAssignment_3_2_in_rule__Root__Group_3__2__Impl946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3__3__Impl_in_rule__Root__Group_3__3976 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Root__Group_3__4_in_rule__Root__Group_3__3979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3_3__0_in_rule__Root__Group_3__3__Impl1006 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Root__Group_3__4__Impl_in_rule__Root__Group_3__41037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Root__Group_3__4__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3_3__0__Impl_in_rule__Root__Group_3_3__01106 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__Root__Group_3_3__1_in_rule__Root__Group_3_3__01109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Root__Group_3_3__0__Impl1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_3_3__1__Impl_in_rule__Root__Group_3_3__11168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__OwnedXAssignment_3_3_1_in_rule__Root__Group_3_3__1__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group__0__Impl_in_rule__X__Group__01229 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__X__Group__1_in_rule__X__Group__01232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group__1__Impl_in_rule__X__Group__11290 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__X__Group__2_in_rule__X__Group__11293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__IsA1Assignment_1_in_rule__X__Group__1__Impl1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group__2__Impl_in_rule__X__Group__21351 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__X__Group__3_in_rule__X__Group__21354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__X__Group__2__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group__3__Impl_in_rule__X__Group__31413 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__X__Group__4_in_rule__X__Group__31416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__X__Group__3__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group__4__Impl_in_rule__X__Group__41475 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__X__Group__5_in_rule__X__Group__41478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group_4__0_in_rule__X__Group__4__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group__5__Impl_in_rule__X__Group__51536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__X__Group__5__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group_4__0__Impl_in_rule__X__Group_4__01607 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__X__Group_4__1_in_rule__X__Group_4__01610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__X__Group_4__0__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__Group_4__1__Impl_in_rule__X__Group_4__11669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__X__OwnsYAssignment_4_1_in_rule__X__Group_4__1__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Z__Group__0__Impl_in_rule__Z__Group__01730 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Z__Group__1_in_rule__Z__Group__01733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Z__Group__1__Impl_in_rule__Z__Group__11791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Z__Group__1__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group__0__Impl_in_rule__Y1__Group__01854 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Y1__Group__1_in_rule__Y1__Group__01857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group__1__Impl_in_rule__Y1__Group__11915 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Y1__Group__2_in_rule__Y1__Group__11918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Y1__Group__1__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group__2__Impl_in_rule__Y1__Group__21977 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Y1__Group__3_in_rule__Y1__Group__21980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__NameAssignment_2_in_rule__Y1__Group__2__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group__3__Impl_in_rule__Y1__Group__32037 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Y1__Group__4_in_rule__Y1__Group__32040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Y1__Group__3__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group__4__Impl_in_rule__Y1__Group__42099 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Y1__Group__5_in_rule__Y1__Group__42102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group_4__0_in_rule__Y1__Group__4__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group__5__Impl_in_rule__Y1__Group__52160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Y1__Group__5__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group_4__0__Impl_in_rule__Y1__Group_4__02231 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Y1__Group_4__1_in_rule__Y1__Group_4__02234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Y1__Group_4__0__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__Group_4__1__Impl_in_rule__Y1__Group_4__12293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y1__OwnsZAssignment_4_1_in_rule__Y1__Group_4__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group__0__Impl_in_rule__Y2__Group__02354 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__Y2__Group__1_in_rule__Y2__Group__02357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group__1__Impl_in_rule__Y2__Group__12415 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Y2__Group__2_in_rule__Y2__Group__12418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Y2__Group__1__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group__2__Impl_in_rule__Y2__Group__22477 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Y2__Group__3_in_rule__Y2__Group__22480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__NameAssignment_2_in_rule__Y2__Group__2__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group__3__Impl_in_rule__Y2__Group__32537 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Y2__Group__4_in_rule__Y2__Group__32540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Y2__Group__3__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group__4__Impl_in_rule__Y2__Group__42599 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Y2__Group__5_in_rule__Y2__Group__42602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group_4__0_in_rule__Y2__Group__4__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group__5__Impl_in_rule__Y2__Group__52660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Y2__Group__5__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group_4__0__Impl_in_rule__Y2__Group_4__02731 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Y2__Group_4__1_in_rule__Y2__Group_4__02734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Y2__Group_4__0__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__Group_4__1__Impl_in_rule__Y2__Group_4__12793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Y2__OwnsZAssignment_4_1_in_rule__Y2__Group_4__1__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_3_22859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleX_in_rule__Root__OwnedXAssignment_3_3_12890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__X__IsA1Assignment_12926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleY_in_rule__X__OwnsYAssignment_4_12965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Y1__NameAssignment_22996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleZ_in_rule__Y1__OwnsZAssignment_4_13027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Y2__NameAssignment_23058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleZ_in_rule__Y2__OwnsZAssignment_4_13089 = new BitSet(new long[]{0x0000000000000002L});
    }


}