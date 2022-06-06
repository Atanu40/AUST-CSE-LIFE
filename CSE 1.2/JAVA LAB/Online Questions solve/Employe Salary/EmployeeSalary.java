package employeesalary;


public class EmployeeSalary {


    public static void main(String[] args) {
     
        ChangeSalary sn1=new ChangeSalary("Manager",45000,30);
        ChangeSalary sn2=new ChangeSalary("HR",60000,25);
        
        System.out.println(sn1.calculateSalary());
        System.out.println(sn2.calculateSalary());
        
        System.out.println("Salary of "+sn1.getPosition() +" is "+sn1.compareChange(sn2)
        +" than "+sn2.getPosition());
        
        sn1.setChange(68);
        System.out.println(sn1.calculateSalary());
    }
    
}
