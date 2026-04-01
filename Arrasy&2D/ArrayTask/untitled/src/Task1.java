//Create a Program to find the sum and average of all elements in an array.

import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Array Sum and Average Calculator");
        System.out.print("Please Enter the Size of Array = ");

        int size = input.nextInt();
        int[] Arr = new int[size];

        int i = 0;
        while(i< size){
            System.out.print("Please Enter the " + (i+1) + " Number of Array = " );
            Arr[i] = input.nextInt();
            i++;
        }

        int sum = Suum(Arr);
        float Avg = Avg(Arr);
        System.out.println("The SUM and Average of the Array = " + sum+ "," + Avg );
    }

    public static int Suum(int[] aRR){
        int i = 0;
        int sum = 0;
        while(i < aRR.length){
            sum += aRR[i];
            i++;
        }
        return sum;
    }
    public static float Avg(int[] Arr){
        float Avg = (float) Suum(Arr) / Arr.length;
        return Avg;
    }
}
