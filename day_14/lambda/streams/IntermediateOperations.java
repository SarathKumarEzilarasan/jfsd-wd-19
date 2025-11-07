package day_14.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 1, 0, 9, 20);

        list.stream()
//                .peek(i -> System.out.println(i))
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .sorted((o1, o2) -> o2.compareTo(o1))
//                .limit(1)
                .distinct()
                .collect(Collectors.toList())
                .forEach(i -> System.out.println(i));


    }
}
