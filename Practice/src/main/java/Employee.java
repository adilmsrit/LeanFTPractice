public class Employee {
    String name;
    String address;
    String phoneNumber;
    float experience;

    void punchIn(){
        System.out.println("Punch In");
    }

    public static void main(String... args) {
        Demo demo2 = Demo.checkAndReturnObject();
        Demo demo3 = Demo.checkAndReturnObject();

    }
}
