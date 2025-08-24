package BinarySearch.Part3;

public class MedianOfRowSortedMatrix {
    static int median(int [][] mat)
    {
        int row = mat.length;
        int col = mat[0].length;

        int start = 0;
        int rowMid = (start + row) / 2;
        int colMid = (start + col) / 2;
        return mat[rowMid][colMid];
    }
    public static void main(String []args)
    {
        int [][] mat = {{1, 2, 3, 4, 5},
                        {8, 9, 11, 12, 13},
                        {21, 23, 25, 27, 29}};
        System.out.println(median(mat));
    }
}
