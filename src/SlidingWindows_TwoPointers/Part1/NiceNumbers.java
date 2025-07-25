package SlidingWindows_TwoPointers.Part1;

public class NiceNumbers {
    static int niceNumbers(int []nums, int k)
    {
        int n = nums.length;
        int count = 0;
        int left = 0, oddCount = 0;

        for(int right = 0; right < n; right++)
        {
            if(nums[right] % 2 == 1)
            {
                oddCount++;
            }

            while( left <= right && oddCount > k)
            {
                if(nums[left] % 2 == 1)
                {
                    oddCount--;
                }
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
    static int numberOfSubarrays(int[] nums, int k)
    {
        return niceNumbers(nums, k) - niceNumbers(nums, k - 1);
    }
    public static void main(String []args)
    {
        int []nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarrays(nums,k));
    }
}
