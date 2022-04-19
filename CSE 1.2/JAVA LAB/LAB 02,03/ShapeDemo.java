/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapedemo;

/**
 *
 * @author student
 */

class Circle
{

    private double radius;
    private double x;
    private double y;
    
    Circle()
    {
    
    }
    
    Circle(double radius, double x , double y)
    {
    this.radius = radius;
    this.x = x;
    this.y = y;
    }
    
    public void printInfo()
    {
    System.out.println("The radius is: "+this.radius);
    System.out.println("The center is "+this.x+" "+this.y);
    }
    
    public double getArea()
    {
    double area = Math.PI*this.radius*this.radius;
    return area;
    
    }
    
    public double getRadius()
    {
    return this.radius;
    
    }
    
    public void setRadius(double radius)
    {
    this.radius = radius;
    }
    
    public double getX()
    {
    return this.x;
    
    }
    
    public void setX(double x)
    {
    this.x = x;
    }
    public double getY()
    {
    return this.y;
    
    }
    
    public void setY(double y)
    {
    this.y = y;
    }
    
    public void printArea()
    {
    
    double area = Math.PI*this.radius*this.radius;
    System.out.println("The area is "+area);
    }
    
    public void compareWithCircle(Circle anotherCircle)
    {
    double areaCircle, areaAnotherCircle;
    
    areaCircle = this.getArea();
    areaAnotherCircle = anotherCircle.getArea();
    if(areaCircle>areaAnotherCircle)
        System.out.println("I am bigger");
    else
        System.out.println("Another one is bigger");
    
    
    }
    
    public Circle getNewCircle(double k)
    {
    
    Circle circle = new Circle(this.radius*k,this.x,this.y);
    return circle;
    }
    
    public String toString()
    {
    return "The radius is: "+this.radius+"\n"+
            "The center is "+this.x+" "+this.y;
    }
}
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle circle = new Circle(6,-1,2);
        circle.setRadius(10);
        System.out.println(circle.getRadius());
        circle.printInfo();
        circle.printArea();
        Circle circleNew = new Circle(3,1,1);
        circleNew.printInfo();
        circleNew.printArea();
        double areaCircle, areaCircleNew;
        areaCircle = circle.getArea();
        areaCircleNew = circleNew.getArea();
        
        System.out.println(areaCircle);
        System.out.println(areaCircleNew);
        circle.compareWithCircle(circleNew);
        Circle circleEnlarged = circle.getNewCircle(10);
        circleEnlarged.printInfo();
        System.out.println(circleEnlarged);
        
    }
    
}
