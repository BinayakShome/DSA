package Arrays.Part3;

public class PascalTriangle2 {
    static long ncr(int n, int r)
    {
        long result = 1;
        for(int i = 0; i<r; i++)
        {
            result = result * (n-i);
            result = result / (i+1);
        }
        return result;
    }
    static void pt2(int n)
    {
        for(int i = 1; i<=n;i++)
        {
            System.out.print(ncr(n-1, i-1)+"  ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        int n = 5;
        pt2(n);
    }
}
