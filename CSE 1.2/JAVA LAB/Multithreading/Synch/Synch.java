/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synch;

/**
 *
 * @author Arony
 */
public class Synch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        CallMe tar = new CallMe();
        
        Caller obj1= new Caller(tar, "Hello");
        Caller obj2= new Caller(tar, "Synchronized");
        Caller obj3= new Caller(tar, "World");
        
        Thread t1= new Thread(obj1);
        t1.setName("1st Thread");
        Thread t2= new Thread(obj2);
        t2.setName("2nd Thread");
        Thread t3=new Thread(obj3);
        t3.setName("3rd Thread");
        
        
        
        t1.start();      
        t2.start();         
        t3.start();
        
       // System.out.println("Is Thread-1 Alive? " + t1.isAlive());
        
        
        t1.join();
        
        //System.out.println("Is Thread-2 Alive? " + t2.isAlive());
        
        t2.join();
        
        //System.out.println("Is Thread-3 Alive? " + t3.isAlive());

        t3.join();

        
        //System.out.println("Is Thread-1 Alive? " + t1.isAlive());
        //System.out.println("Is Thread-2 Alive? " + t2.isAlive());
        //System.out.println("Is Thread-3 Alive? " + t3.isAlive());

        
        //t1.join();
        //t2.join();
        //t3.join();

    }
    
}
