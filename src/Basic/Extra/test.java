package Basic.Extra;

public class test {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        //System.out.println(arr.length);
        int sum = 0;
        int cnt = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            //sum = sum+arr[i]; -- > 55
            //sum = arr[i]; --> 10
        }
        System.out.println(sum);
    }
}
