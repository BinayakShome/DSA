package Hashing.Extra;

import java.util.HashMap;
import java.util.Map;

public class prob1 {
    static int NumberOfSum(int[] nums, int target)
    {
        int n = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            int ai = target - nums[i];
            int freq = map.getOrDefault(ai, 0);
            count += freq;

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {8,-2,-2};
        int target = 6;
        System.out.println(NumberOfSum(arr,target));
    }
}
