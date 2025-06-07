package GreedyAlgorithm.Part2;

import java.util.Arrays;

public class MinimumNumberOfPlatform {
    static int platform(int []arr, int []dep)
    {
        int n = arr.length;
        int plat = 1, i = 1, j = 0;
        int result = 1;

        Arrays.sort(arr);
        Arrays.sort(dep);

        while(i < n && j < n)
        {
            if(arr[i] <= dep[j])
            {
                plat++;
                i++;
            } else if (arr[i] > dep[j]) {
                plat--;
                j++;
            }

            if(plat > result)
            {
                result = plat;
            }
        }
        return result;
    }
    public static void main(String []args)
    {
        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        System.out.print("Number of platforms required: "+platform(arr,dep));
    }
}
