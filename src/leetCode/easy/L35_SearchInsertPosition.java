package leetCode.easy;

public class L35_SearchInsertPosition {
    // O (log n) time complexity in a sorted array
    // binary search
    public int searchInsert(int[] nums, int target) {
//        int index = nums.length/2;
//        int beg = 0;
//        int end = nums.length-1;
//
//        while (true){
//            int current = nums[index];
//         if (current == target){
//             return index;
//
//         } else if (current > target) {
//             end = index;
//             index = (beg+ index)/2;
//         }
//
//         else { // current < target
//             beg = index;
//             index = (index + end)/2;
//         }
//
//
//        }

        int lo = 0, hi = nums.length-1;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return lo;

    }
}
