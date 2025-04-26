package Arrays.Part1;

public class SecondSmallestElement {
    static void SecondSmallestElement(int arr[], int n)
    {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]<smallest)
            {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest element: "+smallest);
        System.out.println("Second smallest element: "+secondSmallest);
    }
    public static void main(String []args)
    {
        int arr[] = {13, 46, 24, 52, 20, 90, 90, 90, 2, 2, 3};
        int n = arr.length;
        SecondSmallestElement(arr,n);
    }
}
