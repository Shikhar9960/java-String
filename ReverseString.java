import java.util.*;
import java.lang.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String a;
        a = sc.nextLine();
        String r = "";
        char ch;
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            r = ch + r;
        }
        System.out.println(r);
    }

}
