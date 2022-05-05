/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodinterface;

/**
 *
 * @author student
 */
public class FoodInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Khichuri khichuri = new JogaKhichuri();
        khichuri.gather();
        khichuri.boilRice();
        khichuri.giveOil();
        khichuri.giveSpice();
        khichuri.cook();
        khichuri.serve();
        khichuri.keepInFridge();
      
        khichuri = new DryKhichuri();
        khichuri.gather();
        khichuri.boilRice();
        khichuri.giveOil();
        khichuri.giveSpice();
        khichuri.cook();
        khichuri.serve();
        khichuri.keepInFridge();
      
        
    }
    
}
