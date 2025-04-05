// 03 October 2024

package sorting.oct03;

import static java.util.Collections.swap;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 9, 3};
        int n = arr.length;
        int l = 0;
        int h = n - 1;

        quick_Sort(arr, l, h);
        for (int r : arr) {
            System.out.print(r + " ");
        }

    }

    static void quick_Sort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = new Quick_Sort().sort(arr, l, h);
            quick_Sort(arr, l, mid - 1);
            quick_Sort(arr, mid + 1, h);

        }
    }

    int sort(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] <= pivot && i <= h - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= l + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }
}
