// Generated from Fetal.g4 by ANTLR 4.5.2

package com.ftl.derived;
import com.ftl.helper.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.lang.reflect.InvocationTargetException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FetalParser}.
 */
public interface FetalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FetalParser#transaction}.
	 * @param ctx the parse tree
	 */
	void enterTransaction(FetalParser.TransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#transaction}.
	 * @param ctx the parse tree
	 */
	void exitTransaction(FetalParser.TransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(FetalParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(FetalParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(FetalParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(FetalParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(FetalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(FetalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FetalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FetalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FetalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FetalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(FetalParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(FetalParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FetalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FetalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FetalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FetalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(FetalParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(FetalParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#lexical}.
	 * @param ctx the parse tree
	 */
	void enterLexical(FetalParser.LexicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#lexical}.
	 * @param ctx the parse tree
	 */
	void exitLexical(FetalParser.LexicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(FetalParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(FetalParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#dateType}.
	 * @param ctx the parse tree
	 */
	void enterDateType(FetalParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#dateType}.
	 * @param ctx the parse tree
	 */
	void exitDateType(FetalParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOp(FetalParser.AssignmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOp(FetalParser.AssignmentOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#unaryOP}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOP(FetalParser.UnaryOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#unaryOP}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOP(FetalParser.UnaryOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#expressionOp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOp(FetalParser.ExpressionOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#expressionOp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOp(FetalParser.ExpressionOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#arithExpressOp}.
	 * @param ctx the parse tree
	 */
	void enterArithExpressOp(FetalParser.ArithExpressOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#arithExpressOp}.
	 * @param ctx the parse tree
	 */
	void exitArithExpressOp(FetalParser.ArithExpressOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#bitwiseExpressOp}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpressOp(FetalParser.BitwiseExpressOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#bitwiseExpressOp}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpressOp(FetalParser.BitwiseExpressOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(FetalParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(FetalParser.ComparisonOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#logicExpressOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpressOp(FetalParser.LogicExpressOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#logicExpressOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpressOp(FetalParser.LogicExpressOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#rharg}.
	 * @param ctx the parse tree
	 */
	void enterRharg(FetalParser.RhargContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#rharg}.
	 * @param ctx the parse tree
	 */
	void exitRharg(FetalParser.RhargContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#lharg}.
	 * @param ctx the parse tree
	 */
	void enterLharg(FetalParser.LhargContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#lharg}.
	 * @param ctx the parse tree
	 */
	void exitLharg(FetalParser.LhargContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FetalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FetalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation(FetalParser.EvaluationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation(FetalParser.EvaluationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FetalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FetalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#evalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEvalExpression(FetalParser.EvalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#evalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEvalExpression(FetalParser.EvalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(FetalParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(FetalParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#assignmentCommands}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentCommands(FetalParser.AssignmentCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#assignmentCommands}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentCommands(FetalParser.AssignmentCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(FetalParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(FetalParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#amtArg}.
	 * @param ctx the parse tree
	 */
	void enterAmtArg(FetalParser.AmtArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#amtArg}.
	 * @param ctx the parse tree
	 */
	void exitAmtArg(FetalParser.AmtArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void enterStringArg(FetalParser.StringArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void exitStringArg(FetalParser.StringArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#numberArg}.
	 * @param ctx the parse tree
	 */
	void enterNumberArg(FetalParser.NumberArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#numberArg}.
	 * @param ctx the parse tree
	 */
	void exitNumberArg(FetalParser.NumberArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#dateArg}.
	 * @param ctx the parse tree
	 */
	void enterDateArg(FetalParser.DateArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#dateArg}.
	 * @param ctx the parse tree
	 */
	void exitDateArg(FetalParser.DateArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#debitOrCredit}.
	 * @param ctx the parse tree
	 */
	void enterDebitOrCredit(FetalParser.DebitOrCreditContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#debitOrCredit}.
	 * @param ctx the parse tree
	 */
	void exitDebitOrCredit(FetalParser.DebitOrCreditContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FetalParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FetalParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(FetalParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(FetalParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(FetalParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(FetalParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(FetalParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(FetalParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(FetalParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(FetalParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#percentLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPercentLiteral(FetalParser.PercentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#percentLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPercentLiteral(FetalParser.PercentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(FetalParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(FetalParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FetalParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FetalParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FetalParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(FetalParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FetalParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(FetalParser.DateLiteralContext ctx);
}