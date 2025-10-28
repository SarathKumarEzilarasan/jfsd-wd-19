package day_8.object;

import java.util.Objects;

public class Student {
    public String name;

//    public Student(String name) {
//        this.name = name;
//    }
//
//    public String toString() {
//        return "Student name is : " + name;
//    }
//
//    public boolean equals(Object obj) {
//        Student student2 = (Student) obj;
//        return name.equals(student2.name);
//    }
//
//    public int hashCode() {
//        return name.length() * 10;
//    }


    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
