package abstractdemo;

public class AbstractDemo {

    public static void main(String[] args) {
       
      Salary s = new Salary("Zakia", "Mirpur", 3, 360000.00);
      Employee e = new Salary("Tania", "Gulshan", 2, 2400000.00);
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println(s.computePay());
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
      System.out.println(e.computePay());       
    }   
}
