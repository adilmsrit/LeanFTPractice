package JavaInterPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsInArray {
    public static void main(String... args) {
        String[] names = {"C++", "Go", "Adil", "Ruby", "Adil"};
        int count = 0;
        String duplicate = "";
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    duplicate = names[i];
                    count++;
                }
            }
        }
        if (count > 0) System.out.println("Duplicates present, Duplicate is :: "+duplicate);
        else System.out.println("No Duplicates");

        //2. Using HashSet.
        Set<String> set = new HashSet<String>();
        for (String s : names) {
            if( (set.add(s))==false) System.out.println("Using Set Duplicates present, Duplicate is :: "+s);
        }

        //3. Using HashMap
        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for (String name : names) {
            Integer countm = storeMap.get(name);
            if (countm == null) {
                storeMap.put(name, ++countm);
            }
        }

    }
}