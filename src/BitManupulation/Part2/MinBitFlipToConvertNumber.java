package BitManupulation.Part2;

public class MinBitFlipToConvertNumber {
    static int minBitFlips(int start, int goal)
    {
        int count = 0;
        int xor = start ^ goal;

        while(xor != 0)
        {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
    public static void main(String []args)
    {
        int start = 3, goal = 4;
        System.out.println(minBitFlips(start,goal));
    }
}
