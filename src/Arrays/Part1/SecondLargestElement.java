package Arrays.Part1;

public class SecondLargestElement {
    static void SecondLargest(int arr[], int n)
    {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++)
        {
            if (arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Largest element: "+largest);
        System.out.print("Second largest: "+secondLargest);
    }

    public static void main(String []args)
    {
        int arr[] = {13, 46, 24, 52, 20, 90, 90, 90};
        int n = arr.length;
        SecondLargest(arr,n);
    }
}
