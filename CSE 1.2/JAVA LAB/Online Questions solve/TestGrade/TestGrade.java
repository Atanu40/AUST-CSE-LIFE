/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgrade;

/**
 *
 * @author Atanu
 */
public class TestGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Grade obj1=new Grade("Java","1206",66);
        Grade obj2= new Grade("C","1105",80);
        
        System.out.println(obj1.checkGrade(obj1.getMarks()));
        
        if (obj1.compareGrades(obj2) == true)
            System.out.println("Same");
        else
            System.out.println("Different");
    }
    
}
