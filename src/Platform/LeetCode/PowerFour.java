package Platform.LeetCode;

public class PowerFour {
    static boolean power(int n)
    {
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }
    public static void main(String []args)
    {
        int n = 5;
        System.out.println(power(n));
    }
}
