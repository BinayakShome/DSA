package Arrays.Part1;

import java.util.*;

public class SubArraySumK {
    static int sumK(int nums[], int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (prefixSumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(sum - k));
            }
            prefixSumMap.putIfAbsent(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 9, 11, -1, 2, 3, 4, 1};
        int k = 10;

        int len = sumK(arr, k);
        System.out.print(len);
    }
}