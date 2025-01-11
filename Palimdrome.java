import java.util.*;
import java.lang.*;

public class Palimdrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String a;
        a = sc.nextLine();
        int l;
        l = a.length()-1;
        boolean ispalimdrome = true;
        for (int i = 0; i <l; i++) {
            if(a.charAt(i)==a.charAt(l)){
                i++;
                l--;
            }
            else{
                ispalimdrome = false;
            }
            
        }
        if (ispalimdrome) {
            System.out.println("palimdrome");
        }
        else{
            System.out.println("not palimdrome");
        }

    }
}
