package day_8.access_modifiers.test;

import day_8.access_modifiers.demo.Student;

public class Test1 extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
    }
}
