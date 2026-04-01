//Create a program to check if the given array is sorted.
//either Ascending or Descending

public class Task4 {
    public static void main(String[]args){
        int[] Arr = {6,6,4,3,2,1};
        boolean sortAsc = SortedAsc(Arr);
        boolean sortDesc = SortedDesc(Arr);
        if(sortAsc || sortDesc){
            System.out.print("The Array is Sorted");
        }
        else{
            System.out.print("The Array is not Sorted");
        }

    }
    public static boolean SortedAsc(int[] Arr){
        int i = 0;
        int f = 1;
        while(f < Arr.length){
            if(Arr[i] <= Arr[f]){
                i++;
                f++;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean SortedDesc(int[] Arr){
        int i = 1;

        while(i < Arr.length){
            if(Arr[i-1] < Arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
