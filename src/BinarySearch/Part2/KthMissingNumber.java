package BinarySearch.Part2;

public class KthMissingNumber {
    static int missingNumber(int vec[], int k)
    {
        int low = 0, high = vec.length - 1;

        while (low <= high)
        {
            int mid = (low + high)/2;
            int missing = vec[mid] - (mid + 1);

            if(missing < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String []args)
    {
        int vec[] = {4,7,9,10};  ///counting starts from 0
        int k = 4;
        System.out.println(missingNumber(vec,k));
    }
}
