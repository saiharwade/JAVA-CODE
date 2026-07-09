package CollectionFrameworksjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge98 {
    public static void main(String[]args) {
        Map<String, String> CountriesCap = new HashMap<>();

        CountriesCap.put("India", "Delhi");
        CountriesCap.put("Pak", "karachi");
        CountriesCap.put("Brazil", "Brazilia");
        CountriesCap.put("France", "Paris");
        CountriesCap.put("England", "London");
        CountriesCap.put("USA", "Washington-DC");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Country Name: ");
        String Name = input.next();

        if(CountriesCap.containsKey(Name)){
            System.out.printf("The Capital of %s is %s",Name, CountriesCap.get(Name));
        }else{
            System.out.printf("Sorry Sir We Don't Have the data of %s" ,Name);
        }
    }
}
