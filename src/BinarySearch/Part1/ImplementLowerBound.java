package BinarySearch.Part1;

public class ImplementLowerBound {
    static int lowerBound(int nums[], int x)
    {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < x)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,5,8,15,19};
        int x = 9;
        System.out.print(lowerBound(arr,x));
    }
}
