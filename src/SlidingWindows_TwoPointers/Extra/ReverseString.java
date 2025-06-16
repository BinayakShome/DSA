package SlidingWindows_TwoPointers.Extra;

public class ReverseString {
    static void reverseString(char[] s)
    {
        int l = 0, r = s.length-1;
        while(l < r)
        {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    static void print(char []s)
    {
        for (char num : s) {
            System.out.print(num + " ");
        }
    }
    public static void main(String []args)
    {
        char []str = {'h','e','l','l','o'};
        reverseString(str);
        print(str);
    }
}
