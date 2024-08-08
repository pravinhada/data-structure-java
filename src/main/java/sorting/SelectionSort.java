package sorting;

/* O(n^2) time complexity */
public class SelectionSort {

    private static void selectionSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                    print(a);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void print(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1, 10, 8, 9, 7, 6};
        selectionSort(arr);
    }
}
