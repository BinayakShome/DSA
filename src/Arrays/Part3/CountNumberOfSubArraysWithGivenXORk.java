package Arrays.Part3;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfSubArraysWithGivenXORk {

    static int countSubArray(int arr[], int k)
    {
        int n = arr.length;
        int xr = 0, cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(xr,1);

        for (int i = 0; i<n; i++)
        {
            xr = xr ^ arr[i];
            int x = xr ^ k;

            if(map.containsKey(x))
            {
                cnt = cnt + map.get(x);
            }
            if(map.containsKey(xr))
            {
                map.put(xr, map.get(xr)+1);
            }
            else
            {
                map.put(xr, 1);
            }
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.print(countSubArray(a, k));
    }
}
