package BitManupulation.Extra;

public class OnesComplement {
    static String convert(int n)
    {
        if(n == 0) return "0";
        String res = "";
        while(n > 0)
        {
            res = (n%2) + res;
            n = n / 2;
        }
        return res;
    }
    static String comp(int n)
    {
        String binary = convert(n);
        int len = binary.length();
        String res = "";
        for(int i = 0; i < len; i++)
        {
            if(binary.charAt(i) == '1') res = res + "0";
            else res = res + "1";
        }
        return res;
    }
    public static void main(String []args)
    {
        int n = 13;
        System.out.println("1's Complement " + comp(n));
    }
}
