package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1431_KidsWithGreatestNumberOfCandies {
    // basic approach
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int len = candies.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            max = (candies[i] > max) ? candies[i] : max;
                    }
        for (int i = 0; i < len; i++) {
            if (candies[i]+extraCandies >= max) {ans.add(i,true);

            }
            else ans.add (false);
        }
        return ans;
    }
}
