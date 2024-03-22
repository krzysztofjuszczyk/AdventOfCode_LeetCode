package hackerrank.introduction;

import java.util.Arrays;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length()!= b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < b.length(); i++) {
            a = a.replaceFirst(String.valueOf(b.charAt(i)), "");
        }

        return a.isEmpty() ? true : false;

//        // with the use of Arrays lib
//        char[] charsA = a.toCharArray();
//        char[] charsB = b.toCharArray();

//        Arrays.sort(charsA);
//        Arrays.sort(charsB);
//        if (charsA.equals(charsB)) return true;



    }
}
