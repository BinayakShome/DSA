package Heap.Extra;

public class MergeTwoHeap {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[smallest]) smallest = left;
        if (right < n && arr[right] > arr[smallest]) smallest = right;

        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, n, smallest);
        }
    }

    static int[] merge(int []arr1, int []arr2, int n1, int n2)
    {
        int []ans = new int[n1 + n2];
        System.arraycopy(arr1, 0, ans, 0, n1);
        System.arraycopy(arr2, 0, ans, n1, n2);
        buildHeap(ans, ans.length);
        return ans;
    }

    static void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void print(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String []args)
    {
        int []arr1 = {10, 5, 6, 2};
        int n1 = arr1.length;
        int []arr2 = {12, 7, 9};
        int n2 = arr2.length;

        buildHeap(arr1, n1);
        buildHeap(arr2, n2);

        System.out.print("Heap1: "); print(arr1);
        System.out.print("Heap2: "); print(arr2);

        int[] merged = merge(arr1, arr2, n1, n2);
        System.out.print("Merged Heap: "); print(merged);
    }
}


/// MERGING TWO MIN HEAPS