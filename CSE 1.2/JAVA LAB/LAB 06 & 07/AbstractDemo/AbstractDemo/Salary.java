package abstractdemo;
public class Salary extends Employee {

    private double salary;   // Annual salary
    
    //Must implement the Abstract Method
    double computePay() {
        System.out.println("Computing monthly salary pay for " + getName());
        return salary / 12;
    }   
       
    //Overriding the Non Abstract Method as well
    void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() 
                + " with salary " + salary
                + " and check no: " + getNumber());
    }
    
    double getSalary() {
        return salary;
    }

    void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    Salary(String name, String address, int number, double salary) {
        
        super(name,address,number);
        setSalary(salary);
    }
    
    

    

}
