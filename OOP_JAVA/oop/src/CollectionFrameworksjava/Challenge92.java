package CollectionFrameworksjava;

import java.util.Arrays;
import java.util.List;

public class Challenge92 {

    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(list);
        Challenge92.swap(list,2,5);
        //swap(list,2,5);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x, list.get(y)); //Here x is the index were we want to store number.
        list.set(y,swap); //Basically left is the position were we want to store the value and swap.
    }
}
