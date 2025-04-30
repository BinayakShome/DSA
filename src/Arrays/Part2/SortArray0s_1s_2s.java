package Arrays.Part2;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray0s_1s_2s {
    static void sortArray(ArrayList<Integer> array)
    {

    }

    public static void main(String[] args)
    {
        int arr[] = {0, 2, 1, 2, 0, 1};
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(boxedArray));
        sortArray(array);

        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
