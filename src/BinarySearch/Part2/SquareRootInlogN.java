package BinarySearch.Part2;

public class SquareRootInlogN {
    static int squareRoot(int n)
    {
        int low = 1, high = n;

        while(low<=high)
        {
            int mid = (low + high)/2;
            int val = mid * mid;

            if(val<= n)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return high;
    }
    public static void main(String[] args)
    {
        int num = 9;
        System.out.println(squareRoot(num));
        System.out.println(15/2);
    }
}
