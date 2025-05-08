package BinarySearch.Part2;

import java.util.Arrays;

public class AggressiveCows {
    static boolean canWePlace(int[] stalls, int dist, int cows)
    {
        int n = stalls.length;
        int cntCow = 1;
        int last = stalls[0];

        for (int i = 0; i<n; i++)
        {
            if(stalls[i] - last >= dist)
            {
                cntCow++;
                last = stalls[i];
            }

            if (cntCow >= cows)
            {
                return true;
            }
        }
        return false;
    }
    static int assigningStalls(int[] nums, int k)
    {
        Arrays.sort(nums);
        int left = 0, right = nums[nums.length - 1] - nums[0];

        while (left<=right)
        {
            int mid = (left+right)/2;

            if (canWePlace(nums,mid,k) == true)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return right;
    }
    public static void main(String[] args)
    {
        int[] stalls = {0,3,4,7,10,9};
        int cows = 4;
        System.out.println(assigningStalls(stalls,cows));
    }
}