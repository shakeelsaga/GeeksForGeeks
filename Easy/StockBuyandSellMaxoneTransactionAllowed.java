package GeeksForGeeks.Easy;

public class StockBuyandSellMaxoneTransactionAllowed {
    public int maximumProfit(int prices[]) {
        if(prices.length == 0) return 0;
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                min = Math.min(min, prices[i - 1]);
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }
        
        return maxProfit;
    }
}
