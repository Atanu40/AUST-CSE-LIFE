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
public class EvenPrinterThread implements Runnable{

    @Override
    public void run() {
        EvenPrinter.print();
//   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
