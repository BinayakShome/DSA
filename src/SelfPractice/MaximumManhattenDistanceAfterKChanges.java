package SelfPractice;

public class MaximumManhattenDistanceAfterKChanges {
    static int maxDistance(String s, int k)
    {
        int ans = 0;
        int north = 0, east = 0, west = 0, south = 0;

        for(int i =0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == 'N')north++;
            else if (c == 'S')south++;
            else if (c == 'E')east++;
            else if (c == 'W')west++;

            int x = Math.abs(north - south);
            int y = Math.abs(east - west);

            int md = x+y;
            int dis = md + Math.min(2 * k, i + 1 - md);
            ans = Math.max(dis, ans);
        }
        return ans;
    }
    public static void main(String []args)
    {
        String str = "NWSE";
        int k = 1;

        System.out.println(maxDistance(str,k));
    }
}
