//11 August 2024
//Given an array, we have to find the smallest element in the array.

package arrays.aug11;
import arrays.Array;

public class Question_01 extends Array {

    public static void main(String[] args) {
        Question_01 q01 = new Question_01();
        int[] arr = q01.createArray();
        q01.display(arr);

        int smallest = q01.getSmallest(arr);
        System.out.println("Smallest element  : " + smallest);
    }

    int getSmallest(int[] arr) {

        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
        // Arrays.sort(arr);
        // return arr[0];
    }

}