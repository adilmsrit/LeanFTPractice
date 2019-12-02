package Naveen.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNaveen {

    public static <E> void main(String... args) {

        int[] a = new int[3];

        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(54.33);
        ar.add('a');

        ar.add("Adil");
        ar.add(true);

        System.out.println(ar.size());
        System.out.println(ar.get(4));

        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(1000);

        ArrayList<Employee> ar4 = new ArrayList<Employee>();

        Employee e1 = new Employee("Adil", 38, "QA");
        Employee e2 = new Employee("Ansar", 39, "QA2");
        Employee e3 = new Employee("Shajeer", 40, "QA3");

        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        Iterator<Employee> iterator = ar4.iterator();

        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            System.out.println("With iterator:: " + emp.name);
            System.out.println("With iterator:: " + emp.age);
            System.out.println("With iterator:: " + emp.role);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }

        //Method 2
        for (Employee e : ar4) {
            System.out.println("With for each: " + e.name);
            System.out.println("With for each: " + e.age);
            System.out.println("With for each: " + e.role);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }

        ArrayList<String> ar7 = new ArrayList<String>();
        ArrayList<String> ar8 = new ArrayList<String>();

        ar7.add("test");
        ar7.add("selenium");
        ar7.add("QTP");

        ar8.add("test");
        ar8.add("Java");

        ar7.retainAll(ar8);

        for (String s : ar7) {
            System.out.println(s);
        }
    }
}