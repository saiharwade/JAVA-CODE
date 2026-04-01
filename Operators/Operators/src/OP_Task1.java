import java.sql.SQLOutput;
import java.util.Scanner;

//Create a program that takes two numbers and shows result of all arithmetic operators(+,-,*,/,%)

public class OP_Task1 {
    static void main(String[] args) {
        System.out.println("Sum of Two Numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number:");
        int a  = input.nextInt();
        System.out.print("Enter Your Second Number:");
        int b = input.nextInt();
        System.out.println("The Addition of the Numbers are = " + (a + b));
        System.out.println("The Subtraction of the Numbers are = "+ (a - b));
        System.out.println("The Multiplication of the Numbers are = " +  ( a * b));
        System.out.println("The Division of Numbers are = "+ ((float)a/b));
        System.out.println("The Modulus of the Numbers are = " + (a % b));
        System.out.println("Result of" + a + b); // we have to give (a+b) cause if we didn't do this as java run from left to right the it adds string "result of" + a (a is converted to string)
    }
}
