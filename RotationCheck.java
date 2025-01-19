public class RotationCheck {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="deabc";
        if (s1.length()!=s2.length()) {
            System.out.println("false");
        }
        else{
            String combined = s1+s2;
            if (combined.contains(s2)) {
                System.out.println("true");
            }
        }
    }
}

//here string is changed but the serial is same then return true .
