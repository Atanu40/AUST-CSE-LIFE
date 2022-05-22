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
public class LucasCounter {
    
    synchronized public static  void countLucas(int n)
    {
    int a = 3, b = 1, c;
    
    for(int i=2;i<=n;i++)
     {
     System.out.println("Counting "+i+ "th Lucas Number");
     c = a+b;
     System.out.println(i+ "th Lucas Number = "+c);
     a = b;
     b = c;
     }
    
    }
    
    public static  int calculateLucas(int n)
    {
    int a = 3, b = 1, c = 0;
    
    for(int i=2;i<=n;i++)
     {
     //System.out.println("Counting "+i+ "th Lucas Number");
     c = a+b;
     //System.out.println(i+ "th Lucas Number = "+c);
     a = b;
     b = c;
     }
    
    return c;
    }
}
