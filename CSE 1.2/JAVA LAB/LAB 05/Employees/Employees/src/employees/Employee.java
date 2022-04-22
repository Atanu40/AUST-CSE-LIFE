package employees;
public class Employee {
    
    int eid;
    String name;
    String designation;
    int age;
   
    public Employee(){
    }

    public Employee(int eid, String name, String designation, int age) {
        this.eid = eid;
        this.name = name;
        this.designation = designation;
        this.age = age;
    }
    
    boolean findEmployee(Employee[] findEmplArray, String findName)
    {
        for(int i=0;i<findEmplArray.length;i++)
        {
            if(findEmplArray[i].name.equals(findName))
            {
                return true;
            }
        }
        return false;
    }
    
    boolean findEmployee(Employee[] findEmplArray, int findEid)
    {
        for(int i=0;i<findEmplArray.length;i++)
        {
            if(findEmplArray[i].eid==findEid)
            {
                return true;
            }
        }
        return false;
    }
    
    boolean findEmployee(Employee[] findEmplArray, String findDesig,int findAge)
    {
        for(int i=0;i<findEmplArray.length;i++)
        {
            if(findEmplArray[i].designation.equals(findDesig) 
                    && findEmplArray[i].age==findAge)
            {
                return true;
            }
        }
        return false;
    }
    
}
