package day_15.sealed_demo;

public class Demo {

    public static void main(String[] args) {
        print("mon");
        print("monday");

        printE(DAYS.MON);
    }
    
    public static void print(String s) {
        if (s.equals("mon")) {
            System.out.println();
        }
    }

    public static void printE(DAYS days) {
        if (DAYS.MON.equals(days)) {
            System.out.println();
        }
    }
}

enum DAYS {
    MON,
    TUE,
    WED,
    THURS,
    FRI,
    SAT,
    SUN
}
