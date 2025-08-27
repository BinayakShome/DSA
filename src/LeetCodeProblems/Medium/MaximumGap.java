package LeetCodeProblems.Medium;

import java.util.Arrays;

public class MaximumGap {
    static int maxGap(int []nums)
    {
        Arrays.sort(nums);
        int gap = 0;
        if(nums.length < 2)
        {
            return gap;
        }

        for (int i = 0; i < nums.length - 1; i++)
        {
            int temp = nums[i + 1] - nums[i];
            gap = Math.max(gap, temp);
        }
        return gap;
    }
    public static void main(String []args)
    {
        int []arr = {3,6,9,1};
        System.out.println(maxGap(arr));
    }
}
