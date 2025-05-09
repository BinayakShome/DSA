package Arrays.Part1;

public class LeftRotateByDplaces {

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

    static void Rotate(int arr[], int n, int k)
    {
        k = k%n;
        Reverse(arr, 0, k-1);
        Reverse(arr, k, n-1);
        Reverse(arr, 0, n-1);

        System.out.println("Resultant Array:");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9}, n = arr.length, k = 3;
        Rotate(arr, n, k);
    }
}