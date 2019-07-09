package Test.Naveens;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    int a[] = new int[3];

    public static void main(String[] args) {

        /*
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        */

        Employee e1 = new Employee("Naveen", 27, "QA");
        Employee e2 = new Employee("Tom", 28, "Dev");
        Employee e3 = new Employee("Peter", 29, "Admin");

        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        //Iterator to traverse the values.

        Iterator<Employee> it = ar4.iterator();

        while (it.hasNext()) {
            Employee employee = it.next();
            System.out.println(employee.age);
            System.out.println(employee.name);
            System.out.println(employee.dept);
        }

    }
}