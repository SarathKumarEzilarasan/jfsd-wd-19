package day_15.record_demo;

public class Demo {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("john", "23");
//        Employee employee2 = new Employee("john", "23");
//
//
//        System.out.println(employee1.getName());
//        System.out.println(employee1.equals(employee2));
//        System.out.println(employee1.hashCode());
//        System.out.println(employee2.hashCode());


        _Employee employee3 = new _Employee("peter", "25");
        _Employee employee4 = new _Employee("peter", "25");

        System.out.println(employee3.age());

        System.out.println(employee3.equals(employee4));

        System.out.println(employee3.hashCode());
        System.out.println(employee4.hashCode());


        System.out.println(employee3);

    }
}
