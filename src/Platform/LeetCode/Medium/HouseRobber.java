package Platform.LeetCode.Medium;

public class HouseRobber {
    static int robber(int []cash)
    {
        if (cash.length == 0) return 0;
        if (cash.length == 1) return cash[0];

        int prev2 = cash[0];
        int prev1 = Math.max(cash[0], cash[1]);

        for (int i = 2; i < cash.length; i++) {
            int cur = Math.max(prev1, prev2 + cash[i]);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
    public static void main(String []args)
    {
        int []cash = {2,7,9,3,1};
        System.out.print(robber(cash));
    }
}
