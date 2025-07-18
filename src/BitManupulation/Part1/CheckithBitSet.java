package BitManupulation.Part1;

public class CheckithBitSet {
    static boolean check(int n)
    {
        return ((n & (1 << 2)) != 0);
    }
    public static void main(String []args)
    {
        int n = 13;
        System.out.println(check(n));
    }
}
