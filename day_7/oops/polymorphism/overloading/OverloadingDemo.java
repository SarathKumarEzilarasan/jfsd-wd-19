package day_7.oops.polymorphism.overloading;

public class OverloadingDemo {
    public static void main(String[] args) {
        add(100, 200);
        add(100, 200, 300);
        add(100, 200, 300l);
    }


    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, int b, long c) {
        System.out.println(a + b + c);
    }

}

// function name + no.of arguments + data type of the arguments