//18 August 2024
//average of elements
package arrays.aug18;
import arrays.Array;
public class Question_09 extends Array
{
    public static void main(String[] args) {
      Question_09 q09=new Question_09();

        int [] arr=q09.createArray();
        int n= arr.length;
        q09.display(arr);

       double result=q09.avgOfArray(arr);
        System.out.println("Average of elements : "+result);
    }

    double avgOfArray(int[] arr){
        double sum=0;
        int n=arr.length;
        for (int j : arr) {
            sum += j;
        }
      return sum/n;
    }
}