package leetCode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class L771_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            characterSet.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (characterSet.contains(stones.charAt(i))) {
                ans++;
//                characterSet.remove(stones.charAt(i));
            }
        }
        return ans;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int res = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                res++;
            }
        }
        return res;
    }

    public int numJewelsInStones3(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++)
            map.put(jewels.charAt(i), map.getOrDefault(jewels.charAt(i) + 1, 1));
        for (int i = 0; i < stones.length(); i++)
            if (map.containsKey(stones.charAt(i)))
                count++;
        return count;
    }
}
