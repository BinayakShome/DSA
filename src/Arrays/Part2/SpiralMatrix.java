package Arrays.Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int [][]matrix)
    {
        List<Integer> ls = new ArrayList<>();

        int n = matrix.length; // row
        int m = matrix[0].length; //column

        int top = 0, left = 0, bottom = n -1, right = m-1; // pointers

        while (top <= bottom && left <= right)
        {
            //for moving left to right
            for (int i = left; i <= right; i++)
            {
                ls.add(matrix[top][i]);
            }
            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
            {
                ls.add(matrix[i][right]);
            }
            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ls.add(matrix[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ls.add(matrix[i][left]);

                left++;
            }
        }
        return ls;
    }
    static void printf(int [][]matrix)
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

        System.out.println("Original Matrix:");
        printf(matrix);

        System.out.println("Spiral Order:");
        List<Integer> ans = spiralOrder(matrix);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
