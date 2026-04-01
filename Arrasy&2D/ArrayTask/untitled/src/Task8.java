//Merge Two Sorted Array

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Print the size of the Array: ");
        int size = input.nextInt();

        System.out.print("Please Enter the Size of 2 Array");

        int[] Arr1 = Arrayutility.IncNoinArray(size);
        System.out.print("Please Enter the size of Second Number");
        int[] Arr2 = Arrayutility.IncNoinArray(size);

        int[] newArr = merge(Arr1, Arr2);

        int i = 0;
        while (i < newArr.length) {
            System.out.print(newArr[i] + " ");
            i++;
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;

        int[] newArr = new int[newSize];

        int i = 0; // First Array
        int j = 0; // Second Array
        int k = 0; // New Array

        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}  