package PracticePrograms;

public class StaticBlockDemo {

    private int jj;
    static int i;
    int j;

    static {
        i = 10;
        System.out.println("In the Static blocked and initialized 'i'");
    }

    public StaticBlockDemo() {
        System.out.println("In the constructor now.");
    }

    {
        System.out.println("This is the initializer Block");
    }
     public static void main(String... args) {


    }

}
