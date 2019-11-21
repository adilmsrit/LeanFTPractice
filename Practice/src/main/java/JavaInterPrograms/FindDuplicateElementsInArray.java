package JavaInterPrograms;

public class FindDuplicateElementsInArray {
    public static void main(String... args) {
        String[] str = {"e", "e", "b", "c", "a"};
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
    }
}