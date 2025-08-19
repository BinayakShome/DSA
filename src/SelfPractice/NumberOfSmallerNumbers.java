package SelfPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberOfSmallerNumbers {
    static int numbers(int []nums, int target)
    {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < target)
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        int [] nums = {1,4,2,3,5,8};
        int target = 4;
        System.out.println(numbers(nums,target));
    }
}
