//22 August 2024
//Given an array of N integers,
// write a program to add an array element at the beginning, end, and at a specific position.
package arrays.aug22;
import arrays.Array;
public class Question_14 extends Array {
    public static void main(String[] args) {
        Question_14 q14=new Question_14();
        int[] arr = q14.createArray();
        int insert = 10;
       q14.display(arr);

        arr = q14.insertBeginning(arr, insert);
        System.out.println(" ");
      q14.display(arr);

        System.out.println();
        arr = q14.insertEnd(arr);
      q14.display(arr);

        System.out.println();
        arr =q14.insertPos(arr);
       q14.display(arr);
    }

    int[] insertBeginning(int[] arr, int in) {

        int n = arr.length;
        int[] newarr = new int[n + 1];
        newarr[0] = in;
        System.arraycopy(arr, 0, newarr, 1, n);
        return newarr;
    }

    int[] insertEnd(int[] arr) {

        int n = arr.length;
        int[] newarr = new int[n + 1];
        newarr[n] = 9;
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }

    int[] insertPos(int[] arr) {
        int pos = 8;
        int n = arr.length;
        int[] newarr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (i < pos - 1) {
                newarr[i] = arr[i];
            } else {
                System.out.println(i);
                int temp = arr[i];
                newarr[pos - 1] = 7;
                newarr[i + 1] = temp;
                System.out.println("temp " + temp);
            }

        }
        return newarr;
    }
}