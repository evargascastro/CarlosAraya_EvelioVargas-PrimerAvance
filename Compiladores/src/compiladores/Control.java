/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

import java.io.FileReader;
import java.io.IOException;
import sun.org.mozilla.javascript.internal.ast.CatchClause;

/**
 *
 * @author Carlos
 */
public class Control {

    public Control() {
        
    }
    
   
    
    public Scanner ayuda(FileReader arch){
        Scanner ayudaAux=null;
        
   
        Scanner s = new Scanner(arch);
        ayudaAux=s;
   
        return ayudaAux;
    }
    }

     

