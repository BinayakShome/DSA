package Arrays.Part2;

import java.util.Arrays;

public class SetZeroMatrix
{

    static void setZero(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        //check first row
        for (int i = 0; i <n; i++)
        {
            if (matrix[0][i] == 0)
            {
                firstRowZero = true;
                break;
            }
        }

        //check first column
        for (int i = 0; i <m; i++)
        {
            if (matrix[i][0] == 0)
            {
                firstColZero = true;
                break;
            }
        }

        //use first row and column as markers
        for (int i = 1; i < m; i++)
        {
            for (int j = 1; j < n; j++)
            {
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set matrix elements to zero based on markers
        for (int i = 1; i < m; i++)
        {
            for (int j = 1; j <n; j++)
            {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row to zero if needed
        if (firstRowZero)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[0][j] = 0;
            }
        }

        // Set first column to zero if needed
        if (firstColZero)
        {
            for (int i = 0; i < m; i++)
            {
                matrix[i][0] = 0;
            }
        }
    }

    static void printMatrix(int [][]mat)
    {
        for (int[] row: mat)
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String []args)
    {
        int[][] matrix = {
                {0, 1, 1},
                {1, 1, 1},
                {1, 1, 0}
        };

        System.out.println("Original matrix");
        printMatrix(matrix);

        setZero(matrix);

        System.out.println("After: ");
        printMatrix(matrix);
    }
}