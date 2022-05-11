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
public class MyThread2 implements Runnable{
    
    
    Counter c;
    
    MyThread2(Counter c)
    {
        this.c=c;
    }
   
    public void run() {
        
        for(int i=1;i<=5;i++){
            
           System.out.println(c.incItem());
        }
       
    }
}
