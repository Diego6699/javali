// Generated from Javali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavaliLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "IF", "ELSE", "WHILE", "FOR", 
			"BREAK", "CONTINUE", "RETURN", "INT", "FLOAT", "CHAR", "BOOL", "SEMICOLON", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "DOUBLEQUOTE", 
			"SINGLEQUOTE", "ID", "CHAR_LITERAL", "STRING_CONTENT", "WS"
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


	public JavaliLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Javali.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001d\u00aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0096\b\u0019\n\u0019\f\u0019\u0099\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u00a0"+
		"\b\u001b\u000b\u001b\f\u001b\u00a1\u0001\u001c\u0004\u001c\u00a5\b\u001c"+
		"\u000b\u001c\f\u001c\u00a6\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u0005\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0002\u0000AZaz\u0001\u0000\"\"\u0003\u0000"+
		"\t\n\r\r  \u00ac\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000"+
		"\u0000\u0003=\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007"+
		"A\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bE\u0001\u0000"+
		"\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000"+
		"\u0011S\u0001\u0000\u0000\u0000\u0013W\u0001\u0000\u0000\u0000\u0015]"+
		"\u0001\u0000\u0000\u0000\u0017f\u0001\u0000\u0000\u0000\u0019m\u0001\u0000"+
		"\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001dw\u0001\u0000\u0000\u0000"+
		"\u001f|\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#\u0083"+
		"\u0001\u0000\u0000\u0000%\u0085\u0001\u0000\u0000\u0000\'\u0087\u0001"+
		"\u0000\u0000\u0000)\u0089\u0001\u0000\u0000\u0000+\u008b\u0001\u0000\u0000"+
		"\u0000-\u008d\u0001\u0000\u0000\u0000/\u008f\u0001\u0000\u0000\u00001"+
		"\u0091\u0001\u0000\u0000\u00003\u0093\u0001\u0000\u0000\u00005\u009a\u0001"+
		"\u0000\u0000\u00007\u009f\u0001\u0000\u0000\u00009\u00a4\u0001\u0000\u0000"+
		"\u0000;<\u0005+\u0000\u0000<\u0002\u0001\u0000\u0000\u0000=>\u0005-\u0000"+
		"\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005*\u0000\u0000@\u0006\u0001"+
		"\u0000\u0000\u0000AB\u0005/\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005"+
		"=\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005i\u0000\u0000FG\u0005"+
		"f\u0000\u0000G\f\u0001\u0000\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005"+
		"l\u0000\u0000JK\u0005s\u0000\u0000KL\u0005e\u0000\u0000L\u000e\u0001\u0000"+
		"\u0000\u0000MN\u0005w\u0000\u0000NO\u0005h\u0000\u0000OP\u0005i\u0000"+
		"\u0000PQ\u0005l\u0000\u0000QR\u0005e\u0000\u0000R\u0010\u0001\u0000\u0000"+
		"\u0000ST\u0005f\u0000\u0000TU\u0005o\u0000\u0000UV\u0005r\u0000\u0000"+
		"V\u0012\u0001\u0000\u0000\u0000WX\u0005b\u0000\u0000XY\u0005r\u0000\u0000"+
		"YZ\u0005e\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005k\u0000\u0000\\\u0014"+
		"\u0001\u0000\u0000\u0000]^\u0005c\u0000\u0000^_\u0005o\u0000\u0000_`\u0005"+
		"n\u0000\u0000`a\u0005t\u0000\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000"+
		"\u0000cd\u0005u\u0000\u0000de\u0005e\u0000\u0000e\u0016\u0001\u0000\u0000"+
		"\u0000fg\u0005r\u0000\u0000gh\u0005e\u0000\u0000hi\u0005t\u0000\u0000"+
		"ij\u0005u\u0000\u0000jk\u0005r\u0000\u0000kl\u0005n\u0000\u0000l\u0018"+
		"\u0001\u0000\u0000\u0000mn\u0005i\u0000\u0000no\u0005n\u0000\u0000op\u0005"+
		"t\u0000\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005f\u0000\u0000rs\u0005"+
		"l\u0000\u0000st\u0005o\u0000\u0000tu\u0005a\u0000\u0000uv\u0005t\u0000"+
		"\u0000v\u001c\u0001\u0000\u0000\u0000wx\u0005c\u0000\u0000xy\u0005h\u0000"+
		"\u0000yz\u0005a\u0000\u0000z{\u0005r\u0000\u0000{\u001e\u0001\u0000\u0000"+
		"\u0000|}\u0005b\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005o\u0000\u0000"+
		"\u007f\u0080\u0005l\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005;\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"(\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085\u0086\u0005)\u0000"+
		"\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u0088\u0005{\u0000\u0000\u0088"+
		"(\u0001\u0000\u0000\u0000\u0089\u008a\u0005}\u0000\u0000\u008a*\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005[\u0000\u0000\u008c,\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005]\u0000\u0000\u008e.\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\"\u0000\u0000\u00900\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\'\u0000\u0000\u00922\u0001\u0000\u0000\u0000\u0093\u0097\u0007"+
		"\u0000\u0000\u0000\u0094\u0096\u0007\u0001\u0000\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u00984\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\'\u0000"+
		"\u0000\u009b\u009c\u0007\u0002\u0000\u0000\u009c\u009d\u0005\'\u0000\u0000"+
		"\u009d6\u0001\u0000\u0000\u0000\u009e\u00a0\b\u0003\u0000\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"8\u0001\u0000\u0000\u0000\u00a3\u00a5\u0007\u0004\u0000\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0006\u001c\u0000\u0000\u00a9:\u0001"+
		"\u0000\u0000\u0000\u0004\u0000\u0097\u00a1\u00a6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}