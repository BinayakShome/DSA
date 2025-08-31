package Platform.LeetCode.Easy;

public class ValidPerfectSquare {
    static boolean isPerfectSquare(int n)
    {
        if(n==1) return true;
        int low = 2, high = n/2;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            long power = (long) mid * mid;

            if(power == n)
            {
                return true;
            }
            else if(power < n)
            {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String []args)
    {
        int n = 16;
        System.out.print(isPerfectSquare(n));
    }
}
