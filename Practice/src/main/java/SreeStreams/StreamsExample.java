package SreeStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String... args) {
        List<String> stringList = Arrays.asList("1", "2", "3");

        /*Below create a new String, take the original string and convert to the stream
        On this stream use map and for each item of the map take the string value of the item(Which is an integer)
        now once this is done collect all and put in the list.
        Now you can print out the list.
         */

        List<Integer> integerList = stringList.stream()
                .map(x->Integer.valueOf(x))
                .collect(Collectors.toList());
        System.out.println(integerList);

        String a = "adil";
        System.out.println(a.equals(a));

        /*Convert stringList List to Stream, use the map and for each item in the
        * map take the value of the item, then collect all to put it in a string.
        * Then again take the stream of the output, and for each Item print as output.
         */
/*
        stringList.stream()
                .map(a -> String.valueOf(a))
                .collect(Collectors.toList())
                .stream()
                .forEach(a -> System.out.println(a));*/

    }
}
