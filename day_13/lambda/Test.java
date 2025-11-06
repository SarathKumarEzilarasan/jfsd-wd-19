package day_13.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Test {

    public static void main(String[] args) {
//        Predicate -> to test your input
//        Function -> to transform your input
//        consumer -> accept the input
//        supplier -> gives an output

        List<Integer> list = Arrays.asList(10, 4, 1, 3, 20);
//        predicateExample(list);
//        functionExample(list);
//        consumerExample();
//        supplierExample();
//        biPredicateExample();

//        IntPredicate


    }

    private static void biPredicateExample() {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(100, 200));
    }

    private static void supplierExample() {
        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());
    }

    private static void consumerExample() {
        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer.accept(100);
    }

    private static void functionExample(List<Integer> list) {
        Function<Integer, Integer> function = i -> i * i;

        for (int a : list) {
            System.out.println(function.apply(a));
        }
    }

    private static void predicateExample(List<Integer> list) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        Predicate<Integer> predicate1 = i -> i > 4;

        for (int a : list) {
            if (predicate.and(predicate1).test(a)) {
                System.out.println(a);
            }
        }
    }
}
