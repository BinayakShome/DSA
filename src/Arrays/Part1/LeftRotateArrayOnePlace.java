package Arrays.Part1;

public class LeftRotateArrayOnePlace {
    static void Rotate(int arr[], int n)
    {
        int temp = arr[0];
        for(int i = 1; i<n; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for (int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6}, n = arr.length;
        Rotate(arr, n);
    }
}