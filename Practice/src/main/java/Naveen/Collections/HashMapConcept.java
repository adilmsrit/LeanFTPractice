package Naveen.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String... args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Selenium");
        hm.put(2, "QTP");
        hm.put(3, "TestCOmplete");
        hm.put(4, "RFT");

        System.out.println(hm.get(1));
        System.out.println(hm.get(4));

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey()+" " + m.getValue());
        }
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);

        HashMap<Integer, Employee> emp = new HashMap<>();

        Employee e1 = new Employee("Tom", 25, "admin");
        Employee e2 = new Employee("Peter", 26, "QA");
        Employee e3 = new Employee("Steve", 27, "Dev");

        emp.put(1, e1);
        emp.put(2, e2);
        emp.put(3, e3);

        for (Map.Entry<Integer, Employee> m : emp.entrySet()) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println(m.getValue().name);
            System.out.println(m.getValue().age);
            System.out.println(m.getValue().role);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
    }
}