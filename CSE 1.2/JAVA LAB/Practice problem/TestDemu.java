//ID:17.02.04.003//
//PROBLEM:WE HAVE CREATED A SYSTEM TO BOOK BUS TICKETS THROUGH A DESKTOP APPLICATION BY USER//
package assinment1;

import java.util.Scanner;


public class TestDemu {
    
//ID:17.02.04.003//
//PROBLEM:WE HAVE CREATED A SYSTEM TO BOOK BUS TICKETS THROUGH A DESKTOP APPLICATION BY USER//

    public static void main(String[] args) {
        System.out.println(" WELLCOME TO OUR TRAVEL AGENCY & EID MUBARAK EVERYONE");
      
        
        Bus b1;//creat a referance variable//
          System.out.println(" OUR AVAILABLE SERVICES ARE:");
          
        b1=new ShaymoliPoribohon();
        b1.businformation();
        
         System.out.println(" OUR AVAILABLE SERVICES ARE:");
         
        b1=new ShohagPoribohon ();
        b1.businformation();
        
         System.out.println(" OUR AVAILABLE SERVICES ARE:");
        
        b1=new HimacholPoribohon();
        b1.businformation();
        
          System.out.println(" OUR AVAILABLE SERVICES ARE:");
        
        b1=new ShitolPoribohon ();
        b1.businformation();
        
        Scanner input =new Scanner(System.in);
        String bus_name;
        System.out.println(" PLEASE WRITE OUR AVAILABLE BUSNAME & BOOK YOUR PREFERED BUS :");
        bus_name=input.nextLine();
        
        if("SHAMOLI PORIBOHON".equals(bus_name))
        {
            System.out.println("YOUER BOOKING SUCCESSFULLY");
            System.out.println(" YOUR SEAT NUMBER IS : 7A01");
        }
        else if("SHOHAG PORIBOHON".equals(bus_name))
                {
                    System.out.println("YOUER BOOKING SUCCESSFULLY");
                    System.out.println("YOUR SEAT NUMBER IS : 2B04");
                }
        
        else if("HIMACHOL PORIBOHON".equals(bus_name))
        {
            System.out.println("YOUER BOOKING SUCCESSFULLY");
            System.out.println("YOUR SEAT NUMBER IS : 6C58");
        }
        else if("SHITOL PORIBOHON".equals(bus_name))
        {
            System.out.println("YOUER BOOKING SUCCESSFULLY");
            System.out.println("YOUR SEAT NUMBER IS : 2D10");
        }
        else
        {
            System.out.println("SORRY SIR/MADAM WE CANNOT DO NOTHING ELSE ");
        }
        

}
}

