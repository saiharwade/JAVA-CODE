//Create a Program to find the Maximum and Minimum number from the Array.

public class Task3 {
    public static void main(String[]arg){
        int[] Arr = {23,234,12,453,45,543,12};
        System.out.print("The Maximum and Minimum number from the Array is "+max(Arr)+","+min(Arr));
    }
    public static int max(int[] arr){
        int i = 0;
        int max = 0;
        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] arr){
        int i = 0;
        int min = 0;
        while(i < arr.length){
            if(i<arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
