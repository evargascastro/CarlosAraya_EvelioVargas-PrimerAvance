/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public abstract class VarDeclAST extends AST {

    public abstract Object visit(Visitor v, Object arg);
}
