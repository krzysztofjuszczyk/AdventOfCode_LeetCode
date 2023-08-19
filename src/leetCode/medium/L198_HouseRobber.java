package leetCode.medium;

public class L198_HouseRobber {
    public int rob(int[] nums) {
        // [ prevprev prev n n+1 n+2 ]

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
