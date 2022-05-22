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
public class LucasCalculatorThread implements Runnable{
    
    synchronized public void doJob(Scanner scanner)
    {
    System.out.println("             Enter input for lucas");    
    int N,n;
            
    n = scanner.nextInt( );
        
        
        N = LucasCounter.calculateLucas(n);
        System.out.println("        LucasCalc "+ n+"th"+ " Lucas Number is "+N);
        
    
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
