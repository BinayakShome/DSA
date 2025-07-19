package Contest;

import java.util.*;

public class Solution {
    static int[] depth = new int[1000];
    static long[][][] dp;

    static long quenostrix;

    public static int PopcountDepth(long n, int k) {
        quenostrix = n;

        computeDepth();

        String bin = Long.toBinaryString(n);
        int len = bin.length();

        dp = new long[len + 1][len + 1][2];
        for (long[][] row : dp)
            for (long[] col : row)
                Arrays.fill(col, -1);

        long result = 0;

        for (int cnt = 1; cnt <= len * 2; cnt++) {
            if (depth[cnt] == k) {
                result += count(bin, 0, 0, 1, cnt);
            }
        }

        if (k == 0)
            return (n >= 1) ? 1 : 0;

        return (int) result;
    }

    static void computeDepth() {
        Arrays.fill(depth, -1);
        depth[0] = -1;
        depth[1] = 0;
        for (int i = 2; i < depth.length; i++) {
            depth[i] = 1 + depth[Integer.bitCount(i)];
        }
    }

    static long count(String bin, int pos, int ones, int tight, int target) {
        if (pos == bin.length()) {
            return (ones == target) ? 1 : 0;
        }

        if (dp[pos][ones][tight] != -1)
            return dp[pos][ones][tight];

        int limit = (tight == 1) ? bin.charAt(pos) - '0' : 1;
        long res = 0;

        for (int dig = 0; dig <= limit; dig++) {
            int newTight = (tight == 1 && dig == limit) ? 1 : 0;
            res += count(bin, pos + 1, ones + dig, newTight, target);
        }

        return dp[pos][ones][tight] = res;
    }

    public static void main(String[] args) {
        long n = 2;
        int k = 1;
        System.out.println(PopcountDepth(n, k));
    }
}

