//27 August 2024
//Replace elements by its rank in the array
package arrays.aug27;
import arrays.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Question_19 extends Array {
    public static void main(String[] args) {
        Question_19 q19 = new Question_19();

        int[] arr = {1 ,5 ,8 ,15,8 ,25, 9};
            q19.display(arr);

             int [] result=q19.replace2(arr) ;
        System.out.println("sorted array MAIN ");
             q19.display(result);

    }

    int[] replace(int[] arr) {
        int n = arr.length;

        int [] sortedArr= Arrays.copyOf(arr,n);
          this.sort(sortedArr) ;

//        for (int i:sortedArr){
//            System.out.println(i);
//        }

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
           rankMap.put(sortedArr[i],i+1);
        }

        for (int i=0;i<n;i++){
            arr[i]=rankMap.get(arr[i]);
        }
        return sortedArr;
    }

    int[] replace2(int[] arr) {
//        can be used when there are no duplicate

        int n = arr.length;

        int[] dummy = Arrays.copyOf(arr, n);
//        System.out.println("dummy array");
//        this.display(dummy);

        int[]sorted= this.sort(dummy);

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i]==sorted[j]){
                    System.out.println(arr[i]+"   "+sorted[j]);
                    arr[i]=j+1;
                    break;
                }
            }
        }
        System.out.println("sorted array");
        this.display(sorted);
    return arr ;
    }

    int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}