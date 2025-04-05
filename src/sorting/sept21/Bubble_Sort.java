// 21 September 2024
//Bubble_Sort

package sorting.sept21;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        for (int i = arr.length-1; i>=1 ; i--) {

            for (int j = 0; j < arr.length-1; j++) {
                int max = arr[j];
               if (arr[j]>arr[j+1]){
                   arr[j]=arr[j+1];
                   arr[j+1]=max;
               }

            }
        }

        for (int i: arr){
            System.out.print(i+"  ");
        }
    }
}
