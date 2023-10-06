// Generated from Javali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaliParser}.
 */
public interface JavaliListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaliParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaliParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaliParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaliParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JavaliParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JavaliParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#charVariable}.
	 * @param ctx the parse tree
	 */
	void enterCharVariable(JavaliParser.CharVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#charVariable}.
	 * @param ctx the parse tree
	 */
	void exitCharVariable(JavaliParser.CharVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#stringVariable}.
	 * @param ctx the parse tree
	 */
	void enterStringVariable(JavaliParser.StringVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#stringVariable}.
	 * @param ctx the parse tree
	 */
	void exitStringVariable(JavaliParser.StringVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaliParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaliParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaliParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaliParser.StatementContext ctx);
}