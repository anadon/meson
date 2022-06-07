// Generated from edn.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ednParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NilLiteral=1, BooleanLiteral=2, StringLiteral=3, IntegerLiteral=4, FloatingPointLiteral=5, 
		CharacterLiteral=6, LeftParenthesis=7, RightParenthesis=8, LeftBracket=9, 
		RightBracket=10, LeftBrace=11, RightBrace=12, HashedLeftBrace=13, Hash=14, 
		Colon=15, FractionalPart=16, Int=17, Symbol=18, Name=19, Comment=20, Whitespace=21;
	public static final int
		RULE_program = 0, RULE_value = 1, RULE_tag = 2, RULE_keyword = 3, RULE_list_ = 4, 
		RULE_vector = 5, RULE_map_ = 6, RULE_set_ = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "value", "tag", "keyword", "list_", "vector", "map_", "set_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nil'", null, null, null, null, null, "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'#{'", "'#'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NilLiteral", "BooleanLiteral", "StringLiteral", "IntegerLiteral", 
			"FloatingPointLiteral", "CharacterLiteral", "LeftParenthesis", "RightParenthesis", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "HashedLeftBrace", 
			"Hash", "Colon", "FractionalPart", "Int", "Symbol", "Name", "Comment", 
			"Whitespace"
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
	public String getGrammarFileName() { return "edn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ednParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ednParser.EOF, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NilLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << HashedLeftBrace) | (1L << Hash) | (1L << Colon) | (1L << Symbol))) != 0)) {
				{
				{
				setState(16);
				value();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NilLiteral() { return getToken(ednParser.NilLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ednParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ednParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ednParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ednParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ednParser.CharacterLiteral, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Symbol() { return getToken(ednParser.Symbol, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public Map_Context map_() {
			return getRuleContext(Map_Context.class,0);
		}
		public Set_Context set_() {
			return getRuleContext(Set_Context.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NilLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(NilLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(StringLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				match(CharacterLiteral);
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 7);
				{
				setState(30);
				keyword();
				}
				break;
			case Symbol:
				enterOuterAlt(_localctx, 8);
				{
				setState(31);
				match(Symbol);
				}
				break;
			case Hash:
				enterOuterAlt(_localctx, 9);
				{
				setState(32);
				tag();
				}
				break;
			case LeftParenthesis:
				enterOuterAlt(_localctx, 10);
				{
				setState(33);
				list_();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 11);
				{
				setState(34);
				vector();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 12);
				{
				setState(35);
				map_();
				}
				break;
			case HashedLeftBrace:
				enterOuterAlt(_localctx, 13);
				{
				setState(36);
				set_();
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

	public static class TagContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(ednParser.Hash, 0); }
		public TerminalNode Symbol() { return getToken(ednParser.Symbol, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(Hash);
			setState(40);
			match(Symbol);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(ednParser.Colon, 0); }
		public TerminalNode Symbol() { return getToken(ednParser.Symbol, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ednParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ednParser.FloatingPointLiteral, 0); }
		public TerminalNode NilLiteral() { return getToken(ednParser.NilLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ednParser.BooleanLiteral, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(Colon);
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NilLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << Symbol))) != 0)) ) {
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

	public static class List_Context extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(ednParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(ednParser.RightParenthesis, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterList_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitList_(this);
		}
	}

	public final List_Context list_() throws RecognitionException {
		List_Context _localctx = new List_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LeftParenthesis);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NilLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << HashedLeftBrace) | (1L << Hash) | (1L << Colon) | (1L << Symbol))) != 0)) {
				{
				{
				setState(46);
				value();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(RightParenthesis);
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

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(ednParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(ednParser.RightBracket, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LeftBracket);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NilLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << HashedLeftBrace) | (1L << Hash) | (1L << Colon) | (1L << Symbol))) != 0)) {
				{
				{
				setState(55);
				value();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(RightBracket);
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

	public static class Map_Context extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(ednParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(ednParser.RightBrace, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Map_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterMap_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitMap_(this);
		}
	}

	public final Map_Context map_() throws RecognitionException {
		Map_Context _localctx = new Map_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_map_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(LeftBrace);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NilLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << HashedLeftBrace) | (1L << Hash) | (1L << Colon) | (1L << Symbol))) != 0)) {
				{
				{
				setState(64);
				value();
				setState(65);
				value();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(RightBrace);
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

	public static class Set_Context extends ParserRuleContext {
		public TerminalNode HashedLeftBrace() { return getToken(ednParser.HashedLeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(ednParser.RightBrace, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Set_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).enterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ednListener ) ((ednListener)listener).exitSet_(this);
		}
	}

	public final Set_Context set_() throws RecognitionException {
		Set_Context _localctx = new Set_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(HashedLeftBrace);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NilLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << HashedLeftBrace) | (1L << Hash) | (1L << Colon) | (1L << Symbol))) != 0)) {
				{
				{
				setState(75);
				value();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(RightBrace);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3(\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6\62\n\6\f\6\16\6\65\13"+
		"\6\3\6\3\6\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b"+
		"F\n\b\f\b\16\bI\13\b\3\b\3\b\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\t\3\t\3"+
		"\t\2\2\n\2\4\6\b\n\f\16\20\2\3\5\2\3\4\6\7\24\24\2^\2\25\3\2\2\2\4\'\3"+
		"\2\2\2\6)\3\2\2\2\b,\3\2\2\2\n/\3\2\2\2\f8\3\2\2\2\16A\3\2\2\2\20L\3\2"+
		"\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32(\7\3\2"+
		"\2\33(\7\4\2\2\34(\7\5\2\2\35(\7\6\2\2\36(\7\7\2\2\37(\7\b\2\2 (\5\b\5"+
		"\2!(\7\24\2\2\"(\5\6\4\2#(\5\n\6\2$(\5\f\7\2%(\5\16\b\2&(\5\20\t\2\'\32"+
		"\3\2\2\2\'\33\3\2\2\2\'\34\3\2\2\2\'\35\3\2\2\2\'\36\3\2\2\2\'\37\3\2"+
		"\2\2\' \3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2"+
		"\2\'&\3\2\2\2(\5\3\2\2\2)*\7\20\2\2*+\7\24\2\2+\7\3\2\2\2,-\7\21\2\2-"+
		".\t\2\2\2.\t\3\2\2\2/\63\7\t\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\n"+
		"\2\2\67\13\3\2\2\28<\7\13\2\29;\5\4\3\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\f\2\2@\r\3\2\2\2AG\7\r\2\2BC\5\4\3"+
		"\2CD\5\4\3\2DF\3\2\2\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2"+
		"\2IG\3\2\2\2JK\7\16\2\2K\17\3\2\2\2LP\7\17\2\2MO\5\4\3\2NM\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\16\2\2T\21\3\2\2\2"+
		"\b\25\'\63<GP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}