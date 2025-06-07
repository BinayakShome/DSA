package GreedyAlgorithm.Part2;

public class JumpGame1 {
    static boolean jump(int []nums)
    {
        int maxIndex = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if( i > maxIndex)
            {
                return false;
            }
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        return true;
    }
    public static void main(String []args)
    {
        int []nums = {4,3,7,1,2};
        System.out.println(jump(nums));
    }
}