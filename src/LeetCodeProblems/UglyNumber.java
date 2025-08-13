package LeetCodeProblems;

public class UglyNumber {
    static boolean ugly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        return n == 1;
    }

    public static void main(String[] args)
    {
        int n = 6;
        System.out.println(ugly(n));
    }
}
