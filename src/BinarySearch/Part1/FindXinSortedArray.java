package BinarySearch.Part1;

public class FindXinSortedArray {
    static int bs(int nums[], int target)
    {
        int n = nums.length;
        int low = 0, high = n -1;
        while (low <= high)
        {
            int mid = (low + high)/2;
            if (nums[mid]==target)
            {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,4,6,7,9,12,16,17};
        int target = 6;
        int ind = bs(arr,target);
        if (ind == -1)
        {
            System.out.print("Element not present");
        }
        else
        {
            System.out.print("Element found at index "+ind);
        }
    }
}
