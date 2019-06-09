// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g 2010-12-14 19:35:03

package parser;

import util.*;		//NOTE: comment in debug


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class PBFFilter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NonZeroDigit", "Digit", "ExponentIndicator", "Sign", "Exponent", "PLUS", "MINUS", "IdentifierStart", "IdentifierPart", "WS", "LINE_COMMENT", "BLOCK_COMMENT", "INT_LITERAL", "DOUBLE_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "GT", "LT", "SEMI", "COMMA", "DOT", "COLON", "STAR", "SLASH", "EQ", "EQEQ", "BANGEQ", "LIBRARY", "MODEL", "COMPARTMENT", "PROCESS", "ENTITY", "TEMPLATE", "INF", "UNSPECIFIED", "INCOMPLETE", "NULL", "ID", "FILE", "DECL", "DEFS", "SUPER", "TYPE", "PARAM", "ARG", "CALL", "ITER", "STRUCT", "LIST", "INTER", "TES", "TPS", "IES", "IPS", "FES", "FPS", "MES", "MPS", "IKS", "TE", "TP", "IE", "IP", "FE", "FP", "ME", "MP", "TV", "IV", "TC", "IC", "PE", "AE", "PP", "AP", "ROLE", "AGG"
    };
    public static final int LT=26;
    public static final int STAR=31;
    public static final int FES=63;
    public static final int LBRACE=23;
    public static final int DOUBLE_LITERAL=17;
    public static final int Exponent=8;
    public static final int ME=74;
    public static final int PARAM=52;
    public static final int LIBRARY=36;
    public static final int ID=46;
    public static final int IC=79;
    public static final int EOF=-1;
    public static final int LPAREN=19;
    public static final int TPS=60;
    public static final int TYPE=51;
    public static final int ENTITY=40;
    public static final int IE=70;
    public static final int LBRACKET=21;
    public static final int RPAREN=20;
    public static final int SLASH=32;
    public static final int STRING_LITERAL=18;
    public static final int FE=72;
    public static final int ARG=53;
    public static final int IP=71;
    public static final int COMMA=28;
    public static final int MP=75;
    public static final int IV=77;
    public static final int BLOCK_COMMENT=15;
    public static final int BANGEQ=35;
    public static final int PLUS=9;
    public static final int MODEL=37;
    public static final int PP=82;
    public static final int ExponentIndicator=6;
    public static final int AE=81;
    public static final int SUPER=50;
    public static final int Sign=7;
    public static final int RBRACKET=22;
    public static final int EQ=33;
    public static final int DOT=29;
    public static final int IES=61;
    public static final int IdentifierPart=12;
    public static final int AP=83;
    public static final int EQEQ=34;
    public static final int TV=76;
    public static final int TE=68;
    public static final int INT_LITERAL=16;
    public static final int ROLE=84;
    public static final int RBRACE=24;
    public static final int LINE_COMMENT=14;
    public static final int ITER=55;
    public static final int NULL=45;
    public static final int TP=69;
    public static final int IdentifierStart=11;
    public static final int INTER=58;
    public static final int STRUCT=56;
    public static final int INCOMPLETE=44;
    public static final int DEFS=49;
    public static final int MINUS=10;
    public static final int FP=73;
    public static final int Digit=5;
    public static final int AGG=85;
    public static final int UNSPECIFIED=43;
    public static final int FILE=47;
    public static final int LIST=57;
    public static final int INF=42;
    public static final int SEMI=27;
    public static final int TC=78;
    public static final int TES=59;
    public static final int COLON=30;
    public static final int MES=65;
    public static final int IKS=67;
    public static final int WS=13;
    public static final int IPS=62;
    public static final int MPS=66;
    public static final int TEMPLATE=41;
    public static final int NonZeroDigit=4;
    public static final int DECL=48;
    public static final int COMPARTMENT=38;
    public static final int GT=25;
    public static final int FPS=64;
    public static final int CALL=54;
    public static final int PROCESS=39;
    public static final int PE=80;

    // delegates
    // delegators


        public PBFFilter(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public PBFFilter(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PBFFilter.tokenNames; }
    public String getGrammarFileName() { return "D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g"; }



    public void reportError(RecognitionException e) {
    	// if we've already reported an error and have not matched a token
    	// yet successfully, don't report any errors.
    	if ( state.errorRecovery ) {
    		//System.err.print("[SPURIOUS] ");
    		return;
    	}
    	state.syntaxErrors++; // don't count spurious
    	state.errorRecovery = true;

    	int linenum = e.line;
    	int posnum = e.charPositionInLine;
    		
    	String message = getErrorMessage(e, this.getTokenNames());
    	throw new ParsingException(linenum, posnum, message, e);			//NOTE: comment in debug
    	//displayRecognitionError(this.getTokenNames(), e);
    }


    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
    		throws RecognitionException {	
    	throw new MismatchedTokenException(ttype, input);
    }
    	


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:56:1: prog : node ;
    public final PBFFilter.prog_return prog() throws RecognitionException {
        PBFFilter.prog_return retval = new PBFFilter.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PBFFilter.node_return node1 = null;



        try {
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:57:2: ( node )
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:57:4: node
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_node_in_prog94);
            node1=node();

            state._fsp--;

            adaptor.addChild(root_0, node1.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    protected static class node_scope {
        Token token;
    }
    protected Stack node_stack = new Stack();

    public static class node_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "node"
    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:59:1: node : ( ^(c= CALL id= ID (param+= iterOrID )* ) -> ^( STRUCT[$c.getToken(), \"PP\"] ^( ID[$id.getToken(), \"template\"] $id) ^( ID[$id.getToken(), \"parameters\"] ( $param)* ) ) | ^( ({...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"PE\"] | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"AP\"] ^( ID[\"arg\"] $a) ) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TC\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IC\"] $a) | a= anyToken -> $a) ( (ff+= tree2 )* -> ^( $node ( $ff)* ) ) ) );
    public final PBFFilter.node_return node() throws RecognitionException {
        node_stack.push(new node_scope());
        PBFFilter.node_return retval = new PBFFilter.node_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree c=null;
        CommonTree id=null;
        List list_param=null;
        List list_ff=null;
        PBFFilter.anyToken_return a = null;

        RuleReturnScope param = null;
        RuleReturnScope ff = null;
        CommonTree c_tree=null;
        CommonTree id_tree=null;
        RewriteRuleNodeStream stream_CALL=new RewriteRuleNodeStream(adaptor,"token CALL");
        RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_iterOrID=new RewriteRuleSubtreeStream(adaptor,"rule iterOrID");
        RewriteRuleSubtreeStream stream_anyToken=new RewriteRuleSubtreeStream(adaptor,"rule anyToken");
        RewriteRuleSubtreeStream stream_tree2=new RewriteRuleSubtreeStream(adaptor,"rule tree2");
        try {
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:63:2: ( ^(c= CALL id= ID (param+= iterOrID )* ) -> ^( STRUCT[$c.getToken(), \"PP\"] ^( ID[$id.getToken(), \"template\"] $id) ^( ID[$id.getToken(), \"parameters\"] ( $param)* ) ) | ^( ({...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"PE\"] | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"AP\"] ^( ID[\"arg\"] $a) ) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TC\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IC\"] $a) | a= anyToken -> $a) ( (ff+= tree2 )* -> ^( $node ( $ff)* ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CALL) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==DOWN) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==ID) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==UP||LA4_4==ID||LA4_4==ITER) ) {
//               				           {($node.size()>2 && $node[-2]::token.getType() == STRUCT && $node[-2]::token.getText().equals("TP") && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals("processes"))}?=>
                          if ( (((node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TP") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("processes")))) ) {   //NOTE: hand-coded
                              alt4=1;
                            } else {
                           	alt4=2;
                            }
                        }
                        else if ( (LA4_4==DOWN) ) {
                            alt4=2;
                        }
                        else {
                        	 alt4=2;  // NOTE: hand-coded
                        }
                    }
                    else if ( (LA4_3==UP||(LA4_3>=PLUS && LA4_3<=MINUS)||(LA4_3>=INT_LITERAL && LA4_3<=STRING_LITERAL)||(LA4_3>=GT && LA4_3<=LT)||LA4_3==DOT||(LA4_3>=STAR && LA4_3<=MODEL)||(LA4_3>=INF && LA4_3<=UNSPECIFIED)||LA4_3==NULL||(LA4_3>=FILE && LA4_3<=DEFS)||LA4_3==PARAM||(LA4_3>=CALL && LA4_3<=MPS)||(LA4_3>=TE && LA4_3<=MP)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=PLUS && LA4_0<=MINUS)||(LA4_0>=INT_LITERAL && LA4_0<=STRING_LITERAL)||(LA4_0>=GT && LA4_0<=LT)||LA4_0==DOT||(LA4_0>=STAR && LA4_0<=MODEL)||(LA4_0>=INF && LA4_0<=UNSPECIFIED)||(LA4_0>=NULL && LA4_0<=DEFS)||LA4_0==PARAM||(LA4_0>=ITER && LA4_0<=MPS)||(LA4_0>=TE && LA4_0<=MP)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:65:4: ^(c= CALL id= ID (param+= iterOrID )* )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    c=(CommonTree)match(input,CALL,FOLLOW_CALL_in_node120);  
                    stream_CALL.add(c);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    id=(CommonTree)match(input,ID,FOLLOW_ID_in_node130);  
                    stream_ID.add(id);

                    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:67:17: (param+= iterOrID )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==ID||LA1_0==ITER) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:67:17: param+= iterOrID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_iterOrID_in_node134);
                    	    param=iterOrID();

                    	    state._fsp--;

                    	    stream_iterOrID.add(param.getTree());
                    	    if (list_param==null) list_param=new ArrayList();
                    	    list_param.add(param.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: ID, id, ID, param
                    // token labels: id
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: param
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_id=new RewriteRuleNodeStream(adaptor,"token id",id);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"token param",list_param);
                    root_0 = (CommonTree)adaptor.nil();
                    // 68:10: -> ^( STRUCT[$c.getToken(), \"PP\"] ^( ID[$id.getToken(), \"template\"] $id) ^( ID[$id.getToken(), \"parameters\"] ( $param)* ) )
                    {
                        // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:68:13: ^( STRUCT[$c.getToken(), \"PP\"] ^( ID[$id.getToken(), \"template\"] $id) ^( ID[$id.getToken(), \"parameters\"] ( $param)* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, c.getToken(), "PP"), root_1);

                        // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:68:43: ^( ID[$id.getToken(), \"template\"] $id)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ID, id.getToken(), "template"), root_2);

                        adaptor.addChild(root_2, stream_id.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:68:81: ^( ID[$id.getToken(), \"parameters\"] ( $param)* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ID, id.getToken(), "parameters"), root_2);

                        // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:68:116: ( $param)*
                        while ( stream_param.hasNext() ) {
                            adaptor.addChild(root_2, stream_param.nextTree());

                        }
                        stream_param.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:70:4: ^( ({...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"PE\"] | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"AP\"] ^( ID[\"arg\"] $a) ) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TC\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IC\"] $a) | a= anyToken -> $a) ( (ff+= tree2 )* -> ^( $node ( $ff)* ) ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();// D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:71:5: ({...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"PE\"] | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"AP\"] ^( ID[\"arg\"] $a) ) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TC\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IC\"] $a) | a= anyToken -> $a)
                    int alt2=11;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:72:6: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == STRUCT && $node.size()>2 && $node[-2]::token.getType() == STRUCT && $node[-2]::token.getText().equals(\"TE\") && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"vars\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node203);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 73:20: -> STRUCT[$a.tree.getToken(),\"TV\"]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "TV"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:75:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == STRUCT && $node.size()>2 && $node[-2]::token.getType() == STRUCT && ($node[-2]::token.getText().equals(\"TE\") || $node[-2]::token.getText().equals(\"TP\")) && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"consts\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node234);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 76:20: -> STRUCT[$a.tree.getToken(),\"TC\"]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "TC"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:78:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == STRUCT && $node.size()>2 && $node[-2]::token.getType() == STRUCT && $node[-2]::token.getText().equals(\"IE\") && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"vars\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node265);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 79:20: -> STRUCT[$a.tree.getToken(),\"IV\"]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "IV"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:81:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == STRUCT && $node.size()>2 && $node[-2]::token.getType() == STRUCT && ($node[-2]::token.getText().equals(\"IE\") || $node[-2]::token.getText().equals(\"IP\")) && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"consts\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node297);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 82:20: -> STRUCT[$a.tree.getToken(),\"IC\"]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "IC"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 5 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:85:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == PARAM))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == PARAM)");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node329);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 86:20: -> STRUCT[$a.tree.getToken(),\"PE\"]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "PE"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 6 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:97:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IP") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("processes")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == ID && $node.size()>2 && $node[-2]::token.getType() == STRUCT && $node[-2]::token.getText().equals(\"IP\") && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"processes\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node369);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: a
                            // token labels: 
                            // rule labels: retval, a
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 98:20: -> ^( STRUCT[$a.tree.getToken(),\"AP\"] ^( ID[\"arg\"] $a) )
                            {
                                // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:98:23: ^( STRUCT[$a.tree.getToken(),\"AP\"] ^( ID[\"arg\"] $a) )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "AP"), root_2);

                                // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:98:57: ^( ID[\"arg\"] $a)
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ID, "arg"), root_3);

                                adaptor.addChild(root_3, stream_a.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }

                                adaptor.addChild(root_1, root_2);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 7 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:102:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == ID && $node.size()>2 && $node[-2]::token.getType() == STRUCT && $node[-2]::token.getText().equals(\"TE\") && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"vars\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node410);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: a
                            // token labels: 
                            // rule labels: retval, a
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 103:20: -> ^( STRUCT[$a.tree.getToken(),\"TV\"] $a)
                            {
                                // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:103:23: ^( STRUCT[$a.tree.getToken(),\"TV\"] $a)
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "TV"), root_2);

                                adaptor.addChild(root_2, stream_a.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 8 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:105:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == ID && $node.size()>2 && $node[-2]::token.getType() == STRUCT && ($node[-2]::token.getText().equals(\"TE\") || $node[-2]::token.getText().equals(\"TP\")) && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"consts\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node444);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: a
                            // token labels: 
                            // rule labels: retval, a
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 106:20: -> ^( STRUCT[$a.tree.getToken(),\"TC\"] $a)
                            {
                                // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:106:23: ^( STRUCT[$a.tree.getToken(),\"TC\"] $a)
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "TC"), root_2);

                                adaptor.addChild(root_2, stream_a.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 9 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:108:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == ID && $node.size()>2 && $node[-2]::token.getType() == STRUCT && $node[-2]::token.getText().equals(\"IE\") && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"vars\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node478);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: a
                            // token labels: 
                            // rule labels: retval, a
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 109:20: -> ^( STRUCT[$a.tree.getToken(),\"IV\"] $a)
                            {
                                // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:109:23: ^( STRUCT[$a.tree.getToken(),\"IV\"] $a)
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "IV"), root_2);

                                adaptor.addChild(root_2, stream_a.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 10 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:111:7: {...}? =>a= anyToken
                            {
                            if ( !(((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {
                                throw new FailedPredicateException(input, "node", "(input.LA(1) == ID && $node.size()>2 && $node[-2]::token.getType() == STRUCT && ($node[-2]::token.getText().equals(\"IE\") || $node[-2]::token.getText().equals(\"IP\")) && $node[-1]::token.getType() == ID && $node[-1]::token.getText().equals(\"consts\"))");
                            }
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node512);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: a
                            // token labels: 
                            // rule labels: retval, a
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 112:20: -> ^( STRUCT[$a.tree.getToken(),\"IC\"] $a)
                            {
                                // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:112:23: ^( STRUCT[$a.tree.getToken(),\"IC\"] $a)
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, (a!=null?((CommonTree)a.tree):null).getToken(), "IC"), root_2);

                                adaptor.addChild(root_2, stream_a.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 11 :
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:119:7: a= anyToken
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_anyToken_in_node548);
                            a=anyToken();

                            state._fsp--;

                            stream_anyToken.add(a.getTree());


                            // AST REWRITE
                            // elements: a
                            // token labels: 
                            // rule labels: retval, a
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 119:18: -> $a
                            {
                                adaptor.addChild(root_0, stream_a.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    ((node_scope)node_stack.peek()).token = (a!=null?((CommonTree)a.tree):null).getToken();

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:121:5: ( (ff+= tree2 )* -> ^( $node ( $ff)* ) )
                        // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:121:6: (ff+= tree2 )*
                        {
                        // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:121:8: (ff+= tree2 )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=PLUS && LA3_0<=MINUS)||(LA3_0>=INT_LITERAL && LA3_0<=STRING_LITERAL)||(LA3_0>=GT && LA3_0<=LT)||LA3_0==DOT||(LA3_0>=STAR && LA3_0<=MODEL)||(LA3_0>=INF && LA3_0<=UNSPECIFIED)||(LA3_0>=NULL && LA3_0<=DEFS)||LA3_0==PARAM||(LA3_0>=CALL && LA3_0<=MPS)||(LA3_0>=TE && LA3_0<=MP)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:121:8: ff+= tree2
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_tree2_in_node571);
                        	    ff=tree2();

                        	    state._fsp--;

                        	    stream_tree2.add(ff.getTree());
                        	    if (list_ff==null) list_ff=new ArrayList();
                        	    list_ff.add(ff.getTree());


                        	    }
                        	    break;

                        	default :
                        	    break loop3;
                            }
                        } while (true);



                        // AST REWRITE
                        // elements: ff, node
                        // token labels: 
                        // rule labels: retval
                        // token list labels: 
                        // rule list labels: ff
                        // wildcard labels: 
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                        RewriteRuleSubtreeStream stream_ff=new RewriteRuleSubtreeStream(adaptor,"token ff",list_ff);
                        root_0 = (CommonTree)adaptor.nil();
                        // 121:17: -> ^( $node ( $ff)* )
                        {
                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:121:20: ^( $node ( $ff)* )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_retval.nextNode(), root_2);

                            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:121:28: ( $ff)*
                            while ( stream_ff.hasNext() ) {
                                adaptor.addChild(root_2, stream_ff.nextTree());

                            }
                            stream_ff.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }

                        retval.tree = root_0;
                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            node_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "node"

    public static class tree2_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tree2"
    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:128:1: tree2 : node ;
    public final PBFFilter.tree2_return tree2() throws RecognitionException {
        PBFFilter.tree2_return retval = new PBFFilter.tree2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PBFFilter.node_return node2 = null;



        try {
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:129:2: ( node )
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:129:4: node
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_node_in_tree2605);
            node2=node();

            state._fsp--;

            adaptor.addChild(root_0, node2.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tree2"

    public static class iterOrID_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterOrID"
    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:133:1: iterOrID : ( ID | ^( ITER ID ID ) );
    public final PBFFilter.iterOrID_return iterOrID() throws RecognitionException {
        PBFFilter.iterOrID_return retval = new PBFFilter.iterOrID_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID3=null;
        CommonTree ITER4=null;
        CommonTree ID5=null;
        CommonTree ID6=null;

        CommonTree ID3_tree=null;
        CommonTree ITER4_tree=null;
        CommonTree ID5_tree=null;
        CommonTree ID6_tree=null;

        try {
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:134:2: ( ID | ^( ITER ID ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==ITER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:134:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_iterOrID617); 
                    ID3_tree = (CommonTree)adaptor.dupNode(ID3);

                    adaptor.addChild(root_0, ID3_tree);


                    }
                    break;
                case 2 :
                    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:135:4: ^( ITER ID ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ITER4=(CommonTree)match(input,ITER,FOLLOW_ITER_in_iterOrID623); 
                    ITER4_tree = (CommonTree)adaptor.dupNode(ITER4);

                    root_1 = (CommonTree)adaptor.becomeRoot(ITER4_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_iterOrID625); 
                    ID5_tree = (CommonTree)adaptor.dupNode(ID5);

                    adaptor.addChild(root_1, ID5_tree);

                    _last = (CommonTree)input.LT(1);
                    ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_iterOrID627); 
                    ID6_tree = (CommonTree)adaptor.dupNode(ID6);

                    adaptor.addChild(root_1, ID6_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iterOrID"

    public static class anyToken_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anyToken"
    // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:140:1: anyToken : ( INT_LITERAL | DOUBLE_LITERAL | STRING_LITERAL | ID | LIST | INTER | PARAM | TE | TP | IE | IP | FE | FP | ME | MP | STRUCT | DEFS | TES | TPS | IES | IPS | FES | FPS | MES | MPS | FILE | DECL | MODEL | LIBRARY | CALL | DOT | EQ | EQEQ | BANGEQ | LT | GT | PLUS | MINUS | STAR | SLASH | ITER | NULL | INF | UNSPECIFIED );
    public final PBFFilter.anyToken_return anyToken() throws RecognitionException {
        PBFFilter.anyToken_return retval = new PBFFilter.anyToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set7=null;

        CommonTree set7_tree=null;

        try {
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:141:2: ( INT_LITERAL | DOUBLE_LITERAL | STRING_LITERAL | ID | LIST | INTER | PARAM | TE | TP | IE | IP | FE | FP | ME | MP | STRUCT | DEFS | TES | TPS | IES | IPS | FES | FPS | MES | MPS | FILE | DECL | MODEL | LIBRARY | CALL | DOT | EQ | EQEQ | BANGEQ | LT | GT | PLUS | MINUS | STAR | SLASH | ITER | NULL | INF | UNSPECIFIED )
            // D:\\Workspace\\Eclipse Workspace\\ParserProject\\PBFFilter.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set7=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||(input.LA(1)>=INT_LITERAL && input.LA(1)<=STRING_LITERAL)||(input.LA(1)>=GT && input.LA(1)<=LT)||input.LA(1)==DOT||(input.LA(1)>=STAR && input.LA(1)<=MODEL)||(input.LA(1)>=INF && input.LA(1)<=UNSPECIFIED)||(input.LA(1)>=NULL && input.LA(1)<=DEFS)||input.LA(1)==PARAM||(input.LA(1)>=CALL && input.LA(1)<=MPS)||(input.LA(1)>=TE && input.LA(1)<=MP) ) {
                input.consume();

                set7_tree = (CommonTree)adaptor.dupNode(set7);

                adaptor.addChild(root_0, set7_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "anyToken"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\11\1\0\13\uffff";
    static final String DFA2_maxS =
        "\1\113\1\0\13\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA2_specialS =
        "\1\uffff\1\0\13\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\1\5\uffff\3\1\6\uffff\2\1\2\uffff\1\1\1\uffff\7\1\4\uffff"+
            "\2\1\1\uffff\5\1\2\uffff\1\1\1\uffff\15\1\1\uffff\10\1",
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
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "71:5: ({...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"TC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IV\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"IC\"] | {...}? =>a= anyToken -> STRUCT[$a.tree.getToken(),\"PE\"] | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"AP\"] ^( ID[\"arg\"] $a) ) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"TC\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IV\"] $a) | {...}? =>a= anyToken -> ^( STRUCT[$a.tree.getToken(),\"IC\"] $a) | a= anyToken -> $a)";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {s = 2;}

                        else if ( (((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {s = 3;}

                        else if ( (((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {s = 4;}

                        else if ( (((input.LA(1) == STRUCT && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {s = 5;}

                        else if ( (((input.LA(1) == PARAM))) ) {s = 6;}

                        else if ( (((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IP") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("processes")))) ) {s = 7;}

                        else if ( (((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {s = 8;}

                        else if ( (((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("TP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {s = 9;}

                        else if ( (((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("vars")))) ) {s = 10;}

                        else if ( (((input.LA(1) == ID && node_stack.size()>2 && ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getType() == STRUCT && (((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IE") || ((node_scope)node_stack.elementAt(node_stack.size()-2-1)).token.getText().equals("IP")) && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getType() == ID && ((node_scope)node_stack.elementAt(node_stack.size()-1-1)).token.getText().equals("consts")))) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_node_in_prog94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_node120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node130 = new BitSet(new long[]{0x0080400000000008L});
    public static final BitSet FOLLOW_iterOrID_in_node134 = new BitSet(new long[]{0x0080400000000008L});
    public static final BitSet FOLLOW_anyToken_in_node203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node512 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anyToken_in_node548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tree2_in_node571 = new BitSet(new long[]{0xFFD3EC3FA6070608L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_node_in_tree2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_iterOrID617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITER_in_iterOrID623 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_iterOrID625 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_iterOrID627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_anyToken0 = new BitSet(new long[]{0x0000000000000002L});

}