package SelfPractice;

import java.util.HashMap;
import java.util.Map;

public class two_sum {
    static int[] twosum(int []nums, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++)
        {
            int comp = k - nums[i];
            if(map.containsKey(comp))
            {
                return new int[]{map.get(comp),i};
            }

            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String []args)
    {
        int[] nums = {2,7,11,15};
        int target = 11;
        int []result = twosum(nums,target);
        System.out.println(result[0]+" , "+result[1]);
    }
}
