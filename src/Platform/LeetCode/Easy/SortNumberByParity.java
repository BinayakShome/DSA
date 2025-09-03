package Platform.LeetCode.Easy;

public class SortNumberByParity {
    static int[]  sortArray(int []nums)
    {
        int left = 0;
        int right = nums.length - 1;
        while(left < right)
        {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) {
                left++;
            }

            if (nums[right] % 2 != 0) {
                right--;
            }
        }
        return nums;
    }
    public static void main(String []args)
    {
        int []nums = {3,1,2,4};
        int []ans = sortArray(nums);
        for (int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + "  ");
        }
    }
}
