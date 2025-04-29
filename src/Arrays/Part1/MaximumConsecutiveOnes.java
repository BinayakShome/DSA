package Arrays.Part1;

public class MaximumConsecutiveOnes {
    static int countOnes(int nums[])
    {
        int cnt = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                cnt++;
            }
            else
            {
                cnt = 0;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    public static void main(String[] args)
    {
        int nums[] = {1, 0, 1, 1, 0, 1};
        int num = countOnes(nums);
        System.out.println(num);
    }
}