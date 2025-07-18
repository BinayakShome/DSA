package BitManupulation.Part1;

public class RemoveTheLastSetBit {
    static void removeBit(int n)
    {
        System.out.println(n & (n-1));
    }
    public static void main(String []args)
    {
        int n = 12;
        removeBit(n);
    }
}
