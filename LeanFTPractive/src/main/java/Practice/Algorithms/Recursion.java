package Practice.Algorithms;

public class Recursion {

    public static void rec(int x) {
        if (x == 0) {
            System.out.println("Done.");
            return;
        } else {
            System.out.println("x is : " + x);
            x = x - 1;
            rec(x);
            System.out.println("foo... and x is : " + x);
        }
    }

    public static long power(int num, int power) {
        long result;
        if (power == 0) {
            return 1;
        } else {
            result = num * power(num, power - 1);
        }
        return result;
    }

    public static long factorial(int number) {
        long result;
        if (number == 0) {
            return 1;
        } else {
            result = number * factorial(number - 1);
        }
        return result;
    }

    public static void main(String[] args) {

        rec(4);
        System.out.println(power(2, 10));
        System.out.println(factorial(8));
    }
}