package PracticePrograms;

public class StaticBlockDemo {

    static int i;
    int j;

    static {
        i = 10;
        System.out.println("In the Static blocked and initialized 'i'");
    }

    public StaticBlockDemo() {
        System.out.println("In th constructor now.");
    }


     public static void main(String... args) {

         StaticBlockDemo staticBlockDemo = new StaticBlockDemo();
         StaticBlockDemo staticBlockDemo1 = new StaticBlockDemo();
         StaticBlockDemo staticBlockDemo2 = new StaticBlockDemo();
         StaticBlockDemo staticBlockDemo3 = new StaticBlockDemo();
    }

}
