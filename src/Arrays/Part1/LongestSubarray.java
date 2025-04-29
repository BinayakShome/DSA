package Arrays.Part1;

public class LongestSubarray {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,1,1,1,3,2};
        for(int i = 0; i<arr.length; i++)
        {
            for(int j =i; j<arr.length; j++)
            {
                int s = 0;
                for(int k = i; k <= j; k++)
                {
                    s = s + arr[k];
                }
                if (s == 3) {
                    System.out.println("Sum of subarray from index " + i + " to " + j + " is: " + s);
                }
            }
        }
    }
}
