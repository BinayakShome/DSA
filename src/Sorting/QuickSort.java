package Sorting;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort left and right partitions
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is <= pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    // Utility function to print the array
    static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Before sort:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After sort:");
        printArray(arr);
    }
}
