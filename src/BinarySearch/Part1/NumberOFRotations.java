package BinarySearch.Part1;

public class NumberOFRotations {
    static int timesRotated(int nums[])
    {
        int left = 0, right = nums.length -1;
        while(left <= right)
        {
            int mid = (left + right)/2;

            if(nums[mid] > nums[right])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args)
    {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(timesRotated(arr));
    }
}