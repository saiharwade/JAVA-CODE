//Create a Program to find the minimum of two numbers.

import java.util.Scanner;

public class challenge53 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker: ");System.out.print("Please Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int num2 = input.nextInt();

        int minimumNumber = num1 < num2 ? num1 : num2;
        System.out.println(minimumNumber + " is the Smaller Number");
    }
}
