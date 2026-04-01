//Create a Program to find if the given Number is even or odd.

import java.util.Scanner;

public class challenge54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int num = input.nextInt();
        System.out.print(EvenOdd(num));

    }

    public static String EvenOdd(int num){
        String Result = num % 2 != 0 ? "The Number is Odd" : "The Number is Even";

        return Result;
    }
}
