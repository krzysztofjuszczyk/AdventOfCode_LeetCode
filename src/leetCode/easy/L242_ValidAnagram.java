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
}
