package leetCode.easy;

public class L125_ValidPalindrome {
    public boolean isPalindrome(String s) {

        // 2 pointers solution
        if (s.isEmpty()) return true;
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char charStart = s.charAt(start);
            char charLast = s.charAt(last);

            if (!Character.isLetterOrDigit(charStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(charLast)) {
                last--;
            } else {
                if (Character.toLowerCase(charStart) != Character.toLowerCase(charLast)) {
                    return false;
                }
                start++;
                last--;
            }

        }
        return true;

    }
}
