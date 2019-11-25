package JavaInterPrograms;

public class FibonacciSeries {
    public static void main(String... args) {
        int t1=0;
        int t2=1;
        int num = 1000;
        int sum=0;

        while (sum < num) {
            System.out.println(t1 + " ");
            sum = t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}
