package day_9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anchor {
    public static void main(String[] args) {
        String text = "appppp a ap";
        String regex = "ap$";
        // ^ -> beginning of the line
        // $ -> end of the line

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
