package JavaInterPrograms;

public class FactorialOfANumber {

    public static void main(String... ags) {
        int result = 1;
        int num = 10;
        for (int i = num; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);
        System.out.println("********************");
        System.out.println(fact(num));
    }
    public static int fact(int num) {
        if (num == 0) return 1;
        return (num * fact(num - 1));
    }
}
