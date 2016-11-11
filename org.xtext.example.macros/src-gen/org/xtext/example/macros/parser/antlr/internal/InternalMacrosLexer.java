package org.xtext.example.macros.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMacrosLexer extends Lexer {
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int RULE_WS=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_DQVAL=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalMacrosLexer() {;} 
    public InternalMacrosLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMacrosLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMacros.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:11:6: ( 'VERSION' )
            // InternalMacros.g:11:8: 'VERSION'
            {
            match("VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:12:6: ( 'TAG' )
            // InternalMacros.g:12:8: 'TAG'
            {
            match("TAG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:13:6: ( 'URL' )
            // InternalMacros.g:13:8: 'URL'
            {
            match("URL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:14:6: ( 'TAB' )
            // InternalMacros.g:14:8: 'TAB'
            {
            match("TAB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:15:7: ( 'BUILD' )
            // InternalMacros.g:15:9: 'BUILD'
            {
            match("BUILD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:16:7: ( '=' )
            // InternalMacros.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:17:7: ( 'TYPE' )
            // InternalMacros.g:17:9: 'TYPE'
            {
            match("TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:18:7: ( 'ATTR' )
            // InternalMacros.g:18:9: 'ATTR'
            {
            match("ATTR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:19:7: ( 'POS' )
            // InternalMacros.g:19:9: 'POS'
            {
            match("POS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:20:7: ( 'CONTENT' )
            // InternalMacros.g:20:9: 'CONTENT'
            {
            match("CONTENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:21:7: ( 'GOTO' )
            // InternalMacros.g:21:9: 'GOTO'
            {
            match("GOTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:22:7: ( 'T' )
            // InternalMacros.g:22:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:586:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMacros.g:586:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMacros.g:586:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMacros.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_DQVAL"
    public final void mRULE_DQVAL() throws RecognitionException {
        try {
            int _type = RULE_DQVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMacros.g:588:12: ( (~ ( ( ' ' | '\\t' | '\\r' | '\\n' ) ) )+ )
            // InternalMacros.g:588:14: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' ) ) )+
            {
            // InternalMacros.g:588:14: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\u001F')||(LA2_0>='!' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMacros.g:588:14: ~ ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DQVAL"

    public void mTokens() throws RecognitionException {
        // InternalMacros.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_WS | RULE_DQVAL )
        int alt3=14;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // InternalMacros.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // InternalMacros.g:1:15: T__7
                {
                mT__7(); 

                }
                break;
            case 3 :
                // InternalMacros.g:1:20: T__8
                {
                mT__8(); 

                }
                break;
            case 4 :
                // InternalMacros.g:1:25: T__9
                {
                mT__9(); 

                }
                break;
            case 5 :
                // InternalMacros.g:1:30: T__10
                {
                mT__10(); 

                }
                break;
            case 6 :
                // InternalMacros.g:1:36: T__11
                {
                mT__11(); 

                }
                break;
            case 7 :
                // InternalMacros.g:1:42: T__12
                {
                mT__12(); 

                }
                break;
            case 8 :
                // InternalMacros.g:1:48: T__13
                {
                mT__13(); 

                }
                break;
            case 9 :
                // InternalMacros.g:1:54: T__14
                {
                mT__14(); 

                }
                break;
            case 10 :
                // InternalMacros.g:1:60: T__15
                {
                mT__15(); 

                }
                break;
            case 11 :
                // InternalMacros.g:1:66: T__16
                {
                mT__16(); 

                }
                break;
            case 12 :
                // InternalMacros.g:1:72: T__17
                {
                mT__17(); 

                }
                break;
            case 13 :
                // InternalMacros.g:1:78: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // InternalMacros.g:1:86: RULE_DQVAL
                {
                mRULE_DQVAL(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\1\13\1\17\2\13\1\22\4\13\2\uffff\3\13\1\uffff\2\13\1\uffff\5\13\1\42\1\43\1\13\1\45\2\13\1\50\3\13\2\uffff\1\54\1\uffff\1\13\1\56\1\uffff\1\13\1\60\1\13\1\uffff\1\62\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\66\1\67\2\uffff";
    static final String DFA3_eofS =
        "\70\uffff";
    static final String DFA3_minS =
        "\1\0\1\105\1\0\1\122\1\125\1\0\1\124\3\117\2\uffff\1\122\1\102\1\120\1\uffff\1\114\1\111\1\uffff\1\124\1\123\1\116\1\124\1\123\2\0\1\105\1\0\1\114\1\122\1\0\1\124\1\117\1\111\2\uffff\1\0\1\uffff\1\104\1\0\1\uffff\1\105\1\0\1\117\1\uffff\1\0\1\uffff\1\116\1\uffff\1\116\1\uffff\1\124\2\0\2\uffff";
    static final String DFA3_maxS =
        "\1\uffff\1\105\1\uffff\1\122\1\125\1\uffff\1\124\3\117\2\uffff\1\122\1\107\1\120\1\uffff\1\114\1\111\1\uffff\1\124\1\123\1\116\1\124\1\123\2\uffff\1\105\1\uffff\1\114\1\122\1\uffff\1\124\1\117\1\111\2\uffff\1\uffff\1\uffff\1\104\1\uffff\1\uffff\1\105\1\uffff\1\117\1\uffff\1\uffff\1\uffff\1\116\1\uffff\1\116\1\uffff\1\124\2\uffff\2\uffff";
    static final String DFA3_acceptS =
        "\12\uffff\1\15\1\16\3\uffff\1\14\2\uffff\1\6\17\uffff\1\2\1\4\1\uffff\1\3\2\uffff\1\11\3\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff\1\5\3\uffff\1\1\1\12";
    static final String DFA3_specialS =
        "\1\0\1\uffff\1\3\2\uffff\1\2\22\uffff\1\11\1\14\1\uffff\1\13\2\uffff\1\6\5\uffff\1\4\2\uffff\1\5\2\uffff\1\12\2\uffff\1\1\6\uffff\1\7\1\10\2\uffff}>";
    static final String[] DFA3_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\34\13\1\5\3\13\1\6\1\4\1\10\3\13\1\11\10\13\1\7\3\13\1\2\1\3\1\1\uffa9\13",
            "\1\14",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\40\13\1\15\27\13\1\16\uffa6\13",
            "\1\20",
            "\1\21",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "",
            "\1\27",
            "\1\31\4\uffff\1\30",
            "\1\32",
            "",
            "\1\33",
            "\1\34",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\1\44",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\1\46",
            "\1\47",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "",
            "\1\55",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "",
            "\1\57",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\1\61",
            "",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "",
            "\1\63",
            "",
            "\1\64",
            "",
            "\1\65",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_WS | RULE_DQVAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                        s = -1;
                        if ( (LA3_0=='V') ) {s = 1;}

                        else if ( (LA3_0=='T') ) {s = 2;}

                        else if ( (LA3_0=='U') ) {s = 3;}

                        else if ( (LA3_0=='B') ) {s = 4;}

                        else if ( (LA3_0=='=') ) {s = 5;}

                        else if ( (LA3_0=='A') ) {s = 6;}

                        else if ( (LA3_0=='P') ) {s = 7;}

                        else if ( (LA3_0=='C') ) {s = 8;}

                        else if ( (LA3_0=='G') ) {s = 9;}

                        else if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {s = 10;}

                        else if ( ((LA3_0>='\u0000' && LA3_0<='\b')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\u001F')||(LA3_0>='!' && LA3_0<='<')||(LA3_0>='>' && LA3_0<='@')||(LA3_0>='D' && LA3_0<='F')||(LA3_0>='H' && LA3_0<='O')||(LA3_0>='Q' && LA3_0<='S')||(LA3_0>='W' && LA3_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_45 = input.LA(1);

                        s = -1;
                        if ( ((LA3_45>='\u0000' && LA3_45<='\b')||(LA3_45>='\u000B' && LA3_45<='\f')||(LA3_45>='\u000E' && LA3_45<='\u001F')||(LA3_45>='!' && LA3_45<='\uFFFF')) ) {s = 11;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_5 = input.LA(1);

                        s = -1;
                        if ( ((LA3_5>='\u0000' && LA3_5<='\b')||(LA3_5>='\u000B' && LA3_5<='\f')||(LA3_5>='\u000E' && LA3_5<='\u001F')||(LA3_5>='!' && LA3_5<='\uFFFF')) ) {s = 11;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_2 = input.LA(1);

                        s = -1;
                        if ( (LA3_2=='A') ) {s = 13;}

                        else if ( (LA3_2=='Y') ) {s = 14;}

                        else if ( ((LA3_2>='\u0000' && LA3_2<='\b')||(LA3_2>='\u000B' && LA3_2<='\f')||(LA3_2>='\u000E' && LA3_2<='\u001F')||(LA3_2>='!' && LA3_2<='@')||(LA3_2>='B' && LA3_2<='X')||(LA3_2>='Z' && LA3_2<='\uFFFF')) ) {s = 11;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_36 = input.LA(1);

                        s = -1;
                        if ( ((LA3_36>='\u0000' && LA3_36<='\b')||(LA3_36>='\u000B' && LA3_36<='\f')||(LA3_36>='\u000E' && LA3_36<='\u001F')||(LA3_36>='!' && LA3_36<='\uFFFF')) ) {s = 11;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_39 = input.LA(1);

                        s = -1;
                        if ( ((LA3_39>='\u0000' && LA3_39<='\b')||(LA3_39>='\u000B' && LA3_39<='\f')||(LA3_39>='\u000E' && LA3_39<='\u001F')||(LA3_39>='!' && LA3_39<='\uFFFF')) ) {s = 11;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_30 = input.LA(1);

                        s = -1;
                        if ( ((LA3_30>='\u0000' && LA3_30<='\b')||(LA3_30>='\u000B' && LA3_30<='\f')||(LA3_30>='\u000E' && LA3_30<='\u001F')||(LA3_30>='!' && LA3_30<='\uFFFF')) ) {s = 11;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_52 = input.LA(1);

                        s = -1;
                        if ( ((LA3_52>='\u0000' && LA3_52<='\b')||(LA3_52>='\u000B' && LA3_52<='\f')||(LA3_52>='\u000E' && LA3_52<='\u001F')||(LA3_52>='!' && LA3_52<='\uFFFF')) ) {s = 11;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_53 = input.LA(1);

                        s = -1;
                        if ( ((LA3_53>='\u0000' && LA3_53<='\b')||(LA3_53>='\u000B' && LA3_53<='\f')||(LA3_53>='\u000E' && LA3_53<='\u001F')||(LA3_53>='!' && LA3_53<='\uFFFF')) ) {s = 11;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_24 = input.LA(1);

                        s = -1;
                        if ( ((LA3_24>='\u0000' && LA3_24<='\b')||(LA3_24>='\u000B' && LA3_24<='\f')||(LA3_24>='\u000E' && LA3_24<='\u001F')||(LA3_24>='!' && LA3_24<='\uFFFF')) ) {s = 11;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_42 = input.LA(1);

                        s = -1;
                        if ( ((LA3_42>='\u0000' && LA3_42<='\b')||(LA3_42>='\u000B' && LA3_42<='\f')||(LA3_42>='\u000E' && LA3_42<='\u001F')||(LA3_42>='!' && LA3_42<='\uFFFF')) ) {s = 11;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_27 = input.LA(1);

                        s = -1;
                        if ( ((LA3_27>='\u0000' && LA3_27<='\b')||(LA3_27>='\u000B' && LA3_27<='\f')||(LA3_27>='\u000E' && LA3_27<='\u001F')||(LA3_27>='!' && LA3_27<='\uFFFF')) ) {s = 11;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_25 = input.LA(1);

                        s = -1;
                        if ( ((LA3_25>='\u0000' && LA3_25<='\b')||(LA3_25>='\u000B' && LA3_25<='\f')||(LA3_25>='\u000E' && LA3_25<='\u001F')||(LA3_25>='!' && LA3_25<='\uFFFF')) ) {s = 11;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}