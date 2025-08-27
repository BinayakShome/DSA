package LeetCodeProblems;

public class ArrangingCoins {
    static int coins(int n)
    {
        return (int)((Math.sqrt(1 + 8L * n) - 1) / 2);
    }
    public static void main(String []args)
    {
        int n1 = 5; //2
        int n2 = 8; //3

        System.out.println(coins(n1));
        System.out.println(coins(n2));
    }
}
