//Create a program to print the month of the year based on a number(1-12) input by the user.

import java.util.Scanner;

public class Challenge57 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = input.nextInt();
        System.out.print("Your Month Name is " + Month(Num));
    }

    public static String Month(int Day){
        String result = switch(Day){
            case 1 -> "Jan";
            case 2 -> "Jan";
            case 3 -> "Jan";
            case 4 -> "Jan";
            case 5 -> "Jan";
            case 6 -> "Jan";
            case 7 -> "Jan";
            case 8 -> "Jan";
            case 9 -> "Jan";
            case 10 -> "Jan";
            case 11 -> "Jan";
            case 12 -> "Jan";
            default -> "Invalid Number";
        };

        return result;
    }
}
