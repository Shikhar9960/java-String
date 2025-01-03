import java.util.Scanner;

public class CountCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("enter a sentence to count camelcase");
        a = sc.nextLine();
        int count=0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'B' || a.charAt(i) == 'C' || a.charAt(i) == 'D' || a.charAt(i) == 'G'
                    || a.charAt(i) == 'F' ||
                    a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O'
                    || a.charAt(i) == 'U'||a.charAt(i) == 'H' || a.charAt(i) == 'J' || a.charAt(i) == 'K' || a.charAt(i) == 'L'
                    || a.charAt(i) == 'M' ||
                    a.charAt(i) == 'N' || a.charAt(i) == 'P' || a.charAt(i) == 'Q' || a.charAt(i) == 'R'
                    || a.charAt(i) == 'S'||a.charAt(i) == 'T' || a.charAt(i) == 'V' || a.charAt(i) == 'W' || a.charAt(i) == 'X'
                    || a.charAt(i) == 'Y' ||
                    a.charAt(i) == 'Z') {
                count++;
            } else {
                continue;
            }
        }

        System.out.println("Number of camelcase character present in a sentence is = "+ count);

    }
}
