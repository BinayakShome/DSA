package BinarySearch.Part2;

import java.util.Arrays;

public class PainterPartitionProblem {
    static int minTime(int []board, int k)
    {
        int low = Arrays.stream(board).max().getAsInt();
        int high = Arrays.stream(board).sum();

        while(low < high)
        {
            int mid = low + (high - low)/2;

            if (canPaint(board,k,mid))
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean canPaint(int []boards, int k, int maxTime)
    {
        int painters = 1, total = 0;
        for (int length : boards)
        {
            if (total + length > maxTime)
            {
                painters++;
                total = length;

                if (painters > k)
                {
                    return false;
                }
            }
            else
            {
                total += length;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        int[] boards = {10, 20, 30, 40}; /// output 60
        int k = 2;
        System.out.println(minTime(boards,k));
    }
}
