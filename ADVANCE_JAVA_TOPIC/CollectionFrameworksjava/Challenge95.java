package CollectionFrameworksjava;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Challenge95 {

    public static void main(String[]args){

        Set<Character> unique = new HashSet<>();

        Scanner input = new Scanner(System.in);
        String userstr = input.next();

        for(char chr : userstr.toCharArray()){
            unique.add(chr);
        }

        System.out.print(unique);

    }
}
