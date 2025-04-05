//16 August 2024
package arrays;
public class Selection_Sort extends Array{
    public static void main(String[] args) {

        int[]  arr = {8,34,6,4,3,1,5};
        int n = arr.length;
//        Numbers_01.display(arr, n);

        int[] result = selectionSort(arr);
        int k = result.length;
        new Selection_Sort().display(result);

    }

    static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n-2 ; i++) {
            for (int j = i; j <= n-1; j++) {
                if (arr[j] <arr[i]) {
                     int temp=arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

    static int[] selectionSort_02(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
