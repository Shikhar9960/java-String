import java.util.LinkedHashSet;

public class Remove_duplicate{
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String without Duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Accessing character at index `i`
            if (set.add(c)) { // Adds only if not already present
                result.append(c);
            }
        }

        return result.toString();
    }
}


//LinkedHashSet not allow duplicates -----important note

