
package testsphere;

import java.util.Scanner;


public class TestSphere {

  
    public static void main(String[] args) {
        
        Sphere sphereArr[]= new Sphere[3];

        sphereArr[0]=new Sphere(101,"Red",4);
        sphereArr[1]=new Sphere(102,"Blue",3);
        sphereArr[2]=new Sphere(103,"Green",2);
        
        
        //Creating an empty object of Sphere class
        Sphere findRad = new Sphere();
        
        System.out.println("Calling the Methods of Sphere class by giving direct values in parameter" + "\n");
        
        System.out.println("Radius of Sphere Searched by ID 102 is " +
                          findRad.getArea(sphereArr, 102));
        
        System.out.println("Radius of Sphere Searched by color Violet is " + 
                findRad.getArea(sphereArr, "Violet"));
        
        
        
        //Call methods using user input.
        Scanner in= new Scanner(System.in);
        
        System.out.println("\nCalling the Methods of Sphere class by giving user input values in parameter" + "\n");
        
        
        System.out.print("Enter a sphere id which you want to search : ");
        int searchId = in.nextInt();
        
        System.out.println("Radius of Sphere Searched by ID "+ searchId 
                            +" is " + findRad.getArea(sphereArr, searchId));
        
        //taking a String input which will take the enter as input
        in.nextLine();
        
        System.out.print("Enter a sphere color which you want to search : ");
        String searchColor = in.nextLine();
        
        System.out.println("Radius of Sphere Searched by color "+ searchColor 
                            +" is " + findRad.getArea(sphereArr, searchColor));

        
    }
    
}
