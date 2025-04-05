// 12 August 2024
//Given an array, we have to find the largest element in the array.
package arrays.aug12;
import arrays.Array;
public class Question_02 extends Array {
    static int[] arr;
    static    int largestElement;

    public static void main(String[] args) {
        Question_02 q02=new Question_02();
          int [] arr=q02.createArray();
          q02.display(arr);

        largestElement = q02.getLargest(arr);
        System.out.println("Largest element : " + largestElement);
    }


    int getLargest(int[] arr) {
        // Write your code here.
        int largestElement=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largestElement){
                largestElement=arr[i];
            }
        }
        return largestElement;
        // Arrays.sort(arr);
        // return arr[n-1];
    }
}