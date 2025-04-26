package Arrays.Part1;

public class IsSorted {
    static boolean isSorted(int arr[], int n)
    {
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
        int n1 = arr1.length, n2 = arr2.length;
        System.out.println(isSorted(arr1,n1));
        System.out.println(isSorted(arr2, n2));
    }
}
