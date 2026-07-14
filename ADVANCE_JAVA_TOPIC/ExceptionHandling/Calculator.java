package ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int first = input.nextInt();
        int Sec = input.nextInt();

        //We Use try when we know that this type of exception might come.
        try{
            int[] a = new int[5];
            a[6] = first / Sec;
            int sum = first / Sec;
            System.out.println("The Sum is" + a + " ," + sum);

        }catch(ArithmeticException exception){
            System.out.printf("%s, enter valid values", exception.getMessage());
            System.out.println();
            System.out.println("Enter the Valid Number");

        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("The Array Don't have the number of index you Entered");

        }catch(NumberFormatException e) {// | AritheticException){
            //You Can give same output to both Exception
            System.out.println("Multiple Exception");

        }catch(Throwable th){//Throwable contains al types exception, if any above exception doesn't invokes then we can trigger throwable exception which contains all exception
            System.out.println("General Exception");
        }
        //So this try Catch Exception Handling tech."[]=-=--
        //It tell's the java to atleast try and check if the code is executable.
        //So it will try and once and if there is an error/Exception then instead of giving an error it will show the mess written inside the catch

//      The exception thrown is NullPointerException, but the catch block only handles ArithmeticException.
//
//      Output:
//      Exception in thread "main" java.lang.NullPointerException
    }
}

//package in.kgcoding.exception;
//
//import java.util.Scanner;
//
//public class Calculator {
//    public static void main(String[] args) {
//        a();
//    }
//
//    private static void a() {
//        b();
//    }
//
//    private static void b() {
//        c();
//    }
//
//    private static void c() {
//        d();
//    }
//
//    private static void d() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Division Calculator\n");
//        System.out.print("Please enter your two numbers: ");
//        int first = input.nextInt();
//        int second = input.nextInt();
//
//        try {
//            int[] a = new int[5];
//            System.out.printf("Result is %d", a[6]);
//            a[6] = first / second;
//            System.out.printf("Result is %d", a[6]);
//        } catch (ArithmeticException exception) {
//            System.out.printf("%s, enter valid values",
//                    exception.getMessage());
//        } catch (Throwable th) {
//            System.out.println("General Exception.");
//            throw th;
//        } finally {
//            System.out.println("I am in finally");
//        }
//    }
//}