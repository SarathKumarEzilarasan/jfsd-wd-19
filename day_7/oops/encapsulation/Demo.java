package day_7.oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
//        System.out.println(user.password);
        System.out.println(user.getPassword());
        user.setPassword("user@123");
        System.out.println(user.getPassword());
    }
}
