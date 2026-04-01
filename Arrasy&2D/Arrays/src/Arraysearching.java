import java.util.Scanner;

public class Arraysearching {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] arr = {12,113,14,15,16,17};
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.print("The Numeber Found");
        }
        else{
            System.out.print("The Number didn't Found");
        }
    }

    public static boolean isFound(int[]arr, int num){
        int i = 0;
        while(i < arr.length){
            if(num == arr[i]){
                return true;
            }
            i++;
        }
        return false;
    }
}
