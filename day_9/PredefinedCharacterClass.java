package day_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClass {
    public static void main(String[] args) {
        String text = "John 1234@";
        String regex = "\\S";
        // \d -> digits
        // \D -> non digits
        // \w -> alphabets + numbers [word character]
        // \W -> non word character
        // \s -> whitespace character
        // \S -> non whitespace character


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }


    }
}
