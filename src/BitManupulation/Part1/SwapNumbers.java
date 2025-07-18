package BitManupulation.Part1;

public class SwapNumbers {
    static void swap(int a, int b)
    {
        System.out.println((a^b)^a);
        System.out.println((a^b)^b);
    }
    public static void main(String []args)
    {
        int a = 5;
        int b = 6;
        swap(a,b);
    }
}
