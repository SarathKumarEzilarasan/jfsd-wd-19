package day_9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String email = "test.user@gmail.com";
        String regex = "^[\\w.-]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}

// 1111 2222 3333 4444