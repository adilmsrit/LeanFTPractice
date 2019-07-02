package tmp;

public class LinkedinStringPrac1 {

    public static void main(String[] args) {
        String a = "apples";
        String b = "bananas";
        String o = "Oranges";
        String bp = "BananaPeels";


        String p = "pears";

        String[] fruits = {a, b, o, bp, p};

        for (String f : fruits) {
            StringBuilder rev = new StringBuilder();
            int index = 1;

            System.out.println("Character at index: " + f.charAt(index));

            System.out.println("Index of letter: " + f.indexOf('e'));

            if (f.toLowerCase().contains("app")) System.out.println("Contains app: " + f);

            System.out.println("SubString : " + f.substring(1, 4));

            for (int i=f.length()-1; i>=0 ; i--){

                rev = rev.append(f.charAt(i));
                }

            System.out.println("reverse string : " + rev.toString());

            System.out.println("******************************************");

        }
    }


}
