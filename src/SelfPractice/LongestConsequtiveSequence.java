package SelfPractice;

import java.util.HashSet;

public class LongestConsequtiveSequence {
    static int longestSequence(int nums[])
    {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        if (n == 0)
        {
            return 0;
        }

        for (int i : nums)
        {
            set.add(i);
        }

        int longestStreak = 0;

        for (int i : nums)
        {
            if (!set.contains(i-1))
            {
                int currentNum = i;
                int currentStreak = 1;

                while(set.contains(currentNum + 1))
                {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
    public static void main(String [] args)
    {
        int input[] = {100,4,200,1,3,2};
        System.out.println(longestSequence(input));
    }
}
