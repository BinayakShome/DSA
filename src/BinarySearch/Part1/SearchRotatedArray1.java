package BinarySearch.Part1;

import java.util.ArrayList;

public class SearchRotatedArray1 {
    static int search(ArrayList<Integer> nums, int x)
    {
        int low = 0, high = nums.size() - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (nums.get(mid) == x)
            {
                return mid;
            }
            if (nums.get(low) <= nums.get(mid))
            {
                if (nums.get(low) <= x && x < nums.get(mid))
                {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else
            {
                if (nums.get(mid) < x && x <= nums.get(high))
                {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7,0,1,2};
        int x = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr)
        {
            list.add(num);
        }

        int index = search(list, x);
        System.out.println("Element found at index: " + index);
    }
}