// 02 October 2024

package sorting.oct02;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
         int n= arr.length;
        for (int i=0; i<n;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }

        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
