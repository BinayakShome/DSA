package BinarySearch.Part3;

public class PeakElementInMatrix {
    static int[] findPeakGrid(int[][] mat) {
        int[] ans = new int[2];
        int l = 0;
        int r = mat[0].length - 1;
        int n = mat[0].length;

        while (l <= r) {
            int mid = (l + r) / 2;
            int row = findMax(mat, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < n ? mat[row][mid + 1] : -1;

            if (mat[row][mid] > left && mat[row][mid] > right) {
                ans[0] = row;
                ans[1] = mid;
                break;
            } else if (mat[row][mid] < left && mat[row][mid] > right) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    static int findMax(int[][] mat, int mid) {
        int row = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            if (max < mat[i][mid]) {
                max = mat[i][mid];
                row = i;
            }
        }
        return row;
    }
    public static void main(String []args)
    {
        int [][]mat = {{1,4},{3,2}};

        int []ans = findPeakGrid(mat);

        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i]+"  ");
        }
    }
}
