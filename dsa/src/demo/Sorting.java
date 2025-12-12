package demo;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {20, 1, 15, 9, 8, 0};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr);

        for (int i : arr) {
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


}
