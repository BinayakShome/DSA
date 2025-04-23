package Basic;

public class ReverseNumber {
    public static void main(String[] args)
    {
        int num = 1534236469, reverse = 0, temp = num;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reverse);

        if(temp==reverse)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}

//checks for 32 bit integer
//class Solution {
//    public int reverse(int n) {
//        long reverse = 0;
//
//        while (n != 0) {
//            int digit = n % 10;
//            reverse = reverse * 10 + digit;
//            n /= 10;
//        }
//
//        // Check if reversed number overflows int range
//        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
//            return 0;
//        }
//
//        return (int) reverse;
//    }
//}