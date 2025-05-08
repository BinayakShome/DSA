package String.Part1;

public class ReverseString {
    static String reverse(String str)
    {
        int left = 0, right = str.length()-1;

        String temp ="";
        String ans = "";

        while(left <= right)
        {
            char ch = str.charAt(left);

            if (ch!=' ')
            {
                temp = temp + ch;
            }
            else if (ch == ' ')
            {
                if (!ans.equals(""))
                {
                    ans = temp + " " + ans;
                }
                else
                {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }
        if (!temp.equals(""))
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
        }
        return ans.toString().trim();
    }
    public static void main(String []args)
    {
        String name = "Binayak Shome";
        System.out.println(reverse(name));
    }
}
