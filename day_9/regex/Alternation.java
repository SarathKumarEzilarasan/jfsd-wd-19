package day_9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alternation {
    public static void main(String[] args) {
        String text = "John Doe, Jane Doe";
        String regex = "John|Jane";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
