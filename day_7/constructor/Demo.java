package day_7.constructor;

public class Demo {

    // constructor
    public static void main(String[] args) {
        Student student = new Student();


        student.name = "john";
        student.age = 19;

        System.out.println(student.print());

        Student student1 = new Student("peter", 20);
        System.out.println(student1.print());
    }
}
