package Naveen;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String... args) {
        Employee e1 = new Employee("Naveen", 27, "QA");
        Employee e2 = new Employee("Adil", 35, "SDET");
        Employee e3 = new Employee("Peter", 29, "Admin");


        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);
        Iterator<Employee> it = ar4.iterator();
        while (it.hasNext()) {
            Employee employee = it.next();
            System.out.println("****************************");
            System.out.println(employee.name);
            System.out.println(employee.age);
            System.out.println(employee.dept);
        }
    }
}
