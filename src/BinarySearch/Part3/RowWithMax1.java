package BinarySearch.Part3;

import java.util.*;

public class RowWithMax1 {

    static int lowerBound(ArrayList<Integer> arr, int row, int x)
    {
        int low = 0, high = row - 1;
        int ans = row;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if(arr.get(mid) >= x)
            {
                ans = mid;
                //look for a smaller value
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    static int max1(ArrayList<ArrayList<Integer>> matrix, int row, int col)
    {
        int count = 0;
        int index = -1;

        for(int i = 0; i < row; i++)
        {
            int cnt_one = col - lowerBound(matrix.get(i), col, 1);
            if(cnt_one > count)
            {
                count = cnt_one;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,0)));
        int row = 3, col = 3;

        System.out.println(max1(matrix,row,col));
    }
}
