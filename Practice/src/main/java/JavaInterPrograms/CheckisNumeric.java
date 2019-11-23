package JavaInterPrograms;

public class CheckisNumeric {
    public static boolean isEmpty(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0);
    }
    public static boolean isNumeric(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int len = charSequence.length();
        for (int i = 0; i < len; i++) {
            // If the character is digit then fine, if not a digit make the false as true and enter the
            // loop and return false and break. Else continue till last. If all are digits
            // finally print true.
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String... args) {
        System.out.println(isNumeric(null));
        System.out.println(isNumeric(""));
        System.out.println(isNumeric(" "));
        System.out.println(isNumeric("a"));
        System.out.println(isNumeric("1"));
        System.out.println(isNumeric("1asdsa1"));
        System.out.println(isNumeric("asdsad2asdasdsa"));
        System.out.println(isNumeric("33333"));
        System.out.println(isNumeric("2sadsadsa"));
        System.out.println(isNumeric("asdasdada4"));
        System.out.println(isNumeric("2.3"));
        System.out.println(isNumeric("1 1 1 "));
        System.out.println(isNumeric("0"));
        System.out.println(isNumeric("+971"));
        System.out.println(isNumeric("#@#@#"));
        System.out.println(isNumeric("-988"));
    }
}