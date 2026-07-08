package CollectionFrameworksjava;

import java.util.HashMap;
import java.util.Map;

public class Challenge96 {
    public static void main(String[]args){
        Map<String, Integer> map = new HashMap<>();

        //Map store value in key value pair.
        
        map.put("Sai",100);
        map.put("Soham",100);
        map.put("Lavkesh",100);
        map.put("Nitin",100);
        System.out.println(map.size());
        System.out.println(map.get("Sai"));
        System.out.println(map.get("Nitin"));
        System.out.println(map.size());
        System.out.println(map.remove("Nitin"));
        System.out.println(map.size());
    }
}
