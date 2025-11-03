package day_12.exception_handling;

public class Demo {
    public static void main(String[] args) throws Exception {

//        try {
//            System.out.println(1 / 0);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//
//        }

        try {
            ageValidation(17);
        } catch (AgeException e) {

        }


    }

    public static void ageValidation(int age) throws Exception {
        if (age >= 18) {
            System.out.println("you are allowed");
        } else {
            throw new AgeException("you are not allowed");
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
