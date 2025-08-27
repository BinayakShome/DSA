package LeetCodeProblems.Easy;

public class AddDigits {
    static int add(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int last = n % 10;
            sum += last;
            n = n / 10;
        }
        return sum;
    }

    static int answer(int n)
    {
        int ans = 0;
        while(n >= 10)
        {
            n = add(n);
        }
        ans = n;
        return ans;
    }
    public static void main(String []args)
    {
        int n = 10;
        System.out.println(answer(n));
    }
}
