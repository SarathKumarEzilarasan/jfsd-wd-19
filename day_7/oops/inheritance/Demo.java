package day_7.oops.inheritance;

public class Demo {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.breaks();
        System.out.println(bmw.parent);


        Tata tata = new Tata();
        tata.breaks();
    }
}
