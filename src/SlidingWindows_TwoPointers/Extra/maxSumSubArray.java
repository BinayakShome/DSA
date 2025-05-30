package SlidingWindows_TwoPointers.Extra;

public class maxSumSubArray {
    public static void main(String []args)
    {
        int []arr = {2,1,5,3,1,2};
        int k = 3;

        int maxSum = 0;
        int windowSum = 0;

        // first window
        for(int i = 0 ; i < k; i++)
        {
            windowSum += arr[i];
        }

        //slide window
        for(int i = 0 ; i < arr.length; i++)
        {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    }
}
