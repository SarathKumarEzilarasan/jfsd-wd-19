package day_11.generics;

public class GenericsDemo {
    public static void main(String[] args) {
//        Gen<Integer> gen = new Gen<>(100);
//        Gen<String> gen1 = new Gen<>("100");


        Gen gen = new Gen();
        gen.add(100);
        gen.add("100");
    }
}
