package Arrays.Part2;

//Sort the array according to 0s, 1s, and 2s
public class DNF_Algorithm {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArray(int nums[])
    {
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;

        while(mid<=high)
        {
            if(nums[mid] == 0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if( nums[mid] == 1 )
            {
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {0, 2, 1, 2, 0, 1, 2, 1, 0, 0, 2, 1, 1, 1, 2, 2, 0, 0, 2, 2};
        sortArray(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
//Dutch National Flag Algorithm