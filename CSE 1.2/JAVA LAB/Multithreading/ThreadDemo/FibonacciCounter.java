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
public class FibonacciCounter {
    
    
    synchronized public static  void countFibonacci(int n)
    {
    int a = 0, b = 1, c;
    
    for(int i=2;i<=n;i++)
     {
         System.out.println("Counting "+i+ "th Fibonacci Number");
     c = a+b;
     System.out.println(i+ "th Fibonacci Number = "+c);
     a = b;
     b = c;
     }
    
    }
    
    public static  int calculateFibonacci(int n)
    {
    int a = 0, b = 1, c = 0;
    
    for(int i=2;i<=n;i++)
     {
     //System.out.println("Counting "+i+ "th Fibonacci Number");
     c = a+b;
     //System.out.println(i+ "th Fibonacci Number = "+c);
     a = b;
     b = c;
     }
    
    return c;
    }
}
