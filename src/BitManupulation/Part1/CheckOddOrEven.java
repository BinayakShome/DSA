package BitManupulation.Part1;

public class CheckOddOrEven {
    static void odd_even(int n)
    {
        if((n & 1) == 1)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }
    }
    public static void main(String []args)
    {
        int n = 4;
        odd_even(n);
    }
}
