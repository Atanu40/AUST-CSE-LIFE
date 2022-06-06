
package employeesalary;

public class ChangeSalary {
    
    private String position;
    private double salary;
    private double change;

    public ChangeSalary() {
        
        position = null;
        salary = -1.0;
        change = -1.0;
    }
    
    public ChangeSalary(String position, double salary, double change) {
        this.position = position;
        this.salary = salary;
        this.change = change;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        
        this.salary = salary;
        
        if(this.salary<=0)
            this.salary=1;
        
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }
    
    public double calculateSalary()
    {
        return (salary+(salary*(change/100)));
    }
    
    public String compareChange(ChangeSalary obj)
    {
        String comp=null;
        
        if(calculateSalary()==obj.calculateSalary())
            comp="same";
        else if(calculateSalary()>obj.calculateSalary())
            comp="greater";
        else if(calculateSalary()<obj.calculateSalary())
            comp="less";
        
        return comp;
    }
    
}
