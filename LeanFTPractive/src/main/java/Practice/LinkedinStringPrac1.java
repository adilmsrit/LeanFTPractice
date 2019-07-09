package Practice;

public class LinkedinStringPrac1 {

    public static int countVowels(String str) {
        int vowels = 0;
        String strlower = str.toLowerCase();
        for (int i = 0; i < strlower.length(); i++) {
            if (strlower.charAt(i) == 'a' || strlower.charAt(i) == 'e' || strlower.charAt(i) == 'i' || strlower.charAt(i) == 'o' || strlower.charAt(i) == 'u') {
                vowels = vowels + 1;
            }
        }
        return vowels;
    }

    public static int countConsonants(String str) {
        int vowels = 0;
        String strlower = str.toLowerCase();
        for (int i = 0; i < strlower.length(); i++) {
            if (strlower.charAt(i) != ' ' && strlower.charAt(i) != 'a' && strlower.charAt(i) != 'e' && strlower.charAt(i) != 'i' && strlower.charAt(i) != 'o' && strlower.charAt(i) != 'u') {
                vowels = vowels + 1;
            }
        }
        return vowels;
    }

    public static void countVS(String str) {
        System.out.println("String is : " + str);
        System.out.println("Lenght of " + str + " is :"+str.length());
        int vowels = 0;
        int consonants = 0;
        String strlower = str.toLowerCase();
        for (int i = 0; i < strlower.length(); i++) {
            if (strlower.charAt(i) == 'a' || strlower.charAt(i) == 'e' || strlower.charAt(i) == 'i' || strlower.charAt(i) == 'o' || strlower.charAt(i) == 'u') {
                vowels = vowels + 1;
            }
        }

        for (int i = 0; i < strlower.length(); i++) {
            if (strlower.charAt(i) != ' ' && strlower.charAt(i) != 'a' && strlower.charAt(i) != 'e' && strlower.charAt(i) != 'i' && strlower.charAt(i) != 'o' && strlower.charAt(i) != 'u') {
                consonants = consonants + 1;
            }
        }

        System.out.println("vowels: " + vowels);

        System.out.println("Consonants: " + consonants);

    }


    public static void main(String[] args) {

        String str1 = "HellO";
        String str2 = "there is a quite Mouse";
        String str3 = "I am Happy";

//        System.out.println(countVowels(str1));
//        System.out.println(countVowels(str2));
//        System.out.println(countVowels(str3));
//
//        System.out.println("******************************************");
//
//        System.out.println(countConsonants(str1));
//        System.out.println(countConsonants(str2));
//        System.out.println(countConsonants(str3));

        countVS(str1);
        countVS(str2);
        countVS(str3);


    /*    2
        10
        3
                ******************************************
        3
        8
        5*/


        /*
        String text = "The giant panda has an insatiable appetite " +
                "for bamboo. A typical animal eats half the day—a " +
                "full 12 out of every 24 hours—and relieves itself " +
                "dozens of times a day. It takes 28 pounds of " +
                "bamboo to satisfy a giant panda's daily dietary " +
                "needs. Pandas will sometimes eat birds or rodents" +
                " as well.";

        System.out.println("Number of sentences in text is :" + text.split("\\.").length);
        System.out.println("Number of words in text is :" + text.split(" ").length);
        System.out.println(text.length());

        String fishText = text.replace("bamboo", "fish");
        System.out.println(fishText);*/


        String a = "apples";
        String b = "bananas";
        String o = "Oranges";
        String bp = "BananaPeels";


        String p = "pears";

        String[] fruits = {a, b, o, bp, p};

        /*for (String f : fruits) {
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

        }*/
    }


}
