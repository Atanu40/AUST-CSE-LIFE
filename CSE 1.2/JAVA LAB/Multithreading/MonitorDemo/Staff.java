/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitordemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Staff implements Runnable {

    public String name;
    public int pageNumber;
    public Printer printer;

    public Staff(String name, int pageNumber, Printer printer) {

        this.name = name;
        this.pageNumber = pageNumber;
        this.printer = printer;
    }

    

    @Override
    public void run() {
        while(true)
        {
        this.printer.fillPages(this);
        }
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
