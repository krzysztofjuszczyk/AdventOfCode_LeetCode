package recursion.other;

import java.util.Arrays;

public class L_121_BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        int ans = Integer.MIN_VALUE;
        if (prices.length == 1) return 0;
        for (int i = 1; i<prices.length; i++  ){
            int tmp = prices[i]-prices[0];
            ans = Math.max(ans, tmp);
        }
        ans = Math.max(ans, maxProfit(Arrays.copyOfRange(prices, 1, prices.length)));
        return Math.max(ans,0);

    }
}
