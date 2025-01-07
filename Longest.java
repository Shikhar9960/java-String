import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("enter a sentence");
        a = sc.nextLine();
        char arr[] = a.toCharArray();
        int maxLength = 0, currentLength = 0;
        String longestWord = "", currentWord = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                currentLength++; // Increment length for each non-space character
                currentWord += arr[i]; // Add character to the current word
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestWord = currentWord; // Update the longest word
                }
                currentLength = 0; // Reset length for the next word
                currentWord = ""; // Reset current word
            }
        }

        // Check the last word in case the sentence doesn't end with a space
        if (currentLength > maxLength) {
            maxLength = currentLength;
            longestWord = currentWord;
        }

        System.out.println("the longest word in the string is "+longestWord+" with "+maxLength+" characters");
    }
}
