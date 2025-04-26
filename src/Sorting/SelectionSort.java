package Sorting;

public class SelectionSort {
    static void selection_sort(int arr[], int n)
    {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {13, 46, 24, 52, 20, 9}, n = arr.length;
        System.out.println("Before sort:");
        for (int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("After sort");
        selection_sort(arr,n);
    }
}