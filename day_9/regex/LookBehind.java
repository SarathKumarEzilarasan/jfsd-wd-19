package day_9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookBehind {
    public static void main(String[] args) {
        String text = "$100 #300";
        String regex = "(?<!\\$)\\d+"; // (?<=\$)\d+

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
