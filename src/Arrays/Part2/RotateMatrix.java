package Arrays.Part2;

import java.util.Arrays;

public class RotateMatrix {
    static void rotate(int [][]matrix)
    {
        int m = matrix.length;

        //step1 : transpose
        for (int i = 0; i < m ; i++)
        {
            for (int j = i + 1; j < m; j++)
            {
                // swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //step2: reverse the row
        for (int i = 0; i < m; i++) {
            int left = 0, right = m - 1;
            while (left < right) {
                // swap matrix[i][left] and matrix[i][right]
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    static void printMatrix(int [][]matrix)
    {
        for (int[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String []args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix: ");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated Matrix: ");
        printMatrix(matrix);
    }
}
