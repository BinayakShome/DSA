package Arrays.Part2;

public class Kadane_Algorithm {
    static long maxSum(int nums[])
    {
        int n = nums.length;
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args)
    {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long ans = maxSum(arr);
        System.out.println(ans);
    }
}

//Other approach

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}