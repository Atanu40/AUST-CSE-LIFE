package testoverriding;

public class TestOverriding {
    
    public static void main(String[] args) {
        BRAC b = new BRAC();
        DBBL d = new DBBL();
        HSBC h = new HSBC();
        System.out.println("BRAC Rate of Interest: " + b.getRateOfInterest() + "%");
        System.out.println("DBBL Rate of Interest: " + d.getRateOfInterest() + "%");
        System.out.println("HSBC Rate of Interest: " + h.getRateOfInterest() + "%");
    }
}
