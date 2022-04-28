package testfinal;

public class TestFinal {

    public static void main(String[] args) {

        // instantiate object
        Box bObj = new Box();
        GiftBox obj = new GiftBox(5, 4, 3);
         
        //obj.color="Red";
        System.out.println(obj.color);
        // output
        obj.printVolume(bObj);
        
        
    }
}
