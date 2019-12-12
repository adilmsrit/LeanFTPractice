package JavaInterPrograms;

public class CheckNumberIsPrime {

    public static void main(String... args) {
        int num = 3;
        checkForPrime(num);
        printPrimeNumbers(num);
    }

    public static void checkForPrime(int num) {
        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) flag = 1;
        }
        if (flag == 1) {
            System.out.println("Number is Not Prime");
        } else {
            System.out.println("Number is prime");
        }
    }

    public static void printPrime(int num) {
        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) flag = 1;
        }
        if (flag == 1) {
        } else {
            System.out.print(num + ", ");
        }
    }

    public static void printPrimeNumbers(int num) {
        if (num <= 2) System.out.println("Enter a number greater than 2");
        for (int i = 2; i <= num; i++) {
            printPrime(i);
        }
    }
}