package day_3;

public class LocalGlobalVariable {

    static int x = 400; // global variable or class variable

    public static void main(String[] args) {
        int x = 100; // local variable
        System.out.println(x);
    }

    public static void add() {
        int x = 200;

    }
}
