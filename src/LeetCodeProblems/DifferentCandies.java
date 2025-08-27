package LeetCodeProblems;

import java.util.HashSet;
import java.util.Set;

public class DifferentCandies {
    static int candy(int []candyType)
    {
        int n = candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int c : candyType)
        {
            set.add(c);
        }
        return Math.min(set.size(), n / 2);
    }
    public static void main(String []args)
    {
        int candies[] = {6,6,6,6};
        System.out.println(candy(candies));
    }
}
