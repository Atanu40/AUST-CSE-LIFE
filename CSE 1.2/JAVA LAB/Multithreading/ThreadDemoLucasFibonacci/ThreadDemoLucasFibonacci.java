/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemolucasfibonacci;


/**
 *
 * @author Asus
 */
public class ThreadDemoLucasFibonacci {

    /**
     * @param args the command line arguments
     */
       public static void runSingleThread()
            
    {
        FibonacciCounter.countFibonacci(18);
        LucasCounter.countLucas(18);
    
    
    }
    
    public static void runMultiThread()
            
    {
        FibonacciCounterThread fibonacciCounterThread = new FibonacciCounterThread(28);
        LucasCounterThread lucasCounterThread = new LucasCounterThread(28);
        Thread fibThread = new Thread(fibonacciCounterThread);
        Thread lucasThread = new Thread(lucasCounterThread);
        
        fibThread.start();
        lucasThread.start();
    
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        /*Comment out this line to check how single thread works. Comment the runMultiThread() then*/
        //runSingleThread();
        runMultiThread();
        //calculateSingleThread();
       // calculateMultiThread();
    }

    
}
