package Sorting;

public class RecursiveBubbleSort {
    static void sort(int []nums)
    {
        int n = nums.length;
        if(n == 1) return;

        int didswap = 0;
        for(int i = 0; i <= n - 2; i++)
        {
            if(nums[i] > nums[i+1])
            {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;

                didswap = 1;
            }
        }

        if(didswap == 0)return;

        sort(nums);
    }
    public static void main(String []args)
    {
        int []arr = {13,46,24,52,20,9};
        sort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
