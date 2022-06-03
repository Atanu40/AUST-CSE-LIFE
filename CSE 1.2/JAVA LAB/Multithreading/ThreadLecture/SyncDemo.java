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
public class SyncDemo {
    
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int fibinitialvalues[] = {0, 1};
            int lucasinitialvalues[] = {2, 1};
            Printer printer = new Printer(System.out);
            SequenceGenerator fiboseq = new SequenceGenerator("Fibonacci", 2, fibinitialvalues, 30,printer);
            SequenceGenerator lucasseq = new SequenceGenerator("Lucas", 2, lucasinitialvalues, 30,printer);
            
            //System.out.println(fiboseq);
            //fiboseq.generateSequence();
            //lucasseq.generateSequence();
            
            Thread fibthread = new Thread(fiboseq, "Fibonacci Thread");
            Thread lucasthread = new Thread(lucasseq, "Lucas Thread");
            
            System.out.println(fibthread.getName()+ " "+fibthread.isAlive());
            System.out.println(lucasthread.getName()+ " "+lucasthread.isAlive());
            fibthread.start();
            lucasthread.start();
            System.out.println(fibthread.getName()+ " "+fibthread.isAlive());
            System.out.println(lucasthread.getName()+ " "+lucasthread.isAlive());
            
            fibthread.join();
            System.out.println(fibthread.getName()+ " "+fibthread.isAlive());
            System.out.println(lucasthread.getName()+ " "+lucasthread.isAlive());
            
            lucasthread.join();
            System.out.println(fibthread.getName()+ " "+fibthread.isAlive());
            System.out.println(lucasthread.getName()+ " "+lucasthread.isAlive());
            
            
        } catch (InterruptedException ex) {
            //Logger.getLogger(ThreadLecture.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
}
