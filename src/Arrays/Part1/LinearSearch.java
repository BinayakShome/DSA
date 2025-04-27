package Arrays.Part1;

public class LinearSearch {
    public static void main(String[] args)
    {
        int num = 3, arr[] = {1, 2, 3, 4, 5, 3}, n = arr.length;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]==num)
            {
                System.out.println("Element found at index "+(i+1));
            }
        }
    }
}
