// $ANTLR 3.4 W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g 2012-08-29 13:32:40

package org.alfresco.repo.search.impl.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FTSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMP", "AND", "AT", "BAR", "BOOST", "CARAT", "COLON", "COMMA", "CONJUNCTION", "DECIMAL_INTEGER_LITERAL", "DECIMAL_NUMERAL", "DEFAULT", "DIGIT", "DISJUNCTION", "DOLLAR", "DOT", "DOTDOT", "E", "EQUALS", "EXACT_PHRASE", "EXACT_TERM", "EXCLAMATION", "EXCLUDE", "EXCLUSIVE", "EXPONENT", "FG_EXACT_PHRASE", "FG_EXACT_TERM", "FG_PHRASE", "FG_PROXIMITY", "FG_RANGE", "FG_SYNONYM", "FG_TERM", "FIELD_CONJUNCTION", "FIELD_DEFAULT", "FIELD_DISJUNCTION", "FIELD_EXCLUDE", "FIELD_GROUP", "FIELD_MANDATORY", "FIELD_NEGATION", "FIELD_OPTIONAL", "FIELD_REF", "FLOATING_POINT_LITERAL", "FTS", "FTSPHRASE", "FTSPRE", "FTSWILD", "FTSWORD", "FUZZY", "F_ESC", "F_HEX", "F_URI_ALPHA", "F_URI_DIGIT", "F_URI_ESC", "F_URI_OTHER", "GT", "ID", "INCLUSIVE", "IN_WORD", "LCURL", "LPAREN", "LSQUARE", "LT", "MANDATORY", "MINUS", "NAME_SPACE", "NEGATION", "NON_ZERO_DIGIT", "NOT", "OPTIONAL", "OR", "PERCENT", "PHRASE", "PLUS", "PREFIX", "PROXIMITY", "QUALIFIER", "QUESTION_MARK", "RANGE", "RCURL", "RPAREN", "RSQUARE", "SIGNED_INTEGER", "STAR", "START_WORD", "SYNONYM", "TEMPLATE", "TERM", "TILDA", "TO", "URI", "WS", "ZERO_DIGIT"
    };

    public static final int EOF=-1;
    public static final int AMP=4;
    public static final int AND=5;
    public static final int AT=6;
    public static final int BAR=7;
    public static final int BOOST=8;
    public static final int CARAT=9;
    public static final int COLON=10;
    public static final int COMMA=11;
    public static final int CONJUNCTION=12;
    public static final int DECIMAL_INTEGER_LITERAL=13;
    public static final int DECIMAL_NUMERAL=14;
    public static final int DEFAULT=15;
    public static final int DIGIT=16;
    public static final int DISJUNCTION=17;
    public static final int DOLLAR=18;
    public static final int DOT=19;
    public static final int DOTDOT=20;
    public static final int E=21;
    public static final int EQUALS=22;
    public static final int EXACT_PHRASE=23;
    public static final int EXACT_TERM=24;
    public static final int EXCLAMATION=25;
    public static final int EXCLUDE=26;
    public static final int EXCLUSIVE=27;
    public static final int EXPONENT=28;
    public static final int FG_EXACT_PHRASE=29;
    public static final int FG_EXACT_TERM=30;
    public static final int FG_PHRASE=31;
    public static final int FG_PROXIMITY=32;
    public static final int FG_RANGE=33;
    public static final int FG_SYNONYM=34;
    public static final int FG_TERM=35;
    public static final int FIELD_CONJUNCTION=36;
    public static final int FIELD_DEFAULT=37;
    public static final int FIELD_DISJUNCTION=38;
    public static final int FIELD_EXCLUDE=39;
    public static final int FIELD_GROUP=40;
    public static final int FIELD_MANDATORY=41;
    public static final int FIELD_NEGATION=42;
    public static final int FIELD_OPTIONAL=43;
    public static final int FIELD_REF=44;
    public static final int FLOATING_POINT_LITERAL=45;
    public static final int FTS=46;
    public static final int FTSPHRASE=47;
    public static final int FTSPRE=48;
    public static final int FTSWILD=49;
    public static final int FTSWORD=50;
    public static final int FUZZY=51;
    public static final int F_ESC=52;
    public static final int F_HEX=53;
    public static final int F_URI_ALPHA=54;
    public static final int F_URI_DIGIT=55;
    public static final int F_URI_ESC=56;
    public static final int F_URI_OTHER=57;
    public static final int GT=58;
    public static final int ID=59;
    public static final int INCLUSIVE=60;
    public static final int IN_WORD=61;
    public static final int LCURL=62;
    public static final int LPAREN=63;
    public static final int LSQUARE=64;
    public static final int LT=65;
    public static final int MANDATORY=66;
    public static final int MINUS=67;
    public static final int NAME_SPACE=68;
    public static final int NEGATION=69;
    public static final int NON_ZERO_DIGIT=70;
    public static final int NOT=71;
    public static final int OPTIONAL=72;
    public static final int OR=73;
    public static final int PERCENT=74;
    public static final int PHRASE=75;
    public static final int PLUS=76;
    public static final int PREFIX=77;
    public static final int PROXIMITY=78;
    public static final int QUALIFIER=79;
    public static final int QUESTION_MARK=80;
    public static final int RANGE=81;
    public static final int RCURL=82;
    public static final int RPAREN=83;
    public static final int RSQUARE=84;
    public static final int SIGNED_INTEGER=85;
    public static final int STAR=86;
    public static final int START_WORD=87;
    public static final int SYNONYM=88;
    public static final int TEMPLATE=89;
    public static final int TERM=90;
    public static final int TILDA=91;
    public static final int TO=92;
    public static final int URI=93;
    public static final int WS=94;
    public static final int ZERO_DIGIT=95;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FTSParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FTSParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FTSParser.tokenNames; }
    public String getGrammarFileName() { return "W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g"; }


        public enum Mode
        {
            CMIS, DEFAULT_CONJUNCTION, DEFAULT_DISJUNCTION
        }
        
        private Stack<String> paraphrases = new Stack<String>();
        
        private boolean defaultFieldConjunction = true;
        
        private Mode mode = Mode.DEFAULT_CONJUNCTION;
        
        public Mode getMode()
        {
           return mode;
        }
        
        public void setMode(Mode mode)
        {
           this.mode = mode;
        }
        
        public boolean defaultFieldConjunction()
        {
           return defaultFieldConjunction;
        }
        
        public void setDefaultFieldConjunction(boolean defaultFieldConjunction)
        {
           this.defaultFieldConjunction = defaultFieldConjunction;
        }
        
        protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
        {
            throw new MismatchedTokenException(ttype, input);
        }
            
        public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException
        {
            throw e;
        }
        
       public String getErrorMessage(RecognitionException e, String[] tokenNames) 
        {
            List stack = getRuleInvocationStack(e, this.getClass().getName());
            String msg = e.getMessage();
            if ( e instanceof UnwantedTokenException ) 
                {
                UnwantedTokenException ute = (UnwantedTokenException)e;
                String tokenName="<unknown>";
                if ( ute.expecting== Token.EOF ) 
                {
                    tokenName = "EOF";
                }
                else 
                {
                    tokenName = tokenNames[ute.expecting];
                }
                msg = "extraneous input " + getTokenErrorDisplay(ute.getUnexpectedToken())
                    + " expecting "+tokenName;
            }
            else if ( e instanceof MissingTokenException ) 
            {
                MissingTokenException mte = (MissingTokenException)e;
                String tokenName="<unknown>";
                if ( mte.expecting== Token.EOF ) 
                {
                    tokenName = "EOF";
                }
                else 
                {
                    tokenName = tokenNames[mte.expecting];
                }
                msg = "missing " + tokenName+" at " + getTokenErrorDisplay(e.token)
                    + "  (" + getLongTokenErrorDisplay(e.token) +")";
            }
            else if ( e instanceof MismatchedTokenException ) 
            {
                MismatchedTokenException mte = (MismatchedTokenException)e;
                String tokenName="<unknown>";
                if ( mte.expecting== Token.EOF ) 
                {
                    tokenName = "EOF";
                }
                else
                {
                    tokenName = tokenNames[mte.expecting];
                }
                msg = "mismatched input " + getTokenErrorDisplay(e.token)
                    + " expecting " + tokenName +"  (" + getLongTokenErrorDisplay(e.token) + ")";
            }
            else if ( e instanceof MismatchedTreeNodeException ) 
            {
                MismatchedTreeNodeException mtne = (MismatchedTreeNodeException)e;
                String tokenName="<unknown>";
                if ( mtne.expecting==Token.EOF )  
                {
                    tokenName = "EOF";
                }
                else 
                {
                    tokenName = tokenNames[mtne.expecting];
                }
                msg = "mismatched tree node: " + mtne.node + " expecting " + tokenName;
            }
            else if ( e instanceof NoViableAltException ) 
            {
                NoViableAltException nvae = (NoViableAltException)e;
                msg = "no viable alternative at input " + getTokenErrorDisplay(e.token)
                    + "\n\t (decision=" + nvae.decisionNumber
                    + " state " + nvae.stateNumber + ")" 
                    + " decision=<<" + nvae.grammarDecisionDescription + ">>";
            }
            else if ( e instanceof EarlyExitException ) 
            {
                //EarlyExitException eee = (EarlyExitException)e;
                // for development, can add "(decision="+eee.decisionNumber+")"
                msg = "required (...)+ loop did not match anything at input " + getTokenErrorDisplay(e.token);
            }
                else if ( e instanceof MismatchedSetException ) 
                {
                    MismatchedSetException mse = (MismatchedSetException)e;
                    msg = "mismatched input " + getTokenErrorDisplay(e.token)
                    + " expecting set " + mse.expecting;
            }
            else if ( e instanceof MismatchedNotSetException ) 
            {
                MismatchedNotSetException mse = (MismatchedNotSetException)e;
                msg = "mismatched input " + getTokenErrorDisplay(e.token)
                    + " expecting set " + mse.expecting;
            }
            else if ( e instanceof FailedPredicateException ) 
            {
                FailedPredicateException fpe = (FailedPredicateException)e;
                msg = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
            }
                    
            if(paraphrases.size() > 0)
            {
                String paraphrase = (String)paraphrases.peek();
                msg = msg+" "+paraphrase;
            }
            return msg +"\n\t"+stack;
        }
            
        public String getLongTokenErrorDisplay(Token t)
        {
            return t.toString();
        }
        

        public String getErrorString(RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, this.getTokenNames());
            return hdr+" "+msg;
        } 


    public static class ftsQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsQuery"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:352:1: ftsQuery : ftsDisjunction EOF -> ftsDisjunction ;
    public final FTSParser.ftsQuery_return ftsQuery() throws RecognitionException {
        FTSParser.ftsQuery_return retval = new FTSParser.ftsQuery_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        FTSParser.ftsDisjunction_return ftsDisjunction1 =null;


        Object EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_ftsDisjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsDisjunction");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:353:9: ( ftsDisjunction EOF -> ftsDisjunction )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:354:9: ftsDisjunction EOF
            {
            pushFollow(FOLLOW_ftsDisjunction_in_ftsQuery577);
            ftsDisjunction1=ftsDisjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsDisjunction.add(ftsDisjunction1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_ftsQuery579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: ftsDisjunction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 355:17: -> ftsDisjunction
            {
                adaptor.addChild(root_0, stream_ftsDisjunction.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsQuery"


    public static class ftsDisjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsDisjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:363:1: ftsDisjunction : ({...}? cmisExplicitDisjunction |{...}? ftsExplicitDisjunction |{...}? ftsImplicitDisjunction );
    public final FTSParser.ftsDisjunction_return ftsDisjunction() throws RecognitionException {
        FTSParser.ftsDisjunction_return retval = new FTSParser.ftsDisjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.cmisExplicitDisjunction_return cmisExplicitDisjunction3 =null;

        FTSParser.ftsExplicitDisjunction_return ftsExplicitDisjunction4 =null;

        FTSParser.ftsImplicitDisjunction_return ftsImplicitDisjunction5 =null;



        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:364:9: ({...}? cmisExplicitDisjunction |{...}? ftsExplicitDisjunction |{...}? ftsImplicitDisjunction )
            int alt1=3;
            switch ( input.LA(1) ) {
            case COMMA:
            case DOT:
                {
                int LA1_1 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
                }
                break;
            case NOT:
                {
                int LA1_2 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case FTSPHRASE:
                {
                int LA1_3 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
                {
                int LA1_4 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;

                }
                }
                break;
            case AND:
                {
                alt1=2;
                }
                break;
            case AMP:
                {
                alt1=2;
                }
                break;
            case ID:
                {
                int LA1_7 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 7, input);

                    throw nvae;

                }
                }
                break;
            case EXCLAMATION:
                {
                int LA1_8 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 8, input);

                    throw nvae;

                }
                }
                break;
            case QUESTION_MARK:
            case STAR:
                {
                int LA1_9 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 9, input);

                    throw nvae;

                }
                }
                break;
            case AT:
                {
                int LA1_10 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 10, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL_INTEGER_LITERAL:
            case FLOATING_POINT_LITERAL:
            case FTSPRE:
            case FTSWILD:
            case FTSWORD:
                {
                int LA1_11 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 11, input);

                    throw nvae;

                }
                }
                break;
            case URI:
                {
                int LA1_12 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 12, input);

                    throw nvae;

                }
                }
                break;
            case EQUALS:
                {
                int LA1_13 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 13, input);

                    throw nvae;

                }
                }
                break;
            case TILDA:
                {
                int LA1_14 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 14, input);

                    throw nvae;

                }
                }
                break;
            case TO:
                {
                int LA1_15 = input.LA(2);

                if ( ((getMode() == Mode.CMIS)) ) {
                    alt1=1;
                }
                else if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 15, input);

                    throw nvae;

                }
                }
                break;
            case LSQUARE:
                {
                int LA1_16 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 16, input);

                    throw nvae;

                }
                }
                break;
            case LT:
                {
                int LA1_17 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 17, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA1_18 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 18, input);

                    throw nvae;

                }
                }
                break;
            case PERCENT:
                {
                int LA1_19 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 19, input);

                    throw nvae;

                }
                }
                break;
            case PLUS:
                {
                int LA1_20 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 20, input);

                    throw nvae;

                }
                }
                break;
            case BAR:
                {
                int LA1_21 = input.LA(2);

                if ( ((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                    alt1=2;
                }
                else if ( ((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 21, input);

                    throw nvae;

                }
                }
                break;
            case OR:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:365:11: {...}? cmisExplicitDisjunction
                    {
                    root_0 = (Object)adaptor.nil();


                    if ( !((getMode() == Mode.CMIS)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "ftsDisjunction", "getMode() == Mode.CMIS");
                    }

                    pushFollow(FOLLOW_cmisExplicitDisjunction_in_ftsDisjunction639);
                    cmisExplicitDisjunction3=cmisExplicitDisjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmisExplicitDisjunction3.getTree());

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:366:11: {...}? ftsExplicitDisjunction
                    {
                    root_0 = (Object)adaptor.nil();


                    if ( !((getMode() == Mode.DEFAULT_CONJUNCTION)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "ftsDisjunction", "getMode() == Mode.DEFAULT_CONJUNCTION");
                    }

                    pushFollow(FOLLOW_ftsExplicitDisjunction_in_ftsDisjunction653);
                    ftsExplicitDisjunction4=ftsExplicitDisjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsExplicitDisjunction4.getTree());

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:367:11: {...}? ftsImplicitDisjunction
                    {
                    root_0 = (Object)adaptor.nil();


                    if ( !((getMode() == Mode.DEFAULT_DISJUNCTION)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "ftsDisjunction", "getMode() == Mode.DEFAULT_DISJUNCTION");
                    }

                    pushFollow(FOLLOW_ftsImplicitDisjunction_in_ftsDisjunction667);
                    ftsImplicitDisjunction5=ftsImplicitDisjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsImplicitDisjunction5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsDisjunction"


    public static class ftsExplicitDisjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsExplicitDisjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:370:1: ftsExplicitDisjunction : ftsImplicitConjunction ( or ftsImplicitConjunction )* -> ^( DISJUNCTION ( ftsImplicitConjunction )+ ) ;
    public final FTSParser.ftsExplicitDisjunction_return ftsExplicitDisjunction() throws RecognitionException {
        FTSParser.ftsExplicitDisjunction_return retval = new FTSParser.ftsExplicitDisjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsImplicitConjunction_return ftsImplicitConjunction6 =null;

        FTSParser.or_return or7 =null;

        FTSParser.ftsImplicitConjunction_return ftsImplicitConjunction8 =null;


        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        RewriteRuleSubtreeStream stream_ftsImplicitConjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsImplicitConjunction");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:371:9: ( ftsImplicitConjunction ( or ftsImplicitConjunction )* -> ^( DISJUNCTION ( ftsImplicitConjunction )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:372:9: ftsImplicitConjunction ( or ftsImplicitConjunction )*
            {
            pushFollow(FOLLOW_ftsImplicitConjunction_in_ftsExplicitDisjunction700);
            ftsImplicitConjunction6=ftsImplicitConjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsImplicitConjunction.add(ftsImplicitConjunction6.getTree());

            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:372:32: ( or ftsImplicitConjunction )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BAR||LA2_0==OR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:372:33: or ftsImplicitConjunction
            	    {
            	    pushFollow(FOLLOW_or_in_ftsExplicitDisjunction703);
            	    or7=or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_or.add(or7.getTree());

            	    pushFollow(FOLLOW_ftsImplicitConjunction_in_ftsExplicitDisjunction705);
            	    ftsImplicitConjunction8=ftsImplicitConjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsImplicitConjunction.add(ftsImplicitConjunction8.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: ftsImplicitConjunction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 373:17: -> ^( DISJUNCTION ( ftsImplicitConjunction )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:374:25: ^( DISJUNCTION ( ftsImplicitConjunction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DISJUNCTION, "DISJUNCTION")
                , root_1);

                if ( !(stream_ftsImplicitConjunction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsImplicitConjunction.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsImplicitConjunction.nextTree());

                }
                stream_ftsImplicitConjunction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsExplicitDisjunction"


    public static class cmisExplicitDisjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmisExplicitDisjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:377:1: cmisExplicitDisjunction : cmisConjunction ( or cmisConjunction )* -> ^( DISJUNCTION ( cmisConjunction )+ ) ;
    public final FTSParser.cmisExplicitDisjunction_return cmisExplicitDisjunction() throws RecognitionException {
        FTSParser.cmisExplicitDisjunction_return retval = new FTSParser.cmisExplicitDisjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.cmisConjunction_return cmisConjunction9 =null;

        FTSParser.or_return or10 =null;

        FTSParser.cmisConjunction_return cmisConjunction11 =null;


        RewriteRuleSubtreeStream stream_cmisConjunction=new RewriteRuleSubtreeStream(adaptor,"rule cmisConjunction");
        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:378:9: ( cmisConjunction ( or cmisConjunction )* -> ^( DISJUNCTION ( cmisConjunction )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:379:9: cmisConjunction ( or cmisConjunction )*
            {
            pushFollow(FOLLOW_cmisConjunction_in_cmisExplicitDisjunction789);
            cmisConjunction9=cmisConjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cmisConjunction.add(cmisConjunction9.getTree());

            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:379:25: ( or cmisConjunction )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BAR||LA3_0==OR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:379:26: or cmisConjunction
            	    {
            	    pushFollow(FOLLOW_or_in_cmisExplicitDisjunction792);
            	    or10=or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_or.add(or10.getTree());

            	    pushFollow(FOLLOW_cmisConjunction_in_cmisExplicitDisjunction794);
            	    cmisConjunction11=cmisConjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cmisConjunction.add(cmisConjunction11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: cmisConjunction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 380:17: -> ^( DISJUNCTION ( cmisConjunction )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:381:25: ^( DISJUNCTION ( cmisConjunction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DISJUNCTION, "DISJUNCTION")
                , root_1);

                if ( !(stream_cmisConjunction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_cmisConjunction.hasNext() ) {
                    adaptor.addChild(root_1, stream_cmisConjunction.nextTree());

                }
                stream_cmisConjunction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmisExplicitDisjunction"


    public static class ftsImplicitDisjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsImplicitDisjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:384:1: ftsImplicitDisjunction : ( ( or )? ftsExplicitConjunction )+ -> ^( DISJUNCTION ( ftsExplicitConjunction )+ ) ;
    public final FTSParser.ftsImplicitDisjunction_return ftsImplicitDisjunction() throws RecognitionException {
        FTSParser.ftsImplicitDisjunction_return retval = new FTSParser.ftsImplicitDisjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.or_return or12 =null;

        FTSParser.ftsExplicitConjunction_return ftsExplicitConjunction13 =null;


        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        RewriteRuleSubtreeStream stream_ftsExplicitConjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsExplicitConjunction");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:385:9: ( ( ( or )? ftsExplicitConjunction )+ -> ^( DISJUNCTION ( ftsExplicitConjunction )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:386:9: ( ( or )? ftsExplicitConjunction )+
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:386:9: ( ( or )? ftsExplicitConjunction )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case OR:
                    {
                    alt5=1;
                    }
                    break;
                case BAR:
                    {
                    alt5=1;
                    }
                    break;
                case NOT:
                    {
                    alt5=1;
                    }
                    break;
                case EXCLAMATION:
                    {
                    alt5=1;
                    }
                    break;
                case ID:
                    {
                    alt5=1;
                    }
                    break;
                case AT:
                    {
                    alt5=1;
                    }
                    break;
                case DECIMAL_INTEGER_LITERAL:
                case FLOATING_POINT_LITERAL:
                case FTSPRE:
                case FTSWILD:
                case FTSWORD:
                    {
                    alt5=1;
                    }
                    break;
                case URI:
                    {
                    alt5=1;
                    }
                    break;
                case FTSPHRASE:
                    {
                    alt5=1;
                    }
                    break;
                case COMMA:
                case DOT:
                    {
                    alt5=1;
                    }
                    break;
                case QUESTION_MARK:
                case STAR:
                    {
                    alt5=1;
                    }
                    break;
                case EQUALS:
                    {
                    alt5=1;
                    }
                    break;
                case TILDA:
                    {
                    alt5=1;
                    }
                    break;
                case TO:
                    {
                    alt5=1;
                    }
                    break;
                case LSQUARE:
                    {
                    alt5=1;
                    }
                    break;
                case LT:
                    {
                    alt5=1;
                    }
                    break;
                case LPAREN:
                    {
                    alt5=1;
                    }
                    break;
                case PERCENT:
                    {
                    alt5=1;
                    }
                    break;
                case PLUS:
                    {
                    alt5=1;
                    }
                    break;
                case MINUS:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:386:10: ( or )? ftsExplicitConjunction
            	    {
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:386:10: ( or )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==OR) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==BAR) ) {
            	        int LA4_2 = input.LA(2);

            	        if ( (LA4_2==BAR) ) {
            	            alt4=1;
            	        }
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:386:10: or
            	            {
            	            pushFollow(FOLLOW_or_in_ftsImplicitDisjunction879);
            	            or12=or();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_or.add(or12.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_ftsExplicitConjunction_in_ftsImplicitDisjunction882);
            	    ftsExplicitConjunction13=ftsExplicitConjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsExplicitConjunction.add(ftsExplicitConjunction13.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // AST REWRITE
            // elements: ftsExplicitConjunction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 387:17: -> ^( DISJUNCTION ( ftsExplicitConjunction )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:388:25: ^( DISJUNCTION ( ftsExplicitConjunction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DISJUNCTION, "DISJUNCTION")
                , root_1);

                if ( !(stream_ftsExplicitConjunction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsExplicitConjunction.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsExplicitConjunction.nextTree());

                }
                stream_ftsExplicitConjunction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsImplicitDisjunction"


    public static class ftsExplicitConjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsExplicitConjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:395:1: ftsExplicitConjunction : ftsPrefixed ( and ftsPrefixed )* -> ^( CONJUNCTION ( ftsPrefixed )+ ) ;
    public final FTSParser.ftsExplicitConjunction_return ftsExplicitConjunction() throws RecognitionException {
        FTSParser.ftsExplicitConjunction_return retval = new FTSParser.ftsExplicitConjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsPrefixed_return ftsPrefixed14 =null;

        FTSParser.and_return and15 =null;

        FTSParser.ftsPrefixed_return ftsPrefixed16 =null;


        RewriteRuleSubtreeStream stream_ftsPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule ftsPrefixed");
        RewriteRuleSubtreeStream stream_and=new RewriteRuleSubtreeStream(adaptor,"rule and");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:396:9: ( ftsPrefixed ( and ftsPrefixed )* -> ^( CONJUNCTION ( ftsPrefixed )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:397:9: ftsPrefixed ( and ftsPrefixed )*
            {
            pushFollow(FOLLOW_ftsPrefixed_in_ftsExplicitConjunction969);
            ftsPrefixed14=ftsPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsPrefixed.add(ftsPrefixed14.getTree());

            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:397:21: ( and ftsPrefixed )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= AMP && LA6_0 <= AND)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:397:22: and ftsPrefixed
            	    {
            	    pushFollow(FOLLOW_and_in_ftsExplicitConjunction972);
            	    and15=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_and.add(and15.getTree());

            	    pushFollow(FOLLOW_ftsPrefixed_in_ftsExplicitConjunction974);
            	    ftsPrefixed16=ftsPrefixed();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsPrefixed.add(ftsPrefixed16.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: ftsPrefixed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 398:17: -> ^( CONJUNCTION ( ftsPrefixed )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:399:25: ^( CONJUNCTION ( ftsPrefixed )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONJUNCTION, "CONJUNCTION")
                , root_1);

                if ( !(stream_ftsPrefixed.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsPrefixed.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsPrefixed.nextTree());

                }
                stream_ftsPrefixed.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsExplicitConjunction"


    public static class ftsImplicitConjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsImplicitConjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:402:1: ftsImplicitConjunction : ( ( and )? ftsPrefixed )+ -> ^( CONJUNCTION ( ftsPrefixed )+ ) ;
    public final FTSParser.ftsImplicitConjunction_return ftsImplicitConjunction() throws RecognitionException {
        FTSParser.ftsImplicitConjunction_return retval = new FTSParser.ftsImplicitConjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.and_return and17 =null;

        FTSParser.ftsPrefixed_return ftsPrefixed18 =null;


        RewriteRuleSubtreeStream stream_ftsPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule ftsPrefixed");
        RewriteRuleSubtreeStream stream_and=new RewriteRuleSubtreeStream(adaptor,"rule and");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:403:9: ( ( ( and )? ftsPrefixed )+ -> ^( CONJUNCTION ( ftsPrefixed )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:404:9: ( ( and )? ftsPrefixed )+
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:404:9: ( ( and )? ftsPrefixed )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    switch ( input.LA(2) ) {
                    case ID:
                        {
                        alt8=1;
                        }
                        break;
                    case AT:
                        {
                        alt8=1;
                        }
                        break;
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                        {
                        alt8=1;
                        }
                        break;
                    case URI:
                        {
                        alt8=1;
                        }
                        break;
                    case FTSPHRASE:
                        {
                        alt8=1;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt8=1;
                        }
                        break;
                    case QUESTION_MARK:
                    case STAR:
                        {
                        alt8=1;
                        }
                        break;
                    case EQUALS:
                        {
                        alt8=1;
                        }
                        break;
                    case TILDA:
                        {
                        alt8=1;
                        }
                        break;
                    case NOT:
                    case TO:
                        {
                        alt8=1;
                        }
                        break;
                    case LSQUARE:
                        {
                        alt8=1;
                        }
                        break;
                    case LT:
                        {
                        alt8=1;
                        }
                        break;
                    case LPAREN:
                        {
                        alt8=1;
                        }
                        break;
                    case PERCENT:
                        {
                        alt8=1;
                        }
                        break;

                    }

                    }
                    break;
                case AND:
                    {
                    alt8=1;
                    }
                    break;
                case AMP:
                    {
                    alt8=1;
                    }
                    break;
                case NOT:
                    {
                    alt8=1;
                    }
                    break;
                case EXCLAMATION:
                    {
                    alt8=1;
                    }
                    break;
                case ID:
                    {
                    alt8=1;
                    }
                    break;
                case AT:
                    {
                    alt8=1;
                    }
                    break;
                case DECIMAL_INTEGER_LITERAL:
                case FLOATING_POINT_LITERAL:
                case FTSPRE:
                case FTSWILD:
                case FTSWORD:
                    {
                    alt8=1;
                    }
                    break;
                case URI:
                    {
                    alt8=1;
                    }
                    break;
                case FTSPHRASE:
                    {
                    alt8=1;
                    }
                    break;
                case COMMA:
                case DOT:
                    {
                    alt8=1;
                    }
                    break;
                case QUESTION_MARK:
                case STAR:
                    {
                    alt8=1;
                    }
                    break;
                case EQUALS:
                    {
                    alt8=1;
                    }
                    break;
                case TILDA:
                    {
                    alt8=1;
                    }
                    break;
                case TO:
                    {
                    alt8=1;
                    }
                    break;
                case LSQUARE:
                    {
                    alt8=1;
                    }
                    break;
                case LT:
                    {
                    alt8=1;
                    }
                    break;
                case LPAREN:
                    {
                    alt8=1;
                    }
                    break;
                case PERCENT:
                    {
                    alt8=1;
                    }
                    break;
                case PLUS:
                    {
                    alt8=1;
                    }
                    break;
                case MINUS:
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:404:10: ( and )? ftsPrefixed
            	    {
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:404:10: ( and )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==AND) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==AMP) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:404:10: and
            	            {
            	            pushFollow(FOLLOW_and_in_ftsImplicitConjunction1059);
            	            and17=and();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_and.add(and17.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_ftsPrefixed_in_ftsImplicitConjunction1062);
            	    ftsPrefixed18=ftsPrefixed();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsPrefixed.add(ftsPrefixed18.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            // AST REWRITE
            // elements: ftsPrefixed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 405:17: -> ^( CONJUNCTION ( ftsPrefixed )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:406:25: ^( CONJUNCTION ( ftsPrefixed )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONJUNCTION, "CONJUNCTION")
                , root_1);

                if ( !(stream_ftsPrefixed.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsPrefixed.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsPrefixed.nextTree());

                }
                stream_ftsPrefixed.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsImplicitConjunction"


    public static class cmisConjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmisConjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:409:1: cmisConjunction : ( cmisPrefixed )+ -> ^( CONJUNCTION ( cmisPrefixed )+ ) ;
    public final FTSParser.cmisConjunction_return cmisConjunction() throws RecognitionException {
        FTSParser.cmisConjunction_return retval = new FTSParser.cmisConjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.cmisPrefixed_return cmisPrefixed19 =null;


        RewriteRuleSubtreeStream stream_cmisPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule cmisPrefixed");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:410:9: ( ( cmisPrefixed )+ -> ^( CONJUNCTION ( cmisPrefixed )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:411:9: ( cmisPrefixed )+
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:411:9: ( cmisPrefixed )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case COMMA:
                case DOT:
                    {
                    alt9=1;
                    }
                    break;
                case DECIMAL_INTEGER_LITERAL:
                case FLOATING_POINT_LITERAL:
                case FTSPRE:
                case FTSWILD:
                case FTSWORD:
                case ID:
                case NOT:
                case QUESTION_MARK:
                case STAR:
                case TO:
                    {
                    alt9=1;
                    }
                    break;
                case FTSPHRASE:
                    {
                    alt9=1;
                    }
                    break;
                case MINUS:
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:411:9: cmisPrefixed
            	    {
            	    pushFollow(FOLLOW_cmisPrefixed_in_cmisConjunction1146);
            	    cmisPrefixed19=cmisPrefixed();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cmisPrefixed.add(cmisPrefixed19.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            // AST REWRITE
            // elements: cmisPrefixed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 412:17: -> ^( CONJUNCTION ( cmisPrefixed )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:413:25: ^( CONJUNCTION ( cmisPrefixed )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONJUNCTION, "CONJUNCTION")
                , root_1);

                if ( !(stream_cmisPrefixed.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_cmisPrefixed.hasNext() ) {
                    adaptor.addChild(root_1, stream_cmisPrefixed.nextTree());

                }
                stream_cmisPrefixed.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmisConjunction"


    public static class ftsPrefixed_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsPrefixed"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:423:1: ftsPrefixed : ( ( not )=> not ftsTest ( boost )? -> ^( NEGATION ftsTest ( boost )? ) | ftsTest ( boost )? -> ^( DEFAULT ftsTest ( boost )? ) | PLUS ftsTest ( boost )? -> ^( MANDATORY ftsTest ( boost )? ) | BAR ftsTest ( boost )? -> ^( OPTIONAL ftsTest ( boost )? ) | MINUS ftsTest ( boost )? -> ^( EXCLUDE ftsTest ( boost )? ) );
    public final FTSParser.ftsPrefixed_return ftsPrefixed() throws RecognitionException {
        FTSParser.ftsPrefixed_return retval = new FTSParser.ftsPrefixed_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS25=null;
        Token BAR28=null;
        Token MINUS31=null;
        FTSParser.not_return not20 =null;

        FTSParser.ftsTest_return ftsTest21 =null;

        FTSParser.boost_return boost22 =null;

        FTSParser.ftsTest_return ftsTest23 =null;

        FTSParser.boost_return boost24 =null;

        FTSParser.ftsTest_return ftsTest26 =null;

        FTSParser.boost_return boost27 =null;

        FTSParser.ftsTest_return ftsTest29 =null;

        FTSParser.boost_return boost30 =null;

        FTSParser.ftsTest_return ftsTest32 =null;

        FTSParser.boost_return boost33 =null;


        Object PLUS25_tree=null;
        Object BAR28_tree=null;
        Object MINUS31_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_not=new RewriteRuleSubtreeStream(adaptor,"rule not");
        RewriteRuleSubtreeStream stream_ftsTest=new RewriteRuleSubtreeStream(adaptor,"rule ftsTest");
        RewriteRuleSubtreeStream stream_boost=new RewriteRuleSubtreeStream(adaptor,"rule boost");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:424:9: ( ( not )=> not ftsTest ( boost )? -> ^( NEGATION ftsTest ( boost )? ) | ftsTest ( boost )? -> ^( DEFAULT ftsTest ( boost )? ) | PLUS ftsTest ( boost )? -> ^( MANDATORY ftsTest ( boost )? ) | BAR ftsTest ( boost )? -> ^( OPTIONAL ftsTest ( boost )? ) | MINUS ftsTest ( boost )? -> ^( EXCLUDE ftsTest ( boost )? ) )
            int alt15=5;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NOT) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred1_FTS()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA15_0==EXCLAMATION) && (synpred1_FTS())) {
                alt15=1;
            }
            else if ( (LA15_0==ID) ) {
                alt15=2;
            }
            else if ( (LA15_0==AT) ) {
                alt15=2;
            }
            else if ( (LA15_0==DECIMAL_INTEGER_LITERAL||LA15_0==FLOATING_POINT_LITERAL||(LA15_0 >= FTSPRE && LA15_0 <= FTSWORD)) ) {
                alt15=2;
            }
            else if ( (LA15_0==URI) ) {
                alt15=2;
            }
            else if ( (LA15_0==FTSPHRASE) ) {
                alt15=2;
            }
            else if ( (LA15_0==COMMA||LA15_0==DOT) ) {
                alt15=2;
            }
            else if ( (LA15_0==QUESTION_MARK||LA15_0==STAR) ) {
                alt15=2;
            }
            else if ( (LA15_0==EQUALS) ) {
                alt15=2;
            }
            else if ( (LA15_0==TILDA) ) {
                alt15=2;
            }
            else if ( (LA15_0==TO) ) {
                alt15=2;
            }
            else if ( (LA15_0==LSQUARE) ) {
                alt15=2;
            }
            else if ( (LA15_0==LT) ) {
                alt15=2;
            }
            else if ( (LA15_0==LPAREN) ) {
                alt15=2;
            }
            else if ( (LA15_0==PERCENT) ) {
                alt15=2;
            }
            else if ( (LA15_0==PLUS) ) {
                alt15=3;
            }
            else if ( (LA15_0==BAR) ) {
                alt15=4;
            }
            else if ( (LA15_0==MINUS) ) {
                alt15=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:425:9: ( not )=> not ftsTest ( boost )?
                    {
                    pushFollow(FOLLOW_not_in_ftsPrefixed1238);
                    not20=not();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_not.add(not20.getTree());

                    pushFollow(FOLLOW_ftsTest_in_ftsPrefixed1240);
                    ftsTest21=ftsTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsTest.add(ftsTest21.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:425:30: ( boost )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==CARAT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:425:30: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsPrefixed1242);
                            boost22=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost22.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: boost, ftsTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:17: -> ^( NEGATION ftsTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:427:25: ^( NEGATION ftsTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NEGATION, "NEGATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:427:44: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:428:11: ftsTest ( boost )?
                    {
                    pushFollow(FOLLOW_ftsTest_in_ftsPrefixed1306);
                    ftsTest23=ftsTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsTest.add(ftsTest23.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:428:19: ( boost )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==CARAT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:428:19: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsPrefixed1308);
                            boost24=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost24.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsTest, boost
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 429:17: -> ^( DEFAULT ftsTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:430:25: ^( DEFAULT ftsTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEFAULT, "DEFAULT")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:430:43: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:431:11: PLUS ftsTest ( boost )?
                    {
                    PLUS25=(Token)match(input,PLUS,FOLLOW_PLUS_in_ftsPrefixed1372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS25);


                    pushFollow(FOLLOW_ftsTest_in_ftsPrefixed1374);
                    ftsTest26=ftsTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsTest.add(ftsTest26.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:431:24: ( boost )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==CARAT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:431:24: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsPrefixed1376);
                            boost27=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost27.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsTest, boost
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 432:17: -> ^( MANDATORY ftsTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:433:25: ^( MANDATORY ftsTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MANDATORY, "MANDATORY")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:433:45: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:434:11: BAR ftsTest ( boost )?
                    {
                    BAR28=(Token)match(input,BAR,FOLLOW_BAR_in_ftsPrefixed1440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BAR.add(BAR28);


                    pushFollow(FOLLOW_ftsTest_in_ftsPrefixed1442);
                    ftsTest29=ftsTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsTest.add(ftsTest29.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:434:23: ( boost )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==CARAT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:434:23: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsPrefixed1444);
                            boost30=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost30.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsTest, boost
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:17: -> ^( OPTIONAL ftsTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:436:25: ^( OPTIONAL ftsTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(OPTIONAL, "OPTIONAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:436:44: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:437:11: MINUS ftsTest ( boost )?
                    {
                    MINUS31=(Token)match(input,MINUS,FOLLOW_MINUS_in_ftsPrefixed1508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS31);


                    pushFollow(FOLLOW_ftsTest_in_ftsPrefixed1510);
                    ftsTest32=ftsTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsTest.add(ftsTest32.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:437:25: ( boost )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==CARAT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:437:25: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsPrefixed1512);
                            boost33=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost33.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: boost, ftsTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 438:17: -> ^( EXCLUDE ftsTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:439:25: ^( EXCLUDE ftsTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXCLUDE, "EXCLUDE")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:439:43: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsPrefixed"


    public static class cmisPrefixed_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmisPrefixed"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:442:1: cmisPrefixed : ( cmisTest -> ^( DEFAULT cmisTest ) | MINUS cmisTest -> ^( EXCLUDE cmisTest ) );
    public final FTSParser.cmisPrefixed_return cmisPrefixed() throws RecognitionException {
        FTSParser.cmisPrefixed_return retval = new FTSParser.cmisPrefixed_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MINUS35=null;
        FTSParser.cmisTest_return cmisTest34 =null;

        FTSParser.cmisTest_return cmisTest36 =null;


        Object MINUS35_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_cmisTest=new RewriteRuleSubtreeStream(adaptor,"rule cmisTest");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:443:9: ( cmisTest -> ^( DEFAULT cmisTest ) | MINUS cmisTest -> ^( EXCLUDE cmisTest ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case COMMA:
            case DOT:
                {
                alt16=1;
                }
                break;
            case DECIMAL_INTEGER_LITERAL:
            case FLOATING_POINT_LITERAL:
            case FTSPRE:
            case FTSWILD:
            case FTSWORD:
            case ID:
            case NOT:
            case QUESTION_MARK:
            case STAR:
            case TO:
                {
                alt16=1;
                }
                break;
            case FTSPHRASE:
                {
                alt16=1;
                }
                break;
            case MINUS:
                {
                alt16=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:444:9: cmisTest
                    {
                    pushFollow(FOLLOW_cmisTest_in_cmisPrefixed1597);
                    cmisTest34=cmisTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cmisTest.add(cmisTest34.getTree());

                    // AST REWRITE
                    // elements: cmisTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 445:17: -> ^( DEFAULT cmisTest )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:446:25: ^( DEFAULT cmisTest )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEFAULT, "DEFAULT")
                        , root_1);

                        adaptor.addChild(root_1, stream_cmisTest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:447:11: MINUS cmisTest
                    {
                    MINUS35=(Token)match(input,MINUS,FOLLOW_MINUS_in_cmisPrefixed1657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS35);


                    pushFollow(FOLLOW_cmisTest_in_cmisPrefixed1659);
                    cmisTest36=cmisTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cmisTest.add(cmisTest36.getTree());

                    // AST REWRITE
                    // elements: cmisTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 448:17: -> ^( EXCLUDE cmisTest )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:449:25: ^( EXCLUDE cmisTest )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXCLUDE, "EXCLUDE")
                        , root_1);

                        adaptor.addChild(root_1, stream_cmisTest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmisPrefixed"


    public static class ftsTest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsTest"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:455:1: ftsTest : ( ( ftsFieldGroupProximity )=> ftsFieldGroupProximity -> ^( PROXIMITY ftsFieldGroupProximity ) | ftsTermOrPhrase | ftsExactTermOrPhrase | ftsTokenisedTermOrPhrase | ftsRange -> ^( RANGE ftsRange ) | ftsFieldGroup -> ftsFieldGroup | LPAREN ftsDisjunction RPAREN -> ftsDisjunction | template -> template );
    public final FTSParser.ftsTest_return ftsTest() throws RecognitionException {
        FTSParser.ftsTest_return retval = new FTSParser.ftsTest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN43=null;
        Token RPAREN45=null;
        FTSParser.ftsFieldGroupProximity_return ftsFieldGroupProximity37 =null;

        FTSParser.ftsTermOrPhrase_return ftsTermOrPhrase38 =null;

        FTSParser.ftsExactTermOrPhrase_return ftsExactTermOrPhrase39 =null;

        FTSParser.ftsTokenisedTermOrPhrase_return ftsTokenisedTermOrPhrase40 =null;

        FTSParser.ftsRange_return ftsRange41 =null;

        FTSParser.ftsFieldGroup_return ftsFieldGroup42 =null;

        FTSParser.ftsDisjunction_return ftsDisjunction44 =null;

        FTSParser.template_return template46 =null;


        Object LPAREN43_tree=null;
        Object RPAREN45_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_template=new RewriteRuleSubtreeStream(adaptor,"rule template");
        RewriteRuleSubtreeStream stream_ftsFieldGroup=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroup");
        RewriteRuleSubtreeStream stream_ftsDisjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsDisjunction");
        RewriteRuleSubtreeStream stream_ftsRange=new RewriteRuleSubtreeStream(adaptor,"rule ftsRange");
        RewriteRuleSubtreeStream stream_ftsFieldGroupProximity=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupProximity");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:456:9: ( ( ftsFieldGroupProximity )=> ftsFieldGroupProximity -> ^( PROXIMITY ftsFieldGroupProximity ) | ftsTermOrPhrase | ftsExactTermOrPhrase | ftsTokenisedTermOrPhrase | ftsRange -> ^( RANGE ftsRange ) | ftsFieldGroup -> ftsFieldGroup | LPAREN ftsDisjunction RPAREN -> ftsDisjunction | template -> template )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:457:12: ( ftsFieldGroupProximity )=> ftsFieldGroupProximity
                    {
                    pushFollow(FOLLOW_ftsFieldGroupProximity_in_ftsTest1751);
                    ftsFieldGroupProximity37=ftsFieldGroupProximity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupProximity.add(ftsFieldGroupProximity37.getTree());

                    // AST REWRITE
                    // elements: ftsFieldGroupProximity
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 458:17: -> ^( PROXIMITY ftsFieldGroupProximity )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:459:25: ^( PROXIMITY ftsFieldGroupProximity )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PROXIMITY, "PROXIMITY")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupProximity.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:461:12: ftsTermOrPhrase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsTermOrPhrase_in_ftsTest1822);
                    ftsTermOrPhrase38=ftsTermOrPhrase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsTermOrPhrase38.getTree());

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:463:12: ftsExactTermOrPhrase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsExactTermOrPhrase_in_ftsTest1845);
                    ftsExactTermOrPhrase39=ftsExactTermOrPhrase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsExactTermOrPhrase39.getTree());

                    }
                    break;
                case 4 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:465:12: ftsTokenisedTermOrPhrase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsTokenisedTermOrPhrase_in_ftsTest1869);
                    ftsTokenisedTermOrPhrase40=ftsTokenisedTermOrPhrase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsTokenisedTermOrPhrase40.getTree());

                    }
                    break;
                case 5 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:467:12: ftsRange
                    {
                    pushFollow(FOLLOW_ftsRange_in_ftsTest1892);
                    ftsRange41=ftsRange();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsRange.add(ftsRange41.getTree());

                    // AST REWRITE
                    // elements: ftsRange
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 468:17: -> ^( RANGE ftsRange )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:469:25: ^( RANGE ftsRange )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(RANGE, "RANGE")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsRange.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:471:12: ftsFieldGroup
                    {
                    pushFollow(FOLLOW_ftsFieldGroup_in_ftsTest1965);
                    ftsFieldGroup42=ftsFieldGroup();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroup.add(ftsFieldGroup42.getTree());

                    // AST REWRITE
                    // elements: ftsFieldGroup
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 472:17: -> ftsFieldGroup
                    {
                        adaptor.addChild(root_0, stream_ftsFieldGroup.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:473:12: LPAREN ftsDisjunction RPAREN
                    {
                    LPAREN43=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ftsTest1998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN43);


                    pushFollow(FOLLOW_ftsDisjunction_in_ftsTest2000);
                    ftsDisjunction44=ftsDisjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsDisjunction.add(ftsDisjunction44.getTree());

                    RPAREN45=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ftsTest2002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN45);


                    // AST REWRITE
                    // elements: ftsDisjunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 474:17: -> ftsDisjunction
                    {
                        adaptor.addChild(root_0, stream_ftsDisjunction.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:475:12: template
                    {
                    pushFollow(FOLLOW_template_in_ftsTest2035);
                    template46=template();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_template.add(template46.getTree());

                    // AST REWRITE
                    // elements: template
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 476:17: -> template
                    {
                        adaptor.addChild(root_0, stream_template.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsTest"


    public static class cmisTest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmisTest"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:479:1: cmisTest : ( cmisTerm -> ^( TERM cmisTerm ) | cmisPhrase -> ^( PHRASE cmisPhrase ) );
    public final FTSParser.cmisTest_return cmisTest() throws RecognitionException {
        FTSParser.cmisTest_return retval = new FTSParser.cmisTest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.cmisTerm_return cmisTerm47 =null;

        FTSParser.cmisPhrase_return cmisPhrase48 =null;


        RewriteRuleSubtreeStream stream_cmisPhrase=new RewriteRuleSubtreeStream(adaptor,"rule cmisPhrase");
        RewriteRuleSubtreeStream stream_cmisTerm=new RewriteRuleSubtreeStream(adaptor,"rule cmisTerm");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:480:9: ( cmisTerm -> ^( TERM cmisTerm ) | cmisPhrase -> ^( PHRASE cmisPhrase ) )
            int alt18=2;
            switch ( input.LA(1) ) {
            case COMMA:
            case DOT:
                {
                alt18=1;
                }
                break;
            case DECIMAL_INTEGER_LITERAL:
            case FLOATING_POINT_LITERAL:
            case FTSPRE:
            case FTSWILD:
            case FTSWORD:
            case ID:
            case NOT:
            case QUESTION_MARK:
            case STAR:
            case TO:
                {
                alt18=1;
                }
                break;
            case FTSPHRASE:
                {
                alt18=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:481:9: cmisTerm
                    {
                    pushFollow(FOLLOW_cmisTerm_in_cmisTest2088);
                    cmisTerm47=cmisTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cmisTerm.add(cmisTerm47.getTree());

                    // AST REWRITE
                    // elements: cmisTerm
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 482:17: -> ^( TERM cmisTerm )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:483:25: ^( TERM cmisTerm )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TERM, "TERM")
                        , root_1);

                        adaptor.addChild(root_1, stream_cmisTerm.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:484:11: cmisPhrase
                    {
                    pushFollow(FOLLOW_cmisPhrase_in_cmisTest2148);
                    cmisPhrase48=cmisPhrase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cmisPhrase.add(cmisPhrase48.getTree());

                    // AST REWRITE
                    // elements: cmisPhrase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 485:17: -> ^( PHRASE cmisPhrase )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:486:25: ^( PHRASE cmisPhrase )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PHRASE, "PHRASE")
                        , root_1);

                        adaptor.addChild(root_1, stream_cmisPhrase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmisTest"


    public static class template_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:489:1: template : ( PERCENT tempReference -> ^( TEMPLATE tempReference ) | PERCENT LPAREN ( tempReference ( COMMA )? )+ RPAREN -> ^( TEMPLATE ( tempReference )+ ) );
    public final FTSParser.template_return template() throws RecognitionException {
        FTSParser.template_return retval = new FTSParser.template_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERCENT49=null;
        Token PERCENT51=null;
        Token LPAREN52=null;
        Token COMMA54=null;
        Token RPAREN55=null;
        FTSParser.tempReference_return tempReference50 =null;

        FTSParser.tempReference_return tempReference53 =null;


        Object PERCENT49_tree=null;
        Object PERCENT51_tree=null;
        Object LPAREN52_tree=null;
        Object COMMA54_tree=null;
        Object RPAREN55_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_tempReference=new RewriteRuleSubtreeStream(adaptor,"rule tempReference");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:490:9: ( PERCENT tempReference -> ^( TEMPLATE tempReference ) | PERCENT LPAREN ( tempReference ( COMMA )? )+ RPAREN -> ^( TEMPLATE ( tempReference )+ ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==PERCENT) ) {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    alt21=2;
                    }
                    break;
                case AT:
                    {
                    alt21=1;
                    }
                    break;
                case ID:
                    {
                    alt21=1;
                    }
                    break;
                case URI:
                    {
                    alt21=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:491:9: PERCENT tempReference
                    {
                    PERCENT49=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_template2229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENT.add(PERCENT49);


                    pushFollow(FOLLOW_tempReference_in_template2231);
                    tempReference50=tempReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tempReference.add(tempReference50.getTree());

                    // AST REWRITE
                    // elements: tempReference
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 492:17: -> ^( TEMPLATE tempReference )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:493:25: ^( TEMPLATE tempReference )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TEMPLATE, "TEMPLATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_tempReference.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:494:11: PERCENT LPAREN ( tempReference ( COMMA )? )+ RPAREN
                    {
                    PERCENT51=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_template2291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENT.add(PERCENT51);


                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_template2293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN52);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:494:26: ( tempReference ( COMMA )? )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        switch ( input.LA(1) ) {
                        case AT:
                            {
                            alt20=1;
                            }
                            break;
                        case ID:
                            {
                            alt20=1;
                            }
                            break;
                        case URI:
                            {
                            alt20=1;
                            }
                            break;

                        }

                        switch (alt20) {
                    	case 1 :
                    	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:494:27: tempReference ( COMMA )?
                    	    {
                    	    pushFollow(FOLLOW_tempReference_in_template2296);
                    	    tempReference53=tempReference();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tempReference.add(tempReference53.getTree());

                    	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:494:41: ( COMMA )?
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==COMMA) ) {
                    	        alt19=1;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:494:41: COMMA
                    	            {
                    	            COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_template2298); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_template2303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN55);


                    // AST REWRITE
                    // elements: tempReference
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 495:17: -> ^( TEMPLATE ( tempReference )+ )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:496:25: ^( TEMPLATE ( tempReference )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TEMPLATE, "TEMPLATE")
                        , root_1);

                        if ( !(stream_tempReference.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tempReference.hasNext() ) {
                            adaptor.addChild(root_1, stream_tempReference.nextTree());

                        }
                        stream_tempReference.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template"


    public static class fuzzy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fuzzy"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:499:1: fuzzy : TILDA number -> ^( FUZZY number ) ;
    public final FTSParser.fuzzy_return fuzzy() throws RecognitionException {
        FTSParser.fuzzy_return retval = new FTSParser.fuzzy_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TILDA56=null;
        FTSParser.number_return number57 =null;


        Object TILDA56_tree=null;
        RewriteRuleTokenStream stream_TILDA=new RewriteRuleTokenStream(adaptor,"token TILDA");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:500:9: ( TILDA number -> ^( FUZZY number ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:501:9: TILDA number
            {
            TILDA56=(Token)match(input,TILDA,FOLLOW_TILDA_in_fuzzy2385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TILDA.add(TILDA56);


            pushFollow(FOLLOW_number_in_fuzzy2387);
            number57=number();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_number.add(number57.getTree());

            // AST REWRITE
            // elements: number
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 502:17: -> ^( FUZZY number )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:503:25: ^( FUZZY number )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUZZY, "FUZZY")
                , root_1);

                adaptor.addChild(root_1, stream_number.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fuzzy"


    public static class slop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "slop"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:506:1: slop : TILDA DECIMAL_INTEGER_LITERAL -> ^( FUZZY DECIMAL_INTEGER_LITERAL ) ;
    public final FTSParser.slop_return slop() throws RecognitionException {
        FTSParser.slop_return retval = new FTSParser.slop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TILDA58=null;
        Token DECIMAL_INTEGER_LITERAL59=null;

        Object TILDA58_tree=null;
        Object DECIMAL_INTEGER_LITERAL59_tree=null;
        RewriteRuleTokenStream stream_TILDA=new RewriteRuleTokenStream(adaptor,"token TILDA");
        RewriteRuleTokenStream stream_DECIMAL_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL_INTEGER_LITERAL");

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:507:9: ( TILDA DECIMAL_INTEGER_LITERAL -> ^( FUZZY DECIMAL_INTEGER_LITERAL ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:508:9: TILDA DECIMAL_INTEGER_LITERAL
            {
            TILDA58=(Token)match(input,TILDA,FOLLOW_TILDA_in_slop2468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TILDA.add(TILDA58);


            DECIMAL_INTEGER_LITERAL59=(Token)match(input,DECIMAL_INTEGER_LITERAL,FOLLOW_DECIMAL_INTEGER_LITERAL_in_slop2470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DECIMAL_INTEGER_LITERAL.add(DECIMAL_INTEGER_LITERAL59);


            // AST REWRITE
            // elements: DECIMAL_INTEGER_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 509:17: -> ^( FUZZY DECIMAL_INTEGER_LITERAL )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:510:25: ^( FUZZY DECIMAL_INTEGER_LITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUZZY, "FUZZY")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DECIMAL_INTEGER_LITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "slop"


    public static class boost_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boost"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:513:1: boost : CARAT number -> ^( BOOST number ) ;
    public final FTSParser.boost_return boost() throws RecognitionException {
        FTSParser.boost_return retval = new FTSParser.boost_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CARAT60=null;
        FTSParser.number_return number61 =null;


        Object CARAT60_tree=null;
        RewriteRuleTokenStream stream_CARAT=new RewriteRuleTokenStream(adaptor,"token CARAT");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:514:9: ( CARAT number -> ^( BOOST number ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:515:9: CARAT number
            {
            CARAT60=(Token)match(input,CARAT,FOLLOW_CARAT_in_boost2551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CARAT.add(CARAT60);


            pushFollow(FOLLOW_number_in_boost2553);
            number61=number();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_number.add(number61.getTree());

            // AST REWRITE
            // elements: number
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 516:17: -> ^( BOOST number )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:517:25: ^( BOOST number )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOOST, "BOOST")
                , root_1);

                adaptor.addChild(root_1, stream_number.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boost"


    public static class ftsTermOrPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsTermOrPhrase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:520:1: ftsTermOrPhrase : ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord ( fuzzy )? ) );
    public final FTSParser.ftsTermOrPhrase_return ftsTermOrPhrase() throws RecognitionException {
        FTSParser.ftsTermOrPhrase_return retval = new FTSParser.ftsTermOrPhrase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON63=null;
        Token FTSPHRASE64=null;
        Token FTSPHRASE68=null;
        FTSParser.fieldReference_return fieldReference62 =null;

        FTSParser.slop_return slop65 =null;

        FTSParser.ftsWord_return ftsWord66 =null;

        FTSParser.fuzzy_return fuzzy67 =null;

        FTSParser.slop_return slop69 =null;

        FTSParser.ftsWord_return ftsWord70 =null;

        FTSParser.fuzzy_return fuzzy71 =null;


        Object COLON63_tree=null;
        Object FTSPHRASE64_tree=null;
        Object FTSPHRASE68_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_FTSPHRASE=new RewriteRuleTokenStream(adaptor,"token FTSPHRASE");
        RewriteRuleSubtreeStream stream_fuzzy=new RewriteRuleSubtreeStream(adaptor,"rule fuzzy");
        RewriteRuleSubtreeStream stream_slop=new RewriteRuleSubtreeStream(adaptor,"rule slop");
        RewriteRuleSubtreeStream stream_ftsWord=new RewriteRuleSubtreeStream(adaptor,"rule ftsWord");
        RewriteRuleSubtreeStream stream_fieldReference=new RewriteRuleSubtreeStream(adaptor,"rule fieldReference");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:521:9: ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord ( fuzzy )? ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==AT) && (synpred3_FTS())) {
                alt27=1;
            }
            else if ( (LA27_0==ID) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==DOT) ) {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        int LA27_34 = input.LA(4);

                        if ( (synpred3_FTS()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 34, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NOT:
                        {
                        alt27=3;
                        }
                        break;
                    case TILDA:
                        {
                        alt27=3;
                        }
                        break;
                    case CARAT:
                        {
                        alt27=3;
                        }
                        break;
                    case AND:
                        {
                        alt27=3;
                        }
                        break;
                    case AMP:
                        {
                        alt27=3;
                        }
                        break;
                    case EOF:
                        {
                        alt27=3;
                        }
                        break;
                    case RPAREN:
                        {
                        alt27=3;
                        }
                        break;
                    case OR:
                        {
                        alt27=3;
                        }
                        break;
                    case BAR:
                        {
                        alt27=3;
                        }
                        break;
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                        {
                        alt27=3;
                        }
                        break;
                    case EXCLAMATION:
                        {
                        alt27=3;
                        }
                        break;
                    case QUESTION_MARK:
                    case STAR:
                        {
                        alt27=3;
                        }
                        break;
                    case AT:
                        {
                        alt27=3;
                        }
                        break;
                    case URI:
                        {
                        alt27=3;
                        }
                        break;
                    case FTSPHRASE:
                        {
                        alt27=3;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt27=3;
                        }
                        break;
                    case EQUALS:
                        {
                        alt27=3;
                        }
                        break;
                    case TO:
                        {
                        alt27=3;
                        }
                        break;
                    case LSQUARE:
                        {
                        alt27=3;
                        }
                        break;
                    case LT:
                        {
                        alt27=3;
                        }
                        break;
                    case LPAREN:
                        {
                        alt27=3;
                        }
                        break;
                    case PERCENT:
                        {
                        alt27=3;
                        }
                        break;
                    case PLUS:
                        {
                        alt27=3;
                        }
                        break;
                    case MINUS:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 7, input);

                        throw nvae;

                    }

                }
                else if ( (LA27_2==COLON) && (synpred3_FTS())) {
                    alt27=1;
                }
                else if ( (LA27_2==COMMA) ) {
                    alt27=3;
                }
                else if ( (LA27_2==TILDA) ) {
                    alt27=3;
                }
                else if ( (LA27_2==CARAT) ) {
                    alt27=3;
                }
                else if ( (LA27_2==AND) ) {
                    alt27=3;
                }
                else if ( (LA27_2==AMP) ) {
                    alt27=3;
                }
                else if ( (LA27_2==EOF) ) {
                    alt27=3;
                }
                else if ( (LA27_2==RPAREN) ) {
                    alt27=3;
                }
                else if ( (LA27_2==OR) ) {
                    alt27=3;
                }
                else if ( (LA27_2==BAR) ) {
                    alt27=3;
                }
                else if ( (LA27_2==NOT) ) {
                    alt27=3;
                }
                else if ( (LA27_2==EXCLAMATION) ) {
                    alt27=3;
                }
                else if ( (LA27_2==ID) ) {
                    alt27=3;
                }
                else if ( (LA27_2==AT) ) {
                    alt27=3;
                }
                else if ( (LA27_2==DECIMAL_INTEGER_LITERAL||LA27_2==FLOATING_POINT_LITERAL||(LA27_2 >= FTSPRE && LA27_2 <= FTSWORD)) ) {
                    alt27=3;
                }
                else if ( (LA27_2==URI) ) {
                    alt27=3;
                }
                else if ( (LA27_2==FTSPHRASE) ) {
                    alt27=3;
                }
                else if ( (LA27_2==QUESTION_MARK||LA27_2==STAR) ) {
                    alt27=3;
                }
                else if ( (LA27_2==EQUALS) ) {
                    alt27=3;
                }
                else if ( (LA27_2==TO) ) {
                    alt27=3;
                }
                else if ( (LA27_2==LSQUARE) ) {
                    alt27=3;
                }
                else if ( (LA27_2==LT) ) {
                    alt27=3;
                }
                else if ( (LA27_2==LPAREN) ) {
                    alt27=3;
                }
                else if ( (LA27_2==PERCENT) ) {
                    alt27=3;
                }
                else if ( (LA27_2==PLUS) ) {
                    alt27=3;
                }
                else if ( (LA27_2==MINUS) ) {
                    alt27=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA27_0==URI) && (synpred3_FTS())) {
                alt27=1;
            }
            else if ( (LA27_0==FTSPHRASE) ) {
                alt27=2;
            }
            else if ( (LA27_0==COMMA||LA27_0==DOT) ) {
                alt27=3;
            }
            else if ( (LA27_0==DECIMAL_INTEGER_LITERAL||LA27_0==FLOATING_POINT_LITERAL||(LA27_0 >= FTSPRE && LA27_0 <= FTSWORD)||LA27_0==NOT||LA27_0==QUESTION_MARK||LA27_0==STAR||LA27_0==TO) ) {
                alt27=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:522:9: ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) )
                    {
                    pushFollow(FOLLOW_fieldReference_in_ftsTermOrPhrase2642);
                    fieldReference62=fieldReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldReference.add(fieldReference62.getTree());

                    COLON63=(Token)match(input,COLON,FOLLOW_COLON_in_ftsTermOrPhrase2644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON63);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:523:9: ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) )
                    int alt24=2;
                    switch ( input.LA(1) ) {
                    case FTSPHRASE:
                        {
                        alt24=1;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt24=2;
                        }
                        break;
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                    case ID:
                    case NOT:
                    case QUESTION_MARK:
                    case STAR:
                    case TO:
                        {
                        alt24=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }

                    switch (alt24) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:524:17: FTSPHRASE ( ( slop )=> slop )?
                            {
                            FTSPHRASE64=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_ftsTermOrPhrase2672); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FTSPHRASE.add(FTSPHRASE64);


                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:524:27: ( ( slop )=> slop )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==TILDA) ) {
                                int LA22_1 = input.LA(2);

                                if ( (LA22_1==DECIMAL_INTEGER_LITERAL) ) {
                                    int LA22_26 = input.LA(3);

                                    if ( (synpred4_FTS()) ) {
                                        alt22=1;
                                    }
                                }
                            }
                            switch (alt22) {
                                case 1 :
                                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:524:28: ( slop )=> slop
                                    {
                                    pushFollow(FOLLOW_slop_in_ftsTermOrPhrase2680);
                                    slop65=slop();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_slop.add(slop65.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: slop, FTSPHRASE, fieldReference
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 525:17: -> ^( PHRASE FTSPHRASE fieldReference ( slop )? )
                            {
                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:525:20: ^( PHRASE FTSPHRASE fieldReference ( slop )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(PHRASE, "PHRASE")
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_FTSPHRASE.nextNode()
                                );

                                adaptor.addChild(root_1, stream_fieldReference.nextTree());

                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:525:54: ( slop )?
                                if ( stream_slop.hasNext() ) {
                                    adaptor.addChild(root_1, stream_slop.nextTree());

                                }
                                stream_slop.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:527:17: ftsWord ( ( fuzzy )=> fuzzy )?
                            {
                            pushFollow(FOLLOW_ftsWord_in_ftsTermOrPhrase2747);
                            ftsWord66=ftsWord();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ftsWord.add(ftsWord66.getTree());

                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:527:25: ( ( fuzzy )=> fuzzy )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==TILDA) ) {
                                int LA23_1 = input.LA(2);

                                if ( (LA23_1==DECIMAL_INTEGER_LITERAL||LA23_1==FLOATING_POINT_LITERAL) ) {
                                    int LA23_26 = input.LA(3);

                                    if ( (synpred5_FTS()) ) {
                                        alt23=1;
                                    }
                                }
                            }
                            switch (alt23) {
                                case 1 :
                                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:527:26: ( fuzzy )=> fuzzy
                                    {
                                    pushFollow(FOLLOW_fuzzy_in_ftsTermOrPhrase2756);
                                    fuzzy67=fuzzy();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy67.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: fieldReference, ftsWord, fuzzy
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 528:17: -> ^( TERM ftsWord fieldReference ( fuzzy )? )
                            {
                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:528:20: ^( TERM ftsWord fieldReference ( fuzzy )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(TERM, "TERM")
                                , root_1);

                                adaptor.addChild(root_1, stream_ftsWord.nextTree());

                                adaptor.addChild(root_1, stream_fieldReference.nextTree());

                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:528:50: ( fuzzy )?
                                if ( stream_fuzzy.hasNext() ) {
                                    adaptor.addChild(root_1, stream_fuzzy.nextTree());

                                }
                                stream_fuzzy.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:531:9: FTSPHRASE ( ( slop )=> slop )?
                    {
                    FTSPHRASE68=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_ftsTermOrPhrase2817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FTSPHRASE.add(FTSPHRASE68);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:531:19: ( ( slop )=> slop )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==TILDA) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==DECIMAL_INTEGER_LITERAL) ) {
                            int LA25_26 = input.LA(3);

                            if ( (synpred6_FTS()) ) {
                                alt25=1;
                            }
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:531:20: ( slop )=> slop
                            {
                            pushFollow(FOLLOW_slop_in_ftsTermOrPhrase2825);
                            slop69=slop();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_slop.add(slop69.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: slop, FTSPHRASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 532:17: -> ^( PHRASE FTSPHRASE ( slop )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:532:20: ^( PHRASE FTSPHRASE ( slop )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PHRASE, "PHRASE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FTSPHRASE.nextNode()
                        );

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:532:39: ( slop )?
                        if ( stream_slop.hasNext() ) {
                            adaptor.addChild(root_1, stream_slop.nextTree());

                        }
                        stream_slop.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:534:9: ftsWord ( ( fuzzy )=> fuzzy )?
                    {
                    pushFollow(FOLLOW_ftsWord_in_ftsTermOrPhrase2875);
                    ftsWord70=ftsWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsWord.add(ftsWord70.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:534:17: ( ( fuzzy )=> fuzzy )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==TILDA) ) {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1==DECIMAL_INTEGER_LITERAL||LA26_1==FLOATING_POINT_LITERAL) ) {
                            int LA26_26 = input.LA(3);

                            if ( (synpred7_FTS()) ) {
                                alt26=1;
                            }
                        }
                    }
                    switch (alt26) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:534:18: ( fuzzy )=> fuzzy
                            {
                            pushFollow(FOLLOW_fuzzy_in_ftsTermOrPhrase2884);
                            fuzzy71=fuzzy();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy71.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fuzzy, ftsWord
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 535:17: -> ^( TERM ftsWord ( fuzzy )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:535:20: ^( TERM ftsWord ( fuzzy )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TERM, "TERM")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsWord.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:535:35: ( fuzzy )?
                        if ( stream_fuzzy.hasNext() ) {
                            adaptor.addChild(root_1, stream_fuzzy.nextTree());

                        }
                        stream_fuzzy.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsTermOrPhrase"


    public static class ftsExactTermOrPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsExactTermOrPhrase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:539:1: ftsExactTermOrPhrase : EQUALS ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord ( fuzzy )? ) ) ;
    public final FTSParser.ftsExactTermOrPhrase_return ftsExactTermOrPhrase() throws RecognitionException {
        FTSParser.ftsExactTermOrPhrase_return retval = new FTSParser.ftsExactTermOrPhrase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS72=null;
        Token COLON74=null;
        Token FTSPHRASE75=null;
        Token FTSPHRASE79=null;
        FTSParser.fieldReference_return fieldReference73 =null;

        FTSParser.slop_return slop76 =null;

        FTSParser.ftsWord_return ftsWord77 =null;

        FTSParser.fuzzy_return fuzzy78 =null;

        FTSParser.slop_return slop80 =null;

        FTSParser.ftsWord_return ftsWord81 =null;

        FTSParser.fuzzy_return fuzzy82 =null;


        Object EQUALS72_tree=null;
        Object COLON74_tree=null;
        Object FTSPHRASE75_tree=null;
        Object FTSPHRASE79_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_FTSPHRASE=new RewriteRuleTokenStream(adaptor,"token FTSPHRASE");
        RewriteRuleSubtreeStream stream_fuzzy=new RewriteRuleSubtreeStream(adaptor,"rule fuzzy");
        RewriteRuleSubtreeStream stream_slop=new RewriteRuleSubtreeStream(adaptor,"rule slop");
        RewriteRuleSubtreeStream stream_ftsWord=new RewriteRuleSubtreeStream(adaptor,"rule ftsWord");
        RewriteRuleSubtreeStream stream_fieldReference=new RewriteRuleSubtreeStream(adaptor,"rule fieldReference");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:540:9: ( EQUALS ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord ( fuzzy )? ) ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:541:9: EQUALS ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord ( fuzzy )? ) )
            {
            EQUALS72=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_ftsExactTermOrPhrase2963); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS72);


            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:542:9: ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord ( fuzzy )? ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==AT) && (synpred8_FTS())) {
                alt33=1;
            }
            else if ( (LA33_0==ID) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==DOT) ) {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        switch ( input.LA(4) ) {
                        case DOT:
                            {
                            alt33=3;
                            }
                            break;
                        case COLON:
                            {
                            switch ( input.LA(5) ) {
                            case LPAREN:
                                {
                                alt33=3;
                                }
                                break;
                            case ID:
                                {
                                int LA33_50 = input.LA(6);

                                if ( (synpred8_FTS()) ) {
                                    alt33=1;
                                }
                                else if ( (true) ) {
                                    alt33=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 33, 50, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case FTSPHRASE:
                                {
                                int LA33_51 = input.LA(6);

                                if ( (synpred8_FTS()) ) {
                                    alt33=1;
                                }
                                else if ( (true) ) {
                                    alt33=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 33, 51, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case COMMA:
                            case DOT:
                                {
                                int LA33_52 = input.LA(6);

                                if ( (LA33_52==DECIMAL_INTEGER_LITERAL||LA33_52==FLOATING_POINT_LITERAL||(LA33_52 >= FTSPRE && LA33_52 <= FTSWORD)||LA33_52==ID||LA33_52==NOT||LA33_52==QUESTION_MARK||LA33_52==STAR||LA33_52==TO) ) {
                                    int LA33_55 = input.LA(7);

                                    if ( (synpred8_FTS()) ) {
                                        alt33=1;
                                    }
                                    else if ( (true) ) {
                                        alt33=3;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 33, 55, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 33, 52, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case DECIMAL_INTEGER_LITERAL:
                            case FLOATING_POINT_LITERAL:
                            case FTSPRE:
                            case FTSWILD:
                            case FTSWORD:
                                {
                                int LA33_53 = input.LA(6);

                                if ( (synpred8_FTS()) ) {
                                    alt33=1;
                                }
                                else if ( (true) ) {
                                    alt33=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 33, 53, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case NOT:
                            case QUESTION_MARK:
                            case STAR:
                            case TO:
                                {
                                int LA33_54 = input.LA(6);

                                if ( (synpred8_FTS()) ) {
                                    alt33=1;
                                }
                                else if ( (true) ) {
                                    alt33=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 33, 54, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case LSQUARE:
                                {
                                alt33=3;
                                }
                                break;
                            case LT:
                                {
                                alt33=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 41, input);

                                throw nvae;

                            }

                            }
                            break;
                        case COMMA:
                            {
                            alt33=3;
                            }
                            break;
                        case TILDA:
                            {
                            alt33=3;
                            }
                            break;
                        case CARAT:
                            {
                            alt33=3;
                            }
                            break;
                        case AND:
                            {
                            alt33=3;
                            }
                            break;
                        case AMP:
                            {
                            alt33=3;
                            }
                            break;
                        case EOF:
                            {
                            alt33=3;
                            }
                            break;
                        case RPAREN:
                            {
                            alt33=3;
                            }
                            break;
                        case OR:
                            {
                            alt33=3;
                            }
                            break;
                        case BAR:
                            {
                            alt33=3;
                            }
                            break;
                        case NOT:
                            {
                            alt33=3;
                            }
                            break;
                        case EXCLAMATION:
                            {
                            alt33=3;
                            }
                            break;
                        case ID:
                            {
                            alt33=3;
                            }
                            break;
                        case AT:
                            {
                            alt33=3;
                            }
                            break;
                        case DECIMAL_INTEGER_LITERAL:
                        case FLOATING_POINT_LITERAL:
                        case FTSPRE:
                        case FTSWILD:
                        case FTSWORD:
                            {
                            alt33=3;
                            }
                            break;
                        case URI:
                            {
                            alt33=3;
                            }
                            break;
                        case FTSPHRASE:
                            {
                            alt33=3;
                            }
                            break;
                        case STAR:
                            {
                            alt33=3;
                            }
                            break;
                        case EQUALS:
                            {
                            alt33=3;
                            }
                            break;
                        case TO:
                            {
                            alt33=3;
                            }
                            break;
                        case LSQUARE:
                            {
                            alt33=3;
                            }
                            break;
                        case LT:
                            {
                            alt33=3;
                            }
                            break;
                        case LPAREN:
                            {
                            alt33=3;
                            }
                            break;
                        case PERCENT:
                            {
                            alt33=3;
                            }
                            break;
                        case PLUS:
                            {
                            alt33=3;
                            }
                            break;
                        case MINUS:
                            {
                            alt33=3;
                            }
                            break;
                        case QUESTION_MARK:
                            {
                            alt33=3;
                            }
                            break;
                        case DOTDOT:
                            {
                            alt33=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 34, input);

                            throw nvae;

                        }

                        }
                        break;
                    case NOT:
                        {
                        alt33=3;
                        }
                        break;
                    case TILDA:
                        {
                        alt33=3;
                        }
                        break;
                    case CARAT:
                        {
                        alt33=3;
                        }
                        break;
                    case AND:
                        {
                        alt33=3;
                        }
                        break;
                    case AMP:
                        {
                        alt33=3;
                        }
                        break;
                    case EOF:
                        {
                        alt33=3;
                        }
                        break;
                    case RPAREN:
                        {
                        alt33=3;
                        }
                        break;
                    case OR:
                        {
                        alt33=3;
                        }
                        break;
                    case BAR:
                        {
                        alt33=3;
                        }
                        break;
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                        {
                        alt33=3;
                        }
                        break;
                    case EXCLAMATION:
                        {
                        alt33=3;
                        }
                        break;
                    case QUESTION_MARK:
                    case STAR:
                        {
                        alt33=3;
                        }
                        break;
                    case AT:
                        {
                        alt33=3;
                        }
                        break;
                    case URI:
                        {
                        alt33=3;
                        }
                        break;
                    case FTSPHRASE:
                        {
                        alt33=3;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt33=3;
                        }
                        break;
                    case EQUALS:
                        {
                        alt33=3;
                        }
                        break;
                    case TO:
                        {
                        alt33=3;
                        }
                        break;
                    case LSQUARE:
                        {
                        alt33=3;
                        }
                        break;
                    case LT:
                        {
                        alt33=3;
                        }
                        break;
                    case LPAREN:
                        {
                        alt33=3;
                        }
                        break;
                    case PERCENT:
                        {
                        alt33=3;
                        }
                        break;
                    case PLUS:
                        {
                        alt33=3;
                        }
                        break;
                    case MINUS:
                        {
                        alt33=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 7, input);

                        throw nvae;

                    }

                }
                else if ( (LA33_2==COLON) && (synpred8_FTS())) {
                    alt33=1;
                }
                else if ( (LA33_2==COMMA) ) {
                    alt33=3;
                }
                else if ( (LA33_2==TILDA) ) {
                    alt33=3;
                }
                else if ( (LA33_2==CARAT) ) {
                    alt33=3;
                }
                else if ( (LA33_2==AND) ) {
                    alt33=3;
                }
                else if ( (LA33_2==AMP) ) {
                    alt33=3;
                }
                else if ( (LA33_2==EOF) ) {
                    alt33=3;
                }
                else if ( (LA33_2==RPAREN) ) {
                    alt33=3;
                }
                else if ( (LA33_2==OR) ) {
                    alt33=3;
                }
                else if ( (LA33_2==BAR) ) {
                    alt33=3;
                }
                else if ( (LA33_2==NOT) ) {
                    alt33=3;
                }
                else if ( (LA33_2==EXCLAMATION) ) {
                    alt33=3;
                }
                else if ( (LA33_2==ID) ) {
                    alt33=3;
                }
                else if ( (LA33_2==AT) ) {
                    alt33=3;
                }
                else if ( (LA33_2==DECIMAL_INTEGER_LITERAL||LA33_2==FLOATING_POINT_LITERAL||(LA33_2 >= FTSPRE && LA33_2 <= FTSWORD)) ) {
                    alt33=3;
                }
                else if ( (LA33_2==URI) ) {
                    alt33=3;
                }
                else if ( (LA33_2==FTSPHRASE) ) {
                    alt33=3;
                }
                else if ( (LA33_2==QUESTION_MARK||LA33_2==STAR) ) {
                    alt33=3;
                }
                else if ( (LA33_2==EQUALS) ) {
                    alt33=3;
                }
                else if ( (LA33_2==TO) ) {
                    alt33=3;
                }
                else if ( (LA33_2==LSQUARE) ) {
                    alt33=3;
                }
                else if ( (LA33_2==LT) ) {
                    alt33=3;
                }
                else if ( (LA33_2==LPAREN) ) {
                    alt33=3;
                }
                else if ( (LA33_2==PERCENT) ) {
                    alt33=3;
                }
                else if ( (LA33_2==PLUS) ) {
                    alt33=3;
                }
                else if ( (LA33_2==MINUS) ) {
                    alt33=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA33_0==URI) && (synpred8_FTS())) {
                alt33=1;
            }
            else if ( (LA33_0==FTSPHRASE) ) {
                alt33=2;
            }
            else if ( (LA33_0==COMMA||LA33_0==DOT) ) {
                alt33=3;
            }
            else if ( (LA33_0==DECIMAL_INTEGER_LITERAL||LA33_0==FLOATING_POINT_LITERAL||(LA33_0 >= FTSPRE && LA33_0 <= FTSWORD)||LA33_0==NOT||LA33_0==QUESTION_MARK||LA33_0==STAR||LA33_0==TO) ) {
                alt33=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:543:9: ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? ) )
                    {
                    pushFollow(FOLLOW_fieldReference_in_ftsExactTermOrPhrase2991);
                    fieldReference73=fieldReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldReference.add(fieldReference73.getTree());

                    COLON74=(Token)match(input,COLON,FOLLOW_COLON_in_ftsExactTermOrPhrase2993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON74);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:544:9: ( FTSPHRASE ( ( slop )=> slop )? -> ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? ) )
                    int alt30=2;
                    switch ( input.LA(1) ) {
                    case FTSPHRASE:
                        {
                        alt30=1;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt30=2;
                        }
                        break;
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                    case ID:
                    case NOT:
                    case QUESTION_MARK:
                    case STAR:
                    case TO:
                        {
                        alt30=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }

                    switch (alt30) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:545:17: FTSPHRASE ( ( slop )=> slop )?
                            {
                            FTSPHRASE75=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_ftsExactTermOrPhrase3021); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FTSPHRASE.add(FTSPHRASE75);


                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:545:27: ( ( slop )=> slop )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==TILDA) ) {
                                int LA28_1 = input.LA(2);

                                if ( (LA28_1==DECIMAL_INTEGER_LITERAL) ) {
                                    int LA28_26 = input.LA(3);

                                    if ( (synpred9_FTS()) ) {
                                        alt28=1;
                                    }
                                }
                            }
                            switch (alt28) {
                                case 1 :
                                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:545:28: ( slop )=> slop
                                    {
                                    pushFollow(FOLLOW_slop_in_ftsExactTermOrPhrase3029);
                                    slop76=slop();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_slop.add(slop76.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: FTSPHRASE, slop, fieldReference
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 546:17: -> ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? )
                            {
                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:546:20: ^( EXACT_PHRASE FTSPHRASE fieldReference ( slop )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(EXACT_PHRASE, "EXACT_PHRASE")
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_FTSPHRASE.nextNode()
                                );

                                adaptor.addChild(root_1, stream_fieldReference.nextTree());

                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:546:60: ( slop )?
                                if ( stream_slop.hasNext() ) {
                                    adaptor.addChild(root_1, stream_slop.nextTree());

                                }
                                stream_slop.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:548:17: ftsWord ( ( fuzzy )=> fuzzy )?
                            {
                            pushFollow(FOLLOW_ftsWord_in_ftsExactTermOrPhrase3096);
                            ftsWord77=ftsWord();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ftsWord.add(ftsWord77.getTree());

                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:548:25: ( ( fuzzy )=> fuzzy )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==TILDA) ) {
                                int LA29_1 = input.LA(2);

                                if ( (LA29_1==DECIMAL_INTEGER_LITERAL||LA29_1==FLOATING_POINT_LITERAL) ) {
                                    int LA29_26 = input.LA(3);

                                    if ( (synpred10_FTS()) ) {
                                        alt29=1;
                                    }
                                }
                            }
                            switch (alt29) {
                                case 1 :
                                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:548:26: ( fuzzy )=> fuzzy
                                    {
                                    pushFollow(FOLLOW_fuzzy_in_ftsExactTermOrPhrase3105);
                                    fuzzy78=fuzzy();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy78.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: fieldReference, fuzzy, ftsWord
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 549:17: -> ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? )
                            {
                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:549:20: ^( EXACT_TERM ftsWord fieldReference ( fuzzy )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(EXACT_TERM, "EXACT_TERM")
                                , root_1);

                                adaptor.addChild(root_1, stream_ftsWord.nextTree());

                                adaptor.addChild(root_1, stream_fieldReference.nextTree());

                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:549:56: ( fuzzy )?
                                if ( stream_fuzzy.hasNext() ) {
                                    adaptor.addChild(root_1, stream_fuzzy.nextTree());

                                }
                                stream_fuzzy.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:552:9: FTSPHRASE ( ( slop )=> slop )?
                    {
                    FTSPHRASE79=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_ftsExactTermOrPhrase3166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FTSPHRASE.add(FTSPHRASE79);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:552:19: ( ( slop )=> slop )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==TILDA) ) {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==DECIMAL_INTEGER_LITERAL) ) {
                            int LA31_26 = input.LA(3);

                            if ( (synpred11_FTS()) ) {
                                alt31=1;
                            }
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:552:20: ( slop )=> slop
                            {
                            pushFollow(FOLLOW_slop_in_ftsExactTermOrPhrase3174);
                            slop80=slop();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_slop.add(slop80.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: slop, FTSPHRASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 553:17: -> ^( EXACT_PHRASE FTSPHRASE ( slop )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:553:20: ^( EXACT_PHRASE FTSPHRASE ( slop )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXACT_PHRASE, "EXACT_PHRASE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FTSPHRASE.nextNode()
                        );

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:553:45: ( slop )?
                        if ( stream_slop.hasNext() ) {
                            adaptor.addChild(root_1, stream_slop.nextTree());

                        }
                        stream_slop.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:555:9: ftsWord ( ( fuzzy )=> fuzzy )?
                    {
                    pushFollow(FOLLOW_ftsWord_in_ftsExactTermOrPhrase3224);
                    ftsWord81=ftsWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsWord.add(ftsWord81.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:555:17: ( ( fuzzy )=> fuzzy )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==TILDA) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==DECIMAL_INTEGER_LITERAL||LA32_1==FLOATING_POINT_LITERAL) ) {
                            int LA32_26 = input.LA(3);

                            if ( (synpred12_FTS()) ) {
                                alt32=1;
                            }
                        }
                    }
                    switch (alt32) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:555:18: ( fuzzy )=> fuzzy
                            {
                            pushFollow(FOLLOW_fuzzy_in_ftsExactTermOrPhrase3233);
                            fuzzy82=fuzzy();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy82.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsWord, fuzzy
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 556:17: -> ^( EXACT_TERM ftsWord ( fuzzy )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:556:20: ^( EXACT_TERM ftsWord ( fuzzy )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXACT_TERM, "EXACT_TERM")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsWord.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:556:41: ( fuzzy )?
                        if ( stream_fuzzy.hasNext() ) {
                            adaptor.addChild(root_1, stream_fuzzy.nextTree());

                        }
                        stream_fuzzy.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsExactTermOrPhrase"


    public static class ftsTokenisedTermOrPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsTokenisedTermOrPhrase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:561:1: ftsTokenisedTermOrPhrase : TILDA ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord ( fuzzy )? ) ) ;
    public final FTSParser.ftsTokenisedTermOrPhrase_return ftsTokenisedTermOrPhrase() throws RecognitionException {
        FTSParser.ftsTokenisedTermOrPhrase_return retval = new FTSParser.ftsTokenisedTermOrPhrase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TILDA83=null;
        Token COLON85=null;
        Token FTSPHRASE86=null;
        Token FTSPHRASE90=null;
        FTSParser.fieldReference_return fieldReference84 =null;

        FTSParser.slop_return slop87 =null;

        FTSParser.ftsWord_return ftsWord88 =null;

        FTSParser.fuzzy_return fuzzy89 =null;

        FTSParser.slop_return slop91 =null;

        FTSParser.ftsWord_return ftsWord92 =null;

        FTSParser.fuzzy_return fuzzy93 =null;


        Object TILDA83_tree=null;
        Object COLON85_tree=null;
        Object FTSPHRASE86_tree=null;
        Object FTSPHRASE90_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_TILDA=new RewriteRuleTokenStream(adaptor,"token TILDA");
        RewriteRuleTokenStream stream_FTSPHRASE=new RewriteRuleTokenStream(adaptor,"token FTSPHRASE");
        RewriteRuleSubtreeStream stream_fuzzy=new RewriteRuleSubtreeStream(adaptor,"rule fuzzy");
        RewriteRuleSubtreeStream stream_slop=new RewriteRuleSubtreeStream(adaptor,"rule slop");
        RewriteRuleSubtreeStream stream_ftsWord=new RewriteRuleSubtreeStream(adaptor,"rule ftsWord");
        RewriteRuleSubtreeStream stream_fieldReference=new RewriteRuleSubtreeStream(adaptor,"rule fieldReference");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:562:9: ( TILDA ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord ( fuzzy )? ) ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:563:9: TILDA ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord ( fuzzy )? ) )
            {
            TILDA83=(Token)match(input,TILDA,FOLLOW_TILDA_in_ftsTokenisedTermOrPhrase3314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TILDA.add(TILDA83);


            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:564:9: ( ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) ) | FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord ( fuzzy )? ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==AT) && (synpred13_FTS())) {
                alt39=1;
            }
            else if ( (LA39_0==ID) ) {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==DOT) ) {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        switch ( input.LA(4) ) {
                        case DOT:
                            {
                            alt39=3;
                            }
                            break;
                        case COLON:
                            {
                            switch ( input.LA(5) ) {
                            case LPAREN:
                                {
                                alt39=3;
                                }
                                break;
                            case ID:
                                {
                                int LA39_50 = input.LA(6);

                                if ( (synpred13_FTS()) ) {
                                    alt39=1;
                                }
                                else if ( (true) ) {
                                    alt39=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 39, 50, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case FTSPHRASE:
                                {
                                int LA39_51 = input.LA(6);

                                if ( (synpred13_FTS()) ) {
                                    alt39=1;
                                }
                                else if ( (true) ) {
                                    alt39=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 39, 51, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case COMMA:
                            case DOT:
                                {
                                int LA39_52 = input.LA(6);

                                if ( (LA39_52==DECIMAL_INTEGER_LITERAL||LA39_52==FLOATING_POINT_LITERAL||(LA39_52 >= FTSPRE && LA39_52 <= FTSWORD)||LA39_52==ID||LA39_52==NOT||LA39_52==QUESTION_MARK||LA39_52==STAR||LA39_52==TO) ) {
                                    int LA39_55 = input.LA(7);

                                    if ( (synpred13_FTS()) ) {
                                        alt39=1;
                                    }
                                    else if ( (true) ) {
                                        alt39=3;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 39, 55, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 39, 52, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case DECIMAL_INTEGER_LITERAL:
                            case FLOATING_POINT_LITERAL:
                            case FTSPRE:
                            case FTSWILD:
                            case FTSWORD:
                                {
                                int LA39_53 = input.LA(6);

                                if ( (synpred13_FTS()) ) {
                                    alt39=1;
                                }
                                else if ( (true) ) {
                                    alt39=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 39, 53, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case NOT:
                            case QUESTION_MARK:
                            case STAR:
                            case TO:
                                {
                                int LA39_54 = input.LA(6);

                                if ( (synpred13_FTS()) ) {
                                    alt39=1;
                                }
                                else if ( (true) ) {
                                    alt39=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 39, 54, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case LSQUARE:
                                {
                                alt39=3;
                                }
                                break;
                            case LT:
                                {
                                alt39=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 41, input);

                                throw nvae;

                            }

                            }
                            break;
                        case COMMA:
                            {
                            alt39=3;
                            }
                            break;
                        case TILDA:
                            {
                            alt39=3;
                            }
                            break;
                        case CARAT:
                            {
                            alt39=3;
                            }
                            break;
                        case AND:
                            {
                            alt39=3;
                            }
                            break;
                        case AMP:
                            {
                            alt39=3;
                            }
                            break;
                        case EOF:
                            {
                            alt39=3;
                            }
                            break;
                        case RPAREN:
                            {
                            alt39=3;
                            }
                            break;
                        case OR:
                            {
                            alt39=3;
                            }
                            break;
                        case BAR:
                            {
                            alt39=3;
                            }
                            break;
                        case NOT:
                            {
                            alt39=3;
                            }
                            break;
                        case EXCLAMATION:
                            {
                            alt39=3;
                            }
                            break;
                        case ID:
                            {
                            alt39=3;
                            }
                            break;
                        case AT:
                            {
                            alt39=3;
                            }
                            break;
                        case DECIMAL_INTEGER_LITERAL:
                        case FLOATING_POINT_LITERAL:
                        case FTSPRE:
                        case FTSWILD:
                        case FTSWORD:
                            {
                            alt39=3;
                            }
                            break;
                        case URI:
                            {
                            alt39=3;
                            }
                            break;
                        case FTSPHRASE:
                            {
                            alt39=3;
                            }
                            break;
                        case STAR:
                            {
                            alt39=3;
                            }
                            break;
                        case EQUALS:
                            {
                            alt39=3;
                            }
                            break;
                        case TO:
                            {
                            alt39=3;
                            }
                            break;
                        case LSQUARE:
                            {
                            alt39=3;
                            }
                            break;
                        case LT:
                            {
                            alt39=3;
                            }
                            break;
                        case LPAREN:
                            {
                            alt39=3;
                            }
                            break;
                        case PERCENT:
                            {
                            alt39=3;
                            }
                            break;
                        case PLUS:
                            {
                            alt39=3;
                            }
                            break;
                        case MINUS:
                            {
                            alt39=3;
                            }
                            break;
                        case QUESTION_MARK:
                            {
                            alt39=3;
                            }
                            break;
                        case DOTDOT:
                            {
                            alt39=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 34, input);

                            throw nvae;

                        }

                        }
                        break;
                    case NOT:
                        {
                        alt39=3;
                        }
                        break;
                    case TILDA:
                        {
                        alt39=3;
                        }
                        break;
                    case CARAT:
                        {
                        alt39=3;
                        }
                        break;
                    case AND:
                        {
                        alt39=3;
                        }
                        break;
                    case AMP:
                        {
                        alt39=3;
                        }
                        break;
                    case EOF:
                        {
                        alt39=3;
                        }
                        break;
                    case RPAREN:
                        {
                        alt39=3;
                        }
                        break;
                    case OR:
                        {
                        alt39=3;
                        }
                        break;
                    case BAR:
                        {
                        alt39=3;
                        }
                        break;
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                        {
                        alt39=3;
                        }
                        break;
                    case EXCLAMATION:
                        {
                        alt39=3;
                        }
                        break;
                    case QUESTION_MARK:
                    case STAR:
                        {
                        alt39=3;
                        }
                        break;
                    case AT:
                        {
                        alt39=3;
                        }
                        break;
                    case URI:
                        {
                        alt39=3;
                        }
                        break;
                    case FTSPHRASE:
                        {
                        alt39=3;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt39=3;
                        }
                        break;
                    case EQUALS:
                        {
                        alt39=3;
                        }
                        break;
                    case TO:
                        {
                        alt39=3;
                        }
                        break;
                    case LSQUARE:
                        {
                        alt39=3;
                        }
                        break;
                    case LT:
                        {
                        alt39=3;
                        }
                        break;
                    case LPAREN:
                        {
                        alt39=3;
                        }
                        break;
                    case PERCENT:
                        {
                        alt39=3;
                        }
                        break;
                    case PLUS:
                        {
                        alt39=3;
                        }
                        break;
                    case MINUS:
                        {
                        alt39=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 7, input);

                        throw nvae;

                    }

                }
                else if ( (LA39_2==COLON) && (synpred13_FTS())) {
                    alt39=1;
                }
                else if ( (LA39_2==COMMA) ) {
                    alt39=3;
                }
                else if ( (LA39_2==TILDA) ) {
                    alt39=3;
                }
                else if ( (LA39_2==CARAT) ) {
                    alt39=3;
                }
                else if ( (LA39_2==AND) ) {
                    alt39=3;
                }
                else if ( (LA39_2==AMP) ) {
                    alt39=3;
                }
                else if ( (LA39_2==EOF) ) {
                    alt39=3;
                }
                else if ( (LA39_2==RPAREN) ) {
                    alt39=3;
                }
                else if ( (LA39_2==OR) ) {
                    alt39=3;
                }
                else if ( (LA39_2==BAR) ) {
                    alt39=3;
                }
                else if ( (LA39_2==NOT) ) {
                    alt39=3;
                }
                else if ( (LA39_2==EXCLAMATION) ) {
                    alt39=3;
                }
                else if ( (LA39_2==ID) ) {
                    alt39=3;
                }
                else if ( (LA39_2==AT) ) {
                    alt39=3;
                }
                else if ( (LA39_2==DECIMAL_INTEGER_LITERAL||LA39_2==FLOATING_POINT_LITERAL||(LA39_2 >= FTSPRE && LA39_2 <= FTSWORD)) ) {
                    alt39=3;
                }
                else if ( (LA39_2==URI) ) {
                    alt39=3;
                }
                else if ( (LA39_2==FTSPHRASE) ) {
                    alt39=3;
                }
                else if ( (LA39_2==QUESTION_MARK||LA39_2==STAR) ) {
                    alt39=3;
                }
                else if ( (LA39_2==EQUALS) ) {
                    alt39=3;
                }
                else if ( (LA39_2==TO) ) {
                    alt39=3;
                }
                else if ( (LA39_2==LSQUARE) ) {
                    alt39=3;
                }
                else if ( (LA39_2==LT) ) {
                    alt39=3;
                }
                else if ( (LA39_2==LPAREN) ) {
                    alt39=3;
                }
                else if ( (LA39_2==PERCENT) ) {
                    alt39=3;
                }
                else if ( (LA39_2==PLUS) ) {
                    alt39=3;
                }
                else if ( (LA39_2==MINUS) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA39_0==URI) && (synpred13_FTS())) {
                alt39=1;
            }
            else if ( (LA39_0==FTSPHRASE) ) {
                alt39=2;
            }
            else if ( (LA39_0==COMMA||LA39_0==DOT) ) {
                alt39=3;
            }
            else if ( (LA39_0==DECIMAL_INTEGER_LITERAL||LA39_0==FLOATING_POINT_LITERAL||(LA39_0 >= FTSPRE && LA39_0 <= FTSWORD)||LA39_0==NOT||LA39_0==QUESTION_MARK||LA39_0==STAR||LA39_0==TO) ) {
                alt39=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:565:9: ( fieldReference COLON )=> fieldReference COLON ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) )
                    {
                    pushFollow(FOLLOW_fieldReference_in_ftsTokenisedTermOrPhrase3342);
                    fieldReference84=fieldReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldReference.add(fieldReference84.getTree());

                    COLON85=(Token)match(input,COLON,FOLLOW_COLON_in_ftsTokenisedTermOrPhrase3344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON85);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:566:9: ( FTSPHRASE ( ( slop )=> slop )? -> ^( PHRASE FTSPHRASE fieldReference ( slop )? ) | ftsWord ( ( fuzzy )=> fuzzy )? -> ^( TERM ftsWord fieldReference ( fuzzy )? ) )
                    int alt36=2;
                    switch ( input.LA(1) ) {
                    case FTSPHRASE:
                        {
                        alt36=1;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt36=2;
                        }
                        break;
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                    case ID:
                    case NOT:
                    case QUESTION_MARK:
                    case STAR:
                    case TO:
                        {
                        alt36=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;

                    }

                    switch (alt36) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:567:17: FTSPHRASE ( ( slop )=> slop )?
                            {
                            FTSPHRASE86=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_ftsTokenisedTermOrPhrase3372); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FTSPHRASE.add(FTSPHRASE86);


                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:567:27: ( ( slop )=> slop )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==TILDA) ) {
                                int LA34_1 = input.LA(2);

                                if ( (LA34_1==DECIMAL_INTEGER_LITERAL) ) {
                                    int LA34_26 = input.LA(3);

                                    if ( (synpred14_FTS()) ) {
                                        alt34=1;
                                    }
                                }
                            }
                            switch (alt34) {
                                case 1 :
                                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:567:28: ( slop )=> slop
                                    {
                                    pushFollow(FOLLOW_slop_in_ftsTokenisedTermOrPhrase3380);
                                    slop87=slop();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_slop.add(slop87.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: slop, FTSPHRASE, fieldReference
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 568:17: -> ^( PHRASE FTSPHRASE fieldReference ( slop )? )
                            {
                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:568:20: ^( PHRASE FTSPHRASE fieldReference ( slop )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(PHRASE, "PHRASE")
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_FTSPHRASE.nextNode()
                                );

                                adaptor.addChild(root_1, stream_fieldReference.nextTree());

                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:568:54: ( slop )?
                                if ( stream_slop.hasNext() ) {
                                    adaptor.addChild(root_1, stream_slop.nextTree());

                                }
                                stream_slop.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:570:17: ftsWord ( ( fuzzy )=> fuzzy )?
                            {
                            pushFollow(FOLLOW_ftsWord_in_ftsTokenisedTermOrPhrase3447);
                            ftsWord88=ftsWord();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ftsWord.add(ftsWord88.getTree());

                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:570:25: ( ( fuzzy )=> fuzzy )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==TILDA) ) {
                                int LA35_1 = input.LA(2);

                                if ( (LA35_1==DECIMAL_INTEGER_LITERAL||LA35_1==FLOATING_POINT_LITERAL) ) {
                                    int LA35_26 = input.LA(3);

                                    if ( (synpred15_FTS()) ) {
                                        alt35=1;
                                    }
                                }
                            }
                            switch (alt35) {
                                case 1 :
                                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:570:26: ( fuzzy )=> fuzzy
                                    {
                                    pushFollow(FOLLOW_fuzzy_in_ftsTokenisedTermOrPhrase3456);
                                    fuzzy89=fuzzy();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy89.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: fieldReference, ftsWord, fuzzy
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 571:17: -> ^( TERM ftsWord fieldReference ( fuzzy )? )
                            {
                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:571:20: ^( TERM ftsWord fieldReference ( fuzzy )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(TERM, "TERM")
                                , root_1);

                                adaptor.addChild(root_1, stream_ftsWord.nextTree());

                                adaptor.addChild(root_1, stream_fieldReference.nextTree());

                                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:571:50: ( fuzzy )?
                                if ( stream_fuzzy.hasNext() ) {
                                    adaptor.addChild(root_1, stream_fuzzy.nextTree());

                                }
                                stream_fuzzy.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:574:9: FTSPHRASE ( ( slop )=> slop )?
                    {
                    FTSPHRASE90=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_ftsTokenisedTermOrPhrase3517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FTSPHRASE.add(FTSPHRASE90);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:574:19: ( ( slop )=> slop )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==TILDA) ) {
                        int LA37_1 = input.LA(2);

                        if ( (LA37_1==DECIMAL_INTEGER_LITERAL) ) {
                            int LA37_26 = input.LA(3);

                            if ( (synpred16_FTS()) ) {
                                alt37=1;
                            }
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:574:20: ( slop )=> slop
                            {
                            pushFollow(FOLLOW_slop_in_ftsTokenisedTermOrPhrase3525);
                            slop91=slop();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_slop.add(slop91.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: slop, FTSPHRASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 575:17: -> ^( PHRASE FTSPHRASE ( slop )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:575:20: ^( PHRASE FTSPHRASE ( slop )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PHRASE, "PHRASE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FTSPHRASE.nextNode()
                        );

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:575:39: ( slop )?
                        if ( stream_slop.hasNext() ) {
                            adaptor.addChild(root_1, stream_slop.nextTree());

                        }
                        stream_slop.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:577:9: ftsWord ( ( fuzzy )=> fuzzy )?
                    {
                    pushFollow(FOLLOW_ftsWord_in_ftsTokenisedTermOrPhrase3575);
                    ftsWord92=ftsWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsWord.add(ftsWord92.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:577:17: ( ( fuzzy )=> fuzzy )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==TILDA) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==DECIMAL_INTEGER_LITERAL||LA38_1==FLOATING_POINT_LITERAL) ) {
                            int LA38_26 = input.LA(3);

                            if ( (synpred17_FTS()) ) {
                                alt38=1;
                            }
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:577:18: ( fuzzy )=> fuzzy
                            {
                            pushFollow(FOLLOW_fuzzy_in_ftsTokenisedTermOrPhrase3584);
                            fuzzy93=fuzzy();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy93.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fuzzy, ftsWord
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 578:17: -> ^( TERM ftsWord ( fuzzy )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:578:20: ^( TERM ftsWord ( fuzzy )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TERM, "TERM")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsWord.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:578:35: ( fuzzy )?
                        if ( stream_fuzzy.hasNext() ) {
                            adaptor.addChild(root_1, stream_fuzzy.nextTree());

                        }
                        stream_fuzzy.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsTokenisedTermOrPhrase"


    public static class cmisTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmisTerm"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:583:1: cmisTerm : ftsWord -> ftsWord ;
    public final FTSParser.cmisTerm_return cmisTerm() throws RecognitionException {
        FTSParser.cmisTerm_return retval = new FTSParser.cmisTerm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsWord_return ftsWord94 =null;


        RewriteRuleSubtreeStream stream_ftsWord=new RewriteRuleSubtreeStream(adaptor,"rule ftsWord");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:584:9: ( ftsWord -> ftsWord )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:585:9: ftsWord
            {
            pushFollow(FOLLOW_ftsWord_in_cmisTerm3657);
            ftsWord94=ftsWord();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsWord.add(ftsWord94.getTree());

            // AST REWRITE
            // elements: ftsWord
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 586:17: -> ftsWord
            {
                adaptor.addChild(root_0, stream_ftsWord.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmisTerm"


    public static class cmisPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmisPhrase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:590:1: cmisPhrase : FTSPHRASE -> FTSPHRASE ;
    public final FTSParser.cmisPhrase_return cmisPhrase() throws RecognitionException {
        FTSParser.cmisPhrase_return retval = new FTSParser.cmisPhrase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FTSPHRASE95=null;

        Object FTSPHRASE95_tree=null;
        RewriteRuleTokenStream stream_FTSPHRASE=new RewriteRuleTokenStream(adaptor,"token FTSPHRASE");

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:591:9: ( FTSPHRASE -> FTSPHRASE )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:592:9: FTSPHRASE
            {
            FTSPHRASE95=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_cmisPhrase3711); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FTSPHRASE.add(FTSPHRASE95);


            // AST REWRITE
            // elements: FTSPHRASE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 593:17: -> FTSPHRASE
            {
                adaptor.addChild(root_0, 
                stream_FTSPHRASE.nextNode()
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmisPhrase"


    public static class ftsRange_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsRange"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:597:1: ftsRange : ( fieldReference COLON )? ftsFieldGroupRange -> ftsFieldGroupRange ( fieldReference )? ;
    public final FTSParser.ftsRange_return ftsRange() throws RecognitionException {
        FTSParser.ftsRange_return retval = new FTSParser.ftsRange_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON97=null;
        FTSParser.fieldReference_return fieldReference96 =null;

        FTSParser.ftsFieldGroupRange_return ftsFieldGroupRange98 =null;


        Object COLON97_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_ftsFieldGroupRange=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupRange");
        RewriteRuleSubtreeStream stream_fieldReference=new RewriteRuleSubtreeStream(adaptor,"rule fieldReference");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:598:9: ( ( fieldReference COLON )? ftsFieldGroupRange -> ftsFieldGroupRange ( fieldReference )? )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:599:9: ( fieldReference COLON )? ftsFieldGroupRange
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:599:9: ( fieldReference COLON )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case AT:
                    {
                    alt40=1;
                    }
                    break;
                case ID:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==DOT) ) {
                        alt40=1;
                    }
                    else if ( (LA40_2==COLON) ) {
                        alt40=1;
                    }
                    }
                    break;
                case URI:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:599:10: fieldReference COLON
                    {
                    pushFollow(FOLLOW_fieldReference_in_ftsRange3766);
                    fieldReference96=fieldReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldReference.add(fieldReference96.getTree());

                    COLON97=(Token)match(input,COLON,FOLLOW_COLON_in_ftsRange3768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON97);


                    }
                    break;

            }


            pushFollow(FOLLOW_ftsFieldGroupRange_in_ftsRange3772);
            ftsFieldGroupRange98=ftsFieldGroupRange();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupRange.add(ftsFieldGroupRange98.getTree());

            // AST REWRITE
            // elements: fieldReference, ftsFieldGroupRange
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 600:17: -> ftsFieldGroupRange ( fieldReference )?
            {
                adaptor.addChild(root_0, stream_ftsFieldGroupRange.nextTree());

                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:600:39: ( fieldReference )?
                if ( stream_fieldReference.hasNext() ) {
                    adaptor.addChild(root_0, stream_fieldReference.nextTree());

                }
                stream_fieldReference.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsRange"


    public static class ftsFieldGroup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroup"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:603:1: ftsFieldGroup : fieldReference COLON LPAREN ftsFieldGroupDisjunction RPAREN -> ^( FIELD_GROUP fieldReference ftsFieldGroupDisjunction ) ;
    public final FTSParser.ftsFieldGroup_return ftsFieldGroup() throws RecognitionException {
        FTSParser.ftsFieldGroup_return retval = new FTSParser.ftsFieldGroup_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON100=null;
        Token LPAREN101=null;
        Token RPAREN103=null;
        FTSParser.fieldReference_return fieldReference99 =null;

        FTSParser.ftsFieldGroupDisjunction_return ftsFieldGroupDisjunction102 =null;


        Object COLON100_tree=null;
        Object LPAREN101_tree=null;
        Object RPAREN103_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_fieldReference=new RewriteRuleSubtreeStream(adaptor,"rule fieldReference");
        RewriteRuleSubtreeStream stream_ftsFieldGroupDisjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupDisjunction");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:604:9: ( fieldReference COLON LPAREN ftsFieldGroupDisjunction RPAREN -> ^( FIELD_GROUP fieldReference ftsFieldGroupDisjunction ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:605:9: fieldReference COLON LPAREN ftsFieldGroupDisjunction RPAREN
            {
            pushFollow(FOLLOW_fieldReference_in_ftsFieldGroup3828);
            fieldReference99=fieldReference();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldReference.add(fieldReference99.getTree());

            COLON100=(Token)match(input,COLON,FOLLOW_COLON_in_ftsFieldGroup3830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON100);


            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ftsFieldGroup3832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);


            pushFollow(FOLLOW_ftsFieldGroupDisjunction_in_ftsFieldGroup3834);
            ftsFieldGroupDisjunction102=ftsFieldGroupDisjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupDisjunction.add(ftsFieldGroupDisjunction102.getTree());

            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ftsFieldGroup3836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);


            // AST REWRITE
            // elements: ftsFieldGroupDisjunction, fieldReference
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 606:17: -> ^( FIELD_GROUP fieldReference ftsFieldGroupDisjunction )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:607:25: ^( FIELD_GROUP fieldReference ftsFieldGroupDisjunction )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_GROUP, "FIELD_GROUP")
                , root_1);

                adaptor.addChild(root_1, stream_fieldReference.nextTree());

                adaptor.addChild(root_1, stream_ftsFieldGroupDisjunction.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroup"


    public static class ftsFieldGroupDisjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupDisjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:610:1: ftsFieldGroupDisjunction : ({...}? ftsFieldGroupExplicitDisjunction |{...}? ftsFieldGroupImplicitDisjunction );
    public final FTSParser.ftsFieldGroupDisjunction_return ftsFieldGroupDisjunction() throws RecognitionException {
        FTSParser.ftsFieldGroupDisjunction_return retval = new FTSParser.ftsFieldGroupDisjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsFieldGroupExplicitDisjunction_return ftsFieldGroupExplicitDisjunction104 =null;

        FTSParser.ftsFieldGroupImplicitDisjunction_return ftsFieldGroupImplicitDisjunction105 =null;



        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:611:9: ({...}? ftsFieldGroupExplicitDisjunction |{...}? ftsFieldGroupImplicitDisjunction )
            int alt41=2;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt41=1;
                }
                break;
            case AMP:
                {
                alt41=1;
                }
                break;
            case NOT:
                {
                int LA41_3 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;

                }
                }
                break;
            case EXCLAMATION:
                {
                int LA41_4 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL_INTEGER_LITERAL:
            case FLOATING_POINT_LITERAL:
            case FTSPRE:
            case FTSWILD:
            case FTSWORD:
            case ID:
                {
                int LA41_5 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 5, input);

                    throw nvae;

                }
                }
                break;
            case COMMA:
            case DOT:
                {
                int LA41_6 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 6, input);

                    throw nvae;

                }
                }
                break;
            case QUESTION_MARK:
            case STAR:
                {
                int LA41_7 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 7, input);

                    throw nvae;

                }
                }
                break;
            case EQUALS:
                {
                int LA41_8 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 8, input);

                    throw nvae;

                }
                }
                break;
            case FTSPHRASE:
                {
                int LA41_9 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 9, input);

                    throw nvae;

                }
                }
                break;
            case TILDA:
                {
                int LA41_10 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 10, input);

                    throw nvae;

                }
                }
                break;
            case TO:
                {
                int LA41_11 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 11, input);

                    throw nvae;

                }
                }
                break;
            case LSQUARE:
                {
                int LA41_12 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 12, input);

                    throw nvae;

                }
                }
                break;
            case LT:
                {
                int LA41_13 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 13, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA41_14 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 14, input);

                    throw nvae;

                }
                }
                break;
            case PLUS:
                {
                int LA41_15 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 15, input);

                    throw nvae;

                }
                }
                break;
            case BAR:
                {
                int LA41_16 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 16, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
                {
                int LA41_17 = input.LA(2);

                if ( ((defaultFieldConjunction() == true)) ) {
                    alt41=1;
                }
                else if ( ((defaultFieldConjunction() == false)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 17, input);

                    throw nvae;

                }
                }
                break;
            case OR:
                {
                alt41=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:612:9: {...}? ftsFieldGroupExplicitDisjunction
                    {
                    root_0 = (Object)adaptor.nil();


                    if ( !((defaultFieldConjunction() == true)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "ftsFieldGroupDisjunction", "defaultFieldConjunction() == true");
                    }

                    pushFollow(FOLLOW_ftsFieldGroupExplicitDisjunction_in_ftsFieldGroupDisjunction3921);
                    ftsFieldGroupExplicitDisjunction104=ftsFieldGroupExplicitDisjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsFieldGroupExplicitDisjunction104.getTree());

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:613:11: {...}? ftsFieldGroupImplicitDisjunction
                    {
                    root_0 = (Object)adaptor.nil();


                    if ( !((defaultFieldConjunction() == false)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "ftsFieldGroupDisjunction", "defaultFieldConjunction() == false");
                    }

                    pushFollow(FOLLOW_ftsFieldGroupImplicitDisjunction_in_ftsFieldGroupDisjunction3935);
                    ftsFieldGroupImplicitDisjunction105=ftsFieldGroupImplicitDisjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsFieldGroupImplicitDisjunction105.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupDisjunction"


    public static class ftsFieldGroupExplicitDisjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupExplicitDisjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:616:1: ftsFieldGroupExplicitDisjunction : ftsFieldGroupImplicitConjunction ( or ftsFieldGroupImplicitConjunction )* -> ^( FIELD_DISJUNCTION ( ftsFieldGroupImplicitConjunction )+ ) ;
    public final FTSParser.ftsFieldGroupExplicitDisjunction_return ftsFieldGroupExplicitDisjunction() throws RecognitionException {
        FTSParser.ftsFieldGroupExplicitDisjunction_return retval = new FTSParser.ftsFieldGroupExplicitDisjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsFieldGroupImplicitConjunction_return ftsFieldGroupImplicitConjunction106 =null;

        FTSParser.or_return or107 =null;

        FTSParser.ftsFieldGroupImplicitConjunction_return ftsFieldGroupImplicitConjunction108 =null;


        RewriteRuleSubtreeStream stream_ftsFieldGroupImplicitConjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupImplicitConjunction");
        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:617:9: ( ftsFieldGroupImplicitConjunction ( or ftsFieldGroupImplicitConjunction )* -> ^( FIELD_DISJUNCTION ( ftsFieldGroupImplicitConjunction )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:618:9: ftsFieldGroupImplicitConjunction ( or ftsFieldGroupImplicitConjunction )*
            {
            pushFollow(FOLLOW_ftsFieldGroupImplicitConjunction_in_ftsFieldGroupExplicitDisjunction3968);
            ftsFieldGroupImplicitConjunction106=ftsFieldGroupImplicitConjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupImplicitConjunction.add(ftsFieldGroupImplicitConjunction106.getTree());

            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:618:42: ( or ftsFieldGroupImplicitConjunction )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BAR||LA42_0==OR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:618:43: or ftsFieldGroupImplicitConjunction
            	    {
            	    pushFollow(FOLLOW_or_in_ftsFieldGroupExplicitDisjunction3971);
            	    or107=or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_or.add(or107.getTree());

            	    pushFollow(FOLLOW_ftsFieldGroupImplicitConjunction_in_ftsFieldGroupExplicitDisjunction3973);
            	    ftsFieldGroupImplicitConjunction108=ftsFieldGroupImplicitConjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsFieldGroupImplicitConjunction.add(ftsFieldGroupImplicitConjunction108.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            // AST REWRITE
            // elements: ftsFieldGroupImplicitConjunction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 619:17: -> ^( FIELD_DISJUNCTION ( ftsFieldGroupImplicitConjunction )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:620:25: ^( FIELD_DISJUNCTION ( ftsFieldGroupImplicitConjunction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_DISJUNCTION, "FIELD_DISJUNCTION")
                , root_1);

                if ( !(stream_ftsFieldGroupImplicitConjunction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsFieldGroupImplicitConjunction.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsFieldGroupImplicitConjunction.nextTree());

                }
                stream_ftsFieldGroupImplicitConjunction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupExplicitDisjunction"


    public static class ftsFieldGroupImplicitDisjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupImplicitDisjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:623:1: ftsFieldGroupImplicitDisjunction : ( ( or )? ftsFieldGroupExplicitConjunction )+ -> ^( FIELD_DISJUNCTION ( ftsFieldGroupExplicitConjunction )+ ) ;
    public final FTSParser.ftsFieldGroupImplicitDisjunction_return ftsFieldGroupImplicitDisjunction() throws RecognitionException {
        FTSParser.ftsFieldGroupImplicitDisjunction_return retval = new FTSParser.ftsFieldGroupImplicitDisjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.or_return or109 =null;

        FTSParser.ftsFieldGroupExplicitConjunction_return ftsFieldGroupExplicitConjunction110 =null;


        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        RewriteRuleSubtreeStream stream_ftsFieldGroupExplicitConjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupExplicitConjunction");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:624:9: ( ( ( or )? ftsFieldGroupExplicitConjunction )+ -> ^( FIELD_DISJUNCTION ( ftsFieldGroupExplicitConjunction )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:625:9: ( ( or )? ftsFieldGroupExplicitConjunction )+
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:625:9: ( ( or )? ftsFieldGroupExplicitConjunction )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case OR:
                    {
                    alt44=1;
                    }
                    break;
                case BAR:
                    {
                    alt44=1;
                    }
                    break;
                case NOT:
                    {
                    alt44=1;
                    }
                    break;
                case EXCLAMATION:
                    {
                    alt44=1;
                    }
                    break;
                case DECIMAL_INTEGER_LITERAL:
                case FLOATING_POINT_LITERAL:
                case FTSPRE:
                case FTSWILD:
                case FTSWORD:
                case ID:
                    {
                    alt44=1;
                    }
                    break;
                case COMMA:
                case DOT:
                    {
                    alt44=1;
                    }
                    break;
                case QUESTION_MARK:
                case STAR:
                    {
                    alt44=1;
                    }
                    break;
                case EQUALS:
                    {
                    alt44=1;
                    }
                    break;
                case FTSPHRASE:
                    {
                    alt44=1;
                    }
                    break;
                case TILDA:
                    {
                    alt44=1;
                    }
                    break;
                case TO:
                    {
                    alt44=1;
                    }
                    break;
                case LSQUARE:
                    {
                    alt44=1;
                    }
                    break;
                case LT:
                    {
                    alt44=1;
                    }
                    break;
                case LPAREN:
                    {
                    alt44=1;
                    }
                    break;
                case PLUS:
                    {
                    alt44=1;
                    }
                    break;
                case MINUS:
                    {
                    alt44=1;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:625:10: ( or )? ftsFieldGroupExplicitConjunction
            	    {
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:625:10: ( or )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==OR) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==BAR) ) {
            	        int LA43_2 = input.LA(2);

            	        if ( (LA43_2==BAR) ) {
            	            alt43=1;
            	        }
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:625:10: or
            	            {
            	            pushFollow(FOLLOW_or_in_ftsFieldGroupImplicitDisjunction4058);
            	            or109=or();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_or.add(or109.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_ftsFieldGroupExplicitConjunction_in_ftsFieldGroupImplicitDisjunction4061);
            	    ftsFieldGroupExplicitConjunction110=ftsFieldGroupExplicitConjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsFieldGroupExplicitConjunction.add(ftsFieldGroupExplicitConjunction110.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            // AST REWRITE
            // elements: ftsFieldGroupExplicitConjunction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 626:17: -> ^( FIELD_DISJUNCTION ( ftsFieldGroupExplicitConjunction )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:627:25: ^( FIELD_DISJUNCTION ( ftsFieldGroupExplicitConjunction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_DISJUNCTION, "FIELD_DISJUNCTION")
                , root_1);

                if ( !(stream_ftsFieldGroupExplicitConjunction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsFieldGroupExplicitConjunction.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsFieldGroupExplicitConjunction.nextTree());

                }
                stream_ftsFieldGroupExplicitConjunction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupImplicitDisjunction"


    public static class ftsFieldGroupExplicitConjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupExplicitConjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:634:1: ftsFieldGroupExplicitConjunction : ftsFieldGroupPrefixed ( and ftsFieldGroupPrefixed )* -> ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ ) ;
    public final FTSParser.ftsFieldGroupExplicitConjunction_return ftsFieldGroupExplicitConjunction() throws RecognitionException {
        FTSParser.ftsFieldGroupExplicitConjunction_return retval = new FTSParser.ftsFieldGroupExplicitConjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsFieldGroupPrefixed_return ftsFieldGroupPrefixed111 =null;

        FTSParser.and_return and112 =null;

        FTSParser.ftsFieldGroupPrefixed_return ftsFieldGroupPrefixed113 =null;


        RewriteRuleSubtreeStream stream_ftsFieldGroupPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupPrefixed");
        RewriteRuleSubtreeStream stream_and=new RewriteRuleSubtreeStream(adaptor,"rule and");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:635:9: ( ftsFieldGroupPrefixed ( and ftsFieldGroupPrefixed )* -> ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:636:9: ftsFieldGroupPrefixed ( and ftsFieldGroupPrefixed )*
            {
            pushFollow(FOLLOW_ftsFieldGroupPrefixed_in_ftsFieldGroupExplicitConjunction4148);
            ftsFieldGroupPrefixed111=ftsFieldGroupPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupPrefixed.add(ftsFieldGroupPrefixed111.getTree());

            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:636:31: ( and ftsFieldGroupPrefixed )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0 >= AMP && LA45_0 <= AND)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:636:32: and ftsFieldGroupPrefixed
            	    {
            	    pushFollow(FOLLOW_and_in_ftsFieldGroupExplicitConjunction4151);
            	    and112=and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_and.add(and112.getTree());

            	    pushFollow(FOLLOW_ftsFieldGroupPrefixed_in_ftsFieldGroupExplicitConjunction4153);
            	    ftsFieldGroupPrefixed113=ftsFieldGroupPrefixed();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsFieldGroupPrefixed.add(ftsFieldGroupPrefixed113.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            // AST REWRITE
            // elements: ftsFieldGroupPrefixed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 637:17: -> ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:638:25: ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_CONJUNCTION, "FIELD_CONJUNCTION")
                , root_1);

                if ( !(stream_ftsFieldGroupPrefixed.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsFieldGroupPrefixed.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsFieldGroupPrefixed.nextTree());

                }
                stream_ftsFieldGroupPrefixed.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupExplicitConjunction"


    public static class ftsFieldGroupImplicitConjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupImplicitConjunction"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:641:1: ftsFieldGroupImplicitConjunction : ( ( and )? ftsFieldGroupPrefixed )+ -> ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ ) ;
    public final FTSParser.ftsFieldGroupImplicitConjunction_return ftsFieldGroupImplicitConjunction() throws RecognitionException {
        FTSParser.ftsFieldGroupImplicitConjunction_return retval = new FTSParser.ftsFieldGroupImplicitConjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.and_return and114 =null;

        FTSParser.ftsFieldGroupPrefixed_return ftsFieldGroupPrefixed115 =null;


        RewriteRuleSubtreeStream stream_ftsFieldGroupPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupPrefixed");
        RewriteRuleSubtreeStream stream_and=new RewriteRuleSubtreeStream(adaptor,"rule and");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:642:9: ( ( ( and )? ftsFieldGroupPrefixed )+ -> ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:643:9: ( ( and )? ftsFieldGroupPrefixed )+
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:643:9: ( ( and )? ftsFieldGroupPrefixed )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    switch ( input.LA(2) ) {
                    case DECIMAL_INTEGER_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case FTSPRE:
                    case FTSWILD:
                    case FTSWORD:
                    case ID:
                        {
                        alt47=1;
                        }
                        break;
                    case COMMA:
                    case DOT:
                        {
                        alt47=1;
                        }
                        break;
                    case QUESTION_MARK:
                    case STAR:
                        {
                        alt47=1;
                        }
                        break;
                    case EQUALS:
                        {
                        alt47=1;
                        }
                        break;
                    case FTSPHRASE:
                        {
                        alt47=1;
                        }
                        break;
                    case TILDA:
                        {
                        alt47=1;
                        }
                        break;
                    case NOT:
                    case TO:
                        {
                        alt47=1;
                        }
                        break;
                    case LSQUARE:
                        {
                        alt47=1;
                        }
                        break;
                    case LT:
                        {
                        alt47=1;
                        }
                        break;
                    case LPAREN:
                        {
                        alt47=1;
                        }
                        break;

                    }

                    }
                    break;
                case AND:
                    {
                    alt47=1;
                    }
                    break;
                case AMP:
                    {
                    alt47=1;
                    }
                    break;
                case NOT:
                    {
                    alt47=1;
                    }
                    break;
                case EXCLAMATION:
                    {
                    alt47=1;
                    }
                    break;
                case DECIMAL_INTEGER_LITERAL:
                case FLOATING_POINT_LITERAL:
                case FTSPRE:
                case FTSWILD:
                case FTSWORD:
                case ID:
                    {
                    alt47=1;
                    }
                    break;
                case COMMA:
                case DOT:
                    {
                    alt47=1;
                    }
                    break;
                case QUESTION_MARK:
                case STAR:
                    {
                    alt47=1;
                    }
                    break;
                case EQUALS:
                    {
                    alt47=1;
                    }
                    break;
                case FTSPHRASE:
                    {
                    alt47=1;
                    }
                    break;
                case TILDA:
                    {
                    alt47=1;
                    }
                    break;
                case TO:
                    {
                    alt47=1;
                    }
                    break;
                case LSQUARE:
                    {
                    alt47=1;
                    }
                    break;
                case LT:
                    {
                    alt47=1;
                    }
                    break;
                case LPAREN:
                    {
                    alt47=1;
                    }
                    break;
                case PLUS:
                    {
                    alt47=1;
                    }
                    break;
                case MINUS:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:643:10: ( and )? ftsFieldGroupPrefixed
            	    {
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:643:10: ( and )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==AND) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==AMP) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:643:10: and
            	            {
            	            pushFollow(FOLLOW_and_in_ftsFieldGroupImplicitConjunction4238);
            	            and114=and();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_and.add(and114.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_ftsFieldGroupPrefixed_in_ftsFieldGroupImplicitConjunction4241);
            	    ftsFieldGroupPrefixed115=ftsFieldGroupPrefixed();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsFieldGroupPrefixed.add(ftsFieldGroupPrefixed115.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


            // AST REWRITE
            // elements: ftsFieldGroupPrefixed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 644:17: -> ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:645:25: ^( FIELD_CONJUNCTION ( ftsFieldGroupPrefixed )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_CONJUNCTION, "FIELD_CONJUNCTION")
                , root_1);

                if ( !(stream_ftsFieldGroupPrefixed.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsFieldGroupPrefixed.hasNext() ) {
                    adaptor.addChild(root_1, stream_ftsFieldGroupPrefixed.nextTree());

                }
                stream_ftsFieldGroupPrefixed.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupImplicitConjunction"


    public static class ftsFieldGroupPrefixed_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupPrefixed"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:648:1: ftsFieldGroupPrefixed : ( ( not )=> not ftsFieldGroupTest ( boost )? -> ^( FIELD_NEGATION ftsFieldGroupTest ( boost )? ) | ftsFieldGroupTest ( boost )? -> ^( FIELD_DEFAULT ftsFieldGroupTest ( boost )? ) | PLUS ftsFieldGroupTest ( boost )? -> ^( FIELD_MANDATORY ftsFieldGroupTest ( boost )? ) | BAR ftsFieldGroupTest ( boost )? -> ^( FIELD_OPTIONAL ftsFieldGroupTest ( boost )? ) | MINUS ftsFieldGroupTest ( boost )? -> ^( FIELD_EXCLUDE ftsFieldGroupTest ( boost )? ) );
    public final FTSParser.ftsFieldGroupPrefixed_return ftsFieldGroupPrefixed() throws RecognitionException {
        FTSParser.ftsFieldGroupPrefixed_return retval = new FTSParser.ftsFieldGroupPrefixed_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS121=null;
        Token BAR124=null;
        Token MINUS127=null;
        FTSParser.not_return not116 =null;

        FTSParser.ftsFieldGroupTest_return ftsFieldGroupTest117 =null;

        FTSParser.boost_return boost118 =null;

        FTSParser.ftsFieldGroupTest_return ftsFieldGroupTest119 =null;

        FTSParser.boost_return boost120 =null;

        FTSParser.ftsFieldGroupTest_return ftsFieldGroupTest122 =null;

        FTSParser.boost_return boost123 =null;

        FTSParser.ftsFieldGroupTest_return ftsFieldGroupTest125 =null;

        FTSParser.boost_return boost126 =null;

        FTSParser.ftsFieldGroupTest_return ftsFieldGroupTest128 =null;

        FTSParser.boost_return boost129 =null;


        Object PLUS121_tree=null;
        Object BAR124_tree=null;
        Object MINUS127_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_not=new RewriteRuleSubtreeStream(adaptor,"rule not");
        RewriteRuleSubtreeStream stream_boost=new RewriteRuleSubtreeStream(adaptor,"rule boost");
        RewriteRuleSubtreeStream stream_ftsFieldGroupTest=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupTest");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:649:9: ( ( not )=> not ftsFieldGroupTest ( boost )? -> ^( FIELD_NEGATION ftsFieldGroupTest ( boost )? ) | ftsFieldGroupTest ( boost )? -> ^( FIELD_DEFAULT ftsFieldGroupTest ( boost )? ) | PLUS ftsFieldGroupTest ( boost )? -> ^( FIELD_MANDATORY ftsFieldGroupTest ( boost )? ) | BAR ftsFieldGroupTest ( boost )? -> ^( FIELD_OPTIONAL ftsFieldGroupTest ( boost )? ) | MINUS ftsFieldGroupTest ( boost )? -> ^( FIELD_EXCLUDE ftsFieldGroupTest ( boost )? ) )
            int alt53=5;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NOT) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred18_FTS()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA53_0==EXCLAMATION) && (synpred18_FTS())) {
                alt53=1;
            }
            else if ( (LA53_0==DECIMAL_INTEGER_LITERAL||LA53_0==FLOATING_POINT_LITERAL||(LA53_0 >= FTSPRE && LA53_0 <= FTSWORD)||LA53_0==ID) ) {
                alt53=2;
            }
            else if ( (LA53_0==COMMA||LA53_0==DOT) ) {
                alt53=2;
            }
            else if ( (LA53_0==QUESTION_MARK||LA53_0==STAR) ) {
                alt53=2;
            }
            else if ( (LA53_0==EQUALS) ) {
                alt53=2;
            }
            else if ( (LA53_0==FTSPHRASE) ) {
                alt53=2;
            }
            else if ( (LA53_0==TILDA) ) {
                alt53=2;
            }
            else if ( (LA53_0==TO) ) {
                alt53=2;
            }
            else if ( (LA53_0==LSQUARE) ) {
                alt53=2;
            }
            else if ( (LA53_0==LT) ) {
                alt53=2;
            }
            else if ( (LA53_0==LPAREN) ) {
                alt53=2;
            }
            else if ( (LA53_0==PLUS) ) {
                alt53=3;
            }
            else if ( (LA53_0==BAR) ) {
                alt53=4;
            }
            else if ( (LA53_0==MINUS) ) {
                alt53=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:650:9: ( not )=> not ftsFieldGroupTest ( boost )?
                    {
                    pushFollow(FOLLOW_not_in_ftsFieldGroupPrefixed4331);
                    not116=not();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_not.add(not116.getTree());

                    pushFollow(FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4333);
                    ftsFieldGroupTest117=ftsFieldGroupTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupTest.add(ftsFieldGroupTest117.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:650:40: ( boost )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==CARAT) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:650:40: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsFieldGroupPrefixed4335);
                            boost118=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost118.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsFieldGroupTest, boost
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 651:17: -> ^( FIELD_NEGATION ftsFieldGroupTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:652:25: ^( FIELD_NEGATION ftsFieldGroupTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_NEGATION, "FIELD_NEGATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:652:60: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:653:11: ftsFieldGroupTest ( boost )?
                    {
                    pushFollow(FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4399);
                    ftsFieldGroupTest119=ftsFieldGroupTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupTest.add(ftsFieldGroupTest119.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:653:29: ( boost )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==CARAT) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:653:29: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsFieldGroupPrefixed4401);
                            boost120=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost120.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsFieldGroupTest, boost
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 654:17: -> ^( FIELD_DEFAULT ftsFieldGroupTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:655:25: ^( FIELD_DEFAULT ftsFieldGroupTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_DEFAULT, "FIELD_DEFAULT")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:655:59: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:656:11: PLUS ftsFieldGroupTest ( boost )?
                    {
                    PLUS121=(Token)match(input,PLUS,FOLLOW_PLUS_in_ftsFieldGroupPrefixed4465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS121);


                    pushFollow(FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4467);
                    ftsFieldGroupTest122=ftsFieldGroupTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupTest.add(ftsFieldGroupTest122.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:656:34: ( boost )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==CARAT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:656:34: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsFieldGroupPrefixed4469);
                            boost123=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost123.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsFieldGroupTest, boost
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 657:17: -> ^( FIELD_MANDATORY ftsFieldGroupTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:658:25: ^( FIELD_MANDATORY ftsFieldGroupTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_MANDATORY, "FIELD_MANDATORY")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:658:61: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:659:11: BAR ftsFieldGroupTest ( boost )?
                    {
                    BAR124=(Token)match(input,BAR,FOLLOW_BAR_in_ftsFieldGroupPrefixed4533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BAR.add(BAR124);


                    pushFollow(FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4535);
                    ftsFieldGroupTest125=ftsFieldGroupTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupTest.add(ftsFieldGroupTest125.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:659:33: ( boost )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==CARAT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:659:33: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsFieldGroupPrefixed4537);
                            boost126=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost126.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: boost, ftsFieldGroupTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 660:17: -> ^( FIELD_OPTIONAL ftsFieldGroupTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:661:25: ^( FIELD_OPTIONAL ftsFieldGroupTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_OPTIONAL, "FIELD_OPTIONAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:661:60: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:662:11: MINUS ftsFieldGroupTest ( boost )?
                    {
                    MINUS127=(Token)match(input,MINUS,FOLLOW_MINUS_in_ftsFieldGroupPrefixed4601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS127);


                    pushFollow(FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4603);
                    ftsFieldGroupTest128=ftsFieldGroupTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupTest.add(ftsFieldGroupTest128.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:662:35: ( boost )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==CARAT) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:662:35: boost
                            {
                            pushFollow(FOLLOW_boost_in_ftsFieldGroupPrefixed4605);
                            boost129=boost();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_boost.add(boost129.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: boost, ftsFieldGroupTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 663:17: -> ^( FIELD_EXCLUDE ftsFieldGroupTest ( boost )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:664:25: ^( FIELD_EXCLUDE ftsFieldGroupTest ( boost )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_EXCLUDE, "FIELD_EXCLUDE")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupTest.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:664:59: ( boost )?
                        if ( stream_boost.hasNext() ) {
                            adaptor.addChild(root_1, stream_boost.nextTree());

                        }
                        stream_boost.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupPrefixed"


    public static class ftsFieldGroupTest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupTest"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:667:1: ftsFieldGroupTest : ( ( ftsFieldGroupProximity )=> ftsFieldGroupProximity -> ^( FG_PROXIMITY ftsFieldGroupProximity ) | ftsFieldGroupTerm ( ( fuzzy )=> fuzzy )? -> ^( FG_TERM ftsFieldGroupTerm ( fuzzy )? ) | ftsFieldGroupExactTerm ( ( fuzzy )=> fuzzy )? -> ^( FG_EXACT_TERM ftsFieldGroupExactTerm ( fuzzy )? ) | ftsFieldGroupPhrase ( ( slop )=> slop )? -> ^( FG_PHRASE ftsFieldGroupPhrase ( slop )? ) | ftsFieldGroupExactPhrase ( ( slop )=> slop )? -> ^( FG_EXACT_PHRASE ftsFieldGroupExactPhrase ( slop )? ) | ftsFieldGroupTokenisedPhrase ( ( slop )=> slop )? -> ^( FG_PHRASE ftsFieldGroupTokenisedPhrase ( slop )? ) | ftsFieldGroupSynonym ( ( fuzzy )=> fuzzy )? -> ^( FG_SYNONYM ftsFieldGroupSynonym ( fuzzy )? ) | ftsFieldGroupRange -> ^( FG_RANGE ftsFieldGroupRange ) | LPAREN ftsFieldGroupDisjunction RPAREN -> ftsFieldGroupDisjunction );
    public final FTSParser.ftsFieldGroupTest_return ftsFieldGroupTest() throws RecognitionException {
        FTSParser.ftsFieldGroupTest_return retval = new FTSParser.ftsFieldGroupTest_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN144=null;
        Token RPAREN146=null;
        FTSParser.ftsFieldGroupProximity_return ftsFieldGroupProximity130 =null;

        FTSParser.ftsFieldGroupTerm_return ftsFieldGroupTerm131 =null;

        FTSParser.fuzzy_return fuzzy132 =null;

        FTSParser.ftsFieldGroupExactTerm_return ftsFieldGroupExactTerm133 =null;

        FTSParser.fuzzy_return fuzzy134 =null;

        FTSParser.ftsFieldGroupPhrase_return ftsFieldGroupPhrase135 =null;

        FTSParser.slop_return slop136 =null;

        FTSParser.ftsFieldGroupExactPhrase_return ftsFieldGroupExactPhrase137 =null;

        FTSParser.slop_return slop138 =null;

        FTSParser.ftsFieldGroupTokenisedPhrase_return ftsFieldGroupTokenisedPhrase139 =null;

        FTSParser.slop_return slop140 =null;

        FTSParser.ftsFieldGroupSynonym_return ftsFieldGroupSynonym141 =null;

        FTSParser.fuzzy_return fuzzy142 =null;

        FTSParser.ftsFieldGroupRange_return ftsFieldGroupRange143 =null;

        FTSParser.ftsFieldGroupDisjunction_return ftsFieldGroupDisjunction145 =null;


        Object LPAREN144_tree=null;
        Object RPAREN146_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_ftsFieldGroupRange=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupRange");
        RewriteRuleSubtreeStream stream_ftsFieldGroupPhrase=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupPhrase");
        RewriteRuleSubtreeStream stream_ftsFieldGroupExactPhrase=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupExactPhrase");
        RewriteRuleSubtreeStream stream_ftsFieldGroupTokenisedPhrase=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupTokenisedPhrase");
        RewriteRuleSubtreeStream stream_fuzzy=new RewriteRuleSubtreeStream(adaptor,"rule fuzzy");
        RewriteRuleSubtreeStream stream_slop=new RewriteRuleSubtreeStream(adaptor,"rule slop");
        RewriteRuleSubtreeStream stream_ftsFieldGroupTerm=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupTerm");
        RewriteRuleSubtreeStream stream_ftsFieldGroupSynonym=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupSynonym");
        RewriteRuleSubtreeStream stream_ftsFieldGroupExactTerm=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupExactTerm");
        RewriteRuleSubtreeStream stream_ftsFieldGroupDisjunction=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupDisjunction");
        RewriteRuleSubtreeStream stream_ftsFieldGroupProximity=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupProximity");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:668:9: ( ( ftsFieldGroupProximity )=> ftsFieldGroupProximity -> ^( FG_PROXIMITY ftsFieldGroupProximity ) | ftsFieldGroupTerm ( ( fuzzy )=> fuzzy )? -> ^( FG_TERM ftsFieldGroupTerm ( fuzzy )? ) | ftsFieldGroupExactTerm ( ( fuzzy )=> fuzzy )? -> ^( FG_EXACT_TERM ftsFieldGroupExactTerm ( fuzzy )? ) | ftsFieldGroupPhrase ( ( slop )=> slop )? -> ^( FG_PHRASE ftsFieldGroupPhrase ( slop )? ) | ftsFieldGroupExactPhrase ( ( slop )=> slop )? -> ^( FG_EXACT_PHRASE ftsFieldGroupExactPhrase ( slop )? ) | ftsFieldGroupTokenisedPhrase ( ( slop )=> slop )? -> ^( FG_PHRASE ftsFieldGroupTokenisedPhrase ( slop )? ) | ftsFieldGroupSynonym ( ( fuzzy )=> fuzzy )? -> ^( FG_SYNONYM ftsFieldGroupSynonym ( fuzzy )? ) | ftsFieldGroupRange -> ^( FG_RANGE ftsFieldGroupRange ) | LPAREN ftsFieldGroupDisjunction RPAREN -> ftsFieldGroupDisjunction )
            int alt60=9;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:669:9: ( ftsFieldGroupProximity )=> ftsFieldGroupProximity
                    {
                    pushFollow(FOLLOW_ftsFieldGroupProximity_in_ftsFieldGroupTest4696);
                    ftsFieldGroupProximity130=ftsFieldGroupProximity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupProximity.add(ftsFieldGroupProximity130.getTree());

                    // AST REWRITE
                    // elements: ftsFieldGroupProximity
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 670:17: -> ^( FG_PROXIMITY ftsFieldGroupProximity )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:671:25: ^( FG_PROXIMITY ftsFieldGroupProximity )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_PROXIMITY, "FG_PROXIMITY")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupProximity.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:672:11: ftsFieldGroupTerm ( ( fuzzy )=> fuzzy )?
                    {
                    pushFollow(FOLLOW_ftsFieldGroupTerm_in_ftsFieldGroupTest4756);
                    ftsFieldGroupTerm131=ftsFieldGroupTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupTerm.add(ftsFieldGroupTerm131.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:672:29: ( ( fuzzy )=> fuzzy )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==TILDA) ) {
                        int LA54_1 = input.LA(2);

                        if ( (LA54_1==DECIMAL_INTEGER_LITERAL||LA54_1==FLOATING_POINT_LITERAL) ) {
                            int LA54_21 = input.LA(3);

                            if ( (synpred20_FTS()) ) {
                                alt54=1;
                            }
                        }
                    }
                    switch (alt54) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:672:31: ( fuzzy )=> fuzzy
                            {
                            pushFollow(FOLLOW_fuzzy_in_ftsFieldGroupTest4766);
                            fuzzy132=fuzzy();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy132.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fuzzy, ftsFieldGroupTerm
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 673:17: -> ^( FG_TERM ftsFieldGroupTerm ( fuzzy )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:674:25: ^( FG_TERM ftsFieldGroupTerm ( fuzzy )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_TERM, "FG_TERM")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupTerm.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:674:53: ( fuzzy )?
                        if ( stream_fuzzy.hasNext() ) {
                            adaptor.addChild(root_1, stream_fuzzy.nextTree());

                        }
                        stream_fuzzy.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:675:11: ftsFieldGroupExactTerm ( ( fuzzy )=> fuzzy )?
                    {
                    pushFollow(FOLLOW_ftsFieldGroupExactTerm_in_ftsFieldGroupTest4831);
                    ftsFieldGroupExactTerm133=ftsFieldGroupExactTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupExactTerm.add(ftsFieldGroupExactTerm133.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:675:34: ( ( fuzzy )=> fuzzy )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==TILDA) ) {
                        int LA55_1 = input.LA(2);

                        if ( (LA55_1==DECIMAL_INTEGER_LITERAL||LA55_1==FLOATING_POINT_LITERAL) ) {
                            int LA55_21 = input.LA(3);

                            if ( (synpred21_FTS()) ) {
                                alt55=1;
                            }
                        }
                    }
                    switch (alt55) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:675:36: ( fuzzy )=> fuzzy
                            {
                            pushFollow(FOLLOW_fuzzy_in_ftsFieldGroupTest4841);
                            fuzzy134=fuzzy();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy134.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsFieldGroupExactTerm, fuzzy
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 676:17: -> ^( FG_EXACT_TERM ftsFieldGroupExactTerm ( fuzzy )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:677:25: ^( FG_EXACT_TERM ftsFieldGroupExactTerm ( fuzzy )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_EXACT_TERM, "FG_EXACT_TERM")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupExactTerm.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:677:64: ( fuzzy )?
                        if ( stream_fuzzy.hasNext() ) {
                            adaptor.addChild(root_1, stream_fuzzy.nextTree());

                        }
                        stream_fuzzy.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:678:11: ftsFieldGroupPhrase ( ( slop )=> slop )?
                    {
                    pushFollow(FOLLOW_ftsFieldGroupPhrase_in_ftsFieldGroupTest4906);
                    ftsFieldGroupPhrase135=ftsFieldGroupPhrase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupPhrase.add(ftsFieldGroupPhrase135.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:678:31: ( ( slop )=> slop )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==TILDA) ) {
                        int LA56_1 = input.LA(2);

                        if ( (LA56_1==DECIMAL_INTEGER_LITERAL) ) {
                            int LA56_21 = input.LA(3);

                            if ( (synpred22_FTS()) ) {
                                alt56=1;
                            }
                        }
                    }
                    switch (alt56) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:678:33: ( slop )=> slop
                            {
                            pushFollow(FOLLOW_slop_in_ftsFieldGroupTest4916);
                            slop136=slop();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_slop.add(slop136.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: slop, ftsFieldGroupPhrase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 679:17: -> ^( FG_PHRASE ftsFieldGroupPhrase ( slop )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:680:25: ^( FG_PHRASE ftsFieldGroupPhrase ( slop )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_PHRASE, "FG_PHRASE")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupPhrase.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:680:57: ( slop )?
                        if ( stream_slop.hasNext() ) {
                            adaptor.addChild(root_1, stream_slop.nextTree());

                        }
                        stream_slop.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:681:11: ftsFieldGroupExactPhrase ( ( slop )=> slop )?
                    {
                    pushFollow(FOLLOW_ftsFieldGroupExactPhrase_in_ftsFieldGroupTest4981);
                    ftsFieldGroupExactPhrase137=ftsFieldGroupExactPhrase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupExactPhrase.add(ftsFieldGroupExactPhrase137.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:681:36: ( ( slop )=> slop )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==TILDA) ) {
                        int LA57_1 = input.LA(2);

                        if ( (LA57_1==DECIMAL_INTEGER_LITERAL) ) {
                            int LA57_21 = input.LA(3);

                            if ( (synpred23_FTS()) ) {
                                alt57=1;
                            }
                        }
                    }
                    switch (alt57) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:681:38: ( slop )=> slop
                            {
                            pushFollow(FOLLOW_slop_in_ftsFieldGroupTest4991);
                            slop138=slop();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_slop.add(slop138.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsFieldGroupExactPhrase, slop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 682:17: -> ^( FG_EXACT_PHRASE ftsFieldGroupExactPhrase ( slop )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:683:25: ^( FG_EXACT_PHRASE ftsFieldGroupExactPhrase ( slop )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_EXACT_PHRASE, "FG_EXACT_PHRASE")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupExactPhrase.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:683:68: ( slop )?
                        if ( stream_slop.hasNext() ) {
                            adaptor.addChild(root_1, stream_slop.nextTree());

                        }
                        stream_slop.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:684:11: ftsFieldGroupTokenisedPhrase ( ( slop )=> slop )?
                    {
                    pushFollow(FOLLOW_ftsFieldGroupTokenisedPhrase_in_ftsFieldGroupTest5056);
                    ftsFieldGroupTokenisedPhrase139=ftsFieldGroupTokenisedPhrase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupTokenisedPhrase.add(ftsFieldGroupTokenisedPhrase139.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:684:40: ( ( slop )=> slop )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==TILDA) ) {
                        int LA58_1 = input.LA(2);

                        if ( (LA58_1==DECIMAL_INTEGER_LITERAL) ) {
                            int LA58_21 = input.LA(3);

                            if ( (synpred24_FTS()) ) {
                                alt58=1;
                            }
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:684:42: ( slop )=> slop
                            {
                            pushFollow(FOLLOW_slop_in_ftsFieldGroupTest5066);
                            slop140=slop();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_slop.add(slop140.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: slop, ftsFieldGroupTokenisedPhrase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 685:17: -> ^( FG_PHRASE ftsFieldGroupTokenisedPhrase ( slop )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:686:25: ^( FG_PHRASE ftsFieldGroupTokenisedPhrase ( slop )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_PHRASE, "FG_PHRASE")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupTokenisedPhrase.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:686:66: ( slop )?
                        if ( stream_slop.hasNext() ) {
                            adaptor.addChild(root_1, stream_slop.nextTree());

                        }
                        stream_slop.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:687:11: ftsFieldGroupSynonym ( ( fuzzy )=> fuzzy )?
                    {
                    pushFollow(FOLLOW_ftsFieldGroupSynonym_in_ftsFieldGroupTest5131);
                    ftsFieldGroupSynonym141=ftsFieldGroupSynonym();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupSynonym.add(ftsFieldGroupSynonym141.getTree());

                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:687:32: ( ( fuzzy )=> fuzzy )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==TILDA) ) {
                        int LA59_1 = input.LA(2);

                        if ( (LA59_1==DECIMAL_INTEGER_LITERAL||LA59_1==FLOATING_POINT_LITERAL) ) {
                            int LA59_21 = input.LA(3);

                            if ( (synpred25_FTS()) ) {
                                alt59=1;
                            }
                        }
                    }
                    switch (alt59) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:687:34: ( fuzzy )=> fuzzy
                            {
                            pushFollow(FOLLOW_fuzzy_in_ftsFieldGroupTest5141);
                            fuzzy142=fuzzy();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fuzzy.add(fuzzy142.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ftsFieldGroupSynonym, fuzzy
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 688:17: -> ^( FG_SYNONYM ftsFieldGroupSynonym ( fuzzy )? )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:689:25: ^( FG_SYNONYM ftsFieldGroupSynonym ( fuzzy )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_SYNONYM, "FG_SYNONYM")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupSynonym.nextTree());

                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:689:59: ( fuzzy )?
                        if ( stream_fuzzy.hasNext() ) {
                            adaptor.addChild(root_1, stream_fuzzy.nextTree());

                        }
                        stream_fuzzy.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:690:11: ftsFieldGroupRange
                    {
                    pushFollow(FOLLOW_ftsFieldGroupRange_in_ftsFieldGroupTest5206);
                    ftsFieldGroupRange143=ftsFieldGroupRange();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupRange.add(ftsFieldGroupRange143.getTree());

                    // AST REWRITE
                    // elements: ftsFieldGroupRange
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 691:17: -> ^( FG_RANGE ftsFieldGroupRange )
                    {
                        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:692:25: ^( FG_RANGE ftsFieldGroupRange )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FG_RANGE, "FG_RANGE")
                        , root_1);

                        adaptor.addChild(root_1, stream_ftsFieldGroupRange.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:693:11: LPAREN ftsFieldGroupDisjunction RPAREN
                    {
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ftsFieldGroupTest5266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN144);


                    pushFollow(FOLLOW_ftsFieldGroupDisjunction_in_ftsFieldGroupTest5268);
                    ftsFieldGroupDisjunction145=ftsFieldGroupDisjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsFieldGroupDisjunction.add(ftsFieldGroupDisjunction145.getTree());

                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ftsFieldGroupTest5270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN146);


                    // AST REWRITE
                    // elements: ftsFieldGroupDisjunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 694:17: -> ftsFieldGroupDisjunction
                    {
                        adaptor.addChild(root_0, stream_ftsFieldGroupDisjunction.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupTest"


    public static class ftsFieldGroupTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupTerm"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:697:1: ftsFieldGroupTerm : ftsWord ;
    public final FTSParser.ftsFieldGroupTerm_return ftsFieldGroupTerm() throws RecognitionException {
        FTSParser.ftsFieldGroupTerm_return retval = new FTSParser.ftsFieldGroupTerm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsWord_return ftsWord147 =null;



        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:698:9: ( ftsWord )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:699:9: ftsWord
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ftsWord_in_ftsFieldGroupTerm5323);
            ftsWord147=ftsWord();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWord147.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupTerm"


    public static class ftsFieldGroupExactTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupExactTerm"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:702:1: ftsFieldGroupExactTerm : EQUALS ftsFieldGroupTerm -> ftsFieldGroupTerm ;
    public final FTSParser.ftsFieldGroupExactTerm_return ftsFieldGroupExactTerm() throws RecognitionException {
        FTSParser.ftsFieldGroupExactTerm_return retval = new FTSParser.ftsFieldGroupExactTerm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS148=null;
        FTSParser.ftsFieldGroupTerm_return ftsFieldGroupTerm149 =null;


        Object EQUALS148_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_ftsFieldGroupTerm=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupTerm");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:703:9: ( EQUALS ftsFieldGroupTerm -> ftsFieldGroupTerm )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:704:9: EQUALS ftsFieldGroupTerm
            {
            EQUALS148=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_ftsFieldGroupExactTerm5356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS148);


            pushFollow(FOLLOW_ftsFieldGroupTerm_in_ftsFieldGroupExactTerm5358);
            ftsFieldGroupTerm149=ftsFieldGroupTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupTerm.add(ftsFieldGroupTerm149.getTree());

            // AST REWRITE
            // elements: ftsFieldGroupTerm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 705:17: -> ftsFieldGroupTerm
            {
                adaptor.addChild(root_0, stream_ftsFieldGroupTerm.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupExactTerm"


    public static class ftsFieldGroupPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupPhrase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:708:1: ftsFieldGroupPhrase : FTSPHRASE ;
    public final FTSParser.ftsFieldGroupPhrase_return ftsFieldGroupPhrase() throws RecognitionException {
        FTSParser.ftsFieldGroupPhrase_return retval = new FTSParser.ftsFieldGroupPhrase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FTSPHRASE150=null;

        Object FTSPHRASE150_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:709:9: ( FTSPHRASE )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:710:9: FTSPHRASE
            {
            root_0 = (Object)adaptor.nil();


            FTSPHRASE150=(Token)match(input,FTSPHRASE,FOLLOW_FTSPHRASE_in_ftsFieldGroupPhrase5411); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FTSPHRASE150_tree = 
            (Object)adaptor.create(FTSPHRASE150)
            ;
            adaptor.addChild(root_0, FTSPHRASE150_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupPhrase"


    public static class ftsFieldGroupExactPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupExactPhrase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:713:1: ftsFieldGroupExactPhrase : EQUALS ftsFieldGroupExactPhrase -> ftsFieldGroupExactPhrase ;
    public final FTSParser.ftsFieldGroupExactPhrase_return ftsFieldGroupExactPhrase() throws RecognitionException {
        FTSParser.ftsFieldGroupExactPhrase_return retval = new FTSParser.ftsFieldGroupExactPhrase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS151=null;
        FTSParser.ftsFieldGroupExactPhrase_return ftsFieldGroupExactPhrase152 =null;


        Object EQUALS151_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_ftsFieldGroupExactPhrase=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupExactPhrase");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:714:9: ( EQUALS ftsFieldGroupExactPhrase -> ftsFieldGroupExactPhrase )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:715:9: EQUALS ftsFieldGroupExactPhrase
            {
            EQUALS151=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_ftsFieldGroupExactPhrase5452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS151);


            pushFollow(FOLLOW_ftsFieldGroupExactPhrase_in_ftsFieldGroupExactPhrase5454);
            ftsFieldGroupExactPhrase152=ftsFieldGroupExactPhrase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupExactPhrase.add(ftsFieldGroupExactPhrase152.getTree());

            // AST REWRITE
            // elements: ftsFieldGroupExactPhrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 716:17: -> ftsFieldGroupExactPhrase
            {
                adaptor.addChild(root_0, stream_ftsFieldGroupExactPhrase.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupExactPhrase"


    public static class ftsFieldGroupTokenisedPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupTokenisedPhrase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:719:1: ftsFieldGroupTokenisedPhrase : TILDA ftsFieldGroupExactPhrase -> ftsFieldGroupExactPhrase ;
    public final FTSParser.ftsFieldGroupTokenisedPhrase_return ftsFieldGroupTokenisedPhrase() throws RecognitionException {
        FTSParser.ftsFieldGroupTokenisedPhrase_return retval = new FTSParser.ftsFieldGroupTokenisedPhrase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TILDA153=null;
        FTSParser.ftsFieldGroupExactPhrase_return ftsFieldGroupExactPhrase154 =null;


        Object TILDA153_tree=null;
        RewriteRuleTokenStream stream_TILDA=new RewriteRuleTokenStream(adaptor,"token TILDA");
        RewriteRuleSubtreeStream stream_ftsFieldGroupExactPhrase=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupExactPhrase");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:720:9: ( TILDA ftsFieldGroupExactPhrase -> ftsFieldGroupExactPhrase )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:721:9: TILDA ftsFieldGroupExactPhrase
            {
            TILDA153=(Token)match(input,TILDA,FOLLOW_TILDA_in_ftsFieldGroupTokenisedPhrase5515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TILDA.add(TILDA153);


            pushFollow(FOLLOW_ftsFieldGroupExactPhrase_in_ftsFieldGroupTokenisedPhrase5517);
            ftsFieldGroupExactPhrase154=ftsFieldGroupExactPhrase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupExactPhrase.add(ftsFieldGroupExactPhrase154.getTree());

            // AST REWRITE
            // elements: ftsFieldGroupExactPhrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 722:17: -> ftsFieldGroupExactPhrase
            {
                adaptor.addChild(root_0, stream_ftsFieldGroupExactPhrase.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupTokenisedPhrase"


    public static class ftsFieldGroupSynonym_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupSynonym"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:725:1: ftsFieldGroupSynonym : TILDA ftsFieldGroupTerm -> ftsFieldGroupTerm ;
    public final FTSParser.ftsFieldGroupSynonym_return ftsFieldGroupSynonym() throws RecognitionException {
        FTSParser.ftsFieldGroupSynonym_return retval = new FTSParser.ftsFieldGroupSynonym_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TILDA155=null;
        FTSParser.ftsFieldGroupTerm_return ftsFieldGroupTerm156 =null;


        Object TILDA155_tree=null;
        RewriteRuleTokenStream stream_TILDA=new RewriteRuleTokenStream(adaptor,"token TILDA");
        RewriteRuleSubtreeStream stream_ftsFieldGroupTerm=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupTerm");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:726:9: ( TILDA ftsFieldGroupTerm -> ftsFieldGroupTerm )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:727:9: TILDA ftsFieldGroupTerm
            {
            TILDA155=(Token)match(input,TILDA,FOLLOW_TILDA_in_ftsFieldGroupSynonym5570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TILDA.add(TILDA155);


            pushFollow(FOLLOW_ftsFieldGroupTerm_in_ftsFieldGroupSynonym5572);
            ftsFieldGroupTerm156=ftsFieldGroupTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupTerm.add(ftsFieldGroupTerm156.getTree());

            // AST REWRITE
            // elements: ftsFieldGroupTerm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 728:17: -> ftsFieldGroupTerm
            {
                adaptor.addChild(root_0, stream_ftsFieldGroupTerm.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupSynonym"


    public static class ftsFieldGroupProximity_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupProximity"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:731:1: ftsFieldGroupProximity : ftsFieldGroupProximityTerm ( ( proximityGroup )=> proximityGroup ftsFieldGroupProximityTerm )+ -> ftsFieldGroupProximityTerm ( proximityGroup ftsFieldGroupProximityTerm )+ ;
    public final FTSParser.ftsFieldGroupProximity_return ftsFieldGroupProximity() throws RecognitionException {
        FTSParser.ftsFieldGroupProximity_return retval = new FTSParser.ftsFieldGroupProximity_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FTSParser.ftsFieldGroupProximityTerm_return ftsFieldGroupProximityTerm157 =null;

        FTSParser.proximityGroup_return proximityGroup158 =null;

        FTSParser.ftsFieldGroupProximityTerm_return ftsFieldGroupProximityTerm159 =null;


        RewriteRuleSubtreeStream stream_proximityGroup=new RewriteRuleSubtreeStream(adaptor,"rule proximityGroup");
        RewriteRuleSubtreeStream stream_ftsFieldGroupProximityTerm=new RewriteRuleSubtreeStream(adaptor,"rule ftsFieldGroupProximityTerm");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:732:9: ( ftsFieldGroupProximityTerm ( ( proximityGroup )=> proximityGroup ftsFieldGroupProximityTerm )+ -> ftsFieldGroupProximityTerm ( proximityGroup ftsFieldGroupProximityTerm )+ )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:733:9: ftsFieldGroupProximityTerm ( ( proximityGroup )=> proximityGroup ftsFieldGroupProximityTerm )+
            {
            pushFollow(FOLLOW_ftsFieldGroupProximityTerm_in_ftsFieldGroupProximity5625);
            ftsFieldGroupProximityTerm157=ftsFieldGroupProximityTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ftsFieldGroupProximityTerm.add(ftsFieldGroupProximityTerm157.getTree());

            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:733:36: ( ( proximityGroup )=> proximityGroup ftsFieldGroupProximityTerm )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                alt61 = dfa61.predict(input);
                switch (alt61) {
            	case 1 :
            	    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:733:38: ( proximityGroup )=> proximityGroup ftsFieldGroupProximityTerm
            	    {
            	    pushFollow(FOLLOW_proximityGroup_in_ftsFieldGroupProximity5635);
            	    proximityGroup158=proximityGroup();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_proximityGroup.add(proximityGroup158.getTree());

            	    pushFollow(FOLLOW_ftsFieldGroupProximityTerm_in_ftsFieldGroupProximity5637);
            	    ftsFieldGroupProximityTerm159=ftsFieldGroupProximityTerm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ftsFieldGroupProximityTerm.add(ftsFieldGroupProximityTerm159.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);


            // AST REWRITE
            // elements: ftsFieldGroupProximityTerm, ftsFieldGroupProximityTerm, proximityGroup
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 734:17: -> ftsFieldGroupProximityTerm ( proximityGroup ftsFieldGroupProximityTerm )+
            {
                adaptor.addChild(root_0, stream_ftsFieldGroupProximityTerm.nextTree());

                if ( !(stream_ftsFieldGroupProximityTerm.hasNext()||stream_proximityGroup.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ftsFieldGroupProximityTerm.hasNext()||stream_proximityGroup.hasNext() ) {
                    adaptor.addChild(root_0, stream_proximityGroup.nextTree());

                    adaptor.addChild(root_0, stream_ftsFieldGroupProximityTerm.nextTree());

                }
                stream_ftsFieldGroupProximityTerm.reset();
                stream_proximityGroup.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupProximity"


    public static class ftsFieldGroupProximityTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupProximityTerm"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:737:1: ftsFieldGroupProximityTerm : ( ID | FTSWORD | FTSPRE | FTSWILD | NOT | TO | DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL );
    public final FTSParser.ftsFieldGroupProximityTerm_return ftsFieldGroupProximityTerm() throws RecognitionException {
        FTSParser.ftsFieldGroupProximityTerm_return retval = new FTSParser.ftsFieldGroupProximityTerm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set160=null;

        Object set160_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:738:9: ( ID | FTSWORD | FTSPRE | FTSWILD | NOT | TO | DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:
            {
            root_0 = (Object)adaptor.nil();


            set160=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_INTEGER_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL||(input.LA(1) >= FTSPRE && input.LA(1) <= FTSWORD)||input.LA(1)==ID||input.LA(1)==NOT||input.LA(1)==TO ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set160)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupProximityTerm"


    public static class proximityGroup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "proximityGroup"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:749:1: proximityGroup : STAR ( LPAREN ( DECIMAL_INTEGER_LITERAL )? RPAREN )? -> ^( PROXIMITY ( DECIMAL_INTEGER_LITERAL )? ) ;
    public final FTSParser.proximityGroup_return proximityGroup() throws RecognitionException {
        FTSParser.proximityGroup_return retval = new FTSParser.proximityGroup_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR161=null;
        Token LPAREN162=null;
        Token DECIMAL_INTEGER_LITERAL163=null;
        Token RPAREN164=null;

        Object STAR161_tree=null;
        Object LPAREN162_tree=null;
        Object DECIMAL_INTEGER_LITERAL163_tree=null;
        Object RPAREN164_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DECIMAL_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL_INTEGER_LITERAL");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:750:9: ( STAR ( LPAREN ( DECIMAL_INTEGER_LITERAL )? RPAREN )? -> ^( PROXIMITY ( DECIMAL_INTEGER_LITERAL )? ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:751:9: STAR ( LPAREN ( DECIMAL_INTEGER_LITERAL )? RPAREN )?
            {
            STAR161=(Token)match(input,STAR,FOLLOW_STAR_in_proximityGroup5818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STAR.add(STAR161);


            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:751:14: ( LPAREN ( DECIMAL_INTEGER_LITERAL )? RPAREN )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LPAREN) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:751:15: LPAREN ( DECIMAL_INTEGER_LITERAL )? RPAREN
                    {
                    LPAREN162=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_proximityGroup5821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN162);


                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:751:22: ( DECIMAL_INTEGER_LITERAL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==DECIMAL_INTEGER_LITERAL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:751:22: DECIMAL_INTEGER_LITERAL
                            {
                            DECIMAL_INTEGER_LITERAL163=(Token)match(input,DECIMAL_INTEGER_LITERAL,FOLLOW_DECIMAL_INTEGER_LITERAL_in_proximityGroup5823); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DECIMAL_INTEGER_LITERAL.add(DECIMAL_INTEGER_LITERAL163);


                            }
                            break;

                    }


                    RPAREN164=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_proximityGroup5826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN164);


                    }
                    break;

            }


            // AST REWRITE
            // elements: DECIMAL_INTEGER_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 752:17: -> ^( PROXIMITY ( DECIMAL_INTEGER_LITERAL )? )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:753:25: ^( PROXIMITY ( DECIMAL_INTEGER_LITERAL )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROXIMITY, "PROXIMITY")
                , root_1);

                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:753:37: ( DECIMAL_INTEGER_LITERAL )?
                if ( stream_DECIMAL_INTEGER_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DECIMAL_INTEGER_LITERAL.nextNode()
                    );

                }
                stream_DECIMAL_INTEGER_LITERAL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "proximityGroup"


    public static class ftsFieldGroupRange_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsFieldGroupRange"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:756:1: ftsFieldGroupRange : ( ftsRangeWord DOTDOT ftsRangeWord -> INCLUSIVE ftsRangeWord ftsRangeWord INCLUSIVE | range_left ftsRangeWord TO ftsRangeWord range_right -> range_left ftsRangeWord ftsRangeWord range_right );
    public final FTSParser.ftsFieldGroupRange_return ftsFieldGroupRange() throws RecognitionException {
        FTSParser.ftsFieldGroupRange_return retval = new FTSParser.ftsFieldGroupRange_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOTDOT166=null;
        Token TO170=null;
        FTSParser.ftsRangeWord_return ftsRangeWord165 =null;

        FTSParser.ftsRangeWord_return ftsRangeWord167 =null;

        FTSParser.range_left_return range_left168 =null;

        FTSParser.ftsRangeWord_return ftsRangeWord169 =null;

        FTSParser.ftsRangeWord_return ftsRangeWord171 =null;

        FTSParser.range_right_return range_right172 =null;


        Object DOTDOT166_tree=null;
        Object TO170_tree=null;
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleSubtreeStream stream_range_left=new RewriteRuleSubtreeStream(adaptor,"rule range_left");
        RewriteRuleSubtreeStream stream_range_right=new RewriteRuleSubtreeStream(adaptor,"rule range_right");
        RewriteRuleSubtreeStream stream_ftsRangeWord=new RewriteRuleSubtreeStream(adaptor,"rule ftsRangeWord");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:757:9: ( ftsRangeWord DOTDOT ftsRangeWord -> INCLUSIVE ftsRangeWord ftsRangeWord INCLUSIVE | range_left ftsRangeWord TO ftsRangeWord range_right -> range_left ftsRangeWord ftsRangeWord range_right )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DECIMAL_INTEGER_LITERAL||LA64_0==FLOATING_POINT_LITERAL||(LA64_0 >= FTSPHRASE && LA64_0 <= FTSWORD)||LA64_0==ID) ) {
                alt64=1;
            }
            else if ( ((LA64_0 >= LSQUARE && LA64_0 <= LT)) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:758:9: ftsRangeWord DOTDOT ftsRangeWord
                    {
                    pushFollow(FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5910);
                    ftsRangeWord165=ftsRangeWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsRangeWord.add(ftsRangeWord165.getTree());

                    DOTDOT166=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_ftsFieldGroupRange5912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT166);


                    pushFollow(FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5914);
                    ftsRangeWord167=ftsRangeWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsRangeWord.add(ftsRangeWord167.getTree());

                    // AST REWRITE
                    // elements: ftsRangeWord, ftsRangeWord
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 759:17: -> INCLUSIVE ftsRangeWord ftsRangeWord INCLUSIVE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INCLUSIVE, "INCLUSIVE")
                        );

                        adaptor.addChild(root_0, stream_ftsRangeWord.nextTree());

                        adaptor.addChild(root_0, stream_ftsRangeWord.nextTree());

                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INCLUSIVE, "INCLUSIVE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:760:11: range_left ftsRangeWord TO ftsRangeWord range_right
                    {
                    pushFollow(FOLLOW_range_left_in_ftsFieldGroupRange5952);
                    range_left168=range_left();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range_left.add(range_left168.getTree());

                    pushFollow(FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5954);
                    ftsRangeWord169=ftsRangeWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsRangeWord.add(ftsRangeWord169.getTree());

                    TO170=(Token)match(input,TO,FOLLOW_TO_in_ftsFieldGroupRange5956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TO.add(TO170);


                    pushFollow(FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5958);
                    ftsRangeWord171=ftsRangeWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ftsRangeWord.add(ftsRangeWord171.getTree());

                    pushFollow(FOLLOW_range_right_in_ftsFieldGroupRange5960);
                    range_right172=range_right();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range_right.add(range_right172.getTree());

                    // AST REWRITE
                    // elements: range_right, range_left, ftsRangeWord, ftsRangeWord
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 761:17: -> range_left ftsRangeWord ftsRangeWord range_right
                    {
                        adaptor.addChild(root_0, stream_range_left.nextTree());

                        adaptor.addChild(root_0, stream_ftsRangeWord.nextTree());

                        adaptor.addChild(root_0, stream_ftsRangeWord.nextTree());

                        adaptor.addChild(root_0, stream_range_right.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsFieldGroupRange"


    public static class range_left_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "range_left"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:764:1: range_left : ( LSQUARE -> INCLUSIVE | LT -> EXCLUSIVE );
    public final FTSParser.range_left_return range_left() throws RecognitionException {
        FTSParser.range_left_return retval = new FTSParser.range_left_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LSQUARE173=null;
        Token LT174=null;

        Object LSQUARE173_tree=null;
        Object LT174_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:765:9: ( LSQUARE -> INCLUSIVE | LT -> EXCLUSIVE )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LSQUARE) ) {
                alt65=1;
            }
            else if ( (LA65_0==LT) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:766:9: LSQUARE
                    {
                    LSQUARE173=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_range_left6019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE173);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 767:17: -> INCLUSIVE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INCLUSIVE, "INCLUSIVE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:768:11: LT
                    {
                    LT174=(Token)match(input,LT,FOLLOW_LT_in_range_left6051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT174);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 769:17: -> EXCLUSIVE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EXCLUSIVE, "EXCLUSIVE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "range_left"


    public static class range_right_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "range_right"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:772:1: range_right : ( RSQUARE -> INCLUSIVE | GT -> EXCLUSIVE );
    public final FTSParser.range_right_return range_right() throws RecognitionException {
        FTSParser.range_right_return retval = new FTSParser.range_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RSQUARE175=null;
        Token GT176=null;

        Object RSQUARE175_tree=null;
        Object GT176_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:773:9: ( RSQUARE -> INCLUSIVE | GT -> EXCLUSIVE )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RSQUARE) ) {
                alt66=1;
            }
            else if ( (LA66_0==GT) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:774:9: RSQUARE
                    {
                    RSQUARE175=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_range_right6104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE175);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 775:17: -> INCLUSIVE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INCLUSIVE, "INCLUSIVE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:776:11: GT
                    {
                    GT176=(Token)match(input,GT,FOLLOW_GT_in_range_right6136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(GT176);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 777:17: -> EXCLUSIVE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EXCLUSIVE, "EXCLUSIVE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "range_right"


    public static class fieldReference_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldReference"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:782:1: fieldReference : ( AT )? ( ( prefix )=> prefix | uri )? identifier -> ^( FIELD_REF identifier ( prefix )? ( uri )? ) ;
    public final FTSParser.fieldReference_return fieldReference() throws RecognitionException {
        FTSParser.fieldReference_return retval = new FTSParser.fieldReference_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AT177=null;
        FTSParser.prefix_return prefix178 =null;

        FTSParser.uri_return uri179 =null;

        FTSParser.identifier_return identifier180 =null;


        Object AT177_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_uri=new RewriteRuleSubtreeStream(adaptor,"rule uri");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:783:9: ( ( AT )? ( ( prefix )=> prefix | uri )? identifier -> ^( FIELD_REF identifier ( prefix )? ( uri )? ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:784:9: ( AT )? ( ( prefix )=> prefix | uri )? identifier
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:784:9: ( AT )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==AT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:784:9: AT
                    {
                    AT177=(Token)match(input,AT,FOLLOW_AT_in_fieldReference6192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT177);


                    }
                    break;

            }


            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:785:9: ( ( prefix )=> prefix | uri )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ID) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==DOT) ) {
                    int LA68_3 = input.LA(3);

                    if ( (LA68_3==ID) ) {
                        int LA68_5 = input.LA(4);

                        if ( (LA68_5==COLON) ) {
                            int LA68_4 = input.LA(5);

                            if ( (LA68_4==ID) ) {
                                int LA68_7 = input.LA(6);

                                if ( (LA68_7==DOT) ) {
                                    int LA68_15 = input.LA(7);

                                    if ( (LA68_15==ID) ) {
                                        int LA68_43 = input.LA(8);

                                        if ( (synpred27_FTS()) ) {
                                            alt68=1;
                                        }
                                    }
                                }
                                else if ( (LA68_7==COLON) && (synpred27_FTS())) {
                                    alt68=1;
                                }
                            }
                        }
                    }
                }
                else if ( (LA68_1==COLON) ) {
                    int LA68_4 = input.LA(3);

                    if ( (LA68_4==ID) ) {
                        int LA68_7 = input.LA(4);

                        if ( (LA68_7==DOT) ) {
                            int LA68_15 = input.LA(5);

                            if ( (LA68_15==ID) ) {
                                int LA68_43 = input.LA(6);

                                if ( (synpred27_FTS()) ) {
                                    alt68=1;
                                }
                            }
                        }
                        else if ( (LA68_7==COLON) && (synpred27_FTS())) {
                            alt68=1;
                        }
                    }
                }
            }
            else if ( (LA68_0==URI) ) {
                alt68=2;
            }
            switch (alt68) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:786:19: ( prefix )=> prefix
                    {
                    pushFollow(FOLLOW_prefix_in_fieldReference6229);
                    prefix178=prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix.add(prefix178.getTree());

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:787:19: uri
                    {
                    pushFollow(FOLLOW_uri_in_fieldReference6249);
                    uri179=uri();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_uri.add(uri179.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_fieldReference6270);
            identifier180=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier180.getTree());

            // AST REWRITE
            // elements: prefix, identifier, uri
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 790:17: -> ^( FIELD_REF identifier ( prefix )? ( uri )? )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:791:25: ^( FIELD_REF identifier ( prefix )? ( uri )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_REF, "FIELD_REF")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:791:48: ( prefix )?
                if ( stream_prefix.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefix.nextTree());

                }
                stream_prefix.reset();

                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:791:56: ( uri )?
                if ( stream_uri.hasNext() ) {
                    adaptor.addChild(root_1, stream_uri.nextTree());

                }
                stream_uri.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldReference"


    public static class tempReference_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tempReference"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:794:1: tempReference : ( AT )? ( prefix | uri )? identifier -> ^( FIELD_REF identifier ( prefix )? ( uri )? ) ;
    public final FTSParser.tempReference_return tempReference() throws RecognitionException {
        FTSParser.tempReference_return retval = new FTSParser.tempReference_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AT181=null;
        FTSParser.prefix_return prefix182 =null;

        FTSParser.uri_return uri183 =null;

        FTSParser.identifier_return identifier184 =null;


        Object AT181_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_uri=new RewriteRuleSubtreeStream(adaptor,"rule uri");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:795:9: ( ( AT )? ( prefix | uri )? identifier -> ^( FIELD_REF identifier ( prefix )? ( uri )? ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:796:9: ( AT )? ( prefix | uri )? identifier
            {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:796:9: ( AT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==AT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:796:9: AT
                    {
                    AT181=(Token)match(input,AT,FOLLOW_AT_in_tempReference6357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT181);


                    }
                    break;

            }


            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:797:9: ( prefix | uri )?
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ID) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==DOT) ) {
                    int LA70_3 = input.LA(3);

                    if ( (LA70_3==ID) ) {
                        int LA70_30 = input.LA(4);

                        if ( (LA70_30==COLON) ) {
                            alt70=1;
                        }
                    }
                }
                else if ( (LA70_1==COLON) ) {
                    alt70=1;
                }
            }
            else if ( (LA70_0==URI) ) {
                alt70=2;
            }
            switch (alt70) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:798:17: prefix
                    {
                    pushFollow(FOLLOW_prefix_in_tempReference6386);
                    prefix182=prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix.add(prefix182.getTree());

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:799:19: uri
                    {
                    pushFollow(FOLLOW_uri_in_tempReference6406);
                    uri183=uri();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_uri.add(uri183.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_tempReference6427);
            identifier184=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier184.getTree());

            // AST REWRITE
            // elements: identifier, uri, prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 802:17: -> ^( FIELD_REF identifier ( prefix )? ( uri )? )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:803:25: ^( FIELD_REF identifier ( prefix )? ( uri )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_REF, "FIELD_REF")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:803:48: ( prefix )?
                if ( stream_prefix.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefix.nextTree());

                }
                stream_prefix.reset();

                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:803:56: ( uri )?
                if ( stream_uri.hasNext() ) {
                    adaptor.addChild(root_1, stream_uri.nextTree());

                }
                stream_uri.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tempReference"


    public static class prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefix"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:806:1: prefix : identifier COLON -> ^( PREFIX identifier ) ;
    public final FTSParser.prefix_return prefix() throws RecognitionException {
        FTSParser.prefix_return retval = new FTSParser.prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON186=null;
        FTSParser.identifier_return identifier185 =null;


        Object COLON186_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:807:9: ( identifier COLON -> ^( PREFIX identifier ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:808:9: identifier COLON
            {
            pushFollow(FOLLOW_identifier_in_prefix6514);
            identifier185=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier185.getTree());

            COLON186=(Token)match(input,COLON,FOLLOW_COLON_in_prefix6516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON186);


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 809:17: -> ^( PREFIX identifier )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:810:25: ^( PREFIX identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PREFIX, "PREFIX")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefix"


    public static class uri_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uri"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:813:1: uri : URI -> ^( NAME_SPACE URI ) ;
    public final FTSParser.uri_return uri() throws RecognitionException {
        FTSParser.uri_return retval = new FTSParser.uri_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token URI187=null;

        Object URI187_tree=null;
        RewriteRuleTokenStream stream_URI=new RewriteRuleTokenStream(adaptor,"token URI");

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:814:9: ( URI -> ^( NAME_SPACE URI ) )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:815:9: URI
            {
            URI187=(Token)match(input,URI,FOLLOW_URI_in_uri6597); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_URI.add(URI187);


            // AST REWRITE
            // elements: URI
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 816:17: -> ^( NAME_SPACE URI )
            {
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:817:25: ^( NAME_SPACE URI )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME_SPACE, "NAME_SPACE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_URI.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uri"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:820:1: identifier : ( ( ID DOT ID )=>id1= ID DOT id2= ID ->| ID -> ID );
    public final FTSParser.identifier_return identifier() throws RecognitionException {
        FTSParser.identifier_return retval = new FTSParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id1=null;
        Token id2=null;
        Token DOT188=null;
        Token ID189=null;

        Object id1_tree=null;
        Object id2_tree=null;
        Object DOT188_tree=null;
        Object ID189_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:821:9: ( ( ID DOT ID )=>id1= ID DOT id2= ID ->| ID -> ID )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID) ) {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    int LA71_2 = input.LA(3);

                    if ( (LA71_2==ID) ) {
                        int LA71_29 = input.LA(4);

                        if ( (synpred28_FTS()) ) {
                            alt71=1;
                        }
                        else if ( (true) ) {
                            alt71=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 71, 29, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA71_2==DECIMAL_INTEGER_LITERAL||LA71_2==FLOATING_POINT_LITERAL||(LA71_2 >= FTSPRE && LA71_2 <= FTSWORD)||LA71_2==NOT||LA71_2==QUESTION_MARK||LA71_2==STAR||LA71_2==TO) ) {
                        alt71=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case COLON:
                    {
                    alt71=2;
                    }
                    break;
                case CARAT:
                    {
                    alt71=2;
                    }
                    break;
                case AND:
                    {
                    alt71=2;
                    }
                    break;
                case AMP:
                    {
                    alt71=2;
                    }
                    break;
                case EOF:
                    {
                    alt71=2;
                    }
                    break;
                case RPAREN:
                    {
                    alt71=2;
                    }
                    break;
                case OR:
                    {
                    alt71=2;
                    }
                    break;
                case BAR:
                    {
                    alt71=2;
                    }
                    break;
                case NOT:
                    {
                    alt71=2;
                    }
                    break;
                case EXCLAMATION:
                    {
                    alt71=2;
                    }
                    break;
                case ID:
                    {
                    alt71=2;
                    }
                    break;
                case AT:
                    {
                    alt71=2;
                    }
                    break;
                case DECIMAL_INTEGER_LITERAL:
                case FLOATING_POINT_LITERAL:
                case FTSPRE:
                case FTSWILD:
                case FTSWORD:
                    {
                    alt71=2;
                    }
                    break;
                case URI:
                    {
                    alt71=2;
                    }
                    break;
                case FTSPHRASE:
                    {
                    alt71=2;
                    }
                    break;
                case COMMA:
                    {
                    alt71=2;
                    }
                    break;
                case QUESTION_MARK:
                case STAR:
                    {
                    alt71=2;
                    }
                    break;
                case EQUALS:
                    {
                    alt71=2;
                    }
                    break;
                case TILDA:
                    {
                    alt71=2;
                    }
                    break;
                case TO:
                    {
                    alt71=2;
                    }
                    break;
                case LSQUARE:
                    {
                    alt71=2;
                    }
                    break;
                case LT:
                    {
                    alt71=2;
                    }
                    break;
                case LPAREN:
                    {
                    alt71=2;
                    }
                    break;
                case PERCENT:
                    {
                    alt71=2;
                    }
                    break;
                case PLUS:
                    {
                    alt71=2;
                    }
                    break;
                case MINUS:
                    {
                    alt71=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:822:9: ( ID DOT ID )=>id1= ID DOT id2= ID
                    {
                    id1=(Token)match(input,ID,FOLLOW_ID_in_identifier6699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(id1);


                    DOT188=(Token)match(input,DOT,FOLLOW_DOT_in_identifier6701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT188);


                    id2=(Token)match(input,ID,FOLLOW_ID_in_identifier6705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(id2);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 824:17: ->
                    {
                        adaptor.addChild(root_0, new CommonTree(new CommonToken(FTSLexer.ID, (id1!=null?id1.getText():null)+(DOT188!=null?DOT188.getText():null)+(id2!=null?id2.getText():null))));

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:826:12: ID
                    {
                    ID189=(Token)match(input,ID,FOLLOW_ID_in_identifier6754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID189);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 827:17: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class ftsWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsWord"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:831:1: ftsWord : ( ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase DOT | COMMA ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) | ( DOT | COMMA ) ftsWordBase | ftsWordBase );
    public final FTSParser.ftsWord_return ftsWord() throws RecognitionException {
        FTSParser.ftsWord_return retval = new FTSParser.ftsWord_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set190=null;
        Token set192=null;
        Token set194=null;
        Token set196=null;
        Token set198=null;
        Token set201=null;
        Token set203=null;
        Token set205=null;
        Token set207=null;
        Token set209=null;
        Token set211=null;
        Token set213=null;
        Token set215=null;
        Token set217=null;
        Token set219=null;
        Token set221=null;
        Token set223=null;
        Token set225=null;
        Token set226=null;
        Token set228=null;
        Token set230=null;
        Token set232=null;
        Token set235=null;
        Token set237=null;
        Token set239=null;
        Token set241=null;
        Token set243=null;
        Token set245=null;
        Token set247=null;
        Token set249=null;
        Token set251=null;
        Token set253=null;
        Token set254=null;
        Token set256=null;
        Token set258=null;
        Token set261=null;
        Token set263=null;
        Token set265=null;
        Token set267=null;
        Token set269=null;
        Token set271=null;
        Token set273=null;
        Token set274=null;
        Token set276=null;
        Token set279=null;
        Token set281=null;
        Token set283=null;
        Token set285=null;
        Token set286=null;
        FTSParser.ftsWordBase_return ftsWordBase191 =null;

        FTSParser.ftsWordBase_return ftsWordBase193 =null;

        FTSParser.ftsWordBase_return ftsWordBase195 =null;

        FTSParser.ftsWordBase_return ftsWordBase197 =null;

        FTSParser.ftsWordBase_return ftsWordBase199 =null;

        FTSParser.ftsWordBase_return ftsWordBase200 =null;

        FTSParser.ftsWordBase_return ftsWordBase202 =null;

        FTSParser.ftsWordBase_return ftsWordBase204 =null;

        FTSParser.ftsWordBase_return ftsWordBase206 =null;

        FTSParser.ftsWordBase_return ftsWordBase208 =null;

        FTSParser.ftsWordBase_return ftsWordBase210 =null;

        FTSParser.ftsWordBase_return ftsWordBase212 =null;

        FTSParser.ftsWordBase_return ftsWordBase214 =null;

        FTSParser.ftsWordBase_return ftsWordBase216 =null;

        FTSParser.ftsWordBase_return ftsWordBase218 =null;

        FTSParser.ftsWordBase_return ftsWordBase220 =null;

        FTSParser.ftsWordBase_return ftsWordBase222 =null;

        FTSParser.ftsWordBase_return ftsWordBase224 =null;

        FTSParser.ftsWordBase_return ftsWordBase227 =null;

        FTSParser.ftsWordBase_return ftsWordBase229 =null;

        FTSParser.ftsWordBase_return ftsWordBase231 =null;

        FTSParser.ftsWordBase_return ftsWordBase233 =null;

        FTSParser.ftsWordBase_return ftsWordBase234 =null;

        FTSParser.ftsWordBase_return ftsWordBase236 =null;

        FTSParser.ftsWordBase_return ftsWordBase238 =null;

        FTSParser.ftsWordBase_return ftsWordBase240 =null;

        FTSParser.ftsWordBase_return ftsWordBase242 =null;

        FTSParser.ftsWordBase_return ftsWordBase244 =null;

        FTSParser.ftsWordBase_return ftsWordBase246 =null;

        FTSParser.ftsWordBase_return ftsWordBase248 =null;

        FTSParser.ftsWordBase_return ftsWordBase250 =null;

        FTSParser.ftsWordBase_return ftsWordBase252 =null;

        FTSParser.ftsWordBase_return ftsWordBase255 =null;

        FTSParser.ftsWordBase_return ftsWordBase257 =null;

        FTSParser.ftsWordBase_return ftsWordBase259 =null;

        FTSParser.ftsWordBase_return ftsWordBase260 =null;

        FTSParser.ftsWordBase_return ftsWordBase262 =null;

        FTSParser.ftsWordBase_return ftsWordBase264 =null;

        FTSParser.ftsWordBase_return ftsWordBase266 =null;

        FTSParser.ftsWordBase_return ftsWordBase268 =null;

        FTSParser.ftsWordBase_return ftsWordBase270 =null;

        FTSParser.ftsWordBase_return ftsWordBase272 =null;

        FTSParser.ftsWordBase_return ftsWordBase275 =null;

        FTSParser.ftsWordBase_return ftsWordBase277 =null;

        FTSParser.ftsWordBase_return ftsWordBase278 =null;

        FTSParser.ftsWordBase_return ftsWordBase280 =null;

        FTSParser.ftsWordBase_return ftsWordBase282 =null;

        FTSParser.ftsWordBase_return ftsWordBase284 =null;

        FTSParser.ftsWordBase_return ftsWordBase287 =null;

        FTSParser.ftsWordBase_return ftsWordBase288 =null;


        Object set190_tree=null;
        Object set192_tree=null;
        Object set194_tree=null;
        Object set196_tree=null;
        Object set198_tree=null;
        Object set201_tree=null;
        Object set203_tree=null;
        Object set205_tree=null;
        Object set207_tree=null;
        Object set209_tree=null;
        Object set211_tree=null;
        Object set213_tree=null;
        Object set215_tree=null;
        Object set217_tree=null;
        Object set219_tree=null;
        Object set221_tree=null;
        Object set223_tree=null;
        Object set225_tree=null;
        Object set226_tree=null;
        Object set228_tree=null;
        Object set230_tree=null;
        Object set232_tree=null;
        Object set235_tree=null;
        Object set237_tree=null;
        Object set239_tree=null;
        Object set241_tree=null;
        Object set243_tree=null;
        Object set245_tree=null;
        Object set247_tree=null;
        Object set249_tree=null;
        Object set251_tree=null;
        Object set253_tree=null;
        Object set254_tree=null;
        Object set256_tree=null;
        Object set258_tree=null;
        Object set261_tree=null;
        Object set263_tree=null;
        Object set265_tree=null;
        Object set267_tree=null;
        Object set269_tree=null;
        Object set271_tree=null;
        Object set273_tree=null;
        Object set274_tree=null;
        Object set276_tree=null;
        Object set279_tree=null;
        Object set281_tree=null;
        Object set283_tree=null;
        Object set285_tree=null;
        Object set286_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:832:9: ( ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase DOT | COMMA ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) | ( DOT | COMMA ) ftsWordBase | ftsWordBase )
            int alt72=18;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:833:12: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    set190=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set190)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord6897);
                    ftsWordBase191=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase191.getTree());

                    set192=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set192)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord6905);
                    ftsWordBase193=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase193.getTree());

                    set194=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set194)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord6913);
                    ftsWordBase195=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase195.getTree());

                    set196=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set196)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord6921);
                    ftsWordBase197=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase197.getTree());

                    set198=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set198)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord6929);
                    ftsWordBase199=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase199.getTree());

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:835:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase DOT | COMMA ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord6989);
                    ftsWordBase200=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase200.getTree());

                    set201=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set201)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord6997);
                    ftsWordBase202=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase202.getTree());

                    set203=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set203)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7005);
                    ftsWordBase204=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase204.getTree());

                    set205=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set205)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7013);
                    ftsWordBase206=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase206.getTree());

                    set207=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set207)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7021);
                    ftsWordBase208=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase208.getTree());

                    }
                    break;
                case 3 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:837:12: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    set209=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set209)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7094);
                    ftsWordBase210=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase210.getTree());

                    set211=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set211)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7102);
                    ftsWordBase212=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase212.getTree());

                    set213=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set213)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7110);
                    ftsWordBase214=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase214.getTree());

                    set215=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set215)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7118);
                    ftsWordBase216=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase216.getTree());

                    set217=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set217)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 4 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:839:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7184);
                    ftsWordBase218=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase218.getTree());

                    set219=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set219)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7192);
                    ftsWordBase220=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase220.getTree());

                    set221=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set221)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7200);
                    ftsWordBase222=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase222.getTree());

                    set223=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set223)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7208);
                    ftsWordBase224=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase224.getTree());

                    set225=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set225)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:841:12: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    set226=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set226)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7281);
                    ftsWordBase227=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase227.getTree());

                    set228=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set228)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7289);
                    ftsWordBase229=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase229.getTree());

                    set230=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set230)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7297);
                    ftsWordBase231=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase231.getTree());

                    set232=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set232)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7305);
                    ftsWordBase233=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase233.getTree());

                    }
                    break;
                case 6 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:843:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7359);
                    ftsWordBase234=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase234.getTree());

                    set235=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set235)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7367);
                    ftsWordBase236=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase236.getTree());

                    set237=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set237)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7375);
                    ftsWordBase238=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase238.getTree());

                    set239=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set239)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7383);
                    ftsWordBase240=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase240.getTree());

                    }
                    break;
                case 7 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:845:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    set241=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set241)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7447);
                    ftsWordBase242=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase242.getTree());

                    set243=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set243)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7455);
                    ftsWordBase244=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase244.getTree());

                    set245=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set245)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7463);
                    ftsWordBase246=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase246.getTree());

                    set247=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set247)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 8 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:847:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7521);
                    ftsWordBase248=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase248.getTree());

                    set249=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set249)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7529);
                    ftsWordBase250=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase250.getTree());

                    set251=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set251)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7537);
                    ftsWordBase252=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase252.getTree());

                    set253=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set253)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 9 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:849:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    set254=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set254)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7601);
                    ftsWordBase255=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase255.getTree());

                    set256=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set256)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7609);
                    ftsWordBase257=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase257.getTree());

                    set258=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set258)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7617);
                    ftsWordBase259=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase259.getTree());

                    }
                    break;
                case 10 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:851:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7663);
                    ftsWordBase260=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase260.getTree());

                    set261=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set261)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7671);
                    ftsWordBase262=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase262.getTree());

                    set263=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set263)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7679);
                    ftsWordBase264=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase264.getTree());

                    }
                    break;
                case 11 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:853:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    set265=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set265)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7736);
                    ftsWordBase266=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase266.getTree());

                    set267=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set267)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7744);
                    ftsWordBase268=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase268.getTree());

                    set269=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set269)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 12 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:855:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7795);
                    ftsWordBase270=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase270.getTree());

                    set271=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set271)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7803);
                    ftsWordBase272=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase272.getTree());

                    set273=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set273)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 13 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:857:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    set274=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set274)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7860);
                    ftsWordBase275=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase275.getTree());

                    set276=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set276)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7868);
                    ftsWordBase277=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase277.getTree());

                    }
                    break;
                case 14 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:859:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7906);
                    ftsWordBase278=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase278.getTree());

                    set279=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set279)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7914);
                    ftsWordBase280=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase280.getTree());

                    }
                    break;
                case 15 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:861:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    set281=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set281)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord7962);
                    ftsWordBase282=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase282.getTree());

                    set283=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set283)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 16 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:863:11: ( ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord8004);
                    ftsWordBase284=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase284.getTree());

                    set285=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set285)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 17 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:865:11: ( DOT | COMMA ) ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    set286=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set286)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord8028);
                    ftsWordBase287=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase287.getTree());

                    }
                    break;
                case 18 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:866:11: ftsWordBase
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ftsWordBase_in_ftsWord8041);
                    ftsWordBase288=ftsWordBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ftsWordBase288.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsWord"


    public static class ftsWordBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsWordBase"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:869:1: ftsWordBase : ( ID | FTSWORD | FTSPRE | FTSWILD | NOT | TO | DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL | STAR | QUESTION_MARK );
    public final FTSParser.ftsWordBase_return ftsWordBase() throws RecognitionException {
        FTSParser.ftsWordBase_return retval = new FTSParser.ftsWordBase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set289=null;

        Object set289_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:870:9: ( ID | FTSWORD | FTSPRE | FTSWILD | NOT | TO | DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL | STAR | QUESTION_MARK )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:
            {
            root_0 = (Object)adaptor.nil();


            set289=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_INTEGER_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL||(input.LA(1) >= FTSPRE && input.LA(1) <= FTSWORD)||input.LA(1)==ID||input.LA(1)==NOT||input.LA(1)==QUESTION_MARK||input.LA(1)==STAR||input.LA(1)==TO ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set289)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsWordBase"


    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:883:1: number : ( DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL );
    public final FTSParser.number_return number() throws RecognitionException {
        FTSParser.number_return retval = new FTSParser.number_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set290=null;

        Object set290_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:884:9: ( DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:
            {
            root_0 = (Object)adaptor.nil();


            set290=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_INTEGER_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set290)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"


    public static class ftsRangeWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftsRangeWord"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:889:1: ftsRangeWord : ( ID | FTSWORD | FTSPRE | FTSWILD | FTSPHRASE | DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL );
    public final FTSParser.ftsRangeWord_return ftsRangeWord() throws RecognitionException {
        FTSParser.ftsRangeWord_return retval = new FTSParser.ftsRangeWord_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set291=null;

        Object set291_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:890:9: ( ID | FTSWORD | FTSPRE | FTSWILD | FTSPHRASE | DECIMAL_INTEGER_LITERAL | FLOATING_POINT_LITERAL )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:
            {
            root_0 = (Object)adaptor.nil();


            set291=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_INTEGER_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL||(input.LA(1) >= FTSPHRASE && input.LA(1) <= FTSWORD)||input.LA(1)==ID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set291)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ftsRangeWord"


    public static class or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:902:1: or : ( OR | BAR BAR );
    public final FTSParser.or_return or() throws RecognitionException {
        FTSParser.or_return retval = new FTSParser.or_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR292=null;
        Token BAR293=null;
        Token BAR294=null;

        Object OR292_tree=null;
        Object BAR293_tree=null;
        Object BAR294_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:903:9: ( OR | BAR BAR )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==OR) ) {
                alt73=1;
            }
            else if ( (LA73_0==BAR) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:904:9: OR
                    {
                    root_0 = (Object)adaptor.nil();


                    OR292=(Token)match(input,OR,FOLLOW_OR_in_or8382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR292_tree = 
                    (Object)adaptor.create(OR292)
                    ;
                    adaptor.addChild(root_0, OR292_tree);
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:905:11: BAR BAR
                    {
                    root_0 = (Object)adaptor.nil();


                    BAR293=(Token)match(input,BAR,FOLLOW_BAR_in_or8394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAR293_tree = 
                    (Object)adaptor.create(BAR293)
                    ;
                    adaptor.addChild(root_0, BAR293_tree);
                    }

                    BAR294=(Token)match(input,BAR,FOLLOW_BAR_in_or8396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAR294_tree = 
                    (Object)adaptor.create(BAR294)
                    ;
                    adaptor.addChild(root_0, BAR294_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or"


    public static class and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:908:1: and : ( AND | AMP AMP );
    public final FTSParser.and_return and() throws RecognitionException {
        FTSParser.and_return retval = new FTSParser.and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND295=null;
        Token AMP296=null;
        Token AMP297=null;

        Object AND295_tree=null;
        Object AMP296_tree=null;
        Object AMP297_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:909:9: ( AND | AMP AMP )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==AND) ) {
                alt74=1;
            }
            else if ( (LA74_0==AMP) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }
            switch (alt74) {
                case 1 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:910:9: AND
                    {
                    root_0 = (Object)adaptor.nil();


                    AND295=(Token)match(input,AND,FOLLOW_AND_in_and8429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND295_tree = 
                    (Object)adaptor.create(AND295)
                    ;
                    adaptor.addChild(root_0, AND295_tree);
                    }

                    }
                    break;
                case 2 :
                    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:911:11: AMP AMP
                    {
                    root_0 = (Object)adaptor.nil();


                    AMP296=(Token)match(input,AMP,FOLLOW_AMP_in_and8441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AMP296_tree = 
                    (Object)adaptor.create(AMP296)
                    ;
                    adaptor.addChild(root_0, AMP296_tree);
                    }

                    AMP297=(Token)match(input,AMP,FOLLOW_AMP_in_and8443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AMP297_tree = 
                    (Object)adaptor.create(AMP297)
                    ;
                    adaptor.addChild(root_0, AMP297_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and"


    public static class not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "not"
    // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:914:1: not : ( NOT | EXCLAMATION );
    public final FTSParser.not_return not() throws RecognitionException {
        FTSParser.not_return retval = new FTSParser.not_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set298=null;

        Object set298_tree=null;

        try {
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:915:9: ( NOT | EXCLAMATION )
            // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:
            {
            root_0 = (Object)adaptor.nil();


            set298=(Token)input.LT(1);

            if ( input.LA(1)==EXCLAMATION||input.LA(1)==NOT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set298)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch(RecognitionException e)
        {
           throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "not"

    // $ANTLR start synpred1_FTS
    public final void synpred1_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:425:9: ( not )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:425:10: not
        {
        pushFollow(FOLLOW_not_in_synpred1_FTS1233);
        not();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_FTS

    // $ANTLR start synpred2_FTS
    public final void synpred2_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:457:12: ( ftsFieldGroupProximity )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:457:13: ftsFieldGroupProximity
        {
        pushFollow(FOLLOW_ftsFieldGroupProximity_in_synpred2_FTS1746);
        ftsFieldGroupProximity();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_FTS

    // $ANTLR start synpred3_FTS
    public final void synpred3_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:522:9: ( fieldReference COLON )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:522:10: fieldReference COLON
        {
        pushFollow(FOLLOW_fieldReference_in_synpred3_FTS2635);
        fieldReference();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred3_FTS2637); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_FTS

    // $ANTLR start synpred4_FTS
    public final void synpred4_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:524:28: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:524:29: slop
        {
        pushFollow(FOLLOW_slop_in_synpred4_FTS2676);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_FTS

    // $ANTLR start synpred5_FTS
    public final void synpred5_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:527:26: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:527:27: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred5_FTS2751);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_FTS

    // $ANTLR start synpred6_FTS
    public final void synpred6_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:531:20: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:531:21: slop
        {
        pushFollow(FOLLOW_slop_in_synpred6_FTS2821);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_FTS

    // $ANTLR start synpred7_FTS
    public final void synpred7_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:534:18: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:534:19: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred7_FTS2879);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_FTS

    // $ANTLR start synpred8_FTS
    public final void synpred8_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:543:9: ( fieldReference COLON )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:543:10: fieldReference COLON
        {
        pushFollow(FOLLOW_fieldReference_in_synpred8_FTS2984);
        fieldReference();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred8_FTS2986); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_FTS

    // $ANTLR start synpred9_FTS
    public final void synpred9_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:545:28: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:545:29: slop
        {
        pushFollow(FOLLOW_slop_in_synpred9_FTS3025);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_FTS

    // $ANTLR start synpred10_FTS
    public final void synpred10_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:548:26: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:548:27: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred10_FTS3100);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_FTS

    // $ANTLR start synpred11_FTS
    public final void synpred11_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:552:20: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:552:21: slop
        {
        pushFollow(FOLLOW_slop_in_synpred11_FTS3170);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_FTS

    // $ANTLR start synpred12_FTS
    public final void synpred12_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:555:18: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:555:19: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred12_FTS3228);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_FTS

    // $ANTLR start synpred13_FTS
    public final void synpred13_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:565:9: ( fieldReference COLON )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:565:10: fieldReference COLON
        {
        pushFollow(FOLLOW_fieldReference_in_synpred13_FTS3335);
        fieldReference();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred13_FTS3337); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_FTS

    // $ANTLR start synpred14_FTS
    public final void synpred14_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:567:28: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:567:29: slop
        {
        pushFollow(FOLLOW_slop_in_synpred14_FTS3376);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_FTS

    // $ANTLR start synpred15_FTS
    public final void synpred15_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:570:26: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:570:27: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred15_FTS3451);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_FTS

    // $ANTLR start synpred16_FTS
    public final void synpred16_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:574:20: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:574:21: slop
        {
        pushFollow(FOLLOW_slop_in_synpred16_FTS3521);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_FTS

    // $ANTLR start synpred17_FTS
    public final void synpred17_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:577:18: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:577:19: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred17_FTS3579);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_FTS

    // $ANTLR start synpred18_FTS
    public final void synpred18_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:650:9: ( not )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:650:10: not
        {
        pushFollow(FOLLOW_not_in_synpred18_FTS4326);
        not();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_FTS

    // $ANTLR start synpred19_FTS
    public final void synpred19_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:669:9: ( ftsFieldGroupProximity )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:669:10: ftsFieldGroupProximity
        {
        pushFollow(FOLLOW_ftsFieldGroupProximity_in_synpred19_FTS4691);
        ftsFieldGroupProximity();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_FTS

    // $ANTLR start synpred20_FTS
    public final void synpred20_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:672:31: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:672:32: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred20_FTS4761);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_FTS

    // $ANTLR start synpred21_FTS
    public final void synpred21_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:675:36: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:675:37: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred21_FTS4836);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_FTS

    // $ANTLR start synpred22_FTS
    public final void synpred22_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:678:33: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:678:34: slop
        {
        pushFollow(FOLLOW_slop_in_synpred22_FTS4911);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_FTS

    // $ANTLR start synpred23_FTS
    public final void synpred23_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:681:38: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:681:39: slop
        {
        pushFollow(FOLLOW_slop_in_synpred23_FTS4986);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_FTS

    // $ANTLR start synpred24_FTS
    public final void synpred24_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:684:42: ( slop )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:684:43: slop
        {
        pushFollow(FOLLOW_slop_in_synpred24_FTS5061);
        slop();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_FTS

    // $ANTLR start synpred25_FTS
    public final void synpred25_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:687:34: ( fuzzy )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:687:35: fuzzy
        {
        pushFollow(FOLLOW_fuzzy_in_synpred25_FTS5136);
        fuzzy();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_FTS

    // $ANTLR start synpred26_FTS
    public final void synpred26_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:733:38: ( proximityGroup )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:733:39: proximityGroup
        {
        pushFollow(FOLLOW_proximityGroup_in_synpred26_FTS5630);
        proximityGroup();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_FTS

    // $ANTLR start synpred27_FTS
    public final void synpred27_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:786:19: ( prefix )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:786:20: prefix
        {
        pushFollow(FOLLOW_prefix_in_synpred27_FTS6224);
        prefix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred27_FTS

    // $ANTLR start synpred28_FTS
    public final void synpred28_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:822:9: ( ID DOT ID )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:822:10: ID DOT ID
        {
        match(input,ID,FOLLOW_ID_in_synpred28_FTS6679); if (state.failed) return ;

        match(input,DOT,FOLLOW_DOT_in_synpred28_FTS6681); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred28_FTS6683); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred28_FTS

    // $ANTLR start synpred29_FTS
    public final void synpred29_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:833:12: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:833:13: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred29_FTS6842);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred29_FTS6850);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred29_FTS6858);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred29_FTS6866);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred29_FTS6874);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred29_FTS

    // $ANTLR start synpred30_FTS
    public final void synpred30_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:835:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase DOT | COMMA ftsWordBase )
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( (LA75_0==DECIMAL_INTEGER_LITERAL||LA75_0==FLOATING_POINT_LITERAL||(LA75_0 >= FTSPRE && LA75_0 <= FTSWORD)||LA75_0==ID||LA75_0==NOT||LA75_0==QUESTION_MARK||LA75_0==STAR||LA75_0==TO) ) {
            alt75=1;
        }
        else if ( (LA75_0==COMMA) ) {
            alt75=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 75, 0, input);

            throw nvae;

        }
        switch (alt75) {
            case 1 :
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:835:12: ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase DOT
                {
                pushFollow(FOLLOW_ftsWordBase_in_synpred30_FTS6942);
                ftsWordBase();

                state._fsp--;
                if (state.failed) return ;

                if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                    input.consume();
                    state.errorRecovery=false;
                    state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }


                pushFollow(FOLLOW_ftsWordBase_in_synpred30_FTS6950);
                ftsWordBase();

                state._fsp--;
                if (state.failed) return ;

                if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                    input.consume();
                    state.errorRecovery=false;
                    state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }


                pushFollow(FOLLOW_ftsWordBase_in_synpred30_FTS6958);
                ftsWordBase();

                state._fsp--;
                if (state.failed) return ;

                if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
                    input.consume();
                    state.errorRecovery=false;
                    state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }


                pushFollow(FOLLOW_ftsWordBase_in_synpred30_FTS6966);
                ftsWordBase();

                state._fsp--;
                if (state.failed) return ;

                match(input,DOT,FOLLOW_DOT_in_synpred30_FTS6968); if (state.failed) return ;

                }
                break;
            case 2 :
                // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:835:100: COMMA ftsWordBase
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred30_FTS6970); if (state.failed) return ;

                pushFollow(FOLLOW_ftsWordBase_in_synpred30_FTS6972);
                ftsWordBase();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
    }
    // $ANTLR end synpred30_FTS

    // $ANTLR start synpred31_FTS
    public final void synpred31_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:837:12: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:837:13: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred31_FTS7041);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred31_FTS7049);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred31_FTS7057);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred31_FTS7065);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred31_FTS

    // $ANTLR start synpred32_FTS
    public final void synpred32_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:839:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:839:12: ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
        {
        pushFollow(FOLLOW_ftsWordBase_in_synpred32_FTS7137);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred32_FTS7145);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred32_FTS7153);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred32_FTS7161);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred32_FTS

    // $ANTLR start synpred33_FTS
    public final void synpred33_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:841:12: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:841:13: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred33_FTS7234);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred33_FTS7242);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred33_FTS7250);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred33_FTS7258);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred33_FTS

    // $ANTLR start synpred34_FTS
    public final void synpred34_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:843:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:843:12: ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
        {
        pushFollow(FOLLOW_ftsWordBase_in_synpred34_FTS7318);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred34_FTS7326);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred34_FTS7334);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred34_FTS7342);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_FTS

    // $ANTLR start synpred35_FTS
    public final void synpred35_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:845:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:845:12: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred35_FTS7402);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred35_FTS7410);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred35_FTS7418);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred35_FTS

    // $ANTLR start synpred36_FTS
    public final void synpred36_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:847:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:847:12: ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
        {
        pushFollow(FOLLOW_ftsWordBase_in_synpred36_FTS7482);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred36_FTS7490);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred36_FTS7498);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred36_FTS

    // $ANTLR start synpred37_FTS
    public final void synpred37_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:849:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:849:12: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred37_FTS7562);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred37_FTS7570);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred37_FTS7578);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred37_FTS

    // $ANTLR start synpred38_FTS
    public final void synpred38_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:851:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:851:12: ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
        {
        pushFollow(FOLLOW_ftsWordBase_in_synpred38_FTS7630);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred38_FTS7638);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred38_FTS7646);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred38_FTS

    // $ANTLR start synpred39_FTS
    public final void synpred39_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:853:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:853:12: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred39_FTS7699);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred39_FTS7707);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred39_FTS

    // $ANTLR start synpred40_FTS
    public final void synpred40_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:855:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:855:12: ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
        {
        pushFollow(FOLLOW_ftsWordBase_in_synpred40_FTS7763);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred40_FTS7771);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred40_FTS

    // $ANTLR start synpred41_FTS
    public final void synpred41_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:857:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:857:12: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred41_FTS7829);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred41_FTS7837);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred41_FTS

    // $ANTLR start synpred42_FTS
    public final void synpred42_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:859:11: ( ftsWordBase ( DOT | COMMA ) ftsWordBase )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:859:12: ftsWordBase ( DOT | COMMA ) ftsWordBase
        {
        pushFollow(FOLLOW_ftsWordBase_in_synpred42_FTS7881);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred42_FTS7889);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred42_FTS

    // $ANTLR start synpred43_FTS
    public final void synpred43_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:861:11: ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:861:12: ( DOT | COMMA ) ftsWordBase ( DOT | COMMA )
        {
        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_ftsWordBase_in_synpred43_FTS7933);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred43_FTS

    // $ANTLR start synpred44_FTS
    public final void synpred44_FTS_fragment() throws RecognitionException {
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:863:11: ( ftsWordBase ( DOT | COMMA ) )
        // W:\\alfresco\\V4.1-BUG-FIX\\root\\projects\\data-model\\source\\java\\org\\alfresco\\repo\\search\\impl\\parsers\\FTS.g:863:12: ftsWordBase ( DOT | COMMA )
        {
        pushFollow(FOLLOW_ftsWordBase_in_synpred44_FTS7981);
        ftsWordBase();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==COMMA||input.LA(1)==DOT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred44_FTS

    // Delegated rules

    public final boolean synpred17_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_FTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_FTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA17_eotS =
        "\172\uffff";
    static final String DFA17_eofS =
        "\1\uffff\1\27\1\uffff\1\27\1\uffff\1\27\4\uffff\1\27\4\uffff\2\27"+
        "\57\uffff\2\27\1\uffff\1\27\34\uffff\1\27\5\uffff\1\27\23\uffff";
    static final String DFA17_minS =
        "\1\6\1\4\1\73\1\4\1\73\1\4\4\uffff\1\4\4\uffff\2\4\1\13\32\uffff"+
        "\2\12\7\uffff\1\4\1\0\5\uffff\3\0\1\uffff\2\4\1\uffff\1\4\1\uffff"+
        "\2\73\1\13\1\4\27\uffff\1\4\3\uffff\2\12\1\4\16\uffff\3\0\1\uffff"+
        "\1\0";
    static final String DFA17_maxS =
        "\4\135\1\73\1\135\4\uffff\1\135\4\uffff\2\135\1\134\32\uffff\2\23"+
        "\7\uffff\1\135\1\0\5\uffff\3\0\1\uffff\2\135\1\uffff\1\135\1\uffff"+
        "\2\73\1\134\1\135\27\uffff\1\135\3\uffff\2\12\1\135\16\uffff\3\0"+
        "\1\uffff\1\0";
    static final String DFA17_acceptS =
        "\6\uffff\2\2\1\3\1\4\1\uffff\2\5\1\7\1\10\3\uffff\31\2\1\5\2\uffff"+
        "\7\2\2\uffff\5\2\3\uffff\1\6\2\uffff\1\2\1\uffff\1\2\4\uffff\1\1"+
        "\26\2\1\uffff\3\2\3\uffff\16\2\3\uffff\1\2\1\uffff";
    static final String DFA17_specialS =
        "\65\uffff\1\10\1\1\5\uffff\1\7\1\3\1\5\66\uffff\1\0\1\6\1\2\1\uffff"+
        "\1\4}>";
    static final String[] DFA17_transitionS = {
            "\1\2\4\uffff\1\6\1\uffff\1\3\5\uffff\1\6\2\uffff\1\10\26\uffff"+
            "\1\3\1\uffff\1\5\3\3\10\uffff\1\1\3\uffff\1\15\1\13\1\14\5\uffff"+
            "\1\12\2\uffff\1\16\5\uffff\1\7\5\uffff\1\7\4\uffff\1\11\1\12"+
            "\1\4",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\21\1\22\1\uffff\1\37\5"+
            "\uffff\1\17\1\53\1\uffff\1\43\2\uffff\1\34\23\uffff\1\37\1\uffff"+
            "\1\41\3\37\10\uffff\1\35\3\uffff\1\47\1\45\1\46\1\uffff\1\52"+
            "\3\uffff\1\33\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1\42\2"+
            "\uffff\1\30\2\uffff\1\20\4\uffff\1\23\1\44\1\40",
            "\1\54\41\uffff\1\4",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\uffff\1\22\1\uffff\1\37"+
            "\5\uffff\1\22\1\53\1\uffff\1\43\2\uffff\1\34\23\uffff\1\37\1"+
            "\uffff\1\41\3\37\10\uffff\1\35\3\uffff\1\47\1\45\1\46\1\uffff"+
            "\1\52\3\uffff\1\33\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1"+
            "\42\2\uffff\1\30\2\uffff\1\20\4\uffff\1\23\1\44\1\40",
            "\1\55",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\uffff\1\57\1\uffff\1\37"+
            "\5\uffff\1\57\1\53\1\uffff\1\43\2\uffff\1\34\23\uffff\1\37\1"+
            "\uffff\1\41\3\37\10\uffff\1\35\3\uffff\1\47\1\45\1\46\1\uffff"+
            "\1\52\3\uffff\1\33\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1"+
            "\42\2\uffff\1\30\2\uffff\1\42\4\uffff\1\56\1\44\1\40",
            "",
            "",
            "",
            "",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\uffff\1\22\1\uffff\1\37"+
            "\5\uffff\1\22\2\uffff\1\43\2\uffff\1\34\23\uffff\1\37\1\uffff"+
            "\1\41\3\37\10\uffff\1\35\3\uffff\1\47\1\45\1\46\1\uffff\1\52"+
            "\3\uffff\1\33\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1\42\2"+
            "\uffff\1\30\2\uffff\1\20\4\uffff\1\23\1\44\1\40",
            "",
            "",
            "",
            "",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\uffff\1\57\1\uffff\1\62"+
            "\5\uffff\1\57\2\uffff\1\43\2\uffff\1\34\23\uffff\1\62\1\uffff"+
            "\1\41\3\62\10\uffff\1\60\3\uffff\1\47\1\45\1\46\1\uffff\1\52"+
            "\3\uffff\1\61\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1\63\2"+
            "\uffff\1\30\2\uffff\1\63\4\uffff\1\23\1\64\1\40",
            "\1\73\1\72\1\36\1\32\1\uffff\1\71\1\uffff\1\67\1\uffff\1\75"+
            "\5\uffff\1\67\2\uffff\1\43\2\uffff\1\34\23\uffff\1\75\1\uffff"+
            "\1\41\3\75\10\uffff\1\74\3\uffff\1\65\1\45\1\46\1\uffff\1\52"+
            "\3\uffff\1\66\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1\42\2"+
            "\uffff\1\30\2\uffff\1\42\4\uffff\1\70\1\76\1\40",
            "\1\102\1\uffff\1\103\5\uffff\1\102\31\uffff\1\103\1\uffff\1"+
            "\101\3\103\10\uffff\1\100\3\uffff\1\77\1\13\1\14\5\uffff\1\104"+
            "\10\uffff\1\104\5\uffff\1\104\5\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\10\uffff\1\105",
            "\1\107\10\uffff\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117\1\116\1\123\1\136\3\uffff\1\112\1\uffff\1\110\5\uffff"+
            "\1\112\2\uffff\1\126\2\uffff\1\121\23\uffff\1\124\1\uffff\1"+
            "\114\3\124\10\uffff\1\120\3\uffff\1\133\1\131\1\132\1\uffff"+
            "\1\115\3\uffff\1\113\1\uffff\1\137\1\134\1\uffff\1\135\3\uffff"+
            "\1\122\2\uffff\1\111\2\uffff\1\122\4\uffff\1\127\1\130\1\125",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\107\1\141\1\uffff\1\37"+
            "\5\uffff\1\140\1\53\1\uffff\1\43\2\uffff\1\34\23\uffff\1\37"+
            "\1\uffff\1\41\3\37\10\uffff\1\35\3\uffff\1\47\1\45\1\46\1\uffff"+
            "\1\52\3\uffff\1\33\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1"+
            "\42\2\uffff\1\30\2\uffff\1\42\4\uffff\1\142\1\44\1\40",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\uffff\1\57\1\uffff\1\37"+
            "\5\uffff\1\57\1\53\1\uffff\1\43\2\uffff\1\34\23\uffff\1\37\1"+
            "\uffff\1\41\3\37\10\uffff\1\35\3\uffff\1\47\1\45\1\46\1\uffff"+
            "\1\52\3\uffff\1\33\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1"+
            "\42\2\uffff\1\30\2\uffff\1\42\4\uffff\1\143\1\44\1\40",
            "",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\uffff\1\141\1\uffff\1\37"+
            "\5\uffff\1\141\1\53\1\uffff\1\43\2\uffff\1\34\23\uffff\1\37"+
            "\1\uffff\1\41\3\37\10\uffff\1\35\3\uffff\1\47\1\45\1\46\1\uffff"+
            "\1\52\3\uffff\1\33\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1"+
            "\42\2\uffff\1\30\2\uffff\1\42\4\uffff\1\142\1\44\1\40",
            "",
            "\1\144",
            "\1\145",
            "\1\102\1\uffff\1\103\5\uffff\1\102\31\uffff\1\103\1\uffff\1"+
            "\101\3\103\10\uffff\1\103\3\uffff\1\77\1\13\1\14\5\uffff\1\104"+
            "\10\uffff\1\104\5\uffff\1\104\5\uffff\1\104",
            "\1\156\1\155\1\123\1\151\1\uffff\1\154\1\uffff\1\147\1\uffff"+
            "\1\124\5\uffff\1\147\1\157\1\uffff\1\126\2\uffff\1\121\23\uffff"+
            "\1\124\1\uffff\1\114\3\124\10\uffff\1\120\3\uffff\1\133\1\131"+
            "\1\132\1\uffff\1\115\3\uffff\1\113\1\uffff\1\150\1\134\1\uffff"+
            "\1\135\3\uffff\1\122\2\uffff\1\146\2\uffff\1\152\4\uffff\1\153"+
            "\1\130\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\25\1\36\1\32\1\uffff\1\24\1\uffff\1\57\1\uffff\1\162"+
            "\5\uffff\1\57\2\uffff\1\43\2\uffff\1\34\23\uffff\1\162\1\uffff"+
            "\1\41\3\162\10\uffff\1\160\3\uffff\1\47\1\45\1\46\1\uffff\1"+
            "\52\3\uffff\1\161\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1\163"+
            "\2\uffff\1\30\2\uffff\1\163\4\uffff\1\142\1\164\1\40",
            "",
            "",
            "",
            "\1\21",
            "\1\107",
            "\1\73\1\72\1\36\1\32\1\uffff\1\71\1\uffff\1\57\1\uffff\1\167"+
            "\5\uffff\1\57\2\uffff\1\43\2\uffff\1\34\23\uffff\1\167\1\uffff"+
            "\1\41\3\167\10\uffff\1\166\3\uffff\1\47\1\45\1\46\1\uffff\1"+
            "\52\3\uffff\1\165\1\uffff\1\31\1\50\1\uffff\1\51\3\uffff\1\42"+
            "\2\uffff\1\30\2\uffff\1\42\4\uffff\1\170\1\171\1\40",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "\1\uffff"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "455:1: ftsTest : ( ( ftsFieldGroupProximity )=> ftsFieldGroupProximity -> ^( PROXIMITY ftsFieldGroupProximity ) | ftsTermOrPhrase | ftsExactTermOrPhrase | ftsTokenisedTermOrPhrase | ftsRange -> ^( RANGE ftsRange ) | ftsFieldGroup -> ftsFieldGroup | LPAREN ftsDisjunction RPAREN -> ftsDisjunction | template -> template );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_117 = input.LA(1);

                         
                        int index17_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 120;}

                         
                        input.seek(index17_117);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA17_54 = input.LA(1);

                         
                        int index17_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index17_54);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA17_119 = input.LA(1);

                         
                        int index17_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 120;}

                         
                        input.seek(index17_119);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA17_61 = input.LA(1);

                         
                        int index17_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index17_61);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA17_121 = input.LA(1);

                         
                        int index17_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 120;}

                         
                        input.seek(index17_121);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA17_62 = input.LA(1);

                         
                        int index17_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index17_62);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA17_118 = input.LA(1);

                         
                        int index17_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 120;}

                         
                        input.seek(index17_118);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA17_60 = input.LA(1);

                         
                        int index17_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_FTS()) ) {s = 73;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index17_60);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA17_53 = input.LA(1);

                         
                        int index17_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA17_53==DECIMAL_INTEGER_LITERAL) ) {s = 72;}

                        else if ( (LA17_53==RPAREN) && (synpred2_FTS())) {s = 73;}

                        else if ( (LA17_53==COMMA||LA17_53==DOT) ) {s = 74;}

                        else if ( (LA17_53==NOT) ) {s = 75;}

                        else if ( (LA17_53==FTSPHRASE) ) {s = 76;}

                        else if ( (LA17_53==MINUS) ) {s = 77;}

                        else if ( (LA17_53==AND) ) {s = 78;}

                        else if ( (LA17_53==AMP) ) {s = 79;}

                        else if ( (LA17_53==ID) ) {s = 80;}

                        else if ( (LA17_53==EXCLAMATION) ) {s = 81;}

                        else if ( (LA17_53==QUESTION_MARK||LA17_53==STAR) ) {s = 82;}

                        else if ( (LA17_53==AT) ) {s = 83;}

                        else if ( (LA17_53==FLOATING_POINT_LITERAL||(LA17_53 >= FTSPRE && LA17_53 <= FTSWORD)) ) {s = 84;}

                        else if ( (LA17_53==URI) ) {s = 85;}

                        else if ( (LA17_53==EQUALS) ) {s = 86;}

                        else if ( (LA17_53==TILDA) ) {s = 87;}

                        else if ( (LA17_53==TO) ) {s = 88;}

                        else if ( (LA17_53==LSQUARE) ) {s = 89;}

                        else if ( (LA17_53==LT) ) {s = 90;}

                        else if ( (LA17_53==LPAREN) ) {s = 91;}

                        else if ( (LA17_53==PERCENT) ) {s = 92;}

                        else if ( (LA17_53==PLUS) ) {s = 93;}

                        else if ( (LA17_53==BAR) ) {s = 94;}

                        else if ( (LA17_53==OR) ) {s = 95;}

                         
                        input.seek(index17_53);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA60_eotS =
        "\147\uffff";
    static final String DFA60_eofS =
        "\147\uffff";
    static final String DFA60_minS =
        "\1\13\1\4\2\uffff\1\13\1\4\1\13\1\4\3\uffff\1\4\57\uffff\1\4\1\0"+
        "\5\uffff\2\0\1\4\23\uffff\1\4\11\uffff\2\0\2\uffff\1\0";
    static final String DFA60_maxS =
        "\2\134\2\uffff\4\134\3\uffff\1\134\57\uffff\1\134\1\0\5\uffff\2"+
        "\0\1\134\23\uffff\1\134\11\uffff\2\0\2\uffff\1\0";
    static final String DFA60_acceptS =
        "\2\uffff\2\2\4\uffff\2\10\1\11\1\uffff\24\2\1\10\2\3\1\5\24\4\1"+
        "\6\2\7\2\uffff\5\2\3\uffff\1\1\22\2\1\uffff\11\2\2\uffff\2\2\1\uffff";
    static final String DFA60_specialS =
        "\73\uffff\1\2\1\4\5\uffff\1\6\1\1\36\uffff\1\3\1\5\2\uffff\1\0}>";
    static final String[] DFA60_transitionS = {
            "\1\2\1\uffff\1\1\5\uffff\1\2\2\uffff\1\4\26\uffff\1\1\1\uffff"+
            "\1\5\3\1\10\uffff\1\1\3\uffff\1\12\1\10\1\11\5\uffff\1\7\10"+
            "\uffff\1\3\5\uffff\1\3\4\uffff\1\6\1\7",
            "\1\20\1\17\1\uffff\1\23\1\uffff\1\16\1\uffff\1\14\1\uffff\1"+
            "\26\5\uffff\1\14\1\40\1\uffff\1\30\2\uffff\1\25\23\uffff\1\26"+
            "\1\uffff\1\31\3\26\10\uffff\1\26\3\uffff\1\35\1\33\1\34\1\uffff"+
            "\1\37\3\uffff\1\24\1\uffff\1\22\2\uffff\1\36\3\uffff\1\27\2"+
            "\uffff\1\21\2\uffff\1\13\4\uffff\1\15\1\32",
            "",
            "",
            "\1\41\1\uffff\1\42\5\uffff\1\41\2\uffff\1\43\26\uffff\1\42"+
            "\2\uffff\3\42\10\uffff\1\42\13\uffff\1\42\10\uffff\1\42\5\uffff"+
            "\1\42\5\uffff\1\42",
            "\1\47\1\46\1\uffff\1\52\1\uffff\1\45\1\uffff\1\56\1\uffff\1"+
            "\55\5\uffff\1\56\1\40\1\uffff\1\60\2\uffff\1\54\23\uffff\1\55"+
            "\1\uffff\1\61\3\55\10\uffff\1\55\3\uffff\1\65\1\63\1\64\1\uffff"+
            "\1\67\3\uffff\1\53\1\uffff\1\51\2\uffff\1\66\3\uffff\1\57\2"+
            "\uffff\1\50\2\uffff\1\57\4\uffff\1\44\1\62",
            "\1\71\1\uffff\1\72\5\uffff\1\71\2\uffff\1\70\26\uffff\1\72"+
            "\2\uffff\3\72\10\uffff\1\72\13\uffff\1\72\10\uffff\1\72\5\uffff"+
            "\1\72\5\uffff\1\72",
            "\1\20\1\17\1\uffff\1\23\1\uffff\1\16\1\uffff\1\14\1\uffff\1"+
            "\26\5\uffff\1\14\2\uffff\1\30\2\uffff\1\25\23\uffff\1\26\1\uffff"+
            "\1\31\3\26\10\uffff\1\26\3\uffff\1\35\1\33\1\34\1\uffff\1\37"+
            "\3\uffff\1\24\1\uffff\1\22\2\uffff\1\36\3\uffff\1\27\2\uffff"+
            "\1\21\2\uffff\1\13\4\uffff\1\15\1\32",
            "",
            "",
            "",
            "\1\101\1\100\1\uffff\1\23\1\uffff\1\77\1\uffff\1\75\1\uffff"+
            "\1\102\5\uffff\1\75\2\uffff\1\30\2\uffff\1\25\23\uffff\1\102"+
            "\1\uffff\1\31\3\102\10\uffff\1\102\3\uffff\1\73\1\33\1\34\1"+
            "\uffff\1\37\3\uffff\1\74\1\uffff\1\22\2\uffff\1\36\3\uffff\1"+
            "\27\2\uffff\1\21\2\uffff\1\27\4\uffff\1\76\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\1\106\1\uffff\1\125\3\uffff\1\113\1\uffff\1\104\5\uffff"+
            "\1\113\2\uffff\1\115\2\uffff\1\111\23\uffff\1\112\1\uffff\1"+
            "\116\3\112\10\uffff\1\112\3\uffff\1\123\1\121\1\122\1\uffff"+
            "\1\126\3\uffff\1\110\1\uffff\1\127\2\uffff\1\124\3\uffff\1\114"+
            "\2\uffff\1\105\2\uffff\1\114\4\uffff\1\117\1\120",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\140\1\137\1\uffff\1\136\1\uffff\1\134\1\uffff\1\132\1\uffff"+
            "\1\112\5\uffff\1\132\1\141\1\uffff\1\115\2\uffff\1\111\23\uffff"+
            "\1\112\1\uffff\1\116\3\112\10\uffff\1\112\3\uffff\1\123\1\121"+
            "\1\122\1\uffff\1\126\3\uffff\1\110\1\uffff\1\135\2\uffff\1\124"+
            "\3\uffff\1\114\2\uffff\1\130\2\uffff\1\131\4\uffff\1\133\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\1\100\1\uffff\1\23\1\uffff\1\77\1\uffff\1\144\1\uffff"+
            "\1\143\5\uffff\1\144\2\uffff\1\30\2\uffff\1\25\23\uffff\1\143"+
            "\1\uffff\1\31\3\143\10\uffff\1\143\3\uffff\1\35\1\33\1\34\1"+
            "\uffff\1\37\3\uffff\1\142\1\uffff\1\22\2\uffff\1\36\3\uffff"+
            "\1\27\2\uffff\1\21\2\uffff\1\27\4\uffff\1\145\1\146",
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
            "",
            "",
            "\1\uffff"
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "667:1: ftsFieldGroupTest : ( ( ftsFieldGroupProximity )=> ftsFieldGroupProximity -> ^( FG_PROXIMITY ftsFieldGroupProximity ) | ftsFieldGroupTerm ( ( fuzzy )=> fuzzy )? -> ^( FG_TERM ftsFieldGroupTerm ( fuzzy )? ) | ftsFieldGroupExactTerm ( ( fuzzy )=> fuzzy )? -> ^( FG_EXACT_TERM ftsFieldGroupExactTerm ( fuzzy )? ) | ftsFieldGroupPhrase ( ( slop )=> slop )? -> ^( FG_PHRASE ftsFieldGroupPhrase ( slop )? ) | ftsFieldGroupExactPhrase ( ( slop )=> slop )? -> ^( FG_EXACT_PHRASE ftsFieldGroupExactPhrase ( slop )? ) | ftsFieldGroupTokenisedPhrase ( ( slop )=> slop )? -> ^( FG_PHRASE ftsFieldGroupTokenisedPhrase ( slop )? ) | ftsFieldGroupSynonym ( ( fuzzy )=> fuzzy )? -> ^( FG_SYNONYM ftsFieldGroupSynonym ( fuzzy )? ) | ftsFieldGroupRange -> ^( FG_RANGE ftsFieldGroupRange ) | LPAREN ftsFieldGroupDisjunction RPAREN -> ftsFieldGroupDisjunction );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_102 = input.LA(1);

                         
                        int index60_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred19_FTS()) ) {s = 69;}

                        else if ( (true) ) {s = 101;}

                         
                        input.seek(index60_102);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA60_67 = input.LA(1);

                         
                        int index60_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred19_FTS()) ) {s = 69;}

                        else if ( (true) ) {s = 87;}

                         
                        input.seek(index60_67);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA60_59 = input.LA(1);

                         
                        int index60_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA60_59==DECIMAL_INTEGER_LITERAL) ) {s = 68;}

                        else if ( (LA60_59==RPAREN) && (synpred19_FTS())) {s = 69;}

                        else if ( (LA60_59==AND) ) {s = 70;}

                        else if ( (LA60_59==AMP) ) {s = 71;}

                        else if ( (LA60_59==NOT) ) {s = 72;}

                        else if ( (LA60_59==EXCLAMATION) ) {s = 73;}

                        else if ( (LA60_59==FLOATING_POINT_LITERAL||(LA60_59 >= FTSPRE && LA60_59 <= FTSWORD)||LA60_59==ID) ) {s = 74;}

                        else if ( (LA60_59==COMMA||LA60_59==DOT) ) {s = 75;}

                        else if ( (LA60_59==QUESTION_MARK||LA60_59==STAR) ) {s = 76;}

                        else if ( (LA60_59==EQUALS) ) {s = 77;}

                        else if ( (LA60_59==FTSPHRASE) ) {s = 78;}

                        else if ( (LA60_59==TILDA) ) {s = 79;}

                        else if ( (LA60_59==TO) ) {s = 80;}

                        else if ( (LA60_59==LSQUARE) ) {s = 81;}

                        else if ( (LA60_59==LT) ) {s = 82;}

                        else if ( (LA60_59==LPAREN) ) {s = 83;}

                        else if ( (LA60_59==PLUS) ) {s = 84;}

                        else if ( (LA60_59==BAR) ) {s = 85;}

                        else if ( (LA60_59==MINUS) ) {s = 86;}

                        else if ( (LA60_59==OR) ) {s = 87;}

                         
                        input.seek(index60_59);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA60_98 = input.LA(1);

                         
                        int index60_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred19_FTS()) ) {s = 69;}

                        else if ( (true) ) {s = 101;}

                         
                        input.seek(index60_98);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA60_60 = input.LA(1);

                         
                        int index60_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred19_FTS()) ) {s = 69;}

                        else if ( (true) ) {s = 87;}

                         
                        input.seek(index60_60);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA60_99 = input.LA(1);

                         
                        int index60_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred19_FTS()) ) {s = 69;}

                        else if ( (true) ) {s = 101;}

                         
                        input.seek(index60_99);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA60_66 = input.LA(1);

                         
                        int index60_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred19_FTS()) ) {s = 69;}

                        else if ( (true) ) {s = 87;}

                         
                        input.seek(index60_66);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA61_eotS =
        "\115\uffff";
    static final String DFA61_eofS =
        "\1\4\17\uffff\1\40\61\uffff\1\40\12\uffff";
    static final String DFA61_minS =
        "\1\4\17\uffff\1\4\20\uffff\4\0\1\4\13\uffff\1\4\20\uffff\1\4\6\uffff"+
        "\4\0";
    static final String DFA61_maxS =
        "\1\135\17\uffff\1\135\20\uffff\4\0\1\135\13\uffff\1\135\20\uffff"+
        "\1\135\6\uffff\4\0";
    static final String DFA61_acceptS =
        "\1\uffff\17\2\1\uffff\20\2\5\uffff\1\1\12\2\1\uffff\14\2\1\1\3\2"+
        "\1\uffff\6\2\4\uffff";
    static final String DFA61_specialS =
        "\41\uffff\1\3\1\7\1\1\1\5\1\10\43\uffff\1\2\1\6\1\0\1\4}>";
    static final String[] DFA61_transitionS = {
            "\1\3\1\2\1\13\1\7\1\uffff\1\1\1\uffff\1\17\1\uffff\1\14\5\uffff"+
            "\1\17\2\uffff\1\21\2\uffff\1\11\23\uffff\1\14\1\uffff\1\16\3"+
            "\14\10\uffff\1\12\3\uffff\1\26\1\24\1\25\1\uffff\1\31\3\uffff"+
            "\1\10\1\uffff\1\6\1\27\1\uffff\1\30\3\uffff\1\32\2\uffff\1\5"+
            "\2\uffff\1\20\4\uffff\1\22\1\23\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\36\1\13\1\7\1\uffff\1\35\1\uffff\1\33\1\uffff\1\43"+
            "\5\uffff\1\33\2\uffff\1\21\2\uffff\1\11\23\uffff\1\43\1\uffff"+
            "\1\16\3\43\10\uffff\1\42\3\uffff\1\45\1\24\1\25\1\uffff\1\31"+
            "\3\uffff\1\41\1\uffff\1\6\1\27\1\uffff\1\30\3\uffff\1\32\2\uffff"+
            "\1\5\2\uffff\1\32\4\uffff\1\34\1\44\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\54\1\53\1\60\1\73\3\uffff\1\47\1\uffff\1\61\5\uffff\1\47"+
            "\2\uffff\1\63\2\uffff\1\56\23\uffff\1\75\1\uffff\1\51\3\75\10"+
            "\uffff\1\55\3\uffff\1\70\1\66\1\67\1\uffff\1\52\3\uffff\1\50"+
            "\1\uffff\1\74\1\71\1\uffff\1\72\3\uffff\1\57\2\uffff\1\76\2"+
            "\uffff\1\57\4\uffff\1\64\1\65\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\1\106\1\60\1\101\1\uffff\1\105\1\uffff\1\77\1\uffff"+
            "\1\75\5\uffff\1\77\1\110\1\uffff\1\63\2\uffff\1\56\23\uffff"+
            "\1\75\1\uffff\1\51\3\75\10\uffff\1\55\3\uffff\1\70\1\66\1\67"+
            "\1\uffff\1\52\3\uffff\1\50\1\uffff\1\100\1\71\1\uffff\1\72\3"+
            "\uffff\1\57\2\uffff\1\102\2\uffff\1\103\4\uffff\1\104\1\65\1"+
            "\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\36\1\13\1\7\1\uffff\1\35\1\uffff\1\17\1\uffff\1\113"+
            "\5\uffff\1\17\2\uffff\1\21\2\uffff\1\11\23\uffff\1\113\1\uffff"+
            "\1\16\3\113\10\uffff\1\112\3\uffff\1\26\1\24\1\25\1\uffff\1"+
            "\31\3\uffff\1\111\1\uffff\1\6\1\27\1\uffff\1\30\3\uffff\1\32"+
            "\2\uffff\1\5\2\uffff\1\32\4\uffff\1\22\1\114\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "()+ loopback of 733:36: ( ( proximityGroup )=> proximityGroup ftsFieldGroupProximityTerm )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_75 = input.LA(1);

                         
                        int index61_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 62;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index61_75);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA61_35 = input.LA(1);

                         
                        int index61_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 38;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index61_35);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA61_73 = input.LA(1);

                         
                        int index61_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 62;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index61_73);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA61_33 = input.LA(1);

                         
                        int index61_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 38;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index61_33);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA61_76 = input.LA(1);

                         
                        int index61_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 62;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index61_76);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA61_36 = input.LA(1);

                         
                        int index61_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 38;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index61_36);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA61_74 = input.LA(1);

                         
                        int index61_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 62;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index61_74);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA61_34 = input.LA(1);

                         
                        int index61_34 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred26_FTS()) ) {s = 38;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index61_34);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA61_37 = input.LA(1);

                         
                        int index61_37 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA61_37==COMMA||LA61_37==DOT) ) {s = 39;}

                        else if ( (LA61_37==NOT) ) {s = 40;}

                        else if ( (LA61_37==FTSPHRASE) ) {s = 41;}

                        else if ( (LA61_37==MINUS) ) {s = 42;}

                        else if ( (LA61_37==AND) ) {s = 43;}

                        else if ( (LA61_37==AMP) ) {s = 44;}

                        else if ( (LA61_37==ID) ) {s = 45;}

                        else if ( (LA61_37==EXCLAMATION) ) {s = 46;}

                        else if ( (LA61_37==QUESTION_MARK||LA61_37==STAR) ) {s = 47;}

                        else if ( (LA61_37==AT) ) {s = 48;}

                        else if ( (LA61_37==DECIMAL_INTEGER_LITERAL) ) {s = 49;}

                        else if ( (LA61_37==URI) ) {s = 50;}

                        else if ( (LA61_37==EQUALS) ) {s = 51;}

                        else if ( (LA61_37==TILDA) ) {s = 52;}

                        else if ( (LA61_37==TO) ) {s = 53;}

                        else if ( (LA61_37==LSQUARE) ) {s = 54;}

                        else if ( (LA61_37==LT) ) {s = 55;}

                        else if ( (LA61_37==LPAREN) ) {s = 56;}

                        else if ( (LA61_37==PERCENT) ) {s = 57;}

                        else if ( (LA61_37==PLUS) ) {s = 58;}

                        else if ( (LA61_37==BAR) ) {s = 59;}

                        else if ( (LA61_37==OR) ) {s = 60;}

                        else if ( (LA61_37==FLOATING_POINT_LITERAL||(LA61_37 >= FTSPRE && LA61_37 <= FTSWORD)) ) {s = 61;}

                        else if ( (LA61_37==RPAREN) && (synpred26_FTS())) {s = 62;}

                         
                        input.seek(index61_37);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA72_eotS =
        "\u010c\uffff";
    static final String DFA72_eofS =
        "\2\uffff\1\11\1\42\1\73\30\uffff\1\124\112\uffff\1\161\1\uffff\1"+
        "\u008a\63\uffff\1\u00a7\1\uffff\1\u00c0\63\uffff\1\u00dd\1\uffff"+
        "\1\u00f6\65\uffff";
    static final String DFA72_minS =
        "\1\13\1\15\3\4\30\uffff\1\4\30\uffff\1\13\10\uffff\1\13\1\uffff"+
        "\1\13\1\uffff\1\13\4\uffff\1\13\6\uffff\1\13\10\uffff\1\13\1\uffff"+
        "\1\13\1\uffff\1\13\4\uffff\1\13\6\uffff\1\4\1\uffff\1\4\1\uffff"+
        "\1\13\10\uffff\1\13\1\uffff\1\13\1\uffff\1\13\4\uffff\1\13\6\uffff"+
        "\1\13\10\uffff\1\13\1\uffff\1\13\1\uffff\1\13\4\uffff\1\13\6\uffff"+
        "\1\4\1\uffff\1\4\1\uffff\1\13\10\uffff\1\13\1\uffff\1\13\1\uffff"+
        "\1\13\4\uffff\1\13\6\uffff\1\13\10\uffff\1\13\1\uffff\1\13\1\uffff"+
        "\1\13\4\uffff\1\13\6\uffff\1\4\1\uffff\1\4\1\uffff\1\0\10\uffff"+
        "\1\0\1\uffff\1\0\1\uffff\1\0\4\uffff\1\0\6\uffff\1\0\10\uffff\1"+
        "\0\1\uffff\1\0\1\uffff\1\0\4\uffff\1\0\10\uffff";
    static final String DFA72_maxS =
        "\2\134\3\135\30\uffff\1\135\30\uffff\1\23\10\uffff\1\23\1\uffff"+
        "\1\23\1\uffff\1\23\4\uffff\1\23\6\uffff\1\23\10\uffff\1\23\1\uffff"+
        "\1\23\1\uffff\1\23\4\uffff\1\23\6\uffff\1\135\1\uffff\1\135\1\uffff"+
        "\1\23\10\uffff\1\23\1\uffff\1\23\1\uffff\1\23\4\uffff\1\23\6\uffff"+
        "\1\23\10\uffff\1\23\1\uffff\1\23\1\uffff\1\23\4\uffff\1\23\6\uffff"+
        "\1\135\1\uffff\1\135\1\uffff\1\23\10\uffff\1\23\1\uffff\1\23\1\uffff"+
        "\1\23\4\uffff\1\23\6\uffff\1\23\10\uffff\1\23\1\uffff\1\23\1\uffff"+
        "\1\23\4\uffff\1\23\6\uffff\1\135\1\uffff\1\135\1\uffff\1\0\10\uffff"+
        "\1\0\1\uffff\1\0\1\uffff\1\0\4\uffff\1\0\6\uffff\1\0\10\uffff\1"+
        "\0\1\uffff\1\0\1\uffff\1\0\4\uffff\1\0\10\uffff";
    static final String DFA72_acceptS =
        "\5\uffff\30\22\1\uffff\30\21\1\uffff\10\20\1\uffff\1\20\1\uffff"+
        "\1\20\1\uffff\4\20\1\uffff\6\20\1\uffff\10\17\1\uffff\1\17\1\uffff"+
        "\1\17\1\uffff\4\17\1\uffff\6\17\1\uffff\1\16\1\uffff\1\15\1\uffff"+
        "\10\14\1\uffff\1\14\1\uffff\1\14\1\uffff\4\14\1\uffff\6\14\1\uffff"+
        "\10\13\1\uffff\1\13\1\uffff\1\13\1\uffff\4\13\1\uffff\6\13\1\uffff"+
        "\1\12\1\uffff\1\11\1\uffff\10\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
        "\4\10\1\uffff\6\10\1\uffff\10\7\1\uffff\1\7\1\uffff\1\7\1\uffff"+
        "\4\7\1\uffff\6\7\1\uffff\1\6\1\uffff\1\5\1\uffff\10\4\1\uffff\1"+
        "\4\1\uffff\1\4\1\uffff\4\4\1\uffff\6\4\1\uffff\10\3\1\uffff\1\3"+
        "\1\uffff\1\3\1\uffff\4\3\1\uffff\6\3\1\2\1\1";
    static final String DFA72_specialS =
        "\4\uffff\1\11\30\uffff\1\7\30\uffff\1\20\10\uffff\1\23\1\uffff\1"+
        "\30\1\uffff\1\31\4\uffff\1\42\6\uffff\1\36\10\uffff\1\41\1\uffff"+
        "\1\46\1\uffff\1\1\4\uffff\1\26\6\uffff\1\17\1\uffff\1\50\1\uffff"+
        "\1\4\10\uffff\1\34\1\uffff\1\44\1\uffff\1\37\4\uffff\1\32\6\uffff"+
        "\1\56\10\uffff\1\33\1\uffff\1\2\1\uffff\1\27\4\uffff\1\51\6\uffff"+
        "\1\13\1\uffff\1\45\1\uffff\1\3\10\uffff\1\40\1\uffff\1\57\1\uffff"+
        "\1\22\4\uffff\1\5\6\uffff\1\47\10\uffff\1\15\1\uffff\1\54\1\uffff"+
        "\1\21\4\uffff\1\35\6\uffff\1\53\1\uffff\1\6\1\uffff\1\24\10\uffff"+
        "\1\55\1\uffff\1\14\1\uffff\1\0\4\uffff\1\10\6\uffff\1\12\10\uffff"+
        "\1\52\1\uffff\1\43\1\uffff\1\16\4\uffff\1\25\10\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\1\uffff\1\2\5\uffff\1\1\31\uffff\1\2\2\uffff\3\2\10\uffff"+
            "\1\2\13\uffff\1\2\10\uffff\1\2\5\uffff\1\2\5\uffff\1\2",
            "\1\3\37\uffff\1\3\2\uffff\3\3\10\uffff\1\3\13\uffff\1\3\10"+
            "\uffff\1\3\5\uffff\1\3\5\uffff\1\3",
            "\1\10\1\7\1\20\1\14\1\uffff\1\6\1\uffff\1\4\1\uffff\1\21\5"+
            "\uffff\1\4\2\uffff\1\25\2\uffff\1\16\23\uffff\1\21\1\uffff\1"+
            "\23\3\21\10\uffff\1\17\3\uffff\1\31\1\27\1\30\1\uffff\1\34\3"+
            "\uffff\1\15\1\uffff\1\13\1\32\1\uffff\1\33\3\uffff\1\24\2\uffff"+
            "\1\12\2\uffff\1\24\4\uffff\1\5\1\26\1\22",
            "\1\41\1\40\1\51\1\45\1\uffff\1\37\1\uffff\1\35\1\uffff\1\52"+
            "\5\uffff\1\35\2\uffff\1\56\2\uffff\1\47\23\uffff\1\52\1\uffff"+
            "\1\54\3\52\10\uffff\1\50\3\uffff\1\62\1\60\1\61\1\uffff\1\65"+
            "\3\uffff\1\46\1\uffff\1\44\1\63\1\uffff\1\64\3\uffff\1\55\2"+
            "\uffff\1\43\2\uffff\1\55\4\uffff\1\36\1\57\1\53",
            "\1\72\1\71\1\102\1\76\1\uffff\1\70\1\uffff\1\106\1\uffff\1"+
            "\103\5\uffff\1\106\2\uffff\1\107\2\uffff\1\100\23\uffff\1\103"+
            "\1\uffff\1\105\3\103\10\uffff\1\77\3\uffff\1\113\1\111\1\112"+
            "\1\uffff\1\116\3\uffff\1\66\1\uffff\1\75\1\114\1\uffff\1\115"+
            "\3\uffff\1\101\2\uffff\1\74\2\uffff\1\101\4\uffff\1\67\1\110"+
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123\1\122\1\133\1\127\1\uffff\1\121\1\uffff\1\137\1\uffff"+
            "\1\134\5\uffff\1\137\2\uffff\1\140\2\uffff\1\131\23\uffff\1"+
            "\134\1\uffff\1\136\3\134\10\uffff\1\130\3\uffff\1\144\1\142"+
            "\1\143\1\uffff\1\147\3\uffff\1\117\1\uffff\1\126\1\145\1\uffff"+
            "\1\146\3\uffff\1\132\2\uffff\1\125\2\uffff\1\132\4\uffff\1\120"+
            "\1\141\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150\7\uffff\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150\7\uffff\1\150",
            "",
            "\1\150\7\uffff\1\150",
            "",
            "\1\150\7\uffff\1\150",
            "",
            "",
            "",
            "",
            "\1\150\7\uffff\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152\7\uffff\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152\7\uffff\1\152",
            "",
            "\1\152\7\uffff\1\152",
            "",
            "\1\152\7\uffff\1\152",
            "",
            "",
            "",
            "",
            "\1\152\7\uffff\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160\1\157\1\170\1\164\1\uffff\1\156\1\uffff\1\174\1\uffff"+
            "\1\171\5\uffff\1\174\2\uffff\1\175\2\uffff\1\166\23\uffff\1"+
            "\171\1\uffff\1\173\3\171\10\uffff\1\165\3\uffff\1\u0081\1\177"+
            "\1\u0080\1\uffff\1\u0084\3\uffff\1\154\1\uffff\1\163\1\u0082"+
            "\1\uffff\1\u0083\3\uffff\1\167\2\uffff\1\162\2\uffff\1\167\4"+
            "\uffff\1\155\1\176\1\172",
            "",
            "\1\u0089\1\u0088\1\u0091\1\u008d\1\uffff\1\u0087\1\uffff\1"+
            "\u0095\1\uffff\1\u0092\5\uffff\1\u0095\2\uffff\1\u0096\2\uffff"+
            "\1\u008f\23\uffff\1\u0092\1\uffff\1\u0094\3\u0092\10\uffff\1"+
            "\u008e\3\uffff\1\u009a\1\u0098\1\u0099\1\uffff\1\u009d\3\uffff"+
            "\1\u0085\1\uffff\1\u008c\1\u009b\1\uffff\1\u009c\3\uffff\1\u0090"+
            "\2\uffff\1\u008b\2\uffff\1\u0090\4\uffff\1\u0086\1\u0097\1\u0093",
            "",
            "\1\u009e\7\uffff\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e\7\uffff\1\u009e",
            "",
            "\1\u009e\7\uffff\1\u009e",
            "",
            "\1\u009e\7\uffff\1\u009e",
            "",
            "",
            "",
            "",
            "\1\u009e\7\uffff\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0\7\uffff\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0\7\uffff\1\u00a0",
            "",
            "\1\u00a0\7\uffff\1\u00a0",
            "",
            "\1\u00a0\7\uffff\1\u00a0",
            "",
            "",
            "",
            "",
            "\1\u00a0\7\uffff\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a6\1\u00a5\1\u00ae\1\u00aa\1\uffff\1\u00a4\1\uffff\1"+
            "\u00b2\1\uffff\1\u00af\5\uffff\1\u00b2\2\uffff\1\u00b3\2\uffff"+
            "\1\u00ac\23\uffff\1\u00af\1\uffff\1\u00b1\3\u00af\10\uffff\1"+
            "\u00ab\3\uffff\1\u00b7\1\u00b5\1\u00b6\1\uffff\1\u00ba\3\uffff"+
            "\1\u00a2\1\uffff\1\u00a9\1\u00b8\1\uffff\1\u00b9\3\uffff\1\u00ad"+
            "\2\uffff\1\u00a8\2\uffff\1\u00ad\4\uffff\1\u00a3\1\u00b4\1\u00b0",
            "",
            "\1\u00bf\1\u00be\1\u00c7\1\u00c3\1\uffff\1\u00bd\1\uffff\1"+
            "\u00cb\1\uffff\1\u00c8\5\uffff\1\u00cb\2\uffff\1\u00cc\2\uffff"+
            "\1\u00c5\23\uffff\1\u00c8\1\uffff\1\u00ca\3\u00c8\10\uffff\1"+
            "\u00c4\3\uffff\1\u00d0\1\u00ce\1\u00cf\1\uffff\1\u00d3\3\uffff"+
            "\1\u00bb\1\uffff\1\u00c2\1\u00d1\1\uffff\1\u00d2\3\uffff\1\u00c6"+
            "\2\uffff\1\u00c1\2\uffff\1\u00c6\4\uffff\1\u00bc\1\u00cd\1\u00c9",
            "",
            "\1\u00d4\7\uffff\1\u00d4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d4\7\uffff\1\u00d4",
            "",
            "\1\u00d4\7\uffff\1\u00d4",
            "",
            "\1\u00d4\7\uffff\1\u00d4",
            "",
            "",
            "",
            "",
            "\1\u00d4\7\uffff\1\u00d4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d6\7\uffff\1\u00d6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d6\7\uffff\1\u00d6",
            "",
            "\1\u00d6\7\uffff\1\u00d6",
            "",
            "\1\u00d6\7\uffff\1\u00d6",
            "",
            "",
            "",
            "",
            "\1\u00d6\7\uffff\1\u00d6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00dc\1\u00db\1\u00e4\1\u00e0\1\uffff\1\u00da\1\uffff\1"+
            "\u00e8\1\uffff\1\u00e5\5\uffff\1\u00e8\2\uffff\1\u00e9\2\uffff"+
            "\1\u00e2\23\uffff\1\u00e5\1\uffff\1\u00e7\3\u00e5\10\uffff\1"+
            "\u00e1\3\uffff\1\u00ed\1\u00eb\1\u00ec\1\uffff\1\u00f0\3\uffff"+
            "\1\u00d8\1\uffff\1\u00df\1\u00ee\1\uffff\1\u00ef\3\uffff\1\u00e3"+
            "\2\uffff\1\u00de\2\uffff\1\u00e3\4\uffff\1\u00d9\1\u00ea\1\u00e6",
            "",
            "\1\u00f5\1\u00f4\1\u00fd\1\u00f9\1\uffff\1\u00f3\1\uffff\1"+
            "\u0101\1\uffff\1\u00fe\5\uffff\1\u0101\2\uffff\1\u0102\2\uffff"+
            "\1\u00fb\23\uffff\1\u00fe\1\uffff\1\u0100\3\u00fe\10\uffff\1"+
            "\u00fa\3\uffff\1\u0106\1\u0104\1\u0105\1\uffff\1\u0109\3\uffff"+
            "\1\u00f1\1\uffff\1\u00f8\1\u0107\1\uffff\1\u0108\3\uffff\1\u00fc"+
            "\2\uffff\1\u00f7\2\uffff\1\u00fc\4\uffff\1\u00f2\1\u0103\1\u00ff",
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
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
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
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
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
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "831:1: ftsWord : ( ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase DOT | COMMA ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ftsWordBase ( DOT | COMMA ) ftsWordBase )=> ftsWordBase ( DOT | COMMA ) ftsWordBase | ( ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) )=> ( DOT | COMMA ) ftsWordBase ( DOT | COMMA ) | ( ftsWordBase ( DOT | COMMA ) )=> ftsWordBase ( DOT | COMMA ) | ( DOT | COMMA ) ftsWordBase | ftsWordBase );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_229 = input.LA(1);

                         
                        int index72_229 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred30_FTS()) ) {s = 266;}

                        else if ( (synpred32_FTS()) ) {s = 240;}

                         
                        input.seek(index72_229);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA72_92 = input.LA(1);

                         
                        int index72_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_92==COMMA||LA72_92==DOT) ) {s = 106;}

                        else if ( (synpred41_FTS()) ) {s = 107;}

                        else if ( (synpred43_FTS()) ) {s = 103;}

                        else if ( (true) ) {s = 53;}

                         
                        input.seek(index72_92);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA72_144 = input.LA(1);

                         
                        int index72_144 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_144==COMMA||LA72_144==DOT) ) {s = 160;}

                        else if ( (synpred37_FTS()) ) {s = 161;}

                        else if ( (synpred39_FTS()) ) {s = 157;}

                         
                        input.seek(index72_144);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA72_162 = input.LA(1);

                         
                        int index72_162 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_162==COMMA||LA72_162==DOT) ) {s = 212;}

                        else if ( (synpred34_FTS()) ) {s = 213;}

                        else if ( (synpred36_FTS()) ) {s = 186;}

                         
                        input.seek(index72_162);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA72_108 = input.LA(1);

                         
                        int index72_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_108==COMMA||LA72_108==DOT) ) {s = 158;}

                        else if ( (synpred38_FTS()) ) {s = 159;}

                        else if ( (synpred40_FTS()) ) {s = 132;}

                         
                        input.seek(index72_108);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA72_180 = input.LA(1);

                         
                        int index72_180 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_180==COMMA||LA72_180==DOT) ) {s = 212;}

                        else if ( (synpred34_FTS()) ) {s = 213;}

                        else if ( (synpred36_FTS()) ) {s = 186;}

                         
                        input.seek(index72_180);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA72_214 = input.LA(1);

                         
                        int index72_214 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_214==NOT) ) {s = 241;}

                        else if ( (LA72_214==TILDA) && (synpred31_FTS())) {s = 242;}

                        else if ( (LA72_214==CARAT) && (synpred31_FTS())) {s = 243;}

                        else if ( (LA72_214==AND) && (synpred31_FTS())) {s = 244;}

                        else if ( (LA72_214==AMP) && (synpred31_FTS())) {s = 245;}

                        else if ( (LA72_214==EOF) && (synpred31_FTS())) {s = 246;}

                        else if ( (LA72_214==RPAREN) && (synpred31_FTS())) {s = 247;}

                        else if ( (LA72_214==OR) && (synpred31_FTS())) {s = 248;}

                        else if ( (LA72_214==BAR) && (synpred31_FTS())) {s = 249;}

                        else if ( (LA72_214==ID) ) {s = 250;}

                        else if ( (LA72_214==EXCLAMATION) && (synpred31_FTS())) {s = 251;}

                        else if ( (LA72_214==QUESTION_MARK||LA72_214==STAR) ) {s = 252;}

                        else if ( (LA72_214==AT) && (synpred31_FTS())) {s = 253;}

                        else if ( (LA72_214==DECIMAL_INTEGER_LITERAL||LA72_214==FLOATING_POINT_LITERAL||(LA72_214 >= FTSPRE && LA72_214 <= FTSWORD)) ) {s = 254;}

                        else if ( (LA72_214==URI) && (synpred31_FTS())) {s = 255;}

                        else if ( (LA72_214==FTSPHRASE) && (synpred31_FTS())) {s = 256;}

                        else if ( (LA72_214==COMMA||LA72_214==DOT) && (synpred31_FTS())) {s = 257;}

                        else if ( (LA72_214==EQUALS) && (synpred31_FTS())) {s = 258;}

                        else if ( (LA72_214==TO) ) {s = 259;}

                        else if ( (LA72_214==LSQUARE) && (synpred31_FTS())) {s = 260;}

                        else if ( (LA72_214==LT) && (synpred31_FTS())) {s = 261;}

                        else if ( (LA72_214==LPAREN) && (synpred31_FTS())) {s = 262;}

                        else if ( (LA72_214==PERCENT) && (synpred31_FTS())) {s = 263;}

                        else if ( (LA72_214==PLUS) && (synpred31_FTS())) {s = 264;}

                        else if ( (LA72_214==MINUS) && (synpred31_FTS())) {s = 265;}

                         
                        input.seek(index72_214);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA72_29 = input.LA(1);

                         
                        int index72_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_29==NOT) ) {s = 79;}

                        else if ( (LA72_29==TILDA) && (synpred43_FTS())) {s = 80;}

                        else if ( (LA72_29==CARAT) && (synpred43_FTS())) {s = 81;}

                        else if ( (LA72_29==AND) && (synpred43_FTS())) {s = 82;}

                        else if ( (LA72_29==AMP) && (synpred43_FTS())) {s = 83;}

                        else if ( (LA72_29==EOF) && (synpred43_FTS())) {s = 84;}

                        else if ( (LA72_29==RPAREN) && (synpred43_FTS())) {s = 85;}

                        else if ( (LA72_29==OR) && (synpred43_FTS())) {s = 86;}

                        else if ( (LA72_29==BAR) && (synpred43_FTS())) {s = 87;}

                        else if ( (LA72_29==ID) ) {s = 88;}

                        else if ( (LA72_29==EXCLAMATION) && (synpred43_FTS())) {s = 89;}

                        else if ( (LA72_29==QUESTION_MARK||LA72_29==STAR) ) {s = 90;}

                        else if ( (LA72_29==AT) && (synpred43_FTS())) {s = 91;}

                        else if ( (LA72_29==DECIMAL_INTEGER_LITERAL||LA72_29==FLOATING_POINT_LITERAL||(LA72_29 >= FTSPRE && LA72_29 <= FTSWORD)) ) {s = 92;}

                        else if ( (LA72_29==URI) && (synpred43_FTS())) {s = 93;}

                        else if ( (LA72_29==FTSPHRASE) && (synpred43_FTS())) {s = 94;}

                        else if ( (LA72_29==COMMA||LA72_29==DOT) && (synpred43_FTS())) {s = 95;}

                        else if ( (LA72_29==EQUALS) && (synpred43_FTS())) {s = 96;}

                        else if ( (LA72_29==TO) ) {s = 97;}

                        else if ( (LA72_29==LSQUARE) && (synpred43_FTS())) {s = 98;}

                        else if ( (LA72_29==LT) && (synpred43_FTS())) {s = 99;}

                        else if ( (LA72_29==LPAREN) && (synpred43_FTS())) {s = 100;}

                        else if ( (LA72_29==PERCENT) && (synpred43_FTS())) {s = 101;}

                        else if ( (LA72_29==PLUS) && (synpred43_FTS())) {s = 102;}

                        else if ( (LA72_29==MINUS) && (synpred43_FTS())) {s = 103;}

                         
                        input.seek(index72_29);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA72_234 = input.LA(1);

                         
                        int index72_234 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred30_FTS()) ) {s = 266;}

                        else if ( (synpred32_FTS()) ) {s = 240;}

                         
                        input.seek(index72_234);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_4==NOT) ) {s = 54;}

                        else if ( (LA72_4==TILDA) && (synpred44_FTS())) {s = 55;}

                        else if ( (LA72_4==CARAT) && (synpred44_FTS())) {s = 56;}

                        else if ( (LA72_4==AND) && (synpred44_FTS())) {s = 57;}

                        else if ( (LA72_4==AMP) && (synpred44_FTS())) {s = 58;}

                        else if ( (LA72_4==EOF) && (synpred44_FTS())) {s = 59;}

                        else if ( (LA72_4==RPAREN) && (synpred44_FTS())) {s = 60;}

                        else if ( (LA72_4==OR) && (synpred44_FTS())) {s = 61;}

                        else if ( (LA72_4==BAR) && (synpred44_FTS())) {s = 62;}

                        else if ( (LA72_4==ID) ) {s = 63;}

                        else if ( (LA72_4==EXCLAMATION) && (synpred44_FTS())) {s = 64;}

                        else if ( (LA72_4==QUESTION_MARK||LA72_4==STAR) ) {s = 65;}

                        else if ( (LA72_4==AT) && (synpred44_FTS())) {s = 66;}

                        else if ( (LA72_4==DECIMAL_INTEGER_LITERAL||LA72_4==FLOATING_POINT_LITERAL||(LA72_4 >= FTSPRE && LA72_4 <= FTSWORD)) ) {s = 67;}

                        else if ( (LA72_4==URI) && (synpred44_FTS())) {s = 68;}

                        else if ( (LA72_4==FTSPHRASE) && (synpred44_FTS())) {s = 69;}

                        else if ( (LA72_4==COMMA||LA72_4==DOT) && (synpred44_FTS())) {s = 70;}

                        else if ( (LA72_4==EQUALS) && (synpred44_FTS())) {s = 71;}

                        else if ( (LA72_4==TO) ) {s = 72;}

                        else if ( (LA72_4==LSQUARE) && (synpred44_FTS())) {s = 73;}

                        else if ( (LA72_4==LT) && (synpred44_FTS())) {s = 74;}

                        else if ( (LA72_4==LPAREN) && (synpred44_FTS())) {s = 75;}

                        else if ( (LA72_4==PERCENT) && (synpred44_FTS())) {s = 76;}

                        else if ( (LA72_4==PLUS) && (synpred44_FTS())) {s = 77;}

                        else if ( (LA72_4==MINUS) && (synpred44_FTS())) {s = 78;}

                         
                        input.seek(index72_4);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA72_241 = input.LA(1);

                         
                        int index72_241 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred29_FTS()) ) {s = 267;}

                        else if ( (synpred31_FTS()) ) {s = 265;}

                         
                        input.seek(index72_241);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA72_158 = input.LA(1);

                         
                        int index72_158 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_158==NOT) ) {s = 162;}

                        else if ( (LA72_158==TILDA) && (synpred36_FTS())) {s = 163;}

                        else if ( (LA72_158==CARAT) && (synpred36_FTS())) {s = 164;}

                        else if ( (LA72_158==AND) && (synpred36_FTS())) {s = 165;}

                        else if ( (LA72_158==AMP) && (synpred36_FTS())) {s = 166;}

                        else if ( (LA72_158==EOF) && (synpred36_FTS())) {s = 167;}

                        else if ( (LA72_158==RPAREN) && (synpred36_FTS())) {s = 168;}

                        else if ( (LA72_158==OR) && (synpred36_FTS())) {s = 169;}

                        else if ( (LA72_158==BAR) && (synpred36_FTS())) {s = 170;}

                        else if ( (LA72_158==ID) ) {s = 171;}

                        else if ( (LA72_158==EXCLAMATION) && (synpred36_FTS())) {s = 172;}

                        else if ( (LA72_158==QUESTION_MARK||LA72_158==STAR) ) {s = 173;}

                        else if ( (LA72_158==AT) && (synpred36_FTS())) {s = 174;}

                        else if ( (LA72_158==DECIMAL_INTEGER_LITERAL||LA72_158==FLOATING_POINT_LITERAL||(LA72_158 >= FTSPRE && LA72_158 <= FTSWORD)) ) {s = 175;}

                        else if ( (LA72_158==URI) && (synpred36_FTS())) {s = 176;}

                        else if ( (LA72_158==FTSPHRASE) && (synpred36_FTS())) {s = 177;}

                        else if ( (LA72_158==COMMA||LA72_158==DOT) && (synpred36_FTS())) {s = 178;}

                        else if ( (LA72_158==EQUALS) && (synpred36_FTS())) {s = 179;}

                        else if ( (LA72_158==TO) ) {s = 180;}

                        else if ( (LA72_158==LSQUARE) && (synpred36_FTS())) {s = 181;}

                        else if ( (LA72_158==LT) && (synpred36_FTS())) {s = 182;}

                        else if ( (LA72_158==LPAREN) && (synpred36_FTS())) {s = 183;}

                        else if ( (LA72_158==PERCENT) && (synpred36_FTS())) {s = 184;}

                        else if ( (LA72_158==PLUS) && (synpred36_FTS())) {s = 185;}

                        else if ( (LA72_158==MINUS) && (synpred36_FTS())) {s = 186;}

                         
                        input.seek(index72_158);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA72_227 = input.LA(1);

                         
                        int index72_227 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred30_FTS()) ) {s = 266;}

                        else if ( (synpred32_FTS()) ) {s = 240;}

                         
                        input.seek(index72_227);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA72_196 = input.LA(1);

                         
                        int index72_196 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_196==COMMA||LA72_196==DOT) ) {s = 214;}

                        else if ( (synpred33_FTS()) ) {s = 215;}

                        else if ( (synpred35_FTS()) ) {s = 211;}

                         
                        input.seek(index72_196);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA72_254 = input.LA(1);

                         
                        int index72_254 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred29_FTS()) ) {s = 267;}

                        else if ( (synpred31_FTS()) ) {s = 265;}

                         
                        input.seek(index72_254);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA72_104 = input.LA(1);

                         
                        int index72_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_104==NOT) ) {s = 108;}

                        else if ( (LA72_104==TILDA) && (synpred40_FTS())) {s = 109;}

                        else if ( (LA72_104==CARAT) && (synpred40_FTS())) {s = 110;}

                        else if ( (LA72_104==AND) && (synpred40_FTS())) {s = 111;}

                        else if ( (LA72_104==AMP) && (synpred40_FTS())) {s = 112;}

                        else if ( (LA72_104==EOF) && (synpred40_FTS())) {s = 113;}

                        else if ( (LA72_104==RPAREN) && (synpred40_FTS())) {s = 114;}

                        else if ( (LA72_104==OR) && (synpred40_FTS())) {s = 115;}

                        else if ( (LA72_104==BAR) && (synpred40_FTS())) {s = 116;}

                        else if ( (LA72_104==ID) ) {s = 117;}

                        else if ( (LA72_104==EXCLAMATION) && (synpred40_FTS())) {s = 118;}

                        else if ( (LA72_104==QUESTION_MARK||LA72_104==STAR) ) {s = 119;}

                        else if ( (LA72_104==AT) && (synpred40_FTS())) {s = 120;}

                        else if ( (LA72_104==DECIMAL_INTEGER_LITERAL||LA72_104==FLOATING_POINT_LITERAL||(LA72_104 >= FTSPRE && LA72_104 <= FTSWORD)) ) {s = 121;}

                        else if ( (LA72_104==URI) && (synpred40_FTS())) {s = 122;}

                        else if ( (LA72_104==FTSPHRASE) && (synpred40_FTS())) {s = 123;}

                        else if ( (LA72_104==COMMA||LA72_104==DOT) && (synpred40_FTS())) {s = 124;}

                        else if ( (LA72_104==EQUALS) && (synpred40_FTS())) {s = 125;}

                        else if ( (LA72_104==TO) ) {s = 126;}

                        else if ( (LA72_104==LSQUARE) && (synpred40_FTS())) {s = 127;}

                        else if ( (LA72_104==LT) && (synpred40_FTS())) {s = 128;}

                        else if ( (LA72_104==LPAREN) && (synpred40_FTS())) {s = 129;}

                        else if ( (LA72_104==PERCENT) && (synpred40_FTS())) {s = 130;}

                        else if ( (LA72_104==PLUS) && (synpred40_FTS())) {s = 131;}

                        else if ( (LA72_104==MINUS) && (synpred40_FTS())) {s = 132;}

                         
                        input.seek(index72_104);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA72_54 = input.LA(1);

                         
                        int index72_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_54==COMMA||LA72_54==DOT) ) {s = 104;}

                        else if ( (synpred42_FTS()) ) {s = 105;}

                        else if ( (synpred44_FTS()) ) {s = 78;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index72_54);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA72_200 = input.LA(1);

                         
                        int index72_200 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_200==COMMA||LA72_200==DOT) ) {s = 214;}

                        else if ( (synpred33_FTS()) ) {s = 215;}

                        else if ( (synpred35_FTS()) ) {s = 211;}

                         
                        input.seek(index72_200);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA72_175 = input.LA(1);

                         
                        int index72_175 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_175==COMMA||LA72_175==DOT) ) {s = 212;}

                        else if ( (synpred34_FTS()) ) {s = 213;}

                        else if ( (synpred36_FTS()) ) {s = 186;}

                         
                        input.seek(index72_175);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA72_63 = input.LA(1);

                         
                        int index72_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_63==COMMA||LA72_63==DOT) ) {s = 104;}

                        else if ( (synpred42_FTS()) ) {s = 105;}

                        else if ( (synpred44_FTS()) ) {s = 78;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index72_63);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA72_216 = input.LA(1);

                         
                        int index72_216 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred30_FTS()) ) {s = 266;}

                        else if ( (synpred32_FTS()) ) {s = 240;}

                         
                        input.seek(index72_216);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA72_259 = input.LA(1);

                         
                        int index72_259 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred29_FTS()) ) {s = 267;}

                        else if ( (synpred31_FTS()) ) {s = 265;}

                         
                        input.seek(index72_259);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA72_97 = input.LA(1);

                         
                        int index72_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_97==COMMA||LA72_97==DOT) ) {s = 106;}

                        else if ( (synpred41_FTS()) ) {s = 107;}

                        else if ( (synpred43_FTS()) ) {s = 103;}

                        else if ( (true) ) {s = 53;}

                         
                        input.seek(index72_97);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA72_146 = input.LA(1);

                         
                        int index72_146 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_146==COMMA||LA72_146==DOT) ) {s = 160;}

                        else if ( (synpred37_FTS()) ) {s = 161;}

                        else if ( (synpred39_FTS()) ) {s = 157;}

                         
                        input.seek(index72_146);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA72_65 = input.LA(1);

                         
                        int index72_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_65==COMMA||LA72_65==DOT) ) {s = 104;}

                        else if ( (synpred42_FTS()) ) {s = 105;}

                        else if ( (synpred44_FTS()) ) {s = 78;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index72_65);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA72_67 = input.LA(1);

                         
                        int index72_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_67==COMMA||LA72_67==DOT) ) {s = 104;}

                        else if ( (synpred42_FTS()) ) {s = 105;}

                        else if ( (synpred44_FTS()) ) {s = 78;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index72_67);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA72_126 = input.LA(1);

                         
                        int index72_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_126==COMMA||LA72_126==DOT) ) {s = 158;}

                        else if ( (synpred38_FTS()) ) {s = 159;}

                        else if ( (synpred40_FTS()) ) {s = 132;}

                         
                        input.seek(index72_126);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA72_142 = input.LA(1);

                         
                        int index72_142 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_142==COMMA||LA72_142==DOT) ) {s = 160;}

                        else if ( (synpred37_FTS()) ) {s = 161;}

                        else if ( (synpred39_FTS()) ) {s = 157;}

                         
                        input.seek(index72_142);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA72_117 = input.LA(1);

                         
                        int index72_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_117==COMMA||LA72_117==DOT) ) {s = 158;}

                        else if ( (synpred38_FTS()) ) {s = 159;}

                        else if ( (synpred40_FTS()) ) {s = 132;}

                         
                        input.seek(index72_117);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA72_205 = input.LA(1);

                         
                        int index72_205 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_205==COMMA||LA72_205==DOT) ) {s = 214;}

                        else if ( (synpred33_FTS()) ) {s = 215;}

                        else if ( (synpred35_FTS()) ) {s = 211;}

                         
                        input.seek(index72_205);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA72_79 = input.LA(1);

                         
                        int index72_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_79==COMMA||LA72_79==DOT) ) {s = 106;}

                        else if ( (synpred41_FTS()) ) {s = 107;}

                        else if ( (synpred43_FTS()) ) {s = 103;}

                        else if ( (true) ) {s = 53;}

                         
                        input.seek(index72_79);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA72_121 = input.LA(1);

                         
                        int index72_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_121==COMMA||LA72_121==DOT) ) {s = 158;}

                        else if ( (synpred38_FTS()) ) {s = 159;}

                        else if ( (synpred40_FTS()) ) {s = 132;}

                         
                        input.seek(index72_121);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA72_171 = input.LA(1);

                         
                        int index72_171 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_171==COMMA||LA72_171==DOT) ) {s = 212;}

                        else if ( (synpred34_FTS()) ) {s = 213;}

                        else if ( (synpred36_FTS()) ) {s = 186;}

                         
                        input.seek(index72_171);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA72_88 = input.LA(1);

                         
                        int index72_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_88==COMMA||LA72_88==DOT) ) {s = 106;}

                        else if ( (synpred41_FTS()) ) {s = 107;}

                        else if ( (synpred43_FTS()) ) {s = 103;}

                        else if ( (true) ) {s = 53;}

                         
                        input.seek(index72_88);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA72_72 = input.LA(1);

                         
                        int index72_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_72==COMMA||LA72_72==DOT) ) {s = 104;}

                        else if ( (synpred42_FTS()) ) {s = 105;}

                        else if ( (synpred44_FTS()) ) {s = 78;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index72_72);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA72_252 = input.LA(1);

                         
                        int index72_252 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred29_FTS()) ) {s = 267;}

                        else if ( (synpred31_FTS()) ) {s = 265;}

                         
                        input.seek(index72_252);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA72_119 = input.LA(1);

                         
                        int index72_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_119==COMMA||LA72_119==DOT) ) {s = 158;}

                        else if ( (synpred38_FTS()) ) {s = 159;}

                        else if ( (synpred40_FTS()) ) {s = 132;}

                         
                        input.seek(index72_119);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA72_160 = input.LA(1);

                         
                        int index72_160 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_160==NOT) ) {s = 187;}

                        else if ( (LA72_160==TILDA) && (synpred35_FTS())) {s = 188;}

                        else if ( (LA72_160==CARAT) && (synpred35_FTS())) {s = 189;}

                        else if ( (LA72_160==AND) && (synpred35_FTS())) {s = 190;}

                        else if ( (LA72_160==AMP) && (synpred35_FTS())) {s = 191;}

                        else if ( (LA72_160==EOF) && (synpred35_FTS())) {s = 192;}

                        else if ( (LA72_160==RPAREN) && (synpred35_FTS())) {s = 193;}

                        else if ( (LA72_160==OR) && (synpred35_FTS())) {s = 194;}

                        else if ( (LA72_160==BAR) && (synpred35_FTS())) {s = 195;}

                        else if ( (LA72_160==ID) ) {s = 196;}

                        else if ( (LA72_160==EXCLAMATION) && (synpred35_FTS())) {s = 197;}

                        else if ( (LA72_160==QUESTION_MARK||LA72_160==STAR) ) {s = 198;}

                        else if ( (LA72_160==AT) && (synpred35_FTS())) {s = 199;}

                        else if ( (LA72_160==DECIMAL_INTEGER_LITERAL||LA72_160==FLOATING_POINT_LITERAL||(LA72_160 >= FTSPRE && LA72_160 <= FTSWORD)) ) {s = 200;}

                        else if ( (LA72_160==URI) && (synpred35_FTS())) {s = 201;}

                        else if ( (LA72_160==FTSPHRASE) && (synpred35_FTS())) {s = 202;}

                        else if ( (LA72_160==COMMA||LA72_160==DOT) && (synpred35_FTS())) {s = 203;}

                        else if ( (LA72_160==EQUALS) && (synpred35_FTS())) {s = 204;}

                        else if ( (LA72_160==TO) ) {s = 205;}

                        else if ( (LA72_160==LSQUARE) && (synpred35_FTS())) {s = 206;}

                        else if ( (LA72_160==LT) && (synpred35_FTS())) {s = 207;}

                        else if ( (LA72_160==LPAREN) && (synpred35_FTS())) {s = 208;}

                        else if ( (LA72_160==PERCENT) && (synpred35_FTS())) {s = 209;}

                        else if ( (LA72_160==PLUS) && (synpred35_FTS())) {s = 210;}

                        else if ( (LA72_160==MINUS) && (synpred35_FTS())) {s = 211;}

                         
                        input.seek(index72_160);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA72_90 = input.LA(1);

                         
                        int index72_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_90==COMMA||LA72_90==DOT) ) {s = 106;}

                        else if ( (synpred41_FTS()) ) {s = 107;}

                        else if ( (synpred43_FTS()) ) {s = 103;}

                        else if ( (true) ) {s = 53;}

                         
                        input.seek(index72_90);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA72_187 = input.LA(1);

                         
                        int index72_187 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_187==COMMA||LA72_187==DOT) ) {s = 214;}

                        else if ( (synpred33_FTS()) ) {s = 215;}

                        else if ( (synpred35_FTS()) ) {s = 211;}

                         
                        input.seek(index72_187);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA72_106 = input.LA(1);

                         
                        int index72_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_106==NOT) ) {s = 133;}

                        else if ( (LA72_106==TILDA) && (synpred39_FTS())) {s = 134;}

                        else if ( (LA72_106==CARAT) && (synpred39_FTS())) {s = 135;}

                        else if ( (LA72_106==AND) && (synpred39_FTS())) {s = 136;}

                        else if ( (LA72_106==AMP) && (synpred39_FTS())) {s = 137;}

                        else if ( (LA72_106==EOF) && (synpred39_FTS())) {s = 138;}

                        else if ( (LA72_106==RPAREN) && (synpred39_FTS())) {s = 139;}

                        else if ( (LA72_106==OR) && (synpred39_FTS())) {s = 140;}

                        else if ( (LA72_106==BAR) && (synpred39_FTS())) {s = 141;}

                        else if ( (LA72_106==ID) ) {s = 142;}

                        else if ( (LA72_106==EXCLAMATION) && (synpred39_FTS())) {s = 143;}

                        else if ( (LA72_106==QUESTION_MARK||LA72_106==STAR) ) {s = 144;}

                        else if ( (LA72_106==AT) && (synpred39_FTS())) {s = 145;}

                        else if ( (LA72_106==DECIMAL_INTEGER_LITERAL||LA72_106==FLOATING_POINT_LITERAL||(LA72_106 >= FTSPRE && LA72_106 <= FTSWORD)) ) {s = 146;}

                        else if ( (LA72_106==URI) && (synpred39_FTS())) {s = 147;}

                        else if ( (LA72_106==FTSPHRASE) && (synpred39_FTS())) {s = 148;}

                        else if ( (LA72_106==COMMA||LA72_106==DOT) && (synpred39_FTS())) {s = 149;}

                        else if ( (LA72_106==EQUALS) && (synpred39_FTS())) {s = 150;}

                        else if ( (LA72_106==TO) ) {s = 151;}

                        else if ( (LA72_106==LSQUARE) && (synpred39_FTS())) {s = 152;}

                        else if ( (LA72_106==LT) && (synpred39_FTS())) {s = 153;}

                        else if ( (LA72_106==LPAREN) && (synpred39_FTS())) {s = 154;}

                        else if ( (LA72_106==PERCENT) && (synpred39_FTS())) {s = 155;}

                        else if ( (LA72_106==PLUS) && (synpred39_FTS())) {s = 156;}

                        else if ( (LA72_106==MINUS) && (synpred39_FTS())) {s = 157;}

                         
                        input.seek(index72_106);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA72_151 = input.LA(1);

                         
                        int index72_151 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_151==COMMA||LA72_151==DOT) ) {s = 160;}

                        else if ( (synpred37_FTS()) ) {s = 161;}

                        else if ( (synpred39_FTS()) ) {s = 157;}

                         
                        input.seek(index72_151);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA72_250 = input.LA(1);

                         
                        int index72_250 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred29_FTS()) ) {s = 267;}

                        else if ( (synpred31_FTS()) ) {s = 265;}

                         
                        input.seek(index72_250);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA72_212 = input.LA(1);

                         
                        int index72_212 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_212==NOT) ) {s = 216;}

                        else if ( (LA72_212==TILDA) && (synpred32_FTS())) {s = 217;}

                        else if ( (LA72_212==CARAT) && (synpred32_FTS())) {s = 218;}

                        else if ( (LA72_212==AND) && (synpred32_FTS())) {s = 219;}

                        else if ( (LA72_212==AMP) && (synpred32_FTS())) {s = 220;}

                        else if ( (LA72_212==EOF) && (synpred32_FTS())) {s = 221;}

                        else if ( (LA72_212==RPAREN) && (synpred32_FTS())) {s = 222;}

                        else if ( (LA72_212==OR) && (synpred32_FTS())) {s = 223;}

                        else if ( (LA72_212==BAR) && (synpred32_FTS())) {s = 224;}

                        else if ( (LA72_212==ID) ) {s = 225;}

                        else if ( (LA72_212==EXCLAMATION) && (synpred32_FTS())) {s = 226;}

                        else if ( (LA72_212==QUESTION_MARK||LA72_212==STAR) ) {s = 227;}

                        else if ( (LA72_212==AT) && (synpred32_FTS())) {s = 228;}

                        else if ( (LA72_212==DECIMAL_INTEGER_LITERAL||LA72_212==FLOATING_POINT_LITERAL||(LA72_212 >= FTSPRE && LA72_212 <= FTSWORD)) ) {s = 229;}

                        else if ( (LA72_212==URI) && (synpred32_FTS())) {s = 230;}

                        else if ( (LA72_212==FTSPHRASE) && (synpred32_FTS())) {s = 231;}

                        else if ( (LA72_212==COMMA||LA72_212==DOT) && (synpred32_FTS())) {s = 232;}

                        else if ( (LA72_212==EQUALS) && (synpred32_FTS())) {s = 233;}

                        else if ( (LA72_212==TO) ) {s = 234;}

                        else if ( (LA72_212==LSQUARE) && (synpred32_FTS())) {s = 235;}

                        else if ( (LA72_212==LT) && (synpred32_FTS())) {s = 236;}

                        else if ( (LA72_212==LPAREN) && (synpred32_FTS())) {s = 237;}

                        else if ( (LA72_212==PERCENT) && (synpred32_FTS())) {s = 238;}

                        else if ( (LA72_212==PLUS) && (synpred32_FTS())) {s = 239;}

                        else if ( (LA72_212==MINUS) && (synpred32_FTS())) {s = 240;}

                         
                        input.seek(index72_212);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA72_198 = input.LA(1);

                         
                        int index72_198 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_198==COMMA||LA72_198==DOT) ) {s = 214;}

                        else if ( (synpred33_FTS()) ) {s = 215;}

                        else if ( (synpred35_FTS()) ) {s = 211;}

                         
                        input.seek(index72_198);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA72_225 = input.LA(1);

                         
                        int index72_225 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred30_FTS()) ) {s = 266;}

                        else if ( (synpred32_FTS()) ) {s = 240;}

                         
                        input.seek(index72_225);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA72_133 = input.LA(1);

                         
                        int index72_133 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_133==COMMA||LA72_133==DOT) ) {s = 160;}

                        else if ( (synpred37_FTS()) ) {s = 161;}

                        else if ( (synpred39_FTS()) ) {s = 157;}

                         
                        input.seek(index72_133);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA72_173 = input.LA(1);

                         
                        int index72_173 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA72_173==COMMA||LA72_173==DOT) ) {s = 212;}

                        else if ( (synpred34_FTS()) ) {s = 213;}

                        else if ( (synpred36_FTS()) ) {s = 186;}

                         
                        input.seek(index72_173);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_ftsDisjunction_in_ftsQuery577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ftsQuery579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmisExplicitDisjunction_in_ftsDisjunction639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsExplicitDisjunction_in_ftsDisjunction653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsImplicitDisjunction_in_ftsDisjunction667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsImplicitConjunction_in_ftsExplicitDisjunction700 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000200L});
    public static final BitSet FOLLOW_or_in_ftsExplicitDisjunction703 = new BitSet(new long[]{0x8807A000024828F0L,0x000000003841148BL});
    public static final BitSet FOLLOW_ftsImplicitConjunction_in_ftsExplicitDisjunction705 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000200L});
    public static final BitSet FOLLOW_cmisConjunction_in_cmisExplicitDisjunction789 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000200L});
    public static final BitSet FOLLOW_or_in_cmisExplicitDisjunction792 = new BitSet(new long[]{0x0807A00000082800L,0x0000000010410088L});
    public static final BitSet FOLLOW_cmisConjunction_in_cmisExplicitDisjunction794 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000200L});
    public static final BitSet FOLLOW_or_in_ftsImplicitDisjunction879 = new BitSet(new long[]{0x8807A000024828C0L,0x000000003841148BL});
    public static final BitSet FOLLOW_ftsExplicitConjunction_in_ftsImplicitDisjunction882 = new BitSet(new long[]{0x8807A000024828C2L,0x000000003841168BL});
    public static final BitSet FOLLOW_ftsPrefixed_in_ftsExplicitConjunction969 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_in_ftsExplicitConjunction972 = new BitSet(new long[]{0x8807A000024828C0L,0x000000003841148BL});
    public static final BitSet FOLLOW_ftsPrefixed_in_ftsExplicitConjunction974 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_in_ftsImplicitConjunction1059 = new BitSet(new long[]{0x8807A000024828C0L,0x000000003841148BL});
    public static final BitSet FOLLOW_ftsPrefixed_in_ftsImplicitConjunction1062 = new BitSet(new long[]{0x8807A000024828F2L,0x000000003841148BL});
    public static final BitSet FOLLOW_cmisPrefixed_in_cmisConjunction1146 = new BitSet(new long[]{0x0807A00000082802L,0x0000000010410088L});
    public static final BitSet FOLLOW_not_in_ftsPrefixed1238 = new BitSet(new long[]{0x8807A00000482840L,0x0000000038410483L});
    public static final BitSet FOLLOW_ftsTest_in_ftsPrefixed1240 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsPrefixed1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsTest_in_ftsPrefixed1306 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsPrefixed1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_ftsPrefixed1372 = new BitSet(new long[]{0x8807A00000482840L,0x0000000038410483L});
    public static final BitSet FOLLOW_ftsTest_in_ftsPrefixed1374 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsPrefixed1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_ftsPrefixed1440 = new BitSet(new long[]{0x8807A00000482840L,0x0000000038410483L});
    public static final BitSet FOLLOW_ftsTest_in_ftsPrefixed1442 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsPrefixed1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_ftsPrefixed1508 = new BitSet(new long[]{0x8807A00000482840L,0x0000000038410483L});
    public static final BitSet FOLLOW_ftsTest_in_ftsPrefixed1510 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsPrefixed1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmisTest_in_cmisPrefixed1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_cmisPrefixed1657 = new BitSet(new long[]{0x0807A00000082800L,0x0000000010410080L});
    public static final BitSet FOLLOW_cmisTest_in_cmisPrefixed1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupProximity_in_ftsTest1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsTermOrPhrase_in_ftsTest1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsExactTermOrPhrase_in_ftsTest1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsTokenisedTermOrPhrase_in_ftsTest1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsRange_in_ftsTest1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroup_in_ftsTest1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ftsTest1998 = new BitSet(new long[]{0x8807A000024828F0L,0x000000003841168BL});
    public static final BitSet FOLLOW_ftsDisjunction_in_ftsTest2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_ftsTest2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_in_ftsTest2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmisTerm_in_cmisTest2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmisPhrase_in_cmisTest2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_template2229 = new BitSet(new long[]{0x0800000000000040L,0x0000000020000000L});
    public static final BitSet FOLLOW_tempReference_in_template2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_template2291 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_template2293 = new BitSet(new long[]{0x0800000000000040L,0x0000000020000000L});
    public static final BitSet FOLLOW_tempReference_in_template2296 = new BitSet(new long[]{0x0800000000000840L,0x0000000020080000L});
    public static final BitSet FOLLOW_COMMA_in_template2298 = new BitSet(new long[]{0x0800000000000040L,0x0000000020080000L});
    public static final BitSet FOLLOW_RPAREN_in_template2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDA_in_fuzzy2385 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_number_in_fuzzy2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDA_in_slop2468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DECIMAL_INTEGER_LITERAL_in_slop2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARAT_in_boost2551 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_number_in_boost2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReference_in_ftsTermOrPhrase2642 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_ftsTermOrPhrase2644 = new BitSet(new long[]{0x0807A00000082800L,0x0000000010410080L});
    public static final BitSet FOLLOW_FTSPHRASE_in_ftsTermOrPhrase2672 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsTermOrPhrase2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_ftsTermOrPhrase2747 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsTermOrPhrase2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FTSPHRASE_in_ftsTermOrPhrase2817 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsTermOrPhrase2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_ftsTermOrPhrase2875 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsTermOrPhrase2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_ftsExactTermOrPhrase2963 = new BitSet(new long[]{0x0807A00000082840L,0x0000000030410080L});
    public static final BitSet FOLLOW_fieldReference_in_ftsExactTermOrPhrase2991 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_ftsExactTermOrPhrase2993 = new BitSet(new long[]{0x0807A00000082800L,0x0000000010410080L});
    public static final BitSet FOLLOW_FTSPHRASE_in_ftsExactTermOrPhrase3021 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsExactTermOrPhrase3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_ftsExactTermOrPhrase3096 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsExactTermOrPhrase3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FTSPHRASE_in_ftsExactTermOrPhrase3166 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsExactTermOrPhrase3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_ftsExactTermOrPhrase3224 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsExactTermOrPhrase3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDA_in_ftsTokenisedTermOrPhrase3314 = new BitSet(new long[]{0x0807A00000082840L,0x0000000030410080L});
    public static final BitSet FOLLOW_fieldReference_in_ftsTokenisedTermOrPhrase3342 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_ftsTokenisedTermOrPhrase3344 = new BitSet(new long[]{0x0807A00000082800L,0x0000000010410080L});
    public static final BitSet FOLLOW_FTSPHRASE_in_ftsTokenisedTermOrPhrase3372 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsTokenisedTermOrPhrase3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_ftsTokenisedTermOrPhrase3447 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsTokenisedTermOrPhrase3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FTSPHRASE_in_ftsTokenisedTermOrPhrase3517 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsTokenisedTermOrPhrase3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_ftsTokenisedTermOrPhrase3575 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsTokenisedTermOrPhrase3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_cmisTerm3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FTSPHRASE_in_cmisPhrase3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReference_in_ftsRange3766 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_ftsRange3768 = new BitSet(new long[]{0x0807A00000002000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ftsFieldGroupRange_in_ftsRange3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReference_in_ftsFieldGroup3828 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_ftsFieldGroup3830 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_ftsFieldGroup3832 = new BitSet(new long[]{0x8807A000024828B0L,0x000000001841128BL});
    public static final BitSet FOLLOW_ftsFieldGroupDisjunction_in_ftsFieldGroup3834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_ftsFieldGroup3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupExplicitDisjunction_in_ftsFieldGroupDisjunction3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupImplicitDisjunction_in_ftsFieldGroupDisjunction3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupImplicitConjunction_in_ftsFieldGroupExplicitDisjunction3968 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000200L});
    public static final BitSet FOLLOW_or_in_ftsFieldGroupExplicitDisjunction3971 = new BitSet(new long[]{0x8807A000024828B0L,0x000000001841108BL});
    public static final BitSet FOLLOW_ftsFieldGroupImplicitConjunction_in_ftsFieldGroupExplicitDisjunction3973 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000200L});
    public static final BitSet FOLLOW_or_in_ftsFieldGroupImplicitDisjunction4058 = new BitSet(new long[]{0x8807A00002482880L,0x000000001841108BL});
    public static final BitSet FOLLOW_ftsFieldGroupExplicitConjunction_in_ftsFieldGroupImplicitDisjunction4061 = new BitSet(new long[]{0x8807A00002482882L,0x000000001841128BL});
    public static final BitSet FOLLOW_ftsFieldGroupPrefixed_in_ftsFieldGroupExplicitConjunction4148 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_in_ftsFieldGroupExplicitConjunction4151 = new BitSet(new long[]{0x8807A00002482880L,0x000000001841108BL});
    public static final BitSet FOLLOW_ftsFieldGroupPrefixed_in_ftsFieldGroupExplicitConjunction4153 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_in_ftsFieldGroupImplicitConjunction4238 = new BitSet(new long[]{0x8807A00002482880L,0x000000001841108BL});
    public static final BitSet FOLLOW_ftsFieldGroupPrefixed_in_ftsFieldGroupImplicitConjunction4241 = new BitSet(new long[]{0x8807A000024828B2L,0x000000001841108BL});
    public static final BitSet FOLLOW_not_in_ftsFieldGroupPrefixed4331 = new BitSet(new long[]{0x8807A00000482800L,0x0000000018410083L});
    public static final BitSet FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4333 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsFieldGroupPrefixed4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4399 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsFieldGroupPrefixed4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_ftsFieldGroupPrefixed4465 = new BitSet(new long[]{0x8807A00000482800L,0x0000000018410083L});
    public static final BitSet FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4467 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsFieldGroupPrefixed4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_ftsFieldGroupPrefixed4533 = new BitSet(new long[]{0x8807A00000482800L,0x0000000018410083L});
    public static final BitSet FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4535 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsFieldGroupPrefixed4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_ftsFieldGroupPrefixed4601 = new BitSet(new long[]{0x8807A00000482800L,0x0000000018410083L});
    public static final BitSet FOLLOW_ftsFieldGroupTest_in_ftsFieldGroupPrefixed4603 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_boost_in_ftsFieldGroupPrefixed4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupProximity_in_ftsFieldGroupTest4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupTerm_in_ftsFieldGroupTest4756 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsFieldGroupTest4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupExactTerm_in_ftsFieldGroupTest4831 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsFieldGroupTest4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupPhrase_in_ftsFieldGroupTest4906 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsFieldGroupTest4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupExactPhrase_in_ftsFieldGroupTest4981 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsFieldGroupTest4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupTokenisedPhrase_in_ftsFieldGroupTest5056 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_slop_in_ftsFieldGroupTest5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupSynonym_in_ftsFieldGroupTest5131 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_fuzzy_in_ftsFieldGroupTest5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupRange_in_ftsFieldGroupTest5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ftsFieldGroupTest5266 = new BitSet(new long[]{0x8807A000024828B0L,0x000000001841128BL});
    public static final BitSet FOLLOW_ftsFieldGroupDisjunction_in_ftsFieldGroupTest5268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_ftsFieldGroupTest5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWord_in_ftsFieldGroupTerm5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_ftsFieldGroupExactTerm5356 = new BitSet(new long[]{0x0807200000082800L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsFieldGroupTerm_in_ftsFieldGroupExactTerm5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FTSPHRASE_in_ftsFieldGroupPhrase5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_ftsFieldGroupExactPhrase5452 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ftsFieldGroupExactPhrase_in_ftsFieldGroupExactPhrase5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDA_in_ftsFieldGroupTokenisedPhrase5515 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ftsFieldGroupExactPhrase_in_ftsFieldGroupTokenisedPhrase5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDA_in_ftsFieldGroupSynonym5570 = new BitSet(new long[]{0x0807200000082800L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsFieldGroupTerm_in_ftsFieldGroupSynonym5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupProximityTerm_in_ftsFieldGroupProximity5625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_proximityGroup_in_ftsFieldGroupProximity5635 = new BitSet(new long[]{0x0807200000002000L,0x0000000010000080L});
    public static final BitSet FOLLOW_ftsFieldGroupProximityTerm_in_ftsFieldGroupProximity5637 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_STAR_in_proximityGroup5818 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_proximityGroup5821 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DECIMAL_INTEGER_LITERAL_in_proximityGroup5823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_proximityGroup5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5910 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOTDOT_in_ftsFieldGroupRange5912 = new BitSet(new long[]{0x0807A00000002000L});
    public static final BitSet FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_left_in_ftsFieldGroupRange5952 = new BitSet(new long[]{0x0807A00000002000L});
    public static final BitSet FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5954 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_TO_in_ftsFieldGroupRange5956 = new BitSet(new long[]{0x0807A00000002000L});
    public static final BitSet FOLLOW_ftsRangeWord_in_ftsFieldGroupRange5958 = new BitSet(new long[]{0x0400000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_range_right_in_ftsFieldGroupRange5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_range_left6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_range_left6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RSQUARE_in_range_right6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_range_right6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_fieldReference6192 = new BitSet(new long[]{0x0800000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_prefix_in_fieldReference6229 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_uri_in_fieldReference6249 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_identifier_in_fieldReference6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_tempReference6357 = new BitSet(new long[]{0x0800000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_prefix_in_tempReference6386 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_uri_in_tempReference6406 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_identifier_in_tempReference6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_prefix6514 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_prefix6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_uri6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier6699 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_identifier6701 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_identifier6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord6891 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord6897 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord6899 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord6905 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord6907 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord6913 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord6915 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord6921 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord6923 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord6989 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord6991 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord6997 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord6999 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7005 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7007 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7013 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7015 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord7088 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7094 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7096 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7102 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7104 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7110 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7112 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7118 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7184 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7186 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7192 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7194 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7200 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7202 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7208 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord7275 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7281 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7283 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7289 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7291 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7297 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7299 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7359 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7361 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7367 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7369 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7375 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7377 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord7441 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7447 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7449 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7455 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7457 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7463 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7521 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7523 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7529 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7531 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7537 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord7595 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7601 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7603 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7609 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7611 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7663 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7665 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7671 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7673 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord7730 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7736 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7738 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7744 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7795 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7797 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7803 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord7854 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7860 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7862 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7906 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7908 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord7956 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord7962 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord8004 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_ftsWord8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftsWord8022 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_ftsWord8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_or8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_or8394 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BAR_in_or8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_and8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_and8441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AMP_in_and8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_in_synpred1_FTS1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupProximity_in_synpred2_FTS1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReference_in_synpred3_FTS2635 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_synpred3_FTS2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred4_FTS2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred5_FTS2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred6_FTS2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred7_FTS2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReference_in_synpred8_FTS2984 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_synpred8_FTS2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred9_FTS3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred10_FTS3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred11_FTS3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred12_FTS3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReference_in_synpred13_FTS3335 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_synpred13_FTS3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred14_FTS3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred15_FTS3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred16_FTS3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred17_FTS3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_in_synpred18_FTS4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsFieldGroupProximity_in_synpred19_FTS4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred20_FTS4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred21_FTS4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred22_FTS4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred23_FTS4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slop_in_synpred24_FTS5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fuzzy_in_synpred25_FTS5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proximityGroup_in_synpred26_FTS5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefix_in_synpred27_FTS6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred28_FTS6679 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_synpred28_FTS6681 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ID_in_synpred28_FTS6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred29_FTS6836 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred29_FTS6842 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred29_FTS6844 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred29_FTS6850 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred29_FTS6852 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred29_FTS6858 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred29_FTS6860 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred29_FTS6866 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred29_FTS6868 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred29_FTS6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred30_FTS6942 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred30_FTS6944 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred30_FTS6950 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred30_FTS6952 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred30_FTS6958 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred30_FTS6960 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred30_FTS6966 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_synpred30_FTS6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred30_FTS6970 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred30_FTS6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred31_FTS7035 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred31_FTS7041 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred31_FTS7043 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred31_FTS7049 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred31_FTS7051 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred31_FTS7057 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred31_FTS7059 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred31_FTS7065 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred31_FTS7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred32_FTS7137 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred32_FTS7139 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred32_FTS7145 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred32_FTS7147 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred32_FTS7153 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred32_FTS7155 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred32_FTS7161 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred32_FTS7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred33_FTS7228 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred33_FTS7234 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred33_FTS7236 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred33_FTS7242 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred33_FTS7244 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred33_FTS7250 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred33_FTS7252 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred33_FTS7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred34_FTS7318 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred34_FTS7320 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred34_FTS7326 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred34_FTS7328 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred34_FTS7334 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred34_FTS7336 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred34_FTS7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred35_FTS7396 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred35_FTS7402 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred35_FTS7404 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred35_FTS7410 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred35_FTS7412 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred35_FTS7418 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred35_FTS7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred36_FTS7482 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred36_FTS7484 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred36_FTS7490 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred36_FTS7492 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred36_FTS7498 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred36_FTS7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred37_FTS7556 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred37_FTS7562 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred37_FTS7564 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred37_FTS7570 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred37_FTS7572 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred37_FTS7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred38_FTS7630 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred38_FTS7632 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred38_FTS7638 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred38_FTS7640 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred38_FTS7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred39_FTS7693 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred39_FTS7699 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred39_FTS7701 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred39_FTS7707 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred39_FTS7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred40_FTS7763 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred40_FTS7765 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred40_FTS7771 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred40_FTS7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred41_FTS7823 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred41_FTS7829 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred41_FTS7831 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred41_FTS7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred42_FTS7881 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred42_FTS7883 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred42_FTS7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred43_FTS7927 = new BitSet(new long[]{0x0807200000002000L,0x0000000010410080L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred43_FTS7933 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred43_FTS7935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftsWordBase_in_synpred44_FTS7981 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_synpred44_FTS7983 = new BitSet(new long[]{0x0000000000000002L});

}