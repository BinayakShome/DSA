package SelfPractice;

import java.util.HashMap;

public class SubArrayWithGivenSum {
    static int numberOfSubArray(int nums[], int k)
    {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;

        for (int i = 0; i<n; i++)
        {
            sum = sum + nums[i];

            if (sum == k)
            {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k))
            {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
            map.putIfAbsent(sum,i);
        }
        return maxLen;
    }
    public static void main(String [] args)
    {
        int arr[] = {1,2,3};
        int target = 3;
        System.out.println(numberOfSubArray(arr,target));
    }
}

/// should be in O(n)