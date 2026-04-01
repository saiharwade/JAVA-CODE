public class array2D {
    public static void main(String[]args){
        int[][] Arr = new int[2][3]; //First we define the no of rows and then we define the no of columns
        int[][] inArray = {{1,2,3}, {8,9,4}};

        Arr[0][0] = 5;
        Arr[0][1] = 4;
        Arr[0][2] = 3;
        Arr[1][0] = 2;
        Arr[1][1] = 1;
        Arr[1][2] = 0;

        int i = 0; // this is for rows
        while(i <= Arr.length){
            int f = 0; //this is for columns
            while(f < Arr[i].length){
                System.out.print(Arr[i][f]+ " ");
                f++;
            }
            System.out.println();
            i++;
        }
    }
}

// two types of arrays
//homogenous = where the number of rows and columns are same.
//hetrogenous = where the number of rows and columns are not same.