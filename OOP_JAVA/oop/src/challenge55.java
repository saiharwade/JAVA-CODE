//Create a Program to find the absolute Number.

import java.util.Scanner;

public class challenge55 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = input.nextInt();
        System.out.print(absoluteNum(Num));

    }

    public static int absoluteNum(int num){
        int result = num > 0 ? num : ((num) * (-1)); //or -num
        return result;
    }
}
