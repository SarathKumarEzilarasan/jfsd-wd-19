package day_9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookAhead {
    public static void main(String[] args) {
        String text = "12px 14em 18px 20pt";
        String regex = "\\d+(?!px)"; // \d+(?=px)

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
