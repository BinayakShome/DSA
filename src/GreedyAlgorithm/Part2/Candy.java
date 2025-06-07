package GreedyAlgorithm.Part2;

import java.util.Arrays;

public class Candy {
    static int candy(int nums[])
    {
        int n = nums.length;
        int []candies = new int[n];

        Arrays.fill(candies,1);

        // Left to Right
        for(int i = 1; i < n; i++)
        {
            if(nums[i] > nums[i-1])
            {
                candies[i] = candies[i-1]+1;
            }
        }

        // Right to Left
        for(int i = n-2; i >= 0; i--)
        {
            if(nums[i]>nums[i+1])
            {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum up all candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
    public static void main(String []args)
    {
        int []ratings = {1,0,2};
        System.out.println(candy(ratings));
    }
}
