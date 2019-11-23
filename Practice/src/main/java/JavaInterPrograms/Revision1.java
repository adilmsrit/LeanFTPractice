package JavaInterPrograms;

import java.util.HashSet;
import java.util.Set;

public class Revision1 {
    public static void main(String... args) {

        //Reverse the String.
        String str = "Selenium";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String is :: " + rev);

        // Reverse the int.
        int num = 12345;
        int reverse = 0;
        do {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        } while (num != 0);
        System.out.println(reverse);

        // Find the missing number
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i];
        }
        for (int j = 0; j <= array.length + 1; j++) {
            sum2 = sum2 + j;
        }
        System.out.println("Missing number is :: " + (sum2 - sum1));

        //1. Find the duplicates using For loop.
        String[] st = {"Ruby", "Go", "Ruby", "Python", "Java"};
        int count = 0;
        String duplicate = "";

        for (int i = 0; i < st.length; i++) {
            for (int j = i + 1; j < st.length; j++) {
                if (st[i].equals(st[j])) {
                    count++;
                    duplicate = st[i];
                    break;
                }
            }
        }
        if (count > 0) System.out.println("Duplicates exist :: " + duplicate);

        //2. Find the duplicates using Set.
        Set<String> hashSet = new HashSet<String>();
        for (String s :
                st) {
            if (hashSet.add(s) == false)
                System.out.println("Using Method of HashSet finding : Duplicate present :: " + s);
        }

        //Factorial of Number.
        System.out.println("Factorial of number :: " + factorialOfNumber(3));

    }

    public static int factorialOfNumber(int a) {
        if (a == 0) return 1;
        return a * factorialOfNumber(--a);
    }

}

