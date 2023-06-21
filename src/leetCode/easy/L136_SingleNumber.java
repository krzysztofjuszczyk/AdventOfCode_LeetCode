package leetCode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L136_SingleNumber {

    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }

        return nums[nums.length - 1];
    }

    // only item left is the single number
    public int singleNumber2(int[] nums) {
    Set<Integer> set = new HashSet<>();
        for (int n : nums) {
        if (set.contains(n)) {
            set.remove(n);
        } else {
            set.add(n);
        }
    }

        return set.iterator().next();
}

}
