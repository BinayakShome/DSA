package BitManupulation.Extra;

public class IntToBinary {
    static String convert(int n)
    {
        if(n==0) return "0";
        String res = "";
        while(n > 0)
        {
            res = (n % 2) + res;
            n = n/2;
        }
        return res;
    }
    public static void main(String []args)
    {
        int n = 4;
        System.out.println(convert(n));
    }
}
