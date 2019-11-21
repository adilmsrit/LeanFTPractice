package Bindings;
public class Office1 {
    public static void main(String... args) {
        Employee emp = new Employee();
        Employee programmer = new Programmer();
        System.out.println(emp.name);
        System.out.println(programmer.name);
        emp.printname();
        programmer.printname();
    }
}