package day_14.method_ref;

public class Demo {
    Demo() {

    }

    Demo(int a, int b) {
        System.out.println("from constructor");
    }

    public void m1(int i, int j) {
        System.out.println(i + " " + j);
    }

    public static void m2(int i, int j) {
        System.out.println(i + " " + j);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

//        I i = (a, b) -> System.out.println(a + " " + b);
//        I i = demo::m1;
//        i.add(100, 200);

//        I j = Demo::m2;

        I z = Demo::new;
        z.add(100, 200);

    }
}


interface I {
    void add(int a, int b);
}

// constructor , static , instance