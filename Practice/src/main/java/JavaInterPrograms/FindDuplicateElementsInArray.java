package JavaInterPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {
    public static void main(String... args) {
        String[] str = {"C++", "Go", "Adil", "Ruby", "Adil"};
        int count = 0;
        String duplicate = "";
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    duplicate = str[i];
                    count++;
                }
            }
        }
        if (count > 0) System.out.println("Duplicates present, Duplicate is :: "+duplicate);
        else System.out.println("No Duplicates");


        //2. Using HashSet.
        Set<String> set = new HashSet<String>();
        for (String s : str ) {
            if( (set.add(s))==false) System.out.println("Using Set Duplicates present, Duplicate is :: "+s);

        }
    }
}