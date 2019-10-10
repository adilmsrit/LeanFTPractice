package OCA;

public class Zebra extends Animal {

    private String name = null;

    public Zebra(int age) {
        super(4);
//        super(age, "Zebra");
        this.name = "adil";
    }

    public Zebra() {
        super(5);
    }

    public static void main(String[] args) {
        System.out.println("Compiled");
    }

}
