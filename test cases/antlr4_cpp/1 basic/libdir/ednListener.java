// Generated from edn.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ednParser}.
 */
public interface ednListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ednParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ednParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ednParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ednParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ednParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ednParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ednParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(ednParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(ednParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ednParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ednParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ednParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ednParser#list_}.
	 * @param ctx the parse tree
	 */
	void enterList_(ednParser.List_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#list_}.
	 * @param ctx the parse tree
	 */
	void exitList_(ednParser.List_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ednParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(ednParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(ednParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ednParser#map_}.
	 * @param ctx the parse tree
	 */
	void enterMap_(ednParser.Map_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#map_}.
	 * @param ctx the parse tree
	 */
	void exitMap_(ednParser.Map_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ednParser#set_}.
	 * @param ctx the parse tree
	 */
	void enterSet_(ednParser.Set_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ednParser#set_}.
	 * @param ctx the parse tree
	 */
	void exitSet_(ednParser.Set_Context ctx);
}