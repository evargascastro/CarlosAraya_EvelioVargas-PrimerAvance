/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;
import java_cup.runtime.Symbol;
/**
 *
 * @author Carlos
 */
public class CuerpoImportDeclAuxAST extends  ImportDeclAuxAST{
    public Symbol id;
    
    public CuerpoImportDeclAuxAST(Symbol a){
        id=a;
    }
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoImportDeclAuxAST(this, arg);
    }
}
