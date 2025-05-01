package Arrays.Part2;

import java.util.Arrays;

public class Next_Permutation {
    static void nextPermutation(int nums[])
    {
        int n=nums.length;

        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1])
        {
            i--;
        }

        if( i >= 0)
        {
            int j = n - 1;
            while(j >= 0 && nums[j] <= nums[i])
            {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums, i + 1, n - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args)
    {
        int num[] = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(num);
        System.out.print(Arrays.toString(num));
    }
}
