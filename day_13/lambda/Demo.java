package day_13.lambda;

import day_11.comparator.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    // Lambda expressions
    public static void main(String[] args) {
//        Interf i = new B();
//        i.add(100, 200);


//        Interf j = (a, b) -> a + b;
//        System.out.println(j.add(100, 200));

        Student student1 = new Student("john", 20, "IT");
        Student student2 = new Student("peter", 19, "IT");
        Student student3 = new Student("zack", 22, "IT");


        List<Student> students = Arrays.asList(student1, student2, student3);

        System.out.println(students);
        Collections.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(students);


    }
}

@FunctionalInterface
interface Interf {
    int add(int a, int b);
//    int sub();
}


//class B implements Interf {
//
//    @Override
//    public int add(int a, int b) {
//        return a + b;
//    }
//}


class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}