package day_7.constructor;

public class Student {
    public String name;
    public int age;

    // default constructor or no argument constructor
    public Student() {
        System.out.println("hi from constructor");
    }

    // parametrised constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String print() {
        return "My name is " + name + " and age is " + age;
    }
}
