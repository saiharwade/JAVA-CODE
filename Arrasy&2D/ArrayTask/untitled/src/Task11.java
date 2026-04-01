
public class Task11{
    public static void main(String[]args){
        int[][] arr = Arrayutility.Array2D();

        boolean execu = DoNo(arr);

        if(execu){
            System.out.print("The Sum of the two diagonal elements is = " + sumDia(arr));
        }
        else{
            System.out.print("The Rows and Columns are Not Same");
        }




    }

    public static int sumDia(int[][]arr){
        int i = 0;
        int sum = 0;
        while(i < arr.length){
            sum += arr[i][i];
            i++;
        }

        int sum2 = 0;
        int k = 0;
        int j = arr.length - 1;
        while(j >= 0){
            sum2 += arr[k][j];
            k++;
            j--;
        }
        return sum + sum2;
    }

    public static boolean DoNo(int[][]arr){
        int i = 0;
        int count = 0;
        while(i < arr.length){
            if(arr[i].length != arr.length){
                return false;
            }
            i++;
        }
        return true;
    }
}