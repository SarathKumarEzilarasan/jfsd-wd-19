package day_14.method_ref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTypes {
    public static void main(String[] args) {
//        boundMethodRef();
//        unboundMethodRef();
        constructorMethodRef();
    }

    public static void constructorMethodRef() {
        String str = "HELLO WORLD";
        Supplier<StringBuilder> supplierL = () -> new StringBuilder();
        Supplier<StringBuilder> supplierMR = StringBuilder::new;

//        System.out.println(supplierL.get().append(str));
        System.out.println(supplierMR.get().append(str));
    }

    public static void unboundMethodRef() {
        String str = "HELLO WORLD";
        Function<String, String> lowerL = s -> s.toLowerCase();
        Function<String, String> lowerMR = String::toLowerCase;

        System.out.println(lowerL.apply(str));
        System.out.println(lowerMR.apply(str));
    }


    public static void boundMethodRef() {
        String s = "HELLO WORLD";
        Supplier<String> lowerL = () -> s.toLowerCase();
        Supplier<String> lowerMR = s::toLowerCase;

        System.out.println(lowerL.get());
        System.out.println(lowerMR.get());
    }

}
