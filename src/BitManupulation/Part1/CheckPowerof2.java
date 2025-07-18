package BitManupulation.Part1;

public class CheckPowerof2 {
    static boolean power(int n)
    {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args)
    {
        int n = 7;
        System.out.println(power(n));
    }
}
