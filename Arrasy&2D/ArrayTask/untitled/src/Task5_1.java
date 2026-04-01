import java.util.Scanner;

public class Task5_1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of an Array: ");
        int size = input.nextInt();

        int Arr[] = Arrayutility.IncNoinArray(size); //To input the Array

        System.out.print("Enter the Number you want to Delete: ");
        int num = input.nextInt();

        int count = Task2.count(Arr, num); //The Count the user input Number

        int[] newArr = newArr(Arr,num,count);
        Arrayutility.Display(newArr); //To Display The Array

//      int[] asss = {1,2,3,4};
//      System.out.print(asss); //Arrays are not Directly printed using there variable Number.

    }
    public static int[] newArr(int[] arr, int num, int count){
        int[] newArr = new int[(arr.length - 1) - count];
        int f = (arr.length - 1) - count;

        int i = 0;
        int j = 0;
        while(i < f){
            if(arr[i] != num){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
