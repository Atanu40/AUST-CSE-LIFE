package testarray;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TestArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Size of Array : ");
        int arraySize = input.nextInt();
        
        int array[] = new int[arraySize];
        
        for(int i = 0 ; i<arraySize ; i++)
        {   
            System.out.print("Element "+ (i+1) +": ");
            array[i]=input.nextInt();
        }
        
        int sortedNumber[] = sortArray(array);
        
        System.out.println("Sorted Array : ");
        for (int i = 0; i < sortedNumber.length; i++) {
            
            System.out.print(sortedNumber[i] + " ");
            
        }
   
        System.out.println("\nMinimum values in array:");
        minValueInArray(array);

    }

    static void minValueInArray(int arr[]) 
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
    static int[] sortArray(int arr[]) {
        
        int n=arr.length;
        int temp;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
