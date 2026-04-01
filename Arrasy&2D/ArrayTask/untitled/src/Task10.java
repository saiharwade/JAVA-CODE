//Create a program to do sum and average of all elements in a 2-D array.


public class Task10 {
    public static void main(String[] args) {


        int[][] newarr = Arrayutility.Array2D();



        int sum = searchNo(newarr);
        System.out.print("The Sum of the Array is = " + sum);

    }

    public static int searchNo(int[][] arr){
        int i = 0;
        int sum = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;

    }

}