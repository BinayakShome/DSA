package SlidingWindows_TwoPointers.Extra;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractIntegerWords{
    static ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");  // matches one or more digits
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }

        public static void main(String[] args) {
            String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
            ArrayList<String> res = extractIntegerWords(s);
            for (String num : res) {
                System.out.print(num + " ");
            }
            // Output: 1 2 3 56
        }
    
}
