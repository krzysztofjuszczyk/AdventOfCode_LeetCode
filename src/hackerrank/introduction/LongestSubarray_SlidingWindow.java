package hackerrank.introduction;

import java.util.List;

public class LongestSubarray_SlidingWindow {

        // incorrect
    public int longestSubarray(int[] nums, int limit) {
        int start = 0;
        int end = 0;
        int ans = 1;

        while (start <nums.length && end < nums.length ){
            if (Math.abs(nums[end] - nums[start]) <= limit){
                ans = Math.max(end - start +1, ans);
                end++;
            } else {
                start++;
            }
        }
//        return ans;
        return -1;
    }



    public static int longestSubarray(List<Integer> arr) {
        int len = arr.size();
        int ans = 1;
        int start = 0;
        int end = 0;
    //    int tempMax = 1;

        while (end < len - 1 || start < len) {
            if (Math.abs(arr.get(end) - arr.get(start)) <= 1) {
                ans = Math.max(ans, end - start + 1);
                end++;
        //        tempMax++;
            } else {
                start++;
      //          tempMax = end - start + 1;
            }
        }

        return ans;
    }
}
