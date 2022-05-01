/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class CPP implements Language{

    public String filename;
    public String gccVersion;
    
    public CPP()
    {;}
    public CPP(String filename,String gccVersion)
    {
    this.filename = filename;
    this.gccVersion = gccVersion;
    }
    @Override
    public void openIDE() {
       System.out.println("Opening Codeblocks");
List<String> argList = new ArrayList<String>();
argList.add ("C:\\Program Files\\CodeBlocks\\codeblocks.exe"); // command name
argList.add ("C:\\Users\\student\\Documents\\NetBeansProjects\\JavaApplication3\\src\\javaapplication3\\JavaApplication3.java"); // optional args added as separate list items
ProcessBuilder pb = new ProcessBuilder (argList);
Process p;
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException ex) {
            Logger.getLogger(CPP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(CPP.class.getName()).log(Level.SEVERE, null, ex);
        }

       
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void compile() {
        System.out.println("Compiling through GCC++");
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void build() {
    System.out.println("Building .exe file");    
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void runCode() {
        this.openIDE();
        this.compile();
        this.build();
        System.out.println("Running "+ this.filename+ " file");
                
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
