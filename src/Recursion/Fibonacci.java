package Recursion;

public class Fibonacci {
    static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            int fib[] = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;
            for(int i = 2; i<=n; i++)
            {
                fib[i] = fib[i-1] + fib[i-2];
            }
            return fib[n];
        }
    }
    public static void main(String[] args)
    {
        int n = 6;
        int num = fibonacci(n);
        System.out.print(num);
    }
}