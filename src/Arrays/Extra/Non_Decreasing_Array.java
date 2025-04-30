package Arrays.Extra;

public class Non_Decreasing_Array {
    static boolean nonDecreasing(int nums[])
    {
        int n = nums.length;
        for (int i = 0; i < n-1 ; i++)
        {
            if (nums[i]>nums[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr1[] = {3, 4, 6, 8, 9, 11};
        int arr2[] = {3 ,4 ,3 ,5, 9};

        if(nonDecreasing(arr1))
        {
            System.out.println("non decreasing");
        }
        else
        {
            System.out.println("not non decreasing");
        }
    }
}

//Time -> O(N), space -> O(1)