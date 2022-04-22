package employees;

public class TestEmployee {

    public static void main(String[] args) {
        
        Employee[] employeeArray = new Employee[3];
        employeeArray[0]= new Employee(1,"Robert","Manager",35);
        employeeArray[1]= new Employee(2,"Danielle","CEO",40);
        employeeArray[2]= new Employee(3,"Amy","Developer",27);
        
        for(int i=0;i<employeeArray.length;i++)
        {   
            int id=employeeArray[i].eid;
            String name=employeeArray[i].name;
            String designation=employeeArray[i].designation;
            int age=employeeArray[i].age;   
            System.out.println("Employee ID: " + id +" Name: " + name +
                             " Designation: " + designation + " Age: " + age);
        }
        
        //Another employee object has been created to call the methods.
        //You could have used the array objects as well if you wanted to.
        
        Employee newObj=new Employee();
        
        if(newObj.findEmployee(employeeArray, 2)==true)
            System.out.println("Employee Found using EID");
        else
            System.out.println("Employee Not Found using EID");
        
        if(newObj.findEmployee(employeeArray, "Amy")==true)
            System.out.println("Employee Found using Name");
        else
            System.out.println("Employee Not Found using Name");
        
        if(newObj.findEmployee(employeeArray,"CEO",27)==true)
            System.out.println("Employee Found using Designation and Age");
        else
            System.out.println("Employee Not Found using Designation and Age");
    } 
}


