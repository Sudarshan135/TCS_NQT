//21 August 2024
//Search an Element in an Array
package arrays.aug21;
import arrays.Array;

import java.io.IOException;

public class Question_13 extends Array {
    public static void main(String[] args) throws IOException {
        Question_13 q13=new Question_13();
        int[] arr = q13.createArray();
        q13.display(arr);

         int n= q13.takeNum();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element found at " + ( i + 1 ) + " = " + arr[i]);
            }
        }
       q13.binarySearch();
    }

    void binarySearch()  {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = 6;
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = ( low + high ) / 2;
            System.out.println("Mid " + mid);

            if (arr[mid] > num) {
                high = mid - 1;
                System.out.println("h " + high);
            } else if (arr[mid] < num) {
                low = mid + 1;
                System.out.println("l " + low);
            } else {
                ans = mid;
                break;
            }
        }
        System.out.println("Num found " + ans + " position " + arr[ans]);

    }
}