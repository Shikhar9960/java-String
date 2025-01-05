import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String str = "programming"; // Example string
        countCharacterFrequency(str);
    }

    public static void countCharacterFrequency(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            // Increment the count for the character
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
