package Practice.LinkedinCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlistexample {

    public static void main(String[] args) {

        LinkedList states = new LinkedList();

        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");

        states.addFirst("Alabama");

        System.out.println(states);

        Iterator iterator = states.listIterator();
        System.out.println("*********************************");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********************************");
        System.out.println(states.getLast());

        ListIterator listIterator = states.listIterator(states.size());
        System.out.println("Previous Iterations *********************************");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
