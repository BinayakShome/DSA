package Platform.LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    static boolean valid(char [][]board)
    {
        Set<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                char num = board[i][j];

                if(num == '.') continue;
                if(!set.add(num + " in row " + i)) return false;
                if(!set.add(num + " in col " + j)) return false;
                if(!set.add(num + " in box " + (i/3) + "-" + (j/3))) return false;
            }
        }
        return true;
    }
    public static void main(String []args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.print(valid(board));
    }
}
