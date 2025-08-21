package SelfPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class test {
    static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] B = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            // impossible if B decreases
            boolean possible = true;
            for (int i = 2; i <= N; i++) {
                if (B[i] < B[i - 1] || B[i] > B[i - 1] + 1) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                sb.append(0).append("\n");
                continue;
            }

            long[][] dp = new long[N + 1][K + 1];
            long[] pref = new long[K + 1]; // prefix sums for transitions

            // base case
            for (int j = 1; j <= K; j++) dp[1][j] = 1;

            for (int i = 2; i <= N; i++) {
                // build prefix sums of dp[i-1]
                pref[0] = 0;
                for (int j = 1; j <= K; j++) {
                    pref[j] = (pref[j - 1] + dp[i - 1][j]) % MOD;
                }

                if (B[i] == B[i - 1]) {
                    // extend with ≤ maxLLS
                    for (int j = 1; j <= K; j++) {
                        dp[i][j] = dp[i - 1][j] * j % MOD; // choose A[i] ≤ j
                    }
                } else {
                    // B[i] = B[i-1] + 1 → must pick strictly larger new max
                    for (int j = 1; j <= K; j++) {
                        dp[i][j] = pref[j - 1]; // new max j, comes from previous smaller ones
                    }
                }
            }

            long ans = 0;
            for (int j = 1; j <= K; j++) {
                ans = (ans + dp[N][j]) % MOD;
            }

            sb.append(ans).append("\n");
        }
        System.out.print(sb.toString());
    }
}
