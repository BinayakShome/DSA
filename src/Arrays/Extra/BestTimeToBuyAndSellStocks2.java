package Arrays.Extra;

public class BestTimeToBuyAndSellStocks2 {
    static int stock(int []prices)
    {
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++)
        {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
    public static void main(String []args)
    {
        int []prices = {7,1,5,3,6,4};
        System.out.println(stock(prices));
    }
}
