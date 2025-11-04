package leetCode.easy;

public class L27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int n:nums){
            if(nums[count] != val){
                nums[count] = n;
                count++;
            }
        }
        return count;
    }
}
