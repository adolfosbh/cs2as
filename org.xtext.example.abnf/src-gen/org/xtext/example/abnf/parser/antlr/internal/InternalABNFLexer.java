package org.xtext.example.abnf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalABNFLexer extends Lexer {
    public static final int T__9=9;
    public static final int RULE_ID=6;
    public static final int RULE_WS=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ARROW=5;
    public static final int RULE_ABSTRACT=7;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int RULE_DOUBLEARROW=4;

    // delegates
    // delegators

    public InternalABNFLexer() {;} 
    public InternalABNFLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalABNFLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalABNF.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalABNF.g:11:6: ( ';' )
            // InternalABNF.g:11:8: ';'
            {
            match(';'); 

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
            // InternalABNF.g:12:7: ( '[' )
            // InternalABNF.g:12:9: '['
            {
            match('['); 

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
            // InternalABNF.g:13:7: ( '<' )
            // InternalABNF.g:13:9: '<'
            {
            match('<'); 

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
            // InternalABNF.g:14:7: ( ':' )
            // InternalABNF.g:14:9: ':'
            {
            match(':'); 

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
            // InternalABNF.g:15:7: ( '>' )
            // InternalABNF.g:15:9: '>'
            {
            match('>'); 

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
            // InternalABNF.g:16:7: ( '*' )
            // InternalABNF.g:16:9: '*'
            {
            match('*'); 

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
            // InternalABNF.g:17:7: ( '+' )
            // InternalABNF.g:17:9: '+'
            {
            match('+'); 

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
            // InternalABNF.g:18:7: ( '?' )
            // InternalABNF.g:18:9: '?'
            {
            match('?'); 

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
            // InternalABNF.g:19:7: ( ']' )
            // InternalABNF.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_ABSTRACT"
    public final void mRULE_ABSTRACT() throws RecognitionException {
        try {
            int _type = RULE_ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalABNF.g:532:15: ( '!' )
            // InternalABNF.g:532:17: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABSTRACT"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalABNF.g:534:12: ( '->' )
            // InternalABNF.g:534:14: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_DOUBLEARROW"
    public final void mRULE_DOUBLEARROW() throws RecognitionException {
        try {
            int _type = RULE_DOUBLEARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalABNF.g:536:18: ( '=>' )
            // InternalABNF.g:536:20: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLEARROW"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalABNF.g:538:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )* )
            // InternalABNF.g:538:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalABNF.g:538:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalABNF.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalABNF.g:540:9: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // InternalABNF.g:540:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // InternalABNF.g:540:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalABNF.g:
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
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalABNF.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_ABSTRACT | RULE_ARROW | RULE_DOUBLEARROW | RULE_ID | RULE_WS )
        int alt3=14;
        switch ( input.LA(1) ) {
        case ';':
            {
            alt3=1;
            }
            break;
        case '[':
            {
            alt3=2;
            }
            break;
        case '<':
            {
            alt3=3;
            }
            break;
        case ':':
            {
            alt3=4;
            }
            break;
        case '>':
            {
            alt3=5;
            }
            break;
        case '*':
            {
            alt3=6;
            }
            break;
        case '+':
            {
            alt3=7;
            }
            break;
        case '?':
            {
            alt3=8;
            }
            break;
        case ']':
            {
            alt3=9;
            }
            break;
        case '!':
            {
            alt3=10;
            }
            break;
        case '-':
            {
            alt3=11;
            }
            break;
        case '=':
            {
            alt3=12;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=13;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // InternalABNF.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalABNF.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalABNF.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // InternalABNF.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // InternalABNF.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // InternalABNF.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // InternalABNF.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // InternalABNF.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // InternalABNF.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // InternalABNF.g:1:63: RULE_ABSTRACT
                {
                mRULE_ABSTRACT(); 

                }
                break;
            case 11 :
                // InternalABNF.g:1:77: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 12 :
                // InternalABNF.g:1:88: RULE_DOUBLEARROW
                {
                mRULE_DOUBLEARROW(); 

                }
                break;
            case 13 :
                // InternalABNF.g:1:105: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalABNF.g:1:113: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


 

}