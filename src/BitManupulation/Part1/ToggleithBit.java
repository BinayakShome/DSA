package BitManupulation.Part1;

public class ToggleithBit {
    static void toggle(int n)
    {
        System.out.println(n^(1<<2));
    }
    public static void main(String []args)
    {
        int n = 8;
        toggle(n);
    }
}
