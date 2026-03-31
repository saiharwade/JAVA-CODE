//Recursion - Recursion is nothing but looping backward and calling the function.
//Ex - if there are 100 bricks and we can't shift all 100 bricks all together we will shift one brick at one time and reach till the 0 th brick
//Every recursive function has 2 mandatory parts:
//
//        1. Base Case (Stopping Condition)
//        Prevents infinite recursion
//        Smallest problem you can solve directly
//        2. Recursive Case
//        Function calls itself with a smaller input

import java.util.Scanner;

public class Recursion {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factorial of Number: ");
        System.out.print("Enter the Number for factorial: ");
        int num = input.nextInt();

        int fact = factorial(num);
    }

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
