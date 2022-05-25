/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class ThreadDemo {

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
    
    public static void calculateSingleThread()
            
    {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        System.out.println("Enter input for fib");    
        int N,n = scanner.nextInt( );
        N = FibonacciCounter.calculateFibonacci(n);
        System.out.println("FibCalc "+ n+"th"+ " Fibonacci Number is "+N);
        
        }
         
        for(int i=0;i<5;i++)
        {
        System.out.println("Enter input for lucas");    
        int N,n = scanner.nextInt( );
        N = LucasCounter.calculateLucas(n);
        System.out.println("LucasCalc "+ n+"th"+ " Lucas Number is "+N);
        
        }
        
    
    }
    
    public static void calculateMultiThread()
            
    {
        
        FibonacciCalculatorThread fibonacciCalculatorThread = new FibonacciCalculatorThread();
        LucasCalculatorThread lucasCalculatorThread = new LucasCalculatorThread();
        Thread fibThread = new Thread(fibonacciCalculatorThread);
        Thread lucasThread = new Thread(lucasCalculatorThread);
        
        fibThread.start();
        lucasThread.start();
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        //runSingleThread();
        runMultiThread();
        //calculateSingleThread();
       // calculateMultiThread();
    }
    
}
