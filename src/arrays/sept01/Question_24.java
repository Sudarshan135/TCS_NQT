/*
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
 */
//01 September 2024
package arrays.sept01;
import java.util.Arrays;
public class Question_24 {
    public static void main(String[] args) {
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};
         sortArray(arr1,arr2);
        System.out.println();
         sortAccordingToOrder(arr1,arr2);

    }

    static void sortArray(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int[] sorted = new int[m];
        int k = 0;
        for (int element : arr2) {
            for (int i : arr1) {
                if (element == i) {
                    sorted[k] = element;
                    k++;
                }
            }
        }

        int[] remaining = new int[m - k];
        int r = 0;
        for (int element : arr1) {
            boolean found = false;
            for (int i : arr2) {
                if (element == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                remaining[r] = element;
                r++;
            }
        }

        Arrays.sort(remaining, 0, r);

        for (int i = 0; i < r; i++) {
            sorted[k] = remaining[i];
            k++;
        }

        System.out.println();
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }
    private static void sortAccordingToOrder(int[] arr1, int[] arr2) {
        int n = arr1.length;

        // Step 1: Place elements from arr1 that are in arr2 in the front part of arr1
        int index = 0;  // Index to place elements in arr1 that are in arr2

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[j] == arr2[i]) {
                    // Swap the element to the front section
                    int temp = arr1[j];
                    arr1[j] = arr1[index];
                    arr1[index] = temp;
                    index++;
                }
            }
        }

        // Step 2: Sort the remaining elements in arr1
        Arrays.sort(arr1, index, n);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}