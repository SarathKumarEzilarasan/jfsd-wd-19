package day_11.comparator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("john", 20, "IT");
        Student student2 = new Student("peter", 19, "IT");
        Student student3 = new Student("zack", 22, "IT");


//        NameComparator nameComparator = new NameComparator();
//        System.out.println(nameComparator.compare(student1,student2));
//
//        AgeComparator ageComparator = new AgeComparator();
//        System.out.println(ageComparator.compare(student1,student2));


        List<Integer> list = Arrays.asList(20, 1, -1, 0);

//        System.out.println(list);
        Collections.sort(list);
//        System.out.println(list);

        List<Student> students = Arrays.asList(student1, student2, student3);

        System.out.println(students);
        Collections.sort(students, new AgeComparator());
        System.out.println(students);
    }
}

// TreeSet<Integer> ---> descending ....