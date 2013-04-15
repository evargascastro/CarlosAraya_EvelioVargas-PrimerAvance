/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoVariasImportDeclAST extends VariasImportDeclAST{
   public VariasImportDeclAST vimp;
   public ImportDeclAST imp;
   
   public CuerpoVariasImportDeclAST (VariasImportDeclAST a, ImportDeclAST b){
       vimp=a;
       imp=b;
   }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasImportDeclAST(this, arg);
    }
}
