import java.util.Arrays;
import java.util.Scanner;

public class LexicoGraphicOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("enter a string");
        a = sc.nextLine();
        char arr[] = a.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        

    }

}

// it convert string into alphabetic order
