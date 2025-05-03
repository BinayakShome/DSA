package Arrays.Part3;

import java.util.HashMap;

public class LongestSubArrayWithSumZero {
    static int subarray(int nums[])
    {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = 0, sum = 0;

        for(int i = 0; i<n; i++)
        {
            sum = sum + nums[i];

            if(sum==0)
            {
                maxSum = i + 1;
            }
            else
            {
                if(map.get(sum) != null)
                {
                    maxSum = Math.max(maxSum, i - map.get(sum));
                }
                else
                {
                    map.put(sum, i);
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        //int a[] = {9, -3, 3, -1, 6, -5};
        int a[] = {1,2,-2,-1};
        System.out.print(subarray(a));
    }
}
