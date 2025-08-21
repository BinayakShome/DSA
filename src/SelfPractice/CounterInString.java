package SelfPractice;

public class CounterInString {
    static int number(String first, String second)
    {
        int count = 0;
        first = first.toLowerCase();
        second = second.toLowerCase();

        int index = first.indexOf(second);

        while(index != -1)
        {
            count++;
            index = first.indexOf(second, index+second.length());
        }
        return count;
    }
    public static void main(String []args)
    {
        String first = "TimIsPlayingInsideTimHouseWithTimToys";
        String second = "Tim";
        System.out.println(number(first, second));
    }
}
