package day_8.access_modifiers.demo;

public class Student {
    public static String name;
    int age;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
    }
}
