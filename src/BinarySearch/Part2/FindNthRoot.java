package BinarySearch.Part2;

public class FindNthRoot {
    static int func(int mid, int m, int n)
    {
        int ans = 1;
        for (int i = 1; i<=n; i++)
        {
            ans = ans * mid;
            if (ans > m)
            {
                return 2;
            }
        }
        if (ans==m)
        {
            return 1;
        }
        return 0;
    }
    static int root(int m, int n)
    {
        int low = 1, high = m;
        while(low<=high)
        {
            int mid = (low + high)/2;
            int midN = func(mid,m,n);
            if (midN == 1)
            {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int m = 27, n = 3;
        System.out.println(root(m,n));
    }
}
