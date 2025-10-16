package day_2;

public class ConditionalStatements {
    // camel case

    public static void main(String[] args) {
        // conditional statements -> if , if else , if else-if , switch case , nested if

//        int age = 18;
//        int amount = 100;
//
//        if (age >= 18 | amount >= 200 & 1==1) {
//            System.out.println("you are allowed");
//        } else {
//            System.out.println("you are not allowed");
//        }

//        int age = 18;
//
//        if (age >= 18 || 1 / 0 == 0) {
//            System.out.println("hi");
//        }

//        int age = 18;
//        int amount = 100;
//
//        if (age >= 18 && amount >= 200) {
//            System.out.println("you are allowed");
//        } else if (amount < 200) {
//            System.out.println("insufficient amount");
//        } else {
//            System.out.println("you are underage");
//        }


//        int day = 3;
//
//        if (day == 1) {
//            System.out.println("sun");
//        } else if (day == 2) {
//            System.out.println("mon");
//        } else if (day == 3) {
//            System.out.println("tue");
//        } else if (day == 4) {
//            System.out.println("wed");
//        } else if (day == 5) {
//            System.out.println("thurs");
//        } else if (day == 6) {
//            System.out.println("fri");
//        } else if (day == 7) {
//            System.out.println("sat");
//        } else {
//            System.out.println("invalid option");
//        }

//        int day = 3;
//
//        switch (day) {
//            case 1:
//                System.out.println("sun");
//                break;
//            case 2:
//                System.out.println("mon");
//                break;
//            case 3:
//                System.out.println("tue");
//                break;
//            case 4:
//                System.out.println("wed");
//                break;
//            case 5:
//                System.out.println("thurs");
//                break;
//            case 6:
//                System.out.println("fri");
//                break;
//            case 7:
//                System.out.println("sat");
//                break;
//            default:
//                System.out.println("invalid option");
//        }

//        int age = 18;
//        int amount = 100;
//        if (age >=18){
//            if (amount >= 200){
//                System.out.println();
//            }else {
//                if (){
//
//                }
//            }
//        }


        int x = 200;
        int y = 200;
        int z = 200;

        if (x > y && x > z) {
            System.out.println("x is the largest number");
        } else if (y > z & y > x) {
            System.out.println("y is the largest number");
        } else if (z > x & z > y) {
            System.out.println("z is the largest number");
        }

    }
}

// x , y and z are equal
// x and y are equal
// x and z are equal