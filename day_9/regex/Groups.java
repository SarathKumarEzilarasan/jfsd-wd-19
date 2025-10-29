package day_9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) {
        String text = "John Doe, Jane Doe";
        String regex = "(\\w+) (\\w+)";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Full Name : " + matcher.group(0));
            System.out.println("First Name : " + matcher.group(1));
            System.out.println("Last Name : " + matcher.group(2));
        }
    }
}
