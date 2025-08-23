package Heap.Extra;

public class HeightOfHeap {
    static int height(int []arr, int n)
    {
        if (n == 0) return 0;
        int height = 0;
        int ptr = 0;
        int levelNodes = 1;

        while (ptr < n) {
            height++;
            ptr += levelNodes;
            levelNodes *= 2;
        }
        return height;
    }
    public static void main(String []args)
    {
        int []arr = {3, 6, 9, 2, 15, 10, 14, 5, 12};
        int n = arr.length;
        System.out.println(height(arr, n));
    }
}
