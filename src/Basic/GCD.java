package Basic;

import static java.lang.Math.min;

public class GCD {
    public static void main(String[] args)
    {
        int n1 = 20, n2 = 42, gcd = 1;
        for(int i = 1; i<=min(n1,n2); i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd = i;
            }
        }
        System.out.print("GCD: "+gcd);
    }
}