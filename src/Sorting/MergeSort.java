package Sorting;

public class MergeSort {

    // entry point for merge sort
    static void mergeSort(int arr[])
    {
        mergeSort(arr,0,arr.length-1);
    }

    static void mergeSort(int arr[], int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right)/2;

            // Sort the left half
            mergeSort(arr, left, mid);

            // Sort the right half
            mergeSort(arr, mid + 1, right);

            // Merge the two halves
            merge(arr, left, mid, right);
        }
    }

    static void merge(int arr[], int left, int mid, int right)
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {3,2,8,5,1,4,23};
        int n = arr.length;

        System.out.println("Before sort");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+"  ");
        }

        mergeSort(arr);

        System.out.println();
        System.out.println("Sorted array");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
