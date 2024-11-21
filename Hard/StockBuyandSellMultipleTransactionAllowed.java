package GeeksForGeeks.Hard;

public class StockBuyandSellMultipleTransactionAllowed {
    public int maximumProfit(int prices[]) {
        int totProfit = 0;
        int n = prices.length;
        
        for(int i = 1; i < n; i++) {
            if(prices[i] > prices[i - 1]) {
                totProfit += prices[i] - prices[i - 1];
            }
        }
        
        return totProfit;
    }
}
