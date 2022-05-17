/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synch;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arony
 */
public class CallMe {
    
    void call(String msg)
    {   
        synchronized(this){
        
        System.out.println(Thread.currentThread().getName());
        System.out.println("Is it Alive? " + Thread.currentThread().isAlive());
        System.out.print("[" + msg);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
            ex.printStackTrace();
        }
        System.out.println("]");
        }
    }
}
