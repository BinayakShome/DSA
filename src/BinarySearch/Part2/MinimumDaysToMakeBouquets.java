package BinarySearch.Part2;

public class MinimumDaysToMakeBouquets {
    static Boolean possible(int[] arr, int day, int m, int k)
    {
        int n = arr.length;
        int cnt = 0;
        int noOB = 0;
        for(int i= 0; i<n; i++)
        {
            if(arr[i] <= day)
            {
                cnt++;
            }
            else
            {
                noOB += (cnt/k);
                cnt = 0;
            }
        }
        noOB += (cnt/k);
        return noOB >= m;
    }
    static int roseGarden(int nums[], int m, int k)
    {
        int val = m * k;
        int n = nums.length;
        if (val > n)
        {
            return -1;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++)
        {
            mini = Math.min(nums[i],mini);
            maxi = Math.max(nums[i],maxi);
        }

        int low = mini, high = maxi;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if (possible(nums,mid, m, k))
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args)
    {
        int arr[] = {7, 7, 7, 7, 13, 11, 12, 7}; ///---> given data
        int m = 2; /// ---> number of bouquets
        int k = 3; /// ---> number of roses required
        int ans = roseGarden(arr, m, k);
        if (ans==-1)
        {
            System.out.println("Not possible");
        }
        else
        {
            System.out.println("We can make bouquets on "+ans);
        }
    }
}
