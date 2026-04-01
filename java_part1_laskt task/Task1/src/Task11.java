//Check Whether a Number is Palindrome or not

import java.util.Scanner;

public class Task11 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        boolean Palindrome = isPalindrome(num);
        if(Palindrome){
            System.out.println("The Number is Palindrome");
        }else{
            System.out.println("The Number is not Palindrome");
        }

    }
    public static boolean isPalindrome(int num){
        int number = num;
        int reverse = Reverse(num);
        return number == reverse;
    }

    public static int Reverse(int n){
        int rev = 0;

        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}

