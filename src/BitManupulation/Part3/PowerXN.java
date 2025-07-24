package BitManupulation.Part3;

public class PowerXN {
    static double pow(double x, int n)
    {
        double ans = 1.0;
        long N = n;
        if(N < 0)
        {
            x = 1 / x;
            N = -N;
        }

        while(N > 0)
        {
            if((N % 2) == 1)
            {
                ans *= x;
            }
            x *= x;
            N /= 2;
        }
        return ans;
    }
    public static void main(String []args)
    {
        double x = 2.00000;
        int n = 10;
        System.out.println(pow(x,n));
    }
}
