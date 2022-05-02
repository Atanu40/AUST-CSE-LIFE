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
public class Java implements Language,Framework{

    public String filename;
    public String JDKVersion;
    
    public Java()
    {;}
    public Java(String filename,String JDKVersion)
    {
    this.filename = filename;
    this.JDKVersion = JDKVersion;
    }
    
    @Override
    public void openIDE() {
        System.out.println("Opening Notepad");
        List<String> argList = new ArrayList<String>();
argList.add ("notepad.exe"); // command name
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


//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void compile() {
        System.out.println("Compiling through Javac");
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void build() {
        System.out.println("Building .jar file");
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void runCode() {
        this.openIDE();
        this.compile();
        this.build();
        System.out.println("Running "+this.filename+".java file");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doRouting() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void install() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
