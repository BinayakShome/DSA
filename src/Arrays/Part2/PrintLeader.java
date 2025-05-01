package Arrays.Part2;

public class PrintLeader {
    static void leader(int nums[])
    {
        int n = nums.length;
        int maxRight = nums[n-1];

        for(int i = n-1; i >= 0; i--)
        {
            if(nums[i] >= maxRight)
            {
                maxRight = nums[i];
                System.out.print(maxRight+"  ");
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[]=  {16, 17, 4, 3, 5, 2};
        leader(arr);
    }
}