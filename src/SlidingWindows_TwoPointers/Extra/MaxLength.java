package SlidingWindows_TwoPointers.Extra;

public class MaxLength {
    static int length(int arr[], int k)
    {
        int l = 0, r = 0, sum = 0, maxLen = 0;
        int n = arr.length;

        int start = 0, end = 0;
        while (r < n) {
            sum += arr[r];

            // Shrink window if sum exceeds k
            while (sum > k && l <= r) {
                sum -= arr[l];
                start = l;
                l++;
            }

            // Update max length of valid subarray
            maxLen = Math.max(maxLen, r - l + 1);
            end = r;
            r++;
        }

        for (int i = start; i <= end; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        return maxLen;
    }
    public static void main(String []args)
    {
        int arr[] = {2,5,1,10,10};
        int k = 14;
        System.out.println(length(arr,k));
    }
}