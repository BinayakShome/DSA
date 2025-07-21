package BitManupulation.Part2;

public class SingleNumberIII {
    static int[] single(int []nums)
    {
        int xor = 0;
        for(int num : nums)
        {
            xor ^= num;
        }

        int rightmost = xor & -xor;
        int b1 = 0, b2 = 0;

        for(int num : nums)
        {
            if((num & rightmost) != 0)
            {
                b1 = b1 ^ num;
            }
            else {
                b2 = b2 ^ num;
            }
        }
        return new int[]{b1, b2};
    }
    public static void main(String []args)
    {
        int[] nums = {2,4,2,3,14,8,7,7,8,3,4,6};
        int[] result = single(nums);
        System.out.println(result[0] + " " + result[1]);
    }
}
