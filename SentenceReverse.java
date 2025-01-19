import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter a sentence:");
        a = sc.nextLine();

        // Split the input into words using space
        String[] words = a.split(" ");

        // Reverse the sentence by printing words in reverse order
        System.out.println("Reversed sentence:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
