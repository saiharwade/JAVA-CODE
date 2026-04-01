//Create a program to find number of occurences of an element in an array
import java.util.Scanner;
public class Task2 {
    public static void main() {
        Scanner input= new Scanner(System.in);
        int[] arr = {22, 12, 23, 2, 34, 4, 3, 22, 3, 3, 2, 56, 3};
        System.out.print("Enter the Number You want to check: ");
        int num = input.nextInt();
        int count = count(arr, num);
        System.out.print("The Number of Times the Number "+num + " occured is " + count);

    }
    public static int count(int[] arr, int num){
        int i = 0;
        int count = 0;
        while(i < arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }
}

