//Create a Program to return a new array by removing a particular element

import java.util.Scanner;

public class Task5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = input.nextInt();

        int[] Arr = Arrayutility.IncNoinArray(size);


        System.out.print("This is Your Array = ");

        int i = 0;
        while(i < Arr.length){
            System.out.print(Arr[i] + " ");
            i++;
        }

        System.out.println();

        System.out.print("Please Enter the Number You Want to Remove = ");
        int num = input.nextInt();

        int[] newArr = removeNo(Arr,num);

        System.out.println("This is Your New Array");
        Arrayutility.Display(newArr);
    }


    public static int[] removeNo(int[] Arr, int num){
        int count = count(Arr,num);
        int[] newArr = new int[Arr.length - count];
        int i = 0;
        int j = 0;
        while(i < Arr.length){
            if(Arr[i] != num){
                newArr[j] = Arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

    public static int count(int[]arr ,int num){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }
}
