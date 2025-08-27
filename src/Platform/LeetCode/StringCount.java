package Platform.LeetCode;

public class StringCount {
    static int possibleStringCount(String word)
    {
        int count = 1;
        char arr[] = word.toCharArray();

        for(int i = 0; i < word.length()-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String []args)
    {
        String str = "ere";
        String word = "happy";
        System.out.println(possibleStringCount(word));
    }
}