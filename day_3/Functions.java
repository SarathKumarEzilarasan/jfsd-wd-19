package day_3;

public class Functions {

    // main method or main function
    public static void main(String[] args) {
//        add(100, 200); // function call
        // x+y-z
        int sum = add(100, 200);
        System.out.println(sum - 300);
    }

    // custom function or user defined function
    public static int add(int a, int b) { // function parameters or function arguments
        int x = a;
        int y = b;

        return x + y;
    }
}
