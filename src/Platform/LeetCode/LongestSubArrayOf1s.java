package Platform.LeetCode;

public class LongestSubArrayOf1s {
    static int subarray(int []arr)
    {
        int left = 0, zero = 0, maxLen = 0;
        for(int right = 0; right < arr.length; right++)
        {
            if(arr[right] == 0) zero++;

            while(zero > 1){
                if(arr[left] == 0) zero--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen - 1;
    }
    public static void main(String []args)
    {
        int []nums = {1,1,0,1};
        System.out.println(subarray(nums));
    }
}
