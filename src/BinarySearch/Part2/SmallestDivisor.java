package BinarySearch.Part2;
import java.util.Arrays;
public class SmallestDivisor {
    static int sum(int[] nums, int divisor)
    {
        int total = 0;
        for (int num : nums) {
            total += Math.ceil((double) num / divisor);
        }
        return total;
    }
    static int divisor(int[] nums, int limit)
    {
        int start = 1, end = Arrays.stream(nums).max().getAsInt();
        int ans = end;
        while(start<=end)
        {
            int mid = (start+end)/2;
            int decide = sum(nums,mid);

            if (decide <= limit)
            {
                ans = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = {8,4,2,3};
        int limit = 10;
        System.out.println(divisor(arr,limit));
    }
}
