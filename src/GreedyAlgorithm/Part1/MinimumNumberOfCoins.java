package GreedyAlgorithm.Part1;

public class MinimumNumberOfCoins {
    static int numberOfCoins(int v)
    {
        int []coins = {1,2,5,10,20,50,100,500,1000};
        int n = coins.length;

        int count = 0;
        for(int i = n - 1; i >= 0; i--)
        {
            while (v >= coins[i])
            {
                v -= coins[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String []args)
    {
        int v = 49; // output -> 5 ............ 20+20+5+2+2 = 49
        System.out.println(numberOfCoins(v));
    }
}
