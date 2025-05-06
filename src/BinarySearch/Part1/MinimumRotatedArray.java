package BinarySearch.Part1;

public class MinimumRotatedArray {
    static int minimum(int nums[])
    {
        int left = 0, right = nums.length - 1;
        int minimum = Integer.MAX_VALUE;
        while(left <= right )
        {
            int mid = (left + right) /2;

            //left part is sorted
            if(nums[left] <= nums[mid])
            {
                minimum = Math.min(minimum, nums[left]);
                left = mid + 1;
            }
            else
            {
                minimum = Math.min(minimum, nums[mid]);
                right = mid - 1;
            }
        }
        return minimum;
    }
    public static void main(String[] args)
    {
        int arr[] = {4,5,1,2,3};
        int ans = minimum(arr);
        System.out.println(ans);
    }
}
