/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadanother;

/**
 *
 * @author student
 */
public class ThreadAnother {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //EvenPrinter.print();
        //OddPrinter.print();
     EvenPrinterThread evenPrinterThread = new  EvenPrinterThread();
     OddPrinterThread oddPrinterThread = new OddPrinterThread();
     
     Thread eventhread = new Thread(evenPrinterThread);
     Thread oddthread = new Thread(oddPrinterThread);
     
     eventhread.start();
     oddthread.start();
        
        
    }
    
}
