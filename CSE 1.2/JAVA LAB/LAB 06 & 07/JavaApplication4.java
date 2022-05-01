/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author student
 */

class Crickter{
    String name, country;
    int age;
    
    Crickter(String name, String country, int age){
        this.name = name;
        this.country = country;
        this.age = age;
    }
    
    void printInfo(){
        System.out.println("Name: "+name+" country: "+country+" age: "+age);
    }
}

class Batsman extends Crickter{
    int [][] batInfo = new int[2][15];
    Batsman(String name, String country, int age, int [][] batInfo){
        super(name,country,age);
        this.batInfo = batInfo;
    }
    
    void printInfo(){
        super.printInfo();
        for(int j=0;j<15;j++){
            System.out.println("mathch "+(j+1)+" out: "+batInfo[0][j]+"run: "+batInfo[1][j]);
        }

    }
}
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] infoBat = new int[2][15];
       Batsman bat1 = new Batsman("rahim", "BD", 24,infoBat );
       bat1.printInfo();
    }
    
}
