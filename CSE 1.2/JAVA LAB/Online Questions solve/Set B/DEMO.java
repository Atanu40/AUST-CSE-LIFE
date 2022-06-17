package lab.pkg8;

public class DEMO {
    
    public static void main(String[] args) {
        
        int ArrayBat[][] = {{45, 55, 89, 65, 98, 158, 25, 65, 98, 10}, {0, 1, 1, 1, 0, 0, 0, 1, 1, 0}};        
        Batsman b1 = new Batsman("Sakib", "BD", 30, ArrayBat);
        
        int ArrayBowl[][] = {{45, 55, 35, 25, 58, 48, 25, 65, 38, 40}, {0, 4, 5, 2, 1, 0, 0, 1, 1, 3}};        
        Bowler b2 = new Bowler("Mash", "BD", 33, ArrayBowl);
        
        b1.printInfo();
        b1.CalculateAverage(8);
        
        b2.printInfo();
        b2.CalculateAverage(5);
        
    }
    
}
