package JavaInterPrograms;

public class ReverseString {

    public static void main(String... args) {

        //1. Use the String Buffer to Reverse String.
        StringBuffer str = new StringBuffer("Selenium2");
        System.out.println(str);
        str.reverse();
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("Selenium3");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        //2. Use the for loop to reverse the String.
        String s = "Selenium";
        System.out.println(s);
        String rev ="";

        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.charAt(i);
            System.out.println(rev);
        }
        System.out.println("Final reversed String is : "+rev);
    }

}
