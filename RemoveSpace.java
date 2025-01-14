import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("enter a sentence");
        a=sc.nextLine();
        String b[]= a.split(" ");
        String c="";
        for (int i = 0; i < b.length; i++) {
            if (b[i]!=" ") {
                c=c+b[i];
            }
        }
        System.out.println(c);
    }
}
