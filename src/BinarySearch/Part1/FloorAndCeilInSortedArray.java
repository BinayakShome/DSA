package BinarySearch.Part1;

public class FloorAndCeilInSortedArray {
    static int floor(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans; // returns -1 if no floor found
    }

    static int ceil(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans; // returns -1 if no ceil found
    }

    public static void main(String[] args)
    {
        int arr[] ={3, 4, 4, 7, 8, 10};
        int x = 5;
        System.out.print(floor(arr,x)+" "+ceil(arr,x));
    }
}
