package day_3;

public class Demo {

    static int x = 200;
    int y = 300;


    static {
        System.out.println("hello");
    }

    public static void main(String[] args) {
//        int x = 100;
//        int y = 200;
//
//        String s = "hello";
//
//        Functions f = new Functions(); // object or instance variable
//
//        System.out.println(f.add(100, 200));

        System.out.println(x);

        Demo demo = new Demo();
        System.out.println(demo.y);

        demo.add();
    }


    public void add() {
        System.out.println(x);
        System.out.println(y);
    }
}

// static function -> you can access static variables/ functions
//                 -> to access non static variables/functions we need to create an object


// non static function -> we can access both static variables/ functions and non static variables/ functions