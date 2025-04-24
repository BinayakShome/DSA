package Recursion;

public class ReversedArray {

    static void printArray(int arr[], int n)
    {
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int arr[], int n)
    {
        int ans[] = new int[n];
        for(int i = n-1; i>=0; i--)
        {
            ans[n-i-1] = arr[i];
        }
        printArray(ans, n);
    }

    public static void main(String[] args)
    {
        int n = 5, arr[] = {1,2,3,4,5};
        reverse(arr, n);
    }
}
