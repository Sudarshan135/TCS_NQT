//15 August 2024
//Rearrange the array such that the first half is arranged in increasing order,
// and the second half is arranged in decreasing order
package arrays.aug15;
import arrays.Array;
public class Question_06 extends Array {

    public static void main(String[] args) {
        Question_06 q06 = new Question_06();
        int[] arr = q06.createArray();
        q06.display(arr);

        int[] result = q06.sortIncreasing(arr);
        System.out.println(arr.length / 2);
        q06.print(result);
    }

    int[] sortIncreasing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    void print(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " | ");
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " | ");
        }
    }

    int[] sortDecreasing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i];
                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}