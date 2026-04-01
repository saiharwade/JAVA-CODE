//Print the fibonacci Series.

import java.util.Scanner;

public class Task9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number till you Want the Fibonacci: ");
        int n = input.nextInt();
        printFibonacci(n);
    }
    public static void printFibonacci(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if(num == 0 ) return;
        System.out.print("1 ");

        int first  = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
