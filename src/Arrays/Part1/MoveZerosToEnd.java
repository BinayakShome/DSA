package Arrays.Part1;

import java.util.Arrays;

public class MoveZerosToEnd {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] moveZerosToEnd(int arr[], int n) {
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return arr;
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 0, 1};
        int n = arr.length;

        moveZerosToEnd(arr, n);

        System.out.println(Arrays.toString(arr));
    }
}