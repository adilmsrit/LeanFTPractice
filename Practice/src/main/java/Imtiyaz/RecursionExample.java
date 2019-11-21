package Imtiyaz;

public class RecursionExample {

    public static void main(String... args) {
        reduceByOne(3);
    }

    public static void reduceByOne(int n) {

        if (n != 0)  // This is called the Base Case.
        {
            reduceByOne(n - 1);
        }
        System.out.println(n);
    }

}
