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
public class FibonacciCounterThread implements Runnable{

    private int n;
   
    public FibonacciCounterThread(int n)
    {
    this.n = n;
    }
    @Override
    public void run() {
        FibonacciCounter.countFibonacci(this.n);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
