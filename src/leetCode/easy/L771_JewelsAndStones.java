package leetCode.easy;

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
            if(characterSet.contains(stones.charAt(i))){
                ans++;
//                characterSet.remove(stones.charAt(i));
            }
        }
        return ans;
    }
}
