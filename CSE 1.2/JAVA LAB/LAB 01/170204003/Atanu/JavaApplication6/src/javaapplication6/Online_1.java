


package javaapplication6;

import java.util.Scanner;



public class Online_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("PLEASE ENTER TWO NUMBER:");
        int a=input.nextInt();
        int b=input.nextInt();
        int sum1=0;
        int sum2=0;
        
    for(int i=1;i<a;i++){
    
        if(a% i == 0){
            sum1=sum1 + i;
        }
    }
    for(int i=1;i<b;i++){
        if(b % i == 0){
            sum2 = sum2 + i;
        }
    }
        if (a==sum2&&b==sum1) {
            System.out.println("yes"); 
        }
        else
        {
            System.out.println("No");
        }
    }

}
