package Arrays.Part3;

public class MaximumProductSubArrayInArray {
    static int product(int nums[])
    {
        int n = nums.length, pro = 1, maxPro = Integer.MIN_VALUE;

        for (int i =0; i<n; i++)
        {
            pro = pro * nums[i];
            if(pro > maxPro)
            {
                maxPro = pro;
            }
            if(pro == 0)
            {
                pro = 1;
            }
        }
        return maxPro;
    }
    public static void main(String[] args)
    {
        int arr[] = {-2,0,-1};
        System.out.print(product(arr));
    }
}
