package JavaInterPrograms;

public class ArmstrongNumber {
    public static void main(String... args) {
        int num = 153;
        findArmstrongNumber(num);
        System.out.println("The Original number is :: " + num);
    }

    public static void findArmstrongNumber(int num) {
        int sum = 0;
        int number = num;
        while (num > 0) {
            int i = num % 10;
            sum = sum + i * i * i;
            num = num / 10;
        }
        System.out.println(sum);
        System.out.println(number);
        if (number == sum) System.out.println("Number is Armstrong");
        else System.out.println("Number is NOT Armstrong");
    }
}
