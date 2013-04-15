/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoVariasTypeNameAST extends TypeNameAST{

    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasTypeNameAST(this, arg);
    } 
}
