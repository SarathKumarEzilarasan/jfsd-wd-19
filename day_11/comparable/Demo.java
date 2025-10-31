package day_11.comparable;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("john", 20, "IT");
        Student student2 = new Student("peter", 19, "IT");

        System.out.println(student1.compareTo(student2));

    }
}
