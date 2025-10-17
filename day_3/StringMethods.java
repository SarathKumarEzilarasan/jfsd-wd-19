package day_3;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "hello world"; // 1 GB String Intern Pool
        String s2 = "hello world"; // 1 GB ????
        String s3 = new String("hello world");


//        System.out.println(s1 == s3);

//        System.out.println(s1.equals(s3));

        System.out.println(s1.replace("l", "z"));

        s1 = "hello earth";

        System.out.println(s1);


    }
}

// strings are immutable