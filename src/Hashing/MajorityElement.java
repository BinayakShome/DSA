package Hashing;

import java.util.HashMap;

//Q. Given an array of size n, fid all the elements that appear more than [n/3]times.
public class MajorityElement {
    static void majorityElement(int arr[])
    {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }
        for(int key: map.keySet())
        {
            if(map.get(key) > n/3)
            {
                System.out.print(key+"  ");
            }
        }
    }
    public static void main(String[] args)
    {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        int num2[] = {1,2};
        //majorityElement(nums);
        majorityElement(num2);
    }
}