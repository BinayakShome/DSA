package Arrays.Part1;

public class RightRotateDplaces {

    static void Reverse(int arr[], int start, int end)
    {
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void RightRotateDPlaces(int arr[], int n, int k)
    {
        k = k % n;

        Reverse(arr, n-k, n-1);
        Reverse(arr, 0, n-k-1);
        Reverse(arr, 0, n-1);

        for (int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7}, n = arr.length, k = 2;
        RightRotateDPlaces(arr, n, k);
    }
}