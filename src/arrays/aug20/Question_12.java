//20 August 2024
//remove duplicate from unsorted array
package arrays.aug20;
import arrays.Array;
import java.util.Arrays;

public class Question_12 extends Array{
    public static void main(String[] args) {
        Question_12 q12=new Question_12();

        int[] arr =q12.createArray();
        int n=arr.length;
        q12.display(arr);
        q12.removeDuplicate(arr,n);

    }

    void removeDuplicate(int []arr,int n){
        int[] mark =new int[n];
        Arrays.fill(mark, 1);

        for (int j=0;j<n;j++){
            if (mark[j]==1){
                for (int k=j+1;k<n;k++){
                    if (arr[j]==arr[k]){
                        mark[k]=0;
                    }
                }

            }
        }

        for (int l=0;l<n;l++){
            if (mark[l]==1){
                System.out.print(arr[l]+" , ");
            }
        }

    }
}