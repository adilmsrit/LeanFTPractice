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
            if (Character.isDigit(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
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
    }
}