import java.util.Scanner;

public class Arrayutility {

    public static int[] IncNoinArray(int size){
        Scanner input = new Scanner(System.in);

        int[] Arr = new int[size];

        int i = 0;
        while(i < size){
            System.out.print("Enter the " + (i+1) + " Number: " );
            Arr[i] = input.nextInt();
            i++;
        }

        return Arr;
    }

    public static void Display(int[] arr){
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static int[][] Array2D(){

        Scanner input = new Scanner(System.in);// we have to write it again in every method to take input, cause another method can't access the MAIN class.

        System.out.print("Enter the No Of Rows = ");
        int rows = input.nextInt();

        System.out.print("Enter the No or columns = ");
        int columns = input.nextInt();

        int[][] newarr = new int[rows][columns];

        int i = 0;

        while(i < rows){

            int j = 0;

            while(j < columns){
                System.out.print("Enter the " + i + " Row " + j + " column no = " );
                newarr[i][j] = input.nextInt();
                j++;
            }

            i++;
        }

        return newarr;
    }
}
