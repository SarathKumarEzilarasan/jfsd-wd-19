package day_14.lambda.streams;

import day_12.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExamples {
    public static void main(String[] args) {
//        doAvgInt();
//        doJoining();
//        doCollectToMap1();
//        doCollectToMap2();
//        doCollectToMap3();
//        doGroupingBy1();
//        doGroupingBy2();
//        doGroupingBy2();
//        doGroupingBy3();
//        doPartitioning1();


        final int x = 100;

        Predicate<String> predicate = s -> {
//            x++;
            return s.isEmpty();
        };


        System.out.println(predicate.test("john"));


    }


    public static void doPartitioning1() {
        Map<Boolean, List<String>> map = Stream.of("john", "peter", "zack", "john")
                .collect(Collectors.partitioningBy(s -> s.startsWith("ja")));
        System.out.println(map);
    }

    public static void doGroupingBy3() {
        Map<Integer, Set<String>> map = Stream.of("john", "peter", "zack", "john")
                .collect(Collectors.groupingBy(s -> s.length(), () -> new TreeMap<>(), Collectors.toSet()));
        System.out.println(map.getClass());
    }

    public static void doGroupingBy2() {
        Map<Integer, Set<String>> map = Stream.of("john", "peter", "zack", "john")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.toSet()));
        System.out.println(map.getClass());
    }

    public static void doGroupingBy1() {
        Map<Integer, List<String>> map = Stream.of("john", "peter", "zack")
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(map);
    }

    public static void doCollectToMap3() {
        Map<String, Integer> map = Stream.of("john", "peter", "zack", "john")
                .collect(
                        Collectors.toMap(
                                s -> s,
                                s -> s.length(),
                                (s1, s2) -> s1 + s2,
                                () -> new TreeMap<>()
                        )
                );
        System.out.println(map);
    }

    public static void doCollectToMap2() {
        Map<String, Integer> map = Stream.of("john", "peter", "zack", "john")
                .collect(
                        Collectors.toMap(
                                s -> s,
                                s -> s.length(),
                                (s1, s2) -> s1 + s2
                        )
                );
        System.out.println(map);
    }

    public static void doCollectToMap1() {
        Map<String, Integer> map = Stream.of("john", "peter", "zack")
                .collect(
                        Collectors.toMap(s -> s, s -> s.length())
                );
        System.out.println(map);
    }

    public static void doJoining() {
        String s = Stream.of("john", "peter", "zack")
                .collect(Collectors.joining(","));
        System.out.println(s);
    }

    public static void doAvgInt() {
        Double avg = Stream.of("john", "peter", "zack")
                .collect(Collectors.averagingInt(s -> s.length()));
        System.out.println(avg);
    }
}
