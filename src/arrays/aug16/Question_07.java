//16 August 2024
//Calculate Sum of the Elements of the Array
package arrays.aug16;
import arrays.Array;
public class Question_07 extends Array {
    public static void main(String[] args) {
       Question_07 q07 =new Question_07();
       int [] arr=q07.createArray();
       q07.display(arr);

        int sum=q07.sumOfArray(arr);
        System.out.println("Sum of elements of array is : "+sum);
    }
   int sumOfArray(int [] arr){
        int sum=0;
        int n=arr.length;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }

}