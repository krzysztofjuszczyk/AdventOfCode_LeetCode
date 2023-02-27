package leetCode.easy;

import java.util.ArrayList;

public class L9_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x<0){return false;}
        ArrayList<Integer> list = new ArrayList<>();
        while (x>0){
            int rem = x%10;
             x /= 10;
            list.add(rem);
        }
        System.out.println(list.toString());
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) return false;
        }
        return true;
    }
}
