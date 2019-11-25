package JavaInterPrograms;

public class PalindromeNumber {

    public static void main(String... args) {
        int number = 12321;
        int result = checkPalindromeNumber(number);
        if(result==number){
            System.out.println("Number is palindrome :: " + number);
        } else{
            System.out.println("Number is NOT palindrome :: " + number);
        }
    }

    public static int checkPalindromeNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println("Reverse of the number is :: " + rev);
        return rev;
    }
}