package BitManupulation.Part2;

public class XORofNumbersInGivenRange {
    static int range(int n)
    {
        int xor = 0;
        for(int i = 1; i <= n; i++)
        {
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String []args)
    {
        int n = 9;
        System.out.println(range(n));
    }
}
