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
public class LucasCounterThread implements Runnable{

    private int n;
   
    public LucasCounterThread(int n)
    {
    this.n = n;
    }
    @Override
    public void run() {
        
        LucasCounter.countLucas(this.n);
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
