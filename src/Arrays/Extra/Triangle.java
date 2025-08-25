package Arrays.Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangle {
    static int minimumTotal(List<List<Integer>> triangle)
    {
        int n = triangle.size();
        int minSum = 0;
        for(int i = 0; i < n; i++)
        {
            minSum += Collections.min(triangle.get(i));
        }
        return minSum;
    }
    public static void main(String []args)
    {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(minimumTotal(triangle));
    }
}
