/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlecture;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class ThreadLecture {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int fibinitialvalues[] = {0, 1};
            int lucasinitialvalues[] = {2, 1};
            
            SequenceGenerator fiboseq = new SequenceGenerator("Fibonacci", 2, fibinitialvalues, 18,null);
            SequenceGenerator lucasseq = new SequenceGenerator("Lucas", 2, lucasinitialvalues, 18,null);
            
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
