package LeetCodeProblems.Easy;

import java.util.Arrays;

public class ArrayPartion {
    static int arrayPairSum(int []arr)
    {
        int sum = 0;
        Arrays.sort(arr);

        int len = arr.length - 1;

        while(len > 0)
        {
            int last = arr[len];
            int slast = arr[len - 1];
            sum += Math.min(last, slast);

            len = len - 2;
        }
        return sum;
    }

    public static void main(String []args)
    {
        int []arr = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(arr));
    }
}
