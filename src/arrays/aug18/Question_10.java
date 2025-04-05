//18 August 2024
//find the median fo array
package arrays.aug18;
import arrays.Array;
public class Question_10 extends Array{
    public static void main(String[] args) {

        Question_10 q10=new Question_10();


        int[] arr = q10.createArray();
        int n= arr.length;
        q10.display(arr);

        int[] sorted = q10.sort(arr);
        int k= sorted.length;
        q10.display(sorted);

        if (n % 2 == 0) {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            double mid = (double) ( sorted[mid1] + sorted[mid2] ) / 2;
            System.out.println("Mid is : " + mid);
        } else {
            int mid = n / 2;
            System.out.println("Mid is " + sorted[mid]);
        }
    }

     int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (arr[j] > arr[i]) {
                    int min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }

        }
        return arr;
    }
  }