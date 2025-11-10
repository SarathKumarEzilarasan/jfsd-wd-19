package day_15;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        printLength("hello");
//        printLength("");
//        printLength(null);

        printLengthOptional(Optional.of("null"));
        printLengthOptional(Optional.empty());

    }

    public static void printLength(String str) {
        if (str != null) {
            System.out.println(str.length());
        }
    }

    public static void printLengthOptional(Optional<String> optional) {
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }
        System.out.println(optional.orElse("default"));
    }
}
