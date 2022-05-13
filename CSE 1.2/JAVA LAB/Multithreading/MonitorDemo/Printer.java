/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitordemo;

/**
 *
 * @author Asus
 */
import java.io.PrintStream;

public class Printer {

    public PrintStream ps;
    public int pages;
    public Printer(PrintStream ps,int pages)
    {
    this.ps = ps;
    this.pages = pages;
    
    }
    
    synchronized public void printPDF(Person person,int pageno)
    {
    
        
                while(this.pages<=0)
                {
                    try {
                        this.wait();
                    } catch (InterruptedException ex) {
                    }
                
                }
                
            this.pages -=1;
            this.ps.println(person.name+ " is printing "+person.pdfName+" page no."+pageno);
            this.ps.println("Printer has "+this.pages+" pages");
            System.out.println(Thread.currentThread().getName()+ "alive");
            
            this.notify();
        
    }
    
    synchronized public void fillPages(Staff staff)
    {
    
        while(this.pages>0)
        {
         
                try {
                    this.wait();
            } catch (InterruptedException ex) {
             //   Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        this.pages += staff.pageNumber;
        this.ps.println(staff.name+" is filling printer ");
        System.out.println(Thread.currentThread().getName()+ "alive");
        
        this.notify();
        
    }
    
    
    
    
    
}
