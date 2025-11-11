package day_16.multithreading;

public class Demo_7 {
    // race condition
    public static void main(String[] args) {
        Display display = new Display();
        Display display1 = new Display();

        _MyThread thread1 = new _MyThread(display, "john");
        _MyThread thread2 = new _MyThread(display1, "peter");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}

class Display {
    public void print(String name) {
        // check balance
        // debit logic

        synchronized (Display.class) {
            System.out.println("debit");
            System.out.println("debit");
            System.out.println("debit");
            System.out.println("debit");
            System.out.println("debit");
            System.out.println("debit");
        }
    }

//    public static synchronized void print(String name) {
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Hello ");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(name);
//        }
//    }
}

class _MyThread implements Runnable {
    Display display;
    String name;

    public _MyThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.print(name);
    }
}
