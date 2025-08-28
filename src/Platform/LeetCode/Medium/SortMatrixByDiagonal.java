package Platform.LeetCode.Medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortMatrixByDiagonal {
    static int[][] sort(int[][] matrix)
    {
        Map<Integer, PriorityQueue<Integer>> diagonalMap = new HashMap<>();
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, key < 0 ? new PriorityQueue<>()
                        : new PriorityQueue<>(Collections.reverseOrder()));
                diagonalMap.get(key).offer(matrix[i][j]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                matrix[i][j] = diagonalMap.get(key).poll();
            }
        }

        return matrix;
    }
    public static void main(String[] args)
    {
        int[][] grid = {{1,7,3},{9,8,2},{4,5,6}};
        int [][] ans = sort(grid);

        for(int i = 0; i < ans.length; i++)
        {
            for(int j = 0; j < ans[0].length; j++)
            {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
