package day_8.object;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("john");
        Student student2 = new Student("john");

        System.out.println(student1.equals(student2));


        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
