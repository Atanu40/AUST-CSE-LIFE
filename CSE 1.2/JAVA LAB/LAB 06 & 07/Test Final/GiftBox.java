package testfinal;
public class GiftBox extends Box2{
    
    final public String color="Yellow";
    
    
    private double length;
    private double width;
    private double height;
    
    GiftBox(double length, double width, double height) {

        this.length = length;
        this.width = width;
        this.height = height;
    }
    // this method takes Box object as argument and using the Box 
    // getVolume method it prints the volume of the GiftBox
    public void printVolume(Box bObj) {
        double volume = bObj.getVolume(this.length, this.width, this.height);
        System.out.println("Volume of the GiftBox: " + volume);
    }
}
