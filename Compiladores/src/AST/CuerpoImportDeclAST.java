/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoImportDeclAST extends ImportDeclAST {

    public TypeNameAST tname;
    public ImportDeclAuxAST idecl;

    public CuerpoImportDeclAST(TypeNameAST a, ImportDeclAuxAST b) {
        tname = a;
        idecl = b;
    }

    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoImportDeclAST(this, arg);
    }
}
