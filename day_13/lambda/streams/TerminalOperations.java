package day_13.lambda.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 1, 0, 9);

//        beforeStream(list);
//        Predicate<Integer> predicate = i -> i % 2 == 0;
//        Function<Integer, Integer> function = i -> i * i;
//        Comparator<Integer> comparator = (o1, o2) -> o2.compareTo(o1);

        List<Integer> evenList = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());

//        System.out.println(evenList);


//        doForEach(evenList);
//        doMinMax(list);
//        doCount(list);
//        doFindFirstAny(list);
//        doMatches();

//        doReduce1();
//        doReduce2();
        doReduce3();
    }

    private static void doReduce1() {
        String name = Stream.of("s", "e", "a", "n")
//                .filter(s -> s.length() > 2)
                .reduce("nothing", (a, b) -> a + b);
        System.out.println(name);

        int product = Stream.of(1, 2, 3, 4)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }

    private static void doReduce2() {
        Optional<String> optional = Stream.of("s", "e", "a", "n")
                .filter(s -> s.length() > 2)
                .reduce((a, b) -> a + b);

        System.out.println(optional.get());
    }

    private static void doReduce3() {
        int length = Stream.of("s", "e", "a", "n")
                .reduce(
                        0,
                        (n, str) -> n + str.length(),
                        (n1, n2) -> n1 + n2
                );
        System.out.println(length);
    }

    private static void doMatches() {
        List<String> list = Arrays.asList("john", "peter", "zack");
        System.out.println(list.stream().anyMatch(i -> i.startsWith("j")));
        System.out.println(list.stream().allMatch(i -> i.startsWith("j")));
        System.out.println(list.stream().noneMatch(i -> i.startsWith("j")));
    }

    private static void doFindFirstAny(List<Integer> list) {
        int i = list.stream().findFirst().get();
        System.out.println(i);

        int j = list.stream().findAny().get();
        System.out.println(j);
    }

    private static void doForEach(List<Integer> evenList) {
        evenList.stream().forEach(i -> System.out.println(i));
    }

    private static void doMinMax(List<Integer> list) {
        int min = list.stream().max((o1, o2) -> o2.compareTo(o1)).get();
        System.out.println(min);
    }

    private static void doCount(List<Integer> list) {
        long count = list.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);
    }

    private static void beforeStream(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> sqList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        for (int i : evenList) {
            sqList.add(i * i);
        }
        System.out.println(sqList);
    }
}
