/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodoverloadingdemo;

/**
 *
 * @author student
 */
class Triangle
{

   public static double getArea(double base,double height)
   {
   return 0.5*base*height;
   }

   public static double getArea(double A, double B, double C)
   {
   double semiPerimeter = (A+B+C)/2.0;
   
   double area = Math.sqrt(semiPerimeter*(semiPerimeter-A)
           *(semiPerimeter-B)*(semiPerimeter-C));
   
   return area;
   
   }
}
public class MethodOverloadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double area = Triangle.getArea(4, 3);
        System.out.println(area);
        area = Triangle.getArea(4,3,5);
        System.out.println(area); 
        
    }
    
}
