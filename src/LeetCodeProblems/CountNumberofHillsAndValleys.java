package LeetCodeProblems;

public class CountNumberofHillsAndValleys {
    static int countHillValley(int[] nums)
    {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i - 1]) continue;

            int left = i - 1;
            while (left >= 0 && nums[left] == nums[i]) left--;

            int right = i + 1;
            while (right < n && nums[right] == nums[i]) right++;

            if (left >= 0 && right < n) {
                if (nums[left] < nums[i] && nums[i] > nums[right]) {
                    count++;
                } else if (nums[left] > nums[i] && nums[i] < nums[right]) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String []args)
    {
        int []nums = {2,4,1,1,6,5};
        System.out.println(countHillValley(nums));
    }
}
