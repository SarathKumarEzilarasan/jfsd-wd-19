package day_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass {
    public static void main(String[] args) {
        String text = "apple banana cherry 1234";
        String regex = "[^a-z]"; // [abc] [a-z]

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
