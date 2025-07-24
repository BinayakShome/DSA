package BitManupulation.Part3;

public class PrimeFactors {
    static void primefactors(int n)
    {
        while((n & 1) == 0)
        {
            System.out.println(2 + " ");
            n = n >> 1;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n);
        }
    }
    public static void main(String []args)
    {
        int n = 60;
        primefactors(n);
    }
}
