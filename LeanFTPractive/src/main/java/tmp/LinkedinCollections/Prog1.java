package tmp.LinkedinCollections;

import java.lang.reflect.Array;
import java.util.*;

public class Prog1 {

    public static void main(String[] args) {

        Collection collection = Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet");
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }




        /*
        List<Integer> list1 = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        System.out.println(Collections.binarySearch(list1, 21));*/

    }
}
