/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlecture;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class SequenceGenerator implements Runnable{

    public int k;
    public int[] initialvalues;
    public int n;
    public String sequenceName;
    public Printer printer;
    
    public SequenceGenerator(String sequenceName, int k, int[] initialvalues, int n, Printer printer)
    {
    this.sequenceName = sequenceName;
    this.k = k;
    this.initialvalues = new int[this.k];
    this.initialvalues = initialvalues.clone();
    this.n = n;
    this.printer = printer;
    }
    
    
    
    @Override
    public String toString()
    {
    String ret = this.sequenceName+"\n";
    ret += "k: "+this.k+"\n";
    ret += "n: "+this.n+"\n";
    for(int i=0;i<this.k;i++)
        ret += "["+i+"]: "+this.initialvalues[i]+"\n";
    
    return ret;
    
        
    }
    
    
    public void generateSequenceSyncFunction()
    {
    int temp[] = new int[n+1];
    System.arraycopy(this.initialvalues, 0, temp, 0, this.k);
    for(int i=this.k;i<=this.n;i++)
     {
       temp[i] = 0;
       for(int j=1;j<=this.k;j++)
           temp[i] += temp[i-j];
       
       printer.printResultSync(this.sequenceName, i, temp[i]);
       
     }
    
    }
    public void generateSequenceSyncBlock()
    {
    int temp[] = new int[n+1];
    System.arraycopy(this.initialvalues, 0, temp, 0, this.k);
    for(int i=this.k;i<=this.n;i++)
     {
       temp[i] = 0;
       for(int j=1;j<=this.k;j++)
           temp[i] += temp[i-j];
       synchronized(printer)
       {
       
       
       printer.printResult(this.sequenceName, i, temp[i]);
       }
     }
    
    }
    public void generateSequence()
    {
    int temp[] = new int[n+1];
    System.arraycopy(this.initialvalues, 0, temp, 0, this.k);
    for(int i=this.k;i<=this.n;i++)
     {
       temp[i] = 0;
       for(int j=1;j<=this.k;j++)
           temp[i] += temp[i-j];
       
       System.out.println("Counting "+ this.sequenceName + " term  " + i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            //Logger.getLogger(SequenceGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println(this.sequenceName + " term " + i + " : "+temp[i]);
       
     }
    }
    @Override
    public void run() {
        this.generateSequence();
//this.generateSequenceSyncBlock();
//this.generateSequenceSyncFunction();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
