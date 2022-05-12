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
public class MonitorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Printer UCLPrinter = new Printer(System.out, 10);
        //Person messi = new Person("Messi", "Barcelona.pdf", 13, UCLPrinter);
        Person cr7 = new Person("Ronaldo", "Juventus.pdf", 34, UCLPrinter);
        Staff infantino = new Staff("FIFA", 10, UCLPrinter);
        //Thread messiThread = new Thread(messi);
        Thread cr7Thread = new Thread(cr7,"ronaldo");
        Thread infantinoThread = new Thread(infantino,"FIFA");
        //messiThread.start();
        infantinoThread.start();
        //Thread.sleep(5000);
        cr7Thread.start();
        
    }
    
}
