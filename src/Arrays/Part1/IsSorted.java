package Arrays.Part1;

public class IsSorted {
    static boolean isSorted(int arr[])
    {
        int n = arr.length;
       for (int i = 1; i<n; i++)
       {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
       }
       return true;
    }

    public static void main(String[] args)
    {
        int arr1[] = {3,4,5,1,2};
        int arr2[] = {2,5,676,21,23,56,76,23,456,76};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
    }
}
