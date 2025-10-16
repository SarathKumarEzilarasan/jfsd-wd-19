package day_1;

public class Day_1 {

    // main method or main function
    public static void main(String[] args) {
        // variables -> x = 100 , y = 200 , x+y = 300

        // data types -> primitive , non primitive -> String

        // byte    -> whole number -> 1 byte  -> -128 to 127
        // short   -> whole number -> 2 bytes -> -32k to 32k
        // integer -> whole number -> 4 bytes -> -2*10(9) to 2*10(9)
        // long    -> whole number -> 8 bytes -> -2*10(63) to 2*10(63)
        // float   -> decimal number -> 4 bytes -> 6 decimal digits
        // double  -> decimal number -> 8 bytes -> 16 decimal digits
        // boolean -> true/false
        // char
        // String

        // byte -> short -> int -> long -> float -> double [implicit type casting]

        // long -> int [explicit type casting]

        int x = 100;

        long l = 1443000000000l;

        float f = l;

        System.out.println(f);

    }
}

// heap , stack