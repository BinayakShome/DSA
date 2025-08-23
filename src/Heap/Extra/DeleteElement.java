package Heap.Extra;

import java.util.ArrayList;

public class DeleteElement {
    static void swap(ArrayList<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    static void heapify(ArrayList<Integer> heap, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < n && heap.get(right) < heap.get(smallest)) smallest = right;

        if (smallest != i) {
            swap(heap, i, smallest);
            heapify(heap, n, smallest);
        }
    }

    static void insert(ArrayList<Integer> heap, int value) {
        heap.add(value);
        int i = heap.size() - 1;
        int parent = (i - 1) / 2;
        while (i > 0 && heap.get(i) < heap.get(parent)) {
            swap(heap, i, parent);
            i = parent;
            parent = (i - 1) / 2;
        }
    }

    static int deleteMin(ArrayList<Integer> heap) {
        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (heap.size() > 0) {
            heap.set(0, last);
            heapify(heap, heap.size(), 0);
        }
        return root;
    }

    static void print(ArrayList<Integer> heap) {
        for (int x : heap) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        insert(heap, 20);
        insert(heap, 10);
        insert(heap, 17);
        insert(heap, 30);
        insert(heap, 40);
        insert(heap, 16);

        System.out.print("Heap before deletion: ");
        print(heap);

        int removed = deleteMin(heap);

        System.out.println("Removed element: " + removed);
        System.out.print("Heap after deletion: ");
        print(heap);
    }
}
