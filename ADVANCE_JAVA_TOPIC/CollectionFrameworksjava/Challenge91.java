package CollectionFrameworksjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge91 {
    public static void main(String[]args){

        List<Integer> list = Arrays.asList(2,3,4,5,6,8); //Here the aslist() method create the object of arraylist and returns the reference of it which is stored in the left variable. instead of writing new.
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 7));
        System.out.println(Collections.frequency(list, 2));
    }
}
