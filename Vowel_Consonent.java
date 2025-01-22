import java.util.*;
import java.lang.*;

public class Vowel_Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String a;
        a = sc.nextLine();
        int consonent = 0;
        int vowel = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u' ||
                    a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O'
                    || a.charAt(i) == 'U') {
                vowel = vowel + 1;
            } else {
                consonent = consonent + 1;
            }

        }
        System.out.println("vowel = " + vowel);
        System.out.println("consonent = " + consonent);
    }
}
