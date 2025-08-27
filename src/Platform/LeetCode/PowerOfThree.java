package Platform.LeetCode;

public class PowerOfThree {
    static boolean isPowerOfThree(int n)
    {
        int maxPower = 1162261467;  //3^19
        return n > 0 && maxPower % n == 0;
    }
    public static void main(String []args)
    {
        int n = -1;
        System.out.println(isPowerOfThree(n));
    }
}
