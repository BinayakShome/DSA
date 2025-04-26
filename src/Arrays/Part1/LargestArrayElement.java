package Arrays.Part1;

public class LargestArrayElement {
    static void LargestElemnt(int arr[], int n)
    {
        int max = 0;
        for (int i = 0; i<n; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.print("Maximum element: "+max);
    }

    public static void main(String[] args)
    {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        LargestElemnt(arr,n);
    }
}
