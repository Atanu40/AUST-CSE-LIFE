package twodtest;

import java.util.*;

public class TwoDTest {

    public static void main(String[] args) {
        
        //2D array 1
        int a[][] = {{1, 3, 4}, 
                     {3, 4, 5}, 
                     {2, 3, 4}};
        
        //2D array 2
        int b[][] = {{1, 3, 4}, 
                     {3, 4, 5}, 
                     {1, 6, 3}};
        
        //New empty 2D array
        int add[][] = new int[3][3];
        
        System.out.println("Result After Adding the two matrices");
        
        //Adding the two Matrices
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                add[i][j] = a[i][j] + b[i][j];
                
                System.out.print(add[i][j] + " ");
            }
            //This print statement is used to give a new line after first row
            System.out.println();
        }

    }
}
