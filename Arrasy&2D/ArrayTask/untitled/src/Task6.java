//Write a code to Reverse a Code.

import java.util.Scanner;

public class Task6 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = input.nextInt();

        int[] Arr = Arrayutility.IncNoinArray(size);
        System.out.print("This is Your Previous Array = " );
        Arrayutility.Display(Arr);

        System.out.println();

        int[] newArr = Reverse(Arr);
        System.out.print("This is Your New Array = " );
        Arrayutility.Display(newArr);

    }

    public static int[] Reverse(int[] Arr){
        int i = Arr.length - 1;
        int j = 0;
        int[] newArr = new int[Arr.length];
        while( i >= 0){
            newArr[j] = Arr[i];
            j++;
            i--;
        }
        return newArr;
    }
}
