/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionteaching;

/**
 *
 * @author student
 */
import java.util.Scanner;

public class ExceptionTeaching {

    /**
     * @param args the command line arguments
     */
    public static int doDivide(int x, int y) throws ArithmeticException {
        int z;
        if (y == 0) {
            throw new ArithmeticException();
        }
        z = x / y;

        return z;
    }

    public static void doJob5() {

        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        try{
        z = doDivide(x, y);
        }
        catch(ArithmeticException ex)
        {
        }
        System.out.println("The result is " + z);

    }

    public static void doJob4() {
        int x, y, z, index;
        int arr[] = new int[2];
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        index = sc.nextInt();
        try {
            arr[index] = y;
            try {
                z = doDivide(x, arr[index]);
                System.out.println("The result is " + z);
            } catch (ArithmeticException ex) {
                System.out.println("Invalid Input for divisor");
                System.out.println(ex);
                ex.printStackTrace();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Input for array index");
            System.out.println(ex);
            ex.printStackTrace();
        } finally {
            System.out.println("We are here");
        }

    }

    public static void doJob3() {
        int x, y, z, index;
        int arr[] = new int[2];
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        index = sc.nextInt();
        try {
            arr[index] = y;

            z = doDivide(x, arr[index]);
            System.out.println("The result is " + z);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Input for array index");
            System.out.println(ex);
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            System.out.println("Invalid Input for divisor");
            System.out.println(ex);
            ex.printStackTrace();
        } finally {
            System.out.println("We are here");
        }

    }

    public static void doJob2() {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        try {
            z = doDivide(x, y);
            System.out.println("The result is " + z);
        } catch (Exception ex) {
            System.out.println("Invalid Input");
            System.out.println(ex);
            ex.printStackTrace();
        } finally {
            System.out.println("We are here");
        }

    }

    public static void doJob1() {

        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = x / y;
        System.out.println("The result is " + z);

    }

    public static void main(String[] args) {
        // TODO code application logic here

        doJob5();

    }

}
