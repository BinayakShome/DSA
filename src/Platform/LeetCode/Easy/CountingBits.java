package Platform.LeetCode.Easy;

public class CountingBits {

    static int[] bits(int n)
    {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
    public static void main(String []args)
    {
        int n = 5;

        int []ans = bits(n);
        for (int i = 0; i < n + 1; i++)
        {
            System.out.print(ans[i] + "  ");
        }
    }
}
