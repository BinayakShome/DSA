package BinarySearch.Part1;

import java.util.ArrayList;

public class SearchSingleElement {
    static int single(int nums[])
    {
        int left = 0, right = nums.length - 1;

        while(left < right)
        {
            int mid = (left + right)/2;

            if(mid%2==1)
            {
                mid--;
            }

            if(nums[mid]==nums[mid+1])
            {
                left = mid + 2;
            }
            else
            {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args)
    {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(single(arr));
    }
}
