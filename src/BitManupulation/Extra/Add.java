package BitManupulation.Extra;

public class Add {
    static int addition(int a, int b)
    {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String []args)
    {
        int a = 4, b = 4;
        System.out.println(addition(a,b));
    }
}