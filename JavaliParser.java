// Generated from Javali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IF=6, ELSE=7, WHILE=8, FOR=9, 
		BREAK=10, CONTINUE=11, RETURN=12, INT=13, FLOAT=14, CHAR=15, BOOL=16, 
		SEMICOLON=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, LBRACKET=22, 
		RBRACKET=23, DOUBLEQUOTE=24, SINGLEQUOTE=25, ID=26, CHAR_LITERAL=27, STRING_CONTENT=28, 
		WS=29;
	public static final int
		RULE_type = 0, RULE_expression = 1, RULE_variable = 2, RULE_charVariable = 3, 
		RULE_stringVariable = 4, RULE_program = 5, RULE_statement = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "expression", "variable", "charVariable", "stringVariable", "program", 
			"statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'if'", "'else'", "'while'", 
			"'for'", "'break'", "'continue'", "'return'", "'int'", "'float'", "'char'", 
			"'bool'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IF", "ELSE", "WHILE", "FOR", "BREAK", 
			"CONTINUE", "RETURN", "INT", "FLOAT", "CHAR", "BOOL", "SEMICOLON", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "DOUBLEQUOTE", 
			"SINGLEQUOTE", "ID", "CHAR_LITERAL", "STRING_CONTENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Javali.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaliParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JavaliParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(JavaliParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(JavaliParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaliParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JavaliParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(JavaliParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(JavaliParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(JavaliParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JavaliParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JavaliParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(17);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(18);
				match(FLOAT);
				}
				break;
			case CHAR:
				{
				setState(19);
				match(CHAR);
				}
				break;
			case BOOL:
				{
				setState(20);
				match(BOOL);
				}
				break;
			case ID:
				{
				setState(21);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(22);
				match(LPAREN);
				setState(23);
				expression(0);
				setState(24);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(28);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(29);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(30);
					expression(3);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaliParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			type();
			setState(37);
			match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(38);
				match(T__4);
				setState(39);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharVariableContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(JavaliParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(JavaliParser.ID, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JavaliParser.CHAR_LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaliParser.SEMICOLON, 0); }
		public CharVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterCharVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitCharVariable(this);
		}
	}

	public final CharVariableContext charVariable() throws RecognitionException {
		CharVariableContext _localctx = new CharVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_charVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(CHAR);
			setState(43);
			match(ID);
			setState(44);
			match(T__4);
			setState(45);
			match(CHAR_LITERAL);
			setState(46);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringVariableContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(JavaliParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(JavaliParser.ID, 0); }
		public List<TerminalNode> DOUBLEQUOTE() { return getTokens(JavaliParser.DOUBLEQUOTE); }
		public TerminalNode DOUBLEQUOTE(int i) {
			return getToken(JavaliParser.DOUBLEQUOTE, i);
		}
		public TerminalNode STRING_CONTENT() { return getToken(JavaliParser.STRING_CONTENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaliParser.SEMICOLON, 0); }
		public StringVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterStringVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitStringVariable(this);
		}
	}

	public final StringVariableContext stringVariable() throws RecognitionException {
		StringVariableContext _localctx = new StringVariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stringVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CHAR);
			setState(49);
			match(ID);
			setState(50);
			match(T__4);
			setState(51);
			match(DOUBLEQUOTE);
			setState(52);
			match(STRING_CONTENT);
			setState(53);
			match(DOUBLEQUOTE);
			setState(54);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaliParser.EOF, 0); }
		public List<CharVariableContext> charVariable() {
			return getRuleContexts(CharVariableContext.class);
		}
		public CharVariableContext charVariable(int i) {
			return getRuleContext(CharVariableContext.class,i);
		}
		public List<StringVariableContext> stringVariable() {
			return getRuleContexts(StringVariableContext.class);
		}
		public StringVariableContext stringVariable(int i) {
			return getRuleContext(StringVariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67502016L) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(56);
					charVariable();
					}
					break;
				case 2:
					{
					setState(57);
					stringVariable();
					}
					break;
				case 3:
					{
					setState(58);
					variable();
					}
					break;
				case 4:
					{
					setState(59);
					statement();
					}
					break;
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaliParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(JavaliParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(JavaliParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(JavaliParser.FOR, 0); }
		public TerminalNode BREAK() { return getToken(JavaliParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(JavaliParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(JavaliParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaliParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(IF);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(ELSE);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(WHILE);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(FOR);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				match(RETURN);
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				expression(0);
				setState(75);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001dP\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005=\b\u0005\n\u0005\f\u0005@\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006N\b"+
		"\u0006\u0001\u0006\u0000\u0001\u0002\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0002\u0001\u0000\r\u0010\u0001\u0000\u0001\u0004Z\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004$\u0001"+
		"\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000"+
		"\u0000\n>\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0007\u0000\u0000\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0006\u0001\uffff\uffff\u0000\u0011\u001b\u0005\r\u0000\u0000\u0012\u001b"+
		"\u0005\u000e\u0000\u0000\u0013\u001b\u0005\u000f\u0000\u0000\u0014\u001b"+
		"\u0005\u0010\u0000\u0000\u0015\u001b\u0005\u001a\u0000\u0000\u0016\u0017"+
		"\u0005\u0012\u0000\u0000\u0017\u0018\u0003\u0002\u0001\u0000\u0018\u0019"+
		"\u0005\u0013\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0010"+
		"\u0001\u0000\u0000\u0000\u001a\u0012\u0001\u0000\u0000\u0000\u001a\u0013"+
		"\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000\u0000\u0000\u001a\u0015"+
		"\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001b!\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\n\u0002\u0000\u0000\u001d\u001e\u0007\u0001"+
		"\u0000\u0000\u001e \u0003\u0002\u0001\u0003\u001f\u001c\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$%\u0003\u0000\u0000\u0000%(\u0005\u001a\u0000\u0000&\'\u0005\u0005"+
		"\u0000\u0000\')\u0003\u0002\u0001\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\u000f\u0000"+
		"\u0000+,\u0005\u001a\u0000\u0000,-\u0005\u0005\u0000\u0000-.\u0005\u001b"+
		"\u0000\u0000./\u0005\u0011\u0000\u0000/\u0007\u0001\u0000\u0000\u0000"+
		"01\u0005\u000f\u0000\u000012\u0005\u001a\u0000\u000023\u0005\u0005\u0000"+
		"\u000034\u0005\u0018\u0000\u000045\u0005\u001c\u0000\u000056\u0005\u0018"+
		"\u0000\u000067\u0005\u0011\u0000\u00007\t\u0001\u0000\u0000\u00008=\u0003"+
		"\u0006\u0003\u00009=\u0003\b\u0004\u0000:=\u0003\u0004\u0002\u0000;=\u0003"+
		"\f\u0006\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0000\u0000\u0001B\u000b\u0001"+
		"\u0000\u0000\u0000CN\u0005\u0006\u0000\u0000DN\u0005\u0007\u0000\u0000"+
		"EN\u0005\b\u0000\u0000FN\u0005\t\u0000\u0000GN\u0005\n\u0000\u0000HN\u0005"+
		"\u000b\u0000\u0000IN\u0005\f\u0000\u0000JK\u0003\u0002\u0001\u0000KL\u0005"+
		"\u0011\u0000\u0000LN\u0001\u0000\u0000\u0000MC\u0001\u0000\u0000\u0000"+
		"MD\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MF\u0001\u0000\u0000"+
		"\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000MI\u0001\u0000"+
		"\u0000\u0000MJ\u0001\u0000\u0000\u0000N\r\u0001\u0000\u0000\u0000\u0006"+
		"\u001a!(<>M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}