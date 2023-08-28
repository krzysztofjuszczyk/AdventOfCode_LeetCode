package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class L242_ValidAnagram {
    public boolean isAnagram(String s, String t) {

        // HAshMap ver
        Map<Character, Integer> mapS = new HashMap<>();
        if (s.length() != t. length()) return false;

        for (int i = 0; i < s.length(); i++) {
            int x = mapS.getOrDefault(s.charAt(i),0);
            mapS.put(s.charAt(i),++x);
        }
        for (int i = 0; i < t.length(); i++) {
            Character charT = t.charAt(i);
            if (!mapS.containsKey(charT)){
                return false;
            }

            int x = mapS.get(charT);
            if (x==1){
                mapS.remove(charT);
            } else mapS.put(charT,x-1);
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        // deal with the base case in which the two strings are not equally long
        if (s.length() != t.length()) return false;

        int n = s.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // read the second string, whenever we meet a character that also in the
        // first string, we substract its count by 1. If we met a character that
        // is not in the first string, or the count of this character in the second
        // string already exceeds its count in the first one, simply return false
        for (int i = 0; i < n; i++) {
            if (freq[t.charAt(i) - 'a']-- == 0) {
                return false;
            }
        }

        return true;
    }
}
