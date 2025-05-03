package Hashing;

public class CountFrequencyElement {
    public static void main(String[] args)
    {
        int arr[] = {10,5,10,15,10,5};
        countFrequency(arr);
    }

    static void countFrequency(int arr[])
    {
        int n = arr.length;
        boolean visited[] = new boolean[n];
        for(int i = 0; i<n; i++)
        {
            if(visited[i]==true)
                continue;

            //count frequency
            int count = 1;
            for(int j = i+1; j<n; j++)
            {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}