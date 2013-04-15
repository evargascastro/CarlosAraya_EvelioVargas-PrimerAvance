/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public abstract class ImportDeclAuxAST extends AST{

    @Override
  public abstract Object visit(Visitor v, Object arg);
}
