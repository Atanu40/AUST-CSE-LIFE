/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangledemo;

/**
 *
 * @author student
 */
class Rectangle
{
    private double x;
    private double y;
    private double width;
    private double height;
    Rectangle()
    {
    }
    Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    
    }
    public void printInfo()
    {
        String message = "";
        message = "Lower-left co-ordinates " + this.x+ " "+this.y+"\n";
        message += "Width is "+ this.width+"\n";
        message += "Height is" + this.height +"\n";
    
        System.out.println(message);
    
    }

    public String toString()
    {
        String message = "";
        message = "Lower-left co-ordinates " + this.x+ " "+this.y+"\n";
        message += "Width is "+ this.width+"\n";
        message += "Height is" + this.height +"\n";
        return message;
    
    
    }
    public void printArea()
    {
    
        double area = this.height*this.width;
        System.out.println("The area is "+area);
    }
    
    public double getArea()
    {
        double area = this.height*this.width;
        return area;
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
    
    
    public double getWidth()
    {
        return this.width;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public double getHeight()
    {
        return this.height;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public void compareRectangle(Rectangle anotherRectangle)
    {
    
    double area = this.getArea();
    double anotherArea = anotherRectangle.getArea();
    if(area>anotherArea)
        System.out.println("This rectangle is bigger");
    else 
        System.out.println("The other rectangle is bigger");
    
    }
    public Rectangle getAnotherRectangle(double width)
    {
        Rectangle newRectangle= new Rectangle();
        newRectangle.x = this.x;
        newRectangle.y = this.y;
        newRectangle.width = width;
        newRectangle.height = this.getArea()/width;
    
        return newRectangle;
    }
}
public class RectangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Rectangle rectangle = new Rectangle(1.0,1.0,4,6);
        rectangle.printInfo();
        rectangle.printArea();
        double area = rectangle.getArea();
        System.out.println(area);
        rectangle.setWidth(20);
        rectangle.setHeight(8);
        System.out.println(rectangle.getWidth());
        rectangle.printInfo();
        rectangle.printArea();
        area = rectangle.getArea();
        System.out.println(area);
        
        Rectangle newRectangle = new Rectangle(1.0,2.0,3,2);
        rectangle.printArea();
        newRectangle.printArea();
        rectangle.compareRectangle(newRectangle);
        Rectangle anotherRectangle = rectangle.getAnotherRectangle(10);
        anotherRectangle.printInfo();
        anotherRectangle.printArea();
        System.out.println(rectangle);
    }
    
}
