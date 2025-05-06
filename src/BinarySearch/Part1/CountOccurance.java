package BinarySearch.Part1;

public class CountOccurance {
    static int first(int nums[], int x)
    {
        int left = 0,right = nums.length;
        int index = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid]==x)
            {
                index = mid;
                right = mid - 1;
            } else if (nums[mid] < x)
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

    static int last(int nums[], int x)
    {
        int left = 0,right = nums.length;
        int index = -1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(nums[mid] == x)
            {
                index = mid;
                left = mid + 1;
            } else if (nums[mid]<x) {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return index;
    }

    static int count(int nums[], int x)
    {
        int First = first(nums,x);
        int Last = last(nums,x);

        if(First == -1 || Last == -1)
        {
            return 0;
        }
        return (last(nums,x) - first(nums,x) + 1);
    }
    public static void main(String[] args)
    {
        int array[] = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 9;
        System.out.println(count(array,x));
        System.out.println(first(array,x));
        System.out.println(last(array,x));
    }
}
