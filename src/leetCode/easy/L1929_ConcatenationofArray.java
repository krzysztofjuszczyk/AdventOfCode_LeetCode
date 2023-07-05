package leetCode.easy;

public class L1929_ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] solution = new int[2*l];
            for (int i = 0; i < nums.length; i++) {
            solution[i] = nums[i];
            solution[i+l] = nums[i];
        }
        return solution;
    }
}
