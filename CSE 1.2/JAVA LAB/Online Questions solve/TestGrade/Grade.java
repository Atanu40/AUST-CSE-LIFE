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
public class Grade {
    
    String courseName , courseNumber;
    double  marks;

    public Grade(String courseName, String courseNumber, double marks) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.marks = marks;
    }

    public Grade() {
        
        courseName = "Null";
        courseNumber = "Null";
        marks = -1;
    }
    
    public String checkGrade(double obtMarks)
    {
        String grade="";
        
        if(obtMarks >= 80)
        {
            grade = "A";
        }
        else if(obtMarks >= 70 && obtMarks < 80)
        {
            grade = "B";
        }
        else if(obtMarks >= 50 && obtMarks < 70)
        {
            grade = "C";
        }
        else if(obtMarks >= 40 && obtMarks < 50)
        {
            grade = "D";
        }
        else if(obtMarks >= 0 && obtMarks < 40)
        {
            grade = "F";
        }
        
        return grade;
    }
    
    public boolean compareGrades(Grade obj){
        
        boolean res=false;
        if(checkGrade(this.marks) == checkGrade(obj.marks))         
            res=true;
            
        return res;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    
    
    
    
}
