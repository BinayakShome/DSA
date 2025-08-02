package Graph.Part2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder1 {
    static int ladder(String start, String end, String[] list)
    {
        Queue<Duo> q = new LinkedList<>();
        q.add(new Duo(start, 1));

        Set<String> set = new HashSet<>();
        for(int i = 0; i < list.length; i++)
        {
            set.add(list[i]);
        }
        set.remove(start);
        while(!q.isEmpty())
        {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if(word.equals(end) == true) return steps;

            for(int i =0; i < word.length(); i++)
            {
                for(char ch = 'a'; ch <= 'z'; ch++)
                {
                    char replacedCharArray[] = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if(set.contains(replacedWord) == true)
                    {
                        set.remove(replacedWord);
                        q.add(new Duo(replacedWord, steps + 1));
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String []args)
    {
        String startWord = "der";
        String endWord = "dfs";
        String[] wordList = {"des", "der", "dfr", "dgt", "dfs"};
        System.out.println(ladder(startWord,endWord,wordList));
    }
}

class Duo {
    String first;
    int second;
    Duo(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}