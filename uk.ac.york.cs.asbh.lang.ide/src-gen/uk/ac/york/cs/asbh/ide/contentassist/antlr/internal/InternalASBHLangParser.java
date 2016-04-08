package uk.ac.york.cs.asbh.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.york.cs.asbh.services.ASBHLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASBHLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'}'", "'X'", "'Z'", "'Y1'", "'Y2'", "'.'", "'isA1'", "'isA2'"
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
    // InternalASBHLang.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalASBHLang.g:54:1: ( ruleRoot EOF )
            // InternalASBHLang.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalASBHLang.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalASBHLang.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalASBHLang.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalASBHLang.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalASBHLang.g:69:3: ( rule__Root__Group__0 )
            // InternalASBHLang.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:78:1: entryRuleY : ruleY EOF ;
    public final void entryRuleY() throws RecognitionException {
        try {
            // InternalASBHLang.g:79:1: ( ruleY EOF )
            // InternalASBHLang.g:80:1: ruleY EOF
            {
             before(grammarAccess.getYRule()); 
            pushFollow(FOLLOW_1);
            ruleY();

            state._fsp--;

             after(grammarAccess.getYRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalASBHLang.g:87:1: ruleY : ( ( rule__Y__Alternatives ) ) ;
    public final void ruleY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:91:2: ( ( ( rule__Y__Alternatives ) ) )
            // InternalASBHLang.g:92:2: ( ( rule__Y__Alternatives ) )
            {
            // InternalASBHLang.g:92:2: ( ( rule__Y__Alternatives ) )
            // InternalASBHLang.g:93:3: ( rule__Y__Alternatives )
            {
             before(grammarAccess.getYAccess().getAlternatives()); 
            // InternalASBHLang.g:94:3: ( rule__Y__Alternatives )
            // InternalASBHLang.g:94:4: rule__Y__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:103:1: entryRuleX : ruleX EOF ;
    public final void entryRuleX() throws RecognitionException {
        try {
            // InternalASBHLang.g:104:1: ( ruleX EOF )
            // InternalASBHLang.g:105:1: ruleX EOF
            {
             before(grammarAccess.getXRule()); 
            pushFollow(FOLLOW_1);
            ruleX();

            state._fsp--;

             after(grammarAccess.getXRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalASBHLang.g:112:1: ruleX : ( ( rule__X__Group__0 ) ) ;
    public final void ruleX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:116:2: ( ( ( rule__X__Group__0 ) ) )
            // InternalASBHLang.g:117:2: ( ( rule__X__Group__0 ) )
            {
            // InternalASBHLang.g:117:2: ( ( rule__X__Group__0 ) )
            // InternalASBHLang.g:118:3: ( rule__X__Group__0 )
            {
             before(grammarAccess.getXAccess().getGroup()); 
            // InternalASBHLang.g:119:3: ( rule__X__Group__0 )
            // InternalASBHLang.g:119:4: rule__X__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:128:1: entryRuleZ : ruleZ EOF ;
    public final void entryRuleZ() throws RecognitionException {
        try {
            // InternalASBHLang.g:129:1: ( ruleZ EOF )
            // InternalASBHLang.g:130:1: ruleZ EOF
            {
             before(grammarAccess.getZRule()); 
            pushFollow(FOLLOW_1);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getZRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalASBHLang.g:137:1: ruleZ : ( ( rule__Z__Group__0 ) ) ;
    public final void ruleZ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:141:2: ( ( ( rule__Z__Group__0 ) ) )
            // InternalASBHLang.g:142:2: ( ( rule__Z__Group__0 ) )
            {
            // InternalASBHLang.g:142:2: ( ( rule__Z__Group__0 ) )
            // InternalASBHLang.g:143:3: ( rule__Z__Group__0 )
            {
             before(grammarAccess.getZAccess().getGroup()); 
            // InternalASBHLang.g:144:3: ( rule__Z__Group__0 )
            // InternalASBHLang.g:144:4: rule__Z__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:153:1: entryRuleY1 : ruleY1 EOF ;
    public final void entryRuleY1() throws RecognitionException {
        try {
            // InternalASBHLang.g:154:1: ( ruleY1 EOF )
            // InternalASBHLang.g:155:1: ruleY1 EOF
            {
             before(grammarAccess.getY1Rule()); 
            pushFollow(FOLLOW_1);
            ruleY1();

            state._fsp--;

             after(grammarAccess.getY1Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalASBHLang.g:162:1: ruleY1 : ( ( rule__Y1__Group__0 ) ) ;
    public final void ruleY1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:166:2: ( ( ( rule__Y1__Group__0 ) ) )
            // InternalASBHLang.g:167:2: ( ( rule__Y1__Group__0 ) )
            {
            // InternalASBHLang.g:167:2: ( ( rule__Y1__Group__0 ) )
            // InternalASBHLang.g:168:3: ( rule__Y1__Group__0 )
            {
             before(grammarAccess.getY1Access().getGroup()); 
            // InternalASBHLang.g:169:3: ( rule__Y1__Group__0 )
            // InternalASBHLang.g:169:4: rule__Y1__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:178:1: entryRuleY2 : ruleY2 EOF ;
    public final void entryRuleY2() throws RecognitionException {
        try {
            // InternalASBHLang.g:179:1: ( ruleY2 EOF )
            // InternalASBHLang.g:180:1: ruleY2 EOF
            {
             before(grammarAccess.getY2Rule()); 
            pushFollow(FOLLOW_1);
            ruleY2();

            state._fsp--;

             after(grammarAccess.getY2Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalASBHLang.g:187:1: ruleY2 : ( ( rule__Y2__Group__0 ) ) ;
    public final void ruleY2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:191:2: ( ( ( rule__Y2__Group__0 ) ) )
            // InternalASBHLang.g:192:2: ( ( rule__Y2__Group__0 ) )
            {
            // InternalASBHLang.g:192:2: ( ( rule__Y2__Group__0 ) )
            // InternalASBHLang.g:193:3: ( rule__Y2__Group__0 )
            {
             before(grammarAccess.getY2Access().getGroup()); 
            // InternalASBHLang.g:194:3: ( rule__Y2__Group__0 )
            // InternalASBHLang.g:194:4: rule__Y2__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRulePathNameCS"
    // InternalASBHLang.g:203:1: entryRulePathNameCS : rulePathNameCS EOF ;
    public final void entryRulePathNameCS() throws RecognitionException {
        try {
            // InternalASBHLang.g:204:1: ( rulePathNameCS EOF )
            // InternalASBHLang.g:205:1: rulePathNameCS EOF
            {
             before(grammarAccess.getPathNameCSRule()); 
            pushFollow(FOLLOW_1);
            rulePathNameCS();

            state._fsp--;

             after(grammarAccess.getPathNameCSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // InternalASBHLang.g:212:1: rulePathNameCS : ( ( rule__PathNameCS__Group__0 ) ) ;
    public final void rulePathNameCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:216:2: ( ( ( rule__PathNameCS__Group__0 ) ) )
            // InternalASBHLang.g:217:2: ( ( rule__PathNameCS__Group__0 ) )
            {
            // InternalASBHLang.g:217:2: ( ( rule__PathNameCS__Group__0 ) )
            // InternalASBHLang.g:218:3: ( rule__PathNameCS__Group__0 )
            {
             before(grammarAccess.getPathNameCSAccess().getGroup()); 
            // InternalASBHLang.g:219:3: ( rule__PathNameCS__Group__0 )
            // InternalASBHLang.g:219:4: rule__PathNameCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathNameCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathNameCSAccess().getGroup()); 

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
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRulePathElementCS"
    // InternalASBHLang.g:228:1: entryRulePathElementCS : rulePathElementCS EOF ;
    public final void entryRulePathElementCS() throws RecognitionException {
        try {
            // InternalASBHLang.g:229:1: ( rulePathElementCS EOF )
            // InternalASBHLang.g:230:1: rulePathElementCS EOF
            {
             before(grammarAccess.getPathElementCSRule()); 
            pushFollow(FOLLOW_1);
            rulePathElementCS();

            state._fsp--;

             after(grammarAccess.getPathElementCSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePathElementCS"


    // $ANTLR start "rulePathElementCS"
    // InternalASBHLang.g:237:1: rulePathElementCS : ( ( rule__PathElementCS__NameAssignment ) ) ;
    public final void rulePathElementCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:241:2: ( ( ( rule__PathElementCS__NameAssignment ) ) )
            // InternalASBHLang.g:242:2: ( ( rule__PathElementCS__NameAssignment ) )
            {
            // InternalASBHLang.g:242:2: ( ( rule__PathElementCS__NameAssignment ) )
            // InternalASBHLang.g:243:3: ( rule__PathElementCS__NameAssignment )
            {
             before(grammarAccess.getPathElementCSAccess().getNameAssignment()); 
            // InternalASBHLang.g:244:3: ( rule__PathElementCS__NameAssignment )
            // InternalASBHLang.g:244:4: rule__PathElementCS__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PathElementCS__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPathElementCSAccess().getNameAssignment()); 

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
    // $ANTLR end "rulePathElementCS"


    // $ANTLR start "rule__Y__Alternatives"
    // InternalASBHLang.g:252:1: rule__Y__Alternatives : ( ( ruleY1 ) | ( ruleY2 ) );
    public final void rule__Y__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:256:1: ( ( ruleY1 ) | ( ruleY2 ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalASBHLang.g:257:2: ( ruleY1 )
                    {
                    // InternalASBHLang.g:257:2: ( ruleY1 )
                    // InternalASBHLang.g:258:3: ruleY1
                    {
                     before(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleY1();

                    state._fsp--;

                     after(grammarAccess.getYAccess().getY1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalASBHLang.g:263:2: ( ruleY2 )
                    {
                    // InternalASBHLang.g:263:2: ( ruleY2 )
                    // InternalASBHLang.g:264:3: ruleY2
                    {
                     before(grammarAccess.getYAccess().getY2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__X__Alternatives_3"
    // InternalASBHLang.g:273:1: rule__X__Alternatives_3 : ( ( ( rule__X__IsA1Assignment_3_0 ) ) | ( ( rule__X__IsA2Assignment_3_1 ) ) );
    public final void rule__X__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:277:1: ( ( ( rule__X__IsA1Assignment_3_0 ) ) | ( ( rule__X__IsA2Assignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalASBHLang.g:278:2: ( ( rule__X__IsA1Assignment_3_0 ) )
                    {
                    // InternalASBHLang.g:278:2: ( ( rule__X__IsA1Assignment_3_0 ) )
                    // InternalASBHLang.g:279:3: ( rule__X__IsA1Assignment_3_0 )
                    {
                     before(grammarAccess.getXAccess().getIsA1Assignment_3_0()); 
                    // InternalASBHLang.g:280:3: ( rule__X__IsA1Assignment_3_0 )
                    // InternalASBHLang.g:280:4: rule__X__IsA1Assignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__X__IsA1Assignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXAccess().getIsA1Assignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalASBHLang.g:284:2: ( ( rule__X__IsA2Assignment_3_1 ) )
                    {
                    // InternalASBHLang.g:284:2: ( ( rule__X__IsA2Assignment_3_1 ) )
                    // InternalASBHLang.g:285:3: ( rule__X__IsA2Assignment_3_1 )
                    {
                     before(grammarAccess.getXAccess().getIsA2Assignment_3_1()); 
                    // InternalASBHLang.g:286:3: ( rule__X__IsA2Assignment_3_1 )
                    // InternalASBHLang.g:286:4: rule__X__IsA2Assignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__X__IsA2Assignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXAccess().getIsA2Assignment_3_1()); 

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
    // $ANTLR end "rule__X__Alternatives_3"


    // $ANTLR start "rule__Root__Group__0"
    // InternalASBHLang.g:294:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:298:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalASBHLang.g:299:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:306:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:310:1: ( ( () ) )
            // InternalASBHLang.g:311:1: ( () )
            {
            // InternalASBHLang.g:311:1: ( () )
            // InternalASBHLang.g:312:2: ()
            {
             before(grammarAccess.getRootAccess().getSRootAction_0()); 
            // InternalASBHLang.g:313:2: ()
            // InternalASBHLang.g:313:3: 
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
    // InternalASBHLang.g:321:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:325:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalASBHLang.g:326:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:333:1: rule__Root__Group__1__Impl : ( 'Root' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:337:1: ( ( 'Root' ) )
            // InternalASBHLang.g:338:1: ( 'Root' )
            {
            // InternalASBHLang.g:338:1: ( 'Root' )
            // InternalASBHLang.g:339:2: 'Root'
            {
             before(grammarAccess.getRootAccess().getRootKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalASBHLang.g:348:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:352:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalASBHLang.g:353:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:360:1: rule__Root__Group__2__Impl : ( '{' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:364:1: ( ( '{' ) )
            // InternalASBHLang.g:365:1: ( '{' )
            {
            // InternalASBHLang.g:365:1: ( '{' )
            // InternalASBHLang.g:366:2: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalASBHLang.g:375:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:379:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalASBHLang.g:380:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:387:1: rule__Root__Group__3__Impl : ( ( rule__Root__OwnedXAssignment_3 )* ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:391:1: ( ( ( rule__Root__OwnedXAssignment_3 )* ) )
            // InternalASBHLang.g:392:1: ( ( rule__Root__OwnedXAssignment_3 )* )
            {
            // InternalASBHLang.g:392:1: ( ( rule__Root__OwnedXAssignment_3 )* )
            // InternalASBHLang.g:393:2: ( rule__Root__OwnedXAssignment_3 )*
            {
             before(grammarAccess.getRootAccess().getOwnedXAssignment_3()); 
            // InternalASBHLang.g:394:2: ( rule__Root__OwnedXAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalASBHLang.g:394:3: rule__Root__OwnedXAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Root__OwnedXAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getOwnedXAssignment_3()); 

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
    // InternalASBHLang.g:402:1: rule__Root__Group__4 : rule__Root__Group__4__Impl ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:406:1: ( rule__Root__Group__4__Impl )
            // InternalASBHLang.g:407:2: rule__Root__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:413:1: rule__Root__Group__4__Impl : ( '}' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:417:1: ( ( '}' ) )
            // InternalASBHLang.g:418:1: ( '}' )
            {
            // InternalASBHLang.g:418:1: ( '}' )
            // InternalASBHLang.g:419:2: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__X__Group__0"
    // InternalASBHLang.g:429:1: rule__X__Group__0 : rule__X__Group__0__Impl rule__X__Group__1 ;
    public final void rule__X__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:433:1: ( rule__X__Group__0__Impl rule__X__Group__1 )
            // InternalASBHLang.g:434:2: rule__X__Group__0__Impl rule__X__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__X__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:441:1: rule__X__Group__0__Impl : ( () ) ;
    public final void rule__X__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:445:1: ( ( () ) )
            // InternalASBHLang.g:446:1: ( () )
            {
            // InternalASBHLang.g:446:1: ( () )
            // InternalASBHLang.g:447:2: ()
            {
             before(grammarAccess.getXAccess().getXAction_0()); 
            // InternalASBHLang.g:448:2: ()
            // InternalASBHLang.g:448:3: 
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
    // InternalASBHLang.g:456:1: rule__X__Group__1 : rule__X__Group__1__Impl rule__X__Group__2 ;
    public final void rule__X__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:460:1: ( rule__X__Group__1__Impl rule__X__Group__2 )
            // InternalASBHLang.g:461:2: rule__X__Group__1__Impl rule__X__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__X__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:468:1: rule__X__Group__1__Impl : ( 'X' ) ;
    public final void rule__X__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:472:1: ( ( 'X' ) )
            // InternalASBHLang.g:473:1: ( 'X' )
            {
            // InternalASBHLang.g:473:1: ( 'X' )
            // InternalASBHLang.g:474:2: 'X'
            {
             before(grammarAccess.getXAccess().getXKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getXAccess().getXKeyword_1()); 

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
    // InternalASBHLang.g:483:1: rule__X__Group__2 : rule__X__Group__2__Impl rule__X__Group__3 ;
    public final void rule__X__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:487:1: ( rule__X__Group__2__Impl rule__X__Group__3 )
            // InternalASBHLang.g:488:2: rule__X__Group__2__Impl rule__X__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__X__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:495:1: rule__X__Group__2__Impl : ( ( rule__X__NameAssignment_2 ) ) ;
    public final void rule__X__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:499:1: ( ( ( rule__X__NameAssignment_2 ) ) )
            // InternalASBHLang.g:500:1: ( ( rule__X__NameAssignment_2 ) )
            {
            // InternalASBHLang.g:500:1: ( ( rule__X__NameAssignment_2 ) )
            // InternalASBHLang.g:501:2: ( rule__X__NameAssignment_2 )
            {
             before(grammarAccess.getXAccess().getNameAssignment_2()); 
            // InternalASBHLang.g:502:2: ( rule__X__NameAssignment_2 )
            // InternalASBHLang.g:502:3: rule__X__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__X__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXAccess().getNameAssignment_2()); 

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
    // InternalASBHLang.g:510:1: rule__X__Group__3 : rule__X__Group__3__Impl rule__X__Group__4 ;
    public final void rule__X__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:514:1: ( rule__X__Group__3__Impl rule__X__Group__4 )
            // InternalASBHLang.g:515:2: rule__X__Group__3__Impl rule__X__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__X__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:522:1: rule__X__Group__3__Impl : ( ( rule__X__Alternatives_3 )? ) ;
    public final void rule__X__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:526:1: ( ( ( rule__X__Alternatives_3 )? ) )
            // InternalASBHLang.g:527:1: ( ( rule__X__Alternatives_3 )? )
            {
            // InternalASBHLang.g:527:1: ( ( rule__X__Alternatives_3 )? )
            // InternalASBHLang.g:528:2: ( rule__X__Alternatives_3 )?
            {
             before(grammarAccess.getXAccess().getAlternatives_3()); 
            // InternalASBHLang.g:529:2: ( rule__X__Alternatives_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalASBHLang.g:529:3: rule__X__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__X__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAccess().getAlternatives_3()); 

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
    // InternalASBHLang.g:537:1: rule__X__Group__4 : rule__X__Group__4__Impl rule__X__Group__5 ;
    public final void rule__X__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:541:1: ( rule__X__Group__4__Impl rule__X__Group__5 )
            // InternalASBHLang.g:542:2: rule__X__Group__4__Impl rule__X__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__X__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:549:1: rule__X__Group__4__Impl : ( '{' ) ;
    public final void rule__X__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:553:1: ( ( '{' ) )
            // InternalASBHLang.g:554:1: ( '{' )
            {
            // InternalASBHLang.g:554:1: ( '{' )
            // InternalASBHLang.g:555:2: '{'
            {
             before(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getXAccess().getLeftCurlyBracketKeyword_4()); 

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
    // InternalASBHLang.g:564:1: rule__X__Group__5 : rule__X__Group__5__Impl rule__X__Group__6 ;
    public final void rule__X__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:568:1: ( rule__X__Group__5__Impl rule__X__Group__6 )
            // InternalASBHLang.g:569:2: rule__X__Group__5__Impl rule__X__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__X__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__X__Group__6();

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
    // InternalASBHLang.g:576:1: rule__X__Group__5__Impl : ( ( rule__X__OwnsYAssignment_5 )* ) ;
    public final void rule__X__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:580:1: ( ( ( rule__X__OwnsYAssignment_5 )* ) )
            // InternalASBHLang.g:581:1: ( ( rule__X__OwnsYAssignment_5 )* )
            {
            // InternalASBHLang.g:581:1: ( ( rule__X__OwnsYAssignment_5 )* )
            // InternalASBHLang.g:582:2: ( rule__X__OwnsYAssignment_5 )*
            {
             before(grammarAccess.getXAccess().getOwnsYAssignment_5()); 
            // InternalASBHLang.g:583:2: ( rule__X__OwnsYAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalASBHLang.g:583:3: rule__X__OwnsYAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__X__OwnsYAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getXAccess().getOwnsYAssignment_5()); 

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


    // $ANTLR start "rule__X__Group__6"
    // InternalASBHLang.g:591:1: rule__X__Group__6 : rule__X__Group__6__Impl ;
    public final void rule__X__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:595:1: ( rule__X__Group__6__Impl )
            // InternalASBHLang.g:596:2: rule__X__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__X__Group__6__Impl();

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
    // $ANTLR end "rule__X__Group__6"


    // $ANTLR start "rule__X__Group__6__Impl"
    // InternalASBHLang.g:602:1: rule__X__Group__6__Impl : ( '}' ) ;
    public final void rule__X__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:606:1: ( ( '}' ) )
            // InternalASBHLang.g:607:1: ( '}' )
            {
            // InternalASBHLang.g:607:1: ( '}' )
            // InternalASBHLang.g:608:2: '}'
            {
             before(grammarAccess.getXAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getXAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__X__Group__6__Impl"


    // $ANTLR start "rule__Z__Group__0"
    // InternalASBHLang.g:618:1: rule__Z__Group__0 : rule__Z__Group__0__Impl rule__Z__Group__1 ;
    public final void rule__Z__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:622:1: ( rule__Z__Group__0__Impl rule__Z__Group__1 )
            // InternalASBHLang.g:623:2: rule__Z__Group__0__Impl rule__Z__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Z__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:630:1: rule__Z__Group__0__Impl : ( () ) ;
    public final void rule__Z__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:634:1: ( ( () ) )
            // InternalASBHLang.g:635:1: ( () )
            {
            // InternalASBHLang.g:635:1: ( () )
            // InternalASBHLang.g:636:2: ()
            {
             before(grammarAccess.getZAccess().getZAction_0()); 
            // InternalASBHLang.g:637:2: ()
            // InternalASBHLang.g:637:3: 
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
    // InternalASBHLang.g:645:1: rule__Z__Group__1 : rule__Z__Group__1__Impl rule__Z__Group__2 ;
    public final void rule__Z__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:649:1: ( rule__Z__Group__1__Impl rule__Z__Group__2 )
            // InternalASBHLang.g:650:2: rule__Z__Group__1__Impl rule__Z__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Z__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Z__Group__2();

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
    // InternalASBHLang.g:657:1: rule__Z__Group__1__Impl : ( 'Z' ) ;
    public final void rule__Z__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:661:1: ( ( 'Z' ) )
            // InternalASBHLang.g:662:1: ( 'Z' )
            {
            // InternalASBHLang.g:662:1: ( 'Z' )
            // InternalASBHLang.g:663:2: 'Z'
            {
             before(grammarAccess.getZAccess().getZKeyword_1()); 
            match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__Z__Group__2"
    // InternalASBHLang.g:672:1: rule__Z__Group__2 : rule__Z__Group__2__Impl ;
    public final void rule__Z__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:676:1: ( rule__Z__Group__2__Impl )
            // InternalASBHLang.g:677:2: rule__Z__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Z__Group__2__Impl();

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
    // $ANTLR end "rule__Z__Group__2"


    // $ANTLR start "rule__Z__Group__2__Impl"
    // InternalASBHLang.g:683:1: rule__Z__Group__2__Impl : ( ( rule__Z__RefersAssignment_2 )? ) ;
    public final void rule__Z__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:687:1: ( ( ( rule__Z__RefersAssignment_2 )? ) )
            // InternalASBHLang.g:688:1: ( ( rule__Z__RefersAssignment_2 )? )
            {
            // InternalASBHLang.g:688:1: ( ( rule__Z__RefersAssignment_2 )? )
            // InternalASBHLang.g:689:2: ( rule__Z__RefersAssignment_2 )?
            {
             before(grammarAccess.getZAccess().getRefersAssignment_2()); 
            // InternalASBHLang.g:690:2: ( rule__Z__RefersAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalASBHLang.g:690:3: rule__Z__RefersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Z__RefersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZAccess().getRefersAssignment_2()); 

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
    // $ANTLR end "rule__Z__Group__2__Impl"


    // $ANTLR start "rule__Y1__Group__0"
    // InternalASBHLang.g:699:1: rule__Y1__Group__0 : rule__Y1__Group__0__Impl rule__Y1__Group__1 ;
    public final void rule__Y1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:703:1: ( rule__Y1__Group__0__Impl rule__Y1__Group__1 )
            // InternalASBHLang.g:704:2: rule__Y1__Group__0__Impl rule__Y1__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Y1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:711:1: rule__Y1__Group__0__Impl : ( 'Y1' ) ;
    public final void rule__Y1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:715:1: ( ( 'Y1' ) )
            // InternalASBHLang.g:716:1: ( 'Y1' )
            {
            // InternalASBHLang.g:716:1: ( 'Y1' )
            // InternalASBHLang.g:717:2: 'Y1'
            {
             before(grammarAccess.getY1Access().getY1Keyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getY1Access().getY1Keyword_0()); 

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
    // $ANTLR end "rule__Y1__Group__0__Impl"


    // $ANTLR start "rule__Y1__Group__1"
    // InternalASBHLang.g:726:1: rule__Y1__Group__1 : rule__Y1__Group__1__Impl rule__Y1__Group__2 ;
    public final void rule__Y1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:730:1: ( rule__Y1__Group__1__Impl rule__Y1__Group__2 )
            // InternalASBHLang.g:731:2: rule__Y1__Group__1__Impl rule__Y1__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Y1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:738:1: rule__Y1__Group__1__Impl : ( ( rule__Y1__NameAssignment_1 ) ) ;
    public final void rule__Y1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:742:1: ( ( ( rule__Y1__NameAssignment_1 ) ) )
            // InternalASBHLang.g:743:1: ( ( rule__Y1__NameAssignment_1 ) )
            {
            // InternalASBHLang.g:743:1: ( ( rule__Y1__NameAssignment_1 ) )
            // InternalASBHLang.g:744:2: ( rule__Y1__NameAssignment_1 )
            {
             before(grammarAccess.getY1Access().getNameAssignment_1()); 
            // InternalASBHLang.g:745:2: ( rule__Y1__NameAssignment_1 )
            // InternalASBHLang.g:745:3: rule__Y1__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Y1__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getY1Access().getNameAssignment_1()); 

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
    // InternalASBHLang.g:753:1: rule__Y1__Group__2 : rule__Y1__Group__2__Impl rule__Y1__Group__3 ;
    public final void rule__Y1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:757:1: ( rule__Y1__Group__2__Impl rule__Y1__Group__3 )
            // InternalASBHLang.g:758:2: rule__Y1__Group__2__Impl rule__Y1__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Y1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:765:1: rule__Y1__Group__2__Impl : ( '{' ) ;
    public final void rule__Y1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:769:1: ( ( '{' ) )
            // InternalASBHLang.g:770:1: ( '{' )
            {
            // InternalASBHLang.g:770:1: ( '{' )
            // InternalASBHLang.g:771:2: '{'
            {
             before(grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getY1Access().getLeftCurlyBracketKeyword_2()); 

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
    // InternalASBHLang.g:780:1: rule__Y1__Group__3 : rule__Y1__Group__3__Impl rule__Y1__Group__4 ;
    public final void rule__Y1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:784:1: ( rule__Y1__Group__3__Impl rule__Y1__Group__4 )
            // InternalASBHLang.g:785:2: rule__Y1__Group__3__Impl rule__Y1__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Y1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:792:1: rule__Y1__Group__3__Impl : ( ( rule__Y1__OwnsZAssignment_3 )? ) ;
    public final void rule__Y1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:796:1: ( ( ( rule__Y1__OwnsZAssignment_3 )? ) )
            // InternalASBHLang.g:797:1: ( ( rule__Y1__OwnsZAssignment_3 )? )
            {
            // InternalASBHLang.g:797:1: ( ( rule__Y1__OwnsZAssignment_3 )? )
            // InternalASBHLang.g:798:2: ( rule__Y1__OwnsZAssignment_3 )?
            {
             before(grammarAccess.getY1Access().getOwnsZAssignment_3()); 
            // InternalASBHLang.g:799:2: ( rule__Y1__OwnsZAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalASBHLang.g:799:3: rule__Y1__OwnsZAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Y1__OwnsZAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getY1Access().getOwnsZAssignment_3()); 

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
    // InternalASBHLang.g:807:1: rule__Y1__Group__4 : rule__Y1__Group__4__Impl ;
    public final void rule__Y1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:811:1: ( rule__Y1__Group__4__Impl )
            // InternalASBHLang.g:812:2: rule__Y1__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Y1__Group__4__Impl();

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
    // InternalASBHLang.g:818:1: rule__Y1__Group__4__Impl : ( '}' ) ;
    public final void rule__Y1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:822:1: ( ( '}' ) )
            // InternalASBHLang.g:823:1: ( '}' )
            {
            // InternalASBHLang.g:823:1: ( '}' )
            // InternalASBHLang.g:824:2: '}'
            {
             before(grammarAccess.getY1Access().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getY1Access().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Y2__Group__0"
    // InternalASBHLang.g:834:1: rule__Y2__Group__0 : rule__Y2__Group__0__Impl rule__Y2__Group__1 ;
    public final void rule__Y2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:838:1: ( rule__Y2__Group__0__Impl rule__Y2__Group__1 )
            // InternalASBHLang.g:839:2: rule__Y2__Group__0__Impl rule__Y2__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Y2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:846:1: rule__Y2__Group__0__Impl : ( 'Y2' ) ;
    public final void rule__Y2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:850:1: ( ( 'Y2' ) )
            // InternalASBHLang.g:851:1: ( 'Y2' )
            {
            // InternalASBHLang.g:851:1: ( 'Y2' )
            // InternalASBHLang.g:852:2: 'Y2'
            {
             before(grammarAccess.getY2Access().getY2Keyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getY2Access().getY2Keyword_0()); 

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
    // $ANTLR end "rule__Y2__Group__0__Impl"


    // $ANTLR start "rule__Y2__Group__1"
    // InternalASBHLang.g:861:1: rule__Y2__Group__1 : rule__Y2__Group__1__Impl rule__Y2__Group__2 ;
    public final void rule__Y2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:865:1: ( rule__Y2__Group__1__Impl rule__Y2__Group__2 )
            // InternalASBHLang.g:866:2: rule__Y2__Group__1__Impl rule__Y2__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Y2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:873:1: rule__Y2__Group__1__Impl : ( ( rule__Y2__NameAssignment_1 ) ) ;
    public final void rule__Y2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:877:1: ( ( ( rule__Y2__NameAssignment_1 ) ) )
            // InternalASBHLang.g:878:1: ( ( rule__Y2__NameAssignment_1 ) )
            {
            // InternalASBHLang.g:878:1: ( ( rule__Y2__NameAssignment_1 ) )
            // InternalASBHLang.g:879:2: ( rule__Y2__NameAssignment_1 )
            {
             before(grammarAccess.getY2Access().getNameAssignment_1()); 
            // InternalASBHLang.g:880:2: ( rule__Y2__NameAssignment_1 )
            // InternalASBHLang.g:880:3: rule__Y2__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Y2__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getY2Access().getNameAssignment_1()); 

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
    // InternalASBHLang.g:888:1: rule__Y2__Group__2 : rule__Y2__Group__2__Impl rule__Y2__Group__3 ;
    public final void rule__Y2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:892:1: ( rule__Y2__Group__2__Impl rule__Y2__Group__3 )
            // InternalASBHLang.g:893:2: rule__Y2__Group__2__Impl rule__Y2__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Y2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:900:1: rule__Y2__Group__2__Impl : ( '{' ) ;
    public final void rule__Y2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:904:1: ( ( '{' ) )
            // InternalASBHLang.g:905:1: ( '{' )
            {
            // InternalASBHLang.g:905:1: ( '{' )
            // InternalASBHLang.g:906:2: '{'
            {
             before(grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getY2Access().getLeftCurlyBracketKeyword_2()); 

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
    // InternalASBHLang.g:915:1: rule__Y2__Group__3 : rule__Y2__Group__3__Impl rule__Y2__Group__4 ;
    public final void rule__Y2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:919:1: ( rule__Y2__Group__3__Impl rule__Y2__Group__4 )
            // InternalASBHLang.g:920:2: rule__Y2__Group__3__Impl rule__Y2__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Y2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalASBHLang.g:927:1: rule__Y2__Group__3__Impl : ( ( rule__Y2__OwnsZAssignment_3 )? ) ;
    public final void rule__Y2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:931:1: ( ( ( rule__Y2__OwnsZAssignment_3 )? ) )
            // InternalASBHLang.g:932:1: ( ( rule__Y2__OwnsZAssignment_3 )? )
            {
            // InternalASBHLang.g:932:1: ( ( rule__Y2__OwnsZAssignment_3 )? )
            // InternalASBHLang.g:933:2: ( rule__Y2__OwnsZAssignment_3 )?
            {
             before(grammarAccess.getY2Access().getOwnsZAssignment_3()); 
            // InternalASBHLang.g:934:2: ( rule__Y2__OwnsZAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalASBHLang.g:934:3: rule__Y2__OwnsZAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Y2__OwnsZAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getY2Access().getOwnsZAssignment_3()); 

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
    // InternalASBHLang.g:942:1: rule__Y2__Group__4 : rule__Y2__Group__4__Impl ;
    public final void rule__Y2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:946:1: ( rule__Y2__Group__4__Impl )
            // InternalASBHLang.g:947:2: rule__Y2__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Y2__Group__4__Impl();

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
    // InternalASBHLang.g:953:1: rule__Y2__Group__4__Impl : ( '}' ) ;
    public final void rule__Y2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:957:1: ( ( '}' ) )
            // InternalASBHLang.g:958:1: ( '}' )
            {
            // InternalASBHLang.g:958:1: ( '}' )
            // InternalASBHLang.g:959:2: '}'
            {
             before(grammarAccess.getY2Access().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getY2Access().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__PathNameCS__Group__0"
    // InternalASBHLang.g:969:1: rule__PathNameCS__Group__0 : rule__PathNameCS__Group__0__Impl rule__PathNameCS__Group__1 ;
    public final void rule__PathNameCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:973:1: ( rule__PathNameCS__Group__0__Impl rule__PathNameCS__Group__1 )
            // InternalASBHLang.g:974:2: rule__PathNameCS__Group__0__Impl rule__PathNameCS__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PathNameCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathNameCS__Group__1();

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
    // $ANTLR end "rule__PathNameCS__Group__0"


    // $ANTLR start "rule__PathNameCS__Group__0__Impl"
    // InternalASBHLang.g:981:1: rule__PathNameCS__Group__0__Impl : ( ( rule__PathNameCS__PathAssignment_0 ) ) ;
    public final void rule__PathNameCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:985:1: ( ( ( rule__PathNameCS__PathAssignment_0 ) ) )
            // InternalASBHLang.g:986:1: ( ( rule__PathNameCS__PathAssignment_0 ) )
            {
            // InternalASBHLang.g:986:1: ( ( rule__PathNameCS__PathAssignment_0 ) )
            // InternalASBHLang.g:987:2: ( rule__PathNameCS__PathAssignment_0 )
            {
             before(grammarAccess.getPathNameCSAccess().getPathAssignment_0()); 
            // InternalASBHLang.g:988:2: ( rule__PathNameCS__PathAssignment_0 )
            // InternalASBHLang.g:988:3: rule__PathNameCS__PathAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PathNameCS__PathAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathNameCSAccess().getPathAssignment_0()); 

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
    // $ANTLR end "rule__PathNameCS__Group__0__Impl"


    // $ANTLR start "rule__PathNameCS__Group__1"
    // InternalASBHLang.g:996:1: rule__PathNameCS__Group__1 : rule__PathNameCS__Group__1__Impl ;
    public final void rule__PathNameCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1000:1: ( rule__PathNameCS__Group__1__Impl )
            // InternalASBHLang.g:1001:2: rule__PathNameCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathNameCS__Group__1__Impl();

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
    // $ANTLR end "rule__PathNameCS__Group__1"


    // $ANTLR start "rule__PathNameCS__Group__1__Impl"
    // InternalASBHLang.g:1007:1: rule__PathNameCS__Group__1__Impl : ( ( rule__PathNameCS__Group_1__0 )* ) ;
    public final void rule__PathNameCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1011:1: ( ( ( rule__PathNameCS__Group_1__0 )* ) )
            // InternalASBHLang.g:1012:1: ( ( rule__PathNameCS__Group_1__0 )* )
            {
            // InternalASBHLang.g:1012:1: ( ( rule__PathNameCS__Group_1__0 )* )
            // InternalASBHLang.g:1013:2: ( rule__PathNameCS__Group_1__0 )*
            {
             before(grammarAccess.getPathNameCSAccess().getGroup_1()); 
            // InternalASBHLang.g:1014:2: ( rule__PathNameCS__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalASBHLang.g:1014:3: rule__PathNameCS__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PathNameCS__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPathNameCSAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PathNameCS__Group__1__Impl"


    // $ANTLR start "rule__PathNameCS__Group_1__0"
    // InternalASBHLang.g:1023:1: rule__PathNameCS__Group_1__0 : rule__PathNameCS__Group_1__0__Impl rule__PathNameCS__Group_1__1 ;
    public final void rule__PathNameCS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1027:1: ( rule__PathNameCS__Group_1__0__Impl rule__PathNameCS__Group_1__1 )
            // InternalASBHLang.g:1028:2: rule__PathNameCS__Group_1__0__Impl rule__PathNameCS__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PathNameCS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathNameCS__Group_1__1();

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
    // $ANTLR end "rule__PathNameCS__Group_1__0"


    // $ANTLR start "rule__PathNameCS__Group_1__0__Impl"
    // InternalASBHLang.g:1035:1: rule__PathNameCS__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PathNameCS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1039:1: ( ( '.' ) )
            // InternalASBHLang.g:1040:1: ( '.' )
            {
            // InternalASBHLang.g:1040:1: ( '.' )
            // InternalASBHLang.g:1041:2: '.'
            {
             before(grammarAccess.getPathNameCSAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPathNameCSAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__PathNameCS__Group_1__0__Impl"


    // $ANTLR start "rule__PathNameCS__Group_1__1"
    // InternalASBHLang.g:1050:1: rule__PathNameCS__Group_1__1 : rule__PathNameCS__Group_1__1__Impl ;
    public final void rule__PathNameCS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1054:1: ( rule__PathNameCS__Group_1__1__Impl )
            // InternalASBHLang.g:1055:2: rule__PathNameCS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathNameCS__Group_1__1__Impl();

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
    // $ANTLR end "rule__PathNameCS__Group_1__1"


    // $ANTLR start "rule__PathNameCS__Group_1__1__Impl"
    // InternalASBHLang.g:1061:1: rule__PathNameCS__Group_1__1__Impl : ( ( rule__PathNameCS__PathAssignment_1_1 ) ) ;
    public final void rule__PathNameCS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1065:1: ( ( ( rule__PathNameCS__PathAssignment_1_1 ) ) )
            // InternalASBHLang.g:1066:1: ( ( rule__PathNameCS__PathAssignment_1_1 ) )
            {
            // InternalASBHLang.g:1066:1: ( ( rule__PathNameCS__PathAssignment_1_1 ) )
            // InternalASBHLang.g:1067:2: ( rule__PathNameCS__PathAssignment_1_1 )
            {
             before(grammarAccess.getPathNameCSAccess().getPathAssignment_1_1()); 
            // InternalASBHLang.g:1068:2: ( rule__PathNameCS__PathAssignment_1_1 )
            // InternalASBHLang.g:1068:3: rule__PathNameCS__PathAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PathNameCS__PathAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPathNameCSAccess().getPathAssignment_1_1()); 

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
    // $ANTLR end "rule__PathNameCS__Group_1__1__Impl"


    // $ANTLR start "rule__Root__OwnedXAssignment_3"
    // InternalASBHLang.g:1077:1: rule__Root__OwnedXAssignment_3 : ( ruleX ) ;
    public final void rule__Root__OwnedXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1081:1: ( ( ruleX ) )
            // InternalASBHLang.g:1082:2: ( ruleX )
            {
            // InternalASBHLang.g:1082:2: ( ruleX )
            // InternalASBHLang.g:1083:3: ruleX
            {
             before(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleX();

            state._fsp--;

             after(grammarAccess.getRootAccess().getOwnedXXParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Root__OwnedXAssignment_3"


    // $ANTLR start "rule__X__NameAssignment_2"
    // InternalASBHLang.g:1092:1: rule__X__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__X__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1096:1: ( ( RULE_ID ) )
            // InternalASBHLang.g:1097:2: ( RULE_ID )
            {
            // InternalASBHLang.g:1097:2: ( RULE_ID )
            // InternalASBHLang.g:1098:3: RULE_ID
            {
             before(grammarAccess.getXAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__X__NameAssignment_2"


    // $ANTLR start "rule__X__IsA1Assignment_3_0"
    // InternalASBHLang.g:1107:1: rule__X__IsA1Assignment_3_0 : ( ( 'isA1' ) ) ;
    public final void rule__X__IsA1Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1111:1: ( ( ( 'isA1' ) ) )
            // InternalASBHLang.g:1112:2: ( ( 'isA1' ) )
            {
            // InternalASBHLang.g:1112:2: ( ( 'isA1' ) )
            // InternalASBHLang.g:1113:3: ( 'isA1' )
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 
            // InternalASBHLang.g:1114:3: ( 'isA1' )
            // InternalASBHLang.g:1115:4: 'isA1'
            {
             before(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 

            }

             after(grammarAccess.getXAccess().getIsA1IsA1Keyword_3_0_0()); 

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
    // $ANTLR end "rule__X__IsA1Assignment_3_0"


    // $ANTLR start "rule__X__IsA2Assignment_3_1"
    // InternalASBHLang.g:1126:1: rule__X__IsA2Assignment_3_1 : ( ( 'isA2' ) ) ;
    public final void rule__X__IsA2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1130:1: ( ( ( 'isA2' ) ) )
            // InternalASBHLang.g:1131:2: ( ( 'isA2' ) )
            {
            // InternalASBHLang.g:1131:2: ( ( 'isA2' ) )
            // InternalASBHLang.g:1132:3: ( 'isA2' )
            {
             before(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 
            // InternalASBHLang.g:1133:3: ( 'isA2' )
            // InternalASBHLang.g:1134:4: 'isA2'
            {
             before(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 

            }

             after(grammarAccess.getXAccess().getIsA2IsA2Keyword_3_1_0()); 

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
    // $ANTLR end "rule__X__IsA2Assignment_3_1"


    // $ANTLR start "rule__X__OwnsYAssignment_5"
    // InternalASBHLang.g:1145:1: rule__X__OwnsYAssignment_5 : ( ruleY ) ;
    public final void rule__X__OwnsYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1149:1: ( ( ruleY ) )
            // InternalASBHLang.g:1150:2: ( ruleY )
            {
            // InternalASBHLang.g:1150:2: ( ruleY )
            // InternalASBHLang.g:1151:3: ruleY
            {
             before(grammarAccess.getXAccess().getOwnsYYParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleY();

            state._fsp--;

             after(grammarAccess.getXAccess().getOwnsYYParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__X__OwnsYAssignment_5"


    // $ANTLR start "rule__Z__RefersAssignment_2"
    // InternalASBHLang.g:1160:1: rule__Z__RefersAssignment_2 : ( rulePathNameCS ) ;
    public final void rule__Z__RefersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1164:1: ( ( rulePathNameCS ) )
            // InternalASBHLang.g:1165:2: ( rulePathNameCS )
            {
            // InternalASBHLang.g:1165:2: ( rulePathNameCS )
            // InternalASBHLang.g:1166:3: rulePathNameCS
            {
             before(grammarAccess.getZAccess().getRefersPathNameCSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePathNameCS();

            state._fsp--;

             after(grammarAccess.getZAccess().getRefersPathNameCSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Z__RefersAssignment_2"


    // $ANTLR start "rule__Y1__NameAssignment_1"
    // InternalASBHLang.g:1175:1: rule__Y1__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Y1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1179:1: ( ( RULE_ID ) )
            // InternalASBHLang.g:1180:2: ( RULE_ID )
            {
            // InternalASBHLang.g:1180:2: ( RULE_ID )
            // InternalASBHLang.g:1181:3: RULE_ID
            {
             before(grammarAccess.getY1Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getY1Access().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Y1__NameAssignment_1"


    // $ANTLR start "rule__Y1__OwnsZAssignment_3"
    // InternalASBHLang.g:1190:1: rule__Y1__OwnsZAssignment_3 : ( ruleZ ) ;
    public final void rule__Y1__OwnsZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1194:1: ( ( ruleZ ) )
            // InternalASBHLang.g:1195:2: ( ruleZ )
            {
            // InternalASBHLang.g:1195:2: ( ruleZ )
            // InternalASBHLang.g:1196:3: ruleZ
            {
             before(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getY1Access().getOwnsZZParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Y1__OwnsZAssignment_3"


    // $ANTLR start "rule__Y2__NameAssignment_1"
    // InternalASBHLang.g:1205:1: rule__Y2__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Y2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1209:1: ( ( RULE_ID ) )
            // InternalASBHLang.g:1210:2: ( RULE_ID )
            {
            // InternalASBHLang.g:1210:2: ( RULE_ID )
            // InternalASBHLang.g:1211:3: RULE_ID
            {
             before(grammarAccess.getY2Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getY2Access().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Y2__NameAssignment_1"


    // $ANTLR start "rule__Y2__OwnsZAssignment_3"
    // InternalASBHLang.g:1220:1: rule__Y2__OwnsZAssignment_3 : ( ruleZ ) ;
    public final void rule__Y2__OwnsZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1224:1: ( ( ruleZ ) )
            // InternalASBHLang.g:1225:2: ( ruleZ )
            {
            // InternalASBHLang.g:1225:2: ( ruleZ )
            // InternalASBHLang.g:1226:3: ruleZ
            {
             before(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleZ();

            state._fsp--;

             after(grammarAccess.getY2Access().getOwnsZZParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Y2__OwnsZAssignment_3"


    // $ANTLR start "rule__PathNameCS__PathAssignment_0"
    // InternalASBHLang.g:1235:1: rule__PathNameCS__PathAssignment_0 : ( rulePathElementCS ) ;
    public final void rule__PathNameCS__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1239:1: ( ( rulePathElementCS ) )
            // InternalASBHLang.g:1240:2: ( rulePathElementCS )
            {
            // InternalASBHLang.g:1240:2: ( rulePathElementCS )
            // InternalASBHLang.g:1241:3: rulePathElementCS
            {
             before(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePathElementCS();

            state._fsp--;

             after(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PathNameCS__PathAssignment_0"


    // $ANTLR start "rule__PathNameCS__PathAssignment_1_1"
    // InternalASBHLang.g:1250:1: rule__PathNameCS__PathAssignment_1_1 : ( rulePathElementCS ) ;
    public final void rule__PathNameCS__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1254:1: ( ( rulePathElementCS ) )
            // InternalASBHLang.g:1255:2: ( rulePathElementCS )
            {
            // InternalASBHLang.g:1255:2: ( rulePathElementCS )
            // InternalASBHLang.g:1256:3: rulePathElementCS
            {
             before(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePathElementCS();

            state._fsp--;

             after(grammarAccess.getPathNameCSAccess().getPathPathElementCSParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PathNameCS__PathAssignment_1_1"


    // $ANTLR start "rule__PathElementCS__NameAssignment"
    // InternalASBHLang.g:1265:1: rule__PathElementCS__NameAssignment : ( RULE_ID ) ;
    public final void rule__PathElementCS__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalASBHLang.g:1269:1: ( ( RULE_ID ) )
            // InternalASBHLang.g:1270:2: ( RULE_ID )
            {
            // InternalASBHLang.g:1270:2: ( RULE_ID )
            // InternalASBHLang.g:1271:3: RULE_ID
            {
             before(grammarAccess.getPathElementCSAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathElementCSAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__PathElementCS__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000181000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});

}