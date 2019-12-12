package JavaInterPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public final class Temp {
    public static void main(String... args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Comparator comp = Collections.reverseOrder();

        Collections.sort(list,comp);
        System.out.println(list);
    }
}