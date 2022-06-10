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
public class Taxi {

    private String destination;
    private double distance;
    private double fairPerKm;

    public Taxi() {

        destination = null;
        distance = -1.0;
        fairPerKm = -1.0;
    }



    public Taxi(String destination, double distance, double fairPerKm) {
        this.destination = destination;
        this.distance = distance;
        this.fairPerKm = fairPerKm;
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFairPerKm() {
        return fairPerKm;
    }

    public void setFairPerKm(double fairPerKm) {
        this.fairPerKm = fairPerKm;
    }

    public double computeFair()
    {
        double totalFair=distance*fairPerKm;
        return totalFair-(totalFair*0.2);
    }

    public String compareFair(Taxi obj){

        String comp=null;
        if(computeFair()==obj.computeFair()){
            comp="same";
        }
        else if(computeFair()>obj.computeFair()){
            comp="more";
        }
        else if(computeFair()<obj.computeFair()){
            comp="less";
        }

        return comp;
    }

}
