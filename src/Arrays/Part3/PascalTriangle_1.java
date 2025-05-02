package Arrays.Part3;

//1st variation
public class PascalTriangle_1 {
    static long ncr(int n, int r)
    {
        long result = 1;
        for(int i = 0; i<r; i++)
        {
            result = result * (n-i);
            result = result / (i+1);
        }
        return result;
    }

    static int pascalTriangle(int r, int c)
    {
        int element = (int) ncr(r-1,c-1);
        return element;
    }
    public static void main(String[] args)
    {
        int row = 5, col = 3;
        System.out.print(pascalTriangle(row,col));
    }
}
