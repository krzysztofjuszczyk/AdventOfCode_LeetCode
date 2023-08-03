package leetCode.easy;

import java.util.HashMap;

public class L169_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n :
                nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n)>nums.length/2) {
                return n;
            }

        }
        return -1;
    }
}
