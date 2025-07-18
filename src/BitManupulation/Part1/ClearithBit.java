package BitManupulation.Part1;

public class ClearithBit {
    static void clearBit(int n)
    {
        System.out.println(n&(~(1<<2)));
    }
    public static void main(String []args)
    {
        int n = 13;
        clearBit(n);
    }
}
