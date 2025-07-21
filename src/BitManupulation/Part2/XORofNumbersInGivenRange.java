package BitManupulation.Part2;

public class XORofNumbersInGivenRange {
    static int range(int n)
    {
//        int xor = 0;
//        for(int i = 1; i <= n; i++)
//        {
//            xor = xor ^ i;
//        }
//        return xor;

/// Better approach
        if(n%4 == 1) return 1;
        if(n%4 == 2) return n+1;
        if(n%4 == 3) return 0;
        else return n;
    }
    public static void main(String []args)
    {
        int n = 3;
        System.out.println(range(n));
    }
}
