package hackerrank.introduction;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madame";
        System.out.println(isPali(s));
    }

    static boolean isPali(String s) {
        if ((s.length() == 1 ) || (s.length() ==0)) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        else return isPali(s.substring(1, s.length() - 1));
    }
}
