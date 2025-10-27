package day_7.oops.polymorphism.overriding;

public class Demo {
    public static void main(String[] args) {
//        Tata tata = new Tata();
//        tata.breaks();

//        Bmw bmw = new Bmw();
//        bmw.breaks();

        // tight coupling
//        Tata tata;
//        Bmw bmw;
        int price = 10000000;
//
//        if (price > 200000) {
//            bmw = new Bmw();
//            bmw.breaks();
//        } else {
//            tata = new Tata();
//            tata.breaks();
//        }


        // loose coupling
//        Car car;
//
//        if (price > 200000) {
//            car = new Bmw();
//        }else {
//            car = new Tata();
//        }
//
//
//        car.breaks();


        Bmw bmw = new Bmw();
        bmw.sunRoof();

        Car car = new Bmw();
//        car.sunRoof();

    }
}
