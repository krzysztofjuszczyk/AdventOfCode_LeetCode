package leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L1_TwoSum {
    public static void main(String[] args) {
//        int[] nums = new int[] {2,7,11,15};
        int[] nums = new int[] {3,2,4};
        int target = 6;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (!map.containsKey(search)){
                map.put(nums[i], i );
            } else
            {
                return new int[]{map.get(search),i};
            }

        }

        return new int[]{0,0};
    }
}
