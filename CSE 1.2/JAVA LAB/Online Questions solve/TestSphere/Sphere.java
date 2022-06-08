/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsphere;

public class Sphere {
    
    private int sphereNo;
    private String color;
    private double radius;

    public Sphere(int sphereNo, String color, double radius) {
        
        this.sphereNo = sphereNo;
        this.color = color;
        this.radius = radius;
    }

    public Sphere() {
    }
    
    
    public double getArea(Sphere arr[], String findColor){
        
        double area=0.0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].color.equals(findColor))
            {
                area=4*3.1416*arr[i].radius*arr[i].radius;
                break;
            }
        }
         
        return area;
    }
    
    public double getArea(Sphere arr[], int findNum){
        
        double area=0.0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].sphereNo==findNum)
            {   
                area=4*3.1416*arr[i].radius*arr[i].radius;
                break;
            }
        }

        return area;
    }
       
}
