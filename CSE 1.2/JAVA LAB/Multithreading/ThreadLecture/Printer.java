/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlecture;

import java.io.PrintStream;

/**
 *
 * @author Asus
 */
public class Printer {
    
    public PrintStream ps;
    
    public Printer(PrintStream ps)
    {
    this.ps = ps;
    }
    
    public void printResult(String sequenceName, int term, int result)
    {
        
    this.ps.println("Counting "+ sequenceName + " term  " + term);
       try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            //Logger.getLogger(SequenceGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     this.ps.println(sequenceName + " term " + term + " : "+result);
           
    
    
    }
    
    synchronized public void printResultSync(String sequenceName, int term, int result)
    {
        
    this.ps.println("Counting "+ sequenceName + " term  " + term);
       try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            //Logger.getLogger(SequenceGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     this.ps.println(sequenceName + " term " + term + " : "+result);
           
    
    
    }
}
