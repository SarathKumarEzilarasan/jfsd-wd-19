package day_9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        String text = "appppp a app";
        String regex = "ap+";
        //  {n} {n,} {n,m}
        // ? -> 0 or 1 time {0,1}
        // * -> 0 or more times {0,}
        // + -> 1 or more times {1,}

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
