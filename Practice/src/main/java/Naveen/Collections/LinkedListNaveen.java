package Naveen.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListNaveen {
    public static void main(String... args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("test");
        ll.add("qtp");
        ll.add("selenium");
        ll.add("RPA");
        ll.add("RFT");

        System.out.println(ll);

        //addFirst
        ll.addFirst("Adil");
        //addLast
        ll.addLast("Automation");

        System.out.println(ll);

        //get
        System.out.println(ll.get(1));
        //set
        ll.set(1, "Tom");
        System.out.println(ll.get(1));

        //removeFirst
        ll.removeFirst();
        //removeLast
        ll.removeLast();
        System.out.println(ll);

        //remove from index
        ll.remove(1);
        System.out.println(ll);

        //To Print all the elements of the LinkedList

        //1. For each loop
        System.out.println("^^^^^^^^^^^^^^^^Use Advanced For loop^^^^^^^^^^^^^^^^");
        for (String s : ll ) {
            System.out.println(s);
        }

        //2. Iterator
        System.out.println("^^^^^^^^^^^^^^^^Using Iterator^^^^^^^^^^^^^^^^");
        Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("^^^^^^^^^^^^^^^^Use For loop^^^^^^^^^^^^^^^^");
        //3. Simple for loop
        for (int i = 0; i <ll.size() ; i++) {
            System.out.println(ll.get(i));
        }

        System.out.println("^^^^^^^^^^^^^^^^Use While loop^^^^^^^^^^^^^^^^");
        //4. use While loop
        int num = 0;
        while (ll.size() > num) {
            System.out.println(ll.get(num));
            num++;
        }
    }
}