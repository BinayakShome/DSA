package StackAndQueues.Part3;

public class TrappingRainWater {
    static int height(int []height)
    {
        int n = height.length;
        int left = 0, right = n-1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;

        while (left <= right)
        {
            if (height[left] <= height[right])
            {
                if (height[left] >= maxLeft)
                {
                    maxLeft = height[left];
                }
                else
                {
                    res += maxLeft - height[left];
                }
                left++;
            }
            else
            {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }
    public static void main(String []args)
    {
        int []height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The duplicate element is " + height(height));
    }
}
