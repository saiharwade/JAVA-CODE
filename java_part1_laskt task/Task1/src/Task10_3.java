import java.util.Scanner;

public class Task10_3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = input.nextInt();

    }

    public static boolean isArmstrong(int num){
        int count = noofDigits(num);
        return false;
    }

    public static int pow(int num1, int num2){
        int result = num1;
        int i = 1;
        while(i < num2){
            result *= num1;
        }
        return result;
    }


    //This function Gives the number of Digit in the Number
    public static int noofDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}
