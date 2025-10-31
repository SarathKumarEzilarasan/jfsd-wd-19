package day_11.comparable;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String department;


    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Student student) {
        return this.age - student.getAge();
    }
}
