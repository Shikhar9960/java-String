import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        System.out.println("enter string first");
        a=sc.nextLine();
        System.out.println("enter string second");
        b=sc.nextLine();
        char one[]= a.toCharArray();
        char two[]= b.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);
        boolean yes= true;

        for (int i = 0; i < one.length; i++) {
            if (one[i]==two[i]) {
                continue;
            }
            else{
                yes=false;
                break;
            }
            
        }
        if (yes) {
            System.out.println(" strings are anagram");
        }
        else{
            System.out.println("strings are not anagram");
        }

    }
}
