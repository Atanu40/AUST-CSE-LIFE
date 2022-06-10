/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtaxi;

/**
 *
 * @author Atanu
 */
public class TestTaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Taxi obj1=new Taxi("Uttara",10,30);
        Taxi obj2=new Taxi("Mirpur",5,45);

        System.out.println("Total fair to " + obj1.getDestination() +" is " +
                                               obj1.computeFair());

        System.out.println("Total fair to " + obj2.getDestination() +" is " +
                                               obj2.computeFair());

        System.out.println("Fair of " + obj1.getDestination() +" is " +
                           obj1.compareFair(obj2) + " than " +obj1.getDestination());

        obj1.setFairPerKm(20);

        System.out.println("Total fair to " + obj1.getDestination() +" is " +
                                               obj1.computeFair());

        System.out.println("Fair of " + obj1.getDestination() +" is " +
                           obj1.compareFair(obj2) + " than " +obj1.getDestination());


    }

}
