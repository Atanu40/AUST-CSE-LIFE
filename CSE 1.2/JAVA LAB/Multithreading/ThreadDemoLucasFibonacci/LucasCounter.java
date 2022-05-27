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
public class LucasCounter {
    
    public static  void countLucas(int n)
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
    
    
}
