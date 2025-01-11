import java.util.Scanner;

public class PermutationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("enter string to get permutation");
        str=sc.nextLine();
        System.out.println("Permutations of the string \"" + str + "\":");
        generatePermutations(str, "");
    }

    // Recursive method to generate permutations
    private static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix); // Base case: all characters used
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1); // Exclude current character
            generatePermutations(remaining, prefix + currentChar);
        }
    }
}


// if abc then the permutation of string are = abc,bca,cab....
// pehle ABC print hoga then loop i=1 se chalega toh BCA print hoga and so on...
