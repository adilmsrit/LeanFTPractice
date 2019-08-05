package Practice.Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int middle = nums[(nums.length / 2)];

        System.out.println(" " + first + " " + middle + " " + last);

        if (first > middle && first > last) return first;

        if (middle > first && middle > last) return middle;

        if (last > middle && last > first) return last;
        return 0;
    }

    public static void bubbleSort(int nums[]) {
        for (int i = nums.length-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

      /*  rec(4);
        System.out.println(power(2, 10));
        System.out.println(factorial(8));
        */
        int[] adil = {32,1, 5, 3};


//        System.out.println(maxTriple(adil));

        System.out.println(Arrays.toString(adil));
        bubbleSort(adil);

    }
}