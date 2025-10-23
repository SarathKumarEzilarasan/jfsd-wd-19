package day_5;

public class ArrayDemo {
    public static void main(String[] args) {
        // data structure -> create add read update delete search
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 100;
        arr[2] = 200;
        arr[3] = 100;
        arr[4] = 300;
//        System.out.println(arr[0]);
        int x = 300;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                System.out.println("found x");
//            }
//        }

//        System.out.println(arr[10]);
        int[] arr1 = {100, 100, 50, 300, 400, 390};
        // max =  0   100  200  200 300  400  400
        // smax = 0    0   100  100 200  300  390

        String[] strings = {"hello", "world", "java"};

//        findMax(arr1);
//        findMin(arr1);
//        findSecondMax(arr1);
//        findSecondMin(arr1);
    }

    public static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value is: " + max);
    }

    public static void findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min value is: " + min);
    }

    public static void findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("Max value is: " + max);
        System.out.println("Second Max value is: " + secondMax);
    }
}
