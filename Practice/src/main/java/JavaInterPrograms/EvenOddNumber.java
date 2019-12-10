package JavaInterPrograms;

public class EvenOddNumber {

    public static void main(String... args) {
        int i = 234;
        int result = i;
        while (result >= 2) {
            result = result-2;
        }
        if (result==1) System.out.println("Number is odd");
        else System.out.println("Number is even");
    }
}
