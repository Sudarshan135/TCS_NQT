// 01 October 2024

package sorting.oct01;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i ; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
            System.out.println();
//            for (int l : arr) {
//                System.out.print(" " + l);
//            }

        }

    }
}
