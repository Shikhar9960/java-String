import java.util.*;

public class NonRepeatChar {
    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
        return '\0'; // Return null character if no non-repeating character exists
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("swiss")); 
    }
}
