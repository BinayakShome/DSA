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
        int arr[] = {10,9,8,7,6,5};

        if(nonDecreasing(arr1))
        {
            System.out.println("increasing");
        }
        else
        {
            System.out.println("decreasing");
        }
    }
}

//Time -> O(N), space -> O(1)