// 17 August 2024
//Rotate array by K elements : Block Swap Algorithm
package arrays.aug17;
import arrays.Array;

public class Question_08 extends Array {
    public static void main(String[] args) {
        Question_08 q08 = new Question_08();
        int[] arr = q08.createArray();
        q08.display(arr);

        int[] result = q08.rotateElements(arr);
        q08.display(result);

    }

    int[] rotateElements(int[] arr) {
        int k = takeNum();
        //rotating one by one
        for (int i = 0; i < k; i++) {
            int temp = arr[0], j;
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
        return arr;
    }

}