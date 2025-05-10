package LinkedList.Extra;

import java.util.LinkedList;

public class SecondMethod {
    public static void main(String []args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        System.out.print(list);

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i)==3)
            {
                System.out.print("Found at "+i);
            }
        }
    }
}
