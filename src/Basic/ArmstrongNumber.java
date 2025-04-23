package Basic;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        int n= 371, x=n, sum=0;
        while(n!=0)
        {
            int digit = n%10;
            sum = sum + (digit*digit*digit);
            n = n/10;
        }
        if(x==sum)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}