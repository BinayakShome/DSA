package LeetCodeProblems;

public class ReverseBits {
    static int reverseBits(int n)
    {
        String bit = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String res = new StringBuilder(bit).reverse().toString();
        return Integer.parseUnsignedInt(res, 2);
    }
    public static void main(String []args)
    {
        int n = 43261596;
        System.out.println(reverseBits(n));
    }
}
