//14 August 2024
//reverse the array and print it.
package arrays.aug14;
import arrays.Array;
public class Question_04 extends Array {

    public static void main(String[] args) {
        Question_04 q04 = new Question_04();
        int[] arr = q04.createArray();
        q04.display(arr);

        System.out.println(arr[arr.length - 1]);

        int[] result = q04.reverseArray(arr);
        q04.display(result);
    }

  int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

}