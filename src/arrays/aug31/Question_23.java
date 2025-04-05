
//31 August 2024
//Finding Circular rotation of an array by K positions
package arrays.aug31;
import arrays.Array;
public class Question_23 extends Array {
    public static void main(String[] args) {
        Question_23 q23 = new Question_23();
        int[] arr = q23.createArray();

        q23.rotate(arr);
    }

    void rotate(int[] arr) {
        int n = arr.length;
        int k = takeNum();
        k%=n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        display(arr);
    }

    int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}