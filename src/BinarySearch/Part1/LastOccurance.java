package BinarySearch.Part1;

public class LastOccurance {
    static int lastseen(int nums[], int x)
    {
        int left = 0, right = nums.length;
        int index = -1;

        while(left<right)
        {
            int mid = (left + right)/2;
            if(nums[mid] == x)
            {
                index = mid;
                left = mid + 1;
            } else if (nums[mid]<x)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,4,13,13,13,13,20};
        int target = 13;
        System.out.print(lastseen(arr,target));
    }
}
///Also solve it for first occurance