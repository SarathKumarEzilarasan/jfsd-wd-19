package day_7.oops.abstraction.abstract_class;

public abstract class Car {

    public String parent = "parent";

    public void tyres() {
        System.out.println("tyres");
    }

    public abstract void breaks();
}
