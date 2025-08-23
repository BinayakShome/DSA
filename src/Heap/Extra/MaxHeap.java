package Heap.Extra;

public class MaxHeap {
    static void swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapify(int []arr, int n, int i)
    {
        int root = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[root]) root = left;
        if(right < n && arr[right] > arr[root]) root = right;
        if(root != i)
        {
            swap(arr, i, root);
            heapify(arr, n, root);
        }
    }

    static void buildHeap(int []arr)
    {
        int n = arr.length;
        for(int i = n/2 - 1; i >= 0; i--)
        {
            heapify(arr, n, i);
        }
    }

    static void print(int []arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String []args)
    {
        int []arr = {20, 10, 17, 30, 40};
        System.out.print("Before: ");
        print(arr);
        buildHeap(arr);
        System.out.print("\nAfter: ");
        print(arr);
    }
}
