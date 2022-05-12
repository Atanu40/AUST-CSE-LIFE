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
public class Person implements Runnable {

    public String name;
    public String pdfName;
    public int pageNumber;
    public Printer printer;

    public Person(String name, String pdfName, int pageNumber, Printer printer) {

        this.name = name;
        this.pdfName = pdfName;
        this.pageNumber = pageNumber;
        this.printer = printer;
    }

    public void printPDF() {
        
         
            this.printer.ps.println(this.name+ " is printing "+this.pdfName);
            for (int i = 1; i <= this.pageNumber; i++) {
                this.printer.ps.println("run "+i);
                this.printer.printPDF(this, i);
    }
            this.printer.ps.println(this.name+ " has printed      "+this.pdfName);
            
        
    }

    @Override
    public void run() {

        this.printPDF();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
