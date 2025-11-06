package day_13._interface;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.sub();


        I.mul();
    }
}


interface I {
    void add();

    default void sub() {
        System.out.println("hello");
    }

    static void mul() {
        System.out.println("");
    }
}

interface J {
    default void sub() {

    }
}

class A implements I {

    @Override
    public void add() {
        System.out.println();
    }

    public void sub() {
        System.out.println("hii");
    }
}

class B implements I, J {

    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }
}