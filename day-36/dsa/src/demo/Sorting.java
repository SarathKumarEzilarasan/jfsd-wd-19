package demo;

public class Sorting {
    public static void main(String[] args) {
//        int[] arr = {20, 1, 15, 9, 8, 0};
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        bubbleSort(arr);
//
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        int[] arr1 = {2, 4, 6, 8, 10, 12};
        int[] arr2 = {1, 3, 5, 7};

        int[] mergedArray = merge2SortedArrays(arr1, arr2);

        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

    // o(n2)
    public static void bubbleSort(int[] arr) {
        // 0 to len -> o(n) * o(n) -> o(n2)
        for (int i = 0; i < arr.length; i++) {
            // 0 to len -> o(n)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] merge2SortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;

    }

}
