//Create a Program that reverse the elements of a list and prints the reversed list.

package CollectionFrameworksjava;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Challenge93 {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,3,2,4,6,5,8,7,9);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);
    }

    public static void reversee(List<Integer> list){

        for(int i = 0; i < list.size() / 2; i++){
            Challenge92.swap(list, i ,list.size() - 1 - i);
        }
    }
}
