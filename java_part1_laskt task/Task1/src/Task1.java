//Develop a program that prints the multiplication table for a given numbers


import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1{
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number You want a table: ");
        int n = input.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.println(n + " x "+ i + " = " + (n*i));
            i++;
        }
    }
}