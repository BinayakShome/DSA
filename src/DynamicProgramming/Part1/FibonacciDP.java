package DynamicProgramming.Part1;

import java.util.Arrays;

public class FibonacciDP {
    /// MEMOIZATION METHOD -> THIS METHOD IS ALSO FINE FOR INTERVIEWS
    static int fib(int n)
    {
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);

        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];

        return dp[n] = fib(n-1) + fib(n-2);
    }

    /// TABULATION METHOD -> MOST OPTIMISED METHOD
    static int fibT(int n)
    {
        int prev2 = 0, prev = 1;

        for(int i = 2; i <= n; i++)
        {
            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
    public static void main(String []args)
    {
        int n = 5;
        //System.out.println(fib(n));
        System.out.println(fibT(n));
    }
}
