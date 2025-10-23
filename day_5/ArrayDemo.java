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

//        int[][] arr2 = new int[5][4];
//
////        System.out.println(arr2[0][0]);
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[0].length; j++) {
//                System.out.print(arr2[i][j]);
//            }
//            System.out.println();
//        }

        int[][] a1 = {
                {-1, 4},
                {2, 3}
        };
        int[][] a2 = {
                {9, -3},
                {6, 1}
        };
        matrixMul(a1, a2);

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

    public static void matrixMul(int[][] arr1, int[][] arr2) {
        int len = arr1.length;
        int[][] result = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
                    // result[0][1] =    0 +          arr1[0][0] * arr2[0][1]
                    //              =    10 +         arr1[0][1] * arr2[1][1]
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
