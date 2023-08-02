package leetCode.easy;

public class L66_PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i] != 9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        }
        // case when int[] = all 9's {9,9,9}
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
