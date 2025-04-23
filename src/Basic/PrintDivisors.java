package Basic;

import static java.lang.Math.sqrt;

public class PrintDivisors {
    public static void main(String[] args)
    {
        int n=36;

        //this approach is sorted but in O(1)
//        for(int i = 1; i<=n/2; i++)
//        {
//            if(n%i==0)
//            {
//                System.out.print(i+"  ");
//            }
//        }

        //not sorted but optimised
        for(int i = 1; i<=sqrt(n); i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}
