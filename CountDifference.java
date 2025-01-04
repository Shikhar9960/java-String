import java.util.Scanner;

public class CountDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string first");
        String a;
        a=sc.nextLine();
        System.out.println("enter string second");
        String b;
        b=sc.nextLine();
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)!=b.charAt(i)) {
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println("total number of difference between two string is = "+count);
        
    }
}
