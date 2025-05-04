package BinarySearch.Part1;

public class SearchInsertPosition {
    static int insertPosition(int nums[], int x)
    {
        int left = 0, right = nums.length;
        while(left < right)
        {
            int mid = (left + right)/2;
            if (nums[mid]<x)
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,4,7};
        int x = 2;
        System.out.print(insertPosition(arr, x));
    }
}
