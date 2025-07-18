package BitManupulation.Extra;

public class BinaryToInt {
    static int convert(String binary)
    {
        int n = 0;
        int len = binary.length();

        for(int i = len - 1; i >= 0; i--)
        {
            if(binary.charAt(i) == '1')
            {
                n += Math.pow(2, len - i- 1);
            }
        }
        return n;
    }
    public static void main(String []args)
    {
        String binary = "101";
        System.out.println(convert(binary));
    }
}
