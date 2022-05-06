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
public abstract  class Khichuri implements RiceFood,Richfood{

    @Override
    public void keepInFridge() {
        
        System.out.println("After cooking , do not keep in the fridge immediately. Let it cool down first. ");
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gather() {
        System.out.println("Gather Rice, Spices, Oil");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void serve() {
        System.out.println("Serve in a big dish, with fried fishes");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void boilRice() {
        System.out.println("Boil the rice well before cooking.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giveOil() {
        System.out.println("Give oil while cooking");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giveSpice() {
        System.out.println("Give a bit of yellow spices and pepper");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
