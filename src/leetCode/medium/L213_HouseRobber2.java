package leetCode.medium;

import java.util.Arrays;

public class L213_HouseRobber2 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return nums[0];
        }
        else if (len ==2){
            return Math.max(nums[0], nums[1]);
        }

        int first = nums[0];
        int last = nums[nums.length-1];
        nums[0] = 0;
        int max1 = rob1(nums);
        nums[0] = first;
        nums[nums.length-1] = 0;
        int max2 = rob1(nums);
        return Math.max(max1, max2);
    }

    public int rob1(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return nums[0];
        }
        else if (len ==2){
            return Math.max(nums[0], nums[1]);
        }
        int tmp = 0;
        int prevprev = nums[0];
        int prev = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            tmp =Math.max(prevprev + nums[i],prev);
            prevprev = prev;
            prev = tmp;

        }
        return prev;
    }
}
