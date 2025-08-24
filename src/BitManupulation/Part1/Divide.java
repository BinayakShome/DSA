package BitManupulation.Part1;

public class Divide {
    static int divide(int dividend, int divisor)
    {
        if(divisor == 0) return -1;
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long quotient = 0;

        while(a >= b)
        {
            long temp = b, multiple = 1;
            while((temp<<1) <= a)
            {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            quotient += multiple;
        }
        if (negative) quotient = -quotient;
        if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) quotient;
    }
    public static void main(String []args)
    {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
    }
}
