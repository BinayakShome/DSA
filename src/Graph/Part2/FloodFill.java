package Graph.Part2;

public class FloodFill {
    static void dfs(int row, int col,
                    int[][] ans,
                    int[][] image,
                    int newColor, int[] delRow, int[] delCol,
                    int iniColor)
    {
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for(int i = 0; i < 4; i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    image[nrow][ncol] == iniColor && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, ans, image, newColor, delRow, delCol, iniColor);
            }
        }
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int iniColor = image[sr][sc];
        int[][] ans = new int[image.length][image[0].length];

        // Copy original image to ans
        for(int i = 0; i < image.length; i++)
            for(int j = 0; j < image[0].length; j++)
                ans[i][j] = image[i][j];

        int[] delRow = {-1, 0, +1, 0};
        int[] delCol = {0, +1, 0, -1};

        dfs(sr, sc, ans, image, newColor, delRow, delCol, iniColor);
        return ans;
    }

    public static void main(String[] args)
    {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1, sc = 1, newColor = 2;

        int[][] ans = floodFill(image, sr, sc, newColor);
        for(int[] row : ans) {
            for(int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}