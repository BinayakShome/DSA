package LeetCodeProblems;

import java.util.*;

public class MissingNumberInArray {
    static List<Integer> disappearedNumber(int []nums)
    {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int n : nums)
        {
            set.add(n);
        }

        for(int i = 1; i <= nums.length; i++)
        {
            if(!set.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int []nums = {4,3,2,7,8,2,3,1};
        System.out.println(disappearedNumber(nums));
    }
}
