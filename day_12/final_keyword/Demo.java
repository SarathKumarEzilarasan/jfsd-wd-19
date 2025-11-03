package day_12.final_keyword;

public class Demo {
    public static void main(String[] args) {
        final double pi = 3.14;

//        pi = 200.10;
    }
}

final class Parent {
    final public void add() {
        System.out.println("from parent");
    }
}

//class Child extends Parent {
////    public void add() {
////        System.out.println("from child");
////    }
//
//}