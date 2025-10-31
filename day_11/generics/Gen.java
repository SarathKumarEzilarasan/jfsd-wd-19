package day_11.generics;

public class Gen {
//    public T obj;
//    public Gen(T obj) {
//        this.obj = obj;
//    }

//    public Integer obj1;
//    public Gen(Integer obj1) {
//        this.obj1 = obj1;
//    }
//
//    public Long obj2;
//    public Gen(Long obj1) {
//        this.obj2 = obj1;
//    }

    public <T> void add(T obj) {
        System.out.println(obj);
    }
}

// bounded type