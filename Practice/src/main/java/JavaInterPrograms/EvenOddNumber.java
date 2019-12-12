package JavaInterPrograms;

public class EvenOddNumber {

    public static void checkNumberisPrime(int num) {
        int flag = 0;
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) flag = 1;
        }
        if (flag == 1) {
            System.out.println("Number is Not Prime");
        } else {
            System.out.println("Number is prime");
        }
    }


    public static void main(String... args) {
        int i = 234;
        int result = i;
        while (result >= 2) {
            result = result - 2;
        }
        if (result == 1) System.out.println("Number is odd");
        else System.out.println("Number is even");

        checkNumberisPrime(3);

    }
}