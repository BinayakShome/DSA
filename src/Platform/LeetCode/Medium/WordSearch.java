package Platform.LeetCode.Medium;

public class WordSearch {
    static boolean exist(char [][]board, String word) {
        int row = board.length, col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(char [][]board, String word, int index, int i, int j) {
        // word fully matched
        if (index == word.length()) return true;

        // out of bounds or mismatch
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] != word.charAt(index)) {
            return false;
        }

        // mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // explore 4 directions
        boolean found = dfs(board, word, index + 1, i + 1, j) ||
                dfs(board, word, index + 1, i - 1, j) ||
                dfs(board, word, index + 1, i, j + 1) ||
                dfs(board, word, index + 1, i, j - 1);

        // backtrack
        board[i][j] = temp;

        return found;
    }

    public static void main(String []args)
    {
        char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
