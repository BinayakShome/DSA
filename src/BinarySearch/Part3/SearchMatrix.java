package BinarySearch.Part3;

public class SearchMatrix {
    static boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m -1;

        while(row < n && col >= 0)
        {
            int current = matrix[row][col];

            if(current==target)
            {
                return true;
            } else if (current > target) {
                col--;  //move left
            }
            else
            {
                row++; //move down
            }
        }
        return false;
    }

    public static void main(String []args)
    {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        System.out.println(searchMatrix(matrix,4));
        String str = "Coding on CodeChef";
        System.out.println(str.length());
    }
}
