package BinarySearch.Part2;

import java.util.Arrays;

public class KokoEatingBananas {
    static int calHour(int piles[], int hour)
    {
        int totalHour = 0;
        int n = piles.length;

        for ( int i = 0 ; i < n ; i++ )
        {
            totalHour += Math.ceil((double) piles[i]/hour); /// don't forget about double here.
        }
        return totalHour;
    }
    static int minEatingSpeed(int piles[], int h)
    {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt(); /// ---> used shortcut to find the max element in the array. Use separate function for this.
        while(left<=right)
        {
            int mid = (left+right)/2;
            int totalHour = calHour(piles,mid);
            if (totalHour<=h)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args)
    {
        int piles[] = {7, 15, 6, 3};  //--> 5
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
}