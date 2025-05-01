package Basic.Extra;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.print("Enter col: ");
        int col = sc.nextInt();

        int[][] mat = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}