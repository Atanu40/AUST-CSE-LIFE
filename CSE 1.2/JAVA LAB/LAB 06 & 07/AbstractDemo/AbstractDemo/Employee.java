package abstractdemo;
public abstract class Employee {

    private String name;
    private String address;
    private int number;

    Employee(String name, String address, int number) {
        
    }    
    //ABSTRACT METHOD
    abstract double computePay();
    
    //NON-ABSTRACT METHOD
    void mailCheck() {
        System.out.println("Mailing a check to " + this.name 
                            + " " + this.address);
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
