package recursion.other;

public class Rec_Other {
    public static void main(String[] args) {
        System.out.println(isPalindromeR("kayak"));
        System.out.println(isPalindromeR("kay3k"));
        System.out.println(isPalindromeR("poqweewqop"));
        System.out.println(retBinaryR(63,""));
        System.out.println(sumOfNaturalNums(5));

    }

    static boolean isPalindromeR (String s){
        if (s.length() == 0 || s.length()==1) return true;
        else if (s.charAt(0) == s.charAt(s.length()-1)) return
                isPalindromeR(s.substring(1,s.length()-1));
        return false;

    }

    static String retBinaryR (int decimal, String result)
    {
        if (decimal == 0) return result;
        int remainder = decimal%2;
        result = remainder + result;
        return retBinaryR(decimal /2, result);
    }

    static int sumOfNaturalNums (int num){
        if (num <0) return -1;
        if (num == 0) return 0;
        if (num == 1) return 1;

        return num + sumOfNaturalNums(num-1);
    }
}
