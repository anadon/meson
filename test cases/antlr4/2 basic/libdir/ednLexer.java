// Generated from edn.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ednLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NilLiteral=1, BooleanLiteral=2, StringLiteral=3, IntegerLiteral=4, FloatingPointLiteral=5, 
		CharacterLiteral=6, LeftParenthesis=7, RightParenthesis=8, LeftBracket=9, 
		RightBracket=10, LeftBrace=11, RightBrace=12, HashedLeftBrace=13, Hash=14, 
		Colon=15, FractionalPart=16, Int=17, Symbol=18, Name=19, Comment=20, Whitespace=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NilLiteral", "BooleanLiteral", "StringLiteral", "IntegerLiteral", "FloatingPointLiteral", 
			"CharacterLiteral", "LeftParenthesis", "RightParenthesis", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "HashedLeftBrace", "Hash", 
			"Colon", "FractionalPart", "Exponent", "E", "Int", "Digit", "HexDigit", 
			"UnicodeCharacter", "Symbol", "Name", "Alpha", "Numeric", "Extra", "Special", 
			"Comment", "Whitespace"
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


	public ednLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "edn.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0106\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4T\n\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\5\5_\n\5\3\6"+
		"\3\6\3\6\5\6d\n\6\3\6\5\6g\n\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0094"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\6\21\u00ab\n\21\r\21\16\21\u00ac\3\22\3"+
		"\22\6\22\u00b1\n\22\r\22\16\22\u00b2\3\23\3\23\5\23\u00b7\n\23\3\24\5"+
		"\24\u00ba\n\24\3\24\3\24\3\24\7\24\u00bf\n\24\f\24\16\24\u00c2\13\24\5"+
		"\24\u00c4\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u00d4\n\30\5\30\u00d6\n\30\3\31\3\31\3\31\3\31\5"+
		"\31\u00dc\n\31\3\31\3\31\5\31\u00e0\n\31\5\31\u00e2\n\31\3\31\3\31\3\31"+
		"\3\31\7\31\u00e8\n\31\f\31\16\31\u00eb\13\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\7\36\u00f7\n\36\f\36\16\36\u00fa\13\36\3\36"+
		"\5\36\u00fd\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\u00f8\2 \3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\2%\2\'\23)\2+\2-\2/\24\61\25\63\2\65\2\67\29\2;\26=\27\3\2\16"+
		"\4\2$$^^\t\2$$^^dehhppttvv\5\2\13\f\17\17\"\"\4\2GGgg\4\2--//\3\2\63;"+
		"\3\2\62;\5\2\62;CHch\4\2--/\60\b\2##&(,-/\60>Aaa\4\2%%<<\6\2\13\f\16\17"+
		"\"\"..\3\u0270\2C\2\\\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00bc\2"+
		"\u00bc\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3"+
		"\2\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0372\2\u0376\2\u0378"+
		"\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a\2\u038c"+
		"\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483\2\u048c"+
		"\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0562\2\u058a\2\u05d2\2\u05ec"+
		"\2\u05f1\2\u05f4\2\u0622\2\u064c\2\u0670\2\u0671\2\u0673\2\u06d5\2\u06d7"+
		"\2\u06d7\2\u06e7\2\u06e8\2\u06f0\2\u06f1\2\u06fc\2\u06fe\2\u0701\2\u0701"+
		"\2\u0712\2\u0712\2\u0714\2\u0731\2\u074f\2\u07a7\2\u07b3\2\u07b3\2\u07cc"+
		"\2\u07ec\2\u07f6\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0817\2\u081c\2\u081c"+
		"\2\u0826\2\u0826\2\u082a\2\u082a\2\u0842\2\u085a\2\u0862\2\u086c\2\u08a2"+
		"\2\u08b6\2\u08b8\2\u08c9\2\u0906\2\u093b\2\u093f\2\u093f\2\u0952\2\u0952"+
		"\2\u095a\2\u0963\2\u0973\2\u0982\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995"+
		"\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09bf"+
		"\2\u09d0\2\u09d0\2\u09de\2\u09df\2\u09e1\2\u09e3\2\u09f2\2\u09f3\2\u09fe"+
		"\2\u09fe\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32"+
		"\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a5b\2\u0a5e\2\u0a60"+
		"\2\u0a60\2\u0a74\2\u0a76\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa"+
		"\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0abf\2\u0ad2"+
		"\2\u0ad2\2\u0ae2\2\u0ae3\2\u0afb\2\u0afb\2\u0b07\2\u0b0e\2\u0b11\2\u0b12"+
		"\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f"+
		"\2\u0b3f\2\u0b5e\2\u0b5f\2\u0b61\2\u0b63\2\u0b73\2\u0b73\2\u0b85\2\u0b85"+
		"\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e"+
		"\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb"+
		"\2\u0bd2\2\u0bd2\2\u0c07\2\u0c0e\2\u0c10\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c"+
		"\2\u0c3b\2\u0c3f\2\u0c3f\2\u0c5a\2\u0c5c\2\u0c62\2\u0c63\2\u0c82\2\u0c82"+
		"\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7"+
		"\2\u0cbb\2\u0cbf\2\u0cbf\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce3\2\u0cf3\2\u0cf4"+
		"\2\u0d06\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d3f\2\u0d50"+
		"\2\u0d50\2\u0d56\2\u0d58\2\u0d61\2\u0d63\2\u0d7c\2\u0d81\2\u0d87\2\u0d98"+
		"\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0e03"+
		"\2\u0e32\2\u0e34\2\u0e35\2\u0e42\2\u0e48\2\u0e83\2\u0e84\2\u0e86\2\u0e86"+
		"\2\u0e88\2\u0e8c\2\u0e8e\2\u0ea5\2\u0ea7\2\u0ea7\2\u0ea9\2\u0eb2\2\u0eb4"+
		"\2\u0eb5\2\u0ebf\2\u0ebf\2\u0ec2\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ede\2\u0ee1"+
		"\2\u0f02\2\u0f02\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f8a\2\u0f8e\2\u1002"+
		"\2\u102c\2\u1041\2\u1041\2\u1052\2\u1057\2\u105c\2\u105f\2\u1063\2\u1063"+
		"\2\u1067\2\u1068\2\u1070\2\u1072\2\u1077\2\u1083\2\u1090\2\u1090\2\u10a2"+
		"\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe\2\u124a"+
		"\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262"+
		"\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0"+
		"\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314"+
		"\2\u1317\2\u131a\2\u135c\2\u1382\2\u1391\2\u13a2\2\u13f7\2\u13fa\2\u13ff"+
		"\2\u1403\2\u166e\2\u1671\2\u1681\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f3"+
		"\2\u16fa\2\u1702\2\u170e\2\u1710\2\u1713\2\u1722\2\u1733\2\u1742\2\u1753"+
		"\2\u1762\2\u176e\2\u1770\2\u1772\2\u1782\2\u17b5\2\u17d9\2\u17d9\2\u17de"+
		"\2\u17de\2\u1822\2\u187a\2\u1882\2\u1886\2\u1889\2\u18aa\2\u18ac\2\u18ac"+
		"\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982"+
		"\2\u19ad\2\u19b2\2\u19cb\2\u1a02\2\u1a18\2\u1a22\2\u1a56\2\u1aa9\2\u1aa9"+
		"\2\u1b07\2\u1b35\2\u1b47\2\u1b4d\2\u1b85\2\u1ba2\2\u1bb0\2\u1bb1\2\u1bbc"+
		"\2\u1be7\2\u1c02\2\u1c25\2\u1c4f\2\u1c51\2\u1c5c\2\u1c7f\2\u1c82\2\u1c8a"+
		"\2\u1c92\2\u1cbc\2\u1cbf\2\u1cc1\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf5\2\u1cf7"+
		"\2\u1cf8\2\u1cfc\2\u1cfc\2\u1d02\2\u1dc1\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f"+
		"\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d"+
		"\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe"+
		"\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8"+
		"\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u2073\2\u2073"+
		"\2\u2081\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109\2\u2109\2\u210c"+
		"\2\u2115\2\u2117\2\u2117\2\u211b\2\u211f\2\u2126\2\u2126\2\u2128\2\u2128"+
		"\2\u212a\2\u212a\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141\2\u2147"+
		"\2\u214b\2\u2150\2\u2150\2\u2185\2\u2186\2\u2c02\2\u2c30\2\u2c32\2\u2c60"+
		"\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5\2\u2d02\2\u2d27\2\u2d29"+
		"\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71\2\u2d71\2\u2d82\2\u2d98"+
		"\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8\2\u2dba\2\u2dc0\2\u2dc2"+
		"\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0\2\u2e31\2\u2e31"+
		"\2\u3007\2\u3008\2\u3033\2\u3037\2\u303d\2\u303e\2\u3043\2\u3098\2\u309f"+
		"\2\u30a1\2\u30a3\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3131\2\u3133\2\u3190"+
		"\2\u31a2\2\u31c1\2\u31f2\2\u3201\2\u3402\2\u4dc1\2\u4e02\2\u9ffe\2\ua002"+
		"\2\ua48e\2\ua4d2\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua621\2\ua62c\2\ua62d"+
		"\2\ua642\2\ua670\2\ua681\2\ua69f\2\ua6a2\2\ua6e7\2\ua719\2\ua721\2\ua724"+
		"\2\ua78a\2\ua78d\2\ua7c1\2\ua7c4\2\ua7cc\2\ua7f7\2\ua803\2\ua805\2\ua807"+
		"\2\ua809\2\ua80c\2\ua80e\2\ua824\2\ua842\2\ua875\2\ua884\2\ua8b5\2\ua8f4"+
		"\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua900\2\ua90c\2\ua927\2\ua932\2\ua948"+
		"\2\ua962\2\ua97e\2\ua986\2\ua9b4\2\ua9d1\2\ua9d1\2\ua9e2\2\ua9e6\2\ua9e8"+
		"\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa2a\2\uaa42\2\uaa44\2\uaa46\2\uaa4d"+
		"\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaab1\2\uaab3\2\uaab3\2\uaab7"+
		"\2\uaab8\2\uaabb\2\uaabf\2\uaac2\2\uaac2\2\uaac4\2\uaac4\2\uaadd\2\uaadf"+
		"\2\uaae2\2\uaaec\2\uaaf4\2\uaaf6\2\uab03\2\uab08\2\uab0b\2\uab10\2\uab13"+
		"\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c\2\uab5e\2\uab6b"+
		"\2\uab72\2\uabe4\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd\2\uf902"+
		"\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15\2\ufb19\2\ufb1f\2\ufb1f"+
		"\2\ufb21\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40\2\ufb42"+
		"\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52\2\ufd91"+
		"\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76\2\ufe78\2\ufefe\2\uff23"+
		"\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1"+
		"\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R"+
		"\3_\3\u0082\3\u00fc\3\u0282\3\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321\3"+
		"\u032f\3\u0342\3\u0344\3\u034b\3\u0352\3\u0377\3\u0382\3\u039f\3\u03a2"+
		"\3\u03c5\3\u03ca\3\u03d1\3\u0402\3\u049f\3\u04b2\3\u04d5\3\u04da\3\u04fd"+
		"\3\u0502\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762"+
		"\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a"+
		"\3\u083e\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2"+
		"\3\u08f4\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9"+
		"\3\u09c0\3\u09c1\3\u0a02\3\u0a02\3\u0a12\3\u0a15\3\u0a17\3\u0a19\3\u0a1b"+
		"\3\u0a37\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6"+
		"\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93\3\u0c02"+
		"\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4\3\u0d02\3\u0d25\3\u0e82\3\u0eab"+
		"\3\u0eb2\3\u0eb3\3\u0f02\3\u0f1e\3\u0f29\3\u0f29\3\u0f32\3\u0f47\3\u0fb2"+
		"\3\u0fc6\3\u0fe2\3\u0ff8\3\u1005\3\u1039\3\u1085\3\u10b1\3\u10d2\3\u10ea"+
		"\3\u1105\3\u1128\3\u1146\3\u1146\3\u1149\3\u1149\3\u1152\3\u1174\3\u1178"+
		"\3\u1178\3\u1185\3\u11b4\3\u11c3\3\u11c6\3\u11dc\3\u11dc\3\u11de\3\u11de"+
		"\3\u1202\3\u1213\3\u1215\3\u122d\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c"+
		"\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12aa\3\u12b2\3\u12e0\3\u1307\3\u130e"+
		"\3\u1311\3\u1312\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337"+
		"\3\u133b\3\u133f\3\u133f\3\u1352\3\u1352\3\u135f\3\u1363\3\u1402\3\u1436"+
		"\3\u1449\3\u144c\3\u1461\3\u1463\3\u1482\3\u14b1\3\u14c6\3\u14c7\3\u14c9"+
		"\3\u14c9\3\u1582\3\u15b0\3\u15da\3\u15dd\3\u1602\3\u1631\3\u1646\3\u1646"+
		"\3\u1682\3\u16ac\3\u16ba\3\u16ba\3\u1702\3\u171c\3\u1802\3\u182d\3\u18a2"+
		"\3\u18e1\3\u1901\3\u1908\3\u190b\3\u190b\3\u190e\3\u1915\3\u1917\3\u1918"+
		"\3\u191a\3\u1931\3\u1941\3\u1941\3\u1943\3\u1943\3\u19a2\3\u19a9\3\u19ac"+
		"\3\u19d2\3\u19e3\3\u19e3\3\u19e5\3\u19e5\3\u1a02\3\u1a02\3\u1a0d\3\u1a34"+
		"\3\u1a3c\3\u1a3c\3\u1a52\3\u1a52\3\u1a5e\3\u1a8b\3\u1a9f\3\u1a9f\3\u1ac2"+
		"\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c\3\u1c30\3\u1c42\3\u1c42\3\u1c74\3\u1c91"+
		"\3\u1d02\3\u1d08\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d32\3\u1d48\3\u1d48\3\u1d62"+
		"\3\u1d67\3\u1d69\3\u1d6a\3\u1d6c\3\u1d8b\3\u1d9a\3\u1d9a\3\u1ee2\3\u1ef4"+
		"\3\u1fb2\3\u1fb2\3\u2002\3\u239b\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402"+
		"\3\u4648\3\u6802\3\u6a3a\3\u6a42\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b31"+
		"\3\u6b42\3\u6b45\3\u6b65\3\u6b79\3\u6b7f\3\u6b91\3\u6e42\3\u6e81\3\u6f02"+
		"\3\u6f4c\3\u6f52\3\u6f52\3\u6f95\3\u6fa1\3\u6fe2\3\u6fe3\3\u6fe5\3\u6fe5"+
		"\3\u7002\3\u87f9\3\u8802\3\u8cd7\3\u8d02\3\u8d0a\3\ub002\3\ub120\3\ub152"+
		"\3\ub154\3\ub166\3\ub169\3\ub172\3\ub2fd\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e"+
		"\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0"+
		"\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb"+
		"\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f"+
		"\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546"+
		"\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4"+
		"\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750"+
		"\3\ud752\3\ud770\3\ud772\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6"+
		"\3\ud7cd\3\ue102\3\ue12e\3\ue139\3\ue13f\3\ue150\3\ue150\3\ue2c2\3\ue2ed"+
		"\3\ue802\3\ue8c6\3\ue902\3\ue945\3\ue94d\3\ue94d\3\uee02\3\uee05\3\uee07"+
		"\3\uee21\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34"+
		"\3\uee36\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49"+
		"\3\uee49\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54"+
		"\3\uee56\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f"+
		"\3\uee5f\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c"+
		"\3\uee6e\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82"+
		"\3\uee8b\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd"+
		"\3\2\4\ua6df\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4\ucea3\4\uceb2\4"+
		"\uebe2\4\uf802\4\ufa1f\4\2\5\u134c\5\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2\'\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5L\3\2\2\2\7N\3\2\2\2\t\\\3\2\2\2"+
		"\13`\3\2\2\2\rj\3\2\2\2\17\u0095\3\2\2\2\21\u0097\3\2\2\2\23\u0099\3\2"+
		"\2\2\25\u009b\3\2\2\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00a1\3\2\2"+
		"\2\35\u00a4\3\2\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00ae\3\2\2\2%\u00b4"+
		"\3\2\2\2\'\u00b9\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2"+
		"/\u00d5\3\2\2\2\61\u00e1\3\2\2\2\63\u00ec\3\2\2\2\65\u00ee\3\2\2\2\67"+
		"\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f4\3\2\2\2=\u0102\3\2\2\2?@\7p\2\2@"+
		"A\7k\2\2AB\7n\2\2B\4\3\2\2\2CD\7v\2\2DE\7t\2\2EF\7w\2\2FM\7g\2\2GH\7h"+
		"\2\2HI\7c\2\2IJ\7n\2\2JK\7u\2\2KM\7g\2\2LC\3\2\2\2LG\3\2\2\2M\6\3\2\2"+
		"\2NW\7$\2\2OV\n\2\2\2PS\7^\2\2QT\t\3\2\2RT\5-\27\2SQ\3\2\2\2SR\3\2\2\2"+
		"TV\3\2\2\2UO\3\2\2\2UP\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2"+
		"YW\3\2\2\2Z[\7$\2\2[\b\3\2\2\2\\^\5\'\24\2]_\7P\2\2^]\3\2\2\2^_\3\2\2"+
		"\2_\n\3\2\2\2`h\5\'\24\2ai\7O\2\2bd\5!\21\2cb\3\2\2\2cd\3\2\2\2df\3\2"+
		"\2\2eg\5#\22\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2ha\3\2\2\2hc\3\2\2\2i\f\3"+
		"\2\2\2j\u0093\7^\2\2kl\7p\2\2lm\7g\2\2mn\7y\2\2no\7n\2\2op\7k\2\2pq\7"+
		"p\2\2q\u0094\7g\2\2rs\7t\2\2st\7g\2\2tu\7v\2\2uv\7w\2\2vw\7t\2\2w\u0094"+
		"\7p\2\2xy\7u\2\2yz\7r\2\2z{\7c\2\2{|\7e\2\2|\u0094\7g\2\2}~\7v\2\2~\177"+
		"\7c\2\2\177\u0094\7d\2\2\u0080\u0081\7d\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7e\2\2\u0083\u0084\7m\2\2\u0084\u0085\7u\2\2\u0085\u0086\7r\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7e\2\2\u0088\u0094\7g\2\2\u0089\u008a\7h\2\2"+
		"\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\u008d\7o\2\2\u008d\u008e"+
		"\7h\2\2\u008e\u008f\7g\2\2\u008f\u0090\7g\2\2\u0090\u0094\7f\2\2\u0091"+
		"\u0094\5-\27\2\u0092\u0094\n\4\2\2\u0093k\3\2\2\2\u0093r\3\2\2\2\u0093"+
		"x\3\2\2\2\u0093}\3\2\2\2\u0093\u0080\3\2\2\2\u0093\u0089\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\16\3\2\2\2\u0095\u0096\7*\2\2"+
		"\u0096\20\3\2\2\2\u0097\u0098\7+\2\2\u0098\22\3\2\2\2\u0099\u009a\7]\2"+
		"\2\u009a\24\3\2\2\2\u009b\u009c\7_\2\2\u009c\26\3\2\2\2\u009d\u009e\7"+
		"}\2\2\u009e\30\3\2\2\2\u009f\u00a0\7\177\2\2\u00a0\32\3\2\2\2\u00a1\u00a2"+
		"\7%\2\2\u00a2\u00a3\7}\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7%\2\2\u00a5\36"+
		"\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7 \3\2\2\2\u00a8\u00aa\7\60\2\2\u00a9"+
		"\u00ab\5)\25\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\"\3\2\2\2\u00ae\u00b0\5%\23\2\u00af\u00b1"+
		"\5)\25\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3$\3\2\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b7\t\6\2\2"+
		"\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7&\3\2\2\2\u00b8\u00ba\t"+
		"\6\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c3\3\2\2\2\u00bb"+
		"\u00c4\7\62\2\2\u00bc\u00c0\t\7\2\2\u00bd\u00bf\5)\25\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2"+
		"\2\2\u00c4(\3\2\2\2\u00c5\u00c6\t\b\2\2\u00c6*\3\2\2\2\u00c7\u00c8\t\t"+
		"\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\5+\26\2\u00cb\u00cc"+
		"\5+\26\2\u00cc\u00cd\5+\26\2\u00cd\u00ce\5+\26\2\u00ce.\3\2\2\2\u00cf"+
		"\u00d6\7\61\2\2\u00d0\u00d3\5\61\31\2\u00d1\u00d2\7\61\2\2\u00d2\u00d4"+
		"\5\61\31\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2"+
		"\u00d5\u00cf\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\60\3\2\2\2\u00d7\u00db"+
		"\t\n\2\2\u00d8\u00dc\5\63\32\2\u00d9\u00dc\5\67\34\2\u00da\u00dc\59\35"+
		"\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00e2"+
		"\3\2\2\2\u00dd\u00e0\5\63\32\2\u00de\u00e0\5\67\34\2\u00df\u00dd\3\2\2"+
		"\2\u00df\u00de\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e8\5\63\32\2\u00e4\u00e8\5\65\33"+
		"\2\u00e5\u00e8\5\67\34\2\u00e6\u00e8\59\35\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\62\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\t\16\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\t\b\2\2\u00ef"+
		"\66\3\2\2\2\u00f0\u00f1\t\13\2\2\u00f18\3\2\2\2\u00f2\u00f3\t\f\2\2\u00f3"+
		":\3\2\2\2\u00f4\u00f8\7=\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7\u00fa\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\b\36\2\2\u0101<\3\2\2\2\u0102\u0103\t\r\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\b\37\2\2\u0105>\3\2\2\2\33\2LSUW^cfh\u0093"+
		"\u00ac\u00b2\u00b6\u00b9\u00c0\u00c3\u00d3\u00d5\u00db\u00df\u00e1\u00e7"+
		"\u00e9\u00f8\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}