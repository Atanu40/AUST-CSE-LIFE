/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synch;

/**
 *
 * @author Arony
 */
public class Caller implements Runnable {

    String msg;
    CallMe target;

    public Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
    }

    public void run() {
          
          target.call(msg);

    }
}
