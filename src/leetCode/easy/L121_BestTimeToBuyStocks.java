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
                maxProfit = currProfit>maxProfit ? currProfit : maxProfit;
            }
            return maxProfit;
        }

    public static void main(String[] args) {
        L121_BestTimeToBuyStocks l121_bestTimeToBuyStocks = new L121_BestTimeToBuyStocks();
        int[] test = {7,5,2,6,1,4};
        System.out.println(l121_bestTimeToBuyStocks.maxProfit(test ));
    }
}
