package HeadFirst;

public class WrapperClasses {
    Integer i;
    int j;
    public static void main(String... args) {
        WrapperClasses wrapperClasses = new WrapperClasses();
        wrapperClasses.go();
    }
    public void go() {
        System.out.println(i);
        System.out.println(j);
        j=1;
        i=3;
        j = i;
        System.out.println(i);
        System.out.println(j);
    }
}