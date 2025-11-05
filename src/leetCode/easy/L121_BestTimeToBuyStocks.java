package leetCode.easy;

public class L121_BestTimeToBuyStocks {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPurchasePrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minPurchasePrice){
                minPurchasePrice = prices[i];
            }
            // profit if sold today
            int currProfit = prices[i]-minPurchasePrice;
                maxProfit = Math.max(currProfit, maxProfit);
            }
            return maxProfit;
        }

    public int maxProfitShort(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            min_price = Math.min(min_price, prices[i]);
            max_profit = Math.max(max_profit, prices[i] - min_price);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        L121_BestTimeToBuyStocks l121_bestTimeToBuyStocks = new L121_BestTimeToBuyStocks();
        int[] test = {7,5,2,6,1,4};
        System.out.println(l121_bestTimeToBuyStocks.maxProfit(test ));
    }
}
