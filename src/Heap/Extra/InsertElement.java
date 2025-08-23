package Heap.Extra;

import java.util.ArrayList;

public class InsertElement {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) smallest = left;
        if (right < n && arr[right] < arr[smallest]) smallest = right;

        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, n, smallest);
        }
    }

    static void buildHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void bubbleUp(ArrayList<Integer> heap, int i) {
        int parent = (i - 1) / 2;
        while (i > 0 && heap.get(i) < heap.get(parent)) {
            int temp = heap.get(i);
            heap.set(i, heap.get(parent));
            heap.set(parent, temp);
            i = parent;
            parent = (i - 1) / 2;
        }
    }

    static void insert(ArrayList<Integer> heap, int value) {
        heap.add(value);
        bubbleUp(heap, heap.size() - 1);
    }

    static void print(ArrayList<Integer> heap) {
        for (int x : heap) System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 17, 30, 40};

        buildHeap(arr);
        ArrayList<Integer> heap = new ArrayList<>();
        for (int x : arr) heap.add(x);

        System.out.print("Before: ");
        print(heap);

        insert(heap, 25);

        System.out.print("\nAfter: ");
        print(heap);
    }
}
