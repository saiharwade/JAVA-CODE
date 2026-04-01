//Create a Program to Check whether the Number is Palindrome or not.

import java.util.Scanner;

public class Task7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Size of the Array: ");
        int size = input.nextInt();

        int[] Arr = Arrayutility.IncNoinArray(size);
        int[] newArr = Task6.Reverse(Arr);

        if(PalindromeArr(Arr, newArr)){
            System.out.print("The Array is Palindrome");
        }
        else{
            System.out.print("The Array is Not Palindrome");
        }

    }

    public static boolean PalindromeArr(int[] Arr1 , int[] Arr2){
        int i = 0;
        while(i < Arr1.length){
            if(Arr1[i] != Arr2[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
