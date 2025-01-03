import java.util.Scanner;
import java.lang.*;

public class CompressString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String a;
        int count=1;
        System.out.println("enter string");
        a=sc.nextLine();
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i)==a.charAt(i-1)) {
                count++;
            }
            else{
                result.append(a.charAt(i-1)).append(count);
                count=1;
            } 
        }
        result.append(a.charAt(a.length()-1)).append(count);
        System.out.println(result.toString());

    }   
}

