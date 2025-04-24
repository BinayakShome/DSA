package Recursion;

public class Factorial {
    public static void main(String[] args)
    {
        int n=25, result=1;
        for(int i=n; i>1; i--)
        {
            result = result * i ;
        }
        System.out.print(result);
    }
}