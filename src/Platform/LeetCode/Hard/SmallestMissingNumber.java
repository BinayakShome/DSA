package Platform.LeetCode.Hard;

import java.util.HashSet;
import java.util.Set;

public class SmallestMissingNumber {
    public static int missingNumber(int []nums)
    {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String []args)
    {
        int []num = {1};
        System.out.print(missingNumber(num));
    }
}
