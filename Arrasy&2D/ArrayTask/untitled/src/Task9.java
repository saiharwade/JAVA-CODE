//Create a program to search an element in a 2-D array.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number you want to find out: ");

        int no = input.nextInt();

        int[][] newarr = {{1,2,3}, {4,5,2,6}};

        searchNo(newarr, no);


    }

    public static void searchNo(int[][] arr, int no){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(arr[i][j] == no){
                    System.out.println("No was Found at Row No" + i + " and Column Number " + j);
                }
                j++;
            }
            i++;
        }
    }
}
