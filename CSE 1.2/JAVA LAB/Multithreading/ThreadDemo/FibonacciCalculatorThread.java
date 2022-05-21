/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FibonacciCalculatorThread implements Runnable{

    
    synchronized public void doJob(Scanner scanner)
    {
    
        int N,n;
         System.out.println("Enter input for fib");    
        n = scanner.nextInt( );
         
        N = FibonacciCounter.calculateFibonacci(n);
        System.out.println("FibCalc "+ n+"th"+ " Fibonacci Number is "+N);
        
    }
    @Override
    public void run() {
    Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        doJob(scanner);
        }
         
        
            
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
