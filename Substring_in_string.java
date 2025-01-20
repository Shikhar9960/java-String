import java.util.*;
import java.lang.*;

public class Substring_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string a");
        String a= sc.nextLine();
        System.out.println("enter string b");
        String b = sc.nextLine();
        if (a.contains(b)) {
            System.out.println("b is the subpart of string a");
        }
        else{
            System.out.println("not present in string a");
        }
    }
}
