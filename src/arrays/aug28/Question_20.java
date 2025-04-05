//28 August 2024
//Given an array of integers, rotating array of elements by k elements either left or right
package arrays.aug28;
import arrays.Array;

public class Question_20 extends Array {
    public static void main(String[] args) {
        Question_20 q20 = new Question_20();

        int[] arr = {1, 2, 3, 4,5,6,7};
        int k = q20.takeNum();

//        q20.rotate(arr, k);
        System.out.println();
        q20.even(arr, k);
    }

    void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        this.display(arr);
    }

    private void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void even(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
//        int [] dummy= Arrays.copyOf(arr,n);

        for (int i = 0; i < k; i++) {
            for (int j = n - 1; j >= k; j--) {
                System.out.println(i + ",     " + j);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
               this.display(arr);
            }

            System.out.println();
        }
    }

    void odd(int[] arr, int k) {

        //incomplete
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            for (int j = k; j < n; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
            this.display(arr);
        }

    }
}