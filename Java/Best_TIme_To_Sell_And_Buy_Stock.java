package Java;

public class Best_TIme_To_Sell_And_Buy_Stock {
    public int maxProfit(int prices[]) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else {
                sell = Math.max(sell, price - buy);
            }
        }
        return sell;
    }

    public int maxProfit_2(int prices[]) {
        int min_price = prices[0];
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            max_profit = Math.max(max_profit, prices[i] - min_price);
            min_price = Math.min(min_price, prices[i]);
        }
        return max_profit;
    }
}
