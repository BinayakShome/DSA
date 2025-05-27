package Arrays.Part1;

import java.util.Arrays;

public class missingNumber {
    static int missingNumber(int arr[])
    {
        int N = arr.length;
        int sum = ((N+2)*(N+1))/2;
        //in case of unsorted array, use sum = n*(n+1)/2
        int s2 = 0;
        for(int i = 0; i<N; i++)
        {
            s2 = s2 + arr[i];
        }
        int missingNumber = sum - s2;
        return missingNumber;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,4,5};//will also work for unsorted array
        int ans = missingNumber(arr);
        System.out.println("Missing number is "+ans);
    }
}
