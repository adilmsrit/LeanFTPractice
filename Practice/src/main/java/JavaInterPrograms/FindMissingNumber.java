package JavaInterPrograms;

public class FindMissingNumber {
    public static void main(String... args) {

        int[] i = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14};
        int sum1 = 0;
        int sum2 = 0;

        for (int j = 0; j < i.length; j++) {
            sum1 = sum1 + i[j];
        }
        System.out.println(sum1);
        for (int j = 0; j <= i.length + 1; j++) {
            sum2 = sum2 + j;
        }
        System.out.println(sum2);
        System.out.println("Missing number is ::" + (sum2 - sum1));
    }
}