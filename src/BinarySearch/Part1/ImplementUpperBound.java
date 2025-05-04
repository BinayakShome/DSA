package BinarySearch.Part1;

public class ImplementUpperBound {
    static int upperBound(int nums[], int x)
    {
        int left = 0, right = nums.length;
        while(left<right)
        {
            int mid = (left + right)/2;
            if (nums[mid] > x)
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        return right;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,2,3};
        int x = 2;
        System.out.print(upperBound(arr, x));
    }
}
