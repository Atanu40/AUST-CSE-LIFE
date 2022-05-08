/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoexception;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class DemoException {

    /**
     * @param args the command line arguments
     */
    public static void doThrow() throws ArithmeticException
    {
    Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int result=0;
        int b = sc.nextInt();
        if(b==0)
            throw new ArithmeticException();
        result = a/b;
        System.out.println(result);
    
    }
    public static void doAnotherJob()
    {
    Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        boolean track = true;
        int result=0;
        while(track){
            int[] array = new int[3];
            array[0] = 0;
            array[1] = 2;
            try{    
            int b = sc.nextInt();
            result = a/array[b];
            track = false;
              try{
                  int k = sc.nextInt();
              int c = result/k;
              }
              catch(Exception ex)
              {
              System.out.println("Inner loop");
              }
            }
            catch(ArithmeticException ex)
            {
                System.out.println("The division is not valid");
                System.out.println(ex);
                ex.printStackTrace();
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Array index is not valid");
                System.out.println(ex);
                ex.printStackTrace();
            }
            
            finally
            {
            System.out.println("ok");
            
            }
            }
        
        System.out.print("Result " + result);
    
    }
    public static void doJob()
    {
    
    Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        boolean track = true;
        double result=0;
        while(track){
            int b = sc.nextInt();
            try{    
            result = a/b;
            track = false;
            }
            catch(Exception ex)
            {
                System.out.println("Give a valid input");
                System.out.println(ex);
                ex.printStackTrace();
            }
            }
        
        System.out.print("Result " + result);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //doJob();
        //doAnotherJob();
        try{
        doThrow();
        }
        catch(ArithmeticException ex)
        {
        ex.printStackTrace();
        }
    }
    
}
