// Generated from Jj.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JjParser}.
 */
public interface JjListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JjParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JjParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JjParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(JjParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(JjParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(JjParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(JjParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(JjParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JjParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(JjParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JjParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(JjParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JjParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(JjParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code blockHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void enterBlockHybrid(JjParser.BlockHybridContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void exitBlockHybrid(JjParser.BlockHybridContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void enterIfElseHybrid(JjParser.IfElseHybridContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void exitIfElseHybrid(JjParser.IfElseHybridContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void enterIfHybrid(JjParser.IfHybridContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void exitIfHybrid(JjParser.IfHybridContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void enterWhileHybrid(JjParser.WhileHybridContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileHybrid}
	 * labeled alternative in {@link JjParser#h}.
	 * @param ctx the parse tree
	 */
	void exitWhileHybrid(JjParser.WhileHybridContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hStmt}
	 * labeled alternative in {@link JjParser#s}.
	 * @param ctx the parse tree
	 */
	void enterHStmt(JjParser.HStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hStmt}
	 * labeled alternative in {@link JjParser#s}.
	 * @param ctx the parse tree
	 */
	void exitHStmt(JjParser.HStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link JjParser#s}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(JjParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link JjParser#s}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(JjParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noOp}
	 * labeled alternative in {@link JjParser#s}.
	 * @param ctx the parse tree
	 */
	void enterNoOp(JjParser.NoOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noOp}
	 * labeled alternative in {@link JjParser#s}.
	 * @param ctx the parse tree
	 */
	void exitNoOp(JjParser.NoOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterCall(JjParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitCall(JjParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JjParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JjParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dict}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterDict(JjParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dict}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitDict(JjParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterList(JjParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitList(JjParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attr}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAttr(JjParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attr}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAttr(JjParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setItem}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterSetItem(JjParser.SetItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setItem}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitSetItem(JjParser.SetItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPar(JjParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPar(JjParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterLambda(JjParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitLambda(JjParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getItem}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterGetItem(JjParser.GetItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getItem}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitGetItem(JjParser.GetItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterStr(JjParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code str}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitStr(JjParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterName(JjParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitName(JjParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hExpr}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterHExpr(JjParser.HExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hExpr}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitHExpr(JjParser.HExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrAssign}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAttrAssign(JjParser.AttrAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrAssign}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAttrAssign(JjParser.AttrAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void enterDecl(JjParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl}
	 * labeled alternative in {@link JjParser#e}.
	 * @param ctx the parse tree
	 */
	void exitDecl(JjParser.DeclContext ctx);
}