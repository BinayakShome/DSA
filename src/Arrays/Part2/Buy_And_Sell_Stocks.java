package Arrays.Part2;

import static java.lang.Math.min;

public class Buy_And_Sell_Stocks {
    static int StockProfit(int nums[])
    {
        int n = nums.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            minPrice = min(minPrice, nums[i]);
            if(nums[i] - minPrice > maxProfit)
            {
                maxProfit = nums[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args)
    {
        int stockPrice[] = {7,1,5,3,6,4};
        //int stockPrice[] = {7,6,5,4,3,2,1}; --> output 0
        System.out.print(StockProfit(stockPrice));
    }
}
