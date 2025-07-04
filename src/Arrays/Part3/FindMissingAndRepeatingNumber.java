package Arrays.Part3;

import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeatingNumber {
    static int[] find(int []arr)
    {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        int []res = new int[2];

        for(int num : arr)
        {
            if(set.contains(num))
            {
                res[0] = num;
            }
            set.add(num);
        }

        for(int i = 1; i <= n; i++)
        {
            if(!set.contains(i))
            {
                res[1] = i;
            }
        }
        return res;
    }
    public static void main(String []args)
    {
        int []arr = {3,1,2,5,3};

        int []res = find(arr);

        for(int i=  0; i < res.length; i++)
        {
            System.out.print(res[i]+"  ");
        }
    }
}
