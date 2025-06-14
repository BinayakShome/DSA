package DynamicProgramming.Part2;

public class ClimbingStairs {
    static int climbStairs(int n)
    {
        if(n==0||n==1) return n;
        int []dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String []args)
    {
        int n1 = 2;  /// output -> 2
        int n2 = 3; /// output -> 3
        System.out.println(climbStairs(n1));
        System.out.println(climbStairs(n2));
    }
}
