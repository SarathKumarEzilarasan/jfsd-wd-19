package day_16.multithreading;

public class Demo_1 {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("from main thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("from child thread");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}


class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("from child thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}