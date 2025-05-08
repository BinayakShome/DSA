package BinarySearch.Part2;

import java.util.Arrays;

public class SplitArray_LargestSum {
    static int splitArray(int nums[], int k)
    {
        int left = Arrays.stream(nums).max().getAsInt();
        int right = Arrays.stream(nums).sum();

        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (canSplit(nums,mid,k))
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }

    static boolean canSplit(int[] nums, int mid, int k)
    {
        int currentSum = 0;
        int splits = 1;

        for(int num : nums)
        {
            if (currentSum + num > mid)
            {
                splits++;
                currentSum = num;

                if (splits > k)
                {
                    return false;
                }
            }
            else
            {
                currentSum += num;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int a[] = {7, 2, 5, 10, 8};
        int k=2;
        System.out.println(splitArray(a,k));
    }
}
