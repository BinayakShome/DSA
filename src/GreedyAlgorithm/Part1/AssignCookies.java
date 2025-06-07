package GreedyAlgorithm.Part1;

import java.util.Arrays;

public class AssignCookies {
    static int assign(int []greedy, int []cookies)
    {
        Arrays.sort(cookies);
        Arrays.sort(greedy);

        int n = greedy.length;
        int m = cookies.length;

        int l = 0;
        int r = 0;

        while (l < m && r < n)
        {
            if(greedy[r] <= cookies[l])
            {
                r++;
            }
            l++;
        }

        return r;
    }
    public static void main(String []args)
    {
        int []greedy = {1,5,3,3,4};
        int []cookies = {4,2,1,2,1,3};
        System.out.println(assign(greedy,cookies));
    }
}
