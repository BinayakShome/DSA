package SelfPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    static int longest(int arr[])
    {
        Set<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            set.add(num);
        }

        int longest = 0;

        for(int num : arr)
        {
            if(!set.contains(num - 1))
            {
                int current = num;
                int streak = 1;

                while(set.contains(current+1))
                {
                    current++;
                    streak++;
                }
                longest = Math.max(streak,longest);
            }
        }

        return longest;
    }
    public static void main(String []args)
    {
        int arr[] = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longest(arr));
    }
}
