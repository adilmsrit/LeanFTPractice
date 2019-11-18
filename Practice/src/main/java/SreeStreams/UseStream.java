package SreeStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseStream {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,4,3,1);

        System.out.println("Using Collections.sort");
        Collections.sort(nums);
        nums.stream()
                .forEach(a->System.out.print(a+","));

        System.out.println();
        System.out.println("Using stream");
        nums.stream()
                .sorted()
                .forEach(a->System.out.print(a+","));

        System.out.println();
        System.out.println("Using Comparator");
        Collections.sort(nums, new SortById());
        nums.stream()
                .forEach(a -> System.out.print(a+","));
    }
}

class SortById implements Comparator<Integer> {
    public int compare(Integer n1, Integer n2) {
        return n1.compareTo(n2);
    }
}

