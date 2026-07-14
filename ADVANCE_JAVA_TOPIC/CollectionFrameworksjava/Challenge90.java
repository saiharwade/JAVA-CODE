package CollectionFrameworksjava;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Challenge90 {

    public static void main(String[] args) {

    }

    public static void sortInDescending(List<String> stringList) {

        //Collections.sort(stringList);
        Collections.sort(stringList, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {

                if (s1.equals(s2)) {
                    return 0;
                } else if (s1.charAt(0) > s2.charAt(0)) {
                    return -1;
                } else {
                    return 1;
                }
            }

        });
    }
}