package CollectionFrameworksjava;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[]args){

        //As We know List can Duplicate's, Have an Order, and also Mutable

        List<String> strList = new ArrayList<>(); //In the Diamond brackets we write the type of data we are going to store in the List

        strList.add("Sai");
        strList.add("Soham");
        strList.add("Lavkesh");


        strList.add(1, "Mangesh");
        strList.removeFirst(); // or remove() method

        if (strList.contains("Jain")) {
            System.out.println(strList.indexOf("Jain"));
        }

        for(int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }

        for (String str : strList) {
            System.out.print(str);
        }


    }
}
