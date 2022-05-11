/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countingdemo;

/**
 *
 * @author student
 */
public class CountingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Counter c = new Counter();
        
        MyThread1 mt1 = new MyThread1(c);
        Thread t1= new Thread(mt1);
        
        MyThread2 mt2 = new MyThread2(c);
        Thread t2= new Thread(mt2);
        
        MyThread3 mt3 = new MyThread3(c);
        Thread t3= new Thread(mt3);
        
        t1.start();
        t2.start();
        t3.start();
    
    
    }
    
}
