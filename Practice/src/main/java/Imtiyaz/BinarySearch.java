package Imtiyaz;

public class BinarySearch {

    public static int binarySearch(int x, int[] a) {
        int startIndex = 0;
        int lastIndex = a.length - 1;
        int midPoint = (startIndex + lastIndex) / 2;


        do {
            if (a[midPoint] == x) return midPoint;
            if (x < a[midPoint]) {
                lastIndex = midPoint - 1;
            } else {
                startIndex = midPoint + 1;
            }
            midPoint = (startIndex + lastIndex) / 2;
        } while (lastIndex >= startIndex);
        return -1;
    }

    public static void main(String... args) {
        int i[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = -1;
        System.out.println(binarySearch(a, i));
    }
}