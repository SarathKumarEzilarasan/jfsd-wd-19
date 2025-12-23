package demo;

public class Searching {
    // Data Structures and Algorithms
    public static void main(String[] args) {
        // Factorial -> 5! -> 2*1
//        factorial(5);
//        System.out.println(factorialRecursion(5));
        int[] arr = {1, 4, 6, 8, 10, 12, 15};
        int target = 0;

        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }

    public static void factorial(int n) {
        int result = 1;
        while (n > 0) {
            result = result * n;
            n--;
        }
        System.out.println(result);
    }

    public static int factorialRecursion(int n) {
        // base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);
        } else {
            return binarySearch(arr, low, mid - 1, target);
        }
    }
}

// recursion


// 3* 2* 1