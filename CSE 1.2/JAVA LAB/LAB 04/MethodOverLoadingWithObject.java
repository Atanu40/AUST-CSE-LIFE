/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodoverloadingwithobject;

/**
 *
 * @author student+
 * 
 */
class Triangle{
    double base, height;
    Triangle(double base, double height){
        this.base =  base;
        this.height = height;
    }
    
    double getBase(){
        return base;
    }
    
    double getHeight(){
        return height;
    }
            
    
}


class Rectangle{
    double length, width;
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    double getLength(){
        return length;
    }
    
    double getWidth(){
        return width;
    }
}

class  Shape{
    static double getArea(Triangle t){
        return 0.5*t.getBase()*t.getHeight();
    }
    
    static double getArea(Rectangle r){
        return r.getLength()*r.getWidth();
    }
    static double getArea(double A,double B,double C){
        double semiPerimeter = (A+B+C)/2.0;
   
   double area = Math.sqrt(semiPerimeter*(semiPerimeter-A)
           *(semiPerimeter-B)*(semiPerimeter-C));
   
   return area;
   
    }
    static double getArea(double r)
    {
    return 3.1416*r*r;
    }
    
}
public class MethodOverLoadingWithObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle triangle = new Triangle (2.0,5.0);
        Rectangle rectangle = new Rectangle (4.0, 6.0);
        
        System.out.println("Triangle area: "+Shape.getArea(triangle));
        System.out.println("Rectangle area: "+Shape.getArea(rectangle));
        double area = Shape.getArea(8);
        
        System.out.println(area);
    }
    
}
